public class cfw {
   public static final akj<cfv> a = a("pale");
   public static final akj<cfv> b = a("spotted");
   public static final akj<cfv> c = a("snowy");
   public static final akj<cfv> d = a("black");
   public static final akj<cfv> e = a("ashen");
   public static final akj<cfv> f = a("rusty");
   public static final akj<cfv> g = a("woods");
   public static final akj<cfv> h = a("chestnut");
   public static final akj<cfv> i = a("striped");
   public static final akj<cfv> j = a;

   private static akj<cfv> a(String $$0) {
      return akj.a(lr.m, new akk($$0));
   }

   static void a(qm<cfv> $$0, akj<cfv> $$1, String $$2, akj<ddf> $$3) {
      a($$0, $$1, $$2, jn.a($$0.a(lr.aE).b($$3)));
   }

   static void a(qm<cfv> $$0, akj<cfv> $$1, String $$2, awm<ddf> $$3) {
      a($$0, $$1, $$2, $$0.a(lr.aE).b($$3));
   }

   static void a(qm<cfv> $$0, akj<cfv> $$1, String $$2, jn<ddf> $$3) {
      akk $$4 = new akk("entity/wolf/" + $$2);
      akk $$5 = new akk("entity/wolf/" + $$2 + "_tame");
      akk $$6 = new akk("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cfv($$4, $$5, $$6, $$3));
   }

   public static jj<cfv> a(jx $$0, jj<ddf> $$1) {
      jw<cfv> $$2 = $$0.d(lr.m);
      return $$2.i().filter($$1x -> ((cfv)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.b(j)).or($$2::a).orElseThrow();
   }

   public static void a(qm<cfv> $$0) {
      a($$0, a, "wolf", ddm.p);
      a($$0, b, "wolf_spotted", avv.k);
      a($$0, c, "wolf_snowy", ddm.F);
      a($$0, d, "wolf_black", ddm.n);
      a($$0, e, "wolf_ashen", ddm.q);
      a($$0, f, "wolf_rusty", avv.i);
      a($$0, g, "wolf_woods", ddm.i);
      a($$0, h, "wolf_chestnut", ddm.o);
      a($$0, i, "wolf_striped", avv.f);
   }
}
