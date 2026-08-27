public record bun(aer l) {
   public static final aeq<bun> a = a("tabby");
   public static final aeq<bun> b = a("black");
   public static final aeq<bun> c = a("red");
   public static final aeq<bun> d = a("siamese");
   public static final aeq<bun> e = a("british_shorthair");
   public static final aeq<bun> f = a("calico");
   public static final aeq<bun> g = a("persian");
   public static final aeq<bun> h = a("ragdoll");
   public static final aeq<bun> i = a("white");
   public static final aeq<bun> j = a("jellie");
   public static final aeq<bun> k = a("all_black");

   private static aeq<bun> a(String $$0) {
      return aeq.a(jc.j, new aer($$0));
   }

   public static bun a(hr<bun> $$0) {
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

   private static bun a(hr<bun> $$0, aeq<bun> $$1, String $$2) {
      return hr.a($$0, $$1, new bun(new aer($$2)));
   }

   public aer a() {
      return this.l;
   }
}
