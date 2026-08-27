public enum djz implements aut {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final vb f;

   private djz(String $$0) {
      this.e = $$0;
      this.f = vb.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public vb a() {
      return this.f;
   }
}
