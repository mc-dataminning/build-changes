public enum clp implements ash {
   a("food"),
   b("blocks"),
   c("misc");

   public static final ash.a<clp> d = ash.a(clp::values);
   private final String e;

   private clp(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
