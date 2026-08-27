public enum clq implements ash {
   a("food"),
   b("blocks"),
   c("misc");

   public static final ash.a<clq> d = ash.a(clq::values);
   private final String e;

   private clq(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
