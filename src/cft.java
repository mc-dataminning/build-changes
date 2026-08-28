public class cft {
   public static final akj<cfs> a = a("pale");
   public static final akj<cfs> b = a("spotted");
   public static final akj<cfs> c = a("snowy");
   public static final akj<cfs> d = a("black");
   public static final akj<cfs> e = a("ashen");
   public static final akj<cfs> f = a("rusty");
   public static final akj<cfs> g = a("woods");
   public static final akj<cfs> h = a("chestnut");
   public static final akj<cfs> i = a("striped");
   public static final akj<cfs> j = a;

   private static akj<cfs> a(String $$0) {
      return akj.a(lr.m, new akk($$0));
   }

   static void a(qm<cfs> $$0, akj<cfs> $$1, String $$2, akj<ddd> $$3) {
      a($$0, $$1, $$2, jn.a($$0.a(lr.aE).b($$3)));
   }

   static void a(qm<cfs> $$0, akj<cfs> $$1, String $$2, awk<ddd> $$3) {
      a($$0, $$1, $$2, $$0.a(lr.aE).b($$3));
   }

   static void a(qm<cfs> $$0, akj<cfs> $$1, String $$2, jn<ddd> $$3) {
      akk $$4 = new akk("entity/wolf/" + $$2);
      akk $$5 = new akk("entity/wolf/" + $$2 + "_tame");
      akk $$6 = new akk("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cfs($$4, $$5, $$6, $$3));
   }

   public static jj<cfs> a(jx $$0, jj<ddd> $$1) {
      jw<cfs> $$2 = $$0.d(lr.m);
      return $$2.i().filter($$1x -> ((cfs)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.b(j)).or($$2::a).orElseThrow();
   }

   public static void a(qm<cfs> $$0) {
      a($$0, a, "wolf", ddk.p);
      a($$0, b, "wolf_spotted", avt.k);
      a($$0, c, "wolf_snowy", ddk.F);
      a($$0, d, "wolf_black", ddk.n);
      a($$0, e, "wolf_ashen", ddk.q);
      a($$0, f, "wolf_rusty", avt.i);
      a($$0, g, "wolf_woods", ddk.i);
      a($$0, h, "wolf_chestnut", ddk.o);
      a($$0, i, "wolf_striped", avt.f);
   }
}
