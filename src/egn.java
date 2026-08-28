import java.util.stream.Stream;

public class egn {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final efz s = ega.a(10.0);
   private static final efz t = ega.a();
   private static final alf<efz> u = a("zero");
   private static final alf<efz> v = a("y");
   private static final alf<efz> w = a("shift_x");
   private static final alf<efz> x = a("shift_z");
   private static final alf<efz> y = a("overworld/base_3d_noise");
   private static final alf<efz> z = a("nether/base_3d_noise");
   private static final alf<efz> A = a("end/base_3d_noise");
   public static final alf<efz> d = a("overworld/continents");
   public static final alf<efz> e = a("overworld/erosion");
   public static final alf<efz> f = a("overworld/ridges");
   public static final alf<efz> g = a("overworld/ridges_folded");
   public static final alf<efz> h = a("overworld/offset");
   public static final alf<efz> i = a("overworld/factor");
   public static final alf<efz> j = a("overworld/jaggedness");
   public static final alf<efz> k = a("overworld/depth");
   private static final alf<efz> B = a("overworld/sloped_cheese");
   public static final alf<efz> l = a("overworld_large_biomes/continents");
   public static final alf<efz> m = a("overworld_large_biomes/erosion");
   private static final alf<efz> C = a("overworld_large_biomes/offset");
   private static final alf<efz> D = a("overworld_large_biomes/factor");
   private static final alf<efz> E = a("overworld_large_biomes/jaggedness");
   private static final alf<efz> F = a("overworld_large_biomes/depth");
   private static final alf<efz> G = a("overworld_large_biomes/sloped_cheese");
   private static final alf<efz> H = a("overworld_amplified/offset");
   private static final alf<efz> I = a("overworld_amplified/factor");
   private static final alf<efz> J = a("overworld_amplified/jaggedness");
   private static final alf<efz> K = a("overworld_amplified/depth");
   private static final alf<efz> L = a("overworld_amplified/sloped_cheese");
   private static final alf<efz> M = a("end/sloped_cheese");
   private static final alf<efz> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alf<efz> O = a("overworld/caves/entrances");
   private static final alf<efz> P = a("overworld/caves/noodle");
   private static final alf<efz> Q = a("overworld/caves/pillars");
   private static final alf<efz> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alf<efz> S = a("overworld/caves/spaghetti_2d");

   private static alf<efz> a(String $$0) {
      return alf.a(mg.aO, alg.b($$0));
   }

   public static je<? extends efz> a(qh<efz> $$0) {
      jf<evr.a> $$1 = $$0.a(mg.aY);
      jf<efz> $$2 = $$0.a(mg.aO);
      $$0.a(u, ega.a());
      int $$3 = eee.e * 2;
      int $$4 = eee.d * 2;
      $$0.a(v, ega.a($$3, $$4, (double)$$3, (double)$$4));
      efz $$5 = a($$0, w, ega.b(ega.c(ega.b($$1.b(egp.j)))));
      efz $$6 = a($$0, x, ega.b(ega.c(ega.c($$1.b(egp.j)))));
      $$0.a(y, evo.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, evo.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, evo.a(0.25, 0.25, 80.0, 160.0, 4.0));
      je<efz> $$7 = $$0.a(d, ega.b(ega.a($$5, $$6, 0.25, $$1.b(egp.c))));
      je<efz> $$8 = $$0.a(e, ega.b(ega.a($$5, $$6, 0.25, $$1.b(egp.d))));
      efz $$9 = a($$0, f, ega.b(ega.a($$5, $$6, 0.25, $$1.b(egp.i))));
      $$0.a(g, a($$9));
      efz $$10 = ega.b($$1.b(egp.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      je<efz> $$11 = $$0.a(l, ega.b(ega.a($$5, $$6, 0.25, $$1.b(egp.g))));
      je<efz> $$12 = $$0.a(m, ega.b(ega.a($$5, $$6, 0.25, $$1.b(egp.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, ega.a(ega.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, ega.d(ega.a($$1.b(egp.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qh<efz> $$0, jf<efz> $$1, efz $$2, je<efz> $$3, je<efz> $$4, alf<efz> $$5, alf<efz> $$6, alf<efz> $$7, alf<efz> $$8, alf<efz> $$9, boolean $$10
   ) {
      ega.w.a $$11 = new ega.w.a($$3);
      ega.w.a $$12 = new ega.w.a($$4);
      ega.w.a $$13 = new ega.w.a($$1.b(f));
      ega.w.a $$14 = new ega.w.a($$1.b(g));
      efz $$15 = a($$0, $$5, a(ega.a(ega.a(-0.50375F), ega.a(qw.a($$11, $$12, $$14, $$10))), ega.c()));
      efz $$16 = a($$0, $$6, a(ega.a(qw.a($$11, $$12, $$13, $$14, $$10)), s));
      efz $$17 = a($$0, $$8, ega.a(ega.a(-64, 320, 1.5, -1.5), $$15));
      efz $$18 = a($$0, $$7, a(ega.a(qw.b($$11, $$12, $$13, $$14, $$10)), t));
      efz $$19 = ega.b($$18, $$2.g());
      efz $$20 = b($$16, ega.a($$17, $$19));
      $$0.a($$9, ega.a($$20, a($$1, y)));
   }

   private static efz a(qh<efz> $$0, alf<efz> $$1, efz $$2) {
      return new ega.j($$0.a($$1, $$2));
   }

   private static efz a(jf<efz> $$0, alf<efz> $$1) {
      return new ega.j($$0.b($$1));
   }

   private static efz a(efz $$0) {
      return ega.b(ega.a(ega.a($$0.d(), ega.a(-0.6666666666666666)).d(), ega.a(-0.3333333333333333)), ega.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static efz b(jf<evr.a> $$0) {
      efz $$1 = ega.a($$0.b(egp.z));
      efz $$2 = ega.a($$0.b(egp.A), 0.0, -0.1);
      return ega.d(ega.b($$2, ega.a($$1.d(), ega.a(-0.4))));
   }

   private static efz d(jf<efz> $$0, jf<evr.a> $$1) {
      efz $$2 = ega.d(ega.b($$1.b(egp.x), 2.0, 1.0));
      efz $$3 = ega.a($$1.b(egp.y), -0.065, -0.088);
      efz $$4 = ega.a($$2, $$1.b(egp.v), ega.z.a.a);
      efz $$5 = ega.a($$2, $$1.b(egp.w), ega.z.a.a);
      efz $$6 = ega.a(ega.d($$4, $$5), $$3).a(-1.0, 1.0);
      efz $$7 = a($$0, N);
      efz $$8 = ega.b($$1.b(egp.B), 0.75, 0.5);
      efz $$9 = ega.a(ega.a($$8, ega.a(0.37)), ega.a(-10, 30, 0.3, 0.0));
      return ega.d(ega.c($$9, ega.a($$7, $$6)));
   }

   private static efz e(jf<efz> $$0, jf<evr.a> $$1) {
      efz $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      efz $$6 = a($$2, ega.b($$1.b(egp.I), 1.0, 1.0), -60, 320, -1);
      efz $$7 = a($$2, ega.a($$1.b(egp.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      efz $$9 = a($$2, ega.b($$1.b(egp.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      efz $$10 = a($$2, ega.b($$1.b(egp.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      efz $$11 = ega.b(ega.a(1.5), ega.d($$9.d(), $$10.d()));
      return ega.a($$6, -1000000.0, 0.0, ega.a(64.0), ega.a($$7, $$11));
   }

   private static efz c(jf<evr.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      efz $$3 = ega.b($$0.b(egp.o), 25.0, 0.3);
      efz $$4 = ega.a($$0.b(egp.p), 0.0, -2.0);
      efz $$5 = ega.a($$0.b(egp.q), 0.0, 1.1);
      efz $$6 = ega.a(ega.b($$3, ega.a(2.0)), $$4);
      return ega.d(ega.b($$6, $$5.f()));
   }

   private static efz f(jf<efz> $$0, jf<evr.a> $$1) {
      efz $$2 = ega.b($$1.b(egp.t), 2.0, 1.0);
      efz $$3 = ega.a($$2, $$1.b(egp.r), ega.z.a.b);
      efz $$4 = ega.a($$1.b(egp.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      efz $$5 = a($$0, R);
      efz $$6 = ega.a($$4, ega.a(-64, 320, 8.0, -40.0)).d();
      efz $$7 = ega.a($$6, $$5).f();
      double $$8 = 0.083;
      efz $$9 = ega.a($$3, ega.b(ega.a(0.083), $$5));
      return ega.d($$9, $$7).a(-1.0, 1.0);
   }

   private static efz a(jf<efz> $$0, jf<evr.a> $$1, efz $$2) {
      efz $$3 = a($$0, S);
      efz $$4 = a($$0, N);
      efz $$5 = ega.a($$1.b(egp.C), 8.0);
      efz $$6 = ega.b(ega.a(4.0), $$5.e());
      efz $$7 = ega.a($$1.b(egp.D), 0.6666666666666666);
      efz $$8 = ega.a(ega.a(ega.a(0.27), $$7).a(-1.0, 1.0), ega.a(ega.a(1.5), ega.b(ega.a(-0.64), $$2)).a(0.0, 0.5));
      efz $$9 = ega.a($$6, $$8);
      efz $$10 = ega.c(ega.c($$9, a($$0, O)), ega.a($$3, $$4));
      efz $$11 = a($$0, Q);
      efz $$12 = ega.a($$11, -1000000.0, 0.03, ega.a(-1000000.0), $$11);
      return ega.d($$10, $$12);
   }

   private static efz b(efz $$0) {
      efz $$1 = ega.f($$0);
      return ega.b(ega.a($$1), ega.a(0.64)).i();
   }

   protected static egm a(jf<efz> $$0, jf<evr.a> $$1, boolean $$2, boolean $$3) {
      efz $$4 = ega.a($$1.b(egp.k), 0.5);
      efz $$5 = ega.a($$1.b(egp.l), 0.67);
      efz $$6 = ega.a($$1.b(egp.n), 0.7142857142857143);
      efz $$7 = ega.a($$1.b(egp.m));
      efz $$8 = a($$0, w);
      efz $$9 = a($$0, x);
      efz $$10 = ega.a($$8, $$9, 0.25, $$1.b($$2 ? egp.e : egp.a));
      efz $$11 = ega.a($$8, $$9, 0.25, $$1.b($$2 ? egp.f : egp.b));
      efz $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      efz $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      efz $$14 = b(ega.c($$12), $$13);
      efz $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      efz $$16 = ega.c($$15, ega.b(ega.a(5.0), a($$0, O)));
      efz $$17 = ega.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      efz $$18 = ega.c(b(a($$3, $$17)), a($$0, P));
      efz $$19 = a($$0, v);
      int $$20 = Stream.of(egq.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-eee.e * 2);
      int $$21 = Stream.of(egq.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-eee.e * 2);
      efz $$22 = a($$19, ega.b($$1.b(egp.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      efz $$24 = a($$19, ega.b($$1.b(egp.F), 4.0, 4.0), $$20, $$21, 0).d();
      efz $$25 = a($$19, ega.b($$1.b(egp.G), 4.0, 4.0), $$20, $$21, 0).d();
      efz $$26 = ega.a(ega.a(-0.08F), ega.d($$24, $$25));
      efz $$27 = ega.a($$1.b(egp.H));
      return new egm(
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
         a($$3, ega.a($$14, ega.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static egm b(jf<efz> $$0, jf<evr.a> $$1, efz $$2) {
      efz $$3 = a($$0, w);
      efz $$4 = a($$0, x);
      efz $$5 = ega.a($$3, $$4, 0.25, $$1.b(egp.a));
      efz $$6 = ega.a($$3, $$4, 0.25, $$1.b(egp.b));
      efz $$7 = b($$2);
      return new egm(ega.a(), ega.a(), ega.a(), ega.a(), $$5, $$6, ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), $$7, ega.a(), ega.a(), ega.a());
   }

   private static efz a(boolean $$0, efz $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static efz a(jf<efz> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static efz a(efz $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static egm a(jf<efz> $$0, jf<evr.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static egm b(jf<efz> $$0, jf<evr.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static egm c(jf<efz> $$0, jf<evr.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static efz c(efz $$0) {
      return a($$0, 0, 128);
   }

   protected static egm a(jf<efz> $$0) {
      efz $$1 = ega.c(ega.a(0L));
      efz $$2 = b(c(a($$0, M)));
      return new egm(
         ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), $$1, ega.a(), ega.a(), c(ega.a($$1, ega.a(-0.703125))), $$2, ega.a(), ega.a(), ega.a()
      );
   }

   protected static egm a() {
      return new egm(ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), ega.a(), ega.a());
   }

   private static efz a(efz $$0, efz $$1) {
      efz $$2 = ega.a(ega.b(), $$1, $$0);
      return ega.b(ega.c($$2));
   }

   private static efz b(efz $$0, efz $$1) {
      efz $$2 = ega.b($$1, $$0);
      return ega.b(ega.a(4.0), $$2.h());
   }

   private static efz a(efz $$0, efz $$1, int $$2, int $$3, int $$4) {
      return ega.a(ega.a($$0, (double)$$2, (double)($$3 + 1), $$1, ega.a((double)$$4)));
   }

   private static efz a(efz $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      efz $$10 = ega.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      efz $$9 = ega.a($$10, $$5, $$0);
      efz $$11 = ega.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return ega.a($$11, $$8, $$9);
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
