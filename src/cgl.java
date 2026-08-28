public class cgl {
   public static final ale<cgk> a = a("pale");
   public static final ale<cgk> b = a("spotted");
   public static final ale<cgk> c = a("snowy");
   public static final ale<cgk> d = a("black");
   public static final ale<cgk> e = a("ashen");
   public static final ale<cgk> f = a("rusty");
   public static final ale<cgk> g = a("woods");
   public static final ale<cgk> h = a("chestnut");
   public static final ale<cgk> i = a("striped");

   private static ale<cgk> a(String $$0) {
      return ale.a(lq.m, new alf($$0));
   }

   static void a(rc<cgk> $$0, ale<cgk> $$1, String $$2, ale<dcy> $$3) {
      a($$0, $$1, $$2, jm.a($$0.a(lq.az).b($$3)));
   }

   static void a(rc<cgk> $$0, ale<cgk> $$1, String $$2, axf<dcy> $$3) {
      a($$0, $$1, $$2, $$0.a(lq.az).b($$3));
   }

   static void a(rc<cgk> $$0, ale<cgk> $$1, String $$2, jm<dcy> $$3) {
      alf $$4 = new alf("entity/wolf/" + $$2);
      alf $$5 = new alf("entity/wolf/" + $$2 + "_tame");
      alf $$6 = new alf("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cgk($$4, $$5, $$6, $$3));
   }

   public static ji<cgk> a(jw $$0, ji<dcy> $$1) {
      jv<cgk> $$2 = $$0.d(lq.m);
      return $$2.h().filter($$1x -> ((cgk)$$1x.a()).d().a($$1)).findFirst().orElse($$2.g(a));
   }

   public static void a(rc<cgk> $$0) {
      a($$0, a, "wolf", ddf.p);
      a($$0, b, "wolf_spotted", awo.k);
      a($$0, c, "wolf_snowy", ddf.F);
      a($$0, d, "wolf_black", ddf.n);
      a($$0, e, "wolf_ashen", ddf.q);
      a($$0, f, "wolf_rusty", awo.i);
      a($$0, g, "wolf_woods", ddf.i);
      a($$0, h, "wolf_chestnut", ddf.o);
      a($$0, i, "wolf_striped", awo.f);
   }
}
