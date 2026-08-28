public record chw(alz m) {
   public static final zt<xg, jq<chw>> a = zr.b(mb.l);
   public static final aly<chw> b = a("tabby");
   public static final aly<chw> c = a("black");
   public static final aly<chw> d = a("red");
   public static final aly<chw> e = a("siamese");
   public static final aly<chw> f = a("british_shorthair");
   public static final aly<chw> g = a("calico");
   public static final aly<chw> h = a("persian");
   public static final aly<chw> i = a("ragdoll");
   public static final aly<chw> j = a("white");
   public static final aly<chw> k = a("jellie");
   public static final aly<chw> l = a("all_black");

   private static aly<chw> a(String $$0) {
      return aly.a(mb.l, alz.b($$0));
   }

   public static chw a(kd<chw> $$0) {
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

   private static chw a(kd<chw> $$0, aly<chw> $$1, String $$2) {
      return kd.a($$0, $$1, new chw(alz.b($$2)));
   }

   public alz a() {
      return this.m;
   }
}
