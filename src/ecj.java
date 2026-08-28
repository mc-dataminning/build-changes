public enum ecj {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private ecj(final boolean $$0, final boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static ecj a(aqr $$0) {
      if ($$0.a(aqr.d)) {
         return c;
      } else {
         return $$0.a(aqr.b) ? b : a;
      }
   }
}
