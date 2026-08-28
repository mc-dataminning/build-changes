public record cfh(ale l) {
   public static final ald<cfh> a = a("tabby");
   public static final ald<cfh> b = a("black");
   public static final ald<cfh> c = a("red");
   public static final ald<cfh> d = a("siamese");
   public static final ald<cfh> e = a("british_shorthair");
   public static final ald<cfh> f = a("calico");
   public static final ald<cfh> g = a("persian");
   public static final ald<cfh> h = a("ragdoll");
   public static final ald<cfh> i = a("white");
   public static final ald<cfh> j = a("jellie");
   public static final ald<cfh> k = a("all_black");

   private static ald<cfh> a(String $$0) {
      return ald.a(lq.l, new ale($$0));
   }

   public static cfh a(jv<cfh> $$0) {
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

   private static cfh a(jv<cfh> $$0, ald<cfh> $$1, String $$2) {
      return jv.a($$0, $$1, new cfh(new ale($$2)));
   }

   public ale a() {
      return this.l;
   }
}
