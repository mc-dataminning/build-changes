import java.util.Optional;

public class cno {
   public static final alf<cnn> a = a("kebab");
   public static final alf<cnn> b = a("aztec");
   public static final alf<cnn> c = a("alban");
   public static final alf<cnn> d = a("aztec2");
   public static final alf<cnn> e = a("bomb");
   public static final alf<cnn> f = a("plant");
   public static final alf<cnn> g = a("wasteland");
   public static final alf<cnn> h = a("pool");
   public static final alf<cnn> i = a("courbet");
   public static final alf<cnn> j = a("sea");
   public static final alf<cnn> k = a("sunset");
   public static final alf<cnn> l = a("creebet");
   public static final alf<cnn> m = a("wanderer");
   public static final alf<cnn> n = a("graham");
   public static final alf<cnn> o = a("match");
   public static final alf<cnn> p = a("bust");
   public static final alf<cnn> q = a("stage");
   public static final alf<cnn> r = a("void");
   public static final alf<cnn> s = a("skull_and_roses");
   public static final alf<cnn> t = a("wither");
   public static final alf<cnn> u = a("fighters");
   public static final alf<cnn> v = a("pointer");
   public static final alf<cnn> w = a("pigscene");
   public static final alf<cnn> x = a("burning_skull");
   public static final alf<cnn> y = a("skeleton");
   public static final alf<cnn> z = a("donkey_kong");
   public static final alf<cnn> A = a("earth");
   public static final alf<cnn> B = a("wind");
   public static final alf<cnn> C = a("water");
   public static final alf<cnn> D = a("fire");
   public static final alf<cnn> E = a("baroque");
   public static final alf<cnn> F = a("humble");
   public static final alf<cnn> G = a("meditative");
   public static final alf<cnn> H = a("prairie_ride");
   public static final alf<cnn> I = a("unpacked");
   public static final alf<cnn> J = a("backyard");
   public static final alf<cnn> K = a("bouquet");
   public static final alf<cnn> L = a("cavebird");
   public static final alf<cnn> M = a("changing");
   public static final alf<cnn> N = a("cotan");
   public static final alf<cnn> O = a("endboss");
   public static final alf<cnn> P = a("fern");
   public static final alf<cnn> Q = a("finding");
   public static final alf<cnn> R = a("lowmist");
   public static final alf<cnn> S = a("orb");
   public static final alf<cnn> T = a("owlemons");
   public static final alf<cnn> U = a("passage");
   public static final alf<cnn> V = a("pond");
   public static final alf<cnn> W = a("sunflowers");
   public static final alf<cnn> X = a("tides");

   public static void a(qh<cnn> $$0) {
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

   private static void a(qh<cnn> $$0, alf<cnn> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(qh<cnn> $$0, alf<cnn> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new cnn(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(wy.c($$1.a().c("painting", "title")).a(o.o)),
            $$4 ? Optional.of(wy.c($$1.a().c("painting", "author")).a(o.h)) : Optional.empty()
         )
      );
   }

   private static alf<cnn> a(String $$0) {
      return alf.a(mh.aZ, alg.b($$0));
   }
}
