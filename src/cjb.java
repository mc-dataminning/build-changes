public class cjb {
   public static final aly<cja> a = a("pale");
   public static final aly<cja> b = a("spotted");
   public static final aly<cja> c = a("snowy");
   public static final aly<cja> d = a("black");
   public static final aly<cja> e = a("ashen");
   public static final aly<cja> f = a("rusty");
   public static final aly<cja> g = a("woods");
   public static final aly<cja> h = a("chestnut");
   public static final aly<cja> i = a("striped");
   public static final aly<cja> j = a;

   private static aly<cja> a(String $$0) {
      return aly.a(mb.m, alz.b($$0));
   }

   static void a(rk<cja> $$0, aly<cja> $$1, String $$2, aly<dij> $$3) {
      a($$0, $$1, $$2, ju.a($$0.a(mb.aI).b($$3)));
   }

   static void a(rk<cja> $$0, aly<cja> $$1, String $$2, ayk<dij> $$3) {
      a($$0, $$1, $$2, $$0.a(mb.aI).b($$3));
   }

   static void a(rk<cja> $$0, aly<cja> $$1, String $$2, ju<dij> $$3) {
      alz $$4 = alz.b("entity/wolf/" + $$2);
      alz $$5 = alz.b("entity/wolf/" + $$2 + "_tame");
      alz $$6 = alz.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cja($$4, $$5, $$6, $$3));
   }

   public static jq<cja> a(ke $$0, jq<dij> $$1) {
      kd<cja> $$2 = $$0.e(mb.m);
      return $$2.c().filter($$1x -> ((cja)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(rk<cja> $$0) {
      a($$0, a, "wolf", diq.p);
      a($$0, b, "wolf_spotted", axt.k);
      a($$0, c, "wolf_snowy", diq.F);
      a($$0, d, "wolf_black", diq.n);
      a($$0, e, "wolf_ashen", diq.q);
      a($$0, f, "wolf_rusty", axt.i);
      a($$0, g, "wolf_woods", diq.i);
      a($$0, h, "wolf_chestnut", diq.o);
      a($$0, i, "wolf_striped", axt.f);
   }
}
