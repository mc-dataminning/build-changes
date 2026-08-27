public enum dkz implements avl {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final vg f;

   private dkz(String $$0) {
      this.e = $$0;
      this.f = vg.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public vg a() {
      return this.f;
   }
}
