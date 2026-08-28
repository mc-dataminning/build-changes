public record cfe(alb l) {
   public static final ala<cfe> a = a("tabby");
   public static final ala<cfe> b = a("black");
   public static final ala<cfe> c = a("red");
   public static final ala<cfe> d = a("siamese");
   public static final ala<cfe> e = a("british_shorthair");
   public static final ala<cfe> f = a("calico");
   public static final ala<cfe> g = a("persian");
   public static final ala<cfe> h = a("ragdoll");
   public static final ala<cfe> i = a("white");
   public static final ala<cfe> j = a("jellie");
   public static final ala<cfe> k = a("all_black");

   private static ala<cfe> a(String $$0) {
      return ala.a(lq.l, new alb($$0));
   }

   public static cfe a(jv<cfe> $$0) {
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

   private static cfe a(jv<cfe> $$0, ala<cfe> $$1, String $$2) {
      return jv.a($$0, $$1, new cfe(new alb($$2)));
   }

   public alb a() {
      return this.l;
   }
}
