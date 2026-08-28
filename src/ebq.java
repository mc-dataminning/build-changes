import java.util.stream.Stream;

public class ebq {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final ebc s = ebd.a(10.0);
   private static final ebc t = ebd.a();
   private static final alk<ebc> u = a("zero");
   private static final alk<ebc> v = a("y");
   private static final alk<ebc> w = a("shift_x");
   private static final alk<ebc> x = a("shift_z");
   private static final alk<ebc> y = a("overworld/base_3d_noise");
   private static final alk<ebc> z = a("nether/base_3d_noise");
   private static final alk<ebc> A = a("end/base_3d_noise");
   public static final alk<ebc> d = a("overworld/continents");
   public static final alk<ebc> e = a("overworld/erosion");
   public static final alk<ebc> f = a("overworld/ridges");
   public static final alk<ebc> g = a("overworld/ridges_folded");
   public static final alk<ebc> h = a("overworld/offset");
   public static final alk<ebc> i = a("overworld/factor");
   public static final alk<ebc> j = a("overworld/jaggedness");
   public static final alk<ebc> k = a("overworld/depth");
   private static final alk<ebc> B = a("overworld/sloped_cheese");
   public static final alk<ebc> l = a("overworld_large_biomes/continents");
   public static final alk<ebc> m = a("overworld_large_biomes/erosion");
   private static final alk<ebc> C = a("overworld_large_biomes/offset");
   private static final alk<ebc> D = a("overworld_large_biomes/factor");
   private static final alk<ebc> E = a("overworld_large_biomes/jaggedness");
   private static final alk<ebc> F = a("overworld_large_biomes/depth");
   private static final alk<ebc> G = a("overworld_large_biomes/sloped_cheese");
   private static final alk<ebc> H = a("overworld_amplified/offset");
   private static final alk<ebc> I = a("overworld_amplified/factor");
   private static final alk<ebc> J = a("overworld_amplified/jaggedness");
   private static final alk<ebc> K = a("overworld_amplified/depth");
   private static final alk<ebc> L = a("overworld_amplified/sloped_cheese");
   private static final alk<ebc> M = a("end/sloped_cheese");
   private static final alk<ebc> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alk<ebc> O = a("overworld/caves/entrances");
   private static final alk<ebc> P = a("overworld/caves/noodle");
   private static final alk<ebc> Q = a("overworld/caves/pillars");
   private static final alk<ebc> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alk<ebc> S = a("overworld/caves/spaghetti_2d");

   private static alk<ebc> a(String $$0) {
      return alk.a(ma.aK, all.b($$0));
   }

   public static jq<? extends ebc> a(rb<ebc> $$0) {
      jr<eqr.a> $$1 = $$0.a(ma.aQ);
      jr<ebc> $$2 = $$0.a(ma.aK);
      $$0.a(u, ebd.a());
      int $$3 = dzj.e * 2;
      int $$4 = dzj.d * 2;
      $$0.a(v, ebd.a($$3, $$4, (double)$$3, (double)$$4));
      ebc $$5 = a($$0, w, ebd.b(ebd.c(ebd.b($$1.b(ebs.j)))));
      ebc $$6 = a($$0, x, ebd.b(ebd.c(ebd.c($$1.b(ebs.j)))));
      $$0.a(y, eqo.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, eqo.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, eqo.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jq<ebc> $$7 = $$0.a(d, ebd.b(ebd.a($$5, $$6, 0.25, $$1.b(ebs.c))));
      jq<ebc> $$8 = $$0.a(e, ebd.b(ebd.a($$5, $$6, 0.25, $$1.b(ebs.d))));
      ebc $$9 = a($$0, f, ebd.b(ebd.a($$5, $$6, 0.25, $$1.b(ebs.i))));
      $$0.a(g, a($$9));
      ebc $$10 = ebd.b($$1.b(ebs.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jq<ebc> $$11 = $$0.a(l, ebd.b(ebd.a($$5, $$6, 0.25, $$1.b(ebs.g))));
      jq<ebc> $$12 = $$0.a(m, ebd.b(ebd.a($$5, $$6, 0.25, $$1.b(ebs.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, ebd.a(ebd.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, ebd.d(ebd.a($$1.b(ebs.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      rb<ebc> $$0, jr<ebc> $$1, ebc $$2, jq<ebc> $$3, jq<ebc> $$4, alk<ebc> $$5, alk<ebc> $$6, alk<ebc> $$7, alk<ebc> $$8, alk<ebc> $$9, boolean $$10
   ) {
      ebd.w.a $$11 = new ebd.w.a($$3);
      ebd.w.a $$12 = new ebd.w.a($$4);
      ebd.w.a $$13 = new ebd.w.a($$1.b(f));
      ebd.w.a $$14 = new ebd.w.a($$1.b(g));
      ebc $$15 = a($$0, $$5, a(ebd.a(ebd.a(-0.50375F), ebd.a(rq.a($$11, $$12, $$14, $$10))), ebd.c()));
      ebc $$16 = a($$0, $$6, a(ebd.a(rq.a($$11, $$12, $$13, $$14, $$10)), s));
      ebc $$17 = a($$0, $$8, ebd.a(ebd.a(-64, 320, 1.5, -1.5), $$15));
      ebc $$18 = a($$0, $$7, a(ebd.a(rq.b($$11, $$12, $$13, $$14, $$10)), t));
      ebc $$19 = ebd.b($$18, $$2.g());
      ebc $$20 = b($$16, ebd.a($$17, $$19));
      $$0.a($$9, ebd.a($$20, a($$1, y)));
   }

   private static ebc a(rb<ebc> $$0, alk<ebc> $$1, ebc $$2) {
      return new ebd.j($$0.a($$1, $$2));
   }

   private static ebc a(jr<ebc> $$0, alk<ebc> $$1) {
      return new ebd.j($$0.b($$1));
   }

   private static ebc a(ebc $$0) {
      return ebd.b(ebd.a(ebd.a($$0.d(), ebd.a(-0.6666666666666666)).d(), ebd.a(-0.3333333333333333)), ebd.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static ebc b(jr<eqr.a> $$0) {
      ebc $$1 = ebd.a($$0.b(ebs.z));
      ebc $$2 = ebd.a($$0.b(ebs.A), 0.0, -0.1);
      return ebd.d(ebd.b($$2, ebd.a($$1.d(), ebd.a(-0.4))));
   }

   private static ebc d(jr<ebc> $$0, jr<eqr.a> $$1) {
      ebc $$2 = ebd.d(ebd.b($$1.b(ebs.x), 2.0, 1.0));
      ebc $$3 = ebd.a($$1.b(ebs.y), -0.065, -0.088);
      ebc $$4 = ebd.a($$2, $$1.b(ebs.v), ebd.z.a.a);
      ebc $$5 = ebd.a($$2, $$1.b(ebs.w), ebd.z.a.a);
      ebc $$6 = ebd.a(ebd.d($$4, $$5), $$3).a(-1.0, 1.0);
      ebc $$7 = a($$0, N);
      ebc $$8 = ebd.b($$1.b(ebs.B), 0.75, 0.5);
      ebc $$9 = ebd.a(ebd.a($$8, ebd.a(0.37)), ebd.a(-10, 30, 0.3, 0.0));
      return ebd.d(ebd.c($$9, ebd.a($$7, $$6)));
   }

   private static ebc e(jr<ebc> $$0, jr<eqr.a> $$1) {
      ebc $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      ebc $$6 = a($$2, ebd.b($$1.b(ebs.I), 1.0, 1.0), -60, 320, -1);
      ebc $$7 = a($$2, ebd.a($$1.b(ebs.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      ebc $$9 = a($$2, ebd.b($$1.b(ebs.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ebc $$10 = a($$2, ebd.b($$1.b(ebs.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ebc $$11 = ebd.b(ebd.a(1.5), ebd.d($$9.d(), $$10.d()));
      return ebd.a($$6, -1000000.0, 0.0, ebd.a(64.0), ebd.a($$7, $$11));
   }

   private static ebc c(jr<eqr.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      ebc $$3 = ebd.b($$0.b(ebs.o), 25.0, 0.3);
      ebc $$4 = ebd.a($$0.b(ebs.p), 0.0, -2.0);
      ebc $$5 = ebd.a($$0.b(ebs.q), 0.0, 1.1);
      ebc $$6 = ebd.a(ebd.b($$3, ebd.a(2.0)), $$4);
      return ebd.d(ebd.b($$6, $$5.f()));
   }

   private static ebc f(jr<ebc> $$0, jr<eqr.a> $$1) {
      ebc $$2 = ebd.b($$1.b(ebs.t), 2.0, 1.0);
      ebc $$3 = ebd.a($$2, $$1.b(ebs.r), ebd.z.a.b);
      ebc $$4 = ebd.a($$1.b(ebs.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      ebc $$5 = a($$0, R);
      ebc $$6 = ebd.a($$4, ebd.a(-64, 320, 8.0, -40.0)).d();
      ebc $$7 = ebd.a($$6, $$5).f();
      double $$8 = 0.083;
      ebc $$9 = ebd.a($$3, ebd.b(ebd.a(0.083), $$5));
      return ebd.d($$9, $$7).a(-1.0, 1.0);
   }

   private static ebc a(jr<ebc> $$0, jr<eqr.a> $$1, ebc $$2) {
      ebc $$3 = a($$0, S);
      ebc $$4 = a($$0, N);
      ebc $$5 = ebd.a($$1.b(ebs.C), 8.0);
      ebc $$6 = ebd.b(ebd.a(4.0), $$5.e());
      ebc $$7 = ebd.a($$1.b(ebs.D), 0.6666666666666666);
      ebc $$8 = ebd.a(ebd.a(ebd.a(0.27), $$7).a(-1.0, 1.0), ebd.a(ebd.a(1.5), ebd.b(ebd.a(-0.64), $$2)).a(0.0, 0.5));
      ebc $$9 = ebd.a($$6, $$8);
      ebc $$10 = ebd.c(ebd.c($$9, a($$0, O)), ebd.a($$3, $$4));
      ebc $$11 = a($$0, Q);
      ebc $$12 = ebd.a($$11, -1000000.0, 0.03, ebd.a(-1000000.0), $$11);
      return ebd.d($$10, $$12);
   }

   private static ebc b(ebc $$0) {
      ebc $$1 = ebd.f($$0);
      return ebd.b(ebd.a($$1), ebd.a(0.64)).i();
   }

   protected static ebp a(jr<ebc> $$0, jr<eqr.a> $$1, boolean $$2, boolean $$3) {
      ebc $$4 = ebd.a($$1.b(ebs.k), 0.5);
      ebc $$5 = ebd.a($$1.b(ebs.l), 0.67);
      ebc $$6 = ebd.a($$1.b(ebs.n), 0.7142857142857143);
      ebc $$7 = ebd.a($$1.b(ebs.m));
      ebc $$8 = a($$0, w);
      ebc $$9 = a($$0, x);
      ebc $$10 = ebd.a($$8, $$9, 0.25, $$1.b($$2 ? ebs.e : ebs.a));
      ebc $$11 = ebd.a($$8, $$9, 0.25, $$1.b($$2 ? ebs.f : ebs.b));
      ebc $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      ebc $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      ebc $$14 = b(ebd.c($$12), $$13);
      ebc $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      ebc $$16 = ebd.c($$15, ebd.b(ebd.a(5.0), a($$0, O)));
      ebc $$17 = ebd.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      ebc $$18 = ebd.c(b(a($$3, $$17)), a($$0, P));
      ebc $$19 = a($$0, v);
      int $$20 = Stream.of(ebt.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dzj.e * 2);
      int $$21 = Stream.of(ebt.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dzj.e * 2);
      ebc $$22 = a($$19, ebd.b($$1.b(ebs.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      ebc $$24 = a($$19, ebd.b($$1.b(ebs.F), 4.0, 4.0), $$20, $$21, 0).d();
      ebc $$25 = a($$19, ebd.b($$1.b(ebs.G), 4.0, 4.0), $$20, $$21, 0).d();
      ebc $$26 = ebd.a(ebd.a(-0.08F), ebd.d($$24, $$25));
      ebc $$27 = ebd.a($$1.b(ebs.H));
      return new ebp(
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
         a($$3, ebd.a($$14, ebd.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ebp b(jr<ebc> $$0, jr<eqr.a> $$1, ebc $$2) {
      ebc $$3 = a($$0, w);
      ebc $$4 = a($$0, x);
      ebc $$5 = ebd.a($$3, $$4, 0.25, $$1.b(ebs.a));
      ebc $$6 = ebd.a($$3, $$4, 0.25, $$1.b(ebs.b));
      ebc $$7 = b($$2);
      return new ebp(ebd.a(), ebd.a(), ebd.a(), ebd.a(), $$5, $$6, ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), $$7, ebd.a(), ebd.a(), ebd.a());
   }

   private static ebc a(boolean $$0, ebc $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static ebc a(jr<ebc> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static ebc a(ebc $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ebp a(jr<ebc> $$0, jr<eqr.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ebp b(jr<ebc> $$0, jr<eqr.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ebp c(jr<ebc> $$0, jr<eqr.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static ebc c(ebc $$0) {
      return a($$0, 0, 128);
   }

   protected static ebp a(jr<ebc> $$0) {
      ebc $$1 = ebd.c(ebd.a(0L));
      ebc $$2 = b(c(a($$0, M)));
      return new ebp(
         ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), $$1, ebd.a(), ebd.a(), c(ebd.a($$1, ebd.a(-0.703125))), $$2, ebd.a(), ebd.a(), ebd.a()
      );
   }

   protected static ebp a() {
      return new ebp(ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a(), ebd.a());
   }

   private static ebc a(ebc $$0, ebc $$1) {
      ebc $$2 = ebd.a(ebd.b(), $$1, $$0);
      return ebd.b(ebd.c($$2));
   }

   private static ebc b(ebc $$0, ebc $$1) {
      ebc $$2 = ebd.b($$1, $$0);
      return ebd.b(ebd.a(4.0), $$2.h());
   }

   private static ebc a(ebc $$0, ebc $$1, int $$2, int $$3, int $$4) {
      return ebd.a(ebd.a($$0, (double)$$2, (double)($$3 + 1), $$1, ebd.a((double)$$4)));
   }

   private static ebc a(ebc $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      ebc $$10 = ebd.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      ebc $$9 = ebd.a($$10, $$5, $$0);
      ebc $$11 = ebd.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return ebd.a($$11, $$8, $$9);
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
