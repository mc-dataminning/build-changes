public record cfz(alb m) {
   public static final zb<wo, jn<cfz>> a = yz.b(lv.l);
   public static final ala<cfz> b = a("tabby");
   public static final ala<cfz> c = a("black");
   public static final ala<cfz> d = a("red");
   public static final ala<cfz> e = a("siamese");
   public static final ala<cfz> f = a("british_shorthair");
   public static final ala<cfz> g = a("calico");
   public static final ala<cfz> h = a("persian");
   public static final ala<cfz> i = a("ragdoll");
   public static final ala<cfz> j = a("white");
   public static final ala<cfz> k = a("jellie");
   public static final ala<cfz> l = a("all_black");

   private static ala<cfz> a(String $$0) {
      return ala.a(lv.l, alb.b($$0));
   }

   public static cfz a(ka<cfz> $$0) {
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

   private static cfz a(ka<cfz> $$0, ala<cfz> $$1, String $$2) {
      return ka.a($$0, $$1, new cfz(alb.b($$2)));
   }

   public alb a() {
      return this.m;
   }
}
