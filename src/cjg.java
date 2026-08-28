import java.util.Optional;

public class cjg {
   public static final alf<cjf> a = a(cka.a);
   public static final alf<cjf> b = a(cka.b);
   public static final alf<cjf> c = a(cka.c);
   public static final alf<cjf> d = a;

   private static alf<cjf> a(alg $$0) {
      return alf.a(mg.aM, $$0);
   }

   public static void a(qh<cjf> $$0) {
      a($$0, a, cjf.a.a, "temperate_cow", ctj.a(0));
      a($$0, b, cjf.a.c, "warm_cow", axb.al);
      a($$0, c, cjf.a.b, "cold_cow", axb.ak);
   }

   private static void a(qh<cjf> $$0, alf<cjf> $$1, cjf.a $$2, String $$3, axr<dkd> $$4) {
      ji<dkd> $$5 = $$0.a(mg.aG).b($$4);
      a($$0, $$1, $$2, $$3, ctj.a(new ctc($$5), 1));
   }

   private static void a(qh<cjf> $$0, alf<cjf> $$1, cjf.a $$2, String $$3, ctj $$4) {
      alg $$5 = alg.b("entity/cow/" + $$3);
      $$0.a($$1, new cjf(new ctd<>($$2, $$5), $$4));
   }

   public static Optional<je.c<cjf>> a(azv $$0, js $$1, cti $$2) {
      return ctf.a($$1.f(mg.aM).c(), je::a, $$0, $$2);
   }
}
