public enum dwt implements bag {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final xi f;

   private dwt(final String $$0) {
      this.e = $$0;
      this.f = xi.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public xi a() {
      return this.f;
   }
}
