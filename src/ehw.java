import java.util.stream.Stream;

public class ehw {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final ehi s = ehj.a(10.0);
   private static final ehi t = ehj.a();
   private static final alq<ehi> u = a("zero");
   private static final alq<ehi> v = a("y");
   private static final alq<ehi> w = a("shift_x");
   private static final alq<ehi> x = a("shift_z");
   private static final alq<ehi> y = a("overworld/base_3d_noise");
   private static final alq<ehi> z = a("nether/base_3d_noise");
   private static final alq<ehi> A = a("end/base_3d_noise");
   public static final alq<ehi> d = a("overworld/continents");
   public static final alq<ehi> e = a("overworld/erosion");
   public static final alq<ehi> f = a("overworld/ridges");
   public static final alq<ehi> g = a("overworld/ridges_folded");
   public static final alq<ehi> h = a("overworld/offset");
   public static final alq<ehi> i = a("overworld/factor");
   public static final alq<ehi> j = a("overworld/jaggedness");
   public static final alq<ehi> k = a("overworld/depth");
   private static final alq<ehi> B = a("overworld/sloped_cheese");
   public static final alq<ehi> l = a("overworld_large_biomes/continents");
   public static final alq<ehi> m = a("overworld_large_biomes/erosion");
   private static final alq<ehi> C = a("overworld_large_biomes/offset");
   private static final alq<ehi> D = a("overworld_large_biomes/factor");
   private static final alq<ehi> E = a("overworld_large_biomes/jaggedness");
   private static final alq<ehi> F = a("overworld_large_biomes/depth");
   private static final alq<ehi> G = a("overworld_large_biomes/sloped_cheese");
   private static final alq<ehi> H = a("overworld_amplified/offset");
   private static final alq<ehi> I = a("overworld_amplified/factor");
   private static final alq<ehi> J = a("overworld_amplified/jaggedness");
   private static final alq<ehi> K = a("overworld_amplified/depth");
   private static final alq<ehi> L = a("overworld_amplified/sloped_cheese");
   private static final alq<ehi> M = a("end/sloped_cheese");
   private static final alq<ehi> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alq<ehi> O = a("overworld/caves/entrances");
   private static final alq<ehi> P = a("overworld/caves/noodle");
   private static final alq<ehi> Q = a("overworld/caves/pillars");
   private static final alq<ehi> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alq<ehi> S = a("overworld/caves/spaghetti_2d");

   private static alq<ehi> a(String $$0) {
      return alq.a(mi.aO, alr.b($$0));
   }

   public static jg<? extends ehi> a(qi<ehi> $$0) {
      jh<exd.a> $$1 = $$0.a(mi.aY);
      jh<ehi> $$2 = $$0.a(mi.aO);
      $$0.a(u, ehj.a());
      int $$3 = efn.e * 2;
      int $$4 = efn.d * 2;
      $$0.a(v, ehj.a($$3, $$4, (double)$$3, (double)$$4));
      ehi $$5 = a($$0, w, ehj.b(ehj.c(ehj.b($$1.b(ehy.j)))));
      ehi $$6 = a($$0, x, ehj.b(ehj.c(ehj.c($$1.b(ehy.j)))));
      $$0.a(y, exa.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, exa.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, exa.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jg<ehi> $$7 = $$0.a(d, ehj.b(ehj.a($$5, $$6, 0.25, $$1.b(ehy.c))));
      jg<ehi> $$8 = $$0.a(e, ehj.b(ehj.a($$5, $$6, 0.25, $$1.b(ehy.d))));
      ehi $$9 = a($$0, f, ehj.b(ehj.a($$5, $$6, 0.25, $$1.b(ehy.i))));
      $$0.a(g, a($$9));
      ehi $$10 = ehj.b($$1.b(ehy.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jg<ehi> $$11 = $$0.a(l, ehj.b(ehj.a($$5, $$6, 0.25, $$1.b(ehy.g))));
      jg<ehi> $$12 = $$0.a(m, ehj.b(ehj.a($$5, $$6, 0.25, $$1.b(ehy.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, ehj.a(ehj.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, ehj.d(ehj.a($$1.b(ehy.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qi<ehi> $$0, jh<ehi> $$1, ehi $$2, jg<ehi> $$3, jg<ehi> $$4, alq<ehi> $$5, alq<ehi> $$6, alq<ehi> $$7, alq<ehi> $$8, alq<ehi> $$9, boolean $$10
   ) {
      ehj.w.a $$11 = new ehj.w.a($$3);
      ehj.w.a $$12 = new ehj.w.a($$4);
      ehj.w.a $$13 = new ehj.w.a($$1.b(f));
      ehj.w.a $$14 = new ehj.w.a($$1.b(g));
      ehi $$15 = a($$0, $$5, a(ehj.a(ehj.a(-0.50375F), ehj.a(qx.a($$11, $$12, $$14, $$10))), ehj.c()));
      ehi $$16 = a($$0, $$6, a(ehj.a(qx.a($$11, $$12, $$13, $$14, $$10)), s));
      ehi $$17 = a($$0, $$8, ehj.a(ehj.a(-64, 320, 1.5, -1.5), $$15));
      ehi $$18 = a($$0, $$7, a(ehj.a(qx.b($$11, $$12, $$13, $$14, $$10)), t));
      ehi $$19 = ehj.b($$18, $$2.g());
      ehi $$20 = b($$16, ehj.a($$17, $$19));
      $$0.a($$9, ehj.a($$20, a($$1, y)));
   }

   private static ehi a(qi<ehi> $$0, alq<ehi> $$1, ehi $$2) {
      return new ehj.j($$0.a($$1, $$2));
   }

   private static ehi a(jh<ehi> $$0, alq<ehi> $$1) {
      return new ehj.j($$0.b($$1));
   }

   private static ehi a(ehi $$0) {
      return ehj.b(ehj.a(ehj.a($$0.d(), ehj.a(-0.6666666666666666)).d(), ehj.a(-0.3333333333333333)), ehj.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static ehi b(jh<exd.a> $$0) {
      ehi $$1 = ehj.a($$0.b(ehy.z));
      ehi $$2 = ehj.a($$0.b(ehy.A), 0.0, -0.1);
      return ehj.d(ehj.b($$2, ehj.a($$1.d(), ehj.a(-0.4))));
   }

   private static ehi d(jh<ehi> $$0, jh<exd.a> $$1) {
      ehi $$2 = ehj.d(ehj.b($$1.b(ehy.x), 2.0, 1.0));
      ehi $$3 = ehj.a($$1.b(ehy.y), -0.065, -0.088);
      ehi $$4 = ehj.a($$2, $$1.b(ehy.v), ehj.z.a.a);
      ehi $$5 = ehj.a($$2, $$1.b(ehy.w), ehj.z.a.a);
      ehi $$6 = ehj.a(ehj.d($$4, $$5), $$3).a(-1.0, 1.0);
      ehi $$7 = a($$0, N);
      ehi $$8 = ehj.b($$1.b(ehy.B), 0.75, 0.5);
      ehi $$9 = ehj.a(ehj.a($$8, ehj.a(0.37)), ehj.a(-10, 30, 0.3, 0.0));
      return ehj.d(ehj.c($$9, ehj.a($$7, $$6)));
   }

   private static ehi e(jh<ehi> $$0, jh<exd.a> $$1) {
      ehi $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      ehi $$6 = a($$2, ehj.b($$1.b(ehy.I), 1.0, 1.0), -60, 320, -1);
      ehi $$7 = a($$2, ehj.a($$1.b(ehy.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      ehi $$9 = a($$2, ehj.b($$1.b(ehy.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ehi $$10 = a($$2, ehj.b($$1.b(ehy.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ehi $$11 = ehj.b(ehj.a(1.5), ehj.d($$9.d(), $$10.d()));
      return ehj.a($$6, -1000000.0, 0.0, ehj.a(64.0), ehj.a($$7, $$11));
   }

   private static ehi c(jh<exd.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      ehi $$3 = ehj.b($$0.b(ehy.o), 25.0, 0.3);
      ehi $$4 = ehj.a($$0.b(ehy.p), 0.0, -2.0);
      ehi $$5 = ehj.a($$0.b(ehy.q), 0.0, 1.1);
      ehi $$6 = ehj.a(ehj.b($$3, ehj.a(2.0)), $$4);
      return ehj.d(ehj.b($$6, $$5.f()));
   }

   private static ehi f(jh<ehi> $$0, jh<exd.a> $$1) {
      ehi $$2 = ehj.b($$1.b(ehy.t), 2.0, 1.0);
      ehi $$3 = ehj.a($$2, $$1.b(ehy.r), ehj.z.a.b);
      ehi $$4 = ehj.a($$1.b(ehy.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      ehi $$5 = a($$0, R);
      ehi $$6 = ehj.a($$4, ehj.a(-64, 320, 8.0, -40.0)).d();
      ehi $$7 = ehj.a($$6, $$5).f();
      double $$8 = 0.083;
      ehi $$9 = ehj.a($$3, ehj.b(ehj.a(0.083), $$5));
      return ehj.d($$9, $$7).a(-1.0, 1.0);
   }

   private static ehi a(jh<ehi> $$0, jh<exd.a> $$1, ehi $$2) {
      ehi $$3 = a($$0, S);
      ehi $$4 = a($$0, N);
      ehi $$5 = ehj.a($$1.b(ehy.C), 8.0);
      ehi $$6 = ehj.b(ehj.a(4.0), $$5.e());
      ehi $$7 = ehj.a($$1.b(ehy.D), 0.6666666666666666);
      ehi $$8 = ehj.a(ehj.a(ehj.a(0.27), $$7).a(-1.0, 1.0), ehj.a(ehj.a(1.5), ehj.b(ehj.a(-0.64), $$2)).a(0.0, 0.5));
      ehi $$9 = ehj.a($$6, $$8);
      ehi $$10 = ehj.c(ehj.c($$9, a($$0, O)), ehj.a($$3, $$4));
      ehi $$11 = a($$0, Q);
      ehi $$12 = ehj.a($$11, -1000000.0, 0.03, ehj.a(-1000000.0), $$11);
      return ehj.d($$10, $$12);
   }

   private static ehi b(ehi $$0) {
      ehi $$1 = ehj.f($$0);
      return ehj.b(ehj.a($$1), ehj.a(0.64)).i();
   }

   protected static ehv a(jh<ehi> $$0, jh<exd.a> $$1, boolean $$2, boolean $$3) {
      ehi $$4 = ehj.a($$1.b(ehy.k), 0.5);
      ehi $$5 = ehj.a($$1.b(ehy.l), 0.67);
      ehi $$6 = ehj.a($$1.b(ehy.n), 0.7142857142857143);
      ehi $$7 = ehj.a($$1.b(ehy.m));
      ehi $$8 = a($$0, w);
      ehi $$9 = a($$0, x);
      ehi $$10 = ehj.a($$8, $$9, 0.25, $$1.b($$2 ? ehy.e : ehy.a));
      ehi $$11 = ehj.a($$8, $$9, 0.25, $$1.b($$2 ? ehy.f : ehy.b));
      ehi $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      ehi $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      ehi $$14 = b(ehj.c($$12), $$13);
      ehi $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      ehi $$16 = ehj.c($$15, ehj.b(ehj.a(5.0), a($$0, O)));
      ehi $$17 = ehj.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      ehi $$18 = ehj.c(b(a($$3, $$17)), a($$0, P));
      ehi $$19 = a($$0, v);
      int $$20 = Stream.of(ehz.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-efn.e * 2);
      int $$21 = Stream.of(ehz.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-efn.e * 2);
      ehi $$22 = a($$19, ehj.b($$1.b(ehy.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      ehi $$24 = a($$19, ehj.b($$1.b(ehy.F), 4.0, 4.0), $$20, $$21, 0).d();
      ehi $$25 = a($$19, ehj.b($$1.b(ehy.G), 4.0, 4.0), $$20, $$21, 0).d();
      ehi $$26 = ehj.a(ehj.a(-0.08F), ehj.d($$24, $$25));
      ehi $$27 = ehj.a($$1.b(ehy.H));
      return new ehv(
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
         a($$3, ehj.a($$14, ehj.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ehv b(jh<ehi> $$0, jh<exd.a> $$1, ehi $$2) {
      ehi $$3 = a($$0, w);
      ehi $$4 = a($$0, x);
      ehi $$5 = ehj.a($$3, $$4, 0.25, $$1.b(ehy.a));
      ehi $$6 = ehj.a($$3, $$4, 0.25, $$1.b(ehy.b));
      ehi $$7 = b($$2);
      return new ehv(ehj.a(), ehj.a(), ehj.a(), ehj.a(), $$5, $$6, ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), $$7, ehj.a(), ehj.a(), ehj.a());
   }

   private static ehi a(boolean $$0, ehi $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static ehi a(jh<ehi> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static ehi a(ehi $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ehv a(jh<ehi> $$0, jh<exd.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ehv b(jh<ehi> $$0, jh<exd.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ehv c(jh<ehi> $$0, jh<exd.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static ehi c(ehi $$0) {
      return a($$0, 0, 128);
   }

   protected static ehv a(jh<ehi> $$0) {
      ehi $$1 = ehj.c(ehj.a(0L));
      ehi $$2 = b(c(a($$0, M)));
      return new ehv(
         ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), $$1, ehj.a(), ehj.a(), c(ehj.a($$1, ehj.a(-0.703125))), $$2, ehj.a(), ehj.a(), ehj.a()
      );
   }

   protected static ehv a() {
      return new ehv(ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a(), ehj.a());
   }

   private static ehi a(ehi $$0, ehi $$1) {
      ehi $$2 = ehj.a(ehj.b(), $$1, $$0);
      return ehj.b(ehj.c($$2));
   }

   private static ehi b(ehi $$0, ehi $$1) {
      ehi $$2 = ehj.b($$1, $$0);
      return ehj.b(ehj.a(4.0), $$2.h());
   }

   private static ehi a(ehi $$0, ehi $$1, int $$2, int $$3, int $$4) {
      return ehj.a(ehj.a($$0, (double)$$2, (double)($$3 + 1), $$1, ehj.a((double)$$4)));
   }

   private static ehi a(ehi $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      ehi $$10 = ehj.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      ehi $$9 = ehj.a($$10, $$5, $$0);
      ehi $$11 = ehj.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return ehj.a($$11, $$8, $$9);
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
