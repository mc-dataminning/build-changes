import java.util.stream.Stream;

public class ees {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final eee s = eef.a(10.0);
   private static final eee t = eef.a();
   private static final alc<eee> u = a("zero");
   private static final alc<eee> v = a("y");
   private static final alc<eee> w = a("shift_x");
   private static final alc<eee> x = a("shift_z");
   private static final alc<eee> y = a("overworld/base_3d_noise");
   private static final alc<eee> z = a("nether/base_3d_noise");
   private static final alc<eee> A = a("end/base_3d_noise");
   public static final alc<eee> d = a("overworld/continents");
   public static final alc<eee> e = a("overworld/erosion");
   public static final alc<eee> f = a("overworld/ridges");
   public static final alc<eee> g = a("overworld/ridges_folded");
   public static final alc<eee> h = a("overworld/offset");
   public static final alc<eee> i = a("overworld/factor");
   public static final alc<eee> j = a("overworld/jaggedness");
   public static final alc<eee> k = a("overworld/depth");
   private static final alc<eee> B = a("overworld/sloped_cheese");
   public static final alc<eee> l = a("overworld_large_biomes/continents");
   public static final alc<eee> m = a("overworld_large_biomes/erosion");
   private static final alc<eee> C = a("overworld_large_biomes/offset");
   private static final alc<eee> D = a("overworld_large_biomes/factor");
   private static final alc<eee> E = a("overworld_large_biomes/jaggedness");
   private static final alc<eee> F = a("overworld_large_biomes/depth");
   private static final alc<eee> G = a("overworld_large_biomes/sloped_cheese");
   private static final alc<eee> H = a("overworld_amplified/offset");
   private static final alc<eee> I = a("overworld_amplified/factor");
   private static final alc<eee> J = a("overworld_amplified/jaggedness");
   private static final alc<eee> K = a("overworld_amplified/depth");
   private static final alc<eee> L = a("overworld_amplified/sloped_cheese");
   private static final alc<eee> M = a("end/sloped_cheese");
   private static final alc<eee> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alc<eee> O = a("overworld/caves/entrances");
   private static final alc<eee> P = a("overworld/caves/noodle");
   private static final alc<eee> Q = a("overworld/caves/pillars");
   private static final alc<eee> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alc<eee> S = a("overworld/caves/spaghetti_2d");

   private static alc<eee> a(String $$0) {
      return alc.a(me.aQ, ald.b($$0));
   }

   public static js<? extends eee> a(qg<eee> $$0) {
      jt<etw.a> $$1 = $$0.a(me.aW);
      jt<eee> $$2 = $$0.a(me.aQ);
      $$0.a(u, eef.a());
      int $$3 = ecj.e * 2;
      int $$4 = ecj.d * 2;
      $$0.a(v, eef.a($$3, $$4, (double)$$3, (double)$$4));
      eee $$5 = a($$0, w, eef.b(eef.c(eef.b($$1.b(eeu.j)))));
      eee $$6 = a($$0, x, eef.b(eef.c(eef.c($$1.b(eeu.j)))));
      $$0.a(y, ett.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ett.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ett.a(0.25, 0.25, 80.0, 160.0, 4.0));
      js<eee> $$7 = $$0.a(d, eef.b(eef.a($$5, $$6, 0.25, $$1.b(eeu.c))));
      js<eee> $$8 = $$0.a(e, eef.b(eef.a($$5, $$6, 0.25, $$1.b(eeu.d))));
      eee $$9 = a($$0, f, eef.b(eef.a($$5, $$6, 0.25, $$1.b(eeu.i))));
      $$0.a(g, a($$9));
      eee $$10 = eef.b($$1.b(eeu.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      js<eee> $$11 = $$0.a(l, eef.b(eef.a($$5, $$6, 0.25, $$1.b(eeu.g))));
      js<eee> $$12 = $$0.a(m, eef.b(eef.a($$5, $$6, 0.25, $$1.b(eeu.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, eef.a(eef.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, eef.d(eef.a($$1.b(eeu.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qg<eee> $$0, jt<eee> $$1, eee $$2, js<eee> $$3, js<eee> $$4, alc<eee> $$5, alc<eee> $$6, alc<eee> $$7, alc<eee> $$8, alc<eee> $$9, boolean $$10
   ) {
      eef.w.a $$11 = new eef.w.a($$3);
      eef.w.a $$12 = new eef.w.a($$4);
      eef.w.a $$13 = new eef.w.a($$1.b(f));
      eef.w.a $$14 = new eef.w.a($$1.b(g));
      eee $$15 = a($$0, $$5, a(eef.a(eef.a(-0.50375F), eef.a(qv.a($$11, $$12, $$14, $$10))), eef.c()));
      eee $$16 = a($$0, $$6, a(eef.a(qv.a($$11, $$12, $$13, $$14, $$10)), s));
      eee $$17 = a($$0, $$8, eef.a(eef.a(-64, 320, 1.5, -1.5), $$15));
      eee $$18 = a($$0, $$7, a(eef.a(qv.b($$11, $$12, $$13, $$14, $$10)), t));
      eee $$19 = eef.b($$18, $$2.g());
      eee $$20 = b($$16, eef.a($$17, $$19));
      $$0.a($$9, eef.a($$20, a($$1, y)));
   }

   private static eee a(qg<eee> $$0, alc<eee> $$1, eee $$2) {
      return new eef.j($$0.a($$1, $$2));
   }

   private static eee a(jt<eee> $$0, alc<eee> $$1) {
      return new eef.j($$0.b($$1));
   }

   private static eee a(eee $$0) {
      return eef.b(eef.a(eef.a($$0.d(), eef.a(-0.6666666666666666)).d(), eef.a(-0.3333333333333333)), eef.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static eee b(jt<etw.a> $$0) {
      eee $$1 = eef.a($$0.b(eeu.z));
      eee $$2 = eef.a($$0.b(eeu.A), 0.0, -0.1);
      return eef.d(eef.b($$2, eef.a($$1.d(), eef.a(-0.4))));
   }

   private static eee d(jt<eee> $$0, jt<etw.a> $$1) {
      eee $$2 = eef.d(eef.b($$1.b(eeu.x), 2.0, 1.0));
      eee $$3 = eef.a($$1.b(eeu.y), -0.065, -0.088);
      eee $$4 = eef.a($$2, $$1.b(eeu.v), eef.z.a.a);
      eee $$5 = eef.a($$2, $$1.b(eeu.w), eef.z.a.a);
      eee $$6 = eef.a(eef.d($$4, $$5), $$3).a(-1.0, 1.0);
      eee $$7 = a($$0, N);
      eee $$8 = eef.b($$1.b(eeu.B), 0.75, 0.5);
      eee $$9 = eef.a(eef.a($$8, eef.a(0.37)), eef.a(-10, 30, 0.3, 0.0));
      return eef.d(eef.c($$9, eef.a($$7, $$6)));
   }

   private static eee e(jt<eee> $$0, jt<etw.a> $$1) {
      eee $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      eee $$6 = a($$2, eef.b($$1.b(eeu.I), 1.0, 1.0), -60, 320, -1);
      eee $$7 = a($$2, eef.a($$1.b(eeu.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      eee $$9 = a($$2, eef.b($$1.b(eeu.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      eee $$10 = a($$2, eef.b($$1.b(eeu.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      eee $$11 = eef.b(eef.a(1.5), eef.d($$9.d(), $$10.d()));
      return eef.a($$6, -1000000.0, 0.0, eef.a(64.0), eef.a($$7, $$11));
   }

   private static eee c(jt<etw.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      eee $$3 = eef.b($$0.b(eeu.o), 25.0, 0.3);
      eee $$4 = eef.a($$0.b(eeu.p), 0.0, -2.0);
      eee $$5 = eef.a($$0.b(eeu.q), 0.0, 1.1);
      eee $$6 = eef.a(eef.b($$3, eef.a(2.0)), $$4);
      return eef.d(eef.b($$6, $$5.f()));
   }

   private static eee f(jt<eee> $$0, jt<etw.a> $$1) {
      eee $$2 = eef.b($$1.b(eeu.t), 2.0, 1.0);
      eee $$3 = eef.a($$2, $$1.b(eeu.r), eef.z.a.b);
      eee $$4 = eef.a($$1.b(eeu.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      eee $$5 = a($$0, R);
      eee $$6 = eef.a($$4, eef.a(-64, 320, 8.0, -40.0)).d();
      eee $$7 = eef.a($$6, $$5).f();
      double $$8 = 0.083;
      eee $$9 = eef.a($$3, eef.b(eef.a(0.083), $$5));
      return eef.d($$9, $$7).a(-1.0, 1.0);
   }

   private static eee a(jt<eee> $$0, jt<etw.a> $$1, eee $$2) {
      eee $$3 = a($$0, S);
      eee $$4 = a($$0, N);
      eee $$5 = eef.a($$1.b(eeu.C), 8.0);
      eee $$6 = eef.b(eef.a(4.0), $$5.e());
      eee $$7 = eef.a($$1.b(eeu.D), 0.6666666666666666);
      eee $$8 = eef.a(eef.a(eef.a(0.27), $$7).a(-1.0, 1.0), eef.a(eef.a(1.5), eef.b(eef.a(-0.64), $$2)).a(0.0, 0.5));
      eee $$9 = eef.a($$6, $$8);
      eee $$10 = eef.c(eef.c($$9, a($$0, O)), eef.a($$3, $$4));
      eee $$11 = a($$0, Q);
      eee $$12 = eef.a($$11, -1000000.0, 0.03, eef.a(-1000000.0), $$11);
      return eef.d($$10, $$12);
   }

   private static eee b(eee $$0) {
      eee $$1 = eef.f($$0);
      return eef.b(eef.a($$1), eef.a(0.64)).i();
   }

   protected static eer a(jt<eee> $$0, jt<etw.a> $$1, boolean $$2, boolean $$3) {
      eee $$4 = eef.a($$1.b(eeu.k), 0.5);
      eee $$5 = eef.a($$1.b(eeu.l), 0.67);
      eee $$6 = eef.a($$1.b(eeu.n), 0.7142857142857143);
      eee $$7 = eef.a($$1.b(eeu.m));
      eee $$8 = a($$0, w);
      eee $$9 = a($$0, x);
      eee $$10 = eef.a($$8, $$9, 0.25, $$1.b($$2 ? eeu.e : eeu.a));
      eee $$11 = eef.a($$8, $$9, 0.25, $$1.b($$2 ? eeu.f : eeu.b));
      eee $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      eee $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      eee $$14 = b(eef.c($$12), $$13);
      eee $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      eee $$16 = eef.c($$15, eef.b(eef.a(5.0), a($$0, O)));
      eee $$17 = eef.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      eee $$18 = eef.c(b(a($$3, $$17)), a($$0, P));
      eee $$19 = a($$0, v);
      int $$20 = Stream.of(eev.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-ecj.e * 2);
      int $$21 = Stream.of(eev.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-ecj.e * 2);
      eee $$22 = a($$19, eef.b($$1.b(eeu.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      eee $$24 = a($$19, eef.b($$1.b(eeu.F), 4.0, 4.0), $$20, $$21, 0).d();
      eee $$25 = a($$19, eef.b($$1.b(eeu.G), 4.0, 4.0), $$20, $$21, 0).d();
      eee $$26 = eef.a(eef.a(-0.08F), eef.d($$24, $$25));
      eee $$27 = eef.a($$1.b(eeu.H));
      return new eer(
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
         a($$3, eef.a($$14, eef.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static eer b(jt<eee> $$0, jt<etw.a> $$1, eee $$2) {
      eee $$3 = a($$0, w);
      eee $$4 = a($$0, x);
      eee $$5 = eef.a($$3, $$4, 0.25, $$1.b(eeu.a));
      eee $$6 = eef.a($$3, $$4, 0.25, $$1.b(eeu.b));
      eee $$7 = b($$2);
      return new eer(eef.a(), eef.a(), eef.a(), eef.a(), $$5, $$6, eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), $$7, eef.a(), eef.a(), eef.a());
   }

   private static eee a(boolean $$0, eee $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static eee a(jt<eee> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static eee a(eee $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static eer a(jt<eee> $$0, jt<etw.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static eer b(jt<eee> $$0, jt<etw.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static eer c(jt<eee> $$0, jt<etw.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static eee c(eee $$0) {
      return a($$0, 0, 128);
   }

   protected static eer a(jt<eee> $$0) {
      eee $$1 = eef.c(eef.a(0L));
      eee $$2 = b(c(a($$0, M)));
      return new eer(
         eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), $$1, eef.a(), eef.a(), c(eef.a($$1, eef.a(-0.703125))), $$2, eef.a(), eef.a(), eef.a()
      );
   }

   protected static eer a() {
      return new eer(eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), eef.a(), eef.a());
   }

   private static eee a(eee $$0, eee $$1) {
      eee $$2 = eef.a(eef.b(), $$1, $$0);
      return eef.b(eef.c($$2));
   }

   private static eee b(eee $$0, eee $$1) {
      eee $$2 = eef.b($$1, $$0);
      return eef.b(eef.a(4.0), $$2.h());
   }

   private static eee a(eee $$0, eee $$1, int $$2, int $$3, int $$4) {
      return eef.a(eef.a($$0, (double)$$2, (double)($$3 + 1), $$1, eef.a((double)$$4)));
   }

   private static eee a(eee $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      eee $$10 = eef.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      eee $$9 = eef.a($$10, $$5, $$0);
      eee $$11 = eef.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return eef.a($$11, $$8, $$9);
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
