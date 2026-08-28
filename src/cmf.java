import java.util.Optional;

public class cmf {
   public static final alf<cme> a = a("pale");
   public static final alf<cme> b = a("spotted");
   public static final alf<cme> c = a("snowy");
   public static final alf<cme> d = a("black");
   public static final alf<cme> e = a("ashen");
   public static final alf<cme> f = a("rusty");
   public static final alf<cme> g = a("woods");
   public static final alf<cme> h = a("chestnut");
   public static final alf<cme> i = a("striped");
   public static final alf<cme> j = a;

   private static alf<cme> a(String $$0) {
      return alf.a(mh.bm, alg.b($$0));
   }

   private static void a(qh<cme> $$0, alf<cme> $$1, String $$2, alf<dkp> $$3) {
      a($$0, $$1, $$2, a(jj.a($$0.a(mh.aG).b($$3))));
   }

   private static void a(qh<cme> $$0, alf<cme> $$1, String $$2, axr<dkp> $$3) {
      a($$0, $$1, $$2, a($$0.a(mh.aG).b($$3)));
   }

   private static ctt a(jj<dkp> $$0) {
      return ctt.a(new ctm($$0), 1);
   }

   private static void a(qh<cme> $$0, alf<cme> $$1, String $$2, ctt $$3) {
      alg $$4 = alg.b("entity/wolf/" + $$2);
      alg $$5 = alg.b("entity/wolf/" + $$2 + "_tame");
      alg $$6 = alg.b("entity/wolf/" + $$2 + "_angry");
      $$0.a($$1, new cme(new cme.a(new iw($$4), new iw($$5), new iw($$6)), $$3));
   }

   public static Optional<? extends jf<cme>> a(azv $$0, jt $$1, cts $$2) {
      return ctp.a($$1.f(mh.bm).c(), jf::a, $$0, $$2);
   }

   public static void a(qh<cme> $$0) {
      a($$0, a, "wolf", ctt.a(0));
      a($$0, b, "wolf_spotted", axb.k);
      a($$0, c, "wolf_snowy", dkw.G);
      a($$0, d, "wolf_black", dkw.o);
      a($$0, e, "wolf_ashen", dkw.r);
      a($$0, f, "wolf_rusty", axb.i);
      a($$0, g, "wolf_woods", dkw.i);
      a($$0, h, "wolf_chestnut", dkw.p);
      a($$0, i, "wolf_striped", axb.f);
   }
}
