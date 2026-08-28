public record chb(akv m) {
   public static final yn<wa, jr<chb>> a = yl.b(mc.l);
   public static final aku<chb> b = a("tabby");
   public static final aku<chb> c = a("black");
   public static final aku<chb> d = a("red");
   public static final aku<chb> e = a("siamese");
   public static final aku<chb> f = a("british_shorthair");
   public static final aku<chb> g = a("calico");
   public static final aku<chb> h = a("persian");
   public static final aku<chb> i = a("ragdoll");
   public static final aku<chb> j = a("white");
   public static final aku<chb> k = a("jellie");
   public static final aku<chb> l = a("all_black");

   private static aku<chb> a(String $$0) {
      return aku.a(mc.l, akv.b($$0));
   }

   public static chb a(ke<chb> $$0) {
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

   private static chb a(ke<chb> $$0, aku<chb> $$1, String $$2) {
      return ke.a($$0, $$1, new chb(akv.b($$2)));
   }

   public akv a() {
      return this.m;
   }
}
