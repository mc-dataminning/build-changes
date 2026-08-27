public record cbi(ajh l) {
   public static final ajg<cbi> a = a("tabby");
   public static final ajg<cbi> b = a("black");
   public static final ajg<cbi> c = a("red");
   public static final ajg<cbi> d = a("siamese");
   public static final ajg<cbi> e = a("british_shorthair");
   public static final ajg<cbi> f = a("calico");
   public static final ajg<cbi> g = a("persian");
   public static final ajg<cbi> h = a("ragdoll");
   public static final ajg<cbi> i = a("white");
   public static final ajg<cbi> j = a("jellie");
   public static final ajg<cbi> k = a("all_black");

   private static ajg<cbi> a(String $$0) {
      return ajg.a(kj.l, new ajh($$0));
   }

   public static cbi a(iy<cbi> $$0) {
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

   private static cbi a(iy<cbi> $$0, ajg<cbi> $$1, String $$2) {
      return iy.a($$0, $$1, new cbi(new ajh($$2)));
   }

   public ajh a() {
      return this.l;
   }
}
