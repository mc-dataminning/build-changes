public enum dqj implements aye {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final wg f;

   private dqj(String $$0) {
      this.e = $$0;
      this.f = wg.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public wg a() {
      return this.f;
   }
}
