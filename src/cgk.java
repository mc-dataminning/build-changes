public class cgk {
   public static final ale<cgj> a = a("pale");
   public static final ale<cgj> b = a("spotted");
   public static final ale<cgj> c = a("snowy");
   public static final ale<cgj> d = a("black");
   public static final ale<cgj> e = a("ashen");
   public static final ale<cgj> f = a("rusty");
   public static final ale<cgj> g = a("woods");
   public static final ale<cgj> h = a("chestnut");
   public static final ale<cgj> i = a("striped");

   private static ale<cgj> a(String $$0) {
      return ale.a(lq.m, new alf($$0));
   }

   static void a(rc<cgj> $$0, ale<cgj> $$1, String $$2, ale<dcx> $$3) {
      a($$0, $$1, $$2, jm.a($$0.a(lq.az).b($$3)));
   }

   static void a(rc<cgj> $$0, ale<cgj> $$1, String $$2, axf<dcx> $$3) {
      a($$0, $$1, $$2, $$0.a(lq.az).b($$3));
   }

   static void a(rc<cgj> $$0, ale<cgj> $$1, String $$2, jm<dcx> $$3) {
      alf $$4 = new alf("entity/wolf/" + $$2);
      alf $$5 = new alf("entity/wolf/" + $$2 + "_tame");
      alf $$6 = new alf("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cgj($$4, $$5, $$6, $$3));
   }

   public static ji<cgj> a(jw $$0, ji<dcx> $$1) {
      jv<cgj> $$2 = $$0.d(lq.m);
      return $$2.h().filter($$1x -> ((cgj)$$1x.a()).d().a($$1)).findFirst().orElse($$2.g(a));
   }

   public static void a(rc<cgj> $$0) {
      a($$0, a, "wolf", dde.p);
      a($$0, b, "wolf_spotted", awo.k);
      a($$0, c, "wolf_snowy", dde.F);
      a($$0, d, "wolf_black", dde.n);
      a($$0, e, "wolf_ashen", dde.q);
      a($$0, f, "wolf_rusty", awo.i);
      a($$0, g, "wolf_woods", dde.i);
      a($$0, h, "wolf_chestnut", dde.o);
      a($$0, i, "wolf_striped", awo.f);
   }
}
