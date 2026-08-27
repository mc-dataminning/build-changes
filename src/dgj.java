public enum dgj implements ash {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final tf f;

   private dgj(String $$0) {
      this.e = $$0;
      this.f = tf.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public tf a() {
      return this.f;
   }
}
