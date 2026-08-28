public enum cyj implements azt {
   a("food"),
   b("blocks"),
   c("misc");

   public static final azt.a<cyj> d = azt.a(cyj::values);
   private final String e;

   private cyj(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
