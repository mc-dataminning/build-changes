public class chr {
   public static final alg<chq> a = a("pale");
   public static final alg<chq> b = a("spotted");
   public static final alg<chq> c = a("snowy");
   public static final alg<chq> d = a("black");
   public static final alg<chq> e = a("ashen");
   public static final alg<chq> f = a("rusty");
   public static final alg<chq> g = a("woods");
   public static final alg<chq> h = a("chestnut");
   public static final alg<chq> i = a("striped");
   public static final alg<chq> j = a;

   private static alg<chq> a(String $$0) {
      return alg.a(ly.m, alh.b($$0));
   }

   static void a(qx<chq> $$0, alg<chq> $$1, String $$2, alg<dfw> $$3) {
      a($$0, $$1, $$2, jt.a($$0.a(ly.aG).b($$3)));
   }

   static void a(qx<chq> $$0, alg<chq> $$1, String $$2, axp<dfw> $$3) {
      a($$0, $$1, $$2, $$0.a(ly.aG).b($$3));
   }

   static void a(qx<chq> $$0, alg<chq> $$1, String $$2, jt<dfw> $$3) {
      alh $$4 = alh.b("entity/wolf/" + $$2);
      alh $$5 = alh.b("entity/wolf/" + $$2 + "_tame");
      alh $$6 = alh.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new chq($$4, $$5, $$6, $$3));
   }

   public static jp<chq> a(kd $$0, jp<dfw> $$1) {
      kc<chq> $$2 = $$0.e(ly.m);
      return $$2.c().filter($$1x -> ((chq)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(qx<chq> $$0) {
      a($$0, a, "wolf", dgd.p);
      a($$0, b, "wolf_spotted", awy.k);
      a($$0, c, "wolf_snowy", dgd.F);
      a($$0, d, "wolf_black", dgd.n);
      a($$0, e, "wolf_ashen", dgd.q);
      a($$0, f, "wolf_rusty", awy.i);
      a($$0, g, "wolf_woods", dgd.i);
      a($$0, h, "wolf_chestnut", dgd.o);
      a($$0, i, "wolf_striped", awy.f);
   }
}
