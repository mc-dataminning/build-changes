public enum dag implements baj {
   a("food"),
   b("blocks"),
   c("misc");

   public static final baj.a<dag> d = baj.a(dag::values);
   private final String e;

   private dag(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
