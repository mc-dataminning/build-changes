public enum dgi implements asf {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final te f;

   private dgi(String $$0) {
      this.e = $$0;
      this.f = te.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public te a() {
      return this.f;
   }
}
