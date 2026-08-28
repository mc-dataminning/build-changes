public record chc(alj m) {
   public static final zh<wu, jq<chc>> a = zf.b(ma.l);
   public static final ali<chc> b = a("tabby");
   public static final ali<chc> c = a("black");
   public static final ali<chc> d = a("red");
   public static final ali<chc> e = a("siamese");
   public static final ali<chc> f = a("british_shorthair");
   public static final ali<chc> g = a("calico");
   public static final ali<chc> h = a("persian");
   public static final ali<chc> i = a("ragdoll");
   public static final ali<chc> j = a("white");
   public static final ali<chc> k = a("jellie");
   public static final ali<chc> l = a("all_black");

   private static ali<chc> a(String $$0) {
      return ali.a(ma.l, alj.b($$0));
   }

   public static chc a(kd<chc> $$0) {
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

   private static chc a(kd<chc> $$0, ali<chc> $$1, String $$2) {
      return kd.a($$0, $$1, new chc(alj.b($$2)));
   }

   public alj a() {
      return this.m;
   }
}
