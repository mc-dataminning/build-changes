import java.util.List;
import java.util.Optional;

public interface cit {
   ald<cis> a = a("tabby");
   ald<cis> b = a("black");
   ald<cis> c = a("red");
   ald<cis> d = a("siamese");
   ald<cis> e = a("british_shorthair");
   ald<cis> f = a("calico");
   ald<cis> g = a("persian");
   ald<cis> h = a("ragdoll");
   ald<cis> i = a("white");
   ald<cis> j = a("jellie");
   ald<cis> k = a("all_black");

   private static ald<cis> a(String $$0) {
      return ald.a(mg.aH, ale.b($$0));
   }

   static void a(qh<cis> $$0) {
      jf<eqi> $$1 = $$0.a(mg.bc);
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
      a($$0, k, "entity/cat/all_black", new csy(List.of(new csu.a<>(new csz($$1.b(axl.o)), 1), new csu.a<>(new cst(cv.c.b(0.9)), 0))));
   }

   private static void a(qh<cis> $$0, ald<cis> $$1, String $$2) {
      a($$0, $$1, $$2, csy.a(0));
   }

   private static void a(qh<cis> $$0, ald<cis> $$1, String $$2, csy $$3) {
      $$0.a($$1, new cis(new iv(ale.b($$2)), $$3));
   }

   static Optional<je.c<cis>> a(azt $$0, js $$1, csx $$2) {
      return csu.a($$1.f(mg.aH).c(), je::a, $$0, $$2);
   }
}
