import java.util.stream.Stream;

public class edv {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final edh s = edi.a(10.0);
   private static final edh t = edi.a();
   private static final akt<edh> u = a("zero");
   private static final akt<edh> v = a("y");
   private static final akt<edh> w = a("shift_x");
   private static final akt<edh> x = a("shift_z");
   private static final akt<edh> y = a("overworld/base_3d_noise");
   private static final akt<edh> z = a("nether/base_3d_noise");
   private static final akt<edh> A = a("end/base_3d_noise");
   public static final akt<edh> d = a("overworld/continents");
   public static final akt<edh> e = a("overworld/erosion");
   public static final akt<edh> f = a("overworld/ridges");
   public static final akt<edh> g = a("overworld/ridges_folded");
   public static final akt<edh> h = a("overworld/offset");
   public static final akt<edh> i = a("overworld/factor");
   public static final akt<edh> j = a("overworld/jaggedness");
   public static final akt<edh> k = a("overworld/depth");
   private static final akt<edh> B = a("overworld/sloped_cheese");
   public static final akt<edh> l = a("overworld_large_biomes/continents");
   public static final akt<edh> m = a("overworld_large_biomes/erosion");
   private static final akt<edh> C = a("overworld_large_biomes/offset");
   private static final akt<edh> D = a("overworld_large_biomes/factor");
   private static final akt<edh> E = a("overworld_large_biomes/jaggedness");
   private static final akt<edh> F = a("overworld_large_biomes/depth");
   private static final akt<edh> G = a("overworld_large_biomes/sloped_cheese");
   private static final akt<edh> H = a("overworld_amplified/offset");
   private static final akt<edh> I = a("overworld_amplified/factor");
   private static final akt<edh> J = a("overworld_amplified/jaggedness");
   private static final akt<edh> K = a("overworld_amplified/depth");
   private static final akt<edh> L = a("overworld_amplified/sloped_cheese");
   private static final akt<edh> M = a("end/sloped_cheese");
   private static final akt<edh> N = a("overworld/caves/spaghetti_roughness_function");
   private static final akt<edh> O = a("overworld/caves/entrances");
   private static final akt<edh> P = a("overworld/caves/noodle");
   private static final akt<edh> Q = a("overworld/caves/pillars");
   private static final akt<edh> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final akt<edh> S = a("overworld/caves/spaghetti_2d");

   private static akt<edh> a(String $$0) {
      return akt.a(mc.aN, aku.b($$0));
   }

   public static jr<? extends edh> a(qe<edh> $$0) {
      js<esz.a> $$1 = $$0.a(mc.aT);
      js<edh> $$2 = $$0.a(mc.aN);
      $$0.a(u, edi.a());
      int $$3 = ebm.e * 2;
      int $$4 = ebm.d * 2;
      $$0.a(v, edi.a($$3, $$4, (double)$$3, (double)$$4));
      edh $$5 = a($$0, w, edi.b(edi.c(edi.b($$1.b(edx.j)))));
      edh $$6 = a($$0, x, edi.b(edi.c(edi.c($$1.b(edx.j)))));
      $$0.a(y, esw.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, esw.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, esw.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jr<edh> $$7 = $$0.a(d, edi.b(edi.a($$5, $$6, 0.25, $$1.b(edx.c))));
      jr<edh> $$8 = $$0.a(e, edi.b(edi.a($$5, $$6, 0.25, $$1.b(edx.d))));
      edh $$9 = a($$0, f, edi.b(edi.a($$5, $$6, 0.25, $$1.b(edx.i))));
      $$0.a(g, a($$9));
      edh $$10 = edi.b($$1.b(edx.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jr<edh> $$11 = $$0.a(l, edi.b(edi.a($$5, $$6, 0.25, $$1.b(edx.g))));
      jr<edh> $$12 = $$0.a(m, edi.b(edi.a($$5, $$6, 0.25, $$1.b(edx.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, edi.a(edi.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, edi.d(edi.a($$1.b(edx.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qe<edh> $$0, js<edh> $$1, edh $$2, jr<edh> $$3, jr<edh> $$4, akt<edh> $$5, akt<edh> $$6, akt<edh> $$7, akt<edh> $$8, akt<edh> $$9, boolean $$10
   ) {
      edi.w.a $$11 = new edi.w.a($$3);
      edi.w.a $$12 = new edi.w.a($$4);
      edi.w.a $$13 = new edi.w.a($$1.b(f));
      edi.w.a $$14 = new edi.w.a($$1.b(g));
      edh $$15 = a($$0, $$5, a(edi.a(edi.a(-0.50375F), edi.a(qt.a($$11, $$12, $$14, $$10))), edi.c()));
      edh $$16 = a($$0, $$6, a(edi.a(qt.a($$11, $$12, $$13, $$14, $$10)), s));
      edh $$17 = a($$0, $$8, edi.a(edi.a(-64, 320, 1.5, -1.5), $$15));
      edh $$18 = a($$0, $$7, a(edi.a(qt.b($$11, $$12, $$13, $$14, $$10)), t));
      edh $$19 = edi.b($$18, $$2.g());
      edh $$20 = b($$16, edi.a($$17, $$19));
      $$0.a($$9, edi.a($$20, a($$1, y)));
   }

   private static edh a(qe<edh> $$0, akt<edh> $$1, edh $$2) {
      return new edi.j($$0.a($$1, $$2));
   }

   private static edh a(js<edh> $$0, akt<edh> $$1) {
      return new edi.j($$0.b($$1));
   }

   private static edh a(edh $$0) {
      return edi.b(edi.a(edi.a($$0.d(), edi.a(-0.6666666666666666)).d(), edi.a(-0.3333333333333333)), edi.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static edh b(js<esz.a> $$0) {
      edh $$1 = edi.a($$0.b(edx.z));
      edh $$2 = edi.a($$0.b(edx.A), 0.0, -0.1);
      return edi.d(edi.b($$2, edi.a($$1.d(), edi.a(-0.4))));
   }

   private static edh d(js<edh> $$0, js<esz.a> $$1) {
      edh $$2 = edi.d(edi.b($$1.b(edx.x), 2.0, 1.0));
      edh $$3 = edi.a($$1.b(edx.y), -0.065, -0.088);
      edh $$4 = edi.a($$2, $$1.b(edx.v), edi.z.a.a);
      edh $$5 = edi.a($$2, $$1.b(edx.w), edi.z.a.a);
      edh $$6 = edi.a(edi.d($$4, $$5), $$3).a(-1.0, 1.0);
      edh $$7 = a($$0, N);
      edh $$8 = edi.b($$1.b(edx.B), 0.75, 0.5);
      edh $$9 = edi.a(edi.a($$8, edi.a(0.37)), edi.a(-10, 30, 0.3, 0.0));
      return edi.d(edi.c($$9, edi.a($$7, $$6)));
   }

   private static edh e(js<edh> $$0, js<esz.a> $$1) {
      edh $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      edh $$6 = a($$2, edi.b($$1.b(edx.I), 1.0, 1.0), -60, 320, -1);
      edh $$7 = a($$2, edi.a($$1.b(edx.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      edh $$9 = a($$2, edi.b($$1.b(edx.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      edh $$10 = a($$2, edi.b($$1.b(edx.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      edh $$11 = edi.b(edi.a(1.5), edi.d($$9.d(), $$10.d()));
      return edi.a($$6, -1000000.0, 0.0, edi.a(64.0), edi.a($$7, $$11));
   }

   private static edh c(js<esz.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      edh $$3 = edi.b($$0.b(edx.o), 25.0, 0.3);
      edh $$4 = edi.a($$0.b(edx.p), 0.0, -2.0);
      edh $$5 = edi.a($$0.b(edx.q), 0.0, 1.1);
      edh $$6 = edi.a(edi.b($$3, edi.a(2.0)), $$4);
      return edi.d(edi.b($$6, $$5.f()));
   }

   private static edh f(js<edh> $$0, js<esz.a> $$1) {
      edh $$2 = edi.b($$1.b(edx.t), 2.0, 1.0);
      edh $$3 = edi.a($$2, $$1.b(edx.r), edi.z.a.b);
      edh $$4 = edi.a($$1.b(edx.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      edh $$5 = a($$0, R);
      edh $$6 = edi.a($$4, edi.a(-64, 320, 8.0, -40.0)).d();
      edh $$7 = edi.a($$6, $$5).f();
      double $$8 = 0.083;
      edh $$9 = edi.a($$3, edi.b(edi.a(0.083), $$5));
      return edi.d($$9, $$7).a(-1.0, 1.0);
   }

   private static edh a(js<edh> $$0, js<esz.a> $$1, edh $$2) {
      edh $$3 = a($$0, S);
      edh $$4 = a($$0, N);
      edh $$5 = edi.a($$1.b(edx.C), 8.0);
      edh $$6 = edi.b(edi.a(4.0), $$5.e());
      edh $$7 = edi.a($$1.b(edx.D), 0.6666666666666666);
      edh $$8 = edi.a(edi.a(edi.a(0.27), $$7).a(-1.0, 1.0), edi.a(edi.a(1.5), edi.b(edi.a(-0.64), $$2)).a(0.0, 0.5));
      edh $$9 = edi.a($$6, $$8);
      edh $$10 = edi.c(edi.c($$9, a($$0, O)), edi.a($$3, $$4));
      edh $$11 = a($$0, Q);
      edh $$12 = edi.a($$11, -1000000.0, 0.03, edi.a(-1000000.0), $$11);
      return edi.d($$10, $$12);
   }

   private static edh b(edh $$0) {
      edh $$1 = edi.f($$0);
      return edi.b(edi.a($$1), edi.a(0.64)).i();
   }

   protected static edu a(js<edh> $$0, js<esz.a> $$1, boolean $$2, boolean $$3) {
      edh $$4 = edi.a($$1.b(edx.k), 0.5);
      edh $$5 = edi.a($$1.b(edx.l), 0.67);
      edh $$6 = edi.a($$1.b(edx.n), 0.7142857142857143);
      edh $$7 = edi.a($$1.b(edx.m));
      edh $$8 = a($$0, w);
      edh $$9 = a($$0, x);
      edh $$10 = edi.a($$8, $$9, 0.25, $$1.b($$2 ? edx.e : edx.a));
      edh $$11 = edi.a($$8, $$9, 0.25, $$1.b($$2 ? edx.f : edx.b));
      edh $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      edh $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      edh $$14 = b(edi.c($$12), $$13);
      edh $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      edh $$16 = edi.c($$15, edi.b(edi.a(5.0), a($$0, O)));
      edh $$17 = edi.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      edh $$18 = edi.c(b(a($$3, $$17)), a($$0, P));
      edh $$19 = a($$0, v);
      int $$20 = Stream.of(edy.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-ebm.e * 2);
      int $$21 = Stream.of(edy.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-ebm.e * 2);
      edh $$22 = a($$19, edi.b($$1.b(edx.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      edh $$24 = a($$19, edi.b($$1.b(edx.F), 4.0, 4.0), $$20, $$21, 0).d();
      edh $$25 = a($$19, edi.b($$1.b(edx.G), 4.0, 4.0), $$20, $$21, 0).d();
      edh $$26 = edi.a(edi.a(-0.08F), edi.d($$24, $$25));
      edh $$27 = edi.a($$1.b(edx.H));
      return new edu(
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
         a($$3, edi.a($$14, edi.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static edu b(js<edh> $$0, js<esz.a> $$1, edh $$2) {
      edh $$3 = a($$0, w);
      edh $$4 = a($$0, x);
      edh $$5 = edi.a($$3, $$4, 0.25, $$1.b(edx.a));
      edh $$6 = edi.a($$3, $$4, 0.25, $$1.b(edx.b));
      edh $$7 = b($$2);
      return new edu(edi.a(), edi.a(), edi.a(), edi.a(), $$5, $$6, edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), $$7, edi.a(), edi.a(), edi.a());
   }

   private static edh a(boolean $$0, edh $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static edh a(js<edh> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static edh a(edh $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static edu a(js<edh> $$0, js<esz.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static edu b(js<edh> $$0, js<esz.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static edu c(js<edh> $$0, js<esz.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static edh c(edh $$0) {
      return a($$0, 0, 128);
   }

   protected static edu a(js<edh> $$0) {
      edh $$1 = edi.c(edi.a(0L));
      edh $$2 = b(c(a($$0, M)));
      return new edu(
         edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), $$1, edi.a(), edi.a(), c(edi.a($$1, edi.a(-0.703125))), $$2, edi.a(), edi.a(), edi.a()
      );
   }

   protected static edu a() {
      return new edu(edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), edi.a(), edi.a());
   }

   private static edh a(edh $$0, edh $$1) {
      edh $$2 = edi.a(edi.b(), $$1, $$0);
      return edi.b(edi.c($$2));
   }

   private static edh b(edh $$0, edh $$1) {
      edh $$2 = edi.b($$1, $$0);
      return edi.b(edi.a(4.0), $$2.h());
   }

   private static edh a(edh $$0, edh $$1, int $$2, int $$3, int $$4) {
      return edi.a(edi.a($$0, (double)$$2, (double)($$3 + 1), $$1, edi.a((double)$$4)));
   }

   private static edh a(edh $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      edh $$10 = edi.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      edh $$9 = edi.a($$10, $$5, $$0);
      edh $$11 = edi.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return edi.a($$11, $$8, $$9);
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
