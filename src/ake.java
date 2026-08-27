public final class ake extends RuntimeException {
   public static final ake a = new ake();

   private ake() {
      this.setStackTrace(new StackTraceElement[0]);
   }

   @Override
   public synchronized Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
