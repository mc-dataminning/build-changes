import java.util.stream.Stream;

public class eda {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final ecm s = ecn.a(10.0);
   private static final ecm t = ecn.a();
   private static final aku<ecm> u = a("zero");
   private static final aku<ecm> v = a("y");
   private static final aku<ecm> w = a("shift_x");
   private static final aku<ecm> x = a("shift_z");
   private static final aku<ecm> y = a("overworld/base_3d_noise");
   private static final aku<ecm> z = a("nether/base_3d_noise");
   private static final aku<ecm> A = a("end/base_3d_noise");
   public static final aku<ecm> d = a("overworld/continents");
   public static final aku<ecm> e = a("overworld/erosion");
   public static final aku<ecm> f = a("overworld/ridges");
   public static final aku<ecm> g = a("overworld/ridges_folded");
   public static final aku<ecm> h = a("overworld/offset");
   public static final aku<ecm> i = a("overworld/factor");
   public static final aku<ecm> j = a("overworld/jaggedness");
   public static final aku<ecm> k = a("overworld/depth");
   private static final aku<ecm> B = a("overworld/sloped_cheese");
   public static final aku<ecm> l = a("overworld_large_biomes/continents");
   public static final aku<ecm> m = a("overworld_large_biomes/erosion");
   private static final aku<ecm> C = a("overworld_large_biomes/offset");
   private static final aku<ecm> D = a("overworld_large_biomes/factor");
   private static final aku<ecm> E = a("overworld_large_biomes/jaggedness");
   private static final aku<ecm> F = a("overworld_large_biomes/depth");
   private static final aku<ecm> G = a("overworld_large_biomes/sloped_cheese");
   private static final aku<ecm> H = a("overworld_amplified/offset");
   private static final aku<ecm> I = a("overworld_amplified/factor");
   private static final aku<ecm> J = a("overworld_amplified/jaggedness");
   private static final aku<ecm> K = a("overworld_amplified/depth");
   private static final aku<ecm> L = a("overworld_amplified/sloped_cheese");
   private static final aku<ecm> M = a("end/sloped_cheese");
   private static final aku<ecm> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aku<ecm> O = a("overworld/caves/entrances");
   private static final aku<ecm> P = a("overworld/caves/noodle");
   private static final aku<ecm> Q = a("overworld/caves/pillars");
   private static final aku<ecm> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aku<ecm> S = a("overworld/caves/spaghetti_2d");

   private static aku<ecm> a(String $$0) {
      return aku.a(mc.aM, akv.b($$0));
   }

   public static jr<? extends ecm> a(qe<ecm> $$0) {
      js<esd.a> $$1 = $$0.a(mc.aS);
      js<ecm> $$2 = $$0.a(mc.aM);
      $$0.a(u, ecn.a());
      int $$3 = eat.e * 2;
      int $$4 = eat.d * 2;
      $$0.a(v, ecn.a($$3, $$4, (double)$$3, (double)$$4));
      ecm $$5 = a($$0, w, ecn.b(ecn.c(ecn.b($$1.b(edc.j)))));
      ecm $$6 = a($$0, x, ecn.b(ecn.c(ecn.c($$1.b(edc.j)))));
      $$0.a(y, esa.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, esa.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, esa.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jr<ecm> $$7 = $$0.a(d, ecn.b(ecn.a($$5, $$6, 0.25, $$1.b(edc.c))));
      jr<ecm> $$8 = $$0.a(e, ecn.b(ecn.a($$5, $$6, 0.25, $$1.b(edc.d))));
      ecm $$9 = a($$0, f, ecn.b(ecn.a($$5, $$6, 0.25, $$1.b(edc.i))));
      $$0.a(g, a($$9));
      ecm $$10 = ecn.b($$1.b(edc.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jr<ecm> $$11 = $$0.a(l, ecn.b(ecn.a($$5, $$6, 0.25, $$1.b(edc.g))));
      jr<ecm> $$12 = $$0.a(m, ecn.b(ecn.a($$5, $$6, 0.25, $$1.b(edc.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, ecn.a(ecn.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, ecn.d(ecn.a($$1.b(edc.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qe<ecm> $$0, js<ecm> $$1, ecm $$2, jr<ecm> $$3, jr<ecm> $$4, aku<ecm> $$5, aku<ecm> $$6, aku<ecm> $$7, aku<ecm> $$8, aku<ecm> $$9, boolean $$10
   ) {
      ecn.w.a $$11 = new ecn.w.a($$3);
      ecn.w.a $$12 = new ecn.w.a($$4);
      ecn.w.a $$13 = new ecn.w.a($$1.b(f));
      ecn.w.a $$14 = new ecn.w.a($$1.b(g));
      ecm $$15 = a($$0, $$5, a(ecn.a(ecn.a(-0.50375F), ecn.a(qt.a($$11, $$12, $$14, $$10))), ecn.c()));
      ecm $$16 = a($$0, $$6, a(ecn.a(qt.a($$11, $$12, $$13, $$14, $$10)), s));
      ecm $$17 = a($$0, $$8, ecn.a(ecn.a(-64, 320, 1.5, -1.5), $$15));
      ecm $$18 = a($$0, $$7, a(ecn.a(qt.b($$11, $$12, $$13, $$14, $$10)), t));
      ecm $$19 = ecn.b($$18, $$2.g());
      ecm $$20 = b($$16, ecn.a($$17, $$19));
      $$0.a($$9, ecn.a($$20, a($$1, y)));
   }

   private static ecm a(qe<ecm> $$0, aku<ecm> $$1, ecm $$2) {
      return new ecn.j($$0.a($$1, $$2));
   }

   private static ecm a(js<ecm> $$0, aku<ecm> $$1) {
      return new ecn.j($$0.b($$1));
   }

   private static ecm a(ecm $$0) {
      return ecn.b(ecn.a(ecn.a($$0.d(), ecn.a(-0.6666666666666666)).d(), ecn.a(-0.3333333333333333)), ecn.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static ecm b(js<esd.a> $$0) {
      ecm $$1 = ecn.a($$0.b(edc.z));
      ecm $$2 = ecn.a($$0.b(edc.A), 0.0, -0.1);
      return ecn.d(ecn.b($$2, ecn.a($$1.d(), ecn.a(-0.4))));
   }

   private static ecm d(js<ecm> $$0, js<esd.a> $$1) {
      ecm $$2 = ecn.d(ecn.b($$1.b(edc.x), 2.0, 1.0));
      ecm $$3 = ecn.a($$1.b(edc.y), -0.065, -0.088);
      ecm $$4 = ecn.a($$2, $$1.b(edc.v), ecn.z.a.a);
      ecm $$5 = ecn.a($$2, $$1.b(edc.w), ecn.z.a.a);
      ecm $$6 = ecn.a(ecn.d($$4, $$5), $$3).a(-1.0, 1.0);
      ecm $$7 = a($$0, N);
      ecm $$8 = ecn.b($$1.b(edc.B), 0.75, 0.5);
      ecm $$9 = ecn.a(ecn.a($$8, ecn.a(0.37)), ecn.a(-10, 30, 0.3, 0.0));
      return ecn.d(ecn.c($$9, ecn.a($$7, $$6)));
   }

   private static ecm e(js<ecm> $$0, js<esd.a> $$1) {
      ecm $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      ecm $$6 = a($$2, ecn.b($$1.b(edc.I), 1.0, 1.0), -60, 320, -1);
      ecm $$7 = a($$2, ecn.a($$1.b(edc.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      ecm $$9 = a($$2, ecn.b($$1.b(edc.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ecm $$10 = a($$2, ecn.b($$1.b(edc.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ecm $$11 = ecn.b(ecn.a(1.5), ecn.d($$9.d(), $$10.d()));
      return ecn.a($$6, -1000000.0, 0.0, ecn.a(64.0), ecn.a($$7, $$11));
   }

   private static ecm c(js<esd.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      ecm $$3 = ecn.b($$0.b(edc.o), 25.0, 0.3);
      ecm $$4 = ecn.a($$0.b(edc.p), 0.0, -2.0);
      ecm $$5 = ecn.a($$0.b(edc.q), 0.0, 1.1);
      ecm $$6 = ecn.a(ecn.b($$3, ecn.a(2.0)), $$4);
      return ecn.d(ecn.b($$6, $$5.f()));
   }

   private static ecm f(js<ecm> $$0, js<esd.a> $$1) {
      ecm $$2 = ecn.b($$1.b(edc.t), 2.0, 1.0);
      ecm $$3 = ecn.a($$2, $$1.b(edc.r), ecn.z.a.b);
      ecm $$4 = ecn.a($$1.b(edc.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      ecm $$5 = a($$0, R);
      ecm $$6 = ecn.a($$4, ecn.a(-64, 320, 8.0, -40.0)).d();
      ecm $$7 = ecn.a($$6, $$5).f();
      double $$8 = 0.083;
      ecm $$9 = ecn.a($$3, ecn.b(ecn.a(0.083), $$5));
      return ecn.d($$9, $$7).a(-1.0, 1.0);
   }

   private static ecm a(js<ecm> $$0, js<esd.a> $$1, ecm $$2) {
      ecm $$3 = a($$0, S);
      ecm $$4 = a($$0, N);
      ecm $$5 = ecn.a($$1.b(edc.C), 8.0);
      ecm $$6 = ecn.b(ecn.a(4.0), $$5.e());
      ecm $$7 = ecn.a($$1.b(edc.D), 0.6666666666666666);
      ecm $$8 = ecn.a(ecn.a(ecn.a(0.27), $$7).a(-1.0, 1.0), ecn.a(ecn.a(1.5), ecn.b(ecn.a(-0.64), $$2)).a(0.0, 0.5));
      ecm $$9 = ecn.a($$6, $$8);
      ecm $$10 = ecn.c(ecn.c($$9, a($$0, O)), ecn.a($$3, $$4));
      ecm $$11 = a($$0, Q);
      ecm $$12 = ecn.a($$11, -1000000.0, 0.03, ecn.a(-1000000.0), $$11);
      return ecn.d($$10, $$12);
   }

   private static ecm b(ecm $$0) {
      ecm $$1 = ecn.f($$0);
      return ecn.b(ecn.a($$1), ecn.a(0.64)).i();
   }

   protected static ecz a(js<ecm> $$0, js<esd.a> $$1, boolean $$2, boolean $$3) {
      ecm $$4 = ecn.a($$1.b(edc.k), 0.5);
      ecm $$5 = ecn.a($$1.b(edc.l), 0.67);
      ecm $$6 = ecn.a($$1.b(edc.n), 0.7142857142857143);
      ecm $$7 = ecn.a($$1.b(edc.m));
      ecm $$8 = a($$0, w);
      ecm $$9 = a($$0, x);
      ecm $$10 = ecn.a($$8, $$9, 0.25, $$1.b($$2 ? edc.e : edc.a));
      ecm $$11 = ecn.a($$8, $$9, 0.25, $$1.b($$2 ? edc.f : edc.b));
      ecm $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      ecm $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      ecm $$14 = b(ecn.c($$12), $$13);
      ecm $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      ecm $$16 = ecn.c($$15, ecn.b(ecn.a(5.0), a($$0, O)));
      ecm $$17 = ecn.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      ecm $$18 = ecn.c(b(a($$3, $$17)), a($$0, P));
      ecm $$19 = a($$0, v);
      int $$20 = Stream.of(edd.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-eat.e * 2);
      int $$21 = Stream.of(edd.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-eat.e * 2);
      ecm $$22 = a($$19, ecn.b($$1.b(edc.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      ecm $$24 = a($$19, ecn.b($$1.b(edc.F), 4.0, 4.0), $$20, $$21, 0).d();
      ecm $$25 = a($$19, ecn.b($$1.b(edc.G), 4.0, 4.0), $$20, $$21, 0).d();
      ecm $$26 = ecn.a(ecn.a(-0.08F), ecn.d($$24, $$25));
      ecm $$27 = ecn.a($$1.b(edc.H));
      return new ecz(
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
         a($$3, ecn.a($$14, ecn.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ecz b(js<ecm> $$0, js<esd.a> $$1, ecm $$2) {
      ecm $$3 = a($$0, w);
      ecm $$4 = a($$0, x);
      ecm $$5 = ecn.a($$3, $$4, 0.25, $$1.b(edc.a));
      ecm $$6 = ecn.a($$3, $$4, 0.25, $$1.b(edc.b));
      ecm $$7 = b($$2);
      return new ecz(ecn.a(), ecn.a(), ecn.a(), ecn.a(), $$5, $$6, ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), $$7, ecn.a(), ecn.a(), ecn.a());
   }

   private static ecm a(boolean $$0, ecm $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static ecm a(js<ecm> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static ecm a(ecm $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ecz a(js<ecm> $$0, js<esd.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ecz b(js<ecm> $$0, js<esd.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ecz c(js<ecm> $$0, js<esd.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static ecm c(ecm $$0) {
      return a($$0, 0, 128);
   }

   protected static ecz a(js<ecm> $$0) {
      ecm $$1 = ecn.c(ecn.a(0L));
      ecm $$2 = b(c(a($$0, M)));
      return new ecz(
         ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), $$1, ecn.a(), ecn.a(), c(ecn.a($$1, ecn.a(-0.703125))), $$2, ecn.a(), ecn.a(), ecn.a()
      );
   }

   protected static ecz a() {
      return new ecz(ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a(), ecn.a());
   }

   private static ecm a(ecm $$0, ecm $$1) {
      ecm $$2 = ecn.a(ecn.b(), $$1, $$0);
      return ecn.b(ecn.c($$2));
   }

   private static ecm b(ecm $$0, ecm $$1) {
      ecm $$2 = ecn.b($$1, $$0);
      return ecn.b(ecn.a(4.0), $$2.h());
   }

   private static ecm a(ecm $$0, ecm $$1, int $$2, int $$3, int $$4) {
      return ecn.a(ecn.a($$0, (double)$$2, (double)($$3 + 1), $$1, ecn.a((double)$$4)));
   }

   private static ecm a(ecm $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      ecm $$10 = ecn.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      ecm $$9 = ecn.a($$10, $$5, $$0);
      ecm $$11 = ecn.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return ecn.a($$11, $$8, $$9);
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
