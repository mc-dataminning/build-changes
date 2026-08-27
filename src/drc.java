import java.util.stream.Stream;

public class drc {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dqo s = dqp.a(10.0);
   private static final dqo t = dqp.a();
   private static final aix<dqo> u = a("zero");
   private static final aix<dqo> v = a("y");
   private static final aix<dqo> w = a("shift_x");
   private static final aix<dqo> x = a("shift_z");
   private static final aix<dqo> y = a("overworld/base_3d_noise");
   private static final aix<dqo> z = a("nether/base_3d_noise");
   private static final aix<dqo> A = a("end/base_3d_noise");
   public static final aix<dqo> d = a("overworld/continents");
   public static final aix<dqo> e = a("overworld/erosion");
   public static final aix<dqo> f = a("overworld/ridges");
   public static final aix<dqo> g = a("overworld/ridges_folded");
   public static final aix<dqo> h = a("overworld/offset");
   public static final aix<dqo> i = a("overworld/factor");
   public static final aix<dqo> j = a("overworld/jaggedness");
   public static final aix<dqo> k = a("overworld/depth");
   private static final aix<dqo> B = a("overworld/sloped_cheese");
   public static final aix<dqo> l = a("overworld_large_biomes/continents");
   public static final aix<dqo> m = a("overworld_large_biomes/erosion");
   private static final aix<dqo> C = a("overworld_large_biomes/offset");
   private static final aix<dqo> D = a("overworld_large_biomes/factor");
   private static final aix<dqo> E = a("overworld_large_biomes/jaggedness");
   private static final aix<dqo> F = a("overworld_large_biomes/depth");
   private static final aix<dqo> G = a("overworld_large_biomes/sloped_cheese");
   private static final aix<dqo> H = a("overworld_amplified/offset");
   private static final aix<dqo> I = a("overworld_amplified/factor");
   private static final aix<dqo> J = a("overworld_amplified/jaggedness");
   private static final aix<dqo> K = a("overworld_amplified/depth");
   private static final aix<dqo> L = a("overworld_amplified/sloped_cheese");
   private static final aix<dqo> M = a("end/sloped_cheese");
   private static final aix<dqo> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aix<dqo> O = a("overworld/caves/entrances");
   private static final aix<dqo> P = a("overworld/caves/noodle");
   private static final aix<dqo> Q = a("overworld/caves/pillars");
   private static final aix<dqo> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aix<dqo> S = a("overworld/caves/spaghetti_2d");

   private static aix<dqo> a(String $$0) {
      return aix.a(kg.ax, new aiy($$0));
   }

   public static ij<? extends dqo> a(ph<dqo> $$0) {
      ik<efz.a> $$1 = $$0.a(kg.aB);
      ik<dqo> $$2 = $$0.a(kg.ax);
      $$0.a(u, dqp.a());
      int $$3 = dov.e * 2;
      int $$4 = dov.d * 2;
      $$0.a(v, dqp.a($$3, $$4, (double)$$3, (double)$$4));
      dqo $$5 = a($$0, w, dqp.b(dqp.c(dqp.b($$1.b(dre.j)))));
      dqo $$6 = a($$0, x, dqp.b(dqp.c(dqp.c($$1.b(dre.j)))));
      $$0.a(y, efw.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, efw.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, efw.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ij<dqo> $$7 = $$0.a(d, dqp.b(dqp.a($$5, $$6, 0.25, $$1.b(dre.c))));
      ij<dqo> $$8 = $$0.a(e, dqp.b(dqp.a($$5, $$6, 0.25, $$1.b(dre.d))));
      dqo $$9 = a($$0, f, dqp.b(dqp.a($$5, $$6, 0.25, $$1.b(dre.i))));
      $$0.a(g, a($$9));
      dqo $$10 = dqp.b($$1.b(dre.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ij<dqo> $$11 = $$0.a(l, dqp.b(dqp.a($$5, $$6, 0.25, $$1.b(dre.g))));
      ij<dqo> $$12 = $$0.a(m, dqp.b(dqp.a($$5, $$6, 0.25, $$1.b(dre.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dqp.a(dqp.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dqp.d(dqp.a($$1.b(dre.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      ph<dqo> $$0, ik<dqo> $$1, dqo $$2, ij<dqo> $$3, ij<dqo> $$4, aix<dqo> $$5, aix<dqo> $$6, aix<dqo> $$7, aix<dqo> $$8, aix<dqo> $$9, boolean $$10
   ) {
      dqp.w.a $$11 = new dqp.w.a($$3);
      dqp.w.a $$12 = new dqp.w.a($$4);
      dqp.w.a $$13 = new dqp.w.a($$1.b(f));
      dqp.w.a $$14 = new dqp.w.a($$1.b(g));
      dqo $$15 = a($$0, $$5, a(dqp.a(dqp.a(-0.50375F), dqp.a(pw.a($$11, $$12, $$14, $$10))), dqp.c()));
      dqo $$16 = a($$0, $$6, a(dqp.a(pw.a($$11, $$12, $$13, $$14, $$10)), s));
      dqo $$17 = a($$0, $$8, dqp.a(dqp.a(-64, 320, 1.5, -1.5), $$15));
      dqo $$18 = a($$0, $$7, a(dqp.a(pw.b($$11, $$12, $$13, $$14, $$10)), t));
      dqo $$19 = dqp.b($$18, $$2.g());
      dqo $$20 = b($$16, dqp.a($$17, $$19));
      $$0.a($$9, dqp.a($$20, a($$1, y)));
   }

   private static dqo a(ph<dqo> $$0, aix<dqo> $$1, dqo $$2) {
      return new dqp.j($$0.a($$1, $$2));
   }

   private static dqo a(ik<dqo> $$0, aix<dqo> $$1) {
      return new dqp.j($$0.b($$1));
   }

   private static dqo a(dqo $$0) {
      return dqp.b(dqp.a(dqp.a($$0.d(), dqp.a(-0.6666666666666666)).d(), dqp.a(-0.3333333333333333)), dqp.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dqo b(ik<efz.a> $$0) {
      dqo $$1 = dqp.a($$0.b(dre.z));
      dqo $$2 = dqp.a($$0.b(dre.A), 0.0, -0.1);
      return dqp.d(dqp.b($$2, dqp.a($$1.d(), dqp.a(-0.4))));
   }

   private static dqo d(ik<dqo> $$0, ik<efz.a> $$1) {
      dqo $$2 = dqp.d(dqp.b($$1.b(dre.x), 2.0, 1.0));
      dqo $$3 = dqp.a($$1.b(dre.y), -0.065, -0.088);
      dqo $$4 = dqp.a($$2, $$1.b(dre.v), dqp.z.a.a);
      dqo $$5 = dqp.a($$2, $$1.b(dre.w), dqp.z.a.a);
      dqo $$6 = dqp.a(dqp.d($$4, $$5), $$3).a(-1.0, 1.0);
      dqo $$7 = a($$0, N);
      dqo $$8 = dqp.b($$1.b(dre.B), 0.75, 0.5);
      dqo $$9 = dqp.a(dqp.a($$8, dqp.a(0.37)), dqp.a(-10, 30, 0.3, 0.0));
      return dqp.d(dqp.c($$9, dqp.a($$7, $$6)));
   }

   private static dqo e(ik<dqo> $$0, ik<efz.a> $$1) {
      dqo $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dqo $$6 = a($$2, dqp.b($$1.b(dre.I), 1.0, 1.0), -60, 320, -1);
      dqo $$7 = a($$2, dqp.a($$1.b(dre.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dqo $$9 = a($$2, dqp.b($$1.b(dre.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dqo $$10 = a($$2, dqp.b($$1.b(dre.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dqo $$11 = dqp.b(dqp.a(1.5), dqp.d($$9.d(), $$10.d()));
      return dqp.a($$6, -1000000.0, 0.0, dqp.a(64.0), dqp.a($$7, $$11));
   }

   private static dqo c(ik<efz.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dqo $$3 = dqp.b($$0.b(dre.o), 25.0, 0.3);
      dqo $$4 = dqp.a($$0.b(dre.p), 0.0, -2.0);
      dqo $$5 = dqp.a($$0.b(dre.q), 0.0, 1.1);
      dqo $$6 = dqp.a(dqp.b($$3, dqp.a(2.0)), $$4);
      return dqp.d(dqp.b($$6, $$5.f()));
   }

   private static dqo f(ik<dqo> $$0, ik<efz.a> $$1) {
      dqo $$2 = dqp.b($$1.b(dre.t), 2.0, 1.0);
      dqo $$3 = dqp.a($$2, $$1.b(dre.r), dqp.z.a.b);
      dqo $$4 = dqp.a($$1.b(dre.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dqo $$5 = a($$0, R);
      dqo $$6 = dqp.a($$4, dqp.a(-64, 320, 8.0, -40.0)).d();
      dqo $$7 = dqp.a($$6, $$5).f();
      double $$8 = 0.083;
      dqo $$9 = dqp.a($$3, dqp.b(dqp.a(0.083), $$5));
      return dqp.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dqo a(ik<dqo> $$0, ik<efz.a> $$1, dqo $$2) {
      dqo $$3 = a($$0, S);
      dqo $$4 = a($$0, N);
      dqo $$5 = dqp.a($$1.b(dre.C), 8.0);
      dqo $$6 = dqp.b(dqp.a(4.0), $$5.e());
      dqo $$7 = dqp.a($$1.b(dre.D), 0.6666666666666666);
      dqo $$8 = dqp.a(dqp.a(dqp.a(0.27), $$7).a(-1.0, 1.0), dqp.a(dqp.a(1.5), dqp.b(dqp.a(-0.64), $$2)).a(0.0, 0.5));
      dqo $$9 = dqp.a($$6, $$8);
      dqo $$10 = dqp.c(dqp.c($$9, a($$0, O)), dqp.a($$3, $$4));
      dqo $$11 = a($$0, Q);
      dqo $$12 = dqp.a($$11, -1000000.0, 0.03, dqp.a(-1000000.0), $$11);
      return dqp.d($$10, $$12);
   }

   private static dqo b(dqo $$0) {
      dqo $$1 = dqp.f($$0);
      return dqp.b(dqp.a($$1), dqp.a(0.64)).i();
   }

   protected static drb a(ik<dqo> $$0, ik<efz.a> $$1, boolean $$2, boolean $$3) {
      dqo $$4 = dqp.a($$1.b(dre.k), 0.5);
      dqo $$5 = dqp.a($$1.b(dre.l), 0.67);
      dqo $$6 = dqp.a($$1.b(dre.n), 0.7142857142857143);
      dqo $$7 = dqp.a($$1.b(dre.m));
      dqo $$8 = a($$0, w);
      dqo $$9 = a($$0, x);
      dqo $$10 = dqp.a($$8, $$9, 0.25, $$1.b($$2 ? dre.e : dre.a));
      dqo $$11 = dqp.a($$8, $$9, 0.25, $$1.b($$2 ? dre.f : dre.b));
      dqo $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dqo $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dqo $$14 = b(dqp.c($$12), $$13);
      dqo $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dqo $$16 = dqp.c($$15, dqp.b(dqp.a(5.0), a($$0, O)));
      dqo $$17 = dqp.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dqo $$18 = dqp.c(b(a($$3, $$17)), a($$0, P));
      dqo $$19 = a($$0, v);
      int $$20 = Stream.of(drf.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dov.e * 2);
      int $$21 = Stream.of(drf.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dov.e * 2);
      dqo $$22 = a($$19, dqp.b($$1.b(dre.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dqo $$24 = a($$19, dqp.b($$1.b(dre.F), 4.0, 4.0), $$20, $$21, 0).d();
      dqo $$25 = a($$19, dqp.b($$1.b(dre.G), 4.0, 4.0), $$20, $$21, 0).d();
      dqo $$26 = dqp.a(dqp.a(-0.08F), dqp.d($$24, $$25));
      dqo $$27 = dqp.a($$1.b(dre.H));
      return new drb(
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
         a($$3, dqp.a($$14, dqp.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static drb b(ik<dqo> $$0, ik<efz.a> $$1, dqo $$2) {
      dqo $$3 = a($$0, w);
      dqo $$4 = a($$0, x);
      dqo $$5 = dqp.a($$3, $$4, 0.25, $$1.b(dre.a));
      dqo $$6 = dqp.a($$3, $$4, 0.25, $$1.b(dre.b));
      dqo $$7 = b($$2);
      return new drb(dqp.a(), dqp.a(), dqp.a(), dqp.a(), $$5, $$6, dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), $$7, dqp.a(), dqp.a(), dqp.a());
   }

   private static dqo a(boolean $$0, dqo $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dqo a(ik<dqo> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dqo a(dqo $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static drb a(ik<dqo> $$0, ik<efz.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static drb b(ik<dqo> $$0, ik<efz.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static drb c(ik<dqo> $$0, ik<efz.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dqo c(dqo $$0) {
      return a($$0, 0, 128);
   }

   protected static drb a(ik<dqo> $$0) {
      dqo $$1 = dqp.c(dqp.a(0L));
      dqo $$2 = b(c(a($$0, M)));
      return new drb(
         dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), $$1, dqp.a(), dqp.a(), c(dqp.a($$1, dqp.a(-0.703125))), $$2, dqp.a(), dqp.a(), dqp.a()
      );
   }

   protected static drb a() {
      return new drb(dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a(), dqp.a());
   }

   private static dqo a(dqo $$0, dqo $$1) {
      dqo $$2 = dqp.a(dqp.b(), $$1, $$0);
      return dqp.b(dqp.c($$2));
   }

   private static dqo b(dqo $$0, dqo $$1) {
      dqo $$2 = dqp.b($$1, $$0);
      return dqp.b(dqp.a(4.0), $$2.h());
   }

   private static dqo a(dqo $$0, dqo $$1, int $$2, int $$3, int $$4) {
      return dqp.a(dqp.a($$0, (double)$$2, (double)($$3 + 1), $$1, dqp.a((double)$$4)));
   }

   private static dqo a(dqo $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dqo $$10 = dqp.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dqo $$9 = dqp.a($$10, $$5, $$0);
      dqo $$11 = dqp.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dqp.a($$11, $$8, $$9);
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
