public enum clt implements ask {
   a("building"),
   b("redstone"),
   c("equipment"),
   d("misc");

   public static final ask.a<clt> e = ask.a(clt::values);
   private final String f;

   private clt(String $$0) {
      this.f = $$0;
   }

   @Override
   public String c() {
      return this.f;
   }
}
