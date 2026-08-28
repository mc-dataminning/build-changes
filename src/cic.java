public class cic {
   public static final aku<cib> a = a("pale");
   public static final aku<cib> b = a("spotted");
   public static final aku<cib> c = a("snowy");
   public static final aku<cib> d = a("black");
   public static final aku<cib> e = a("ashen");
   public static final aku<cib> f = a("rusty");
   public static final aku<cib> g = a("woods");
   public static final aku<cib> h = a("chestnut");
   public static final aku<cib> i = a("striped");
   public static final aku<cib> j = a;

   private static aku<cib> a(String $$0) {
      return aku.a(mc.m, akv.b($$0));
   }

   static void a(qe<cib> $$0, aku<cib> $$1, String $$2, aku<dhj> $$3) {
      a($$0, $$1, $$2, jv.a($$0.a(mc.aI).b($$3)));
   }

   static void a(qe<cib> $$0, aku<cib> $$1, String $$2, axf<dhj> $$3) {
      a($$0, $$1, $$2, $$0.a(mc.aI).b($$3));
   }

   static void a(qe<cib> $$0, aku<cib> $$1, String $$2, jv<dhj> $$3) {
      akv $$4 = akv.b("entity/wolf/" + $$2);
      akv $$5 = akv.b("entity/wolf/" + $$2 + "_tame");
      akv $$6 = akv.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cib($$4, $$5, $$6, $$3));
   }

   public static jr<cib> a(kf $$0, jr<dhj> $$1) {
      ke<cib> $$2 = $$0.e(mc.m);
      return $$2.c().filter($$1x -> ((cib)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(qe<cib> $$0) {
      a($$0, a, "wolf", dhq.q);
      a($$0, b, "wolf_spotted", awo.k);
      a($$0, c, "wolf_snowy", dhq.G);
      a($$0, d, "wolf_black", dhq.o);
      a($$0, e, "wolf_ashen", dhq.r);
      a($$0, f, "wolf_rusty", awo.i);
      a($$0, g, "wolf_woods", dhq.i);
      a($$0, h, "wolf_chestnut", dhq.p);
      a($$0, i, "wolf_striped", awo.f);
   }
}
