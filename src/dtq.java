public enum dtq implements azc {
   a("up"),
   b("side"),
   c("none");

   private final String d;

   private dtq(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String toString() {
      return this.c();
   }

   @Override
   public String c() {
      return this.d;
   }

   public boolean a() {
      return this != c;
   }
}
