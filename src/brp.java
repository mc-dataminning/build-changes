public record brp(acq l) {
   public static final acp<brp> a = a("tabby");
   public static final acp<brp> b = a("black");
   public static final acp<brp> c = a("red");
   public static final acp<brp> d = a("siamese");
   public static final acp<brp> e = a("british_shorthair");
   public static final acp<brp> f = a("calico");
   public static final acp<brp> g = a("persian");
   public static final acp<brp> h = a("ragdoll");
   public static final acp<brp> i = a("white");
   public static final acp<brp> j = a("jellie");
   public static final acp<brp> k = a("all_black");

   private static acp<brp> a(String $$0) {
      return acp.a(jc.j, new acq($$0));
   }

   public static brp a(hr<brp> $$0) {
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

   private static brp a(hr<brp> $$0, acp<brp> $$1, String $$2) {
      return hr.a($$0, $$1, new brp(new acq($$2)));
   }

   public acq a() {
      return this.l;
   }
}
