import java.util.stream.Stream;

public class dmy {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final dmk s = dml.a(10.0);
   private static final dmk t = dml.a();
   private static final agh<dmk> u = a("zero");
   private static final agh<dmk> v = a("y");
   private static final agh<dmk> w = a("shift_x");
   private static final agh<dmk> x = a("shift_z");
   private static final agh<dmk> y = a("overworld/base_3d_noise");
   private static final agh<dmk> z = a("nether/base_3d_noise");
   private static final agh<dmk> A = a("end/base_3d_noise");
   public static final agh<dmk> d = a("overworld/continents");
   public static final agh<dmk> e = a("overworld/erosion");
   public static final agh<dmk> f = a("overworld/ridges");
   public static final agh<dmk> g = a("overworld/ridges_folded");
   public static final agh<dmk> h = a("overworld/offset");
   public static final agh<dmk> i = a("overworld/factor");
   public static final agh<dmk> j = a("overworld/jaggedness");
   public static final agh<dmk> k = a("overworld/depth");
   private static final agh<dmk> B = a("overworld/sloped_cheese");
   public static final agh<dmk> l = a("overworld_large_biomes/continents");
   public static final agh<dmk> m = a("overworld_large_biomes/erosion");
   private static final agh<dmk> C = a("overworld_large_biomes/offset");
   private static final agh<dmk> D = a("overworld_large_biomes/factor");
   private static final agh<dmk> E = a("overworld_large_biomes/jaggedness");
   private static final agh<dmk> F = a("overworld_large_biomes/depth");
   private static final agh<dmk> G = a("overworld_large_biomes/sloped_cheese");
   private static final agh<dmk> H = a("overworld_amplified/offset");
   private static final agh<dmk> I = a("overworld_amplified/factor");
   private static final agh<dmk> J = a("overworld_amplified/jaggedness");
   private static final agh<dmk> K = a("overworld_amplified/depth");
   private static final agh<dmk> L = a("overworld_amplified/sloped_cheese");
   private static final agh<dmk> M = a("end/sloped_cheese");
   private static final agh<dmk> N = a("overworld/caves/spaghetti_roughness_function");
   private static final agh<dmk> O = a("overworld/caves/entrances");
   private static final agh<dmk> P = a("overworld/caves/noodle");
   private static final agh<dmk> Q = a("overworld/caves/pillars");
   private static final agh<dmk> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final agh<dmk> S = a("overworld/caves/spaghetti_2d");

   private static agh<dmk> a(String $$0) {
      return agh.a(jz.av, new agi($$0));
   }

   public static ib<? extends dmk> a(ov<dmk> $$0) {
      ic<ebv.a> $$1 = $$0.a(jz.az);
      ic<dmk> $$2 = $$0.a(jz.av);
      $$0.a(u, dml.a());
      int $$3 = dkr.e * 2;
      int $$4 = dkr.d * 2;
      $$0.a(v, dml.a($$3, $$4, (double)$$3, (double)$$4));
      dmk $$5 = a($$0, w, dml.b(dml.c(dml.b($$1.b(dna.j)))));
      dmk $$6 = a($$0, x, dml.b(dml.c(dml.c($$1.b(dna.j)))));
      $$0.a(y, ebs.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ebs.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ebs.a(0.25, 0.25, 80.0, 160.0, 4.0));
      ib<dmk> $$7 = $$0.a(d, dml.b(dml.a($$5, $$6, 0.25, $$1.b(dna.c))));
      ib<dmk> $$8 = $$0.a(e, dml.b(dml.a($$5, $$6, 0.25, $$1.b(dna.d))));
      dmk $$9 = a($$0, f, dml.b(dml.a($$5, $$6, 0.25, $$1.b(dna.i))));
      $$0.a(g, a($$9));
      dmk $$10 = dml.b($$1.b(dna.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      ib<dmk> $$11 = $$0.a(l, dml.b(dml.a($$5, $$6, 0.25, $$1.b(dna.g))));
      ib<dmk> $$12 = $$0.a(m, dml.b(dml.a($$5, $$6, 0.25, $$1.b(dna.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, dml.a(dml.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, dml.d(dml.a($$1.b(dna.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      ov<dmk> $$0, ic<dmk> $$1, dmk $$2, ib<dmk> $$3, ib<dmk> $$4, agh<dmk> $$5, agh<dmk> $$6, agh<dmk> $$7, agh<dmk> $$8, agh<dmk> $$9, boolean $$10
   ) {
      dml.w.a $$11 = new dml.w.a($$3);
      dml.w.a $$12 = new dml.w.a($$4);
      dml.w.a $$13 = new dml.w.a($$1.b(f));
      dml.w.a $$14 = new dml.w.a($$1.b(g));
      dmk $$15 = a($$0, $$5, a(dml.a(dml.a(-0.50375F), dml.a(pk.a($$11, $$12, $$14, $$10))), dml.c()));
      dmk $$16 = a($$0, $$6, a(dml.a(pk.a($$11, $$12, $$13, $$14, $$10)), s));
      dmk $$17 = a($$0, $$8, dml.a(dml.a(-64, 320, 1.5, -1.5), $$15));
      dmk $$18 = a($$0, $$7, a(dml.a(pk.b($$11, $$12, $$13, $$14, $$10)), t));
      dmk $$19 = dml.b($$18, $$2.g());
      dmk $$20 = b($$16, dml.a($$17, $$19));
      $$0.a($$9, dml.a($$20, a($$1, y)));
   }

   private static dmk a(ov<dmk> $$0, agh<dmk> $$1, dmk $$2) {
      return new dml.j($$0.a($$1, $$2));
   }

   private static dmk a(ic<dmk> $$0, agh<dmk> $$1) {
      return new dml.j($$0.b($$1));
   }

   private static dmk a(dmk $$0) {
      return dml.b(dml.a(dml.a($$0.d(), dml.a(-0.6666666666666666)).d(), dml.a(-0.3333333333333333)), dml.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static dmk b(ic<ebv.a> $$0) {
      dmk $$1 = dml.a($$0.b(dna.z));
      dmk $$2 = dml.a($$0.b(dna.A), 0.0, -0.1);
      return dml.d(dml.b($$2, dml.a($$1.d(), dml.a(-0.4))));
   }

   private static dmk d(ic<dmk> $$0, ic<ebv.a> $$1) {
      dmk $$2 = dml.d(dml.b($$1.b(dna.x), 2.0, 1.0));
      dmk $$3 = dml.a($$1.b(dna.y), -0.065, -0.088);
      dmk $$4 = dml.a($$2, $$1.b(dna.v), dml.z.a.a);
      dmk $$5 = dml.a($$2, $$1.b(dna.w), dml.z.a.a);
      dmk $$6 = dml.a(dml.d($$4, $$5), $$3).a(-1.0, 1.0);
      dmk $$7 = a($$0, N);
      dmk $$8 = dml.b($$1.b(dna.B), 0.75, 0.5);
      dmk $$9 = dml.a(dml.a($$8, dml.a(0.37)), dml.a(-10, 30, 0.3, 0.0));
      return dml.d(dml.c($$9, dml.a($$7, $$6)));
   }

   private static dmk e(ic<dmk> $$0, ic<ebv.a> $$1) {
      dmk $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      dmk $$6 = a($$2, dml.b($$1.b(dna.I), 1.0, 1.0), -60, 320, -1);
      dmk $$7 = a($$2, dml.a($$1.b(dna.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      dmk $$9 = a($$2, dml.b($$1.b(dna.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dmk $$10 = a($$2, dml.b($$1.b(dna.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      dmk $$11 = dml.b(dml.a(1.5), dml.d($$9.d(), $$10.d()));
      return dml.a($$6, -1000000.0, 0.0, dml.a(64.0), dml.a($$7, $$11));
   }

   private static dmk c(ic<ebv.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      dmk $$3 = dml.b($$0.b(dna.o), 25.0, 0.3);
      dmk $$4 = dml.a($$0.b(dna.p), 0.0, -2.0);
      dmk $$5 = dml.a($$0.b(dna.q), 0.0, 1.1);
      dmk $$6 = dml.a(dml.b($$3, dml.a(2.0)), $$4);
      return dml.d(dml.b($$6, $$5.f()));
   }

   private static dmk f(ic<dmk> $$0, ic<ebv.a> $$1) {
      dmk $$2 = dml.b($$1.b(dna.t), 2.0, 1.0);
      dmk $$3 = dml.a($$2, $$1.b(dna.r), dml.z.a.b);
      dmk $$4 = dml.a($$1.b(dna.s), 0.0, (double)Math.floorDiv(-64, 8), 8.0);
      dmk $$5 = a($$0, R);
      dmk $$6 = dml.a($$4, dml.a(-64, 320, 8.0, -40.0)).d();
      dmk $$7 = dml.a($$6, $$5).f();
      double $$8 = 0.083;
      dmk $$9 = dml.a($$3, dml.b(dml.a(0.083), $$5));
      return dml.d($$9, $$7).a(-1.0, 1.0);
   }

   private static dmk a(ic<dmk> $$0, ic<ebv.a> $$1, dmk $$2) {
      dmk $$3 = a($$0, S);
      dmk $$4 = a($$0, N);
      dmk $$5 = dml.a($$1.b(dna.C), 8.0);
      dmk $$6 = dml.b(dml.a(4.0), $$5.e());
      dmk $$7 = dml.a($$1.b(dna.D), 0.6666666666666666);
      dmk $$8 = dml.a(dml.a(dml.a(0.27), $$7).a(-1.0, 1.0), dml.a(dml.a(1.5), dml.b(dml.a(-0.64), $$2)).a(0.0, 0.5));
      dmk $$9 = dml.a($$6, $$8);
      dmk $$10 = dml.c(dml.c($$9, a($$0, O)), dml.a($$3, $$4));
      dmk $$11 = a($$0, Q);
      dmk $$12 = dml.a($$11, -1000000.0, 0.03, dml.a(-1000000.0), $$11);
      return dml.d($$10, $$12);
   }

   private static dmk b(dmk $$0) {
      dmk $$1 = dml.f($$0);
      return dml.b(dml.a($$1), dml.a(0.64)).i();
   }

   protected static dmx a(ic<dmk> $$0, ic<ebv.a> $$1, boolean $$2, boolean $$3) {
      dmk $$4 = dml.a($$1.b(dna.k), 0.5);
      dmk $$5 = dml.a($$1.b(dna.l), 0.67);
      dmk $$6 = dml.a($$1.b(dna.n), 0.7142857142857143);
      dmk $$7 = dml.a($$1.b(dna.m));
      dmk $$8 = a($$0, w);
      dmk $$9 = a($$0, x);
      dmk $$10 = dml.a($$8, $$9, 0.25, $$1.b($$2 ? dna.e : dna.a));
      dmk $$11 = dml.a($$8, $$9, 0.25, $$1.b($$2 ? dna.f : dna.b));
      dmk $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      dmk $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      dmk $$14 = b(dml.c($$12), $$13);
      dmk $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      dmk $$16 = dml.c($$15, dml.b(dml.a(5.0), a($$0, O)));
      dmk $$17 = dml.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      dmk $$18 = dml.c(b(a($$3, $$17)), a($$0, P));
      dmk $$19 = a($$0, v);
      int $$20 = Stream.of(dnb.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-dkr.e * 2);
      int $$21 = Stream.of(dnb.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-dkr.e * 2);
      dmk $$22 = a($$19, dml.b($$1.b(dna.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      dmk $$24 = a($$19, dml.b($$1.b(dna.F), 4.0, 4.0), $$20, $$21, 0).d();
      dmk $$25 = a($$19, dml.b($$1.b(dna.G), 4.0, 4.0), $$20, $$21, 0).d();
      dmk $$26 = dml.a(dml.a(-0.08F), dml.d($$24, $$25));
      dmk $$27 = dml.a($$1.b(dna.H));
      return new dmx(
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
         a($$3, dml.a($$14, dml.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static dmx b(ic<dmk> $$0, ic<ebv.a> $$1, dmk $$2) {
      dmk $$3 = a($$0, w);
      dmk $$4 = a($$0, x);
      dmk $$5 = dml.a($$3, $$4, 0.25, $$1.b(dna.a));
      dmk $$6 = dml.a($$3, $$4, 0.25, $$1.b(dna.b));
      dmk $$7 = b($$2);
      return new dmx(dml.a(), dml.a(), dml.a(), dml.a(), $$5, $$6, dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), $$7, dml.a(), dml.a(), dml.a());
   }

   private static dmk a(boolean $$0, dmk $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static dmk a(ic<dmk> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static dmk a(dmk $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static dmx a(ic<dmk> $$0, ic<ebv.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static dmx b(ic<dmk> $$0, ic<ebv.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static dmx c(ic<dmk> $$0, ic<ebv.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static dmk c(dmk $$0) {
      return a($$0, 0, 128);
   }

   protected static dmx a(ic<dmk> $$0) {
      dmk $$1 = dml.c(dml.a(0L));
      dmk $$2 = b(c(a($$0, M)));
      return new dmx(
         dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), $$1, dml.a(), dml.a(), c(dml.a($$1, dml.a(-0.703125))), $$2, dml.a(), dml.a(), dml.a()
      );
   }

   protected static dmx a() {
      return new dmx(dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), dml.a(), dml.a());
   }

   private static dmk a(dmk $$0, dmk $$1) {
      dmk $$2 = dml.a(dml.b(), $$1, $$0);
      return dml.b(dml.c($$2));
   }

   private static dmk b(dmk $$0, dmk $$1) {
      dmk $$2 = dml.b($$1, $$0);
      return dml.b(dml.a(4.0), $$2.h());
   }

   private static dmk a(dmk $$0, dmk $$1, int $$2, int $$3, int $$4) {
      return dml.a(dml.a($$0, (double)$$2, (double)($$3 + 1), $$1, dml.a((double)$$4)));
   }

   private static dmk a(dmk $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      dmk $$10 = dml.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      dmk $$9 = dml.a($$10, $$5, $$0);
      dmk $$11 = dml.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return dml.a($$11, $$8, $$9);
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
