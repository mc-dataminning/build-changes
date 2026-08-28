public enum cyn implements azk {
   a("food"),
   b("blocks"),
   c("misc");

   public static final azk.a<cyn> d = azk.a(cyn::values);
   private final String e;

   private cyn(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
