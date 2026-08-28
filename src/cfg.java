public record cfg(akq m) {
   public static final yw<wj, jm<cfg>> a = yu.b(lu.l);
   public static final akp<cfg> b = a("tabby");
   public static final akp<cfg> c = a("black");
   public static final akp<cfg> d = a("red");
   public static final akp<cfg> e = a("siamese");
   public static final akp<cfg> f = a("british_shorthair");
   public static final akp<cfg> g = a("calico");
   public static final akp<cfg> h = a("persian");
   public static final akp<cfg> i = a("ragdoll");
   public static final akp<cfg> j = a("white");
   public static final akp<cfg> k = a("jellie");
   public static final akp<cfg> l = a("all_black");

   private static akp<cfg> a(String $$0) {
      return akp.a(lu.l, akq.b($$0));
   }

   public static cfg a(jz<cfg> $$0) {
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

   private static cfg a(jz<cfg> $$0, akp<cfg> $$1, String $$2) {
      return jz.a($$0, $$1, new cfg(akq.b($$2)));
   }

   public akq a() {
      return this.m;
   }
}
