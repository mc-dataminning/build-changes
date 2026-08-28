public record cgv(ali m) {
   public static final zg<wt, jq<cgv>> a = ze.b(lz.l);
   public static final alh<cgv> b = a("tabby");
   public static final alh<cgv> c = a("black");
   public static final alh<cgv> d = a("red");
   public static final alh<cgv> e = a("siamese");
   public static final alh<cgv> f = a("british_shorthair");
   public static final alh<cgv> g = a("calico");
   public static final alh<cgv> h = a("persian");
   public static final alh<cgv> i = a("ragdoll");
   public static final alh<cgv> j = a("white");
   public static final alh<cgv> k = a("jellie");
   public static final alh<cgv> l = a("all_black");

   private static alh<cgv> a(String $$0) {
      return alh.a(lz.l, ali.b($$0));
   }

   public static cgv a(kd<cgv> $$0) {
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

   private static cgv a(kd<cgv> $$0, alh<cgv> $$1, String $$2) {
      return kd.a($$0, $$1, new cgv(ali.b($$2)));
   }

   public ali a() {
      return this.m;
   }
}
