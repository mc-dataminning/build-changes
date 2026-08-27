public record caq(ajc l) {
   public static final ajb<caq> a = a("tabby");
   public static final ajb<caq> b = a("black");
   public static final ajb<caq> c = a("red");
   public static final ajb<caq> d = a("siamese");
   public static final ajb<caq> e = a("british_shorthair");
   public static final ajb<caq> f = a("calico");
   public static final ajb<caq> g = a("persian");
   public static final ajb<caq> h = a("ragdoll");
   public static final ajb<caq> i = a("white");
   public static final ajb<caq> j = a("jellie");
   public static final ajb<caq> k = a("all_black");

   private static ajb<caq> a(String $$0) {
      return ajb.a(ki.l, new ajc($$0));
   }

   public static caq a(ix<caq> $$0) {
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

   private static caq a(ix<caq> $$0, ajb<caq> $$1, String $$2) {
      return ix.a($$0, $$1, new caq(new ajc($$2)));
   }

   public ajc a() {
      return this.l;
   }
}
