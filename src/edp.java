import java.util.stream.Stream;

public class edp {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final edb s = edc.a(10.0);
   private static final edb t = edc.a();
   private static final aly<edb> u = a("zero");
   private static final aly<edb> v = a("y");
   private static final aly<edb> w = a("shift_x");
   private static final aly<edb> x = a("shift_z");
   private static final aly<edb> y = a("overworld/base_3d_noise");
   private static final aly<edb> z = a("nether/base_3d_noise");
   private static final aly<edb> A = a("end/base_3d_noise");
   public static final aly<edb> d = a("overworld/continents");
   public static final aly<edb> e = a("overworld/erosion");
   public static final aly<edb> f = a("overworld/ridges");
   public static final aly<edb> g = a("overworld/ridges_folded");
   public static final aly<edb> h = a("overworld/offset");
   public static final aly<edb> i = a("overworld/factor");
   public static final aly<edb> j = a("overworld/jaggedness");
   public static final aly<edb> k = a("overworld/depth");
   private static final aly<edb> B = a("overworld/sloped_cheese");
   public static final aly<edb> l = a("overworld_large_biomes/continents");
   public static final aly<edb> m = a("overworld_large_biomes/erosion");
   private static final aly<edb> C = a("overworld_large_biomes/offset");
   private static final aly<edb> D = a("overworld_large_biomes/factor");
   private static final aly<edb> E = a("overworld_large_biomes/jaggedness");
   private static final aly<edb> F = a("overworld_large_biomes/depth");
   private static final aly<edb> G = a("overworld_large_biomes/sloped_cheese");
   private static final aly<edb> H = a("overworld_amplified/offset");
   private static final aly<edb> I = a("overworld_amplified/factor");
   private static final aly<edb> J = a("overworld_amplified/jaggedness");
   private static final aly<edb> K = a("overworld_amplified/depth");
   private static final aly<edb> L = a("overworld_amplified/sloped_cheese");
   private static final aly<edb> M = a("end/sloped_cheese");
   private static final aly<edb> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aly<edb> O = a("overworld/caves/entrances");
   private static final aly<edb> P = a("overworld/caves/noodle");
   private static final aly<edb> Q = a("overworld/caves/pillars");
   private static final aly<edb> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aly<edb> S = a("overworld/caves/spaghetti_2d");

   private static aly<edb> a(String $$0) {
      return aly.a(mb.aL, alz.b($$0));
   }

   public static jq<? extends edb> a(rk<edb> $$0) {
      jr<ess.a> $$1 = $$0.a(mb.aR);
      jr<edb> $$2 = $$0.a(mb.aL);
      $$0.a(u, edc.a());
      int $$3 = ebi.e * 2;
      int $$4 = ebi.d * 2;
      $$0.a(v, edc.a($$3, $$4, (double)$$3, (double)$$4));
      edb $$5 = a($$0, w, edc.b(edc.c(edc.b($$1.b(edr.j)))));
      edb $$6 = a($$0, x, edc.b(edc.c(edc.c($$1.b(edr.j)))));
      $$0.a(y, esp.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, esp.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, esp.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jq<edb> $$7 = $$0.a(d, edc.b(edc.a($$5, $$6, 0.25, $$1.b(edr.c))));
      jq<edb> $$8 = $$0.a(e, edc.b(edc.a($$5, $$6, 0.25, $$1.b(edr.d))));
      edb $$9 = a($$0, f, edc.b(edc.a($$5, $$6, 0.25, $$1.b(edr.i))));
      $$0.a(g, a($$9));
      edb $$10 = edc.b($$1.b(edr.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jq<edb> $$11 = $$0.a(l, edc.b(edc.a($$5, $$6, 0.25, $$1.b(edr.g))));
      jq<edb> $$12 = $$0.a(m, edc.b(edc.a($$5, $$6, 0.25, $$1.b(edr.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, edc.a(edc.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, edc.d(edc.a($$1.b(edr.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      rk<edb> $$0, jr<edb> $$1, edb $$2, jq<edb> $$3, jq<edb> $$4, aly<edb> $$5, aly<edb> $$6, aly<edb> $$7, aly<edb> $$8, aly<edb> $$9, boolean $$10
   ) {
      edc.w.a $$11 = new edc.w.a($$3);
      edc.w.a $$12 = new edc.w.a($$4);
      edc.w.a $$13 = new edc.w.a($$1.b(f));
      edc.w.a $$14 = new edc.w.a($$1.b(g));
      edb $$15 = a($$0, $$5, a(edc.a(edc.a(-0.50375F), edc.a(rz.a($$11, $$12, $$14, $$10))), edc.c()));
      edb $$16 = a($$0, $$6, a(edc.a(rz.a($$11, $$12, $$13, $$14, $$10)), s));
      edb $$17 = a($$0, $$8, edc.a(edc.a(-64, 320, 1.5, -1.5), $$15));
      edb $$18 = a($$0, $$7, a(edc.a(rz.b($$11, $$12, $$13, $$14, $$10)), t));
      edb $$19 = edc.b($$18, $$2.g());
      edb $$20 = b($$16, edc.a($$17, $$19));
      $$0.a($$9, edc.a($$20, a($$1, y)));
   }

   private static edb a(rk<edb> $$0, aly<edb> $$1, edb $$2) {
      return new edc.j($$0.a($$1, $$2));
   }

   private static edb a(jr<edb> $$0, aly<edb> $$1) {
      return new edc.j($$0.b($$1));
   }

   private static edb a(edb $$0) {
      return edc.b(edc.a(edc.a($$0.d(), edc.a(-0.6666666666666666)).d(), edc.a(-0.3333333333333333)), edc.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static edb b(jr<ess.a> $$0) {
      edb $$1 = edc.a($$0.b(edr.z));
      edb $$2 = edc.a($$0.b(edr.A), 0.0, -0.1);
      return edc.d(edc.b($$2, edc.a($$1.d(), edc.a(-0.4))));
   }

   private static edb d(jr<edb> $$0, jr<ess.a> $$1) {
      edb $$2 = edc.d(edc.b($$1.b(edr.x), 2.0, 1.0));
      edb $$3 = edc.a($$1.b(edr.y), -0.065, -0.088);
      edb $$4 = edc.a($$2, $$1.b(edr.v), edc.z.a.a);
      edb $$5 = edc.a($$2, $$1.b(edr.w), edc.z.a.a);
      edb $$6 = edc.a(edc.d($$4, $$5), $$3).a(-1.0, 1.0);
      edb $$7 = a($$0, N);
      edb $$8 = edc.b($$1.b(edr.B), 0.75, 0.5);
      edb $$9 = edc.a(edc.a($$8, edc.a(0.37)), edc.a(-10, 30, 0.3, 0.0));
      return edc.d(edc.c($$9, edc.a($$7, $$6)));
   }

   private static edb e(jr<edb> $$0, jr<ess.a> $$1) {
      edb $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      edb $$6 = a($$2, edc.b($$1.b(edr.I), 1.0, 1.0), -60, 320, -1);
      edb $$7 = a($$2, edc.a($$1.b(edr.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      edb $$9 = a($$2, edc.b($$1.b(edr.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      edb $$10 = a($$2, edc.b($$1.b(edr.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      edb $$11 = edc.b(edc.a(1.5), edc.d($$9.d(), $$10.d()));
      return edc.a($$6, -1000000.0, 0.0, edc.a(64.0), edc.a($$7, $$11));
   }

   private static edb c(jr<ess.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      edb $$3 = edc.b($$0.b(edr.o), 25.0, 0.3);
      edb $$4 = edc.a($$0.b(edr.p), 0.0, -2.0);
      edb $$5 = edc.a($$0.b(edr.q), 0.0, 1.1);
      edb $$6 = edc.a(edc.b($$3, edc.a(2.0)), $$4);
      return edc.d(edc.b($$6, $$5.f()));
   }

   private static edb f(jr<edb> $$0, jr<ess.a> $$1) {
      edb $$2 = edc.b($$1.b(edr.t), 2.0, 1.0);
      edb $$3 = edc.a($$2, $$1.b(edr.r), edc.z.a.b);
      edb $$4 = edc.a($$1.b(edr.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      edb $$5 = a($$0, R);
      edb $$6 = edc.a($$4, edc.a(-64, 320, 8.0, -40.0)).d();
      edb $$7 = edc.a($$6, $$5).f();
      double $$8 = 0.083;
      edb $$9 = edc.a($$3, edc.b(edc.a(0.083), $$5));
      return edc.d($$9, $$7).a(-1.0, 1.0);
   }

   private static edb a(jr<edb> $$0, jr<ess.a> $$1, edb $$2) {
      edb $$3 = a($$0, S);
      edb $$4 = a($$0, N);
      edb $$5 = edc.a($$1.b(edr.C), 8.0);
      edb $$6 = edc.b(edc.a(4.0), $$5.e());
      edb $$7 = edc.a($$1.b(edr.D), 0.6666666666666666);
      edb $$8 = edc.a(edc.a(edc.a(0.27), $$7).a(-1.0, 1.0), edc.a(edc.a(1.5), edc.b(edc.a(-0.64), $$2)).a(0.0, 0.5));
      edb $$9 = edc.a($$6, $$8);
      edb $$10 = edc.c(edc.c($$9, a($$0, O)), edc.a($$3, $$4));
      edb $$11 = a($$0, Q);
      edb $$12 = edc.a($$11, -1000000.0, 0.03, edc.a(-1000000.0), $$11);
      return edc.d($$10, $$12);
   }

   private static edb b(edb $$0) {
      edb $$1 = edc.f($$0);
      return edc.b(edc.a($$1), edc.a(0.64)).i();
   }

   protected static edo a(jr<edb> $$0, jr<ess.a> $$1, boolean $$2, boolean $$3) {
      edb $$4 = edc.a($$1.b(edr.k), 0.5);
      edb $$5 = edc.a($$1.b(edr.l), 0.67);
      edb $$6 = edc.a($$1.b(edr.n), 0.7142857142857143);
      edb $$7 = edc.a($$1.b(edr.m));
      edb $$8 = a($$0, w);
      edb $$9 = a($$0, x);
      edb $$10 = edc.a($$8, $$9, 0.25, $$1.b($$2 ? edr.e : edr.a));
      edb $$11 = edc.a($$8, $$9, 0.25, $$1.b($$2 ? edr.f : edr.b));
      edb $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      edb $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      edb $$14 = b(edc.c($$12), $$13);
      edb $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      edb $$16 = edc.c($$15, edc.b(edc.a(5.0), a($$0, O)));
      edb $$17 = edc.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      edb $$18 = edc.c(b(a($$3, $$17)), a($$0, P));
      edb $$19 = a($$0, v);
      int $$20 = Stream.of(eds.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-ebi.e * 2);
      int $$21 = Stream.of(eds.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-ebi.e * 2);
      edb $$22 = a($$19, edc.b($$1.b(edr.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      edb $$24 = a($$19, edc.b($$1.b(edr.F), 4.0, 4.0), $$20, $$21, 0).d();
      edb $$25 = a($$19, edc.b($$1.b(edr.G), 4.0, 4.0), $$20, $$21, 0).d();
      edb $$26 = edc.a(edc.a(-0.08F), edc.d($$24, $$25));
      edb $$27 = edc.a($$1.b(edr.H));
      return new edo(
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
         a($$3, edc.a($$14, edc.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static edo b(jr<edb> $$0, jr<ess.a> $$1, edb $$2) {
      edb $$3 = a($$0, w);
      edb $$4 = a($$0, x);
      edb $$5 = edc.a($$3, $$4, 0.25, $$1.b(edr.a));
      edb $$6 = edc.a($$3, $$4, 0.25, $$1.b(edr.b));
      edb $$7 = b($$2);
      return new edo(edc.a(), edc.a(), edc.a(), edc.a(), $$5, $$6, edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), $$7, edc.a(), edc.a(), edc.a());
   }

   private static edb a(boolean $$0, edb $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static edb a(jr<edb> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static edb a(edb $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static edo a(jr<edb> $$0, jr<ess.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static edo b(jr<edb> $$0, jr<ess.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static edo c(jr<edb> $$0, jr<ess.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static edb c(edb $$0) {
      return a($$0, 0, 128);
   }

   protected static edo a(jr<edb> $$0) {
      edb $$1 = edc.c(edc.a(0L));
      edb $$2 = b(c(a($$0, M)));
      return new edo(
         edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), $$1, edc.a(), edc.a(), c(edc.a($$1, edc.a(-0.703125))), $$2, edc.a(), edc.a(), edc.a()
      );
   }

   protected static edo a() {
      return new edo(edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), edc.a(), edc.a());
   }

   private static edb a(edb $$0, edb $$1) {
      edb $$2 = edc.a(edc.b(), $$1, $$0);
      return edc.b(edc.c($$2));
   }

   private static edb b(edb $$0, edb $$1) {
      edb $$2 = edc.b($$1, $$0);
      return edc.b(edc.a(4.0), $$2.h());
   }

   private static edb a(edb $$0, edb $$1, int $$2, int $$3, int $$4) {
      return edc.a(edc.a($$0, (double)$$2, (double)($$3 + 1), $$1, edc.a((double)$$4)));
   }

   private static edb a(edb $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      edb $$10 = edc.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      edb $$9 = edc.a($$10, $$5, $$0);
      edb $$11 = edc.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return edc.a($$11, $$8, $$9);
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
