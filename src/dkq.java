import java.util.stream.Stream;

public class dkq {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dkc s = dkd.a(10.0);
   private static final dkc t = dkd.a();
   private static final aeq<dkc> u = a("zero");
   private static final aeq<dkc> v = a("y");
   private static final aeq<dkc> w = a("shift_x");
   private static final aeq<dkc> x = a("shift_z");
   private static final aeq<dkc> y = a("overworld/base_3d_noise");
   private static final aeq<dkc> z = a("nether/base_3d_noise");
   private static final aeq<dkc> A = a("end/base_3d_noise");
   public static final aeq<dkc> d = a("overworld/continents");
   public static final aeq<dkc> e = a("overworld/erosion");
   public static final aeq<dkc> f = a("overworld/ridges");
   public static final aeq<dkc> g = a("overworld/ridges_folded");
   public static final aeq<dkc> h = a("overworld/offset");
   public static final aeq<dkc> i = a("overworld/factor");
   public static final aeq<dkc> j = a("overworld/jaggedness");
   public static final aeq<dkc> k = a("overworld/depth");
   private static final aeq<dkc> B = a("overworld/sloped_cheese");
   public static final aeq<dkc> l = a("overworld_large_biomes/continents");
   public static final aeq<dkc> m = a("overworld_large_biomes/erosion");
   private static final aeq<dkc> C = a("overworld_large_biomes/offset");
   private static final aeq<dkc> D = a("overworld_large_biomes/factor");
   private static final aeq<dkc> E = a("overworld_large_biomes/jaggedness");
   private static final aeq<dkc> F = a("overworld_large_biomes/depth");
   private static final aeq<dkc> G = a("overworld_large_biomes/sloped_cheese");
   private static final aeq<dkc> H = a("overworld_amplified/offset");
   private static final aeq<dkc> I = a("overworld_amplified/factor");
   private static final aeq<dkc> J = a("overworld_amplified/jaggedness");
   private static final aeq<dkc> K = a("overworld_amplified/depth");
   private static final aeq<dkc> L = a("overworld_amplified/sloped_cheese");
   private static final aeq<dkc> M = a("end/sloped_cheese");
   private static final aeq<dkc> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aeq<dkc> O = a("overworld/caves/entrances");
   private static final aeq<dkc> P = a("overworld/caves/noodle");
   private static final aeq<dkc> Q = a("overworld/caves/pillars");
   private static final aeq<dkc> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aeq<dkc> S = a("overworld/caves/spaghetti_2d");

   private static aeq<dkc> a(String $$0) {
      return aeq.a(jc.at, new aer($$0));
   }

   public static he<? extends dkc> a(nm<dkc> $$0) {
      hf<dzg.a> $$1 = $$0.a(jc.ax);
      hf<dkc> $$2 = $$0.a(jc.at);
      $$0.a(u, dkd.a());
      int $$3 = dij.e * 2;
      int $$4 = dij.d * 2;
      $$0.a(v, dkd.a($$3, $$4, (double)$$3, (double)$$4));
      dkc $$5 = a($$0, w, dkd.b(dkd.c(dkd.b($$1.b(dks.j)))));
      dkc $$6 = a($$0, x, dkd.b(dkd.c(dkd.c($$1.b(dks.j)))));
      $$0.a(y, dzd.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, dzd.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, dzd.a(0.25, 0.25, 80.0, 160.0, 4.0));
      he<dkc> $$7 = $$0.a(d, dkd.b(dkd.a($$5, $$6, 0.25, $$1.b(dks.c))));
      he<dkc> $$8 = $$0.a(e, dkd.b(dkd.a($$5, $$6, 0.25, $$1.b(dks.d))));
      dkc $$9 = a($$0, f, dkd.b(dkd.a($$5, $$6, 0.25, $$1.b(dks.i))));
      $$0.a(g, a($$9));
      dkc $$10 = dkd.b($$1.b(dks.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      he<dkc> $$11 = $$0.a(l, dkd.b(dkd.a($$5, $$6, 0.25, $$1.b(dks.g))));
      he<dkc> $$12 = $$0.a(m, dkd.b(dkd.a($$5, $$6, 0.25, $$1.b(dks.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dkd.a(dkd.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dkd.d(dkd.a($$1.b(dks.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      nm<dkc> $$0, hf<dkc> $$1, dkc $$2, he<dkc> $$3, he<dkc> $$4, aeq<dkc> $$5, aeq<dkc> $$6, aeq<dkc> $$7, aeq<dkc> $$8, aeq<dkc> $$9, boolean $$10
   ) {
      dkd.w.a $$11 = new dkd.w.a($$3);
      dkd.w.a $$12 = new dkd.w.a($$4);
      dkd.w.a $$13 = new dkd.w.a($$1.b(f));
      dkd.w.a $$14 = new dkd.w.a($$1.b(g));
      dkc $$15 = a($$0, $$5, a(dkd.a(dkd.a(-0.50375F), dkd.a(ob.a($$11, $$12, $$14, $$10))), dkd.c()));
      dkc $$16 = a($$0, $$6, a(dkd.a(ob.a($$11, $$12, $$13, $$14, $$10)), s));
      dkc $$17 = a($$0, $$8, dkd.a(dkd.a(-64, 320, 1.5, -1.5), $$15));
      dkc $$18 = a($$0, $$7, a(dkd.a(ob.b($$11, $$12, $$13, $$14, $$10)), t));
      dkc $$19 = dkd.b($$18, $$2.g());
      dkc $$20 = b($$16, dkd.a($$17, $$19));
      $$0.a($$9, dkd.a($$20, a($$1, y)));
   }

   private static dkc a(nm<dkc> $$0, aeq<dkc> $$1, dkc $$2) {
      return new dkd.j($$0.a($$1, $$2));
   }

   private static dkc a(hf<dkc> $$0, aeq<dkc> $$1) {
      return new dkd.j($$0.b($$1));
   }

   private static dkc a(dkc $$0) {
      return dkd.b(dkd.a(dkd.a($$0.d(), dkd.a(-0.6666666666666666)).d(), dkd.a(-0.3333333333333333)), dkd.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dkc b(hf<dzg.a> $$0) {
      dkc $$1 = dkd.a($$0.b(dks.z));
      dkc $$2 = dkd.a($$0.b(dks.A), 0.0, -0.1);
      return dkd.d(dkd.b($$2, dkd.a($$1.d(), dkd.a(-0.4))));
   }

   private static dkc d(hf<dkc> $$0, hf<dzg.a> $$1) {
      dkc $$2 = dkd.d(dkd.b($$1.b(dks.x), 2.0, 1.0));
      dkc $$3 = dkd.a($$1.b(dks.y), -0.065, -0.088);
      dkc $$4 = dkd.a($$2, $$1.b(dks.v), dkd.z.a.a);
      dkc $$5 = dkd.a($$2, $$1.b(dks.w), dkd.z.a.a);
      dkc $$6 = dkd.a(dkd.d($$4, $$5), $$3).a(-1.0, 1.0);
      dkc $$7 = a($$0, N);
      dkc $$8 = dkd.b($$1.b(dks.B), 0.75, 0.5);
      dkc $$9 = dkd.a(dkd.a($$8, dkd.a(0.37)), dkd.a(-10, 30, 0.3, 0.0));
      return dkd.d(dkd.c($$9, dkd.a($$7, $$6)));
   }

   private static dkc e(hf<dkc> $$0, hf<dzg.a> $$1) {
      dkc $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dkc $$6 = a($$2, dkd.b($$1.b(dks.I), 1.0, 1.0), -60, 320, -1);
      dkc $$7 = a($$2, dkd.a($$1.b(dks.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dkc $$9 = a($$2, dkd.b($$1.b(dks.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dkc $$10 = a($$2, dkd.b($$1.b(dks.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dkc $$11 = dkd.b(dkd.a(1.5), dkd.d($$9.d(), $$10.d()));
      return dkd.a($$6, -1000000.0, 0.0, dkd.a(64.0), dkd.a($$7, $$11));
   }

   private static dkc c(hf<dzg.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dkc $$3 = dkd.b($$0.b(dks.o), 25.0, 0.3);
      dkc $$4 = dkd.a($$0.b(dks.p), 0.0, -2.0);
      dkc $$5 = dkd.a($$0.b(dks.q), 0.0, 1.1);
      dkc $$6 = dkd.a(dkd.b($$3, dkd.a(2.0)), $$4);
      return dkd.d(dkd.b($$6, $$5.f()));
   }

   private static dkc f(hf<dkc> $$0, hf<dzg.a> $$1) {
      dkc $$2 = dkd.b($$1.b(dks.t), 2.0, 1.0);
      dkc $$3 = dkd.a($$2, $$1.b(dks.r), dkd.z.a.b);
      dkc $$4 = dkd.a($$1.b(dks.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dkc $$5 = a($$0, R);
      dkc $$6 = dkd.a($$4, dkd.a(-64, 320, 8.0, -40.0)).d();
      dkc $$7 = dkd.a($$6, $$5).f();
      double $$8 = 0.083;
      dkc $$9 = dkd.a($$3, dkd.b(dkd.a(0.083), $$5));
      return dkd.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dkc a(hf<dkc> $$0, hf<dzg.a> $$1, dkc $$2) {
      dkc $$3 = a($$0, S);
      dkc $$4 = a($$0, N);
      dkc $$5 = dkd.a($$1.b(dks.C), 8.0);
      dkc $$6 = dkd.b(dkd.a(4.0), $$5.e());
      dkc $$7 = dkd.a($$1.b(dks.D), 0.6666666666666666);
      dkc $$8 = dkd.a(dkd.a(dkd.a(0.27), $$7).a(-1.0, 1.0), dkd.a(dkd.a(1.5), dkd.b(dkd.a(-0.64), $$2)).a(0.0, 0.5));
      dkc $$9 = dkd.a($$6, $$8);
      dkc $$10 = dkd.c(dkd.c($$9, a($$0, O)), dkd.a($$3, $$4));
      dkc $$11 = a($$0, Q);
      dkc $$12 = dkd.a($$11, -1000000.0, 0.03, dkd.a(-1000000.0), $$11);
      return dkd.d($$10, $$12);
   }

   private static dkc b(dkc $$0) {
      dkc $$1 = dkd.f($$0);
      return dkd.b(dkd.a($$1), dkd.a(0.64)).i();
   }

   protected static dkp a(hf<dkc> $$0, hf<dzg.a> $$1, boolean $$2, boolean $$3) {
      dkc $$4 = dkd.a($$1.b(dks.k), 0.5);
      dkc $$5 = dkd.a($$1.b(dks.l), 0.67);
      dkc $$6 = dkd.a($$1.b(dks.n), 0.7142857142857143);
      dkc $$7 = dkd.a($$1.b(dks.m));
      dkc $$8 = a($$0, w);
      dkc $$9 = a($$0, x);
      dkc $$10 = dkd.a($$8, $$9, 0.25, $$1.b($$2 ? dks.e : dks.a));
      dkc $$11 = dkd.a($$8, $$9, 0.25, $$1.b($$2 ? dks.f : dks.b));
      dkc $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dkc $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dkc $$14 = b(dkd.c($$12), $$13);
      dkc $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dkc $$16 = dkd.c($$15, dkd.b(dkd.a(5.0), a($$0, O)));
      dkc $$17 = dkd.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dkc $$18 = dkd.c(b(a($$3, $$17)), a($$0, P));
      dkc $$19 = a($$0, v);
      int $$20 = Stream.of(dkt.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dij.e * 2);
      int $$21 = Stream.of(dkt.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dij.e * 2);
      dkc $$22 = a($$19, dkd.b($$1.b(dks.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dkc $$24 = a($$19, dkd.b($$1.b(dks.F), 4.0, 4.0), $$20, $$21, 0).d();
      dkc $$25 = a($$19, dkd.b($$1.b(dks.G), 4.0, 4.0), $$20, $$21, 0).d();
      dkc $$26 = dkd.a(dkd.a(-0.08F), dkd.d($$24, $$25));
      dkc $$27 = dkd.a($$1.b(dks.H));
      return new dkp(
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
         a($$3, dkd.a($$14, dkd.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dkp b(hf<dkc> $$0, hf<dzg.a> $$1, dkc $$2) {
      dkc $$3 = a($$0, w);
      dkc $$4 = a($$0, x);
      dkc $$5 = dkd.a($$3, $$4, 0.25, $$1.b(dks.a));
      dkc $$6 = dkd.a($$3, $$4, 0.25, $$1.b(dks.b));
      dkc $$7 = b($$2);
      return new dkp(dkd.a(), dkd.a(), dkd.a(), dkd.a(), $$5, $$6, dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), $$7, dkd.a(), dkd.a(), dkd.a());
   }

   private static dkc a(boolean $$0, dkc $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dkc a(hf<dkc> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dkc a(dkc $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dkp a(hf<dkc> $$0, hf<dzg.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dkp b(hf<dkc> $$0, hf<dzg.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dkp c(hf<dkc> $$0, hf<dzg.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dkc c(dkc $$0) {
      return a($$0, 0, 128);
   }

   protected static dkp a(hf<dkc> $$0) {
      dkc $$1 = dkd.c(dkd.a(0L));
      dkc $$2 = b(c(a($$0, M)));
      return new dkp(
         dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), $$1, dkd.a(), dkd.a(), c(dkd.a($$1, dkd.a(-0.703125))), $$2, dkd.a(), dkd.a(), dkd.a()
      );
   }

   protected static dkp a() {
      return new dkp(dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a(), dkd.a());
   }

   private static dkc a(dkc $$0, dkc $$1) {
      dkc $$2 = dkd.a(dkd.b(), $$1, $$0);
      return dkd.b(dkd.c($$2));
   }

   private static dkc b(dkc $$0, dkc $$1) {
      dkc $$2 = dkd.b($$1, $$0);
      return dkd.b(dkd.a(4.0), $$2.h());
   }

   private static dkc a(dkc $$0, dkc $$1, int $$2, int $$3, int $$4) {
      return dkd.a(dkd.a($$0, (double)$$2, (double)($$3 + 1), $$1, dkd.a((double)$$4)));
   }

   private static dkc a(dkc $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dkc $$10 = dkd.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dkc $$9 = dkd.a($$10, $$5, $$0);
      dkc $$11 = dkd.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dkd.a($$11, $$8, $$9);
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
