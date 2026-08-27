public enum dkr implements avk {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final vf f;

   private dkr(String $$0) {
      this.e = $$0;
      this.f = vf.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public vf a() {
      return this.f;
   }
}
