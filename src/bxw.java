public record bxw(ahd l) {
   public static final ahc<bxw> a = a("tabby");
   public static final ahc<bxw> b = a("black");
   public static final ahc<bxw> c = a("red");
   public static final ahc<bxw> d = a("siamese");
   public static final ahc<bxw> e = a("british_shorthair");
   public static final ahc<bxw> f = a("calico");
   public static final ahc<bxw> g = a("persian");
   public static final ahc<bxw> h = a("ragdoll");
   public static final ahc<bxw> i = a("white");
   public static final ahc<bxw> j = a("jellie");
   public static final ahc<bxw> k = a("all_black");

   private static ahc<bxw> a(String $$0) {
      return ahc.a(ke.l, new ahd($$0));
   }

   public static bxw a(it<bxw> $$0) {
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

   private static bxw a(it<bxw> $$0, ahc<bxw> $$1, String $$2) {
      return it.a($$0, $$1, new bxw(new ahd($$2)));
   }

   public ahd a() {
      return this.l;
   }
}
