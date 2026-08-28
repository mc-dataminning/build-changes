public enum dyx implements baq {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final xk f;

   private dyx(final String $$0) {
      this.e = $$0;
      this.f = xk.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public xk a() {
      return this.f;
   }
}
