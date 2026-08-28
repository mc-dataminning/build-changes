import java.util.Optional;

public class cjc {
   public static final alf<cjb> a = a(cka.a);
   public static final alf<cjb> b = a(cka.b);
   public static final alf<cjb> c = a(cka.c);
   public static final alf<cjb> d = a;

   private static alf<cjb> a(alg $$0) {
      return alf.a(mg.aJ, $$0);
   }

   public static void a(qh<cjb> $$0) {
      a($$0, a, cjb.a.a, "temperate_chicken", ctj.a(0));
      a($$0, b, cjb.a.a, "warm_chicken", axb.al);
      a($$0, c, cjb.a.b, "cold_chicken", axb.ak);
   }

   private static void a(qh<cjb> $$0, alf<cjb> $$1, cjb.a $$2, String $$3, axr<dkd> $$4) {
      ji<dkd> $$5 = $$0.a(mg.aG).b($$4);
      a($$0, $$1, $$2, $$3, ctj.a(new ctc($$5), 1));
   }

   private static void a(qh<cjb> $$0, alf<cjb> $$1, cjb.a $$2, String $$3, ctj $$4) {
      alg $$5 = alg.b("entity/chicken/" + $$3);
      $$0.a($$1, new cjb(new ctd<>($$2, $$5), $$4));
   }

   public static Optional<je.c<cjb>> a(azv $$0, js $$1, cti $$2) {
      return ctf.a($$1.f(mg.aJ).c(), je::a, $$0, $$2);
   }
}
