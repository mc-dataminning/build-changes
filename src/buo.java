public record buo(aer l) {
   public static final aeq<buo> a = a("tabby");
   public static final aeq<buo> b = a("black");
   public static final aeq<buo> c = a("red");
   public static final aeq<buo> d = a("siamese");
   public static final aeq<buo> e = a("british_shorthair");
   public static final aeq<buo> f = a("calico");
   public static final aeq<buo> g = a("persian");
   public static final aeq<buo> h = a("ragdoll");
   public static final aeq<buo> i = a("white");
   public static final aeq<buo> j = a("jellie");
   public static final aeq<buo> k = a("all_black");

   private static aeq<buo> a(String $$0) {
      return aeq.a(jc.j, new aer($$0));
   }

   public static buo a(hr<buo> $$0) {
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

   private static buo a(hr<buo> $$0, aeq<buo> $$1, String $$2) {
      return hr.a($$0, $$1, new buo(new aer($$2)));
   }

   public aer a() {
      return this.l;
   }
}
