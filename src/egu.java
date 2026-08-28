import java.util.stream.Stream;

public class egu {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final egg s = egh.a(10.0);
   private static final egg t = egh.a();
   private static final alf<egg> u = a("zero");
   private static final alf<egg> v = a("y");
   private static final alf<egg> w = a("shift_x");
   private static final alf<egg> x = a("shift_z");
   private static final alf<egg> y = a("overworld/base_3d_noise");
   private static final alf<egg> z = a("nether/base_3d_noise");
   private static final alf<egg> A = a("end/base_3d_noise");
   public static final alf<egg> d = a("overworld/continents");
   public static final alf<egg> e = a("overworld/erosion");
   public static final alf<egg> f = a("overworld/ridges");
   public static final alf<egg> g = a("overworld/ridges_folded");
   public static final alf<egg> h = a("overworld/offset");
   public static final alf<egg> i = a("overworld/factor");
   public static final alf<egg> j = a("overworld/jaggedness");
   public static final alf<egg> k = a("overworld/depth");
   private static final alf<egg> B = a("overworld/sloped_cheese");
   public static final alf<egg> l = a("overworld_large_biomes/continents");
   public static final alf<egg> m = a("overworld_large_biomes/erosion");
   private static final alf<egg> C = a("overworld_large_biomes/offset");
   private static final alf<egg> D = a("overworld_large_biomes/factor");
   private static final alf<egg> E = a("overworld_large_biomes/jaggedness");
   private static final alf<egg> F = a("overworld_large_biomes/depth");
   private static final alf<egg> G = a("overworld_large_biomes/sloped_cheese");
   private static final alf<egg> H = a("overworld_amplified/offset");
   private static final alf<egg> I = a("overworld_amplified/factor");
   private static final alf<egg> J = a("overworld_amplified/jaggedness");
   private static final alf<egg> K = a("overworld_amplified/depth");
   private static final alf<egg> L = a("overworld_amplified/sloped_cheese");
   private static final alf<egg> M = a("end/sloped_cheese");
   private static final alf<egg> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alf<egg> O = a("overworld/caves/entrances");
   private static final alf<egg> P = a("overworld/caves/noodle");
   private static final alf<egg> Q = a("overworld/caves/pillars");
   private static final alf<egg> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alf<egg> S = a("overworld/caves/spaghetti_2d");

   private static alf<egg> a(String $$0) {
      return alf.a(mh.aO, alg.b($$0));
   }

   public static jf<? extends egg> a(qh<egg> $$0) {
      jg<evy.a> $$1 = $$0.a(mh.aY);
      jg<egg> $$2 = $$0.a(mh.aO);
      $$0.a(u, egh.a());
      int $$3 = eel.e * 2;
      int $$4 = eel.d * 2;
      $$0.a(v, egh.a($$3, $$4, (double)$$3, (double)$$4));
      egg $$5 = a($$0, w, egh.b(egh.c(egh.b($$1.b(egw.j)))));
      egg $$6 = a($$0, x, egh.b(egh.c(egh.c($$1.b(egw.j)))));
      $$0.a(y, evv.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, evv.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, evv.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jf<egg> $$7 = $$0.a(d, egh.b(egh.a($$5, $$6, 0.25, $$1.b(egw.c))));
      jf<egg> $$8 = $$0.a(e, egh.b(egh.a($$5, $$6, 0.25, $$1.b(egw.d))));
      egg $$9 = a($$0, f, egh.b(egh.a($$5, $$6, 0.25, $$1.b(egw.i))));
      $$0.a(g, a($$9));
      egg $$10 = egh.b($$1.b(egw.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jf<egg> $$11 = $$0.a(l, egh.b(egh.a($$5, $$6, 0.25, $$1.b(egw.g))));
      jf<egg> $$12 = $$0.a(m, egh.b(egh.a($$5, $$6, 0.25, $$1.b(egw.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, egh.a(egh.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, egh.d(egh.a($$1.b(egw.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qh<egg> $$0, jg<egg> $$1, egg $$2, jf<egg> $$3, jf<egg> $$4, alf<egg> $$5, alf<egg> $$6, alf<egg> $$7, alf<egg> $$8, alf<egg> $$9, boolean $$10
   ) {
      egh.w.a $$11 = new egh.w.a($$3);
      egh.w.a $$12 = new egh.w.a($$4);
      egh.w.a $$13 = new egh.w.a($$1.b(f));
      egh.w.a $$14 = new egh.w.a($$1.b(g));
      egg $$15 = a($$0, $$5, a(egh.a(egh.a(-0.50375F), egh.a(qw.a($$11, $$12, $$14, $$10))), egh.c()));
      egg $$16 = a($$0, $$6, a(egh.a(qw.a($$11, $$12, $$13, $$14, $$10)), s));
      egg $$17 = a($$0, $$8, egh.a(egh.a(-64, 320, 1.5, -1.5), $$15));
      egg $$18 = a($$0, $$7, a(egh.a(qw.b($$11, $$12, $$13, $$14, $$10)), t));
      egg $$19 = egh.b($$18, $$2.g());
      egg $$20 = b($$16, egh.a($$17, $$19));
      $$0.a($$9, egh.a($$20, a($$1, y)));
   }

   private static egg a(qh<egg> $$0, alf<egg> $$1, egg $$2) {
      return new egh.j($$0.a($$1, $$2));
   }

   private static egg a(jg<egg> $$0, alf<egg> $$1) {
      return new egh.j($$0.b($$1));
   }

   private static egg a(egg $$0) {
      return egh.b(egh.a(egh.a($$0.d(), egh.a(-0.6666666666666666)).d(), egh.a(-0.3333333333333333)), egh.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static egg b(jg<evy.a> $$0) {
      egg $$1 = egh.a($$0.b(egw.z));
      egg $$2 = egh.a($$0.b(egw.A), 0.0, -0.1);
      return egh.d(egh.b($$2, egh.a($$1.d(), egh.a(-0.4))));
   }

   private static egg d(jg<egg> $$0, jg<evy.a> $$1) {
      egg $$2 = egh.d(egh.b($$1.b(egw.x), 2.0, 1.0));
      egg $$3 = egh.a($$1.b(egw.y), -0.065, -0.088);
      egg $$4 = egh.a($$2, $$1.b(egw.v), egh.z.a.a);
      egg $$5 = egh.a($$2, $$1.b(egw.w), egh.z.a.a);
      egg $$6 = egh.a(egh.d($$4, $$5), $$3).a(-1.0, 1.0);
      egg $$7 = a($$0, N);
      egg $$8 = egh.b($$1.b(egw.B), 0.75, 0.5);
      egg $$9 = egh.a(egh.a($$8, egh.a(0.37)), egh.a(-10, 30, 0.3, 0.0));
      return egh.d(egh.c($$9, egh.a($$7, $$6)));
   }

   private static egg e(jg<egg> $$0, jg<evy.a> $$1) {
      egg $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      egg $$6 = a($$2, egh.b($$1.b(egw.I), 1.0, 1.0), -60, 320, -1);
      egg $$7 = a($$2, egh.a($$1.b(egw.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      egg $$9 = a($$2, egh.b($$1.b(egw.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      egg $$10 = a($$2, egh.b($$1.b(egw.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      egg $$11 = egh.b(egh.a(1.5), egh.d($$9.d(), $$10.d()));
      return egh.a($$6, -1000000.0, 0.0, egh.a(64.0), egh.a($$7, $$11));
   }

   private static egg c(jg<evy.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      egg $$3 = egh.b($$0.b(egw.o), 25.0, 0.3);
      egg $$4 = egh.a($$0.b(egw.p), 0.0, -2.0);
      egg $$5 = egh.a($$0.b(egw.q), 0.0, 1.1);
      egg $$6 = egh.a(egh.b($$3, egh.a(2.0)), $$4);
      return egh.d(egh.b($$6, $$5.f()));
   }

   private static egg f(jg<egg> $$0, jg<evy.a> $$1) {
      egg $$2 = egh.b($$1.b(egw.t), 2.0, 1.0);
      egg $$3 = egh.a($$2, $$1.b(egw.r), egh.z.a.b);
      egg $$4 = egh.a($$1.b(egw.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      egg $$5 = a($$0, R);
      egg $$6 = egh.a($$4, egh.a(-64, 320, 8.0, -40.0)).d();
      egg $$7 = egh.a($$6, $$5).f();
      double $$8 = 0.083;
      egg $$9 = egh.a($$3, egh.b(egh.a(0.083), $$5));
      return egh.d($$9, $$7).a(-1.0, 1.0);
   }

   private static egg a(jg<egg> $$0, jg<evy.a> $$1, egg $$2) {
      egg $$3 = a($$0, S);
      egg $$4 = a($$0, N);
      egg $$5 = egh.a($$1.b(egw.C), 8.0);
      egg $$6 = egh.b(egh.a(4.0), $$5.e());
      egg $$7 = egh.a($$1.b(egw.D), 0.6666666666666666);
      egg $$8 = egh.a(egh.a(egh.a(0.27), $$7).a(-1.0, 1.0), egh.a(egh.a(1.5), egh.b(egh.a(-0.64), $$2)).a(0.0, 0.5));
      egg $$9 = egh.a($$6, $$8);
      egg $$10 = egh.c(egh.c($$9, a($$0, O)), egh.a($$3, $$4));
      egg $$11 = a($$0, Q);
      egg $$12 = egh.a($$11, -1000000.0, 0.03, egh.a(-1000000.0), $$11);
      return egh.d($$10, $$12);
   }

   private static egg b(egg $$0) {
      egg $$1 = egh.f($$0);
      return egh.b(egh.a($$1), egh.a(0.64)).i();
   }

   protected static egt a(jg<egg> $$0, jg<evy.a> $$1, boolean $$2, boolean $$3) {
      egg $$4 = egh.a($$1.b(egw.k), 0.5);
      egg $$5 = egh.a($$1.b(egw.l), 0.67);
      egg $$6 = egh.a($$1.b(egw.n), 0.7142857142857143);
      egg $$7 = egh.a($$1.b(egw.m));
      egg $$8 = a($$0, w);
      egg $$9 = a($$0, x);
      egg $$10 = egh.a($$8, $$9, 0.25, $$1.b($$2 ? egw.e : egw.a));
      egg $$11 = egh.a($$8, $$9, 0.25, $$1.b($$2 ? egw.f : egw.b));
      egg $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      egg $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      egg $$14 = b(egh.c($$12), $$13);
      egg $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      egg $$16 = egh.c($$15, egh.b(egh.a(5.0), a($$0, O)));
      egg $$17 = egh.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      egg $$18 = egh.c(b(a($$3, $$17)), a($$0, P));
      egg $$19 = a($$0, v);
      int $$20 = Stream.of(egx.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-eel.e * 2);
      int $$21 = Stream.of(egx.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-eel.e * 2);
      egg $$22 = a($$19, egh.b($$1.b(egw.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      egg $$24 = a($$19, egh.b($$1.b(egw.F), 4.0, 4.0), $$20, $$21, 0).d();
      egg $$25 = a($$19, egh.b($$1.b(egw.G), 4.0, 4.0), $$20, $$21, 0).d();
      egg $$26 = egh.a(egh.a(-0.08F), egh.d($$24, $$25));
      egg $$27 = egh.a($$1.b(egw.H));
      return new egt(
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
         a($$3, egh.a($$14, egh.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static egt b(jg<egg> $$0, jg<evy.a> $$1, egg $$2) {
      egg $$3 = a($$0, w);
      egg $$4 = a($$0, x);
      egg $$5 = egh.a($$3, $$4, 0.25, $$1.b(egw.a));
      egg $$6 = egh.a($$3, $$4, 0.25, $$1.b(egw.b));
      egg $$7 = b($$2);
      return new egt(egh.a(), egh.a(), egh.a(), egh.a(), $$5, $$6, egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), $$7, egh.a(), egh.a(), egh.a());
   }

   private static egg a(boolean $$0, egg $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static egg a(jg<egg> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static egg a(egg $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static egt a(jg<egg> $$0, jg<evy.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static egt b(jg<egg> $$0, jg<evy.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static egt c(jg<egg> $$0, jg<evy.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static egg c(egg $$0) {
      return a($$0, 0, 128);
   }

   protected static egt a(jg<egg> $$0) {
      egg $$1 = egh.c(egh.a(0L));
      egg $$2 = b(c(a($$0, M)));
      return new egt(
         egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), $$1, egh.a(), egh.a(), c(egh.a($$1, egh.a(-0.703125))), $$2, egh.a(), egh.a(), egh.a()
      );
   }

   protected static egt a() {
      return new egt(egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), egh.a(), egh.a());
   }

   private static egg a(egg $$0, egg $$1) {
      egg $$2 = egh.a(egh.b(), $$1, $$0);
      return egh.b(egh.c($$2));
   }

   private static egg b(egg $$0, egg $$1) {
      egg $$2 = egh.b($$1, $$0);
      return egh.b(egh.a(4.0), $$2.h());
   }

   private static egg a(egg $$0, egg $$1, int $$2, int $$3, int $$4) {
      return egh.a(egh.a($$0, (double)$$2, (double)($$3 + 1), $$1, egh.a((double)$$4)));
   }

   private static egg a(egg $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      egg $$10 = egh.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      egg $$9 = egh.a($$10, $$5, $$0);
      egg $$11 = egh.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return egh.a($$11, $$8, $$9);
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
