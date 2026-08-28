public enum ega {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private ega(final boolean $$0, final boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static ega a(ari $$0) {
      if ($$0.a(ari.d)) {
         return c;
      } else {
         return $$0.a(ari.b) ? b : a;
      }
   }
}
