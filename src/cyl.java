public enum cyl implements azu {
   a("food"),
   b("blocks"),
   c("misc");

   public static final azu.a<cyl> d = azu.a(cyl::values);
   private final String e;

   private cyl(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
