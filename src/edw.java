import java.util.stream.Stream;

public class edw {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final edi s = edj.a(10.0);
   private static final edi t = edj.a();
   private static final aly<edi> u = a("zero");
   private static final aly<edi> v = a("y");
   private static final aly<edi> w = a("shift_x");
   private static final aly<edi> x = a("shift_z");
   private static final aly<edi> y = a("overworld/base_3d_noise");
   private static final aly<edi> z = a("nether/base_3d_noise");
   private static final aly<edi> A = a("end/base_3d_noise");
   public static final aly<edi> d = a("overworld/continents");
   public static final aly<edi> e = a("overworld/erosion");
   public static final aly<edi> f = a("overworld/ridges");
   public static final aly<edi> g = a("overworld/ridges_folded");
   public static final aly<edi> h = a("overworld/offset");
   public static final aly<edi> i = a("overworld/factor");
   public static final aly<edi> j = a("overworld/jaggedness");
   public static final aly<edi> k = a("overworld/depth");
   private static final aly<edi> B = a("overworld/sloped_cheese");
   public static final aly<edi> l = a("overworld_large_biomes/continents");
   public static final aly<edi> m = a("overworld_large_biomes/erosion");
   private static final aly<edi> C = a("overworld_large_biomes/offset");
   private static final aly<edi> D = a("overworld_large_biomes/factor");
   private static final aly<edi> E = a("overworld_large_biomes/jaggedness");
   private static final aly<edi> F = a("overworld_large_biomes/depth");
   private static final aly<edi> G = a("overworld_large_biomes/sloped_cheese");
   private static final aly<edi> H = a("overworld_amplified/offset");
   private static final aly<edi> I = a("overworld_amplified/factor");
   private static final aly<edi> J = a("overworld_amplified/jaggedness");
   private static final aly<edi> K = a("overworld_amplified/depth");
   private static final aly<edi> L = a("overworld_amplified/sloped_cheese");
   private static final aly<edi> M = a("end/sloped_cheese");
   private static final aly<edi> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aly<edi> O = a("overworld/caves/entrances");
   private static final aly<edi> P = a("overworld/caves/noodle");
   private static final aly<edi> Q = a("overworld/caves/pillars");
   private static final aly<edi> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aly<edi> S = a("overworld/caves/spaghetti_2d");

   private static aly<edi> a(String $$0) {
      return aly.a(mb.aM, alz.b($$0));
   }

   public static jq<? extends edi> a(rk<edi> $$0) {
      jr<esz.a> $$1 = $$0.a(mb.aS);
      jr<edi> $$2 = $$0.a(mb.aM);
      $$0.a(u, edj.a());
      int $$3 = ebp.e * 2;
      int $$4 = ebp.d * 2;
      $$0.a(v, edj.a($$3, $$4, (double)$$3, (double)$$4));
      edi $$5 = a($$0, w, edj.b(edj.c(edj.b($$1.b(edy.j)))));
      edi $$6 = a($$0, x, edj.b(edj.c(edj.c($$1.b(edy.j)))));
      $$0.a(y, esw.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, esw.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, esw.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jq<edi> $$7 = $$0.a(d, edj.b(edj.a($$5, $$6, 0.25, $$1.b(edy.c))));
      jq<edi> $$8 = $$0.a(e, edj.b(edj.a($$5, $$6, 0.25, $$1.b(edy.d))));
      edi $$9 = a($$0, f, edj.b(edj.a($$5, $$6, 0.25, $$1.b(edy.i))));
      $$0.a(g, a($$9));
      edi $$10 = edj.b($$1.b(edy.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jq<edi> $$11 = $$0.a(l, edj.b(edj.a($$5, $$6, 0.25, $$1.b(edy.g))));
      jq<edi> $$12 = $$0.a(m, edj.b(edj.a($$5, $$6, 0.25, $$1.b(edy.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, edj.a(edj.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, edj.d(edj.a($$1.b(edy.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      rk<edi> $$0, jr<edi> $$1, edi $$2, jq<edi> $$3, jq<edi> $$4, aly<edi> $$5, aly<edi> $$6, aly<edi> $$7, aly<edi> $$8, aly<edi> $$9, boolean $$10
   ) {
      edj.w.a $$11 = new edj.w.a($$3);
      edj.w.a $$12 = new edj.w.a($$4);
      edj.w.a $$13 = new edj.w.a($$1.b(f));
      edj.w.a $$14 = new edj.w.a($$1.b(g));
      edi $$15 = a($$0, $$5, a(edj.a(edj.a(-0.50375F), edj.a(rz.a($$11, $$12, $$14, $$10))), edj.c()));
      edi $$16 = a($$0, $$6, a(edj.a(rz.a($$11, $$12, $$13, $$14, $$10)), s));
      edi $$17 = a($$0, $$8, edj.a(edj.a(-64, 320, 1.5, -1.5), $$15));
      edi $$18 = a($$0, $$7, a(edj.a(rz.b($$11, $$12, $$13, $$14, $$10)), t));
      edi $$19 = edj.b($$18, $$2.g());
      edi $$20 = b($$16, edj.a($$17, $$19));
      $$0.a($$9, edj.a($$20, a($$1, y)));
   }

   private static edi a(rk<edi> $$0, aly<edi> $$1, edi $$2) {
      return new edj.j($$0.a($$1, $$2));
   }

   private static edi a(jr<edi> $$0, aly<edi> $$1) {
      return new edj.j($$0.b($$1));
   }

   private static edi a(edi $$0) {
      return edj.b(edj.a(edj.a($$0.d(), edj.a(-0.6666666666666666)).d(), edj.a(-0.3333333333333333)), edj.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static edi b(jr<esz.a> $$0) {
      edi $$1 = edj.a($$0.b(edy.z));
      edi $$2 = edj.a($$0.b(edy.A), 0.0, -0.1);
      return edj.d(edj.b($$2, edj.a($$1.d(), edj.a(-0.4))));
   }

   private static edi d(jr<edi> $$0, jr<esz.a> $$1) {
      edi $$2 = edj.d(edj.b($$1.b(edy.x), 2.0, 1.0));
      edi $$3 = edj.a($$1.b(edy.y), -0.065, -0.088);
      edi $$4 = edj.a($$2, $$1.b(edy.v), edj.z.a.a);
      edi $$5 = edj.a($$2, $$1.b(edy.w), edj.z.a.a);
      edi $$6 = edj.a(edj.d($$4, $$5), $$3).a(-1.0, 1.0);
      edi $$7 = a($$0, N);
      edi $$8 = edj.b($$1.b(edy.B), 0.75, 0.5);
      edi $$9 = edj.a(edj.a($$8, edj.a(0.37)), edj.a(-10, 30, 0.3, 0.0));
      return edj.d(edj.c($$9, edj.a($$7, $$6)));
   }

   private static edi e(jr<edi> $$0, jr<esz.a> $$1) {
      edi $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      edi $$6 = a($$2, edj.b($$1.b(edy.I), 1.0, 1.0), -60, 320, -1);
      edi $$7 = a($$2, edj.a($$1.b(edy.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      edi $$9 = a($$2, edj.b($$1.b(edy.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      edi $$10 = a($$2, edj.b($$1.b(edy.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      edi $$11 = edj.b(edj.a(1.5), edj.d($$9.d(), $$10.d()));
      return edj.a($$6, -1000000.0, 0.0, edj.a(64.0), edj.a($$7, $$11));
   }

   private static edi c(jr<esz.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      edi $$3 = edj.b($$0.b(edy.o), 25.0, 0.3);
      edi $$4 = edj.a($$0.b(edy.p), 0.0, -2.0);
      edi $$5 = edj.a($$0.b(edy.q), 0.0, 1.1);
      edi $$6 = edj.a(edj.b($$3, edj.a(2.0)), $$4);
      return edj.d(edj.b($$6, $$5.f()));
   }

   private static edi f(jr<edi> $$0, jr<esz.a> $$1) {
      edi $$2 = edj.b($$1.b(edy.t), 2.0, 1.0);
      edi $$3 = edj.a($$2, $$1.b(edy.r), edj.z.a.b);
      edi $$4 = edj.a($$1.b(edy.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      edi $$5 = a($$0, R);
      edi $$6 = edj.a($$4, edj.a(-64, 320, 8.0, -40.0)).d();
      edi $$7 = edj.a($$6, $$5).f();
      double $$8 = 0.083;
      edi $$9 = edj.a($$3, edj.b(edj.a(0.083), $$5));
      return edj.d($$9, $$7).a(-1.0, 1.0);
   }

   private static edi a(jr<edi> $$0, jr<esz.a> $$1, edi $$2) {
      edi $$3 = a($$0, S);
      edi $$4 = a($$0, N);
      edi $$5 = edj.a($$1.b(edy.C), 8.0);
      edi $$6 = edj.b(edj.a(4.0), $$5.e());
      edi $$7 = edj.a($$1.b(edy.D), 0.6666666666666666);
      edi $$8 = edj.a(edj.a(edj.a(0.27), $$7).a(-1.0, 1.0), edj.a(edj.a(1.5), edj.b(edj.a(-0.64), $$2)).a(0.0, 0.5));
      edi $$9 = edj.a($$6, $$8);
      edi $$10 = edj.c(edj.c($$9, a($$0, O)), edj.a($$3, $$4));
      edi $$11 = a($$0, Q);
      edi $$12 = edj.a($$11, -1000000.0, 0.03, edj.a(-1000000.0), $$11);
      return edj.d($$10, $$12);
   }

   private static edi b(edi $$0) {
      edi $$1 = edj.f($$0);
      return edj.b(edj.a($$1), edj.a(0.64)).i();
   }

   protected static edv a(jr<edi> $$0, jr<esz.a> $$1, boolean $$2, boolean $$3) {
      edi $$4 = edj.a($$1.b(edy.k), 0.5);
      edi $$5 = edj.a($$1.b(edy.l), 0.67);
      edi $$6 = edj.a($$1.b(edy.n), 0.7142857142857143);
      edi $$7 = edj.a($$1.b(edy.m));
      edi $$8 = a($$0, w);
      edi $$9 = a($$0, x);
      edi $$10 = edj.a($$8, $$9, 0.25, $$1.b($$2 ? edy.e : edy.a));
      edi $$11 = edj.a($$8, $$9, 0.25, $$1.b($$2 ? edy.f : edy.b));
      edi $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      edi $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      edi $$14 = b(edj.c($$12), $$13);
      edi $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      edi $$16 = edj.c($$15, edj.b(edj.a(5.0), a($$0, O)));
      edi $$17 = edj.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      edi $$18 = edj.c(b(a($$3, $$17)), a($$0, P));
      edi $$19 = a($$0, v);
      int $$20 = Stream.of(edz.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-ebp.e * 2);
      int $$21 = Stream.of(edz.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-ebp.e * 2);
      edi $$22 = a($$19, edj.b($$1.b(edy.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      edi $$24 = a($$19, edj.b($$1.b(edy.F), 4.0, 4.0), $$20, $$21, 0).d();
      edi $$25 = a($$19, edj.b($$1.b(edy.G), 4.0, 4.0), $$20, $$21, 0).d();
      edi $$26 = edj.a(edj.a(-0.08F), edj.d($$24, $$25));
      edi $$27 = edj.a($$1.b(edy.H));
      return new edv(
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
         a($$3, edj.a($$14, edj.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static edv b(jr<edi> $$0, jr<esz.a> $$1, edi $$2) {
      edi $$3 = a($$0, w);
      edi $$4 = a($$0, x);
      edi $$5 = edj.a($$3, $$4, 0.25, $$1.b(edy.a));
      edi $$6 = edj.a($$3, $$4, 0.25, $$1.b(edy.b));
      edi $$7 = b($$2);
      return new edv(edj.a(), edj.a(), edj.a(), edj.a(), $$5, $$6, edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), $$7, edj.a(), edj.a(), edj.a());
   }

   private static edi a(boolean $$0, edi $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static edi a(jr<edi> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static edi a(edi $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static edv a(jr<edi> $$0, jr<esz.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static edv b(jr<edi> $$0, jr<esz.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static edv c(jr<edi> $$0, jr<esz.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static edi c(edi $$0) {
      return a($$0, 0, 128);
   }

   protected static edv a(jr<edi> $$0) {
      edi $$1 = edj.c(edj.a(0L));
      edi $$2 = b(c(a($$0, M)));
      return new edv(
         edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), $$1, edj.a(), edj.a(), c(edj.a($$1, edj.a(-0.703125))), $$2, edj.a(), edj.a(), edj.a()
      );
   }

   protected static edv a() {
      return new edv(edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), edj.a(), edj.a());
   }

   private static edi a(edi $$0, edi $$1) {
      edi $$2 = edj.a(edj.b(), $$1, $$0);
      return edj.b(edj.c($$2));
   }

   private static edi b(edi $$0, edi $$1) {
      edi $$2 = edj.b($$1, $$0);
      return edj.b(edj.a(4.0), $$2.h());
   }

   private static edi a(edi $$0, edi $$1, int $$2, int $$3, int $$4) {
      return edj.a(edj.a($$0, (double)$$2, (double)($$3 + 1), $$1, edj.a((double)$$4)));
   }

   private static edi a(edi $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      edi $$10 = edj.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      edi $$9 = edj.a($$10, $$5, $$0);
      edi $$11 = edj.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return edj.a($$11, $$8, $$9);
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
