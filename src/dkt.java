import java.util.stream.Stream;

public class dkt {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dkf s = dkg.a(10.0);
   private static final dkf t = dkg.a();
   private static final aey<dkf> u = a("zero");
   private static final aey<dkf> v = a("y");
   private static final aey<dkf> w = a("shift_x");
   private static final aey<dkf> x = a("shift_z");
   private static final aey<dkf> y = a("overworld/base_3d_noise");
   private static final aey<dkf> z = a("nether/base_3d_noise");
   private static final aey<dkf> A = a("end/base_3d_noise");
   public static final aey<dkf> d = a("overworld/continents");
   public static final aey<dkf> e = a("overworld/erosion");
   public static final aey<dkf> f = a("overworld/ridges");
   public static final aey<dkf> g = a("overworld/ridges_folded");
   public static final aey<dkf> h = a("overworld/offset");
   public static final aey<dkf> i = a("overworld/factor");
   public static final aey<dkf> j = a("overworld/jaggedness");
   public static final aey<dkf> k = a("overworld/depth");
   private static final aey<dkf> B = a("overworld/sloped_cheese");
   public static final aey<dkf> l = a("overworld_large_biomes/continents");
   public static final aey<dkf> m = a("overworld_large_biomes/erosion");
   private static final aey<dkf> C = a("overworld_large_biomes/offset");
   private static final aey<dkf> D = a("overworld_large_biomes/factor");
   private static final aey<dkf> E = a("overworld_large_biomes/jaggedness");
   private static final aey<dkf> F = a("overworld_large_biomes/depth");
   private static final aey<dkf> G = a("overworld_large_biomes/sloped_cheese");
   private static final aey<dkf> H = a("overworld_amplified/offset");
   private static final aey<dkf> I = a("overworld_amplified/factor");
   private static final aey<dkf> J = a("overworld_amplified/jaggedness");
   private static final aey<dkf> K = a("overworld_amplified/depth");
   private static final aey<dkf> L = a("overworld_amplified/sloped_cheese");
   private static final aey<dkf> M = a("end/sloped_cheese");
   private static final aey<dkf> N = a("overworld/caves/spaghetti_roughness_function");
   private static final aey<dkf> O = a("overworld/caves/entrances");
   private static final aey<dkf> P = a("overworld/caves/noodle");
   private static final aey<dkf> Q = a("overworld/caves/pillars");
   private static final aey<dkf> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final aey<dkf> S = a("overworld/caves/spaghetti_2d");

   private static aey<dkf> a(String $$0) {
      return aey.a(jc.au, new aez($$0));
   }

   public static he<? extends dkf> a(nr<dkf> $$0) {
      hf<dzj.a> $$1 = $$0.a(jc.ay);
      hf<dkf> $$2 = $$0.a(jc.au);
      $$0.a(u, dkg.a());
      int $$3 = dim.e * 2;
      int $$4 = dim.d * 2;
      $$0.a(v, dkg.a($$3, $$4, (double)$$3, (double)$$4));
      dkf $$5 = a($$0, w, dkg.b(dkg.c(dkg.b($$1.b(dkv.j)))));
      dkf $$6 = a($$0, x, dkg.b(dkg.c(dkg.c($$1.b(dkv.j)))));
      $$0.a(y, dzg.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, dzg.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, dzg.a(0.25, 0.25, 80.0, 160.0, 4.0));
      he<dkf> $$7 = $$0.a(d, dkg.b(dkg.a($$5, $$6, 0.25, $$1.b(dkv.c))));
      he<dkf> $$8 = $$0.a(e, dkg.b(dkg.a($$5, $$6, 0.25, $$1.b(dkv.d))));
      dkf $$9 = a($$0, f, dkg.b(dkg.a($$5, $$6, 0.25, $$1.b(dkv.i))));
      $$0.a(g, a($$9));
      dkf $$10 = dkg.b($$1.b(dkv.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      he<dkf> $$11 = $$0.a(l, dkg.b(dkg.a($$5, $$6, 0.25, $$1.b(dkv.g))));
      he<dkf> $$12 = $$0.a(m, dkg.b(dkg.a($$5, $$6, 0.25, $$1.b(dkv.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dkg.a(dkg.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dkg.d(dkg.a($$1.b(dkv.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      nr<dkf> $$0, hf<dkf> $$1, dkf $$2, he<dkf> $$3, he<dkf> $$4, aey<dkf> $$5, aey<dkf> $$6, aey<dkf> $$7, aey<dkf> $$8, aey<dkf> $$9, boolean $$10
   ) {
      dkg.w.a $$11 = new dkg.w.a($$3);
      dkg.w.a $$12 = new dkg.w.a($$4);
      dkg.w.a $$13 = new dkg.w.a($$1.b(f));
      dkg.w.a $$14 = new dkg.w.a($$1.b(g));
      dkf $$15 = a($$0, $$5, a(dkg.a(dkg.a(-0.50375F), dkg.a(og.a($$11, $$12, $$14, $$10))), dkg.c()));
      dkf $$16 = a($$0, $$6, a(dkg.a(og.a($$11, $$12, $$13, $$14, $$10)), s));
      dkf $$17 = a($$0, $$8, dkg.a(dkg.a(-64, 320, 1.5, -1.5), $$15));
      dkf $$18 = a($$0, $$7, a(dkg.a(og.b($$11, $$12, $$13, $$14, $$10)), t));
      dkf $$19 = dkg.b($$18, $$2.g());
      dkf $$20 = b($$16, dkg.a($$17, $$19));
      $$0.a($$9, dkg.a($$20, a($$1, y)));
   }

   private static dkf a(nr<dkf> $$0, aey<dkf> $$1, dkf $$2) {
      return new dkg.j($$0.a($$1, $$2));
   }

   private static dkf a(hf<dkf> $$0, aey<dkf> $$1) {
      return new dkg.j($$0.b($$1));
   }

   private static dkf a(dkf $$0) {
      return dkg.b(dkg.a(dkg.a($$0.d(), dkg.a(-0.6666666666666666)).d(), dkg.a(-0.3333333333333333)), dkg.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dkf b(hf<dzj.a> $$0) {
      dkf $$1 = dkg.a($$0.b(dkv.z));
      dkf $$2 = dkg.a($$0.b(dkv.A), 0.0, -0.1);
      return dkg.d(dkg.b($$2, dkg.a($$1.d(), dkg.a(-0.4))));
   }

   private static dkf d(hf<dkf> $$0, hf<dzj.a> $$1) {
      dkf $$2 = dkg.d(dkg.b($$1.b(dkv.x), 2.0, 1.0));
      dkf $$3 = dkg.a($$1.b(dkv.y), -0.065, -0.088);
      dkf $$4 = dkg.a($$2, $$1.b(dkv.v), dkg.z.a.a);
      dkf $$5 = dkg.a($$2, $$1.b(dkv.w), dkg.z.a.a);
      dkf $$6 = dkg.a(dkg.d($$4, $$5), $$3).a(-1.0, 1.0);
      dkf $$7 = a($$0, N);
      dkf $$8 = dkg.b($$1.b(dkv.B), 0.75, 0.5);
      dkf $$9 = dkg.a(dkg.a($$8, dkg.a(0.37)), dkg.a(-10, 30, 0.3, 0.0));
      return dkg.d(dkg.c($$9, dkg.a($$7, $$6)));
   }

   private static dkf e(hf<dkf> $$0, hf<dzj.a> $$1) {
      dkf $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dkf $$6 = a($$2, dkg.b($$1.b(dkv.I), 1.0, 1.0), -60, 320, -1);
      dkf $$7 = a($$2, dkg.a($$1.b(dkv.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dkf $$9 = a($$2, dkg.b($$1.b(dkv.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dkf $$10 = a($$2, dkg.b($$1.b(dkv.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dkf $$11 = dkg.b(dkg.a(1.5), dkg.d($$9.d(), $$10.d()));
      return dkg.a($$6, -1000000.0, 0.0, dkg.a(64.0), dkg.a($$7, $$11));
   }

   private static dkf c(hf<dzj.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dkf $$3 = dkg.b($$0.b(dkv.o), 25.0, 0.3);
      dkf $$4 = dkg.a($$0.b(dkv.p), 0.0, -2.0);
      dkf $$5 = dkg.a($$0.b(dkv.q), 0.0, 1.1);
      dkf $$6 = dkg.a(dkg.b($$3, dkg.a(2.0)), $$4);
      return dkg.d(dkg.b($$6, $$5.f()));
   }

   private static dkf f(hf<dkf> $$0, hf<dzj.a> $$1) {
      dkf $$2 = dkg.b($$1.b(dkv.t), 2.0, 1.0);
      dkf $$3 = dkg.a($$2, $$1.b(dkv.r), dkg.z.a.b);
      dkf $$4 = dkg.a($$1.b(dkv.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dkf $$5 = a($$0, R);
      dkf $$6 = dkg.a($$4, dkg.a(-64, 320, 8.0, -40.0)).d();
      dkf $$7 = dkg.a($$6, $$5).f();
      double $$8 = 0.083;
      dkf $$9 = dkg.a($$3, dkg.b(dkg.a(0.083), $$5));
      return dkg.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dkf a(hf<dkf> $$0, hf<dzj.a> $$1, dkf $$2) {
      dkf $$3 = a($$0, S);
      dkf $$4 = a($$0, N);
      dkf $$5 = dkg.a($$1.b(dkv.C), 8.0);
      dkf $$6 = dkg.b(dkg.a(4.0), $$5.e());
      dkf $$7 = dkg.a($$1.b(dkv.D), 0.6666666666666666);
      dkf $$8 = dkg.a(dkg.a(dkg.a(0.27), $$7).a(-1.0, 1.0), dkg.a(dkg.a(1.5), dkg.b(dkg.a(-0.64), $$2)).a(0.0, 0.5));
      dkf $$9 = dkg.a($$6, $$8);
      dkf $$10 = dkg.c(dkg.c($$9, a($$0, O)), dkg.a($$3, $$4));
      dkf $$11 = a($$0, Q);
      dkf $$12 = dkg.a($$11, -1000000.0, 0.03, dkg.a(-1000000.0), $$11);
      return dkg.d($$10, $$12);
   }

   private static dkf b(dkf $$0) {
      dkf $$1 = dkg.f($$0);
      return dkg.b(dkg.a($$1), dkg.a(0.64)).i();
   }

   protected static dks a(hf<dkf> $$0, hf<dzj.a> $$1, boolean $$2, boolean $$3) {
      dkf $$4 = dkg.a($$1.b(dkv.k), 0.5);
      dkf $$5 = dkg.a($$1.b(dkv.l), 0.67);
      dkf $$6 = dkg.a($$1.b(dkv.n), 0.7142857142857143);
      dkf $$7 = dkg.a($$1.b(dkv.m));
      dkf $$8 = a($$0, w);
      dkf $$9 = a($$0, x);
      dkf $$10 = dkg.a($$8, $$9, 0.25, $$1.b($$2 ? dkv.e : dkv.a));
      dkf $$11 = dkg.a($$8, $$9, 0.25, $$1.b($$2 ? dkv.f : dkv.b));
      dkf $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dkf $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dkf $$14 = b(dkg.c($$12), $$13);
      dkf $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dkf $$16 = dkg.c($$15, dkg.b(dkg.a(5.0), a($$0, O)));
      dkf $$17 = dkg.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dkf $$18 = dkg.c(b(a($$3, $$17)), a($$0, P));
      dkf $$19 = a($$0, v);
      int $$20 = Stream.of(dkw.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dim.e * 2);
      int $$21 = Stream.of(dkw.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dim.e * 2);
      dkf $$22 = a($$19, dkg.b($$1.b(dkv.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dkf $$24 = a($$19, dkg.b($$1.b(dkv.F), 4.0, 4.0), $$20, $$21, 0).d();
      dkf $$25 = a($$19, dkg.b($$1.b(dkv.G), 4.0, 4.0), $$20, $$21, 0).d();
      dkf $$26 = dkg.a(dkg.a(-0.08F), dkg.d($$24, $$25));
      dkf $$27 = dkg.a($$1.b(dkv.H));
      return new dks(
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
         a($$3, dkg.a($$14, dkg.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dks b(hf<dkf> $$0, hf<dzj.a> $$1, dkf $$2) {
      dkf $$3 = a($$0, w);
      dkf $$4 = a($$0, x);
      dkf $$5 = dkg.a($$3, $$4, 0.25, $$1.b(dkv.a));
      dkf $$6 = dkg.a($$3, $$4, 0.25, $$1.b(dkv.b));
      dkf $$7 = b($$2);
      return new dks(dkg.a(), dkg.a(), dkg.a(), dkg.a(), $$5, $$6, dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), $$7, dkg.a(), dkg.a(), dkg.a());
   }

   private static dkf a(boolean $$0, dkf $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dkf a(hf<dkf> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dkf a(dkf $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dks a(hf<dkf> $$0, hf<dzj.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dks b(hf<dkf> $$0, hf<dzj.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dks c(hf<dkf> $$0, hf<dzj.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dkf c(dkf $$0) {
      return a($$0, 0, 128);
   }

   protected static dks a(hf<dkf> $$0) {
      dkf $$1 = dkg.c(dkg.a(0L));
      dkf $$2 = b(c(a($$0, M)));
      return new dks(
         dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), $$1, dkg.a(), dkg.a(), c(dkg.a($$1, dkg.a(-0.703125))), $$2, dkg.a(), dkg.a(), dkg.a()
      );
   }

   protected static dks a() {
      return new dks(dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a(), dkg.a());
   }

   private static dkf a(dkf $$0, dkf $$1) {
      dkf $$2 = dkg.a(dkg.b(), $$1, $$0);
      return dkg.b(dkg.c($$2));
   }

   private static dkf b(dkf $$0, dkf $$1) {
      dkf $$2 = dkg.b($$1, $$0);
      return dkg.b(dkg.a(4.0), $$2.h());
   }

   private static dkf a(dkf $$0, dkf $$1, int $$2, int $$3, int $$4) {
      return dkg.a(dkg.a($$0, (double)$$2, (double)($$3 + 1), $$1, dkg.a((double)$$4)));
   }

   private static dkf a(dkf $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dkf $$10 = dkg.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dkf $$9 = dkg.a($$10, $$5, $$0);
      dkf $$11 = dkg.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dkg.a($$11, $$8, $$9);
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
