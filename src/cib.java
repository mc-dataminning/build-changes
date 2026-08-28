public class cib {
   public static final akt<cia> a = a("pale");
   public static final akt<cia> b = a("spotted");
   public static final akt<cia> c = a("snowy");
   public static final akt<cia> d = a("black");
   public static final akt<cia> e = a("ashen");
   public static final akt<cia> f = a("rusty");
   public static final akt<cia> g = a("woods");
   public static final akt<cia> h = a("chestnut");
   public static final akt<cia> i = a("striped");
   public static final akt<cia> j = a;

   private static akt<cia> a(String $$0) {
      return akt.a(mc.m, aku.b($$0));
   }

   static void a(qe<cia> $$0, akt<cia> $$1, String $$2, akt<dhi> $$3) {
      a($$0, $$1, $$2, jv.a($$0.a(mc.aI).b($$3)));
   }

   static void a(qe<cia> $$0, akt<cia> $$1, String $$2, axe<dhi> $$3) {
      a($$0, $$1, $$2, $$0.a(mc.aI).b($$3));
   }

   static void a(qe<cia> $$0, akt<cia> $$1, String $$2, jv<dhi> $$3) {
      aku $$4 = aku.b("entity/wolf/" + $$2);
      aku $$5 = aku.b("entity/wolf/" + $$2 + "_tame");
      aku $$6 = aku.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cia($$4, $$5, $$6, $$3));
   }

   public static jr<cia> a(kf $$0, jr<dhi> $$1) {
      ke<cia> $$2 = $$0.e(mc.m);
      return $$2.c().filter($$1x -> ((cia)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(qe<cia> $$0) {
      a($$0, a, "wolf", dhp.q);
      a($$0, b, "wolf_spotted", awn.k);
      a($$0, c, "wolf_snowy", dhp.G);
      a($$0, d, "wolf_black", dhp.o);
      a($$0, e, "wolf_ashen", dhp.r);
      a($$0, f, "wolf_rusty", awn.i);
      a($$0, g, "wolf_woods", dhp.i);
      a($$0, h, "wolf_chestnut", dhp.p);
      a($$0, i, "wolf_striped", awn.f);
   }
}
