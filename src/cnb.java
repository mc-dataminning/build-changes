public enum cnb implements atr {
   a("food"),
   b("blocks"),
   c("misc");

   public static final atr.a<cnb> d = atr.a(cnb::values);
   private final String e;

   private cnb(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
