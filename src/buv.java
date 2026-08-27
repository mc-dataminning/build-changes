public record buv(aew l) {
   public static final aev<buv> a = a("tabby");
   public static final aev<buv> b = a("black");
   public static final aev<buv> c = a("red");
   public static final aev<buv> d = a("siamese");
   public static final aev<buv> e = a("british_shorthair");
   public static final aev<buv> f = a("calico");
   public static final aev<buv> g = a("persian");
   public static final aev<buv> h = a("ragdoll");
   public static final aev<buv> i = a("white");
   public static final aev<buv> j = a("jellie");
   public static final aev<buv> k = a("all_black");

   private static aev<buv> a(String $$0) {
      return aev.a(jc.j, new aew($$0));
   }

   public static buv a(hq<buv> $$0) {
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

   private static buv a(hq<buv> $$0, aev<buv> $$1, String $$2) {
      return hq.a($$0, $$1, new buv(new aew($$2)));
   }

   public aew a() {
      return this.l;
   }
}
