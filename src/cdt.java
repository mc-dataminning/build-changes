public record cdt(akh l) {
   public static final akg<cdt> a = a("tabby");
   public static final akg<cdt> b = a("black");
   public static final akg<cdt> c = a("red");
   public static final akg<cdt> d = a("siamese");
   public static final akg<cdt> e = a("british_shorthair");
   public static final akg<cdt> f = a("calico");
   public static final akg<cdt> g = a("persian");
   public static final akg<cdt> h = a("ragdoll");
   public static final akg<cdt> i = a("white");
   public static final akg<cdt> j = a("jellie");
   public static final akg<cdt> k = a("all_black");

   private static akg<cdt> a(String $$0) {
      return akg.a(le.l, new akh($$0));
   }

   public static cdt a(jj<cdt> $$0) {
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

   private static cdt a(jj<cdt> $$0, akg<cdt> $$1, String $$2) {
      return jj.a($$0, $$1, new cdt(new akh($$2)));
   }

   public akh a() {
      return this.l;
   }
}
