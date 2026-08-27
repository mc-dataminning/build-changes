public record cch(ajt l) {
   public static final ajs<cch> a = a("tabby");
   public static final ajs<cch> b = a("black");
   public static final ajs<cch> c = a("red");
   public static final ajs<cch> d = a("siamese");
   public static final ajs<cch> e = a("british_shorthair");
   public static final ajs<cch> f = a("calico");
   public static final ajs<cch> g = a("persian");
   public static final ajs<cch> h = a("ragdoll");
   public static final ajs<cch> i = a("white");
   public static final ajs<cch> j = a("jellie");
   public static final ajs<cch> k = a("all_black");

   private static ajs<cch> a(String $$0) {
      return ajs.a(ks.l, new ajt($$0));
   }

   public static cch a(iy<cch> $$0) {
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

   private static cch a(iy<cch> $$0, ajs<cch> $$1, String $$2) {
      return iy.a($$0, $$1, new cch(new ajt($$2)));
   }

   public ajt a() {
      return this.l;
   }
}
