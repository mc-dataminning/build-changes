import java.util.stream.Stream;

public class ehm {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final egy s = egz.a(10.0);
   private static final egy t = egz.a();
   private static final alj<egy> u = a("zero");
   private static final alj<egy> v = a("y");
   private static final alj<egy> w = a("shift_x");
   private static final alj<egy> x = a("shift_z");
   private static final alj<egy> y = a("overworld/base_3d_noise");
   private static final alj<egy> z = a("nether/base_3d_noise");
   private static final alj<egy> A = a("end/base_3d_noise");
   public static final alj<egy> d = a("overworld/continents");
   public static final alj<egy> e = a("overworld/erosion");
   public static final alj<egy> f = a("overworld/ridges");
   public static final alj<egy> g = a("overworld/ridges_folded");
   public static final alj<egy> h = a("overworld/offset");
   public static final alj<egy> i = a("overworld/factor");
   public static final alj<egy> j = a("overworld/jaggedness");
   public static final alj<egy> k = a("overworld/depth");
   private static final alj<egy> B = a("overworld/sloped_cheese");
   public static final alj<egy> l = a("overworld_large_biomes/continents");
   public static final alj<egy> m = a("overworld_large_biomes/erosion");
   private static final alj<egy> C = a("overworld_large_biomes/offset");
   private static final alj<egy> D = a("overworld_large_biomes/factor");
   private static final alj<egy> E = a("overworld_large_biomes/jaggedness");
   private static final alj<egy> F = a("overworld_large_biomes/depth");
   private static final alj<egy> G = a("overworld_large_biomes/sloped_cheese");
   private static final alj<egy> H = a("overworld_amplified/offset");
   private static final alj<egy> I = a("overworld_amplified/factor");
   private static final alj<egy> J = a("overworld_amplified/jaggedness");
   private static final alj<egy> K = a("overworld_amplified/depth");
   private static final alj<egy> L = a("overworld_amplified/sloped_cheese");
   private static final alj<egy> M = a("end/sloped_cheese");
   private static final alj<egy> N = a("overworld/caves/spaghetti_roughness_function");
   private static final alj<egy> O = a("overworld/caves/entrances");
   private static final alj<egy> P = a("overworld/caves/noodle");
   private static final alj<egy> Q = a("overworld/caves/pillars");
   private static final alj<egy> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final alj<egy> S = a("overworld/caves/spaghetti_2d");

   private static alj<egy> a(String $$0) {
      return alj.a(mi.aO, alk.b($$0));
   }

   public static jg<? extends egy> a(qi<egy> $$0) {
      jh<ewt.a> $$1 = $$0.a(mi.aY);
      jh<egy> $$2 = $$0.a(mi.aO);
      $$0.a(u, egz.a());
      int $$3 = efd.e * 2;
      int $$4 = efd.d * 2;
      $$0.a(v, egz.a($$3, $$4, (double)$$3, (double)$$4));
      egy $$5 = a($$0, w, egz.b(egz.c(egz.b($$1.b(eho.j)))));
      egy $$6 = a($$0, x, egz.b(egz.c(egz.c($$1.b(eho.j)))));
      $$0.a(y, ewq.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ewq.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ewq.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jg<egy> $$7 = $$0.a(d, egz.b(egz.a($$5, $$6, 0.25, $$1.b(eho.c))));
      jg<egy> $$8 = $$0.a(e, egz.b(egz.a($$5, $$6, 0.25, $$1.b(eho.d))));
      egy $$9 = a($$0, f, egz.b(egz.a($$5, $$6, 0.25, $$1.b(eho.i))));
      $$0.a(g, a($$9));
      egy $$10 = egz.b($$1.b(eho.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jg<egy> $$11 = $$0.a(l, egz.b(egz.a($$5, $$6, 0.25, $$1.b(eho.g))));
      jg<egy> $$12 = $$0.a(m, egz.b(egz.a($$5, $$6, 0.25, $$1.b(eho.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, egz.a(egz.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, egz.d(egz.a($$1.b(eho.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qi<egy> $$0, jh<egy> $$1, egy $$2, jg<egy> $$3, jg<egy> $$4, alj<egy> $$5, alj<egy> $$6, alj<egy> $$7, alj<egy> $$8, alj<egy> $$9, boolean $$10
   ) {
      egz.w.a $$11 = new egz.w.a($$3);
      egz.w.a $$12 = new egz.w.a($$4);
      egz.w.a $$13 = new egz.w.a($$1.b(f));
      egz.w.a $$14 = new egz.w.a($$1.b(g));
      egy $$15 = a($$0, $$5, a(egz.a(egz.a(-0.50375F), egz.a(qx.a($$11, $$12, $$14, $$10))), egz.c()));
      egy $$16 = a($$0, $$6, a(egz.a(qx.a($$11, $$12, $$13, $$14, $$10)), s));
      egy $$17 = a($$0, $$8, egz.a(egz.a(-64, 320, 1.5, -1.5), $$15));
      egy $$18 = a($$0, $$7, a(egz.a(qx.b($$11, $$12, $$13, $$14, $$10)), t));
      egy $$19 = egz.b($$18, $$2.g());
      egy $$20 = b($$16, egz.a($$17, $$19));
      $$0.a($$9, egz.a($$20, a($$1, y)));
   }

   private static egy a(qi<egy> $$0, alj<egy> $$1, egy $$2) {
      return new egz.j($$0.a($$1, $$2));
   }

   private static egy a(jh<egy> $$0, alj<egy> $$1) {
      return new egz.j($$0.b($$1));
   }

   private static egy a(egy $$0) {
      return egz.b(egz.a(egz.a($$0.d(), egz.a(-0.6666666666666666)).d(), egz.a(-0.3333333333333333)), egz.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static egy b(jh<ewt.a> $$0) {
      egy $$1 = egz.a($$0.b(eho.z));
      egy $$2 = egz.a($$0.b(eho.A), 0.0, -0.1);
      return egz.d(egz.b($$2, egz.a($$1.d(), egz.a(-0.4))));
   }

   private static egy d(jh<egy> $$0, jh<ewt.a> $$1) {
      egy $$2 = egz.d(egz.b($$1.b(eho.x), 2.0, 1.0));
      egy $$3 = egz.a($$1.b(eho.y), -0.065, -0.088);
      egy $$4 = egz.a($$2, $$1.b(eho.v), egz.z.a.a);
      egy $$5 = egz.a($$2, $$1.b(eho.w), egz.z.a.a);
      egy $$6 = egz.a(egz.d($$4, $$5), $$3).a(-1.0, 1.0);
      egy $$7 = a($$0, N);
      egy $$8 = egz.b($$1.b(eho.B), 0.75, 0.5);
      egy $$9 = egz.a(egz.a($$8, egz.a(0.37)), egz.a(-10, 30, 0.3, 0.0));
      return egz.d(egz.c($$9, egz.a($$7, $$6)));
   }

   private static egy e(jh<egy> $$0, jh<ewt.a> $$1) {
      egy $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      egy $$6 = a($$2, egz.b($$1.b(eho.I), 1.0, 1.0), -60, 320, -1);
      egy $$7 = a($$2, egz.a($$1.b(eho.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      egy $$9 = a($$2, egz.b($$1.b(eho.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      egy $$10 = a($$2, egz.b($$1.b(eho.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      egy $$11 = egz.b(egz.a(1.5), egz.d($$9.d(), $$10.d()));
      return egz.a($$6, -1000000.0, 0.0, egz.a(64.0), egz.a($$7, $$11));
   }

   private static egy c(jh<ewt.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      egy $$3 = egz.b($$0.b(eho.o), 25.0, 0.3);
      egy $$4 = egz.a($$0.b(eho.p), 0.0, -2.0);
      egy $$5 = egz.a($$0.b(eho.q), 0.0, 1.1);
      egy $$6 = egz.a(egz.b($$3, egz.a(2.0)), $$4);
      return egz.d(egz.b($$6, $$5.f()));
   }

   private static egy f(jh<egy> $$0, jh<ewt.a> $$1) {
      egy $$2 = egz.b($$1.b(eho.t), 2.0, 1.0);
      egy $$3 = egz.a($$2, $$1.b(eho.r), egz.z.a.b);
      egy $$4 = egz.a($$1.b(eho.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      egy $$5 = a($$0, R);
      egy $$6 = egz.a($$4, egz.a(-64, 320, 8.0, -40.0)).d();
      egy $$7 = egz.a($$6, $$5).f();
      double $$8 = 0.083;
      egy $$9 = egz.a($$3, egz.b(egz.a(0.083), $$5));
      return egz.d($$9, $$7).a(-1.0, 1.0);
   }

   private static egy a(jh<egy> $$0, jh<ewt.a> $$1, egy $$2) {
      egy $$3 = a($$0, S);
      egy $$4 = a($$0, N);
      egy $$5 = egz.a($$1.b(eho.C), 8.0);
      egy $$6 = egz.b(egz.a(4.0), $$5.e());
      egy $$7 = egz.a($$1.b(eho.D), 0.6666666666666666);
      egy $$8 = egz.a(egz.a(egz.a(0.27), $$7).a(-1.0, 1.0), egz.a(egz.a(1.5), egz.b(egz.a(-0.64), $$2)).a(0.0, 0.5));
      egy $$9 = egz.a($$6, $$8);
      egy $$10 = egz.c(egz.c($$9, a($$0, O)), egz.a($$3, $$4));
      egy $$11 = a($$0, Q);
      egy $$12 = egz.a($$11, -1000000.0, 0.03, egz.a(-1000000.0), $$11);
      return egz.d($$10, $$12);
   }

   private static egy b(egy $$0) {
      egy $$1 = egz.f($$0);
      return egz.b(egz.a($$1), egz.a(0.64)).i();
   }

   protected static ehl a(jh<egy> $$0, jh<ewt.a> $$1, boolean $$2, boolean $$3) {
      egy $$4 = egz.a($$1.b(eho.k), 0.5);
      egy $$5 = egz.a($$1.b(eho.l), 0.67);
      egy $$6 = egz.a($$1.b(eho.n), 0.7142857142857143);
      egy $$7 = egz.a($$1.b(eho.m));
      egy $$8 = a($$0, w);
      egy $$9 = a($$0, x);
      egy $$10 = egz.a($$8, $$9, 0.25, $$1.b($$2 ? eho.e : eho.a));
      egy $$11 = egz.a($$8, $$9, 0.25, $$1.b($$2 ? eho.f : eho.b));
      egy $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      egy $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      egy $$14 = b(egz.c($$12), $$13);
      egy $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      egy $$16 = egz.c($$15, egz.b(egz.a(5.0), a($$0, O)));
      egy $$17 = egz.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      egy $$18 = egz.c(b(a($$3, $$17)), a($$0, P));
      egy $$19 = a($$0, v);
      int $$20 = Stream.of(ehp.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-efd.e * 2);
      int $$21 = Stream.of(ehp.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-efd.e * 2);
      egy $$22 = a($$19, egz.b($$1.b(eho.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      egy $$24 = a($$19, egz.b($$1.b(eho.F), 4.0, 4.0), $$20, $$21, 0).d();
      egy $$25 = a($$19, egz.b($$1.b(eho.G), 4.0, 4.0), $$20, $$21, 0).d();
      egy $$26 = egz.a(egz.a(-0.08F), egz.d($$24, $$25));
      egy $$27 = egz.a($$1.b(eho.H));
      return new ehl(
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
         a($$3, egz.a($$14, egz.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ehl b(jh<egy> $$0, jh<ewt.a> $$1, egy $$2) {
      egy $$3 = a($$0, w);
      egy $$4 = a($$0, x);
      egy $$5 = egz.a($$3, $$4, 0.25, $$1.b(eho.a));
      egy $$6 = egz.a($$3, $$4, 0.25, $$1.b(eho.b));
      egy $$7 = b($$2);
      return new ehl(egz.a(), egz.a(), egz.a(), egz.a(), $$5, $$6, egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), $$7, egz.a(), egz.a(), egz.a());
   }

   private static egy a(boolean $$0, egy $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static egy a(jh<egy> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static egy a(egy $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ehl a(jh<egy> $$0, jh<ewt.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ehl b(jh<egy> $$0, jh<ewt.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ehl c(jh<egy> $$0, jh<ewt.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static egy c(egy $$0) {
      return a($$0, 0, 128);
   }

   protected static ehl a(jh<egy> $$0) {
      egy $$1 = egz.c(egz.a(0L));
      egy $$2 = b(c(a($$0, M)));
      return new ehl(
         egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), $$1, egz.a(), egz.a(), c(egz.a($$1, egz.a(-0.703125))), $$2, egz.a(), egz.a(), egz.a()
      );
   }

   protected static ehl a() {
      return new ehl(egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), egz.a(), egz.a());
   }

   private static egy a(egy $$0, egy $$1) {
      egy $$2 = egz.a(egz.b(), $$1, $$0);
      return egz.b(egz.c($$2));
   }

   private static egy b(egy $$0, egy $$1) {
      egy $$2 = egz.b($$1, $$0);
      return egz.b(egz.a(4.0), $$2.h());
   }

   private static egy a(egy $$0, egy $$1, int $$2, int $$3, int $$4) {
      return egz.a(egz.a($$0, (double)$$2, (double)($$3 + 1), $$1, egz.a((double)$$4)));
   }

   private static egy a(egy $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      egy $$10 = egz.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      egy $$9 = egz.a($$10, $$5, $$0);
      egy $$11 = egz.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return egz.a($$11, $$8, $$9);
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
