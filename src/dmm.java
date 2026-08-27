import java.util.stream.Stream;

public class dmm {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dly s = dlz.a(10.0);
   private static final dly t = dlz.a();
   private static final agf<dly> u = a("zero");
   private static final agf<dly> v = a("y");
   private static final agf<dly> w = a("shift_x");
   private static final agf<dly> x = a("shift_z");
   private static final agf<dly> y = a("overworld/base_3d_noise");
   private static final agf<dly> z = a("nether/base_3d_noise");
   private static final agf<dly> A = a("end/base_3d_noise");
   public static final agf<dly> d = a("overworld/continents");
   public static final agf<dly> e = a("overworld/erosion");
   public static final agf<dly> f = a("overworld/ridges");
   public static final agf<dly> g = a("overworld/ridges_folded");
   public static final agf<dly> h = a("overworld/offset");
   public static final agf<dly> i = a("overworld/factor");
   public static final agf<dly> j = a("overworld/jaggedness");
   public static final agf<dly> k = a("overworld/depth");
   private static final agf<dly> B = a("overworld/sloped_cheese");
   public static final agf<dly> l = a("overworld_large_biomes/continents");
   public static final agf<dly> m = a("overworld_large_biomes/erosion");
   private static final agf<dly> C = a("overworld_large_biomes/offset");
   private static final agf<dly> D = a("overworld_large_biomes/factor");
   private static final agf<dly> E = a("overworld_large_biomes/jaggedness");
   private static final agf<dly> F = a("overworld_large_biomes/depth");
   private static final agf<dly> G = a("overworld_large_biomes/sloped_cheese");
   private static final agf<dly> H = a("overworld_amplified/offset");
   private static final agf<dly> I = a("overworld_amplified/factor");
   private static final agf<dly> J = a("overworld_amplified/jaggedness");
   private static final agf<dly> K = a("overworld_amplified/depth");
   private static final agf<dly> L = a("overworld_amplified/sloped_cheese");
   private static final agf<dly> M = a("end/sloped_cheese");
   private static final agf<dly> N = a("overworld/caves/spaghetti_roughness_function");
   private static final agf<dly> O = a("overworld/caves/entrances");
   private static final agf<dly> P = a("overworld/caves/noodle");
   private static final agf<dly> Q = a("overworld/caves/pillars");
   private static final agf<dly> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final agf<dly> S = a("overworld/caves/spaghetti_2d");

   private static agf<dly> a(String $$0) {
      return agf.a(jz.av, new agg($$0));
   }

   public static ib<? extends dly> a(ou<dly> $$0) {
      ic<ebj.a> $$1 = $$0.a(jz.az);
      ic<dly> $$2 = $$0.a(jz.av);
      $$0.a(u, dlz.a());
      int $$3 = dkf.e * 2;
      int $$4 = dkf.d * 2;
      $$0.a(v, dlz.a($$3, $$4, (double)$$3, (double)$$4));
      dly $$5 = a($$0, w, dlz.b(dlz.c(dlz.b($$1.b(dmo.j)))));
      dly $$6 = a($$0, x, dlz.b(dlz.c(dlz.c($$1.b(dmo.j)))));
      $$0.a(y, ebg.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ebg.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ebg.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ib<dly> $$7 = $$0.a(d, dlz.b(dlz.a($$5, $$6, 0.25, $$1.b(dmo.c))));
      ib<dly> $$8 = $$0.a(e, dlz.b(dlz.a($$5, $$6, 0.25, $$1.b(dmo.d))));
      dly $$9 = a($$0, f, dlz.b(dlz.a($$5, $$6, 0.25, $$1.b(dmo.i))));
      $$0.a(g, a($$9));
      dly $$10 = dlz.b($$1.b(dmo.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ib<dly> $$11 = $$0.a(l, dlz.b(dlz.a($$5, $$6, 0.25, $$1.b(dmo.g))));
      ib<dly> $$12 = $$0.a(m, dlz.b(dlz.a($$5, $$6, 0.25, $$1.b(dmo.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dlz.a(dlz.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dlz.d(dlz.a($$1.b(dmo.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      ou<dly> $$0, ic<dly> $$1, dly $$2, ib<dly> $$3, ib<dly> $$4, agf<dly> $$5, agf<dly> $$6, agf<dly> $$7, agf<dly> $$8, agf<dly> $$9, boolean $$10
   ) {
      dlz.w.a $$11 = new dlz.w.a($$3);
      dlz.w.a $$12 = new dlz.w.a($$4);
      dlz.w.a $$13 = new dlz.w.a($$1.b(f));
      dlz.w.a $$14 = new dlz.w.a($$1.b(g));
      dly $$15 = a($$0, $$5, a(dlz.a(dlz.a(-0.50375F), dlz.a(pj.a($$11, $$12, $$14, $$10))), dlz.c()));
      dly $$16 = a($$0, $$6, a(dlz.a(pj.a($$11, $$12, $$13, $$14, $$10)), s));
      dly $$17 = a($$0, $$8, dlz.a(dlz.a(-64, 320, 1.5, -1.5), $$15));
      dly $$18 = a($$0, $$7, a(dlz.a(pj.b($$11, $$12, $$13, $$14, $$10)), t));
      dly $$19 = dlz.b($$18, $$2.g());
      dly $$20 = b($$16, dlz.a($$17, $$19));
      $$0.a($$9, dlz.a($$20, a($$1, y)));
   }

   private static dly a(ou<dly> $$0, agf<dly> $$1, dly $$2) {
      return new dlz.j($$0.a($$1, $$2));
   }

   private static dly a(ic<dly> $$0, agf<dly> $$1) {
      return new dlz.j($$0.b($$1));
   }

   private static dly a(dly $$0) {
      return dlz.b(dlz.a(dlz.a($$0.d(), dlz.a(-0.6666666666666666)).d(), dlz.a(-0.3333333333333333)), dlz.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dly b(ic<ebj.a> $$0) {
      dly $$1 = dlz.a($$0.b(dmo.z));
      dly $$2 = dlz.a($$0.b(dmo.A), 0.0, -0.1);
      return dlz.d(dlz.b($$2, dlz.a($$1.d(), dlz.a(-0.4))));
   }

   private static dly d(ic<dly> $$0, ic<ebj.a> $$1) {
      dly $$2 = dlz.d(dlz.b($$1.b(dmo.x), 2.0, 1.0));
      dly $$3 = dlz.a($$1.b(dmo.y), -0.065, -0.088);
      dly $$4 = dlz.a($$2, $$1.b(dmo.v), dlz.z.a.a);
      dly $$5 = dlz.a($$2, $$1.b(dmo.w), dlz.z.a.a);
      dly $$6 = dlz.a(dlz.d($$4, $$5), $$3).a(-1.0, 1.0);
      dly $$7 = a($$0, N);
      dly $$8 = dlz.b($$1.b(dmo.B), 0.75, 0.5);
      dly $$9 = dlz.a(dlz.a($$8, dlz.a(0.37)), dlz.a(-10, 30, 0.3, 0.0));
      return dlz.d(dlz.c($$9, dlz.a($$7, $$6)));
   }

   private static dly e(ic<dly> $$0, ic<ebj.a> $$1) {
      dly $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dly $$6 = a($$2, dlz.b($$1.b(dmo.I), 1.0, 1.0), -60, 320, -1);
      dly $$7 = a($$2, dlz.a($$1.b(dmo.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dly $$9 = a($$2, dlz.b($$1.b(dmo.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dly $$10 = a($$2, dlz.b($$1.b(dmo.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dly $$11 = dlz.b(dlz.a(1.5), dlz.d($$9.d(), $$10.d()));
      return dlz.a($$6, -1000000.0, 0.0, dlz.a(64.0), dlz.a($$7, $$11));
   }

   private static dly c(ic<ebj.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dly $$3 = dlz.b($$0.b(dmo.o), 25.0, 0.3);
      dly $$4 = dlz.a($$0.b(dmo.p), 0.0, -2.0);
      dly $$5 = dlz.a($$0.b(dmo.q), 0.0, 1.1);
      dly $$6 = dlz.a(dlz.b($$3, dlz.a(2.0)), $$4);
      return dlz.d(dlz.b($$6, $$5.f()));
   }

   private static dly f(ic<dly> $$0, ic<ebj.a> $$1) {
      dly $$2 = dlz.b($$1.b(dmo.t), 2.0, 1.0);
      dly $$3 = dlz.a($$2, $$1.b(dmo.r), dlz.z.a.b);
      dly $$4 = dlz.a($$1.b(dmo.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dly $$5 = a($$0, R);
      dly $$6 = dlz.a($$4, dlz.a(-64, 320, 8.0, -40.0)).d();
      dly $$7 = dlz.a($$6, $$5).f();
      double $$8 = 0.083;
      dly $$9 = dlz.a($$3, dlz.b(dlz.a(0.083), $$5));
      return dlz.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dly a(ic<dly> $$0, ic<ebj.a> $$1, dly $$2) {
      dly $$3 = a($$0, S);
      dly $$4 = a($$0, N);
      dly $$5 = dlz.a($$1.b(dmo.C), 8.0);
      dly $$6 = dlz.b(dlz.a(4.0), $$5.e());
      dly $$7 = dlz.a($$1.b(dmo.D), 0.6666666666666666);
      dly $$8 = dlz.a(dlz.a(dlz.a(0.27), $$7).a(-1.0, 1.0), dlz.a(dlz.a(1.5), dlz.b(dlz.a(-0.64), $$2)).a(0.0, 0.5));
      dly $$9 = dlz.a($$6, $$8);
      dly $$10 = dlz.c(dlz.c($$9, a($$0, O)), dlz.a($$3, $$4));
      dly $$11 = a($$0, Q);
      dly $$12 = dlz.a($$11, -1000000.0, 0.03, dlz.a(-1000000.0), $$11);
      return dlz.d($$10, $$12);
   }

   private static dly b(dly $$0) {
      dly $$1 = dlz.f($$0);
      return dlz.b(dlz.a($$1), dlz.a(0.64)).i();
   }

   protected static dml a(ic<dly> $$0, ic<ebj.a> $$1, boolean $$2, boolean $$3) {
      dly $$4 = dlz.a($$1.b(dmo.k), 0.5);
      dly $$5 = dlz.a($$1.b(dmo.l), 0.67);
      dly $$6 = dlz.a($$1.b(dmo.n), 0.7142857142857143);
      dly $$7 = dlz.a($$1.b(dmo.m));
      dly $$8 = a($$0, w);
      dly $$9 = a($$0, x);
      dly $$10 = dlz.a($$8, $$9, 0.25, $$1.b($$2 ? dmo.e : dmo.a));
      dly $$11 = dlz.a($$8, $$9, 0.25, $$1.b($$2 ? dmo.f : dmo.b));
      dly $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dly $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dly $$14 = b(dlz.c($$12), $$13);
      dly $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dly $$16 = dlz.c($$15, dlz.b(dlz.a(5.0), a($$0, O)));
      dly $$17 = dlz.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dly $$18 = dlz.c(b(a($$3, $$17)), a($$0, P));
      dly $$19 = a($$0, v);
      int $$20 = Stream.of(dmp.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dkf.e * 2);
      int $$21 = Stream.of(dmp.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dkf.e * 2);
      dly $$22 = a($$19, dlz.b($$1.b(dmo.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dly $$24 = a($$19, dlz.b($$1.b(dmo.F), 4.0, 4.0), $$20, $$21, 0).d();
      dly $$25 = a($$19, dlz.b($$1.b(dmo.G), 4.0, 4.0), $$20, $$21, 0).d();
      dly $$26 = dlz.a(dlz.a(-0.08F), dlz.d($$24, $$25));
      dly $$27 = dlz.a($$1.b(dmo.H));
      return new dml(
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
         a($$3, dlz.a($$14, dlz.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dml b(ic<dly> $$0, ic<ebj.a> $$1, dly $$2) {
      dly $$3 = a($$0, w);
      dly $$4 = a($$0, x);
      dly $$5 = dlz.a($$3, $$4, 0.25, $$1.b(dmo.a));
      dly $$6 = dlz.a($$3, $$4, 0.25, $$1.b(dmo.b));
      dly $$7 = b($$2);
      return new dml(dlz.a(), dlz.a(), dlz.a(), dlz.a(), $$5, $$6, dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), $$7, dlz.a(), dlz.a(), dlz.a());
   }

   private static dly a(boolean $$0, dly $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dly a(ic<dly> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dly a(dly $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dml a(ic<dly> $$0, ic<ebj.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dml b(ic<dly> $$0, ic<ebj.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dml c(ic<dly> $$0, ic<ebj.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dly c(dly $$0) {
      return a($$0, 0, 128);
   }

   protected static dml a(ic<dly> $$0) {
      dly $$1 = dlz.c(dlz.a(0L));
      dly $$2 = b(c(a($$0, M)));
      return new dml(
         dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), $$1, dlz.a(), dlz.a(), c(dlz.a($$1, dlz.a(-0.703125))), $$2, dlz.a(), dlz.a(), dlz.a()
      );
   }

   protected static dml a() {
      return new dml(dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a(), dlz.a());
   }

   private static dly a(dly $$0, dly $$1) {
      dly $$2 = dlz.a(dlz.b(), $$1, $$0);
      return dlz.b(dlz.c($$2));
   }

   private static dly b(dly $$0, dly $$1) {
      dly $$2 = dlz.b($$1, $$0);
      return dlz.b(dlz.a(4.0), $$2.h());
   }

   private static dly a(dly $$0, dly $$1, int $$2, int $$3, int $$4) {
      return dlz.a(dlz.a($$0, (double)$$2, (double)($$3 + 1), $$1, dlz.a((double)$$4)));
   }

   private static dly a(dly $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dly $$10 = dlz.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dly $$9 = dlz.a($$10, $$5, $$0);
      dly $$11 = dlz.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dlz.a($$11, $$8, $$9);
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
