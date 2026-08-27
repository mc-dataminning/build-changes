public enum cpk implements ave {
   a("food"),
   b("blocks"),
   c("misc");

   public static final ave.a<cpk> d = ave.a(cpk::values);
   private final String e;

   private cpk(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
