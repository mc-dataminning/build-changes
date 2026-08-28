public enum cym implements azu {
   a("food"),
   b("blocks"),
   c("misc");

   public static final azu.a<cym> d = azu.a(cym::values);
   private final String e;

   private cym(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
