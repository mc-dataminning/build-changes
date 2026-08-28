public enum czx implements bab {
   a("food"),
   b("blocks"),
   c("misc");

   public static final bab.a<czx> d = bab.a(czx::values);
   private final String e;

   private czx(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
