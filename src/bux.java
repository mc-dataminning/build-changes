public record bux(aey l) {
   public static final aex<bux> a = a("tabby");
   public static final aex<bux> b = a("black");
   public static final aex<bux> c = a("red");
   public static final aex<bux> d = a("siamese");
   public static final aex<bux> e = a("british_shorthair");
   public static final aex<bux> f = a("calico");
   public static final aex<bux> g = a("persian");
   public static final aex<bux> h = a("ragdoll");
   public static final aex<bux> i = a("white");
   public static final aex<bux> j = a("jellie");
   public static final aex<bux> k = a("all_black");

   private static aex<bux> a(String $$0) {
      return aex.a(je.j, new aey($$0));
   }

   public static bux a(ht<bux> $$0) {
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

   private static bux a(ht<bux> $$0, aex<bux> $$1, String $$2) {
      return ht.a($$0, $$1, new bux(new aey($$2)));
   }

   public aey a() {
      return this.l;
   }
}
