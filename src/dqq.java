import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dqq extends dnb {
   public static final MapCodec<dqq> b = b(dqq::new);
   public static final int c = 15;
   public static final ecq d = ecg.az;
   public static final ech e = dti.b;
   public static final ech f = dti.c;
   public static final ech g = dti.d;
   public static final ech h = dti.e;
   public static final ech i = dti.f;
   public static final Map<jc, ech> D = dti.h.entrySet().stream().filter($$0 -> $$0.getKey() != jc.a).collect(ag.a());
   private final Function<ebq, fgw> R;
   private static final int S = 60;
   private static final int T = 30;
   private static final int U = 15;
   private static final int V = 5;
   private static final int W = 100;
   private static final int X = 60;
   private static final int Y = 20;
   private static final int Z = 5;
   private final Object2IntMap<dno> aa = new Object2IntOpenHashMap();
   private final Object2IntMap<dno> ab = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dqq> a() {
      return b;
   }

   public dqq(ebp.d $$0) {
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

   private Function<ebq, fgw> q() {
      Map<jc, fgw> $$0 = fgt.d(dno.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fgw $$2 = fgt.a();

         for (Entry<jc, ech> $$3 : D.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fgt.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? a : $$2;
      }, new ect[]{d});
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(d)) : dnq.a.m();
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.R.apply($$0);
   }

   @Override
   public ebq a(ded $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected ebq b(djn $$0, iw $$1) {
      iw $$2 = $$1.e();
      ebq $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jc.b)) {
         ebq $$4 = this.m();

         for (jc $$5 : jc.values()) {
            ech $$6 = D.get($$5);
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
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jc.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().c(dkf.b)) {
         if ($$1.O().c(dkf.c) || $$1.g($$2)) {
            if (!$$0.a($$1, $$2)) {
               $$1.a($$2, false);
            }

            ebq $$4 = $$1.a_($$2.e());
            boolean $$5 = $$4.a($$1.F_().q());
            int $$6 = $$0.c(d);
            if (!$$5 && $$1.ah() && this.a((dkj)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
               $$1.a($$2, false);
            } else {
               int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
               if ($$6 != $$7) {
                  $$0 = $$0.b(d, Integer.valueOf($$7));
                  $$1.a($$2, $$0, 260);
               }

               if (!$$5) {
                  if (!this.d($$1, $$2)) {
                     iw $$8 = $$2.e();
                     if (!$$1.a_($$8).c($$1, $$8, jc.b) || $$6 > 3) {
                        $$1.a($$2, false);
                     }

                     return;
                  }

                  if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                     $$1.a($$2, false);
                     return;
                  }
               }

               boolean $$9 = $$1.u($$2).a(axm.ad);
               int $$10 = $$9 ? -50 : 0;
               this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
               this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
               this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
               this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
               this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
               this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
               iw.a $$11 = new iw.a();

               for (int $$12 = -1; $$12 <= 1; $$12++) {
                  for (int $$13 = -1; $$13 <= 1; $$13++) {
                     for (int $$14 = -1; $$14 <= 4; $$14++) {
                        if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                           int $$15 = 100;
                           if ($$14 > 1) {
                              $$15 += ($$14 - 1) * 100;
                           }

                           $$11.a($$2, $$12, $$14, $$13);
                           int $$16 = this.a((dkm)$$1, $$11);
                           if ($$16 > 0) {
                              int $$17 = ($$16 + 40 + $$1.an().a() * 7) / ($$6 + 30);
                              if ($$9) {
                                 $$17 /= 2;
                              }

                              if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ah() || !this.a((dkj)$$1, $$11))) {
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

   protected boolean a(dkj $$0, iw $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int o(ebq $$0) {
      return $$0.b(ecg.I) && $$0.c(ecg.I) ? 0 : this.ab.getInt($$0.b());
   }

   private int q(ebq $$0) {
      return $$0.b(ecg.I) && $$0.c(ecg.I) ? 0 : this.aa.getInt($$0.b());
   }

   private void a(dkj $$0, iw $$1, int $$2, bai $$3, int $$4) {
      int $$5 = this.o($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         ebq $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dno $$8 = $$6.b();
         if ($$8 instanceof dwm) {
            dwm.a($$0, $$1);
         }
      }
   }

   private ebq a(dkm $$0, iw $$1, int $$2) {
      ebq $$3 = a((djn)$$0, $$1);
      return $$3.a(dnq.cB) ? $$3.b(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(djn $$0, iw $$1) {
      for (jc $$2 : jc.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dkm $$0, iw $$1) {
      if (!$$0.v($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jc $$3 : jc.values()) {
            ebq $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.q($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(ebq $$0) {
      return this.q($$0) > 0;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(bai $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   public void a(dno $$0, int $$1, int $$2) {
      this.aa.put($$0, $$1);
      this.ab.put($$0, $$2);
   }

   public static void b() {
      dqq $$0 = (dqq)dnq.cB;
      $$0.a(dnq.n, 5, 20);
      $$0.a(dnq.o, 5, 20);
      $$0.a(dnq.p, 5, 20);
      $$0.a(dnq.q, 5, 20);
      $$0.a(dnq.r, 5, 20);
      $$0.a(dnq.s, 5, 20);
      $$0.a(dnq.t, 5, 20);
      $$0.a(dnq.v, 5, 20);
      $$0.a(dnq.w, 5, 20);
      $$0.a(dnq.x, 5, 20);
      $$0.a(dnq.y, 5, 20);
      $$0.a(dnq.jV, 5, 20);
      $$0.a(dnq.jW, 5, 20);
      $$0.a(dnq.jX, 5, 20);
      $$0.a(dnq.jY, 5, 20);
      $$0.a(dnq.jZ, 5, 20);
      $$0.a(dnq.ka, 5, 20);
      $$0.a(dnq.kb, 5, 20);
      $$0.a(dnq.kc, 5, 20);
      $$0.a(dnq.kd, 5, 20);
      $$0.a(dnq.ke, 5, 20);
      $$0.a(dnq.kf, 5, 20);
      $$0.a(dnq.fA, 5, 20);
      $$0.a(dnq.ky, 5, 20);
      $$0.a(dnq.kz, 5, 20);
      $$0.a(dnq.kA, 5, 20);
      $$0.a(dnq.kB, 5, 20);
      $$0.a(dnq.kC, 5, 20);
      $$0.a(dnq.kD, 5, 20);
      $$0.a(dnq.kE, 5, 20);
      $$0.a(dnq.kF, 5, 20);
      $$0.a(dnq.kG, 5, 20);
      $$0.a(dnq.el, 5, 20);
      $$0.a(dnq.kH, 5, 20);
      $$0.a(dnq.kI, 5, 20);
      $$0.a(dnq.kJ, 5, 20);
      $$0.a(dnq.kK, 5, 20);
      $$0.a(dnq.kL, 5, 20);
      $$0.a(dnq.kM, 5, 20);
      $$0.a(dnq.kN, 5, 20);
      $$0.a(dnq.kO, 5, 20);
      $$0.a(dnq.kP, 5, 20);
      $$0.a(dnq.cF, 5, 20);
      $$0.a(dnq.gk, 5, 20);
      $$0.a(dnq.gj, 5, 20);
      $$0.a(dnq.gl, 5, 20);
      $$0.a(dnq.iq, 5, 20);
      $$0.a(dnq.ir, 5, 20);
      $$0.a(dnq.is, 5, 20);
      $$0.a(dnq.it, 5, 20);
      $$0.a(dnq.iu, 5, 20);
      $$0.a(dnq.iv, 5, 20);
      $$0.a(dnq.iw, 5, 20);
      $$0.a(dnq.X, 5, 5);
      $$0.a(dnq.Y, 5, 5);
      $$0.a(dnq.Z, 5, 5);
      $$0.a(dnq.aa, 5, 5);
      $$0.a(dnq.ab, 5, 5);
      $$0.a(dnq.ac, 5, 5);
      $$0.a(dnq.ae, 5, 5);
      $$0.a(dnq.ad, 5, 5);
      $$0.a(dnq.af, 5, 5);
      $$0.a(dnq.ai, 5, 5);
      $$0.a(dnq.aq, 5, 5);
      $$0.a(dnq.aj, 5, 5);
      $$0.a(dnq.ak, 5, 5);
      $$0.a(dnq.al, 5, 5);
      $$0.a(dnq.am, 5, 5);
      $$0.a(dnq.an, 5, 5);
      $$0.a(dnq.ao, 5, 5);
      $$0.a(dnq.ap, 5, 5);
      $$0.a(dnq.ar, 5, 5);
      $$0.a(dnq.as, 5, 5);
      $$0.a(dnq.aB, 5, 5);
      $$0.a(dnq.aC, 5, 5);
      $$0.a(dnq.aD, 5, 5);
      $$0.a(dnq.aE, 5, 5);
      $$0.a(dnq.aF, 5, 5);
      $$0.a(dnq.aG, 5, 5);
      $$0.a(dnq.aH, 5, 5);
      $$0.a(dnq.aI, 5, 5);
      $$0.a(dnq.aJ, 5, 5);
      $$0.a(dnq.at, 5, 5);
      $$0.a(dnq.au, 5, 5);
      $$0.a(dnq.av, 5, 5);
      $$0.a(dnq.aw, 5, 5);
      $$0.a(dnq.ax, 5, 5);
      $$0.a(dnq.ay, 5, 5);
      $$0.a(dnq.u, 5, 5);
      $$0.a(dnq.az, 5, 5);
      $$0.a(dnq.aA, 5, 5);
      $$0.a(dnq.ag, 5, 20);
      $$0.a(dnq.aK, 30, 60);
      $$0.a(dnq.aL, 30, 60);
      $$0.a(dnq.aM, 30, 60);
      $$0.a(dnq.aN, 30, 60);
      $$0.a(dnq.aO, 30, 60);
      $$0.a(dnq.aP, 30, 60);
      $$0.a(dnq.aQ, 30, 60);
      $$0.a(dnq.aR, 30, 60);
      $$0.a(dnq.aS, 30, 60);
      $$0.a(dnq.cv, 30, 20);
      $$0.a(dnq.cu, 15, 100);
      $$0.a(dnq.bA, 60, 100);
      $$0.a(dnq.bB, 60, 100);
      $$0.a(dnq.bC, 60, 100);
      $$0.a(dnq.bE, 60, 100);
      $$0.a(dnq.bF, 60, 100);
      $$0.a(dnq.jf, 60, 100);
      $$0.a(dnq.jg, 60, 100);
      $$0.a(dnq.jh, 60, 100);
      $$0.a(dnq.ji, 60, 100);
      $$0.a(dnq.jj, 60, 100);
      $$0.a(dnq.jk, 60, 100);
      $$0.a(dnq.cb, 60, 100);
      $$0.a(dnq.cd, 60, 100);
      $$0.a(dnq.uh, 60, 100);
      $$0.a(dnq.ui, 60, 100);
      $$0.a(dnq.ce, 60, 100);
      $$0.a(dnq.cf, 60, 100);
      $$0.a(dnq.cg, 60, 100);
      $$0.a(dnq.ch, 60, 100);
      $$0.a(dnq.ci, 60, 100);
      $$0.a(dnq.cj, 60, 100);
      $$0.a(dnq.ck, 60, 100);
      $$0.a(dnq.cl, 60, 100);
      $$0.a(dnq.cm, 60, 100);
      $$0.a(dnq.co, 60, 100);
      $$0.a(dnq.cc, 60, 100);
      $$0.a(dnq.li, 60, 100);
      $$0.a(dnq.cn, 60, 100);
      $$0.a(dnq.tj, 60, 100);
      $$0.a(dnq.tk, 60, 100);
      $$0.a(dnq.tl, 60, 100);
      $$0.a(dnq.eh, 60, 100);
      $$0.a(dnq.bK, 30, 60);
      $$0.a(dnq.bL, 30, 60);
      $$0.a(dnq.bM, 30, 60);
      $$0.a(dnq.bN, 30, 60);
      $$0.a(dnq.bO, 30, 60);
      $$0.a(dnq.bP, 30, 60);
      $$0.a(dnq.bQ, 30, 60);
      $$0.a(dnq.bR, 30, 60);
      $$0.a(dnq.bS, 30, 60);
      $$0.a(dnq.bT, 30, 60);
      $$0.a(dnq.bU, 30, 60);
      $$0.a(dnq.bV, 30, 60);
      $$0.a(dnq.bW, 30, 60);
      $$0.a(dnq.bX, 30, 60);
      $$0.a(dnq.bY, 30, 60);
      $$0.a(dnq.bZ, 30, 60);
      $$0.a(dnq.fx, 15, 100);
      $$0.a(dnq.jd, 5, 5);
      $$0.a(dnq.iL, 60, 20);
      $$0.a(dnq.pL, 15, 20);
      $$0.a(dnq.iM, 60, 20);
      $$0.a(dnq.iN, 60, 20);
      $$0.a(dnq.iO, 60, 20);
      $$0.a(dnq.iP, 60, 20);
      $$0.a(dnq.iQ, 60, 20);
      $$0.a(dnq.iR, 60, 20);
      $$0.a(dnq.iS, 60, 20);
      $$0.a(dnq.iT, 60, 20);
      $$0.a(dnq.iU, 60, 20);
      $$0.a(dnq.iV, 60, 20);
      $$0.a(dnq.iW, 60, 20);
      $$0.a(dnq.iX, 60, 20);
      $$0.a(dnq.iY, 60, 20);
      $$0.a(dnq.iZ, 60, 20);
      $$0.a(dnq.ja, 60, 20);
      $$0.a(dnq.jb, 60, 20);
      $$0.a(dnq.ue, 5, 100);
      $$0.a(dnq.uf, 5, 100);
      $$0.a(dnq.ug, 5, 100);
      $$0.a(dnq.mK, 30, 60);
      $$0.a(dnq.nF, 60, 60);
      $$0.a(dnq.oy, 60, 60);
      $$0.a(dnq.oG, 30, 20);
      $$0.a(dnq.pK, 5, 20);
      $$0.a(dnq.oO, 60, 100);
      $$0.a(dnq.pN, 5, 20);
      $$0.a(dnq.pM, 30, 20);
      $$0.a(dnq.aT, 30, 60);
      $$0.a(dnq.aU, 30, 60);
      $$0.a(dnq.td, 15, 60);
      $$0.a(dnq.te, 15, 60);
      $$0.a(dnq.tf, 60, 100);
      $$0.a(dnq.tg, 30, 60);
      $$0.a(dnq.th, 30, 60);
      $$0.a(dnq.tn, 60, 100);
      $$0.a(dnq.to, 60, 100);
      $$0.a(dnq.tp, 60, 100);
      $$0.a(dnq.tq, 30, 60);
      $$0.a(dnq.fy, 15, 100);
      $$0.a(dnq.ul, 60, 100);
      $$0.a(dnq.bD, 60, 100);
   }
}
