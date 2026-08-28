public enum dze implements bba {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final xv f;

   private dze(final String $$0) {
      this.e = $$0;
      this.f = xv.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public xv a() {
      return this.f;
   }
}
