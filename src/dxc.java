import java.util.stream.Stream;

public class dxc {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dwo s = dwp.a(10.0);
   private static final dwo t = dwp.a();
   private static final akm<dwo> u = a("zero");
   private static final akm<dwo> v = a("y");
   private static final akm<dwo> w = a("shift_x");
   private static final akm<dwo> x = a("shift_z");
   private static final akm<dwo> y = a("overworld/base_3d_noise");
   private static final akm<dwo> z = a("nether/base_3d_noise");
   private static final akm<dwo> A = a("end/base_3d_noise");
   public static final akm<dwo> d = a("overworld/continents");
   public static final akm<dwo> e = a("overworld/erosion");
   public static final akm<dwo> f = a("overworld/ridges");
   public static final akm<dwo> g = a("overworld/ridges_folded");
   public static final akm<dwo> h = a("overworld/offset");
   public static final akm<dwo> i = a("overworld/factor");
   public static final akm<dwo> j = a("overworld/jaggedness");
   public static final akm<dwo> k = a("overworld/depth");
   private static final akm<dwo> B = a("overworld/sloped_cheese");
   public static final akm<dwo> l = a("overworld_large_biomes/continents");
   public static final akm<dwo> m = a("overworld_large_biomes/erosion");
   private static final akm<dwo> C = a("overworld_large_biomes/offset");
   private static final akm<dwo> D = a("overworld_large_biomes/factor");
   private static final akm<dwo> E = a("overworld_large_biomes/jaggedness");
   private static final akm<dwo> F = a("overworld_large_biomes/depth");
   private static final akm<dwo> G = a("overworld_large_biomes/sloped_cheese");
   private static final akm<dwo> H = a("overworld_amplified/offset");
   private static final akm<dwo> I = a("overworld_amplified/factor");
   private static final akm<dwo> J = a("overworld_amplified/jaggedness");
   private static final akm<dwo> K = a("overworld_amplified/depth");
   private static final akm<dwo> L = a("overworld_amplified/sloped_cheese");
   private static final akm<dwo> M = a("end/sloped_cheese");
   private static final akm<dwo> N = a("overworld/caves/spaghetti_roughness_function");
   private static final akm<dwo> O = a("overworld/caves/entrances");
   private static final akm<dwo> P = a("overworld/caves/noodle");
   private static final akm<dwo> Q = a("overworld/caves/pillars");
   private static final akm<dwo> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final akm<dwo> S = a("overworld/caves/spaghetti_2d");

   private static akm<dwo> a(String $$0) {
      return akm.a(lf.aD, new akn($$0));
   }

   public static ix<? extends dwo> a(qo<dwo> $$0) {
      iy<elz.a> $$1 = $$0.a(lf.aH);
      iy<dwo> $$2 = $$0.a(lf.aD);
      $$0.a(u, dwp.a());
      int $$3 = duv.e * 2;
      int $$4 = duv.d * 2;
      $$0.a(v, dwp.a($$3, $$4, (double)$$3, (double)$$4));
      dwo $$5 = a($$0, w, dwp.b(dwp.c(dwp.b($$1.b(dxe.j)))));
      dwo $$6 = a($$0, x, dwp.b(dwp.c(dwp.c($$1.b(dxe.j)))));
      $$0.a(y, elw.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, elw.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, elw.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ix<dwo> $$7 = $$0.a(d, dwp.b(dwp.a($$5, $$6, 0.25, $$1.b(dxe.c))));
      ix<dwo> $$8 = $$0.a(e, dwp.b(dwp.a($$5, $$6, 0.25, $$1.b(dxe.d))));
      dwo $$9 = a($$0, f, dwp.b(dwp.a($$5, $$6, 0.25, $$1.b(dxe.i))));
      $$0.a(g, a($$9));
      dwo $$10 = dwp.b($$1.b(dxe.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ix<dwo> $$11 = $$0.a(l, dwp.b(dwp.a($$5, $$6, 0.25, $$1.b(dxe.g))));
      ix<dwo> $$12 = $$0.a(m, dwp.b(dwp.a($$5, $$6, 0.25, $$1.b(dxe.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dwp.a(dwp.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dwp.d(dwp.a($$1.b(dxe.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qo<dwo> $$0, iy<dwo> $$1, dwo $$2, ix<dwo> $$3, ix<dwo> $$4, akm<dwo> $$5, akm<dwo> $$6, akm<dwo> $$7, akm<dwo> $$8, akm<dwo> $$9, boolean $$10
   ) {
      dwp.w.a $$11 = new dwp.w.a($$3);
      dwp.w.a $$12 = new dwp.w.a($$4);
      dwp.w.a $$13 = new dwp.w.a($$1.b(f));
      dwp.w.a $$14 = new dwp.w.a($$1.b(g));
      dwo $$15 = a($$0, $$5, a(dwp.a(dwp.a(-0.50375F), dwp.a(rd.a($$11, $$12, $$14, $$10))), dwp.c()));
      dwo $$16 = a($$0, $$6, a(dwp.a(rd.a($$11, $$12, $$13, $$14, $$10)), s));
      dwo $$17 = a($$0, $$8, dwp.a(dwp.a(-64, 320, 1.5, -1.5), $$15));
      dwo $$18 = a($$0, $$7, a(dwp.a(rd.b($$11, $$12, $$13, $$14, $$10)), t));
      dwo $$19 = dwp.b($$18, $$2.g());
      dwo $$20 = b($$16, dwp.a($$17, $$19));
      $$0.a($$9, dwp.a($$20, a($$1, y)));
   }

   private static dwo a(qo<dwo> $$0, akm<dwo> $$1, dwo $$2) {
      return new dwp.j($$0.a($$1, $$2));
   }

   private static dwo a(iy<dwo> $$0, akm<dwo> $$1) {
      return new dwp.j($$0.b($$1));
   }

   private static dwo a(dwo $$0) {
      return dwp.b(dwp.a(dwp.a($$0.d(), dwp.a(-0.6666666666666666)).d(), dwp.a(-0.3333333333333333)), dwp.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dwo b(iy<elz.a> $$0) {
      dwo $$1 = dwp.a($$0.b(dxe.z));
      dwo $$2 = dwp.a($$0.b(dxe.A), 0.0, -0.1);
      return dwp.d(dwp.b($$2, dwp.a($$1.d(), dwp.a(-0.4))));
   }

   private static dwo d(iy<dwo> $$0, iy<elz.a> $$1) {
      dwo $$2 = dwp.d(dwp.b($$1.b(dxe.x), 2.0, 1.0));
      dwo $$3 = dwp.a($$1.b(dxe.y), -0.065, -0.088);
      dwo $$4 = dwp.a($$2, $$1.b(dxe.v), dwp.z.a.a);
      dwo $$5 = dwp.a($$2, $$1.b(dxe.w), dwp.z.a.a);
      dwo $$6 = dwp.a(dwp.d($$4, $$5), $$3).a(-1.0, 1.0);
      dwo $$7 = a($$0, N);
      dwo $$8 = dwp.b($$1.b(dxe.B), 0.75, 0.5);
      dwo $$9 = dwp.a(dwp.a($$8, dwp.a(0.37)), dwp.a(-10, 30, 0.3, 0.0));
      return dwp.d(dwp.c($$9, dwp.a($$7, $$6)));
   }

   private static dwo e(iy<dwo> $$0, iy<elz.a> $$1) {
      dwo $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dwo $$6 = a($$2, dwp.b($$1.b(dxe.I), 1.0, 1.0), -60, 320, -1);
      dwo $$7 = a($$2, dwp.a($$1.b(dxe.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dwo $$9 = a($$2, dwp.b($$1.b(dxe.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dwo $$10 = a($$2, dwp.b($$1.b(dxe.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dwo $$11 = dwp.b(dwp.a(1.5), dwp.d($$9.d(), $$10.d()));
      return dwp.a($$6, -1000000.0, 0.0, dwp.a(64.0), dwp.a($$7, $$11));
   }

   private static dwo c(iy<elz.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dwo $$3 = dwp.b($$0.b(dxe.o), 25.0, 0.3);
      dwo $$4 = dwp.a($$0.b(dxe.p), 0.0, -2.0);
      dwo $$5 = dwp.a($$0.b(dxe.q), 0.0, 1.1);
      dwo $$6 = dwp.a(dwp.b($$3, dwp.a(2.0)), $$4);
      return dwp.d(dwp.b($$6, $$5.f()));
   }

   private static dwo f(iy<dwo> $$0, iy<elz.a> $$1) {
      dwo $$2 = dwp.b($$1.b(dxe.t), 2.0, 1.0);
      dwo $$3 = dwp.a($$2, $$1.b(dxe.r), dwp.z.a.b);
      dwo $$4 = dwp.a($$1.b(dxe.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dwo $$5 = a($$0, R);
      dwo $$6 = dwp.a($$4, dwp.a(-64, 320, 8.0, -40.0)).d();
      dwo $$7 = dwp.a($$6, $$5).f();
      double $$8 = 0.083;
      dwo $$9 = dwp.a($$3, dwp.b(dwp.a(0.083), $$5));
      return dwp.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dwo a(iy<dwo> $$0, iy<elz.a> $$1, dwo $$2) {
      dwo $$3 = a($$0, S);
      dwo $$4 = a($$0, N);
      dwo $$5 = dwp.a($$1.b(dxe.C), 8.0);
      dwo $$6 = dwp.b(dwp.a(4.0), $$5.e());
      dwo $$7 = dwp.a($$1.b(dxe.D), 0.6666666666666666);
      dwo $$8 = dwp.a(dwp.a(dwp.a(0.27), $$7).a(-1.0, 1.0), dwp.a(dwp.a(1.5), dwp.b(dwp.a(-0.64), $$2)).a(0.0, 0.5));
      dwo $$9 = dwp.a($$6, $$8);
      dwo $$10 = dwp.c(dwp.c($$9, a($$0, O)), dwp.a($$3, $$4));
      dwo $$11 = a($$0, Q);
      dwo $$12 = dwp.a($$11, -1000000.0, 0.03, dwp.a(-1000000.0), $$11);
      return dwp.d($$10, $$12);
   }

   private static dwo b(dwo $$0) {
      dwo $$1 = dwp.f($$0);
      return dwp.b(dwp.a($$1), dwp.a(0.64)).i();
   }

   protected static dxb a(iy<dwo> $$0, iy<elz.a> $$1, boolean $$2, boolean $$3) {
      dwo $$4 = dwp.a($$1.b(dxe.k), 0.5);
      dwo $$5 = dwp.a($$1.b(dxe.l), 0.67);
      dwo $$6 = dwp.a($$1.b(dxe.n), 0.7142857142857143);
      dwo $$7 = dwp.a($$1.b(dxe.m));
      dwo $$8 = a($$0, w);
      dwo $$9 = a($$0, x);
      dwo $$10 = dwp.a($$8, $$9, 0.25, $$1.b($$2 ? dxe.e : dxe.a));
      dwo $$11 = dwp.a($$8, $$9, 0.25, $$1.b($$2 ? dxe.f : dxe.b));
      dwo $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dwo $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dwo $$14 = b(dwp.c($$12), $$13);
      dwo $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dwo $$16 = dwp.c($$15, dwp.b(dwp.a(5.0), a($$0, O)));
      dwo $$17 = dwp.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dwo $$18 = dwp.c(b(a($$3, $$17)), a($$0, P));
      dwo $$19 = a($$0, v);
      int $$20 = Stream.of(dxf.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-duv.e * 2);
      int $$21 = Stream.of(dxf.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-duv.e * 2);
      dwo $$22 = a($$19, dwp.b($$1.b(dxe.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dwo $$24 = a($$19, dwp.b($$1.b(dxe.F), 4.0, 4.0), $$20, $$21, 0).d();
      dwo $$25 = a($$19, dwp.b($$1.b(dxe.G), 4.0, 4.0), $$20, $$21, 0).d();
      dwo $$26 = dwp.a(dwp.a(-0.08F), dwp.d($$24, $$25));
      dwo $$27 = dwp.a($$1.b(dxe.H));
      return new dxb(
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
         a($$3, dwp.a($$14, dwp.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dxb b(iy<dwo> $$0, iy<elz.a> $$1, dwo $$2) {
      dwo $$3 = a($$0, w);
      dwo $$4 = a($$0, x);
      dwo $$5 = dwp.a($$3, $$4, 0.25, $$1.b(dxe.a));
      dwo $$6 = dwp.a($$3, $$4, 0.25, $$1.b(dxe.b));
      dwo $$7 = b($$2);
      return new dxb(dwp.a(), dwp.a(), dwp.a(), dwp.a(), $$5, $$6, dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), $$7, dwp.a(), dwp.a(), dwp.a());
   }

   private static dwo a(boolean $$0, dwo $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dwo a(iy<dwo> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dwo a(dwo $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dxb a(iy<dwo> $$0, iy<elz.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dxb b(iy<dwo> $$0, iy<elz.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dxb c(iy<dwo> $$0, iy<elz.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dwo c(dwo $$0) {
      return a($$0, 0, 128);
   }

   protected static dxb a(iy<dwo> $$0) {
      dwo $$1 = dwp.c(dwp.a(0L));
      dwo $$2 = b(c(a($$0, M)));
      return new dxb(
         dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), $$1, dwp.a(), dwp.a(), c(dwp.a($$1, dwp.a(-0.703125))), $$2, dwp.a(), dwp.a(), dwp.a()
      );
   }

   protected static dxb a() {
      return new dxb(dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a(), dwp.a());
   }

   private static dwo a(dwo $$0, dwo $$1) {
      dwo $$2 = dwp.a(dwp.b(), $$1, $$0);
      return dwp.b(dwp.c($$2));
   }

   private static dwo b(dwo $$0, dwo $$1) {
      dwo $$2 = dwp.b($$1, $$0);
      return dwp.b(dwp.a(4.0), $$2.h());
   }

   private static dwo a(dwo $$0, dwo $$1, int $$2, int $$3, int $$4) {
      return dwp.a(dwp.a($$0, (double)$$2, (double)($$3 + 1), $$1, dwp.a((double)$$4)));
   }

   private static dwo a(dwo $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dwo $$10 = dwp.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dwo $$9 = dwp.a($$10, $$5, $$0);
      dwo $$11 = dwp.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dwp.a($$11, $$8, $$9);
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
