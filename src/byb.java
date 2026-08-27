public record byb(ahg l) {
   public static final ahf<byb> a = a("tabby");
   public static final ahf<byb> b = a("black");
   public static final ahf<byb> c = a("red");
   public static final ahf<byb> d = a("siamese");
   public static final ahf<byb> e = a("british_shorthair");
   public static final ahf<byb> f = a("calico");
   public static final ahf<byb> g = a("persian");
   public static final ahf<byb> h = a("ragdoll");
   public static final ahf<byb> i = a("white");
   public static final ahf<byb> j = a("jellie");
   public static final ahf<byb> k = a("all_black");

   private static ahf<byb> a(String $$0) {
      return ahf.a(ke.l, new ahg($$0));
   }

   public static byb a(it<byb> $$0) {
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

   private static byb a(it<byb> $$0, ahf<byb> $$1, String $$2) {
      return it.a($$0, $$1, new byb(new ahg($$2)));
   }

   public ahg a() {
      return this.l;
   }
}
