import java.util.stream.Stream;

public class dkz {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dkl s = dkm.a(10.0);
   private static final dkl t = dkm.a();
   private static final aew<dkl> u = a("zero");
   private static final aew<dkl> v = a("y");
   private static final aew<dkl> w = a("shift_x");
   private static final aew<dkl> x = a("shift_z");
   private static final aew<dkl> y = a("overworld/base_3d_noise");
   private static final aew<dkl> z = a("nether/base_3d_noise");
   private static final aew<dkl> A = a("end/base_3d_noise");
   public static final aew<dkl> d = a("overworld/continents");
   public static final aew<dkl> e = a("overworld/erosion");
   public static final aew<dkl> f = a("overworld/ridges");
   public static final aew<dkl> g = a("overworld/ridges_folded");
   public static final aew<dkl> h = a("overworld/offset");
   public static final aew<dkl> i = a("overworld/factor");
   public static final aew<dkl> j = a("overworld/jaggedness");
   public static final aew<dkl> k = a("overworld/depth");
   private static final aew<dkl> B = a("overworld/sloped_cheese");
   public static final aew<dkl> l = a("overworld_large_biomes/continents");
   public static final aew<dkl> m = a("overworld_large_biomes/erosion");
   private static final aew<dkl> C = a("overworld_large_biomes/offset");
   private static final aew<dkl> D = a("overworld_large_biomes/factor");
   private static final aew<dkl> E = a("overworld_large_biomes/jaggedness");
   private static final aew<dkl> F = a("overworld_large_biomes/depth");
   private static final aew<dkl> G = a("overworld_large_biomes/sloped_cheese");
   private static final aew<dkl> H = a("overworld_amplified/offset");
   private static final aew<dkl> I = a("overworld_amplified/factor");
   private static final aew<dkl> J = a("overworld_amplified/jaggedness");
   private static final aew<dkl> K = a("overworld_amplified/depth");
   private static final aew<dkl> L = a("overworld_amplified/sloped_cheese");
   private static final aew<dkl> M = a("end/sloped_cheese");
   private static final aew<dkl> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aew<dkl> O = a("overworld/caves/entrances");
   private static final aew<dkl> P = a("overworld/caves/noodle");
   private static final aew<dkl> Q = a("overworld/caves/pillars");
   private static final aew<dkl> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aew<dkl> S = a("overworld/caves/spaghetti_2d");

   private static aew<dkl> a(String $$0) {
      return aew.a(je.at, new aex($$0));
   }

   public static hg<? extends dkl> a(ns<dkl> $$0) {
      hh<dzp.a> $$1 = $$0.a(je.ax);
      hh<dkl> $$2 = $$0.a(je.at);
      $$0.a(u, dkm.a());
      int $$3 = dis.e * 2;
      int $$4 = dis.d * 2;
      $$0.a(v, dkm.a($$3, $$4, (double)$$3, (double)$$4));
      dkl $$5 = a($$0, w, dkm.b(dkm.c(dkm.b($$1.b(dlb.j)))));
      dkl $$6 = a($$0, x, dkm.b(dkm.c(dkm.c($$1.b(dlb.j)))));
      $$0.a(y, dzm.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, dzm.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, dzm.a(0.25, 0.25, 80.0, 160.0, 4.0));
      hg<dkl> $$7 = $$0.a(d, dkm.b(dkm.a($$5, $$6, 0.25, $$1.b(dlb.c))));
      hg<dkl> $$8 = $$0.a(e, dkm.b(dkm.a($$5, $$6, 0.25, $$1.b(dlb.d))));
      dkl $$9 = a($$0, f, dkm.b(dkm.a($$5, $$6, 0.25, $$1.b(dlb.i))));
      $$0.a(g, a($$9));
      dkl $$10 = dkm.b($$1.b(dlb.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      hg<dkl> $$11 = $$0.a(l, dkm.b(dkm.a($$5, $$6, 0.25, $$1.b(dlb.g))));
      hg<dkl> $$12 = $$0.a(m, dkm.b(dkm.a($$5, $$6, 0.25, $$1.b(dlb.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dkm.a(dkm.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dkm.d(dkm.a($$1.b(dlb.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      ns<dkl> $$0, hh<dkl> $$1, dkl $$2, hg<dkl> $$3, hg<dkl> $$4, aew<dkl> $$5, aew<dkl> $$6, aew<dkl> $$7, aew<dkl> $$8, aew<dkl> $$9, boolean $$10
   ) {
      dkm.w.a $$11 = new dkm.w.a($$3);
      dkm.w.a $$12 = new dkm.w.a($$4);
      dkm.w.a $$13 = new dkm.w.a($$1.b(f));
      dkm.w.a $$14 = new dkm.w.a($$1.b(g));
      dkl $$15 = a($$0, $$5, a(dkm.a(dkm.a(-0.50375F), dkm.a(oh.a($$11, $$12, $$14, $$10))), dkm.c()));
      dkl $$16 = a($$0, $$6, a(dkm.a(oh.a($$11, $$12, $$13, $$14, $$10)), s));
      dkl $$17 = a($$0, $$8, dkm.a(dkm.a(-64, 320, 1.5, -1.5), $$15));
      dkl $$18 = a($$0, $$7, a(dkm.a(oh.b($$11, $$12, $$13, $$14, $$10)), t));
      dkl $$19 = dkm.b($$18, $$2.g());
      dkl $$20 = b($$16, dkm.a($$17, $$19));
      $$0.a($$9, dkm.a($$20, a($$1, y)));
   }

   private static dkl a(ns<dkl> $$0, aew<dkl> $$1, dkl $$2) {
      return new dkm.j($$0.a($$1, $$2));
   }

   private static dkl a(hh<dkl> $$0, aew<dkl> $$1) {
      return new dkm.j($$0.b($$1));
   }

   private static dkl a(dkl $$0) {
      return dkm.b(dkm.a(dkm.a($$0.d(), dkm.a(-0.6666666666666666)).d(), dkm.a(-0.3333333333333333)), dkm.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dkl b(hh<dzp.a> $$0) {
      dkl $$1 = dkm.a($$0.b(dlb.z));
      dkl $$2 = dkm.a($$0.b(dlb.A), 0.0, -0.1);
      return dkm.d(dkm.b($$2, dkm.a($$1.d(), dkm.a(-0.4))));
   }

   private static dkl d(hh<dkl> $$0, hh<dzp.a> $$1) {
      dkl $$2 = dkm.d(dkm.b($$1.b(dlb.x), 2.0, 1.0));
      dkl $$3 = dkm.a($$1.b(dlb.y), -0.065, -0.088);
      dkl $$4 = dkm.a($$2, $$1.b(dlb.v), dkm.z.a.a);
      dkl $$5 = dkm.a($$2, $$1.b(dlb.w), dkm.z.a.a);
      dkl $$6 = dkm.a(dkm.d($$4, $$5), $$3).a(-1.0, 1.0);
      dkl $$7 = a($$0, N);
      dkl $$8 = dkm.b($$1.b(dlb.B), 0.75, 0.5);
      dkl $$9 = dkm.a(dkm.a($$8, dkm.a(0.37)), dkm.a(-10, 30, 0.3, 0.0));
      return dkm.d(dkm.c($$9, dkm.a($$7, $$6)));
   }

   private static dkl e(hh<dkl> $$0, hh<dzp.a> $$1) {
      dkl $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dkl $$6 = a($$2, dkm.b($$1.b(dlb.I), 1.0, 1.0), -60, 320, -1);
      dkl $$7 = a($$2, dkm.a($$1.b(dlb.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dkl $$9 = a($$2, dkm.b($$1.b(dlb.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dkl $$10 = a($$2, dkm.b($$1.b(dlb.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dkl $$11 = dkm.b(dkm.a(1.5), dkm.d($$9.d(), $$10.d()));
      return dkm.a($$6, -1000000.0, 0.0, dkm.a(64.0), dkm.a($$7, $$11));
   }

   private static dkl c(hh<dzp.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dkl $$3 = dkm.b($$0.b(dlb.o), 25.0, 0.3);
      dkl $$4 = dkm.a($$0.b(dlb.p), 0.0, -2.0);
      dkl $$5 = dkm.a($$0.b(dlb.q), 0.0, 1.1);
      dkl $$6 = dkm.a(dkm.b($$3, dkm.a(2.0)), $$4);
      return dkm.d(dkm.b($$6, $$5.f()));
   }

   private static dkl f(hh<dkl> $$0, hh<dzp.a> $$1) {
      dkl $$2 = dkm.b($$1.b(dlb.t), 2.0, 1.0);
      dkl $$3 = dkm.a($$2, $$1.b(dlb.r), dkm.z.a.b);
      dkl $$4 = dkm.a($$1.b(dlb.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dkl $$5 = a($$0, R);
      dkl $$6 = dkm.a($$4, dkm.a(-64, 320, 8.0, -40.0)).d();
      dkl $$7 = dkm.a($$6, $$5).f();
      double $$8 = 0.083;
      dkl $$9 = dkm.a($$3, dkm.b(dkm.a(0.083), $$5));
      return dkm.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dkl a(hh<dkl> $$0, hh<dzp.a> $$1, dkl $$2) {
      dkl $$3 = a($$0, S);
      dkl $$4 = a($$0, N);
      dkl $$5 = dkm.a($$1.b(dlb.C), 8.0);
      dkl $$6 = dkm.b(dkm.a(4.0), $$5.e());
      dkl $$7 = dkm.a($$1.b(dlb.D), 0.6666666666666666);
      dkl $$8 = dkm.a(dkm.a(dkm.a(0.27), $$7).a(-1.0, 1.0), dkm.a(dkm.a(1.5), dkm.b(dkm.a(-0.64), $$2)).a(0.0, 0.5));
      dkl $$9 = dkm.a($$6, $$8);
      dkl $$10 = dkm.c(dkm.c($$9, a($$0, O)), dkm.a($$3, $$4));
      dkl $$11 = a($$0, Q);
      dkl $$12 = dkm.a($$11, -1000000.0, 0.03, dkm.a(-1000000.0), $$11);
      return dkm.d($$10, $$12);
   }

   private static dkl b(dkl $$0) {
      dkl $$1 = dkm.f($$0);
      return dkm.b(dkm.a($$1), dkm.a(0.64)).i();
   }

   protected static dky a(hh<dkl> $$0, hh<dzp.a> $$1, boolean $$2, boolean $$3) {
      dkl $$4 = dkm.a($$1.b(dlb.k), 0.5);
      dkl $$5 = dkm.a($$1.b(dlb.l), 0.67);
      dkl $$6 = dkm.a($$1.b(dlb.n), 0.7142857142857143);
      dkl $$7 = dkm.a($$1.b(dlb.m));
      dkl $$8 = a($$0, w);
      dkl $$9 = a($$0, x);
      dkl $$10 = dkm.a($$8, $$9, 0.25, $$1.b($$2 ? dlb.e : dlb.a));
      dkl $$11 = dkm.a($$8, $$9, 0.25, $$1.b($$2 ? dlb.f : dlb.b));
      dkl $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dkl $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dkl $$14 = b(dkm.c($$12), $$13);
      dkl $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dkl $$16 = dkm.c($$15, dkm.b(dkm.a(5.0), a($$0, O)));
      dkl $$17 = dkm.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dkl $$18 = dkm.c(b(a($$3, $$17)), a($$0, P));
      dkl $$19 = a($$0, v);
      int $$20 = Stream.of(dlc.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dis.e * 2);
      int $$21 = Stream.of(dlc.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dis.e * 2);
      dkl $$22 = a($$19, dkm.b($$1.b(dlb.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dkl $$24 = a($$19, dkm.b($$1.b(dlb.F), 4.0, 4.0), $$20, $$21, 0).d();
      dkl $$25 = a($$19, dkm.b($$1.b(dlb.G), 4.0, 4.0), $$20, $$21, 0).d();
      dkl $$26 = dkm.a(dkm.a(-0.08F), dkm.d($$24, $$25));
      dkl $$27 = dkm.a($$1.b(dlb.H));
      return new dky(
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
         a($$3, dkm.a($$14, dkm.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dky b(hh<dkl> $$0, hh<dzp.a> $$1, dkl $$2) {
      dkl $$3 = a($$0, w);
      dkl $$4 = a($$0, x);
      dkl $$5 = dkm.a($$3, $$4, 0.25, $$1.b(dlb.a));
      dkl $$6 = dkm.a($$3, $$4, 0.25, $$1.b(dlb.b));
      dkl $$7 = b($$2);
      return new dky(dkm.a(), dkm.a(), dkm.a(), dkm.a(), $$5, $$6, dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), $$7, dkm.a(), dkm.a(), dkm.a());
   }

   private static dkl a(boolean $$0, dkl $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dkl a(hh<dkl> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dkl a(dkl $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dky a(hh<dkl> $$0, hh<dzp.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dky b(hh<dkl> $$0, hh<dzp.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dky c(hh<dkl> $$0, hh<dzp.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dkl c(dkl $$0) {
      return a($$0, 0, 128);
   }

   protected static dky a(hh<dkl> $$0) {
      dkl $$1 = dkm.c(dkm.a(0L));
      dkl $$2 = b(c(a($$0, M)));
      return new dky(
         dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), $$1, dkm.a(), dkm.a(), c(dkm.a($$1, dkm.a(-0.703125))), $$2, dkm.a(), dkm.a(), dkm.a()
      );
   }

   protected static dky a() {
      return new dky(dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a(), dkm.a());
   }

   private static dkl a(dkl $$0, dkl $$1) {
      dkl $$2 = dkm.a(dkm.b(), $$1, $$0);
      return dkm.b(dkm.c($$2));
   }

   private static dkl b(dkl $$0, dkl $$1) {
      dkl $$2 = dkm.b($$1, $$0);
      return dkm.b(dkm.a(4.0), $$2.h());
   }

   private static dkl a(dkl $$0, dkl $$1, int $$2, int $$3, int $$4) {
      return dkm.a(dkm.a($$0, (double)$$2, (double)($$3 + 1), $$1, dkm.a((double)$$4)));
   }

   private static dkl a(dkl $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dkl $$10 = dkm.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dkl $$9 = dkm.a($$10, $$5, $$0);
      dkl $$11 = dkm.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dkm.a($$11, $$8, $$9);
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
