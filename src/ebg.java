import java.util.stream.Stream;

public class ebg {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final eas s = eat.a(10.0);
   private static final eas t = eat.a();
   private static final alg<eas> u = a("zero");
   private static final alg<eas> v = a("y");
   private static final alg<eas> w = a("shift_x");
   private static final alg<eas> x = a("shift_z");
   private static final alg<eas> y = a("overworld/base_3d_noise");
   private static final alg<eas> z = a("nether/base_3d_noise");
   private static final alg<eas> A = a("end/base_3d_noise");
   public static final alg<eas> d = a("overworld/continents");
   public static final alg<eas> e = a("overworld/erosion");
   public static final alg<eas> f = a("overworld/ridges");
   public static final alg<eas> g = a("overworld/ridges_folded");
   public static final alg<eas> h = a("overworld/offset");
   public static final alg<eas> i = a("overworld/factor");
   public static final alg<eas> j = a("overworld/jaggedness");
   public static final alg<eas> k = a("overworld/depth");
   private static final alg<eas> B = a("overworld/sloped_cheese");
   public static final alg<eas> l = a("overworld_large_biomes/continents");
   public static final alg<eas> m = a("overworld_large_biomes/erosion");
   private static final alg<eas> C = a("overworld_large_biomes/offset");
   private static final alg<eas> D = a("overworld_large_biomes/factor");
   private static final alg<eas> E = a("overworld_large_biomes/jaggedness");
   private static final alg<eas> F = a("overworld_large_biomes/depth");
   private static final alg<eas> G = a("overworld_large_biomes/sloped_cheese");
   private static final alg<eas> H = a("overworld_amplified/offset");
   private static final alg<eas> I = a("overworld_amplified/factor");
   private static final alg<eas> J = a("overworld_amplified/jaggedness");
   private static final alg<eas> K = a("overworld_amplified/depth");
   private static final alg<eas> L = a("overworld_amplified/sloped_cheese");
   private static final alg<eas> M = a("end/sloped_cheese");
   private static final alg<eas> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alg<eas> O = a("overworld/caves/entrances");
   private static final alg<eas> P = a("overworld/caves/noodle");
   private static final alg<eas> Q = a("overworld/caves/pillars");
   private static final alg<eas> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alg<eas> S = a("overworld/caves/spaghetti_2d");

   private static alg<eas> a(String $$0) {
      return alg.a(ly.aK, alh.b($$0));
   }

   public static jp<? extends eas> a(qx<eas> $$0) {
      jq<eqh.a> $$1 = $$0.a(ly.aQ);
      jq<eas> $$2 = $$0.a(ly.aK);
      $$0.a(u, eat.a());
      int $$3 = dyz.e * 2;
      int $$4 = dyz.d * 2;
      $$0.a(v, eat.a($$3, $$4, (double)$$3, (double)$$4));
      eas $$5 = a($$0, w, eat.b(eat.c(eat.b($$1.b(ebi.j)))));
      eas $$6 = a($$0, x, eat.b(eat.c(eat.c($$1.b(ebi.j)))));
      $$0.a(y, eqe.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, eqe.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, eqe.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jp<eas> $$7 = $$0.a(d, eat.b(eat.a($$5, $$6, 0.25, $$1.b(ebi.c))));
      jp<eas> $$8 = $$0.a(e, eat.b(eat.a($$5, $$6, 0.25, $$1.b(ebi.d))));
      eas $$9 = a($$0, f, eat.b(eat.a($$5, $$6, 0.25, $$1.b(ebi.i))));
      $$0.a(g, a($$9));
      eas $$10 = eat.b($$1.b(ebi.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jp<eas> $$11 = $$0.a(l, eat.b(eat.a($$5, $$6, 0.25, $$1.b(ebi.g))));
      jp<eas> $$12 = $$0.a(m, eat.b(eat.a($$5, $$6, 0.25, $$1.b(ebi.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, eat.a(eat.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, eat.d(eat.a($$1.b(ebi.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qx<eas> $$0, jq<eas> $$1, eas $$2, jp<eas> $$3, jp<eas> $$4, alg<eas> $$5, alg<eas> $$6, alg<eas> $$7, alg<eas> $$8, alg<eas> $$9, boolean $$10
   ) {
      eat.w.a $$11 = new eat.w.a($$3);
      eat.w.a $$12 = new eat.w.a($$4);
      eat.w.a $$13 = new eat.w.a($$1.b(f));
      eat.w.a $$14 = new eat.w.a($$1.b(g));
      eas $$15 = a($$0, $$5, a(eat.a(eat.a(-0.50375F), eat.a(rm.a($$11, $$12, $$14, $$10))), eat.c()));
      eas $$16 = a($$0, $$6, a(eat.a(rm.a($$11, $$12, $$13, $$14, $$10)), s));
      eas $$17 = a($$0, $$8, eat.a(eat.a(-64, 320, 1.5, -1.5), $$15));
      eas $$18 = a($$0, $$7, a(eat.a(rm.b($$11, $$12, $$13, $$14, $$10)), t));
      eas $$19 = eat.b($$18, $$2.g());
      eas $$20 = b($$16, eat.a($$17, $$19));
      $$0.a($$9, eat.a($$20, a($$1, y)));
   }

   private static eas a(qx<eas> $$0, alg<eas> $$1, eas $$2) {
      return new eat.j($$0.a($$1, $$2));
   }

   private static eas a(jq<eas> $$0, alg<eas> $$1) {
      return new eat.j($$0.b($$1));
   }

   private static eas a(eas $$0) {
      return eat.b(eat.a(eat.a($$0.d(), eat.a(-0.6666666666666666)).d(), eat.a(-0.3333333333333333)), eat.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static eas b(jq<eqh.a> $$0) {
      eas $$1 = eat.a($$0.b(ebi.z));
      eas $$2 = eat.a($$0.b(ebi.A), 0.0, -0.1);
      return eat.d(eat.b($$2, eat.a($$1.d(), eat.a(-0.4))));
   }

   private static eas d(jq<eas> $$0, jq<eqh.a> $$1) {
      eas $$2 = eat.d(eat.b($$1.b(ebi.x), 2.0, 1.0));
      eas $$3 = eat.a($$1.b(ebi.y), -0.065, -0.088);
      eas $$4 = eat.a($$2, $$1.b(ebi.v), eat.z.a.a);
      eas $$5 = eat.a($$2, $$1.b(ebi.w), eat.z.a.a);
      eas $$6 = eat.a(eat.d($$4, $$5), $$3).a(-1.0, 1.0);
      eas $$7 = a($$0, N);
      eas $$8 = eat.b($$1.b(ebi.B), 0.75, 0.5);
      eas $$9 = eat.a(eat.a($$8, eat.a(0.37)), eat.a(-10, 30, 0.3, 0.0));
      return eat.d(eat.c($$9, eat.a($$7, $$6)));
   }

   private static eas e(jq<eas> $$0, jq<eqh.a> $$1) {
      eas $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      eas $$6 = a($$2, eat.b($$1.b(ebi.I), 1.0, 1.0), -60, 320, -1);
      eas $$7 = a($$2, eat.a($$1.b(ebi.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      eas $$9 = a($$2, eat.b($$1.b(ebi.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      eas $$10 = a($$2, eat.b($$1.b(ebi.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      eas $$11 = eat.b(eat.a(1.5), eat.d($$9.d(), $$10.d()));
      return eat.a($$6, -1000000.0, 0.0, eat.a(64.0), eat.a($$7, $$11));
   }

   private static eas c(jq<eqh.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      eas $$3 = eat.b($$0.b(ebi.o), 25.0, 0.3);
      eas $$4 = eat.a($$0.b(ebi.p), 0.0, -2.0);
      eas $$5 = eat.a($$0.b(ebi.q), 0.0, 1.1);
      eas $$6 = eat.a(eat.b($$3, eat.a(2.0)), $$4);
      return eat.d(eat.b($$6, $$5.f()));
   }

   private static eas f(jq<eas> $$0, jq<eqh.a> $$1) {
      eas $$2 = eat.b($$1.b(ebi.t), 2.0, 1.0);
      eas $$3 = eat.a($$2, $$1.b(ebi.r), eat.z.a.b);
      eas $$4 = eat.a($$1.b(ebi.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      eas $$5 = a($$0, R);
      eas $$6 = eat.a($$4, eat.a(-64, 320, 8.0, -40.0)).d();
      eas $$7 = eat.a($$6, $$5).f();
      double $$8 = 0.083;
      eas $$9 = eat.a($$3, eat.b(eat.a(0.083), $$5));
      return eat.d($$9, $$7).a(-1.0, 1.0);
   }

   private static eas a(jq<eas> $$0, jq<eqh.a> $$1, eas $$2) {
      eas $$3 = a($$0, S);
      eas $$4 = a($$0, N);
      eas $$5 = eat.a($$1.b(ebi.C), 8.0);
      eas $$6 = eat.b(eat.a(4.0), $$5.e());
      eas $$7 = eat.a($$1.b(ebi.D), 0.6666666666666666);
      eas $$8 = eat.a(eat.a(eat.a(0.27), $$7).a(-1.0, 1.0), eat.a(eat.a(1.5), eat.b(eat.a(-0.64), $$2)).a(0.0, 0.5));
      eas $$9 = eat.a($$6, $$8);
      eas $$10 = eat.c(eat.c($$9, a($$0, O)), eat.a($$3, $$4));
      eas $$11 = a($$0, Q);
      eas $$12 = eat.a($$11, -1000000.0, 0.03, eat.a(-1000000.0), $$11);
      return eat.d($$10, $$12);
   }

   private static eas b(eas $$0) {
      eas $$1 = eat.f($$0);
      return eat.b(eat.a($$1), eat.a(0.64)).i();
   }

   protected static ebf a(jq<eas> $$0, jq<eqh.a> $$1, boolean $$2, boolean $$3) {
      eas $$4 = eat.a($$1.b(ebi.k), 0.5);
      eas $$5 = eat.a($$1.b(ebi.l), 0.67);
      eas $$6 = eat.a($$1.b(ebi.n), 0.7142857142857143);
      eas $$7 = eat.a($$1.b(ebi.m));
      eas $$8 = a($$0, w);
      eas $$9 = a($$0, x);
      eas $$10 = eat.a($$8, $$9, 0.25, $$1.b($$2 ? ebi.e : ebi.a));
      eas $$11 = eat.a($$8, $$9, 0.25, $$1.b($$2 ? ebi.f : ebi.b));
      eas $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      eas $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      eas $$14 = b(eat.c($$12), $$13);
      eas $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      eas $$16 = eat.c($$15, eat.b(eat.a(5.0), a($$0, O)));
      eas $$17 = eat.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      eas $$18 = eat.c(b(a($$3, $$17)), a($$0, P));
      eas $$19 = a($$0, v);
      int $$20 = Stream.of(ebj.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dyz.e * 2);
      int $$21 = Stream.of(ebj.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dyz.e * 2);
      eas $$22 = a($$19, eat.b($$1.b(ebi.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      eas $$24 = a($$19, eat.b($$1.b(ebi.F), 4.0, 4.0), $$20, $$21, 0).d();
      eas $$25 = a($$19, eat.b($$1.b(ebi.G), 4.0, 4.0), $$20, $$21, 0).d();
      eas $$26 = eat.a(eat.a(-0.08F), eat.d($$24, $$25));
      eas $$27 = eat.a($$1.b(ebi.H));
      return new ebf(
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
         a($$3, eat.a($$14, eat.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ebf b(jq<eas> $$0, jq<eqh.a> $$1, eas $$2) {
      eas $$3 = a($$0, w);
      eas $$4 = a($$0, x);
      eas $$5 = eat.a($$3, $$4, 0.25, $$1.b(ebi.a));
      eas $$6 = eat.a($$3, $$4, 0.25, $$1.b(ebi.b));
      eas $$7 = b($$2);
      return new ebf(eat.a(), eat.a(), eat.a(), eat.a(), $$5, $$6, eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), $$7, eat.a(), eat.a(), eat.a());
   }

   private static eas a(boolean $$0, eas $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static eas a(jq<eas> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static eas a(eas $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ebf a(jq<eas> $$0, jq<eqh.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ebf b(jq<eas> $$0, jq<eqh.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ebf c(jq<eas> $$0, jq<eqh.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static eas c(eas $$0) {
      return a($$0, 0, 128);
   }

   protected static ebf a(jq<eas> $$0) {
      eas $$1 = eat.c(eat.a(0L));
      eas $$2 = b(c(a($$0, M)));
      return new ebf(
         eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), $$1, eat.a(), eat.a(), c(eat.a($$1, eat.a(-0.703125))), $$2, eat.a(), eat.a(), eat.a()
      );
   }

   protected static ebf a() {
      return new ebf(eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), eat.a(), eat.a());
   }

   private static eas a(eas $$0, eas $$1) {
      eas $$2 = eat.a(eat.b(), $$1, $$0);
      return eat.b(eat.c($$2));
   }

   private static eas b(eas $$0, eas $$1) {
      eas $$2 = eat.b($$1, $$0);
      return eat.b(eat.a(4.0), $$2.h());
   }

   private static eas a(eas $$0, eas $$1, int $$2, int $$3, int $$4) {
      return eat.a(eat.a($$0, (double)$$2, (double)($$3 + 1), $$1, eat.a((double)$$4)));
   }

   private static eas a(eas $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      eas $$10 = eat.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      eas $$9 = eat.a($$10, $$5, $$0);
      eas $$11 = eat.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return eat.a($$11, $$8, $$9);
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
