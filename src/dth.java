public enum dth implements azp {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final xl f;

   private dth(final String $$0) {
      this.e = $$0;
      this.f = xl.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public xl a() {
      return this.f;
   }
}
