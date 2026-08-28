import java.util.Optional;

public class ckw {
   public static final alk<ckv> a = a("kebab");
   public static final alk<ckv> b = a("aztec");
   public static final alk<ckv> c = a("alban");
   public static final alk<ckv> d = a("aztec2");
   public static final alk<ckv> e = a("bomb");
   public static final alk<ckv> f = a("plant");
   public static final alk<ckv> g = a("wasteland");
   public static final alk<ckv> h = a("pool");
   public static final alk<ckv> i = a("courbet");
   public static final alk<ckv> j = a("sea");
   public static final alk<ckv> k = a("sunset");
   public static final alk<ckv> l = a("creebet");
   public static final alk<ckv> m = a("wanderer");
   public static final alk<ckv> n = a("graham");
   public static final alk<ckv> o = a("match");
   public static final alk<ckv> p = a("bust");
   public static final alk<ckv> q = a("stage");
   public static final alk<ckv> r = a("void");
   public static final alk<ckv> s = a("skull_and_roses");
   public static final alk<ckv> t = a("wither");
   public static final alk<ckv> u = a("fighters");
   public static final alk<ckv> v = a("pointer");
   public static final alk<ckv> w = a("pigscene");
   public static final alk<ckv> x = a("burning_skull");
   public static final alk<ckv> y = a("skeleton");
   public static final alk<ckv> z = a("donkey_kong");
   public static final alk<ckv> A = a("earth");
   public static final alk<ckv> B = a("wind");
   public static final alk<ckv> C = a("water");
   public static final alk<ckv> D = a("fire");
   public static final alk<ckv> E = a("baroque");
   public static final alk<ckv> F = a("humble");
   public static final alk<ckv> G = a("meditative");
   public static final alk<ckv> H = a("prairie_ride");
   public static final alk<ckv> I = a("unpacked");
   public static final alk<ckv> J = a("backyard");
   public static final alk<ckv> K = a("bouquet");
   public static final alk<ckv> L = a("cavebird");
   public static final alk<ckv> M = a("changing");
   public static final alk<ckv> N = a("cotan");
   public static final alk<ckv> O = a("endboss");
   public static final alk<ckv> P = a("fern");
   public static final alk<ckv> Q = a("finding");
   public static final alk<ckv> R = a("lowmist");
   public static final alk<ckv> S = a("orb");
   public static final alk<ckv> T = a("owlemons");
   public static final alk<ckv> U = a("passage");
   public static final alk<ckv> V = a("pond");
   public static final alk<ckv> W = a("sunflowers");
   public static final alk<ckv> X = a("tides");

   public static void a(rb<ckv> $$0) {
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

   private static void a(rb<ckv> $$0, alk<ckv> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(rb<ckv> $$0, alk<ckv> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new ckv(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(xl.c($$1.a().c("painting", "title")).a(n.o)),
            $$4 ? Optional.of(xl.c($$1.a().c("painting", "author")).a(n.h)) : Optional.empty()
         )
      );
   }

   private static alk<ckv> a(String $$0) {
      return alk.a(ma.X, all.b($$0));
   }
}
