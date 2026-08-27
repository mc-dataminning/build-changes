public record cbp(ajh d) {
   public static final cbp a = a("temperate", "textures/entity/frog/temperate_frog.png");
   public static final cbp b = a("warm", "textures/entity/frog/warm_frog.png");
   public static final cbp c = a("cold", "textures/entity/frog/cold_frog.png");

   private static cbp a(String $$0, String $$1) {
      return iy.a(ki.al, $$0, new cbp(new ajh($$1)));
   }

   public ajh a() {
      return this.d;
   }
}
