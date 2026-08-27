public class ceu {
   public static final akg<cet> a = a("pale");
   public static final akg<cet> b = a("spotted");
   public static final akg<cet> c = a("snowy");
   public static final akg<cet> d = a("black");
   public static final akg<cet> e = a("ashen");
   public static final akg<cet> f = a("rusty");
   public static final akg<cet> g = a("woods");
   public static final akg<cet> h = a("chestnut");
   public static final akg<cet> i = a("striped");

   private static akg<cet> a(String $$0) {
      return akg.a(le.m, new akh($$0));
   }

   static void a(ql<cet> $$0, akg<cet> $$1, String $$2, akg<dbc> $$3) {
      a($$0, $$1, $$2, ja.a($$0.a(le.az).b($$3)));
   }

   static void a(ql<cet> $$0, akg<cet> $$1, String $$2, awg<dbc> $$3) {
      a($$0, $$1, $$2, $$0.a(le.az).b($$3));
   }

   static void a(ql<cet> $$0, akg<cet> $$1, String $$2, ja<dbc> $$3) {
      akh $$4 = new akh("entity/wolf/" + $$2);
      akh $$5 = new akh("entity/wolf/" + $$2 + "_tame");
      akh $$6 = new akh("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cet($$4, $$5, $$6, $$3));
   }

   public static iw<cet> a(jk $$0, iw<dbc> $$1) {
      jj<cet> $$2 = $$0.d(le.m);
      return $$2.h().filter($$1x -> ((cet)$$1x.a()).d().a($$1)).findFirst().orElse($$2.g(a));
   }

   public static void a(ql<cet> $$0) {
      a($$0, a, "wolf", dbj.p);
      a($$0, b, "wolf_spotted", avq.k);
      a($$0, c, "wolf_snowy", dbj.F);
      a($$0, d, "wolf_black", dbj.n);
      a($$0, e, "wolf_ashen", dbj.q);
      a($$0, f, "wolf_rusty", avq.i);
      a($$0, g, "wolf_woods", dbj.i);
      a($$0, h, "wolf_chestnut", dbj.o);
      a($$0, i, "wolf_striped", avq.f);
   }
}
