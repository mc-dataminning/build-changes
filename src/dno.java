public enum dno implements axg {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final vs f;

   private dno(String $$0) {
      this.e = $$0;
      this.f = vs.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public vs a() {
      return this.f;
   }
}
