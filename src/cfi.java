public record cfi(ale l) {
   public static final ald<cfi> a = a("tabby");
   public static final ald<cfi> b = a("black");
   public static final ald<cfi> c = a("red");
   public static final ald<cfi> d = a("siamese");
   public static final ald<cfi> e = a("british_shorthair");
   public static final ald<cfi> f = a("calico");
   public static final ald<cfi> g = a("persian");
   public static final ald<cfi> h = a("ragdoll");
   public static final ald<cfi> i = a("white");
   public static final ald<cfi> j = a("jellie");
   public static final ald<cfi> k = a("all_black");

   private static ald<cfi> a(String $$0) {
      return ald.a(lq.l, new ale($$0));
   }

   public static cfi a(jv<cfi> $$0) {
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

   private static cfi a(jv<cfi> $$0, ald<cfi> $$1, String $$2) {
      return jv.a($$0, $$1, new cfi(new ale($$2)));
   }

   public ale a() {
      return this.l;
   }
}
