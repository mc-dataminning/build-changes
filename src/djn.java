public enum djn {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private djn(boolean $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static djn a(akj $$0) {
      if ($$0.a(akj.d)) {
         return c;
      } else {
         return $$0.a(akj.b) ? b : a;
      }
   }
}
