import java.util.stream.Stream;

public class dnd {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dmp s = dmq.a(10.0);
   private static final dmp t = dmq.a();
   private static final agl<dmp> u = a("zero");
   private static final agl<dmp> v = a("y");
   private static final agl<dmp> w = a("shift_x");
   private static final agl<dmp> x = a("shift_z");
   private static final agl<dmp> y = a("overworld/base_3d_noise");
   private static final agl<dmp> z = a("nether/base_3d_noise");
   private static final agl<dmp> A = a("end/base_3d_noise");
   public static final agl<dmp> d = a("overworld/continents");
   public static final agl<dmp> e = a("overworld/erosion");
   public static final agl<dmp> f = a("overworld/ridges");
   public static final agl<dmp> g = a("overworld/ridges_folded");
   public static final agl<dmp> h = a("overworld/offset");
   public static final agl<dmp> i = a("overworld/factor");
   public static final agl<dmp> j = a("overworld/jaggedness");
   public static final agl<dmp> k = a("overworld/depth");
   private static final agl<dmp> B = a("overworld/sloped_cheese");
   public static final agl<dmp> l = a("overworld_large_biomes/continents");
   public static final agl<dmp> m = a("overworld_large_biomes/erosion");
   private static final agl<dmp> C = a("overworld_large_biomes/offset");
   private static final agl<dmp> D = a("overworld_large_biomes/factor");
   private static final agl<dmp> E = a("overworld_large_biomes/jaggedness");
   private static final agl<dmp> F = a("overworld_large_biomes/depth");
   private static final agl<dmp> G = a("overworld_large_biomes/sloped_cheese");
   private static final agl<dmp> H = a("overworld_amplified/offset");
   private static final agl<dmp> I = a("overworld_amplified/factor");
   private static final agl<dmp> J = a("overworld_amplified/jaggedness");
   private static final agl<dmp> K = a("overworld_amplified/depth");
   private static final agl<dmp> L = a("overworld_amplified/sloped_cheese");
   private static final agl<dmp> M = a("end/sloped_cheese");
   private static final agl<dmp> N = a("overworld/caves/spaghetti_roughness_function");
   private static final agl<dmp> O = a("overworld/caves/entrances");
   private static final agl<dmp> P = a("overworld/caves/noodle");
   private static final agl<dmp> Q = a("overworld/caves/pillars");
   private static final agl<dmp> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final agl<dmp> S = a("overworld/caves/spaghetti_2d");

   private static agl<dmp> a(String $$0) {
      return agl.a(kd.av, new agm($$0));
   }

   public static ig<? extends dmp> a(oz<dmp> $$0) {
      ih<eca.a> $$1 = $$0.a(kd.az);
      ih<dmp> $$2 = $$0.a(kd.av);
      $$0.a(u, dmq.a());
      int $$3 = dkw.e * 2;
      int $$4 = dkw.d * 2;
      $$0.a(v, dmq.a($$3, $$4, (double)$$3, (double)$$4));
      dmp $$5 = a($$0, w, dmq.b(dmq.c(dmq.b($$1.b(dnf.j)))));
      dmp $$6 = a($$0, x, dmq.b(dmq.c(dmq.c($$1.b(dnf.j)))));
      $$0.a(y, ebx.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ebx.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ebx.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ig<dmp> $$7 = $$0.a(d, dmq.b(dmq.a($$5, $$6, 0.25, $$1.b(dnf.c))));
      ig<dmp> $$8 = $$0.a(e, dmq.b(dmq.a($$5, $$6, 0.25, $$1.b(dnf.d))));
      dmp $$9 = a($$0, f, dmq.b(dmq.a($$5, $$6, 0.25, $$1.b(dnf.i))));
      $$0.a(g, a($$9));
      dmp $$10 = dmq.b($$1.b(dnf.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ig<dmp> $$11 = $$0.a(l, dmq.b(dmq.a($$5, $$6, 0.25, $$1.b(dnf.g))));
      ig<dmp> $$12 = $$0.a(m, dmq.b(dmq.a($$5, $$6, 0.25, $$1.b(dnf.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dmq.a(dmq.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dmq.d(dmq.a($$1.b(dnf.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      oz<dmp> $$0, ih<dmp> $$1, dmp $$2, ig<dmp> $$3, ig<dmp> $$4, agl<dmp> $$5, agl<dmp> $$6, agl<dmp> $$7, agl<dmp> $$8, agl<dmp> $$9, boolean $$10
   ) {
      dmq.w.a $$11 = new dmq.w.a($$3);
      dmq.w.a $$12 = new dmq.w.a($$4);
      dmq.w.a $$13 = new dmq.w.a($$1.b(f));
      dmq.w.a $$14 = new dmq.w.a($$1.b(g));
      dmp $$15 = a($$0, $$5, a(dmq.a(dmq.a(-0.50375F), dmq.a(po.a($$11, $$12, $$14, $$10))), dmq.c()));
      dmp $$16 = a($$0, $$6, a(dmq.a(po.a($$11, $$12, $$13, $$14, $$10)), s));
      dmp $$17 = a($$0, $$8, dmq.a(dmq.a(-64, 320, 1.5, -1.5), $$15));
      dmp $$18 = a($$0, $$7, a(dmq.a(po.b($$11, $$12, $$13, $$14, $$10)), t));
      dmp $$19 = dmq.b($$18, $$2.g());
      dmp $$20 = b($$16, dmq.a($$17, $$19));
      $$0.a($$9, dmq.a($$20, a($$1, y)));
   }

   private static dmp a(oz<dmp> $$0, agl<dmp> $$1, dmp $$2) {
      return new dmq.j($$0.a($$1, $$2));
   }

   private static dmp a(ih<dmp> $$0, agl<dmp> $$1) {
      return new dmq.j($$0.b($$1));
   }

   private static dmp a(dmp $$0) {
      return dmq.b(dmq.a(dmq.a($$0.d(), dmq.a(-0.6666666666666666)).d(), dmq.a(-0.3333333333333333)), dmq.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dmp b(ih<eca.a> $$0) {
      dmp $$1 = dmq.a($$0.b(dnf.z));
      dmp $$2 = dmq.a($$0.b(dnf.A), 0.0, -0.1);
      return dmq.d(dmq.b($$2, dmq.a($$1.d(), dmq.a(-0.4))));
   }

   private static dmp d(ih<dmp> $$0, ih<eca.a> $$1) {
      dmp $$2 = dmq.d(dmq.b($$1.b(dnf.x), 2.0, 1.0));
      dmp $$3 = dmq.a($$1.b(dnf.y), -0.065, -0.088);
      dmp $$4 = dmq.a($$2, $$1.b(dnf.v), dmq.z.a.a);
      dmp $$5 = dmq.a($$2, $$1.b(dnf.w), dmq.z.a.a);
      dmp $$6 = dmq.a(dmq.d($$4, $$5), $$3).a(-1.0, 1.0);
      dmp $$7 = a($$0, N);
      dmp $$8 = dmq.b($$1.b(dnf.B), 0.75, 0.5);
      dmp $$9 = dmq.a(dmq.a($$8, dmq.a(0.37)), dmq.a(-10, 30, 0.3, 0.0));
      return dmq.d(dmq.c($$9, dmq.a($$7, $$6)));
   }

   private static dmp e(ih<dmp> $$0, ih<eca.a> $$1) {
      dmp $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dmp $$6 = a($$2, dmq.b($$1.b(dnf.I), 1.0, 1.0), -60, 320, -1);
      dmp $$7 = a($$2, dmq.a($$1.b(dnf.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dmp $$9 = a($$2, dmq.b($$1.b(dnf.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dmp $$10 = a($$2, dmq.b($$1.b(dnf.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dmp $$11 = dmq.b(dmq.a(1.5), dmq.d($$9.d(), $$10.d()));
      return dmq.a($$6, -1000000.0, 0.0, dmq.a(64.0), dmq.a($$7, $$11));
   }

   private static dmp c(ih<eca.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dmp $$3 = dmq.b($$0.b(dnf.o), 25.0, 0.3);
      dmp $$4 = dmq.a($$0.b(dnf.p), 0.0, -2.0);
      dmp $$5 = dmq.a($$0.b(dnf.q), 0.0, 1.1);
      dmp $$6 = dmq.a(dmq.b($$3, dmq.a(2.0)), $$4);
      return dmq.d(dmq.b($$6, $$5.f()));
   }

   private static dmp f(ih<dmp> $$0, ih<eca.a> $$1) {
      dmp $$2 = dmq.b($$1.b(dnf.t), 2.0, 1.0);
      dmp $$3 = dmq.a($$2, $$1.b(dnf.r), dmq.z.a.b);
      dmp $$4 = dmq.a($$1.b(dnf.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dmp $$5 = a($$0, R);
      dmp $$6 = dmq.a($$4, dmq.a(-64, 320, 8.0, -40.0)).d();
      dmp $$7 = dmq.a($$6, $$5).f();
      double $$8 = 0.083;
      dmp $$9 = dmq.a($$3, dmq.b(dmq.a(0.083), $$5));
      return dmq.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dmp a(ih<dmp> $$0, ih<eca.a> $$1, dmp $$2) {
      dmp $$3 = a($$0, S);
      dmp $$4 = a($$0, N);
      dmp $$5 = dmq.a($$1.b(dnf.C), 8.0);
      dmp $$6 = dmq.b(dmq.a(4.0), $$5.e());
      dmp $$7 = dmq.a($$1.b(dnf.D), 0.6666666666666666);
      dmp $$8 = dmq.a(dmq.a(dmq.a(0.27), $$7).a(-1.0, 1.0), dmq.a(dmq.a(1.5), dmq.b(dmq.a(-0.64), $$2)).a(0.0, 0.5));
      dmp $$9 = dmq.a($$6, $$8);
      dmp $$10 = dmq.c(dmq.c($$9, a($$0, O)), dmq.a($$3, $$4));
      dmp $$11 = a($$0, Q);
      dmp $$12 = dmq.a($$11, -1000000.0, 0.03, dmq.a(-1000000.0), $$11);
      return dmq.d($$10, $$12);
   }

   private static dmp b(dmp $$0) {
      dmp $$1 = dmq.f($$0);
      return dmq.b(dmq.a($$1), dmq.a(0.64)).i();
   }

   protected static dnc a(ih<dmp> $$0, ih<eca.a> $$1, boolean $$2, boolean $$3) {
      dmp $$4 = dmq.a($$1.b(dnf.k), 0.5);
      dmp $$5 = dmq.a($$1.b(dnf.l), 0.67);
      dmp $$6 = dmq.a($$1.b(dnf.n), 0.7142857142857143);
      dmp $$7 = dmq.a($$1.b(dnf.m));
      dmp $$8 = a($$0, w);
      dmp $$9 = a($$0, x);
      dmp $$10 = dmq.a($$8, $$9, 0.25, $$1.b($$2 ? dnf.e : dnf.a));
      dmp $$11 = dmq.a($$8, $$9, 0.25, $$1.b($$2 ? dnf.f : dnf.b));
      dmp $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dmp $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dmp $$14 = b(dmq.c($$12), $$13);
      dmp $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dmp $$16 = dmq.c($$15, dmq.b(dmq.a(5.0), a($$0, O)));
      dmp $$17 = dmq.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dmp $$18 = dmq.c(b(a($$3, $$17)), a($$0, P));
      dmp $$19 = a($$0, v);
      int $$20 = Stream.of(dng.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dkw.e * 2);
      int $$21 = Stream.of(dng.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dkw.e * 2);
      dmp $$22 = a($$19, dmq.b($$1.b(dnf.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dmp $$24 = a($$19, dmq.b($$1.b(dnf.F), 4.0, 4.0), $$20, $$21, 0).d();
      dmp $$25 = a($$19, dmq.b($$1.b(dnf.G), 4.0, 4.0), $$20, $$21, 0).d();
      dmp $$26 = dmq.a(dmq.a(-0.08F), dmq.d($$24, $$25));
      dmp $$27 = dmq.a($$1.b(dnf.H));
      return new dnc(
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
         a($$3, dmq.a($$14, dmq.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dnc b(ih<dmp> $$0, ih<eca.a> $$1, dmp $$2) {
      dmp $$3 = a($$0, w);
      dmp $$4 = a($$0, x);
      dmp $$5 = dmq.a($$3, $$4, 0.25, $$1.b(dnf.a));
      dmp $$6 = dmq.a($$3, $$4, 0.25, $$1.b(dnf.b));
      dmp $$7 = b($$2);
      return new dnc(dmq.a(), dmq.a(), dmq.a(), dmq.a(), $$5, $$6, dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), $$7, dmq.a(), dmq.a(), dmq.a());
   }

   private static dmp a(boolean $$0, dmp $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dmp a(ih<dmp> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dmp a(dmp $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dnc a(ih<dmp> $$0, ih<eca.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dnc b(ih<dmp> $$0, ih<eca.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dnc c(ih<dmp> $$0, ih<eca.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dmp c(dmp $$0) {
      return a($$0, 0, 128);
   }

   protected static dnc a(ih<dmp> $$0) {
      dmp $$1 = dmq.c(dmq.a(0L));
      dmp $$2 = b(c(a($$0, M)));
      return new dnc(
         dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), $$1, dmq.a(), dmq.a(), c(dmq.a($$1, dmq.a(-0.703125))), $$2, dmq.a(), dmq.a(), dmq.a()
      );
   }

   protected static dnc a() {
      return new dnc(dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a(), dmq.a());
   }

   private static dmp a(dmp $$0, dmp $$1) {
      dmp $$2 = dmq.a(dmq.b(), $$1, $$0);
      return dmq.b(dmq.c($$2));
   }

   private static dmp b(dmp $$0, dmp $$1) {
      dmp $$2 = dmq.b($$1, $$0);
      return dmq.b(dmq.a(4.0), $$2.h());
   }

   private static dmp a(dmp $$0, dmp $$1, int $$2, int $$3, int $$4) {
      return dmq.a(dmq.a($$0, (double)$$2, (double)($$3 + 1), $$1, dmq.a((double)$$4)));
   }

   private static dmp a(dmp $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dmp $$10 = dmq.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dmp $$9 = dmq.a($$10, $$5, $$0);
      dmp $$11 = dmq.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dmq.a($$11, $$8, $$9);
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
