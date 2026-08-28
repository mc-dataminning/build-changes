import java.util.stream.Stream;

public class eav {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final eah s = eai.a(10.0);
   private static final eah t = eai.a();
   private static final ald<eah> u = a("zero");
   private static final ald<eah> v = a("y");
   private static final ald<eah> w = a("shift_x");
   private static final ald<eah> x = a("shift_z");
   private static final ald<eah> y = a("overworld/base_3d_noise");
   private static final ald<eah> z = a("nether/base_3d_noise");
   private static final ald<eah> A = a("end/base_3d_noise");
   public static final ald<eah> d = a("overworld/continents");
   public static final ald<eah> e = a("overworld/erosion");
   public static final ald<eah> f = a("overworld/ridges");
   public static final ald<eah> g = a("overworld/ridges_folded");
   public static final ald<eah> h = a("overworld/offset");
   public static final ald<eah> i = a("overworld/factor");
   public static final ald<eah> j = a("overworld/jaggedness");
   public static final ald<eah> k = a("overworld/depth");
   private static final ald<eah> B = a("overworld/sloped_cheese");
   public static final ald<eah> l = a("overworld_large_biomes/continents");
   public static final ald<eah> m = a("overworld_large_biomes/erosion");
   private static final ald<eah> C = a("overworld_large_biomes/offset");
   private static final ald<eah> D = a("overworld_large_biomes/factor");
   private static final ald<eah> E = a("overworld_large_biomes/jaggedness");
   private static final ald<eah> F = a("overworld_large_biomes/depth");
   private static final ald<eah> G = a("overworld_large_biomes/sloped_cheese");
   private static final ald<eah> H = a("overworld_amplified/offset");
   private static final ald<eah> I = a("overworld_amplified/factor");
   private static final ald<eah> J = a("overworld_amplified/jaggedness");
   private static final ald<eah> K = a("overworld_amplified/depth");
   private static final ald<eah> L = a("overworld_amplified/sloped_cheese");
   private static final ald<eah> M = a("end/sloped_cheese");
   private static final ald<eah> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ald<eah> O = a("overworld/caves/entrances");
   private static final ald<eah> P = a("overworld/caves/noodle");
   private static final ald<eah> Q = a("overworld/caves/pillars");
   private static final ald<eah> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ald<eah> S = a("overworld/caves/spaghetti_2d");

   private static ald<eah> a(String $$0) {
      return ald.a(lw.aL, ale.b($$0));
   }

   public static jo<? extends eah> a(qu<eah> $$0) {
      jp<epw.a> $$1 = $$0.a(lw.aR);
      jp<eah> $$2 = $$0.a(lw.aL);
      $$0.a(u, eai.a());
      int $$3 = dyo.e * 2;
      int $$4 = dyo.d * 2;
      $$0.a(v, eai.a($$3, $$4, (double)$$3, (double)$$4));
      eah $$5 = a($$0, w, eai.b(eai.c(eai.b($$1.b(eax.j)))));
      eah $$6 = a($$0, x, eai.b(eai.c(eai.c($$1.b(eax.j)))));
      $$0.a(y, ept.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ept.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ept.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jo<eah> $$7 = $$0.a(d, eai.b(eai.a($$5, $$6, 0.25, $$1.b(eax.c))));
      jo<eah> $$8 = $$0.a(e, eai.b(eai.a($$5, $$6, 0.25, $$1.b(eax.d))));
      eah $$9 = a($$0, f, eai.b(eai.a($$5, $$6, 0.25, $$1.b(eax.i))));
      $$0.a(g, a($$9));
      eah $$10 = eai.b($$1.b(eax.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jo<eah> $$11 = $$0.a(l, eai.b(eai.a($$5, $$6, 0.25, $$1.b(eax.g))));
      jo<eah> $$12 = $$0.a(m, eai.b(eai.a($$5, $$6, 0.25, $$1.b(eax.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, eai.a(eai.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, eai.d(eai.a($$1.b(eax.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qu<eah> $$0, jp<eah> $$1, eah $$2, jo<eah> $$3, jo<eah> $$4, ald<eah> $$5, ald<eah> $$6, ald<eah> $$7, ald<eah> $$8, ald<eah> $$9, boolean $$10
   ) {
      eai.w.a $$11 = new eai.w.a($$3);
      eai.w.a $$12 = new eai.w.a($$4);
      eai.w.a $$13 = new eai.w.a($$1.b(f));
      eai.w.a $$14 = new eai.w.a($$1.b(g));
      eah $$15 = a($$0, $$5, a(eai.a(eai.a(-0.50375F), eai.a(rj.a($$11, $$12, $$14, $$10))), eai.c()));
      eah $$16 = a($$0, $$6, a(eai.a(rj.a($$11, $$12, $$13, $$14, $$10)), s));
      eah $$17 = a($$0, $$8, eai.a(eai.a(-64, 320, 1.5, -1.5), $$15));
      eah $$18 = a($$0, $$7, a(eai.a(rj.b($$11, $$12, $$13, $$14, $$10)), t));
      eah $$19 = eai.b($$18, $$2.g());
      eah $$20 = b($$16, eai.a($$17, $$19));
      $$0.a($$9, eai.a($$20, a($$1, y)));
   }

   private static eah a(qu<eah> $$0, ald<eah> $$1, eah $$2) {
      return new eai.j($$0.a($$1, $$2));
   }

   private static eah a(jp<eah> $$0, ald<eah> $$1) {
      return new eai.j($$0.b($$1));
   }

   private static eah a(eah $$0) {
      return eai.b(eai.a(eai.a($$0.d(), eai.a(-0.6666666666666666)).d(), eai.a(-0.3333333333333333)), eai.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static eah b(jp<epw.a> $$0) {
      eah $$1 = eai.a($$0.b(eax.z));
      eah $$2 = eai.a($$0.b(eax.A), 0.0, -0.1);
      return eai.d(eai.b($$2, eai.a($$1.d(), eai.a(-0.4))));
   }

   private static eah d(jp<eah> $$0, jp<epw.a> $$1) {
      eah $$2 = eai.d(eai.b($$1.b(eax.x), 2.0, 1.0));
      eah $$3 = eai.a($$1.b(eax.y), -0.065, -0.088);
      eah $$4 = eai.a($$2, $$1.b(eax.v), eai.z.a.a);
      eah $$5 = eai.a($$2, $$1.b(eax.w), eai.z.a.a);
      eah $$6 = eai.a(eai.d($$4, $$5), $$3).a(-1.0, 1.0);
      eah $$7 = a($$0, N);
      eah $$8 = eai.b($$1.b(eax.B), 0.75, 0.5);
      eah $$9 = eai.a(eai.a($$8, eai.a(0.37)), eai.a(-10, 30, 0.3, 0.0));
      return eai.d(eai.c($$9, eai.a($$7, $$6)));
   }

   private static eah e(jp<eah> $$0, jp<epw.a> $$1) {
      eah $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      eah $$6 = a($$2, eai.b($$1.b(eax.I), 1.0, 1.0), -60, 320, -1);
      eah $$7 = a($$2, eai.a($$1.b(eax.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      eah $$9 = a($$2, eai.b($$1.b(eax.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      eah $$10 = a($$2, eai.b($$1.b(eax.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      eah $$11 = eai.b(eai.a(1.5), eai.d($$9.d(), $$10.d()));
      return eai.a($$6, -1000000.0, 0.0, eai.a(64.0), eai.a($$7, $$11));
   }

   private static eah c(jp<epw.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      eah $$3 = eai.b($$0.b(eax.o), 25.0, 0.3);
      eah $$4 = eai.a($$0.b(eax.p), 0.0, -2.0);
      eah $$5 = eai.a($$0.b(eax.q), 0.0, 1.1);
      eah $$6 = eai.a(eai.b($$3, eai.a(2.0)), $$4);
      return eai.d(eai.b($$6, $$5.f()));
   }

   private static eah f(jp<eah> $$0, jp<epw.a> $$1) {
      eah $$2 = eai.b($$1.b(eax.t), 2.0, 1.0);
      eah $$3 = eai.a($$2, $$1.b(eax.r), eai.z.a.b);
      eah $$4 = eai.a($$1.b(eax.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      eah $$5 = a($$0, R);
      eah $$6 = eai.a($$4, eai.a(-64, 320, 8.0, -40.0)).d();
      eah $$7 = eai.a($$6, $$5).f();
      double $$8 = 0.083;
      eah $$9 = eai.a($$3, eai.b(eai.a(0.083), $$5));
      return eai.d($$9, $$7).a(-1.0, 1.0);
   }

   private static eah a(jp<eah> $$0, jp<epw.a> $$1, eah $$2) {
      eah $$3 = a($$0, S);
      eah $$4 = a($$0, N);
      eah $$5 = eai.a($$1.b(eax.C), 8.0);
      eah $$6 = eai.b(eai.a(4.0), $$5.e());
      eah $$7 = eai.a($$1.b(eax.D), 0.6666666666666666);
      eah $$8 = eai.a(eai.a(eai.a(0.27), $$7).a(-1.0, 1.0), eai.a(eai.a(1.5), eai.b(eai.a(-0.64), $$2)).a(0.0, 0.5));
      eah $$9 = eai.a($$6, $$8);
      eah $$10 = eai.c(eai.c($$9, a($$0, O)), eai.a($$3, $$4));
      eah $$11 = a($$0, Q);
      eah $$12 = eai.a($$11, -1000000.0, 0.03, eai.a(-1000000.0), $$11);
      return eai.d($$10, $$12);
   }

   private static eah b(eah $$0) {
      eah $$1 = eai.f($$0);
      return eai.b(eai.a($$1), eai.a(0.64)).i();
   }

   protected static eau a(jp<eah> $$0, jp<epw.a> $$1, boolean $$2, boolean $$3) {
      eah $$4 = eai.a($$1.b(eax.k), 0.5);
      eah $$5 = eai.a($$1.b(eax.l), 0.67);
      eah $$6 = eai.a($$1.b(eax.n), 0.7142857142857143);
      eah $$7 = eai.a($$1.b(eax.m));
      eah $$8 = a($$0, w);
      eah $$9 = a($$0, x);
      eah $$10 = eai.a($$8, $$9, 0.25, $$1.b($$2 ? eax.e : eax.a));
      eah $$11 = eai.a($$8, $$9, 0.25, $$1.b($$2 ? eax.f : eax.b));
      eah $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      eah $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      eah $$14 = b(eai.c($$12), $$13);
      eah $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      eah $$16 = eai.c($$15, eai.b(eai.a(5.0), a($$0, O)));
      eah $$17 = eai.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      eah $$18 = eai.c(b(a($$3, $$17)), a($$0, P));
      eah $$19 = a($$0, v);
      int $$20 = Stream.of(eay.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dyo.e * 2);
      int $$21 = Stream.of(eay.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dyo.e * 2);
      eah $$22 = a($$19, eai.b($$1.b(eax.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      eah $$24 = a($$19, eai.b($$1.b(eax.F), 4.0, 4.0), $$20, $$21, 0).d();
      eah $$25 = a($$19, eai.b($$1.b(eax.G), 4.0, 4.0), $$20, $$21, 0).d();
      eah $$26 = eai.a(eai.a(-0.08F), eai.d($$24, $$25));
      eah $$27 = eai.a($$1.b(eax.H));
      return new eau(
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
         a($$3, eai.a($$14, eai.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static eau b(jp<eah> $$0, jp<epw.a> $$1, eah $$2) {
      eah $$3 = a($$0, w);
      eah $$4 = a($$0, x);
      eah $$5 = eai.a($$3, $$4, 0.25, $$1.b(eax.a));
      eah $$6 = eai.a($$3, $$4, 0.25, $$1.b(eax.b));
      eah $$7 = b($$2);
      return new eau(eai.a(), eai.a(), eai.a(), eai.a(), $$5, $$6, eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), $$7, eai.a(), eai.a(), eai.a());
   }

   private static eah a(boolean $$0, eah $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static eah a(jp<eah> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static eah a(eah $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static eau a(jp<eah> $$0, jp<epw.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static eau b(jp<eah> $$0, jp<epw.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static eau c(jp<eah> $$0, jp<epw.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static eah c(eah $$0) {
      return a($$0, 0, 128);
   }

   protected static eau a(jp<eah> $$0) {
      eah $$1 = eai.c(eai.a(0L));
      eah $$2 = b(c(a($$0, M)));
      return new eau(
         eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), $$1, eai.a(), eai.a(), c(eai.a($$1, eai.a(-0.703125))), $$2, eai.a(), eai.a(), eai.a()
      );
   }

   protected static eau a() {
      return new eau(eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), eai.a(), eai.a());
   }

   private static eah a(eah $$0, eah $$1) {
      eah $$2 = eai.a(eai.b(), $$1, $$0);
      return eai.b(eai.c($$2));
   }

   private static eah b(eah $$0, eah $$1) {
      eah $$2 = eai.b($$1, $$0);
      return eai.b(eai.a(4.0), $$2.h());
   }

   private static eah a(eah $$0, eah $$1, int $$2, int $$3, int $$4) {
      return eai.a(eai.a($$0, (double)$$2, (double)($$3 + 1), $$1, eai.a((double)$$4)));
   }

   private static eah a(eah $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      eah $$10 = eai.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      eah $$9 = eai.a($$10, $$5, $$0);
      eah $$11 = eai.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return eai.a($$11, $$8, $$9);
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
