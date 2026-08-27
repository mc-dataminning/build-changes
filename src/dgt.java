public enum dgt implements asp {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final tl f;

   private dgt(String $$0) {
      this.e = $$0;
      this.f = tl.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public tl a() {
      return this.f;
   }
}
