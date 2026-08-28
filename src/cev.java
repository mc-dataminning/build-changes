public record cev(akk l) {
   public static final akj<cev> a = a("tabby");
   public static final akj<cev> b = a("black");
   public static final akj<cev> c = a("red");
   public static final akj<cev> d = a("siamese");
   public static final akj<cev> e = a("british_shorthair");
   public static final akj<cev> f = a("calico");
   public static final akj<cev> g = a("persian");
   public static final akj<cev> h = a("ragdoll");
   public static final akj<cev> i = a("white");
   public static final akj<cev> j = a("jellie");
   public static final akj<cev> k = a("all_black");

   private static akj<cev> a(String $$0) {
      return akj.a(lr.l, new akk($$0));
   }

   public static cev a(jw<cev> $$0) {
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

   private static cev a(jw<cev> $$0, akj<cev> $$1, String $$2) {
      return jw.a($$0, $$1, new cev(new akk($$2)));
   }

   public akk a() {
      return this.l;
   }
}
