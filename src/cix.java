public class cix {
   public static final akt<ciw> a = a("pale");
   public static final akt<ciw> b = a("spotted");
   public static final akt<ciw> c = a("snowy");
   public static final akt<ciw> d = a("black");
   public static final akt<ciw> e = a("ashen");
   public static final akt<ciw> f = a("rusty");
   public static final akt<ciw> g = a("woods");
   public static final akt<ciw> h = a("chestnut");
   public static final akt<ciw> i = a("striped");
   public static final akt<ciw> j = a;

   private static akt<ciw> a(String $$0) {
      return akt.a(mc.m, aku.b($$0));
   }

   static void a(qe<ciw> $$0, akt<ciw> $$1, String $$2, akt<dic> $$3) {
      a($$0, $$1, $$2, jv.a($$0.a(mc.aJ).b($$3)));
   }

   static void a(qe<ciw> $$0, akt<ciw> $$1, String $$2, axf<dic> $$3) {
      a($$0, $$1, $$2, $$0.a(mc.aJ).b($$3));
   }

   static void a(qe<ciw> $$0, akt<ciw> $$1, String $$2, jv<dic> $$3) {
      aku $$4 = aku.b("entity/wolf/" + $$2);
      aku $$5 = aku.b("entity/wolf/" + $$2 + "_tame");
      aku $$6 = aku.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new ciw($$4, $$5, $$6, $$3));
   }

   public static jr<ciw> a(kf $$0, jr<dic> $$1) {
      ke<ciw> $$2 = $$0.e(mc.m);
      return $$2.c().filter($$1x -> ((ciw)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(qe<ciw> $$0) {
      a($$0, a, "wolf", dij.q);
      a($$0, b, "wolf_spotted", awo.k);
      a($$0, c, "wolf_snowy", dij.G);
      a($$0, d, "wolf_black", dij.o);
      a($$0, e, "wolf_ashen", dij.r);
      a($$0, f, "wolf_rusty", awo.i);
      a($$0, g, "wolf_woods", dij.i);
      a($$0, h, "wolf_chestnut", dij.p);
      a($$0, i, "wolf_striped", awo.f);
   }
}
