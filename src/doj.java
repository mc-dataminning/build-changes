public enum doj implements axq {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final vu f;

   private doj(String $$0) {
      this.e = $$0;
      this.f = vu.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public vu a() {
      return this.f;
   }
}
