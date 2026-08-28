import java.util.Optional;

public class cla {
   public static final aku<ckz> a = a("kebab");
   public static final aku<ckz> b = a("aztec");
   public static final aku<ckz> c = a("alban");
   public static final aku<ckz> d = a("aztec2");
   public static final aku<ckz> e = a("bomb");
   public static final aku<ckz> f = a("plant");
   public static final aku<ckz> g = a("wasteland");
   public static final aku<ckz> h = a("pool");
   public static final aku<ckz> i = a("courbet");
   public static final aku<ckz> j = a("sea");
   public static final aku<ckz> k = a("sunset");
   public static final aku<ckz> l = a("creebet");
   public static final aku<ckz> m = a("wanderer");
   public static final aku<ckz> n = a("graham");
   public static final aku<ckz> o = a("match");
   public static final aku<ckz> p = a("bust");
   public static final aku<ckz> q = a("stage");
   public static final aku<ckz> r = a("void");
   public static final aku<ckz> s = a("skull_and_roses");
   public static final aku<ckz> t = a("wither");
   public static final aku<ckz> u = a("fighters");
   public static final aku<ckz> v = a("pointer");
   public static final aku<ckz> w = a("pigscene");
   public static final aku<ckz> x = a("burning_skull");
   public static final aku<ckz> y = a("skeleton");
   public static final aku<ckz> z = a("donkey_kong");
   public static final aku<ckz> A = a("earth");
   public static final aku<ckz> B = a("wind");
   public static final aku<ckz> C = a("water");
   public static final aku<ckz> D = a("fire");
   public static final aku<ckz> E = a("baroque");
   public static final aku<ckz> F = a("humble");
   public static final aku<ckz> G = a("meditative");
   public static final aku<ckz> H = a("prairie_ride");
   public static final aku<ckz> I = a("unpacked");
   public static final aku<ckz> J = a("backyard");
   public static final aku<ckz> K = a("bouquet");
   public static final aku<ckz> L = a("cavebird");
   public static final aku<ckz> M = a("changing");
   public static final aku<ckz> N = a("cotan");
   public static final aku<ckz> O = a("endboss");
   public static final aku<ckz> P = a("fern");
   public static final aku<ckz> Q = a("finding");
   public static final aku<ckz> R = a("lowmist");
   public static final aku<ckz> S = a("orb");
   public static final aku<ckz> T = a("owlemons");
   public static final aku<ckz> U = a("passage");
   public static final aku<ckz> V = a("pond");
   public static final aku<ckz> W = a("sunflowers");
   public static final aku<ckz> X = a("tides");

   public static void a(qe<ckz> $$0) {
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

   private static void a(qe<ckz> $$0, aku<ckz> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(qe<ckz> $$0, aku<ckz> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new ckz(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(wp.c($$1.a().c("painting", "title")).a(n.o)),
            $$4 ? Optional.of(wp.c($$1.a().c("painting", "author")).a(n.h)) : Optional.empty()
         )
      );
   }

   private static aku<ckz> a(String $$0) {
      return aku.a(mc.X, akv.b($$0));
   }
}
