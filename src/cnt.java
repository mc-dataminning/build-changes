public enum cnt implements aub {
   a("food"),
   b("blocks"),
   c("misc");

   public static final aub.a<cnt> d = aub.a(cnt::values);
   private final String e;

   private cnt(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
