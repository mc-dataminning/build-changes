import java.util.stream.Stream;

public class ecy {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final eck s = ecl.a(10.0);
   private static final eck t = ecl.a();
   private static final aku<eck> u = a("zero");
   private static final aku<eck> v = a("y");
   private static final aku<eck> w = a("shift_x");
   private static final aku<eck> x = a("shift_z");
   private static final aku<eck> y = a("overworld/base_3d_noise");
   private static final aku<eck> z = a("nether/base_3d_noise");
   private static final aku<eck> A = a("end/base_3d_noise");
   public static final aku<eck> d = a("overworld/continents");
   public static final aku<eck> e = a("overworld/erosion");
   public static final aku<eck> f = a("overworld/ridges");
   public static final aku<eck> g = a("overworld/ridges_folded");
   public static final aku<eck> h = a("overworld/offset");
   public static final aku<eck> i = a("overworld/factor");
   public static final aku<eck> j = a("overworld/jaggedness");
   public static final aku<eck> k = a("overworld/depth");
   private static final aku<eck> B = a("overworld/sloped_cheese");
   public static final aku<eck> l = a("overworld_large_biomes/continents");
   public static final aku<eck> m = a("overworld_large_biomes/erosion");
   private static final aku<eck> C = a("overworld_large_biomes/offset");
   private static final aku<eck> D = a("overworld_large_biomes/factor");
   private static final aku<eck> E = a("overworld_large_biomes/jaggedness");
   private static final aku<eck> F = a("overworld_large_biomes/depth");
   private static final aku<eck> G = a("overworld_large_biomes/sloped_cheese");
   private static final aku<eck> H = a("overworld_amplified/offset");
   private static final aku<eck> I = a("overworld_amplified/factor");
   private static final aku<eck> J = a("overworld_amplified/jaggedness");
   private static final aku<eck> K = a("overworld_amplified/depth");
   private static final aku<eck> L = a("overworld_amplified/sloped_cheese");
   private static final aku<eck> M = a("end/sloped_cheese");
   private static final aku<eck> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aku<eck> O = a("overworld/caves/entrances");
   private static final aku<eck> P = a("overworld/caves/noodle");
   private static final aku<eck> Q = a("overworld/caves/pillars");
   private static final aku<eck> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aku<eck> S = a("overworld/caves/spaghetti_2d");

   private static aku<eck> a(String $$0) {
      return aku.a(mc.aM, akv.b($$0));
   }

   public static jr<? extends eck> a(qe<eck> $$0) {
      js<esb.a> $$1 = $$0.a(mc.aS);
      js<eck> $$2 = $$0.a(mc.aM);
      $$0.a(u, ecl.a());
      int $$3 = ear.e * 2;
      int $$4 = ear.d * 2;
      $$0.a(v, ecl.a($$3, $$4, (double)$$3, (double)$$4));
      eck $$5 = a($$0, w, ecl.b(ecl.c(ecl.b($$1.b(eda.j)))));
      eck $$6 = a($$0, x, ecl.b(ecl.c(ecl.c($$1.b(eda.j)))));
      $$0.a(y, ery.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ery.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ery.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jr<eck> $$7 = $$0.a(d, ecl.b(ecl.a($$5, $$6, 0.25, $$1.b(eda.c))));
      jr<eck> $$8 = $$0.a(e, ecl.b(ecl.a($$5, $$6, 0.25, $$1.b(eda.d))));
      eck $$9 = a($$0, f, ecl.b(ecl.a($$5, $$6, 0.25, $$1.b(eda.i))));
      $$0.a(g, a($$9));
      eck $$10 = ecl.b($$1.b(eda.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jr<eck> $$11 = $$0.a(l, ecl.b(ecl.a($$5, $$6, 0.25, $$1.b(eda.g))));
      jr<eck> $$12 = $$0.a(m, ecl.b(ecl.a($$5, $$6, 0.25, $$1.b(eda.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, ecl.a(ecl.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, ecl.d(ecl.a($$1.b(eda.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qe<eck> $$0, js<eck> $$1, eck $$2, jr<eck> $$3, jr<eck> $$4, aku<eck> $$5, aku<eck> $$6, aku<eck> $$7, aku<eck> $$8, aku<eck> $$9, boolean $$10
   ) {
      ecl.w.a $$11 = new ecl.w.a($$3);
      ecl.w.a $$12 = new ecl.w.a($$4);
      ecl.w.a $$13 = new ecl.w.a($$1.b(f));
      ecl.w.a $$14 = new ecl.w.a($$1.b(g));
      eck $$15 = a($$0, $$5, a(ecl.a(ecl.a(-0.50375F), ecl.a(qt.a($$11, $$12, $$14, $$10))), ecl.c()));
      eck $$16 = a($$0, $$6, a(ecl.a(qt.a($$11, $$12, $$13, $$14, $$10)), s));
      eck $$17 = a($$0, $$8, ecl.a(ecl.a(-64, 320, 1.5, -1.5), $$15));
      eck $$18 = a($$0, $$7, a(ecl.a(qt.b($$11, $$12, $$13, $$14, $$10)), t));
      eck $$19 = ecl.b($$18, $$2.g());
      eck $$20 = b($$16, ecl.a($$17, $$19));
      $$0.a($$9, ecl.a($$20, a($$1, y)));
   }

   private static eck a(qe<eck> $$0, aku<eck> $$1, eck $$2) {
      return new ecl.j($$0.a($$1, $$2));
   }

   private static eck a(js<eck> $$0, aku<eck> $$1) {
      return new ecl.j($$0.b($$1));
   }

   private static eck a(eck $$0) {
      return ecl.b(ecl.a(ecl.a($$0.d(), ecl.a(-0.6666666666666666)).d(), ecl.a(-0.3333333333333333)), ecl.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static eck b(js<esb.a> $$0) {
      eck $$1 = ecl.a($$0.b(eda.z));
      eck $$2 = ecl.a($$0.b(eda.A), 0.0, -0.1);
      return ecl.d(ecl.b($$2, ecl.a($$1.d(), ecl.a(-0.4))));
   }

   private static eck d(js<eck> $$0, js<esb.a> $$1) {
      eck $$2 = ecl.d(ecl.b($$1.b(eda.x), 2.0, 1.0));
      eck $$3 = ecl.a($$1.b(eda.y), -0.065, -0.088);
      eck $$4 = ecl.a($$2, $$1.b(eda.v), ecl.z.a.a);
      eck $$5 = ecl.a($$2, $$1.b(eda.w), ecl.z.a.a);
      eck $$6 = ecl.a(ecl.d($$4, $$5), $$3).a(-1.0, 1.0);
      eck $$7 = a($$0, N);
      eck $$8 = ecl.b($$1.b(eda.B), 0.75, 0.5);
      eck $$9 = ecl.a(ecl.a($$8, ecl.a(0.37)), ecl.a(-10, 30, 0.3, 0.0));
      return ecl.d(ecl.c($$9, ecl.a($$7, $$6)));
   }

   private static eck e(js<eck> $$0, js<esb.a> $$1) {
      eck $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      eck $$6 = a($$2, ecl.b($$1.b(eda.I), 1.0, 1.0), -60, 320, -1);
      eck $$7 = a($$2, ecl.a($$1.b(eda.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      eck $$9 = a($$2, ecl.b($$1.b(eda.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      eck $$10 = a($$2, ecl.b($$1.b(eda.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      eck $$11 = ecl.b(ecl.a(1.5), ecl.d($$9.d(), $$10.d()));
      return ecl.a($$6, -1000000.0, 0.0, ecl.a(64.0), ecl.a($$7, $$11));
   }

   private static eck c(js<esb.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      eck $$3 = ecl.b($$0.b(eda.o), 25.0, 0.3);
      eck $$4 = ecl.a($$0.b(eda.p), 0.0, -2.0);
      eck $$5 = ecl.a($$0.b(eda.q), 0.0, 1.1);
      eck $$6 = ecl.a(ecl.b($$3, ecl.a(2.0)), $$4);
      return ecl.d(ecl.b($$6, $$5.f()));
   }

   private static eck f(js<eck> $$0, js<esb.a> $$1) {
      eck $$2 = ecl.b($$1.b(eda.t), 2.0, 1.0);
      eck $$3 = ecl.a($$2, $$1.b(eda.r), ecl.z.a.b);
      eck $$4 = ecl.a($$1.b(eda.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      eck $$5 = a($$0, R);
      eck $$6 = ecl.a($$4, ecl.a(-64, 320, 8.0, -40.0)).d();
      eck $$7 = ecl.a($$6, $$5).f();
      double $$8 = 0.083;
      eck $$9 = ecl.a($$3, ecl.b(ecl.a(0.083), $$5));
      return ecl.d($$9, $$7).a(-1.0, 1.0);
   }

   private static eck a(js<eck> $$0, js<esb.a> $$1, eck $$2) {
      eck $$3 = a($$0, S);
      eck $$4 = a($$0, N);
      eck $$5 = ecl.a($$1.b(eda.C), 8.0);
      eck $$6 = ecl.b(ecl.a(4.0), $$5.e());
      eck $$7 = ecl.a($$1.b(eda.D), 0.6666666666666666);
      eck $$8 = ecl.a(ecl.a(ecl.a(0.27), $$7).a(-1.0, 1.0), ecl.a(ecl.a(1.5), ecl.b(ecl.a(-0.64), $$2)).a(0.0, 0.5));
      eck $$9 = ecl.a($$6, $$8);
      eck $$10 = ecl.c(ecl.c($$9, a($$0, O)), ecl.a($$3, $$4));
      eck $$11 = a($$0, Q);
      eck $$12 = ecl.a($$11, -1000000.0, 0.03, ecl.a(-1000000.0), $$11);
      return ecl.d($$10, $$12);
   }

   private static eck b(eck $$0) {
      eck $$1 = ecl.f($$0);
      return ecl.b(ecl.a($$1), ecl.a(0.64)).i();
   }

   protected static ecx a(js<eck> $$0, js<esb.a> $$1, boolean $$2, boolean $$3) {
      eck $$4 = ecl.a($$1.b(eda.k), 0.5);
      eck $$5 = ecl.a($$1.b(eda.l), 0.67);
      eck $$6 = ecl.a($$1.b(eda.n), 0.7142857142857143);
      eck $$7 = ecl.a($$1.b(eda.m));
      eck $$8 = a($$0, w);
      eck $$9 = a($$0, x);
      eck $$10 = ecl.a($$8, $$9, 0.25, $$1.b($$2 ? eda.e : eda.a));
      eck $$11 = ecl.a($$8, $$9, 0.25, $$1.b($$2 ? eda.f : eda.b));
      eck $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      eck $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      eck $$14 = b(ecl.c($$12), $$13);
      eck $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      eck $$16 = ecl.c($$15, ecl.b(ecl.a(5.0), a($$0, O)));
      eck $$17 = ecl.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      eck $$18 = ecl.c(b(a($$3, $$17)), a($$0, P));
      eck $$19 = a($$0, v);
      int $$20 = Stream.of(edb.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-ear.e * 2);
      int $$21 = Stream.of(edb.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-ear.e * 2);
      eck $$22 = a($$19, ecl.b($$1.b(eda.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      eck $$24 = a($$19, ecl.b($$1.b(eda.F), 4.0, 4.0), $$20, $$21, 0).d();
      eck $$25 = a($$19, ecl.b($$1.b(eda.G), 4.0, 4.0), $$20, $$21, 0).d();
      eck $$26 = ecl.a(ecl.a(-0.08F), ecl.d($$24, $$25));
      eck $$27 = ecl.a($$1.b(eda.H));
      return new ecx(
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
         a($$3, ecl.a($$14, ecl.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ecx b(js<eck> $$0, js<esb.a> $$1, eck $$2) {
      eck $$3 = a($$0, w);
      eck $$4 = a($$0, x);
      eck $$5 = ecl.a($$3, $$4, 0.25, $$1.b(eda.a));
      eck $$6 = ecl.a($$3, $$4, 0.25, $$1.b(eda.b));
      eck $$7 = b($$2);
      return new ecx(ecl.a(), ecl.a(), ecl.a(), ecl.a(), $$5, $$6, ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), $$7, ecl.a(), ecl.a(), ecl.a());
   }

   private static eck a(boolean $$0, eck $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static eck a(js<eck> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static eck a(eck $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ecx a(js<eck> $$0, js<esb.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ecx b(js<eck> $$0, js<esb.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ecx c(js<eck> $$0, js<esb.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static eck c(eck $$0) {
      return a($$0, 0, 128);
   }

   protected static ecx a(js<eck> $$0) {
      eck $$1 = ecl.c(ecl.a(0L));
      eck $$2 = b(c(a($$0, M)));
      return new ecx(
         ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), $$1, ecl.a(), ecl.a(), c(ecl.a($$1, ecl.a(-0.703125))), $$2, ecl.a(), ecl.a(), ecl.a()
      );
   }

   protected static ecx a() {
      return new ecx(ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a(), ecl.a());
   }

   private static eck a(eck $$0, eck $$1) {
      eck $$2 = ecl.a(ecl.b(), $$1, $$0);
      return ecl.b(ecl.c($$2));
   }

   private static eck b(eck $$0, eck $$1) {
      eck $$2 = ecl.b($$1, $$0);
      return ecl.b(ecl.a(4.0), $$2.h());
   }

   private static eck a(eck $$0, eck $$1, int $$2, int $$3, int $$4) {
      return ecl.a(ecl.a($$0, (double)$$2, (double)($$3 + 1), $$1, ecl.a((double)$$4)));
   }

   private static eck a(eck $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      eck $$10 = ecl.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      eck $$9 = ecl.a($$10, $$5, $$0);
      eck $$11 = ecl.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return ecl.a($$11, $$8, $$9);
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
