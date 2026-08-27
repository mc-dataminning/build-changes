public record bum(aep l) {
   public static final aeo<bum> a = a("tabby");
   public static final aeo<bum> b = a("black");
   public static final aeo<bum> c = a("red");
   public static final aeo<bum> d = a("siamese");
   public static final aeo<bum> e = a("british_shorthair");
   public static final aeo<bum> f = a("calico");
   public static final aeo<bum> g = a("persian");
   public static final aeo<bum> h = a("ragdoll");
   public static final aeo<bum> i = a("white");
   public static final aeo<bum> j = a("jellie");
   public static final aeo<bum> k = a("all_black");

   private static aeo<bum> a(String $$0) {
      return aeo.a(jd.j, new aep($$0));
   }

   public static bum a(hs<bum> $$0) {
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

   private static bum a(hs<bum> $$0, aeo<bum> $$1, String $$2) {
      return hs.a($$0, $$1, new bum(new aep($$2)));
   }

   public aep a() {
      return this.l;
   }
}
