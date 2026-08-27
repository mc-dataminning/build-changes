public enum cte implements axq {
   a("food"),
   b("blocks"),
   c("misc");

   public static final axq.a<cte> d = axq.a(cte::values);
   private final String e;

   private cte(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
