public enum cpr implements avk {
   a("food"),
   b("blocks"),
   c("misc");

   public static final avk.a<cpr> d = avk.a(cpr::values);
   private final String e;

   private cpr(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
