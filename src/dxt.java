public enum dxt {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private dxt(final boolean $$0, final boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static dxt a(aql $$0) {
      if ($$0.a(aql.d)) {
         return c;
      } else {
         return $$0.a(aql.b) ? b : a;
      }
   }
}
