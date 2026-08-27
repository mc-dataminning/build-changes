public enum cly implements asp {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final asp.a<cly> e = asp.a(cly::values);
   private final String f;

   private cly(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
