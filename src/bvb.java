public record bvb(aez l) {
   public static final aey<bvb> a = a("tabby");
   public static final aey<bvb> b = a("black");
   public static final aey<bvb> c = a("red");
   public static final aey<bvb> d = a("siamese");
   public static final aey<bvb> e = a("british_shorthair");
   public static final aey<bvb> f = a("calico");
   public static final aey<bvb> g = a("persian");
   public static final aey<bvb> h = a("ragdoll");
   public static final aey<bvb> i = a("white");
   public static final aey<bvb> j = a("jellie");
   public static final aey<bvb> k = a("all_black");

   private static aey<bvb> a(String $$0) {
      return aey.a(jc.k, new aez($$0));
   }

   public static bvb a(hq<bvb> $$0) {
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

   private static bvb a(hq<bvb> $$0, aey<bvb> $$1, String $$2) {
      return hq.a($$0, $$1, new bvb(new aez($$2)));
   }

   public aez a() {
      return this.l;
   }
}
