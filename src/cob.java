public enum cob implements aug {
   a("food"),
   b("blocks"),
   c("misc");

   public static final aug.a<cob> d = aug.a(cob::values);
   private final String e;

   private cob(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
