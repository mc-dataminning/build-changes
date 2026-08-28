public class cie {
   public static final aku<cid> a = a("pale");
   public static final aku<cid> b = a("spotted");
   public static final aku<cid> c = a("snowy");
   public static final aku<cid> d = a("black");
   public static final aku<cid> e = a("ashen");
   public static final aku<cid> f = a("rusty");
   public static final aku<cid> g = a("woods");
   public static final aku<cid> h = a("chestnut");
   public static final aku<cid> i = a("striped");
   public static final aku<cid> j = a;

   private static aku<cid> a(String $$0) {
      return aku.a(mc.m, akv.b($$0));
   }

   static void a(qe<cid> $$0, aku<cid> $$1, String $$2, aku<dhl> $$3) {
      a($$0, $$1, $$2, jv.a($$0.a(mc.aI).b($$3)));
   }

   static void a(qe<cid> $$0, aku<cid> $$1, String $$2, axf<dhl> $$3) {
      a($$0, $$1, $$2, $$0.a(mc.aI).b($$3));
   }

   static void a(qe<cid> $$0, aku<cid> $$1, String $$2, jv<dhl> $$3) {
      akv $$4 = akv.b("entity/wolf/" + $$2);
      akv $$5 = akv.b("entity/wolf/" + $$2 + "_tame");
      akv $$6 = akv.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cid($$4, $$5, $$6, $$3));
   }

   public static jr<cid> a(kf $$0, jr<dhl> $$1) {
      ke<cid> $$2 = $$0.e(mc.m);
      return $$2.c().filter($$1x -> ((cid)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(qe<cid> $$0) {
      a($$0, a, "wolf", dhs.q);
      a($$0, b, "wolf_spotted", awo.k);
      a($$0, c, "wolf_snowy", dhs.G);
      a($$0, d, "wolf_black", dhs.o);
      a($$0, e, "wolf_ashen", dhs.r);
      a($$0, f, "wolf_rusty", awo.i);
      a($$0, g, "wolf_woods", dhs.i);
      a($$0, h, "wolf_chestnut", dhs.p);
      a($$0, i, "wolf_striped", awo.f);
   }
}
