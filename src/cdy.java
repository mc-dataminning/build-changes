public class cdy {
   public static final ake<cdx> a = a("pale");
   public static final ake<cdx> b = a("spotted");
   public static final ake<cdx> c = a("snowy");
   public static final ake<cdx> d = a("black");
   public static final ake<cdx> e = a("ashen");
   public static final ake<cdx> f = a("rusty");
   public static final ake<cdx> g = a("woods");
   public static final ake<cdx> h = a("chestnut");
   public static final ake<cdx> i = a("striped");

   private static ake<cdx> a(String $$0) {
      return ake.a(ld.m, new akf($$0));
   }

   static void a(qj<cdx> $$0, ake<cdx> $$1, String $$2, ake<dat> $$3) {
      a($$0, $$1, $$2, iz.a($$0.a(ld.ay).b($$3)));
   }

   static void a(qj<cdx> $$0, ake<cdx> $$1, String $$2, awd<dat> $$3) {
      a($$0, $$1, $$2, $$0.a(ld.ay).b($$3));
   }

   static void a(qj<cdx> $$0, ake<cdx> $$1, String $$2, iz<dat> $$3) {
      akf $$4 = new akf("textures/entity/wolf/" + $$2 + ".png");
      akf $$5 = new akf("textures/entity/wolf/" + $$2 + "_tame.png");
      akf $$6 = new akf("textures/entity/wolf/" + $$2 + "_angry.png");
      $$0.a($$1, new cdx($$4, $$5, $$6, $$3));
   }

   public static iv<cdx> a(jj $$0, iv<dat> $$1) {
      ji<cdx> $$2 = $$0.d(ld.m);
      return $$2.h().filter($$1x -> ((cdx)$$1x.a()).d().a($$1)).findFirst().orElse($$2.g(a));
   }

   public static void a(qj<cdx> $$0) {
      a($$0, a, "wolf", dba.p);
      a($$0, b, "wolf_spotted", avn.k);
      a($$0, c, "wolf_snowy", dba.F);
      a($$0, d, "wolf_black", dba.n);
      a($$0, e, "wolf_ashen", dba.q);
      a($$0, f, "wolf_rusty", avn.i);
      a($$0, g, "wolf_woods", dba.i);
      a($$0, h, "wolf_chestnut", dba.o);
      a($$0, i, "wolf_striped", avn.f);
   }
}
