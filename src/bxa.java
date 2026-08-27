public record bxa(agm l) {
   public static final agl<bxa> a = a("tabby");
   public static final agl<bxa> b = a("black");
   public static final agl<bxa> c = a("red");
   public static final agl<bxa> d = a("siamese");
   public static final agl<bxa> e = a("british_shorthair");
   public static final agl<bxa> f = a("calico");
   public static final agl<bxa> g = a("persian");
   public static final agl<bxa> h = a("ragdoll");
   public static final agl<bxa> i = a("white");
   public static final agl<bxa> j = a("jellie");
   public static final agl<bxa> k = a("all_black");

   private static agl<bxa> a(String $$0) {
      return agl.a(kd.k, new agm($$0));
   }

   public static bxa a(is<bxa> $$0) {
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

   private static bxa a(is<bxa> $$0, agl<bxa> $$1, String $$2) {
      return is.a($$0, $$1, new bxa(new agm($$2)));
   }

   public agm a() {
      return this.l;
   }
}
