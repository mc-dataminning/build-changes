import java.util.stream.Stream;

public class doq {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final doc s = dod.a(10.0);
   private static final doc t = dod.a();
   private static final ahc<doc> u = a("zero");
   private static final ahc<doc> v = a("y");
   private static final ahc<doc> w = a("shift_x");
   private static final ahc<doc> x = a("shift_z");
   private static final ahc<doc> y = a("overworld/base_3d_noise");
   private static final ahc<doc> z = a("nether/base_3d_noise");
   private static final ahc<doc> A = a("end/base_3d_noise");
   public static final ahc<doc> d = a("overworld/continents");
   public static final ahc<doc> e = a("overworld/erosion");
   public static final ahc<doc> f = a("overworld/ridges");
   public static final ahc<doc> g = a("overworld/ridges_folded");
   public static final ahc<doc> h = a("overworld/offset");
   public static final ahc<doc> i = a("overworld/factor");
   public static final ahc<doc> j = a("overworld/jaggedness");
   public static final ahc<doc> k = a("overworld/depth");
   private static final ahc<doc> B = a("overworld/sloped_cheese");
   public static final ahc<doc> l = a("overworld_large_biomes/continents");
   public static final ahc<doc> m = a("overworld_large_biomes/erosion");
   private static final ahc<doc> C = a("overworld_large_biomes/offset");
   private static final ahc<doc> D = a("overworld_large_biomes/factor");
   private static final ahc<doc> E = a("overworld_large_biomes/jaggedness");
   private static final ahc<doc> F = a("overworld_large_biomes/depth");
   private static final ahc<doc> G = a("overworld_large_biomes/sloped_cheese");
   private static final ahc<doc> H = a("overworld_amplified/offset");
   private static final ahc<doc> I = a("overworld_amplified/factor");
   private static final ahc<doc> J = a("overworld_amplified/jaggedness");
   private static final ahc<doc> K = a("overworld_amplified/depth");
   private static final ahc<doc> L = a("overworld_amplified/sloped_cheese");
   private static final ahc<doc> M = a("end/sloped_cheese");
   private static final ahc<doc> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ahc<doc> O = a("overworld/caves/entrances");
   private static final ahc<doc> P = a("overworld/caves/noodle");
   private static final ahc<doc> Q = a("overworld/caves/pillars");
   private static final ahc<doc> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ahc<doc> S = a("overworld/caves/spaghetti_2d");

   private static ahc<doc> a(String $$0) {
      return ahc.a(ke.ax, new ahd($$0));
   }

   public static ih<? extends doc> a(pc<doc> $$0) {
      ii<edn.a> $$1 = $$0.a(ke.aB);
      ii<doc> $$2 = $$0.a(ke.ax);
      $$0.a(u, dod.a());
      int $$3 = dmj.e * 2;
      int $$4 = dmj.d * 2;
      $$0.a(v, dod.a($$3, $$4, (double)$$3, (double)$$4));
      doc $$5 = a($$0, w, dod.b(dod.c(dod.b($$1.b(dos.j)))));
      doc $$6 = a($$0, x, dod.b(dod.c(dod.c($$1.b(dos.j)))));
      $$0.a(y, edk.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, edk.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, edk.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ih<doc> $$7 = $$0.a(d, dod.b(dod.a($$5, $$6, 0.25, $$1.b(dos.c))));
      ih<doc> $$8 = $$0.a(e, dod.b(dod.a($$5, $$6, 0.25, $$1.b(dos.d))));
      doc $$9 = a($$0, f, dod.b(dod.a($$5, $$6, 0.25, $$1.b(dos.i))));
      $$0.a(g, a($$9));
      doc $$10 = dod.b($$1.b(dos.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ih<doc> $$11 = $$0.a(l, dod.b(dod.a($$5, $$6, 0.25, $$1.b(dos.g))));
      ih<doc> $$12 = $$0.a(m, dod.b(dod.a($$5, $$6, 0.25, $$1.b(dos.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dod.a(dod.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dod.d(dod.a($$1.b(dos.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      pc<doc> $$0, ii<doc> $$1, doc $$2, ih<doc> $$3, ih<doc> $$4, ahc<doc> $$5, ahc<doc> $$6, ahc<doc> $$7, ahc<doc> $$8, ahc<doc> $$9, boolean $$10
   ) {
      dod.w.a $$11 = new dod.w.a($$3);
      dod.w.a $$12 = new dod.w.a($$4);
      dod.w.a $$13 = new dod.w.a($$1.b(f));
      dod.w.a $$14 = new dod.w.a($$1.b(g));
      doc $$15 = a($$0, $$5, a(dod.a(dod.a(-0.50375F), dod.a(pr.a($$11, $$12, $$14, $$10))), dod.c()));
      doc $$16 = a($$0, $$6, a(dod.a(pr.a($$11, $$12, $$13, $$14, $$10)), s));
      doc $$17 = a($$0, $$8, dod.a(dod.a(-64, 320, 1.5, -1.5), $$15));
      doc $$18 = a($$0, $$7, a(dod.a(pr.b($$11, $$12, $$13, $$14, $$10)), t));
      doc $$19 = dod.b($$18, $$2.g());
      doc $$20 = b($$16, dod.a($$17, $$19));
      $$0.a($$9, dod.a($$20, a($$1, y)));
   }

   private static doc a(pc<doc> $$0, ahc<doc> $$1, doc $$2) {
      return new dod.j($$0.a($$1, $$2));
   }

   private static doc a(ii<doc> $$0, ahc<doc> $$1) {
      return new dod.j($$0.b($$1));
   }

   private static doc a(doc $$0) {
      return dod.b(dod.a(dod.a($$0.d(), dod.a(-0.6666666666666666)).d(), dod.a(-0.3333333333333333)), dod.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static doc b(ii<edn.a> $$0) {
      doc $$1 = dod.a($$0.b(dos.z));
      doc $$2 = dod.a($$0.b(dos.A), 0.0, -0.1);
      return dod.d(dod.b($$2, dod.a($$1.d(), dod.a(-0.4))));
   }

   private static doc d(ii<doc> $$0, ii<edn.a> $$1) {
      doc $$2 = dod.d(dod.b($$1.b(dos.x), 2.0, 1.0));
      doc $$3 = dod.a($$1.b(dos.y), -0.065, -0.088);
      doc $$4 = dod.a($$2, $$1.b(dos.v), dod.z.a.a);
      doc $$5 = dod.a($$2, $$1.b(dos.w), dod.z.a.a);
      doc $$6 = dod.a(dod.d($$4, $$5), $$3).a(-1.0, 1.0);
      doc $$7 = a($$0, N);
      doc $$8 = dod.b($$1.b(dos.B), 0.75, 0.5);
      doc $$9 = dod.a(dod.a($$8, dod.a(0.37)), dod.a(-10, 30, 0.3, 0.0));
      return dod.d(dod.c($$9, dod.a($$7, $$6)));
   }

   private static doc e(ii<doc> $$0, ii<edn.a> $$1) {
      doc $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      doc $$6 = a($$2, dod.b($$1.b(dos.I), 1.0, 1.0), -60, 320, -1);
      doc $$7 = a($$2, dod.a($$1.b(dos.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      doc $$9 = a($$2, dod.b($$1.b(dos.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      doc $$10 = a($$2, dod.b($$1.b(dos.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      doc $$11 = dod.b(dod.a(1.5), dod.d($$9.d(), $$10.d()));
      return dod.a($$6, -1000000.0, 0.0, dod.a(64.0), dod.a($$7, $$11));
   }

   private static doc c(ii<edn.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      doc $$3 = dod.b($$0.b(dos.o), 25.0, 0.3);
      doc $$4 = dod.a($$0.b(dos.p), 0.0, -2.0);
      doc $$5 = dod.a($$0.b(dos.q), 0.0, 1.1);
      doc $$6 = dod.a(dod.b($$3, dod.a(2.0)), $$4);
      return dod.d(dod.b($$6, $$5.f()));
   }

   private static doc f(ii<doc> $$0, ii<edn.a> $$1) {
      doc $$2 = dod.b($$1.b(dos.t), 2.0, 1.0);
      doc $$3 = dod.a($$2, $$1.b(dos.r), dod.z.a.b);
      doc $$4 = dod.a($$1.b(dos.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      doc $$5 = a($$0, R);
      doc $$6 = dod.a($$4, dod.a(-64, 320, 8.0, -40.0)).d();
      doc $$7 = dod.a($$6, $$5).f();
      double $$8 = 0.083;
      doc $$9 = dod.a($$3, dod.b(dod.a(0.083), $$5));
      return dod.d($$9, $$7).a(-1.0, 1.0);
   }

   private static doc a(ii<doc> $$0, ii<edn.a> $$1, doc $$2) {
      doc $$3 = a($$0, S);
      doc $$4 = a($$0, N);
      doc $$5 = dod.a($$1.b(dos.C), 8.0);
      doc $$6 = dod.b(dod.a(4.0), $$5.e());
      doc $$7 = dod.a($$1.b(dos.D), 0.6666666666666666);
      doc $$8 = dod.a(dod.a(dod.a(0.27), $$7).a(-1.0, 1.0), dod.a(dod.a(1.5), dod.b(dod.a(-0.64), $$2)).a(0.0, 0.5));
      doc $$9 = dod.a($$6, $$8);
      doc $$10 = dod.c(dod.c($$9, a($$0, O)), dod.a($$3, $$4));
      doc $$11 = a($$0, Q);
      doc $$12 = dod.a($$11, -1000000.0, 0.03, dod.a(-1000000.0), $$11);
      return dod.d($$10, $$12);
   }

   private static doc b(doc $$0) {
      doc $$1 = dod.f($$0);
      return dod.b(dod.a($$1), dod.a(0.64)).i();
   }

   protected static dop a(ii<doc> $$0, ii<edn.a> $$1, boolean $$2, boolean $$3) {
      doc $$4 = dod.a($$1.b(dos.k), 0.5);
      doc $$5 = dod.a($$1.b(dos.l), 0.67);
      doc $$6 = dod.a($$1.b(dos.n), 0.7142857142857143);
      doc $$7 = dod.a($$1.b(dos.m));
      doc $$8 = a($$0, w);
      doc $$9 = a($$0, x);
      doc $$10 = dod.a($$8, $$9, 0.25, $$1.b($$2 ? dos.e : dos.a));
      doc $$11 = dod.a($$8, $$9, 0.25, $$1.b($$2 ? dos.f : dos.b));
      doc $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      doc $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      doc $$14 = b(dod.c($$12), $$13);
      doc $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      doc $$16 = dod.c($$15, dod.b(dod.a(5.0), a($$0, O)));
      doc $$17 = dod.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      doc $$18 = dod.c(b(a($$3, $$17)), a($$0, P));
      doc $$19 = a($$0, v);
      int $$20 = Stream.of(dot.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dmj.e * 2);
      int $$21 = Stream.of(dot.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dmj.e * 2);
      doc $$22 = a($$19, dod.b($$1.b(dos.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      doc $$24 = a($$19, dod.b($$1.b(dos.F), 4.0, 4.0), $$20, $$21, 0).d();
      doc $$25 = a($$19, dod.b($$1.b(dos.G), 4.0, 4.0), $$20, $$21, 0).d();
      doc $$26 = dod.a(dod.a(-0.08F), dod.d($$24, $$25));
      doc $$27 = dod.a($$1.b(dos.H));
      return new dop(
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
         a($$3, dod.a($$14, dod.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dop b(ii<doc> $$0, ii<edn.a> $$1, doc $$2) {
      doc $$3 = a($$0, w);
      doc $$4 = a($$0, x);
      doc $$5 = dod.a($$3, $$4, 0.25, $$1.b(dos.a));
      doc $$6 = dod.a($$3, $$4, 0.25, $$1.b(dos.b));
      doc $$7 = b($$2);
      return new dop(dod.a(), dod.a(), dod.a(), dod.a(), $$5, $$6, dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), $$7, dod.a(), dod.a(), dod.a());
   }

   private static doc a(boolean $$0, doc $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static doc a(ii<doc> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static doc a(doc $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dop a(ii<doc> $$0, ii<edn.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dop b(ii<doc> $$0, ii<edn.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dop c(ii<doc> $$0, ii<edn.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static doc c(doc $$0) {
      return a($$0, 0, 128);
   }

   protected static dop a(ii<doc> $$0) {
      doc $$1 = dod.c(dod.a(0L));
      doc $$2 = b(c(a($$0, M)));
      return new dop(
         dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), $$1, dod.a(), dod.a(), c(dod.a($$1, dod.a(-0.703125))), $$2, dod.a(), dod.a(), dod.a()
      );
   }

   protected static dop a() {
      return new dop(dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), dod.a(), dod.a());
   }

   private static doc a(doc $$0, doc $$1) {
      doc $$2 = dod.a(dod.b(), $$1, $$0);
      return dod.b(dod.c($$2));
   }

   private static doc b(doc $$0, doc $$1) {
      doc $$2 = dod.b($$1, $$0);
      return dod.b(dod.a(4.0), $$2.h());
   }

   private static doc a(doc $$0, doc $$1, int $$2, int $$3, int $$4) {
      return dod.a(dod.a($$0, (double)$$2, (double)($$3 + 1), $$1, dod.a((double)$$4)));
   }

   private static doc a(doc $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      doc $$10 = dod.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      doc $$9 = dod.a($$10, $$5, $$0);
      doc $$11 = dod.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dod.a($$11, $$8, $$9);
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
