import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dld extends dhr {
   public static final MapCodec<dld> c = b(dld::new);
   public static final int d = 15;
   public static final dwj e = dvz.aw;
   public static final dwa f = dnr.b;
   public static final dwa g = dnr.c;
   public static final dwa h = dnr.d;
   public static final dwa i = dnr.e;
   public static final dwa j = dnr.f;
   private static final Map<jm, dwa> k = dnr.h.entrySet().stream().filter($$0 -> $$0.getKey() != jm.a).collect(ae.a());
   private static final fah l = die.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fah m = die.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fah n = die.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fah o = die.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fah G = die.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dvj, fah> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<die> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<die> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dld> a() {
      return c;
   }

   public dld(dvi.d $$0) {
      super($$0, 1.0F);
      this.l(
         this.F
            .b()
            .b(e, Integer.valueOf(0))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
            .b(i, Boolean.valueOf(false))
            .b(j, Boolean.valueOf(false))
      );
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dld::o)));
   }

   private static fah o(dvj $$0) {
      fah $$1 = fae.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = fae.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = fae.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = fae.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = fae.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dig.a.m();
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dvj a(czs $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dvj b(deg $$0, jh $$1) {
      jh $$2 = $$1.e();
      dvj $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jm.b)) {
         dvj $$4 = this.m();

         for (jm $$5 : jm.values()) {
            dwa $$6 = k.get($$5);
            if ($$6 != null) {
               $$4 = $$4.b($$6, Boolean.valueOf(this.g($$0.a_($$1.a($$5)))));
            }
         }

         return $$4;
      } else {
         return this.m();
      }
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.ac().b(dex.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dvj $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ae() && this.a((dfb)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.b(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  jh $$8 = $$2.e();
                  if (!$$1.a_($$8).c($$1, $$8, jm.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(awz.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            jh.a $$11 = new jh.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dfe)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ae() || !this.a((dfb)$$1, $$11))) {
                              int $$18 = Math.min(15, $$6 + $$3.a(5) / 4);
                              $$1.a($$11, this.a($$1, $$11, $$18), 3);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   protected boolean a(dfb $$0, jh $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dvj $$0) {
      return $$0.b(dvz.C) && $$0.c(dvz.C) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dvj $$0) {
      return $$0.b(dvz.C) && $$0.c(dvz.C) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dfb $$0, jh $$1, int $$2, azs $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dvj $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         die $$8 = $$6.b();
         if ($$8 instanceof dqn) {
            dqn.a($$0, $$1);
         }
      }
   }

   private dvj a(dfc $$0, jh $$1, int $$2) {
      dvj $$3 = a($$0, $$1);
      return $$3.a(dig.cr) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(deg $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dfe $$0, jh $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jm $$3 : jm.values()) {
            dvj $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dvj $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azs $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(die $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dld $$0 = (dld)dig.cr;
      $$0.a(dig.n, 5, 20);
      $$0.a(dig.o, 5, 20);
      $$0.a(dig.p, 5, 20);
      $$0.a(dig.q, 5, 20);
      $$0.a(dig.r, 5, 20);
      $$0.a(dig.s, 5, 20);
      $$0.a(dig.t, 5, 20);
      $$0.a(dig.u, 5, 20);
      $$0.a(dig.v, 5, 20);
      $$0.a(dig.w, 5, 20);
      $$0.a(dig.jt, 5, 20);
      $$0.a(dig.ju, 5, 20);
      $$0.a(dig.jv, 5, 20);
      $$0.a(dig.jw, 5, 20);
      $$0.a(dig.jx, 5, 20);
      $$0.a(dig.jy, 5, 20);
      $$0.a(dig.jz, 5, 20);
      $$0.a(dig.jA, 5, 20);
      $$0.a(dig.jB, 5, 20);
      $$0.a(dig.jC, 5, 20);
      $$0.a(dig.fh, 5, 20);
      $$0.a(dig.jV, 5, 20);
      $$0.a(dig.jW, 5, 20);
      $$0.a(dig.jX, 5, 20);
      $$0.a(dig.jY, 5, 20);
      $$0.a(dig.jZ, 5, 20);
      $$0.a(dig.ka, 5, 20);
      $$0.a(dig.kb, 5, 20);
      $$0.a(dig.kc, 5, 20);
      $$0.a(dig.dU, 5, 20);
      $$0.a(dig.kd, 5, 20);
      $$0.a(dig.ke, 5, 20);
      $$0.a(dig.kf, 5, 20);
      $$0.a(dig.kg, 5, 20);
      $$0.a(dig.kh, 5, 20);
      $$0.a(dig.ki, 5, 20);
      $$0.a(dig.kj, 5, 20);
      $$0.a(dig.kk, 5, 20);
      $$0.a(dig.cu, 5, 20);
      $$0.a(dig.fL, 5, 20);
      $$0.a(dig.fK, 5, 20);
      $$0.a(dig.fM, 5, 20);
      $$0.a(dig.hP, 5, 20);
      $$0.a(dig.hQ, 5, 20);
      $$0.a(dig.hR, 5, 20);
      $$0.a(dig.hS, 5, 20);
      $$0.a(dig.hT, 5, 20);
      $$0.a(dig.hU, 5, 20);
      $$0.a(dig.U, 5, 5);
      $$0.a(dig.V, 5, 5);
      $$0.a(dig.W, 5, 5);
      $$0.a(dig.X, 5, 5);
      $$0.a(dig.Y, 5, 5);
      $$0.a(dig.Z, 5, 5);
      $$0.a(dig.aa, 5, 5);
      $$0.a(dig.ab, 5, 5);
      $$0.a(dig.ae, 5, 5);
      $$0.a(dig.al, 5, 5);
      $$0.a(dig.af, 5, 5);
      $$0.a(dig.ag, 5, 5);
      $$0.a(dig.ah, 5, 5);
      $$0.a(dig.ai, 5, 5);
      $$0.a(dig.aj, 5, 5);
      $$0.a(dig.ak, 5, 5);
      $$0.a(dig.am, 5, 5);
      $$0.a(dig.an, 5, 5);
      $$0.a(dig.aw, 5, 5);
      $$0.a(dig.ax, 5, 5);
      $$0.a(dig.ay, 5, 5);
      $$0.a(dig.az, 5, 5);
      $$0.a(dig.aA, 5, 5);
      $$0.a(dig.aB, 5, 5);
      $$0.a(dig.aC, 5, 5);
      $$0.a(dig.aD, 5, 5);
      $$0.a(dig.ao, 5, 5);
      $$0.a(dig.ap, 5, 5);
      $$0.a(dig.aq, 5, 5);
      $$0.a(dig.ar, 5, 5);
      $$0.a(dig.as, 5, 5);
      $$0.a(dig.at, 5, 5);
      $$0.a(dig.au, 5, 5);
      $$0.a(dig.av, 5, 5);
      $$0.a(dig.ac, 5, 20);
      $$0.a(dig.aE, 30, 60);
      $$0.a(dig.aF, 30, 60);
      $$0.a(dig.aG, 30, 60);
      $$0.a(dig.aH, 30, 60);
      $$0.a(dig.aI, 30, 60);
      $$0.a(dig.aJ, 30, 60);
      $$0.a(dig.aK, 30, 60);
      $$0.a(dig.aL, 30, 60);
      $$0.a(dig.cl, 30, 20);
      $$0.a(dig.ck, 15, 100);
      $$0.a(dig.bt, 60, 100);
      $$0.a(dig.bu, 60, 100);
      $$0.a(dig.bv, 60, 100);
      $$0.a(dig.iD, 60, 100);
      $$0.a(dig.iE, 60, 100);
      $$0.a(dig.iF, 60, 100);
      $$0.a(dig.iG, 60, 100);
      $$0.a(dig.iH, 60, 100);
      $$0.a(dig.iI, 60, 100);
      $$0.a(dig.bR, 60, 100);
      $$0.a(dig.bT, 60, 100);
      $$0.a(dig.bU, 60, 100);
      $$0.a(dig.bV, 60, 100);
      $$0.a(dig.bW, 60, 100);
      $$0.a(dig.bX, 60, 100);
      $$0.a(dig.bY, 60, 100);
      $$0.a(dig.bZ, 60, 100);
      $$0.a(dig.ca, 60, 100);
      $$0.a(dig.cb, 60, 100);
      $$0.a(dig.cc, 60, 100);
      $$0.a(dig.ce, 60, 100);
      $$0.a(dig.bS, 60, 100);
      $$0.a(dig.kC, 60, 100);
      $$0.a(dig.cd, 60, 100);
      $$0.a(dig.sB, 60, 100);
      $$0.a(dig.bA, 30, 60);
      $$0.a(dig.bB, 30, 60);
      $$0.a(dig.bC, 30, 60);
      $$0.a(dig.bD, 30, 60);
      $$0.a(dig.bE, 30, 60);
      $$0.a(dig.bF, 30, 60);
      $$0.a(dig.bG, 30, 60);
      $$0.a(dig.bH, 30, 60);
      $$0.a(dig.bI, 30, 60);
      $$0.a(dig.bJ, 30, 60);
      $$0.a(dig.bK, 30, 60);
      $$0.a(dig.bL, 30, 60);
      $$0.a(dig.bM, 30, 60);
      $$0.a(dig.bN, 30, 60);
      $$0.a(dig.bO, 30, 60);
      $$0.a(dig.bP, 30, 60);
      $$0.a(dig.ff, 15, 100);
      $$0.a(dig.iB, 5, 5);
      $$0.a(dig.ij, 60, 20);
      $$0.a(dig.pd, 15, 20);
      $$0.a(dig.ik, 60, 20);
      $$0.a(dig.il, 60, 20);
      $$0.a(dig.im, 60, 20);
      $$0.a(dig.in, 60, 20);
      $$0.a(dig.io, 60, 20);
      $$0.a(dig.ip, 60, 20);
      $$0.a(dig.iq, 60, 20);
      $$0.a(dig.ir, 60, 20);
      $$0.a(dig.is, 60, 20);
      $$0.a(dig.it, 60, 20);
      $$0.a(dig.iu, 60, 20);
      $$0.a(dig.iv, 60, 20);
      $$0.a(dig.iw, 60, 20);
      $$0.a(dig.ix, 60, 20);
      $$0.a(dig.iy, 60, 20);
      $$0.a(dig.iz, 60, 20);
      $$0.a(dig.me, 30, 60);
      $$0.a(dig.mZ, 60, 60);
      $$0.a(dig.nS, 60, 60);
      $$0.a(dig.oa, 30, 20);
      $$0.a(dig.pc, 5, 20);
      $$0.a(dig.oi, 60, 100);
      $$0.a(dig.pf, 5, 20);
      $$0.a(dig.pe, 30, 20);
      $$0.a(dig.aM, 30, 60);
      $$0.a(dig.aN, 30, 60);
      $$0.a(dig.sv, 15, 60);
      $$0.a(dig.sw, 15, 60);
      $$0.a(dig.sx, 60, 100);
      $$0.a(dig.sy, 30, 60);
      $$0.a(dig.sz, 30, 60);
      $$0.a(dig.sD, 60, 100);
      $$0.a(dig.sE, 60, 100);
      $$0.a(dig.sF, 60, 100);
      $$0.a(dig.sG, 30, 60);
      $$0.a(dig.fg, 15, 100);
   }
}
