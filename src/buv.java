public record buv(aex l) {
   public static final aew<buv> a = a("tabby");
   public static final aew<buv> b = a("black");
   public static final aew<buv> c = a("red");
   public static final aew<buv> d = a("siamese");
   public static final aew<buv> e = a("british_shorthair");
   public static final aew<buv> f = a("calico");
   public static final aew<buv> g = a("persian");
   public static final aew<buv> h = a("ragdoll");
   public static final aew<buv> i = a("white");
   public static final aew<buv> j = a("jellie");
   public static final aew<buv> k = a("all_black");

   private static aew<buv> a(String $$0) {
      return aew.a(je.j, new aex($$0));
   }

   public static buv a(ht<buv> $$0) {
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

   private static buv a(ht<buv> $$0, aew<buv> $$1, String $$2) {
      return ht.a($$0, $$1, new buv(new aex($$2)));
   }

   public aex a() {
      return this.l;
   }
}
