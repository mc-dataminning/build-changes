import java.util.Optional;

public class cjh {
   public static final alf<cjg> a = a(cke.a);
   public static final alf<cjg> b = a(cke.b);
   public static final alf<cjg> c = a(cke.c);
   public static final alf<cjg> d = a;

   private static alf<cjg> a(alg $$0) {
      return alf.a(mh.aJ, $$0);
   }

   public static void a(qh<cjg> $$0) {
      a($$0, a, cjg.a.a, "temperate_chicken", ctt.a(0));
      a($$0, b, cjg.a.a, "warm_chicken", axb.al);
      a($$0, c, cjg.a.b, "cold_chicken", axb.ak);
   }

   private static void a(qh<cjg> $$0, alf<cjg> $$1, cjg.a $$2, String $$3, axr<dkp> $$4) {
      jj<dkp> $$5 = $$0.a(mh.aG).b($$4);
      a($$0, $$1, $$2, $$3, ctt.a(new ctm($$5), 1));
   }

   private static void a(qh<cjg> $$0, alf<cjg> $$1, cjg.a $$2, String $$3, ctt $$4) {
      alg $$5 = alg.b("entity/chicken/" + $$3);
      $$0.a($$1, new cjg(new ctn<>($$2, $$5), $$4));
   }

   public static Optional<jf.c<cjg>> a(azv $$0, jt $$1, cts $$2) {
      return ctp.a($$1.f(mh.aJ).c(), jf::a, $$0, $$2);
   }
}
