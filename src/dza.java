public enum dza implements azv {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final wp f;

   private dza(final String $$0) {
      this.e = $$0;
      this.f = wp.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public wp a() {
      return this.f;
   }
}
