import java.util.stream.Stream;

public class dku {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dkg s = dkh.a(10.0);
   private static final dkg t = dkh.a();
   private static final aet<dkg> u = a("zero");
   private static final aet<dkg> v = a("y");
   private static final aet<dkg> w = a("shift_x");
   private static final aet<dkg> x = a("shift_z");
   private static final aet<dkg> y = a("overworld/base_3d_noise");
   private static final aet<dkg> z = a("nether/base_3d_noise");
   private static final aet<dkg> A = a("end/base_3d_noise");
   public static final aet<dkg> d = a("overworld/continents");
   public static final aet<dkg> e = a("overworld/erosion");
   public static final aet<dkg> f = a("overworld/ridges");
   public static final aet<dkg> g = a("overworld/ridges_folded");
   public static final aet<dkg> h = a("overworld/offset");
   public static final aet<dkg> i = a("overworld/factor");
   public static final aet<dkg> j = a("overworld/jaggedness");
   public static final aet<dkg> k = a("overworld/depth");
   private static final aet<dkg> B = a("overworld/sloped_cheese");
   public static final aet<dkg> l = a("overworld_large_biomes/continents");
   public static final aet<dkg> m = a("overworld_large_biomes/erosion");
   private static final aet<dkg> C = a("overworld_large_biomes/offset");
   private static final aet<dkg> D = a("overworld_large_biomes/factor");
   private static final aet<dkg> E = a("overworld_large_biomes/jaggedness");
   private static final aet<dkg> F = a("overworld_large_biomes/depth");
   private static final aet<dkg> G = a("overworld_large_biomes/sloped_cheese");
   private static final aet<dkg> H = a("overworld_amplified/offset");
   private static final aet<dkg> I = a("overworld_amplified/factor");
   private static final aet<dkg> J = a("overworld_amplified/jaggedness");
   private static final aet<dkg> K = a("overworld_amplified/depth");
   private static final aet<dkg> L = a("overworld_amplified/sloped_cheese");
   private static final aet<dkg> M = a("end/sloped_cheese");
   private static final aet<dkg> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aet<dkg> O = a("overworld/caves/entrances");
   private static final aet<dkg> P = a("overworld/caves/noodle");
   private static final aet<dkg> Q = a("overworld/caves/pillars");
   private static final aet<dkg> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aet<dkg> S = a("overworld/caves/spaghetti_2d");

   private static aet<dkg> a(String $$0) {
      return aet.a(je.at, new aeu($$0));
   }

   public static hg<? extends dkg> a(np<dkg> $$0) {
      hh<dzk.a> $$1 = $$0.a(je.ax);
      hh<dkg> $$2 = $$0.a(je.at);
      $$0.a(u, dkh.a());
      int $$3 = din.e * 2;
      int $$4 = din.d * 2;
      $$0.a(v, dkh.a($$3, $$4, (double)$$3, (double)$$4));
      dkg $$5 = a($$0, w, dkh.b(dkh.c(dkh.b($$1.b(dkw.j)))));
      dkg $$6 = a($$0, x, dkh.b(dkh.c(dkh.c($$1.b(dkw.j)))));
      $$0.a(y, dzh.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, dzh.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, dzh.a(0.25, 0.25, 80.0, 160.0, 4.0));
      hg<dkg> $$7 = $$0.a(d, dkh.b(dkh.a($$5, $$6, 0.25, $$1.b(dkw.c))));
      hg<dkg> $$8 = $$0.a(e, dkh.b(dkh.a($$5, $$6, 0.25, $$1.b(dkw.d))));
      dkg $$9 = a($$0, f, dkh.b(dkh.a($$5, $$6, 0.25, $$1.b(dkw.i))));
      $$0.a(g, a($$9));
      dkg $$10 = dkh.b($$1.b(dkw.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      hg<dkg> $$11 = $$0.a(l, dkh.b(dkh.a($$5, $$6, 0.25, $$1.b(dkw.g))));
      hg<dkg> $$12 = $$0.a(m, dkh.b(dkh.a($$5, $$6, 0.25, $$1.b(dkw.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dkh.a(dkh.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dkh.d(dkh.a($$1.b(dkw.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      np<dkg> $$0, hh<dkg> $$1, dkg $$2, hg<dkg> $$3, hg<dkg> $$4, aet<dkg> $$5, aet<dkg> $$6, aet<dkg> $$7, aet<dkg> $$8, aet<dkg> $$9, boolean $$10
   ) {
      dkh.w.a $$11 = new dkh.w.a($$3);
      dkh.w.a $$12 = new dkh.w.a($$4);
      dkh.w.a $$13 = new dkh.w.a($$1.b(f));
      dkh.w.a $$14 = new dkh.w.a($$1.b(g));
      dkg $$15 = a($$0, $$5, a(dkh.a(dkh.a(-0.50375F), dkh.a(oe.a($$11, $$12, $$14, $$10))), dkh.c()));
      dkg $$16 = a($$0, $$6, a(dkh.a(oe.a($$11, $$12, $$13, $$14, $$10)), s));
      dkg $$17 = a($$0, $$8, dkh.a(dkh.a(-64, 320, 1.5, -1.5), $$15));
      dkg $$18 = a($$0, $$7, a(dkh.a(oe.b($$11, $$12, $$13, $$14, $$10)), t));
      dkg $$19 = dkh.b($$18, $$2.g());
      dkg $$20 = b($$16, dkh.a($$17, $$19));
      $$0.a($$9, dkh.a($$20, a($$1, y)));
   }

   private static dkg a(np<dkg> $$0, aet<dkg> $$1, dkg $$2) {
      return new dkh.j($$0.a($$1, $$2));
   }

   private static dkg a(hh<dkg> $$0, aet<dkg> $$1) {
      return new dkh.j($$0.b($$1));
   }

   private static dkg a(dkg $$0) {
      return dkh.b(dkh.a(dkh.a($$0.d(), dkh.a(-0.6666666666666666)).d(), dkh.a(-0.3333333333333333)), dkh.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dkg b(hh<dzk.a> $$0) {
      dkg $$1 = dkh.a($$0.b(dkw.z));
      dkg $$2 = dkh.a($$0.b(dkw.A), 0.0, -0.1);
      return dkh.d(dkh.b($$2, dkh.a($$1.d(), dkh.a(-0.4))));
   }

   private static dkg d(hh<dkg> $$0, hh<dzk.a> $$1) {
      dkg $$2 = dkh.d(dkh.b($$1.b(dkw.x), 2.0, 1.0));
      dkg $$3 = dkh.a($$1.b(dkw.y), -0.065, -0.088);
      dkg $$4 = dkh.a($$2, $$1.b(dkw.v), dkh.z.a.a);
      dkg $$5 = dkh.a($$2, $$1.b(dkw.w), dkh.z.a.a);
      dkg $$6 = dkh.a(dkh.d($$4, $$5), $$3).a(-1.0, 1.0);
      dkg $$7 = a($$0, N);
      dkg $$8 = dkh.b($$1.b(dkw.B), 0.75, 0.5);
      dkg $$9 = dkh.a(dkh.a($$8, dkh.a(0.37)), dkh.a(-10, 30, 0.3, 0.0));
      return dkh.d(dkh.c($$9, dkh.a($$7, $$6)));
   }

   private static dkg e(hh<dkg> $$0, hh<dzk.a> $$1) {
      dkg $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dkg $$6 = a($$2, dkh.b($$1.b(dkw.I), 1.0, 1.0), -60, 320, -1);
      dkg $$7 = a($$2, dkh.a($$1.b(dkw.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dkg $$9 = a($$2, dkh.b($$1.b(dkw.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dkg $$10 = a($$2, dkh.b($$1.b(dkw.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dkg $$11 = dkh.b(dkh.a(1.5), dkh.d($$9.d(), $$10.d()));
      return dkh.a($$6, -1000000.0, 0.0, dkh.a(64.0), dkh.a($$7, $$11));
   }

   private static dkg c(hh<dzk.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dkg $$3 = dkh.b($$0.b(dkw.o), 25.0, 0.3);
      dkg $$4 = dkh.a($$0.b(dkw.p), 0.0, -2.0);
      dkg $$5 = dkh.a($$0.b(dkw.q), 0.0, 1.1);
      dkg $$6 = dkh.a(dkh.b($$3, dkh.a(2.0)), $$4);
      return dkh.d(dkh.b($$6, $$5.f()));
   }

   private static dkg f(hh<dkg> $$0, hh<dzk.a> $$1) {
      dkg $$2 = dkh.b($$1.b(dkw.t), 2.0, 1.0);
      dkg $$3 = dkh.a($$2, $$1.b(dkw.r), dkh.z.a.b);
      dkg $$4 = dkh.a($$1.b(dkw.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dkg $$5 = a($$0, R);
      dkg $$6 = dkh.a($$4, dkh.a(-64, 320, 8.0, -40.0)).d();
      dkg $$7 = dkh.a($$6, $$5).f();
      double $$8 = 0.083;
      dkg $$9 = dkh.a($$3, dkh.b(dkh.a(0.083), $$5));
      return dkh.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dkg a(hh<dkg> $$0, hh<dzk.a> $$1, dkg $$2) {
      dkg $$3 = a($$0, S);
      dkg $$4 = a($$0, N);
      dkg $$5 = dkh.a($$1.b(dkw.C), 8.0);
      dkg $$6 = dkh.b(dkh.a(4.0), $$5.e());
      dkg $$7 = dkh.a($$1.b(dkw.D), 0.6666666666666666);
      dkg $$8 = dkh.a(dkh.a(dkh.a(0.27), $$7).a(-1.0, 1.0), dkh.a(dkh.a(1.5), dkh.b(dkh.a(-0.64), $$2)).a(0.0, 0.5));
      dkg $$9 = dkh.a($$6, $$8);
      dkg $$10 = dkh.c(dkh.c($$9, a($$0, O)), dkh.a($$3, $$4));
      dkg $$11 = a($$0, Q);
      dkg $$12 = dkh.a($$11, -1000000.0, 0.03, dkh.a(-1000000.0), $$11);
      return dkh.d($$10, $$12);
   }

   private static dkg b(dkg $$0) {
      dkg $$1 = dkh.f($$0);
      return dkh.b(dkh.a($$1), dkh.a(0.64)).i();
   }

   protected static dkt a(hh<dkg> $$0, hh<dzk.a> $$1, boolean $$2, boolean $$3) {
      dkg $$4 = dkh.a($$1.b(dkw.k), 0.5);
      dkg $$5 = dkh.a($$1.b(dkw.l), 0.67);
      dkg $$6 = dkh.a($$1.b(dkw.n), 0.7142857142857143);
      dkg $$7 = dkh.a($$1.b(dkw.m));
      dkg $$8 = a($$0, w);
      dkg $$9 = a($$0, x);
      dkg $$10 = dkh.a($$8, $$9, 0.25, $$1.b($$2 ? dkw.e : dkw.a));
      dkg $$11 = dkh.a($$8, $$9, 0.25, $$1.b($$2 ? dkw.f : dkw.b));
      dkg $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dkg $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dkg $$14 = b(dkh.c($$12), $$13);
      dkg $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dkg $$16 = dkh.c($$15, dkh.b(dkh.a(5.0), a($$0, O)));
      dkg $$17 = dkh.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dkg $$18 = dkh.c(b(a($$3, $$17)), a($$0, P));
      dkg $$19 = a($$0, v);
      int $$20 = Stream.of(dkx.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-din.e * 2);
      int $$21 = Stream.of(dkx.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-din.e * 2);
      dkg $$22 = a($$19, dkh.b($$1.b(dkw.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dkg $$24 = a($$19, dkh.b($$1.b(dkw.F), 4.0, 4.0), $$20, $$21, 0).d();
      dkg $$25 = a($$19, dkh.b($$1.b(dkw.G), 4.0, 4.0), $$20, $$21, 0).d();
      dkg $$26 = dkh.a(dkh.a(-0.08F), dkh.d($$24, $$25));
      dkg $$27 = dkh.a($$1.b(dkw.H));
      return new dkt(
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
         a($$3, dkh.a($$14, dkh.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dkt b(hh<dkg> $$0, hh<dzk.a> $$1, dkg $$2) {
      dkg $$3 = a($$0, w);
      dkg $$4 = a($$0, x);
      dkg $$5 = dkh.a($$3, $$4, 0.25, $$1.b(dkw.a));
      dkg $$6 = dkh.a($$3, $$4, 0.25, $$1.b(dkw.b));
      dkg $$7 = b($$2);
      return new dkt(dkh.a(), dkh.a(), dkh.a(), dkh.a(), $$5, $$6, dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), $$7, dkh.a(), dkh.a(), dkh.a());
   }

   private static dkg a(boolean $$0, dkg $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dkg a(hh<dkg> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dkg a(dkg $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dkt a(hh<dkg> $$0, hh<dzk.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dkt b(hh<dkg> $$0, hh<dzk.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dkt c(hh<dkg> $$0, hh<dzk.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dkg c(dkg $$0) {
      return a($$0, 0, 128);
   }

   protected static dkt a(hh<dkg> $$0) {
      dkg $$1 = dkh.c(dkh.a(0L));
      dkg $$2 = b(c(a($$0, M)));
      return new dkt(
         dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), $$1, dkh.a(), dkh.a(), c(dkh.a($$1, dkh.a(-0.703125))), $$2, dkh.a(), dkh.a(), dkh.a()
      );
   }

   protected static dkt a() {
      return new dkt(dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a(), dkh.a());
   }

   private static dkg a(dkg $$0, dkg $$1) {
      dkg $$2 = dkh.a(dkh.b(), $$1, $$0);
      return dkh.b(dkh.c($$2));
   }

   private static dkg b(dkg $$0, dkg $$1) {
      dkg $$2 = dkh.b($$1, $$0);
      return dkh.b(dkh.a(4.0), $$2.h());
   }

   private static dkg a(dkg $$0, dkg $$1, int $$2, int $$3, int $$4) {
      return dkh.a(dkh.a($$0, (double)$$2, (double)($$3 + 1), $$1, dkh.a((double)$$4)));
   }

   private static dkg a(dkg $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dkg $$10 = dkh.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dkg $$9 = dkh.a($$10, $$5, $$0);
      dkg $$11 = dkh.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dkh.a($$11, $$8, $$9);
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
