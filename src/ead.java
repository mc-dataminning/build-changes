import java.util.stream.Stream;

public class ead {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dzp s = dzq.a(10.0);
   private static final dzp t = dzq.a();
   private static final ala<dzp> u = a("zero");
   private static final ala<dzp> v = a("y");
   private static final ala<dzp> w = a("shift_x");
   private static final ala<dzp> x = a("shift_z");
   private static final ala<dzp> y = a("overworld/base_3d_noise");
   private static final ala<dzp> z = a("nether/base_3d_noise");
   private static final ala<dzp> A = a("end/base_3d_noise");
   public static final ala<dzp> d = a("overworld/continents");
   public static final ala<dzp> e = a("overworld/erosion");
   public static final ala<dzp> f = a("overworld/ridges");
   public static final ala<dzp> g = a("overworld/ridges_folded");
   public static final ala<dzp> h = a("overworld/offset");
   public static final ala<dzp> i = a("overworld/factor");
   public static final ala<dzp> j = a("overworld/jaggedness");
   public static final ala<dzp> k = a("overworld/depth");
   private static final ala<dzp> B = a("overworld/sloped_cheese");
   public static final ala<dzp> l = a("overworld_large_biomes/continents");
   public static final ala<dzp> m = a("overworld_large_biomes/erosion");
   private static final ala<dzp> C = a("overworld_large_biomes/offset");
   private static final ala<dzp> D = a("overworld_large_biomes/factor");
   private static final ala<dzp> E = a("overworld_large_biomes/jaggedness");
   private static final ala<dzp> F = a("overworld_large_biomes/depth");
   private static final ala<dzp> G = a("overworld_large_biomes/sloped_cheese");
   private static final ala<dzp> H = a("overworld_amplified/offset");
   private static final ala<dzp> I = a("overworld_amplified/factor");
   private static final ala<dzp> J = a("overworld_amplified/jaggedness");
   private static final ala<dzp> K = a("overworld_amplified/depth");
   private static final ala<dzp> L = a("overworld_amplified/sloped_cheese");
   private static final ala<dzp> M = a("end/sloped_cheese");
   private static final ala<dzp> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ala<dzp> O = a("overworld/caves/entrances");
   private static final ala<dzp> P = a("overworld/caves/noodle");
   private static final ala<dzp> Q = a("overworld/caves/pillars");
   private static final ala<dzp> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ala<dzp> S = a("overworld/caves/spaghetti_2d");

   private static ala<dzp> a(String $$0) {
      return ala.a(lv.aJ, alb.b($$0));
   }

   public static jn<? extends dzp> a(qt<dzp> $$0) {
      jo<epe.a> $$1 = $$0.a(lv.aP);
      jo<dzp> $$2 = $$0.a(lv.aJ);
      $$0.a(u, dzq.a());
      int $$3 = dxw.e * 2;
      int $$4 = dxw.d * 2;
      $$0.a(v, dzq.a($$3, $$4, (double)$$3, (double)$$4));
      dzp $$5 = a($$0, w, dzq.b(dzq.c(dzq.b($$1.b(eaf.j)))));
      dzp $$6 = a($$0, x, dzq.b(dzq.c(dzq.c($$1.b(eaf.j)))));
      $$0.a(y, epb.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, epb.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, epb.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jn<dzp> $$7 = $$0.a(d, dzq.b(dzq.a($$5, $$6, 0.25, $$1.b(eaf.c))));
      jn<dzp> $$8 = $$0.a(e, dzq.b(dzq.a($$5, $$6, 0.25, $$1.b(eaf.d))));
      dzp $$9 = a($$0, f, dzq.b(dzq.a($$5, $$6, 0.25, $$1.b(eaf.i))));
      $$0.a(g, a($$9));
      dzp $$10 = dzq.b($$1.b(eaf.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jn<dzp> $$11 = $$0.a(l, dzq.b(dzq.a($$5, $$6, 0.25, $$1.b(eaf.g))));
      jn<dzp> $$12 = $$0.a(m, dzq.b(dzq.a($$5, $$6, 0.25, $$1.b(eaf.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dzq.a(dzq.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dzq.d(dzq.a($$1.b(eaf.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qt<dzp> $$0, jo<dzp> $$1, dzp $$2, jn<dzp> $$3, jn<dzp> $$4, ala<dzp> $$5, ala<dzp> $$6, ala<dzp> $$7, ala<dzp> $$8, ala<dzp> $$9, boolean $$10
   ) {
      dzq.w.a $$11 = new dzq.w.a($$3);
      dzq.w.a $$12 = new dzq.w.a($$4);
      dzq.w.a $$13 = new dzq.w.a($$1.b(f));
      dzq.w.a $$14 = new dzq.w.a($$1.b(g));
      dzp $$15 = a($$0, $$5, a(dzq.a(dzq.a(-0.50375F), dzq.a(ri.a($$11, $$12, $$14, $$10))), dzq.c()));
      dzp $$16 = a($$0, $$6, a(dzq.a(ri.a($$11, $$12, $$13, $$14, $$10)), s));
      dzp $$17 = a($$0, $$8, dzq.a(dzq.a(-64, 320, 1.5, -1.5), $$15));
      dzp $$18 = a($$0, $$7, a(dzq.a(ri.b($$11, $$12, $$13, $$14, $$10)), t));
      dzp $$19 = dzq.b($$18, $$2.g());
      dzp $$20 = b($$16, dzq.a($$17, $$19));
      $$0.a($$9, dzq.a($$20, a($$1, y)));
   }

   private static dzp a(qt<dzp> $$0, ala<dzp> $$1, dzp $$2) {
      return new dzq.j($$0.a($$1, $$2));
   }

   private static dzp a(jo<dzp> $$0, ala<dzp> $$1) {
      return new dzq.j($$0.b($$1));
   }

   private static dzp a(dzp $$0) {
      return dzq.b(dzq.a(dzq.a($$0.d(), dzq.a(-0.6666666666666666)).d(), dzq.a(-0.3333333333333333)), dzq.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dzp b(jo<epe.a> $$0) {
      dzp $$1 = dzq.a($$0.b(eaf.z));
      dzp $$2 = dzq.a($$0.b(eaf.A), 0.0, -0.1);
      return dzq.d(dzq.b($$2, dzq.a($$1.d(), dzq.a(-0.4))));
   }

   private static dzp d(jo<dzp> $$0, jo<epe.a> $$1) {
      dzp $$2 = dzq.d(dzq.b($$1.b(eaf.x), 2.0, 1.0));
      dzp $$3 = dzq.a($$1.b(eaf.y), -0.065, -0.088);
      dzp $$4 = dzq.a($$2, $$1.b(eaf.v), dzq.z.a.a);
      dzp $$5 = dzq.a($$2, $$1.b(eaf.w), dzq.z.a.a);
      dzp $$6 = dzq.a(dzq.d($$4, $$5), $$3).a(-1.0, 1.0);
      dzp $$7 = a($$0, N);
      dzp $$8 = dzq.b($$1.b(eaf.B), 0.75, 0.5);
      dzp $$9 = dzq.a(dzq.a($$8, dzq.a(0.37)), dzq.a(-10, 30, 0.3, 0.0));
      return dzq.d(dzq.c($$9, dzq.a($$7, $$6)));
   }

   private static dzp e(jo<dzp> $$0, jo<epe.a> $$1) {
      dzp $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dzp $$6 = a($$2, dzq.b($$1.b(eaf.I), 1.0, 1.0), -60, 320, -1);
      dzp $$7 = a($$2, dzq.a($$1.b(eaf.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dzp $$9 = a($$2, dzq.b($$1.b(eaf.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dzp $$10 = a($$2, dzq.b($$1.b(eaf.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dzp $$11 = dzq.b(dzq.a(1.5), dzq.d($$9.d(), $$10.d()));
      return dzq.a($$6, -1000000.0, 0.0, dzq.a(64.0), dzq.a($$7, $$11));
   }

   private static dzp c(jo<epe.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dzp $$3 = dzq.b($$0.b(eaf.o), 25.0, 0.3);
      dzp $$4 = dzq.a($$0.b(eaf.p), 0.0, -2.0);
      dzp $$5 = dzq.a($$0.b(eaf.q), 0.0, 1.1);
      dzp $$6 = dzq.a(dzq.b($$3, dzq.a(2.0)), $$4);
      return dzq.d(dzq.b($$6, $$5.f()));
   }

   private static dzp f(jo<dzp> $$0, jo<epe.a> $$1) {
      dzp $$2 = dzq.b($$1.b(eaf.t), 2.0, 1.0);
      dzp $$3 = dzq.a($$2, $$1.b(eaf.r), dzq.z.a.b);
      dzp $$4 = dzq.a($$1.b(eaf.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dzp $$5 = a($$0, R);
      dzp $$6 = dzq.a($$4, dzq.a(-64, 320, 8.0, -40.0)).d();
      dzp $$7 = dzq.a($$6, $$5).f();
      double $$8 = 0.083;
      dzp $$9 = dzq.a($$3, dzq.b(dzq.a(0.083), $$5));
      return dzq.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dzp a(jo<dzp> $$0, jo<epe.a> $$1, dzp $$2) {
      dzp $$3 = a($$0, S);
      dzp $$4 = a($$0, N);
      dzp $$5 = dzq.a($$1.b(eaf.C), 8.0);
      dzp $$6 = dzq.b(dzq.a(4.0), $$5.e());
      dzp $$7 = dzq.a($$1.b(eaf.D), 0.6666666666666666);
      dzp $$8 = dzq.a(dzq.a(dzq.a(0.27), $$7).a(-1.0, 1.0), dzq.a(dzq.a(1.5), dzq.b(dzq.a(-0.64), $$2)).a(0.0, 0.5));
      dzp $$9 = dzq.a($$6, $$8);
      dzp $$10 = dzq.c(dzq.c($$9, a($$0, O)), dzq.a($$3, $$4));
      dzp $$11 = a($$0, Q);
      dzp $$12 = dzq.a($$11, -1000000.0, 0.03, dzq.a(-1000000.0), $$11);
      return dzq.d($$10, $$12);
   }

   private static dzp b(dzp $$0) {
      dzp $$1 = dzq.f($$0);
      return dzq.b(dzq.a($$1), dzq.a(0.64)).i();
   }

   protected static eac a(jo<dzp> $$0, jo<epe.a> $$1, boolean $$2, boolean $$3) {
      dzp $$4 = dzq.a($$1.b(eaf.k), 0.5);
      dzp $$5 = dzq.a($$1.b(eaf.l), 0.67);
      dzp $$6 = dzq.a($$1.b(eaf.n), 0.7142857142857143);
      dzp $$7 = dzq.a($$1.b(eaf.m));
      dzp $$8 = a($$0, w);
      dzp $$9 = a($$0, x);
      dzp $$10 = dzq.a($$8, $$9, 0.25, $$1.b($$2 ? eaf.e : eaf.a));
      dzp $$11 = dzq.a($$8, $$9, 0.25, $$1.b($$2 ? eaf.f : eaf.b));
      dzp $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dzp $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dzp $$14 = b(dzq.c($$12), $$13);
      dzp $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dzp $$16 = dzq.c($$15, dzq.b(dzq.a(5.0), a($$0, O)));
      dzp $$17 = dzq.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dzp $$18 = dzq.c(b(a($$3, $$17)), a($$0, P));
      dzp $$19 = a($$0, v);
      int $$20 = Stream.of(eag.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dxw.e * 2);
      int $$21 = Stream.of(eag.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dxw.e * 2);
      dzp $$22 = a($$19, dzq.b($$1.b(eaf.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dzp $$24 = a($$19, dzq.b($$1.b(eaf.F), 4.0, 4.0), $$20, $$21, 0).d();
      dzp $$25 = a($$19, dzq.b($$1.b(eaf.G), 4.0, 4.0), $$20, $$21, 0).d();
      dzp $$26 = dzq.a(dzq.a(-0.08F), dzq.d($$24, $$25));
      dzp $$27 = dzq.a($$1.b(eaf.H));
      return new eac(
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
         a($$3, dzq.a($$14, dzq.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static eac b(jo<dzp> $$0, jo<epe.a> $$1, dzp $$2) {
      dzp $$3 = a($$0, w);
      dzp $$4 = a($$0, x);
      dzp $$5 = dzq.a($$3, $$4, 0.25, $$1.b(eaf.a));
      dzp $$6 = dzq.a($$3, $$4, 0.25, $$1.b(eaf.b));
      dzp $$7 = b($$2);
      return new eac(dzq.a(), dzq.a(), dzq.a(), dzq.a(), $$5, $$6, dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), $$7, dzq.a(), dzq.a(), dzq.a());
   }

   private static dzp a(boolean $$0, dzp $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dzp a(jo<dzp> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dzp a(dzp $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static eac a(jo<dzp> $$0, jo<epe.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static eac b(jo<dzp> $$0, jo<epe.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static eac c(jo<dzp> $$0, jo<epe.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dzp c(dzp $$0) {
      return a($$0, 0, 128);
   }

   protected static eac a(jo<dzp> $$0) {
      dzp $$1 = dzq.c(dzq.a(0L));
      dzp $$2 = b(c(a($$0, M)));
      return new eac(
         dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), $$1, dzq.a(), dzq.a(), c(dzq.a($$1, dzq.a(-0.703125))), $$2, dzq.a(), dzq.a(), dzq.a()
      );
   }

   protected static eac a() {
      return new eac(dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a(), dzq.a());
   }

   private static dzp a(dzp $$0, dzp $$1) {
      dzp $$2 = dzq.a(dzq.b(), $$1, $$0);
      return dzq.b(dzq.c($$2));
   }

   private static dzp b(dzp $$0, dzp $$1) {
      dzp $$2 = dzq.b($$1, $$0);
      return dzq.b(dzq.a(4.0), $$2.h());
   }

   private static dzp a(dzp $$0, dzp $$1, int $$2, int $$3, int $$4) {
      return dzq.a(dzq.a($$0, (double)$$2, (double)($$3 + 1), $$1, dzq.a((double)$$4)));
   }

   private static dzp a(dzp $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dzp $$10 = dzq.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dzp $$9 = dzq.a($$10, $$5, $$0);
      dzp $$11 = dzq.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dzq.a($$11, $$8, $$9);
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
