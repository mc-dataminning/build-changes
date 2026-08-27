public enum cnu implements aub {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final aub.a<cnu> e = aub.a(cnu::values);
   private final String f;

   private cnu(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
