public record cht(aku m) {
   public static final yn<wa, jr<cht>> a = yl.b(mc.l);
   public static final akt<cht> b = a("tabby");
   public static final akt<cht> c = a("black");
   public static final akt<cht> d = a("red");
   public static final akt<cht> e = a("siamese");
   public static final akt<cht> f = a("british_shorthair");
   public static final akt<cht> g = a("calico");
   public static final akt<cht> h = a("persian");
   public static final akt<cht> i = a("ragdoll");
   public static final akt<cht> j = a("white");
   public static final akt<cht> k = a("jellie");
   public static final akt<cht> l = a("all_black");

   private static akt<cht> a(String $$0) {
      return akt.a(mc.l, aku.b($$0));
   }

   public static cht a(ke<cht> $$0) {
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

   private static cht a(ke<cht> $$0, akt<cht> $$1, String $$2) {
      return ke.a($$0, $$1, new cht(aku.b($$2)));
   }

   public aku a() {
      return this.m;
   }
}
