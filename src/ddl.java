public enum ddl implements apr {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final sw f;

   private ddl(String $$0) {
      this.e = $$0;
      this.f = sw.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public sw a() {
      return this.f;
   }
}
