import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dpo extends dlz {
   public static final MapCodec<dpo> b = b(dpo::new);
   public static final int c = 15;
   public static final ebo d = ebe.az;
   public static final ebf e = dsg.b;
   public static final ebf f = dsg.c;
   public static final ebf g = dsg.d;
   public static final ebf h = dsg.e;
   public static final ebf i = dsg.f;
   public static final Map<jb, ebf> D = dsg.h.entrySet().stream().filter($$0 -> $$0.getKey() != jb.a).collect(ag.a());
   private final Function<eao, ffr> R;
   private static final int S = 60;
   private static final int T = 30;
   private static final int U = 15;
   private static final int V = 5;
   private static final int W = 100;
   private static final int X = 60;
   private static final int Y = 20;
   private static final int Z = 5;
   private final Object2IntMap<dmm> aa = new Object2IntOpenHashMap();
   private final Object2IntMap<dmm> ab = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dpo> a() {
      return b;
   }

   public dpo(ean.d $$0) {
      super($$0, 1.0F);
      this.l(
         this.C
            .b()
            .b(d, Integer.valueOf(0))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
            .b(i, Boolean.valueOf(false))
      );
      this.R = this.q();
   }

   private Function<eao, ffr> q() {
      Map<jb, ffr> $$0 = ffo.d(dmm.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         ffr $$2 = ffo.a();

         for (Entry<jb, ebf> $$3 : D.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = ffo.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? a : $$2;
      }, new ebr[]{d});
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(d)) : dmo.a.m();
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.R.apply($$0);
   }

   @Override
   public eao a(ddd $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected eao b(din $$0, iv $$1) {
      iv $$2 = $$1.e();
      eao $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jb.b)) {
         eao $$4 = this.m();

         for (jb $$5 : jb.values()) {
            ebf $$6 = D.get($$5);
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
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jb.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().c(djd.b)) {
         if ($$1.O().c(djd.c) || $$1.g($$2)) {
            if (!$$0.a($$1, $$2)) {
               $$1.a($$2, false);
            }

            eao $$4 = $$1.a_($$2.e());
            boolean $$5 = $$4.a($$1.B_().q());
            int $$6 = $$0.c(d);
            if (!$$5 && $$1.ah() && this.a((djh)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
               $$1.a($$2, false);
            } else {
               int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
               if ($$6 != $$7) {
                  $$0 = $$0.b(d, Integer.valueOf($$7));
                  $$1.a($$2, $$0, 260);
               }

               if (!$$5) {
                  if (!this.d($$1, $$2)) {
                     iv $$8 = $$2.e();
                     if (!$$1.a_($$8).c($$1, $$8, jb.b) || $$6 > 3) {
                        $$1.a($$2, false);
                     }

                     return;
                  }

                  if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                     $$1.a($$2, false);
                     return;
                  }
               }

               boolean $$9 = $$1.u($$2).a(axb.ad);
               int $$10 = $$9 ? -50 : 0;
               this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
               this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
               this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
               this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
               this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
               this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
               iv.a $$11 = new iv.a();

               for (int $$12 = -1; $$12 <= 1; $$12++) {
                  for (int $$13 = -1; $$13 <= 1; $$13++) {
                     for (int $$14 = -1; $$14 <= 4; $$14++) {
                        if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                           int $$15 = 100;
                           if ($$14 > 1) {
                              $$15 += ($$14 - 1) * 100;
                           }

                           $$11.a($$2, $$12, $$14, $$13);
                           int $$16 = this.a((djk)$$1, $$11);
                           if ($$16 > 0) {
                              int $$17 = ($$16 + 40 + $$1.an().a() * 7) / ($$6 + 30);
                              if ($$9) {
                                 $$17 /= 2;
                              }

                              if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ah() || !this.a((djh)$$1, $$11))) {
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
   }

   protected boolean a(djh $$0, iv $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int o(eao $$0) {
      return $$0.b(ebe.I) && $$0.c(ebe.I) ? 0 : this.ab.getInt($$0.b());
   }

   private int q(eao $$0) {
      return $$0.b(ebe.I) && $$0.c(ebe.I) ? 0 : this.aa.getInt($$0.b());
   }

   private void a(djh $$0, iv $$1, int $$2, azv $$3, int $$4) {
      int $$5 = this.o($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         eao $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dmm $$8 = $$6.b();
         if ($$8 instanceof dvk) {
            dvk.a($$0, $$1);
         }
      }
   }

   private eao a(djk $$0, iv $$1, int $$2) {
      eao $$3 = a((din)$$0, $$1);
      return $$3.a(dmo.cB) ? $$3.b(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(din $$0, iv $$1) {
      for (jb $$2 : jb.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(djk $$0, iv $$1) {
      if (!$$0.v($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jb $$3 : jb.values()) {
            eao $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.q($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(eao $$0) {
      return this.q($$0) > 0;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azv $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   public void a(dmm $$0, int $$1, int $$2) {
      this.aa.put($$0, $$1);
      this.ab.put($$0, $$2);
   }

   public static void b() {
      dpo $$0 = (dpo)dmo.cB;
      $$0.a(dmo.n, 5, 20);
      $$0.a(dmo.o, 5, 20);
      $$0.a(dmo.p, 5, 20);
      $$0.a(dmo.q, 5, 20);
      $$0.a(dmo.r, 5, 20);
      $$0.a(dmo.s, 5, 20);
      $$0.a(dmo.t, 5, 20);
      $$0.a(dmo.v, 5, 20);
      $$0.a(dmo.w, 5, 20);
      $$0.a(dmo.x, 5, 20);
      $$0.a(dmo.y, 5, 20);
      $$0.a(dmo.jV, 5, 20);
      $$0.a(dmo.jW, 5, 20);
      $$0.a(dmo.jX, 5, 20);
      $$0.a(dmo.jY, 5, 20);
      $$0.a(dmo.jZ, 5, 20);
      $$0.a(dmo.ka, 5, 20);
      $$0.a(dmo.kb, 5, 20);
      $$0.a(dmo.kc, 5, 20);
      $$0.a(dmo.kd, 5, 20);
      $$0.a(dmo.ke, 5, 20);
      $$0.a(dmo.kf, 5, 20);
      $$0.a(dmo.fA, 5, 20);
      $$0.a(dmo.ky, 5, 20);
      $$0.a(dmo.kz, 5, 20);
      $$0.a(dmo.kA, 5, 20);
      $$0.a(dmo.kB, 5, 20);
      $$0.a(dmo.kC, 5, 20);
      $$0.a(dmo.kD, 5, 20);
      $$0.a(dmo.kE, 5, 20);
      $$0.a(dmo.kF, 5, 20);
      $$0.a(dmo.kG, 5, 20);
      $$0.a(dmo.el, 5, 20);
      $$0.a(dmo.kH, 5, 20);
      $$0.a(dmo.kI, 5, 20);
      $$0.a(dmo.kJ, 5, 20);
      $$0.a(dmo.kK, 5, 20);
      $$0.a(dmo.kL, 5, 20);
      $$0.a(dmo.kM, 5, 20);
      $$0.a(dmo.kN, 5, 20);
      $$0.a(dmo.kO, 5, 20);
      $$0.a(dmo.kP, 5, 20);
      $$0.a(dmo.cF, 5, 20);
      $$0.a(dmo.gk, 5, 20);
      $$0.a(dmo.gj, 5, 20);
      $$0.a(dmo.gl, 5, 20);
      $$0.a(dmo.iq, 5, 20);
      $$0.a(dmo.ir, 5, 20);
      $$0.a(dmo.is, 5, 20);
      $$0.a(dmo.it, 5, 20);
      $$0.a(dmo.iu, 5, 20);
      $$0.a(dmo.iv, 5, 20);
      $$0.a(dmo.iw, 5, 20);
      $$0.a(dmo.X, 5, 5);
      $$0.a(dmo.Y, 5, 5);
      $$0.a(dmo.Z, 5, 5);
      $$0.a(dmo.aa, 5, 5);
      $$0.a(dmo.ab, 5, 5);
      $$0.a(dmo.ac, 5, 5);
      $$0.a(dmo.ae, 5, 5);
      $$0.a(dmo.ad, 5, 5);
      $$0.a(dmo.af, 5, 5);
      $$0.a(dmo.ai, 5, 5);
      $$0.a(dmo.aq, 5, 5);
      $$0.a(dmo.aj, 5, 5);
      $$0.a(dmo.ak, 5, 5);
      $$0.a(dmo.al, 5, 5);
      $$0.a(dmo.am, 5, 5);
      $$0.a(dmo.an, 5, 5);
      $$0.a(dmo.ao, 5, 5);
      $$0.a(dmo.ap, 5, 5);
      $$0.a(dmo.ar, 5, 5);
      $$0.a(dmo.as, 5, 5);
      $$0.a(dmo.aB, 5, 5);
      $$0.a(dmo.aC, 5, 5);
      $$0.a(dmo.aD, 5, 5);
      $$0.a(dmo.aE, 5, 5);
      $$0.a(dmo.aF, 5, 5);
      $$0.a(dmo.aG, 5, 5);
      $$0.a(dmo.aH, 5, 5);
      $$0.a(dmo.aI, 5, 5);
      $$0.a(dmo.aJ, 5, 5);
      $$0.a(dmo.at, 5, 5);
      $$0.a(dmo.au, 5, 5);
      $$0.a(dmo.av, 5, 5);
      $$0.a(dmo.aw, 5, 5);
      $$0.a(dmo.ax, 5, 5);
      $$0.a(dmo.ay, 5, 5);
      $$0.a(dmo.u, 5, 5);
      $$0.a(dmo.az, 5, 5);
      $$0.a(dmo.aA, 5, 5);
      $$0.a(dmo.ag, 5, 20);
      $$0.a(dmo.aK, 30, 60);
      $$0.a(dmo.aL, 30, 60);
      $$0.a(dmo.aM, 30, 60);
      $$0.a(dmo.aN, 30, 60);
      $$0.a(dmo.aO, 30, 60);
      $$0.a(dmo.aP, 30, 60);
      $$0.a(dmo.aQ, 30, 60);
      $$0.a(dmo.aR, 30, 60);
      $$0.a(dmo.aS, 30, 60);
      $$0.a(dmo.cv, 30, 20);
      $$0.a(dmo.cu, 15, 100);
      $$0.a(dmo.bA, 60, 100);
      $$0.a(dmo.bB, 60, 100);
      $$0.a(dmo.bC, 60, 100);
      $$0.a(dmo.bE, 60, 100);
      $$0.a(dmo.bF, 60, 100);
      $$0.a(dmo.jf, 60, 100);
      $$0.a(dmo.jg, 60, 100);
      $$0.a(dmo.jh, 60, 100);
      $$0.a(dmo.ji, 60, 100);
      $$0.a(dmo.jj, 60, 100);
      $$0.a(dmo.jk, 60, 100);
      $$0.a(dmo.cb, 60, 100);
      $$0.a(dmo.cd, 60, 100);
      $$0.a(dmo.uh, 60, 100);
      $$0.a(dmo.ui, 60, 100);
      $$0.a(dmo.ce, 60, 100);
      $$0.a(dmo.cf, 60, 100);
      $$0.a(dmo.cg, 60, 100);
      $$0.a(dmo.ch, 60, 100);
      $$0.a(dmo.ci, 60, 100);
      $$0.a(dmo.cj, 60, 100);
      $$0.a(dmo.ck, 60, 100);
      $$0.a(dmo.cl, 60, 100);
      $$0.a(dmo.cm, 60, 100);
      $$0.a(dmo.co, 60, 100);
      $$0.a(dmo.cc, 60, 100);
      $$0.a(dmo.li, 60, 100);
      $$0.a(dmo.cn, 60, 100);
      $$0.a(dmo.tj, 60, 100);
      $$0.a(dmo.tk, 60, 100);
      $$0.a(dmo.tl, 60, 100);
      $$0.a(dmo.eh, 60, 100);
      $$0.a(dmo.bK, 30, 60);
      $$0.a(dmo.bL, 30, 60);
      $$0.a(dmo.bM, 30, 60);
      $$0.a(dmo.bN, 30, 60);
      $$0.a(dmo.bO, 30, 60);
      $$0.a(dmo.bP, 30, 60);
      $$0.a(dmo.bQ, 30, 60);
      $$0.a(dmo.bR, 30, 60);
      $$0.a(dmo.bS, 30, 60);
      $$0.a(dmo.bT, 30, 60);
      $$0.a(dmo.bU, 30, 60);
      $$0.a(dmo.bV, 30, 60);
      $$0.a(dmo.bW, 30, 60);
      $$0.a(dmo.bX, 30, 60);
      $$0.a(dmo.bY, 30, 60);
      $$0.a(dmo.bZ, 30, 60);
      $$0.a(dmo.fx, 15, 100);
      $$0.a(dmo.jd, 5, 5);
      $$0.a(dmo.iL, 60, 20);
      $$0.a(dmo.pL, 15, 20);
      $$0.a(dmo.iM, 60, 20);
      $$0.a(dmo.iN, 60, 20);
      $$0.a(dmo.iO, 60, 20);
      $$0.a(dmo.iP, 60, 20);
      $$0.a(dmo.iQ, 60, 20);
      $$0.a(dmo.iR, 60, 20);
      $$0.a(dmo.iS, 60, 20);
      $$0.a(dmo.iT, 60, 20);
      $$0.a(dmo.iU, 60, 20);
      $$0.a(dmo.iV, 60, 20);
      $$0.a(dmo.iW, 60, 20);
      $$0.a(dmo.iX, 60, 20);
      $$0.a(dmo.iY, 60, 20);
      $$0.a(dmo.iZ, 60, 20);
      $$0.a(dmo.ja, 60, 20);
      $$0.a(dmo.jb, 60, 20);
      $$0.a(dmo.ue, 5, 100);
      $$0.a(dmo.uf, 5, 100);
      $$0.a(dmo.ug, 5, 100);
      $$0.a(dmo.mK, 30, 60);
      $$0.a(dmo.nF, 60, 60);
      $$0.a(dmo.oy, 60, 60);
      $$0.a(dmo.oG, 30, 20);
      $$0.a(dmo.pK, 5, 20);
      $$0.a(dmo.oO, 60, 100);
      $$0.a(dmo.pN, 5, 20);
      $$0.a(dmo.pM, 30, 20);
      $$0.a(dmo.aT, 30, 60);
      $$0.a(dmo.aU, 30, 60);
      $$0.a(dmo.td, 15, 60);
      $$0.a(dmo.te, 15, 60);
      $$0.a(dmo.tf, 60, 100);
      $$0.a(dmo.tg, 30, 60);
      $$0.a(dmo.th, 30, 60);
      $$0.a(dmo.tn, 60, 100);
      $$0.a(dmo.to, 60, 100);
      $$0.a(dmo.tp, 60, 100);
      $$0.a(dmo.tq, 30, 60);
      $$0.a(dmo.fy, 15, 100);
      $$0.a(dmo.ul, 60, 100);
      $$0.a(dmo.bD, 60, 100);
   }
}
