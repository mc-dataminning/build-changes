public enum dri implements ayq {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final ws f;

   private dri(String $$0) {
      this.e = $$0;
      this.f = ws.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public ws a() {
      return this.f;
   }
}
