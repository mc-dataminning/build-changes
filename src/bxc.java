public record bxc(agi d) {
   public static final bxc a = a("temperate", "textures/entity/frog/temperate_frog.png");
   public static final bxc b = a("warm", "textures/entity/frog/warm_frog.png");
   public static final bxc c = a("cold", "textures/entity/frog/cold_frog.png");

   private static bxc a(String $$0, String $$1) {
      return io.a(jy.am, $$0, new bxc(new agi($$1)));
   }

   public agi a() {
      return this.d;
   }
}
