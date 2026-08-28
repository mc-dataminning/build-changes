public class chw {
   public static final alh<chv> a = a("pale");
   public static final alh<chv> b = a("spotted");
   public static final alh<chv> c = a("snowy");
   public static final alh<chv> d = a("black");
   public static final alh<chv> e = a("ashen");
   public static final alh<chv> f = a("rusty");
   public static final alh<chv> g = a("woods");
   public static final alh<chv> h = a("chestnut");
   public static final alh<chv> i = a("striped");
   public static final alh<chv> j = a;

   private static alh<chv> a(String $$0) {
      return alh.a(lz.m, ali.b($$0));
   }

   static void a(qy<chv> $$0, alh<chv> $$1, String $$2, alh<dgc> $$3) {
      a($$0, $$1, $$2, ju.a($$0.a(lz.aG).b($$3)));
   }

   static void a(qy<chv> $$0, alh<chv> $$1, String $$2, axq<dgc> $$3) {
      a($$0, $$1, $$2, $$0.a(lz.aG).b($$3));
   }

   static void a(qy<chv> $$0, alh<chv> $$1, String $$2, ju<dgc> $$3) {
      ali $$4 = ali.b("entity/wolf/" + $$2);
      ali $$5 = ali.b("entity/wolf/" + $$2 + "_tame");
      ali $$6 = ali.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new chv($$4, $$5, $$6, $$3));
   }

   public static jq<chv> a(ke $$0, jq<dgc> $$1) {
      kd<chv> $$2 = $$0.e(lz.m);
      return $$2.c().filter($$1x -> ((chv)$$1x.a()).d().a($$1)).findFirst().or(() -> $$2.a(j)).or($$2::a).orElseThrow();
   }

   public static void a(qy<chv> $$0) {
      a($$0, a, "wolf", dgj.p);
      a($$0, b, "wolf_spotted", awz.k);
      a($$0, c, "wolf_snowy", dgj.F);
      a($$0, d, "wolf_black", dgj.n);
      a($$0, e, "wolf_ashen", dgj.q);
      a($$0, f, "wolf_rusty", awz.i);
      a($$0, g, "wolf_woods", dgj.i);
      a($$0, h, "wolf_chestnut", dgj.o);
      a($$0, i, "wolf_striped", awz.f);
   }
}
