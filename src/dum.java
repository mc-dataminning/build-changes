public enum dum implements azk {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final wz f;

   private dum(final String $$0) {
      this.e = $$0;
      this.f = wz.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public wz a() {
      return this.f;
   }
}
