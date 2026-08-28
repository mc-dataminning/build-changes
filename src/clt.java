import java.util.Optional;

public class clt {
   public static final aly<cls> a = a("kebab");
   public static final aly<cls> b = a("aztec");
   public static final aly<cls> c = a("alban");
   public static final aly<cls> d = a("aztec2");
   public static final aly<cls> e = a("bomb");
   public static final aly<cls> f = a("plant");
   public static final aly<cls> g = a("wasteland");
   public static final aly<cls> h = a("pool");
   public static final aly<cls> i = a("courbet");
   public static final aly<cls> j = a("sea");
   public static final aly<cls> k = a("sunset");
   public static final aly<cls> l = a("creebet");
   public static final aly<cls> m = a("wanderer");
   public static final aly<cls> n = a("graham");
   public static final aly<cls> o = a("match");
   public static final aly<cls> p = a("bust");
   public static final aly<cls> q = a("stage");
   public static final aly<cls> r = a("void");
   public static final aly<cls> s = a("skull_and_roses");
   public static final aly<cls> t = a("wither");
   public static final aly<cls> u = a("fighters");
   public static final aly<cls> v = a("pointer");
   public static final aly<cls> w = a("pigscene");
   public static final aly<cls> x = a("burning_skull");
   public static final aly<cls> y = a("skeleton");
   public static final aly<cls> z = a("donkey_kong");
   public static final aly<cls> A = a("earth");
   public static final aly<cls> B = a("wind");
   public static final aly<cls> C = a("water");
   public static final aly<cls> D = a("fire");
   public static final aly<cls> E = a("baroque");
   public static final aly<cls> F = a("humble");
   public static final aly<cls> G = a("meditative");
   public static final aly<cls> H = a("prairie_ride");
   public static final aly<cls> I = a("unpacked");
   public static final aly<cls> J = a("backyard");
   public static final aly<cls> K = a("bouquet");
   public static final aly<cls> L = a("cavebird");
   public static final aly<cls> M = a("changing");
   public static final aly<cls> N = a("cotan");
   public static final aly<cls> O = a("endboss");
   public static final aly<cls> P = a("fern");
   public static final aly<cls> Q = a("finding");
   public static final aly<cls> R = a("lowmist");
   public static final aly<cls> S = a("orb");
   public static final aly<cls> T = a("owlemons");
   public static final aly<cls> U = a("passage");
   public static final aly<cls> V = a("pond");
   public static final aly<cls> W = a("sunflowers");
   public static final aly<cls> X = a("tides");

   public static void a(rk<cls> $$0) {
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

   private static void a(rk<cls> $$0, aly<cls> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(rk<cls> $$0, aly<cls> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new cls(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(xv.c($$1.a().c("painting", "title")).a(n.o)),
            $$4 ? Optional.of(xv.c($$1.a().c("painting", "author")).a(n.h)) : Optional.empty()
         )
      );
   }

   private static aly<cls> a(String $$0) {
      return aly.a(mb.X, alz.b($$0));
   }
}
