public enum dmp implements axc {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final vq f;

   private dmp(String $$0) {
      this.e = $$0;
      this.f = vq.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public vq a() {
      return this.f;
   }
}
