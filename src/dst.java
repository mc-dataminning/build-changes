import java.util.stream.Stream;

public class dst {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dsf s = dsg.a(10.0);
   private static final dsf t = dsg.a();
   private static final ajg<dsf> u = a("zero");
   private static final ajg<dsf> v = a("y");
   private static final ajg<dsf> w = a("shift_x");
   private static final ajg<dsf> x = a("shift_z");
   private static final ajg<dsf> y = a("overworld/base_3d_noise");
   private static final ajg<dsf> z = a("nether/base_3d_noise");
   private static final ajg<dsf> A = a("end/base_3d_noise");
   public static final ajg<dsf> d = a("overworld/continents");
   public static final ajg<dsf> e = a("overworld/erosion");
   public static final ajg<dsf> f = a("overworld/ridges");
   public static final ajg<dsf> g = a("overworld/ridges_folded");
   public static final ajg<dsf> h = a("overworld/offset");
   public static final ajg<dsf> i = a("overworld/factor");
   public static final ajg<dsf> j = a("overworld/jaggedness");
   public static final ajg<dsf> k = a("overworld/depth");
   private static final ajg<dsf> B = a("overworld/sloped_cheese");
   public static final ajg<dsf> l = a("overworld_large_biomes/continents");
   public static final ajg<dsf> m = a("overworld_large_biomes/erosion");
   private static final ajg<dsf> C = a("overworld_large_biomes/offset");
   private static final ajg<dsf> D = a("overworld_large_biomes/factor");
   private static final ajg<dsf> E = a("overworld_large_biomes/jaggedness");
   private static final ajg<dsf> F = a("overworld_large_biomes/depth");
   private static final ajg<dsf> G = a("overworld_large_biomes/sloped_cheese");
   private static final ajg<dsf> H = a("overworld_amplified/offset");
   private static final ajg<dsf> I = a("overworld_amplified/factor");
   private static final ajg<dsf> J = a("overworld_amplified/jaggedness");
   private static final ajg<dsf> K = a("overworld_amplified/depth");
   private static final ajg<dsf> L = a("overworld_amplified/sloped_cheese");
   private static final ajg<dsf> M = a("end/sloped_cheese");
   private static final ajg<dsf> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ajg<dsf> O = a("overworld/caves/entrances");
   private static final ajg<dsf> P = a("overworld/caves/noodle");
   private static final ajg<dsf> Q = a("overworld/caves/pillars");
   private static final ajg<dsf> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ajg<dsf> S = a("overworld/caves/spaghetti_2d");

   private static ajg<dsf> a(String $$0) {
      return ajg.a(kj.ay, new ajh($$0));
   }

   public static il<? extends dsf> a(pl<dsf> $$0) {
      im<ehq.a> $$1 = $$0.a(kj.aC);
      im<dsf> $$2 = $$0.a(kj.ay);
      $$0.a(u, dsg.a());
      int $$3 = dqm.e * 2;
      int $$4 = dqm.d * 2;
      $$0.a(v, dsg.a($$3, $$4, (double)$$3, (double)$$4));
      dsf $$5 = a($$0, w, dsg.b(dsg.c(dsg.b($$1.b(dsv.j)))));
      dsf $$6 = a($$0, x, dsg.b(dsg.c(dsg.c($$1.b(dsv.j)))));
      $$0.a(y, ehn.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ehn.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ehn.a(0.25, 0.25, 80.0, 160.0, 4.0));
      il<dsf> $$7 = $$0.a(d, dsg.b(dsg.a($$5, $$6, 0.25, $$1.b(dsv.c))));
      il<dsf> $$8 = $$0.a(e, dsg.b(dsg.a($$5, $$6, 0.25, $$1.b(dsv.d))));
      dsf $$9 = a($$0, f, dsg.b(dsg.a($$5, $$6, 0.25, $$1.b(dsv.i))));
      $$0.a(g, a($$9));
      dsf $$10 = dsg.b($$1.b(dsv.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      il<dsf> $$11 = $$0.a(l, dsg.b(dsg.a($$5, $$6, 0.25, $$1.b(dsv.g))));
      il<dsf> $$12 = $$0.a(m, dsg.b(dsg.a($$5, $$6, 0.25, $$1.b(dsv.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dsg.a(dsg.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dsg.d(dsg.a($$1.b(dsv.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      pl<dsf> $$0, im<dsf> $$1, dsf $$2, il<dsf> $$3, il<dsf> $$4, ajg<dsf> $$5, ajg<dsf> $$6, ajg<dsf> $$7, ajg<dsf> $$8, ajg<dsf> $$9, boolean $$10
   ) {
      dsg.w.a $$11 = new dsg.w.a($$3);
      dsg.w.a $$12 = new dsg.w.a($$4);
      dsg.w.a $$13 = new dsg.w.a($$1.b(f));
      dsg.w.a $$14 = new dsg.w.a($$1.b(g));
      dsf $$15 = a($$0, $$5, a(dsg.a(dsg.a(-0.50375F), dsg.a(qa.a($$11, $$12, $$14, $$10))), dsg.c()));
      dsf $$16 = a($$0, $$6, a(dsg.a(qa.a($$11, $$12, $$13, $$14, $$10)), s));
      dsf $$17 = a($$0, $$8, dsg.a(dsg.a(-64, 320, 1.5, -1.5), $$15));
      dsf $$18 = a($$0, $$7, a(dsg.a(qa.b($$11, $$12, $$13, $$14, $$10)), t));
      dsf $$19 = dsg.b($$18, $$2.g());
      dsf $$20 = b($$16, dsg.a($$17, $$19));
      $$0.a($$9, dsg.a($$20, a($$1, y)));
   }

   private static dsf a(pl<dsf> $$0, ajg<dsf> $$1, dsf $$2) {
      return new dsg.j($$0.a($$1, $$2));
   }

   private static dsf a(im<dsf> $$0, ajg<dsf> $$1) {
      return new dsg.j($$0.b($$1));
   }

   private static dsf a(dsf $$0) {
      return dsg.b(dsg.a(dsg.a($$0.d(), dsg.a(-0.6666666666666666)).d(), dsg.a(-0.3333333333333333)), dsg.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dsf b(im<ehq.a> $$0) {
      dsf $$1 = dsg.a($$0.b(dsv.z));
      dsf $$2 = dsg.a($$0.b(dsv.A), 0.0, -0.1);
      return dsg.d(dsg.b($$2, dsg.a($$1.d(), dsg.a(-0.4))));
   }

   private static dsf d(im<dsf> $$0, im<ehq.a> $$1) {
      dsf $$2 = dsg.d(dsg.b($$1.b(dsv.x), 2.0, 1.0));
      dsf $$3 = dsg.a($$1.b(dsv.y), -0.065, -0.088);
      dsf $$4 = dsg.a($$2, $$1.b(dsv.v), dsg.z.a.a);
      dsf $$5 = dsg.a($$2, $$1.b(dsv.w), dsg.z.a.a);
      dsf $$6 = dsg.a(dsg.d($$4, $$5), $$3).a(-1.0, 1.0);
      dsf $$7 = a($$0, N);
      dsf $$8 = dsg.b($$1.b(dsv.B), 0.75, 0.5);
      dsf $$9 = dsg.a(dsg.a($$8, dsg.a(0.37)), dsg.a(-10, 30, 0.3, 0.0));
      return dsg.d(dsg.c($$9, dsg.a($$7, $$6)));
   }

   private static dsf e(im<dsf> $$0, im<ehq.a> $$1) {
      dsf $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dsf $$6 = a($$2, dsg.b($$1.b(dsv.I), 1.0, 1.0), -60, 320, -1);
      dsf $$7 = a($$2, dsg.a($$1.b(dsv.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dsf $$9 = a($$2, dsg.b($$1.b(dsv.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dsf $$10 = a($$2, dsg.b($$1.b(dsv.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dsf $$11 = dsg.b(dsg.a(1.5), dsg.d($$9.d(), $$10.d()));
      return dsg.a($$6, -1000000.0, 0.0, dsg.a(64.0), dsg.a($$7, $$11));
   }

   private static dsf c(im<ehq.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dsf $$3 = dsg.b($$0.b(dsv.o), 25.0, 0.3);
      dsf $$4 = dsg.a($$0.b(dsv.p), 0.0, -2.0);
      dsf $$5 = dsg.a($$0.b(dsv.q), 0.0, 1.1);
      dsf $$6 = dsg.a(dsg.b($$3, dsg.a(2.0)), $$4);
      return dsg.d(dsg.b($$6, $$5.f()));
   }

   private static dsf f(im<dsf> $$0, im<ehq.a> $$1) {
      dsf $$2 = dsg.b($$1.b(dsv.t), 2.0, 1.0);
      dsf $$3 = dsg.a($$2, $$1.b(dsv.r), dsg.z.a.b);
      dsf $$4 = dsg.a($$1.b(dsv.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dsf $$5 = a($$0, R);
      dsf $$6 = dsg.a($$4, dsg.a(-64, 320, 8.0, -40.0)).d();
      dsf $$7 = dsg.a($$6, $$5).f();
      double $$8 = 0.083;
      dsf $$9 = dsg.a($$3, dsg.b(dsg.a(0.083), $$5));
      return dsg.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dsf a(im<dsf> $$0, im<ehq.a> $$1, dsf $$2) {
      dsf $$3 = a($$0, S);
      dsf $$4 = a($$0, N);
      dsf $$5 = dsg.a($$1.b(dsv.C), 8.0);
      dsf $$6 = dsg.b(dsg.a(4.0), $$5.e());
      dsf $$7 = dsg.a($$1.b(dsv.D), 0.6666666666666666);
      dsf $$8 = dsg.a(dsg.a(dsg.a(0.27), $$7).a(-1.0, 1.0), dsg.a(dsg.a(1.5), dsg.b(dsg.a(-0.64), $$2)).a(0.0, 0.5));
      dsf $$9 = dsg.a($$6, $$8);
      dsf $$10 = dsg.c(dsg.c($$9, a($$0, O)), dsg.a($$3, $$4));
      dsf $$11 = a($$0, Q);
      dsf $$12 = dsg.a($$11, -1000000.0, 0.03, dsg.a(-1000000.0), $$11);
      return dsg.d($$10, $$12);
   }

   private static dsf b(dsf $$0) {
      dsf $$1 = dsg.f($$0);
      return dsg.b(dsg.a($$1), dsg.a(0.64)).i();
   }

   protected static dss a(im<dsf> $$0, im<ehq.a> $$1, boolean $$2, boolean $$3) {
      dsf $$4 = dsg.a($$1.b(dsv.k), 0.5);
      dsf $$5 = dsg.a($$1.b(dsv.l), 0.67);
      dsf $$6 = dsg.a($$1.b(dsv.n), 0.7142857142857143);
      dsf $$7 = dsg.a($$1.b(dsv.m));
      dsf $$8 = a($$0, w);
      dsf $$9 = a($$0, x);
      dsf $$10 = dsg.a($$8, $$9, 0.25, $$1.b($$2 ? dsv.e : dsv.a));
      dsf $$11 = dsg.a($$8, $$9, 0.25, $$1.b($$2 ? dsv.f : dsv.b));
      dsf $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dsf $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dsf $$14 = b(dsg.c($$12), $$13);
      dsf $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dsf $$16 = dsg.c($$15, dsg.b(dsg.a(5.0), a($$0, O)));
      dsf $$17 = dsg.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dsf $$18 = dsg.c(b(a($$3, $$17)), a($$0, P));
      dsf $$19 = a($$0, v);
      int $$20 = Stream.of(dsw.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dqm.e * 2);
      int $$21 = Stream.of(dsw.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dqm.e * 2);
      dsf $$22 = a($$19, dsg.b($$1.b(dsv.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dsf $$24 = a($$19, dsg.b($$1.b(dsv.F), 4.0, 4.0), $$20, $$21, 0).d();
      dsf $$25 = a($$19, dsg.b($$1.b(dsv.G), 4.0, 4.0), $$20, $$21, 0).d();
      dsf $$26 = dsg.a(dsg.a(-0.08F), dsg.d($$24, $$25));
      dsf $$27 = dsg.a($$1.b(dsv.H));
      return new dss(
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
         a($$3, dsg.a($$14, dsg.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dss b(im<dsf> $$0, im<ehq.a> $$1, dsf $$2) {
      dsf $$3 = a($$0, w);
      dsf $$4 = a($$0, x);
      dsf $$5 = dsg.a($$3, $$4, 0.25, $$1.b(dsv.a));
      dsf $$6 = dsg.a($$3, $$4, 0.25, $$1.b(dsv.b));
      dsf $$7 = b($$2);
      return new dss(dsg.a(), dsg.a(), dsg.a(), dsg.a(), $$5, $$6, dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), $$7, dsg.a(), dsg.a(), dsg.a());
   }

   private static dsf a(boolean $$0, dsf $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dsf a(im<dsf> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dsf a(dsf $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dss a(im<dsf> $$0, im<ehq.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dss b(im<dsf> $$0, im<ehq.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dss c(im<dsf> $$0, im<ehq.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dsf c(dsf $$0) {
      return a($$0, 0, 128);
   }

   protected static dss a(im<dsf> $$0) {
      dsf $$1 = dsg.c(dsg.a(0L));
      dsf $$2 = b(c(a($$0, M)));
      return new dss(
         dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), $$1, dsg.a(), dsg.a(), c(dsg.a($$1, dsg.a(-0.703125))), $$2, dsg.a(), dsg.a(), dsg.a()
      );
   }

   protected static dss a() {
      return new dss(dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a(), dsg.a());
   }

   private static dsf a(dsf $$0, dsf $$1) {
      dsf $$2 = dsg.a(dsg.b(), $$1, $$0);
      return dsg.b(dsg.c($$2));
   }

   private static dsf b(dsf $$0, dsf $$1) {
      dsf $$2 = dsg.b($$1, $$0);
      return dsg.b(dsg.a(4.0), $$2.h());
   }

   private static dsf a(dsf $$0, dsf $$1, int $$2, int $$3, int $$4) {
      return dsg.a(dsg.a($$0, (double)$$2, (double)($$3 + 1), $$1, dsg.a((double)$$4)));
   }

   private static dsf a(dsf $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dsf $$10 = dsg.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dsf $$9 = dsg.a($$10, $$5, $$0);
      dsf $$11 = dsg.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dsg.a($$11, $$8, $$9);
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
