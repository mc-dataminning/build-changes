public enum cpa implements aut {
   a("food"),
   b("blocks"),
   c("misc");

   public static final aut.a<cpa> d = aut.a(cpa::values);
   private final String e;

   private cpa(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
