import java.util.Optional;

public class ckx {
   public static final akt<ckw> a = a("kebab");
   public static final akt<ckw> b = a("aztec");
   public static final akt<ckw> c = a("alban");
   public static final akt<ckw> d = a("aztec2");
   public static final akt<ckw> e = a("bomb");
   public static final akt<ckw> f = a("plant");
   public static final akt<ckw> g = a("wasteland");
   public static final akt<ckw> h = a("pool");
   public static final akt<ckw> i = a("courbet");
   public static final akt<ckw> j = a("sea");
   public static final akt<ckw> k = a("sunset");
   public static final akt<ckw> l = a("creebet");
   public static final akt<ckw> m = a("wanderer");
   public static final akt<ckw> n = a("graham");
   public static final akt<ckw> o = a("match");
   public static final akt<ckw> p = a("bust");
   public static final akt<ckw> q = a("stage");
   public static final akt<ckw> r = a("void");
   public static final akt<ckw> s = a("skull_and_roses");
   public static final akt<ckw> t = a("wither");
   public static final akt<ckw> u = a("fighters");
   public static final akt<ckw> v = a("pointer");
   public static final akt<ckw> w = a("pigscene");
   public static final akt<ckw> x = a("burning_skull");
   public static final akt<ckw> y = a("skeleton");
   public static final akt<ckw> z = a("donkey_kong");
   public static final akt<ckw> A = a("earth");
   public static final akt<ckw> B = a("wind");
   public static final akt<ckw> C = a("water");
   public static final akt<ckw> D = a("fire");
   public static final akt<ckw> E = a("baroque");
   public static final akt<ckw> F = a("humble");
   public static final akt<ckw> G = a("meditative");
   public static final akt<ckw> H = a("prairie_ride");
   public static final akt<ckw> I = a("unpacked");
   public static final akt<ckw> J = a("backyard");
   public static final akt<ckw> K = a("bouquet");
   public static final akt<ckw> L = a("cavebird");
   public static final akt<ckw> M = a("changing");
   public static final akt<ckw> N = a("cotan");
   public static final akt<ckw> O = a("endboss");
   public static final akt<ckw> P = a("fern");
   public static final akt<ckw> Q = a("finding");
   public static final akt<ckw> R = a("lowmist");
   public static final akt<ckw> S = a("orb");
   public static final akt<ckw> T = a("owlemons");
   public static final akt<ckw> U = a("passage");
   public static final akt<ckw> V = a("pond");
   public static final akt<ckw> W = a("sunflowers");
   public static final akt<ckw> X = a("tides");

   public static void a(qe<ckw> $$0) {
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

   private static void a(qe<ckw> $$0, akt<ckw> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(qe<ckw> $$0, akt<ckw> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new ckw(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(wo.c($$1.a().c("painting", "title")).a(n.o)),
            $$4 ? Optional.of(wo.c($$1.a().c("painting", "author")).a(n.h)) : Optional.empty()
         )
      );
   }

   private static akt<ckw> a(String $$0) {
      return akt.a(mc.X, aku.b($$0));
   }
}
