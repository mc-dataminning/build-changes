public enum cog implements auk {
   a("food"),
   b("blocks"),
   c("misc");

   public static final auk.a<cog> d = auk.a(cog::values);
   private final String e;

   private cog(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
