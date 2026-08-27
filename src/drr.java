public enum drr implements ayt {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final wu f;

   private drr(String $$0) {
      this.e = $$0;
      this.f = wu.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public wu a() {
      return this.f;
   }
}
