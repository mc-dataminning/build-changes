public enum ctc implements axq {
   a("food"),
   b("blocks"),
   c("misc");

   public static final axq.a<ctc> d = axq.a(ctc::values);
   private final String e;

   private ctc(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
