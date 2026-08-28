import java.util.stream.Stream;

public class dyg {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dxs s = dxt.a(10.0);
   private static final dxs t = dxt.a();
   private static final akj<dxs> u = a("zero");
   private static final akj<dxs> v = a("y");
   private static final akj<dxs> w = a("shift_x");
   private static final akj<dxs> x = a("shift_z");
   private static final akj<dxs> y = a("overworld/base_3d_noise");
   private static final akj<dxs> z = a("nether/base_3d_noise");
   private static final akj<dxs> A = a("end/base_3d_noise");
   public static final akj<dxs> d = a("overworld/continents");
   public static final akj<dxs> e = a("overworld/erosion");
   public static final akj<dxs> f = a("overworld/ridges");
   public static final akj<dxs> g = a("overworld/ridges_folded");
   public static final akj<dxs> h = a("overworld/offset");
   public static final akj<dxs> i = a("overworld/factor");
   public static final akj<dxs> j = a("overworld/jaggedness");
   public static final akj<dxs> k = a("overworld/depth");
   private static final akj<dxs> B = a("overworld/sloped_cheese");
   public static final akj<dxs> l = a("overworld_large_biomes/continents");
   public static final akj<dxs> m = a("overworld_large_biomes/erosion");
   private static final akj<dxs> C = a("overworld_large_biomes/offset");
   private static final akj<dxs> D = a("overworld_large_biomes/factor");
   private static final akj<dxs> E = a("overworld_large_biomes/jaggedness");
   private static final akj<dxs> F = a("overworld_large_biomes/depth");
   private static final akj<dxs> G = a("overworld_large_biomes/sloped_cheese");
   private static final akj<dxs> H = a("overworld_amplified/offset");
   private static final akj<dxs> I = a("overworld_amplified/factor");
   private static final akj<dxs> J = a("overworld_amplified/jaggedness");
   private static final akj<dxs> K = a("overworld_amplified/depth");
   private static final akj<dxs> L = a("overworld_amplified/sloped_cheese");
   private static final akj<dxs> M = a("end/sloped_cheese");
   private static final akj<dxs> N = a("overworld/caves/spaghetti_roughness_function");
   private static final akj<dxs> O = a("overworld/caves/entrances");
   private static final akj<dxs> P = a("overworld/caves/noodle");
   private static final akj<dxs> Q = a("overworld/caves/pillars");
   private static final akj<dxs> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final akj<dxs> S = a("overworld/caves/spaghetti_2d");

   private static akj<dxs> a(String $$0) {
      return akj.a(lr.aI, new akk($$0));
   }

   public static jj<? extends dxs> a(qm<dxs> $$0) {
      jk<ene.a> $$1 = $$0.a(lr.aO);
      jk<dxs> $$2 = $$0.a(lr.aI);
      $$0.a(u, dxt.a());
      int $$3 = dvz.e * 2;
      int $$4 = dvz.d * 2;
      $$0.a(v, dxt.a($$3, $$4, (double)$$3, (double)$$4));
      dxs $$5 = a($$0, w, dxt.b(dxt.c(dxt.b($$1.b(dyi.j)))));
      dxs $$6 = a($$0, x, dxt.b(dxt.c(dxt.c($$1.b(dyi.j)))));
      $$0.a(y, enb.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, enb.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, enb.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jj<dxs> $$7 = $$0.a(d, dxt.b(dxt.a($$5, $$6, 0.25, $$1.b(dyi.c))));
      jj<dxs> $$8 = $$0.a(e, dxt.b(dxt.a($$5, $$6, 0.25, $$1.b(dyi.d))));
      dxs $$9 = a($$0, f, dxt.b(dxt.a($$5, $$6, 0.25, $$1.b(dyi.i))));
      $$0.a(g, a($$9));
      dxs $$10 = dxt.b($$1.b(dyi.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jj<dxs> $$11 = $$0.a(l, dxt.b(dxt.a($$5, $$6, 0.25, $$1.b(dyi.g))));
      jj<dxs> $$12 = $$0.a(m, dxt.b(dxt.a($$5, $$6, 0.25, $$1.b(dyi.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dxt.a(dxt.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dxt.d(dxt.a($$1.b(dyi.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qm<dxs> $$0, jk<dxs> $$1, dxs $$2, jj<dxs> $$3, jj<dxs> $$4, akj<dxs> $$5, akj<dxs> $$6, akj<dxs> $$7, akj<dxs> $$8, akj<dxs> $$9, boolean $$10
   ) {
      dxt.w.a $$11 = new dxt.w.a($$3);
      dxt.w.a $$12 = new dxt.w.a($$4);
      dxt.w.a $$13 = new dxt.w.a($$1.b(f));
      dxt.w.a $$14 = new dxt.w.a($$1.b(g));
      dxs $$15 = a($$0, $$5, a(dxt.a(dxt.a(-0.50375F), dxt.a(rb.a($$11, $$12, $$14, $$10))), dxt.c()));
      dxs $$16 = a($$0, $$6, a(dxt.a(rb.a($$11, $$12, $$13, $$14, $$10)), s));
      dxs $$17 = a($$0, $$8, dxt.a(dxt.a(-64, 320, 1.5, -1.5), $$15));
      dxs $$18 = a($$0, $$7, a(dxt.a(rb.b($$11, $$12, $$13, $$14, $$10)), t));
      dxs $$19 = dxt.b($$18, $$2.g());
      dxs $$20 = b($$16, dxt.a($$17, $$19));
      $$0.a($$9, dxt.a($$20, a($$1, y)));
   }

   private static dxs a(qm<dxs> $$0, akj<dxs> $$1, dxs $$2) {
      return new dxt.j($$0.a($$1, $$2));
   }

   private static dxs a(jk<dxs> $$0, akj<dxs> $$1) {
      return new dxt.j($$0.b($$1));
   }

   private static dxs a(dxs $$0) {
      return dxt.b(dxt.a(dxt.a($$0.d(), dxt.a(-0.6666666666666666)).d(), dxt.a(-0.3333333333333333)), dxt.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dxs b(jk<ene.a> $$0) {
      dxs $$1 = dxt.a($$0.b(dyi.z));
      dxs $$2 = dxt.a($$0.b(dyi.A), 0.0, -0.1);
      return dxt.d(dxt.b($$2, dxt.a($$1.d(), dxt.a(-0.4))));
   }

   private static dxs d(jk<dxs> $$0, jk<ene.a> $$1) {
      dxs $$2 = dxt.d(dxt.b($$1.b(dyi.x), 2.0, 1.0));
      dxs $$3 = dxt.a($$1.b(dyi.y), -0.065, -0.088);
      dxs $$4 = dxt.a($$2, $$1.b(dyi.v), dxt.z.a.a);
      dxs $$5 = dxt.a($$2, $$1.b(dyi.w), dxt.z.a.a);
      dxs $$6 = dxt.a(dxt.d($$4, $$5), $$3).a(-1.0, 1.0);
      dxs $$7 = a($$0, N);
      dxs $$8 = dxt.b($$1.b(dyi.B), 0.75, 0.5);
      dxs $$9 = dxt.a(dxt.a($$8, dxt.a(0.37)), dxt.a(-10, 30, 0.3, 0.0));
      return dxt.d(dxt.c($$9, dxt.a($$7, $$6)));
   }

   private static dxs e(jk<dxs> $$0, jk<ene.a> $$1) {
      dxs $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dxs $$6 = a($$2, dxt.b($$1.b(dyi.I), 1.0, 1.0), -60, 320, -1);
      dxs $$7 = a($$2, dxt.a($$1.b(dyi.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dxs $$9 = a($$2, dxt.b($$1.b(dyi.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxs $$10 = a($$2, dxt.b($$1.b(dyi.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxs $$11 = dxt.b(dxt.a(1.5), dxt.d($$9.d(), $$10.d()));
      return dxt.a($$6, -1000000.0, 0.0, dxt.a(64.0), dxt.a($$7, $$11));
   }

   private static dxs c(jk<ene.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dxs $$3 = dxt.b($$0.b(dyi.o), 25.0, 0.3);
      dxs $$4 = dxt.a($$0.b(dyi.p), 0.0, -2.0);
      dxs $$5 = dxt.a($$0.b(dyi.q), 0.0, 1.1);
      dxs $$6 = dxt.a(dxt.b($$3, dxt.a(2.0)), $$4);
      return dxt.d(dxt.b($$6, $$5.f()));
   }

   private static dxs f(jk<dxs> $$0, jk<ene.a> $$1) {
      dxs $$2 = dxt.b($$1.b(dyi.t), 2.0, 1.0);
      dxs $$3 = dxt.a($$2, $$1.b(dyi.r), dxt.z.a.b);
      dxs $$4 = dxt.a($$1.b(dyi.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dxs $$5 = a($$0, R);
      dxs $$6 = dxt.a($$4, dxt.a(-64, 320, 8.0, -40.0)).d();
      dxs $$7 = dxt.a($$6, $$5).f();
      double $$8 = 0.083;
      dxs $$9 = dxt.a($$3, dxt.b(dxt.a(0.083), $$5));
      return dxt.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dxs a(jk<dxs> $$0, jk<ene.a> $$1, dxs $$2) {
      dxs $$3 = a($$0, S);
      dxs $$4 = a($$0, N);
      dxs $$5 = dxt.a($$1.b(dyi.C), 8.0);
      dxs $$6 = dxt.b(dxt.a(4.0), $$5.e());
      dxs $$7 = dxt.a($$1.b(dyi.D), 0.6666666666666666);
      dxs $$8 = dxt.a(dxt.a(dxt.a(0.27), $$7).a(-1.0, 1.0), dxt.a(dxt.a(1.5), dxt.b(dxt.a(-0.64), $$2)).a(0.0, 0.5));
      dxs $$9 = dxt.a($$6, $$8);
      dxs $$10 = dxt.c(dxt.c($$9, a($$0, O)), dxt.a($$3, $$4));
      dxs $$11 = a($$0, Q);
      dxs $$12 = dxt.a($$11, -1000000.0, 0.03, dxt.a(-1000000.0), $$11);
      return dxt.d($$10, $$12);
   }

   private static dxs b(dxs $$0) {
      dxs $$1 = dxt.f($$0);
      return dxt.b(dxt.a($$1), dxt.a(0.64)).i();
   }

   protected static dyf a(jk<dxs> $$0, jk<ene.a> $$1, boolean $$2, boolean $$3) {
      dxs $$4 = dxt.a($$1.b(dyi.k), 0.5);
      dxs $$5 = dxt.a($$1.b(dyi.l), 0.67);
      dxs $$6 = dxt.a($$1.b(dyi.n), 0.7142857142857143);
      dxs $$7 = dxt.a($$1.b(dyi.m));
      dxs $$8 = a($$0, w);
      dxs $$9 = a($$0, x);
      dxs $$10 = dxt.a($$8, $$9, 0.25, $$1.b($$2 ? dyi.e : dyi.a));
      dxs $$11 = dxt.a($$8, $$9, 0.25, $$1.b($$2 ? dyi.f : dyi.b));
      dxs $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dxs $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dxs $$14 = b(dxt.c($$12), $$13);
      dxs $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dxs $$16 = dxt.c($$15, dxt.b(dxt.a(5.0), a($$0, O)));
      dxs $$17 = dxt.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dxs $$18 = dxt.c(b(a($$3, $$17)), a($$0, P));
      dxs $$19 = a($$0, v);
      int $$20 = Stream.of(dyj.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dvz.e * 2);
      int $$21 = Stream.of(dyj.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dvz.e * 2);
      dxs $$22 = a($$19, dxt.b($$1.b(dyi.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dxs $$24 = a($$19, dxt.b($$1.b(dyi.F), 4.0, 4.0), $$20, $$21, 0).d();
      dxs $$25 = a($$19, dxt.b($$1.b(dyi.G), 4.0, 4.0), $$20, $$21, 0).d();
      dxs $$26 = dxt.a(dxt.a(-0.08F), dxt.d($$24, $$25));
      dxs $$27 = dxt.a($$1.b(dyi.H));
      return new dyf(
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
         a($$3, dxt.a($$14, dxt.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dyf b(jk<dxs> $$0, jk<ene.a> $$1, dxs $$2) {
      dxs $$3 = a($$0, w);
      dxs $$4 = a($$0, x);
      dxs $$5 = dxt.a($$3, $$4, 0.25, $$1.b(dyi.a));
      dxs $$6 = dxt.a($$3, $$4, 0.25, $$1.b(dyi.b));
      dxs $$7 = b($$2);
      return new dyf(dxt.a(), dxt.a(), dxt.a(), dxt.a(), $$5, $$6, dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), $$7, dxt.a(), dxt.a(), dxt.a());
   }

   private static dxs a(boolean $$0, dxs $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dxs a(jk<dxs> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dxs a(dxs $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dyf a(jk<dxs> $$0, jk<ene.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dyf b(jk<dxs> $$0, jk<ene.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dyf c(jk<dxs> $$0, jk<ene.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dxs c(dxs $$0) {
      return a($$0, 0, 128);
   }

   protected static dyf a(jk<dxs> $$0) {
      dxs $$1 = dxt.c(dxt.a(0L));
      dxs $$2 = b(c(a($$0, M)));
      return new dyf(
         dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), $$1, dxt.a(), dxt.a(), c(dxt.a($$1, dxt.a(-0.703125))), $$2, dxt.a(), dxt.a(), dxt.a()
      );
   }

   protected static dyf a() {
      return new dyf(dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a(), dxt.a());
   }

   private static dxs a(dxs $$0, dxs $$1) {
      dxs $$2 = dxt.a(dxt.b(), $$1, $$0);
      return dxt.b(dxt.c($$2));
   }

   private static dxs b(dxs $$0, dxs $$1) {
      dxs $$2 = dxt.b($$1, $$0);
      return dxt.b(dxt.a(4.0), $$2.h());
   }

   private static dxs a(dxs $$0, dxs $$1, int $$2, int $$3, int $$4) {
      return dxt.a(dxt.a($$0, (double)$$2, (double)($$3 + 1), $$1, dxt.a((double)$$4)));
   }

   private static dxs a(dxs $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dxs $$10 = dxt.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dxs $$9 = dxt.a($$10, $$5, $$0);
      dxs $$11 = dxt.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dxt.a($$11, $$8, $$9);
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
