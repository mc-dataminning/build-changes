public class cit {
   public static final alo<cis> a = a("pale");
   public static final alo<cis> b = a("spotted");
   public static final alo<cis> c = a("snowy");
   public static final alo<cis> d = a("black");
   public static final alo<cis> e = a("ashen");
   public static final alo<cis> f = a("rusty");
   public static final alo<cis> g = a("woods");
   public static final alo<cis> h = a("chestnut");
   public static final alo<cis> i = a("striped");
   public static final alo<cis> j = a;

   private static alo<cis> a(String $$0) {
      return alo.a(mb.m, alp.b($$0));
   }

   static void a(ra<cis> $$0, alo<cis> $$1, String $$2, alo<dib> $$3) {
      a($$0, $$1, $$2, ju.a($$0.a(mb.aI).b($$3)));
   }

   static void a(ra<cis> $$0, alo<cis> $$1, String $$2, aya<dib> $$3) {
      a($$0, $$1, $$2, $$0.a(mb.aI).b($$3));
   }

   static void a(ra<cis> $$0, alo<cis> $$1, String $$2, ju<dib> $$3) {
      alp $$4 = alp.b("entity/wolf/" + $$2);
      alp $$5 = alp.b("entity/wolf/" + $$2 + "_tame");
      alp $$6 = alp.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cis($$4, $$5, $$6, $$3));
   }

   public static jq<cis> a(ke $$0, jq<dib> $$1) {
      kd<cis> $$2 = $$0.e(mb.m);
      return $$2.c().filter($$1x -> ((cis)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(ra<cis> $$0) {
      a($$0, a, "wolf", dii.q);
      a($$0, b, "wolf_spotted", axj.k);
      a($$0, c, "wolf_snowy", dii.G);
      a($$0, d, "wolf_black", dii.o);
      a($$0, e, "wolf_ashen", dii.r);
      a($$0, f, "wolf_rusty", axj.i);
      a($$0, g, "wolf_woods", dii.i);
      a($$0, h, "wolf_chestnut", dii.p);
      a($$0, i, "wolf_striped", axj.f);
   }
}
