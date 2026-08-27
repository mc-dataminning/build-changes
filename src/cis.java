public enum cis implements apr {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final apr.a<cis> e = apr.a(cis::values);
   private final String f;

   private cis(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
