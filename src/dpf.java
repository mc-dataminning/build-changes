import java.util.stream.Stream;

public class dpf {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dor s = dos.a(10.0);
   private static final dor t = dos.a();
   private static final ahg<dor> u = a("zero");
   private static final ahg<dor> v = a("y");
   private static final ahg<dor> w = a("shift_x");
   private static final ahg<dor> x = a("shift_z");
   private static final ahg<dor> y = a("overworld/base_3d_noise");
   private static final ahg<dor> z = a("nether/base_3d_noise");
   private static final ahg<dor> A = a("end/base_3d_noise");
   public static final ahg<dor> d = a("overworld/continents");
   public static final ahg<dor> e = a("overworld/erosion");
   public static final ahg<dor> f = a("overworld/ridges");
   public static final ahg<dor> g = a("overworld/ridges_folded");
   public static final ahg<dor> h = a("overworld/offset");
   public static final ahg<dor> i = a("overworld/factor");
   public static final ahg<dor> j = a("overworld/jaggedness");
   public static final ahg<dor> k = a("overworld/depth");
   private static final ahg<dor> B = a("overworld/sloped_cheese");
   public static final ahg<dor> l = a("overworld_large_biomes/continents");
   public static final ahg<dor> m = a("overworld_large_biomes/erosion");
   private static final ahg<dor> C = a("overworld_large_biomes/offset");
   private static final ahg<dor> D = a("overworld_large_biomes/factor");
   private static final ahg<dor> E = a("overworld_large_biomes/jaggedness");
   private static final ahg<dor> F = a("overworld_large_biomes/depth");
   private static final ahg<dor> G = a("overworld_large_biomes/sloped_cheese");
   private static final ahg<dor> H = a("overworld_amplified/offset");
   private static final ahg<dor> I = a("overworld_amplified/factor");
   private static final ahg<dor> J = a("overworld_amplified/jaggedness");
   private static final ahg<dor> K = a("overworld_amplified/depth");
   private static final ahg<dor> L = a("overworld_amplified/sloped_cheese");
   private static final ahg<dor> M = a("end/sloped_cheese");
   private static final ahg<dor> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ahg<dor> O = a("overworld/caves/entrances");
   private static final ahg<dor> P = a("overworld/caves/noodle");
   private static final ahg<dor> Q = a("overworld/caves/pillars");
   private static final ahg<dor> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ahg<dor> S = a("overworld/caves/spaghetti_2d");

   private static ahg<dor> a(String $$0) {
      return ahg.a(ke.ax, new ahh($$0));
   }

   public static ih<? extends dor> a(pf<dor> $$0) {
      ii<eec.a> $$1 = $$0.a(ke.aB);
      ii<dor> $$2 = $$0.a(ke.ax);
      $$0.a(u, dos.a());
      int $$3 = dmy.e * 2;
      int $$4 = dmy.d * 2;
      $$0.a(v, dos.a($$3, $$4, (double)$$3, (double)$$4));
      dor $$5 = a($$0, w, dos.b(dos.c(dos.b($$1.b(dph.j)))));
      dor $$6 = a($$0, x, dos.b(dos.c(dos.c($$1.b(dph.j)))));
      $$0.a(y, edz.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, edz.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, edz.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ih<dor> $$7 = $$0.a(d, dos.b(dos.a($$5, $$6, 0.25, $$1.b(dph.c))));
      ih<dor> $$8 = $$0.a(e, dos.b(dos.a($$5, $$6, 0.25, $$1.b(dph.d))));
      dor $$9 = a($$0, f, dos.b(dos.a($$5, $$6, 0.25, $$1.b(dph.i))));
      $$0.a(g, a($$9));
      dor $$10 = dos.b($$1.b(dph.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ih<dor> $$11 = $$0.a(l, dos.b(dos.a($$5, $$6, 0.25, $$1.b(dph.g))));
      ih<dor> $$12 = $$0.a(m, dos.b(dos.a($$5, $$6, 0.25, $$1.b(dph.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dos.a(dos.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dos.d(dos.a($$1.b(dph.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      pf<dor> $$0, ii<dor> $$1, dor $$2, ih<dor> $$3, ih<dor> $$4, ahg<dor> $$5, ahg<dor> $$6, ahg<dor> $$7, ahg<dor> $$8, ahg<dor> $$9, boolean $$10
   ) {
      dos.w.a $$11 = new dos.w.a($$3);
      dos.w.a $$12 = new dos.w.a($$4);
      dos.w.a $$13 = new dos.w.a($$1.b(f));
      dos.w.a $$14 = new dos.w.a($$1.b(g));
      dor $$15 = a($$0, $$5, a(dos.a(dos.a(-0.50375F), dos.a(pu.a($$11, $$12, $$14, $$10))), dos.c()));
      dor $$16 = a($$0, $$6, a(dos.a(pu.a($$11, $$12, $$13, $$14, $$10)), s));
      dor $$17 = a($$0, $$8, dos.a(dos.a(-64, 320, 1.5, -1.5), $$15));
      dor $$18 = a($$0, $$7, a(dos.a(pu.b($$11, $$12, $$13, $$14, $$10)), t));
      dor $$19 = dos.b($$18, $$2.g());
      dor $$20 = b($$16, dos.a($$17, $$19));
      $$0.a($$9, dos.a($$20, a($$1, y)));
   }

   private static dor a(pf<dor> $$0, ahg<dor> $$1, dor $$2) {
      return new dos.j($$0.a($$1, $$2));
   }

   private static dor a(ii<dor> $$0, ahg<dor> $$1) {
      return new dos.j($$0.b($$1));
   }

   private static dor a(dor $$0) {
      return dos.b(dos.a(dos.a($$0.d(), dos.a(-0.6666666666666666)).d(), dos.a(-0.3333333333333333)), dos.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dor b(ii<eec.a> $$0) {
      dor $$1 = dos.a($$0.b(dph.z));
      dor $$2 = dos.a($$0.b(dph.A), 0.0, -0.1);
      return dos.d(dos.b($$2, dos.a($$1.d(), dos.a(-0.4))));
   }

   private static dor d(ii<dor> $$0, ii<eec.a> $$1) {
      dor $$2 = dos.d(dos.b($$1.b(dph.x), 2.0, 1.0));
      dor $$3 = dos.a($$1.b(dph.y), -0.065, -0.088);
      dor $$4 = dos.a($$2, $$1.b(dph.v), dos.z.a.a);
      dor $$5 = dos.a($$2, $$1.b(dph.w), dos.z.a.a);
      dor $$6 = dos.a(dos.d($$4, $$5), $$3).a(-1.0, 1.0);
      dor $$7 = a($$0, N);
      dor $$8 = dos.b($$1.b(dph.B), 0.75, 0.5);
      dor $$9 = dos.a(dos.a($$8, dos.a(0.37)), dos.a(-10, 30, 0.3, 0.0));
      return dos.d(dos.c($$9, dos.a($$7, $$6)));
   }

   private static dor e(ii<dor> $$0, ii<eec.a> $$1) {
      dor $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dor $$6 = a($$2, dos.b($$1.b(dph.I), 1.0, 1.0), -60, 320, -1);
      dor $$7 = a($$2, dos.a($$1.b(dph.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dor $$9 = a($$2, dos.b($$1.b(dph.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dor $$10 = a($$2, dos.b($$1.b(dph.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dor $$11 = dos.b(dos.a(1.5), dos.d($$9.d(), $$10.d()));
      return dos.a($$6, -1000000.0, 0.0, dos.a(64.0), dos.a($$7, $$11));
   }

   private static dor c(ii<eec.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dor $$3 = dos.b($$0.b(dph.o), 25.0, 0.3);
      dor $$4 = dos.a($$0.b(dph.p), 0.0, -2.0);
      dor $$5 = dos.a($$0.b(dph.q), 0.0, 1.1);
      dor $$6 = dos.a(dos.b($$3, dos.a(2.0)), $$4);
      return dos.d(dos.b($$6, $$5.f()));
   }

   private static dor f(ii<dor> $$0, ii<eec.a> $$1) {
      dor $$2 = dos.b($$1.b(dph.t), 2.0, 1.0);
      dor $$3 = dos.a($$2, $$1.b(dph.r), dos.z.a.b);
      dor $$4 = dos.a($$1.b(dph.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dor $$5 = a($$0, R);
      dor $$6 = dos.a($$4, dos.a(-64, 320, 8.0, -40.0)).d();
      dor $$7 = dos.a($$6, $$5).f();
      double $$8 = 0.083;
      dor $$9 = dos.a($$3, dos.b(dos.a(0.083), $$5));
      return dos.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dor a(ii<dor> $$0, ii<eec.a> $$1, dor $$2) {
      dor $$3 = a($$0, S);
      dor $$4 = a($$0, N);
      dor $$5 = dos.a($$1.b(dph.C), 8.0);
      dor $$6 = dos.b(dos.a(4.0), $$5.e());
      dor $$7 = dos.a($$1.b(dph.D), 0.6666666666666666);
      dor $$8 = dos.a(dos.a(dos.a(0.27), $$7).a(-1.0, 1.0), dos.a(dos.a(1.5), dos.b(dos.a(-0.64), $$2)).a(0.0, 0.5));
      dor $$9 = dos.a($$6, $$8);
      dor $$10 = dos.c(dos.c($$9, a($$0, O)), dos.a($$3, $$4));
      dor $$11 = a($$0, Q);
      dor $$12 = dos.a($$11, -1000000.0, 0.03, dos.a(-1000000.0), $$11);
      return dos.d($$10, $$12);
   }

   private static dor b(dor $$0) {
      dor $$1 = dos.f($$0);
      return dos.b(dos.a($$1), dos.a(0.64)).i();
   }

   protected static dpe a(ii<dor> $$0, ii<eec.a> $$1, boolean $$2, boolean $$3) {
      dor $$4 = dos.a($$1.b(dph.k), 0.5);
      dor $$5 = dos.a($$1.b(dph.l), 0.67);
      dor $$6 = dos.a($$1.b(dph.n), 0.7142857142857143);
      dor $$7 = dos.a($$1.b(dph.m));
      dor $$8 = a($$0, w);
      dor $$9 = a($$0, x);
      dor $$10 = dos.a($$8, $$9, 0.25, $$1.b($$2 ? dph.e : dph.a));
      dor $$11 = dos.a($$8, $$9, 0.25, $$1.b($$2 ? dph.f : dph.b));
      dor $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dor $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dor $$14 = b(dos.c($$12), $$13);
      dor $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dor $$16 = dos.c($$15, dos.b(dos.a(5.0), a($$0, O)));
      dor $$17 = dos.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dor $$18 = dos.c(b(a($$3, $$17)), a($$0, P));
      dor $$19 = a($$0, v);
      int $$20 = Stream.of(dpi.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dmy.e * 2);
      int $$21 = Stream.of(dpi.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dmy.e * 2);
      dor $$22 = a($$19, dos.b($$1.b(dph.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dor $$24 = a($$19, dos.b($$1.b(dph.F), 4.0, 4.0), $$20, $$21, 0).d();
      dor $$25 = a($$19, dos.b($$1.b(dph.G), 4.0, 4.0), $$20, $$21, 0).d();
      dor $$26 = dos.a(dos.a(-0.08F), dos.d($$24, $$25));
      dor $$27 = dos.a($$1.b(dph.H));
      return new dpe(
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
         a($$3, dos.a($$14, dos.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dpe b(ii<dor> $$0, ii<eec.a> $$1, dor $$2) {
      dor $$3 = a($$0, w);
      dor $$4 = a($$0, x);
      dor $$5 = dos.a($$3, $$4, 0.25, $$1.b(dph.a));
      dor $$6 = dos.a($$3, $$4, 0.25, $$1.b(dph.b));
      dor $$7 = b($$2);
      return new dpe(dos.a(), dos.a(), dos.a(), dos.a(), $$5, $$6, dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), $$7, dos.a(), dos.a(), dos.a());
   }

   private static dor a(boolean $$0, dor $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dor a(ii<dor> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dor a(dor $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dpe a(ii<dor> $$0, ii<eec.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dpe b(ii<dor> $$0, ii<eec.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dpe c(ii<dor> $$0, ii<eec.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dor c(dor $$0) {
      return a($$0, 0, 128);
   }

   protected static dpe a(ii<dor> $$0) {
      dor $$1 = dos.c(dos.a(0L));
      dor $$2 = b(c(a($$0, M)));
      return new dpe(
         dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), $$1, dos.a(), dos.a(), c(dos.a($$1, dos.a(-0.703125))), $$2, dos.a(), dos.a(), dos.a()
      );
   }

   protected static dpe a() {
      return new dpe(dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), dos.a(), dos.a());
   }

   private static dor a(dor $$0, dor $$1) {
      dor $$2 = dos.a(dos.b(), $$1, $$0);
      return dos.b(dos.c($$2));
   }

   private static dor b(dor $$0, dor $$1) {
      dor $$2 = dos.b($$1, $$0);
      return dos.b(dos.a(4.0), $$2.h());
   }

   private static dor a(dor $$0, dor $$1, int $$2, int $$3, int $$4) {
      return dos.a(dos.a($$0, (double)$$2, (double)($$3 + 1), $$1, dos.a((double)$$4)));
   }

   private static dor a(dor $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dor $$10 = dos.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dor $$9 = dos.a($$10, $$5, $$0);
      dor $$11 = dos.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dos.a($$11, $$8, $$9);
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
