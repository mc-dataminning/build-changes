public enum dkk implements ave {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final vd f;

   private dkk(String $$0) {
      this.e = $$0;
      this.f = vd.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public vd a() {
      return this.f;
   }
}
