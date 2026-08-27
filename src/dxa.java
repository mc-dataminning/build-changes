import java.util.stream.Stream;

public class dxa {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dwm s = dwn.a(10.0);
   private static final dwm t = dwn.a();
   private static final akl<dwm> u = a("zero");
   private static final akl<dwm> v = a("y");
   private static final akl<dwm> w = a("shift_x");
   private static final akl<dwm> x = a("shift_z");
   private static final akl<dwm> y = a("overworld/base_3d_noise");
   private static final akl<dwm> z = a("nether/base_3d_noise");
   private static final akl<dwm> A = a("end/base_3d_noise");
   public static final akl<dwm> d = a("overworld/continents");
   public static final akl<dwm> e = a("overworld/erosion");
   public static final akl<dwm> f = a("overworld/ridges");
   public static final akl<dwm> g = a("overworld/ridges_folded");
   public static final akl<dwm> h = a("overworld/offset");
   public static final akl<dwm> i = a("overworld/factor");
   public static final akl<dwm> j = a("overworld/jaggedness");
   public static final akl<dwm> k = a("overworld/depth");
   private static final akl<dwm> B = a("overworld/sloped_cheese");
   public static final akl<dwm> l = a("overworld_large_biomes/continents");
   public static final akl<dwm> m = a("overworld_large_biomes/erosion");
   private static final akl<dwm> C = a("overworld_large_biomes/offset");
   private static final akl<dwm> D = a("overworld_large_biomes/factor");
   private static final akl<dwm> E = a("overworld_large_biomes/jaggedness");
   private static final akl<dwm> F = a("overworld_large_biomes/depth");
   private static final akl<dwm> G = a("overworld_large_biomes/sloped_cheese");
   private static final akl<dwm> H = a("overworld_amplified/offset");
   private static final akl<dwm> I = a("overworld_amplified/factor");
   private static final akl<dwm> J = a("overworld_amplified/jaggedness");
   private static final akl<dwm> K = a("overworld_amplified/depth");
   private static final akl<dwm> L = a("overworld_amplified/sloped_cheese");
   private static final akl<dwm> M = a("end/sloped_cheese");
   private static final akl<dwm> N = a("overworld/caves/spaghetti_roughness_function");
   private static final akl<dwm> O = a("overworld/caves/entrances");
   private static final akl<dwm> P = a("overworld/caves/noodle");
   private static final akl<dwm> Q = a("overworld/caves/pillars");
   private static final akl<dwm> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final akl<dwm> S = a("overworld/caves/spaghetti_2d");

   private static akl<dwm> a(String $$0) {
      return akl.a(lf.aD, new akm($$0));
   }

   public static ix<? extends dwm> a(qo<dwm> $$0) {
      iy<elx.a> $$1 = $$0.a(lf.aH);
      iy<dwm> $$2 = $$0.a(lf.aD);
      $$0.a(u, dwn.a());
      int $$3 = dut.e * 2;
      int $$4 = dut.d * 2;
      $$0.a(v, dwn.a($$3, $$4, (double)$$3, (double)$$4));
      dwm $$5 = a($$0, w, dwn.b(dwn.c(dwn.b($$1.b(dxc.j)))));
      dwm $$6 = a($$0, x, dwn.b(dwn.c(dwn.c($$1.b(dxc.j)))));
      $$0.a(y, elu.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, elu.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, elu.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ix<dwm> $$7 = $$0.a(d, dwn.b(dwn.a($$5, $$6, 0.25, $$1.b(dxc.c))));
      ix<dwm> $$8 = $$0.a(e, dwn.b(dwn.a($$5, $$6, 0.25, $$1.b(dxc.d))));
      dwm $$9 = a($$0, f, dwn.b(dwn.a($$5, $$6, 0.25, $$1.b(dxc.i))));
      $$0.a(g, a($$9));
      dwm $$10 = dwn.b($$1.b(dxc.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ix<dwm> $$11 = $$0.a(l, dwn.b(dwn.a($$5, $$6, 0.25, $$1.b(dxc.g))));
      ix<dwm> $$12 = $$0.a(m, dwn.b(dwn.a($$5, $$6, 0.25, $$1.b(dxc.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dwn.a(dwn.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dwn.d(dwn.a($$1.b(dxc.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qo<dwm> $$0, iy<dwm> $$1, dwm $$2, ix<dwm> $$3, ix<dwm> $$4, akl<dwm> $$5, akl<dwm> $$6, akl<dwm> $$7, akl<dwm> $$8, akl<dwm> $$9, boolean $$10
   ) {
      dwn.w.a $$11 = new dwn.w.a($$3);
      dwn.w.a $$12 = new dwn.w.a($$4);
      dwn.w.a $$13 = new dwn.w.a($$1.b(f));
      dwn.w.a $$14 = new dwn.w.a($$1.b(g));
      dwm $$15 = a($$0, $$5, a(dwn.a(dwn.a(-0.50375F), dwn.a(rd.a($$11, $$12, $$14, $$10))), dwn.c()));
      dwm $$16 = a($$0, $$6, a(dwn.a(rd.a($$11, $$12, $$13, $$14, $$10)), s));
      dwm $$17 = a($$0, $$8, dwn.a(dwn.a(-64, 320, 1.5, -1.5), $$15));
      dwm $$18 = a($$0, $$7, a(dwn.a(rd.b($$11, $$12, $$13, $$14, $$10)), t));
      dwm $$19 = dwn.b($$18, $$2.g());
      dwm $$20 = b($$16, dwn.a($$17, $$19));
      $$0.a($$9, dwn.a($$20, a($$1, y)));
   }

   private static dwm a(qo<dwm> $$0, akl<dwm> $$1, dwm $$2) {
      return new dwn.j($$0.a($$1, $$2));
   }

   private static dwm a(iy<dwm> $$0, akl<dwm> $$1) {
      return new dwn.j($$0.b($$1));
   }

   private static dwm a(dwm $$0) {
      return dwn.b(dwn.a(dwn.a($$0.d(), dwn.a(-0.6666666666666666)).d(), dwn.a(-0.3333333333333333)), dwn.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dwm b(iy<elx.a> $$0) {
      dwm $$1 = dwn.a($$0.b(dxc.z));
      dwm $$2 = dwn.a($$0.b(dxc.A), 0.0, -0.1);
      return dwn.d(dwn.b($$2, dwn.a($$1.d(), dwn.a(-0.4))));
   }

   private static dwm d(iy<dwm> $$0, iy<elx.a> $$1) {
      dwm $$2 = dwn.d(dwn.b($$1.b(dxc.x), 2.0, 1.0));
      dwm $$3 = dwn.a($$1.b(dxc.y), -0.065, -0.088);
      dwm $$4 = dwn.a($$2, $$1.b(dxc.v), dwn.z.a.a);
      dwm $$5 = dwn.a($$2, $$1.b(dxc.w), dwn.z.a.a);
      dwm $$6 = dwn.a(dwn.d($$4, $$5), $$3).a(-1.0, 1.0);
      dwm $$7 = a($$0, N);
      dwm $$8 = dwn.b($$1.b(dxc.B), 0.75, 0.5);
      dwm $$9 = dwn.a(dwn.a($$8, dwn.a(0.37)), dwn.a(-10, 30, 0.3, 0.0));
      return dwn.d(dwn.c($$9, dwn.a($$7, $$6)));
   }

   private static dwm e(iy<dwm> $$0, iy<elx.a> $$1) {
      dwm $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dwm $$6 = a($$2, dwn.b($$1.b(dxc.I), 1.0, 1.0), -60, 320, -1);
      dwm $$7 = a($$2, dwn.a($$1.b(dxc.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dwm $$9 = a($$2, dwn.b($$1.b(dxc.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dwm $$10 = a($$2, dwn.b($$1.b(dxc.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dwm $$11 = dwn.b(dwn.a(1.5), dwn.d($$9.d(), $$10.d()));
      return dwn.a($$6, -1000000.0, 0.0, dwn.a(64.0), dwn.a($$7, $$11));
   }

   private static dwm c(iy<elx.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dwm $$3 = dwn.b($$0.b(dxc.o), 25.0, 0.3);
      dwm $$4 = dwn.a($$0.b(dxc.p), 0.0, -2.0);
      dwm $$5 = dwn.a($$0.b(dxc.q), 0.0, 1.1);
      dwm $$6 = dwn.a(dwn.b($$3, dwn.a(2.0)), $$4);
      return dwn.d(dwn.b($$6, $$5.f()));
   }

   private static dwm f(iy<dwm> $$0, iy<elx.a> $$1) {
      dwm $$2 = dwn.b($$1.b(dxc.t), 2.0, 1.0);
      dwm $$3 = dwn.a($$2, $$1.b(dxc.r), dwn.z.a.b);
      dwm $$4 = dwn.a($$1.b(dxc.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dwm $$5 = a($$0, R);
      dwm $$6 = dwn.a($$4, dwn.a(-64, 320, 8.0, -40.0)).d();
      dwm $$7 = dwn.a($$6, $$5).f();
      double $$8 = 0.083;
      dwm $$9 = dwn.a($$3, dwn.b(dwn.a(0.083), $$5));
      return dwn.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dwm a(iy<dwm> $$0, iy<elx.a> $$1, dwm $$2) {
      dwm $$3 = a($$0, S);
      dwm $$4 = a($$0, N);
      dwm $$5 = dwn.a($$1.b(dxc.C), 8.0);
      dwm $$6 = dwn.b(dwn.a(4.0), $$5.e());
      dwm $$7 = dwn.a($$1.b(dxc.D), 0.6666666666666666);
      dwm $$8 = dwn.a(dwn.a(dwn.a(0.27), $$7).a(-1.0, 1.0), dwn.a(dwn.a(1.5), dwn.b(dwn.a(-0.64), $$2)).a(0.0, 0.5));
      dwm $$9 = dwn.a($$6, $$8);
      dwm $$10 = dwn.c(dwn.c($$9, a($$0, O)), dwn.a($$3, $$4));
      dwm $$11 = a($$0, Q);
      dwm $$12 = dwn.a($$11, -1000000.0, 0.03, dwn.a(-1000000.0), $$11);
      return dwn.d($$10, $$12);
   }

   private static dwm b(dwm $$0) {
      dwm $$1 = dwn.f($$0);
      return dwn.b(dwn.a($$1), dwn.a(0.64)).i();
   }

   protected static dwz a(iy<dwm> $$0, iy<elx.a> $$1, boolean $$2, boolean $$3) {
      dwm $$4 = dwn.a($$1.b(dxc.k), 0.5);
      dwm $$5 = dwn.a($$1.b(dxc.l), 0.67);
      dwm $$6 = dwn.a($$1.b(dxc.n), 0.7142857142857143);
      dwm $$7 = dwn.a($$1.b(dxc.m));
      dwm $$8 = a($$0, w);
      dwm $$9 = a($$0, x);
      dwm $$10 = dwn.a($$8, $$9, 0.25, $$1.b($$2 ? dxc.e : dxc.a));
      dwm $$11 = dwn.a($$8, $$9, 0.25, $$1.b($$2 ? dxc.f : dxc.b));
      dwm $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dwm $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dwm $$14 = b(dwn.c($$12), $$13);
      dwm $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dwm $$16 = dwn.c($$15, dwn.b(dwn.a(5.0), a($$0, O)));
      dwm $$17 = dwn.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dwm $$18 = dwn.c(b(a($$3, $$17)), a($$0, P));
      dwm $$19 = a($$0, v);
      int $$20 = Stream.of(dxd.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dut.e * 2);
      int $$21 = Stream.of(dxd.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dut.e * 2);
      dwm $$22 = a($$19, dwn.b($$1.b(dxc.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dwm $$24 = a($$19, dwn.b($$1.b(dxc.F), 4.0, 4.0), $$20, $$21, 0).d();
      dwm $$25 = a($$19, dwn.b($$1.b(dxc.G), 4.0, 4.0), $$20, $$21, 0).d();
      dwm $$26 = dwn.a(dwn.a(-0.08F), dwn.d($$24, $$25));
      dwm $$27 = dwn.a($$1.b(dxc.H));
      return new dwz(
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
         a($$3, dwn.a($$14, dwn.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dwz b(iy<dwm> $$0, iy<elx.a> $$1, dwm $$2) {
      dwm $$3 = a($$0, w);
      dwm $$4 = a($$0, x);
      dwm $$5 = dwn.a($$3, $$4, 0.25, $$1.b(dxc.a));
      dwm $$6 = dwn.a($$3, $$4, 0.25, $$1.b(dxc.b));
      dwm $$7 = b($$2);
      return new dwz(dwn.a(), dwn.a(), dwn.a(), dwn.a(), $$5, $$6, dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), $$7, dwn.a(), dwn.a(), dwn.a());
   }

   private static dwm a(boolean $$0, dwm $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dwm a(iy<dwm> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dwm a(dwm $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dwz a(iy<dwm> $$0, iy<elx.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dwz b(iy<dwm> $$0, iy<elx.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dwz c(iy<dwm> $$0, iy<elx.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dwm c(dwm $$0) {
      return a($$0, 0, 128);
   }

   protected static dwz a(iy<dwm> $$0) {
      dwm $$1 = dwn.c(dwn.a(0L));
      dwm $$2 = b(c(a($$0, M)));
      return new dwz(
         dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), $$1, dwn.a(), dwn.a(), c(dwn.a($$1, dwn.a(-0.703125))), $$2, dwn.a(), dwn.a(), dwn.a()
      );
   }

   protected static dwz a() {
      return new dwz(dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a(), dwn.a());
   }

   private static dwm a(dwm $$0, dwm $$1) {
      dwm $$2 = dwn.a(dwn.b(), $$1, $$0);
      return dwn.b(dwn.c($$2));
   }

   private static dwm b(dwm $$0, dwm $$1) {
      dwm $$2 = dwn.b($$1, $$0);
      return dwn.b(dwn.a(4.0), $$2.h());
   }

   private static dwm a(dwm $$0, dwm $$1, int $$2, int $$3, int $$4) {
      return dwn.a(dwn.a($$0, (double)$$2, (double)($$3 + 1), $$1, dwn.a((double)$$4)));
   }

   private static dwm a(dwm $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dwm $$10 = dwn.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dwm $$9 = dwn.a($$10, $$5, $$0);
      dwm $$11 = dwn.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dwn.a($$11, $$8, $$9);
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
