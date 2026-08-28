import java.util.List;
import java.util.Optional;

public interface cix {
   alf<ciw> a = a("tabby");
   alf<ciw> b = a("black");
   alf<ciw> c = a("red");
   alf<ciw> d = a("siamese");
   alf<ciw> e = a("british_shorthair");
   alf<ciw> f = a("calico");
   alf<ciw> g = a("persian");
   alf<ciw> h = a("ragdoll");
   alf<ciw> i = a("white");
   alf<ciw> j = a("jellie");
   alf<ciw> k = a("all_black");

   private static alf<ciw> a(String $$0) {
      return alf.a(mg.aH, alg.b($$0));
   }

   static void a(qh<ciw> $$0) {
      jf<eqt> $$1 = $$0.a(mg.bd);
      a($$0, a, "entity/cat/tabby");
      a($$0, b, "entity/cat/black");
      a($$0, c, "entity/cat/red");
      a($$0, d, "entity/cat/siamese");
      a($$0, e, "entity/cat/british_shorthair");
      a($$0, f, "entity/cat/calico");
      a($$0, g, "entity/cat/persian");
      a($$0, h, "entity/cat/ragdoll");
      a($$0, i, "entity/cat/white");
      a($$0, j, "entity/cat/jellie");
      a($$0, k, "entity/cat/all_black", new cte(List.of(new cta.a<>(new ctf($$1.b(axn.o)), 1), new cta.a<>(new csz(cv.c.b(0.9)), 0))));
   }

   private static void a(qh<ciw> $$0, alf<ciw> $$1, String $$2) {
      a($$0, $$1, $$2, cte.a(0));
   }

   private static void a(qh<ciw> $$0, alf<ciw> $$1, String $$2, cte $$3) {
      $$0.a($$1, new ciw(new iv(alg.b($$2)), $$3));
   }

   static Optional<je.c<ciw>> a(azv $$0, js $$1, ctd $$2) {
      return cta.a($$1.f(mg.aH).c(), je::a, $$0, $$2);
   }
}
