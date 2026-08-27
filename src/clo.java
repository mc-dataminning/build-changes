public enum clo implements asf {
   a("food"),
   b("blocks"),
   c("misc");

   public static final asf.a<clo> d = asf.a(clo::values);
   private final String e;

   private clo(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
