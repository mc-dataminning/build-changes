public enum dhl implements atr {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final ui f;

   private dhl(String $$0) {
      this.e = $$0;
      this.f = ui.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public ui a() {
      return this.f;
   }
}
