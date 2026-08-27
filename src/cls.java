public enum cls implements ask {
   a("food"),
   b("blocks"),
   c("misc");

   public static final ask.a<cls> d = ask.a(cls::values);
   private final String e;

   private cls(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
