public enum crq implements axc {
   a("food"),
   b("blocks"),
   c("misc");

   public static final axc.a<crq> d = axc.a(crq::values);
   private final String e;

   private crq(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
