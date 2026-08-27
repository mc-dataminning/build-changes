public record bvy(afw l) {
   public static final afv<bvy> a = a("tabby");
   public static final afv<bvy> b = a("black");
   public static final afv<bvy> c = a("red");
   public static final afv<bvy> d = a("siamese");
   public static final afv<bvy> e = a("british_shorthair");
   public static final afv<bvy> f = a("calico");
   public static final afv<bvy> g = a("persian");
   public static final afv<bvy> h = a("ragdoll");
   public static final afv<bvy> i = a("white");
   public static final afv<bvy> j = a("jellie");
   public static final afv<bvy> k = a("all_black");

   private static afv<bvy> a(String $$0) {
      return afv.a(jz.k, new afw($$0));
   }

   public static bvy a(io<bvy> $$0) {
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

   private static bvy a(io<bvy> $$0, afv<bvy> $$1, String $$2) {
      return io.a($$0, $$1, new bvy(new afw($$2)));
   }

   public afw a() {
      return this.l;
   }
}
