public enum dtk implements azs {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final xo f;

   private dtk(final String $$0) {
      this.e = $$0;
      this.f = xo.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public xo a() {
      return this.f;
   }
}
