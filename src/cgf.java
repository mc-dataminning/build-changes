public class cgf {
   public static final ala<cge> a = a("pale");
   public static final ala<cge> b = a("spotted");
   public static final ala<cge> c = a("snowy");
   public static final ala<cge> d = a("black");
   public static final ala<cge> e = a("ashen");
   public static final ala<cge> f = a("rusty");
   public static final ala<cge> g = a("woods");
   public static final ala<cge> h = a("chestnut");
   public static final ala<cge> i = a("striped");

   private static ala<cge> a(String $$0) {
      return ala.a(lq.m, new alb($$0));
   }

   static void a(rc<cge> $$0, ala<cge> $$1, String $$2, ala<dcs> $$3) {
      a($$0, $$1, $$2, jm.a($$0.a(lq.az).b($$3)));
   }

   static void a(rc<cge> $$0, ala<cge> $$1, String $$2, axb<dcs> $$3) {
      a($$0, $$1, $$2, $$0.a(lq.az).b($$3));
   }

   static void a(rc<cge> $$0, ala<cge> $$1, String $$2, jm<dcs> $$3) {
      alb $$4 = new alb("entity/wolf/" + $$2);
      alb $$5 = new alb("entity/wolf/" + $$2 + "_tame");
      alb $$6 = new alb("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cge($$4, $$5, $$6, $$3));
   }

   public static ji<cge> a(jw $$0, ji<dcs> $$1) {
      jv<cge> $$2 = $$0.d(lq.m);
      return $$2.h().filter($$1x -> ((cge)$$1x.a()).d().a($$1)).findFirst().orElse($$2.g(a));
   }

   public static void a(rc<cge> $$0) {
      a($$0, a, "wolf", dcz.p);
      a($$0, b, "wolf_spotted", awk.k);
      a($$0, c, "wolf_snowy", dcz.F);
      a($$0, d, "wolf_black", dcz.n);
      a($$0, e, "wolf_ashen", dcz.q);
      a($$0, f, "wolf_rusty", awk.i);
      a($$0, g, "wolf_woods", dcz.i);
      a($$0, h, "wolf_chestnut", dcz.o);
      a($$0, i, "wolf_striped", awk.f);
   }
}
