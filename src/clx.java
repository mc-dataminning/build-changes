import java.util.Optional;

public class clx {
   public static final aly<clw> a = a("kebab");
   public static final aly<clw> b = a("aztec");
   public static final aly<clw> c = a("alban");
   public static final aly<clw> d = a("aztec2");
   public static final aly<clw> e = a("bomb");
   public static final aly<clw> f = a("plant");
   public static final aly<clw> g = a("wasteland");
   public static final aly<clw> h = a("pool");
   public static final aly<clw> i = a("courbet");
   public static final aly<clw> j = a("sea");
   public static final aly<clw> k = a("sunset");
   public static final aly<clw> l = a("creebet");
   public static final aly<clw> m = a("wanderer");
   public static final aly<clw> n = a("graham");
   public static final aly<clw> o = a("match");
   public static final aly<clw> p = a("bust");
   public static final aly<clw> q = a("stage");
   public static final aly<clw> r = a("void");
   public static final aly<clw> s = a("skull_and_roses");
   public static final aly<clw> t = a("wither");
   public static final aly<clw> u = a("fighters");
   public static final aly<clw> v = a("pointer");
   public static final aly<clw> w = a("pigscene");
   public static final aly<clw> x = a("burning_skull");
   public static final aly<clw> y = a("skeleton");
   public static final aly<clw> z = a("donkey_kong");
   public static final aly<clw> A = a("earth");
   public static final aly<clw> B = a("wind");
   public static final aly<clw> C = a("water");
   public static final aly<clw> D = a("fire");
   public static final aly<clw> E = a("baroque");
   public static final aly<clw> F = a("humble");
   public static final aly<clw> G = a("meditative");
   public static final aly<clw> H = a("prairie_ride");
   public static final aly<clw> I = a("unpacked");
   public static final aly<clw> J = a("backyard");
   public static final aly<clw> K = a("bouquet");
   public static final aly<clw> L = a("cavebird");
   public static final aly<clw> M = a("changing");
   public static final aly<clw> N = a("cotan");
   public static final aly<clw> O = a("endboss");
   public static final aly<clw> P = a("fern");
   public static final aly<clw> Q = a("finding");
   public static final aly<clw> R = a("lowmist");
   public static final aly<clw> S = a("orb");
   public static final aly<clw> T = a("owlemons");
   public static final aly<clw> U = a("passage");
   public static final aly<clw> V = a("pond");
   public static final aly<clw> W = a("sunflowers");
   public static final aly<clw> X = a("tides");

   public static void a(rk<clw> $$0) {
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

   private static void a(rk<clw> $$0, aly<clw> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(rk<clw> $$0, aly<clw> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new clw(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(xv.c($$1.a().c("painting", "title")).a(n.o)),
            $$4 ? Optional.of(xv.c($$1.a().c("painting", "author")).a(n.h)) : Optional.empty()
         )
      );
   }

   private static aly<clw> a(String $$0) {
      return aly.a(mb.X, alz.b($$0));
   }
}
