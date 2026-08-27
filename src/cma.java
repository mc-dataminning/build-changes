public enum cma implements asr {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final asr.a<cma> e = asr.a(cma::values);
   private final String f;

   private cma(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
