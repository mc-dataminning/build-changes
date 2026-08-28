public enum ebj implements bak {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final wy f;

   private ebj(final String $$0) {
      this.e = $$0;
      this.f = wy.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public wy a() {
      return this.f;
   }
}
