import java.util.Optional;

public class cok {
   public static final alq<coj> a = a("kebab");
   public static final alq<coj> b = a("aztec");
   public static final alq<coj> c = a("alban");
   public static final alq<coj> d = a("aztec2");
   public static final alq<coj> e = a("bomb");
   public static final alq<coj> f = a("plant");
   public static final alq<coj> g = a("wasteland");
   public static final alq<coj> h = a("pool");
   public static final alq<coj> i = a("courbet");
   public static final alq<coj> j = a("sea");
   public static final alq<coj> k = a("sunset");
   public static final alq<coj> l = a("creebet");
   public static final alq<coj> m = a("wanderer");
   public static final alq<coj> n = a("graham");
   public static final alq<coj> o = a("match");
   public static final alq<coj> p = a("bust");
   public static final alq<coj> q = a("stage");
   public static final alq<coj> r = a("void");
   public static final alq<coj> s = a("skull_and_roses");
   public static final alq<coj> t = a("wither");
   public static final alq<coj> u = a("fighters");
   public static final alq<coj> v = a("pointer");
   public static final alq<coj> w = a("pigscene");
   public static final alq<coj> x = a("burning_skull");
   public static final alq<coj> y = a("skeleton");
   public static final alq<coj> z = a("donkey_kong");
   public static final alq<coj> A = a("earth");
   public static final alq<coj> B = a("wind");
   public static final alq<coj> C = a("water");
   public static final alq<coj> D = a("fire");
   public static final alq<coj> E = a("baroque");
   public static final alq<coj> F = a("humble");
   public static final alq<coj> G = a("meditative");
   public static final alq<coj> H = a("prairie_ride");
   public static final alq<coj> I = a("unpacked");
   public static final alq<coj> J = a("backyard");
   public static final alq<coj> K = a("bouquet");
   public static final alq<coj> L = a("cavebird");
   public static final alq<coj> M = a("changing");
   public static final alq<coj> N = a("cotan");
   public static final alq<coj> O = a("endboss");
   public static final alq<coj> P = a("fern");
   public static final alq<coj> Q = a("finding");
   public static final alq<coj> R = a("lowmist");
   public static final alq<coj> S = a("orb");
   public static final alq<coj> T = a("owlemons");
   public static final alq<coj> U = a("passage");
   public static final alq<coj> V = a("pond");
   public static final alq<coj> W = a("sunflowers");
   public static final alq<coj> X = a("tides");

   public static void a(qi<coj> $$0) {
      a($$0, a, 1, 1);
      a($$0, b, 1, 1);
      a($$0, c, 1, 1);
      a($$0, d, 1, 1);
      a($$0, e, 1, 1);
      a($$0, f, 1, 1);
      a($$0, g, 1, 1);
      a($$0, h, 2, 1);
      a($$0, i, 2, 1);
      a($$0, j, 2, 1);
      a($$0, k, 2, 1);
      a($$0, l, 2, 1);
      a($$0, m, 1, 2);
      a($$0, n, 1, 2);
      a($$0, o, 2, 2);
      a($$0, p, 2, 2);
      a($$0, q, 2, 2);
      a($$0, r, 2, 2);
      a($$0, s, 2, 2);
      a($$0, t, 2, 2, false);
      a($$0, u, 4, 2);
      a($$0, v, 4, 4);
      a($$0, w, 4, 4);
      a($$0, x, 4, 4);
      a($$0, y, 4, 3);
      a($$0, A, 2, 2, false);
      a($$0, B, 2, 2, false);
      a($$0, C, 2, 2, false);
      a($$0, D, 2, 2, false);
      a($$0, z, 4, 3);
      a($$0, E, 2, 2);
      a($$0, F, 2, 2);
      a($$0, G, 1, 1);
      a($$0, H, 1, 2);
      a($$0, I, 4, 4);
      a($$0, J, 3, 4);
      a($$0, K, 3, 3);
      a($$0, L, 3, 3);
      a($$0, M, 4, 2);
      a($$0, N, 3, 3);
      a($$0, O, 3, 3);
      a($$0, P, 3, 3);
      a($$0, Q, 4, 2);
      a($$0, R, 4, 2);
      a($$0, S, 4, 4);
      a($$0, T, 3, 3);
      a($$0, U, 4, 2);
      a($$0, V, 3, 4);
      a($$0, W, 3, 3);
      a($$0, X, 3, 3);
   }

   private static void a(qi<coj> $$0, alq<coj> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(qi<coj> $$0, alq<coj> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new coj(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(xg.c($$1.a().c("painting", "title")).a(o.o)),
            $$4 ? Optional.of(xg.c($$1.a().c("painting", "author")).a(o.h)) : Optional.empty()
         )
      );
   }

   private static alq<coj> a(String $$0) {
      return alq.a(mi.aZ, alr.b($$0));
   }
}
