public enum cyk implements azu {
   a("food"),
   b("blocks"),
   c("misc");

   public static final azu.a<cyk> d = azu.a(cyk::values);
   private final String e;

   private cyk(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
