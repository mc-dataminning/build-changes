public enum dxe implements bai {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final xj f;

   private dxe(final String $$0) {
      this.e = $$0;
      this.f = xj.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public xj a() {
      return this.f;
   }
}
