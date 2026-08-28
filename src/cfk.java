public record cfk(alf l) {
   public static final ale<cfk> a = a("tabby");
   public static final ale<cfk> b = a("black");
   public static final ale<cfk> c = a("red");
   public static final ale<cfk> d = a("siamese");
   public static final ale<cfk> e = a("british_shorthair");
   public static final ale<cfk> f = a("calico");
   public static final ale<cfk> g = a("persian");
   public static final ale<cfk> h = a("ragdoll");
   public static final ale<cfk> i = a("white");
   public static final ale<cfk> j = a("jellie");
   public static final ale<cfk> k = a("all_black");

   private static ale<cfk> a(String $$0) {
      return ale.a(lq.l, new alf($$0));
   }

   public static cfk a(jv<cfk> $$0) {
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

   private static cfk a(jv<cfk> $$0, ale<cfk> $$1, String $$2) {
      return jv.a($$0, $$1, new cfk(new alf($$2)));
   }

   public alf a() {
      return this.l;
   }
}
