import java.util.List;
import java.util.Optional;

public interface cje {
   alf<cjd> a = a("tabby");
   alf<cjd> b = a("black");
   alf<cjd> c = a("red");
   alf<cjd> d = a("siamese");
   alf<cjd> e = a("british_shorthair");
   alf<cjd> f = a("calico");
   alf<cjd> g = a("persian");
   alf<cjd> h = a("ragdoll");
   alf<cjd> i = a("white");
   alf<cjd> j = a("jellie");
   alf<cjd> k = a("all_black");

   private static alf<cjd> a(String $$0) {
      return alf.a(mh.aH, alg.b($$0));
   }

   static void a(qh<cjd> $$0) {
      jg<ern> $$1 = $$0.a(mh.be);
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
      a($$0, k, "entity/cat/all_black", new ctt(List.of(new ctp.a<>(new ctu($$1.b(axn.o)), 1), new ctp.a<>(new cto(cw.c.b(0.9)), 0))));
   }

   private static void a(qh<cjd> $$0, alf<cjd> $$1, String $$2) {
      a($$0, $$1, $$2, ctt.a(0));
   }

   private static void a(qh<cjd> $$0, alf<cjd> $$1, String $$2, ctt $$3) {
      $$0.a($$1, new cjd(new iw(alg.b($$2)), $$3));
   }

   static Optional<jf.c<cjd>> a(azv $$0, jt $$1, cts $$2) {
      return ctp.a($$1.f(mh.aH).c(), jf::a, $$0, $$2);
   }
}
