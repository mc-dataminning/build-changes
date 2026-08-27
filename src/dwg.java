import java.util.stream.Stream;

public class dwg {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dvs s = dvt.a(10.0);
   private static final dvs t = dvt.a();
   private static final akg<dvs> u = a("zero");
   private static final akg<dvs> v = a("y");
   private static final akg<dvs> w = a("shift_x");
   private static final akg<dvs> x = a("shift_z");
   private static final akg<dvs> y = a("overworld/base_3d_noise");
   private static final akg<dvs> z = a("nether/base_3d_noise");
   private static final akg<dvs> A = a("end/base_3d_noise");
   public static final akg<dvs> d = a("overworld/continents");
   public static final akg<dvs> e = a("overworld/erosion");
   public static final akg<dvs> f = a("overworld/ridges");
   public static final akg<dvs> g = a("overworld/ridges_folded");
   public static final akg<dvs> h = a("overworld/offset");
   public static final akg<dvs> i = a("overworld/factor");
   public static final akg<dvs> j = a("overworld/jaggedness");
   public static final akg<dvs> k = a("overworld/depth");
   private static final akg<dvs> B = a("overworld/sloped_cheese");
   public static final akg<dvs> l = a("overworld_large_biomes/continents");
   public static final akg<dvs> m = a("overworld_large_biomes/erosion");
   private static final akg<dvs> C = a("overworld_large_biomes/offset");
   private static final akg<dvs> D = a("overworld_large_biomes/factor");
   private static final akg<dvs> E = a("overworld_large_biomes/jaggedness");
   private static final akg<dvs> F = a("overworld_large_biomes/depth");
   private static final akg<dvs> G = a("overworld_large_biomes/sloped_cheese");
   private static final akg<dvs> H = a("overworld_amplified/offset");
   private static final akg<dvs> I = a("overworld_amplified/factor");
   private static final akg<dvs> J = a("overworld_amplified/jaggedness");
   private static final akg<dvs> K = a("overworld_amplified/depth");
   private static final akg<dvs> L = a("overworld_amplified/sloped_cheese");
   private static final akg<dvs> M = a("end/sloped_cheese");
   private static final akg<dvs> N = a("overworld/caves/spaghetti_roughness_function");
   private static final akg<dvs> O = a("overworld/caves/entrances");
   private static final akg<dvs> P = a("overworld/caves/noodle");
   private static final akg<dvs> Q = a("overworld/caves/pillars");
   private static final akg<dvs> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final akg<dvs> S = a("overworld/caves/spaghetti_2d");

   private static akg<dvs> a(String $$0) {
      return akg.a(le.aD, new akh($$0));
   }

   public static iw<? extends dvs> a(ql<dvs> $$0) {
      ix<eld.a> $$1 = $$0.a(le.aH);
      ix<dvs> $$2 = $$0.a(le.aD);
      $$0.a(u, dvt.a());
      int $$3 = dtz.e * 2;
      int $$4 = dtz.d * 2;
      $$0.a(v, dvt.a($$3, $$4, (double)$$3, (double)$$4));
      dvs $$5 = a($$0, w, dvt.b(dvt.c(dvt.b($$1.b(dwi.j)))));
      dvs $$6 = a($$0, x, dvt.b(dvt.c(dvt.c($$1.b(dwi.j)))));
      $$0.a(y, ela.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ela.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ela.a(0.25, 0.25, 80.0, 160.0, 4.0));
      iw<dvs> $$7 = $$0.a(d, dvt.b(dvt.a($$5, $$6, 0.25, $$1.b(dwi.c))));
      iw<dvs> $$8 = $$0.a(e, dvt.b(dvt.a($$5, $$6, 0.25, $$1.b(dwi.d))));
      dvs $$9 = a($$0, f, dvt.b(dvt.a($$5, $$6, 0.25, $$1.b(dwi.i))));
      $$0.a(g, a($$9));
      dvs $$10 = dvt.b($$1.b(dwi.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      iw<dvs> $$11 = $$0.a(l, dvt.b(dvt.a($$5, $$6, 0.25, $$1.b(dwi.g))));
      iw<dvs> $$12 = $$0.a(m, dvt.b(dvt.a($$5, $$6, 0.25, $$1.b(dwi.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dvt.a(dvt.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dvt.d(dvt.a($$1.b(dwi.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      ql<dvs> $$0, ix<dvs> $$1, dvs $$2, iw<dvs> $$3, iw<dvs> $$4, akg<dvs> $$5, akg<dvs> $$6, akg<dvs> $$7, akg<dvs> $$8, akg<dvs> $$9, boolean $$10
   ) {
      dvt.w.a $$11 = new dvt.w.a($$3);
      dvt.w.a $$12 = new dvt.w.a($$4);
      dvt.w.a $$13 = new dvt.w.a($$1.b(f));
      dvt.w.a $$14 = new dvt.w.a($$1.b(g));
      dvs $$15 = a($$0, $$5, a(dvt.a(dvt.a(-0.50375F), dvt.a(ra.a($$11, $$12, $$14, $$10))), dvt.c()));
      dvs $$16 = a($$0, $$6, a(dvt.a(ra.a($$11, $$12, $$13, $$14, $$10)), s));
      dvs $$17 = a($$0, $$8, dvt.a(dvt.a(-64, 320, 1.5, -1.5), $$15));
      dvs $$18 = a($$0, $$7, a(dvt.a(ra.b($$11, $$12, $$13, $$14, $$10)), t));
      dvs $$19 = dvt.b($$18, $$2.g());
      dvs $$20 = b($$16, dvt.a($$17, $$19));
      $$0.a($$9, dvt.a($$20, a($$1, y)));
   }

   private static dvs a(ql<dvs> $$0, akg<dvs> $$1, dvs $$2) {
      return new dvt.j($$0.a($$1, $$2));
   }

   private static dvs a(ix<dvs> $$0, akg<dvs> $$1) {
      return new dvt.j($$0.b($$1));
   }

   private static dvs a(dvs $$0) {
      return dvt.b(dvt.a(dvt.a($$0.d(), dvt.a(-0.6666666666666666)).d(), dvt.a(-0.3333333333333333)), dvt.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dvs b(ix<eld.a> $$0) {
      dvs $$1 = dvt.a($$0.b(dwi.z));
      dvs $$2 = dvt.a($$0.b(dwi.A), 0.0, -0.1);
      return dvt.d(dvt.b($$2, dvt.a($$1.d(), dvt.a(-0.4))));
   }

   private static dvs d(ix<dvs> $$0, ix<eld.a> $$1) {
      dvs $$2 = dvt.d(dvt.b($$1.b(dwi.x), 2.0, 1.0));
      dvs $$3 = dvt.a($$1.b(dwi.y), -0.065, -0.088);
      dvs $$4 = dvt.a($$2, $$1.b(dwi.v), dvt.z.a.a);
      dvs $$5 = dvt.a($$2, $$1.b(dwi.w), dvt.z.a.a);
      dvs $$6 = dvt.a(dvt.d($$4, $$5), $$3).a(-1.0, 1.0);
      dvs $$7 = a($$0, N);
      dvs $$8 = dvt.b($$1.b(dwi.B), 0.75, 0.5);
      dvs $$9 = dvt.a(dvt.a($$8, dvt.a(0.37)), dvt.a(-10, 30, 0.3, 0.0));
      return dvt.d(dvt.c($$9, dvt.a($$7, $$6)));
   }

   private static dvs e(ix<dvs> $$0, ix<eld.a> $$1) {
      dvs $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dvs $$6 = a($$2, dvt.b($$1.b(dwi.I), 1.0, 1.0), -60, 320, -1);
      dvs $$7 = a($$2, dvt.a($$1.b(dwi.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dvs $$9 = a($$2, dvt.b($$1.b(dwi.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dvs $$10 = a($$2, dvt.b($$1.b(dwi.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dvs $$11 = dvt.b(dvt.a(1.5), dvt.d($$9.d(), $$10.d()));
      return dvt.a($$6, -1000000.0, 0.0, dvt.a(64.0), dvt.a($$7, $$11));
   }

   private static dvs c(ix<eld.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dvs $$3 = dvt.b($$0.b(dwi.o), 25.0, 0.3);
      dvs $$4 = dvt.a($$0.b(dwi.p), 0.0, -2.0);
      dvs $$5 = dvt.a($$0.b(dwi.q), 0.0, 1.1);
      dvs $$6 = dvt.a(dvt.b($$3, dvt.a(2.0)), $$4);
      return dvt.d(dvt.b($$6, $$5.f()));
   }

   private static dvs f(ix<dvs> $$0, ix<eld.a> $$1) {
      dvs $$2 = dvt.b($$1.b(dwi.t), 2.0, 1.0);
      dvs $$3 = dvt.a($$2, $$1.b(dwi.r), dvt.z.a.b);
      dvs $$4 = dvt.a($$1.b(dwi.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dvs $$5 = a($$0, R);
      dvs $$6 = dvt.a($$4, dvt.a(-64, 320, 8.0, -40.0)).d();
      dvs $$7 = dvt.a($$6, $$5).f();
      double $$8 = 0.083;
      dvs $$9 = dvt.a($$3, dvt.b(dvt.a(0.083), $$5));
      return dvt.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dvs a(ix<dvs> $$0, ix<eld.a> $$1, dvs $$2) {
      dvs $$3 = a($$0, S);
      dvs $$4 = a($$0, N);
      dvs $$5 = dvt.a($$1.b(dwi.C), 8.0);
      dvs $$6 = dvt.b(dvt.a(4.0), $$5.e());
      dvs $$7 = dvt.a($$1.b(dwi.D), 0.6666666666666666);
      dvs $$8 = dvt.a(dvt.a(dvt.a(0.27), $$7).a(-1.0, 1.0), dvt.a(dvt.a(1.5), dvt.b(dvt.a(-0.64), $$2)).a(0.0, 0.5));
      dvs $$9 = dvt.a($$6, $$8);
      dvs $$10 = dvt.c(dvt.c($$9, a($$0, O)), dvt.a($$3, $$4));
      dvs $$11 = a($$0, Q);
      dvs $$12 = dvt.a($$11, -1000000.0, 0.03, dvt.a(-1000000.0), $$11);
      return dvt.d($$10, $$12);
   }

   private static dvs b(dvs $$0) {
      dvs $$1 = dvt.f($$0);
      return dvt.b(dvt.a($$1), dvt.a(0.64)).i();
   }

   protected static dwf a(ix<dvs> $$0, ix<eld.a> $$1, boolean $$2, boolean $$3) {
      dvs $$4 = dvt.a($$1.b(dwi.k), 0.5);
      dvs $$5 = dvt.a($$1.b(dwi.l), 0.67);
      dvs $$6 = dvt.a($$1.b(dwi.n), 0.7142857142857143);
      dvs $$7 = dvt.a($$1.b(dwi.m));
      dvs $$8 = a($$0, w);
      dvs $$9 = a($$0, x);
      dvs $$10 = dvt.a($$8, $$9, 0.25, $$1.b($$2 ? dwi.e : dwi.a));
      dvs $$11 = dvt.a($$8, $$9, 0.25, $$1.b($$2 ? dwi.f : dwi.b));
      dvs $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dvs $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dvs $$14 = b(dvt.c($$12), $$13);
      dvs $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dvs $$16 = dvt.c($$15, dvt.b(dvt.a(5.0), a($$0, O)));
      dvs $$17 = dvt.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dvs $$18 = dvt.c(b(a($$3, $$17)), a($$0, P));
      dvs $$19 = a($$0, v);
      int $$20 = Stream.of(dwj.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dtz.e * 2);
      int $$21 = Stream.of(dwj.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dtz.e * 2);
      dvs $$22 = a($$19, dvt.b($$1.b(dwi.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dvs $$24 = a($$19, dvt.b($$1.b(dwi.F), 4.0, 4.0), $$20, $$21, 0).d();
      dvs $$25 = a($$19, dvt.b($$1.b(dwi.G), 4.0, 4.0), $$20, $$21, 0).d();
      dvs $$26 = dvt.a(dvt.a(-0.08F), dvt.d($$24, $$25));
      dvs $$27 = dvt.a($$1.b(dwi.H));
      return new dwf(
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
         a($$3, dvt.a($$14, dvt.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dwf b(ix<dvs> $$0, ix<eld.a> $$1, dvs $$2) {
      dvs $$3 = a($$0, w);
      dvs $$4 = a($$0, x);
      dvs $$5 = dvt.a($$3, $$4, 0.25, $$1.b(dwi.a));
      dvs $$6 = dvt.a($$3, $$4, 0.25, $$1.b(dwi.b));
      dvs $$7 = b($$2);
      return new dwf(dvt.a(), dvt.a(), dvt.a(), dvt.a(), $$5, $$6, dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), $$7, dvt.a(), dvt.a(), dvt.a());
   }

   private static dvs a(boolean $$0, dvs $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dvs a(ix<dvs> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dvs a(dvs $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dwf a(ix<dvs> $$0, ix<eld.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dwf b(ix<dvs> $$0, ix<eld.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dwf c(ix<dvs> $$0, ix<eld.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dvs c(dvs $$0) {
      return a($$0, 0, 128);
   }

   protected static dwf a(ix<dvs> $$0) {
      dvs $$1 = dvt.c(dvt.a(0L));
      dvs $$2 = b(c(a($$0, M)));
      return new dwf(
         dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), $$1, dvt.a(), dvt.a(), c(dvt.a($$1, dvt.a(-0.703125))), $$2, dvt.a(), dvt.a(), dvt.a()
      );
   }

   protected static dwf a() {
      return new dwf(dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a(), dvt.a());
   }

   private static dvs a(dvs $$0, dvs $$1) {
      dvs $$2 = dvt.a(dvt.b(), $$1, $$0);
      return dvt.b(dvt.c($$2));
   }

   private static dvs b(dvs $$0, dvs $$1) {
      dvs $$2 = dvt.b($$1, $$0);
      return dvt.b(dvt.a(4.0), $$2.h());
   }

   private static dvs a(dvs $$0, dvs $$1, int $$2, int $$3, int $$4) {
      return dvt.a(dvt.a($$0, (double)$$2, (double)($$3 + 1), $$1, dvt.a((double)$$4)));
   }

   private static dvs a(dvs $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dvs $$10 = dvt.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dvs $$9 = dvt.a($$10, $$5, $$0);
      dvs $$11 = dvt.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dvt.a($$11, $$8, $$9);
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
