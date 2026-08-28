import java.util.List;
import java.util.Optional;

public interface cka {
   alq<cjz> a = a("tabby");
   alq<cjz> b = a("black");
   alq<cjz> c = a("red");
   alq<cjz> d = a("siamese");
   alq<cjz> e = a("british_shorthair");
   alq<cjz> f = a("calico");
   alq<cjz> g = a("persian");
   alq<cjz> h = a("ragdoll");
   alq<cjz> i = a("white");
   alq<cjz> j = a("jellie");
   alq<cjz> k = a("all_black");

   private static alq<cjz> a(String $$0) {
      return alq.a(mi.aH, alr.b($$0));
   }

   static void a(qi<cjz> $$0) {
      jh<esn> $$1 = $$0.a(mi.be);
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
      a($$0, k, "entity/cat/all_black", new cup(List.of(new cul.a<>(new cuq($$1.b(axy.o)), 1), new cul.a<>(new cuk(cx.c.b(0.9)), 0))));
   }

   private static void a(qi<cjz> $$0, alq<cjz> $$1, String $$2) {
      a($$0, $$1, $$2, cup.a(0));
   }

   private static void a(qi<cjz> $$0, alq<cjz> $$1, String $$2, cup $$3) {
      $$0.a($$1, new cjz(new ix(alr.b($$2)), $$3));
   }

   static Optional<jg.c<cjz>> a(bai $$0, ju $$1, cuo $$2) {
      return cul.a($$1.f(mi.aH).c(), jg::a, $$0, $$2);
   }
}
