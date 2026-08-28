import java.util.stream.Stream;

public class ecx {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final ecj s = eck.a(10.0);
   private static final ecj t = eck.a();
   private static final akt<ecj> u = a("zero");
   private static final akt<ecj> v = a("y");
   private static final akt<ecj> w = a("shift_x");
   private static final akt<ecj> x = a("shift_z");
   private static final akt<ecj> y = a("overworld/base_3d_noise");
   private static final akt<ecj> z = a("nether/base_3d_noise");
   private static final akt<ecj> A = a("end/base_3d_noise");
   public static final akt<ecj> d = a("overworld/continents");
   public static final akt<ecj> e = a("overworld/erosion");
   public static final akt<ecj> f = a("overworld/ridges");
   public static final akt<ecj> g = a("overworld/ridges_folded");
   public static final akt<ecj> h = a("overworld/offset");
   public static final akt<ecj> i = a("overworld/factor");
   public static final akt<ecj> j = a("overworld/jaggedness");
   public static final akt<ecj> k = a("overworld/depth");
   private static final akt<ecj> B = a("overworld/sloped_cheese");
   public static final akt<ecj> l = a("overworld_large_biomes/continents");
   public static final akt<ecj> m = a("overworld_large_biomes/erosion");
   private static final akt<ecj> C = a("overworld_large_biomes/offset");
   private static final akt<ecj> D = a("overworld_large_biomes/factor");
   private static final akt<ecj> E = a("overworld_large_biomes/jaggedness");
   private static final akt<ecj> F = a("overworld_large_biomes/depth");
   private static final akt<ecj> G = a("overworld_large_biomes/sloped_cheese");
   private static final akt<ecj> H = a("overworld_amplified/offset");
   private static final akt<ecj> I = a("overworld_amplified/factor");
   private static final akt<ecj> J = a("overworld_amplified/jaggedness");
   private static final akt<ecj> K = a("overworld_amplified/depth");
   private static final akt<ecj> L = a("overworld_amplified/sloped_cheese");
   private static final akt<ecj> M = a("end/sloped_cheese");
   private static final akt<ecj> N = a("overworld/caves/spaghetti_roughness_function");
   private static final akt<ecj> O = a("overworld/caves/entrances");
   private static final akt<ecj> P = a("overworld/caves/noodle");
   private static final akt<ecj> Q = a("overworld/caves/pillars");
   private static final akt<ecj> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final akt<ecj> S = a("overworld/caves/spaghetti_2d");

   private static akt<ecj> a(String $$0) {
      return akt.a(mc.aM, aku.b($$0));
   }

   public static jr<? extends ecj> a(qe<ecj> $$0) {
      js<esa.a> $$1 = $$0.a(mc.aS);
      js<ecj> $$2 = $$0.a(mc.aM);
      $$0.a(u, eck.a());
      int $$3 = eaq.e * 2;
      int $$4 = eaq.d * 2;
      $$0.a(v, eck.a($$3, $$4, (double)$$3, (double)$$4));
      ecj $$5 = a($$0, w, eck.b(eck.c(eck.b($$1.b(ecz.j)))));
      ecj $$6 = a($$0, x, eck.b(eck.c(eck.c($$1.b(ecz.j)))));
      $$0.a(y, erx.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, erx.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, erx.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jr<ecj> $$7 = $$0.a(d, eck.b(eck.a($$5, $$6, 0.25, $$1.b(ecz.c))));
      jr<ecj> $$8 = $$0.a(e, eck.b(eck.a($$5, $$6, 0.25, $$1.b(ecz.d))));
      ecj $$9 = a($$0, f, eck.b(eck.a($$5, $$6, 0.25, $$1.b(ecz.i))));
      $$0.a(g, a($$9));
      ecj $$10 = eck.b($$1.b(ecz.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jr<ecj> $$11 = $$0.a(l, eck.b(eck.a($$5, $$6, 0.25, $$1.b(ecz.g))));
      jr<ecj> $$12 = $$0.a(m, eck.b(eck.a($$5, $$6, 0.25, $$1.b(ecz.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, eck.a(eck.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, eck.d(eck.a($$1.b(ecz.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qe<ecj> $$0, js<ecj> $$1, ecj $$2, jr<ecj> $$3, jr<ecj> $$4, akt<ecj> $$5, akt<ecj> $$6, akt<ecj> $$7, akt<ecj> $$8, akt<ecj> $$9, boolean $$10
   ) {
      eck.w.a $$11 = new eck.w.a($$3);
      eck.w.a $$12 = new eck.w.a($$4);
      eck.w.a $$13 = new eck.w.a($$1.b(f));
      eck.w.a $$14 = new eck.w.a($$1.b(g));
      ecj $$15 = a($$0, $$5, a(eck.a(eck.a(-0.50375F), eck.a(qt.a($$11, $$12, $$14, $$10))), eck.c()));
      ecj $$16 = a($$0, $$6, a(eck.a(qt.a($$11, $$12, $$13, $$14, $$10)), s));
      ecj $$17 = a($$0, $$8, eck.a(eck.a(-64, 320, 1.5, -1.5), $$15));
      ecj $$18 = a($$0, $$7, a(eck.a(qt.b($$11, $$12, $$13, $$14, $$10)), t));
      ecj $$19 = eck.b($$18, $$2.g());
      ecj $$20 = b($$16, eck.a($$17, $$19));
      $$0.a($$9, eck.a($$20, a($$1, y)));
   }

   private static ecj a(qe<ecj> $$0, akt<ecj> $$1, ecj $$2) {
      return new eck.j($$0.a($$1, $$2));
   }

   private static ecj a(js<ecj> $$0, akt<ecj> $$1) {
      return new eck.j($$0.b($$1));
   }

   private static ecj a(ecj $$0) {
      return eck.b(eck.a(eck.a($$0.d(), eck.a(-0.6666666666666666)).d(), eck.a(-0.3333333333333333)), eck.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static ecj b(js<esa.a> $$0) {
      ecj $$1 = eck.a($$0.b(ecz.z));
      ecj $$2 = eck.a($$0.b(ecz.A), 0.0, -0.1);
      return eck.d(eck.b($$2, eck.a($$1.d(), eck.a(-0.4))));
   }

   private static ecj d(js<ecj> $$0, js<esa.a> $$1) {
      ecj $$2 = eck.d(eck.b($$1.b(ecz.x), 2.0, 1.0));
      ecj $$3 = eck.a($$1.b(ecz.y), -0.065, -0.088);
      ecj $$4 = eck.a($$2, $$1.b(ecz.v), eck.z.a.a);
      ecj $$5 = eck.a($$2, $$1.b(ecz.w), eck.z.a.a);
      ecj $$6 = eck.a(eck.d($$4, $$5), $$3).a(-1.0, 1.0);
      ecj $$7 = a($$0, N);
      ecj $$8 = eck.b($$1.b(ecz.B), 0.75, 0.5);
      ecj $$9 = eck.a(eck.a($$8, eck.a(0.37)), eck.a(-10, 30, 0.3, 0.0));
      return eck.d(eck.c($$9, eck.a($$7, $$6)));
   }

   private static ecj e(js<ecj> $$0, js<esa.a> $$1) {
      ecj $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      ecj $$6 = a($$2, eck.b($$1.b(ecz.I), 1.0, 1.0), -60, 320, -1);
      ecj $$7 = a($$2, eck.a($$1.b(ecz.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      ecj $$9 = a($$2, eck.b($$1.b(ecz.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ecj $$10 = a($$2, eck.b($$1.b(ecz.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ecj $$11 = eck.b(eck.a(1.5), eck.d($$9.d(), $$10.d()));
      return eck.a($$6, -1000000.0, 0.0, eck.a(64.0), eck.a($$7, $$11));
   }

   private static ecj c(js<esa.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      ecj $$3 = eck.b($$0.b(ecz.o), 25.0, 0.3);
      ecj $$4 = eck.a($$0.b(ecz.p), 0.0, -2.0);
      ecj $$5 = eck.a($$0.b(ecz.q), 0.0, 1.1);
      ecj $$6 = eck.a(eck.b($$3, eck.a(2.0)), $$4);
      return eck.d(eck.b($$6, $$5.f()));
   }

   private static ecj f(js<ecj> $$0, js<esa.a> $$1) {
      ecj $$2 = eck.b($$1.b(ecz.t), 2.0, 1.0);
      ecj $$3 = eck.a($$2, $$1.b(ecz.r), eck.z.a.b);
      ecj $$4 = eck.a($$1.b(ecz.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      ecj $$5 = a($$0, R);
      ecj $$6 = eck.a($$4, eck.a(-64, 320, 8.0, -40.0)).d();
      ecj $$7 = eck.a($$6, $$5).f();
      double $$8 = 0.083;
      ecj $$9 = eck.a($$3, eck.b(eck.a(0.083), $$5));
      return eck.d($$9, $$7).a(-1.0, 1.0);
   }

   private static ecj a(js<ecj> $$0, js<esa.a> $$1, ecj $$2) {
      ecj $$3 = a($$0, S);
      ecj $$4 = a($$0, N);
      ecj $$5 = eck.a($$1.b(ecz.C), 8.0);
      ecj $$6 = eck.b(eck.a(4.0), $$5.e());
      ecj $$7 = eck.a($$1.b(ecz.D), 0.6666666666666666);
      ecj $$8 = eck.a(eck.a(eck.a(0.27), $$7).a(-1.0, 1.0), eck.a(eck.a(1.5), eck.b(eck.a(-0.64), $$2)).a(0.0, 0.5));
      ecj $$9 = eck.a($$6, $$8);
      ecj $$10 = eck.c(eck.c($$9, a($$0, O)), eck.a($$3, $$4));
      ecj $$11 = a($$0, Q);
      ecj $$12 = eck.a($$11, -1000000.0, 0.03, eck.a(-1000000.0), $$11);
      return eck.d($$10, $$12);
   }

   private static ecj b(ecj $$0) {
      ecj $$1 = eck.f($$0);
      return eck.b(eck.a($$1), eck.a(0.64)).i();
   }

   protected static ecw a(js<ecj> $$0, js<esa.a> $$1, boolean $$2, boolean $$3) {
      ecj $$4 = eck.a($$1.b(ecz.k), 0.5);
      ecj $$5 = eck.a($$1.b(ecz.l), 0.67);
      ecj $$6 = eck.a($$1.b(ecz.n), 0.7142857142857143);
      ecj $$7 = eck.a($$1.b(ecz.m));
      ecj $$8 = a($$0, w);
      ecj $$9 = a($$0, x);
      ecj $$10 = eck.a($$8, $$9, 0.25, $$1.b($$2 ? ecz.e : ecz.a));
      ecj $$11 = eck.a($$8, $$9, 0.25, $$1.b($$2 ? ecz.f : ecz.b));
      ecj $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      ecj $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      ecj $$14 = b(eck.c($$12), $$13);
      ecj $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      ecj $$16 = eck.c($$15, eck.b(eck.a(5.0), a($$0, O)));
      ecj $$17 = eck.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      ecj $$18 = eck.c(b(a($$3, $$17)), a($$0, P));
      ecj $$19 = a($$0, v);
      int $$20 = Stream.of(eda.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-eaq.e * 2);
      int $$21 = Stream.of(eda.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-eaq.e * 2);
      ecj $$22 = a($$19, eck.b($$1.b(ecz.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      ecj $$24 = a($$19, eck.b($$1.b(ecz.F), 4.0, 4.0), $$20, $$21, 0).d();
      ecj $$25 = a($$19, eck.b($$1.b(ecz.G), 4.0, 4.0), $$20, $$21, 0).d();
      ecj $$26 = eck.a(eck.a(-0.08F), eck.d($$24, $$25));
      ecj $$27 = eck.a($$1.b(ecz.H));
      return new ecw(
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
         a($$3, eck.a($$14, eck.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ecw b(js<ecj> $$0, js<esa.a> $$1, ecj $$2) {
      ecj $$3 = a($$0, w);
      ecj $$4 = a($$0, x);
      ecj $$5 = eck.a($$3, $$4, 0.25, $$1.b(ecz.a));
      ecj $$6 = eck.a($$3, $$4, 0.25, $$1.b(ecz.b));
      ecj $$7 = b($$2);
      return new ecw(eck.a(), eck.a(), eck.a(), eck.a(), $$5, $$6, eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), $$7, eck.a(), eck.a(), eck.a());
   }

   private static ecj a(boolean $$0, ecj $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static ecj a(js<ecj> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static ecj a(ecj $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ecw a(js<ecj> $$0, js<esa.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ecw b(js<ecj> $$0, js<esa.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ecw c(js<ecj> $$0, js<esa.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static ecj c(ecj $$0) {
      return a($$0, 0, 128);
   }

   protected static ecw a(js<ecj> $$0) {
      ecj $$1 = eck.c(eck.a(0L));
      ecj $$2 = b(c(a($$0, M)));
      return new ecw(
         eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), $$1, eck.a(), eck.a(), c(eck.a($$1, eck.a(-0.703125))), $$2, eck.a(), eck.a(), eck.a()
      );
   }

   protected static ecw a() {
      return new ecw(eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), eck.a(), eck.a());
   }

   private static ecj a(ecj $$0, ecj $$1) {
      ecj $$2 = eck.a(eck.b(), $$1, $$0);
      return eck.b(eck.c($$2));
   }

   private static ecj b(ecj $$0, ecj $$1) {
      ecj $$2 = eck.b($$1, $$0);
      return eck.b(eck.a(4.0), $$2.h());
   }

   private static ecj a(ecj $$0, ecj $$1, int $$2, int $$3, int $$4) {
      return eck.a(eck.a($$0, (double)$$2, (double)($$3 + 1), $$1, eck.a((double)$$4)));
   }

   private static ecj a(ecj $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      ecj $$10 = eck.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      ecj $$9 = eck.a($$10, $$5, $$0);
      ecj $$11 = eck.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return eck.a($$11, $$8, $$9);
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
