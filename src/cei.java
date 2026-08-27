public record cei(akm l) {
   public static final akl<cei> a = a("tabby");
   public static final akl<cei> b = a("black");
   public static final akl<cei> c = a("red");
   public static final akl<cei> d = a("siamese");
   public static final akl<cei> e = a("british_shorthair");
   public static final akl<cei> f = a("calico");
   public static final akl<cei> g = a("persian");
   public static final akl<cei> h = a("ragdoll");
   public static final akl<cei> i = a("white");
   public static final akl<cei> j = a("jellie");
   public static final akl<cei> k = a("all_black");

   private static akl<cei> a(String $$0) {
      return akl.a(lf.l, new akm($$0));
   }

   public static cei a(jk<cei> $$0) {
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

   private static cei a(jk<cei> $$0, akl<cei> $$1, String $$2) {
      return jk.a($$0, $$1, new cei(new akm($$2)));
   }

   public akm a() {
      return this.l;
   }
}
