import java.util.stream.Stream;

public class dsv {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dsh s = dsi.a(10.0);
   private static final dsh t = dsi.a();
   private static final ajg<dsh> u = a("zero");
   private static final ajg<dsh> v = a("y");
   private static final ajg<dsh> w = a("shift_x");
   private static final ajg<dsh> x = a("shift_z");
   private static final ajg<dsh> y = a("overworld/base_3d_noise");
   private static final ajg<dsh> z = a("nether/base_3d_noise");
   private static final ajg<dsh> A = a("end/base_3d_noise");
   public static final ajg<dsh> d = a("overworld/continents");
   public static final ajg<dsh> e = a("overworld/erosion");
   public static final ajg<dsh> f = a("overworld/ridges");
   public static final ajg<dsh> g = a("overworld/ridges_folded");
   public static final ajg<dsh> h = a("overworld/offset");
   public static final ajg<dsh> i = a("overworld/factor");
   public static final ajg<dsh> j = a("overworld/jaggedness");
   public static final ajg<dsh> k = a("overworld/depth");
   private static final ajg<dsh> B = a("overworld/sloped_cheese");
   public static final ajg<dsh> l = a("overworld_large_biomes/continents");
   public static final ajg<dsh> m = a("overworld_large_biomes/erosion");
   private static final ajg<dsh> C = a("overworld_large_biomes/offset");
   private static final ajg<dsh> D = a("overworld_large_biomes/factor");
   private static final ajg<dsh> E = a("overworld_large_biomes/jaggedness");
   private static final ajg<dsh> F = a("overworld_large_biomes/depth");
   private static final ajg<dsh> G = a("overworld_large_biomes/sloped_cheese");
   private static final ajg<dsh> H = a("overworld_amplified/offset");
   private static final ajg<dsh> I = a("overworld_amplified/factor");
   private static final ajg<dsh> J = a("overworld_amplified/jaggedness");
   private static final ajg<dsh> K = a("overworld_amplified/depth");
   private static final ajg<dsh> L = a("overworld_amplified/sloped_cheese");
   private static final ajg<dsh> M = a("end/sloped_cheese");
   private static final ajg<dsh> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ajg<dsh> O = a("overworld/caves/entrances");
   private static final ajg<dsh> P = a("overworld/caves/noodle");
   private static final ajg<dsh> Q = a("overworld/caves/pillars");
   private static final ajg<dsh> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ajg<dsh> S = a("overworld/caves/spaghetti_2d");

   private static ajg<dsh> a(String $$0) {
      return ajg.a(kj.ay, new ajh($$0));
   }

   public static il<? extends dsh> a(pl<dsh> $$0) {
      im<ehs.a> $$1 = $$0.a(kj.aC);
      im<dsh> $$2 = $$0.a(kj.ay);
      $$0.a(u, dsi.a());
      int $$3 = dqo.e * 2;
      int $$4 = dqo.d * 2;
      $$0.a(v, dsi.a($$3, $$4, (double)$$3, (double)$$4));
      dsh $$5 = a($$0, w, dsi.b(dsi.c(dsi.b($$1.b(dsx.j)))));
      dsh $$6 = a($$0, x, dsi.b(dsi.c(dsi.c($$1.b(dsx.j)))));
      $$0.a(y, ehp.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ehp.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ehp.a(0.25, 0.25, 80.0, 160.0, 4.0));
      il<dsh> $$7 = $$0.a(d, dsi.b(dsi.a($$5, $$6, 0.25, $$1.b(dsx.c))));
      il<dsh> $$8 = $$0.a(e, dsi.b(dsi.a($$5, $$6, 0.25, $$1.b(dsx.d))));
      dsh $$9 = a($$0, f, dsi.b(dsi.a($$5, $$6, 0.25, $$1.b(dsx.i))));
      $$0.a(g, a($$9));
      dsh $$10 = dsi.b($$1.b(dsx.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      il<dsh> $$11 = $$0.a(l, dsi.b(dsi.a($$5, $$6, 0.25, $$1.b(dsx.g))));
      il<dsh> $$12 = $$0.a(m, dsi.b(dsi.a($$5, $$6, 0.25, $$1.b(dsx.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dsi.a(dsi.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dsi.d(dsi.a($$1.b(dsx.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      pl<dsh> $$0, im<dsh> $$1, dsh $$2, il<dsh> $$3, il<dsh> $$4, ajg<dsh> $$5, ajg<dsh> $$6, ajg<dsh> $$7, ajg<dsh> $$8, ajg<dsh> $$9, boolean $$10
   ) {
      dsi.w.a $$11 = new dsi.w.a($$3);
      dsi.w.a $$12 = new dsi.w.a($$4);
      dsi.w.a $$13 = new dsi.w.a($$1.b(f));
      dsi.w.a $$14 = new dsi.w.a($$1.b(g));
      dsh $$15 = a($$0, $$5, a(dsi.a(dsi.a(-0.50375F), dsi.a(qa.a($$11, $$12, $$14, $$10))), dsi.c()));
      dsh $$16 = a($$0, $$6, a(dsi.a(qa.a($$11, $$12, $$13, $$14, $$10)), s));
      dsh $$17 = a($$0, $$8, dsi.a(dsi.a(-64, 320, 1.5, -1.5), $$15));
      dsh $$18 = a($$0, $$7, a(dsi.a(qa.b($$11, $$12, $$13, $$14, $$10)), t));
      dsh $$19 = dsi.b($$18, $$2.g());
      dsh $$20 = b($$16, dsi.a($$17, $$19));
      $$0.a($$9, dsi.a($$20, a($$1, y)));
   }

   private static dsh a(pl<dsh> $$0, ajg<dsh> $$1, dsh $$2) {
      return new dsi.j($$0.a($$1, $$2));
   }

   private static dsh a(im<dsh> $$0, ajg<dsh> $$1) {
      return new dsi.j($$0.b($$1));
   }

   private static dsh a(dsh $$0) {
      return dsi.b(dsi.a(dsi.a($$0.d(), dsi.a(-0.6666666666666666)).d(), dsi.a(-0.3333333333333333)), dsi.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dsh b(im<ehs.a> $$0) {
      dsh $$1 = dsi.a($$0.b(dsx.z));
      dsh $$2 = dsi.a($$0.b(dsx.A), 0.0, -0.1);
      return dsi.d(dsi.b($$2, dsi.a($$1.d(), dsi.a(-0.4))));
   }

   private static dsh d(im<dsh> $$0, im<ehs.a> $$1) {
      dsh $$2 = dsi.d(dsi.b($$1.b(dsx.x), 2.0, 1.0));
      dsh $$3 = dsi.a($$1.b(dsx.y), -0.065, -0.088);
      dsh $$4 = dsi.a($$2, $$1.b(dsx.v), dsi.z.a.a);
      dsh $$5 = dsi.a($$2, $$1.b(dsx.w), dsi.z.a.a);
      dsh $$6 = dsi.a(dsi.d($$4, $$5), $$3).a(-1.0, 1.0);
      dsh $$7 = a($$0, N);
      dsh $$8 = dsi.b($$1.b(dsx.B), 0.75, 0.5);
      dsh $$9 = dsi.a(dsi.a($$8, dsi.a(0.37)), dsi.a(-10, 30, 0.3, 0.0));
      return dsi.d(dsi.c($$9, dsi.a($$7, $$6)));
   }

   private static dsh e(im<dsh> $$0, im<ehs.a> $$1) {
      dsh $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dsh $$6 = a($$2, dsi.b($$1.b(dsx.I), 1.0, 1.0), -60, 320, -1);
      dsh $$7 = a($$2, dsi.a($$1.b(dsx.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dsh $$9 = a($$2, dsi.b($$1.b(dsx.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dsh $$10 = a($$2, dsi.b($$1.b(dsx.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dsh $$11 = dsi.b(dsi.a(1.5), dsi.d($$9.d(), $$10.d()));
      return dsi.a($$6, -1000000.0, 0.0, dsi.a(64.0), dsi.a($$7, $$11));
   }

   private static dsh c(im<ehs.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dsh $$3 = dsi.b($$0.b(dsx.o), 25.0, 0.3);
      dsh $$4 = dsi.a($$0.b(dsx.p), 0.0, -2.0);
      dsh $$5 = dsi.a($$0.b(dsx.q), 0.0, 1.1);
      dsh $$6 = dsi.a(dsi.b($$3, dsi.a(2.0)), $$4);
      return dsi.d(dsi.b($$6, $$5.f()));
   }

   private static dsh f(im<dsh> $$0, im<ehs.a> $$1) {
      dsh $$2 = dsi.b($$1.b(dsx.t), 2.0, 1.0);
      dsh $$3 = dsi.a($$2, $$1.b(dsx.r), dsi.z.a.b);
      dsh $$4 = dsi.a($$1.b(dsx.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dsh $$5 = a($$0, R);
      dsh $$6 = dsi.a($$4, dsi.a(-64, 320, 8.0, -40.0)).d();
      dsh $$7 = dsi.a($$6, $$5).f();
      double $$8 = 0.083;
      dsh $$9 = dsi.a($$3, dsi.b(dsi.a(0.083), $$5));
      return dsi.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dsh a(im<dsh> $$0, im<ehs.a> $$1, dsh $$2) {
      dsh $$3 = a($$0, S);
      dsh $$4 = a($$0, N);
      dsh $$5 = dsi.a($$1.b(dsx.C), 8.0);
      dsh $$6 = dsi.b(dsi.a(4.0), $$5.e());
      dsh $$7 = dsi.a($$1.b(dsx.D), 0.6666666666666666);
      dsh $$8 = dsi.a(dsi.a(dsi.a(0.27), $$7).a(-1.0, 1.0), dsi.a(dsi.a(1.5), dsi.b(dsi.a(-0.64), $$2)).a(0.0, 0.5));
      dsh $$9 = dsi.a($$6, $$8);
      dsh $$10 = dsi.c(dsi.c($$9, a($$0, O)), dsi.a($$3, $$4));
      dsh $$11 = a($$0, Q);
      dsh $$12 = dsi.a($$11, -1000000.0, 0.03, dsi.a(-1000000.0), $$11);
      return dsi.d($$10, $$12);
   }

   private static dsh b(dsh $$0) {
      dsh $$1 = dsi.f($$0);
      return dsi.b(dsi.a($$1), dsi.a(0.64)).i();
   }

   protected static dsu a(im<dsh> $$0, im<ehs.a> $$1, boolean $$2, boolean $$3) {
      dsh $$4 = dsi.a($$1.b(dsx.k), 0.5);
      dsh $$5 = dsi.a($$1.b(dsx.l), 0.67);
      dsh $$6 = dsi.a($$1.b(dsx.n), 0.7142857142857143);
      dsh $$7 = dsi.a($$1.b(dsx.m));
      dsh $$8 = a($$0, w);
      dsh $$9 = a($$0, x);
      dsh $$10 = dsi.a($$8, $$9, 0.25, $$1.b($$2 ? dsx.e : dsx.a));
      dsh $$11 = dsi.a($$8, $$9, 0.25, $$1.b($$2 ? dsx.f : dsx.b));
      dsh $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dsh $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dsh $$14 = b(dsi.c($$12), $$13);
      dsh $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dsh $$16 = dsi.c($$15, dsi.b(dsi.a(5.0), a($$0, O)));
      dsh $$17 = dsi.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dsh $$18 = dsi.c(b(a($$3, $$17)), a($$0, P));
      dsh $$19 = a($$0, v);
      int $$20 = Stream.of(dsy.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dqo.e * 2);
      int $$21 = Stream.of(dsy.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dqo.e * 2);
      dsh $$22 = a($$19, dsi.b($$1.b(dsx.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dsh $$24 = a($$19, dsi.b($$1.b(dsx.F), 4.0, 4.0), $$20, $$21, 0).d();
      dsh $$25 = a($$19, dsi.b($$1.b(dsx.G), 4.0, 4.0), $$20, $$21, 0).d();
      dsh $$26 = dsi.a(dsi.a(-0.08F), dsi.d($$24, $$25));
      dsh $$27 = dsi.a($$1.b(dsx.H));
      return new dsu(
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
         a($$3, dsi.a($$14, dsi.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dsu b(im<dsh> $$0, im<ehs.a> $$1, dsh $$2) {
      dsh $$3 = a($$0, w);
      dsh $$4 = a($$0, x);
      dsh $$5 = dsi.a($$3, $$4, 0.25, $$1.b(dsx.a));
      dsh $$6 = dsi.a($$3, $$4, 0.25, $$1.b(dsx.b));
      dsh $$7 = b($$2);
      return new dsu(dsi.a(), dsi.a(), dsi.a(), dsi.a(), $$5, $$6, dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), $$7, dsi.a(), dsi.a(), dsi.a());
   }

   private static dsh a(boolean $$0, dsh $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dsh a(im<dsh> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dsh a(dsh $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dsu a(im<dsh> $$0, im<ehs.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dsu b(im<dsh> $$0, im<ehs.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dsu c(im<dsh> $$0, im<ehs.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dsh c(dsh $$0) {
      return a($$0, 0, 128);
   }

   protected static dsu a(im<dsh> $$0) {
      dsh $$1 = dsi.c(dsi.a(0L));
      dsh $$2 = b(c(a($$0, M)));
      return new dsu(
         dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), $$1, dsi.a(), dsi.a(), c(dsi.a($$1, dsi.a(-0.703125))), $$2, dsi.a(), dsi.a(), dsi.a()
      );
   }

   protected static dsu a() {
      return new dsu(dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a(), dsi.a());
   }

   private static dsh a(dsh $$0, dsh $$1) {
      dsh $$2 = dsi.a(dsi.b(), $$1, $$0);
      return dsi.b(dsi.c($$2));
   }

   private static dsh b(dsh $$0, dsh $$1) {
      dsh $$2 = dsi.b($$1, $$0);
      return dsi.b(dsi.a(4.0), $$2.h());
   }

   private static dsh a(dsh $$0, dsh $$1, int $$2, int $$3, int $$4) {
      return dsi.a(dsi.a($$0, (double)$$2, (double)($$3 + 1), $$1, dsi.a((double)$$4)));
   }

   private static dsh a(dsh $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dsh $$10 = dsi.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dsh $$9 = dsi.a($$10, $$5, $$0);
      dsh $$11 = dsi.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dsi.a($$11, $$8, $$9);
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
