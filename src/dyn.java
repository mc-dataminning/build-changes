import java.util.stream.Stream;

public class dyn {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dxz s = dya.a(10.0);
   private static final dxz t = dya.a();
   private static final akj<dxz> u = a("zero");
   private static final akj<dxz> v = a("y");
   private static final akj<dxz> w = a("shift_x");
   private static final akj<dxz> x = a("shift_z");
   private static final akj<dxz> y = a("overworld/base_3d_noise");
   private static final akj<dxz> z = a("nether/base_3d_noise");
   private static final akj<dxz> A = a("end/base_3d_noise");
   public static final akj<dxz> d = a("overworld/continents");
   public static final akj<dxz> e = a("overworld/erosion");
   public static final akj<dxz> f = a("overworld/ridges");
   public static final akj<dxz> g = a("overworld/ridges_folded");
   public static final akj<dxz> h = a("overworld/offset");
   public static final akj<dxz> i = a("overworld/factor");
   public static final akj<dxz> j = a("overworld/jaggedness");
   public static final akj<dxz> k = a("overworld/depth");
   private static final akj<dxz> B = a("overworld/sloped_cheese");
   public static final akj<dxz> l = a("overworld_large_biomes/continents");
   public static final akj<dxz> m = a("overworld_large_biomes/erosion");
   private static final akj<dxz> C = a("overworld_large_biomes/offset");
   private static final akj<dxz> D = a("overworld_large_biomes/factor");
   private static final akj<dxz> E = a("overworld_large_biomes/jaggedness");
   private static final akj<dxz> F = a("overworld_large_biomes/depth");
   private static final akj<dxz> G = a("overworld_large_biomes/sloped_cheese");
   private static final akj<dxz> H = a("overworld_amplified/offset");
   private static final akj<dxz> I = a("overworld_amplified/factor");
   private static final akj<dxz> J = a("overworld_amplified/jaggedness");
   private static final akj<dxz> K = a("overworld_amplified/depth");
   private static final akj<dxz> L = a("overworld_amplified/sloped_cheese");
   private static final akj<dxz> M = a("end/sloped_cheese");
   private static final akj<dxz> N = a("overworld/caves/spaghetti_roughness_function");
   private static final akj<dxz> O = a("overworld/caves/entrances");
   private static final akj<dxz> P = a("overworld/caves/noodle");
   private static final akj<dxz> Q = a("overworld/caves/pillars");
   private static final akj<dxz> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final akj<dxz> S = a("overworld/caves/spaghetti_2d");

   private static akj<dxz> a(String $$0) {
      return akj.a(lr.aI, new akk($$0));
   }

   public static jj<? extends dxz> a(qm<dxz> $$0) {
      jk<enm.a> $$1 = $$0.a(lr.aO);
      jk<dxz> $$2 = $$0.a(lr.aI);
      $$0.a(u, dya.a());
      int $$3 = dwg.e * 2;
      int $$4 = dwg.d * 2;
      $$0.a(v, dya.a($$3, $$4, (double)$$3, (double)$$4));
      dxz $$5 = a($$0, w, dya.b(dya.c(dya.b($$1.b(dyp.j)))));
      dxz $$6 = a($$0, x, dya.b(dya.c(dya.c($$1.b(dyp.j)))));
      $$0.a(y, enj.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, enj.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, enj.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jj<dxz> $$7 = $$0.a(d, dya.b(dya.a($$5, $$6, 0.25, $$1.b(dyp.c))));
      jj<dxz> $$8 = $$0.a(e, dya.b(dya.a($$5, $$6, 0.25, $$1.b(dyp.d))));
      dxz $$9 = a($$0, f, dya.b(dya.a($$5, $$6, 0.25, $$1.b(dyp.i))));
      $$0.a(g, a($$9));
      dxz $$10 = dya.b($$1.b(dyp.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jj<dxz> $$11 = $$0.a(l, dya.b(dya.a($$5, $$6, 0.25, $$1.b(dyp.g))));
      jj<dxz> $$12 = $$0.a(m, dya.b(dya.a($$5, $$6, 0.25, $$1.b(dyp.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dya.a(dya.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dya.d(dya.a($$1.b(dyp.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qm<dxz> $$0, jk<dxz> $$1, dxz $$2, jj<dxz> $$3, jj<dxz> $$4, akj<dxz> $$5, akj<dxz> $$6, akj<dxz> $$7, akj<dxz> $$8, akj<dxz> $$9, boolean $$10
   ) {
      dya.w.a $$11 = new dya.w.a($$3);
      dya.w.a $$12 = new dya.w.a($$4);
      dya.w.a $$13 = new dya.w.a($$1.b(f));
      dya.w.a $$14 = new dya.w.a($$1.b(g));
      dxz $$15 = a($$0, $$5, a(dya.a(dya.a(-0.50375F), dya.a(rb.a($$11, $$12, $$14, $$10))), dya.c()));
      dxz $$16 = a($$0, $$6, a(dya.a(rb.a($$11, $$12, $$13, $$14, $$10)), s));
      dxz $$17 = a($$0, $$8, dya.a(dya.a(-64, 320, 1.5, -1.5), $$15));
      dxz $$18 = a($$0, $$7, a(dya.a(rb.b($$11, $$12, $$13, $$14, $$10)), t));
      dxz $$19 = dya.b($$18, $$2.g());
      dxz $$20 = b($$16, dya.a($$17, $$19));
      $$0.a($$9, dya.a($$20, a($$1, y)));
   }

   private static dxz a(qm<dxz> $$0, akj<dxz> $$1, dxz $$2) {
      return new dya.j($$0.a($$1, $$2));
   }

   private static dxz a(jk<dxz> $$0, akj<dxz> $$1) {
      return new dya.j($$0.b($$1));
   }

   private static dxz a(dxz $$0) {
      return dya.b(dya.a(dya.a($$0.d(), dya.a(-0.6666666666666666)).d(), dya.a(-0.3333333333333333)), dya.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dxz b(jk<enm.a> $$0) {
      dxz $$1 = dya.a($$0.b(dyp.z));
      dxz $$2 = dya.a($$0.b(dyp.A), 0.0, -0.1);
      return dya.d(dya.b($$2, dya.a($$1.d(), dya.a(-0.4))));
   }

   private static dxz d(jk<dxz> $$0, jk<enm.a> $$1) {
      dxz $$2 = dya.d(dya.b($$1.b(dyp.x), 2.0, 1.0));
      dxz $$3 = dya.a($$1.b(dyp.y), -0.065, -0.088);
      dxz $$4 = dya.a($$2, $$1.b(dyp.v), dya.z.a.a);
      dxz $$5 = dya.a($$2, $$1.b(dyp.w), dya.z.a.a);
      dxz $$6 = dya.a(dya.d($$4, $$5), $$3).a(-1.0, 1.0);
      dxz $$7 = a($$0, N);
      dxz $$8 = dya.b($$1.b(dyp.B), 0.75, 0.5);
      dxz $$9 = dya.a(dya.a($$8, dya.a(0.37)), dya.a(-10, 30, 0.3, 0.0));
      return dya.d(dya.c($$9, dya.a($$7, $$6)));
   }

   private static dxz e(jk<dxz> $$0, jk<enm.a> $$1) {
      dxz $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dxz $$6 = a($$2, dya.b($$1.b(dyp.I), 1.0, 1.0), -60, 320, -1);
      dxz $$7 = a($$2, dya.a($$1.b(dyp.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dxz $$9 = a($$2, dya.b($$1.b(dyp.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxz $$10 = a($$2, dya.b($$1.b(dyp.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dxz $$11 = dya.b(dya.a(1.5), dya.d($$9.d(), $$10.d()));
      return dya.a($$6, -1000000.0, 0.0, dya.a(64.0), dya.a($$7, $$11));
   }

   private static dxz c(jk<enm.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dxz $$3 = dya.b($$0.b(dyp.o), 25.0, 0.3);
      dxz $$4 = dya.a($$0.b(dyp.p), 0.0, -2.0);
      dxz $$5 = dya.a($$0.b(dyp.q), 0.0, 1.1);
      dxz $$6 = dya.a(dya.b($$3, dya.a(2.0)), $$4);
      return dya.d(dya.b($$6, $$5.f()));
   }

   private static dxz f(jk<dxz> $$0, jk<enm.a> $$1) {
      dxz $$2 = dya.b($$1.b(dyp.t), 2.0, 1.0);
      dxz $$3 = dya.a($$2, $$1.b(dyp.r), dya.z.a.b);
      dxz $$4 = dya.a($$1.b(dyp.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dxz $$5 = a($$0, R);
      dxz $$6 = dya.a($$4, dya.a(-64, 320, 8.0, -40.0)).d();
      dxz $$7 = dya.a($$6, $$5).f();
      double $$8 = 0.083;
      dxz $$9 = dya.a($$3, dya.b(dya.a(0.083), $$5));
      return dya.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dxz a(jk<dxz> $$0, jk<enm.a> $$1, dxz $$2) {
      dxz $$3 = a($$0, S);
      dxz $$4 = a($$0, N);
      dxz $$5 = dya.a($$1.b(dyp.C), 8.0);
      dxz $$6 = dya.b(dya.a(4.0), $$5.e());
      dxz $$7 = dya.a($$1.b(dyp.D), 0.6666666666666666);
      dxz $$8 = dya.a(dya.a(dya.a(0.27), $$7).a(-1.0, 1.0), dya.a(dya.a(1.5), dya.b(dya.a(-0.64), $$2)).a(0.0, 0.5));
      dxz $$9 = dya.a($$6, $$8);
      dxz $$10 = dya.c(dya.c($$9, a($$0, O)), dya.a($$3, $$4));
      dxz $$11 = a($$0, Q);
      dxz $$12 = dya.a($$11, -1000000.0, 0.03, dya.a(-1000000.0), $$11);
      return dya.d($$10, $$12);
   }

   private static dxz b(dxz $$0) {
      dxz $$1 = dya.f($$0);
      return dya.b(dya.a($$1), dya.a(0.64)).i();
   }

   protected static dym a(jk<dxz> $$0, jk<enm.a> $$1, boolean $$2, boolean $$3) {
      dxz $$4 = dya.a($$1.b(dyp.k), 0.5);
      dxz $$5 = dya.a($$1.b(dyp.l), 0.67);
      dxz $$6 = dya.a($$1.b(dyp.n), 0.7142857142857143);
      dxz $$7 = dya.a($$1.b(dyp.m));
      dxz $$8 = a($$0, w);
      dxz $$9 = a($$0, x);
      dxz $$10 = dya.a($$8, $$9, 0.25, $$1.b($$2 ? dyp.e : dyp.a));
      dxz $$11 = dya.a($$8, $$9, 0.25, $$1.b($$2 ? dyp.f : dyp.b));
      dxz $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dxz $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dxz $$14 = b(dya.c($$12), $$13);
      dxz $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dxz $$16 = dya.c($$15, dya.b(dya.a(5.0), a($$0, O)));
      dxz $$17 = dya.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dxz $$18 = dya.c(b(a($$3, $$17)), a($$0, P));
      dxz $$19 = a($$0, v);
      int $$20 = Stream.of(dyq.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dwg.e * 2);
      int $$21 = Stream.of(dyq.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dwg.e * 2);
      dxz $$22 = a($$19, dya.b($$1.b(dyp.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dxz $$24 = a($$19, dya.b($$1.b(dyp.F), 4.0, 4.0), $$20, $$21, 0).d();
      dxz $$25 = a($$19, dya.b($$1.b(dyp.G), 4.0, 4.0), $$20, $$21, 0).d();
      dxz $$26 = dya.a(dya.a(-0.08F), dya.d($$24, $$25));
      dxz $$27 = dya.a($$1.b(dyp.H));
      return new dym(
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
         a($$3, dya.a($$14, dya.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dym b(jk<dxz> $$0, jk<enm.a> $$1, dxz $$2) {
      dxz $$3 = a($$0, w);
      dxz $$4 = a($$0, x);
      dxz $$5 = dya.a($$3, $$4, 0.25, $$1.b(dyp.a));
      dxz $$6 = dya.a($$3, $$4, 0.25, $$1.b(dyp.b));
      dxz $$7 = b($$2);
      return new dym(dya.a(), dya.a(), dya.a(), dya.a(), $$5, $$6, dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), $$7, dya.a(), dya.a(), dya.a());
   }

   private static dxz a(boolean $$0, dxz $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dxz a(jk<dxz> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dxz a(dxz $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dym a(jk<dxz> $$0, jk<enm.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dym b(jk<dxz> $$0, jk<enm.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dym c(jk<dxz> $$0, jk<enm.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dxz c(dxz $$0) {
      return a($$0, 0, 128);
   }

   protected static dym a(jk<dxz> $$0) {
      dxz $$1 = dya.c(dya.a(0L));
      dxz $$2 = b(c(a($$0, M)));
      return new dym(
         dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), $$1, dya.a(), dya.a(), c(dya.a($$1, dya.a(-0.703125))), $$2, dya.a(), dya.a(), dya.a()
      );
   }

   protected static dym a() {
      return new dym(dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), dya.a(), dya.a());
   }

   private static dxz a(dxz $$0, dxz $$1) {
      dxz $$2 = dya.a(dya.b(), $$1, $$0);
      return dya.b(dya.c($$2));
   }

   private static dxz b(dxz $$0, dxz $$1) {
      dxz $$2 = dya.b($$1, $$0);
      return dya.b(dya.a(4.0), $$2.h());
   }

   private static dxz a(dxz $$0, dxz $$1, int $$2, int $$3, int $$4) {
      return dya.a(dya.a($$0, (double)$$2, (double)($$3 + 1), $$1, dya.a((double)$$4)));
   }

   private static dxz a(dxz $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dxz $$10 = dya.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dxz $$9 = dya.a($$10, $$5, $$0);
      dxz $$11 = dya.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dya.a($$11, $$8, $$9);
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
