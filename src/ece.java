public enum ece {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private ece(final boolean $$0, final boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static ece a(arm $$0) {
      if ($$0.a(arm.d)) {
         return c;
      } else {
         return $$0.a(arm.b) ? b : a;
      }
   }
}
