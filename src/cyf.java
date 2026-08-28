public enum cyf implements azp {
   a("food"),
   b("blocks"),
   c("misc");

   public static final azp.a<cyf> d = azp.a(cyf::values);
   private final String e;

   private cyf(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
