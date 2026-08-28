public record cgz(all m) {
   public static final zj<ww, jq<cgz>> a = zh.b(ma.l);
   public static final alk<cgz> b = a("tabby");
   public static final alk<cgz> c = a("black");
   public static final alk<cgz> d = a("red");
   public static final alk<cgz> e = a("siamese");
   public static final alk<cgz> f = a("british_shorthair");
   public static final alk<cgz> g = a("calico");
   public static final alk<cgz> h = a("persian");
   public static final alk<cgz> i = a("ragdoll");
   public static final alk<cgz> j = a("white");
   public static final alk<cgz> k = a("jellie");
   public static final alk<cgz> l = a("all_black");

   private static alk<cgz> a(String $$0) {
      return alk.a(ma.l, all.b($$0));
   }

   public static cgz a(kd<cgz> $$0) {
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

   private static cgz a(kd<cgz> $$0, alk<cgz> $$1, String $$2) {
      return kd.a($$0, $$1, new cgz(all.b($$2)));
   }

   public all a() {
      return this.m;
   }
}
