import java.util.Optional;

public class cjr {
   public static final alf<cjq> a = a(cka.a);
   public static final alf<cjq> b = a(cka.b);
   public static final alf<cjq> c = a(cka.c);
   public static final alf<cjq> d = a;

   private static alf<cjq> a(alg $$0) {
      return alf.a(mg.ba, $$0);
   }

   public static void a(qh<cjq> $$0) {
      a($$0, a, cjq.a.a, "temperate_pig", ctj.a(0));
      a($$0, b, cjq.a.a, "warm_pig", axb.al);
      a($$0, c, cjq.a.b, "cold_pig", axb.ak);
   }

   private static void a(qh<cjq> $$0, alf<cjq> $$1, cjq.a $$2, String $$3, axr<dkd> $$4) {
      ji<dkd> $$5 = $$0.a(mg.aG).b($$4);
      a($$0, $$1, $$2, $$3, ctj.a(new ctc($$5), 1));
   }

   private static void a(qh<cjq> $$0, alf<cjq> $$1, cjq.a $$2, String $$3, ctj $$4) {
      alg $$5 = alg.b("entity/pig/" + $$3);
      $$0.a($$1, new cjq(new ctd<>($$2, $$5), $$4));
   }

   public static Optional<je.c<cjq>> a(azv $$0, js $$1, cti $$2) {
      return ctf.a($$1.f(mg.ba).c(), je::a, $$0, $$2);
   }
}
