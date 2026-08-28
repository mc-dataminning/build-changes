public class cgj {
   public static final ald<cgi> a = a("pale");
   public static final ald<cgi> b = a("spotted");
   public static final ald<cgi> c = a("snowy");
   public static final ald<cgi> d = a("black");
   public static final ald<cgi> e = a("ashen");
   public static final ald<cgi> f = a("rusty");
   public static final ald<cgi> g = a("woods");
   public static final ald<cgi> h = a("chestnut");
   public static final ald<cgi> i = a("striped");

   private static ald<cgi> a(String $$0) {
      return ald.a(lq.m, new ale($$0));
   }

   static void a(rc<cgi> $$0, ald<cgi> $$1, String $$2, ald<dcw> $$3) {
      a($$0, $$1, $$2, jm.a($$0.a(lq.az).b($$3)));
   }

   static void a(rc<cgi> $$0, ald<cgi> $$1, String $$2, axe<dcw> $$3) {
      a($$0, $$1, $$2, $$0.a(lq.az).b($$3));
   }

   static void a(rc<cgi> $$0, ald<cgi> $$1, String $$2, jm<dcw> $$3) {
      ale $$4 = new ale("entity/wolf/" + $$2);
      ale $$5 = new ale("entity/wolf/" + $$2 + "_tame");
      ale $$6 = new ale("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cgi($$4, $$5, $$6, $$3));
   }

   public static ji<cgi> a(jw $$0, ji<dcw> $$1) {
      jv<cgi> $$2 = $$0.d(lq.m);
      return $$2.h().filter($$1x -> ((cgi)$$1x.a()).d().a($$1)).findFirst().orElse($$2.g(a));
   }

   public static void a(rc<cgi> $$0) {
      a($$0, a, "wolf", ddd.p);
      a($$0, b, "wolf_spotted", awn.k);
      a($$0, c, "wolf_snowy", ddd.F);
      a($$0, d, "wolf_black", ddd.n);
      a($$0, e, "wolf_ashen", ddd.q);
      a($$0, f, "wolf_rusty", awn.i);
      a($$0, g, "wolf_woods", ddd.i);
      a($$0, h, "wolf_chestnut", ddd.o);
      a($$0, i, "wolf_striped", awn.f);
   }
}
