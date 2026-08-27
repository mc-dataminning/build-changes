public enum dqs implements ayg {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final wi f;

   private dqs(String $$0) {
      this.e = $$0;
      this.f = wi.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public wi a() {
      return this.f;
   }
}
