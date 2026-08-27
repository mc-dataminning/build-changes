public record bwn(agg l) {
   public static final agf<bwn> a = a("tabby");
   public static final agf<bwn> b = a("black");
   public static final agf<bwn> c = a("red");
   public static final agf<bwn> d = a("siamese");
   public static final agf<bwn> e = a("british_shorthair");
   public static final agf<bwn> f = a("calico");
   public static final agf<bwn> g = a("persian");
   public static final agf<bwn> h = a("ragdoll");
   public static final agf<bwn> i = a("white");
   public static final agf<bwn> j = a("jellie");
   public static final agf<bwn> k = a("all_black");

   private static agf<bwn> a(String $$0) {
      return agf.a(jz.k, new agg($$0));
   }

   public static bwn a(io<bwn> $$0) {
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

   private static bwn a(io<bwn> $$0, agf<bwn> $$1, String $$2) {
      return io.a($$0, $$1, new bwn(new agg($$2)));
   }

   public agg a() {
      return this.l;
   }
}
