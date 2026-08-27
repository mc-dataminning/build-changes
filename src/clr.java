public enum clr implements ash {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final ash.a<clr> e = ash.a(clr::values);
   private final String f;

   private clr(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
