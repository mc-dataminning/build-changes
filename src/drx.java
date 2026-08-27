import java.util.stream.Stream;

public class drx {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final drj s = drk.a(10.0);
   private static final drj t = drk.a();
   private static final ajb<drj> u = a("zero");
   private static final ajb<drj> v = a("y");
   private static final ajb<drj> w = a("shift_x");
   private static final ajb<drj> x = a("shift_z");
   private static final ajb<drj> y = a("overworld/base_3d_noise");
   private static final ajb<drj> z = a("nether/base_3d_noise");
   private static final ajb<drj> A = a("end/base_3d_noise");
   public static final ajb<drj> d = a("overworld/continents");
   public static final ajb<drj> e = a("overworld/erosion");
   public static final ajb<drj> f = a("overworld/ridges");
   public static final ajb<drj> g = a("overworld/ridges_folded");
   public static final ajb<drj> h = a("overworld/offset");
   public static final ajb<drj> i = a("overworld/factor");
   public static final ajb<drj> j = a("overworld/jaggedness");
   public static final ajb<drj> k = a("overworld/depth");
   private static final ajb<drj> B = a("overworld/sloped_cheese");
   public static final ajb<drj> l = a("overworld_large_biomes/continents");
   public static final ajb<drj> m = a("overworld_large_biomes/erosion");
   private static final ajb<drj> C = a("overworld_large_biomes/offset");
   private static final ajb<drj> D = a("overworld_large_biomes/factor");
   private static final ajb<drj> E = a("overworld_large_biomes/jaggedness");
   private static final ajb<drj> F = a("overworld_large_biomes/depth");
   private static final ajb<drj> G = a("overworld_large_biomes/sloped_cheese");
   private static final ajb<drj> H = a("overworld_amplified/offset");
   private static final ajb<drj> I = a("overworld_amplified/factor");
   private static final ajb<drj> J = a("overworld_amplified/jaggedness");
   private static final ajb<drj> K = a("overworld_amplified/depth");
   private static final ajb<drj> L = a("overworld_amplified/sloped_cheese");
   private static final ajb<drj> M = a("end/sloped_cheese");
   private static final ajb<drj> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ajb<drj> O = a("overworld/caves/entrances");
   private static final ajb<drj> P = a("overworld/caves/noodle");
   private static final ajb<drj> Q = a("overworld/caves/pillars");
   private static final ajb<drj> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ajb<drj> S = a("overworld/caves/spaghetti_2d");

   private static ajb<drj> a(String $$0) {
      return ajb.a(ki.ay, new ajc($$0));
   }

   public static il<? extends drj> a(pj<drj> $$0) {
      im<egu.a> $$1 = $$0.a(ki.aC);
      im<drj> $$2 = $$0.a(ki.ay);
      $$0.a(u, drk.a());
      int $$3 = dpq.e * 2;
      int $$4 = dpq.d * 2;
      $$0.a(v, drk.a($$3, $$4, (double)$$3, (double)$$4));
      drj $$5 = a($$0, w, drk.b(drk.c(drk.b($$1.b(drz.j)))));
      drj $$6 = a($$0, x, drk.b(drk.c(drk.c($$1.b(drz.j)))));
      $$0.a(y, egr.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, egr.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, egr.a(0.25, 0.25, 80.0, 160.0, 4.0));
      il<drj> $$7 = $$0.a(d, drk.b(drk.a($$5, $$6, 0.25, $$1.b(drz.c))));
      il<drj> $$8 = $$0.a(e, drk.b(drk.a($$5, $$6, 0.25, $$1.b(drz.d))));
      drj $$9 = a($$0, f, drk.b(drk.a($$5, $$6, 0.25, $$1.b(drz.i))));
      $$0.a(g, a($$9));
      drj $$10 = drk.b($$1.b(drz.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      il<drj> $$11 = $$0.a(l, drk.b(drk.a($$5, $$6, 0.25, $$1.b(drz.g))));
      il<drj> $$12 = $$0.a(m, drk.b(drk.a($$5, $$6, 0.25, $$1.b(drz.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, drk.a(drk.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, drk.d(drk.a($$1.b(drz.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      pj<drj> $$0, im<drj> $$1, drj $$2, il<drj> $$3, il<drj> $$4, ajb<drj> $$5, ajb<drj> $$6, ajb<drj> $$7, ajb<drj> $$8, ajb<drj> $$9, boolean $$10
   ) {
      drk.w.a $$11 = new drk.w.a($$3);
      drk.w.a $$12 = new drk.w.a($$4);
      drk.w.a $$13 = new drk.w.a($$1.b(f));
      drk.w.a $$14 = new drk.w.a($$1.b(g));
      drj $$15 = a($$0, $$5, a(drk.a(drk.a(-0.50375F), drk.a(py.a($$11, $$12, $$14, $$10))), drk.c()));
      drj $$16 = a($$0, $$6, a(drk.a(py.a($$11, $$12, $$13, $$14, $$10)), s));
      drj $$17 = a($$0, $$8, drk.a(drk.a(-64, 320, 1.5, -1.5), $$15));
      drj $$18 = a($$0, $$7, a(drk.a(py.b($$11, $$12, $$13, $$14, $$10)), t));
      drj $$19 = drk.b($$18, $$2.g());
      drj $$20 = b($$16, drk.a($$17, $$19));
      $$0.a($$9, drk.a($$20, a($$1, y)));
   }

   private static drj a(pj<drj> $$0, ajb<drj> $$1, drj $$2) {
      return new drk.j($$0.a($$1, $$2));
   }

   private static drj a(im<drj> $$0, ajb<drj> $$1) {
      return new drk.j($$0.b($$1));
   }

   private static drj a(drj $$0) {
      return drk.b(drk.a(drk.a($$0.d(), drk.a(-0.6666666666666666)).d(), drk.a(-0.3333333333333333)), drk.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static drj b(im<egu.a> $$0) {
      drj $$1 = drk.a($$0.b(drz.z));
      drj $$2 = drk.a($$0.b(drz.A), 0.0, -0.1);
      return drk.d(drk.b($$2, drk.a($$1.d(), drk.a(-0.4))));
   }

   private static drj d(im<drj> $$0, im<egu.a> $$1) {
      drj $$2 = drk.d(drk.b($$1.b(drz.x), 2.0, 1.0));
      drj $$3 = drk.a($$1.b(drz.y), -0.065, -0.088);
      drj $$4 = drk.a($$2, $$1.b(drz.v), drk.z.a.a);
      drj $$5 = drk.a($$2, $$1.b(drz.w), drk.z.a.a);
      drj $$6 = drk.a(drk.d($$4, $$5), $$3).a(-1.0, 1.0);
      drj $$7 = a($$0, N);
      drj $$8 = drk.b($$1.b(drz.B), 0.75, 0.5);
      drj $$9 = drk.a(drk.a($$8, drk.a(0.37)), drk.a(-10, 30, 0.3, 0.0));
      return drk.d(drk.c($$9, drk.a($$7, $$6)));
   }

   private static drj e(im<drj> $$0, im<egu.a> $$1) {
      drj $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      drj $$6 = a($$2, drk.b($$1.b(drz.I), 1.0, 1.0), -60, 320, -1);
      drj $$7 = a($$2, drk.a($$1.b(drz.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      drj $$9 = a($$2, drk.b($$1.b(drz.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      drj $$10 = a($$2, drk.b($$1.b(drz.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      drj $$11 = drk.b(drk.a(1.5), drk.d($$9.d(), $$10.d()));
      return drk.a($$6, -1000000.0, 0.0, drk.a(64.0), drk.a($$7, $$11));
   }

   private static drj c(im<egu.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      drj $$3 = drk.b($$0.b(drz.o), 25.0, 0.3);
      drj $$4 = drk.a($$0.b(drz.p), 0.0, -2.0);
      drj $$5 = drk.a($$0.b(drz.q), 0.0, 1.1);
      drj $$6 = drk.a(drk.b($$3, drk.a(2.0)), $$4);
      return drk.d(drk.b($$6, $$5.f()));
   }

   private static drj f(im<drj> $$0, im<egu.a> $$1) {
      drj $$2 = drk.b($$1.b(drz.t), 2.0, 1.0);
      drj $$3 = drk.a($$2, $$1.b(drz.r), drk.z.a.b);
      drj $$4 = drk.a($$1.b(drz.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      drj $$5 = a($$0, R);
      drj $$6 = drk.a($$4, drk.a(-64, 320, 8.0, -40.0)).d();
      drj $$7 = drk.a($$6, $$5).f();
      double $$8 = 0.083;
      drj $$9 = drk.a($$3, drk.b(drk.a(0.083), $$5));
      return drk.d($$9, $$7).a(-1.0, 1.0);
   }

   private static drj a(im<drj> $$0, im<egu.a> $$1, drj $$2) {
      drj $$3 = a($$0, S);
      drj $$4 = a($$0, N);
      drj $$5 = drk.a($$1.b(drz.C), 8.0);
      drj $$6 = drk.b(drk.a(4.0), $$5.e());
      drj $$7 = drk.a($$1.b(drz.D), 0.6666666666666666);
      drj $$8 = drk.a(drk.a(drk.a(0.27), $$7).a(-1.0, 1.0), drk.a(drk.a(1.5), drk.b(drk.a(-0.64), $$2)).a(0.0, 0.5));
      drj $$9 = drk.a($$6, $$8);
      drj $$10 = drk.c(drk.c($$9, a($$0, O)), drk.a($$3, $$4));
      drj $$11 = a($$0, Q);
      drj $$12 = drk.a($$11, -1000000.0, 0.03, drk.a(-1000000.0), $$11);
      return drk.d($$10, $$12);
   }

   private static drj b(drj $$0) {
      drj $$1 = drk.f($$0);
      return drk.b(drk.a($$1), drk.a(0.64)).i();
   }

   protected static drw a(im<drj> $$0, im<egu.a> $$1, boolean $$2, boolean $$3) {
      drj $$4 = drk.a($$1.b(drz.k), 0.5);
      drj $$5 = drk.a($$1.b(drz.l), 0.67);
      drj $$6 = drk.a($$1.b(drz.n), 0.7142857142857143);
      drj $$7 = drk.a($$1.b(drz.m));
      drj $$8 = a($$0, w);
      drj $$9 = a($$0, x);
      drj $$10 = drk.a($$8, $$9, 0.25, $$1.b($$2 ? drz.e : drz.a));
      drj $$11 = drk.a($$8, $$9, 0.25, $$1.b($$2 ? drz.f : drz.b));
      drj $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      drj $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      drj $$14 = b(drk.c($$12), $$13);
      drj $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      drj $$16 = drk.c($$15, drk.b(drk.a(5.0), a($$0, O)));
      drj $$17 = drk.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      drj $$18 = drk.c(b(a($$3, $$17)), a($$0, P));
      drj $$19 = a($$0, v);
      int $$20 = Stream.of(dsa.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dpq.e * 2);
      int $$21 = Stream.of(dsa.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dpq.e * 2);
      drj $$22 = a($$19, drk.b($$1.b(drz.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      drj $$24 = a($$19, drk.b($$1.b(drz.F), 4.0, 4.0), $$20, $$21, 0).d();
      drj $$25 = a($$19, drk.b($$1.b(drz.G), 4.0, 4.0), $$20, $$21, 0).d();
      drj $$26 = drk.a(drk.a(-0.08F), drk.d($$24, $$25));
      drj $$27 = drk.a($$1.b(drz.H));
      return new drw(
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
         a($$3, drk.a($$14, drk.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static drw b(im<drj> $$0, im<egu.a> $$1, drj $$2) {
      drj $$3 = a($$0, w);
      drj $$4 = a($$0, x);
      drj $$5 = drk.a($$3, $$4, 0.25, $$1.b(drz.a));
      drj $$6 = drk.a($$3, $$4, 0.25, $$1.b(drz.b));
      drj $$7 = b($$2);
      return new drw(drk.a(), drk.a(), drk.a(), drk.a(), $$5, $$6, drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), $$7, drk.a(), drk.a(), drk.a());
   }

   private static drj a(boolean $$0, drj $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static drj a(im<drj> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static drj a(drj $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static drw a(im<drj> $$0, im<egu.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static drw b(im<drj> $$0, im<egu.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static drw c(im<drj> $$0, im<egu.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static drj c(drj $$0) {
      return a($$0, 0, 128);
   }

   protected static drw a(im<drj> $$0) {
      drj $$1 = drk.c(drk.a(0L));
      drj $$2 = b(c(a($$0, M)));
      return new drw(
         drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), $$1, drk.a(), drk.a(), c(drk.a($$1, drk.a(-0.703125))), $$2, drk.a(), drk.a(), drk.a()
      );
   }

   protected static drw a() {
      return new drw(drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), drk.a(), drk.a());
   }

   private static drj a(drj $$0, drj $$1) {
      drj $$2 = drk.a(drk.b(), $$1, $$0);
      return drk.b(drk.c($$2));
   }

   private static drj b(drj $$0, drj $$1) {
      drj $$2 = drk.b($$1, $$0);
      return drk.b(drk.a(4.0), $$2.h());
   }

   private static drj a(drj $$0, drj $$1, int $$2, int $$3, int $$4) {
      return drk.a(drk.a($$0, (double)$$2, (double)($$3 + 1), $$1, drk.a((double)$$4)));
   }

   private static drj a(drj $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      drj $$10 = drk.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      drj $$9 = drk.a($$10, $$5, $$0);
      drj $$11 = drk.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return drk.a($$11, $$8, $$9);
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
