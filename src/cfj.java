public class cfj {
   public static final akl<cfi> a = a("pale");
   public static final akl<cfi> b = a("spotted");
   public static final akl<cfi> c = a("snowy");
   public static final akl<cfi> d = a("black");
   public static final akl<cfi> e = a("ashen");
   public static final akl<cfi> f = a("rusty");
   public static final akl<cfi> g = a("woods");
   public static final akl<cfi> h = a("chestnut");
   public static final akl<cfi> i = a("striped");

   private static akl<cfi> a(String $$0) {
      return akl.a(lf.m, new akm($$0));
   }

   static void a(qo<cfi> $$0, akl<cfi> $$1, String $$2, akl<dbw> $$3) {
      a($$0, $$1, $$2, jb.a($$0.a(lf.az).b($$3)));
   }

   static void a(qo<cfi> $$0, akl<cfi> $$1, String $$2, awl<dbw> $$3) {
      a($$0, $$1, $$2, $$0.a(lf.az).b($$3));
   }

   static void a(qo<cfi> $$0, akl<cfi> $$1, String $$2, jb<dbw> $$3) {
      akm $$4 = new akm("entity/wolf/" + $$2);
      akm $$5 = new akm("entity/wolf/" + $$2 + "_tame");
      akm $$6 = new akm("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cfi($$4, $$5, $$6, $$3));
   }

   public static ix<cfi> a(jl $$0, ix<dbw> $$1) {
      jk<cfi> $$2 = $$0.d(lf.m);
      return $$2.h().filter($$1x -> ((cfi)$$1x.a()).d().a($$1)).findFirst().orElse($$2.g(a));
   }

   public static void a(qo<cfi> $$0) {
      a($$0, a, "wolf", dcd.p);
      a($$0, b, "wolf_spotted", avv.k);
      a($$0, c, "wolf_snowy", dcd.F);
      a($$0, d, "wolf_black", dcd.n);
      a($$0, e, "wolf_ashen", dcd.q);
      a($$0, f, "wolf_rusty", avv.i);
      a($$0, g, "wolf_woods", dcd.i);
      a($$0, h, "wolf_chestnut", dcd.o);
      a($$0, i, "wolf_striped", avv.f);
   }
}
