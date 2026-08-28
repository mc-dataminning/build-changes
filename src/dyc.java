import java.util.stream.Stream;

public class dyc {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dxo s = dxp.a(10.0);
   private static final dxo t = dxp.a();
   private static final ale<dxo> u = a("zero");
   private static final ale<dxo> v = a("y");
   private static final ale<dxo> w = a("shift_x");
   private static final ale<dxo> x = a("shift_z");
   private static final ale<dxo> y = a("overworld/base_3d_noise");
   private static final ale<dxo> z = a("nether/base_3d_noise");
   private static final ale<dxo> A = a("end/base_3d_noise");
   public static final ale<dxo> d = a("overworld/continents");
   public static final ale<dxo> e = a("overworld/erosion");
   public static final ale<dxo> f = a("overworld/ridges");
   public static final ale<dxo> g = a("overworld/ridges_folded");
   public static final ale<dxo> h = a("overworld/offset");
   public static final ale<dxo> i = a("overworld/factor");
   public static final ale<dxo> j = a("overworld/jaggedness");
   public static final ale<dxo> k = a("overworld/depth");
   private static final ale<dxo> B = a("overworld/sloped_cheese");
   public static final ale<dxo> l = a("overworld_large_biomes/continents");
   public static final ale<dxo> m = a("overworld_large_biomes/erosion");
   private static final ale<dxo> C = a("overworld_large_biomes/offset");
   private static final ale<dxo> D = a("overworld_large_biomes/factor");
   private static final ale<dxo> E = a("overworld_large_biomes/jaggedness");
   private static final ale<dxo> F = a("overworld_large_biomes/depth");
   private static final ale<dxo> G = a("overworld_large_biomes/sloped_cheese");
   private static final ale<dxo> H = a("overworld_amplified/offset");
   private static final ale<dxo> I = a("overworld_amplified/factor");
   private static final ale<dxo> J = a("overworld_amplified/jaggedness");
   private static final ale<dxo> K = a("overworld_amplified/depth");
   private static final ale<dxo> L = a("overworld_amplified/sloped_cheese");
   private static final ale<dxo> M = a("end/sloped_cheese");
   private static final ale<dxo> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ale<dxo> O = a("overworld/caves/entrances");
   private static final ale<dxo> P = a("overworld/caves/noodle");
   private static final ale<dxo> Q = a("overworld/caves/pillars");
   private static final ale<dxo> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ale<dxo> S = a("overworld/caves/spaghetti_2d");

   private static ale<dxo> a(String $$0) {
      return ale.a(lq.aD, new alf($$0));
   }

   public static ji<? extends dxo> a(rc<dxo> $$0) {
      jj<emz.a> $$1 = $$0.a(lq.aH);
      jj<dxo> $$2 = $$0.a(lq.aD);
      $$0.a(u, dxp.a());
      int $$3 = dvv.e * 2;
      int $$4 = dvv.d * 2;
      $$0.a(v, dxp.a($$3, $$4, (double)$$3, (double)$$4));
      dxo $$5 = a($$0, w, dxp.b(dxp.c(dxp.b($$1.b(dye.j)))));
      dxo $$6 = a($$0, x, dxp.b(dxp.c(dxp.c($$1.b(dye.j)))));
      $$0.a(y, emw.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, emw.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, emw.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ji<dxo> $$7 = $$0.a(d, dxp.b(dxp.a($$5, $$6, 0.25, $$1.b(dye.c))));
      ji<dxo> $$8 = $$0.a(e, dxp.b(dxp.a($$5, $$6, 0.25, $$1.b(dye.d))));
      dxo $$9 = a($$0, f, dxp.b(dxp.a($$5, $$6, 0.25, $$1.b(dye.i))));
      $$0.a(g, a($$9));
      dxo $$10 = dxp.b($$1.b(dye.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ji<dxo> $$11 = $$0.a(l, dxp.b(dxp.a($$5, $$6, 0.25, $$1.b(dye.g))));
      ji<dxo> $$12 = $$0.a(m, dxp.b(dxp.a($$5, $$6, 0.25, $$1.b(dye.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dxp.a(dxp.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dxp.d(dxp.a($$1.b(dye.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      rc<dxo> $$0, jj<dxo> $$1, dxo $$2, ji<dxo> $$3, ji<dxo> $$4, ale<dxo> $$5, ale<dxo> $$6, ale<dxo> $$7, ale<dxo> $$8, ale<dxo> $$9, boolean $$10
   ) {
      dxp.w.a $$11 = new dxp.w.a($$3);
      dxp.w.a $$12 = new dxp.w.a($$4);
      dxp.w.a $$13 = new dxp.w.a($$1.b(f));
      dxp.w.a $$14 = new dxp.w.a($$1.b(g));
      dxo $$15 = a($$0, $$5, a(dxp.a(dxp.a(-0.50375F), dxp.a(rr.a($$11, $$12, $$14, $$10))), dxp.c()));
      dxo $$16 = a($$0, $$6, a(dxp.a(rr.a($$11, $$12, $$13, $$14, $$10)), s));
      dxo $$17 = a($$0, $$8, dxp.a(dxp.a(-64, 320, 1.5, -1.5), $$15));
      dxo $$18 = a($$0, $$7, a(dxp.a(rr.b($$11, $$12, $$13, $$14, $$10)), t));
      dxo $$19 = dxp.b($$18, $$2.g());
      dxo $$20 = b($$16, dxp.a($$17, $$19));
      $$0.a($$9, dxp.a($$20, a($$1, y)));
   }

   private static dxo a(rc<dxo> $$0, ale<dxo> $$1, dxo $$2) {
      return new dxp.j($$0.a($$1, $$2));
   }

   private static dxo a(jj<dxo> $$0, ale<dxo> $$1) {
      return new dxp.j($$0.b($$1));
   }

   private static dxo a(dxo $$0) {
      return dxp.b(dxp.a(dxp.a($$0.d(), dxp.a(-0.6666666666666666)).d(), dxp.a(-0.3333333333333333)), dxp.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dxo b(jj<emz.a> $$0) {
      dxo $$1 = dxp.a($$0.b(dye.z));
      dxo $$2 = dxp.a($$0.b(dye.A), 0.0, -0.1);
      return dxp.d(dxp.b($$2, dxp.a($$1.d(), dxp.a(-0.4))));
   }

   private static dxo d(jj<dxo> $$0, jj<emz.a> $$1) {
      dxo $$2 = dxp.d(dxp.b($$1.b(dye.x), 2.0, 1.0));
      dxo $$3 = dxp.a($$1.b(dye.y), -0.065, -0.088);
      dxo $$4 = dxp.a($$2, $$1.b(dye.v), dxp.z.a.a);
      dxo $$5 = dxp.a($$2, $$1.b(dye.w), dxp.z.a.a);
      dxo $$6 = dxp.a(dxp.d($$4, $$5), $$3).a(-1.0, 1.0);
      dxo $$7 = a($$0, N);
      dxo $$8 = dxp.b($$1.b(dye.B), 0.75, 0.5);
      dxo $$9 = dxp.a(dxp.a($$8, dxp.a(0.37)), dxp.a(-10, 30, 0.3, 0.0));
      return dxp.d(dxp.c($$9, dxp.a($$7, $$6)));
   }

   private static dxo e(jj<dxo> $$0, jj<emz.a> $$1) {
      dxo $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dxo $$6 = a($$2, dxp.b($$1.b(dye.I), 1.0, 1.0), -60, 320, -1);
      dxo $$7 = a($$2, dxp.a($$1.b(dye.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dxo $$9 = a($$2, dxp.b($$1.b(dye.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxo $$10 = a($$2, dxp.b($$1.b(dye.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxo $$11 = dxp.b(dxp.a(1.5), dxp.d($$9.d(), $$10.d()));
      return dxp.a($$6, -1000000.0, 0.0, dxp.a(64.0), dxp.a($$7, $$11));
   }

   private static dxo c(jj<emz.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dxo $$3 = dxp.b($$0.b(dye.o), 25.0, 0.3);
      dxo $$4 = dxp.a($$0.b(dye.p), 0.0, -2.0);
      dxo $$5 = dxp.a($$0.b(dye.q), 0.0, 1.1);
      dxo $$6 = dxp.a(dxp.b($$3, dxp.a(2.0)), $$4);
      return dxp.d(dxp.b($$6, $$5.f()));
   }

   private static dxo f(jj<dxo> $$0, jj<emz.a> $$1) {
      dxo $$2 = dxp.b($$1.b(dye.t), 2.0, 1.0);
      dxo $$3 = dxp.a($$2, $$1.b(dye.r), dxp.z.a.b);
      dxo $$4 = dxp.a($$1.b(dye.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dxo $$5 = a($$0, R);
      dxo $$6 = dxp.a($$4, dxp.a(-64, 320, 8.0, -40.0)).d();
      dxo $$7 = dxp.a($$6, $$5).f();
      double $$8 = 0.083;
      dxo $$9 = dxp.a($$3, dxp.b(dxp.a(0.083), $$5));
      return dxp.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dxo a(jj<dxo> $$0, jj<emz.a> $$1, dxo $$2) {
      dxo $$3 = a($$0, S);
      dxo $$4 = a($$0, N);
      dxo $$5 = dxp.a($$1.b(dye.C), 8.0);
      dxo $$6 = dxp.b(dxp.a(4.0), $$5.e());
      dxo $$7 = dxp.a($$1.b(dye.D), 0.6666666666666666);
      dxo $$8 = dxp.a(dxp.a(dxp.a(0.27), $$7).a(-1.0, 1.0), dxp.a(dxp.a(1.5), dxp.b(dxp.a(-0.64), $$2)).a(0.0, 0.5));
      dxo $$9 = dxp.a($$6, $$8);
      dxo $$10 = dxp.c(dxp.c($$9, a($$0, O)), dxp.a($$3, $$4));
      dxo $$11 = a($$0, Q);
      dxo $$12 = dxp.a($$11, -1000000.0, 0.03, dxp.a(-1000000.0), $$11);
      return dxp.d($$10, $$12);
   }

   private static dxo b(dxo $$0) {
      dxo $$1 = dxp.f($$0);
      return dxp.b(dxp.a($$1), dxp.a(0.64)).i();
   }

   protected static dyb a(jj<dxo> $$0, jj<emz.a> $$1, boolean $$2, boolean $$3) {
      dxo $$4 = dxp.a($$1.b(dye.k), 0.5);
      dxo $$5 = dxp.a($$1.b(dye.l), 0.67);
      dxo $$6 = dxp.a($$1.b(dye.n), 0.7142857142857143);
      dxo $$7 = dxp.a($$1.b(dye.m));
      dxo $$8 = a($$0, w);
      dxo $$9 = a($$0, x);
      dxo $$10 = dxp.a($$8, $$9, 0.25, $$1.b($$2 ? dye.e : dye.a));
      dxo $$11 = dxp.a($$8, $$9, 0.25, $$1.b($$2 ? dye.f : dye.b));
      dxo $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dxo $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dxo $$14 = b(dxp.c($$12), $$13);
      dxo $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dxo $$16 = dxp.c($$15, dxp.b(dxp.a(5.0), a($$0, O)));
      dxo $$17 = dxp.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dxo $$18 = dxp.c(b(a($$3, $$17)), a($$0, P));
      dxo $$19 = a($$0, v);
      int $$20 = Stream.of(dyf.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dvv.e * 2);
      int $$21 = Stream.of(dyf.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dvv.e * 2);
      dxo $$22 = a($$19, dxp.b($$1.b(dye.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dxo $$24 = a($$19, dxp.b($$1.b(dye.F), 4.0, 4.0), $$20, $$21, 0).d();
      dxo $$25 = a($$19, dxp.b($$1.b(dye.G), 4.0, 4.0), $$20, $$21, 0).d();
      dxo $$26 = dxp.a(dxp.a(-0.08F), dxp.d($$24, $$25));
      dxo $$27 = dxp.a($$1.b(dye.H));
      return new dyb(
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
         a($$3, dxp.a($$14, dxp.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dyb b(jj<dxo> $$0, jj<emz.a> $$1, dxo $$2) {
      dxo $$3 = a($$0, w);
      dxo $$4 = a($$0, x);
      dxo $$5 = dxp.a($$3, $$4, 0.25, $$1.b(dye.a));
      dxo $$6 = dxp.a($$3, $$4, 0.25, $$1.b(dye.b));
      dxo $$7 = b($$2);
      return new dyb(dxp.a(), dxp.a(), dxp.a(), dxp.a(), $$5, $$6, dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), $$7, dxp.a(), dxp.a(), dxp.a());
   }

   private static dxo a(boolean $$0, dxo $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dxo a(jj<dxo> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dxo a(dxo $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dyb a(jj<dxo> $$0, jj<emz.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dyb b(jj<dxo> $$0, jj<emz.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dyb c(jj<dxo> $$0, jj<emz.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dxo c(dxo $$0) {
      return a($$0, 0, 128);
   }

   protected static dyb a(jj<dxo> $$0) {
      dxo $$1 = dxp.c(dxp.a(0L));
      dxo $$2 = b(c(a($$0, M)));
      return new dyb(
         dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), $$1, dxp.a(), dxp.a(), c(dxp.a($$1, dxp.a(-0.703125))), $$2, dxp.a(), dxp.a(), dxp.a()
      );
   }

   protected static dyb a() {
      return new dyb(dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a(), dxp.a());
   }

   private static dxo a(dxo $$0, dxo $$1) {
      dxo $$2 = dxp.a(dxp.b(), $$1, $$0);
      return dxp.b(dxp.c($$2));
   }

   private static dxo b(dxo $$0, dxo $$1) {
      dxo $$2 = dxp.b($$1, $$0);
      return dxp.b(dxp.a(4.0), $$2.h());
   }

   private static dxo a(dxo $$0, dxo $$1, int $$2, int $$3, int $$4) {
      return dxp.a(dxp.a($$0, (double)$$2, (double)($$3 + 1), $$1, dxp.a((double)$$4)));
   }

   private static dxo a(dxo $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dxo $$10 = dxp.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dxo $$9 = dxp.a($$10, $$5, $$0);
      dxo $$11 = dxp.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dxp.a($$11, $$8, $$9);
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
