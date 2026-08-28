import java.util.Optional;

public class cjw {
   public static final ald<cjv> a = a("pale");
   public static final ald<cjv> b = a("spotted");
   public static final ald<cjv> c = a("snowy");
   public static final ald<cjv> d = a("black");
   public static final ald<cjv> e = a("ashen");
   public static final ald<cjv> f = a("rusty");
   public static final ald<cjv> g = a("woods");
   public static final ald<cjv> h = a("chestnut");
   public static final ald<cjv> i = a("striped");
   public static final ald<cjv> j = a;

   private static ald<cjv> a(String $$0) {
      return ald.a(mg.bk, ale.b($$0));
   }

   private static void a(qh<cjv> $$0, ald<cjv> $$1, String $$2, ald<djs> $$3) {
      a($$0, $$1, $$2, a(ji.a($$0.a(mg.aG).b($$3))));
   }

   private static void a(qh<cjv> $$0, ald<cjv> $$1, String $$2, axp<djs> $$3) {
      a($$0, $$1, $$2, a($$0.a(mg.aG).b($$3)));
   }

   private static csy a(ji<djs> $$0) {
      return csy.a(new csr($$0), 1);
   }

   private static void a(qh<cjv> $$0, ald<cjv> $$1, String $$2, csy $$3) {
      ale $$4 = ale.b("entity/wolf/" + $$2);
      ale $$5 = ale.b("entity/wolf/" + $$2 + "_tame");
      ale $$6 = ale.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cjv(new cjv.a(new iv($$4), new iv($$5), new iv($$6)), $$3));
   }

   public static Optional<? extends je<cjv>> a(azt $$0, js $$1, csx $$2) {
      return csu.a($$1.f(mg.bk).c(), je::a, $$0, $$2);
   }

   public static void a(qh<cjv> $$0) {
      a($$0, a, "wolf", csy.a(0));
      a($$0, b, "wolf_spotted", awz.k);
      a($$0, c, "wolf_snowy", djz.G);
      a($$0, d, "wolf_black", djz.o);
      a($$0, e, "wolf_ashen", djz.r);
      a($$0, f, "wolf_rusty", awz.i);
      a($$0, g, "wolf_woods", djz.i);
      a($$0, h, "wolf_chestnut", djz.p);
      a($$0, i, "wolf_striped", awz.f);
   }
}
