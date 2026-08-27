public enum cru implements axc {
   a("food"),
   b("blocks"),
   c("misc");

   public static final axc.a<cru> d = axc.a(cru::values);
   private final String e;

   private cru(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
