public enum clp implements asf {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final asf.a<clp> e = asf.a(clp::values);
   private final String f;

   private clp(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
