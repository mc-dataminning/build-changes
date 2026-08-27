public enum cme implements asu {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final asu.a<cme> e = asu.a(cme::values);
   private final String f;

   private cme(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
