import java.util.stream.Stream;

public class ebx {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final ebj s = ebk.a(10.0);
   private static final ebj t = ebk.a();
   private static final ali<ebj> u = a("zero");
   private static final ali<ebj> v = a("y");
   private static final ali<ebj> w = a("shift_x");
   private static final ali<ebj> x = a("shift_z");
   private static final ali<ebj> y = a("overworld/base_3d_noise");
   private static final ali<ebj> z = a("nether/base_3d_noise");
   private static final ali<ebj> A = a("end/base_3d_noise");
   public static final ali<ebj> d = a("overworld/continents");
   public static final ali<ebj> e = a("overworld/erosion");
   public static final ali<ebj> f = a("overworld/ridges");
   public static final ali<ebj> g = a("overworld/ridges_folded");
   public static final ali<ebj> h = a("overworld/offset");
   public static final ali<ebj> i = a("overworld/factor");
   public static final ali<ebj> j = a("overworld/jaggedness");
   public static final ali<ebj> k = a("overworld/depth");
   private static final ali<ebj> B = a("overworld/sloped_cheese");
   public static final ali<ebj> l = a("overworld_large_biomes/continents");
   public static final ali<ebj> m = a("overworld_large_biomes/erosion");
   private static final ali<ebj> C = a("overworld_large_biomes/offset");
   private static final ali<ebj> D = a("overworld_large_biomes/factor");
   private static final ali<ebj> E = a("overworld_large_biomes/jaggedness");
   private static final ali<ebj> F = a("overworld_large_biomes/depth");
   private static final ali<ebj> G = a("overworld_large_biomes/sloped_cheese");
   private static final ali<ebj> H = a("overworld_amplified/offset");
   private static final ali<ebj> I = a("overworld_amplified/factor");
   private static final ali<ebj> J = a("overworld_amplified/jaggedness");
   private static final ali<ebj> K = a("overworld_amplified/depth");
   private static final ali<ebj> L = a("overworld_amplified/sloped_cheese");
   private static final ali<ebj> M = a("end/sloped_cheese");
   private static final ali<ebj> N = a("overworld/caves/spaghetti_roughness_function");
   private static final ali<ebj> O = a("overworld/caves/entrances");
   private static final ali<ebj> P = a("overworld/caves/noodle");
   private static final ali<ebj> Q = a("overworld/caves/pillars");
   private static final ali<ebj> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final ali<ebj> S = a("overworld/caves/spaghetti_2d");

   private static ali<ebj> a(String $$0) {
      return ali.a(ma.aK, alj.b($$0));
   }

   public static jq<? extends ebj> a(qz<ebj> $$0) {
      jr<eqy.a> $$1 = $$0.a(ma.aQ);
      jr<ebj> $$2 = $$0.a(ma.aK);
      $$0.a(u, ebk.a());
      int $$3 = dzq.e * 2;
      int $$4 = dzq.d * 2;
      $$0.a(v, ebk.a($$3, $$4, (double)$$3, (double)$$4));
      ebj $$5 = a($$0, w, ebk.b(ebk.c(ebk.b($$1.b(ebz.j)))));
      ebj $$6 = a($$0, x, ebk.b(ebk.c(ebk.c($$1.b(ebz.j)))));
      $$0.a(y, eqv.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, eqv.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, eqv.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jq<ebj> $$7 = $$0.a(d, ebk.b(ebk.a($$5, $$6, 0.25, $$1.b(ebz.c))));
      jq<ebj> $$8 = $$0.a(e, ebk.b(ebk.a($$5, $$6, 0.25, $$1.b(ebz.d))));
      ebj $$9 = a($$0, f, ebk.b(ebk.a($$5, $$6, 0.25, $$1.b(ebz.i))));
      $$0.a(g, a($$9));
      ebj $$10 = ebk.b($$1.b(ebz.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jq<ebj> $$11 = $$0.a(l, ebk.b(ebk.a($$5, $$6, 0.25, $$1.b(ebz.g))));
      jq<ebj> $$12 = $$0.a(m, ebk.b(ebk.a($$5, $$6, 0.25, $$1.b(ebz.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, ebk.a(ebk.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, ebk.d(ebk.a($$1.b(ebz.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qz<ebj> $$0, jr<ebj> $$1, ebj $$2, jq<ebj> $$3, jq<ebj> $$4, ali<ebj> $$5, ali<ebj> $$6, ali<ebj> $$7, ali<ebj> $$8, ali<ebj> $$9, boolean $$10
   ) {
      ebk.w.a $$11 = new ebk.w.a($$3);
      ebk.w.a $$12 = new ebk.w.a($$4);
      ebk.w.a $$13 = new ebk.w.a($$1.b(f));
      ebk.w.a $$14 = new ebk.w.a($$1.b(g));
      ebj $$15 = a($$0, $$5, a(ebk.a(ebk.a(-0.50375F), ebk.a(ro.a($$11, $$12, $$14, $$10))), ebk.c()));
      ebj $$16 = a($$0, $$6, a(ebk.a(ro.a($$11, $$12, $$13, $$14, $$10)), s));
      ebj $$17 = a($$0, $$8, ebk.a(ebk.a(-64, 320, 1.5, -1.5), $$15));
      ebj $$18 = a($$0, $$7, a(ebk.a(ro.b($$11, $$12, $$13, $$14, $$10)), t));
      ebj $$19 = ebk.b($$18, $$2.g());
      ebj $$20 = b($$16, ebk.a($$17, $$19));
      $$0.a($$9, ebk.a($$20, a($$1, y)));
   }

   private static ebj a(qz<ebj> $$0, ali<ebj> $$1, ebj $$2) {
      return new ebk.j($$0.a($$1, $$2));
   }

   private static ebj a(jr<ebj> $$0, ali<ebj> $$1) {
      return new ebk.j($$0.b($$1));
   }

   private static ebj a(ebj $$0) {
      return ebk.b(ebk.a(ebk.a($$0.d(), ebk.a(-0.6666666666666666)).d(), ebk.a(-0.3333333333333333)), ebk.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static ebj b(jr<eqy.a> $$0) {
      ebj $$1 = ebk.a($$0.b(ebz.z));
      ebj $$2 = ebk.a($$0.b(ebz.A), 0.0, -0.1);
      return ebk.d(ebk.b($$2, ebk.a($$1.d(), ebk.a(-0.4))));
   }

   private static ebj d(jr<ebj> $$0, jr<eqy.a> $$1) {
      ebj $$2 = ebk.d(ebk.b($$1.b(ebz.x), 2.0, 1.0));
      ebj $$3 = ebk.a($$1.b(ebz.y), -0.065, -0.088);
      ebj $$4 = ebk.a($$2, $$1.b(ebz.v), ebk.z.a.a);
      ebj $$5 = ebk.a($$2, $$1.b(ebz.w), ebk.z.a.a);
      ebj $$6 = ebk.a(ebk.d($$4, $$5), $$3).a(-1.0, 1.0);
      ebj $$7 = a($$0, N);
      ebj $$8 = ebk.b($$1.b(ebz.B), 0.75, 0.5);
      ebj $$9 = ebk.a(ebk.a($$8, ebk.a(0.37)), ebk.a(-10, 30, 0.3, 0.0));
      return ebk.d(ebk.c($$9, ebk.a($$7, $$6)));
   }

   private static ebj e(jr<ebj> $$0, jr<eqy.a> $$1) {
      ebj $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      ebj $$6 = a($$2, ebk.b($$1.b(ebz.I), 1.0, 1.0), -60, 320, -1);
      ebj $$7 = a($$2, ebk.a($$1.b(ebz.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      ebj $$9 = a($$2, ebk.b($$1.b(ebz.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ebj $$10 = a($$2, ebk.b($$1.b(ebz.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ebj $$11 = ebk.b(ebk.a(1.5), ebk.d($$9.d(), $$10.d()));
      return ebk.a($$6, -1000000.0, 0.0, ebk.a(64.0), ebk.a($$7, $$11));
   }

   private static ebj c(jr<eqy.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      ebj $$3 = ebk.b($$0.b(ebz.o), 25.0, 0.3);
      ebj $$4 = ebk.a($$0.b(ebz.p), 0.0, -2.0);
      ebj $$5 = ebk.a($$0.b(ebz.q), 0.0, 1.1);
      ebj $$6 = ebk.a(ebk.b($$3, ebk.a(2.0)), $$4);
      return ebk.d(ebk.b($$6, $$5.f()));
   }

   private static ebj f(jr<ebj> $$0, jr<eqy.a> $$1) {
      ebj $$2 = ebk.b($$1.b(ebz.t), 2.0, 1.0);
      ebj $$3 = ebk.a($$2, $$1.b(ebz.r), ebk.z.a.b);
      ebj $$4 = ebk.a($$1.b(ebz.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      ebj $$5 = a($$0, R);
      ebj $$6 = ebk.a($$4, ebk.a(-64, 320, 8.0, -40.0)).d();
      ebj $$7 = ebk.a($$6, $$5).f();
      double $$8 = 0.083;
      ebj $$9 = ebk.a($$3, ebk.b(ebk.a(0.083), $$5));
      return ebk.d($$9, $$7).a(-1.0, 1.0);
   }

   private static ebj a(jr<ebj> $$0, jr<eqy.a> $$1, ebj $$2) {
      ebj $$3 = a($$0, S);
      ebj $$4 = a($$0, N);
      ebj $$5 = ebk.a($$1.b(ebz.C), 8.0);
      ebj $$6 = ebk.b(ebk.a(4.0), $$5.e());
      ebj $$7 = ebk.a($$1.b(ebz.D), 0.6666666666666666);
      ebj $$8 = ebk.a(ebk.a(ebk.a(0.27), $$7).a(-1.0, 1.0), ebk.a(ebk.a(1.5), ebk.b(ebk.a(-0.64), $$2)).a(0.0, 0.5));
      ebj $$9 = ebk.a($$6, $$8);
      ebj $$10 = ebk.c(ebk.c($$9, a($$0, O)), ebk.a($$3, $$4));
      ebj $$11 = a($$0, Q);
      ebj $$12 = ebk.a($$11, -1000000.0, 0.03, ebk.a(-1000000.0), $$11);
      return ebk.d($$10, $$12);
   }

   private static ebj b(ebj $$0) {
      ebj $$1 = ebk.f($$0);
      return ebk.b(ebk.a($$1), ebk.a(0.64)).i();
   }

   protected static ebw a(jr<ebj> $$0, jr<eqy.a> $$1, boolean $$2, boolean $$3) {
      ebj $$4 = ebk.a($$1.b(ebz.k), 0.5);
      ebj $$5 = ebk.a($$1.b(ebz.l), 0.67);
      ebj $$6 = ebk.a($$1.b(ebz.n), 0.7142857142857143);
      ebj $$7 = ebk.a($$1.b(ebz.m));
      ebj $$8 = a($$0, w);
      ebj $$9 = a($$0, x);
      ebj $$10 = ebk.a($$8, $$9, 0.25, $$1.b($$2 ? ebz.e : ebz.a));
      ebj $$11 = ebk.a($$8, $$9, 0.25, $$1.b($$2 ? ebz.f : ebz.b));
      ebj $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      ebj $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      ebj $$14 = b(ebk.c($$12), $$13);
      ebj $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      ebj $$16 = ebk.c($$15, ebk.b(ebk.a(5.0), a($$0, O)));
      ebj $$17 = ebk.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      ebj $$18 = ebk.c(b(a($$3, $$17)), a($$0, P));
      ebj $$19 = a($$0, v);
      int $$20 = Stream.of(eca.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dzq.e * 2);
      int $$21 = Stream.of(eca.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dzq.e * 2);
      ebj $$22 = a($$19, ebk.b($$1.b(ebz.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      ebj $$24 = a($$19, ebk.b($$1.b(ebz.F), 4.0, 4.0), $$20, $$21, 0).d();
      ebj $$25 = a($$19, ebk.b($$1.b(ebz.G), 4.0, 4.0), $$20, $$21, 0).d();
      ebj $$26 = ebk.a(ebk.a(-0.08F), ebk.d($$24, $$25));
      ebj $$27 = ebk.a($$1.b(ebz.H));
      return new ebw(
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
         a($$3, ebk.a($$14, ebk.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ebw b(jr<ebj> $$0, jr<eqy.a> $$1, ebj $$2) {
      ebj $$3 = a($$0, w);
      ebj $$4 = a($$0, x);
      ebj $$5 = ebk.a($$3, $$4, 0.25, $$1.b(ebz.a));
      ebj $$6 = ebk.a($$3, $$4, 0.25, $$1.b(ebz.b));
      ebj $$7 = b($$2);
      return new ebw(ebk.a(), ebk.a(), ebk.a(), ebk.a(), $$5, $$6, ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), $$7, ebk.a(), ebk.a(), ebk.a());
   }

   private static ebj a(boolean $$0, ebj $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static ebj a(jr<ebj> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static ebj a(ebj $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ebw a(jr<ebj> $$0, jr<eqy.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ebw b(jr<ebj> $$0, jr<eqy.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ebw c(jr<ebj> $$0, jr<eqy.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static ebj c(ebj $$0) {
      return a($$0, 0, 128);
   }

   protected static ebw a(jr<ebj> $$0) {
      ebj $$1 = ebk.c(ebk.a(0L));
      ebj $$2 = b(c(a($$0, M)));
      return new ebw(
         ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), $$1, ebk.a(), ebk.a(), c(ebk.a($$1, ebk.a(-0.703125))), $$2, ebk.a(), ebk.a(), ebk.a()
      );
   }

   protected static ebw a() {
      return new ebw(ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a(), ebk.a());
   }

   private static ebj a(ebj $$0, ebj $$1) {
      ebj $$2 = ebk.a(ebk.b(), $$1, $$0);
      return ebk.b(ebk.c($$2));
   }

   private static ebj b(ebj $$0, ebj $$1) {
      ebj $$2 = ebk.b($$1, $$0);
      return ebk.b(ebk.a(4.0), $$2.h());
   }

   private static ebj a(ebj $$0, ebj $$1, int $$2, int $$3, int $$4) {
      return ebk.a(ebk.a($$0, (double)$$2, (double)($$3 + 1), $$1, ebk.a((double)$$4)));
   }

   private static ebj a(ebj $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      ebj $$10 = ebk.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      ebj $$9 = ebk.a($$10, $$5, $$0);
      ebj $$11 = ebk.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return ebk.a($$11, $$8, $$9);
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
