import java.util.List;
import java.util.Optional;

public interface cjr {
   alj<cjq> a = a("tabby");
   alj<cjq> b = a("black");
   alj<cjq> c = a("red");
   alj<cjq> d = a("siamese");
   alj<cjq> e = a("british_shorthair");
   alj<cjq> f = a("calico");
   alj<cjq> g = a("persian");
   alj<cjq> h = a("ragdoll");
   alj<cjq> i = a("white");
   alj<cjq> j = a("jellie");
   alj<cjq> k = a("all_black");

   private static alj<cjq> a(String $$0) {
      return alj.a(mi.aH, alk.b($$0));
   }

   static void a(qi<cjq> $$0) {
      jh<esd> $$1 = $$0.a(mi.be);
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
      a($$0, k, "entity/cat/all_black", new cug(List.of(new cuc.a<>(new cuh($$1.b(axr.o)), 1), new cuc.a<>(new cub(cx.c.b(0.9)), 0))));
   }

   private static void a(qi<cjq> $$0, alj<cjq> $$1, String $$2) {
      a($$0, $$1, $$2, cug.a(0));
   }

   private static void a(qi<cjq> $$0, alj<cjq> $$1, String $$2, cug $$3) {
      $$0.a($$1, new cjq(new ix(alk.b($$2)), $$3));
   }

   static Optional<jg.c<cjq>> a(azz $$0, ju $$1, cuf $$2) {
      return cuc.a($$1.f(mi.aH).c(), jg::a, $$0, $$2);
   }
}
