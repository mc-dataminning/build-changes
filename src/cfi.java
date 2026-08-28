public record cfi(akr m) {
   public static final yx<wk, jm<cfi>> a = yv.b(lu.l);
   public static final akq<cfi> b = a("tabby");
   public static final akq<cfi> c = a("black");
   public static final akq<cfi> d = a("red");
   public static final akq<cfi> e = a("siamese");
   public static final akq<cfi> f = a("british_shorthair");
   public static final akq<cfi> g = a("calico");
   public static final akq<cfi> h = a("persian");
   public static final akq<cfi> i = a("ragdoll");
   public static final akq<cfi> j = a("white");
   public static final akq<cfi> k = a("jellie");
   public static final akq<cfi> l = a("all_black");

   private static akq<cfi> a(String $$0) {
      return akq.a(lu.l, akr.b($$0));
   }

   public static cfi a(jz<cfi> $$0) {
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

   private static cfi a(jz<cfi> $$0, akq<cfi> $$1, String $$2) {
      return jz.a($$0, $$1, new cfi(akr.b($$2)));
   }

   public akr a() {
      return this.m;
   }
}
