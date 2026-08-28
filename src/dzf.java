import java.util.stream.Stream;

public class dzf {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dyr s = dys.a(10.0);
   private static final dyr t = dys.a();
   private static final akq<dyr> u = a("zero");
   private static final akq<dyr> v = a("y");
   private static final akq<dyr> w = a("shift_x");
   private static final akq<dyr> x = a("shift_z");
   private static final akq<dyr> y = a("overworld/base_3d_noise");
   private static final akq<dyr> z = a("nether/base_3d_noise");
   private static final akq<dyr> A = a("end/base_3d_noise");
   public static final akq<dyr> d = a("overworld/continents");
   public static final akq<dyr> e = a("overworld/erosion");
   public static final akq<dyr> f = a("overworld/ridges");
   public static final akq<dyr> g = a("overworld/ridges_folded");
   public static final akq<dyr> h = a("overworld/offset");
   public static final akq<dyr> i = a("overworld/factor");
   public static final akq<dyr> j = a("overworld/jaggedness");
   public static final akq<dyr> k = a("overworld/depth");
   private static final akq<dyr> B = a("overworld/sloped_cheese");
   public static final akq<dyr> l = a("overworld_large_biomes/continents");
   public static final akq<dyr> m = a("overworld_large_biomes/erosion");
   private static final akq<dyr> C = a("overworld_large_biomes/offset");
   private static final akq<dyr> D = a("overworld_large_biomes/factor");
   private static final akq<dyr> E = a("overworld_large_biomes/jaggedness");
   private static final akq<dyr> F = a("overworld_large_biomes/depth");
   private static final akq<dyr> G = a("overworld_large_biomes/sloped_cheese");
   private static final akq<dyr> H = a("overworld_amplified/offset");
   private static final akq<dyr> I = a("overworld_amplified/factor");
   private static final akq<dyr> J = a("overworld_amplified/jaggedness");
   private static final akq<dyr> K = a("overworld_amplified/depth");
   private static final akq<dyr> L = a("overworld_amplified/sloped_cheese");
   private static final akq<dyr> M = a("end/sloped_cheese");
   private static final akq<dyr> N = a("overworld/caves/spaghetti_roughness_function");
   private static final akq<dyr> O = a("overworld/caves/entrances");
   private static final akq<dyr> P = a("overworld/caves/noodle");
   private static final akq<dyr> Q = a("overworld/caves/pillars");
   private static final akq<dyr> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final akq<dyr> S = a("overworld/caves/spaghetti_2d");

   private static akq<dyr> a(String $$0) {
      return akq.a(lu.aJ, akr.b($$0));
   }

   public static jm<? extends dyr> a(qq<dyr> $$0) {
      jn<eoh.a> $$1 = $$0.a(lu.aP);
      jn<dyr> $$2 = $$0.a(lu.aJ);
      $$0.a(u, dys.a());
      int $$3 = dwy.e * 2;
      int $$4 = dwy.d * 2;
      $$0.a(v, dys.a($$3, $$4, (double)$$3, (double)$$4));
      dyr $$5 = a($$0, w, dys.b(dys.c(dys.b($$1.b(dzh.j)))));
      dyr $$6 = a($$0, x, dys.b(dys.c(dys.c($$1.b(dzh.j)))));
      $$0.a(y, eoe.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, eoe.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, eoe.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jm<dyr> $$7 = $$0.a(d, dys.b(dys.a($$5, $$6, 0.25, $$1.b(dzh.c))));
      jm<dyr> $$8 = $$0.a(e, dys.b(dys.a($$5, $$6, 0.25, $$1.b(dzh.d))));
      dyr $$9 = a($$0, f, dys.b(dys.a($$5, $$6, 0.25, $$1.b(dzh.i))));
      $$0.a(g, a($$9));
      dyr $$10 = dys.b($$1.b(dzh.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jm<dyr> $$11 = $$0.a(l, dys.b(dys.a($$5, $$6, 0.25, $$1.b(dzh.g))));
      jm<dyr> $$12 = $$0.a(m, dys.b(dys.a($$5, $$6, 0.25, $$1.b(dzh.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dys.a(dys.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dys.d(dys.a($$1.b(dzh.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qq<dyr> $$0, jn<dyr> $$1, dyr $$2, jm<dyr> $$3, jm<dyr> $$4, akq<dyr> $$5, akq<dyr> $$6, akq<dyr> $$7, akq<dyr> $$8, akq<dyr> $$9, boolean $$10
   ) {
      dys.w.a $$11 = new dys.w.a($$3);
      dys.w.a $$12 = new dys.w.a($$4);
      dys.w.a $$13 = new dys.w.a($$1.b(f));
      dys.w.a $$14 = new dys.w.a($$1.b(g));
      dyr $$15 = a($$0, $$5, a(dys.a(dys.a(-0.50375F), dys.a(rf.a($$11, $$12, $$14, $$10))), dys.c()));
      dyr $$16 = a($$0, $$6, a(dys.a(rf.a($$11, $$12, $$13, $$14, $$10)), s));
      dyr $$17 = a($$0, $$8, dys.a(dys.a(-64, 320, 1.5, -1.5), $$15));
      dyr $$18 = a($$0, $$7, a(dys.a(rf.b($$11, $$12, $$13, $$14, $$10)), t));
      dyr $$19 = dys.b($$18, $$2.g());
      dyr $$20 = b($$16, dys.a($$17, $$19));
      $$0.a($$9, dys.a($$20, a($$1, y)));
   }

   private static dyr a(qq<dyr> $$0, akq<dyr> $$1, dyr $$2) {
      return new dys.j($$0.a($$1, $$2));
   }

   private static dyr a(jn<dyr> $$0, akq<dyr> $$1) {
      return new dys.j($$0.b($$1));
   }

   private static dyr a(dyr $$0) {
      return dys.b(dys.a(dys.a($$0.d(), dys.a(-0.6666666666666666)).d(), dys.a(-0.3333333333333333)), dys.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dyr b(jn<eoh.a> $$0) {
      dyr $$1 = dys.a($$0.b(dzh.z));
      dyr $$2 = dys.a($$0.b(dzh.A), 0.0, -0.1);
      return dys.d(dys.b($$2, dys.a($$1.d(), dys.a(-0.4))));
   }

   private static dyr d(jn<dyr> $$0, jn<eoh.a> $$1) {
      dyr $$2 = dys.d(dys.b($$1.b(dzh.x), 2.0, 1.0));
      dyr $$3 = dys.a($$1.b(dzh.y), -0.065, -0.088);
      dyr $$4 = dys.a($$2, $$1.b(dzh.v), dys.z.a.a);
      dyr $$5 = dys.a($$2, $$1.b(dzh.w), dys.z.a.a);
      dyr $$6 = dys.a(dys.d($$4, $$5), $$3).a(-1.0, 1.0);
      dyr $$7 = a($$0, N);
      dyr $$8 = dys.b($$1.b(dzh.B), 0.75, 0.5);
      dyr $$9 = dys.a(dys.a($$8, dys.a(0.37)), dys.a(-10, 30, 0.3, 0.0));
      return dys.d(dys.c($$9, dys.a($$7, $$6)));
   }

   private static dyr e(jn<dyr> $$0, jn<eoh.a> $$1) {
      dyr $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dyr $$6 = a($$2, dys.b($$1.b(dzh.I), 1.0, 1.0), -60, 320, -1);
      dyr $$7 = a($$2, dys.a($$1.b(dzh.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dyr $$9 = a($$2, dys.b($$1.b(dzh.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dyr $$10 = a($$2, dys.b($$1.b(dzh.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dyr $$11 = dys.b(dys.a(1.5), dys.d($$9.d(), $$10.d()));
      return dys.a($$6, -1000000.0, 0.0, dys.a(64.0), dys.a($$7, $$11));
   }

   private static dyr c(jn<eoh.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dyr $$3 = dys.b($$0.b(dzh.o), 25.0, 0.3);
      dyr $$4 = dys.a($$0.b(dzh.p), 0.0, -2.0);
      dyr $$5 = dys.a($$0.b(dzh.q), 0.0, 1.1);
      dyr $$6 = dys.a(dys.b($$3, dys.a(2.0)), $$4);
      return dys.d(dys.b($$6, $$5.f()));
   }

   private static dyr f(jn<dyr> $$0, jn<eoh.a> $$1) {
      dyr $$2 = dys.b($$1.b(dzh.t), 2.0, 1.0);
      dyr $$3 = dys.a($$2, $$1.b(dzh.r), dys.z.a.b);
      dyr $$4 = dys.a($$1.b(dzh.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dyr $$5 = a($$0, R);
      dyr $$6 = dys.a($$4, dys.a(-64, 320, 8.0, -40.0)).d();
      dyr $$7 = dys.a($$6, $$5).f();
      double $$8 = 0.083;
      dyr $$9 = dys.a($$3, dys.b(dys.a(0.083), $$5));
      return dys.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dyr a(jn<dyr> $$0, jn<eoh.a> $$1, dyr $$2) {
      dyr $$3 = a($$0, S);
      dyr $$4 = a($$0, N);
      dyr $$5 = dys.a($$1.b(dzh.C), 8.0);
      dyr $$6 = dys.b(dys.a(4.0), $$5.e());
      dyr $$7 = dys.a($$1.b(dzh.D), 0.6666666666666666);
      dyr $$8 = dys.a(dys.a(dys.a(0.27), $$7).a(-1.0, 1.0), dys.a(dys.a(1.5), dys.b(dys.a(-0.64), $$2)).a(0.0, 0.5));
      dyr $$9 = dys.a($$6, $$8);
      dyr $$10 = dys.c(dys.c($$9, a($$0, O)), dys.a($$3, $$4));
      dyr $$11 = a($$0, Q);
      dyr $$12 = dys.a($$11, -1000000.0, 0.03, dys.a(-1000000.0), $$11);
      return dys.d($$10, $$12);
   }

   private static dyr b(dyr $$0) {
      dyr $$1 = dys.f($$0);
      return dys.b(dys.a($$1), dys.a(0.64)).i();
   }

   protected static dze a(jn<dyr> $$0, jn<eoh.a> $$1, boolean $$2, boolean $$3) {
      dyr $$4 = dys.a($$1.b(dzh.k), 0.5);
      dyr $$5 = dys.a($$1.b(dzh.l), 0.67);
      dyr $$6 = dys.a($$1.b(dzh.n), 0.7142857142857143);
      dyr $$7 = dys.a($$1.b(dzh.m));
      dyr $$8 = a($$0, w);
      dyr $$9 = a($$0, x);
      dyr $$10 = dys.a($$8, $$9, 0.25, $$1.b($$2 ? dzh.e : dzh.a));
      dyr $$11 = dys.a($$8, $$9, 0.25, $$1.b($$2 ? dzh.f : dzh.b));
      dyr $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dyr $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dyr $$14 = b(dys.c($$12), $$13);
      dyr $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dyr $$16 = dys.c($$15, dys.b(dys.a(5.0), a($$0, O)));
      dyr $$17 = dys.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dyr $$18 = dys.c(b(a($$3, $$17)), a($$0, P));
      dyr $$19 = a($$0, v);
      int $$20 = Stream.of(dzi.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dwy.e * 2);
      int $$21 = Stream.of(dzi.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dwy.e * 2);
      dyr $$22 = a($$19, dys.b($$1.b(dzh.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dyr $$24 = a($$19, dys.b($$1.b(dzh.F), 4.0, 4.0), $$20, $$21, 0).d();
      dyr $$25 = a($$19, dys.b($$1.b(dzh.G), 4.0, 4.0), $$20, $$21, 0).d();
      dyr $$26 = dys.a(dys.a(-0.08F), dys.d($$24, $$25));
      dyr $$27 = dys.a($$1.b(dzh.H));
      return new dze(
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
         a($$3, dys.a($$14, dys.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dze b(jn<dyr> $$0, jn<eoh.a> $$1, dyr $$2) {
      dyr $$3 = a($$0, w);
      dyr $$4 = a($$0, x);
      dyr $$5 = dys.a($$3, $$4, 0.25, $$1.b(dzh.a));
      dyr $$6 = dys.a($$3, $$4, 0.25, $$1.b(dzh.b));
      dyr $$7 = b($$2);
      return new dze(dys.a(), dys.a(), dys.a(), dys.a(), $$5, $$6, dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), $$7, dys.a(), dys.a(), dys.a());
   }

   private static dyr a(boolean $$0, dyr $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dyr a(jn<dyr> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dyr a(dyr $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dze a(jn<dyr> $$0, jn<eoh.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dze b(jn<dyr> $$0, jn<eoh.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dze c(jn<dyr> $$0, jn<eoh.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dyr c(dyr $$0) {
      return a($$0, 0, 128);
   }

   protected static dze a(jn<dyr> $$0) {
      dyr $$1 = dys.c(dys.a(0L));
      dyr $$2 = b(c(a($$0, M)));
      return new dze(
         dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), $$1, dys.a(), dys.a(), c(dys.a($$1, dys.a(-0.703125))), $$2, dys.a(), dys.a(), dys.a()
      );
   }

   protected static dze a() {
      return new dze(dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), dys.a(), dys.a());
   }

   private static dyr a(dyr $$0, dyr $$1) {
      dyr $$2 = dys.a(dys.b(), $$1, $$0);
      return dys.b(dys.c($$2));
   }

   private static dyr b(dyr $$0, dyr $$1) {
      dyr $$2 = dys.b($$1, $$0);
      return dys.b(dys.a(4.0), $$2.h());
   }

   private static dyr a(dyr $$0, dyr $$1, int $$2, int $$3, int $$4) {
      return dys.a(dys.a($$0, (double)$$2, (double)($$3 + 1), $$1, dys.a((double)$$4)));
   }

   private static dyr a(dyr $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dyr $$10 = dys.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dyr $$9 = dys.a($$10, $$5, $$0);
      dyr $$11 = dys.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dys.a($$11, $$8, $$9);
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
