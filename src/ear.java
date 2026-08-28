import java.util.stream.Stream;

public class ear {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final ead s = eae.a(10.0);
   private static final ead t = eae.a();
   private static final alb<ead> u = a("zero");
   private static final alb<ead> v = a("y");
   private static final alb<ead> w = a("shift_x");
   private static final alb<ead> x = a("shift_z");
   private static final alb<ead> y = a("overworld/base_3d_noise");
   private static final alb<ead> z = a("nether/base_3d_noise");
   private static final alb<ead> A = a("end/base_3d_noise");
   public static final alb<ead> d = a("overworld/continents");
   public static final alb<ead> e = a("overworld/erosion");
   public static final alb<ead> f = a("overworld/ridges");
   public static final alb<ead> g = a("overworld/ridges_folded");
   public static final alb<ead> h = a("overworld/offset");
   public static final alb<ead> i = a("overworld/factor");
   public static final alb<ead> j = a("overworld/jaggedness");
   public static final alb<ead> k = a("overworld/depth");
   private static final alb<ead> B = a("overworld/sloped_cheese");
   public static final alb<ead> l = a("overworld_large_biomes/continents");
   public static final alb<ead> m = a("overworld_large_biomes/erosion");
   private static final alb<ead> C = a("overworld_large_biomes/offset");
   private static final alb<ead> D = a("overworld_large_biomes/factor");
   private static final alb<ead> E = a("overworld_large_biomes/jaggedness");
   private static final alb<ead> F = a("overworld_large_biomes/depth");
   private static final alb<ead> G = a("overworld_large_biomes/sloped_cheese");
   private static final alb<ead> H = a("overworld_amplified/offset");
   private static final alb<ead> I = a("overworld_amplified/factor");
   private static final alb<ead> J = a("overworld_amplified/jaggedness");
   private static final alb<ead> K = a("overworld_amplified/depth");
   private static final alb<ead> L = a("overworld_amplified/sloped_cheese");
   private static final alb<ead> M = a("end/sloped_cheese");
   private static final alb<ead> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alb<ead> O = a("overworld/caves/entrances");
   private static final alb<ead> P = a("overworld/caves/noodle");
   private static final alb<ead> Q = a("overworld/caves/pillars");
   private static final alb<ead> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alb<ead> S = a("overworld/caves/spaghetti_2d");

   private static alb<ead> a(String $$0) {
      return alb.a(lv.aK, alc.b($$0));
   }

   public static jn<? extends ead> a(qt<ead> $$0) {
      jo<eps.a> $$1 = $$0.a(lv.aQ);
      jo<ead> $$2 = $$0.a(lv.aK);
      $$0.a(u, eae.a());
      int $$3 = dyk.e * 2;
      int $$4 = dyk.d * 2;
      $$0.a(v, eae.a($$3, $$4, (double)$$3, (double)$$4));
      ead $$5 = a($$0, w, eae.b(eae.c(eae.b($$1.b(eat.j)))));
      ead $$6 = a($$0, x, eae.b(eae.c(eae.c($$1.b(eat.j)))));
      $$0.a(y, epp.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, epp.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, epp.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jn<ead> $$7 = $$0.a(d, eae.b(eae.a($$5, $$6, 0.25, $$1.b(eat.c))));
      jn<ead> $$8 = $$0.a(e, eae.b(eae.a($$5, $$6, 0.25, $$1.b(eat.d))));
      ead $$9 = a($$0, f, eae.b(eae.a($$5, $$6, 0.25, $$1.b(eat.i))));
      $$0.a(g, a($$9));
      ead $$10 = eae.b($$1.b(eat.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jn<ead> $$11 = $$0.a(l, eae.b(eae.a($$5, $$6, 0.25, $$1.b(eat.g))));
      jn<ead> $$12 = $$0.a(m, eae.b(eae.a($$5, $$6, 0.25, $$1.b(eat.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, eae.a(eae.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, eae.d(eae.a($$1.b(eat.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qt<ead> $$0, jo<ead> $$1, ead $$2, jn<ead> $$3, jn<ead> $$4, alb<ead> $$5, alb<ead> $$6, alb<ead> $$7, alb<ead> $$8, alb<ead> $$9, boolean $$10
   ) {
      eae.w.a $$11 = new eae.w.a($$3);
      eae.w.a $$12 = new eae.w.a($$4);
      eae.w.a $$13 = new eae.w.a($$1.b(f));
      eae.w.a $$14 = new eae.w.a($$1.b(g));
      ead $$15 = a($$0, $$5, a(eae.a(eae.a(-0.50375F), eae.a(ri.a($$11, $$12, $$14, $$10))), eae.c()));
      ead $$16 = a($$0, $$6, a(eae.a(ri.a($$11, $$12, $$13, $$14, $$10)), s));
      ead $$17 = a($$0, $$8, eae.a(eae.a(-64, 320, 1.5, -1.5), $$15));
      ead $$18 = a($$0, $$7, a(eae.a(ri.b($$11, $$12, $$13, $$14, $$10)), t));
      ead $$19 = eae.b($$18, $$2.g());
      ead $$20 = b($$16, eae.a($$17, $$19));
      $$0.a($$9, eae.a($$20, a($$1, y)));
   }

   private static ead a(qt<ead> $$0, alb<ead> $$1, ead $$2) {
      return new eae.j($$0.a($$1, $$2));
   }

   private static ead a(jo<ead> $$0, alb<ead> $$1) {
      return new eae.j($$0.b($$1));
   }

   private static ead a(ead $$0) {
      return eae.b(eae.a(eae.a($$0.d(), eae.a(-0.6666666666666666)).d(), eae.a(-0.3333333333333333)), eae.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static ead b(jo<eps.a> $$0) {
      ead $$1 = eae.a($$0.b(eat.z));
      ead $$2 = eae.a($$0.b(eat.A), 0.0, -0.1);
      return eae.d(eae.b($$2, eae.a($$1.d(), eae.a(-0.4))));
   }

   private static ead d(jo<ead> $$0, jo<eps.a> $$1) {
      ead $$2 = eae.d(eae.b($$1.b(eat.x), 2.0, 1.0));
      ead $$3 = eae.a($$1.b(eat.y), -0.065, -0.088);
      ead $$4 = eae.a($$2, $$1.b(eat.v), eae.z.a.a);
      ead $$5 = eae.a($$2, $$1.b(eat.w), eae.z.a.a);
      ead $$6 = eae.a(eae.d($$4, $$5), $$3).a(-1.0, 1.0);
      ead $$7 = a($$0, N);
      ead $$8 = eae.b($$1.b(eat.B), 0.75, 0.5);
      ead $$9 = eae.a(eae.a($$8, eae.a(0.37)), eae.a(-10, 30, 0.3, 0.0));
      return eae.d(eae.c($$9, eae.a($$7, $$6)));
   }

   private static ead e(jo<ead> $$0, jo<eps.a> $$1) {
      ead $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      ead $$6 = a($$2, eae.b($$1.b(eat.I), 1.0, 1.0), -60, 320, -1);
      ead $$7 = a($$2, eae.a($$1.b(eat.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      ead $$9 = a($$2, eae.b($$1.b(eat.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ead $$10 = a($$2, eae.b($$1.b(eat.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ead $$11 = eae.b(eae.a(1.5), eae.d($$9.d(), $$10.d()));
      return eae.a($$6, -1000000.0, 0.0, eae.a(64.0), eae.a($$7, $$11));
   }

   private static ead c(jo<eps.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      ead $$3 = eae.b($$0.b(eat.o), 25.0, 0.3);
      ead $$4 = eae.a($$0.b(eat.p), 0.0, -2.0);
      ead $$5 = eae.a($$0.b(eat.q), 0.0, 1.1);
      ead $$6 = eae.a(eae.b($$3, eae.a(2.0)), $$4);
      return eae.d(eae.b($$6, $$5.f()));
   }

   private static ead f(jo<ead> $$0, jo<eps.a> $$1) {
      ead $$2 = eae.b($$1.b(eat.t), 2.0, 1.0);
      ead $$3 = eae.a($$2, $$1.b(eat.r), eae.z.a.b);
      ead $$4 = eae.a($$1.b(eat.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      ead $$5 = a($$0, R);
      ead $$6 = eae.a($$4, eae.a(-64, 320, 8.0, -40.0)).d();
      ead $$7 = eae.a($$6, $$5).f();
      double $$8 = 0.083;
      ead $$9 = eae.a($$3, eae.b(eae.a(0.083), $$5));
      return eae.d($$9, $$7).a(-1.0, 1.0);
   }

   private static ead a(jo<ead> $$0, jo<eps.a> $$1, ead $$2) {
      ead $$3 = a($$0, S);
      ead $$4 = a($$0, N);
      ead $$5 = eae.a($$1.b(eat.C), 8.0);
      ead $$6 = eae.b(eae.a(4.0), $$5.e());
      ead $$7 = eae.a($$1.b(eat.D), 0.6666666666666666);
      ead $$8 = eae.a(eae.a(eae.a(0.27), $$7).a(-1.0, 1.0), eae.a(eae.a(1.5), eae.b(eae.a(-0.64), $$2)).a(0.0, 0.5));
      ead $$9 = eae.a($$6, $$8);
      ead $$10 = eae.c(eae.c($$9, a($$0, O)), eae.a($$3, $$4));
      ead $$11 = a($$0, Q);
      ead $$12 = eae.a($$11, -1000000.0, 0.03, eae.a(-1000000.0), $$11);
      return eae.d($$10, $$12);
   }

   private static ead b(ead $$0) {
      ead $$1 = eae.f($$0);
      return eae.b(eae.a($$1), eae.a(0.64)).i();
   }

   protected static eaq a(jo<ead> $$0, jo<eps.a> $$1, boolean $$2, boolean $$3) {
      ead $$4 = eae.a($$1.b(eat.k), 0.5);
      ead $$5 = eae.a($$1.b(eat.l), 0.67);
      ead $$6 = eae.a($$1.b(eat.n), 0.7142857142857143);
      ead $$7 = eae.a($$1.b(eat.m));
      ead $$8 = a($$0, w);
      ead $$9 = a($$0, x);
      ead $$10 = eae.a($$8, $$9, 0.25, $$1.b($$2 ? eat.e : eat.a));
      ead $$11 = eae.a($$8, $$9, 0.25, $$1.b($$2 ? eat.f : eat.b));
      ead $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      ead $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      ead $$14 = b(eae.c($$12), $$13);
      ead $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      ead $$16 = eae.c($$15, eae.b(eae.a(5.0), a($$0, O)));
      ead $$17 = eae.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      ead $$18 = eae.c(b(a($$3, $$17)), a($$0, P));
      ead $$19 = a($$0, v);
      int $$20 = Stream.of(eau.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dyk.e * 2);
      int $$21 = Stream.of(eau.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dyk.e * 2);
      ead $$22 = a($$19, eae.b($$1.b(eat.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      ead $$24 = a($$19, eae.b($$1.b(eat.F), 4.0, 4.0), $$20, $$21, 0).d();
      ead $$25 = a($$19, eae.b($$1.b(eat.G), 4.0, 4.0), $$20, $$21, 0).d();
      ead $$26 = eae.a(eae.a(-0.08F), eae.d($$24, $$25));
      ead $$27 = eae.a($$1.b(eat.H));
      return new eaq(
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
         a($$3, eae.a($$14, eae.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static eaq b(jo<ead> $$0, jo<eps.a> $$1, ead $$2) {
      ead $$3 = a($$0, w);
      ead $$4 = a($$0, x);
      ead $$5 = eae.a($$3, $$4, 0.25, $$1.b(eat.a));
      ead $$6 = eae.a($$3, $$4, 0.25, $$1.b(eat.b));
      ead $$7 = b($$2);
      return new eaq(eae.a(), eae.a(), eae.a(), eae.a(), $$5, $$6, eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), $$7, eae.a(), eae.a(), eae.a());
   }

   private static ead a(boolean $$0, ead $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static ead a(jo<ead> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static ead a(ead $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static eaq a(jo<ead> $$0, jo<eps.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static eaq b(jo<ead> $$0, jo<eps.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static eaq c(jo<ead> $$0, jo<eps.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static ead c(ead $$0) {
      return a($$0, 0, 128);
   }

   protected static eaq a(jo<ead> $$0) {
      ead $$1 = eae.c(eae.a(0L));
      ead $$2 = b(c(a($$0, M)));
      return new eaq(
         eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), $$1, eae.a(), eae.a(), c(eae.a($$1, eae.a(-0.703125))), $$2, eae.a(), eae.a(), eae.a()
      );
   }

   protected static eaq a() {
      return new eaq(eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), eae.a(), eae.a());
   }

   private static ead a(ead $$0, ead $$1) {
      ead $$2 = eae.a(eae.b(), $$1, $$0);
      return eae.b(eae.c($$2));
   }

   private static ead b(ead $$0, ead $$1) {
      ead $$2 = eae.b($$1, $$0);
      return eae.b(eae.a(4.0), $$2.h());
   }

   private static ead a(ead $$0, ead $$1, int $$2, int $$3, int $$4) {
      return eae.a(eae.a($$0, (double)$$2, (double)($$3 + 1), $$1, eae.a((double)$$4)));
   }

   private static ead a(ead $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      ead $$10 = eae.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      ead $$9 = eae.a($$10, $$5, $$0);
      ead $$11 = eae.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return eae.a($$11, $$8, $$9);
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
