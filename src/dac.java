public enum dac implements bag {
   a("food"),
   b("blocks"),
   c("misc");

   public static final bag.a<dac> d = bag.a(dac::values);
   private final String e;

   private dac(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
