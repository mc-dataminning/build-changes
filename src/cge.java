public record cge(alc m) {
   public static final zb<wo, jn<cge>> a = yz.b(lv.l);
   public static final alb<cge> b = a("tabby");
   public static final alb<cge> c = a("black");
   public static final alb<cge> d = a("red");
   public static final alb<cge> e = a("siamese");
   public static final alb<cge> f = a("british_shorthair");
   public static final alb<cge> g = a("calico");
   public static final alb<cge> h = a("persian");
   public static final alb<cge> i = a("ragdoll");
   public static final alb<cge> j = a("white");
   public static final alb<cge> k = a("jellie");
   public static final alb<cge> l = a("all_black");

   private static alb<cge> a(String $$0) {
      return alb.a(lv.l, alc.b($$0));
   }

   public static cge a(ka<cge> $$0) {
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

   private static cge a(ka<cge> $$0, alb<cge> $$1, String $$2) {
      return ka.a($$0, $$1, new cge(alc.b($$2)));
   }

   public alc a() {
      return this.m;
   }
}
