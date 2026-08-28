import java.util.Optional;

public class ckd {
   public static final alq<ckc> a = a(cla.a);
   public static final alq<ckc> b = a(cla.b);
   public static final alq<ckc> c = a(cla.c);
   public static final alq<ckc> d = a;

   private static alq<ckc> a(alr $$0) {
      return alq.a(mi.aJ, $$0);
   }

   public static void a(qi<ckc> $$0) {
      a($$0, a, ckc.a.a, "temperate_chicken", cup.a(0));
      a($$0, b, ckc.a.a, "warm_chicken", axm.al);
      a($$0, c, ckc.a.b, "cold_chicken", axm.ak);
   }

   private static void a(qi<ckc> $$0, alq<ckc> $$1, ckc.a $$2, String $$3, ayc<dlm> $$4) {
      jk<dlm> $$5 = $$0.a(mi.aG).b($$4);
      a($$0, $$1, $$2, $$3, cup.a(new cui($$5), 1));
   }

   private static void a(qi<ckc> $$0, alq<ckc> $$1, ckc.a $$2, String $$3, cup $$4) {
      alr $$5 = alr.b("entity/chicken/" + $$3);
      $$0.a($$1, new ckc(new cuj<>($$2, $$5), $$4));
   }

   public static Optional<jg.c<ckc>> a(bai $$0, ju $$1, cuo $$2) {
      return cul.a($$1.f(mi.aJ).c(), jg::a, $$0, $$2);
   }
}
