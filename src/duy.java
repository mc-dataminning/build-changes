import java.util.stream.Stream;

public class duy {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final duk s = dul.a(10.0);
   private static final duk t = dul.a();
   private static final ajs<duk> u = a("zero");
   private static final ajs<duk> v = a("y");
   private static final ajs<duk> w = a("shift_x");
   private static final ajs<duk> x = a("shift_z");
   private static final ajs<duk> y = a("overworld/base_3d_noise");
   private static final ajs<duk> z = a("nether/base_3d_noise");
   private static final ajs<duk> A = a("end/base_3d_noise");
   public static final ajs<duk> d = a("overworld/continents");
   public static final ajs<duk> e = a("overworld/erosion");
   public static final ajs<duk> f = a("overworld/ridges");
   public static final ajs<duk> g = a("overworld/ridges_folded");
   public static final ajs<duk> h = a("overworld/offset");
   public static final ajs<duk> i = a("overworld/factor");
   public static final ajs<duk> j = a("overworld/jaggedness");
   public static final ajs<duk> k = a("overworld/depth");
   private static final ajs<duk> B = a("overworld/sloped_cheese");
   public static final ajs<duk> l = a("overworld_large_biomes/continents");
   public static final ajs<duk> m = a("overworld_large_biomes/erosion");
   private static final ajs<duk> C = a("overworld_large_biomes/offset");
   private static final ajs<duk> D = a("overworld_large_biomes/factor");
   private static final ajs<duk> E = a("overworld_large_biomes/jaggedness");
   private static final ajs<duk> F = a("overworld_large_biomes/depth");
   private static final ajs<duk> G = a("overworld_large_biomes/sloped_cheese");
   private static final ajs<duk> H = a("overworld_amplified/offset");
   private static final ajs<duk> I = a("overworld_amplified/factor");
   private static final ajs<duk> J = a("overworld_amplified/jaggedness");
   private static final ajs<duk> K = a("overworld_amplified/depth");
   private static final ajs<duk> L = a("overworld_amplified/sloped_cheese");
   private static final ajs<duk> M = a("end/sloped_cheese");
   private static final ajs<duk> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ajs<duk> O = a("overworld/caves/entrances");
   private static final ajs<duk> P = a("overworld/caves/noodle");
   private static final ajs<duk> Q = a("overworld/caves/pillars");
   private static final ajs<duk> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ajs<duk> S = a("overworld/caves/spaghetti_2d");

   private static ajs<duk> a(String $$0) {
      return ajs.a(ks.az, new ajt($$0));
   }

   public static il<? extends duk> a(px<duk> $$0) {
      im<ejv.a> $$1 = $$0.a(ks.aD);
      im<duk> $$2 = $$0.a(ks.az);
      $$0.a(u, dul.a());
      int $$3 = dsr.e * 2;
      int $$4 = dsr.d * 2;
      $$0.a(v, dul.a($$3, $$4, (double)$$3, (double)$$4));
      duk $$5 = a($$0, w, dul.b(dul.c(dul.b($$1.b(dva.j)))));
      duk $$6 = a($$0, x, dul.b(dul.c(dul.c($$1.b(dva.j)))));
      $$0.a(y, ejs.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ejs.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ejs.a(0.25, 0.25, 80.0, 160.0, 4.0));
      il<duk> $$7 = $$0.a(d, dul.b(dul.a($$5, $$6, 0.25, $$1.b(dva.c))));
      il<duk> $$8 = $$0.a(e, dul.b(dul.a($$5, $$6, 0.25, $$1.b(dva.d))));
      duk $$9 = a($$0, f, dul.b(dul.a($$5, $$6, 0.25, $$1.b(dva.i))));
      $$0.a(g, a($$9));
      duk $$10 = dul.b($$1.b(dva.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      il<duk> $$11 = $$0.a(l, dul.b(dul.a($$5, $$6, 0.25, $$1.b(dva.g))));
      il<duk> $$12 = $$0.a(m, dul.b(dul.a($$5, $$6, 0.25, $$1.b(dva.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dul.a(dul.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dul.d(dul.a($$1.b(dva.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      px<duk> $$0, im<duk> $$1, duk $$2, il<duk> $$3, il<duk> $$4, ajs<duk> $$5, ajs<duk> $$6, ajs<duk> $$7, ajs<duk> $$8, ajs<duk> $$9, boolean $$10
   ) {
      dul.w.a $$11 = new dul.w.a($$3);
      dul.w.a $$12 = new dul.w.a($$4);
      dul.w.a $$13 = new dul.w.a($$1.b(f));
      dul.w.a $$14 = new dul.w.a($$1.b(g));
      duk $$15 = a($$0, $$5, a(dul.a(dul.a(-0.50375F), dul.a(qm.a($$11, $$12, $$14, $$10))), dul.c()));
      duk $$16 = a($$0, $$6, a(dul.a(qm.a($$11, $$12, $$13, $$14, $$10)), s));
      duk $$17 = a($$0, $$8, dul.a(dul.a(-64, 320, 1.5, -1.5), $$15));
      duk $$18 = a($$0, $$7, a(dul.a(qm.b($$11, $$12, $$13, $$14, $$10)), t));
      duk $$19 = dul.b($$18, $$2.g());
      duk $$20 = b($$16, dul.a($$17, $$19));
      $$0.a($$9, dul.a($$20, a($$1, y)));
   }

   private static duk a(px<duk> $$0, ajs<duk> $$1, duk $$2) {
      return new dul.j($$0.a($$1, $$2));
   }

   private static duk a(im<duk> $$0, ajs<duk> $$1) {
      return new dul.j($$0.b($$1));
   }

   private static duk a(duk $$0) {
      return dul.b(dul.a(dul.a($$0.d(), dul.a(-0.6666666666666666)).d(), dul.a(-0.3333333333333333)), dul.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static duk b(im<ejv.a> $$0) {
      duk $$1 = dul.a($$0.b(dva.z));
      duk $$2 = dul.a($$0.b(dva.A), 0.0, -0.1);
      return dul.d(dul.b($$2, dul.a($$1.d(), dul.a(-0.4))));
   }

   private static duk d(im<duk> $$0, im<ejv.a> $$1) {
      duk $$2 = dul.d(dul.b($$1.b(dva.x), 2.0, 1.0));
      duk $$3 = dul.a($$1.b(dva.y), -0.065, -0.088);
      duk $$4 = dul.a($$2, $$1.b(dva.v), dul.z.a.a);
      duk $$5 = dul.a($$2, $$1.b(dva.w), dul.z.a.a);
      duk $$6 = dul.a(dul.d($$4, $$5), $$3).a(-1.0, 1.0);
      duk $$7 = a($$0, N);
      duk $$8 = dul.b($$1.b(dva.B), 0.75, 0.5);
      duk $$9 = dul.a(dul.a($$8, dul.a(0.37)), dul.a(-10, 30, 0.3, 0.0));
      return dul.d(dul.c($$9, dul.a($$7, $$6)));
   }

   private static duk e(im<duk> $$0, im<ejv.a> $$1) {
      duk $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      duk $$6 = a($$2, dul.b($$1.b(dva.I), 1.0, 1.0), -60, 320, -1);
      duk $$7 = a($$2, dul.a($$1.b(dva.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      duk $$9 = a($$2, dul.b($$1.b(dva.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      duk $$10 = a($$2, dul.b($$1.b(dva.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      duk $$11 = dul.b(dul.a(1.5), dul.d($$9.d(), $$10.d()));
      return dul.a($$6, -1000000.0, 0.0, dul.a(64.0), dul.a($$7, $$11));
   }

   private static duk c(im<ejv.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      duk $$3 = dul.b($$0.b(dva.o), 25.0, 0.3);
      duk $$4 = dul.a($$0.b(dva.p), 0.0, -2.0);
      duk $$5 = dul.a($$0.b(dva.q), 0.0, 1.1);
      duk $$6 = dul.a(dul.b($$3, dul.a(2.0)), $$4);
      return dul.d(dul.b($$6, $$5.f()));
   }

   private static duk f(im<duk> $$0, im<ejv.a> $$1) {
      duk $$2 = dul.b($$1.b(dva.t), 2.0, 1.0);
      duk $$3 = dul.a($$2, $$1.b(dva.r), dul.z.a.b);
      duk $$4 = dul.a($$1.b(dva.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      duk $$5 = a($$0, R);
      duk $$6 = dul.a($$4, dul.a(-64, 320, 8.0, -40.0)).d();
      duk $$7 = dul.a($$6, $$5).f();
      double $$8 = 0.083;
      duk $$9 = dul.a($$3, dul.b(dul.a(0.083), $$5));
      return dul.d($$9, $$7).a(-1.0, 1.0);
   }

   private static duk a(im<duk> $$0, im<ejv.a> $$1, duk $$2) {
      duk $$3 = a($$0, S);
      duk $$4 = a($$0, N);
      duk $$5 = dul.a($$1.b(dva.C), 8.0);
      duk $$6 = dul.b(dul.a(4.0), $$5.e());
      duk $$7 = dul.a($$1.b(dva.D), 0.6666666666666666);
      duk $$8 = dul.a(dul.a(dul.a(0.27), $$7).a(-1.0, 1.0), dul.a(dul.a(1.5), dul.b(dul.a(-0.64), $$2)).a(0.0, 0.5));
      duk $$9 = dul.a($$6, $$8);
      duk $$10 = dul.c(dul.c($$9, a($$0, O)), dul.a($$3, $$4));
      duk $$11 = a($$0, Q);
      duk $$12 = dul.a($$11, -1000000.0, 0.03, dul.a(-1000000.0), $$11);
      return dul.d($$10, $$12);
   }

   private static duk b(duk $$0) {
      duk $$1 = dul.f($$0);
      return dul.b(dul.a($$1), dul.a(0.64)).i();
   }

   protected static dux a(im<duk> $$0, im<ejv.a> $$1, boolean $$2, boolean $$3) {
      duk $$4 = dul.a($$1.b(dva.k), 0.5);
      duk $$5 = dul.a($$1.b(dva.l), 0.67);
      duk $$6 = dul.a($$1.b(dva.n), 0.7142857142857143);
      duk $$7 = dul.a($$1.b(dva.m));
      duk $$8 = a($$0, w);
      duk $$9 = a($$0, x);
      duk $$10 = dul.a($$8, $$9, 0.25, $$1.b($$2 ? dva.e : dva.a));
      duk $$11 = dul.a($$8, $$9, 0.25, $$1.b($$2 ? dva.f : dva.b));
      duk $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      duk $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      duk $$14 = b(dul.c($$12), $$13);
      duk $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      duk $$16 = dul.c($$15, dul.b(dul.a(5.0), a($$0, O)));
      duk $$17 = dul.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      duk $$18 = dul.c(b(a($$3, $$17)), a($$0, P));
      duk $$19 = a($$0, v);
      int $$20 = Stream.of(dvb.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dsr.e * 2);
      int $$21 = Stream.of(dvb.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dsr.e * 2);
      duk $$22 = a($$19, dul.b($$1.b(dva.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      duk $$24 = a($$19, dul.b($$1.b(dva.F), 4.0, 4.0), $$20, $$21, 0).d();
      duk $$25 = a($$19, dul.b($$1.b(dva.G), 4.0, 4.0), $$20, $$21, 0).d();
      duk $$26 = dul.a(dul.a(-0.08F), dul.d($$24, $$25));
      duk $$27 = dul.a($$1.b(dva.H));
      return new dux(
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
         a($$3, dul.a($$14, dul.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dux b(im<duk> $$0, im<ejv.a> $$1, duk $$2) {
      duk $$3 = a($$0, w);
      duk $$4 = a($$0, x);
      duk $$5 = dul.a($$3, $$4, 0.25, $$1.b(dva.a));
      duk $$6 = dul.a($$3, $$4, 0.25, $$1.b(dva.b));
      duk $$7 = b($$2);
      return new dux(dul.a(), dul.a(), dul.a(), dul.a(), $$5, $$6, dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), $$7, dul.a(), dul.a(), dul.a());
   }

   private static duk a(boolean $$0, duk $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static duk a(im<duk> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static duk a(duk $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dux a(im<duk> $$0, im<ejv.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dux b(im<duk> $$0, im<ejv.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dux c(im<duk> $$0, im<ejv.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static duk c(duk $$0) {
      return a($$0, 0, 128);
   }

   protected static dux a(im<duk> $$0) {
      duk $$1 = dul.c(dul.a(0L));
      duk $$2 = b(c(a($$0, M)));
      return new dux(
         dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), $$1, dul.a(), dul.a(), c(dul.a($$1, dul.a(-0.703125))), $$2, dul.a(), dul.a(), dul.a()
      );
   }

   protected static dux a() {
      return new dux(dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), dul.a(), dul.a());
   }

   private static duk a(duk $$0, duk $$1) {
      duk $$2 = dul.a(dul.b(), $$1, $$0);
      return dul.b(dul.c($$2));
   }

   private static duk b(duk $$0, duk $$1) {
      duk $$2 = dul.b($$1, $$0);
      return dul.b(dul.a(4.0), $$2.h());
   }

   private static duk a(duk $$0, duk $$1, int $$2, int $$3, int $$4) {
      return dul.a(dul.a($$0, (double)$$2, (double)($$3 + 1), $$1, dul.a((double)$$4)));
   }

   private static duk a(duk $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      duk $$10 = dul.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      duk $$9 = dul.a($$10, $$5, $$0);
      duk $$11 = dul.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dul.a($$11, $$8, $$9);
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
