public enum csh implements axg {
   a("food"),
   b("blocks"),
   c("misc");

   public static final axg.a<csh> d = axg.a(csh::values);
   private final String e;

   private csh(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
