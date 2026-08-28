public enum eay implements bai {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final ww f;

   private eay(final String $$0) {
      this.e = $$0;
      this.f = ww.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public ww a() {
      return this.f;
   }
}
