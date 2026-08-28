import java.util.stream.Stream;

public class ebm {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final eay s = eaz.a(10.0);
   private static final eay t = eaz.a();
   private static final alh<eay> u = a("zero");
   private static final alh<eay> v = a("y");
   private static final alh<eay> w = a("shift_x");
   private static final alh<eay> x = a("shift_z");
   private static final alh<eay> y = a("overworld/base_3d_noise");
   private static final alh<eay> z = a("nether/base_3d_noise");
   private static final alh<eay> A = a("end/base_3d_noise");
   public static final alh<eay> d = a("overworld/continents");
   public static final alh<eay> e = a("overworld/erosion");
   public static final alh<eay> f = a("overworld/ridges");
   public static final alh<eay> g = a("overworld/ridges_folded");
   public static final alh<eay> h = a("overworld/offset");
   public static final alh<eay> i = a("overworld/factor");
   public static final alh<eay> j = a("overworld/jaggedness");
   public static final alh<eay> k = a("overworld/depth");
   private static final alh<eay> B = a("overworld/sloped_cheese");
   public static final alh<eay> l = a("overworld_large_biomes/continents");
   public static final alh<eay> m = a("overworld_large_biomes/erosion");
   private static final alh<eay> C = a("overworld_large_biomes/offset");
   private static final alh<eay> D = a("overworld_large_biomes/factor");
   private static final alh<eay> E = a("overworld_large_biomes/jaggedness");
   private static final alh<eay> F = a("overworld_large_biomes/depth");
   private static final alh<eay> G = a("overworld_large_biomes/sloped_cheese");
   private static final alh<eay> H = a("overworld_amplified/offset");
   private static final alh<eay> I = a("overworld_amplified/factor");
   private static final alh<eay> J = a("overworld_amplified/jaggedness");
   private static final alh<eay> K = a("overworld_amplified/depth");
   private static final alh<eay> L = a("overworld_amplified/sloped_cheese");
   private static final alh<eay> M = a("end/sloped_cheese");
   private static final alh<eay> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alh<eay> O = a("overworld/caves/entrances");
   private static final alh<eay> P = a("overworld/caves/noodle");
   private static final alh<eay> Q = a("overworld/caves/pillars");
   private static final alh<eay> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alh<eay> S = a("overworld/caves/spaghetti_2d");

   private static alh<eay> a(String $$0) {
      return alh.a(lz.aK, ali.b($$0));
   }

   public static jq<? extends eay> a(qy<eay> $$0) {
      jr<eqn.a> $$1 = $$0.a(lz.aQ);
      jr<eay> $$2 = $$0.a(lz.aK);
      $$0.a(u, eaz.a());
      int $$3 = dzf.e * 2;
      int $$4 = dzf.d * 2;
      $$0.a(v, eaz.a($$3, $$4, (double)$$3, (double)$$4));
      eay $$5 = a($$0, w, eaz.b(eaz.c(eaz.b($$1.b(ebo.j)))));
      eay $$6 = a($$0, x, eaz.b(eaz.c(eaz.c($$1.b(ebo.j)))));
      $$0.a(y, eqk.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, eqk.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, eqk.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jq<eay> $$7 = $$0.a(d, eaz.b(eaz.a($$5, $$6, 0.25, $$1.b(ebo.c))));
      jq<eay> $$8 = $$0.a(e, eaz.b(eaz.a($$5, $$6, 0.25, $$1.b(ebo.d))));
      eay $$9 = a($$0, f, eaz.b(eaz.a($$5, $$6, 0.25, $$1.b(ebo.i))));
      $$0.a(g, a($$9));
      eay $$10 = eaz.b($$1.b(ebo.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jq<eay> $$11 = $$0.a(l, eaz.b(eaz.a($$5, $$6, 0.25, $$1.b(ebo.g))));
      jq<eay> $$12 = $$0.a(m, eaz.b(eaz.a($$5, $$6, 0.25, $$1.b(ebo.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, eaz.a(eaz.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, eaz.d(eaz.a($$1.b(ebo.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qy<eay> $$0, jr<eay> $$1, eay $$2, jq<eay> $$3, jq<eay> $$4, alh<eay> $$5, alh<eay> $$6, alh<eay> $$7, alh<eay> $$8, alh<eay> $$9, boolean $$10
   ) {
      eaz.w.a $$11 = new eaz.w.a($$3);
      eaz.w.a $$12 = new eaz.w.a($$4);
      eaz.w.a $$13 = new eaz.w.a($$1.b(f));
      eaz.w.a $$14 = new eaz.w.a($$1.b(g));
      eay $$15 = a($$0, $$5, a(eaz.a(eaz.a(-0.50375F), eaz.a(rn.a($$11, $$12, $$14, $$10))), eaz.c()));
      eay $$16 = a($$0, $$6, a(eaz.a(rn.a($$11, $$12, $$13, $$14, $$10)), s));
      eay $$17 = a($$0, $$8, eaz.a(eaz.a(-64, 320, 1.5, -1.5), $$15));
      eay $$18 = a($$0, $$7, a(eaz.a(rn.b($$11, $$12, $$13, $$14, $$10)), t));
      eay $$19 = eaz.b($$18, $$2.g());
      eay $$20 = b($$16, eaz.a($$17, $$19));
      $$0.a($$9, eaz.a($$20, a($$1, y)));
   }

   private static eay a(qy<eay> $$0, alh<eay> $$1, eay $$2) {
      return new eaz.j($$0.a($$1, $$2));
   }

   private static eay a(jr<eay> $$0, alh<eay> $$1) {
      return new eaz.j($$0.b($$1));
   }

   private static eay a(eay $$0) {
      return eaz.b(eaz.a(eaz.a($$0.d(), eaz.a(-0.6666666666666666)).d(), eaz.a(-0.3333333333333333)), eaz.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static eay b(jr<eqn.a> $$0) {
      eay $$1 = eaz.a($$0.b(ebo.z));
      eay $$2 = eaz.a($$0.b(ebo.A), 0.0, -0.1);
      return eaz.d(eaz.b($$2, eaz.a($$1.d(), eaz.a(-0.4))));
   }

   private static eay d(jr<eay> $$0, jr<eqn.a> $$1) {
      eay $$2 = eaz.d(eaz.b($$1.b(ebo.x), 2.0, 1.0));
      eay $$3 = eaz.a($$1.b(ebo.y), -0.065, -0.088);
      eay $$4 = eaz.a($$2, $$1.b(ebo.v), eaz.z.a.a);
      eay $$5 = eaz.a($$2, $$1.b(ebo.w), eaz.z.a.a);
      eay $$6 = eaz.a(eaz.d($$4, $$5), $$3).a(-1.0, 1.0);
      eay $$7 = a($$0, N);
      eay $$8 = eaz.b($$1.b(ebo.B), 0.75, 0.5);
      eay $$9 = eaz.a(eaz.a($$8, eaz.a(0.37)), eaz.a(-10, 30, 0.3, 0.0));
      return eaz.d(eaz.c($$9, eaz.a($$7, $$6)));
   }

   private static eay e(jr<eay> $$0, jr<eqn.a> $$1) {
      eay $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      eay $$6 = a($$2, eaz.b($$1.b(ebo.I), 1.0, 1.0), -60, 320, -1);
      eay $$7 = a($$2, eaz.a($$1.b(ebo.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      eay $$9 = a($$2, eaz.b($$1.b(ebo.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      eay $$10 = a($$2, eaz.b($$1.b(ebo.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      eay $$11 = eaz.b(eaz.a(1.5), eaz.d($$9.d(), $$10.d()));
      return eaz.a($$6, -1000000.0, 0.0, eaz.a(64.0), eaz.a($$7, $$11));
   }

   private static eay c(jr<eqn.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      eay $$3 = eaz.b($$0.b(ebo.o), 25.0, 0.3);
      eay $$4 = eaz.a($$0.b(ebo.p), 0.0, -2.0);
      eay $$5 = eaz.a($$0.b(ebo.q), 0.0, 1.1);
      eay $$6 = eaz.a(eaz.b($$3, eaz.a(2.0)), $$4);
      return eaz.d(eaz.b($$6, $$5.f()));
   }

   private static eay f(jr<eay> $$0, jr<eqn.a> $$1) {
      eay $$2 = eaz.b($$1.b(ebo.t), 2.0, 1.0);
      eay $$3 = eaz.a($$2, $$1.b(ebo.r), eaz.z.a.b);
      eay $$4 = eaz.a($$1.b(ebo.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      eay $$5 = a($$0, R);
      eay $$6 = eaz.a($$4, eaz.a(-64, 320, 8.0, -40.0)).d();
      eay $$7 = eaz.a($$6, $$5).f();
      double $$8 = 0.083;
      eay $$9 = eaz.a($$3, eaz.b(eaz.a(0.083), $$5));
      return eaz.d($$9, $$7).a(-1.0, 1.0);
   }

   private static eay a(jr<eay> $$0, jr<eqn.a> $$1, eay $$2) {
      eay $$3 = a($$0, S);
      eay $$4 = a($$0, N);
      eay $$5 = eaz.a($$1.b(ebo.C), 8.0);
      eay $$6 = eaz.b(eaz.a(4.0), $$5.e());
      eay $$7 = eaz.a($$1.b(ebo.D), 0.6666666666666666);
      eay $$8 = eaz.a(eaz.a(eaz.a(0.27), $$7).a(-1.0, 1.0), eaz.a(eaz.a(1.5), eaz.b(eaz.a(-0.64), $$2)).a(0.0, 0.5));
      eay $$9 = eaz.a($$6, $$8);
      eay $$10 = eaz.c(eaz.c($$9, a($$0, O)), eaz.a($$3, $$4));
      eay $$11 = a($$0, Q);
      eay $$12 = eaz.a($$11, -1000000.0, 0.03, eaz.a(-1000000.0), $$11);
      return eaz.d($$10, $$12);
   }

   private static eay b(eay $$0) {
      eay $$1 = eaz.f($$0);
      return eaz.b(eaz.a($$1), eaz.a(0.64)).i();
   }

   protected static ebl a(jr<eay> $$0, jr<eqn.a> $$1, boolean $$2, boolean $$3) {
      eay $$4 = eaz.a($$1.b(ebo.k), 0.5);
      eay $$5 = eaz.a($$1.b(ebo.l), 0.67);
      eay $$6 = eaz.a($$1.b(ebo.n), 0.7142857142857143);
      eay $$7 = eaz.a($$1.b(ebo.m));
      eay $$8 = a($$0, w);
      eay $$9 = a($$0, x);
      eay $$10 = eaz.a($$8, $$9, 0.25, $$1.b($$2 ? ebo.e : ebo.a));
      eay $$11 = eaz.a($$8, $$9, 0.25, $$1.b($$2 ? ebo.f : ebo.b));
      eay $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      eay $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      eay $$14 = b(eaz.c($$12), $$13);
      eay $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      eay $$16 = eaz.c($$15, eaz.b(eaz.a(5.0), a($$0, O)));
      eay $$17 = eaz.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      eay $$18 = eaz.c(b(a($$3, $$17)), a($$0, P));
      eay $$19 = a($$0, v);
      int $$20 = Stream.of(ebp.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dzf.e * 2);
      int $$21 = Stream.of(ebp.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dzf.e * 2);
      eay $$22 = a($$19, eaz.b($$1.b(ebo.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      eay $$24 = a($$19, eaz.b($$1.b(ebo.F), 4.0, 4.0), $$20, $$21, 0).d();
      eay $$25 = a($$19, eaz.b($$1.b(ebo.G), 4.0, 4.0), $$20, $$21, 0).d();
      eay $$26 = eaz.a(eaz.a(-0.08F), eaz.d($$24, $$25));
      eay $$27 = eaz.a($$1.b(ebo.H));
      return new ebl(
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
         a($$3, eaz.a($$14, eaz.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ebl b(jr<eay> $$0, jr<eqn.a> $$1, eay $$2) {
      eay $$3 = a($$0, w);
      eay $$4 = a($$0, x);
      eay $$5 = eaz.a($$3, $$4, 0.25, $$1.b(ebo.a));
      eay $$6 = eaz.a($$3, $$4, 0.25, $$1.b(ebo.b));
      eay $$7 = b($$2);
      return new ebl(eaz.a(), eaz.a(), eaz.a(), eaz.a(), $$5, $$6, eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), $$7, eaz.a(), eaz.a(), eaz.a());
   }

   private static eay a(boolean $$0, eay $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static eay a(jr<eay> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static eay a(eay $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ebl a(jr<eay> $$0, jr<eqn.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ebl b(jr<eay> $$0, jr<eqn.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ebl c(jr<eay> $$0, jr<eqn.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static eay c(eay $$0) {
      return a($$0, 0, 128);
   }

   protected static ebl a(jr<eay> $$0) {
      eay $$1 = eaz.c(eaz.a(0L));
      eay $$2 = b(c(a($$0, M)));
      return new ebl(
         eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), $$1, eaz.a(), eaz.a(), c(eaz.a($$1, eaz.a(-0.703125))), $$2, eaz.a(), eaz.a(), eaz.a()
      );
   }

   protected static ebl a() {
      return new ebl(eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a(), eaz.a());
   }

   private static eay a(eay $$0, eay $$1) {
      eay $$2 = eaz.a(eaz.b(), $$1, $$0);
      return eaz.b(eaz.c($$2));
   }

   private static eay b(eay $$0, eay $$1) {
      eay $$2 = eaz.b($$1, $$0);
      return eaz.b(eaz.a(4.0), $$2.h());
   }

   private static eay a(eay $$0, eay $$1, int $$2, int $$3, int $$4) {
      return eaz.a(eaz.a($$0, (double)$$2, (double)($$3 + 1), $$1, eaz.a((double)$$4)));
   }

   private static eay a(eay $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      eay $$10 = eaz.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      eay $$9 = eaz.a($$10, $$5, $$0);
      eay $$11 = eaz.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return eaz.a($$11, $$8, $$9);
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
