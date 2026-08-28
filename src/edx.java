import java.util.stream.Stream;

public class edx {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final edj s = edk.a(10.0);
   private static final edj t = edk.a();
   private static final aly<edj> u = a("zero");
   private static final aly<edj> v = a("y");
   private static final aly<edj> w = a("shift_x");
   private static final aly<edj> x = a("shift_z");
   private static final aly<edj> y = a("overworld/base_3d_noise");
   private static final aly<edj> z = a("nether/base_3d_noise");
   private static final aly<edj> A = a("end/base_3d_noise");
   public static final aly<edj> d = a("overworld/continents");
   public static final aly<edj> e = a("overworld/erosion");
   public static final aly<edj> f = a("overworld/ridges");
   public static final aly<edj> g = a("overworld/ridges_folded");
   public static final aly<edj> h = a("overworld/offset");
   public static final aly<edj> i = a("overworld/factor");
   public static final aly<edj> j = a("overworld/jaggedness");
   public static final aly<edj> k = a("overworld/depth");
   private static final aly<edj> B = a("overworld/sloped_cheese");
   public static final aly<edj> l = a("overworld_large_biomes/continents");
   public static final aly<edj> m = a("overworld_large_biomes/erosion");
   private static final aly<edj> C = a("overworld_large_biomes/offset");
   private static final aly<edj> D = a("overworld_large_biomes/factor");
   private static final aly<edj> E = a("overworld_large_biomes/jaggedness");
   private static final aly<edj> F = a("overworld_large_biomes/depth");
   private static final aly<edj> G = a("overworld_large_biomes/sloped_cheese");
   private static final aly<edj> H = a("overworld_amplified/offset");
   private static final aly<edj> I = a("overworld_amplified/factor");
   private static final aly<edj> J = a("overworld_amplified/jaggedness");
   private static final aly<edj> K = a("overworld_amplified/depth");
   private static final aly<edj> L = a("overworld_amplified/sloped_cheese");
   private static final aly<edj> M = a("end/sloped_cheese");
   private static final aly<edj> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aly<edj> O = a("overworld/caves/entrances");
   private static final aly<edj> P = a("overworld/caves/noodle");
   private static final aly<edj> Q = a("overworld/caves/pillars");
   private static final aly<edj> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aly<edj> S = a("overworld/caves/spaghetti_2d");

   private static aly<edj> a(String $$0) {
      return aly.a(mb.aM, alz.b($$0));
   }

   public static jq<? extends edj> a(rk<edj> $$0) {
      jr<eta.a> $$1 = $$0.a(mb.aS);
      jr<edj> $$2 = $$0.a(mb.aM);
      $$0.a(u, edk.a());
      int $$3 = ebq.e * 2;
      int $$4 = ebq.d * 2;
      $$0.a(v, edk.a($$3, $$4, (double)$$3, (double)$$4));
      edj $$5 = a($$0, w, edk.b(edk.c(edk.b($$1.b(edz.j)))));
      edj $$6 = a($$0, x, edk.b(edk.c(edk.c($$1.b(edz.j)))));
      $$0.a(y, esx.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, esx.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, esx.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jq<edj> $$7 = $$0.a(d, edk.b(edk.a($$5, $$6, 0.25, $$1.b(edz.c))));
      jq<edj> $$8 = $$0.a(e, edk.b(edk.a($$5, $$6, 0.25, $$1.b(edz.d))));
      edj $$9 = a($$0, f, edk.b(edk.a($$5, $$6, 0.25, $$1.b(edz.i))));
      $$0.a(g, a($$9));
      edj $$10 = edk.b($$1.b(edz.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jq<edj> $$11 = $$0.a(l, edk.b(edk.a($$5, $$6, 0.25, $$1.b(edz.g))));
      jq<edj> $$12 = $$0.a(m, edk.b(edk.a($$5, $$6, 0.25, $$1.b(edz.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, edk.a(edk.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, edk.d(edk.a($$1.b(edz.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      rk<edj> $$0, jr<edj> $$1, edj $$2, jq<edj> $$3, jq<edj> $$4, aly<edj> $$5, aly<edj> $$6, aly<edj> $$7, aly<edj> $$8, aly<edj> $$9, boolean $$10
   ) {
      edk.w.a $$11 = new edk.w.a($$3);
      edk.w.a $$12 = new edk.w.a($$4);
      edk.w.a $$13 = new edk.w.a($$1.b(f));
      edk.w.a $$14 = new edk.w.a($$1.b(g));
      edj $$15 = a($$0, $$5, a(edk.a(edk.a(-0.50375F), edk.a(rz.a($$11, $$12, $$14, $$10))), edk.c()));
      edj $$16 = a($$0, $$6, a(edk.a(rz.a($$11, $$12, $$13, $$14, $$10)), s));
      edj $$17 = a($$0, $$8, edk.a(edk.a(-64, 320, 1.5, -1.5), $$15));
      edj $$18 = a($$0, $$7, a(edk.a(rz.b($$11, $$12, $$13, $$14, $$10)), t));
      edj $$19 = edk.b($$18, $$2.g());
      edj $$20 = b($$16, edk.a($$17, $$19));
      $$0.a($$9, edk.a($$20, a($$1, y)));
   }

   private static edj a(rk<edj> $$0, aly<edj> $$1, edj $$2) {
      return new edk.j($$0.a($$1, $$2));
   }

   private static edj a(jr<edj> $$0, aly<edj> $$1) {
      return new edk.j($$0.b($$1));
   }

   private static edj a(edj $$0) {
      return edk.b(edk.a(edk.a($$0.d(), edk.a(-0.6666666666666666)).d(), edk.a(-0.3333333333333333)), edk.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static edj b(jr<eta.a> $$0) {
      edj $$1 = edk.a($$0.b(edz.z));
      edj $$2 = edk.a($$0.b(edz.A), 0.0, -0.1);
      return edk.d(edk.b($$2, edk.a($$1.d(), edk.a(-0.4))));
   }

   private static edj d(jr<edj> $$0, jr<eta.a> $$1) {
      edj $$2 = edk.d(edk.b($$1.b(edz.x), 2.0, 1.0));
      edj $$3 = edk.a($$1.b(edz.y), -0.065, -0.088);
      edj $$4 = edk.a($$2, $$1.b(edz.v), edk.z.a.a);
      edj $$5 = edk.a($$2, $$1.b(edz.w), edk.z.a.a);
      edj $$6 = edk.a(edk.d($$4, $$5), $$3).a(-1.0, 1.0);
      edj $$7 = a($$0, N);
      edj $$8 = edk.b($$1.b(edz.B), 0.75, 0.5);
      edj $$9 = edk.a(edk.a($$8, edk.a(0.37)), edk.a(-10, 30, 0.3, 0.0));
      return edk.d(edk.c($$9, edk.a($$7, $$6)));
   }

   private static edj e(jr<edj> $$0, jr<eta.a> $$1) {
      edj $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      edj $$6 = a($$2, edk.b($$1.b(edz.I), 1.0, 1.0), -60, 320, -1);
      edj $$7 = a($$2, edk.a($$1.b(edz.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      edj $$9 = a($$2, edk.b($$1.b(edz.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      edj $$10 = a($$2, edk.b($$1.b(edz.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      edj $$11 = edk.b(edk.a(1.5), edk.d($$9.d(), $$10.d()));
      return edk.a($$6, -1000000.0, 0.0, edk.a(64.0), edk.a($$7, $$11));
   }

   private static edj c(jr<eta.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      edj $$3 = edk.b($$0.b(edz.o), 25.0, 0.3);
      edj $$4 = edk.a($$0.b(edz.p), 0.0, -2.0);
      edj $$5 = edk.a($$0.b(edz.q), 0.0, 1.1);
      edj $$6 = edk.a(edk.b($$3, edk.a(2.0)), $$4);
      return edk.d(edk.b($$6, $$5.f()));
   }

   private static edj f(jr<edj> $$0, jr<eta.a> $$1) {
      edj $$2 = edk.b($$1.b(edz.t), 2.0, 1.0);
      edj $$3 = edk.a($$2, $$1.b(edz.r), edk.z.a.b);
      edj $$4 = edk.a($$1.b(edz.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      edj $$5 = a($$0, R);
      edj $$6 = edk.a($$4, edk.a(-64, 320, 8.0, -40.0)).d();
      edj $$7 = edk.a($$6, $$5).f();
      double $$8 = 0.083;
      edj $$9 = edk.a($$3, edk.b(edk.a(0.083), $$5));
      return edk.d($$9, $$7).a(-1.0, 1.0);
   }

   private static edj a(jr<edj> $$0, jr<eta.a> $$1, edj $$2) {
      edj $$3 = a($$0, S);
      edj $$4 = a($$0, N);
      edj $$5 = edk.a($$1.b(edz.C), 8.0);
      edj $$6 = edk.b(edk.a(4.0), $$5.e());
      edj $$7 = edk.a($$1.b(edz.D), 0.6666666666666666);
      edj $$8 = edk.a(edk.a(edk.a(0.27), $$7).a(-1.0, 1.0), edk.a(edk.a(1.5), edk.b(edk.a(-0.64), $$2)).a(0.0, 0.5));
      edj $$9 = edk.a($$6, $$8);
      edj $$10 = edk.c(edk.c($$9, a($$0, O)), edk.a($$3, $$4));
      edj $$11 = a($$0, Q);
      edj $$12 = edk.a($$11, -1000000.0, 0.03, edk.a(-1000000.0), $$11);
      return edk.d($$10, $$12);
   }

   private static edj b(edj $$0) {
      edj $$1 = edk.f($$0);
      return edk.b(edk.a($$1), edk.a(0.64)).i();
   }

   protected static edw a(jr<edj> $$0, jr<eta.a> $$1, boolean $$2, boolean $$3) {
      edj $$4 = edk.a($$1.b(edz.k), 0.5);
      edj $$5 = edk.a($$1.b(edz.l), 0.67);
      edj $$6 = edk.a($$1.b(edz.n), 0.7142857142857143);
      edj $$7 = edk.a($$1.b(edz.m));
      edj $$8 = a($$0, w);
      edj $$9 = a($$0, x);
      edj $$10 = edk.a($$8, $$9, 0.25, $$1.b($$2 ? edz.e : edz.a));
      edj $$11 = edk.a($$8, $$9, 0.25, $$1.b($$2 ? edz.f : edz.b));
      edj $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      edj $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      edj $$14 = b(edk.c($$12), $$13);
      edj $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      edj $$16 = edk.c($$15, edk.b(edk.a(5.0), a($$0, O)));
      edj $$17 = edk.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      edj $$18 = edk.c(b(a($$3, $$17)), a($$0, P));
      edj $$19 = a($$0, v);
      int $$20 = Stream.of(eea.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-ebq.e * 2);
      int $$21 = Stream.of(eea.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-ebq.e * 2);
      edj $$22 = a($$19, edk.b($$1.b(edz.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      edj $$24 = a($$19, edk.b($$1.b(edz.F), 4.0, 4.0), $$20, $$21, 0).d();
      edj $$25 = a($$19, edk.b($$1.b(edz.G), 4.0, 4.0), $$20, $$21, 0).d();
      edj $$26 = edk.a(edk.a(-0.08F), edk.d($$24, $$25));
      edj $$27 = edk.a($$1.b(edz.H));
      return new edw(
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
         a($$3, edk.a($$14, edk.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static edw b(jr<edj> $$0, jr<eta.a> $$1, edj $$2) {
      edj $$3 = a($$0, w);
      edj $$4 = a($$0, x);
      edj $$5 = edk.a($$3, $$4, 0.25, $$1.b(edz.a));
      edj $$6 = edk.a($$3, $$4, 0.25, $$1.b(edz.b));
      edj $$7 = b($$2);
      return new edw(edk.a(), edk.a(), edk.a(), edk.a(), $$5, $$6, edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), $$7, edk.a(), edk.a(), edk.a());
   }

   private static edj a(boolean $$0, edj $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static edj a(jr<edj> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static edj a(edj $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static edw a(jr<edj> $$0, jr<eta.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static edw b(jr<edj> $$0, jr<eta.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static edw c(jr<edj> $$0, jr<eta.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static edj c(edj $$0) {
      return a($$0, 0, 128);
   }

   protected static edw a(jr<edj> $$0) {
      edj $$1 = edk.c(edk.a(0L));
      edj $$2 = b(c(a($$0, M)));
      return new edw(
         edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), $$1, edk.a(), edk.a(), c(edk.a($$1, edk.a(-0.703125))), $$2, edk.a(), edk.a(), edk.a()
      );
   }

   protected static edw a() {
      return new edw(edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), edk.a(), edk.a());
   }

   private static edj a(edj $$0, edj $$1) {
      edj $$2 = edk.a(edk.b(), $$1, $$0);
      return edk.b(edk.c($$2));
   }

   private static edj b(edj $$0, edj $$1) {
      edj $$2 = edk.b($$1, $$0);
      return edk.b(edk.a(4.0), $$2.h());
   }

   private static edj a(edj $$0, edj $$1, int $$2, int $$3, int $$4) {
      return edk.a(edk.a($$0, (double)$$2, (double)($$3 + 1), $$1, edk.a((double)$$4)));
   }

   private static edj a(edj $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      edj $$10 = edk.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      edj $$9 = edk.a($$10, $$5, $$0);
      edj $$11 = edk.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return edk.a($$11, $$8, $$9);
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
