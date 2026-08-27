public record ccx(akf l) {
   public static final ake<ccx> a = a("tabby");
   public static final ake<ccx> b = a("black");
   public static final ake<ccx> c = a("red");
   public static final ake<ccx> d = a("siamese");
   public static final ake<ccx> e = a("british_shorthair");
   public static final ake<ccx> f = a("calico");
   public static final ake<ccx> g = a("persian");
   public static final ake<ccx> h = a("ragdoll");
   public static final ake<ccx> i = a("white");
   public static final ake<ccx> j = a("jellie");
   public static final ake<ccx> k = a("all_black");

   private static ake<ccx> a(String $$0) {
      return ake.a(ld.l, new akf($$0));
   }

   public static ccx a(ji<ccx> $$0) {
      a($$0, a, "textures/entity/cat/tabby.png");
      a($$0, b, "textures/entity/cat/black.png");
      a($$0, c, "textures/entity/cat/red.png");
      a($$0, d, "textures/entity/cat/siamese.png");
      a($$0, e, "textures/entity/cat/british_shorthair.png");
      a($$0, f, "textures/entity/cat/calico.png");
      a($$0, g, "textures/entity/cat/persian.png");
      a($$0, h, "textures/entity/cat/ragdoll.png");
      a($$0, i, "textures/entity/cat/white.png");
      a($$0, j, "textures/entity/cat/jellie.png");
      return a($$0, k, "textures/entity/cat/all_black.png");
   }

   private static ccx a(ji<ccx> $$0, ake<ccx> $$1, String $$2) {
      return ji.a($$0, $$1, new ccx(new akf($$2)));
   }

   public akf a() {
      return this.l;
   }
}
