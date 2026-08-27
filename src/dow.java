import java.util.stream.Stream;

public class dow {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final doi s = doj.a(10.0);
   private static final doi t = doj.a();
   private static final ahf<doi> u = a("zero");
   private static final ahf<doi> v = a("y");
   private static final ahf<doi> w = a("shift_x");
   private static final ahf<doi> x = a("shift_z");
   private static final ahf<doi> y = a("overworld/base_3d_noise");
   private static final ahf<doi> z = a("nether/base_3d_noise");
   private static final ahf<doi> A = a("end/base_3d_noise");
   public static final ahf<doi> d = a("overworld/continents");
   public static final ahf<doi> e = a("overworld/erosion");
   public static final ahf<doi> f = a("overworld/ridges");
   public static final ahf<doi> g = a("overworld/ridges_folded");
   public static final ahf<doi> h = a("overworld/offset");
   public static final ahf<doi> i = a("overworld/factor");
   public static final ahf<doi> j = a("overworld/jaggedness");
   public static final ahf<doi> k = a("overworld/depth");
   private static final ahf<doi> B = a("overworld/sloped_cheese");
   public static final ahf<doi> l = a("overworld_large_biomes/continents");
   public static final ahf<doi> m = a("overworld_large_biomes/erosion");
   private static final ahf<doi> C = a("overworld_large_biomes/offset");
   private static final ahf<doi> D = a("overworld_large_biomes/factor");
   private static final ahf<doi> E = a("overworld_large_biomes/jaggedness");
   private static final ahf<doi> F = a("overworld_large_biomes/depth");
   private static final ahf<doi> G = a("overworld_large_biomes/sloped_cheese");
   private static final ahf<doi> H = a("overworld_amplified/offset");
   private static final ahf<doi> I = a("overworld_amplified/factor");
   private static final ahf<doi> J = a("overworld_amplified/jaggedness");
   private static final ahf<doi> K = a("overworld_amplified/depth");
   private static final ahf<doi> L = a("overworld_amplified/sloped_cheese");
   private static final ahf<doi> M = a("end/sloped_cheese");
   private static final ahf<doi> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ahf<doi> O = a("overworld/caves/entrances");
   private static final ahf<doi> P = a("overworld/caves/noodle");
   private static final ahf<doi> Q = a("overworld/caves/pillars");
   private static final ahf<doi> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ahf<doi> S = a("overworld/caves/spaghetti_2d");

   private static ahf<doi> a(String $$0) {
      return ahf.a(ke.ax, new ahg($$0));
   }

   public static ih<? extends doi> a(pe<doi> $$0) {
      ii<edt.a> $$1 = $$0.a(ke.aB);
      ii<doi> $$2 = $$0.a(ke.ax);
      $$0.a(u, doj.a());
      int $$3 = dmp.e * 2;
      int $$4 = dmp.d * 2;
      $$0.a(v, doj.a($$3, $$4, (double)$$3, (double)$$4));
      doi $$5 = a($$0, w, doj.b(doj.c(doj.b($$1.b(doy.j)))));
      doi $$6 = a($$0, x, doj.b(doj.c(doj.c($$1.b(doy.j)))));
      $$0.a(y, edq.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, edq.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, edq.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ih<doi> $$7 = $$0.a(d, doj.b(doj.a($$5, $$6, 0.25, $$1.b(doy.c))));
      ih<doi> $$8 = $$0.a(e, doj.b(doj.a($$5, $$6, 0.25, $$1.b(doy.d))));
      doi $$9 = a($$0, f, doj.b(doj.a($$5, $$6, 0.25, $$1.b(doy.i))));
      $$0.a(g, a($$9));
      doi $$10 = doj.b($$1.b(doy.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ih<doi> $$11 = $$0.a(l, doj.b(doj.a($$5, $$6, 0.25, $$1.b(doy.g))));
      ih<doi> $$12 = $$0.a(m, doj.b(doj.a($$5, $$6, 0.25, $$1.b(doy.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, doj.a(doj.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, doj.d(doj.a($$1.b(doy.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      pe<doi> $$0, ii<doi> $$1, doi $$2, ih<doi> $$3, ih<doi> $$4, ahf<doi> $$5, ahf<doi> $$6, ahf<doi> $$7, ahf<doi> $$8, ahf<doi> $$9, boolean $$10
   ) {
      doj.w.a $$11 = new doj.w.a($$3);
      doj.w.a $$12 = new doj.w.a($$4);
      doj.w.a $$13 = new doj.w.a($$1.b(f));
      doj.w.a $$14 = new doj.w.a($$1.b(g));
      doi $$15 = a($$0, $$5, a(doj.a(doj.a(-0.50375F), doj.a(pt.a($$11, $$12, $$14, $$10))), doj.c()));
      doi $$16 = a($$0, $$6, a(doj.a(pt.a($$11, $$12, $$13, $$14, $$10)), s));
      doi $$17 = a($$0, $$8, doj.a(doj.a(-64, 320, 1.5, -1.5), $$15));
      doi $$18 = a($$0, $$7, a(doj.a(pt.b($$11, $$12, $$13, $$14, $$10)), t));
      doi $$19 = doj.b($$18, $$2.g());
      doi $$20 = b($$16, doj.a($$17, $$19));
      $$0.a($$9, doj.a($$20, a($$1, y)));
   }

   private static doi a(pe<doi> $$0, ahf<doi> $$1, doi $$2) {
      return new doj.j($$0.a($$1, $$2));
   }

   private static doi a(ii<doi> $$0, ahf<doi> $$1) {
      return new doj.j($$0.b($$1));
   }

   private static doi a(doi $$0) {
      return doj.b(doj.a(doj.a($$0.d(), doj.a(-0.6666666666666666)).d(), doj.a(-0.3333333333333333)), doj.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static doi b(ii<edt.a> $$0) {
      doi $$1 = doj.a($$0.b(doy.z));
      doi $$2 = doj.a($$0.b(doy.A), 0.0, -0.1);
      return doj.d(doj.b($$2, doj.a($$1.d(), doj.a(-0.4))));
   }

   private static doi d(ii<doi> $$0, ii<edt.a> $$1) {
      doi $$2 = doj.d(doj.b($$1.b(doy.x), 2.0, 1.0));
      doi $$3 = doj.a($$1.b(doy.y), -0.065, -0.088);
      doi $$4 = doj.a($$2, $$1.b(doy.v), doj.z.a.a);
      doi $$5 = doj.a($$2, $$1.b(doy.w), doj.z.a.a);
      doi $$6 = doj.a(doj.d($$4, $$5), $$3).a(-1.0, 1.0);
      doi $$7 = a($$0, N);
      doi $$8 = doj.b($$1.b(doy.B), 0.75, 0.5);
      doi $$9 = doj.a(doj.a($$8, doj.a(0.37)), doj.a(-10, 30, 0.3, 0.0));
      return doj.d(doj.c($$9, doj.a($$7, $$6)));
   }

   private static doi e(ii<doi> $$0, ii<edt.a> $$1) {
      doi $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      doi $$6 = a($$2, doj.b($$1.b(doy.I), 1.0, 1.0), -60, 320, -1);
      doi $$7 = a($$2, doj.a($$1.b(doy.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      doi $$9 = a($$2, doj.b($$1.b(doy.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      doi $$10 = a($$2, doj.b($$1.b(doy.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      doi $$11 = doj.b(doj.a(1.5), doj.d($$9.d(), $$10.d()));
      return doj.a($$6, -1000000.0, 0.0, doj.a(64.0), doj.a($$7, $$11));
   }

   private static doi c(ii<edt.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      doi $$3 = doj.b($$0.b(doy.o), 25.0, 0.3);
      doi $$4 = doj.a($$0.b(doy.p), 0.0, -2.0);
      doi $$5 = doj.a($$0.b(doy.q), 0.0, 1.1);
      doi $$6 = doj.a(doj.b($$3, doj.a(2.0)), $$4);
      return doj.d(doj.b($$6, $$5.f()));
   }

   private static doi f(ii<doi> $$0, ii<edt.a> $$1) {
      doi $$2 = doj.b($$1.b(doy.t), 2.0, 1.0);
      doi $$3 = doj.a($$2, $$1.b(doy.r), doj.z.a.b);
      doi $$4 = doj.a($$1.b(doy.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      doi $$5 = a($$0, R);
      doi $$6 = doj.a($$4, doj.a(-64, 320, 8.0, -40.0)).d();
      doi $$7 = doj.a($$6, $$5).f();
      double $$8 = 0.083;
      doi $$9 = doj.a($$3, doj.b(doj.a(0.083), $$5));
      return doj.d($$9, $$7).a(-1.0, 1.0);
   }

   private static doi a(ii<doi> $$0, ii<edt.a> $$1, doi $$2) {
      doi $$3 = a($$0, S);
      doi $$4 = a($$0, N);
      doi $$5 = doj.a($$1.b(doy.C), 8.0);
      doi $$6 = doj.b(doj.a(4.0), $$5.e());
      doi $$7 = doj.a($$1.b(doy.D), 0.6666666666666666);
      doi $$8 = doj.a(doj.a(doj.a(0.27), $$7).a(-1.0, 1.0), doj.a(doj.a(1.5), doj.b(doj.a(-0.64), $$2)).a(0.0, 0.5));
      doi $$9 = doj.a($$6, $$8);
      doi $$10 = doj.c(doj.c($$9, a($$0, O)), doj.a($$3, $$4));
      doi $$11 = a($$0, Q);
      doi $$12 = doj.a($$11, -1000000.0, 0.03, doj.a(-1000000.0), $$11);
      return doj.d($$10, $$12);
   }

   private static doi b(doi $$0) {
      doi $$1 = doj.f($$0);
      return doj.b(doj.a($$1), doj.a(0.64)).i();
   }

   protected static dov a(ii<doi> $$0, ii<edt.a> $$1, boolean $$2, boolean $$3) {
      doi $$4 = doj.a($$1.b(doy.k), 0.5);
      doi $$5 = doj.a($$1.b(doy.l), 0.67);
      doi $$6 = doj.a($$1.b(doy.n), 0.7142857142857143);
      doi $$7 = doj.a($$1.b(doy.m));
      doi $$8 = a($$0, w);
      doi $$9 = a($$0, x);
      doi $$10 = doj.a($$8, $$9, 0.25, $$1.b($$2 ? doy.e : doy.a));
      doi $$11 = doj.a($$8, $$9, 0.25, $$1.b($$2 ? doy.f : doy.b));
      doi $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      doi $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      doi $$14 = b(doj.c($$12), $$13);
      doi $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      doi $$16 = doj.c($$15, doj.b(doj.a(5.0), a($$0, O)));
      doi $$17 = doj.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      doi $$18 = doj.c(b(a($$3, $$17)), a($$0, P));
      doi $$19 = a($$0, v);
      int $$20 = Stream.of(doz.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dmp.e * 2);
      int $$21 = Stream.of(doz.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dmp.e * 2);
      doi $$22 = a($$19, doj.b($$1.b(doy.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      doi $$24 = a($$19, doj.b($$1.b(doy.F), 4.0, 4.0), $$20, $$21, 0).d();
      doi $$25 = a($$19, doj.b($$1.b(doy.G), 4.0, 4.0), $$20, $$21, 0).d();
      doi $$26 = doj.a(doj.a(-0.08F), doj.d($$24, $$25));
      doi $$27 = doj.a($$1.b(doy.H));
      return new dov(
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
         a($$3, doj.a($$14, doj.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dov b(ii<doi> $$0, ii<edt.a> $$1, doi $$2) {
      doi $$3 = a($$0, w);
      doi $$4 = a($$0, x);
      doi $$5 = doj.a($$3, $$4, 0.25, $$1.b(doy.a));
      doi $$6 = doj.a($$3, $$4, 0.25, $$1.b(doy.b));
      doi $$7 = b($$2);
      return new dov(doj.a(), doj.a(), doj.a(), doj.a(), $$5, $$6, doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), $$7, doj.a(), doj.a(), doj.a());
   }

   private static doi a(boolean $$0, doi $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static doi a(ii<doi> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static doi a(doi $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dov a(ii<doi> $$0, ii<edt.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dov b(ii<doi> $$0, ii<edt.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dov c(ii<doi> $$0, ii<edt.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static doi c(doi $$0) {
      return a($$0, 0, 128);
   }

   protected static dov a(ii<doi> $$0) {
      doi $$1 = doj.c(doj.a(0L));
      doi $$2 = b(c(a($$0, M)));
      return new dov(
         doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), $$1, doj.a(), doj.a(), c(doj.a($$1, doj.a(-0.703125))), $$2, doj.a(), doj.a(), doj.a()
      );
   }

   protected static dov a() {
      return new dov(doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), doj.a(), doj.a());
   }

   private static doi a(doi $$0, doi $$1) {
      doi $$2 = doj.a(doj.b(), $$1, $$0);
      return doj.b(doj.c($$2));
   }

   private static doi b(doi $$0, doi $$1) {
      doi $$2 = doj.b($$1, $$0);
      return doj.b(doj.a(4.0), $$2.h());
   }

   private static doi a(doi $$0, doi $$1, int $$2, int $$3, int $$4) {
      return doj.a(doj.a($$0, (double)$$2, (double)($$3 + 1), $$1, doj.a((double)$$4)));
   }

   private static doi a(doi $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      doi $$10 = doj.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      doi $$9 = doj.a($$10, $$5, $$0);
      doi $$11 = doj.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return doj.a($$11, $$8, $$9);
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
