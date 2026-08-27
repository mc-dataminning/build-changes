public enum dgo implements ask {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final ti f;

   private dgo(String $$0) {
      this.e = $$0;
      this.f = ti.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public ti a() {
      return this.f;
   }
}
