public class cdn {
   public static final aju<cdm> a = a("pale");
   public static final aju<cdm> b = a("spotted");
   public static final aju<cdm> c = a("snowy");
   public static final aju<cdm> d = a("black");
   public static final aju<cdm> e = a("ashen");
   public static final aju<cdm> f = a("rusty");
   public static final aju<cdm> g = a("woods");
   public static final aju<cdm> h = a("chestnut");
   public static final aju<cdm> i = a("striped");

   private static aju<cdm> a(String $$0) {
      return aju.a(ku.m, new ajv($$0));
   }

   static void a(pz<cdm> $$0, aju<cdm> $$1, String $$2, aju<daf> $$3) {
      ajv $$4 = new ajv("textures/entity/wolf/" + $$2 + ".png");
      ajv $$5 = new ajv("textures/entity/wolf/" + $$2 + "_tame.png");
      ajv $$6 = new ajv("textures/entity/wolf/" + $$2 + "_angry.png");
      $$0.a($$1, new cdm($$4, $$5, $$6, ir.a($$0.a(ku.aw).b($$3))));
   }

   public static in<cdm> a(jb $$0, in<daf> $$1) {
      ja<cdm> $$2 = $$0.d(ku.m);
      return $$2.h().filter($$1x -> ((cdm)$$1x.a()).d().a($$1)).findFirst().orElse($$2.g(a));
   }

   public static void a(pz<cdm> $$0) {
      a($$0, a, "wolf", dam.p);
      a($$0, b, "wolf_spotted", dam.s);
      a($$0, c, "wolf_snowy", dam.F);
      a($$0, d, "wolf_black", dam.n);
      a($$0, e, "wolf_ashen", dam.q);
      a($$0, f, "wolf_rusty", dam.y);
      a($$0, g, "wolf_woods", dam.i);
      a($$0, h, "wolf_chestnut", dam.o);
      a($$0, i, "wolf_striped", dam.C);
   }
}
