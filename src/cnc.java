public enum cnc implements atr {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final atr.a<cnc> e = atr.a(cnc::values);
   private final String f;

   private cnc(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
