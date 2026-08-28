public enum czg implements azy {
   a("food"),
   b("blocks"),
   c("misc");

   public static final azy.a<czg> d = azy.a(czg::values);
   private final String e;

   private czg(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
