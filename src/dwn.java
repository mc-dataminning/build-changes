public enum dwn implements baf {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final xh f;

   private dwn(final String $$0) {
      this.e = $$0;
      this.f = xh.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public xh a() {
      return this.f;
   }
}
