public record cek(akn l) {
   public static final akm<cek> a = a("tabby");
   public static final akm<cek> b = a("black");
   public static final akm<cek> c = a("red");
   public static final akm<cek> d = a("siamese");
   public static final akm<cek> e = a("british_shorthair");
   public static final akm<cek> f = a("calico");
   public static final akm<cek> g = a("persian");
   public static final akm<cek> h = a("ragdoll");
   public static final akm<cek> i = a("white");
   public static final akm<cek> j = a("jellie");
   public static final akm<cek> k = a("all_black");

   private static akm<cek> a(String $$0) {
      return akm.a(lf.l, new akn($$0));
   }

   public static cek a(jk<cek> $$0) {
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

   private static cek a(jk<cek> $$0, akm<cek> $$1, String $$2) {
      return jk.a($$0, $$1, new cek(new akn($$2)));
   }

   public akn a() {
      return this.l;
   }
}
