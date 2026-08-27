public enum cir implements apr {
   a("food"),
   b("blocks"),
   c("misc");

   public static final apr.a<cir> d = apr.a(cir::values);
   private final String e;

   private cir(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
