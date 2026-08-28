import java.util.Optional;

public class cna {
   public static final alf<cmz> a = a("kebab");
   public static final alf<cmz> b = a("aztec");
   public static final alf<cmz> c = a("alban");
   public static final alf<cmz> d = a("aztec2");
   public static final alf<cmz> e = a("bomb");
   public static final alf<cmz> f = a("plant");
   public static final alf<cmz> g = a("wasteland");
   public static final alf<cmz> h = a("pool");
   public static final alf<cmz> i = a("courbet");
   public static final alf<cmz> j = a("sea");
   public static final alf<cmz> k = a("sunset");
   public static final alf<cmz> l = a("creebet");
   public static final alf<cmz> m = a("wanderer");
   public static final alf<cmz> n = a("graham");
   public static final alf<cmz> o = a("match");
   public static final alf<cmz> p = a("bust");
   public static final alf<cmz> q = a("stage");
   public static final alf<cmz> r = a("void");
   public static final alf<cmz> s = a("skull_and_roses");
   public static final alf<cmz> t = a("wither");
   public static final alf<cmz> u = a("fighters");
   public static final alf<cmz> v = a("pointer");
   public static final alf<cmz> w = a("pigscene");
   public static final alf<cmz> x = a("burning_skull");
   public static final alf<cmz> y = a("skeleton");
   public static final alf<cmz> z = a("donkey_kong");
   public static final alf<cmz> A = a("earth");
   public static final alf<cmz> B = a("wind");
   public static final alf<cmz> C = a("water");
   public static final alf<cmz> D = a("fire");
   public static final alf<cmz> E = a("baroque");
   public static final alf<cmz> F = a("humble");
   public static final alf<cmz> G = a("meditative");
   public static final alf<cmz> H = a("prairie_ride");
   public static final alf<cmz> I = a("unpacked");
   public static final alf<cmz> J = a("backyard");
   public static final alf<cmz> K = a("bouquet");
   public static final alf<cmz> L = a("cavebird");
   public static final alf<cmz> M = a("changing");
   public static final alf<cmz> N = a("cotan");
   public static final alf<cmz> O = a("endboss");
   public static final alf<cmz> P = a("fern");
   public static final alf<cmz> Q = a("finding");
   public static final alf<cmz> R = a("lowmist");
   public static final alf<cmz> S = a("orb");
   public static final alf<cmz> T = a("owlemons");
   public static final alf<cmz> U = a("passage");
   public static final alf<cmz> V = a("pond");
   public static final alf<cmz> W = a("sunflowers");
   public static final alf<cmz> X = a("tides");

   public static void a(qh<cmz> $$0) {
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

   private static void a(qh<cmz> $$0, alf<cmz> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(qh<cmz> $$0, alf<cmz> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new cmz(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(wy.c($$1.a().c("painting", "title")).a(n.o)),
            $$4 ? Optional.of(wy.c($$1.a().c("painting", "author")).a(n.h)) : Optional.empty()
         )
      );
   }

   private static alf<cmz> a(String $$0) {
      return alf.a(mg.aY, alg.b($$0));
   }
}
