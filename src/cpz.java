public enum cpz implements avl {
   a("food"),
   b("blocks"),
   c("misc");

   public static final avl.a<cpz> d = avl.a(cpz::values);
   private final String e;

   private cpz(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
