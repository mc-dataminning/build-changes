import java.util.Optional;

public class ckn {
   public static final alg<ckm> a = a("kebab");
   public static final alg<ckm> b = a("aztec");
   public static final alg<ckm> c = a("alban");
   public static final alg<ckm> d = a("aztec2");
   public static final alg<ckm> e = a("bomb");
   public static final alg<ckm> f = a("plant");
   public static final alg<ckm> g = a("wasteland");
   public static final alg<ckm> h = a("pool");
   public static final alg<ckm> i = a("courbet");
   public static final alg<ckm> j = a("sea");
   public static final alg<ckm> k = a("sunset");
   public static final alg<ckm> l = a("creebet");
   public static final alg<ckm> m = a("wanderer");
   public static final alg<ckm> n = a("graham");
   public static final alg<ckm> o = a("match");
   public static final alg<ckm> p = a("bust");
   public static final alg<ckm> q = a("stage");
   public static final alg<ckm> r = a("void");
   public static final alg<ckm> s = a("skull_and_roses");
   public static final alg<ckm> t = a("wither");
   public static final alg<ckm> u = a("fighters");
   public static final alg<ckm> v = a("pointer");
   public static final alg<ckm> w = a("pigscene");
   public static final alg<ckm> x = a("burning_skull");
   public static final alg<ckm> y = a("skeleton");
   public static final alg<ckm> z = a("donkey_kong");
   public static final alg<ckm> A = a("earth");
   public static final alg<ckm> B = a("wind");
   public static final alg<ckm> C = a("water");
   public static final alg<ckm> D = a("fire");
   public static final alg<ckm> E = a("baroque");
   public static final alg<ckm> F = a("humble");
   public static final alg<ckm> G = a("meditative");
   public static final alg<ckm> H = a("prairie_ride");
   public static final alg<ckm> I = a("unpacked");
   public static final alg<ckm> J = a("backyard");
   public static final alg<ckm> K = a("bouquet");
   public static final alg<ckm> L = a("cavebird");
   public static final alg<ckm> M = a("changing");
   public static final alg<ckm> N = a("cotan");
   public static final alg<ckm> O = a("endboss");
   public static final alg<ckm> P = a("fern");
   public static final alg<ckm> Q = a("finding");
   public static final alg<ckm> R = a("lowmist");
   public static final alg<ckm> S = a("orb");
   public static final alg<ckm> T = a("owlemons");
   public static final alg<ckm> U = a("passage");
   public static final alg<ckm> V = a("pond");
   public static final alg<ckm> W = a("sunflowers");
   public static final alg<ckm> X = a("tides");

   public static void a(qx<ckm> $$0) {
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

   private static void a(qx<ckm> $$0, alg<ckm> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(qx<ckm> $$0, alg<ckm> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new ckm(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(xh.c($$1.a().c("painting", "title")).a(n.o)),
            $$4 ? Optional.of(xh.c($$1.a().c("painting", "author")).a(n.h)) : Optional.empty()
         )
      );
   }

   private static alg<ckm> a(String $$0) {
      return alg.a(ly.X, alh.b($$0));
   }
}
