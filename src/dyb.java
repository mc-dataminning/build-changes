public enum dyb implements bba {
   a("floor"),
   b("ceiling"),
   c("single_wall"),
   d("double_wall");

   private final String e;

   private dyb(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
