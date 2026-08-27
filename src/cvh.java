public enum cvh implements ayg {
   a("food"),
   b("blocks"),
   c("misc");

   public static final ayg.a<cvh> d = ayg.a(cvh::values);
   private final String e;

   private cvh(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
