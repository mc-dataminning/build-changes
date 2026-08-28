public enum cxx implements azc {
   a("food"),
   b("blocks"),
   c("misc");

   public static final azc.a<cxx> d = azc.a(cxx::values);
   private final String e;

   private cxx(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
