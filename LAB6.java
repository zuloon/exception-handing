package exception2;



public class LAB6 {
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }
        catch(ArithmeticException e){
            //e.printStackTrace();//stack error test
            //System.out.println(e.getMessage());//return string //data of exception massage ex: / by zero
            //System.out.println(e.toString());//return full name class ,: ,get massage
            StackTraceElement[] stackTraceElements= e.getStackTrace();//retuen array stacktest it's object of exception is {getStacktest}it's array of object
            for (int i = 0; i < stackTraceElements.length; i++) {
                System.out.println(stackTraceElements[0].getClassName());//package ,classname
                System.out.println(stackTraceElements[0].getFileName());//method 
                System.out.println(stackTraceElements[0].getFileName());//file
                System.out.println(stackTraceElements[0].getLineNumber());//line number (int)
            }
            
            
        }
        
    }
}
