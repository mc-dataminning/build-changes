public enum clx implements asp {
   a("food"),
   b("blocks"),
   c("misc");

   public static final asp.a<clx> d = asp.a(clx::values);
   private final String e;

   private clx(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
