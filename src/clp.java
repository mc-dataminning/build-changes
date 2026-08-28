import java.util.Optional;

public class clp {
   public static final alo<clo> a = a("kebab");
   public static final alo<clo> b = a("aztec");
   public static final alo<clo> c = a("alban");
   public static final alo<clo> d = a("aztec2");
   public static final alo<clo> e = a("bomb");
   public static final alo<clo> f = a("plant");
   public static final alo<clo> g = a("wasteland");
   public static final alo<clo> h = a("pool");
   public static final alo<clo> i = a("courbet");
   public static final alo<clo> j = a("sea");
   public static final alo<clo> k = a("sunset");
   public static final alo<clo> l = a("creebet");
   public static final alo<clo> m = a("wanderer");
   public static final alo<clo> n = a("graham");
   public static final alo<clo> o = a("match");
   public static final alo<clo> p = a("bust");
   public static final alo<clo> q = a("stage");
   public static final alo<clo> r = a("void");
   public static final alo<clo> s = a("skull_and_roses");
   public static final alo<clo> t = a("wither");
   public static final alo<clo> u = a("fighters");
   public static final alo<clo> v = a("pointer");
   public static final alo<clo> w = a("pigscene");
   public static final alo<clo> x = a("burning_skull");
   public static final alo<clo> y = a("skeleton");
   public static final alo<clo> z = a("donkey_kong");
   public static final alo<clo> A = a("earth");
   public static final alo<clo> B = a("wind");
   public static final alo<clo> C = a("water");
   public static final alo<clo> D = a("fire");
   public static final alo<clo> E = a("baroque");
   public static final alo<clo> F = a("humble");
   public static final alo<clo> G = a("meditative");
   public static final alo<clo> H = a("prairie_ride");
   public static final alo<clo> I = a("unpacked");
   public static final alo<clo> J = a("backyard");
   public static final alo<clo> K = a("bouquet");
   public static final alo<clo> L = a("cavebird");
   public static final alo<clo> M = a("changing");
   public static final alo<clo> N = a("cotan");
   public static final alo<clo> O = a("endboss");
   public static final alo<clo> P = a("fern");
   public static final alo<clo> Q = a("finding");
   public static final alo<clo> R = a("lowmist");
   public static final alo<clo> S = a("orb");
   public static final alo<clo> T = a("owlemons");
   public static final alo<clo> U = a("passage");
   public static final alo<clo> V = a("pond");
   public static final alo<clo> W = a("sunflowers");
   public static final alo<clo> X = a("tides");

   public static void a(ra<clo> $$0) {
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

   private static void a(ra<clo> $$0, alo<clo> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(ra<clo> $$0, alo<clo> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new clo(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(xk.c($$1.a().c("painting", "title")).a(n.o)),
            $$4 ? Optional.of(xk.c($$1.a().c("painting", "author")).a(n.h)) : Optional.empty()
         )
      );
   }

   private static alo<clo> a(String $$0) {
      return alo.a(mb.X, alp.b($$0));
   }
}
