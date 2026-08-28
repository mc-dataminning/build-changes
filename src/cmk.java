import java.util.Optional;

public class cmk {
   public static final alc<cmj> a = a("kebab");
   public static final alc<cmj> b = a("aztec");
   public static final alc<cmj> c = a("alban");
   public static final alc<cmj> d = a("aztec2");
   public static final alc<cmj> e = a("bomb");
   public static final alc<cmj> f = a("plant");
   public static final alc<cmj> g = a("wasteland");
   public static final alc<cmj> h = a("pool");
   public static final alc<cmj> i = a("courbet");
   public static final alc<cmj> j = a("sea");
   public static final alc<cmj> k = a("sunset");
   public static final alc<cmj> l = a("creebet");
   public static final alc<cmj> m = a("wanderer");
   public static final alc<cmj> n = a("graham");
   public static final alc<cmj> o = a("match");
   public static final alc<cmj> p = a("bust");
   public static final alc<cmj> q = a("stage");
   public static final alc<cmj> r = a("void");
   public static final alc<cmj> s = a("skull_and_roses");
   public static final alc<cmj> t = a("wither");
   public static final alc<cmj> u = a("fighters");
   public static final alc<cmj> v = a("pointer");
   public static final alc<cmj> w = a("pigscene");
   public static final alc<cmj> x = a("burning_skull");
   public static final alc<cmj> y = a("skeleton");
   public static final alc<cmj> z = a("donkey_kong");
   public static final alc<cmj> A = a("earth");
   public static final alc<cmj> B = a("wind");
   public static final alc<cmj> C = a("water");
   public static final alc<cmj> D = a("fire");
   public static final alc<cmj> E = a("baroque");
   public static final alc<cmj> F = a("humble");
   public static final alc<cmj> G = a("meditative");
   public static final alc<cmj> H = a("prairie_ride");
   public static final alc<cmj> I = a("unpacked");
   public static final alc<cmj> J = a("backyard");
   public static final alc<cmj> K = a("bouquet");
   public static final alc<cmj> L = a("cavebird");
   public static final alc<cmj> M = a("changing");
   public static final alc<cmj> N = a("cotan");
   public static final alc<cmj> O = a("endboss");
   public static final alc<cmj> P = a("fern");
   public static final alc<cmj> Q = a("finding");
   public static final alc<cmj> R = a("lowmist");
   public static final alc<cmj> S = a("orb");
   public static final alc<cmj> T = a("owlemons");
   public static final alc<cmj> U = a("passage");
   public static final alc<cmj> V = a("pond");
   public static final alc<cmj> W = a("sunflowers");
   public static final alc<cmj> X = a("tides");

   public static void a(qg<cmj> $$0) {
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

   private static void a(qg<cmj> $$0, alc<cmj> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(qg<cmj> $$0, alc<cmj> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new cmj(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(wv.c($$1.a().c("painting", "title")).a(n.o)),
            $$4 ? Optional.of(wv.c($$1.a().c("painting", "author")).a(n.h)) : Optional.empty()
         )
      );
   }

   private static alc<cmj> a(String $$0) {
      return alc.a(me.X, ald.b($$0));
   }
}
