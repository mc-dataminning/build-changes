import java.util.stream.Stream;

public class egz {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final egl s = egm.a(10.0);
   private static final egl t = egm.a();
   private static final alf<egl> u = a("zero");
   private static final alf<egl> v = a("y");
   private static final alf<egl> w = a("shift_x");
   private static final alf<egl> x = a("shift_z");
   private static final alf<egl> y = a("overworld/base_3d_noise");
   private static final alf<egl> z = a("nether/base_3d_noise");
   private static final alf<egl> A = a("end/base_3d_noise");
   public static final alf<egl> d = a("overworld/continents");
   public static final alf<egl> e = a("overworld/erosion");
   public static final alf<egl> f = a("overworld/ridges");
   public static final alf<egl> g = a("overworld/ridges_folded");
   public static final alf<egl> h = a("overworld/offset");
   public static final alf<egl> i = a("overworld/factor");
   public static final alf<egl> j = a("overworld/jaggedness");
   public static final alf<egl> k = a("overworld/depth");
   private static final alf<egl> B = a("overworld/sloped_cheese");
   public static final alf<egl> l = a("overworld_large_biomes/continents");
   public static final alf<egl> m = a("overworld_large_biomes/erosion");
   private static final alf<egl> C = a("overworld_large_biomes/offset");
   private static final alf<egl> D = a("overworld_large_biomes/factor");
   private static final alf<egl> E = a("overworld_large_biomes/jaggedness");
   private static final alf<egl> F = a("overworld_large_biomes/depth");
   private static final alf<egl> G = a("overworld_large_biomes/sloped_cheese");
   private static final alf<egl> H = a("overworld_amplified/offset");
   private static final alf<egl> I = a("overworld_amplified/factor");
   private static final alf<egl> J = a("overworld_amplified/jaggedness");
   private static final alf<egl> K = a("overworld_amplified/depth");
   private static final alf<egl> L = a("overworld_amplified/sloped_cheese");
   private static final alf<egl> M = a("end/sloped_cheese");
   private static final alf<egl> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alf<egl> O = a("overworld/caves/entrances");
   private static final alf<egl> P = a("overworld/caves/noodle");
   private static final alf<egl> Q = a("overworld/caves/pillars");
   private static final alf<egl> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alf<egl> S = a("overworld/caves/spaghetti_2d");

   private static alf<egl> a(String $$0) {
      return alf.a(mh.aO, alg.b($$0));
   }

   public static jf<? extends egl> a(qh<egl> $$0) {
      jg<ewd.a> $$1 = $$0.a(mh.aY);
      jg<egl> $$2 = $$0.a(mh.aO);
      $$0.a(u, egm.a());
      int $$3 = eeq.e * 2;
      int $$4 = eeq.d * 2;
      $$0.a(v, egm.a($$3, $$4, (double)$$3, (double)$$4));
      egl $$5 = a($$0, w, egm.b(egm.c(egm.b($$1.b(ehb.j)))));
      egl $$6 = a($$0, x, egm.b(egm.c(egm.c($$1.b(ehb.j)))));
      $$0.a(y, ewa.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ewa.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ewa.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jf<egl> $$7 = $$0.a(d, egm.b(egm.a($$5, $$6, 0.25, $$1.b(ehb.c))));
      jf<egl> $$8 = $$0.a(e, egm.b(egm.a($$5, $$6, 0.25, $$1.b(ehb.d))));
      egl $$9 = a($$0, f, egm.b(egm.a($$5, $$6, 0.25, $$1.b(ehb.i))));
      $$0.a(g, a($$9));
      egl $$10 = egm.b($$1.b(ehb.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jf<egl> $$11 = $$0.a(l, egm.b(egm.a($$5, $$6, 0.25, $$1.b(ehb.g))));
      jf<egl> $$12 = $$0.a(m, egm.b(egm.a($$5, $$6, 0.25, $$1.b(ehb.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, egm.a(egm.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, egm.d(egm.a($$1.b(ehb.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qh<egl> $$0, jg<egl> $$1, egl $$2, jf<egl> $$3, jf<egl> $$4, alf<egl> $$5, alf<egl> $$6, alf<egl> $$7, alf<egl> $$8, alf<egl> $$9, boolean $$10
   ) {
      egm.w.a $$11 = new egm.w.a($$3);
      egm.w.a $$12 = new egm.w.a($$4);
      egm.w.a $$13 = new egm.w.a($$1.b(f));
      egm.w.a $$14 = new egm.w.a($$1.b(g));
      egl $$15 = a($$0, $$5, a(egm.a(egm.a(-0.50375F), egm.a(qw.a($$11, $$12, $$14, $$10))), egm.c()));
      egl $$16 = a($$0, $$6, a(egm.a(qw.a($$11, $$12, $$13, $$14, $$10)), s));
      egl $$17 = a($$0, $$8, egm.a(egm.a(-64, 320, 1.5, -1.5), $$15));
      egl $$18 = a($$0, $$7, a(egm.a(qw.b($$11, $$12, $$13, $$14, $$10)), t));
      egl $$19 = egm.b($$18, $$2.g());
      egl $$20 = b($$16, egm.a($$17, $$19));
      $$0.a($$9, egm.a($$20, a($$1, y)));
   }

   private static egl a(qh<egl> $$0, alf<egl> $$1, egl $$2) {
      return new egm.j($$0.a($$1, $$2));
   }

   private static egl a(jg<egl> $$0, alf<egl> $$1) {
      return new egm.j($$0.b($$1));
   }

   private static egl a(egl $$0) {
      return egm.b(egm.a(egm.a($$0.d(), egm.a(-0.6666666666666666)).d(), egm.a(-0.3333333333333333)), egm.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static egl b(jg<ewd.a> $$0) {
      egl $$1 = egm.a($$0.b(ehb.z));
      egl $$2 = egm.a($$0.b(ehb.A), 0.0, -0.1);
      return egm.d(egm.b($$2, egm.a($$1.d(), egm.a(-0.4))));
   }

   private static egl d(jg<egl> $$0, jg<ewd.a> $$1) {
      egl $$2 = egm.d(egm.b($$1.b(ehb.x), 2.0, 1.0));
      egl $$3 = egm.a($$1.b(ehb.y), -0.065, -0.088);
      egl $$4 = egm.a($$2, $$1.b(ehb.v), egm.z.a.a);
      egl $$5 = egm.a($$2, $$1.b(ehb.w), egm.z.a.a);
      egl $$6 = egm.a(egm.d($$4, $$5), $$3).a(-1.0, 1.0);
      egl $$7 = a($$0, N);
      egl $$8 = egm.b($$1.b(ehb.B), 0.75, 0.5);
      egl $$9 = egm.a(egm.a($$8, egm.a(0.37)), egm.a(-10, 30, 0.3, 0.0));
      return egm.d(egm.c($$9, egm.a($$7, $$6)));
   }

   private static egl e(jg<egl> $$0, jg<ewd.a> $$1) {
      egl $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      egl $$6 = a($$2, egm.b($$1.b(ehb.I), 1.0, 1.0), -60, 320, -1);
      egl $$7 = a($$2, egm.a($$1.b(ehb.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      egl $$9 = a($$2, egm.b($$1.b(ehb.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      egl $$10 = a($$2, egm.b($$1.b(ehb.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      egl $$11 = egm.b(egm.a(1.5), egm.d($$9.d(), $$10.d()));
      return egm.a($$6, -1000000.0, 0.0, egm.a(64.0), egm.a($$7, $$11));
   }

   private static egl c(jg<ewd.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      egl $$3 = egm.b($$0.b(ehb.o), 25.0, 0.3);
      egl $$4 = egm.a($$0.b(ehb.p), 0.0, -2.0);
      egl $$5 = egm.a($$0.b(ehb.q), 0.0, 1.1);
      egl $$6 = egm.a(egm.b($$3, egm.a(2.0)), $$4);
      return egm.d(egm.b($$6, $$5.f()));
   }

   private static egl f(jg<egl> $$0, jg<ewd.a> $$1) {
      egl $$2 = egm.b($$1.b(ehb.t), 2.0, 1.0);
      egl $$3 = egm.a($$2, $$1.b(ehb.r), egm.z.a.b);
      egl $$4 = egm.a($$1.b(ehb.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      egl $$5 = a($$0, R);
      egl $$6 = egm.a($$4, egm.a(-64, 320, 8.0, -40.0)).d();
      egl $$7 = egm.a($$6, $$5).f();
      double $$8 = 0.083;
      egl $$9 = egm.a($$3, egm.b(egm.a(0.083), $$5));
      return egm.d($$9, $$7).a(-1.0, 1.0);
   }

   private static egl a(jg<egl> $$0, jg<ewd.a> $$1, egl $$2) {
      egl $$3 = a($$0, S);
      egl $$4 = a($$0, N);
      egl $$5 = egm.a($$1.b(ehb.C), 8.0);
      egl $$6 = egm.b(egm.a(4.0), $$5.e());
      egl $$7 = egm.a($$1.b(ehb.D), 0.6666666666666666);
      egl $$8 = egm.a(egm.a(egm.a(0.27), $$7).a(-1.0, 1.0), egm.a(egm.a(1.5), egm.b(egm.a(-0.64), $$2)).a(0.0, 0.5));
      egl $$9 = egm.a($$6, $$8);
      egl $$10 = egm.c(egm.c($$9, a($$0, O)), egm.a($$3, $$4));
      egl $$11 = a($$0, Q);
      egl $$12 = egm.a($$11, -1000000.0, 0.03, egm.a(-1000000.0), $$11);
      return egm.d($$10, $$12);
   }

   private static egl b(egl $$0) {
      egl $$1 = egm.f($$0);
      return egm.b(egm.a($$1), egm.a(0.64)).i();
   }

   protected static egy a(jg<egl> $$0, jg<ewd.a> $$1, boolean $$2, boolean $$3) {
      egl $$4 = egm.a($$1.b(ehb.k), 0.5);
      egl $$5 = egm.a($$1.b(ehb.l), 0.67);
      egl $$6 = egm.a($$1.b(ehb.n), 0.7142857142857143);
      egl $$7 = egm.a($$1.b(ehb.m));
      egl $$8 = a($$0, w);
      egl $$9 = a($$0, x);
      egl $$10 = egm.a($$8, $$9, 0.25, $$1.b($$2 ? ehb.e : ehb.a));
      egl $$11 = egm.a($$8, $$9, 0.25, $$1.b($$2 ? ehb.f : ehb.b));
      egl $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      egl $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      egl $$14 = b(egm.c($$12), $$13);
      egl $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      egl $$16 = egm.c($$15, egm.b(egm.a(5.0), a($$0, O)));
      egl $$17 = egm.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      egl $$18 = egm.c(b(a($$3, $$17)), a($$0, P));
      egl $$19 = a($$0, v);
      int $$20 = Stream.of(ehc.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-eeq.e * 2);
      int $$21 = Stream.of(ehc.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-eeq.e * 2);
      egl $$22 = a($$19, egm.b($$1.b(ehb.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      egl $$24 = a($$19, egm.b($$1.b(ehb.F), 4.0, 4.0), $$20, $$21, 0).d();
      egl $$25 = a($$19, egm.b($$1.b(ehb.G), 4.0, 4.0), $$20, $$21, 0).d();
      egl $$26 = egm.a(egm.a(-0.08F), egm.d($$24, $$25));
      egl $$27 = egm.a($$1.b(ehb.H));
      return new egy(
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
         a($$3, egm.a($$14, egm.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static egy b(jg<egl> $$0, jg<ewd.a> $$1, egl $$2) {
      egl $$3 = a($$0, w);
      egl $$4 = a($$0, x);
      egl $$5 = egm.a($$3, $$4, 0.25, $$1.b(ehb.a));
      egl $$6 = egm.a($$3, $$4, 0.25, $$1.b(ehb.b));
      egl $$7 = b($$2);
      return new egy(egm.a(), egm.a(), egm.a(), egm.a(), $$5, $$6, egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), $$7, egm.a(), egm.a(), egm.a());
   }

   private static egl a(boolean $$0, egl $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static egl a(jg<egl> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static egl a(egl $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static egy a(jg<egl> $$0, jg<ewd.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static egy b(jg<egl> $$0, jg<ewd.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static egy c(jg<egl> $$0, jg<ewd.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static egl c(egl $$0) {
      return a($$0, 0, 128);
   }

   protected static egy a(jg<egl> $$0) {
      egl $$1 = egm.c(egm.a(0L));
      egl $$2 = b(c(a($$0, M)));
      return new egy(
         egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), $$1, egm.a(), egm.a(), c(egm.a($$1, egm.a(-0.703125))), $$2, egm.a(), egm.a(), egm.a()
      );
   }

   protected static egy a() {
      return new egy(egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), egm.a(), egm.a());
   }

   private static egl a(egl $$0, egl $$1) {
      egl $$2 = egm.a(egm.b(), $$1, $$0);
      return egm.b(egm.c($$2));
   }

   private static egl b(egl $$0, egl $$1) {
      egl $$2 = egm.b($$1, $$0);
      return egm.b(egm.a(4.0), $$2.h());
   }

   private static egl a(egl $$0, egl $$1, int $$2, int $$3, int $$4) {
      return egm.a(egm.a($$0, (double)$$2, (double)($$3 + 1), $$1, egm.a((double)$$4)));
   }

   private static egl a(egl $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      egl $$10 = egm.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      egl $$9 = egm.a($$10, $$5, $$0);
      egl $$11 = egm.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return egm.a($$11, $$8, $$9);
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
