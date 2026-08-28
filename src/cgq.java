public record cgq(alh m) {
   public static final zf<ws, jp<cgq>> a = zd.b(ly.l);
   public static final alg<cgq> b = a("tabby");
   public static final alg<cgq> c = a("black");
   public static final alg<cgq> d = a("red");
   public static final alg<cgq> e = a("siamese");
   public static final alg<cgq> f = a("british_shorthair");
   public static final alg<cgq> g = a("calico");
   public static final alg<cgq> h = a("persian");
   public static final alg<cgq> i = a("ragdoll");
   public static final alg<cgq> j = a("white");
   public static final alg<cgq> k = a("jellie");
   public static final alg<cgq> l = a("all_black");

   private static alg<cgq> a(String $$0) {
      return alg.a(ly.l, alh.b($$0));
   }

   public static cgq a(kc<cgq> $$0) {
      a($$0, b, "textures/entity/cat/tabby.png");
      a($$0, c, "textures/entity/cat/black.png");
      a($$0, d, "textures/entity/cat/red.png");
      a($$0, e, "textures/entity/cat/siamese.png");
      a($$0, f, "textures/entity/cat/british_shorthair.png");
      a($$0, g, "textures/entity/cat/calico.png");
      a($$0, h, "textures/entity/cat/persian.png");
      a($$0, i, "textures/entity/cat/ragdoll.png");
      a($$0, j, "textures/entity/cat/white.png");
      a($$0, k, "textures/entity/cat/jellie.png");
      return a($$0, l, "textures/entity/cat/all_black.png");
   }

   private static cgq a(kc<cgq> $$0, alg<cgq> $$1, String $$2) {
      return kc.a($$0, $$1, new cgq(alh.b($$2)));
   }

   public alh a() {
      return this.m;
   }
}
