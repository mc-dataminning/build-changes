public record ces(akk l) {
   public static final akj<ces> a = a("tabby");
   public static final akj<ces> b = a("black");
   public static final akj<ces> c = a("red");
   public static final akj<ces> d = a("siamese");
   public static final akj<ces> e = a("british_shorthair");
   public static final akj<ces> f = a("calico");
   public static final akj<ces> g = a("persian");
   public static final akj<ces> h = a("ragdoll");
   public static final akj<ces> i = a("white");
   public static final akj<ces> j = a("jellie");
   public static final akj<ces> k = a("all_black");

   private static akj<ces> a(String $$0) {
      return akj.a(lr.l, new akk($$0));
   }

   public static ces a(jw<ces> $$0) {
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

   private static ces a(jw<ces> $$0, akj<ces> $$1, String $$2) {
      return jw.a($$0, $$1, new ces(new akk($$2)));
   }

   public akk a() {
      return this.l;
   }
}
