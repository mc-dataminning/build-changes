public record ccm(ajv l) {
   public static final aju<ccm> a = a("tabby");
   public static final aju<ccm> b = a("black");
   public static final aju<ccm> c = a("red");
   public static final aju<ccm> d = a("siamese");
   public static final aju<ccm> e = a("british_shorthair");
   public static final aju<ccm> f = a("calico");
   public static final aju<ccm> g = a("persian");
   public static final aju<ccm> h = a("ragdoll");
   public static final aju<ccm> i = a("white");
   public static final aju<ccm> j = a("jellie");
   public static final aju<ccm> k = a("all_black");

   private static aju<ccm> a(String $$0) {
      return aju.a(ku.l, new ajv($$0));
   }

   public static ccm a(ja<ccm> $$0) {
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

   private static ccm a(ja<ccm> $$0, aju<ccm> $$1, String $$2) {
      return ja.a($$0, $$1, new ccm(new ajv($$2)));
   }

   public ajv a() {
      return this.l;
   }
}
