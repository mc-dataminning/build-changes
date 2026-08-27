public enum coc implements aug {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final aug.a<coc> e = aug.a(coc::values);
   private final String f;

   private coc(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
