import java.util.stream.Stream;

public class dlr {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dld s = dle.a(10.0);
   private static final dld t = dle.a();
   private static final afv<dld> u = a("zero");
   private static final afv<dld> v = a("y");
   private static final afv<dld> w = a("shift_x");
   private static final afv<dld> x = a("shift_z");
   private static final afv<dld> y = a("overworld/base_3d_noise");
   private static final afv<dld> z = a("nether/base_3d_noise");
   private static final afv<dld> A = a("end/base_3d_noise");
   public static final afv<dld> d = a("overworld/continents");
   public static final afv<dld> e = a("overworld/erosion");
   public static final afv<dld> f = a("overworld/ridges");
   public static final afv<dld> g = a("overworld/ridges_folded");
   public static final afv<dld> h = a("overworld/offset");
   public static final afv<dld> i = a("overworld/factor");
   public static final afv<dld> j = a("overworld/jaggedness");
   public static final afv<dld> k = a("overworld/depth");
   private static final afv<dld> B = a("overworld/sloped_cheese");
   public static final afv<dld> l = a("overworld_large_biomes/continents");
   public static final afv<dld> m = a("overworld_large_biomes/erosion");
   private static final afv<dld> C = a("overworld_large_biomes/offset");
   private static final afv<dld> D = a("overworld_large_biomes/factor");
   private static final afv<dld> E = a("overworld_large_biomes/jaggedness");
   private static final afv<dld> F = a("overworld_large_biomes/depth");
   private static final afv<dld> G = a("overworld_large_biomes/sloped_cheese");
   private static final afv<dld> H = a("overworld_amplified/offset");
   private static final afv<dld> I = a("overworld_amplified/factor");
   private static final afv<dld> J = a("overworld_amplified/jaggedness");
   private static final afv<dld> K = a("overworld_amplified/depth");
   private static final afv<dld> L = a("overworld_amplified/sloped_cheese");
   private static final afv<dld> M = a("end/sloped_cheese");
   private static final afv<dld> N = a("overworld/caves/spaghetti_roughness_function");
   private static final afv<dld> O = a("overworld/caves/entrances");
   private static final afv<dld> P = a("overworld/caves/noodle");
   private static final afv<dld> Q = a("overworld/caves/pillars");
   private static final afv<dld> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final afv<dld> S = a("overworld/caves/spaghetti_2d");

   private static afv<dld> a(String $$0) {
      return afv.a(jz.au, new afw($$0));
   }

   public static ib<? extends dld> a(oo<dld> $$0) {
      ic<eah.a> $$1 = $$0.a(jz.ay);
      ic<dld> $$2 = $$0.a(jz.au);
      $$0.a(u, dle.a());
      int $$3 = djk.e * 2;
      int $$4 = djk.d * 2;
      $$0.a(v, dle.a($$3, $$4, (double)$$3, (double)$$4));
      dld $$5 = a($$0, w, dle.b(dle.c(dle.b($$1.b(dlt.j)))));
      dld $$6 = a($$0, x, dle.b(dle.c(dle.c($$1.b(dlt.j)))));
      $$0.a(y, eae.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, eae.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, eae.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ib<dld> $$7 = $$0.a(d, dle.b(dle.a($$5, $$6, 0.25, $$1.b(dlt.c))));
      ib<dld> $$8 = $$0.a(e, dle.b(dle.a($$5, $$6, 0.25, $$1.b(dlt.d))));
      dld $$9 = a($$0, f, dle.b(dle.a($$5, $$6, 0.25, $$1.b(dlt.i))));
      $$0.a(g, a($$9));
      dld $$10 = dle.b($$1.b(dlt.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ib<dld> $$11 = $$0.a(l, dle.b(dle.a($$5, $$6, 0.25, $$1.b(dlt.g))));
      ib<dld> $$12 = $$0.a(m, dle.b(dle.a($$5, $$6, 0.25, $$1.b(dlt.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dle.a(dle.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dle.d(dle.a($$1.b(dlt.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      oo<dld> $$0, ic<dld> $$1, dld $$2, ib<dld> $$3, ib<dld> $$4, afv<dld> $$5, afv<dld> $$6, afv<dld> $$7, afv<dld> $$8, afv<dld> $$9, boolean $$10
   ) {
      dle.w.a $$11 = new dle.w.a($$3);
      dle.w.a $$12 = new dle.w.a($$4);
      dle.w.a $$13 = new dle.w.a($$1.b(f));
      dle.w.a $$14 = new dle.w.a($$1.b(g));
      dld $$15 = a($$0, $$5, a(dle.a(dle.a(-0.50375F), dle.a(pd.a($$11, $$12, $$14, $$10))), dle.c()));
      dld $$16 = a($$0, $$6, a(dle.a(pd.a($$11, $$12, $$13, $$14, $$10)), s));
      dld $$17 = a($$0, $$8, dle.a(dle.a(-64, 320, 1.5, -1.5), $$15));
      dld $$18 = a($$0, $$7, a(dle.a(pd.b($$11, $$12, $$13, $$14, $$10)), t));
      dld $$19 = dle.b($$18, $$2.g());
      dld $$20 = b($$16, dle.a($$17, $$19));
      $$0.a($$9, dle.a($$20, a($$1, y)));
   }

   private static dld a(oo<dld> $$0, afv<dld> $$1, dld $$2) {
      return new dle.j($$0.a($$1, $$2));
   }

   private static dld a(ic<dld> $$0, afv<dld> $$1) {
      return new dle.j($$0.b($$1));
   }

   private static dld a(dld $$0) {
      return dle.b(dle.a(dle.a($$0.d(), dle.a(-0.6666666666666666)).d(), dle.a(-0.3333333333333333)), dle.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dld b(ic<eah.a> $$0) {
      dld $$1 = dle.a($$0.b(dlt.z));
      dld $$2 = dle.a($$0.b(dlt.A), 0.0, -0.1);
      return dle.d(dle.b($$2, dle.a($$1.d(), dle.a(-0.4))));
   }

   private static dld d(ic<dld> $$0, ic<eah.a> $$1) {
      dld $$2 = dle.d(dle.b($$1.b(dlt.x), 2.0, 1.0));
      dld $$3 = dle.a($$1.b(dlt.y), -0.065, -0.088);
      dld $$4 = dle.a($$2, $$1.b(dlt.v), dle.z.a.a);
      dld $$5 = dle.a($$2, $$1.b(dlt.w), dle.z.a.a);
      dld $$6 = dle.a(dle.d($$4, $$5), $$3).a(-1.0, 1.0);
      dld $$7 = a($$0, N);
      dld $$8 = dle.b($$1.b(dlt.B), 0.75, 0.5);
      dld $$9 = dle.a(dle.a($$8, dle.a(0.37)), dle.a(-10, 30, 0.3, 0.0));
      return dle.d(dle.c($$9, dle.a($$7, $$6)));
   }

   private static dld e(ic<dld> $$0, ic<eah.a> $$1) {
      dld $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dld $$6 = a($$2, dle.b($$1.b(dlt.I), 1.0, 1.0), -60, 320, -1);
      dld $$7 = a($$2, dle.a($$1.b(dlt.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dld $$9 = a($$2, dle.b($$1.b(dlt.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dld $$10 = a($$2, dle.b($$1.b(dlt.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dld $$11 = dle.b(dle.a(1.5), dle.d($$9.d(), $$10.d()));
      return dle.a($$6, -1000000.0, 0.0, dle.a(64.0), dle.a($$7, $$11));
   }

   private static dld c(ic<eah.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dld $$3 = dle.b($$0.b(dlt.o), 25.0, 0.3);
      dld $$4 = dle.a($$0.b(dlt.p), 0.0, -2.0);
      dld $$5 = dle.a($$0.b(dlt.q), 0.0, 1.1);
      dld $$6 = dle.a(dle.b($$3, dle.a(2.0)), $$4);
      return dle.d(dle.b($$6, $$5.f()));
   }

   private static dld f(ic<dld> $$0, ic<eah.a> $$1) {
      dld $$2 = dle.b($$1.b(dlt.t), 2.0, 1.0);
      dld $$3 = dle.a($$2, $$1.b(dlt.r), dle.z.a.b);
      dld $$4 = dle.a($$1.b(dlt.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dld $$5 = a($$0, R);
      dld $$6 = dle.a($$4, dle.a(-64, 320, 8.0, -40.0)).d();
      dld $$7 = dle.a($$6, $$5).f();
      double $$8 = 0.083;
      dld $$9 = dle.a($$3, dle.b(dle.a(0.083), $$5));
      return dle.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dld a(ic<dld> $$0, ic<eah.a> $$1, dld $$2) {
      dld $$3 = a($$0, S);
      dld $$4 = a($$0, N);
      dld $$5 = dle.a($$1.b(dlt.C), 8.0);
      dld $$6 = dle.b(dle.a(4.0), $$5.e());
      dld $$7 = dle.a($$1.b(dlt.D), 0.6666666666666666);
      dld $$8 = dle.a(dle.a(dle.a(0.27), $$7).a(-1.0, 1.0), dle.a(dle.a(1.5), dle.b(dle.a(-0.64), $$2)).a(0.0, 0.5));
      dld $$9 = dle.a($$6, $$8);
      dld $$10 = dle.c(dle.c($$9, a($$0, O)), dle.a($$3, $$4));
      dld $$11 = a($$0, Q);
      dld $$12 = dle.a($$11, -1000000.0, 0.03, dle.a(-1000000.0), $$11);
      return dle.d($$10, $$12);
   }

   private static dld b(dld $$0) {
      dld $$1 = dle.f($$0);
      return dle.b(dle.a($$1), dle.a(0.64)).i();
   }

   protected static dlq a(ic<dld> $$0, ic<eah.a> $$1, boolean $$2, boolean $$3) {
      dld $$4 = dle.a($$1.b(dlt.k), 0.5);
      dld $$5 = dle.a($$1.b(dlt.l), 0.67);
      dld $$6 = dle.a($$1.b(dlt.n), 0.7142857142857143);
      dld $$7 = dle.a($$1.b(dlt.m));
      dld $$8 = a($$0, w);
      dld $$9 = a($$0, x);
      dld $$10 = dle.a($$8, $$9, 0.25, $$1.b($$2 ? dlt.e : dlt.a));
      dld $$11 = dle.a($$8, $$9, 0.25, $$1.b($$2 ? dlt.f : dlt.b));
      dld $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dld $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dld $$14 = b(dle.c($$12), $$13);
      dld $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dld $$16 = dle.c($$15, dle.b(dle.a(5.0), a($$0, O)));
      dld $$17 = dle.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dld $$18 = dle.c(b(a($$3, $$17)), a($$0, P));
      dld $$19 = a($$0, v);
      int $$20 = Stream.of(dlu.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-djk.e * 2);
      int $$21 = Stream.of(dlu.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-djk.e * 2);
      dld $$22 = a($$19, dle.b($$1.b(dlt.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dld $$24 = a($$19, dle.b($$1.b(dlt.F), 4.0, 4.0), $$20, $$21, 0).d();
      dld $$25 = a($$19, dle.b($$1.b(dlt.G), 4.0, 4.0), $$20, $$21, 0).d();
      dld $$26 = dle.a(dle.a(-0.08F), dle.d($$24, $$25));
      dld $$27 = dle.a($$1.b(dlt.H));
      return new dlq(
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
         a($$3, dle.a($$14, dle.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dlq b(ic<dld> $$0, ic<eah.a> $$1, dld $$2) {
      dld $$3 = a($$0, w);
      dld $$4 = a($$0, x);
      dld $$5 = dle.a($$3, $$4, 0.25, $$1.b(dlt.a));
      dld $$6 = dle.a($$3, $$4, 0.25, $$1.b(dlt.b));
      dld $$7 = b($$2);
      return new dlq(dle.a(), dle.a(), dle.a(), dle.a(), $$5, $$6, dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), $$7, dle.a(), dle.a(), dle.a());
   }

   private static dld a(boolean $$0, dld $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dld a(ic<dld> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dld a(dld $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dlq a(ic<dld> $$0, ic<eah.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dlq b(ic<dld> $$0, ic<eah.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dlq c(ic<dld> $$0, ic<eah.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dld c(dld $$0) {
      return a($$0, 0, 128);
   }

   protected static dlq a(ic<dld> $$0) {
      dld $$1 = dle.c(dle.a(0L));
      dld $$2 = b(c(a($$0, M)));
      return new dlq(
         dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), $$1, dle.a(), dle.a(), c(dle.a($$1, dle.a(-0.703125))), $$2, dle.a(), dle.a(), dle.a()
      );
   }

   protected static dlq a() {
      return new dlq(dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), dle.a(), dle.a());
   }

   private static dld a(dld $$0, dld $$1) {
      dld $$2 = dle.a(dle.b(), $$1, $$0);
      return dle.b(dle.c($$2));
   }

   private static dld b(dld $$0, dld $$1) {
      dld $$2 = dle.b($$1, $$0);
      return dle.b(dle.a(4.0), $$2.h());
   }

   private static dld a(dld $$0, dld $$1, int $$2, int $$3, int $$4) {
      return dle.a(dle.a($$0, (double)$$2, (double)($$3 + 1), $$1, dle.a((double)$$4)));
   }

   private static dld a(dld $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dld $$10 = dle.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dld $$9 = dle.a($$10, $$5, $$0);
      dld $$11 = dle.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dle.a($$11, $$8, $$9);
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
