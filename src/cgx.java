public record cgx(alh e) {
   public static final zf<ws, jp<cgx>> a = zd.b(ly.F);
   public static final alg<cgx> b = a("temperate");
   public static final alg<cgx> c = a("warm");
   public static final alg<cgx> d = a("cold");

   private static alg<cgx> a(String $$0) {
      return alg.a(ly.F, alh.b($$0));
   }

   public static cgx a(kc<cgx> $$0) {
      a($$0, b, "textures/entity/frog/temperate_frog.png");
      a($$0, c, "textures/entity/frog/warm_frog.png");
      return a($$0, d, "textures/entity/frog/cold_frog.png");
   }

   private static cgx a(kc<cgx> $$0, alg<cgx> $$1, String $$2) {
      return kc.a($$0, $$1, new cgx(alh.b($$2)));
   }

   public alh a() {
      return this.e;
   }
}
