import java.util.Optional;

public class cnl {
   public static final alf<cnk> a = a("kebab");
   public static final alf<cnk> b = a("aztec");
   public static final alf<cnk> c = a("alban");
   public static final alf<cnk> d = a("aztec2");
   public static final alf<cnk> e = a("bomb");
   public static final alf<cnk> f = a("plant");
   public static final alf<cnk> g = a("wasteland");
   public static final alf<cnk> h = a("pool");
   public static final alf<cnk> i = a("courbet");
   public static final alf<cnk> j = a("sea");
   public static final alf<cnk> k = a("sunset");
   public static final alf<cnk> l = a("creebet");
   public static final alf<cnk> m = a("wanderer");
   public static final alf<cnk> n = a("graham");
   public static final alf<cnk> o = a("match");
   public static final alf<cnk> p = a("bust");
   public static final alf<cnk> q = a("stage");
   public static final alf<cnk> r = a("void");
   public static final alf<cnk> s = a("skull_and_roses");
   public static final alf<cnk> t = a("wither");
   public static final alf<cnk> u = a("fighters");
   public static final alf<cnk> v = a("pointer");
   public static final alf<cnk> w = a("pigscene");
   public static final alf<cnk> x = a("burning_skull");
   public static final alf<cnk> y = a("skeleton");
   public static final alf<cnk> z = a("donkey_kong");
   public static final alf<cnk> A = a("earth");
   public static final alf<cnk> B = a("wind");
   public static final alf<cnk> C = a("water");
   public static final alf<cnk> D = a("fire");
   public static final alf<cnk> E = a("baroque");
   public static final alf<cnk> F = a("humble");
   public static final alf<cnk> G = a("meditative");
   public static final alf<cnk> H = a("prairie_ride");
   public static final alf<cnk> I = a("unpacked");
   public static final alf<cnk> J = a("backyard");
   public static final alf<cnk> K = a("bouquet");
   public static final alf<cnk> L = a("cavebird");
   public static final alf<cnk> M = a("changing");
   public static final alf<cnk> N = a("cotan");
   public static final alf<cnk> O = a("endboss");
   public static final alf<cnk> P = a("fern");
   public static final alf<cnk> Q = a("finding");
   public static final alf<cnk> R = a("lowmist");
   public static final alf<cnk> S = a("orb");
   public static final alf<cnk> T = a("owlemons");
   public static final alf<cnk> U = a("passage");
   public static final alf<cnk> V = a("pond");
   public static final alf<cnk> W = a("sunflowers");
   public static final alf<cnk> X = a("tides");

   public static void a(qh<cnk> $$0) {
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

   private static void a(qh<cnk> $$0, alf<cnk> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(qh<cnk> $$0, alf<cnk> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new cnk(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(wy.c($$1.a().c("painting", "title")).a(o.o)),
            $$4 ? Optional.of(wy.c($$1.a().c("painting", "author")).a(o.h)) : Optional.empty()
         )
      );
   }

   private static alf<cnk> a(String $$0) {
      return alf.a(mh.aZ, alg.b($$0));
   }
}
