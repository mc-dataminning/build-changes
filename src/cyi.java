public enum cyi implements azs {
   a("food"),
   b("blocks"),
   c("misc");

   public static final azs.a<cyi> d = azs.a(cyi::values);
   private final String e;

   private cyi(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
