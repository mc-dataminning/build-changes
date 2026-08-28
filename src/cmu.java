import java.util.Optional;

public class cmu {
   public static final ald<cmt> a = a("kebab");
   public static final ald<cmt> b = a("aztec");
   public static final ald<cmt> c = a("alban");
   public static final ald<cmt> d = a("aztec2");
   public static final ald<cmt> e = a("bomb");
   public static final ald<cmt> f = a("plant");
   public static final ald<cmt> g = a("wasteland");
   public static final ald<cmt> h = a("pool");
   public static final ald<cmt> i = a("courbet");
   public static final ald<cmt> j = a("sea");
   public static final ald<cmt> k = a("sunset");
   public static final ald<cmt> l = a("creebet");
   public static final ald<cmt> m = a("wanderer");
   public static final ald<cmt> n = a("graham");
   public static final ald<cmt> o = a("match");
   public static final ald<cmt> p = a("bust");
   public static final ald<cmt> q = a("stage");
   public static final ald<cmt> r = a("void");
   public static final ald<cmt> s = a("skull_and_roses");
   public static final ald<cmt> t = a("wither");
   public static final ald<cmt> u = a("fighters");
   public static final ald<cmt> v = a("pointer");
   public static final ald<cmt> w = a("pigscene");
   public static final ald<cmt> x = a("burning_skull");
   public static final ald<cmt> y = a("skeleton");
   public static final ald<cmt> z = a("donkey_kong");
   public static final ald<cmt> A = a("earth");
   public static final ald<cmt> B = a("wind");
   public static final ald<cmt> C = a("water");
   public static final ald<cmt> D = a("fire");
   public static final ald<cmt> E = a("baroque");
   public static final ald<cmt> F = a("humble");
   public static final ald<cmt> G = a("meditative");
   public static final ald<cmt> H = a("prairie_ride");
   public static final ald<cmt> I = a("unpacked");
   public static final ald<cmt> J = a("backyard");
   public static final ald<cmt> K = a("bouquet");
   public static final ald<cmt> L = a("cavebird");
   public static final ald<cmt> M = a("changing");
   public static final ald<cmt> N = a("cotan");
   public static final ald<cmt> O = a("endboss");
   public static final ald<cmt> P = a("fern");
   public static final ald<cmt> Q = a("finding");
   public static final ald<cmt> R = a("lowmist");
   public static final ald<cmt> S = a("orb");
   public static final ald<cmt> T = a("owlemons");
   public static final ald<cmt> U = a("passage");
   public static final ald<cmt> V = a("pond");
   public static final ald<cmt> W = a("sunflowers");
   public static final ald<cmt> X = a("tides");

   public static void a(qh<cmt> $$0) {
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

   private static void a(qh<cmt> $$0, ald<cmt> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(qh<cmt> $$0, ald<cmt> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new cmt(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(ww.c($$1.a().c("painting", "title")).a(n.o)),
            $$4 ? Optional.of(ww.c($$1.a().c("painting", "author")).a(n.h)) : Optional.empty()
         )
      );
   }

   private static ald<cmt> a(String $$0) {
      return ald.a(mg.aX, ale.b($$0));
   }
}
