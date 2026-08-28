public class cgi {
   public static final ald<cgh> a = a("pale");
   public static final ald<cgh> b = a("spotted");
   public static final ald<cgh> c = a("snowy");
   public static final ald<cgh> d = a("black");
   public static final ald<cgh> e = a("ashen");
   public static final ald<cgh> f = a("rusty");
   public static final ald<cgh> g = a("woods");
   public static final ald<cgh> h = a("chestnut");
   public static final ald<cgh> i = a("striped");

   private static ald<cgh> a(String $$0) {
      return ald.a(lq.m, new ale($$0));
   }

   static void a(rc<cgh> $$0, ald<cgh> $$1, String $$2, ald<dcv> $$3) {
      a($$0, $$1, $$2, jm.a($$0.a(lq.az).b($$3)));
   }

   static void a(rc<cgh> $$0, ald<cgh> $$1, String $$2, axe<dcv> $$3) {
      a($$0, $$1, $$2, $$0.a(lq.az).b($$3));
   }

   static void a(rc<cgh> $$0, ald<cgh> $$1, String $$2, jm<dcv> $$3) {
      ale $$4 = new ale("entity/wolf/" + $$2);
      ale $$5 = new ale("entity/wolf/" + $$2 + "_tame");
      ale $$6 = new ale("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cgh($$4, $$5, $$6, $$3));
   }

   public static ji<cgh> a(jw $$0, ji<dcv> $$1) {
      jv<cgh> $$2 = $$0.d(lq.m);
      return $$2.h().filter($$1x -> ((cgh)$$1x.a()).d().a($$1)).findFirst().orElse($$2.g(a));
   }

   public static void a(rc<cgh> $$0) {
      a($$0, a, "wolf", ddc.p);
      a($$0, b, "wolf_spotted", awn.k);
      a($$0, c, "wolf_snowy", ddc.F);
      a($$0, d, "wolf_black", ddc.n);
      a($$0, e, "wolf_ashen", ddc.q);
      a($$0, f, "wolf_rusty", awn.i);
      a($$0, g, "wolf_woods", ddc.i);
      a($$0, h, "wolf_chestnut", ddc.o);
      a($$0, i, "wolf_striped", awn.f);
   }
}
