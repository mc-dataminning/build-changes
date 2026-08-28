public enum cyl implements azj {
   a("food"),
   b("blocks"),
   c("misc");

   public static final azj.a<cyl> d = azj.a(cyl::values);
   private final String e;

   private cyl(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
