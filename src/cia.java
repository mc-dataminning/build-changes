public class cia {
   public static final alk<chz> a = a("pale");
   public static final alk<chz> b = a("spotted");
   public static final alk<chz> c = a("snowy");
   public static final alk<chz> d = a("black");
   public static final alk<chz> e = a("ashen");
   public static final alk<chz> f = a("rusty");
   public static final alk<chz> g = a("woods");
   public static final alk<chz> h = a("chestnut");
   public static final alk<chz> i = a("striped");
   public static final alk<chz> j = a;

   private static alk<chz> a(String $$0) {
      return alk.a(ma.m, all.b($$0));
   }

   static void a(rb<chz> $$0, alk<chz> $$1, String $$2, alk<dgh> $$3) {
      a($$0, $$1, $$2, ju.a($$0.a(ma.aG).b($$3)));
   }

   static void a(rb<chz> $$0, alk<chz> $$1, String $$2, axt<dgh> $$3) {
      a($$0, $$1, $$2, $$0.a(ma.aG).b($$3));
   }

   static void a(rb<chz> $$0, alk<chz> $$1, String $$2, ju<dgh> $$3) {
      all $$4 = all.b("entity/wolf/" + $$2);
      all $$5 = all.b("entity/wolf/" + $$2 + "_tame");
      all $$6 = all.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new chz($$4, $$5, $$6, $$3));
   }

   public static jq<chz> a(ke $$0, jq<dgh> $$1) {
      kd<chz> $$2 = $$0.e(ma.m);
      return $$2.c().filter($$1x -> ((chz)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(rb<chz> $$0) {
      a($$0, a, "wolf", dgo.p);
      a($$0, b, "wolf_spotted", axc.k);
      a($$0, c, "wolf_snowy", dgo.F);
      a($$0, d, "wolf_black", dgo.n);
      a($$0, e, "wolf_ashen", dgo.q);
      a($$0, f, "wolf_rusty", axc.i);
      a($$0, g, "wolf_woods", dgo.i);
      a($$0, h, "wolf_chestnut", dgo.o);
      a($$0, i, "wolf_striped", axc.f);
   }
}
