public record bwv(agi l) {
   public static final agh<bwv> a = a("tabby");
   public static final agh<bwv> b = a("black");
   public static final agh<bwv> c = a("red");
   public static final agh<bwv> d = a("siamese");
   public static final agh<bwv> e = a("british_shorthair");
   public static final agh<bwv> f = a("calico");
   public static final agh<bwv> g = a("persian");
   public static final agh<bwv> h = a("ragdoll");
   public static final agh<bwv> i = a("white");
   public static final agh<bwv> j = a("jellie");
   public static final agh<bwv> k = a("all_black");

   private static agh<bwv> a(String $$0) {
      return agh.a(jz.k, new agi($$0));
   }

   public static bwv a(io<bwv> $$0) {
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

   private static bwv a(io<bwv> $$0, agh<bwv> $$1, String $$2) {
      return io.a($$0, $$1, new bwv(new agi($$2)));
   }

   public agi a() {
      return this.l;
   }
}
