public enum dvk implements azy {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final xd f;

   private dvk(final String $$0) {
      this.e = $$0;
      this.f = xd.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public xd a() {
      return this.f;
   }
}
