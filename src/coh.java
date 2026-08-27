public enum coh implements auk {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final auk.a<coh> e = auk.a(coh::values);
   private final String f;

   private coh(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
