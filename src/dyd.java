import java.util.stream.Stream;

public class dyd {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dxp s = dxq.a(10.0);
   private static final dxp t = dxq.a();
   private static final ale<dxp> u = a("zero");
   private static final ale<dxp> v = a("y");
   private static final ale<dxp> w = a("shift_x");
   private static final ale<dxp> x = a("shift_z");
   private static final ale<dxp> y = a("overworld/base_3d_noise");
   private static final ale<dxp> z = a("nether/base_3d_noise");
   private static final ale<dxp> A = a("end/base_3d_noise");
   public static final ale<dxp> d = a("overworld/continents");
   public static final ale<dxp> e = a("overworld/erosion");
   public static final ale<dxp> f = a("overworld/ridges");
   public static final ale<dxp> g = a("overworld/ridges_folded");
   public static final ale<dxp> h = a("overworld/offset");
   public static final ale<dxp> i = a("overworld/factor");
   public static final ale<dxp> j = a("overworld/jaggedness");
   public static final ale<dxp> k = a("overworld/depth");
   private static final ale<dxp> B = a("overworld/sloped_cheese");
   public static final ale<dxp> l = a("overworld_large_biomes/continents");
   public static final ale<dxp> m = a("overworld_large_biomes/erosion");
   private static final ale<dxp> C = a("overworld_large_biomes/offset");
   private static final ale<dxp> D = a("overworld_large_biomes/factor");
   private static final ale<dxp> E = a("overworld_large_biomes/jaggedness");
   private static final ale<dxp> F = a("overworld_large_biomes/depth");
   private static final ale<dxp> G = a("overworld_large_biomes/sloped_cheese");
   private static final ale<dxp> H = a("overworld_amplified/offset");
   private static final ale<dxp> I = a("overworld_amplified/factor");
   private static final ale<dxp> J = a("overworld_amplified/jaggedness");
   private static final ale<dxp> K = a("overworld_amplified/depth");
   private static final ale<dxp> L = a("overworld_amplified/sloped_cheese");
   private static final ale<dxp> M = a("end/sloped_cheese");
   private static final ale<dxp> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ale<dxp> O = a("overworld/caves/entrances");
   private static final ale<dxp> P = a("overworld/caves/noodle");
   private static final ale<dxp> Q = a("overworld/caves/pillars");
   private static final ale<dxp> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ale<dxp> S = a("overworld/caves/spaghetti_2d");

   private static ale<dxp> a(String $$0) {
      return ale.a(lq.aD, new alf($$0));
   }

   public static ji<? extends dxp> a(rc<dxp> $$0) {
      jj<ena.a> $$1 = $$0.a(lq.aH);
      jj<dxp> $$2 = $$0.a(lq.aD);
      $$0.a(u, dxq.a());
      int $$3 = dvw.e * 2;
      int $$4 = dvw.d * 2;
      $$0.a(v, dxq.a($$3, $$4, (double)$$3, (double)$$4));
      dxp $$5 = a($$0, w, dxq.b(dxq.c(dxq.b($$1.b(dyf.j)))));
      dxp $$6 = a($$0, x, dxq.b(dxq.c(dxq.c($$1.b(dyf.j)))));
      $$0.a(y, emx.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, emx.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, emx.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ji<dxp> $$7 = $$0.a(d, dxq.b(dxq.a($$5, $$6, 0.25, $$1.b(dyf.c))));
      ji<dxp> $$8 = $$0.a(e, dxq.b(dxq.a($$5, $$6, 0.25, $$1.b(dyf.d))));
      dxp $$9 = a($$0, f, dxq.b(dxq.a($$5, $$6, 0.25, $$1.b(dyf.i))));
      $$0.a(g, a($$9));
      dxp $$10 = dxq.b($$1.b(dyf.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ji<dxp> $$11 = $$0.a(l, dxq.b(dxq.a($$5, $$6, 0.25, $$1.b(dyf.g))));
      ji<dxp> $$12 = $$0.a(m, dxq.b(dxq.a($$5, $$6, 0.25, $$1.b(dyf.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dxq.a(dxq.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dxq.d(dxq.a($$1.b(dyf.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      rc<dxp> $$0, jj<dxp> $$1, dxp $$2, ji<dxp> $$3, ji<dxp> $$4, ale<dxp> $$5, ale<dxp> $$6, ale<dxp> $$7, ale<dxp> $$8, ale<dxp> $$9, boolean $$10
   ) {
      dxq.w.a $$11 = new dxq.w.a($$3);
      dxq.w.a $$12 = new dxq.w.a($$4);
      dxq.w.a $$13 = new dxq.w.a($$1.b(f));
      dxq.w.a $$14 = new dxq.w.a($$1.b(g));
      dxp $$15 = a($$0, $$5, a(dxq.a(dxq.a(-0.50375F), dxq.a(rr.a($$11, $$12, $$14, $$10))), dxq.c()));
      dxp $$16 = a($$0, $$6, a(dxq.a(rr.a($$11, $$12, $$13, $$14, $$10)), s));
      dxp $$17 = a($$0, $$8, dxq.a(dxq.a(-64, 320, 1.5, -1.5), $$15));
      dxp $$18 = a($$0, $$7, a(dxq.a(rr.b($$11, $$12, $$13, $$14, $$10)), t));
      dxp $$19 = dxq.b($$18, $$2.g());
      dxp $$20 = b($$16, dxq.a($$17, $$19));
      $$0.a($$9, dxq.a($$20, a($$1, y)));
   }

   private static dxp a(rc<dxp> $$0, ale<dxp> $$1, dxp $$2) {
      return new dxq.j($$0.a($$1, $$2));
   }

   private static dxp a(jj<dxp> $$0, ale<dxp> $$1) {
      return new dxq.j($$0.b($$1));
   }

   private static dxp a(dxp $$0) {
      return dxq.b(dxq.a(dxq.a($$0.d(), dxq.a(-0.6666666666666666)).d(), dxq.a(-0.3333333333333333)), dxq.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dxp b(jj<ena.a> $$0) {
      dxp $$1 = dxq.a($$0.b(dyf.z));
      dxp $$2 = dxq.a($$0.b(dyf.A), 0.0, -0.1);
      return dxq.d(dxq.b($$2, dxq.a($$1.d(), dxq.a(-0.4))));
   }

   private static dxp d(jj<dxp> $$0, jj<ena.a> $$1) {
      dxp $$2 = dxq.d(dxq.b($$1.b(dyf.x), 2.0, 1.0));
      dxp $$3 = dxq.a($$1.b(dyf.y), -0.065, -0.088);
      dxp $$4 = dxq.a($$2, $$1.b(dyf.v), dxq.z.a.a);
      dxp $$5 = dxq.a($$2, $$1.b(dyf.w), dxq.z.a.a);
      dxp $$6 = dxq.a(dxq.d($$4, $$5), $$3).a(-1.0, 1.0);
      dxp $$7 = a($$0, N);
      dxp $$8 = dxq.b($$1.b(dyf.B), 0.75, 0.5);
      dxp $$9 = dxq.a(dxq.a($$8, dxq.a(0.37)), dxq.a(-10, 30, 0.3, 0.0));
      return dxq.d(dxq.c($$9, dxq.a($$7, $$6)));
   }

   private static dxp e(jj<dxp> $$0, jj<ena.a> $$1) {
      dxp $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dxp $$6 = a($$2, dxq.b($$1.b(dyf.I), 1.0, 1.0), -60, 320, -1);
      dxp $$7 = a($$2, dxq.a($$1.b(dyf.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dxp $$9 = a($$2, dxq.b($$1.b(dyf.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxp $$10 = a($$2, dxq.b($$1.b(dyf.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxp $$11 = dxq.b(dxq.a(1.5), dxq.d($$9.d(), $$10.d()));
      return dxq.a($$6, -1000000.0, 0.0, dxq.a(64.0), dxq.a($$7, $$11));
   }

   private static dxp c(jj<ena.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dxp $$3 = dxq.b($$0.b(dyf.o), 25.0, 0.3);
      dxp $$4 = dxq.a($$0.b(dyf.p), 0.0, -2.0);
      dxp $$5 = dxq.a($$0.b(dyf.q), 0.0, 1.1);
      dxp $$6 = dxq.a(dxq.b($$3, dxq.a(2.0)), $$4);
      return dxq.d(dxq.b($$6, $$5.f()));
   }

   private static dxp f(jj<dxp> $$0, jj<ena.a> $$1) {
      dxp $$2 = dxq.b($$1.b(dyf.t), 2.0, 1.0);
      dxp $$3 = dxq.a($$2, $$1.b(dyf.r), dxq.z.a.b);
      dxp $$4 = dxq.a($$1.b(dyf.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dxp $$5 = a($$0, R);
      dxp $$6 = dxq.a($$4, dxq.a(-64, 320, 8.0, -40.0)).d();
      dxp $$7 = dxq.a($$6, $$5).f();
      double $$8 = 0.083;
      dxp $$9 = dxq.a($$3, dxq.b(dxq.a(0.083), $$5));
      return dxq.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dxp a(jj<dxp> $$0, jj<ena.a> $$1, dxp $$2) {
      dxp $$3 = a($$0, S);
      dxp $$4 = a($$0, N);
      dxp $$5 = dxq.a($$1.b(dyf.C), 8.0);
      dxp $$6 = dxq.b(dxq.a(4.0), $$5.e());
      dxp $$7 = dxq.a($$1.b(dyf.D), 0.6666666666666666);
      dxp $$8 = dxq.a(dxq.a(dxq.a(0.27), $$7).a(-1.0, 1.0), dxq.a(dxq.a(1.5), dxq.b(dxq.a(-0.64), $$2)).a(0.0, 0.5));
      dxp $$9 = dxq.a($$6, $$8);
      dxp $$10 = dxq.c(dxq.c($$9, a($$0, O)), dxq.a($$3, $$4));
      dxp $$11 = a($$0, Q);
      dxp $$12 = dxq.a($$11, -1000000.0, 0.03, dxq.a(-1000000.0), $$11);
      return dxq.d($$10, $$12);
   }

   private static dxp b(dxp $$0) {
      dxp $$1 = dxq.f($$0);
      return dxq.b(dxq.a($$1), dxq.a(0.64)).i();
   }

   protected static dyc a(jj<dxp> $$0, jj<ena.a> $$1, boolean $$2, boolean $$3) {
      dxp $$4 = dxq.a($$1.b(dyf.k), 0.5);
      dxp $$5 = dxq.a($$1.b(dyf.l), 0.67);
      dxp $$6 = dxq.a($$1.b(dyf.n), 0.7142857142857143);
      dxp $$7 = dxq.a($$1.b(dyf.m));
      dxp $$8 = a($$0, w);
      dxp $$9 = a($$0, x);
      dxp $$10 = dxq.a($$8, $$9, 0.25, $$1.b($$2 ? dyf.e : dyf.a));
      dxp $$11 = dxq.a($$8, $$9, 0.25, $$1.b($$2 ? dyf.f : dyf.b));
      dxp $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dxp $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dxp $$14 = b(dxq.c($$12), $$13);
      dxp $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dxp $$16 = dxq.c($$15, dxq.b(dxq.a(5.0), a($$0, O)));
      dxp $$17 = dxq.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dxp $$18 = dxq.c(b(a($$3, $$17)), a($$0, P));
      dxp $$19 = a($$0, v);
      int $$20 = Stream.of(dyg.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dvw.e * 2);
      int $$21 = Stream.of(dyg.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dvw.e * 2);
      dxp $$22 = a($$19, dxq.b($$1.b(dyf.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dxp $$24 = a($$19, dxq.b($$1.b(dyf.F), 4.0, 4.0), $$20, $$21, 0).d();
      dxp $$25 = a($$19, dxq.b($$1.b(dyf.G), 4.0, 4.0), $$20, $$21, 0).d();
      dxp $$26 = dxq.a(dxq.a(-0.08F), dxq.d($$24, $$25));
      dxp $$27 = dxq.a($$1.b(dyf.H));
      return new dyc(
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
         a($$3, dxq.a($$14, dxq.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dyc b(jj<dxp> $$0, jj<ena.a> $$1, dxp $$2) {
      dxp $$3 = a($$0, w);
      dxp $$4 = a($$0, x);
      dxp $$5 = dxq.a($$3, $$4, 0.25, $$1.b(dyf.a));
      dxp $$6 = dxq.a($$3, $$4, 0.25, $$1.b(dyf.b));
      dxp $$7 = b($$2);
      return new dyc(dxq.a(), dxq.a(), dxq.a(), dxq.a(), $$5, $$6, dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), $$7, dxq.a(), dxq.a(), dxq.a());
   }

   private static dxp a(boolean $$0, dxp $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dxp a(jj<dxp> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dxp a(dxp $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dyc a(jj<dxp> $$0, jj<ena.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dyc b(jj<dxp> $$0, jj<ena.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dyc c(jj<dxp> $$0, jj<ena.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dxp c(dxp $$0) {
      return a($$0, 0, 128);
   }

   protected static dyc a(jj<dxp> $$0) {
      dxp $$1 = dxq.c(dxq.a(0L));
      dxp $$2 = b(c(a($$0, M)));
      return new dyc(
         dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), $$1, dxq.a(), dxq.a(), c(dxq.a($$1, dxq.a(-0.703125))), $$2, dxq.a(), dxq.a(), dxq.a()
      );
   }

   protected static dyc a() {
      return new dyc(dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a(), dxq.a());
   }

   private static dxp a(dxp $$0, dxp $$1) {
      dxp $$2 = dxq.a(dxq.b(), $$1, $$0);
      return dxq.b(dxq.c($$2));
   }

   private static dxp b(dxp $$0, dxp $$1) {
      dxp $$2 = dxq.b($$1, $$0);
      return dxq.b(dxq.a(4.0), $$2.h());
   }

   private static dxp a(dxp $$0, dxp $$1, int $$2, int $$3, int $$4) {
      return dxq.a(dxq.a($$0, (double)$$2, (double)($$3 + 1), $$1, dxq.a((double)$$4)));
   }

   private static dxp a(dxp $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dxp $$10 = dxq.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dxp $$9 = dxq.a($$10, $$5, $$0);
      dxp $$11 = dxq.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dxq.a($$11, $$8, $$9);
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
