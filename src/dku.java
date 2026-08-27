public enum dku implements avl {
   a("up"),
   b("side"),
   c("none");

   private final String d;

   private dku(String $$0) {
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
