public record cha(aku m) {
   public static final ym<vz, jr<cha>> a = yk.b(mc.l);
   public static final akt<cha> b = a("tabby");
   public static final akt<cha> c = a("black");
   public static final akt<cha> d = a("red");
   public static final akt<cha> e = a("siamese");
   public static final akt<cha> f = a("british_shorthair");
   public static final akt<cha> g = a("calico");
   public static final akt<cha> h = a("persian");
   public static final akt<cha> i = a("ragdoll");
   public static final akt<cha> j = a("white");
   public static final akt<cha> k = a("jellie");
   public static final akt<cha> l = a("all_black");

   private static akt<cha> a(String $$0) {
      return akt.a(mc.l, aku.b($$0));
   }

   public static cha a(ke<cha> $$0) {
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

   private static cha a(ke<cha> $$0, akt<cha> $$1, String $$2) {
      return ke.a($$0, $$1, new cha(aku.b($$2)));
   }

   public aku a() {
      return this.m;
   }
}
