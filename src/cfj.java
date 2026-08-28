public record cfj(alf l) {
   public static final ale<cfj> a = a("tabby");
   public static final ale<cfj> b = a("black");
   public static final ale<cfj> c = a("red");
   public static final ale<cfj> d = a("siamese");
   public static final ale<cfj> e = a("british_shorthair");
   public static final ale<cfj> f = a("calico");
   public static final ale<cfj> g = a("persian");
   public static final ale<cfj> h = a("ragdoll");
   public static final ale<cfj> i = a("white");
   public static final ale<cfj> j = a("jellie");
   public static final ale<cfj> k = a("all_black");

   private static ale<cfj> a(String $$0) {
      return ale.a(lq.l, new alf($$0));
   }

   public static cfj a(jv<cfj> $$0) {
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

   private static cfj a(jv<cfj> $$0, ale<cfj> $$1, String $$2) {
      return jv.a($$0, $$1, new cfj(new alf($$2)));
   }

   public alf a() {
      return this.l;
   }
}
