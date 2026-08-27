public enum clz implements asr {
   a("food"),
   b("blocks"),
   c("misc");

   public static final asr.a<clz> d = asr.a(clz::values);
   private final String e;

   private clz(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
