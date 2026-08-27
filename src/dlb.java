import java.util.stream.Stream;

public class dlb {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dkn s = dko.a(10.0);
   private static final dkn t = dko.a();
   private static final aex<dkn> u = a("zero");
   private static final aex<dkn> v = a("y");
   private static final aex<dkn> w = a("shift_x");
   private static final aex<dkn> x = a("shift_z");
   private static final aex<dkn> y = a("overworld/base_3d_noise");
   private static final aex<dkn> z = a("nether/base_3d_noise");
   private static final aex<dkn> A = a("end/base_3d_noise");
   public static final aex<dkn> d = a("overworld/continents");
   public static final aex<dkn> e = a("overworld/erosion");
   public static final aex<dkn> f = a("overworld/ridges");
   public static final aex<dkn> g = a("overworld/ridges_folded");
   public static final aex<dkn> h = a("overworld/offset");
   public static final aex<dkn> i = a("overworld/factor");
   public static final aex<dkn> j = a("overworld/jaggedness");
   public static final aex<dkn> k = a("overworld/depth");
   private static final aex<dkn> B = a("overworld/sloped_cheese");
   public static final aex<dkn> l = a("overworld_large_biomes/continents");
   public static final aex<dkn> m = a("overworld_large_biomes/erosion");
   private static final aex<dkn> C = a("overworld_large_biomes/offset");
   private static final aex<dkn> D = a("overworld_large_biomes/factor");
   private static final aex<dkn> E = a("overworld_large_biomes/jaggedness");
   private static final aex<dkn> F = a("overworld_large_biomes/depth");
   private static final aex<dkn> G = a("overworld_large_biomes/sloped_cheese");
   private static final aex<dkn> H = a("overworld_amplified/offset");
   private static final aex<dkn> I = a("overworld_amplified/factor");
   private static final aex<dkn> J = a("overworld_amplified/jaggedness");
   private static final aex<dkn> K = a("overworld_amplified/depth");
   private static final aex<dkn> L = a("overworld_amplified/sloped_cheese");
   private static final aex<dkn> M = a("end/sloped_cheese");
   private static final aex<dkn> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aex<dkn> O = a("overworld/caves/entrances");
   private static final aex<dkn> P = a("overworld/caves/noodle");
   private static final aex<dkn> Q = a("overworld/caves/pillars");
   private static final aex<dkn> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aex<dkn> S = a("overworld/caves/spaghetti_2d");

   private static aex<dkn> a(String $$0) {
      return aex.a(je.at, new aey($$0));
   }

   public static hg<? extends dkn> a(nt<dkn> $$0) {
      hh<dzr.a> $$1 = $$0.a(je.ax);
      hh<dkn> $$2 = $$0.a(je.at);
      $$0.a(u, dko.a());
      int $$3 = diu.e * 2;
      int $$4 = diu.d * 2;
      $$0.a(v, dko.a($$3, $$4, (double)$$3, (double)$$4));
      dkn $$5 = a($$0, w, dko.b(dko.c(dko.b($$1.b(dld.j)))));
      dkn $$6 = a($$0, x, dko.b(dko.c(dko.c($$1.b(dld.j)))));
      $$0.a(y, dzo.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, dzo.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, dzo.a(0.25, 0.25, 80.0, 160.0, 4.0));
      hg<dkn> $$7 = $$0.a(d, dko.b(dko.a($$5, $$6, 0.25, $$1.b(dld.c))));
      hg<dkn> $$8 = $$0.a(e, dko.b(dko.a($$5, $$6, 0.25, $$1.b(dld.d))));
      dkn $$9 = a($$0, f, dko.b(dko.a($$5, $$6, 0.25, $$1.b(dld.i))));
      $$0.a(g, a($$9));
      dkn $$10 = dko.b($$1.b(dld.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      hg<dkn> $$11 = $$0.a(l, dko.b(dko.a($$5, $$6, 0.25, $$1.b(dld.g))));
      hg<dkn> $$12 = $$0.a(m, dko.b(dko.a($$5, $$6, 0.25, $$1.b(dld.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dko.a(dko.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dko.d(dko.a($$1.b(dld.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      nt<dkn> $$0, hh<dkn> $$1, dkn $$2, hg<dkn> $$3, hg<dkn> $$4, aex<dkn> $$5, aex<dkn> $$6, aex<dkn> $$7, aex<dkn> $$8, aex<dkn> $$9, boolean $$10
   ) {
      dko.w.a $$11 = new dko.w.a($$3);
      dko.w.a $$12 = new dko.w.a($$4);
      dko.w.a $$13 = new dko.w.a($$1.b(f));
      dko.w.a $$14 = new dko.w.a($$1.b(g));
      dkn $$15 = a($$0, $$5, a(dko.a(dko.a(-0.50375F), dko.a(oi.a($$11, $$12, $$14, $$10))), dko.c()));
      dkn $$16 = a($$0, $$6, a(dko.a(oi.a($$11, $$12, $$13, $$14, $$10)), s));
      dkn $$17 = a($$0, $$8, dko.a(dko.a(-64, 320, 1.5, -1.5), $$15));
      dkn $$18 = a($$0, $$7, a(dko.a(oi.b($$11, $$12, $$13, $$14, $$10)), t));
      dkn $$19 = dko.b($$18, $$2.g());
      dkn $$20 = b($$16, dko.a($$17, $$19));
      $$0.a($$9, dko.a($$20, a($$1, y)));
   }

   private static dkn a(nt<dkn> $$0, aex<dkn> $$1, dkn $$2) {
      return new dko.j($$0.a($$1, $$2));
   }

   private static dkn a(hh<dkn> $$0, aex<dkn> $$1) {
      return new dko.j($$0.b($$1));
   }

   private static dkn a(dkn $$0) {
      return dko.b(dko.a(dko.a($$0.d(), dko.a(-0.6666666666666666)).d(), dko.a(-0.3333333333333333)), dko.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dkn b(hh<dzr.a> $$0) {
      dkn $$1 = dko.a($$0.b(dld.z));
      dkn $$2 = dko.a($$0.b(dld.A), 0.0, -0.1);
      return dko.d(dko.b($$2, dko.a($$1.d(), dko.a(-0.4))));
   }

   private static dkn d(hh<dkn> $$0, hh<dzr.a> $$1) {
      dkn $$2 = dko.d(dko.b($$1.b(dld.x), 2.0, 1.0));
      dkn $$3 = dko.a($$1.b(dld.y), -0.065, -0.088);
      dkn $$4 = dko.a($$2, $$1.b(dld.v), dko.z.a.a);
      dkn $$5 = dko.a($$2, $$1.b(dld.w), dko.z.a.a);
      dkn $$6 = dko.a(dko.d($$4, $$5), $$3).a(-1.0, 1.0);
      dkn $$7 = a($$0, N);
      dkn $$8 = dko.b($$1.b(dld.B), 0.75, 0.5);
      dkn $$9 = dko.a(dko.a($$8, dko.a(0.37)), dko.a(-10, 30, 0.3, 0.0));
      return dko.d(dko.c($$9, dko.a($$7, $$6)));
   }

   private static dkn e(hh<dkn> $$0, hh<dzr.a> $$1) {
      dkn $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dkn $$6 = a($$2, dko.b($$1.b(dld.I), 1.0, 1.0), -60, 320, -1);
      dkn $$7 = a($$2, dko.a($$1.b(dld.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dkn $$9 = a($$2, dko.b($$1.b(dld.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dkn $$10 = a($$2, dko.b($$1.b(dld.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dkn $$11 = dko.b(dko.a(1.5), dko.d($$9.d(), $$10.d()));
      return dko.a($$6, -1000000.0, 0.0, dko.a(64.0), dko.a($$7, $$11));
   }

   private static dkn c(hh<dzr.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dkn $$3 = dko.b($$0.b(dld.o), 25.0, 0.3);
      dkn $$4 = dko.a($$0.b(dld.p), 0.0, -2.0);
      dkn $$5 = dko.a($$0.b(dld.q), 0.0, 1.1);
      dkn $$6 = dko.a(dko.b($$3, dko.a(2.0)), $$4);
      return dko.d(dko.b($$6, $$5.f()));
   }

   private static dkn f(hh<dkn> $$0, hh<dzr.a> $$1) {
      dkn $$2 = dko.b($$1.b(dld.t), 2.0, 1.0);
      dkn $$3 = dko.a($$2, $$1.b(dld.r), dko.z.a.b);
      dkn $$4 = dko.a($$1.b(dld.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dkn $$5 = a($$0, R);
      dkn $$6 = dko.a($$4, dko.a(-64, 320, 8.0, -40.0)).d();
      dkn $$7 = dko.a($$6, $$5).f();
      double $$8 = 0.083;
      dkn $$9 = dko.a($$3, dko.b(dko.a(0.083), $$5));
      return dko.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dkn a(hh<dkn> $$0, hh<dzr.a> $$1, dkn $$2) {
      dkn $$3 = a($$0, S);
      dkn $$4 = a($$0, N);
      dkn $$5 = dko.a($$1.b(dld.C), 8.0);
      dkn $$6 = dko.b(dko.a(4.0), $$5.e());
      dkn $$7 = dko.a($$1.b(dld.D), 0.6666666666666666);
      dkn $$8 = dko.a(dko.a(dko.a(0.27), $$7).a(-1.0, 1.0), dko.a(dko.a(1.5), dko.b(dko.a(-0.64), $$2)).a(0.0, 0.5));
      dkn $$9 = dko.a($$6, $$8);
      dkn $$10 = dko.c(dko.c($$9, a($$0, O)), dko.a($$3, $$4));
      dkn $$11 = a($$0, Q);
      dkn $$12 = dko.a($$11, -1000000.0, 0.03, dko.a(-1000000.0), $$11);
      return dko.d($$10, $$12);
   }

   private static dkn b(dkn $$0) {
      dkn $$1 = dko.f($$0);
      return dko.b(dko.a($$1), dko.a(0.64)).i();
   }

   protected static dla a(hh<dkn> $$0, hh<dzr.a> $$1, boolean $$2, boolean $$3) {
      dkn $$4 = dko.a($$1.b(dld.k), 0.5);
      dkn $$5 = dko.a($$1.b(dld.l), 0.67);
      dkn $$6 = dko.a($$1.b(dld.n), 0.7142857142857143);
      dkn $$7 = dko.a($$1.b(dld.m));
      dkn $$8 = a($$0, w);
      dkn $$9 = a($$0, x);
      dkn $$10 = dko.a($$8, $$9, 0.25, $$1.b($$2 ? dld.e : dld.a));
      dkn $$11 = dko.a($$8, $$9, 0.25, $$1.b($$2 ? dld.f : dld.b));
      dkn $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dkn $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dkn $$14 = b(dko.c($$12), $$13);
      dkn $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dkn $$16 = dko.c($$15, dko.b(dko.a(5.0), a($$0, O)));
      dkn $$17 = dko.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dkn $$18 = dko.c(b(a($$3, $$17)), a($$0, P));
      dkn $$19 = a($$0, v);
      int $$20 = Stream.of(dle.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-diu.e * 2);
      int $$21 = Stream.of(dle.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-diu.e * 2);
      dkn $$22 = a($$19, dko.b($$1.b(dld.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dkn $$24 = a($$19, dko.b($$1.b(dld.F), 4.0, 4.0), $$20, $$21, 0).d();
      dkn $$25 = a($$19, dko.b($$1.b(dld.G), 4.0, 4.0), $$20, $$21, 0).d();
      dkn $$26 = dko.a(dko.a(-0.08F), dko.d($$24, $$25));
      dkn $$27 = dko.a($$1.b(dld.H));
      return new dla(
         $$4,
         $$5,
         $$6,
         $$7,
         $$10,
         $$11,
         a($$0, $$2 ? l : d),
         a($$0, $$2 ? m : e),
         $$13,
         a($$0, f),
         a($$3, dko.a($$14, dko.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dla b(hh<dkn> $$0, hh<dzr.a> $$1, dkn $$2) {
      dkn $$3 = a($$0, w);
      dkn $$4 = a($$0, x);
      dkn $$5 = dko.a($$3, $$4, 0.25, $$1.b(dld.a));
      dkn $$6 = dko.a($$3, $$4, 0.25, $$1.b(dld.b));
      dkn $$7 = b($$2);
      return new dla(dko.a(), dko.a(), dko.a(), dko.a(), $$5, $$6, dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), $$7, dko.a(), dko.a(), dko.a());
   }

   private static dkn a(boolean $$0, dkn $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dkn a(hh<dkn> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dkn a(dkn $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dla a(hh<dkn> $$0, hh<dzr.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dla b(hh<dkn> $$0, hh<dzr.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dla c(hh<dkn> $$0, hh<dzr.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dkn c(dkn $$0) {
      return a($$0, 0, 128);
   }

   protected static dla a(hh<dkn> $$0) {
      dkn $$1 = dko.c(dko.a(0L));
      dkn $$2 = b(c(a($$0, M)));
      return new dla(
         dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), $$1, dko.a(), dko.a(), c(dko.a($$1, dko.a(-0.703125))), $$2, dko.a(), dko.a(), dko.a()
      );
   }

   protected static dla a() {
      return new dla(dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), dko.a(), dko.a());
   }

   private static dkn a(dkn $$0, dkn $$1) {
      dkn $$2 = dko.a(dko.b(), $$1, $$0);
      return dko.b(dko.c($$2));
   }

   private static dkn b(dkn $$0, dkn $$1) {
      dkn $$2 = dko.b($$1, $$0);
      return dko.b(dko.a(4.0), $$2.h());
   }

   private static dkn a(dkn $$0, dkn $$1, int $$2, int $$3, int $$4) {
      return dko.a(dko.a($$0, (double)$$2, (double)($$3 + 1), $$1, dko.a((double)$$4)));
   }

   private static dkn a(dkn $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dkn $$10 = dko.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dkn $$9 = dko.a($$10, $$5, $$0);
      dkn $$11 = dko.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dko.a($$11, $$8, $$9);
   }

   protected static final class a {
      protected static double a(double $$0) {
         if ($$0 < -0.75) {
            return 0.5;
         } else if ($$0 < -0.5) {
            return 0.75;
         } else if ($$0 < 0.5) {
            return 1.0;
         } else {
            return $$0 < 0.75 ? 2.0 : 3.0;
         }
      }

      protected static double b(double $$0) {
         if ($$0 < -0.5) {
            return 0.75;
         } else if ($$0 < 0.0) {
            return 1.0;
         } else {
            return $$0 < 0.5 ? 1.5 : 2.0;
         }
      }
   }
}
