public enum dxb {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private dxb(final boolean $$0, final boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static dxb a(aqd $$0) {
      if ($$0.a(aqd.d)) {
         return c;
      } else {
         return $$0.a(aqd.b) ? b : a;
      }
   }
}
