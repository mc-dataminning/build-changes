import java.util.List;
import java.util.Optional;

public interface ciz {
   alf<ciy> a = a("tabby");
   alf<ciy> b = a("black");
   alf<ciy> c = a("red");
   alf<ciy> d = a("siamese");
   alf<ciy> e = a("british_shorthair");
   alf<ciy> f = a("calico");
   alf<ciy> g = a("persian");
   alf<ciy> h = a("ragdoll");
   alf<ciy> i = a("white");
   alf<ciy> j = a("jellie");
   alf<ciy> k = a("all_black");

   private static alf<ciy> a(String $$0) {
      return alf.a(mg.aH, alg.b($$0));
   }

   static void a(qh<ciy> $$0) {
      jf<erb> $$1 = $$0.a(mg.be);
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
      a($$0, k, "entity/cat/all_black", new ctj(List.of(new ctf.a<>(new ctk($$1.b(axn.o)), 1), new ctf.a<>(new cte(cv.c.b(0.9)), 0))));
   }

   private static void a(qh<ciy> $$0, alf<ciy> $$1, String $$2) {
      a($$0, $$1, $$2, ctj.a(0));
   }

   private static void a(qh<ciy> $$0, alf<ciy> $$1, String $$2, ctj $$3) {
      $$0.a($$1, new ciy(new iv(alg.b($$2)), $$3));
   }

   static Optional<je.c<ciy>> a(azv $$0, js $$1, cti $$2) {
      return ctf.a($$1.f(mg.aH).c(), je::a, $$0, $$2);
   }
}
