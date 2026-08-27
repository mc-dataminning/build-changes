public record byc(ahg l) {
   public static final ahf<byc> a = a("tabby");
   public static final ahf<byc> b = a("black");
   public static final ahf<byc> c = a("red");
   public static final ahf<byc> d = a("siamese");
   public static final ahf<byc> e = a("british_shorthair");
   public static final ahf<byc> f = a("calico");
   public static final ahf<byc> g = a("persian");
   public static final ahf<byc> h = a("ragdoll");
   public static final ahf<byc> i = a("white");
   public static final ahf<byc> j = a("jellie");
   public static final ahf<byc> k = a("all_black");

   private static ahf<byc> a(String $$0) {
      return ahf.a(ke.l, new ahg($$0));
   }

   public static byc a(it<byc> $$0) {
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

   private static byc a(it<byc> $$0, ahf<byc> $$1, String $$2) {
      return it.a($$0, $$1, new byc(new ahg($$2)));
   }

   public ahg a() {
      return this.l;
   }
}
