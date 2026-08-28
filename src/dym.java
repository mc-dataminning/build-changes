import java.util.stream.Stream;

public class dym {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dxy s = dxz.a(10.0);
   private static final dxy t = dxz.a();
   private static final akj<dxy> u = a("zero");
   private static final akj<dxy> v = a("y");
   private static final akj<dxy> w = a("shift_x");
   private static final akj<dxy> x = a("shift_z");
   private static final akj<dxy> y = a("overworld/base_3d_noise");
   private static final akj<dxy> z = a("nether/base_3d_noise");
   private static final akj<dxy> A = a("end/base_3d_noise");
   public static final akj<dxy> d = a("overworld/continents");
   public static final akj<dxy> e = a("overworld/erosion");
   public static final akj<dxy> f = a("overworld/ridges");
   public static final akj<dxy> g = a("overworld/ridges_folded");
   public static final akj<dxy> h = a("overworld/offset");
   public static final akj<dxy> i = a("overworld/factor");
   public static final akj<dxy> j = a("overworld/jaggedness");
   public static final akj<dxy> k = a("overworld/depth");
   private static final akj<dxy> B = a("overworld/sloped_cheese");
   public static final akj<dxy> l = a("overworld_large_biomes/continents");
   public static final akj<dxy> m = a("overworld_large_biomes/erosion");
   private static final akj<dxy> C = a("overworld_large_biomes/offset");
   private static final akj<dxy> D = a("overworld_large_biomes/factor");
   private static final akj<dxy> E = a("overworld_large_biomes/jaggedness");
   private static final akj<dxy> F = a("overworld_large_biomes/depth");
   private static final akj<dxy> G = a("overworld_large_biomes/sloped_cheese");
   private static final akj<dxy> H = a("overworld_amplified/offset");
   private static final akj<dxy> I = a("overworld_amplified/factor");
   private static final akj<dxy> J = a("overworld_amplified/jaggedness");
   private static final akj<dxy> K = a("overworld_amplified/depth");
   private static final akj<dxy> L = a("overworld_amplified/sloped_cheese");
   private static final akj<dxy> M = a("end/sloped_cheese");
   private static final akj<dxy> N = a("overworld/caves/spaghetti_roughness_function");
   private static final akj<dxy> O = a("overworld/caves/entrances");
   private static final akj<dxy> P = a("overworld/caves/noodle");
   private static final akj<dxy> Q = a("overworld/caves/pillars");
   private static final akj<dxy> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final akj<dxy> S = a("overworld/caves/spaghetti_2d");

   private static akj<dxy> a(String $$0) {
      return akj.a(lr.aI, new akk($$0));
   }

   public static jj<? extends dxy> a(qm<dxy> $$0) {
      jk<enk.a> $$1 = $$0.a(lr.aO);
      jk<dxy> $$2 = $$0.a(lr.aI);
      $$0.a(u, dxz.a());
      int $$3 = dwf.e * 2;
      int $$4 = dwf.d * 2;
      $$0.a(v, dxz.a($$3, $$4, (double)$$3, (double)$$4));
      dxy $$5 = a($$0, w, dxz.b(dxz.c(dxz.b($$1.b(dyo.j)))));
      dxy $$6 = a($$0, x, dxz.b(dxz.c(dxz.c($$1.b(dyo.j)))));
      $$0.a(y, enh.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, enh.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, enh.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jj<dxy> $$7 = $$0.a(d, dxz.b(dxz.a($$5, $$6, 0.25, $$1.b(dyo.c))));
      jj<dxy> $$8 = $$0.a(e, dxz.b(dxz.a($$5, $$6, 0.25, $$1.b(dyo.d))));
      dxy $$9 = a($$0, f, dxz.b(dxz.a($$5, $$6, 0.25, $$1.b(dyo.i))));
      $$0.a(g, a($$9));
      dxy $$10 = dxz.b($$1.b(dyo.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jj<dxy> $$11 = $$0.a(l, dxz.b(dxz.a($$5, $$6, 0.25, $$1.b(dyo.g))));
      jj<dxy> $$12 = $$0.a(m, dxz.b(dxz.a($$5, $$6, 0.25, $$1.b(dyo.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dxz.a(dxz.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dxz.d(dxz.a($$1.b(dyo.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qm<dxy> $$0, jk<dxy> $$1, dxy $$2, jj<dxy> $$3, jj<dxy> $$4, akj<dxy> $$5, akj<dxy> $$6, akj<dxy> $$7, akj<dxy> $$8, akj<dxy> $$9, boolean $$10
   ) {
      dxz.w.a $$11 = new dxz.w.a($$3);
      dxz.w.a $$12 = new dxz.w.a($$4);
      dxz.w.a $$13 = new dxz.w.a($$1.b(f));
      dxz.w.a $$14 = new dxz.w.a($$1.b(g));
      dxy $$15 = a($$0, $$5, a(dxz.a(dxz.a(-0.50375F), dxz.a(rb.a($$11, $$12, $$14, $$10))), dxz.c()));
      dxy $$16 = a($$0, $$6, a(dxz.a(rb.a($$11, $$12, $$13, $$14, $$10)), s));
      dxy $$17 = a($$0, $$8, dxz.a(dxz.a(-64, 320, 1.5, -1.5), $$15));
      dxy $$18 = a($$0, $$7, a(dxz.a(rb.b($$11, $$12, $$13, $$14, $$10)), t));
      dxy $$19 = dxz.b($$18, $$2.g());
      dxy $$20 = b($$16, dxz.a($$17, $$19));
      $$0.a($$9, dxz.a($$20, a($$1, y)));
   }

   private static dxy a(qm<dxy> $$0, akj<dxy> $$1, dxy $$2) {
      return new dxz.j($$0.a($$1, $$2));
   }

   private static dxy a(jk<dxy> $$0, akj<dxy> $$1) {
      return new dxz.j($$0.b($$1));
   }

   private static dxy a(dxy $$0) {
      return dxz.b(dxz.a(dxz.a($$0.d(), dxz.a(-0.6666666666666666)).d(), dxz.a(-0.3333333333333333)), dxz.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dxy b(jk<enk.a> $$0) {
      dxy $$1 = dxz.a($$0.b(dyo.z));
      dxy $$2 = dxz.a($$0.b(dyo.A), 0.0, -0.1);
      return dxz.d(dxz.b($$2, dxz.a($$1.d(), dxz.a(-0.4))));
   }

   private static dxy d(jk<dxy> $$0, jk<enk.a> $$1) {
      dxy $$2 = dxz.d(dxz.b($$1.b(dyo.x), 2.0, 1.0));
      dxy $$3 = dxz.a($$1.b(dyo.y), -0.065, -0.088);
      dxy $$4 = dxz.a($$2, $$1.b(dyo.v), dxz.z.a.a);
      dxy $$5 = dxz.a($$2, $$1.b(dyo.w), dxz.z.a.a);
      dxy $$6 = dxz.a(dxz.d($$4, $$5), $$3).a(-1.0, 1.0);
      dxy $$7 = a($$0, N);
      dxy $$8 = dxz.b($$1.b(dyo.B), 0.75, 0.5);
      dxy $$9 = dxz.a(dxz.a($$8, dxz.a(0.37)), dxz.a(-10, 30, 0.3, 0.0));
      return dxz.d(dxz.c($$9, dxz.a($$7, $$6)));
   }

   private static dxy e(jk<dxy> $$0, jk<enk.a> $$1) {
      dxy $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dxy $$6 = a($$2, dxz.b($$1.b(dyo.I), 1.0, 1.0), -60, 320, -1);
      dxy $$7 = a($$2, dxz.a($$1.b(dyo.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dxy $$9 = a($$2, dxz.b($$1.b(dyo.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxy $$10 = a($$2, dxz.b($$1.b(dyo.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxy $$11 = dxz.b(dxz.a(1.5), dxz.d($$9.d(), $$10.d()));
      return dxz.a($$6, -1000000.0, 0.0, dxz.a(64.0), dxz.a($$7, $$11));
   }

   private static dxy c(jk<enk.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dxy $$3 = dxz.b($$0.b(dyo.o), 25.0, 0.3);
      dxy $$4 = dxz.a($$0.b(dyo.p), 0.0, -2.0);
      dxy $$5 = dxz.a($$0.b(dyo.q), 0.0, 1.1);
      dxy $$6 = dxz.a(dxz.b($$3, dxz.a(2.0)), $$4);
      return dxz.d(dxz.b($$6, $$5.f()));
   }

   private static dxy f(jk<dxy> $$0, jk<enk.a> $$1) {
      dxy $$2 = dxz.b($$1.b(dyo.t), 2.0, 1.0);
      dxy $$3 = dxz.a($$2, $$1.b(dyo.r), dxz.z.a.b);
      dxy $$4 = dxz.a($$1.b(dyo.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dxy $$5 = a($$0, R);
      dxy $$6 = dxz.a($$4, dxz.a(-64, 320, 8.0, -40.0)).d();
      dxy $$7 = dxz.a($$6, $$5).f();
      double $$8 = 0.083;
      dxy $$9 = dxz.a($$3, dxz.b(dxz.a(0.083), $$5));
      return dxz.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dxy a(jk<dxy> $$0, jk<enk.a> $$1, dxy $$2) {
      dxy $$3 = a($$0, S);
      dxy $$4 = a($$0, N);
      dxy $$5 = dxz.a($$1.b(dyo.C), 8.0);
      dxy $$6 = dxz.b(dxz.a(4.0), $$5.e());
      dxy $$7 = dxz.a($$1.b(dyo.D), 0.6666666666666666);
      dxy $$8 = dxz.a(dxz.a(dxz.a(0.27), $$7).a(-1.0, 1.0), dxz.a(dxz.a(1.5), dxz.b(dxz.a(-0.64), $$2)).a(0.0, 0.5));
      dxy $$9 = dxz.a($$6, $$8);
      dxy $$10 = dxz.c(dxz.c($$9, a($$0, O)), dxz.a($$3, $$4));
      dxy $$11 = a($$0, Q);
      dxy $$12 = dxz.a($$11, -1000000.0, 0.03, dxz.a(-1000000.0), $$11);
      return dxz.d($$10, $$12);
   }

   private static dxy b(dxy $$0) {
      dxy $$1 = dxz.f($$0);
      return dxz.b(dxz.a($$1), dxz.a(0.64)).i();
   }

   protected static dyl a(jk<dxy> $$0, jk<enk.a> $$1, boolean $$2, boolean $$3) {
      dxy $$4 = dxz.a($$1.b(dyo.k), 0.5);
      dxy $$5 = dxz.a($$1.b(dyo.l), 0.67);
      dxy $$6 = dxz.a($$1.b(dyo.n), 0.7142857142857143);
      dxy $$7 = dxz.a($$1.b(dyo.m));
      dxy $$8 = a($$0, w);
      dxy $$9 = a($$0, x);
      dxy $$10 = dxz.a($$8, $$9, 0.25, $$1.b($$2 ? dyo.e : dyo.a));
      dxy $$11 = dxz.a($$8, $$9, 0.25, $$1.b($$2 ? dyo.f : dyo.b));
      dxy $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dxy $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dxy $$14 = b(dxz.c($$12), $$13);
      dxy $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dxy $$16 = dxz.c($$15, dxz.b(dxz.a(5.0), a($$0, O)));
      dxy $$17 = dxz.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dxy $$18 = dxz.c(b(a($$3, $$17)), a($$0, P));
      dxy $$19 = a($$0, v);
      int $$20 = Stream.of(dyp.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dwf.e * 2);
      int $$21 = Stream.of(dyp.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dwf.e * 2);
      dxy $$22 = a($$19, dxz.b($$1.b(dyo.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dxy $$24 = a($$19, dxz.b($$1.b(dyo.F), 4.0, 4.0), $$20, $$21, 0).d();
      dxy $$25 = a($$19, dxz.b($$1.b(dyo.G), 4.0, 4.0), $$20, $$21, 0).d();
      dxy $$26 = dxz.a(dxz.a(-0.08F), dxz.d($$24, $$25));
      dxy $$27 = dxz.a($$1.b(dyo.H));
      return new dyl(
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
         a($$3, dxz.a($$14, dxz.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dyl b(jk<dxy> $$0, jk<enk.a> $$1, dxy $$2) {
      dxy $$3 = a($$0, w);
      dxy $$4 = a($$0, x);
      dxy $$5 = dxz.a($$3, $$4, 0.25, $$1.b(dyo.a));
      dxy $$6 = dxz.a($$3, $$4, 0.25, $$1.b(dyo.b));
      dxy $$7 = b($$2);
      return new dyl(dxz.a(), dxz.a(), dxz.a(), dxz.a(), $$5, $$6, dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), $$7, dxz.a(), dxz.a(), dxz.a());
   }

   private static dxy a(boolean $$0, dxy $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dxy a(jk<dxy> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dxy a(dxy $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dyl a(jk<dxy> $$0, jk<enk.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dyl b(jk<dxy> $$0, jk<enk.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dyl c(jk<dxy> $$0, jk<enk.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dxy c(dxy $$0) {
      return a($$0, 0, 128);
   }

   protected static dyl a(jk<dxy> $$0) {
      dxy $$1 = dxz.c(dxz.a(0L));
      dxy $$2 = b(c(a($$0, M)));
      return new dyl(
         dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), $$1, dxz.a(), dxz.a(), c(dxz.a($$1, dxz.a(-0.703125))), $$2, dxz.a(), dxz.a(), dxz.a()
      );
   }

   protected static dyl a() {
      return new dyl(dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a(), dxz.a());
   }

   private static dxy a(dxy $$0, dxy $$1) {
      dxy $$2 = dxz.a(dxz.b(), $$1, $$0);
      return dxz.b(dxz.c($$2));
   }

   private static dxy b(dxy $$0, dxy $$1) {
      dxy $$2 = dxz.b($$1, $$0);
      return dxz.b(dxz.a(4.0), $$2.h());
   }

   private static dxy a(dxy $$0, dxy $$1, int $$2, int $$3, int $$4) {
      return dxz.a(dxz.a($$0, (double)$$2, (double)($$3 + 1), $$1, dxz.a((double)$$4)));
   }

   private static dxy a(dxy $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dxy $$10 = dxz.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dxy $$9 = dxz.a($$10, $$5, $$0);
      dxy $$11 = dxz.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dxz.a($$11, $$8, $$9);
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
