public record chs(alp m) {
   public static final zi<wv, jq<chs>> a = zg.b(mb.l);
   public static final alo<chs> b = a("tabby");
   public static final alo<chs> c = a("black");
   public static final alo<chs> d = a("red");
   public static final alo<chs> e = a("siamese");
   public static final alo<chs> f = a("british_shorthair");
   public static final alo<chs> g = a("calico");
   public static final alo<chs> h = a("persian");
   public static final alo<chs> i = a("ragdoll");
   public static final alo<chs> j = a("white");
   public static final alo<chs> k = a("jellie");
   public static final alo<chs> l = a("all_black");

   private static alo<chs> a(String $$0) {
      return alo.a(mb.l, alp.b($$0));
   }

   public static chs a(kd<chs> $$0) {
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

   private static chs a(kd<chs> $$0, alo<chs> $$1, String $$2) {
      return kd.a($$0, $$1, new chs(alp.b($$2)));
   }

   public alp a() {
      return this.m;
   }
}
