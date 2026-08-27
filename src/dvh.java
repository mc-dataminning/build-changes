import java.util.stream.Stream;

public class dvh {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dut s = duu.a(10.0);
   private static final dut t = duu.a();
   private static final aju<dut> u = a("zero");
   private static final aju<dut> v = a("y");
   private static final aju<dut> w = a("shift_x");
   private static final aju<dut> x = a("shift_z");
   private static final aju<dut> y = a("overworld/base_3d_noise");
   private static final aju<dut> z = a("nether/base_3d_noise");
   private static final aju<dut> A = a("end/base_3d_noise");
   public static final aju<dut> d = a("overworld/continents");
   public static final aju<dut> e = a("overworld/erosion");
   public static final aju<dut> f = a("overworld/ridges");
   public static final aju<dut> g = a("overworld/ridges_folded");
   public static final aju<dut> h = a("overworld/offset");
   public static final aju<dut> i = a("overworld/factor");
   public static final aju<dut> j = a("overworld/jaggedness");
   public static final aju<dut> k = a("overworld/depth");
   private static final aju<dut> B = a("overworld/sloped_cheese");
   public static final aju<dut> l = a("overworld_large_biomes/continents");
   public static final aju<dut> m = a("overworld_large_biomes/erosion");
   private static final aju<dut> C = a("overworld_large_biomes/offset");
   private static final aju<dut> D = a("overworld_large_biomes/factor");
   private static final aju<dut> E = a("overworld_large_biomes/jaggedness");
   private static final aju<dut> F = a("overworld_large_biomes/depth");
   private static final aju<dut> G = a("overworld_large_biomes/sloped_cheese");
   private static final aju<dut> H = a("overworld_amplified/offset");
   private static final aju<dut> I = a("overworld_amplified/factor");
   private static final aju<dut> J = a("overworld_amplified/jaggedness");
   private static final aju<dut> K = a("overworld_amplified/depth");
   private static final aju<dut> L = a("overworld_amplified/sloped_cheese");
   private static final aju<dut> M = a("end/sloped_cheese");
   private static final aju<dut> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aju<dut> O = a("overworld/caves/entrances");
   private static final aju<dut> P = a("overworld/caves/noodle");
   private static final aju<dut> Q = a("overworld/caves/pillars");
   private static final aju<dut> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aju<dut> S = a("overworld/caves/spaghetti_2d");

   private static aju<dut> a(String $$0) {
      return aju.a(ku.aA, new ajv($$0));
   }

   public static in<? extends dut> a(pz<dut> $$0) {
      io<eke.a> $$1 = $$0.a(ku.aE);
      io<dut> $$2 = $$0.a(ku.aA);
      $$0.a(u, duu.a());
      int $$3 = dta.e * 2;
      int $$4 = dta.d * 2;
      $$0.a(v, duu.a($$3, $$4, (double)$$3, (double)$$4));
      dut $$5 = a($$0, w, duu.b(duu.c(duu.b($$1.b(dvj.j)))));
      dut $$6 = a($$0, x, duu.b(duu.c(duu.c($$1.b(dvj.j)))));
      $$0.a(y, ekb.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ekb.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ekb.a(0.25, 0.25, 80.0, 160.0, 4.0));
      in<dut> $$7 = $$0.a(d, duu.b(duu.a($$5, $$6, 0.25, $$1.b(dvj.c))));
      in<dut> $$8 = $$0.a(e, duu.b(duu.a($$5, $$6, 0.25, $$1.b(dvj.d))));
      dut $$9 = a($$0, f, duu.b(duu.a($$5, $$6, 0.25, $$1.b(dvj.i))));
      $$0.a(g, a($$9));
      dut $$10 = duu.b($$1.b(dvj.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      in<dut> $$11 = $$0.a(l, duu.b(duu.a($$5, $$6, 0.25, $$1.b(dvj.g))));
      in<dut> $$12 = $$0.a(m, duu.b(duu.a($$5, $$6, 0.25, $$1.b(dvj.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, duu.a(duu.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, duu.d(duu.a($$1.b(dvj.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      pz<dut> $$0, io<dut> $$1, dut $$2, in<dut> $$3, in<dut> $$4, aju<dut> $$5, aju<dut> $$6, aju<dut> $$7, aju<dut> $$8, aju<dut> $$9, boolean $$10
   ) {
      duu.w.a $$11 = new duu.w.a($$3);
      duu.w.a $$12 = new duu.w.a($$4);
      duu.w.a $$13 = new duu.w.a($$1.b(f));
      duu.w.a $$14 = new duu.w.a($$1.b(g));
      dut $$15 = a($$0, $$5, a(duu.a(duu.a(-0.50375F), duu.a(qo.a($$11, $$12, $$14, $$10))), duu.c()));
      dut $$16 = a($$0, $$6, a(duu.a(qo.a($$11, $$12, $$13, $$14, $$10)), s));
      dut $$17 = a($$0, $$8, duu.a(duu.a(-64, 320, 1.5, -1.5), $$15));
      dut $$18 = a($$0, $$7, a(duu.a(qo.b($$11, $$12, $$13, $$14, $$10)), t));
      dut $$19 = duu.b($$18, $$2.g());
      dut $$20 = b($$16, duu.a($$17, $$19));
      $$0.a($$9, duu.a($$20, a($$1, y)));
   }

   private static dut a(pz<dut> $$0, aju<dut> $$1, dut $$2) {
      return new duu.j($$0.a($$1, $$2));
   }

   private static dut a(io<dut> $$0, aju<dut> $$1) {
      return new duu.j($$0.b($$1));
   }

   private static dut a(dut $$0) {
      return duu.b(duu.a(duu.a($$0.d(), duu.a(-0.6666666666666666)).d(), duu.a(-0.3333333333333333)), duu.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dut b(io<eke.a> $$0) {
      dut $$1 = duu.a($$0.b(dvj.z));
      dut $$2 = duu.a($$0.b(dvj.A), 0.0, -0.1);
      return duu.d(duu.b($$2, duu.a($$1.d(), duu.a(-0.4))));
   }

   private static dut d(io<dut> $$0, io<eke.a> $$1) {
      dut $$2 = duu.d(duu.b($$1.b(dvj.x), 2.0, 1.0));
      dut $$3 = duu.a($$1.b(dvj.y), -0.065, -0.088);
      dut $$4 = duu.a($$2, $$1.b(dvj.v), duu.z.a.a);
      dut $$5 = duu.a($$2, $$1.b(dvj.w), duu.z.a.a);
      dut $$6 = duu.a(duu.d($$4, $$5), $$3).a(-1.0, 1.0);
      dut $$7 = a($$0, N);
      dut $$8 = duu.b($$1.b(dvj.B), 0.75, 0.5);
      dut $$9 = duu.a(duu.a($$8, duu.a(0.37)), duu.a(-10, 30, 0.3, 0.0));
      return duu.d(duu.c($$9, duu.a($$7, $$6)));
   }

   private static dut e(io<dut> $$0, io<eke.a> $$1) {
      dut $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dut $$6 = a($$2, duu.b($$1.b(dvj.I), 1.0, 1.0), -60, 320, -1);
      dut $$7 = a($$2, duu.a($$1.b(dvj.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dut $$9 = a($$2, duu.b($$1.b(dvj.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dut $$10 = a($$2, duu.b($$1.b(dvj.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dut $$11 = duu.b(duu.a(1.5), duu.d($$9.d(), $$10.d()));
      return duu.a($$6, -1000000.0, 0.0, duu.a(64.0), duu.a($$7, $$11));
   }

   private static dut c(io<eke.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dut $$3 = duu.b($$0.b(dvj.o), 25.0, 0.3);
      dut $$4 = duu.a($$0.b(dvj.p), 0.0, -2.0);
      dut $$5 = duu.a($$0.b(dvj.q), 0.0, 1.1);
      dut $$6 = duu.a(duu.b($$3, duu.a(2.0)), $$4);
      return duu.d(duu.b($$6, $$5.f()));
   }

   private static dut f(io<dut> $$0, io<eke.a> $$1) {
      dut $$2 = duu.b($$1.b(dvj.t), 2.0, 1.0);
      dut $$3 = duu.a($$2, $$1.b(dvj.r), duu.z.a.b);
      dut $$4 = duu.a($$1.b(dvj.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dut $$5 = a($$0, R);
      dut $$6 = duu.a($$4, duu.a(-64, 320, 8.0, -40.0)).d();
      dut $$7 = duu.a($$6, $$5).f();
      double $$8 = 0.083;
      dut $$9 = duu.a($$3, duu.b(duu.a(0.083), $$5));
      return duu.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dut a(io<dut> $$0, io<eke.a> $$1, dut $$2) {
      dut $$3 = a($$0, S);
      dut $$4 = a($$0, N);
      dut $$5 = duu.a($$1.b(dvj.C), 8.0);
      dut $$6 = duu.b(duu.a(4.0), $$5.e());
      dut $$7 = duu.a($$1.b(dvj.D), 0.6666666666666666);
      dut $$8 = duu.a(duu.a(duu.a(0.27), $$7).a(-1.0, 1.0), duu.a(duu.a(1.5), duu.b(duu.a(-0.64), $$2)).a(0.0, 0.5));
      dut $$9 = duu.a($$6, $$8);
      dut $$10 = duu.c(duu.c($$9, a($$0, O)), duu.a($$3, $$4));
      dut $$11 = a($$0, Q);
      dut $$12 = duu.a($$11, -1000000.0, 0.03, duu.a(-1000000.0), $$11);
      return duu.d($$10, $$12);
   }

   private static dut b(dut $$0) {
      dut $$1 = duu.f($$0);
      return duu.b(duu.a($$1), duu.a(0.64)).i();
   }

   protected static dvg a(io<dut> $$0, io<eke.a> $$1, boolean $$2, boolean $$3) {
      dut $$4 = duu.a($$1.b(dvj.k), 0.5);
      dut $$5 = duu.a($$1.b(dvj.l), 0.67);
      dut $$6 = duu.a($$1.b(dvj.n), 0.7142857142857143);
      dut $$7 = duu.a($$1.b(dvj.m));
      dut $$8 = a($$0, w);
      dut $$9 = a($$0, x);
      dut $$10 = duu.a($$8, $$9, 0.25, $$1.b($$2 ? dvj.e : dvj.a));
      dut $$11 = duu.a($$8, $$9, 0.25, $$1.b($$2 ? dvj.f : dvj.b));
      dut $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dut $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dut $$14 = b(duu.c($$12), $$13);
      dut $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dut $$16 = duu.c($$15, duu.b(duu.a(5.0), a($$0, O)));
      dut $$17 = duu.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dut $$18 = duu.c(b(a($$3, $$17)), a($$0, P));
      dut $$19 = a($$0, v);
      int $$20 = Stream.of(dvk.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dta.e * 2);
      int $$21 = Stream.of(dvk.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dta.e * 2);
      dut $$22 = a($$19, duu.b($$1.b(dvj.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dut $$24 = a($$19, duu.b($$1.b(dvj.F), 4.0, 4.0), $$20, $$21, 0).d();
      dut $$25 = a($$19, duu.b($$1.b(dvj.G), 4.0, 4.0), $$20, $$21, 0).d();
      dut $$26 = duu.a(duu.a(-0.08F), duu.d($$24, $$25));
      dut $$27 = duu.a($$1.b(dvj.H));
      return new dvg(
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
         a($$3, duu.a($$14, duu.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dvg b(io<dut> $$0, io<eke.a> $$1, dut $$2) {
      dut $$3 = a($$0, w);
      dut $$4 = a($$0, x);
      dut $$5 = duu.a($$3, $$4, 0.25, $$1.b(dvj.a));
      dut $$6 = duu.a($$3, $$4, 0.25, $$1.b(dvj.b));
      dut $$7 = b($$2);
      return new dvg(duu.a(), duu.a(), duu.a(), duu.a(), $$5, $$6, duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), $$7, duu.a(), duu.a(), duu.a());
   }

   private static dut a(boolean $$0, dut $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dut a(io<dut> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dut a(dut $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dvg a(io<dut> $$0, io<eke.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dvg b(io<dut> $$0, io<eke.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dvg c(io<dut> $$0, io<eke.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dut c(dut $$0) {
      return a($$0, 0, 128);
   }

   protected static dvg a(io<dut> $$0) {
      dut $$1 = duu.c(duu.a(0L));
      dut $$2 = b(c(a($$0, M)));
      return new dvg(
         duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), $$1, duu.a(), duu.a(), c(duu.a($$1, duu.a(-0.703125))), $$2, duu.a(), duu.a(), duu.a()
      );
   }

   protected static dvg a() {
      return new dvg(duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), duu.a(), duu.a());
   }

   private static dut a(dut $$0, dut $$1) {
      dut $$2 = duu.a(duu.b(), $$1, $$0);
      return duu.b(duu.c($$2));
   }

   private static dut b(dut $$0, dut $$1) {
      dut $$2 = duu.b($$1, $$0);
      return duu.b(duu.a(4.0), $$2.h());
   }

   private static dut a(dut $$0, dut $$1, int $$2, int $$3, int $$4) {
      return duu.a(duu.a($$0, (double)$$2, (double)($$3 + 1), $$1, duu.a((double)$$4)));
   }

   private static dut a(dut $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dut $$10 = duu.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dut $$9 = duu.a($$10, $$5, $$0);
      dut $$11 = duu.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return duu.a($$11, $$8, $$9);
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
