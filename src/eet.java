public enum eet {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private eet(final boolean $$0, final boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static eet a(are $$0) {
      if ($$0.a(are.d)) {
         return c;
      } else {
         return $$0.a(are.b) ? b : a;
      }
   }
}
