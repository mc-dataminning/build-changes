import java.util.stream.Stream;

public class dxz {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dxl s = dxm.a(10.0);
   private static final dxl t = dxm.a();
   private static final ald<dxl> u = a("zero");
   private static final ald<dxl> v = a("y");
   private static final ald<dxl> w = a("shift_x");
   private static final ald<dxl> x = a("shift_z");
   private static final ald<dxl> y = a("overworld/base_3d_noise");
   private static final ald<dxl> z = a("nether/base_3d_noise");
   private static final ald<dxl> A = a("end/base_3d_noise");
   public static final ald<dxl> d = a("overworld/continents");
   public static final ald<dxl> e = a("overworld/erosion");
   public static final ald<dxl> f = a("overworld/ridges");
   public static final ald<dxl> g = a("overworld/ridges_folded");
   public static final ald<dxl> h = a("overworld/offset");
   public static final ald<dxl> i = a("overworld/factor");
   public static final ald<dxl> j = a("overworld/jaggedness");
   public static final ald<dxl> k = a("overworld/depth");
   private static final ald<dxl> B = a("overworld/sloped_cheese");
   public static final ald<dxl> l = a("overworld_large_biomes/continents");
   public static final ald<dxl> m = a("overworld_large_biomes/erosion");
   private static final ald<dxl> C = a("overworld_large_biomes/offset");
   private static final ald<dxl> D = a("overworld_large_biomes/factor");
   private static final ald<dxl> E = a("overworld_large_biomes/jaggedness");
   private static final ald<dxl> F = a("overworld_large_biomes/depth");
   private static final ald<dxl> G = a("overworld_large_biomes/sloped_cheese");
   private static final ald<dxl> H = a("overworld_amplified/offset");
   private static final ald<dxl> I = a("overworld_amplified/factor");
   private static final ald<dxl> J = a("overworld_amplified/jaggedness");
   private static final ald<dxl> K = a("overworld_amplified/depth");
   private static final ald<dxl> L = a("overworld_amplified/sloped_cheese");
   private static final ald<dxl> M = a("end/sloped_cheese");
   private static final ald<dxl> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ald<dxl> O = a("overworld/caves/entrances");
   private static final ald<dxl> P = a("overworld/caves/noodle");
   private static final ald<dxl> Q = a("overworld/caves/pillars");
   private static final ald<dxl> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ald<dxl> S = a("overworld/caves/spaghetti_2d");

   private static ald<dxl> a(String $$0) {
      return ald.a(lq.aD, new ale($$0));
   }

   public static ji<? extends dxl> a(rc<dxl> $$0) {
      jj<emw.a> $$1 = $$0.a(lq.aH);
      jj<dxl> $$2 = $$0.a(lq.aD);
      $$0.a(u, dxm.a());
      int $$3 = dvs.e * 2;
      int $$4 = dvs.d * 2;
      $$0.a(v, dxm.a($$3, $$4, (double)$$3, (double)$$4));
      dxl $$5 = a($$0, w, dxm.b(dxm.c(dxm.b($$1.b(dyb.j)))));
      dxl $$6 = a($$0, x, dxm.b(dxm.c(dxm.c($$1.b(dyb.j)))));
      $$0.a(y, emt.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, emt.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, emt.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ji<dxl> $$7 = $$0.a(d, dxm.b(dxm.a($$5, $$6, 0.25, $$1.b(dyb.c))));
      ji<dxl> $$8 = $$0.a(e, dxm.b(dxm.a($$5, $$6, 0.25, $$1.b(dyb.d))));
      dxl $$9 = a($$0, f, dxm.b(dxm.a($$5, $$6, 0.25, $$1.b(dyb.i))));
      $$0.a(g, a($$9));
      dxl $$10 = dxm.b($$1.b(dyb.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ji<dxl> $$11 = $$0.a(l, dxm.b(dxm.a($$5, $$6, 0.25, $$1.b(dyb.g))));
      ji<dxl> $$12 = $$0.a(m, dxm.b(dxm.a($$5, $$6, 0.25, $$1.b(dyb.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dxm.a(dxm.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dxm.d(dxm.a($$1.b(dyb.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      rc<dxl> $$0, jj<dxl> $$1, dxl $$2, ji<dxl> $$3, ji<dxl> $$4, ald<dxl> $$5, ald<dxl> $$6, ald<dxl> $$7, ald<dxl> $$8, ald<dxl> $$9, boolean $$10
   ) {
      dxm.w.a $$11 = new dxm.w.a($$3);
      dxm.w.a $$12 = new dxm.w.a($$4);
      dxm.w.a $$13 = new dxm.w.a($$1.b(f));
      dxm.w.a $$14 = new dxm.w.a($$1.b(g));
      dxl $$15 = a($$0, $$5, a(dxm.a(dxm.a(-0.50375F), dxm.a(rr.a($$11, $$12, $$14, $$10))), dxm.c()));
      dxl $$16 = a($$0, $$6, a(dxm.a(rr.a($$11, $$12, $$13, $$14, $$10)), s));
      dxl $$17 = a($$0, $$8, dxm.a(dxm.a(-64, 320, 1.5, -1.5), $$15));
      dxl $$18 = a($$0, $$7, a(dxm.a(rr.b($$11, $$12, $$13, $$14, $$10)), t));
      dxl $$19 = dxm.b($$18, $$2.g());
      dxl $$20 = b($$16, dxm.a($$17, $$19));
      $$0.a($$9, dxm.a($$20, a($$1, y)));
   }

   private static dxl a(rc<dxl> $$0, ald<dxl> $$1, dxl $$2) {
      return new dxm.j($$0.a($$1, $$2));
   }

   private static dxl a(jj<dxl> $$0, ald<dxl> $$1) {
      return new dxm.j($$0.b($$1));
   }

   private static dxl a(dxl $$0) {
      return dxm.b(dxm.a(dxm.a($$0.d(), dxm.a(-0.6666666666666666)).d(), dxm.a(-0.3333333333333333)), dxm.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dxl b(jj<emw.a> $$0) {
      dxl $$1 = dxm.a($$0.b(dyb.z));
      dxl $$2 = dxm.a($$0.b(dyb.A), 0.0, -0.1);
      return dxm.d(dxm.b($$2, dxm.a($$1.d(), dxm.a(-0.4))));
   }

   private static dxl d(jj<dxl> $$0, jj<emw.a> $$1) {
      dxl $$2 = dxm.d(dxm.b($$1.b(dyb.x), 2.0, 1.0));
      dxl $$3 = dxm.a($$1.b(dyb.y), -0.065, -0.088);
      dxl $$4 = dxm.a($$2, $$1.b(dyb.v), dxm.z.a.a);
      dxl $$5 = dxm.a($$2, $$1.b(dyb.w), dxm.z.a.a);
      dxl $$6 = dxm.a(dxm.d($$4, $$5), $$3).a(-1.0, 1.0);
      dxl $$7 = a($$0, N);
      dxl $$8 = dxm.b($$1.b(dyb.B), 0.75, 0.5);
      dxl $$9 = dxm.a(dxm.a($$8, dxm.a(0.37)), dxm.a(-10, 30, 0.3, 0.0));
      return dxm.d(dxm.c($$9, dxm.a($$7, $$6)));
   }

   private static dxl e(jj<dxl> $$0, jj<emw.a> $$1) {
      dxl $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dxl $$6 = a($$2, dxm.b($$1.b(dyb.I), 1.0, 1.0), -60, 320, -1);
      dxl $$7 = a($$2, dxm.a($$1.b(dyb.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dxl $$9 = a($$2, dxm.b($$1.b(dyb.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxl $$10 = a($$2, dxm.b($$1.b(dyb.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxl $$11 = dxm.b(dxm.a(1.5), dxm.d($$9.d(), $$10.d()));
      return dxm.a($$6, -1000000.0, 0.0, dxm.a(64.0), dxm.a($$7, $$11));
   }

   private static dxl c(jj<emw.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dxl $$3 = dxm.b($$0.b(dyb.o), 25.0, 0.3);
      dxl $$4 = dxm.a($$0.b(dyb.p), 0.0, -2.0);
      dxl $$5 = dxm.a($$0.b(dyb.q), 0.0, 1.1);
      dxl $$6 = dxm.a(dxm.b($$3, dxm.a(2.0)), $$4);
      return dxm.d(dxm.b($$6, $$5.f()));
   }

   private static dxl f(jj<dxl> $$0, jj<emw.a> $$1) {
      dxl $$2 = dxm.b($$1.b(dyb.t), 2.0, 1.0);
      dxl $$3 = dxm.a($$2, $$1.b(dyb.r), dxm.z.a.b);
      dxl $$4 = dxm.a($$1.b(dyb.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dxl $$5 = a($$0, R);
      dxl $$6 = dxm.a($$4, dxm.a(-64, 320, 8.0, -40.0)).d();
      dxl $$7 = dxm.a($$6, $$5).f();
      double $$8 = 0.083;
      dxl $$9 = dxm.a($$3, dxm.b(dxm.a(0.083), $$5));
      return dxm.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dxl a(jj<dxl> $$0, jj<emw.a> $$1, dxl $$2) {
      dxl $$3 = a($$0, S);
      dxl $$4 = a($$0, N);
      dxl $$5 = dxm.a($$1.b(dyb.C), 8.0);
      dxl $$6 = dxm.b(dxm.a(4.0), $$5.e());
      dxl $$7 = dxm.a($$1.b(dyb.D), 0.6666666666666666);
      dxl $$8 = dxm.a(dxm.a(dxm.a(0.27), $$7).a(-1.0, 1.0), dxm.a(dxm.a(1.5), dxm.b(dxm.a(-0.64), $$2)).a(0.0, 0.5));
      dxl $$9 = dxm.a($$6, $$8);
      dxl $$10 = dxm.c(dxm.c($$9, a($$0, O)), dxm.a($$3, $$4));
      dxl $$11 = a($$0, Q);
      dxl $$12 = dxm.a($$11, -1000000.0, 0.03, dxm.a(-1000000.0), $$11);
      return dxm.d($$10, $$12);
   }

   private static dxl b(dxl $$0) {
      dxl $$1 = dxm.f($$0);
      return dxm.b(dxm.a($$1), dxm.a(0.64)).i();
   }

   protected static dxy a(jj<dxl> $$0, jj<emw.a> $$1, boolean $$2, boolean $$3) {
      dxl $$4 = dxm.a($$1.b(dyb.k), 0.5);
      dxl $$5 = dxm.a($$1.b(dyb.l), 0.67);
      dxl $$6 = dxm.a($$1.b(dyb.n), 0.7142857142857143);
      dxl $$7 = dxm.a($$1.b(dyb.m));
      dxl $$8 = a($$0, w);
      dxl $$9 = a($$0, x);
      dxl $$10 = dxm.a($$8, $$9, 0.25, $$1.b($$2 ? dyb.e : dyb.a));
      dxl $$11 = dxm.a($$8, $$9, 0.25, $$1.b($$2 ? dyb.f : dyb.b));
      dxl $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dxl $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dxl $$14 = b(dxm.c($$12), $$13);
      dxl $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dxl $$16 = dxm.c($$15, dxm.b(dxm.a(5.0), a($$0, O)));
      dxl $$17 = dxm.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dxl $$18 = dxm.c(b(a($$3, $$17)), a($$0, P));
      dxl $$19 = a($$0, v);
      int $$20 = Stream.of(dyc.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dvs.e * 2);
      int $$21 = Stream.of(dyc.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dvs.e * 2);
      dxl $$22 = a($$19, dxm.b($$1.b(dyb.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dxl $$24 = a($$19, dxm.b($$1.b(dyb.F), 4.0, 4.0), $$20, $$21, 0).d();
      dxl $$25 = a($$19, dxm.b($$1.b(dyb.G), 4.0, 4.0), $$20, $$21, 0).d();
      dxl $$26 = dxm.a(dxm.a(-0.08F), dxm.d($$24, $$25));
      dxl $$27 = dxm.a($$1.b(dyb.H));
      return new dxy(
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
         a($$3, dxm.a($$14, dxm.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dxy b(jj<dxl> $$0, jj<emw.a> $$1, dxl $$2) {
      dxl $$3 = a($$0, w);
      dxl $$4 = a($$0, x);
      dxl $$5 = dxm.a($$3, $$4, 0.25, $$1.b(dyb.a));
      dxl $$6 = dxm.a($$3, $$4, 0.25, $$1.b(dyb.b));
      dxl $$7 = b($$2);
      return new dxy(dxm.a(), dxm.a(), dxm.a(), dxm.a(), $$5, $$6, dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), $$7, dxm.a(), dxm.a(), dxm.a());
   }

   private static dxl a(boolean $$0, dxl $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dxl a(jj<dxl> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dxl a(dxl $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dxy a(jj<dxl> $$0, jj<emw.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dxy b(jj<dxl> $$0, jj<emw.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dxy c(jj<dxl> $$0, jj<emw.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dxl c(dxl $$0) {
      return a($$0, 0, 128);
   }

   protected static dxy a(jj<dxl> $$0) {
      dxl $$1 = dxm.c(dxm.a(0L));
      dxl $$2 = b(c(a($$0, M)));
      return new dxy(
         dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), $$1, dxm.a(), dxm.a(), c(dxm.a($$1, dxm.a(-0.703125))), $$2, dxm.a(), dxm.a(), dxm.a()
      );
   }

   protected static dxy a() {
      return new dxy(dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a(), dxm.a());
   }

   private static dxl a(dxl $$0, dxl $$1) {
      dxl $$2 = dxm.a(dxm.b(), $$1, $$0);
      return dxm.b(dxm.c($$2));
   }

   private static dxl b(dxl $$0, dxl $$1) {
      dxl $$2 = dxm.b($$1, $$0);
      return dxm.b(dxm.a(4.0), $$2.h());
   }

   private static dxl a(dxl $$0, dxl $$1, int $$2, int $$3, int $$4) {
      return dxm.a(dxm.a($$0, (double)$$2, (double)($$3 + 1), $$1, dxm.a((double)$$4)));
   }

   private static dxl a(dxl $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dxl $$10 = dxm.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dxl $$9 = dxm.a($$10, $$5, $$0);
      dxl $$11 = dxm.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dxm.a($$11, $$8, $$9);
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
