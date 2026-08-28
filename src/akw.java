public final class akw extends RuntimeException {
   public static final akw a = new akw();

   private akw() {
      this.setStackTrace(new StackTraceElement[0]);
   }

   @Override
   public synchronized Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
