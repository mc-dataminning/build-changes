public enum dig implements aub {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final ur f;

   private dig(String $$0) {
      this.e = $$0;
      this.f = ur.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public ur a() {
      return this.f;
   }
}
