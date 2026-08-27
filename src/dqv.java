import java.util.stream.Stream;

public class dqv {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dqh s = dqi.a(10.0);
   private static final dqh t = dqi.a();
   private static final aix<dqh> u = a("zero");
   private static final aix<dqh> v = a("y");
   private static final aix<dqh> w = a("shift_x");
   private static final aix<dqh> x = a("shift_z");
   private static final aix<dqh> y = a("overworld/base_3d_noise");
   private static final aix<dqh> z = a("nether/base_3d_noise");
   private static final aix<dqh> A = a("end/base_3d_noise");
   public static final aix<dqh> d = a("overworld/continents");
   public static final aix<dqh> e = a("overworld/erosion");
   public static final aix<dqh> f = a("overworld/ridges");
   public static final aix<dqh> g = a("overworld/ridges_folded");
   public static final aix<dqh> h = a("overworld/offset");
   public static final aix<dqh> i = a("overworld/factor");
   public static final aix<dqh> j = a("overworld/jaggedness");
   public static final aix<dqh> k = a("overworld/depth");
   private static final aix<dqh> B = a("overworld/sloped_cheese");
   public static final aix<dqh> l = a("overworld_large_biomes/continents");
   public static final aix<dqh> m = a("overworld_large_biomes/erosion");
   private static final aix<dqh> C = a("overworld_large_biomes/offset");
   private static final aix<dqh> D = a("overworld_large_biomes/factor");
   private static final aix<dqh> E = a("overworld_large_biomes/jaggedness");
   private static final aix<dqh> F = a("overworld_large_biomes/depth");
   private static final aix<dqh> G = a("overworld_large_biomes/sloped_cheese");
   private static final aix<dqh> H = a("overworld_amplified/offset");
   private static final aix<dqh> I = a("overworld_amplified/factor");
   private static final aix<dqh> J = a("overworld_amplified/jaggedness");
   private static final aix<dqh> K = a("overworld_amplified/depth");
   private static final aix<dqh> L = a("overworld_amplified/sloped_cheese");
   private static final aix<dqh> M = a("end/sloped_cheese");
   private static final aix<dqh> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aix<dqh> O = a("overworld/caves/entrances");
   private static final aix<dqh> P = a("overworld/caves/noodle");
   private static final aix<dqh> Q = a("overworld/caves/pillars");
   private static final aix<dqh> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aix<dqh> S = a("overworld/caves/spaghetti_2d");

   private static aix<dqh> a(String $$0) {
      return aix.a(kg.ax, new aiy($$0));
   }

   public static ij<? extends dqh> a(ph<dqh> $$0) {
      ik<efs.a> $$1 = $$0.a(kg.aB);
      ik<dqh> $$2 = $$0.a(kg.ax);
      $$0.a(u, dqi.a());
      int $$3 = doo.e * 2;
      int $$4 = doo.d * 2;
      $$0.a(v, dqi.a($$3, $$4, (double)$$3, (double)$$4));
      dqh $$5 = a($$0, w, dqi.b(dqi.c(dqi.b($$1.b(dqx.j)))));
      dqh $$6 = a($$0, x, dqi.b(dqi.c(dqi.c($$1.b(dqx.j)))));
      $$0.a(y, efp.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, efp.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, efp.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ij<dqh> $$7 = $$0.a(d, dqi.b(dqi.a($$5, $$6, 0.25, $$1.b(dqx.c))));
      ij<dqh> $$8 = $$0.a(e, dqi.b(dqi.a($$5, $$6, 0.25, $$1.b(dqx.d))));
      dqh $$9 = a($$0, f, dqi.b(dqi.a($$5, $$6, 0.25, $$1.b(dqx.i))));
      $$0.a(g, a($$9));
      dqh $$10 = dqi.b($$1.b(dqx.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ij<dqh> $$11 = $$0.a(l, dqi.b(dqi.a($$5, $$6, 0.25, $$1.b(dqx.g))));
      ij<dqh> $$12 = $$0.a(m, dqi.b(dqi.a($$5, $$6, 0.25, $$1.b(dqx.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dqi.a(dqi.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dqi.d(dqi.a($$1.b(dqx.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      ph<dqh> $$0, ik<dqh> $$1, dqh $$2, ij<dqh> $$3, ij<dqh> $$4, aix<dqh> $$5, aix<dqh> $$6, aix<dqh> $$7, aix<dqh> $$8, aix<dqh> $$9, boolean $$10
   ) {
      dqi.w.a $$11 = new dqi.w.a($$3);
      dqi.w.a $$12 = new dqi.w.a($$4);
      dqi.w.a $$13 = new dqi.w.a($$1.b(f));
      dqi.w.a $$14 = new dqi.w.a($$1.b(g));
      dqh $$15 = a($$0, $$5, a(dqi.a(dqi.a(-0.50375F), dqi.a(pw.a($$11, $$12, $$14, $$10))), dqi.c()));
      dqh $$16 = a($$0, $$6, a(dqi.a(pw.a($$11, $$12, $$13, $$14, $$10)), s));
      dqh $$17 = a($$0, $$8, dqi.a(dqi.a(-64, 320, 1.5, -1.5), $$15));
      dqh $$18 = a($$0, $$7, a(dqi.a(pw.b($$11, $$12, $$13, $$14, $$10)), t));
      dqh $$19 = dqi.b($$18, $$2.g());
      dqh $$20 = b($$16, dqi.a($$17, $$19));
      $$0.a($$9, dqi.a($$20, a($$1, y)));
   }

   private static dqh a(ph<dqh> $$0, aix<dqh> $$1, dqh $$2) {
      return new dqi.j($$0.a($$1, $$2));
   }

   private static dqh a(ik<dqh> $$0, aix<dqh> $$1) {
      return new dqi.j($$0.b($$1));
   }

   private static dqh a(dqh $$0) {
      return dqi.b(dqi.a(dqi.a($$0.d(), dqi.a(-0.6666666666666666)).d(), dqi.a(-0.3333333333333333)), dqi.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dqh b(ik<efs.a> $$0) {
      dqh $$1 = dqi.a($$0.b(dqx.z));
      dqh $$2 = dqi.a($$0.b(dqx.A), 0.0, -0.1);
      return dqi.d(dqi.b($$2, dqi.a($$1.d(), dqi.a(-0.4))));
   }

   private static dqh d(ik<dqh> $$0, ik<efs.a> $$1) {
      dqh $$2 = dqi.d(dqi.b($$1.b(dqx.x), 2.0, 1.0));
      dqh $$3 = dqi.a($$1.b(dqx.y), -0.065, -0.088);
      dqh $$4 = dqi.a($$2, $$1.b(dqx.v), dqi.z.a.a);
      dqh $$5 = dqi.a($$2, $$1.b(dqx.w), dqi.z.a.a);
      dqh $$6 = dqi.a(dqi.d($$4, $$5), $$3).a(-1.0, 1.0);
      dqh $$7 = a($$0, N);
      dqh $$8 = dqi.b($$1.b(dqx.B), 0.75, 0.5);
      dqh $$9 = dqi.a(dqi.a($$8, dqi.a(0.37)), dqi.a(-10, 30, 0.3, 0.0));
      return dqi.d(dqi.c($$9, dqi.a($$7, $$6)));
   }

   private static dqh e(ik<dqh> $$0, ik<efs.a> $$1) {
      dqh $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dqh $$6 = a($$2, dqi.b($$1.b(dqx.I), 1.0, 1.0), -60, 320, -1);
      dqh $$7 = a($$2, dqi.a($$1.b(dqx.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dqh $$9 = a($$2, dqi.b($$1.b(dqx.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dqh $$10 = a($$2, dqi.b($$1.b(dqx.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dqh $$11 = dqi.b(dqi.a(1.5), dqi.d($$9.d(), $$10.d()));
      return dqi.a($$6, -1000000.0, 0.0, dqi.a(64.0), dqi.a($$7, $$11));
   }

   private static dqh c(ik<efs.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dqh $$3 = dqi.b($$0.b(dqx.o), 25.0, 0.3);
      dqh $$4 = dqi.a($$0.b(dqx.p), 0.0, -2.0);
      dqh $$5 = dqi.a($$0.b(dqx.q), 0.0, 1.1);
      dqh $$6 = dqi.a(dqi.b($$3, dqi.a(2.0)), $$4);
      return dqi.d(dqi.b($$6, $$5.f()));
   }

   private static dqh f(ik<dqh> $$0, ik<efs.a> $$1) {
      dqh $$2 = dqi.b($$1.b(dqx.t), 2.0, 1.0);
      dqh $$3 = dqi.a($$2, $$1.b(dqx.r), dqi.z.a.b);
      dqh $$4 = dqi.a($$1.b(dqx.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dqh $$5 = a($$0, R);
      dqh $$6 = dqi.a($$4, dqi.a(-64, 320, 8.0, -40.0)).d();
      dqh $$7 = dqi.a($$6, $$5).f();
      double $$8 = 0.083;
      dqh $$9 = dqi.a($$3, dqi.b(dqi.a(0.083), $$5));
      return dqi.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dqh a(ik<dqh> $$0, ik<efs.a> $$1, dqh $$2) {
      dqh $$3 = a($$0, S);
      dqh $$4 = a($$0, N);
      dqh $$5 = dqi.a($$1.b(dqx.C), 8.0);
      dqh $$6 = dqi.b(dqi.a(4.0), $$5.e());
      dqh $$7 = dqi.a($$1.b(dqx.D), 0.6666666666666666);
      dqh $$8 = dqi.a(dqi.a(dqi.a(0.27), $$7).a(-1.0, 1.0), dqi.a(dqi.a(1.5), dqi.b(dqi.a(-0.64), $$2)).a(0.0, 0.5));
      dqh $$9 = dqi.a($$6, $$8);
      dqh $$10 = dqi.c(dqi.c($$9, a($$0, O)), dqi.a($$3, $$4));
      dqh $$11 = a($$0, Q);
      dqh $$12 = dqi.a($$11, -1000000.0, 0.03, dqi.a(-1000000.0), $$11);
      return dqi.d($$10, $$12);
   }

   private static dqh b(dqh $$0) {
      dqh $$1 = dqi.f($$0);
      return dqi.b(dqi.a($$1), dqi.a(0.64)).i();
   }

   protected static dqu a(ik<dqh> $$0, ik<efs.a> $$1, boolean $$2, boolean $$3) {
      dqh $$4 = dqi.a($$1.b(dqx.k), 0.5);
      dqh $$5 = dqi.a($$1.b(dqx.l), 0.67);
      dqh $$6 = dqi.a($$1.b(dqx.n), 0.7142857142857143);
      dqh $$7 = dqi.a($$1.b(dqx.m));
      dqh $$8 = a($$0, w);
      dqh $$9 = a($$0, x);
      dqh $$10 = dqi.a($$8, $$9, 0.25, $$1.b($$2 ? dqx.e : dqx.a));
      dqh $$11 = dqi.a($$8, $$9, 0.25, $$1.b($$2 ? dqx.f : dqx.b));
      dqh $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dqh $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dqh $$14 = b(dqi.c($$12), $$13);
      dqh $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dqh $$16 = dqi.c($$15, dqi.b(dqi.a(5.0), a($$0, O)));
      dqh $$17 = dqi.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dqh $$18 = dqi.c(b(a($$3, $$17)), a($$0, P));
      dqh $$19 = a($$0, v);
      int $$20 = Stream.of(dqy.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-doo.e * 2);
      int $$21 = Stream.of(dqy.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-doo.e * 2);
      dqh $$22 = a($$19, dqi.b($$1.b(dqx.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dqh $$24 = a($$19, dqi.b($$1.b(dqx.F), 4.0, 4.0), $$20, $$21, 0).d();
      dqh $$25 = a($$19, dqi.b($$1.b(dqx.G), 4.0, 4.0), $$20, $$21, 0).d();
      dqh $$26 = dqi.a(dqi.a(-0.08F), dqi.d($$24, $$25));
      dqh $$27 = dqi.a($$1.b(dqx.H));
      return new dqu(
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
         a($$3, dqi.a($$14, dqi.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dqu b(ik<dqh> $$0, ik<efs.a> $$1, dqh $$2) {
      dqh $$3 = a($$0, w);
      dqh $$4 = a($$0, x);
      dqh $$5 = dqi.a($$3, $$4, 0.25, $$1.b(dqx.a));
      dqh $$6 = dqi.a($$3, $$4, 0.25, $$1.b(dqx.b));
      dqh $$7 = b($$2);
      return new dqu(dqi.a(), dqi.a(), dqi.a(), dqi.a(), $$5, $$6, dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), $$7, dqi.a(), dqi.a(), dqi.a());
   }

   private static dqh a(boolean $$0, dqh $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dqh a(ik<dqh> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dqh a(dqh $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dqu a(ik<dqh> $$0, ik<efs.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dqu b(ik<dqh> $$0, ik<efs.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dqu c(ik<dqh> $$0, ik<efs.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dqh c(dqh $$0) {
      return a($$0, 0, 128);
   }

   protected static dqu a(ik<dqh> $$0) {
      dqh $$1 = dqi.c(dqi.a(0L));
      dqh $$2 = b(c(a($$0, M)));
      return new dqu(
         dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), $$1, dqi.a(), dqi.a(), c(dqi.a($$1, dqi.a(-0.703125))), $$2, dqi.a(), dqi.a(), dqi.a()
      );
   }

   protected static dqu a() {
      return new dqu(dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a(), dqi.a());
   }

   private static dqh a(dqh $$0, dqh $$1) {
      dqh $$2 = dqi.a(dqi.b(), $$1, $$0);
      return dqi.b(dqi.c($$2));
   }

   private static dqh b(dqh $$0, dqh $$1) {
      dqh $$2 = dqi.b($$1, $$0);
      return dqi.b(dqi.a(4.0), $$2.h());
   }

   private static dqh a(dqh $$0, dqh $$1, int $$2, int $$3, int $$4) {
      return dqi.a(dqi.a($$0, (double)$$2, (double)($$3 + 1), $$1, dqi.a((double)$$4)));
   }

   private static dqh a(dqh $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dqh $$10 = dqi.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dqh $$9 = dqi.a($$10, $$5, $$0);
      dqh $$11 = dqi.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dqi.a($$11, $$8, $$9);
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
