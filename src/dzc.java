import java.util.stream.Stream;

public class dzc {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dyo s = dyp.a(10.0);
   private static final dyo t = dyp.a();
   private static final akp<dyo> u = a("zero");
   private static final akp<dyo> v = a("y");
   private static final akp<dyo> w = a("shift_x");
   private static final akp<dyo> x = a("shift_z");
   private static final akp<dyo> y = a("overworld/base_3d_noise");
   private static final akp<dyo> z = a("nether/base_3d_noise");
   private static final akp<dyo> A = a("end/base_3d_noise");
   public static final akp<dyo> d = a("overworld/continents");
   public static final akp<dyo> e = a("overworld/erosion");
   public static final akp<dyo> f = a("overworld/ridges");
   public static final akp<dyo> g = a("overworld/ridges_folded");
   public static final akp<dyo> h = a("overworld/offset");
   public static final akp<dyo> i = a("overworld/factor");
   public static final akp<dyo> j = a("overworld/jaggedness");
   public static final akp<dyo> k = a("overworld/depth");
   private static final akp<dyo> B = a("overworld/sloped_cheese");
   public static final akp<dyo> l = a("overworld_large_biomes/continents");
   public static final akp<dyo> m = a("overworld_large_biomes/erosion");
   private static final akp<dyo> C = a("overworld_large_biomes/offset");
   private static final akp<dyo> D = a("overworld_large_biomes/factor");
   private static final akp<dyo> E = a("overworld_large_biomes/jaggedness");
   private static final akp<dyo> F = a("overworld_large_biomes/depth");
   private static final akp<dyo> G = a("overworld_large_biomes/sloped_cheese");
   private static final akp<dyo> H = a("overworld_amplified/offset");
   private static final akp<dyo> I = a("overworld_amplified/factor");
   private static final akp<dyo> J = a("overworld_amplified/jaggedness");
   private static final akp<dyo> K = a("overworld_amplified/depth");
   private static final akp<dyo> L = a("overworld_amplified/sloped_cheese");
   private static final akp<dyo> M = a("end/sloped_cheese");
   private static final akp<dyo> N = a("overworld/caves/spaghetti_roughness_function");
   private static final akp<dyo> O = a("overworld/caves/entrances");
   private static final akp<dyo> P = a("overworld/caves/noodle");
   private static final akp<dyo> Q = a("overworld/caves/pillars");
   private static final akp<dyo> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final akp<dyo> S = a("overworld/caves/spaghetti_2d");

   private static akp<dyo> a(String $$0) {
      return akp.a(lu.aJ, akq.b($$0));
   }

   public static jm<? extends dyo> a(qp<dyo> $$0) {
      jn<eob.a> $$1 = $$0.a(lu.aP);
      jn<dyo> $$2 = $$0.a(lu.aJ);
      $$0.a(u, dyp.a());
      int $$3 = dwv.e * 2;
      int $$4 = dwv.d * 2;
      $$0.a(v, dyp.a($$3, $$4, (double)$$3, (double)$$4));
      dyo $$5 = a($$0, w, dyp.b(dyp.c(dyp.b($$1.b(dze.j)))));
      dyo $$6 = a($$0, x, dyp.b(dyp.c(dyp.c($$1.b(dze.j)))));
      $$0.a(y, eny.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, eny.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, eny.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jm<dyo> $$7 = $$0.a(d, dyp.b(dyp.a($$5, $$6, 0.25, $$1.b(dze.c))));
      jm<dyo> $$8 = $$0.a(e, dyp.b(dyp.a($$5, $$6, 0.25, $$1.b(dze.d))));
      dyo $$9 = a($$0, f, dyp.b(dyp.a($$5, $$6, 0.25, $$1.b(dze.i))));
      $$0.a(g, a($$9));
      dyo $$10 = dyp.b($$1.b(dze.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jm<dyo> $$11 = $$0.a(l, dyp.b(dyp.a($$5, $$6, 0.25, $$1.b(dze.g))));
      jm<dyo> $$12 = $$0.a(m, dyp.b(dyp.a($$5, $$6, 0.25, $$1.b(dze.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dyp.a(dyp.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dyp.d(dyp.a($$1.b(dze.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qp<dyo> $$0, jn<dyo> $$1, dyo $$2, jm<dyo> $$3, jm<dyo> $$4, akp<dyo> $$5, akp<dyo> $$6, akp<dyo> $$7, akp<dyo> $$8, akp<dyo> $$9, boolean $$10
   ) {
      dyp.w.a $$11 = new dyp.w.a($$3);
      dyp.w.a $$12 = new dyp.w.a($$4);
      dyp.w.a $$13 = new dyp.w.a($$1.b(f));
      dyp.w.a $$14 = new dyp.w.a($$1.b(g));
      dyo $$15 = a($$0, $$5, a(dyp.a(dyp.a(-0.50375F), dyp.a(re.a($$11, $$12, $$14, $$10))), dyp.c()));
      dyo $$16 = a($$0, $$6, a(dyp.a(re.a($$11, $$12, $$13, $$14, $$10)), s));
      dyo $$17 = a($$0, $$8, dyp.a(dyp.a(-64, 320, 1.5, -1.5), $$15));
      dyo $$18 = a($$0, $$7, a(dyp.a(re.b($$11, $$12, $$13, $$14, $$10)), t));
      dyo $$19 = dyp.b($$18, $$2.g());
      dyo $$20 = b($$16, dyp.a($$17, $$19));
      $$0.a($$9, dyp.a($$20, a($$1, y)));
   }

   private static dyo a(qp<dyo> $$0, akp<dyo> $$1, dyo $$2) {
      return new dyp.j($$0.a($$1, $$2));
   }

   private static dyo a(jn<dyo> $$0, akp<dyo> $$1) {
      return new dyp.j($$0.b($$1));
   }

   private static dyo a(dyo $$0) {
      return dyp.b(dyp.a(dyp.a($$0.d(), dyp.a(-0.6666666666666666)).d(), dyp.a(-0.3333333333333333)), dyp.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dyo b(jn<eob.a> $$0) {
      dyo $$1 = dyp.a($$0.b(dze.z));
      dyo $$2 = dyp.a($$0.b(dze.A), 0.0, -0.1);
      return dyp.d(dyp.b($$2, dyp.a($$1.d(), dyp.a(-0.4))));
   }

   private static dyo d(jn<dyo> $$0, jn<eob.a> $$1) {
      dyo $$2 = dyp.d(dyp.b($$1.b(dze.x), 2.0, 1.0));
      dyo $$3 = dyp.a($$1.b(dze.y), -0.065, -0.088);
      dyo $$4 = dyp.a($$2, $$1.b(dze.v), dyp.z.a.a);
      dyo $$5 = dyp.a($$2, $$1.b(dze.w), dyp.z.a.a);
      dyo $$6 = dyp.a(dyp.d($$4, $$5), $$3).a(-1.0, 1.0);
      dyo $$7 = a($$0, N);
      dyo $$8 = dyp.b($$1.b(dze.B), 0.75, 0.5);
      dyo $$9 = dyp.a(dyp.a($$8, dyp.a(0.37)), dyp.a(-10, 30, 0.3, 0.0));
      return dyp.d(dyp.c($$9, dyp.a($$7, $$6)));
   }

   private static dyo e(jn<dyo> $$0, jn<eob.a> $$1) {
      dyo $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dyo $$6 = a($$2, dyp.b($$1.b(dze.I), 1.0, 1.0), -60, 320, -1);
      dyo $$7 = a($$2, dyp.a($$1.b(dze.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dyo $$9 = a($$2, dyp.b($$1.b(dze.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dyo $$10 = a($$2, dyp.b($$1.b(dze.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dyo $$11 = dyp.b(dyp.a(1.5), dyp.d($$9.d(), $$10.d()));
      return dyp.a($$6, -1000000.0, 0.0, dyp.a(64.0), dyp.a($$7, $$11));
   }

   private static dyo c(jn<eob.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dyo $$3 = dyp.b($$0.b(dze.o), 25.0, 0.3);
      dyo $$4 = dyp.a($$0.b(dze.p), 0.0, -2.0);
      dyo $$5 = dyp.a($$0.b(dze.q), 0.0, 1.1);
      dyo $$6 = dyp.a(dyp.b($$3, dyp.a(2.0)), $$4);
      return dyp.d(dyp.b($$6, $$5.f()));
   }

   private static dyo f(jn<dyo> $$0, jn<eob.a> $$1) {
      dyo $$2 = dyp.b($$1.b(dze.t), 2.0, 1.0);
      dyo $$3 = dyp.a($$2, $$1.b(dze.r), dyp.z.a.b);
      dyo $$4 = dyp.a($$1.b(dze.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dyo $$5 = a($$0, R);
      dyo $$6 = dyp.a($$4, dyp.a(-64, 320, 8.0, -40.0)).d();
      dyo $$7 = dyp.a($$6, $$5).f();
      double $$8 = 0.083;
      dyo $$9 = dyp.a($$3, dyp.b(dyp.a(0.083), $$5));
      return dyp.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dyo a(jn<dyo> $$0, jn<eob.a> $$1, dyo $$2) {
      dyo $$3 = a($$0, S);
      dyo $$4 = a($$0, N);
      dyo $$5 = dyp.a($$1.b(dze.C), 8.0);
      dyo $$6 = dyp.b(dyp.a(4.0), $$5.e());
      dyo $$7 = dyp.a($$1.b(dze.D), 0.6666666666666666);
      dyo $$8 = dyp.a(dyp.a(dyp.a(0.27), $$7).a(-1.0, 1.0), dyp.a(dyp.a(1.5), dyp.b(dyp.a(-0.64), $$2)).a(0.0, 0.5));
      dyo $$9 = dyp.a($$6, $$8);
      dyo $$10 = dyp.c(dyp.c($$9, a($$0, O)), dyp.a($$3, $$4));
      dyo $$11 = a($$0, Q);
      dyo $$12 = dyp.a($$11, -1000000.0, 0.03, dyp.a(-1000000.0), $$11);
      return dyp.d($$10, $$12);
   }

   private static dyo b(dyo $$0) {
      dyo $$1 = dyp.f($$0);
      return dyp.b(dyp.a($$1), dyp.a(0.64)).i();
   }

   protected static dzb a(jn<dyo> $$0, jn<eob.a> $$1, boolean $$2, boolean $$3) {
      dyo $$4 = dyp.a($$1.b(dze.k), 0.5);
      dyo $$5 = dyp.a($$1.b(dze.l), 0.67);
      dyo $$6 = dyp.a($$1.b(dze.n), 0.7142857142857143);
      dyo $$7 = dyp.a($$1.b(dze.m));
      dyo $$8 = a($$0, w);
      dyo $$9 = a($$0, x);
      dyo $$10 = dyp.a($$8, $$9, 0.25, $$1.b($$2 ? dze.e : dze.a));
      dyo $$11 = dyp.a($$8, $$9, 0.25, $$1.b($$2 ? dze.f : dze.b));
      dyo $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dyo $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dyo $$14 = b(dyp.c($$12), $$13);
      dyo $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dyo $$16 = dyp.c($$15, dyp.b(dyp.a(5.0), a($$0, O)));
      dyo $$17 = dyp.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dyo $$18 = dyp.c(b(a($$3, $$17)), a($$0, P));
      dyo $$19 = a($$0, v);
      int $$20 = Stream.of(dzf.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dwv.e * 2);
      int $$21 = Stream.of(dzf.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dwv.e * 2);
      dyo $$22 = a($$19, dyp.b($$1.b(dze.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dyo $$24 = a($$19, dyp.b($$1.b(dze.F), 4.0, 4.0), $$20, $$21, 0).d();
      dyo $$25 = a($$19, dyp.b($$1.b(dze.G), 4.0, 4.0), $$20, $$21, 0).d();
      dyo $$26 = dyp.a(dyp.a(-0.08F), dyp.d($$24, $$25));
      dyo $$27 = dyp.a($$1.b(dze.H));
      return new dzb(
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
         a($$3, dyp.a($$14, dyp.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dzb b(jn<dyo> $$0, jn<eob.a> $$1, dyo $$2) {
      dyo $$3 = a($$0, w);
      dyo $$4 = a($$0, x);
      dyo $$5 = dyp.a($$3, $$4, 0.25, $$1.b(dze.a));
      dyo $$6 = dyp.a($$3, $$4, 0.25, $$1.b(dze.b));
      dyo $$7 = b($$2);
      return new dzb(dyp.a(), dyp.a(), dyp.a(), dyp.a(), $$5, $$6, dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), $$7, dyp.a(), dyp.a(), dyp.a());
   }

   private static dyo a(boolean $$0, dyo $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dyo a(jn<dyo> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dyo a(dyo $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dzb a(jn<dyo> $$0, jn<eob.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dzb b(jn<dyo> $$0, jn<eob.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dzb c(jn<dyo> $$0, jn<eob.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dyo c(dyo $$0) {
      return a($$0, 0, 128);
   }

   protected static dzb a(jn<dyo> $$0) {
      dyo $$1 = dyp.c(dyp.a(0L));
      dyo $$2 = b(c(a($$0, M)));
      return new dzb(
         dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), $$1, dyp.a(), dyp.a(), c(dyp.a($$1, dyp.a(-0.703125))), $$2, dyp.a(), dyp.a(), dyp.a()
      );
   }

   protected static dzb a() {
      return new dzb(dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a(), dyp.a());
   }

   private static dyo a(dyo $$0, dyo $$1) {
      dyo $$2 = dyp.a(dyp.b(), $$1, $$0);
      return dyp.b(dyp.c($$2));
   }

   private static dyo b(dyo $$0, dyo $$1) {
      dyo $$2 = dyp.b($$1, $$0);
      return dyp.b(dyp.a(4.0), $$2.h());
   }

   private static dyo a(dyo $$0, dyo $$1, int $$2, int $$3, int $$4) {
      return dyp.a(dyp.a($$0, (double)$$2, (double)($$3 + 1), $$1, dyp.a((double)$$4)));
   }

   private static dyo a(dyo $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dyo $$10 = dyp.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dyo $$9 = dyp.a($$10, $$5, $$0);
      dyo $$11 = dyp.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dyp.a($$11, $$8, $$9);
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
