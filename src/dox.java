import java.util.stream.Stream;

public class dox {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final doj s = dok.a(10.0);
   private static final doj t = dok.a();
   private static final ahf<doj> u = a("zero");
   private static final ahf<doj> v = a("y");
   private static final ahf<doj> w = a("shift_x");
   private static final ahf<doj> x = a("shift_z");
   private static final ahf<doj> y = a("overworld/base_3d_noise");
   private static final ahf<doj> z = a("nether/base_3d_noise");
   private static final ahf<doj> A = a("end/base_3d_noise");
   public static final ahf<doj> d = a("overworld/continents");
   public static final ahf<doj> e = a("overworld/erosion");
   public static final ahf<doj> f = a("overworld/ridges");
   public static final ahf<doj> g = a("overworld/ridges_folded");
   public static final ahf<doj> h = a("overworld/offset");
   public static final ahf<doj> i = a("overworld/factor");
   public static final ahf<doj> j = a("overworld/jaggedness");
   public static final ahf<doj> k = a("overworld/depth");
   private static final ahf<doj> B = a("overworld/sloped_cheese");
   public static final ahf<doj> l = a("overworld_large_biomes/continents");
   public static final ahf<doj> m = a("overworld_large_biomes/erosion");
   private static final ahf<doj> C = a("overworld_large_biomes/offset");
   private static final ahf<doj> D = a("overworld_large_biomes/factor");
   private static final ahf<doj> E = a("overworld_large_biomes/jaggedness");
   private static final ahf<doj> F = a("overworld_large_biomes/depth");
   private static final ahf<doj> G = a("overworld_large_biomes/sloped_cheese");
   private static final ahf<doj> H = a("overworld_amplified/offset");
   private static final ahf<doj> I = a("overworld_amplified/factor");
   private static final ahf<doj> J = a("overworld_amplified/jaggedness");
   private static final ahf<doj> K = a("overworld_amplified/depth");
   private static final ahf<doj> L = a("overworld_amplified/sloped_cheese");
   private static final ahf<doj> M = a("end/sloped_cheese");
   private static final ahf<doj> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ahf<doj> O = a("overworld/caves/entrances");
   private static final ahf<doj> P = a("overworld/caves/noodle");
   private static final ahf<doj> Q = a("overworld/caves/pillars");
   private static final ahf<doj> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ahf<doj> S = a("overworld/caves/spaghetti_2d");

   private static ahf<doj> a(String $$0) {
      return ahf.a(ke.ax, new ahg($$0));
   }

   public static ih<? extends doj> a(pe<doj> $$0) {
      ii<edu.a> $$1 = $$0.a(ke.aB);
      ii<doj> $$2 = $$0.a(ke.ax);
      $$0.a(u, dok.a());
      int $$3 = dmq.e * 2;
      int $$4 = dmq.d * 2;
      $$0.a(v, dok.a($$3, $$4, (double)$$3, (double)$$4));
      doj $$5 = a($$0, w, dok.b(dok.c(dok.b($$1.b(doz.j)))));
      doj $$6 = a($$0, x, dok.b(dok.c(dok.c($$1.b(doz.j)))));
      $$0.a(y, edr.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, edr.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, edr.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ih<doj> $$7 = $$0.a(d, dok.b(dok.a($$5, $$6, 0.25, $$1.b(doz.c))));
      ih<doj> $$8 = $$0.a(e, dok.b(dok.a($$5, $$6, 0.25, $$1.b(doz.d))));
      doj $$9 = a($$0, f, dok.b(dok.a($$5, $$6, 0.25, $$1.b(doz.i))));
      $$0.a(g, a($$9));
      doj $$10 = dok.b($$1.b(doz.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ih<doj> $$11 = $$0.a(l, dok.b(dok.a($$5, $$6, 0.25, $$1.b(doz.g))));
      ih<doj> $$12 = $$0.a(m, dok.b(dok.a($$5, $$6, 0.25, $$1.b(doz.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dok.a(dok.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dok.d(dok.a($$1.b(doz.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      pe<doj> $$0, ii<doj> $$1, doj $$2, ih<doj> $$3, ih<doj> $$4, ahf<doj> $$5, ahf<doj> $$6, ahf<doj> $$7, ahf<doj> $$8, ahf<doj> $$9, boolean $$10
   ) {
      dok.w.a $$11 = new dok.w.a($$3);
      dok.w.a $$12 = new dok.w.a($$4);
      dok.w.a $$13 = new dok.w.a($$1.b(f));
      dok.w.a $$14 = new dok.w.a($$1.b(g));
      doj $$15 = a($$0, $$5, a(dok.a(dok.a(-0.50375F), dok.a(pt.a($$11, $$12, $$14, $$10))), dok.c()));
      doj $$16 = a($$0, $$6, a(dok.a(pt.a($$11, $$12, $$13, $$14, $$10)), s));
      doj $$17 = a($$0, $$8, dok.a(dok.a(-64, 320, 1.5, -1.5), $$15));
      doj $$18 = a($$0, $$7, a(dok.a(pt.b($$11, $$12, $$13, $$14, $$10)), t));
      doj $$19 = dok.b($$18, $$2.g());
      doj $$20 = b($$16, dok.a($$17, $$19));
      $$0.a($$9, dok.a($$20, a($$1, y)));
   }

   private static doj a(pe<doj> $$0, ahf<doj> $$1, doj $$2) {
      return new dok.j($$0.a($$1, $$2));
   }

   private static doj a(ii<doj> $$0, ahf<doj> $$1) {
      return new dok.j($$0.b($$1));
   }

   private static doj a(doj $$0) {
      return dok.b(dok.a(dok.a($$0.d(), dok.a(-0.6666666666666666)).d(), dok.a(-0.3333333333333333)), dok.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static doj b(ii<edu.a> $$0) {
      doj $$1 = dok.a($$0.b(doz.z));
      doj $$2 = dok.a($$0.b(doz.A), 0.0, -0.1);
      return dok.d(dok.b($$2, dok.a($$1.d(), dok.a(-0.4))));
   }

   private static doj d(ii<doj> $$0, ii<edu.a> $$1) {
      doj $$2 = dok.d(dok.b($$1.b(doz.x), 2.0, 1.0));
      doj $$3 = dok.a($$1.b(doz.y), -0.065, -0.088);
      doj $$4 = dok.a($$2, $$1.b(doz.v), dok.z.a.a);
      doj $$5 = dok.a($$2, $$1.b(doz.w), dok.z.a.a);
      doj $$6 = dok.a(dok.d($$4, $$5), $$3).a(-1.0, 1.0);
      doj $$7 = a($$0, N);
      doj $$8 = dok.b($$1.b(doz.B), 0.75, 0.5);
      doj $$9 = dok.a(dok.a($$8, dok.a(0.37)), dok.a(-10, 30, 0.3, 0.0));
      return dok.d(dok.c($$9, dok.a($$7, $$6)));
   }

   private static doj e(ii<doj> $$0, ii<edu.a> $$1) {
      doj $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      doj $$6 = a($$2, dok.b($$1.b(doz.I), 1.0, 1.0), -60, 320, -1);
      doj $$7 = a($$2, dok.a($$1.b(doz.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      doj $$9 = a($$2, dok.b($$1.b(doz.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      doj $$10 = a($$2, dok.b($$1.b(doz.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      doj $$11 = dok.b(dok.a(1.5), dok.d($$9.d(), $$10.d()));
      return dok.a($$6, -1000000.0, 0.0, dok.a(64.0), dok.a($$7, $$11));
   }

   private static doj c(ii<edu.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      doj $$3 = dok.b($$0.b(doz.o), 25.0, 0.3);
      doj $$4 = dok.a($$0.b(doz.p), 0.0, -2.0);
      doj $$5 = dok.a($$0.b(doz.q), 0.0, 1.1);
      doj $$6 = dok.a(dok.b($$3, dok.a(2.0)), $$4);
      return dok.d(dok.b($$6, $$5.f()));
   }

   private static doj f(ii<doj> $$0, ii<edu.a> $$1) {
      doj $$2 = dok.b($$1.b(doz.t), 2.0, 1.0);
      doj $$3 = dok.a($$2, $$1.b(doz.r), dok.z.a.b);
      doj $$4 = dok.a($$1.b(doz.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      doj $$5 = a($$0, R);
      doj $$6 = dok.a($$4, dok.a(-64, 320, 8.0, -40.0)).d();
      doj $$7 = dok.a($$6, $$5).f();
      double $$8 = 0.083;
      doj $$9 = dok.a($$3, dok.b(dok.a(0.083), $$5));
      return dok.d($$9, $$7).a(-1.0, 1.0);
   }

   private static doj a(ii<doj> $$0, ii<edu.a> $$1, doj $$2) {
      doj $$3 = a($$0, S);
      doj $$4 = a($$0, N);
      doj $$5 = dok.a($$1.b(doz.C), 8.0);
      doj $$6 = dok.b(dok.a(4.0), $$5.e());
      doj $$7 = dok.a($$1.b(doz.D), 0.6666666666666666);
      doj $$8 = dok.a(dok.a(dok.a(0.27), $$7).a(-1.0, 1.0), dok.a(dok.a(1.5), dok.b(dok.a(-0.64), $$2)).a(0.0, 0.5));
      doj $$9 = dok.a($$6, $$8);
      doj $$10 = dok.c(dok.c($$9, a($$0, O)), dok.a($$3, $$4));
      doj $$11 = a($$0, Q);
      doj $$12 = dok.a($$11, -1000000.0, 0.03, dok.a(-1000000.0), $$11);
      return dok.d($$10, $$12);
   }

   private static doj b(doj $$0) {
      doj $$1 = dok.f($$0);
      return dok.b(dok.a($$1), dok.a(0.64)).i();
   }

   protected static dow a(ii<doj> $$0, ii<edu.a> $$1, boolean $$2, boolean $$3) {
      doj $$4 = dok.a($$1.b(doz.k), 0.5);
      doj $$5 = dok.a($$1.b(doz.l), 0.67);
      doj $$6 = dok.a($$1.b(doz.n), 0.7142857142857143);
      doj $$7 = dok.a($$1.b(doz.m));
      doj $$8 = a($$0, w);
      doj $$9 = a($$0, x);
      doj $$10 = dok.a($$8, $$9, 0.25, $$1.b($$2 ? doz.e : doz.a));
      doj $$11 = dok.a($$8, $$9, 0.25, $$1.b($$2 ? doz.f : doz.b));
      doj $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      doj $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      doj $$14 = b(dok.c($$12), $$13);
      doj $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      doj $$16 = dok.c($$15, dok.b(dok.a(5.0), a($$0, O)));
      doj $$17 = dok.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      doj $$18 = dok.c(b(a($$3, $$17)), a($$0, P));
      doj $$19 = a($$0, v);
      int $$20 = Stream.of(dpa.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dmq.e * 2);
      int $$21 = Stream.of(dpa.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dmq.e * 2);
      doj $$22 = a($$19, dok.b($$1.b(doz.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      doj $$24 = a($$19, dok.b($$1.b(doz.F), 4.0, 4.0), $$20, $$21, 0).d();
      doj $$25 = a($$19, dok.b($$1.b(doz.G), 4.0, 4.0), $$20, $$21, 0).d();
      doj $$26 = dok.a(dok.a(-0.08F), dok.d($$24, $$25));
      doj $$27 = dok.a($$1.b(doz.H));
      return new dow(
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
         a($$3, dok.a($$14, dok.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dow b(ii<doj> $$0, ii<edu.a> $$1, doj $$2) {
      doj $$3 = a($$0, w);
      doj $$4 = a($$0, x);
      doj $$5 = dok.a($$3, $$4, 0.25, $$1.b(doz.a));
      doj $$6 = dok.a($$3, $$4, 0.25, $$1.b(doz.b));
      doj $$7 = b($$2);
      return new dow(dok.a(), dok.a(), dok.a(), dok.a(), $$5, $$6, dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), $$7, dok.a(), dok.a(), dok.a());
   }

   private static doj a(boolean $$0, doj $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static doj a(ii<doj> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static doj a(doj $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dow a(ii<doj> $$0, ii<edu.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dow b(ii<doj> $$0, ii<edu.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dow c(ii<doj> $$0, ii<edu.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static doj c(doj $$0) {
      return a($$0, 0, 128);
   }

   protected static dow a(ii<doj> $$0) {
      doj $$1 = dok.c(dok.a(0L));
      doj $$2 = b(c(a($$0, M)));
      return new dow(
         dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), $$1, dok.a(), dok.a(), c(dok.a($$1, dok.a(-0.703125))), $$2, dok.a(), dok.a(), dok.a()
      );
   }

   protected static dow a() {
      return new dow(dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), dok.a(), dok.a());
   }

   private static doj a(doj $$0, doj $$1) {
      doj $$2 = dok.a(dok.b(), $$1, $$0);
      return dok.b(dok.c($$2));
   }

   private static doj b(doj $$0, doj $$1) {
      doj $$2 = dok.b($$1, $$0);
      return dok.b(dok.a(4.0), $$2.h());
   }

   private static doj a(doj $$0, doj $$1, int $$2, int $$3, int $$4) {
      return dok.a(dok.a($$0, (double)$$2, (double)($$3 + 1), $$1, dok.a((double)$$4)));
   }

   private static doj a(doj $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      doj $$10 = dok.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      doj $$9 = dok.a($$10, $$5, $$0);
      doj $$11 = dok.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dok.a($$11, $$8, $$9);
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
