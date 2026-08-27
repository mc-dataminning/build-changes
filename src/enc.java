public enum enc implements apc {
   a(0, "options.off"),
   b(1, "options.clouds.fast"),
   c(2, "options.clouds.fancy");

   private final int d;
   private final String e;

   private enc(int $$0, String $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public int a() {
      return this.d;
   }

   @Override
   public String b() {
      return this.e;
   }
}
