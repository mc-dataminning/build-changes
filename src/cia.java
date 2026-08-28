public record cia(alz m) {
   public static final zt<xg, jq<cia>> a = zr.b(mb.l);
   public static final aly<cia> b = a("tabby");
   public static final aly<cia> c = a("black");
   public static final aly<cia> d = a("red");
   public static final aly<cia> e = a("siamese");
   public static final aly<cia> f = a("british_shorthair");
   public static final aly<cia> g = a("calico");
   public static final aly<cia> h = a("persian");
   public static final aly<cia> i = a("ragdoll");
   public static final aly<cia> j = a("white");
   public static final aly<cia> k = a("jellie");
   public static final aly<cia> l = a("all_black");

   private static aly<cia> a(String $$0) {
      return aly.a(mb.l, alz.b($$0));
   }

   public static cia a(kd<cia> $$0) {
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

   private static cia a(kd<cia> $$0, aly<cia> $$1, String $$2) {
      return kd.a($$0, $$1, new cia(alz.b($$2)));
   }

   public alz a() {
      return this.m;
   }
}
