import java.util.stream.Stream;

public class dvx {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dvj s = dvk.a(10.0);
   private static final dvj t = dvk.a();
   private static final ake<dvj> u = a("zero");
   private static final ake<dvj> v = a("y");
   private static final ake<dvj> w = a("shift_x");
   private static final ake<dvj> x = a("shift_z");
   private static final ake<dvj> y = a("overworld/base_3d_noise");
   private static final ake<dvj> z = a("nether/base_3d_noise");
   private static final ake<dvj> A = a("end/base_3d_noise");
   public static final ake<dvj> d = a("overworld/continents");
   public static final ake<dvj> e = a("overworld/erosion");
   public static final ake<dvj> f = a("overworld/ridges");
   public static final ake<dvj> g = a("overworld/ridges_folded");
   public static final ake<dvj> h = a("overworld/offset");
   public static final ake<dvj> i = a("overworld/factor");
   public static final ake<dvj> j = a("overworld/jaggedness");
   public static final ake<dvj> k = a("overworld/depth");
   private static final ake<dvj> B = a("overworld/sloped_cheese");
   public static final ake<dvj> l = a("overworld_large_biomes/continents");
   public static final ake<dvj> m = a("overworld_large_biomes/erosion");
   private static final ake<dvj> C = a("overworld_large_biomes/offset");
   private static final ake<dvj> D = a("overworld_large_biomes/factor");
   private static final ake<dvj> E = a("overworld_large_biomes/jaggedness");
   private static final ake<dvj> F = a("overworld_large_biomes/depth");
   private static final ake<dvj> G = a("overworld_large_biomes/sloped_cheese");
   private static final ake<dvj> H = a("overworld_amplified/offset");
   private static final ake<dvj> I = a("overworld_amplified/factor");
   private static final ake<dvj> J = a("overworld_amplified/jaggedness");
   private static final ake<dvj> K = a("overworld_amplified/depth");
   private static final ake<dvj> L = a("overworld_amplified/sloped_cheese");
   private static final ake<dvj> M = a("end/sloped_cheese");
   private static final ake<dvj> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ake<dvj> O = a("overworld/caves/entrances");
   private static final ake<dvj> P = a("overworld/caves/noodle");
   private static final ake<dvj> Q = a("overworld/caves/pillars");
   private static final ake<dvj> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ake<dvj> S = a("overworld/caves/spaghetti_2d");

   private static ake<dvj> a(String $$0) {
      return ake.a(ld.aC, new akf($$0));
   }

   public static iv<? extends dvj> a(qj<dvj> $$0) {
      iw<eku.a> $$1 = $$0.a(ld.aG);
      iw<dvj> $$2 = $$0.a(ld.aC);
      $$0.a(u, dvk.a());
      int $$3 = dtq.e * 2;
      int $$4 = dtq.d * 2;
      $$0.a(v, dvk.a($$3, $$4, (double)$$3, (double)$$4));
      dvj $$5 = a($$0, w, dvk.b(dvk.c(dvk.b($$1.b(dvz.j)))));
      dvj $$6 = a($$0, x, dvk.b(dvk.c(dvk.c($$1.b(dvz.j)))));
      $$0.a(y, ekr.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ekr.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ekr.a(0.25, 0.25, 80.0, 160.0, 4.0));
      iv<dvj> $$7 = $$0.a(d, dvk.b(dvk.a($$5, $$6, 0.25, $$1.b(dvz.c))));
      iv<dvj> $$8 = $$0.a(e, dvk.b(dvk.a($$5, $$6, 0.25, $$1.b(dvz.d))));
      dvj $$9 = a($$0, f, dvk.b(dvk.a($$5, $$6, 0.25, $$1.b(dvz.i))));
      $$0.a(g, a($$9));
      dvj $$10 = dvk.b($$1.b(dvz.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      iv<dvj> $$11 = $$0.a(l, dvk.b(dvk.a($$5, $$6, 0.25, $$1.b(dvz.g))));
      iv<dvj> $$12 = $$0.a(m, dvk.b(dvk.a($$5, $$6, 0.25, $$1.b(dvz.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dvk.a(dvk.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dvk.d(dvk.a($$1.b(dvz.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qj<dvj> $$0, iw<dvj> $$1, dvj $$2, iv<dvj> $$3, iv<dvj> $$4, ake<dvj> $$5, ake<dvj> $$6, ake<dvj> $$7, ake<dvj> $$8, ake<dvj> $$9, boolean $$10
   ) {
      dvk.w.a $$11 = new dvk.w.a($$3);
      dvk.w.a $$12 = new dvk.w.a($$4);
      dvk.w.a $$13 = new dvk.w.a($$1.b(f));
      dvk.w.a $$14 = new dvk.w.a($$1.b(g));
      dvj $$15 = a($$0, $$5, a(dvk.a(dvk.a(-0.50375F), dvk.a(qy.a($$11, $$12, $$14, $$10))), dvk.c()));
      dvj $$16 = a($$0, $$6, a(dvk.a(qy.a($$11, $$12, $$13, $$14, $$10)), s));
      dvj $$17 = a($$0, $$8, dvk.a(dvk.a(-64, 320, 1.5, -1.5), $$15));
      dvj $$18 = a($$0, $$7, a(dvk.a(qy.b($$11, $$12, $$13, $$14, $$10)), t));
      dvj $$19 = dvk.b($$18, $$2.g());
      dvj $$20 = b($$16, dvk.a($$17, $$19));
      $$0.a($$9, dvk.a($$20, a($$1, y)));
   }

   private static dvj a(qj<dvj> $$0, ake<dvj> $$1, dvj $$2) {
      return new dvk.j($$0.a($$1, $$2));
   }

   private static dvj a(iw<dvj> $$0, ake<dvj> $$1) {
      return new dvk.j($$0.b($$1));
   }

   private static dvj a(dvj $$0) {
      return dvk.b(dvk.a(dvk.a($$0.d(), dvk.a(-0.6666666666666666)).d(), dvk.a(-0.3333333333333333)), dvk.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dvj b(iw<eku.a> $$0) {
      dvj $$1 = dvk.a($$0.b(dvz.z));
      dvj $$2 = dvk.a($$0.b(dvz.A), 0.0, -0.1);
      return dvk.d(dvk.b($$2, dvk.a($$1.d(), dvk.a(-0.4))));
   }

   private static dvj d(iw<dvj> $$0, iw<eku.a> $$1) {
      dvj $$2 = dvk.d(dvk.b($$1.b(dvz.x), 2.0, 1.0));
      dvj $$3 = dvk.a($$1.b(dvz.y), -0.065, -0.088);
      dvj $$4 = dvk.a($$2, $$1.b(dvz.v), dvk.z.a.a);
      dvj $$5 = dvk.a($$2, $$1.b(dvz.w), dvk.z.a.a);
      dvj $$6 = dvk.a(dvk.d($$4, $$5), $$3).a(-1.0, 1.0);
      dvj $$7 = a($$0, N);
      dvj $$8 = dvk.b($$1.b(dvz.B), 0.75, 0.5);
      dvj $$9 = dvk.a(dvk.a($$8, dvk.a(0.37)), dvk.a(-10, 30, 0.3, 0.0));
      return dvk.d(dvk.c($$9, dvk.a($$7, $$6)));
   }

   private static dvj e(iw<dvj> $$0, iw<eku.a> $$1) {
      dvj $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dvj $$6 = a($$2, dvk.b($$1.b(dvz.I), 1.0, 1.0), -60, 320, -1);
      dvj $$7 = a($$2, dvk.a($$1.b(dvz.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dvj $$9 = a($$2, dvk.b($$1.b(dvz.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dvj $$10 = a($$2, dvk.b($$1.b(dvz.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dvj $$11 = dvk.b(dvk.a(1.5), dvk.d($$9.d(), $$10.d()));
      return dvk.a($$6, -1000000.0, 0.0, dvk.a(64.0), dvk.a($$7, $$11));
   }

   private static dvj c(iw<eku.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dvj $$3 = dvk.b($$0.b(dvz.o), 25.0, 0.3);
      dvj $$4 = dvk.a($$0.b(dvz.p), 0.0, -2.0);
      dvj $$5 = dvk.a($$0.b(dvz.q), 0.0, 1.1);
      dvj $$6 = dvk.a(dvk.b($$3, dvk.a(2.0)), $$4);
      return dvk.d(dvk.b($$6, $$5.f()));
   }

   private static dvj f(iw<dvj> $$0, iw<eku.a> $$1) {
      dvj $$2 = dvk.b($$1.b(dvz.t), 2.0, 1.0);
      dvj $$3 = dvk.a($$2, $$1.b(dvz.r), dvk.z.a.b);
      dvj $$4 = dvk.a($$1.b(dvz.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dvj $$5 = a($$0, R);
      dvj $$6 = dvk.a($$4, dvk.a(-64, 320, 8.0, -40.0)).d();
      dvj $$7 = dvk.a($$6, $$5).f();
      double $$8 = 0.083;
      dvj $$9 = dvk.a($$3, dvk.b(dvk.a(0.083), $$5));
      return dvk.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dvj a(iw<dvj> $$0, iw<eku.a> $$1, dvj $$2) {
      dvj $$3 = a($$0, S);
      dvj $$4 = a($$0, N);
      dvj $$5 = dvk.a($$1.b(dvz.C), 8.0);
      dvj $$6 = dvk.b(dvk.a(4.0), $$5.e());
      dvj $$7 = dvk.a($$1.b(dvz.D), 0.6666666666666666);
      dvj $$8 = dvk.a(dvk.a(dvk.a(0.27), $$7).a(-1.0, 1.0), dvk.a(dvk.a(1.5), dvk.b(dvk.a(-0.64), $$2)).a(0.0, 0.5));
      dvj $$9 = dvk.a($$6, $$8);
      dvj $$10 = dvk.c(dvk.c($$9, a($$0, O)), dvk.a($$3, $$4));
      dvj $$11 = a($$0, Q);
      dvj $$12 = dvk.a($$11, -1000000.0, 0.03, dvk.a(-1000000.0), $$11);
      return dvk.d($$10, $$12);
   }

   private static dvj b(dvj $$0) {
      dvj $$1 = dvk.f($$0);
      return dvk.b(dvk.a($$1), dvk.a(0.64)).i();
   }

   protected static dvw a(iw<dvj> $$0, iw<eku.a> $$1, boolean $$2, boolean $$3) {
      dvj $$4 = dvk.a($$1.b(dvz.k), 0.5);
      dvj $$5 = dvk.a($$1.b(dvz.l), 0.67);
      dvj $$6 = dvk.a($$1.b(dvz.n), 0.7142857142857143);
      dvj $$7 = dvk.a($$1.b(dvz.m));
      dvj $$8 = a($$0, w);
      dvj $$9 = a($$0, x);
      dvj $$10 = dvk.a($$8, $$9, 0.25, $$1.b($$2 ? dvz.e : dvz.a));
      dvj $$11 = dvk.a($$8, $$9, 0.25, $$1.b($$2 ? dvz.f : dvz.b));
      dvj $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dvj $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dvj $$14 = b(dvk.c($$12), $$13);
      dvj $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dvj $$16 = dvk.c($$15, dvk.b(dvk.a(5.0), a($$0, O)));
      dvj $$17 = dvk.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dvj $$18 = dvk.c(b(a($$3, $$17)), a($$0, P));
      dvj $$19 = a($$0, v);
      int $$20 = Stream.of(dwa.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dtq.e * 2);
      int $$21 = Stream.of(dwa.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dtq.e * 2);
      dvj $$22 = a($$19, dvk.b($$1.b(dvz.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dvj $$24 = a($$19, dvk.b($$1.b(dvz.F), 4.0, 4.0), $$20, $$21, 0).d();
      dvj $$25 = a($$19, dvk.b($$1.b(dvz.G), 4.0, 4.0), $$20, $$21, 0).d();
      dvj $$26 = dvk.a(dvk.a(-0.08F), dvk.d($$24, $$25));
      dvj $$27 = dvk.a($$1.b(dvz.H));
      return new dvw(
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
         a($$3, dvk.a($$14, dvk.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dvw b(iw<dvj> $$0, iw<eku.a> $$1, dvj $$2) {
      dvj $$3 = a($$0, w);
      dvj $$4 = a($$0, x);
      dvj $$5 = dvk.a($$3, $$4, 0.25, $$1.b(dvz.a));
      dvj $$6 = dvk.a($$3, $$4, 0.25, $$1.b(dvz.b));
      dvj $$7 = b($$2);
      return new dvw(dvk.a(), dvk.a(), dvk.a(), dvk.a(), $$5, $$6, dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), $$7, dvk.a(), dvk.a(), dvk.a());
   }

   private static dvj a(boolean $$0, dvj $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dvj a(iw<dvj> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dvj a(dvj $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dvw a(iw<dvj> $$0, iw<eku.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dvw b(iw<dvj> $$0, iw<eku.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dvw c(iw<dvj> $$0, iw<eku.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dvj c(dvj $$0) {
      return a($$0, 0, 128);
   }

   protected static dvw a(iw<dvj> $$0) {
      dvj $$1 = dvk.c(dvk.a(0L));
      dvj $$2 = b(c(a($$0, M)));
      return new dvw(
         dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), $$1, dvk.a(), dvk.a(), c(dvk.a($$1, dvk.a(-0.703125))), $$2, dvk.a(), dvk.a(), dvk.a()
      );
   }

   protected static dvw a() {
      return new dvw(dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a(), dvk.a());
   }

   private static dvj a(dvj $$0, dvj $$1) {
      dvj $$2 = dvk.a(dvk.b(), $$1, $$0);
      return dvk.b(dvk.c($$2));
   }

   private static dvj b(dvj $$0, dvj $$1) {
      dvj $$2 = dvk.b($$1, $$0);
      return dvk.b(dvk.a(4.0), $$2.h());
   }

   private static dvj a(dvj $$0, dvj $$1, int $$2, int $$3, int $$4) {
      return dvk.a(dvk.a($$0, (double)$$2, (double)($$3 + 1), $$1, dvk.a((double)$$4)));
   }

   private static dvj a(dvj $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dvj $$10 = dvk.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dvj $$9 = dvk.a($$10, $$5, $$0);
      dvj $$11 = dvk.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dvk.a($$11, $$8, $$9);
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
