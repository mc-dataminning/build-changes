import java.util.stream.Stream;

public class dyb {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dxn s = dxo.a(10.0);
   private static final dxn t = dxo.a();
   private static final ale<dxn> u = a("zero");
   private static final ale<dxn> v = a("y");
   private static final ale<dxn> w = a("shift_x");
   private static final ale<dxn> x = a("shift_z");
   private static final ale<dxn> y = a("overworld/base_3d_noise");
   private static final ale<dxn> z = a("nether/base_3d_noise");
   private static final ale<dxn> A = a("end/base_3d_noise");
   public static final ale<dxn> d = a("overworld/continents");
   public static final ale<dxn> e = a("overworld/erosion");
   public static final ale<dxn> f = a("overworld/ridges");
   public static final ale<dxn> g = a("overworld/ridges_folded");
   public static final ale<dxn> h = a("overworld/offset");
   public static final ale<dxn> i = a("overworld/factor");
   public static final ale<dxn> j = a("overworld/jaggedness");
   public static final ale<dxn> k = a("overworld/depth");
   private static final ale<dxn> B = a("overworld/sloped_cheese");
   public static final ale<dxn> l = a("overworld_large_biomes/continents");
   public static final ale<dxn> m = a("overworld_large_biomes/erosion");
   private static final ale<dxn> C = a("overworld_large_biomes/offset");
   private static final ale<dxn> D = a("overworld_large_biomes/factor");
   private static final ale<dxn> E = a("overworld_large_biomes/jaggedness");
   private static final ale<dxn> F = a("overworld_large_biomes/depth");
   private static final ale<dxn> G = a("overworld_large_biomes/sloped_cheese");
   private static final ale<dxn> H = a("overworld_amplified/offset");
   private static final ale<dxn> I = a("overworld_amplified/factor");
   private static final ale<dxn> J = a("overworld_amplified/jaggedness");
   private static final ale<dxn> K = a("overworld_amplified/depth");
   private static final ale<dxn> L = a("overworld_amplified/sloped_cheese");
   private static final ale<dxn> M = a("end/sloped_cheese");
   private static final ale<dxn> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ale<dxn> O = a("overworld/caves/entrances");
   private static final ale<dxn> P = a("overworld/caves/noodle");
   private static final ale<dxn> Q = a("overworld/caves/pillars");
   private static final ale<dxn> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ale<dxn> S = a("overworld/caves/spaghetti_2d");

   private static ale<dxn> a(String $$0) {
      return ale.a(lq.aD, new alf($$0));
   }

   public static ji<? extends dxn> a(rc<dxn> $$0) {
      jj<emy.a> $$1 = $$0.a(lq.aH);
      jj<dxn> $$2 = $$0.a(lq.aD);
      $$0.a(u, dxo.a());
      int $$3 = dvu.e * 2;
      int $$4 = dvu.d * 2;
      $$0.a(v, dxo.a($$3, $$4, (double)$$3, (double)$$4));
      dxn $$5 = a($$0, w, dxo.b(dxo.c(dxo.b($$1.b(dyd.j)))));
      dxn $$6 = a($$0, x, dxo.b(dxo.c(dxo.c($$1.b(dyd.j)))));
      $$0.a(y, emv.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, emv.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, emv.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ji<dxn> $$7 = $$0.a(d, dxo.b(dxo.a($$5, $$6, 0.25, $$1.b(dyd.c))));
      ji<dxn> $$8 = $$0.a(e, dxo.b(dxo.a($$5, $$6, 0.25, $$1.b(dyd.d))));
      dxn $$9 = a($$0, f, dxo.b(dxo.a($$5, $$6, 0.25, $$1.b(dyd.i))));
      $$0.a(g, a($$9));
      dxn $$10 = dxo.b($$1.b(dyd.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ji<dxn> $$11 = $$0.a(l, dxo.b(dxo.a($$5, $$6, 0.25, $$1.b(dyd.g))));
      ji<dxn> $$12 = $$0.a(m, dxo.b(dxo.a($$5, $$6, 0.25, $$1.b(dyd.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dxo.a(dxo.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dxo.d(dxo.a($$1.b(dyd.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      rc<dxn> $$0, jj<dxn> $$1, dxn $$2, ji<dxn> $$3, ji<dxn> $$4, ale<dxn> $$5, ale<dxn> $$6, ale<dxn> $$7, ale<dxn> $$8, ale<dxn> $$9, boolean $$10
   ) {
      dxo.w.a $$11 = new dxo.w.a($$3);
      dxo.w.a $$12 = new dxo.w.a($$4);
      dxo.w.a $$13 = new dxo.w.a($$1.b(f));
      dxo.w.a $$14 = new dxo.w.a($$1.b(g));
      dxn $$15 = a($$0, $$5, a(dxo.a(dxo.a(-0.50375F), dxo.a(rr.a($$11, $$12, $$14, $$10))), dxo.c()));
      dxn $$16 = a($$0, $$6, a(dxo.a(rr.a($$11, $$12, $$13, $$14, $$10)), s));
      dxn $$17 = a($$0, $$8, dxo.a(dxo.a(-64, 320, 1.5, -1.5), $$15));
      dxn $$18 = a($$0, $$7, a(dxo.a(rr.b($$11, $$12, $$13, $$14, $$10)), t));
      dxn $$19 = dxo.b($$18, $$2.g());
      dxn $$20 = b($$16, dxo.a($$17, $$19));
      $$0.a($$9, dxo.a($$20, a($$1, y)));
   }

   private static dxn a(rc<dxn> $$0, ale<dxn> $$1, dxn $$2) {
      return new dxo.j($$0.a($$1, $$2));
   }

   private static dxn a(jj<dxn> $$0, ale<dxn> $$1) {
      return new dxo.j($$0.b($$1));
   }

   private static dxn a(dxn $$0) {
      return dxo.b(dxo.a(dxo.a($$0.d(), dxo.a(-0.6666666666666666)).d(), dxo.a(-0.3333333333333333)), dxo.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dxn b(jj<emy.a> $$0) {
      dxn $$1 = dxo.a($$0.b(dyd.z));
      dxn $$2 = dxo.a($$0.b(dyd.A), 0.0, -0.1);
      return dxo.d(dxo.b($$2, dxo.a($$1.d(), dxo.a(-0.4))));
   }

   private static dxn d(jj<dxn> $$0, jj<emy.a> $$1) {
      dxn $$2 = dxo.d(dxo.b($$1.b(dyd.x), 2.0, 1.0));
      dxn $$3 = dxo.a($$1.b(dyd.y), -0.065, -0.088);
      dxn $$4 = dxo.a($$2, $$1.b(dyd.v), dxo.z.a.a);
      dxn $$5 = dxo.a($$2, $$1.b(dyd.w), dxo.z.a.a);
      dxn $$6 = dxo.a(dxo.d($$4, $$5), $$3).a(-1.0, 1.0);
      dxn $$7 = a($$0, N);
      dxn $$8 = dxo.b($$1.b(dyd.B), 0.75, 0.5);
      dxn $$9 = dxo.a(dxo.a($$8, dxo.a(0.37)), dxo.a(-10, 30, 0.3, 0.0));
      return dxo.d(dxo.c($$9, dxo.a($$7, $$6)));
   }

   private static dxn e(jj<dxn> $$0, jj<emy.a> $$1) {
      dxn $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dxn $$6 = a($$2, dxo.b($$1.b(dyd.I), 1.0, 1.0), -60, 320, -1);
      dxn $$7 = a($$2, dxo.a($$1.b(dyd.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dxn $$9 = a($$2, dxo.b($$1.b(dyd.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxn $$10 = a($$2, dxo.b($$1.b(dyd.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxn $$11 = dxo.b(dxo.a(1.5), dxo.d($$9.d(), $$10.d()));
      return dxo.a($$6, -1000000.0, 0.0, dxo.a(64.0), dxo.a($$7, $$11));
   }

   private static dxn c(jj<emy.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dxn $$3 = dxo.b($$0.b(dyd.o), 25.0, 0.3);
      dxn $$4 = dxo.a($$0.b(dyd.p), 0.0, -2.0);
      dxn $$5 = dxo.a($$0.b(dyd.q), 0.0, 1.1);
      dxn $$6 = dxo.a(dxo.b($$3, dxo.a(2.0)), $$4);
      return dxo.d(dxo.b($$6, $$5.f()));
   }

   private static dxn f(jj<dxn> $$0, jj<emy.a> $$1) {
      dxn $$2 = dxo.b($$1.b(dyd.t), 2.0, 1.0);
      dxn $$3 = dxo.a($$2, $$1.b(dyd.r), dxo.z.a.b);
      dxn $$4 = dxo.a($$1.b(dyd.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dxn $$5 = a($$0, R);
      dxn $$6 = dxo.a($$4, dxo.a(-64, 320, 8.0, -40.0)).d();
      dxn $$7 = dxo.a($$6, $$5).f();
      double $$8 = 0.083;
      dxn $$9 = dxo.a($$3, dxo.b(dxo.a(0.083), $$5));
      return dxo.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dxn a(jj<dxn> $$0, jj<emy.a> $$1, dxn $$2) {
      dxn $$3 = a($$0, S);
      dxn $$4 = a($$0, N);
      dxn $$5 = dxo.a($$1.b(dyd.C), 8.0);
      dxn $$6 = dxo.b(dxo.a(4.0), $$5.e());
      dxn $$7 = dxo.a($$1.b(dyd.D), 0.6666666666666666);
      dxn $$8 = dxo.a(dxo.a(dxo.a(0.27), $$7).a(-1.0, 1.0), dxo.a(dxo.a(1.5), dxo.b(dxo.a(-0.64), $$2)).a(0.0, 0.5));
      dxn $$9 = dxo.a($$6, $$8);
      dxn $$10 = dxo.c(dxo.c($$9, a($$0, O)), dxo.a($$3, $$4));
      dxn $$11 = a($$0, Q);
      dxn $$12 = dxo.a($$11, -1000000.0, 0.03, dxo.a(-1000000.0), $$11);
      return dxo.d($$10, $$12);
   }

   private static dxn b(dxn $$0) {
      dxn $$1 = dxo.f($$0);
      return dxo.b(dxo.a($$1), dxo.a(0.64)).i();
   }

   protected static dya a(jj<dxn> $$0, jj<emy.a> $$1, boolean $$2, boolean $$3) {
      dxn $$4 = dxo.a($$1.b(dyd.k), 0.5);
      dxn $$5 = dxo.a($$1.b(dyd.l), 0.67);
      dxn $$6 = dxo.a($$1.b(dyd.n), 0.7142857142857143);
      dxn $$7 = dxo.a($$1.b(dyd.m));
      dxn $$8 = a($$0, w);
      dxn $$9 = a($$0, x);
      dxn $$10 = dxo.a($$8, $$9, 0.25, $$1.b($$2 ? dyd.e : dyd.a));
      dxn $$11 = dxo.a($$8, $$9, 0.25, $$1.b($$2 ? dyd.f : dyd.b));
      dxn $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dxn $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dxn $$14 = b(dxo.c($$12), $$13);
      dxn $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dxn $$16 = dxo.c($$15, dxo.b(dxo.a(5.0), a($$0, O)));
      dxn $$17 = dxo.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dxn $$18 = dxo.c(b(a($$3, $$17)), a($$0, P));
      dxn $$19 = a($$0, v);
      int $$20 = Stream.of(dye.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dvu.e * 2);
      int $$21 = Stream.of(dye.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dvu.e * 2);
      dxn $$22 = a($$19, dxo.b($$1.b(dyd.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dxn $$24 = a($$19, dxo.b($$1.b(dyd.F), 4.0, 4.0), $$20, $$21, 0).d();
      dxn $$25 = a($$19, dxo.b($$1.b(dyd.G), 4.0, 4.0), $$20, $$21, 0).d();
      dxn $$26 = dxo.a(dxo.a(-0.08F), dxo.d($$24, $$25));
      dxn $$27 = dxo.a($$1.b(dyd.H));
      return new dya(
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
         a($$3, dxo.a($$14, dxo.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dya b(jj<dxn> $$0, jj<emy.a> $$1, dxn $$2) {
      dxn $$3 = a($$0, w);
      dxn $$4 = a($$0, x);
      dxn $$5 = dxo.a($$3, $$4, 0.25, $$1.b(dyd.a));
      dxn $$6 = dxo.a($$3, $$4, 0.25, $$1.b(dyd.b));
      dxn $$7 = b($$2);
      return new dya(dxo.a(), dxo.a(), dxo.a(), dxo.a(), $$5, $$6, dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), $$7, dxo.a(), dxo.a(), dxo.a());
   }

   private static dxn a(boolean $$0, dxn $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dxn a(jj<dxn> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dxn a(dxn $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dya a(jj<dxn> $$0, jj<emy.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dya b(jj<dxn> $$0, jj<emy.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dya c(jj<dxn> $$0, jj<emy.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dxn c(dxn $$0) {
      return a($$0, 0, 128);
   }

   protected static dya a(jj<dxn> $$0) {
      dxn $$1 = dxo.c(dxo.a(0L));
      dxn $$2 = b(c(a($$0, M)));
      return new dya(
         dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), $$1, dxo.a(), dxo.a(), c(dxo.a($$1, dxo.a(-0.703125))), $$2, dxo.a(), dxo.a(), dxo.a()
      );
   }

   protected static dya a() {
      return new dya(dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a(), dxo.a());
   }

   private static dxn a(dxn $$0, dxn $$1) {
      dxn $$2 = dxo.a(dxo.b(), $$1, $$0);
      return dxo.b(dxo.c($$2));
   }

   private static dxn b(dxn $$0, dxn $$1) {
      dxn $$2 = dxo.b($$1, $$0);
      return dxo.b(dxo.a(4.0), $$2.h());
   }

   private static dxn a(dxn $$0, dxn $$1, int $$2, int $$3, int $$4) {
      return dxo.a(dxo.a($$0, (double)$$2, (double)($$3 + 1), $$1, dxo.a((double)$$4)));
   }

   private static dxn a(dxn $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dxn $$10 = dxo.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dxn $$9 = dxo.a($$10, $$5, $$0);
      dxn $$11 = dxo.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dxo.a($$11, $$8, $$9);
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
