public class cid {
   public static final aku<cic> a = a("pale");
   public static final aku<cic> b = a("spotted");
   public static final aku<cic> c = a("snowy");
   public static final aku<cic> d = a("black");
   public static final aku<cic> e = a("ashen");
   public static final aku<cic> f = a("rusty");
   public static final aku<cic> g = a("woods");
   public static final aku<cic> h = a("chestnut");
   public static final aku<cic> i = a("striped");
   public static final aku<cic> j = a;

   private static aku<cic> a(String $$0) {
      return aku.a(mc.m, akv.b($$0));
   }

   static void a(qe<cic> $$0, aku<cic> $$1, String $$2, aku<dhk> $$3) {
      a($$0, $$1, $$2, jv.a($$0.a(mc.aI).b($$3)));
   }

   static void a(qe<cic> $$0, aku<cic> $$1, String $$2, axf<dhk> $$3) {
      a($$0, $$1, $$2, $$0.a(mc.aI).b($$3));
   }

   static void a(qe<cic> $$0, aku<cic> $$1, String $$2, jv<dhk> $$3) {
      akv $$4 = akv.b("entity/wolf/" + $$2);
      akv $$5 = akv.b("entity/wolf/" + $$2 + "_tame");
      akv $$6 = akv.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cic($$4, $$5, $$6, $$3));
   }

   public static jr<cic> a(kf $$0, jr<dhk> $$1) {
      ke<cic> $$2 = $$0.e(mc.m);
      return $$2.c().filter($$1x -> ((cic)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(qe<cic> $$0) {
      a($$0, a, "wolf", dhr.q);
      a($$0, b, "wolf_spotted", awo.k);
      a($$0, c, "wolf_snowy", dhr.G);
      a($$0, d, "wolf_black", dhr.o);
      a($$0, e, "wolf_ashen", dhr.r);
      a($$0, f, "wolf_rusty", awo.i);
      a($$0, g, "wolf_woods", dhr.i);
      a($$0, h, "wolf_chestnut", dhr.p);
      a($$0, i, "wolf_striped", awo.f);
   }
}
