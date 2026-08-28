public record chd(akv m) {
   public static final yn<wa, jr<chd>> a = yl.b(mc.l);
   public static final aku<chd> b = a("tabby");
   public static final aku<chd> c = a("black");
   public static final aku<chd> d = a("red");
   public static final aku<chd> e = a("siamese");
   public static final aku<chd> f = a("british_shorthair");
   public static final aku<chd> g = a("calico");
   public static final aku<chd> h = a("persian");
   public static final aku<chd> i = a("ragdoll");
   public static final aku<chd> j = a("white");
   public static final aku<chd> k = a("jellie");
   public static final aku<chd> l = a("all_black");

   private static aku<chd> a(String $$0) {
      return aku.a(mc.l, akv.b($$0));
   }

   public static chd a(ke<chd> $$0) {
      a($$0, b, "textures/entity/cat/tabby.png");
      a($$0, c, "textures/entity/cat/black.png");
      a($$0, d, "textures/entity/cat/red.png");
      a($$0, e, "textures/entity/cat/siamese.png");
      a($$0, f, "textures/entity/cat/british_shorthair.png");
      a($$0, g, "textures/entity/cat/calico.png");
      a($$0, h, "textures/entity/cat/persian.png");
      a($$0, i, "textures/entity/cat/ragdoll.png");
      a($$0, j, "textures/entity/cat/white.png");
      a($$0, k, "textures/entity/cat/jellie.png");
      return a($$0, l, "textures/entity/cat/all_black.png");
   }

   private static chd a(ke<chd> $$0, aku<chd> $$1, String $$2) {
      return ke.a($$0, $$1, new chd(akv.b($$2)));
   }

   public akv a() {
      return this.m;
   }
}
