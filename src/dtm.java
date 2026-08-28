public enum dtm implements azu {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final xp f;

   private dtm(final String $$0) {
      this.e = $$0;
      this.f = xp.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public xp a() {
      return this.f;
   }
}
