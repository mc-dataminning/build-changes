import java.util.stream.Stream;

public class ehk {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final egw s = egx.a(10.0);
   private static final egw t = egx.a();
   private static final alh<egw> u = a("zero");
   private static final alh<egw> v = a("y");
   private static final alh<egw> w = a("shift_x");
   private static final alh<egw> x = a("shift_z");
   private static final alh<egw> y = a("overworld/base_3d_noise");
   private static final alh<egw> z = a("nether/base_3d_noise");
   private static final alh<egw> A = a("end/base_3d_noise");
   public static final alh<egw> d = a("overworld/continents");
   public static final alh<egw> e = a("overworld/erosion");
   public static final alh<egw> f = a("overworld/ridges");
   public static final alh<egw> g = a("overworld/ridges_folded");
   public static final alh<egw> h = a("overworld/offset");
   public static final alh<egw> i = a("overworld/factor");
   public static final alh<egw> j = a("overworld/jaggedness");
   public static final alh<egw> k = a("overworld/depth");
   private static final alh<egw> B = a("overworld/sloped_cheese");
   public static final alh<egw> l = a("overworld_large_biomes/continents");
   public static final alh<egw> m = a("overworld_large_biomes/erosion");
   private static final alh<egw> C = a("overworld_large_biomes/offset");
   private static final alh<egw> D = a("overworld_large_biomes/factor");
   private static final alh<egw> E = a("overworld_large_biomes/jaggedness");
   private static final alh<egw> F = a("overworld_large_biomes/depth");
   private static final alh<egw> G = a("overworld_large_biomes/sloped_cheese");
   private static final alh<egw> H = a("overworld_amplified/offset");
   private static final alh<egw> I = a("overworld_amplified/factor");
   private static final alh<egw> J = a("overworld_amplified/jaggedness");
   private static final alh<egw> K = a("overworld_amplified/depth");
   private static final alh<egw> L = a("overworld_amplified/sloped_cheese");
   private static final alh<egw> M = a("end/sloped_cheese");
   private static final alh<egw> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alh<egw> O = a("overworld/caves/entrances");
   private static final alh<egw> P = a("overworld/caves/noodle");
   private static final alh<egw> Q = a("overworld/caves/pillars");
   private static final alh<egw> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alh<egw> S = a("overworld/caves/spaghetti_2d");

   private static alh<egw> a(String $$0) {
      return alh.a(mh.aO, ali.b($$0));
   }

   public static jf<? extends egw> a(qh<egw> $$0) {
      jg<ewr.a> $$1 = $$0.a(mh.aY);
      jg<egw> $$2 = $$0.a(mh.aO);
      $$0.a(u, egx.a());
      int $$3 = efb.e * 2;
      int $$4 = efb.d * 2;
      $$0.a(v, egx.a($$3, $$4, (double)$$3, (double)$$4));
      egw $$5 = a($$0, w, egx.b(egx.c(egx.b($$1.b(ehm.j)))));
      egw $$6 = a($$0, x, egx.b(egx.c(egx.c($$1.b(ehm.j)))));
      $$0.a(y, ewo.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ewo.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ewo.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jf<egw> $$7 = $$0.a(d, egx.b(egx.a($$5, $$6, 0.25, $$1.b(ehm.c))));
      jf<egw> $$8 = $$0.a(e, egx.b(egx.a($$5, $$6, 0.25, $$1.b(ehm.d))));
      egw $$9 = a($$0, f, egx.b(egx.a($$5, $$6, 0.25, $$1.b(ehm.i))));
      $$0.a(g, a($$9));
      egw $$10 = egx.b($$1.b(ehm.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jf<egw> $$11 = $$0.a(l, egx.b(egx.a($$5, $$6, 0.25, $$1.b(ehm.g))));
      jf<egw> $$12 = $$0.a(m, egx.b(egx.a($$5, $$6, 0.25, $$1.b(ehm.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, egx.a(egx.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, egx.d(egx.a($$1.b(ehm.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qh<egw> $$0, jg<egw> $$1, egw $$2, jf<egw> $$3, jf<egw> $$4, alh<egw> $$5, alh<egw> $$6, alh<egw> $$7, alh<egw> $$8, alh<egw> $$9, boolean $$10
   ) {
      egx.w.a $$11 = new egx.w.a($$3);
      egx.w.a $$12 = new egx.w.a($$4);
      egx.w.a $$13 = new egx.w.a($$1.b(f));
      egx.w.a $$14 = new egx.w.a($$1.b(g));
      egw $$15 = a($$0, $$5, a(egx.a(egx.a(-0.50375F), egx.a(qw.a($$11, $$12, $$14, $$10))), egx.c()));
      egw $$16 = a($$0, $$6, a(egx.a(qw.a($$11, $$12, $$13, $$14, $$10)), s));
      egw $$17 = a($$0, $$8, egx.a(egx.a(-64, 320, 1.5, -1.5), $$15));
      egw $$18 = a($$0, $$7, a(egx.a(qw.b($$11, $$12, $$13, $$14, $$10)), t));
      egw $$19 = egx.b($$18, $$2.g());
      egw $$20 = b($$16, egx.a($$17, $$19));
      $$0.a($$9, egx.a($$20, a($$1, y)));
   }

   private static egw a(qh<egw> $$0, alh<egw> $$1, egw $$2) {
      return new egx.j($$0.a($$1, $$2));
   }

   private static egw a(jg<egw> $$0, alh<egw> $$1) {
      return new egx.j($$0.b($$1));
   }

   private static egw a(egw $$0) {
      return egx.b(egx.a(egx.a($$0.d(), egx.a(-0.6666666666666666)).d(), egx.a(-0.3333333333333333)), egx.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static egw b(jg<ewr.a> $$0) {
      egw $$1 = egx.a($$0.b(ehm.z));
      egw $$2 = egx.a($$0.b(ehm.A), 0.0, -0.1);
      return egx.d(egx.b($$2, egx.a($$1.d(), egx.a(-0.4))));
   }

   private static egw d(jg<egw> $$0, jg<ewr.a> $$1) {
      egw $$2 = egx.d(egx.b($$1.b(ehm.x), 2.0, 1.0));
      egw $$3 = egx.a($$1.b(ehm.y), -0.065, -0.088);
      egw $$4 = egx.a($$2, $$1.b(ehm.v), egx.z.a.a);
      egw $$5 = egx.a($$2, $$1.b(ehm.w), egx.z.a.a);
      egw $$6 = egx.a(egx.d($$4, $$5), $$3).a(-1.0, 1.0);
      egw $$7 = a($$0, N);
      egw $$8 = egx.b($$1.b(ehm.B), 0.75, 0.5);
      egw $$9 = egx.a(egx.a($$8, egx.a(0.37)), egx.a(-10, 30, 0.3, 0.0));
      return egx.d(egx.c($$9, egx.a($$7, $$6)));
   }

   private static egw e(jg<egw> $$0, jg<ewr.a> $$1) {
      egw $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      egw $$6 = a($$2, egx.b($$1.b(ehm.I), 1.0, 1.0), -60, 320, -1);
      egw $$7 = a($$2, egx.a($$1.b(ehm.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      egw $$9 = a($$2, egx.b($$1.b(ehm.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      egw $$10 = a($$2, egx.b($$1.b(ehm.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      egw $$11 = egx.b(egx.a(1.5), egx.d($$9.d(), $$10.d()));
      return egx.a($$6, -1000000.0, 0.0, egx.a(64.0), egx.a($$7, $$11));
   }

   private static egw c(jg<ewr.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      egw $$3 = egx.b($$0.b(ehm.o), 25.0, 0.3);
      egw $$4 = egx.a($$0.b(ehm.p), 0.0, -2.0);
      egw $$5 = egx.a($$0.b(ehm.q), 0.0, 1.1);
      egw $$6 = egx.a(egx.b($$3, egx.a(2.0)), $$4);
      return egx.d(egx.b($$6, $$5.f()));
   }

   private static egw f(jg<egw> $$0, jg<ewr.a> $$1) {
      egw $$2 = egx.b($$1.b(ehm.t), 2.0, 1.0);
      egw $$3 = egx.a($$2, $$1.b(ehm.r), egx.z.a.b);
      egw $$4 = egx.a($$1.b(ehm.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      egw $$5 = a($$0, R);
      egw $$6 = egx.a($$4, egx.a(-64, 320, 8.0, -40.0)).d();
      egw $$7 = egx.a($$6, $$5).f();
      double $$8 = 0.083;
      egw $$9 = egx.a($$3, egx.b(egx.a(0.083), $$5));
      return egx.d($$9, $$7).a(-1.0, 1.0);
   }

   private static egw a(jg<egw> $$0, jg<ewr.a> $$1, egw $$2) {
      egw $$3 = a($$0, S);
      egw $$4 = a($$0, N);
      egw $$5 = egx.a($$1.b(ehm.C), 8.0);
      egw $$6 = egx.b(egx.a(4.0), $$5.e());
      egw $$7 = egx.a($$1.b(ehm.D), 0.6666666666666666);
      egw $$8 = egx.a(egx.a(egx.a(0.27), $$7).a(-1.0, 1.0), egx.a(egx.a(1.5), egx.b(egx.a(-0.64), $$2)).a(0.0, 0.5));
      egw $$9 = egx.a($$6, $$8);
      egw $$10 = egx.c(egx.c($$9, a($$0, O)), egx.a($$3, $$4));
      egw $$11 = a($$0, Q);
      egw $$12 = egx.a($$11, -1000000.0, 0.03, egx.a(-1000000.0), $$11);
      return egx.d($$10, $$12);
   }

   private static egw b(egw $$0) {
      egw $$1 = egx.f($$0);
      return egx.b(egx.a($$1), egx.a(0.64)).i();
   }

   protected static ehj a(jg<egw> $$0, jg<ewr.a> $$1, boolean $$2, boolean $$3) {
      egw $$4 = egx.a($$1.b(ehm.k), 0.5);
      egw $$5 = egx.a($$1.b(ehm.l), 0.67);
      egw $$6 = egx.a($$1.b(ehm.n), 0.7142857142857143);
      egw $$7 = egx.a($$1.b(ehm.m));
      egw $$8 = a($$0, w);
      egw $$9 = a($$0, x);
      egw $$10 = egx.a($$8, $$9, 0.25, $$1.b($$2 ? ehm.e : ehm.a));
      egw $$11 = egx.a($$8, $$9, 0.25, $$1.b($$2 ? ehm.f : ehm.b));
      egw $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      egw $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      egw $$14 = b(egx.c($$12), $$13);
      egw $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      egw $$16 = egx.c($$15, egx.b(egx.a(5.0), a($$0, O)));
      egw $$17 = egx.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      egw $$18 = egx.c(b(a($$3, $$17)), a($$0, P));
      egw $$19 = a($$0, v);
      int $$20 = Stream.of(ehn.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-efb.e * 2);
      int $$21 = Stream.of(ehn.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-efb.e * 2);
      egw $$22 = a($$19, egx.b($$1.b(ehm.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      egw $$24 = a($$19, egx.b($$1.b(ehm.F), 4.0, 4.0), $$20, $$21, 0).d();
      egw $$25 = a($$19, egx.b($$1.b(ehm.G), 4.0, 4.0), $$20, $$21, 0).d();
      egw $$26 = egx.a(egx.a(-0.08F), egx.d($$24, $$25));
      egw $$27 = egx.a($$1.b(ehm.H));
      return new ehj(
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
         a($$3, egx.a($$14, egx.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ehj b(jg<egw> $$0, jg<ewr.a> $$1, egw $$2) {
      egw $$3 = a($$0, w);
      egw $$4 = a($$0, x);
      egw $$5 = egx.a($$3, $$4, 0.25, $$1.b(ehm.a));
      egw $$6 = egx.a($$3, $$4, 0.25, $$1.b(ehm.b));
      egw $$7 = b($$2);
      return new ehj(egx.a(), egx.a(), egx.a(), egx.a(), $$5, $$6, egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), $$7, egx.a(), egx.a(), egx.a());
   }

   private static egw a(boolean $$0, egw $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static egw a(jg<egw> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static egw a(egw $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ehj a(jg<egw> $$0, jg<ewr.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ehj b(jg<egw> $$0, jg<ewr.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ehj c(jg<egw> $$0, jg<ewr.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static egw c(egw $$0) {
      return a($$0, 0, 128);
   }

   protected static ehj a(jg<egw> $$0) {
      egw $$1 = egx.c(egx.a(0L));
      egw $$2 = b(c(a($$0, M)));
      return new ehj(
         egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), $$1, egx.a(), egx.a(), c(egx.a($$1, egx.a(-0.703125))), $$2, egx.a(), egx.a(), egx.a()
      );
   }

   protected static ehj a() {
      return new ehj(egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), egx.a(), egx.a());
   }

   private static egw a(egw $$0, egw $$1) {
      egw $$2 = egx.a(egx.b(), $$1, $$0);
      return egx.b(egx.c($$2));
   }

   private static egw b(egw $$0, egw $$1) {
      egw $$2 = egx.b($$1, $$0);
      return egx.b(egx.a(4.0), $$2.h());
   }

   private static egw a(egw $$0, egw $$1, int $$2, int $$3, int $$4) {
      return egx.a(egx.a($$0, (double)$$2, (double)($$3 + 1), $$1, egx.a((double)$$4)));
   }

   private static egw a(egw $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      egw $$10 = egx.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      egw $$9 = egx.a($$10, $$5, $$0);
      egw $$11 = egx.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return egx.a($$11, $$8, $$9);
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
