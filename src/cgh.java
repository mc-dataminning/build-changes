public class cgh {
   public static final akp<cgg> a = a("pale");
   public static final akp<cgg> b = a("spotted");
   public static final akp<cgg> c = a("snowy");
   public static final akp<cgg> d = a("black");
   public static final akp<cgg> e = a("ashen");
   public static final akp<cgg> f = a("rusty");
   public static final akp<cgg> g = a("woods");
   public static final akp<cgg> h = a("chestnut");
   public static final akp<cgg> i = a("striped");
   public static final akp<cgg> j = a;

   private static akp<cgg> a(String $$0) {
      return akp.a(lu.m, akq.b($$0));
   }

   static void a(qp<cgg> $$0, akp<cgg> $$1, String $$2, akp<ddu> $$3) {
      a($$0, $$1, $$2, jq.a($$0.a(lu.aF).b($$3)));
   }

   static void a(qp<cgg> $$0, akp<cgg> $$1, String $$2, awt<ddu> $$3) {
      a($$0, $$1, $$2, $$0.a(lu.aF).b($$3));
   }

   static void a(qp<cgg> $$0, akp<cgg> $$1, String $$2, jq<ddu> $$3) {
      akq $$4 = akq.b("entity/wolf/" + $$2);
      akq $$5 = akq.b("entity/wolf/" + $$2 + "_tame");
      akq $$6 = akq.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cgg($$4, $$5, $$6, $$3));
   }

   public static jm<cgg> a(ka $$0, jm<ddu> $$1) {
      jz<cgg> $$2 = $$0.d(lu.m);
      return $$2.i().filter($$1x -> ((cgg)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.b(j)).or($$2::a).orElseThrow();
   }

   public static void a(qp<cgg> $$0) {
      a($$0, a, "wolf", deb.p);
      a($$0, b, "wolf_spotted", awc.k);
      a($$0, c, "wolf_snowy", deb.F);
      a($$0, d, "wolf_black", deb.n);
      a($$0, e, "wolf_ashen", deb.q);
      a($$0, f, "wolf_rusty", awc.i);
      a($$0, g, "wolf_woods", deb.i);
      a($$0, h, "wolf_chestnut", deb.o);
      a($$0, i, "wolf_striped", awc.f);
   }
}
