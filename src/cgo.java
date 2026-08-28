public record cgo(ale e) {
   public static final zc<wp, jo<cgo>> a = za.b(lw.F);
   public static final ald<cgo> b = a("temperate");
   public static final ald<cgo> c = a("warm");
   public static final ald<cgo> d = a("cold");

   private static ald<cgo> a(String $$0) {
      return ald.a(lw.F, ale.b($$0));
   }

   public static cgo a(kb<cgo> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static cgo a(kb<cgo> $$0, ald<cgo> $$1, String $$2) {
      return kb.a($$0, $$1, new cgo(ale.b($$2)));
   }

   public ale a() {
      return this.e;
   }
}
