public enum dgt implements asp {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final tm f;

   private dgt(String $$0) {
      this.e = $$0;
      this.f = tm.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public tm a() {
      return this.f;
   }
}
