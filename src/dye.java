public enum dye implements azu {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final wo f;

   private dye(final String $$0) {
      this.e = $$0;
      this.f = wo.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public wo a() {
      return this.f;
   }
}
