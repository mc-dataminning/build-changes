public record bwf(afw d) {
   public static final bwf a = a("temperate", "textures/entity/frog/temperate_frog.png");
   public static final bwf b = a("warm", "textures/entity/frog/warm_frog.png");
   public static final bwf c = a("cold", "textures/entity/frog/cold_frog.png");

   private static bwf a(String $$0, String $$1) {
      return io.a(jy.al, $$0, new bwf(new afw($$1)));
   }

   public afw a() {
      return this.d;
   }
}
