public enum cmd implements asu {
   a("food"),
   b("blocks"),
   c("misc");

   public static final asu.a<cmd> d = asu.a(cmd::values);
   private final String e;

   private cmd(String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
