public enum dtv {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private dtv(boolean $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static dtv a(apn $$0) {
      if ($$0.a(apn.d)) {
         return c;
      } else {
         return $$0.a(apn.b) ? b : a;
      }
   }
}
