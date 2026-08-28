import java.util.stream.Stream;

public class egf {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final efr s = efs.a(10.0);
   private static final efr t = efs.a();
   private static final alf<efr> u = a("zero");
   private static final alf<efr> v = a("y");
   private static final alf<efr> w = a("shift_x");
   private static final alf<efr> x = a("shift_z");
   private static final alf<efr> y = a("overworld/base_3d_noise");
   private static final alf<efr> z = a("nether/base_3d_noise");
   private static final alf<efr> A = a("end/base_3d_noise");
   public static final alf<efr> d = a("overworld/continents");
   public static final alf<efr> e = a("overworld/erosion");
   public static final alf<efr> f = a("overworld/ridges");
   public static final alf<efr> g = a("overworld/ridges_folded");
   public static final alf<efr> h = a("overworld/offset");
   public static final alf<efr> i = a("overworld/factor");
   public static final alf<efr> j = a("overworld/jaggedness");
   public static final alf<efr> k = a("overworld/depth");
   private static final alf<efr> B = a("overworld/sloped_cheese");
   public static final alf<efr> l = a("overworld_large_biomes/continents");
   public static final alf<efr> m = a("overworld_large_biomes/erosion");
   private static final alf<efr> C = a("overworld_large_biomes/offset");
   private static final alf<efr> D = a("overworld_large_biomes/factor");
   private static final alf<efr> E = a("overworld_large_biomes/jaggedness");
   private static final alf<efr> F = a("overworld_large_biomes/depth");
   private static final alf<efr> G = a("overworld_large_biomes/sloped_cheese");
   private static final alf<efr> H = a("overworld_amplified/offset");
   private static final alf<efr> I = a("overworld_amplified/factor");
   private static final alf<efr> J = a("overworld_amplified/jaggedness");
   private static final alf<efr> K = a("overworld_amplified/depth");
   private static final alf<efr> L = a("overworld_amplified/sloped_cheese");
   private static final alf<efr> M = a("end/sloped_cheese");
   private static final alf<efr> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alf<efr> O = a("overworld/caves/entrances");
   private static final alf<efr> P = a("overworld/caves/noodle");
   private static final alf<efr> Q = a("overworld/caves/pillars");
   private static final alf<efr> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alf<efr> S = a("overworld/caves/spaghetti_2d");

   private static alf<efr> a(String $$0) {
      return alf.a(mg.aN, alg.b($$0));
   }

   public static je<? extends efr> a(qh<efr> $$0) {
      jf<evj.a> $$1 = $$0.a(mg.aX);
      jf<efr> $$2 = $$0.a(mg.aN);
      $$0.a(u, efs.a());
      int $$3 = edw.e * 2;
      int $$4 = edw.d * 2;
      $$0.a(v, efs.a($$3, $$4, (double)$$3, (double)$$4));
      efr $$5 = a($$0, w, efs.b(efs.c(efs.b($$1.b(egh.j)))));
      efr $$6 = a($$0, x, efs.b(efs.c(efs.c($$1.b(egh.j)))));
      $$0.a(y, evg.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, evg.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, evg.a(0.25, 0.25, 80.0, 160.0, 4.0));
      je<efr> $$7 = $$0.a(d, efs.b(efs.a($$5, $$6, 0.25, $$1.b(egh.c))));
      je<efr> $$8 = $$0.a(e, efs.b(efs.a($$5, $$6, 0.25, $$1.b(egh.d))));
      efr $$9 = a($$0, f, efs.b(efs.a($$5, $$6, 0.25, $$1.b(egh.i))));
      $$0.a(g, a($$9));
      efr $$10 = efs.b($$1.b(egh.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      je<efr> $$11 = $$0.a(l, efs.b(efs.a($$5, $$6, 0.25, $$1.b(egh.g))));
      je<efr> $$12 = $$0.a(m, efs.b(efs.a($$5, $$6, 0.25, $$1.b(egh.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, efs.a(efs.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, efs.d(efs.a($$1.b(egh.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qh<efr> $$0, jf<efr> $$1, efr $$2, je<efr> $$3, je<efr> $$4, alf<efr> $$5, alf<efr> $$6, alf<efr> $$7, alf<efr> $$8, alf<efr> $$9, boolean $$10
   ) {
      efs.w.a $$11 = new efs.w.a($$3);
      efs.w.a $$12 = new efs.w.a($$4);
      efs.w.a $$13 = new efs.w.a($$1.b(f));
      efs.w.a $$14 = new efs.w.a($$1.b(g));
      efr $$15 = a($$0, $$5, a(efs.a(efs.a(-0.50375F), efs.a(qw.a($$11, $$12, $$14, $$10))), efs.c()));
      efr $$16 = a($$0, $$6, a(efs.a(qw.a($$11, $$12, $$13, $$14, $$10)), s));
      efr $$17 = a($$0, $$8, efs.a(efs.a(-64, 320, 1.5, -1.5), $$15));
      efr $$18 = a($$0, $$7, a(efs.a(qw.b($$11, $$12, $$13, $$14, $$10)), t));
      efr $$19 = efs.b($$18, $$2.g());
      efr $$20 = b($$16, efs.a($$17, $$19));
      $$0.a($$9, efs.a($$20, a($$1, y)));
   }

   private static efr a(qh<efr> $$0, alf<efr> $$1, efr $$2) {
      return new efs.j($$0.a($$1, $$2));
   }

   private static efr a(jf<efr> $$0, alf<efr> $$1) {
      return new efs.j($$0.b($$1));
   }

   private static efr a(efr $$0) {
      return efs.b(efs.a(efs.a($$0.d(), efs.a(-0.6666666666666666)).d(), efs.a(-0.3333333333333333)), efs.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static efr b(jf<evj.a> $$0) {
      efr $$1 = efs.a($$0.b(egh.z));
      efr $$2 = efs.a($$0.b(egh.A), 0.0, -0.1);
      return efs.d(efs.b($$2, efs.a($$1.d(), efs.a(-0.4))));
   }

   private static efr d(jf<efr> $$0, jf<evj.a> $$1) {
      efr $$2 = efs.d(efs.b($$1.b(egh.x), 2.0, 1.0));
      efr $$3 = efs.a($$1.b(egh.y), -0.065, -0.088);
      efr $$4 = efs.a($$2, $$1.b(egh.v), efs.z.a.a);
      efr $$5 = efs.a($$2, $$1.b(egh.w), efs.z.a.a);
      efr $$6 = efs.a(efs.d($$4, $$5), $$3).a(-1.0, 1.0);
      efr $$7 = a($$0, N);
      efr $$8 = efs.b($$1.b(egh.B), 0.75, 0.5);
      efr $$9 = efs.a(efs.a($$8, efs.a(0.37)), efs.a(-10, 30, 0.3, 0.0));
      return efs.d(efs.c($$9, efs.a($$7, $$6)));
   }

   private static efr e(jf<efr> $$0, jf<evj.a> $$1) {
      efr $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      efr $$6 = a($$2, efs.b($$1.b(egh.I), 1.0, 1.0), -60, 320, -1);
      efr $$7 = a($$2, efs.a($$1.b(egh.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      efr $$9 = a($$2, efs.b($$1.b(egh.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      efr $$10 = a($$2, efs.b($$1.b(egh.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      efr $$11 = efs.b(efs.a(1.5), efs.d($$9.d(), $$10.d()));
      return efs.a($$6, -1000000.0, 0.0, efs.a(64.0), efs.a($$7, $$11));
   }

   private static efr c(jf<evj.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      efr $$3 = efs.b($$0.b(egh.o), 25.0, 0.3);
      efr $$4 = efs.a($$0.b(egh.p), 0.0, -2.0);
      efr $$5 = efs.a($$0.b(egh.q), 0.0, 1.1);
      efr $$6 = efs.a(efs.b($$3, efs.a(2.0)), $$4);
      return efs.d(efs.b($$6, $$5.f()));
   }

   private static efr f(jf<efr> $$0, jf<evj.a> $$1) {
      efr $$2 = efs.b($$1.b(egh.t), 2.0, 1.0);
      efr $$3 = efs.a($$2, $$1.b(egh.r), efs.z.a.b);
      efr $$4 = efs.a($$1.b(egh.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      efr $$5 = a($$0, R);
      efr $$6 = efs.a($$4, efs.a(-64, 320, 8.0, -40.0)).d();
      efr $$7 = efs.a($$6, $$5).f();
      double $$8 = 0.083;
      efr $$9 = efs.a($$3, efs.b(efs.a(0.083), $$5));
      return efs.d($$9, $$7).a(-1.0, 1.0);
   }

   private static efr a(jf<efr> $$0, jf<evj.a> $$1, efr $$2) {
      efr $$3 = a($$0, S);
      efr $$4 = a($$0, N);
      efr $$5 = efs.a($$1.b(egh.C), 8.0);
      efr $$6 = efs.b(efs.a(4.0), $$5.e());
      efr $$7 = efs.a($$1.b(egh.D), 0.6666666666666666);
      efr $$8 = efs.a(efs.a(efs.a(0.27), $$7).a(-1.0, 1.0), efs.a(efs.a(1.5), efs.b(efs.a(-0.64), $$2)).a(0.0, 0.5));
      efr $$9 = efs.a($$6, $$8);
      efr $$10 = efs.c(efs.c($$9, a($$0, O)), efs.a($$3, $$4));
      efr $$11 = a($$0, Q);
      efr $$12 = efs.a($$11, -1000000.0, 0.03, efs.a(-1000000.0), $$11);
      return efs.d($$10, $$12);
   }

   private static efr b(efr $$0) {
      efr $$1 = efs.f($$0);
      return efs.b(efs.a($$1), efs.a(0.64)).i();
   }

   protected static ege a(jf<efr> $$0, jf<evj.a> $$1, boolean $$2, boolean $$3) {
      efr $$4 = efs.a($$1.b(egh.k), 0.5);
      efr $$5 = efs.a($$1.b(egh.l), 0.67);
      efr $$6 = efs.a($$1.b(egh.n), 0.7142857142857143);
      efr $$7 = efs.a($$1.b(egh.m));
      efr $$8 = a($$0, w);
      efr $$9 = a($$0, x);
      efr $$10 = efs.a($$8, $$9, 0.25, $$1.b($$2 ? egh.e : egh.a));
      efr $$11 = efs.a($$8, $$9, 0.25, $$1.b($$2 ? egh.f : egh.b));
      efr $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      efr $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      efr $$14 = b(efs.c($$12), $$13);
      efr $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      efr $$16 = efs.c($$15, efs.b(efs.a(5.0), a($$0, O)));
      efr $$17 = efs.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      efr $$18 = efs.c(b(a($$3, $$17)), a($$0, P));
      efr $$19 = a($$0, v);
      int $$20 = Stream.of(egi.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-edw.e * 2);
      int $$21 = Stream.of(egi.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-edw.e * 2);
      efr $$22 = a($$19, efs.b($$1.b(egh.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      efr $$24 = a($$19, efs.b($$1.b(egh.F), 4.0, 4.0), $$20, $$21, 0).d();
      efr $$25 = a($$19, efs.b($$1.b(egh.G), 4.0, 4.0), $$20, $$21, 0).d();
      efr $$26 = efs.a(efs.a(-0.08F), efs.d($$24, $$25));
      efr $$27 = efs.a($$1.b(egh.H));
      return new ege(
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
         a($$3, efs.a($$14, efs.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ege b(jf<efr> $$0, jf<evj.a> $$1, efr $$2) {
      efr $$3 = a($$0, w);
      efr $$4 = a($$0, x);
      efr $$5 = efs.a($$3, $$4, 0.25, $$1.b(egh.a));
      efr $$6 = efs.a($$3, $$4, 0.25, $$1.b(egh.b));
      efr $$7 = b($$2);
      return new ege(efs.a(), efs.a(), efs.a(), efs.a(), $$5, $$6, efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), $$7, efs.a(), efs.a(), efs.a());
   }

   private static efr a(boolean $$0, efr $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static efr a(jf<efr> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static efr a(efr $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ege a(jf<efr> $$0, jf<evj.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ege b(jf<efr> $$0, jf<evj.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ege c(jf<efr> $$0, jf<evj.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static efr c(efr $$0) {
      return a($$0, 0, 128);
   }

   protected static ege a(jf<efr> $$0) {
      efr $$1 = efs.c(efs.a(0L));
      efr $$2 = b(c(a($$0, M)));
      return new ege(
         efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), $$1, efs.a(), efs.a(), c(efs.a($$1, efs.a(-0.703125))), $$2, efs.a(), efs.a(), efs.a()
      );
   }

   protected static ege a() {
      return new ege(efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), efs.a(), efs.a());
   }

   private static efr a(efr $$0, efr $$1) {
      efr $$2 = efs.a(efs.b(), $$1, $$0);
      return efs.b(efs.c($$2));
   }

   private static efr b(efr $$0, efr $$1) {
      efr $$2 = efs.b($$1, $$0);
      return efs.b(efs.a(4.0), $$2.h());
   }

   private static efr a(efr $$0, efr $$1, int $$2, int $$3, int $$4) {
      return efs.a(efs.a($$0, (double)$$2, (double)($$3 + 1), $$1, efs.a((double)$$4)));
   }

   private static efr a(efr $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      efr $$10 = efs.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      efr $$9 = efs.a($$10, $$5, $$0);
      efr $$11 = efs.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return efs.a($$11, $$8, $$9);
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
