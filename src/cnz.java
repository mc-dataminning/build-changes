import java.util.Optional;

public class cnz {
   public static final alh<cny> a = a("kebab");
   public static final alh<cny> b = a("aztec");
   public static final alh<cny> c = a("alban");
   public static final alh<cny> d = a("aztec2");
   public static final alh<cny> e = a("bomb");
   public static final alh<cny> f = a("plant");
   public static final alh<cny> g = a("wasteland");
   public static final alh<cny> h = a("pool");
   public static final alh<cny> i = a("courbet");
   public static final alh<cny> j = a("sea");
   public static final alh<cny> k = a("sunset");
   public static final alh<cny> l = a("creebet");
   public static final alh<cny> m = a("wanderer");
   public static final alh<cny> n = a("graham");
   public static final alh<cny> o = a("match");
   public static final alh<cny> p = a("bust");
   public static final alh<cny> q = a("stage");
   public static final alh<cny> r = a("void");
   public static final alh<cny> s = a("skull_and_roses");
   public static final alh<cny> t = a("wither");
   public static final alh<cny> u = a("fighters");
   public static final alh<cny> v = a("pointer");
   public static final alh<cny> w = a("pigscene");
   public static final alh<cny> x = a("burning_skull");
   public static final alh<cny> y = a("skeleton");
   public static final alh<cny> z = a("donkey_kong");
   public static final alh<cny> A = a("earth");
   public static final alh<cny> B = a("wind");
   public static final alh<cny> C = a("water");
   public static final alh<cny> D = a("fire");
   public static final alh<cny> E = a("baroque");
   public static final alh<cny> F = a("humble");
   public static final alh<cny> G = a("meditative");
   public static final alh<cny> H = a("prairie_ride");
   public static final alh<cny> I = a("unpacked");
   public static final alh<cny> J = a("backyard");
   public static final alh<cny> K = a("bouquet");
   public static final alh<cny> L = a("cavebird");
   public static final alh<cny> M = a("changing");
   public static final alh<cny> N = a("cotan");
   public static final alh<cny> O = a("endboss");
   public static final alh<cny> P = a("fern");
   public static final alh<cny> Q = a("finding");
   public static final alh<cny> R = a("lowmist");
   public static final alh<cny> S = a("orb");
   public static final alh<cny> T = a("owlemons");
   public static final alh<cny> U = a("passage");
   public static final alh<cny> V = a("pond");
   public static final alh<cny> W = a("sunflowers");
   public static final alh<cny> X = a("tides");

   public static void a(qh<cny> $$0) {
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

   private static void a(qh<cny> $$0, alh<cny> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(qh<cny> $$0, alh<cny> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new cny(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(xa.c($$1.a().c("painting", "title")).a(o.o)),
            $$4 ? Optional.of(xa.c($$1.a().c("painting", "author")).a(o.h)) : Optional.empty()
         )
      );
   }

   private static alh<cny> a(String $$0) {
      return alh.a(mh.aZ, ali.b($$0));
   }
}
