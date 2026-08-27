public record cbo(ajh d) {
   public static final cbo a = a("temperate", "textures/entity/frog/temperate_frog.png");
   public static final cbo b = a("warm", "textures/entity/frog/warm_frog.png");
   public static final cbo c = a("cold", "textures/entity/frog/cold_frog.png");

   private static cbo a(String $$0, String $$1) {
      return iy.a(ki.al, $$0, new cbo(new ajh($$1)));
   }

   public ajh a() {
      return this.d;
   }
}
