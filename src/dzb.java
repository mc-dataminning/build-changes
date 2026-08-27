import java.util.stream.Stream;

public class dzb {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dyn s = dyo.a(10.0);
   private static final dyn t = dyo.a();
   private static final aks<dyn> u = a("zero");
   private static final aks<dyn> v = a("y");
   private static final aks<dyn> w = a("shift_x");
   private static final aks<dyn> x = a("shift_z");
   private static final aks<dyn> y = a("overworld/base_3d_noise");
   private static final aks<dyn> z = a("nether/base_3d_noise");
   private static final aks<dyn> A = a("end/base_3d_noise");
   public static final aks<dyn> d = a("overworld/continents");
   public static final aks<dyn> e = a("overworld/erosion");
   public static final aks<dyn> f = a("overworld/ridges");
   public static final aks<dyn> g = a("overworld/ridges_folded");
   public static final aks<dyn> h = a("overworld/offset");
   public static final aks<dyn> i = a("overworld/factor");
   public static final aks<dyn> j = a("overworld/jaggedness");
   public static final aks<dyn> k = a("overworld/depth");
   private static final aks<dyn> B = a("overworld/sloped_cheese");
   public static final aks<dyn> l = a("overworld_large_biomes/continents");
   public static final aks<dyn> m = a("overworld_large_biomes/erosion");
   private static final aks<dyn> C = a("overworld_large_biomes/offset");
   private static final aks<dyn> D = a("overworld_large_biomes/factor");
   private static final aks<dyn> E = a("overworld_large_biomes/jaggedness");
   private static final aks<dyn> F = a("overworld_large_biomes/depth");
   private static final aks<dyn> G = a("overworld_large_biomes/sloped_cheese");
   private static final aks<dyn> H = a("overworld_amplified/offset");
   private static final aks<dyn> I = a("overworld_amplified/factor");
   private static final aks<dyn> J = a("overworld_amplified/jaggedness");
   private static final aks<dyn> K = a("overworld_amplified/depth");
   private static final aks<dyn> L = a("overworld_amplified/sloped_cheese");
   private static final aks<dyn> M = a("end/sloped_cheese");
   private static final aks<dyn> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aks<dyn> O = a("overworld/caves/entrances");
   private static final aks<dyn> P = a("overworld/caves/noodle");
   private static final aks<dyn> Q = a("overworld/caves/pillars");
   private static final aks<dyn> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aks<dyn> S = a("overworld/caves/spaghetti_2d");

   private static aks<dyn> a(String $$0) {
      return aks.a(li.aD, new akt($$0));
   }

   public static ja<? extends dyn> a(qq<dyn> $$0) {
      jb<eoh.a> $$1 = $$0.a(li.aH);
      jb<dyn> $$2 = $$0.a(li.aD);
      $$0.a(u, dyo.a());
      int $$3 = dwu.e * 2;
      int $$4 = dwu.d * 2;
      $$0.a(v, dyo.a($$3, $$4, (double)$$3, (double)$$4));
      dyn $$5 = a($$0, w, dyo.b(dyo.c(dyo.b($$1.b(dzd.j)))));
      dyn $$6 = a($$0, x, dyo.b(dyo.c(dyo.c($$1.b(dzd.j)))));
      $$0.a(y, eoe.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, eoe.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, eoe.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ja<dyn> $$7 = $$0.a(d, dyo.b(dyo.a($$5, $$6, 0.25, $$1.b(dzd.c))));
      ja<dyn> $$8 = $$0.a(e, dyo.b(dyo.a($$5, $$6, 0.25, $$1.b(dzd.d))));
      dyn $$9 = a($$0, f, dyo.b(dyo.a($$5, $$6, 0.25, $$1.b(dzd.i))));
      $$0.a(g, a($$9));
      dyn $$10 = dyo.b($$1.b(dzd.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ja<dyn> $$11 = $$0.a(l, dyo.b(dyo.a($$5, $$6, 0.25, $$1.b(dzd.g))));
      ja<dyn> $$12 = $$0.a(m, dyo.b(dyo.a($$5, $$6, 0.25, $$1.b(dzd.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dyo.a(dyo.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dyo.d(dyo.a($$1.b(dzd.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, g($$2, $$1));
      $$0.a(O, e($$2, $$1));
      $$0.a(P, f($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qq<dyn> $$0, jb<dyn> $$1, dyn $$2, ja<dyn> $$3, ja<dyn> $$4, aks<dyn> $$5, aks<dyn> $$6, aks<dyn> $$7, aks<dyn> $$8, aks<dyn> $$9, boolean $$10
   ) {
      dyo.w.a $$11 = new dyo.w.a($$3);
      dyo.w.a $$12 = new dyo.w.a($$4);
      dyo.w.a $$13 = new dyo.w.a($$1.b(f));
      dyo.w.a $$14 = new dyo.w.a($$1.b(g));
      dyn $$15 = a($$0, $$5, a(dyo.a(dyo.a(-0.50375F), dyo.a(rj.a($$11, $$12, $$14, $$10))), dyo.c()));
      dyn $$16 = a($$0, $$6, a(dyo.a(rj.a($$11, $$12, $$13, $$14, $$10)), s));
      dyn $$17 = a($$0, $$8, dyo.a(dyo.a(-64, 320, 1.5, -1.5), $$15));
      dyn $$18 = a($$0, $$7, a(dyo.a(rj.b($$11, $$12, $$13, $$14, $$10)), t));
      dyn $$19 = dyo.b($$18, $$2.g());
      dyn $$20 = b($$16, dyo.a($$17, $$19));
      $$0.a($$9, dyo.a($$20, a($$1, y)));
   }

   private static dyn a(qq<dyn> $$0, aks<dyn> $$1, dyn $$2) {
      return new dyo.j($$0.a($$1, $$2));
   }

   private static dyn a(jb<dyn> $$0, aks<dyn> $$1) {
      return new dyo.j($$0.b($$1));
   }

   private static dyn a(dyn $$0) {
      return dyo.b(dyo.a(dyo.a($$0.d(), dyo.a(-0.6666666666666666)).d(), dyo.a(-0.3333333333333333)), dyo.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dyn b(jb<eoh.a> $$0) {
      dyn $$1 = dyo.a($$0.b(dzd.z));
      dyn $$2 = dyo.a($$0.b(dzd.A), 0.0, -0.1);
      return dyo.d(dyo.b($$2, dyo.a($$1.d(), dyo.a(-0.4))));
   }

   private static dyn e(jb<dyn> $$0, jb<eoh.a> $$1) {
      dyn $$2 = dyo.d(dyo.b($$1.b(dzd.x), 2.0, 1.0));
      dyn $$3 = dyo.a($$1.b(dzd.y), -0.065, -0.088);
      dyn $$4 = dyo.a($$2, $$1.b(dzd.v), dyo.z.a.a);
      dyn $$5 = dyo.a($$2, $$1.b(dzd.w), dyo.z.a.a);
      dyn $$6 = dyo.a(dyo.d($$4, $$5), $$3).a(-1.0, 1.0);
      dyn $$7 = a($$0, N);
      dyn $$8 = dyo.b($$1.b(dzd.B), 0.75, 0.5);
      dyn $$9 = dyo.a(dyo.a($$8, dyo.a(0.37)), dyo.a(-10, 30, 0.3, 0.0));
      return dyo.d(dyo.c($$9, dyo.a($$7, $$6)));
   }

   private static dyn f(jb<dyn> $$0, jb<eoh.a> $$1) {
      dyn $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dyn $$6 = a($$2, dyo.b($$1.b(dzd.I), 1.0, 1.0), -60, 320, -1);
      dyn $$7 = a($$2, dyo.a($$1.b(dzd.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dyn $$9 = a($$2, dyo.b($$1.b(dzd.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dyn $$10 = a($$2, dyo.b($$1.b(dzd.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dyn $$11 = dyo.b(dyo.a(1.5), dyo.d($$9.d(), $$10.d()));
      return dyo.a($$6, -1000000.0, 0.0, dyo.a(64.0), dyo.a($$7, $$11));
   }

   private static dyn c(jb<eoh.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dyn $$3 = dyo.b($$0.b(dzd.o), 25.0, 0.3);
      dyn $$4 = dyo.a($$0.b(dzd.p), 0.0, -2.0);
      dyn $$5 = dyo.a($$0.b(dzd.q), 0.0, 1.1);
      dyn $$6 = dyo.a(dyo.b($$3, dyo.a(2.0)), $$4);
      return dyo.d(dyo.b($$6, $$5.f()));
   }

   private static dyn g(jb<dyn> $$0, jb<eoh.a> $$1) {
      dyn $$2 = dyo.b($$1.b(dzd.t), 2.0, 1.0);
      dyn $$3 = dyo.a($$2, $$1.b(dzd.r), dyo.z.a.b);
      dyn $$4 = dyo.a($$1.b(dzd.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dyn $$5 = a($$0, R);
      dyn $$6 = dyo.a($$4, dyo.a(-64, 320, 8.0, -40.0)).d();
      dyn $$7 = dyo.a($$6, $$5).f();
      double $$8 = 0.083;
      dyn $$9 = dyo.a($$3, dyo.b(dyo.a(0.083), $$5));
      return dyo.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dyn a(jb<dyn> $$0, jb<eoh.a> $$1, dyn $$2) {
      dyn $$3 = a($$0, S);
      dyn $$4 = a($$0, N);
      dyn $$5 = dyo.a($$1.b(dzd.C), 8.0);
      dyn $$6 = dyo.b(dyo.a(4.0), $$5.e());
      dyn $$7 = dyo.a($$1.b(dzd.D), 0.6666666666666666);
      dyn $$8 = dyo.a(dyo.a(dyo.a(0.27), $$7).a(-1.0, 1.0), dyo.a(dyo.a(1.5), dyo.b(dyo.a(-0.64), $$2)).a(0.0, 0.5));
      dyn $$9 = dyo.a($$6, $$8);
      dyn $$10 = dyo.c(dyo.c($$9, a($$0, O)), dyo.a($$3, $$4));
      dyn $$11 = a($$0, Q);
      dyn $$12 = dyo.a($$11, -1000000.0, 0.03, dyo.a(-1000000.0), $$11);
      return dyo.d($$10, $$12);
   }

   private static dyn b(dyn $$0) {
      dyn $$1 = dyo.f($$0);
      return dyo.b(dyo.a($$1), dyo.a(0.64)).i();
   }

   protected static dza a(jb<dyn> $$0, jb<eoh.a> $$1, boolean $$2, boolean $$3) {
      dyn $$4 = dyo.a($$1.b(dzd.k), 0.5);
      dyn $$5 = dyo.a($$1.b(dzd.l), 0.67);
      dyn $$6 = dyo.a($$1.b(dzd.n), 0.7142857142857143);
      dyn $$7 = dyo.a($$1.b(dzd.m));
      dyn $$8 = a($$0, w);
      dyn $$9 = a($$0, x);
      dyn $$10 = dyo.a($$8, $$9, 0.25, $$1.b($$2 ? dzd.e : dzd.a));
      dyn $$11 = dyo.a($$8, $$9, 0.25, $$1.b($$2 ? dzd.f : dzd.b));
      dyn $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dyn $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dyn $$14 = b(dyo.c($$12), $$13);
      dyn $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dyn $$16 = dyo.c($$15, dyo.b(dyo.a(5.0), a($$0, O)));
      dyn $$17 = dyo.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dyn $$18 = dyo.c(b(a($$3, $$17)), a($$0, P));
      dyn $$19 = a($$0, v);
      int $$20 = Stream.of(dze.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dwu.e * 2);
      int $$21 = Stream.of(dze.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dwu.e * 2);
      dyn $$22 = a($$19, dyo.b($$1.b(dzd.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dyn $$24 = a($$19, dyo.b($$1.b(dzd.F), 4.0, 4.0), $$20, $$21, 0).d();
      dyn $$25 = a($$19, dyo.b($$1.b(dzd.G), 4.0, 4.0), $$20, $$21, 0).d();
      dyn $$26 = dyo.a(dyo.a(-0.08F), dyo.d($$24, $$25));
      dyn $$27 = dyo.a($$1.b(dzd.H));
      return new dza(
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
         a($$3, dyo.a($$14, dyo.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dza b(jb<dyn> $$0, jb<eoh.a> $$1, dyn $$2) {
      dyn $$3 = a($$0, w);
      dyn $$4 = a($$0, x);
      dyn $$5 = dyo.a($$3, $$4, 0.25, $$1.b(dzd.a));
      dyn $$6 = dyo.a($$3, $$4, 0.25, $$1.b(dzd.b));
      dyn $$7 = b($$2);
      return new dza(dyo.a(), dyo.a(), dyo.a(), dyo.a(), $$5, $$6, dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), $$7, dyo.a(), dyo.a(), dyo.a());
   }

   private static dza c(jb<dyn> $$0, jb<eoh.a> $$1, dyn $$2) {
      dyn $$3 = a($$0, w);
      dyn $$4 = a($$0, x);
      dyn $$5 = dyo.a($$3, $$4, 0.25, $$1.b(dzd.a));
      dyn $$6 = dyo.a($$3, $$4, 0.25, $$1.b(dzd.b));
      dyn $$7 = b($$2);
      return new dza(dyo.a(), dyo.a(), dyo.a(), dyo.a(), $$5, $$6, a($$0, d), dyo.a(), dyo.a(), dyo.a(), dyo.a(), $$7, dyo.a(), dyo.a(), dyo.a());
   }

   private static dyn a(boolean $$0, dyn $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dyn d(jb<dyn> $$0) {
      return a(a($$0, A), 0, 256, 192, 96, -0.12, 5, 32, -0.1);
   }

   private static dyn a(jb<dyn> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dyn a(dyn $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dza a(jb<dyn> $$0, jb<eoh.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dza b(jb<dyn> $$0, jb<eoh.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dza c(jb<dyn> $$0, jb<eoh.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   protected static dza d(jb<dyn> $$0, jb<eoh.a> $$1) {
      return c($$0, $$1, d($$0));
   }

   private static dyn c(dyn $$0) {
      return a($$0, 0, 128);
   }

   protected static dza a(jb<dyn> $$0) {
      dyn $$1 = dyo.c(dyo.a(0L));
      dyn $$2 = b(c(a($$0, M)));
      return new dza(
         dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), $$1, dyo.a(), dyo.a(), c(dyo.a($$1, dyo.a(-0.703125))), $$2, dyo.a(), dyo.a(), dyo.a()
      );
   }

   protected static dza a() {
      return new dza(dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a(), dyo.a());
   }

   private static dyn a(dyn $$0, dyn $$1) {
      dyn $$2 = dyo.a(dyo.b(), $$1, $$0);
      return dyo.b(dyo.c($$2));
   }

   private static dyn b(dyn $$0, dyn $$1) {
      dyn $$2 = dyo.b($$1, $$0);
      return dyo.b(dyo.a(4.0), $$2.h());
   }

   private static dyn a(dyn $$0, dyn $$1, int $$2, int $$3, int $$4) {
      return dyo.a(dyo.a($$0, (double)$$2, (double)($$3 + 1), $$1, dyo.a((double)$$4)));
   }

   private static dyn a(dyn $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dyn $$10 = dyo.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dyn $$9 = dyo.a($$10, $$5, $$0);
      dyn $$11 = dyo.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dyo.a($$11, $$8, $$9);
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
