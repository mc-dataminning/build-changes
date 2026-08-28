public record cgh(ale m) {
   public static final zc<wp, jo<cgh>> a = za.b(lw.l);
   public static final ald<cgh> b = a("tabby");
   public static final ald<cgh> c = a("black");
   public static final ald<cgh> d = a("red");
   public static final ald<cgh> e = a("siamese");
   public static final ald<cgh> f = a("british_shorthair");
   public static final ald<cgh> g = a("calico");
   public static final ald<cgh> h = a("persian");
   public static final ald<cgh> i = a("ragdoll");
   public static final ald<cgh> j = a("white");
   public static final ald<cgh> k = a("jellie");
   public static final ald<cgh> l = a("all_black");

   private static ald<cgh> a(String $$0) {
      return ald.a(lw.l, ale.b($$0));
   }

   public static cgh a(kb<cgh> $$0) {
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

   private static cgh a(kb<cgh> $$0, ald<cgh> $$1, String $$2) {
      return kb.a($$0, $$1, new cgh(ale.b($$2)));
   }

   public ale a() {
      return this.m;
   }
}
