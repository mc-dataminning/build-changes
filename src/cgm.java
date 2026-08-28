public class cgm {
   public static final ale<cgl> a = a("pale");
   public static final ale<cgl> b = a("spotted");
   public static final ale<cgl> c = a("snowy");
   public static final ale<cgl> d = a("black");
   public static final ale<cgl> e = a("ashen");
   public static final ale<cgl> f = a("rusty");
   public static final ale<cgl> g = a("woods");
   public static final ale<cgl> h = a("chestnut");
   public static final ale<cgl> i = a("striped");

   private static ale<cgl> a(String $$0) {
      return ale.a(lq.m, new alf($$0));
   }

   static void a(rc<cgl> $$0, ale<cgl> $$1, String $$2, ale<dcz> $$3) {
      a($$0, $$1, $$2, jm.a($$0.a(lq.az).b($$3)));
   }

   static void a(rc<cgl> $$0, ale<cgl> $$1, String $$2, axf<dcz> $$3) {
      a($$0, $$1, $$2, $$0.a(lq.az).b($$3));
   }

   static void a(rc<cgl> $$0, ale<cgl> $$1, String $$2, jm<dcz> $$3) {
      alf $$4 = new alf("entity/wolf/" + $$2);
      alf $$5 = new alf("entity/wolf/" + $$2 + "_tame");
      alf $$6 = new alf("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cgl($$4, $$5, $$6, $$3));
   }

   public static ji<cgl> a(jw $$0, ji<dcz> $$1) {
      jv<cgl> $$2 = $$0.d(lq.m);
      return $$2.h().filter($$1x -> ((cgl)$$1x.a()).d().a($$1)).findFirst().orElse($$2.g(a));
   }

   public static void a(rc<cgl> $$0) {
      a($$0, a, "wolf", ddg.p);
      a($$0, b, "wolf_spotted", awo.k);
      a($$0, c, "wolf_snowy", ddg.F);
      a($$0, d, "wolf_black", ddg.n);
      a($$0, e, "wolf_ashen", ddg.q);
      a($$0, f, "wolf_rusty", awo.i);
      a($$0, g, "wolf_woods", ddg.i);
      a($$0, h, "wolf_chestnut", ddg.o);
      a($$0, i, "wolf_striped", awo.f);
   }
}
