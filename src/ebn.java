public enum ebn {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private ebn(final boolean $$0, final boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static ebn a(aqs $$0) {
      if ($$0.a(aqs.d)) {
         return c;
      } else {
         return $$0.a(aqs.b) ? b : a;
      }
   }
}
