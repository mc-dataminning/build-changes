public enum dix implements auk {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final uv f;

   private dix(String $$0) {
      this.e = $$0;
      this.f = uv.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public uv a() {
      return this.f;
   }
}
