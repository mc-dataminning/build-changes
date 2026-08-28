import java.util.Optional;

public class cky {
   public static final akt<ckx> a = a("kebab");
   public static final akt<ckx> b = a("aztec");
   public static final akt<ckx> c = a("alban");
   public static final akt<ckx> d = a("aztec2");
   public static final akt<ckx> e = a("bomb");
   public static final akt<ckx> f = a("plant");
   public static final akt<ckx> g = a("wasteland");
   public static final akt<ckx> h = a("pool");
   public static final akt<ckx> i = a("courbet");
   public static final akt<ckx> j = a("sea");
   public static final akt<ckx> k = a("sunset");
   public static final akt<ckx> l = a("creebet");
   public static final akt<ckx> m = a("wanderer");
   public static final akt<ckx> n = a("graham");
   public static final akt<ckx> o = a("match");
   public static final akt<ckx> p = a("bust");
   public static final akt<ckx> q = a("stage");
   public static final akt<ckx> r = a("void");
   public static final akt<ckx> s = a("skull_and_roses");
   public static final akt<ckx> t = a("wither");
   public static final akt<ckx> u = a("fighters");
   public static final akt<ckx> v = a("pointer");
   public static final akt<ckx> w = a("pigscene");
   public static final akt<ckx> x = a("burning_skull");
   public static final akt<ckx> y = a("skeleton");
   public static final akt<ckx> z = a("donkey_kong");
   public static final akt<ckx> A = a("earth");
   public static final akt<ckx> B = a("wind");
   public static final akt<ckx> C = a("water");
   public static final akt<ckx> D = a("fire");
   public static final akt<ckx> E = a("baroque");
   public static final akt<ckx> F = a("humble");
   public static final akt<ckx> G = a("meditative");
   public static final akt<ckx> H = a("prairie_ride");
   public static final akt<ckx> I = a("unpacked");
   public static final akt<ckx> J = a("backyard");
   public static final akt<ckx> K = a("bouquet");
   public static final akt<ckx> L = a("cavebird");
   public static final akt<ckx> M = a("changing");
   public static final akt<ckx> N = a("cotan");
   public static final akt<ckx> O = a("endboss");
   public static final akt<ckx> P = a("fern");
   public static final akt<ckx> Q = a("finding");
   public static final akt<ckx> R = a("lowmist");
   public static final akt<ckx> S = a("orb");
   public static final akt<ckx> T = a("owlemons");
   public static final akt<ckx> U = a("passage");
   public static final akt<ckx> V = a("pond");
   public static final akt<ckx> W = a("sunflowers");
   public static final akt<ckx> X = a("tides");

   public static void a(qe<ckx> $$0) {
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

   private static void a(qe<ckx> $$0, akt<ckx> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(qe<ckx> $$0, akt<ckx> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new ckx(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(wo.c($$1.a().c("painting", "title")).a(n.o)),
            $$4 ? Optional.of(wo.c($$1.a().c("painting", "author")).a(n.h)) : Optional.empty()
         )
      );
   }

   private static akt<ckx> a(String $$0) {
      return akt.a(mc.X, aku.b($$0));
   }
}
