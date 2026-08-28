public enum dwc implements bab {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final xe f;

   private dwc(final String $$0) {
      this.e = $$0;
      this.f = xe.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public xe a() {
      return this.f;
   }
}
