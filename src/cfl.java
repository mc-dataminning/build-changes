public class cfl {
   public static final akm<cfk> a = a("pale");
   public static final akm<cfk> b = a("spotted");
   public static final akm<cfk> c = a("snowy");
   public static final akm<cfk> d = a("black");
   public static final akm<cfk> e = a("ashen");
   public static final akm<cfk> f = a("rusty");
   public static final akm<cfk> g = a("woods");
   public static final akm<cfk> h = a("chestnut");
   public static final akm<cfk> i = a("striped");

   private static akm<cfk> a(String $$0) {
      return akm.a(lf.m, new akn($$0));
   }

   static void a(qo<cfk> $$0, akm<cfk> $$1, String $$2, akm<dby> $$3) {
      a($$0, $$1, $$2, jb.a($$0.a(lf.az).b($$3)));
   }

   static void a(qo<cfk> $$0, akm<cfk> $$1, String $$2, awm<dby> $$3) {
      a($$0, $$1, $$2, $$0.a(lf.az).b($$3));
   }

   static void a(qo<cfk> $$0, akm<cfk> $$1, String $$2, jb<dby> $$3) {
      akn $$4 = new akn("entity/wolf/" + $$2);
      akn $$5 = new akn("entity/wolf/" + $$2 + "_tame");
      akn $$6 = new akn("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cfk($$4, $$5, $$6, $$3));
   }

   public static ix<cfk> a(jl $$0, ix<dby> $$1) {
      jk<cfk> $$2 = $$0.d(lf.m);
      return $$2.h().filter($$1x -> ((cfk)$$1x.a()).d().a($$1)).findFirst().orElse($$2.g(a));
   }

   public static void a(qo<cfk> $$0) {
      a($$0, a, "wolf", dcf.p);
      a($$0, b, "wolf_spotted", avw.k);
      a($$0, c, "wolf_snowy", dcf.F);
      a($$0, d, "wolf_black", dcf.n);
      a($$0, e, "wolf_ashen", dcf.q);
      a($$0, f, "wolf_rusty", avw.i);
      a($$0, g, "wolf_woods", dcf.i);
      a($$0, h, "wolf_chestnut", dcf.o);
      a($$0, i, "wolf_striped", avw.f);
   }
}
