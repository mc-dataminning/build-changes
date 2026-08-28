public class cgj {
   public static final akq<cgi> a = a("pale");
   public static final akq<cgi> b = a("spotted");
   public static final akq<cgi> c = a("snowy");
   public static final akq<cgi> d = a("black");
   public static final akq<cgi> e = a("ashen");
   public static final akq<cgi> f = a("rusty");
   public static final akq<cgi> g = a("woods");
   public static final akq<cgi> h = a("chestnut");
   public static final akq<cgi> i = a("striped");
   public static final akq<cgi> j = a;

   private static akq<cgi> a(String $$0) {
      return akq.a(lu.m, akr.b($$0));
   }

   static void a(qq<cgi> $$0, akq<cgi> $$1, String $$2, akq<ddw> $$3) {
      a($$0, $$1, $$2, jq.a($$0.a(lu.aF).b($$3)));
   }

   static void a(qq<cgi> $$0, akq<cgi> $$1, String $$2, awu<ddw> $$3) {
      a($$0, $$1, $$2, $$0.a(lu.aF).b($$3));
   }

   static void a(qq<cgi> $$0, akq<cgi> $$1, String $$2, jq<ddw> $$3) {
      akr $$4 = akr.b("entity/wolf/" + $$2);
      akr $$5 = akr.b("entity/wolf/" + $$2 + "_tame");
      akr $$6 = akr.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cgi($$4, $$5, $$6, $$3));
   }

   public static jm<cgi> a(ka $$0, jm<ddw> $$1) {
      jz<cgi> $$2 = $$0.d(lu.m);
      return $$2.i().filter($$1x -> ((cgi)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.b(j)).or($$2::a).orElseThrow();
   }

   public static void a(qq<cgi> $$0) {
      a($$0, a, "wolf", ded.p);
      a($$0, b, "wolf_spotted", awd.k);
      a($$0, c, "wolf_snowy", ded.F);
      a($$0, d, "wolf_black", ded.n);
      a($$0, e, "wolf_ashen", ded.q);
      a($$0, f, "wolf_rusty", awd.i);
      a($$0, g, "wolf_woods", ded.i);
      a($$0, h, "wolf_chestnut", ded.o);
      a($$0, i, "wolf_striped", awd.f);
   }
}
