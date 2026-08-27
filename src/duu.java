public enum duu {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private duu(boolean $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static duu a(aqa $$0) {
      if ($$0.a(aqa.d)) {
         return c;
      } else {
         return $$0.a(aqa.b) ? b : a;
      }
   }
}
