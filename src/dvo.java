public enum dvo {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private dvo(boolean $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static dvo a(aqf $$0) {
      if ($$0.a(aqf.d)) {
         return c;
      } else {
         return $$0.a(aqf.b) ? b : a;
      }
   }
}
