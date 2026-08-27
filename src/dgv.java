public enum dgv implements asr {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final tn f;

   private dgv(String $$0) {
      this.e = $$0;
      this.f = tn.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public tn a() {
      return this.f;
   }
}
