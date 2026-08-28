import java.util.stream.Stream;

public class edq {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final edc s = edd.a(10.0);
   private static final edc t = edd.a();
   private static final alo<edc> u = a("zero");
   private static final alo<edc> v = a("y");
   private static final alo<edc> w = a("shift_x");
   private static final alo<edc> x = a("shift_z");
   private static final alo<edc> y = a("overworld/base_3d_noise");
   private static final alo<edc> z = a("nether/base_3d_noise");
   private static final alo<edc> A = a("end/base_3d_noise");
   public static final alo<edc> d = a("overworld/continents");
   public static final alo<edc> e = a("overworld/erosion");
   public static final alo<edc> f = a("overworld/ridges");
   public static final alo<edc> g = a("overworld/ridges_folded");
   public static final alo<edc> h = a("overworld/offset");
   public static final alo<edc> i = a("overworld/factor");
   public static final alo<edc> j = a("overworld/jaggedness");
   public static final alo<edc> k = a("overworld/depth");
   private static final alo<edc> B = a("overworld/sloped_cheese");
   public static final alo<edc> l = a("overworld_large_biomes/continents");
   public static final alo<edc> m = a("overworld_large_biomes/erosion");
   private static final alo<edc> C = a("overworld_large_biomes/offset");
   private static final alo<edc> D = a("overworld_large_biomes/factor");
   private static final alo<edc> E = a("overworld_large_biomes/jaggedness");
   private static final alo<edc> F = a("overworld_large_biomes/depth");
   private static final alo<edc> G = a("overworld_large_biomes/sloped_cheese");
   private static final alo<edc> H = a("overworld_amplified/offset");
   private static final alo<edc> I = a("overworld_amplified/factor");
   private static final alo<edc> J = a("overworld_amplified/jaggedness");
   private static final alo<edc> K = a("overworld_amplified/depth");
   private static final alo<edc> L = a("overworld_amplified/sloped_cheese");
   private static final alo<edc> M = a("end/sloped_cheese");
   private static final alo<edc> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alo<edc> O = a("overworld/caves/entrances");
   private static final alo<edc> P = a("overworld/caves/noodle");
   private static final alo<edc> Q = a("overworld/caves/pillars");
   private static final alo<edc> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alo<edc> S = a("overworld/caves/spaghetti_2d");

   private static alo<edc> a(String $$0) {
      return alo.a(mb.aM, alp.b($$0));
   }

   public static jq<? extends edc> a(ra<edc> $$0) {
      jr<est.a> $$1 = $$0.a(mb.aS);
      jr<edc> $$2 = $$0.a(mb.aM);
      $$0.a(u, edd.a());
      int $$3 = ebj.e * 2;
      int $$4 = ebj.d * 2;
      $$0.a(v, edd.a($$3, $$4, (double)$$3, (double)$$4));
      edc $$5 = a($$0, w, edd.b(edd.c(edd.b($$1.b(eds.j)))));
      edc $$6 = a($$0, x, edd.b(edd.c(edd.c($$1.b(eds.j)))));
      $$0.a(y, esq.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, esq.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, esq.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jq<edc> $$7 = $$0.a(d, edd.b(edd.a($$5, $$6, 0.25, $$1.b(eds.c))));
      jq<edc> $$8 = $$0.a(e, edd.b(edd.a($$5, $$6, 0.25, $$1.b(eds.d))));
      edc $$9 = a($$0, f, edd.b(edd.a($$5, $$6, 0.25, $$1.b(eds.i))));
      $$0.a(g, a($$9));
      edc $$10 = edd.b($$1.b(eds.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jq<edc> $$11 = $$0.a(l, edd.b(edd.a($$5, $$6, 0.25, $$1.b(eds.g))));
      jq<edc> $$12 = $$0.a(m, edd.b(edd.a($$5, $$6, 0.25, $$1.b(eds.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, edd.a(edd.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, edd.d(edd.a($$1.b(eds.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      ra<edc> $$0, jr<edc> $$1, edc $$2, jq<edc> $$3, jq<edc> $$4, alo<edc> $$5, alo<edc> $$6, alo<edc> $$7, alo<edc> $$8, alo<edc> $$9, boolean $$10
   ) {
      edd.w.a $$11 = new edd.w.a($$3);
      edd.w.a $$12 = new edd.w.a($$4);
      edd.w.a $$13 = new edd.w.a($$1.b(f));
      edd.w.a $$14 = new edd.w.a($$1.b(g));
      edc $$15 = a($$0, $$5, a(edd.a(edd.a(-0.50375F), edd.a(rp.a($$11, $$12, $$14, $$10))), edd.c()));
      edc $$16 = a($$0, $$6, a(edd.a(rp.a($$11, $$12, $$13, $$14, $$10)), s));
      edc $$17 = a($$0, $$8, edd.a(edd.a(-64, 320, 1.5, -1.5), $$15));
      edc $$18 = a($$0, $$7, a(edd.a(rp.b($$11, $$12, $$13, $$14, $$10)), t));
      edc $$19 = edd.b($$18, $$2.g());
      edc $$20 = b($$16, edd.a($$17, $$19));
      $$0.a($$9, edd.a($$20, a($$1, y)));
   }

   private static edc a(ra<edc> $$0, alo<edc> $$1, edc $$2) {
      return new edd.j($$0.a($$1, $$2));
   }

   private static edc a(jr<edc> $$0, alo<edc> $$1) {
      return new edd.j($$0.b($$1));
   }

   private static edc a(edc $$0) {
      return edd.b(edd.a(edd.a($$0.d(), edd.a(-0.6666666666666666)).d(), edd.a(-0.3333333333333333)), edd.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static edc b(jr<est.a> $$0) {
      edc $$1 = edd.a($$0.b(eds.z));
      edc $$2 = edd.a($$0.b(eds.A), 0.0, -0.1);
      return edd.d(edd.b($$2, edd.a($$1.d(), edd.a(-0.4))));
   }

   private static edc d(jr<edc> $$0, jr<est.a> $$1) {
      edc $$2 = edd.d(edd.b($$1.b(eds.x), 2.0, 1.0));
      edc $$3 = edd.a($$1.b(eds.y), -0.065, -0.088);
      edc $$4 = edd.a($$2, $$1.b(eds.v), edd.z.a.a);
      edc $$5 = edd.a($$2, $$1.b(eds.w), edd.z.a.a);
      edc $$6 = edd.a(edd.d($$4, $$5), $$3).a(-1.0, 1.0);
      edc $$7 = a($$0, N);
      edc $$8 = edd.b($$1.b(eds.B), 0.75, 0.5);
      edc $$9 = edd.a(edd.a($$8, edd.a(0.37)), edd.a(-10, 30, 0.3, 0.0));
      return edd.d(edd.c($$9, edd.a($$7, $$6)));
   }

   private static edc e(jr<edc> $$0, jr<est.a> $$1) {
      edc $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      edc $$6 = a($$2, edd.b($$1.b(eds.I), 1.0, 1.0), -60, 320, -1);
      edc $$7 = a($$2, edd.a($$1.b(eds.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      edc $$9 = a($$2, edd.b($$1.b(eds.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      edc $$10 = a($$2, edd.b($$1.b(eds.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      edc $$11 = edd.b(edd.a(1.5), edd.d($$9.d(), $$10.d()));
      return edd.a($$6, -1000000.0, 0.0, edd.a(64.0), edd.a($$7, $$11));
   }

   private static edc c(jr<est.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      edc $$3 = edd.b($$0.b(eds.o), 25.0, 0.3);
      edc $$4 = edd.a($$0.b(eds.p), 0.0, -2.0);
      edc $$5 = edd.a($$0.b(eds.q), 0.0, 1.1);
      edc $$6 = edd.a(edd.b($$3, edd.a(2.0)), $$4);
      return edd.d(edd.b($$6, $$5.f()));
   }

   private static edc f(jr<edc> $$0, jr<est.a> $$1) {
      edc $$2 = edd.b($$1.b(eds.t), 2.0, 1.0);
      edc $$3 = edd.a($$2, $$1.b(eds.r), edd.z.a.b);
      edc $$4 = edd.a($$1.b(eds.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      edc $$5 = a($$0, R);
      edc $$6 = edd.a($$4, edd.a(-64, 320, 8.0, -40.0)).d();
      edc $$7 = edd.a($$6, $$5).f();
      double $$8 = 0.083;
      edc $$9 = edd.a($$3, edd.b(edd.a(0.083), $$5));
      return edd.d($$9, $$7).a(-1.0, 1.0);
   }

   private static edc a(jr<edc> $$0, jr<est.a> $$1, edc $$2) {
      edc $$3 = a($$0, S);
      edc $$4 = a($$0, N);
      edc $$5 = edd.a($$1.b(eds.C), 8.0);
      edc $$6 = edd.b(edd.a(4.0), $$5.e());
      edc $$7 = edd.a($$1.b(eds.D), 0.6666666666666666);
      edc $$8 = edd.a(edd.a(edd.a(0.27), $$7).a(-1.0, 1.0), edd.a(edd.a(1.5), edd.b(edd.a(-0.64), $$2)).a(0.0, 0.5));
      edc $$9 = edd.a($$6, $$8);
      edc $$10 = edd.c(edd.c($$9, a($$0, O)), edd.a($$3, $$4));
      edc $$11 = a($$0, Q);
      edc $$12 = edd.a($$11, -1000000.0, 0.03, edd.a(-1000000.0), $$11);
      return edd.d($$10, $$12);
   }

   private static edc b(edc $$0) {
      edc $$1 = edd.f($$0);
      return edd.b(edd.a($$1), edd.a(0.64)).i();
   }

   protected static edp a(jr<edc> $$0, jr<est.a> $$1, boolean $$2, boolean $$3) {
      edc $$4 = edd.a($$1.b(eds.k), 0.5);
      edc $$5 = edd.a($$1.b(eds.l), 0.67);
      edc $$6 = edd.a($$1.b(eds.n), 0.7142857142857143);
      edc $$7 = edd.a($$1.b(eds.m));
      edc $$8 = a($$0, w);
      edc $$9 = a($$0, x);
      edc $$10 = edd.a($$8, $$9, 0.25, $$1.b($$2 ? eds.e : eds.a));
      edc $$11 = edd.a($$8, $$9, 0.25, $$1.b($$2 ? eds.f : eds.b));
      edc $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      edc $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      edc $$14 = b(edd.c($$12), $$13);
      edc $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      edc $$16 = edd.c($$15, edd.b(edd.a(5.0), a($$0, O)));
      edc $$17 = edd.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      edc $$18 = edd.c(b(a($$3, $$17)), a($$0, P));
      edc $$19 = a($$0, v);
      int $$20 = Stream.of(edt.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-ebj.e * 2);
      int $$21 = Stream.of(edt.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-ebj.e * 2);
      edc $$22 = a($$19, edd.b($$1.b(eds.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      edc $$24 = a($$19, edd.b($$1.b(eds.F), 4.0, 4.0), $$20, $$21, 0).d();
      edc $$25 = a($$19, edd.b($$1.b(eds.G), 4.0, 4.0), $$20, $$21, 0).d();
      edc $$26 = edd.a(edd.a(-0.08F), edd.d($$24, $$25));
      edc $$27 = edd.a($$1.b(eds.H));
      return new edp(
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
         a($$3, edd.a($$14, edd.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static edp b(jr<edc> $$0, jr<est.a> $$1, edc $$2) {
      edc $$3 = a($$0, w);
      edc $$4 = a($$0, x);
      edc $$5 = edd.a($$3, $$4, 0.25, $$1.b(eds.a));
      edc $$6 = edd.a($$3, $$4, 0.25, $$1.b(eds.b));
      edc $$7 = b($$2);
      return new edp(edd.a(), edd.a(), edd.a(), edd.a(), $$5, $$6, edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), $$7, edd.a(), edd.a(), edd.a());
   }

   private static edc a(boolean $$0, edc $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static edc a(jr<edc> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static edc a(edc $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static edp a(jr<edc> $$0, jr<est.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static edp b(jr<edc> $$0, jr<est.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static edp c(jr<edc> $$0, jr<est.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static edc c(edc $$0) {
      return a($$0, 0, 128);
   }

   protected static edp a(jr<edc> $$0) {
      edc $$1 = edd.c(edd.a(0L));
      edc $$2 = b(c(a($$0, M)));
      return new edp(
         edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), $$1, edd.a(), edd.a(), c(edd.a($$1, edd.a(-0.703125))), $$2, edd.a(), edd.a(), edd.a()
      );
   }

   protected static edp a() {
      return new edp(edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), edd.a(), edd.a());
   }

   private static edc a(edc $$0, edc $$1) {
      edc $$2 = edd.a(edd.b(), $$1, $$0);
      return edd.b(edd.c($$2));
   }

   private static edc b(edc $$0, edc $$1) {
      edc $$2 = edd.b($$1, $$0);
      return edd.b(edd.a(4.0), $$2.h());
   }

   private static edc a(edc $$0, edc $$1, int $$2, int $$3, int $$4) {
      return edd.a(edd.a($$0, (double)$$2, (double)($$3 + 1), $$1, edd.a((double)$$4)));
   }

   private static edc a(edc $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      edc $$10 = edd.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      edc $$9 = edd.a($$10, $$5, $$0);
      edc $$11 = edd.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return edd.a($$11, $$8, $$9);
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
