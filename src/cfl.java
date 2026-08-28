public record cfl(alf l) {
   public static final ale<cfl> a = a("tabby");
   public static final ale<cfl> b = a("black");
   public static final ale<cfl> c = a("red");
   public static final ale<cfl> d = a("siamese");
   public static final ale<cfl> e = a("british_shorthair");
   public static final ale<cfl> f = a("calico");
   public static final ale<cfl> g = a("persian");
   public static final ale<cfl> h = a("ragdoll");
   public static final ale<cfl> i = a("white");
   public static final ale<cfl> j = a("jellie");
   public static final ale<cfl> k = a("all_black");

   private static ale<cfl> a(String $$0) {
      return ale.a(lq.l, new alf($$0));
   }

   public static cfl a(jv<cfl> $$0) {
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

   private static cfl a(jv<cfl> $$0, ale<cfl> $$1, String $$2) {
      return jv.a($$0, $$1, new cfl(new alf($$2)));
   }

   public alf a() {
      return this.l;
   }
}
