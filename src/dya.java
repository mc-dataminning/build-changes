import java.util.stream.Stream;

public class dya {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dxm s = dxn.a(10.0);
   private static final dxm t = dxn.a();
   private static final ald<dxm> u = a("zero");
   private static final ald<dxm> v = a("y");
   private static final ald<dxm> w = a("shift_x");
   private static final ald<dxm> x = a("shift_z");
   private static final ald<dxm> y = a("overworld/base_3d_noise");
   private static final ald<dxm> z = a("nether/base_3d_noise");
   private static final ald<dxm> A = a("end/base_3d_noise");
   public static final ald<dxm> d = a("overworld/continents");
   public static final ald<dxm> e = a("overworld/erosion");
   public static final ald<dxm> f = a("overworld/ridges");
   public static final ald<dxm> g = a("overworld/ridges_folded");
   public static final ald<dxm> h = a("overworld/offset");
   public static final ald<dxm> i = a("overworld/factor");
   public static final ald<dxm> j = a("overworld/jaggedness");
   public static final ald<dxm> k = a("overworld/depth");
   private static final ald<dxm> B = a("overworld/sloped_cheese");
   public static final ald<dxm> l = a("overworld_large_biomes/continents");
   public static final ald<dxm> m = a("overworld_large_biomes/erosion");
   private static final ald<dxm> C = a("overworld_large_biomes/offset");
   private static final ald<dxm> D = a("overworld_large_biomes/factor");
   private static final ald<dxm> E = a("overworld_large_biomes/jaggedness");
   private static final ald<dxm> F = a("overworld_large_biomes/depth");
   private static final ald<dxm> G = a("overworld_large_biomes/sloped_cheese");
   private static final ald<dxm> H = a("overworld_amplified/offset");
   private static final ald<dxm> I = a("overworld_amplified/factor");
   private static final ald<dxm> J = a("overworld_amplified/jaggedness");
   private static final ald<dxm> K = a("overworld_amplified/depth");
   private static final ald<dxm> L = a("overworld_amplified/sloped_cheese");
   private static final ald<dxm> M = a("end/sloped_cheese");
   private static final ald<dxm> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ald<dxm> O = a("overworld/caves/entrances");
   private static final ald<dxm> P = a("overworld/caves/noodle");
   private static final ald<dxm> Q = a("overworld/caves/pillars");
   private static final ald<dxm> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ald<dxm> S = a("overworld/caves/spaghetti_2d");

   private static ald<dxm> a(String $$0) {
      return ald.a(lq.aD, new ale($$0));
   }

   public static ji<? extends dxm> a(rc<dxm> $$0) {
      jj<emx.a> $$1 = $$0.a(lq.aH);
      jj<dxm> $$2 = $$0.a(lq.aD);
      $$0.a(u, dxn.a());
      int $$3 = dvt.e * 2;
      int $$4 = dvt.d * 2;
      $$0.a(v, dxn.a($$3, $$4, (double)$$3, (double)$$4));
      dxm $$5 = a($$0, w, dxn.b(dxn.c(dxn.b($$1.b(dyc.j)))));
      dxm $$6 = a($$0, x, dxn.b(dxn.c(dxn.c($$1.b(dyc.j)))));
      $$0.a(y, emu.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, emu.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, emu.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ji<dxm> $$7 = $$0.a(d, dxn.b(dxn.a($$5, $$6, 0.25, $$1.b(dyc.c))));
      ji<dxm> $$8 = $$0.a(e, dxn.b(dxn.a($$5, $$6, 0.25, $$1.b(dyc.d))));
      dxm $$9 = a($$0, f, dxn.b(dxn.a($$5, $$6, 0.25, $$1.b(dyc.i))));
      $$0.a(g, a($$9));
      dxm $$10 = dxn.b($$1.b(dyc.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ji<dxm> $$11 = $$0.a(l, dxn.b(dxn.a($$5, $$6, 0.25, $$1.b(dyc.g))));
      ji<dxm> $$12 = $$0.a(m, dxn.b(dxn.a($$5, $$6, 0.25, $$1.b(dyc.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dxn.a(dxn.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dxn.d(dxn.a($$1.b(dyc.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      rc<dxm> $$0, jj<dxm> $$1, dxm $$2, ji<dxm> $$3, ji<dxm> $$4, ald<dxm> $$5, ald<dxm> $$6, ald<dxm> $$7, ald<dxm> $$8, ald<dxm> $$9, boolean $$10
   ) {
      dxn.w.a $$11 = new dxn.w.a($$3);
      dxn.w.a $$12 = new dxn.w.a($$4);
      dxn.w.a $$13 = new dxn.w.a($$1.b(f));
      dxn.w.a $$14 = new dxn.w.a($$1.b(g));
      dxm $$15 = a($$0, $$5, a(dxn.a(dxn.a(-0.50375F), dxn.a(rr.a($$11, $$12, $$14, $$10))), dxn.c()));
      dxm $$16 = a($$0, $$6, a(dxn.a(rr.a($$11, $$12, $$13, $$14, $$10)), s));
      dxm $$17 = a($$0, $$8, dxn.a(dxn.a(-64, 320, 1.5, -1.5), $$15));
      dxm $$18 = a($$0, $$7, a(dxn.a(rr.b($$11, $$12, $$13, $$14, $$10)), t));
      dxm $$19 = dxn.b($$18, $$2.g());
      dxm $$20 = b($$16, dxn.a($$17, $$19));
      $$0.a($$9, dxn.a($$20, a($$1, y)));
   }

   private static dxm a(rc<dxm> $$0, ald<dxm> $$1, dxm $$2) {
      return new dxn.j($$0.a($$1, $$2));
   }

   private static dxm a(jj<dxm> $$0, ald<dxm> $$1) {
      return new dxn.j($$0.b($$1));
   }

   private static dxm a(dxm $$0) {
      return dxn.b(dxn.a(dxn.a($$0.d(), dxn.a(-0.6666666666666666)).d(), dxn.a(-0.3333333333333333)), dxn.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dxm b(jj<emx.a> $$0) {
      dxm $$1 = dxn.a($$0.b(dyc.z));
      dxm $$2 = dxn.a($$0.b(dyc.A), 0.0, -0.1);
      return dxn.d(dxn.b($$2, dxn.a($$1.d(), dxn.a(-0.4))));
   }

   private static dxm d(jj<dxm> $$0, jj<emx.a> $$1) {
      dxm $$2 = dxn.d(dxn.b($$1.b(dyc.x), 2.0, 1.0));
      dxm $$3 = dxn.a($$1.b(dyc.y), -0.065, -0.088);
      dxm $$4 = dxn.a($$2, $$1.b(dyc.v), dxn.z.a.a);
      dxm $$5 = dxn.a($$2, $$1.b(dyc.w), dxn.z.a.a);
      dxm $$6 = dxn.a(dxn.d($$4, $$5), $$3).a(-1.0, 1.0);
      dxm $$7 = a($$0, N);
      dxm $$8 = dxn.b($$1.b(dyc.B), 0.75, 0.5);
      dxm $$9 = dxn.a(dxn.a($$8, dxn.a(0.37)), dxn.a(-10, 30, 0.3, 0.0));
      return dxn.d(dxn.c($$9, dxn.a($$7, $$6)));
   }

   private static dxm e(jj<dxm> $$0, jj<emx.a> $$1) {
      dxm $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dxm $$6 = a($$2, dxn.b($$1.b(dyc.I), 1.0, 1.0), -60, 320, -1);
      dxm $$7 = a($$2, dxn.a($$1.b(dyc.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dxm $$9 = a($$2, dxn.b($$1.b(dyc.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxm $$10 = a($$2, dxn.b($$1.b(dyc.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxm $$11 = dxn.b(dxn.a(1.5), dxn.d($$9.d(), $$10.d()));
      return dxn.a($$6, -1000000.0, 0.0, dxn.a(64.0), dxn.a($$7, $$11));
   }

   private static dxm c(jj<emx.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dxm $$3 = dxn.b($$0.b(dyc.o), 25.0, 0.3);
      dxm $$4 = dxn.a($$0.b(dyc.p), 0.0, -2.0);
      dxm $$5 = dxn.a($$0.b(dyc.q), 0.0, 1.1);
      dxm $$6 = dxn.a(dxn.b($$3, dxn.a(2.0)), $$4);
      return dxn.d(dxn.b($$6, $$5.f()));
   }

   private static dxm f(jj<dxm> $$0, jj<emx.a> $$1) {
      dxm $$2 = dxn.b($$1.b(dyc.t), 2.0, 1.0);
      dxm $$3 = dxn.a($$2, $$1.b(dyc.r), dxn.z.a.b);
      dxm $$4 = dxn.a($$1.b(dyc.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dxm $$5 = a($$0, R);
      dxm $$6 = dxn.a($$4, dxn.a(-64, 320, 8.0, -40.0)).d();
      dxm $$7 = dxn.a($$6, $$5).f();
      double $$8 = 0.083;
      dxm $$9 = dxn.a($$3, dxn.b(dxn.a(0.083), $$5));
      return dxn.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dxm a(jj<dxm> $$0, jj<emx.a> $$1, dxm $$2) {
      dxm $$3 = a($$0, S);
      dxm $$4 = a($$0, N);
      dxm $$5 = dxn.a($$1.b(dyc.C), 8.0);
      dxm $$6 = dxn.b(dxn.a(4.0), $$5.e());
      dxm $$7 = dxn.a($$1.b(dyc.D), 0.6666666666666666);
      dxm $$8 = dxn.a(dxn.a(dxn.a(0.27), $$7).a(-1.0, 1.0), dxn.a(dxn.a(1.5), dxn.b(dxn.a(-0.64), $$2)).a(0.0, 0.5));
      dxm $$9 = dxn.a($$6, $$8);
      dxm $$10 = dxn.c(dxn.c($$9, a($$0, O)), dxn.a($$3, $$4));
      dxm $$11 = a($$0, Q);
      dxm $$12 = dxn.a($$11, -1000000.0, 0.03, dxn.a(-1000000.0), $$11);
      return dxn.d($$10, $$12);
   }

   private static dxm b(dxm $$0) {
      dxm $$1 = dxn.f($$0);
      return dxn.b(dxn.a($$1), dxn.a(0.64)).i();
   }

   protected static dxz a(jj<dxm> $$0, jj<emx.a> $$1, boolean $$2, boolean $$3) {
      dxm $$4 = dxn.a($$1.b(dyc.k), 0.5);
      dxm $$5 = dxn.a($$1.b(dyc.l), 0.67);
      dxm $$6 = dxn.a($$1.b(dyc.n), 0.7142857142857143);
      dxm $$7 = dxn.a($$1.b(dyc.m));
      dxm $$8 = a($$0, w);
      dxm $$9 = a($$0, x);
      dxm $$10 = dxn.a($$8, $$9, 0.25, $$1.b($$2 ? dyc.e : dyc.a));
      dxm $$11 = dxn.a($$8, $$9, 0.25, $$1.b($$2 ? dyc.f : dyc.b));
      dxm $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dxm $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dxm $$14 = b(dxn.c($$12), $$13);
      dxm $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dxm $$16 = dxn.c($$15, dxn.b(dxn.a(5.0), a($$0, O)));
      dxm $$17 = dxn.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dxm $$18 = dxn.c(b(a($$3, $$17)), a($$0, P));
      dxm $$19 = a($$0, v);
      int $$20 = Stream.of(dyd.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dvt.e * 2);
      int $$21 = Stream.of(dyd.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dvt.e * 2);
      dxm $$22 = a($$19, dxn.b($$1.b(dyc.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dxm $$24 = a($$19, dxn.b($$1.b(dyc.F), 4.0, 4.0), $$20, $$21, 0).d();
      dxm $$25 = a($$19, dxn.b($$1.b(dyc.G), 4.0, 4.0), $$20, $$21, 0).d();
      dxm $$26 = dxn.a(dxn.a(-0.08F), dxn.d($$24, $$25));
      dxm $$27 = dxn.a($$1.b(dyc.H));
      return new dxz(
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
         a($$3, dxn.a($$14, dxn.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dxz b(jj<dxm> $$0, jj<emx.a> $$1, dxm $$2) {
      dxm $$3 = a($$0, w);
      dxm $$4 = a($$0, x);
      dxm $$5 = dxn.a($$3, $$4, 0.25, $$1.b(dyc.a));
      dxm $$6 = dxn.a($$3, $$4, 0.25, $$1.b(dyc.b));
      dxm $$7 = b($$2);
      return new dxz(dxn.a(), dxn.a(), dxn.a(), dxn.a(), $$5, $$6, dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), $$7, dxn.a(), dxn.a(), dxn.a());
   }

   private static dxm a(boolean $$0, dxm $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dxm a(jj<dxm> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dxm a(dxm $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dxz a(jj<dxm> $$0, jj<emx.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dxz b(jj<dxm> $$0, jj<emx.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dxz c(jj<dxm> $$0, jj<emx.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dxm c(dxm $$0) {
      return a($$0, 0, 128);
   }

   protected static dxz a(jj<dxm> $$0) {
      dxm $$1 = dxn.c(dxn.a(0L));
      dxm $$2 = b(c(a($$0, M)));
      return new dxz(
         dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), $$1, dxn.a(), dxn.a(), c(dxn.a($$1, dxn.a(-0.703125))), $$2, dxn.a(), dxn.a(), dxn.a()
      );
   }

   protected static dxz a() {
      return new dxz(dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a(), dxn.a());
   }

   private static dxm a(dxm $$0, dxm $$1) {
      dxm $$2 = dxn.a(dxn.b(), $$1, $$0);
      return dxn.b(dxn.c($$2));
   }

   private static dxm b(dxm $$0, dxm $$1) {
      dxm $$2 = dxn.b($$1, $$0);
      return dxn.b(dxn.a(4.0), $$2.h());
   }

   private static dxm a(dxm $$0, dxm $$1, int $$2, int $$3, int $$4) {
      return dxn.a(dxn.a($$0, (double)$$2, (double)($$3 + 1), $$1, dxn.a((double)$$4)));
   }

   private static dxm a(dxm $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dxm $$10 = dxn.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dxm $$9 = dxn.a($$10, $$5, $$0);
      dxm $$11 = dxn.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dxn.a($$11, $$8, $$9);
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
