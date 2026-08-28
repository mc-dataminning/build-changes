public class cjc {
   public static final aly<cjb> a = a("pale");
   public static final aly<cjb> b = a("spotted");
   public static final aly<cjb> c = a("snowy");
   public static final aly<cjb> d = a("black");
   public static final aly<cjb> e = a("ashen");
   public static final aly<cjb> f = a("rusty");
   public static final aly<cjb> g = a("woods");
   public static final aly<cjb> h = a("chestnut");
   public static final aly<cjb> i = a("striped");
   public static final aly<cjb> j = a;

   private static aly<cjb> a(String $$0) {
      return aly.a(mb.m, alz.b($$0));
   }

   static void a(rk<cjb> $$0, aly<cjb> $$1, String $$2, aly<dik> $$3) {
      a($$0, $$1, $$2, ju.a($$0.a(mb.aI).b($$3)));
   }

   static void a(rk<cjb> $$0, aly<cjb> $$1, String $$2, ayk<dik> $$3) {
      a($$0, $$1, $$2, $$0.a(mb.aI).b($$3));
   }

   static void a(rk<cjb> $$0, aly<cjb> $$1, String $$2, ju<dik> $$3) {
      alz $$4 = alz.b("entity/wolf/" + $$2);
      alz $$5 = alz.b("entity/wolf/" + $$2 + "_tame");
      alz $$6 = alz.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cjb($$4, $$5, $$6, $$3));
   }

   public static jq<cjb> a(ke $$0, jq<dik> $$1) {
      kd<cjb> $$2 = $$0.e(mb.m);
      return $$2.c().filter($$1x -> ((cjb)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(rk<cjb> $$0) {
      a($$0, a, "wolf", dir.p);
      a($$0, b, "wolf_spotted", axt.k);
      a($$0, c, "wolf_snowy", dir.F);
      a($$0, d, "wolf_black", dir.n);
      a($$0, e, "wolf_ashen", dir.q);
      a($$0, f, "wolf_rusty", axt.i);
      a($$0, g, "wolf_woods", dir.i);
      a($$0, h, "wolf_chestnut", dir.o);
      a($$0, i, "wolf_striped", axt.f);
   }
}
