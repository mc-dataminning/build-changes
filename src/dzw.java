public enum dzw implements bag {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final wv f;

   private dzw(final String $$0) {
      this.e = $$0;
      this.f = wv.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public wv a() {
      return this.f;
   }
}
