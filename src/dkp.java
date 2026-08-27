import java.util.stream.Stream;

public class dkp {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dkb s = dkc.a(10.0);
   private static final dkb t = dkc.a();
   private static final aeq<dkb> u = a("zero");
   private static final aeq<dkb> v = a("y");
   private static final aeq<dkb> w = a("shift_x");
   private static final aeq<dkb> x = a("shift_z");
   private static final aeq<dkb> y = a("overworld/base_3d_noise");
   private static final aeq<dkb> z = a("nether/base_3d_noise");
   private static final aeq<dkb> A = a("end/base_3d_noise");
   public static final aeq<dkb> d = a("overworld/continents");
   public static final aeq<dkb> e = a("overworld/erosion");
   public static final aeq<dkb> f = a("overworld/ridges");
   public static final aeq<dkb> g = a("overworld/ridges_folded");
   public static final aeq<dkb> h = a("overworld/offset");
   public static final aeq<dkb> i = a("overworld/factor");
   public static final aeq<dkb> j = a("overworld/jaggedness");
   public static final aeq<dkb> k = a("overworld/depth");
   private static final aeq<dkb> B = a("overworld/sloped_cheese");
   public static final aeq<dkb> l = a("overworld_large_biomes/continents");
   public static final aeq<dkb> m = a("overworld_large_biomes/erosion");
   private static final aeq<dkb> C = a("overworld_large_biomes/offset");
   private static final aeq<dkb> D = a("overworld_large_biomes/factor");
   private static final aeq<dkb> E = a("overworld_large_biomes/jaggedness");
   private static final aeq<dkb> F = a("overworld_large_biomes/depth");
   private static final aeq<dkb> G = a("overworld_large_biomes/sloped_cheese");
   private static final aeq<dkb> H = a("overworld_amplified/offset");
   private static final aeq<dkb> I = a("overworld_amplified/factor");
   private static final aeq<dkb> J = a("overworld_amplified/jaggedness");
   private static final aeq<dkb> K = a("overworld_amplified/depth");
   private static final aeq<dkb> L = a("overworld_amplified/sloped_cheese");
   private static final aeq<dkb> M = a("end/sloped_cheese");
   private static final aeq<dkb> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aeq<dkb> O = a("overworld/caves/entrances");
   private static final aeq<dkb> P = a("overworld/caves/noodle");
   private static final aeq<dkb> Q = a("overworld/caves/pillars");
   private static final aeq<dkb> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aeq<dkb> S = a("overworld/caves/spaghetti_2d");

   private static aeq<dkb> a(String $$0) {
      return aeq.a(jc.at, new aer($$0));
   }

   public static he<? extends dkb> a(nm<dkb> $$0) {
      hf<dzf.a> $$1 = $$0.a(jc.ax);
      hf<dkb> $$2 = $$0.a(jc.at);
      $$0.a(u, dkc.a());
      int $$3 = dii.e * 2;
      int $$4 = dii.d * 2;
      $$0.a(v, dkc.a($$3, $$4, (double)$$3, (double)$$4));
      dkb $$5 = a($$0, w, dkc.b(dkc.c(dkc.b($$1.b(dkr.j)))));
      dkb $$6 = a($$0, x, dkc.b(dkc.c(dkc.c($$1.b(dkr.j)))));
      $$0.a(y, dzc.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, dzc.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, dzc.a(0.25, 0.25, 80.0, 160.0, 4.0));
      he<dkb> $$7 = $$0.a(d, dkc.b(dkc.a($$5, $$6, 0.25, $$1.b(dkr.c))));
      he<dkb> $$8 = $$0.a(e, dkc.b(dkc.a($$5, $$6, 0.25, $$1.b(dkr.d))));
      dkb $$9 = a($$0, f, dkc.b(dkc.a($$5, $$6, 0.25, $$1.b(dkr.i))));
      $$0.a(g, a($$9));
      dkb $$10 = dkc.b($$1.b(dkr.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      he<dkb> $$11 = $$0.a(l, dkc.b(dkc.a($$5, $$6, 0.25, $$1.b(dkr.g))));
      he<dkb> $$12 = $$0.a(m, dkc.b(dkc.a($$5, $$6, 0.25, $$1.b(dkr.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dkc.a(dkc.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dkc.d(dkc.a($$1.b(dkr.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      nm<dkb> $$0, hf<dkb> $$1, dkb $$2, he<dkb> $$3, he<dkb> $$4, aeq<dkb> $$5, aeq<dkb> $$6, aeq<dkb> $$7, aeq<dkb> $$8, aeq<dkb> $$9, boolean $$10
   ) {
      dkc.w.a $$11 = new dkc.w.a($$3);
      dkc.w.a $$12 = new dkc.w.a($$4);
      dkc.w.a $$13 = new dkc.w.a($$1.b(f));
      dkc.w.a $$14 = new dkc.w.a($$1.b(g));
      dkb $$15 = a($$0, $$5, a(dkc.a(dkc.a(-0.50375F), dkc.a(ob.a($$11, $$12, $$14, $$10))), dkc.c()));
      dkb $$16 = a($$0, $$6, a(dkc.a(ob.a($$11, $$12, $$13, $$14, $$10)), s));
      dkb $$17 = a($$0, $$8, dkc.a(dkc.a(-64, 320, 1.5, -1.5), $$15));
      dkb $$18 = a($$0, $$7, a(dkc.a(ob.b($$11, $$12, $$13, $$14, $$10)), t));
      dkb $$19 = dkc.b($$18, $$2.g());
      dkb $$20 = b($$16, dkc.a($$17, $$19));
      $$0.a($$9, dkc.a($$20, a($$1, y)));
   }

   private static dkb a(nm<dkb> $$0, aeq<dkb> $$1, dkb $$2) {
      return new dkc.j($$0.a($$1, $$2));
   }

   private static dkb a(hf<dkb> $$0, aeq<dkb> $$1) {
      return new dkc.j($$0.b($$1));
   }

   private static dkb a(dkb $$0) {
      return dkc.b(dkc.a(dkc.a($$0.d(), dkc.a(-0.6666666666666666)).d(), dkc.a(-0.3333333333333333)), dkc.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dkb b(hf<dzf.a> $$0) {
      dkb $$1 = dkc.a($$0.b(dkr.z));
      dkb $$2 = dkc.a($$0.b(dkr.A), 0.0, -0.1);
      return dkc.d(dkc.b($$2, dkc.a($$1.d(), dkc.a(-0.4))));
   }

   private static dkb d(hf<dkb> $$0, hf<dzf.a> $$1) {
      dkb $$2 = dkc.d(dkc.b($$1.b(dkr.x), 2.0, 1.0));
      dkb $$3 = dkc.a($$1.b(dkr.y), -0.065, -0.088);
      dkb $$4 = dkc.a($$2, $$1.b(dkr.v), dkc.z.a.a);
      dkb $$5 = dkc.a($$2, $$1.b(dkr.w), dkc.z.a.a);
      dkb $$6 = dkc.a(dkc.d($$4, $$5), $$3).a(-1.0, 1.0);
      dkb $$7 = a($$0, N);
      dkb $$8 = dkc.b($$1.b(dkr.B), 0.75, 0.5);
      dkb $$9 = dkc.a(dkc.a($$8, dkc.a(0.37)), dkc.a(-10, 30, 0.3, 0.0));
      return dkc.d(dkc.c($$9, dkc.a($$7, $$6)));
   }

   private static dkb e(hf<dkb> $$0, hf<dzf.a> $$1) {
      dkb $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dkb $$6 = a($$2, dkc.b($$1.b(dkr.I), 1.0, 1.0), -60, 320, -1);
      dkb $$7 = a($$2, dkc.a($$1.b(dkr.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dkb $$9 = a($$2, dkc.b($$1.b(dkr.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dkb $$10 = a($$2, dkc.b($$1.b(dkr.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dkb $$11 = dkc.b(dkc.a(1.5), dkc.d($$9.d(), $$10.d()));
      return dkc.a($$6, -1000000.0, 0.0, dkc.a(64.0), dkc.a($$7, $$11));
   }

   private static dkb c(hf<dzf.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dkb $$3 = dkc.b($$0.b(dkr.o), 25.0, 0.3);
      dkb $$4 = dkc.a($$0.b(dkr.p), 0.0, -2.0);
      dkb $$5 = dkc.a($$0.b(dkr.q), 0.0, 1.1);
      dkb $$6 = dkc.a(dkc.b($$3, dkc.a(2.0)), $$4);
      return dkc.d(dkc.b($$6, $$5.f()));
   }

   private static dkb f(hf<dkb> $$0, hf<dzf.a> $$1) {
      dkb $$2 = dkc.b($$1.b(dkr.t), 2.0, 1.0);
      dkb $$3 = dkc.a($$2, $$1.b(dkr.r), dkc.z.a.b);
      dkb $$4 = dkc.a($$1.b(dkr.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dkb $$5 = a($$0, R);
      dkb $$6 = dkc.a($$4, dkc.a(-64, 320, 8.0, -40.0)).d();
      dkb $$7 = dkc.a($$6, $$5).f();
      double $$8 = 0.083;
      dkb $$9 = dkc.a($$3, dkc.b(dkc.a(0.083), $$5));
      return dkc.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dkb a(hf<dkb> $$0, hf<dzf.a> $$1, dkb $$2) {
      dkb $$3 = a($$0, S);
      dkb $$4 = a($$0, N);
      dkb $$5 = dkc.a($$1.b(dkr.C), 8.0);
      dkb $$6 = dkc.b(dkc.a(4.0), $$5.e());
      dkb $$7 = dkc.a($$1.b(dkr.D), 0.6666666666666666);
      dkb $$8 = dkc.a(dkc.a(dkc.a(0.27), $$7).a(-1.0, 1.0), dkc.a(dkc.a(1.5), dkc.b(dkc.a(-0.64), $$2)).a(0.0, 0.5));
      dkb $$9 = dkc.a($$6, $$8);
      dkb $$10 = dkc.c(dkc.c($$9, a($$0, O)), dkc.a($$3, $$4));
      dkb $$11 = a($$0, Q);
      dkb $$12 = dkc.a($$11, -1000000.0, 0.03, dkc.a(-1000000.0), $$11);
      return dkc.d($$10, $$12);
   }

   private static dkb b(dkb $$0) {
      dkb $$1 = dkc.f($$0);
      return dkc.b(dkc.a($$1), dkc.a(0.64)).i();
   }

   protected static dko a(hf<dkb> $$0, hf<dzf.a> $$1, boolean $$2, boolean $$3) {
      dkb $$4 = dkc.a($$1.b(dkr.k), 0.5);
      dkb $$5 = dkc.a($$1.b(dkr.l), 0.67);
      dkb $$6 = dkc.a($$1.b(dkr.n), 0.7142857142857143);
      dkb $$7 = dkc.a($$1.b(dkr.m));
      dkb $$8 = a($$0, w);
      dkb $$9 = a($$0, x);
      dkb $$10 = dkc.a($$8, $$9, 0.25, $$1.b($$2 ? dkr.e : dkr.a));
      dkb $$11 = dkc.a($$8, $$9, 0.25, $$1.b($$2 ? dkr.f : dkr.b));
      dkb $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dkb $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dkb $$14 = b(dkc.c($$12), $$13);
      dkb $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dkb $$16 = dkc.c($$15, dkc.b(dkc.a(5.0), a($$0, O)));
      dkb $$17 = dkc.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dkb $$18 = dkc.c(b(a($$3, $$17)), a($$0, P));
      dkb $$19 = a($$0, v);
      int $$20 = Stream.of(dks.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dii.e * 2);
      int $$21 = Stream.of(dks.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dii.e * 2);
      dkb $$22 = a($$19, dkc.b($$1.b(dkr.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dkb $$24 = a($$19, dkc.b($$1.b(dkr.F), 4.0, 4.0), $$20, $$21, 0).d();
      dkb $$25 = a($$19, dkc.b($$1.b(dkr.G), 4.0, 4.0), $$20, $$21, 0).d();
      dkb $$26 = dkc.a(dkc.a(-0.08F), dkc.d($$24, $$25));
      dkb $$27 = dkc.a($$1.b(dkr.H));
      return new dko(
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
         a($$3, dkc.a($$14, dkc.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dko b(hf<dkb> $$0, hf<dzf.a> $$1, dkb $$2) {
      dkb $$3 = a($$0, w);
      dkb $$4 = a($$0, x);
      dkb $$5 = dkc.a($$3, $$4, 0.25, $$1.b(dkr.a));
      dkb $$6 = dkc.a($$3, $$4, 0.25, $$1.b(dkr.b));
      dkb $$7 = b($$2);
      return new dko(dkc.a(), dkc.a(), dkc.a(), dkc.a(), $$5, $$6, dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), $$7, dkc.a(), dkc.a(), dkc.a());
   }

   private static dkb a(boolean $$0, dkb $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dkb a(hf<dkb> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dkb a(dkb $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dko a(hf<dkb> $$0, hf<dzf.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dko b(hf<dkb> $$0, hf<dzf.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dko c(hf<dkb> $$0, hf<dzf.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dkb c(dkb $$0) {
      return a($$0, 0, 128);
   }

   protected static dko a(hf<dkb> $$0) {
      dkb $$1 = dkc.c(dkc.a(0L));
      dkb $$2 = b(c(a($$0, M)));
      return new dko(
         dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), $$1, dkc.a(), dkc.a(), c(dkc.a($$1, dkc.a(-0.703125))), $$2, dkc.a(), dkc.a(), dkc.a()
      );
   }

   protected static dko a() {
      return new dko(dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a(), dkc.a());
   }

   private static dkb a(dkb $$0, dkb $$1) {
      dkb $$2 = dkc.a(dkc.b(), $$1, $$0);
      return dkc.b(dkc.c($$2));
   }

   private static dkb b(dkb $$0, dkb $$1) {
      dkb $$2 = dkc.b($$1, $$0);
      return dkc.b(dkc.a(4.0), $$2.h());
   }

   private static dkb a(dkb $$0, dkb $$1, int $$2, int $$3, int $$4) {
      return dkc.a(dkc.a($$0, (double)$$2, (double)($$3 + 1), $$1, dkc.a((double)$$4)));
   }

   private static dkb a(dkb $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dkb $$10 = dkc.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dkb $$9 = dkc.a($$10, $$5, $$0);
      dkb $$11 = dkc.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dkc.a($$11, $$8, $$9);
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
