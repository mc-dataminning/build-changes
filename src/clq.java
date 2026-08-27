public enum clq implements ash {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final ash.a<clq> e = ash.a(clq::values);
   private final String f;

   private clq(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
