public enum dib implements aub {
   a("up"),
   b("side"),
   c("none");

   private final String d;

   private dib(String $$0) {
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
