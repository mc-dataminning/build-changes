import java.util.stream.Stream;

public class dxw {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dxi s = dxj.a(10.0);
   private static final dxi t = dxj.a();
   private static final ala<dxi> u = a("zero");
   private static final ala<dxi> v = a("y");
   private static final ala<dxi> w = a("shift_x");
   private static final ala<dxi> x = a("shift_z");
   private static final ala<dxi> y = a("overworld/base_3d_noise");
   private static final ala<dxi> z = a("nether/base_3d_noise");
   private static final ala<dxi> A = a("end/base_3d_noise");
   public static final ala<dxi> d = a("overworld/continents");
   public static final ala<dxi> e = a("overworld/erosion");
   public static final ala<dxi> f = a("overworld/ridges");
   public static final ala<dxi> g = a("overworld/ridges_folded");
   public static final ala<dxi> h = a("overworld/offset");
   public static final ala<dxi> i = a("overworld/factor");
   public static final ala<dxi> j = a("overworld/jaggedness");
   public static final ala<dxi> k = a("overworld/depth");
   private static final ala<dxi> B = a("overworld/sloped_cheese");
   public static final ala<dxi> l = a("overworld_large_biomes/continents");
   public static final ala<dxi> m = a("overworld_large_biomes/erosion");
   private static final ala<dxi> C = a("overworld_large_biomes/offset");
   private static final ala<dxi> D = a("overworld_large_biomes/factor");
   private static final ala<dxi> E = a("overworld_large_biomes/jaggedness");
   private static final ala<dxi> F = a("overworld_large_biomes/depth");
   private static final ala<dxi> G = a("overworld_large_biomes/sloped_cheese");
   private static final ala<dxi> H = a("overworld_amplified/offset");
   private static final ala<dxi> I = a("overworld_amplified/factor");
   private static final ala<dxi> J = a("overworld_amplified/jaggedness");
   private static final ala<dxi> K = a("overworld_amplified/depth");
   private static final ala<dxi> L = a("overworld_amplified/sloped_cheese");
   private static final ala<dxi> M = a("end/sloped_cheese");
   private static final ala<dxi> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ala<dxi> O = a("overworld/caves/entrances");
   private static final ala<dxi> P = a("overworld/caves/noodle");
   private static final ala<dxi> Q = a("overworld/caves/pillars");
   private static final ala<dxi> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ala<dxi> S = a("overworld/caves/spaghetti_2d");

   private static ala<dxi> a(String $$0) {
      return ala.a(lq.aD, new alb($$0));
   }

   public static ji<? extends dxi> a(rc<dxi> $$0) {
      jj<emt.a> $$1 = $$0.a(lq.aH);
      jj<dxi> $$2 = $$0.a(lq.aD);
      $$0.a(u, dxj.a());
      int $$3 = dvp.e * 2;
      int $$4 = dvp.d * 2;
      $$0.a(v, dxj.a($$3, $$4, (double)$$3, (double)$$4));
      dxi $$5 = a($$0, w, dxj.b(dxj.c(dxj.b($$1.b(dxy.j)))));
      dxi $$6 = a($$0, x, dxj.b(dxj.c(dxj.c($$1.b(dxy.j)))));
      $$0.a(y, emq.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, emq.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, emq.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ji<dxi> $$7 = $$0.a(d, dxj.b(dxj.a($$5, $$6, 0.25, $$1.b(dxy.c))));
      ji<dxi> $$8 = $$0.a(e, dxj.b(dxj.a($$5, $$6, 0.25, $$1.b(dxy.d))));
      dxi $$9 = a($$0, f, dxj.b(dxj.a($$5, $$6, 0.25, $$1.b(dxy.i))));
      $$0.a(g, a($$9));
      dxi $$10 = dxj.b($$1.b(dxy.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ji<dxi> $$11 = $$0.a(l, dxj.b(dxj.a($$5, $$6, 0.25, $$1.b(dxy.g))));
      ji<dxi> $$12 = $$0.a(m, dxj.b(dxj.a($$5, $$6, 0.25, $$1.b(dxy.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dxj.a(dxj.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dxj.d(dxj.a($$1.b(dxy.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      rc<dxi> $$0, jj<dxi> $$1, dxi $$2, ji<dxi> $$3, ji<dxi> $$4, ala<dxi> $$5, ala<dxi> $$6, ala<dxi> $$7, ala<dxi> $$8, ala<dxi> $$9, boolean $$10
   ) {
      dxj.w.a $$11 = new dxj.w.a($$3);
      dxj.w.a $$12 = new dxj.w.a($$4);
      dxj.w.a $$13 = new dxj.w.a($$1.b(f));
      dxj.w.a $$14 = new dxj.w.a($$1.b(g));
      dxi $$15 = a($$0, $$5, a(dxj.a(dxj.a(-0.50375F), dxj.a(rr.a($$11, $$12, $$14, $$10))), dxj.c()));
      dxi $$16 = a($$0, $$6, a(dxj.a(rr.a($$11, $$12, $$13, $$14, $$10)), s));
      dxi $$17 = a($$0, $$8, dxj.a(dxj.a(-64, 320, 1.5, -1.5), $$15));
      dxi $$18 = a($$0, $$7, a(dxj.a(rr.b($$11, $$12, $$13, $$14, $$10)), t));
      dxi $$19 = dxj.b($$18, $$2.g());
      dxi $$20 = b($$16, dxj.a($$17, $$19));
      $$0.a($$9, dxj.a($$20, a($$1, y)));
   }

   private static dxi a(rc<dxi> $$0, ala<dxi> $$1, dxi $$2) {
      return new dxj.j($$0.a($$1, $$2));
   }

   private static dxi a(jj<dxi> $$0, ala<dxi> $$1) {
      return new dxj.j($$0.b($$1));
   }

   private static dxi a(dxi $$0) {
      return dxj.b(dxj.a(dxj.a($$0.d(), dxj.a(-0.6666666666666666)).d(), dxj.a(-0.3333333333333333)), dxj.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dxi b(jj<emt.a> $$0) {
      dxi $$1 = dxj.a($$0.b(dxy.z));
      dxi $$2 = dxj.a($$0.b(dxy.A), 0.0, -0.1);
      return dxj.d(dxj.b($$2, dxj.a($$1.d(), dxj.a(-0.4))));
   }

   private static dxi d(jj<dxi> $$0, jj<emt.a> $$1) {
      dxi $$2 = dxj.d(dxj.b($$1.b(dxy.x), 2.0, 1.0));
      dxi $$3 = dxj.a($$1.b(dxy.y), -0.065, -0.088);
      dxi $$4 = dxj.a($$2, $$1.b(dxy.v), dxj.z.a.a);
      dxi $$5 = dxj.a($$2, $$1.b(dxy.w), dxj.z.a.a);
      dxi $$6 = dxj.a(dxj.d($$4, $$5), $$3).a(-1.0, 1.0);
      dxi $$7 = a($$0, N);
      dxi $$8 = dxj.b($$1.b(dxy.B), 0.75, 0.5);
      dxi $$9 = dxj.a(dxj.a($$8, dxj.a(0.37)), dxj.a(-10, 30, 0.3, 0.0));
      return dxj.d(dxj.c($$9, dxj.a($$7, $$6)));
   }

   private static dxi e(jj<dxi> $$0, jj<emt.a> $$1) {
      dxi $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dxi $$6 = a($$2, dxj.b($$1.b(dxy.I), 1.0, 1.0), -60, 320, -1);
      dxi $$7 = a($$2, dxj.a($$1.b(dxy.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dxi $$9 = a($$2, dxj.b($$1.b(dxy.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxi $$10 = a($$2, dxj.b($$1.b(dxy.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxi $$11 = dxj.b(dxj.a(1.5), dxj.d($$9.d(), $$10.d()));
      return dxj.a($$6, -1000000.0, 0.0, dxj.a(64.0), dxj.a($$7, $$11));
   }

   private static dxi c(jj<emt.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dxi $$3 = dxj.b($$0.b(dxy.o), 25.0, 0.3);
      dxi $$4 = dxj.a($$0.b(dxy.p), 0.0, -2.0);
      dxi $$5 = dxj.a($$0.b(dxy.q), 0.0, 1.1);
      dxi $$6 = dxj.a(dxj.b($$3, dxj.a(2.0)), $$4);
      return dxj.d(dxj.b($$6, $$5.f()));
   }

   private static dxi f(jj<dxi> $$0, jj<emt.a> $$1) {
      dxi $$2 = dxj.b($$1.b(dxy.t), 2.0, 1.0);
      dxi $$3 = dxj.a($$2, $$1.b(dxy.r), dxj.z.a.b);
      dxi $$4 = dxj.a($$1.b(dxy.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dxi $$5 = a($$0, R);
      dxi $$6 = dxj.a($$4, dxj.a(-64, 320, 8.0, -40.0)).d();
      dxi $$7 = dxj.a($$6, $$5).f();
      double $$8 = 0.083;
      dxi $$9 = dxj.a($$3, dxj.b(dxj.a(0.083), $$5));
      return dxj.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dxi a(jj<dxi> $$0, jj<emt.a> $$1, dxi $$2) {
      dxi $$3 = a($$0, S);
      dxi $$4 = a($$0, N);
      dxi $$5 = dxj.a($$1.b(dxy.C), 8.0);
      dxi $$6 = dxj.b(dxj.a(4.0), $$5.e());
      dxi $$7 = dxj.a($$1.b(dxy.D), 0.6666666666666666);
      dxi $$8 = dxj.a(dxj.a(dxj.a(0.27), $$7).a(-1.0, 1.0), dxj.a(dxj.a(1.5), dxj.b(dxj.a(-0.64), $$2)).a(0.0, 0.5));
      dxi $$9 = dxj.a($$6, $$8);
      dxi $$10 = dxj.c(dxj.c($$9, a($$0, O)), dxj.a($$3, $$4));
      dxi $$11 = a($$0, Q);
      dxi $$12 = dxj.a($$11, -1000000.0, 0.03, dxj.a(-1000000.0), $$11);
      return dxj.d($$10, $$12);
   }

   private static dxi b(dxi $$0) {
      dxi $$1 = dxj.f($$0);
      return dxj.b(dxj.a($$1), dxj.a(0.64)).i();
   }

   protected static dxv a(jj<dxi> $$0, jj<emt.a> $$1, boolean $$2, boolean $$3) {
      dxi $$4 = dxj.a($$1.b(dxy.k), 0.5);
      dxi $$5 = dxj.a($$1.b(dxy.l), 0.67);
      dxi $$6 = dxj.a($$1.b(dxy.n), 0.7142857142857143);
      dxi $$7 = dxj.a($$1.b(dxy.m));
      dxi $$8 = a($$0, w);
      dxi $$9 = a($$0, x);
      dxi $$10 = dxj.a($$8, $$9, 0.25, $$1.b($$2 ? dxy.e : dxy.a));
      dxi $$11 = dxj.a($$8, $$9, 0.25, $$1.b($$2 ? dxy.f : dxy.b));
      dxi $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dxi $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dxi $$14 = b(dxj.c($$12), $$13);
      dxi $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dxi $$16 = dxj.c($$15, dxj.b(dxj.a(5.0), a($$0, O)));
      dxi $$17 = dxj.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dxi $$18 = dxj.c(b(a($$3, $$17)), a($$0, P));
      dxi $$19 = a($$0, v);
      int $$20 = Stream.of(dxz.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dvp.e * 2);
      int $$21 = Stream.of(dxz.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dvp.e * 2);
      dxi $$22 = a($$19, dxj.b($$1.b(dxy.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dxi $$24 = a($$19, dxj.b($$1.b(dxy.F), 4.0, 4.0), $$20, $$21, 0).d();
      dxi $$25 = a($$19, dxj.b($$1.b(dxy.G), 4.0, 4.0), $$20, $$21, 0).d();
      dxi $$26 = dxj.a(dxj.a(-0.08F), dxj.d($$24, $$25));
      dxi $$27 = dxj.a($$1.b(dxy.H));
      return new dxv(
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
         a($$3, dxj.a($$14, dxj.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dxv b(jj<dxi> $$0, jj<emt.a> $$1, dxi $$2) {
      dxi $$3 = a($$0, w);
      dxi $$4 = a($$0, x);
      dxi $$5 = dxj.a($$3, $$4, 0.25, $$1.b(dxy.a));
      dxi $$6 = dxj.a($$3, $$4, 0.25, $$1.b(dxy.b));
      dxi $$7 = b($$2);
      return new dxv(dxj.a(), dxj.a(), dxj.a(), dxj.a(), $$5, $$6, dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), $$7, dxj.a(), dxj.a(), dxj.a());
   }

   private static dxi a(boolean $$0, dxi $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dxi a(jj<dxi> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dxi a(dxi $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dxv a(jj<dxi> $$0, jj<emt.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dxv b(jj<dxi> $$0, jj<emt.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dxv c(jj<dxi> $$0, jj<emt.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dxi c(dxi $$0) {
      return a($$0, 0, 128);
   }

   protected static dxv a(jj<dxi> $$0) {
      dxi $$1 = dxj.c(dxj.a(0L));
      dxi $$2 = b(c(a($$0, M)));
      return new dxv(
         dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), $$1, dxj.a(), dxj.a(), c(dxj.a($$1, dxj.a(-0.703125))), $$2, dxj.a(), dxj.a(), dxj.a()
      );
   }

   protected static dxv a() {
      return new dxv(dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a(), dxj.a());
   }

   private static dxi a(dxi $$0, dxi $$1) {
      dxi $$2 = dxj.a(dxj.b(), $$1, $$0);
      return dxj.b(dxj.c($$2));
   }

   private static dxi b(dxi $$0, dxi $$1) {
      dxi $$2 = dxj.b($$1, $$0);
      return dxj.b(dxj.a(4.0), $$2.h());
   }

   private static dxi a(dxi $$0, dxi $$1, int $$2, int $$3, int $$4) {
      return dxj.a(dxj.a($$0, (double)$$2, (double)($$3 + 1), $$1, dxj.a((double)$$4)));
   }

   private static dxi a(dxi $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dxi $$10 = dxj.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dxi $$9 = dxj.a($$10, $$5, $$0);
      dxi $$11 = dxj.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dxj.a($$11, $$8, $$9);
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
