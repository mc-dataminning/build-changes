import java.util.Optional;

public class cly {
   public static final aly<clx> a = a("kebab");
   public static final aly<clx> b = a("aztec");
   public static final aly<clx> c = a("alban");
   public static final aly<clx> d = a("aztec2");
   public static final aly<clx> e = a("bomb");
   public static final aly<clx> f = a("plant");
   public static final aly<clx> g = a("wasteland");
   public static final aly<clx> h = a("pool");
   public static final aly<clx> i = a("courbet");
   public static final aly<clx> j = a("sea");
   public static final aly<clx> k = a("sunset");
   public static final aly<clx> l = a("creebet");
   public static final aly<clx> m = a("wanderer");
   public static final aly<clx> n = a("graham");
   public static final aly<clx> o = a("match");
   public static final aly<clx> p = a("bust");
   public static final aly<clx> q = a("stage");
   public static final aly<clx> r = a("void");
   public static final aly<clx> s = a("skull_and_roses");
   public static final aly<clx> t = a("wither");
   public static final aly<clx> u = a("fighters");
   public static final aly<clx> v = a("pointer");
   public static final aly<clx> w = a("pigscene");
   public static final aly<clx> x = a("burning_skull");
   public static final aly<clx> y = a("skeleton");
   public static final aly<clx> z = a("donkey_kong");
   public static final aly<clx> A = a("earth");
   public static final aly<clx> B = a("wind");
   public static final aly<clx> C = a("water");
   public static final aly<clx> D = a("fire");
   public static final aly<clx> E = a("baroque");
   public static final aly<clx> F = a("humble");
   public static final aly<clx> G = a("meditative");
   public static final aly<clx> H = a("prairie_ride");
   public static final aly<clx> I = a("unpacked");
   public static final aly<clx> J = a("backyard");
   public static final aly<clx> K = a("bouquet");
   public static final aly<clx> L = a("cavebird");
   public static final aly<clx> M = a("changing");
   public static final aly<clx> N = a("cotan");
   public static final aly<clx> O = a("endboss");
   public static final aly<clx> P = a("fern");
   public static final aly<clx> Q = a("finding");
   public static final aly<clx> R = a("lowmist");
   public static final aly<clx> S = a("orb");
   public static final aly<clx> T = a("owlemons");
   public static final aly<clx> U = a("passage");
   public static final aly<clx> V = a("pond");
   public static final aly<clx> W = a("sunflowers");
   public static final aly<clx> X = a("tides");

   public static void a(rk<clx> $$0) {
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

   private static void a(rk<clx> $$0, aly<clx> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(rk<clx> $$0, aly<clx> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new clx(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(xv.c($$1.a().c("painting", "title")).a(n.o)),
            $$4 ? Optional.of(xv.c($$1.a().c("painting", "author")).a(n.h)) : Optional.empty()
         )
      );
   }

   private static aly<clx> a(String $$0) {
      return aly.a(mb.X, alz.b($$0));
   }
}
