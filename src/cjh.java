import java.util.Optional;

public class cjh {
   public static final ald<cjg> a = a(cjq.a);
   public static final ald<cjg> b = a(cjq.b);
   public static final ald<cjg> c = a(cjq.c);
   public static final ald<cjg> d = a;

   private static ald<cjg> a(ale $$0) {
      return ald.a(mg.aY, $$0);
   }

   public static void a(qh<cjg> $$0) {
      a($$0, a, cjg.a.a, "pig", csy.a(0));
      a($$0, b, cjg.a.a, "warm_pig", awz.al);
      a($$0, c, cjg.a.b, "cold_pig", awz.ak);
   }

   private static void a(qh<cjg> $$0, ald<cjg> $$1, cjg.a $$2, String $$3, axp<djs> $$4) {
      ji<djs> $$5 = $$0.a(mg.aG).b($$4);
      a($$0, $$1, $$2, $$3, csy.a(new csr($$5), 1));
   }

   private static void a(qh<cjg> $$0, ald<cjg> $$1, cjg.a $$2, String $$3, csy $$4) {
      ale $$5 = ale.b("entity/pig/" + $$3);
      $$0.a($$1, new cjg(new css<>($$2, $$5), $$4));
   }

   public static Optional<je.c<cjg>> a(azt $$0, js $$1, csx $$2) {
      return csu.a($$1.f(mg.aY).c(), je::a, $$0, $$2);
   }
}
