public enum dan implements bai {
   a("food"),
   b("blocks"),
   c("misc");

   public static final bai.a<dan> d = bai.a(dan::values);
   private final String e;

   private dan(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
