import java.util.List;
import java.util.Optional;

public interface cjp {
   alh<cjo> a = a("tabby");
   alh<cjo> b = a("black");
   alh<cjo> c = a("red");
   alh<cjo> d = a("siamese");
   alh<cjo> e = a("british_shorthair");
   alh<cjo> f = a("calico");
   alh<cjo> g = a("persian");
   alh<cjo> h = a("ragdoll");
   alh<cjo> i = a("white");
   alh<cjo> j = a("jellie");
   alh<cjo> k = a("all_black");

   private static alh<cjo> a(String $$0) {
      return alh.a(mh.aH, ali.b($$0));
   }

   static void a(qh<cjo> $$0) {
      jg<esb> $$1 = $$0.a(mh.be);
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
      a($$0, k, "entity/cat/all_black", new cue(List.of(new cua.a<>(new cuf($$1.b(axp.o)), 1), new cua.a<>(new ctz(cw.c.b(0.9)), 0))));
   }

   private static void a(qh<cjo> $$0, alh<cjo> $$1, String $$2) {
      a($$0, $$1, $$2, cue.a(0));
   }

   private static void a(qh<cjo> $$0, alh<cjo> $$1, String $$2, cue $$3) {
      $$0.a($$1, new cjo(new iw(ali.b($$2)), $$3));
   }

   static Optional<jf.c<cjo>> a(azx $$0, jt $$1, cud $$2) {
      return cua.a($$1.f(mh.aH).c(), jf::a, $$0, $$2);
   }
}
