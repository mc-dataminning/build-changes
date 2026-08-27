public enum cxl implements ayz {
   a("food"),
   b("blocks"),
   c("misc");

   public static final ayz.a<cxl> d = ayz.a(cxl::values);
   private final String e;

   private cxl(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
