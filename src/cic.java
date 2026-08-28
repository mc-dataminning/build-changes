public class cic {
   public static final akt<cib> a = a("pale");
   public static final akt<cib> b = a("spotted");
   public static final akt<cib> c = a("snowy");
   public static final akt<cib> d = a("black");
   public static final akt<cib> e = a("ashen");
   public static final akt<cib> f = a("rusty");
   public static final akt<cib> g = a("woods");
   public static final akt<cib> h = a("chestnut");
   public static final akt<cib> i = a("striped");
   public static final akt<cib> j = a;

   private static akt<cib> a(String $$0) {
      return akt.a(mc.m, aku.b($$0));
   }

   static void a(qe<cib> $$0, akt<cib> $$1, String $$2, akt<dhk> $$3) {
      a($$0, $$1, $$2, jv.a($$0.a(mc.aI).b($$3)));
   }

   static void a(qe<cib> $$0, akt<cib> $$1, String $$2, axf<dhk> $$3) {
      a($$0, $$1, $$2, $$0.a(mc.aI).b($$3));
   }

   static void a(qe<cib> $$0, akt<cib> $$1, String $$2, jv<dhk> $$3) {
      aku $$4 = aku.b("entity/wolf/" + $$2);
      aku $$5 = aku.b("entity/wolf/" + $$2 + "_tame");
      aku $$6 = aku.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cib($$4, $$5, $$6, $$3));
   }

   public static jr<cib> a(kf $$0, jr<dhk> $$1) {
      ke<cib> $$2 = $$0.e(mc.m);
      return $$2.c().filter($$1x -> ((cib)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(qe<cib> $$0) {
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
