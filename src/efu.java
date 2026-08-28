import java.util.stream.Stream;

public class efu {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final efg s = efh.a(10.0);
   private static final efg t = efh.a();
   private static final ald<efg> u = a("zero");
   private static final ald<efg> v = a("y");
   private static final ald<efg> w = a("shift_x");
   private static final ald<efg> x = a("shift_z");
   private static final ald<efg> y = a("overworld/base_3d_noise");
   private static final ald<efg> z = a("nether/base_3d_noise");
   private static final ald<efg> A = a("end/base_3d_noise");
   public static final ald<efg> d = a("overworld/continents");
   public static final ald<efg> e = a("overworld/erosion");
   public static final ald<efg> f = a("overworld/ridges");
   public static final ald<efg> g = a("overworld/ridges_folded");
   public static final ald<efg> h = a("overworld/offset");
   public static final ald<efg> i = a("overworld/factor");
   public static final ald<efg> j = a("overworld/jaggedness");
   public static final ald<efg> k = a("overworld/depth");
   private static final ald<efg> B = a("overworld/sloped_cheese");
   public static final ald<efg> l = a("overworld_large_biomes/continents");
   public static final ald<efg> m = a("overworld_large_biomes/erosion");
   private static final ald<efg> C = a("overworld_large_biomes/offset");
   private static final ald<efg> D = a("overworld_large_biomes/factor");
   private static final ald<efg> E = a("overworld_large_biomes/jaggedness");
   private static final ald<efg> F = a("overworld_large_biomes/depth");
   private static final ald<efg> G = a("overworld_large_biomes/sloped_cheese");
   private static final ald<efg> H = a("overworld_amplified/offset");
   private static final ald<efg> I = a("overworld_amplified/factor");
   private static final ald<efg> J = a("overworld_amplified/jaggedness");
   private static final ald<efg> K = a("overworld_amplified/depth");
   private static final ald<efg> L = a("overworld_amplified/sloped_cheese");
   private static final ald<efg> M = a("end/sloped_cheese");
   private static final ald<efg> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ald<efg> O = a("overworld/caves/entrances");
   private static final ald<efg> P = a("overworld/caves/noodle");
   private static final ald<efg> Q = a("overworld/caves/pillars");
   private static final ald<efg> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ald<efg> S = a("overworld/caves/spaghetti_2d");

   private static ald<efg> a(String $$0) {
      return ald.a(mg.aM, ale.b($$0));
   }

   public static je<? extends efg> a(qh<efg> $$0) {
      jf<euy.a> $$1 = $$0.a(mg.aW);
      jf<efg> $$2 = $$0.a(mg.aM);
      $$0.a(u, efh.a());
      int $$3 = edl.e * 2;
      int $$4 = edl.d * 2;
      $$0.a(v, efh.a($$3, $$4, (double)$$3, (double)$$4));
      efg $$5 = a($$0, w, efh.b(efh.c(efh.b($$1.b(efw.j)))));
      efg $$6 = a($$0, x, efh.b(efh.c(efh.c($$1.b(efw.j)))));
      $$0.a(y, euv.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, euv.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, euv.a(0.25, 0.25, 80.0, 160.0, 4.0));
      je<efg> $$7 = $$0.a(d, efh.b(efh.a($$5, $$6, 0.25, $$1.b(efw.c))));
      je<efg> $$8 = $$0.a(e, efh.b(efh.a($$5, $$6, 0.25, $$1.b(efw.d))));
      efg $$9 = a($$0, f, efh.b(efh.a($$5, $$6, 0.25, $$1.b(efw.i))));
      $$0.a(g, a($$9));
      efg $$10 = efh.b($$1.b(efw.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      je<efg> $$11 = $$0.a(l, efh.b(efh.a($$5, $$6, 0.25, $$1.b(efw.g))));
      je<efg> $$12 = $$0.a(m, efh.b(efh.a($$5, $$6, 0.25, $$1.b(efw.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, efh.a(efh.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, efh.d(efh.a($$1.b(efw.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qh<efg> $$0, jf<efg> $$1, efg $$2, je<efg> $$3, je<efg> $$4, ald<efg> $$5, ald<efg> $$6, ald<efg> $$7, ald<efg> $$8, ald<efg> $$9, boolean $$10
   ) {
      efh.w.a $$11 = new efh.w.a($$3);
      efh.w.a $$12 = new efh.w.a($$4);
      efh.w.a $$13 = new efh.w.a($$1.b(f));
      efh.w.a $$14 = new efh.w.a($$1.b(g));
      efg $$15 = a($$0, $$5, a(efh.a(efh.a(-0.50375F), efh.a(qw.a($$11, $$12, $$14, $$10))), efh.c()));
      efg $$16 = a($$0, $$6, a(efh.a(qw.a($$11, $$12, $$13, $$14, $$10)), s));
      efg $$17 = a($$0, $$8, efh.a(efh.a(-64, 320, 1.5, -1.5), $$15));
      efg $$18 = a($$0, $$7, a(efh.a(qw.b($$11, $$12, $$13, $$14, $$10)), t));
      efg $$19 = efh.b($$18, $$2.g());
      efg $$20 = b($$16, efh.a($$17, $$19));
      $$0.a($$9, efh.a($$20, a($$1, y)));
   }

   private static efg a(qh<efg> $$0, ald<efg> $$1, efg $$2) {
      return new efh.j($$0.a($$1, $$2));
   }

   private static efg a(jf<efg> $$0, ald<efg> $$1) {
      return new efh.j($$0.b($$1));
   }

   private static efg a(efg $$0) {
      return efh.b(efh.a(efh.a($$0.d(), efh.a(-0.6666666666666666)).d(), efh.a(-0.3333333333333333)), efh.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static efg b(jf<euy.a> $$0) {
      efg $$1 = efh.a($$0.b(efw.z));
      efg $$2 = efh.a($$0.b(efw.A), 0.0, -0.1);
      return efh.d(efh.b($$2, efh.a($$1.d(), efh.a(-0.4))));
   }

   private static efg d(jf<efg> $$0, jf<euy.a> $$1) {
      efg $$2 = efh.d(efh.b($$1.b(efw.x), 2.0, 1.0));
      efg $$3 = efh.a($$1.b(efw.y), -0.065, -0.088);
      efg $$4 = efh.a($$2, $$1.b(efw.v), efh.z.a.a);
      efg $$5 = efh.a($$2, $$1.b(efw.w), efh.z.a.a);
      efg $$6 = efh.a(efh.d($$4, $$5), $$3).a(-1.0, 1.0);
      efg $$7 = a($$0, N);
      efg $$8 = efh.b($$1.b(efw.B), 0.75, 0.5);
      efg $$9 = efh.a(efh.a($$8, efh.a(0.37)), efh.a(-10, 30, 0.3, 0.0));
      return efh.d(efh.c($$9, efh.a($$7, $$6)));
   }

   private static efg e(jf<efg> $$0, jf<euy.a> $$1) {
      efg $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      efg $$6 = a($$2, efh.b($$1.b(efw.I), 1.0, 1.0), -60, 320, -1);
      efg $$7 = a($$2, efh.a($$1.b(efw.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      efg $$9 = a($$2, efh.b($$1.b(efw.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      efg $$10 = a($$2, efh.b($$1.b(efw.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      efg $$11 = efh.b(efh.a(1.5), efh.d($$9.d(), $$10.d()));
      return efh.a($$6, -1000000.0, 0.0, efh.a(64.0), efh.a($$7, $$11));
   }

   private static efg c(jf<euy.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      efg $$3 = efh.b($$0.b(efw.o), 25.0, 0.3);
      efg $$4 = efh.a($$0.b(efw.p), 0.0, -2.0);
      efg $$5 = efh.a($$0.b(efw.q), 0.0, 1.1);
      efg $$6 = efh.a(efh.b($$3, efh.a(2.0)), $$4);
      return efh.d(efh.b($$6, $$5.f()));
   }

   private static efg f(jf<efg> $$0, jf<euy.a> $$1) {
      efg $$2 = efh.b($$1.b(efw.t), 2.0, 1.0);
      efg $$3 = efh.a($$2, $$1.b(efw.r), efh.z.a.b);
      efg $$4 = efh.a($$1.b(efw.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      efg $$5 = a($$0, R);
      efg $$6 = efh.a($$4, efh.a(-64, 320, 8.0, -40.0)).d();
      efg $$7 = efh.a($$6, $$5).f();
      double $$8 = 0.083;
      efg $$9 = efh.a($$3, efh.b(efh.a(0.083), $$5));
      return efh.d($$9, $$7).a(-1.0, 1.0);
   }

   private static efg a(jf<efg> $$0, jf<euy.a> $$1, efg $$2) {
      efg $$3 = a($$0, S);
      efg $$4 = a($$0, N);
      efg $$5 = efh.a($$1.b(efw.C), 8.0);
      efg $$6 = efh.b(efh.a(4.0), $$5.e());
      efg $$7 = efh.a($$1.b(efw.D), 0.6666666666666666);
      efg $$8 = efh.a(efh.a(efh.a(0.27), $$7).a(-1.0, 1.0), efh.a(efh.a(1.5), efh.b(efh.a(-0.64), $$2)).a(0.0, 0.5));
      efg $$9 = efh.a($$6, $$8);
      efg $$10 = efh.c(efh.c($$9, a($$0, O)), efh.a($$3, $$4));
      efg $$11 = a($$0, Q);
      efg $$12 = efh.a($$11, -1000000.0, 0.03, efh.a(-1000000.0), $$11);
      return efh.d($$10, $$12);
   }

   private static efg b(efg $$0) {
      efg $$1 = efh.f($$0);
      return efh.b(efh.a($$1), efh.a(0.64)).i();
   }

   protected static eft a(jf<efg> $$0, jf<euy.a> $$1, boolean $$2, boolean $$3) {
      efg $$4 = efh.a($$1.b(efw.k), 0.5);
      efg $$5 = efh.a($$1.b(efw.l), 0.67);
      efg $$6 = efh.a($$1.b(efw.n), 0.7142857142857143);
      efg $$7 = efh.a($$1.b(efw.m));
      efg $$8 = a($$0, w);
      efg $$9 = a($$0, x);
      efg $$10 = efh.a($$8, $$9, 0.25, $$1.b($$2 ? efw.e : efw.a));
      efg $$11 = efh.a($$8, $$9, 0.25, $$1.b($$2 ? efw.f : efw.b));
      efg $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      efg $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      efg $$14 = b(efh.c($$12), $$13);
      efg $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      efg $$16 = efh.c($$15, efh.b(efh.a(5.0), a($$0, O)));
      efg $$17 = efh.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      efg $$18 = efh.c(b(a($$3, $$17)), a($$0, P));
      efg $$19 = a($$0, v);
      int $$20 = Stream.of(efx.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-edl.e * 2);
      int $$21 = Stream.of(efx.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-edl.e * 2);
      efg $$22 = a($$19, efh.b($$1.b(efw.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      efg $$24 = a($$19, efh.b($$1.b(efw.F), 4.0, 4.0), $$20, $$21, 0).d();
      efg $$25 = a($$19, efh.b($$1.b(efw.G), 4.0, 4.0), $$20, $$21, 0).d();
      efg $$26 = efh.a(efh.a(-0.08F), efh.d($$24, $$25));
      efg $$27 = efh.a($$1.b(efw.H));
      return new eft(
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
         a($$3, efh.a($$14, efh.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static eft b(jf<efg> $$0, jf<euy.a> $$1, efg $$2) {
      efg $$3 = a($$0, w);
      efg $$4 = a($$0, x);
      efg $$5 = efh.a($$3, $$4, 0.25, $$1.b(efw.a));
      efg $$6 = efh.a($$3, $$4, 0.25, $$1.b(efw.b));
      efg $$7 = b($$2);
      return new eft(efh.a(), efh.a(), efh.a(), efh.a(), $$5, $$6, efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), $$7, efh.a(), efh.a(), efh.a());
   }

   private static efg a(boolean $$0, efg $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static efg a(jf<efg> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static efg a(efg $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static eft a(jf<efg> $$0, jf<euy.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static eft b(jf<efg> $$0, jf<euy.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static eft c(jf<efg> $$0, jf<euy.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static efg c(efg $$0) {
      return a($$0, 0, 128);
   }

   protected static eft a(jf<efg> $$0) {
      efg $$1 = efh.c(efh.a(0L));
      efg $$2 = b(c(a($$0, M)));
      return new eft(
         efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), $$1, efh.a(), efh.a(), c(efh.a($$1, efh.a(-0.703125))), $$2, efh.a(), efh.a(), efh.a()
      );
   }

   protected static eft a() {
      return new eft(efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), efh.a(), efh.a());
   }

   private static efg a(efg $$0, efg $$1) {
      efg $$2 = efh.a(efh.b(), $$1, $$0);
      return efh.b(efh.c($$2));
   }

   private static efg b(efg $$0, efg $$1) {
      efg $$2 = efh.b($$1, $$0);
      return efh.b(efh.a(4.0), $$2.h());
   }

   private static efg a(efg $$0, efg $$1, int $$2, int $$3, int $$4) {
      return efh.a(efh.a($$0, (double)$$2, (double)($$3 + 1), $$1, efh.a((double)$$4)));
   }

   private static efg a(efg $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      efg $$10 = efh.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      efg $$9 = efh.a($$10, $$5, $$0);
      efg $$11 = efh.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return efh.a($$11, $$8, $$9);
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
