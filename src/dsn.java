public enum dsn implements ayz {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final wx f;

   private dsn(String $$0) {
      this.e = $$0;
      this.f = wx.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public wx a() {
      return this.f;
   }
}
