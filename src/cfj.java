public class cfj {
   public static final aks<cfi> a = a("pale");
   public static final aks<cfi> b = a("spotted");
   public static final aks<cfi> c = a("snowy");
   public static final aks<cfi> d = a("black");
   public static final aks<cfi> e = a("ashen");
   public static final aks<cfi> f = a("rusty");
   public static final aks<cfi> g = a("woods");
   public static final aks<cfi> h = a("chestnut");
   public static final aks<cfi> i = a("striped");

   private static aks<cfi> a(String $$0) {
      return aks.a(li.m, new akt($$0));
   }

   static void a(qq<cfi> $$0, aks<cfi> $$1, String $$2, aks<dcz> $$3) {
      a($$0, $$1, $$2, je.a($$0.a(li.az).b($$3)));
   }

   static void a(qq<cfi> $$0, aks<cfi> $$1, String $$2, awt<dcz> $$3) {
      a($$0, $$1, $$2, $$0.a(li.az).b($$3));
   }

   static void a(qq<cfi> $$0, aks<cfi> $$1, String $$2, je<dcz> $$3) {
      akt $$4 = new akt("entity/wolf/" + $$2);
      akt $$5 = new akt("entity/wolf/" + $$2 + "_tame");
      akt $$6 = new akt("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cfi($$4, $$5, $$6, $$3));
   }

   public static ja<cfi> a(jo $$0, ja<dcz> $$1) {
      jn<cfi> $$2 = $$0.d(li.m);
      return $$2.h().filter($$1x -> ((cfi)$$1x.a()).d().a($$1)).findFirst().orElse($$2.g(a));
   }

   public static void a(qq<cfi> $$0) {
      a($$0, a, "wolf", ddg.u);
      a($$0, b, "wolf_spotted", awd.k);
      a($$0, c, "wolf_snowy", ddg.K);
      a($$0, d, "wolf_black", ddg.s);
      a($$0, e, "wolf_ashen", ddg.v);
      a($$0, f, "wolf_rusty", awd.i);
      a($$0, g, "wolf_woods", ddg.n);
      a($$0, h, "wolf_chestnut", ddg.t);
      a($$0, i, "wolf_striped", awd.f);
   }
}
