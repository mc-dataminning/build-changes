public enum cuy implements aye {
   a("food"),
   b("blocks"),
   c("misc");

   public static final aye.a<cuy> d = aye.a(cuy::values);
   private final String e;

   private cuy(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
