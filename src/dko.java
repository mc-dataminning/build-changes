import java.util.stream.Stream;

public class dko {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dka s = dkb.a(10.0);
   private static final dka t = dkb.a();
   private static final aeo<dka> u = a("zero");
   private static final aeo<dka> v = a("y");
   private static final aeo<dka> w = a("shift_x");
   private static final aeo<dka> x = a("shift_z");
   private static final aeo<dka> y = a("overworld/base_3d_noise");
   private static final aeo<dka> z = a("nether/base_3d_noise");
   private static final aeo<dka> A = a("end/base_3d_noise");
   public static final aeo<dka> d = a("overworld/continents");
   public static final aeo<dka> e = a("overworld/erosion");
   public static final aeo<dka> f = a("overworld/ridges");
   public static final aeo<dka> g = a("overworld/ridges_folded");
   public static final aeo<dka> h = a("overworld/offset");
   public static final aeo<dka> i = a("overworld/factor");
   public static final aeo<dka> j = a("overworld/jaggedness");
   public static final aeo<dka> k = a("overworld/depth");
   private static final aeo<dka> B = a("overworld/sloped_cheese");
   public static final aeo<dka> l = a("overworld_large_biomes/continents");
   public static final aeo<dka> m = a("overworld_large_biomes/erosion");
   private static final aeo<dka> C = a("overworld_large_biomes/offset");
   private static final aeo<dka> D = a("overworld_large_biomes/factor");
   private static final aeo<dka> E = a("overworld_large_biomes/jaggedness");
   private static final aeo<dka> F = a("overworld_large_biomes/depth");
   private static final aeo<dka> G = a("overworld_large_biomes/sloped_cheese");
   private static final aeo<dka> H = a("overworld_amplified/offset");
   private static final aeo<dka> I = a("overworld_amplified/factor");
   private static final aeo<dka> J = a("overworld_amplified/jaggedness");
   private static final aeo<dka> K = a("overworld_amplified/depth");
   private static final aeo<dka> L = a("overworld_amplified/sloped_cheese");
   private static final aeo<dka> M = a("end/sloped_cheese");
   private static final aeo<dka> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aeo<dka> O = a("overworld/caves/entrances");
   private static final aeo<dka> P = a("overworld/caves/noodle");
   private static final aeo<dka> Q = a("overworld/caves/pillars");
   private static final aeo<dka> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aeo<dka> S = a("overworld/caves/spaghetti_2d");

   private static aeo<dka> a(String $$0) {
      return aeo.a(jd.at, new aep($$0));
   }

   public static hf<? extends dka> a(nn<dka> $$0) {
      hg<dze.a> $$1 = $$0.a(jd.ax);
      hg<dka> $$2 = $$0.a(jd.at);
      $$0.a(u, dkb.a());
      int $$3 = dih.e * 2;
      int $$4 = dih.d * 2;
      $$0.a(v, dkb.a($$3, $$4, (double)$$3, (double)$$4));
      dka $$5 = a($$0, w, dkb.b(dkb.c(dkb.b($$1.b(dkq.j)))));
      dka $$6 = a($$0, x, dkb.b(dkb.c(dkb.c($$1.b(dkq.j)))));
      $$0.a(y, dzb.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, dzb.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, dzb.a(0.25, 0.25, 80.0, 160.0, 4.0));
      hf<dka> $$7 = $$0.a(d, dkb.b(dkb.a($$5, $$6, 0.25, $$1.b(dkq.c))));
      hf<dka> $$8 = $$0.a(e, dkb.b(dkb.a($$5, $$6, 0.25, $$1.b(dkq.d))));
      dka $$9 = a($$0, f, dkb.b(dkb.a($$5, $$6, 0.25, $$1.b(dkq.i))));
      $$0.a(g, a($$9));
      dka $$10 = dkb.b($$1.b(dkq.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      hf<dka> $$11 = $$0.a(l, dkb.b(dkb.a($$5, $$6, 0.25, $$1.b(dkq.g))));
      hf<dka> $$12 = $$0.a(m, dkb.b(dkb.a($$5, $$6, 0.25, $$1.b(dkq.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dkb.a(dkb.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dkb.d(dkb.a($$1.b(dkq.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      nn<dka> $$0, hg<dka> $$1, dka $$2, hf<dka> $$3, hf<dka> $$4, aeo<dka> $$5, aeo<dka> $$6, aeo<dka> $$7, aeo<dka> $$8, aeo<dka> $$9, boolean $$10
   ) {
      dkb.w.a $$11 = new dkb.w.a($$3);
      dkb.w.a $$12 = new dkb.w.a($$4);
      dkb.w.a $$13 = new dkb.w.a($$1.b(f));
      dkb.w.a $$14 = new dkb.w.a($$1.b(g));
      dka $$15 = a($$0, $$5, a(dkb.a(dkb.a(-0.50375F), dkb.a(oc.a($$11, $$12, $$14, $$10))), dkb.c()));
      dka $$16 = a($$0, $$6, a(dkb.a(oc.a($$11, $$12, $$13, $$14, $$10)), s));
      dka $$17 = a($$0, $$8, dkb.a(dkb.a(-64, 320, 1.5, -1.5), $$15));
      dka $$18 = a($$0, $$7, a(dkb.a(oc.b($$11, $$12, $$13, $$14, $$10)), t));
      dka $$19 = dkb.b($$18, $$2.g());
      dka $$20 = b($$16, dkb.a($$17, $$19));
      $$0.a($$9, dkb.a($$20, a($$1, y)));
   }

   private static dka a(nn<dka> $$0, aeo<dka> $$1, dka $$2) {
      return new dkb.j($$0.a($$1, $$2));
   }

   private static dka a(hg<dka> $$0, aeo<dka> $$1) {
      return new dkb.j($$0.b($$1));
   }

   private static dka a(dka $$0) {
      return dkb.b(dkb.a(dkb.a($$0.d(), dkb.a(-0.6666666666666666)).d(), dkb.a(-0.3333333333333333)), dkb.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dka b(hg<dze.a> $$0) {
      dka $$1 = dkb.a($$0.b(dkq.z));
      dka $$2 = dkb.a($$0.b(dkq.A), 0.0, -0.1);
      return dkb.d(dkb.b($$2, dkb.a($$1.d(), dkb.a(-0.4))));
   }

   private static dka d(hg<dka> $$0, hg<dze.a> $$1) {
      dka $$2 = dkb.d(dkb.b($$1.b(dkq.x), 2.0, 1.0));
      dka $$3 = dkb.a($$1.b(dkq.y), -0.065, -0.088);
      dka $$4 = dkb.a($$2, $$1.b(dkq.v), dkb.z.a.a);
      dka $$5 = dkb.a($$2, $$1.b(dkq.w), dkb.z.a.a);
      dka $$6 = dkb.a(dkb.d($$4, $$5), $$3).a(-1.0, 1.0);
      dka $$7 = a($$0, N);
      dka $$8 = dkb.b($$1.b(dkq.B), 0.75, 0.5);
      dka $$9 = dkb.a(dkb.a($$8, dkb.a(0.37)), dkb.a(-10, 30, 0.3, 0.0));
      return dkb.d(dkb.c($$9, dkb.a($$7, $$6)));
   }

   private static dka e(hg<dka> $$0, hg<dze.a> $$1) {
      dka $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dka $$6 = a($$2, dkb.b($$1.b(dkq.I), 1.0, 1.0), -60, 320, -1);
      dka $$7 = a($$2, dkb.a($$1.b(dkq.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dka $$9 = a($$2, dkb.b($$1.b(dkq.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dka $$10 = a($$2, dkb.b($$1.b(dkq.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dka $$11 = dkb.b(dkb.a(1.5), dkb.d($$9.d(), $$10.d()));
      return dkb.a($$6, -1000000.0, 0.0, dkb.a(64.0), dkb.a($$7, $$11));
   }

   private static dka c(hg<dze.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dka $$3 = dkb.b($$0.b(dkq.o), 25.0, 0.3);
      dka $$4 = dkb.a($$0.b(dkq.p), 0.0, -2.0);
      dka $$5 = dkb.a($$0.b(dkq.q), 0.0, 1.1);
      dka $$6 = dkb.a(dkb.b($$3, dkb.a(2.0)), $$4);
      return dkb.d(dkb.b($$6, $$5.f()));
   }

   private static dka f(hg<dka> $$0, hg<dze.a> $$1) {
      dka $$2 = dkb.b($$1.b(dkq.t), 2.0, 1.0);
      dka $$3 = dkb.a($$2, $$1.b(dkq.r), dkb.z.a.b);
      dka $$4 = dkb.a($$1.b(dkq.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dka $$5 = a($$0, R);
      dka $$6 = dkb.a($$4, dkb.a(-64, 320, 8.0, -40.0)).d();
      dka $$7 = dkb.a($$6, $$5).f();
      double $$8 = 0.083;
      dka $$9 = dkb.a($$3, dkb.b(dkb.a(0.083), $$5));
      return dkb.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dka a(hg<dka> $$0, hg<dze.a> $$1, dka $$2) {
      dka $$3 = a($$0, S);
      dka $$4 = a($$0, N);
      dka $$5 = dkb.a($$1.b(dkq.C), 8.0);
      dka $$6 = dkb.b(dkb.a(4.0), $$5.e());
      dka $$7 = dkb.a($$1.b(dkq.D), 0.6666666666666666);
      dka $$8 = dkb.a(dkb.a(dkb.a(0.27), $$7).a(-1.0, 1.0), dkb.a(dkb.a(1.5), dkb.b(dkb.a(-0.64), $$2)).a(0.0, 0.5));
      dka $$9 = dkb.a($$6, $$8);
      dka $$10 = dkb.c(dkb.c($$9, a($$0, O)), dkb.a($$3, $$4));
      dka $$11 = a($$0, Q);
      dka $$12 = dkb.a($$11, -1000000.0, 0.03, dkb.a(-1000000.0), $$11);
      return dkb.d($$10, $$12);
   }

   private static dka b(dka $$0) {
      dka $$1 = dkb.f($$0);
      return dkb.b(dkb.a($$1), dkb.a(0.64)).i();
   }

   protected static dkn a(hg<dka> $$0, hg<dze.a> $$1, boolean $$2, boolean $$3) {
      dka $$4 = dkb.a($$1.b(dkq.k), 0.5);
      dka $$5 = dkb.a($$1.b(dkq.l), 0.67);
      dka $$6 = dkb.a($$1.b(dkq.n), 0.7142857142857143);
      dka $$7 = dkb.a($$1.b(dkq.m));
      dka $$8 = a($$0, w);
      dka $$9 = a($$0, x);
      dka $$10 = dkb.a($$8, $$9, 0.25, $$1.b($$2 ? dkq.e : dkq.a));
      dka $$11 = dkb.a($$8, $$9, 0.25, $$1.b($$2 ? dkq.f : dkq.b));
      dka $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dka $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dka $$14 = b(dkb.c($$12), $$13);
      dka $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dka $$16 = dkb.c($$15, dkb.b(dkb.a(5.0), a($$0, O)));
      dka $$17 = dkb.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dka $$18 = dkb.c(b(a($$3, $$17)), a($$0, P));
      dka $$19 = a($$0, v);
      int $$20 = Stream.of(dkr.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dih.e * 2);
      int $$21 = Stream.of(dkr.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dih.e * 2);
      dka $$22 = a($$19, dkb.b($$1.b(dkq.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dka $$24 = a($$19, dkb.b($$1.b(dkq.F), 4.0, 4.0), $$20, $$21, 0).d();
      dka $$25 = a($$19, dkb.b($$1.b(dkq.G), 4.0, 4.0), $$20, $$21, 0).d();
      dka $$26 = dkb.a(dkb.a(-0.08F), dkb.d($$24, $$25));
      dka $$27 = dkb.a($$1.b(dkq.H));
      return new dkn(
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
         a($$3, dkb.a($$14, dkb.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dkn b(hg<dka> $$0, hg<dze.a> $$1, dka $$2) {
      dka $$3 = a($$0, w);
      dka $$4 = a($$0, x);
      dka $$5 = dkb.a($$3, $$4, 0.25, $$1.b(dkq.a));
      dka $$6 = dkb.a($$3, $$4, 0.25, $$1.b(dkq.b));
      dka $$7 = b($$2);
      return new dkn(dkb.a(), dkb.a(), dkb.a(), dkb.a(), $$5, $$6, dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), $$7, dkb.a(), dkb.a(), dkb.a());
   }

   private static dka a(boolean $$0, dka $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dka a(hg<dka> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dka a(dka $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dkn a(hg<dka> $$0, hg<dze.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dkn b(hg<dka> $$0, hg<dze.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dkn c(hg<dka> $$0, hg<dze.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dka c(dka $$0) {
      return a($$0, 0, 128);
   }

   protected static dkn a(hg<dka> $$0) {
      dka $$1 = dkb.c(dkb.a(0L));
      dka $$2 = b(c(a($$0, M)));
      return new dkn(
         dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), $$1, dkb.a(), dkb.a(), c(dkb.a($$1, dkb.a(-0.703125))), $$2, dkb.a(), dkb.a(), dkb.a()
      );
   }

   protected static dkn a() {
      return new dkn(dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a(), dkb.a());
   }

   private static dka a(dka $$0, dka $$1) {
      dka $$2 = dkb.a(dkb.b(), $$1, $$0);
      return dkb.b(dkb.c($$2));
   }

   private static dka b(dka $$0, dka $$1) {
      dka $$2 = dkb.b($$1, $$0);
      return dkb.b(dkb.a(4.0), $$2.h());
   }

   private static dka a(dka $$0, dka $$1, int $$2, int $$3, int $$4) {
      return dkb.a(dkb.a($$0, (double)$$2, (double)($$3 + 1), $$1, dkb.a((double)$$4)));
   }

   private static dka a(dka $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dka $$10 = dkb.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dka $$9 = dkb.a($$10, $$5, $$0);
      dka $$11 = dkb.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dkb.a($$11, $$8, $$9);
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
