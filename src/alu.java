public final class alu extends RuntimeException {
   public static final alu a = new alu();

   private alu() {
      this.setStackTrace(new StackTraceElement[0]);
   }

   @Override
   public synchronized Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
