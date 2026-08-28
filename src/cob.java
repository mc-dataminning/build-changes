import java.util.Optional;

public class cob {
   public static final alj<coa> a = a("kebab");
   public static final alj<coa> b = a("aztec");
   public static final alj<coa> c = a("alban");
   public static final alj<coa> d = a("aztec2");
   public static final alj<coa> e = a("bomb");
   public static final alj<coa> f = a("plant");
   public static final alj<coa> g = a("wasteland");
   public static final alj<coa> h = a("pool");
   public static final alj<coa> i = a("courbet");
   public static final alj<coa> j = a("sea");
   public static final alj<coa> k = a("sunset");
   public static final alj<coa> l = a("creebet");
   public static final alj<coa> m = a("wanderer");
   public static final alj<coa> n = a("graham");
   public static final alj<coa> o = a("match");
   public static final alj<coa> p = a("bust");
   public static final alj<coa> q = a("stage");
   public static final alj<coa> r = a("void");
   public static final alj<coa> s = a("skull_and_roses");
   public static final alj<coa> t = a("wither");
   public static final alj<coa> u = a("fighters");
   public static final alj<coa> v = a("pointer");
   public static final alj<coa> w = a("pigscene");
   public static final alj<coa> x = a("burning_skull");
   public static final alj<coa> y = a("skeleton");
   public static final alj<coa> z = a("donkey_kong");
   public static final alj<coa> A = a("earth");
   public static final alj<coa> B = a("wind");
   public static final alj<coa> C = a("water");
   public static final alj<coa> D = a("fire");
   public static final alj<coa> E = a("baroque");
   public static final alj<coa> F = a("humble");
   public static final alj<coa> G = a("meditative");
   public static final alj<coa> H = a("prairie_ride");
   public static final alj<coa> I = a("unpacked");
   public static final alj<coa> J = a("backyard");
   public static final alj<coa> K = a("bouquet");
   public static final alj<coa> L = a("cavebird");
   public static final alj<coa> M = a("changing");
   public static final alj<coa> N = a("cotan");
   public static final alj<coa> O = a("endboss");
   public static final alj<coa> P = a("fern");
   public static final alj<coa> Q = a("finding");
   public static final alj<coa> R = a("lowmist");
   public static final alj<coa> S = a("orb");
   public static final alj<coa> T = a("owlemons");
   public static final alj<coa> U = a("passage");
   public static final alj<coa> V = a("pond");
   public static final alj<coa> W = a("sunflowers");
   public static final alj<coa> X = a("tides");

   public static void a(qi<coa> $$0) {
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

   private static void a(qi<coa> $$0, alj<coa> $$1, int $$2, int $$3) {
      a($$0, $$1, $$2, $$3, true);
   }

   private static void a(qi<coa> $$0, alj<coa> $$1, int $$2, int $$3, boolean $$4) {
      $$0.a(
         $$1,
         new coa(
            $$2,
            $$3,
            $$1.a(),
            Optional.of(xc.c($$1.a().c("painting", "title")).a(o.o)),
            $$4 ? Optional.of(xc.c($$1.a().c("painting", "author")).a(o.h)) : Optional.empty()
         )
      );
   }

   private static alj<coa> a(String $$0) {
      return alj.a(mi.aZ, alk.b($$0));
   }
}
