public enum czw implements baf {
   a("food"),
   b("blocks"),
   c("misc");

   public static final baf.a<czw> d = baf.a(czw::values);
   private final String e;

   private czw(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
