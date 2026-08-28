public class cix {
   public static final aly<ciw> a = a("pale");
   public static final aly<ciw> b = a("spotted");
   public static final aly<ciw> c = a("snowy");
   public static final aly<ciw> d = a("black");
   public static final aly<ciw> e = a("ashen");
   public static final aly<ciw> f = a("rusty");
   public static final aly<ciw> g = a("woods");
   public static final aly<ciw> h = a("chestnut");
   public static final aly<ciw> i = a("striped");
   public static final aly<ciw> j = a;

   private static aly<ciw> a(String $$0) {
      return aly.a(mb.m, alz.b($$0));
   }

   static void a(rk<ciw> $$0, aly<ciw> $$1, String $$2, aly<dic> $$3) {
      a($$0, $$1, $$2, ju.a($$0.a(mb.aH).b($$3)));
   }

   static void a(rk<ciw> $$0, aly<ciw> $$1, String $$2, ayk<dic> $$3) {
      a($$0, $$1, $$2, $$0.a(mb.aH).b($$3));
   }

   static void a(rk<ciw> $$0, aly<ciw> $$1, String $$2, ju<dic> $$3) {
      alz $$4 = alz.b("entity/wolf/" + $$2);
      alz $$5 = alz.b("entity/wolf/" + $$2 + "_tame");
      alz $$6 = alz.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new ciw($$4, $$5, $$6, $$3));
   }

   public static jq<ciw> a(ke $$0, jq<dic> $$1) {
      kd<ciw> $$2 = $$0.e(mb.m);
      return $$2.c().filter($$1x -> ((ciw)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(rk<ciw> $$0) {
      a($$0, a, "wolf", dij.p);
      a($$0, b, "wolf_spotted", axt.k);
      a($$0, c, "wolf_snowy", dij.F);
      a($$0, d, "wolf_black", dij.n);
      a($$0, e, "wolf_ashen", dij.q);
      a($$0, f, "wolf_rusty", axt.i);
      a($$0, g, "wolf_woods", dij.i);
      a($$0, h, "wolf_chestnut", dij.o);
      a($$0, i, "wolf_striped", axt.f);
   }
}
