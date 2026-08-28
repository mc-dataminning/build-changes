import java.util.stream.Stream;

public class ecz {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final ecl s = ecm.a(10.0);
   private static final ecl t = ecm.a();
   private static final akt<ecl> u = a("zero");
   private static final akt<ecl> v = a("y");
   private static final akt<ecl> w = a("shift_x");
   private static final akt<ecl> x = a("shift_z");
   private static final akt<ecl> y = a("overworld/base_3d_noise");
   private static final akt<ecl> z = a("nether/base_3d_noise");
   private static final akt<ecl> A = a("end/base_3d_noise");
   public static final akt<ecl> d = a("overworld/continents");
   public static final akt<ecl> e = a("overworld/erosion");
   public static final akt<ecl> f = a("overworld/ridges");
   public static final akt<ecl> g = a("overworld/ridges_folded");
   public static final akt<ecl> h = a("overworld/offset");
   public static final akt<ecl> i = a("overworld/factor");
   public static final akt<ecl> j = a("overworld/jaggedness");
   public static final akt<ecl> k = a("overworld/depth");
   private static final akt<ecl> B = a("overworld/sloped_cheese");
   public static final akt<ecl> l = a("overworld_large_biomes/continents");
   public static final akt<ecl> m = a("overworld_large_biomes/erosion");
   private static final akt<ecl> C = a("overworld_large_biomes/offset");
   private static final akt<ecl> D = a("overworld_large_biomes/factor");
   private static final akt<ecl> E = a("overworld_large_biomes/jaggedness");
   private static final akt<ecl> F = a("overworld_large_biomes/depth");
   private static final akt<ecl> G = a("overworld_large_biomes/sloped_cheese");
   private static final akt<ecl> H = a("overworld_amplified/offset");
   private static final akt<ecl> I = a("overworld_amplified/factor");
   private static final akt<ecl> J = a("overworld_amplified/jaggedness");
   private static final akt<ecl> K = a("overworld_amplified/depth");
   private static final akt<ecl> L = a("overworld_amplified/sloped_cheese");
   private static final akt<ecl> M = a("end/sloped_cheese");
   private static final akt<ecl> N = a("overworld/caves/spaghetti_roughness_function");
   private static final akt<ecl> O = a("overworld/caves/entrances");
   private static final akt<ecl> P = a("overworld/caves/noodle");
   private static final akt<ecl> Q = a("overworld/caves/pillars");
   private static final akt<ecl> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final akt<ecl> S = a("overworld/caves/spaghetti_2d");

   private static akt<ecl> a(String $$0) {
      return akt.a(mc.aM, aku.b($$0));
   }

   public static jr<? extends ecl> a(qe<ecl> $$0) {
      js<esc.a> $$1 = $$0.a(mc.aS);
      js<ecl> $$2 = $$0.a(mc.aM);
      $$0.a(u, ecm.a());
      int $$3 = eas.e * 2;
      int $$4 = eas.d * 2;
      $$0.a(v, ecm.a($$3, $$4, (double)$$3, (double)$$4));
      ecl $$5 = a($$0, w, ecm.b(ecm.c(ecm.b($$1.b(edb.j)))));
      ecl $$6 = a($$0, x, ecm.b(ecm.c(ecm.c($$1.b(edb.j)))));
      $$0.a(y, erz.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, erz.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, erz.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jr<ecl> $$7 = $$0.a(d, ecm.b(ecm.a($$5, $$6, 0.25, $$1.b(edb.c))));
      jr<ecl> $$8 = $$0.a(e, ecm.b(ecm.a($$5, $$6, 0.25, $$1.b(edb.d))));
      ecl $$9 = a($$0, f, ecm.b(ecm.a($$5, $$6, 0.25, $$1.b(edb.i))));
      $$0.a(g, a($$9));
      ecl $$10 = ecm.b($$1.b(edb.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jr<ecl> $$11 = $$0.a(l, ecm.b(ecm.a($$5, $$6, 0.25, $$1.b(edb.g))));
      jr<ecl> $$12 = $$0.a(m, ecm.b(ecm.a($$5, $$6, 0.25, $$1.b(edb.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, ecm.a(ecm.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, ecm.d(ecm.a($$1.b(edb.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qe<ecl> $$0, js<ecl> $$1, ecl $$2, jr<ecl> $$3, jr<ecl> $$4, akt<ecl> $$5, akt<ecl> $$6, akt<ecl> $$7, akt<ecl> $$8, akt<ecl> $$9, boolean $$10
   ) {
      ecm.w.a $$11 = new ecm.w.a($$3);
      ecm.w.a $$12 = new ecm.w.a($$4);
      ecm.w.a $$13 = new ecm.w.a($$1.b(f));
      ecm.w.a $$14 = new ecm.w.a($$1.b(g));
      ecl $$15 = a($$0, $$5, a(ecm.a(ecm.a(-0.50375F), ecm.a(qt.a($$11, $$12, $$14, $$10))), ecm.c()));
      ecl $$16 = a($$0, $$6, a(ecm.a(qt.a($$11, $$12, $$13, $$14, $$10)), s));
      ecl $$17 = a($$0, $$8, ecm.a(ecm.a(-64, 320, 1.5, -1.5), $$15));
      ecl $$18 = a($$0, $$7, a(ecm.a(qt.b($$11, $$12, $$13, $$14, $$10)), t));
      ecl $$19 = ecm.b($$18, $$2.g());
      ecl $$20 = b($$16, ecm.a($$17, $$19));
      $$0.a($$9, ecm.a($$20, a($$1, y)));
   }

   private static ecl a(qe<ecl> $$0, akt<ecl> $$1, ecl $$2) {
      return new ecm.j($$0.a($$1, $$2));
   }

   private static ecl a(js<ecl> $$0, akt<ecl> $$1) {
      return new ecm.j($$0.b($$1));
   }

   private static ecl a(ecl $$0) {
      return ecm.b(ecm.a(ecm.a($$0.d(), ecm.a(-0.6666666666666666)).d(), ecm.a(-0.3333333333333333)), ecm.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static ecl b(js<esc.a> $$0) {
      ecl $$1 = ecm.a($$0.b(edb.z));
      ecl $$2 = ecm.a($$0.b(edb.A), 0.0, -0.1);
      return ecm.d(ecm.b($$2, ecm.a($$1.d(), ecm.a(-0.4))));
   }

   private static ecl d(js<ecl> $$0, js<esc.a> $$1) {
      ecl $$2 = ecm.d(ecm.b($$1.b(edb.x), 2.0, 1.0));
      ecl $$3 = ecm.a($$1.b(edb.y), -0.065, -0.088);
      ecl $$4 = ecm.a($$2, $$1.b(edb.v), ecm.z.a.a);
      ecl $$5 = ecm.a($$2, $$1.b(edb.w), ecm.z.a.a);
      ecl $$6 = ecm.a(ecm.d($$4, $$5), $$3).a(-1.0, 1.0);
      ecl $$7 = a($$0, N);
      ecl $$8 = ecm.b($$1.b(edb.B), 0.75, 0.5);
      ecl $$9 = ecm.a(ecm.a($$8, ecm.a(0.37)), ecm.a(-10, 30, 0.3, 0.0));
      return ecm.d(ecm.c($$9, ecm.a($$7, $$6)));
   }

   private static ecl e(js<ecl> $$0, js<esc.a> $$1) {
      ecl $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      ecl $$6 = a($$2, ecm.b($$1.b(edb.I), 1.0, 1.0), -60, 320, -1);
      ecl $$7 = a($$2, ecm.a($$1.b(edb.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      ecl $$9 = a($$2, ecm.b($$1.b(edb.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ecl $$10 = a($$2, ecm.b($$1.b(edb.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ecl $$11 = ecm.b(ecm.a(1.5), ecm.d($$9.d(), $$10.d()));
      return ecm.a($$6, -1000000.0, 0.0, ecm.a(64.0), ecm.a($$7, $$11));
   }

   private static ecl c(js<esc.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      ecl $$3 = ecm.b($$0.b(edb.o), 25.0, 0.3);
      ecl $$4 = ecm.a($$0.b(edb.p), 0.0, -2.0);
      ecl $$5 = ecm.a($$0.b(edb.q), 0.0, 1.1);
      ecl $$6 = ecm.a(ecm.b($$3, ecm.a(2.0)), $$4);
      return ecm.d(ecm.b($$6, $$5.f()));
   }

   private static ecl f(js<ecl> $$0, js<esc.a> $$1) {
      ecl $$2 = ecm.b($$1.b(edb.t), 2.0, 1.0);
      ecl $$3 = ecm.a($$2, $$1.b(edb.r), ecm.z.a.b);
      ecl $$4 = ecm.a($$1.b(edb.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      ecl $$5 = a($$0, R);
      ecl $$6 = ecm.a($$4, ecm.a(-64, 320, 8.0, -40.0)).d();
      ecl $$7 = ecm.a($$6, $$5).f();
      double $$8 = 0.083;
      ecl $$9 = ecm.a($$3, ecm.b(ecm.a(0.083), $$5));
      return ecm.d($$9, $$7).a(-1.0, 1.0);
   }

   private static ecl a(js<ecl> $$0, js<esc.a> $$1, ecl $$2) {
      ecl $$3 = a($$0, S);
      ecl $$4 = a($$0, N);
      ecl $$5 = ecm.a($$1.b(edb.C), 8.0);
      ecl $$6 = ecm.b(ecm.a(4.0), $$5.e());
      ecl $$7 = ecm.a($$1.b(edb.D), 0.6666666666666666);
      ecl $$8 = ecm.a(ecm.a(ecm.a(0.27), $$7).a(-1.0, 1.0), ecm.a(ecm.a(1.5), ecm.b(ecm.a(-0.64), $$2)).a(0.0, 0.5));
      ecl $$9 = ecm.a($$6, $$8);
      ecl $$10 = ecm.c(ecm.c($$9, a($$0, O)), ecm.a($$3, $$4));
      ecl $$11 = a($$0, Q);
      ecl $$12 = ecm.a($$11, -1000000.0, 0.03, ecm.a(-1000000.0), $$11);
      return ecm.d($$10, $$12);
   }

   private static ecl b(ecl $$0) {
      ecl $$1 = ecm.f($$0);
      return ecm.b(ecm.a($$1), ecm.a(0.64)).i();
   }

   protected static ecy a(js<ecl> $$0, js<esc.a> $$1, boolean $$2, boolean $$3) {
      ecl $$4 = ecm.a($$1.b(edb.k), 0.5);
      ecl $$5 = ecm.a($$1.b(edb.l), 0.67);
      ecl $$6 = ecm.a($$1.b(edb.n), 0.7142857142857143);
      ecl $$7 = ecm.a($$1.b(edb.m));
      ecl $$8 = a($$0, w);
      ecl $$9 = a($$0, x);
      ecl $$10 = ecm.a($$8, $$9, 0.25, $$1.b($$2 ? edb.e : edb.a));
      ecl $$11 = ecm.a($$8, $$9, 0.25, $$1.b($$2 ? edb.f : edb.b));
      ecl $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      ecl $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      ecl $$14 = b(ecm.c($$12), $$13);
      ecl $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      ecl $$16 = ecm.c($$15, ecm.b(ecm.a(5.0), a($$0, O)));
      ecl $$17 = ecm.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      ecl $$18 = ecm.c(b(a($$3, $$17)), a($$0, P));
      ecl $$19 = a($$0, v);
      int $$20 = Stream.of(edc.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-eas.e * 2);
      int $$21 = Stream.of(edc.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-eas.e * 2);
      ecl $$22 = a($$19, ecm.b($$1.b(edb.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      ecl $$24 = a($$19, ecm.b($$1.b(edb.F), 4.0, 4.0), $$20, $$21, 0).d();
      ecl $$25 = a($$19, ecm.b($$1.b(edb.G), 4.0, 4.0), $$20, $$21, 0).d();
      ecl $$26 = ecm.a(ecm.a(-0.08F), ecm.d($$24, $$25));
      ecl $$27 = ecm.a($$1.b(edb.H));
      return new ecy(
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
         a($$3, ecm.a($$14, ecm.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ecy b(js<ecl> $$0, js<esc.a> $$1, ecl $$2) {
      ecl $$3 = a($$0, w);
      ecl $$4 = a($$0, x);
      ecl $$5 = ecm.a($$3, $$4, 0.25, $$1.b(edb.a));
      ecl $$6 = ecm.a($$3, $$4, 0.25, $$1.b(edb.b));
      ecl $$7 = b($$2);
      return new ecy(ecm.a(), ecm.a(), ecm.a(), ecm.a(), $$5, $$6, ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), $$7, ecm.a(), ecm.a(), ecm.a());
   }

   private static ecl a(boolean $$0, ecl $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static ecl a(js<ecl> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static ecl a(ecl $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ecy a(js<ecl> $$0, js<esc.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ecy b(js<ecl> $$0, js<esc.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ecy c(js<ecl> $$0, js<esc.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static ecl c(ecl $$0) {
      return a($$0, 0, 128);
   }

   protected static ecy a(js<ecl> $$0) {
      ecl $$1 = ecm.c(ecm.a(0L));
      ecl $$2 = b(c(a($$0, M)));
      return new ecy(
         ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), $$1, ecm.a(), ecm.a(), c(ecm.a($$1, ecm.a(-0.703125))), $$2, ecm.a(), ecm.a(), ecm.a()
      );
   }

   protected static ecy a() {
      return new ecy(ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a(), ecm.a());
   }

   private static ecl a(ecl $$0, ecl $$1) {
      ecl $$2 = ecm.a(ecm.b(), $$1, $$0);
      return ecm.b(ecm.c($$2));
   }

   private static ecl b(ecl $$0, ecl $$1) {
      ecl $$2 = ecm.b($$1, $$0);
      return ecm.b(ecm.a(4.0), $$2.h());
   }

   private static ecl a(ecl $$0, ecl $$1, int $$2, int $$3, int $$4) {
      return ecm.a(ecm.a($$0, (double)$$2, (double)($$3 + 1), $$1, ecm.a((double)$$4)));
   }

   private static ecl a(ecl $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      ecl $$10 = ecm.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      ecl $$9 = ecm.a($$10, $$5, $$0);
      ecl $$11 = ecm.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return ecm.a($$11, $$8, $$9);
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
