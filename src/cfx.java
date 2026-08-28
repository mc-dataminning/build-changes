public class cfx {
   public static final akj<cfw> a = a("pale");
   public static final akj<cfw> b = a("spotted");
   public static final akj<cfw> c = a("snowy");
   public static final akj<cfw> d = a("black");
   public static final akj<cfw> e = a("ashen");
   public static final akj<cfw> f = a("rusty");
   public static final akj<cfw> g = a("woods");
   public static final akj<cfw> h = a("chestnut");
   public static final akj<cfw> i = a("striped");
   public static final akj<cfw> j = a;

   private static akj<cfw> a(String $$0) {
      return akj.a(lr.m, new akk($$0));
   }

   static void a(qm<cfw> $$0, akj<cfw> $$1, String $$2, akj<ddg> $$3) {
      a($$0, $$1, $$2, jn.a($$0.a(lr.aE).b($$3)));
   }

   static void a(qm<cfw> $$0, akj<cfw> $$1, String $$2, awm<ddg> $$3) {
      a($$0, $$1, $$2, $$0.a(lr.aE).b($$3));
   }

   static void a(qm<cfw> $$0, akj<cfw> $$1, String $$2, jn<ddg> $$3) {
      akk $$4 = new akk("entity/wolf/" + $$2);
      akk $$5 = new akk("entity/wolf/" + $$2 + "_tame");
      akk $$6 = new akk("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cfw($$4, $$5, $$6, $$3));
   }

   public static jj<cfw> a(jx $$0, jj<ddg> $$1) {
      jw<cfw> $$2 = $$0.d(lr.m);
      return $$2.i().filter($$1x -> ((cfw)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.b(j)).or($$2::a).orElseThrow();
   }

   public static void a(qm<cfw> $$0) {
      a($$0, a, "wolf", ddn.p);
      a($$0, b, "wolf_spotted", avv.k);
      a($$0, c, "wolf_snowy", ddn.F);
      a($$0, d, "wolf_black", ddn.n);
      a($$0, e, "wolf_ashen", ddn.q);
      a($$0, f, "wolf_rusty", avv.i);
      a($$0, g, "wolf_woods", ddn.i);
      a($$0, h, "wolf_chestnut", ddn.o);
      a($$0, i, "wolf_striped", avv.f);
   }
}
