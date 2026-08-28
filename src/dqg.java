import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dqg extends dmr {
   public static final MapCodec<dqg> b = b(dqg::new);
   public static final int c = 15;
   public static final ecg d = ebw.az;
   public static final ebx e = dsy.b;
   public static final ebx f = dsy.c;
   public static final ebx g = dsy.d;
   public static final ebx h = dsy.e;
   public static final ebx i = dsy.f;
   public static final Map<jc, ebx> D = dsy.h.entrySet().stream().filter($$0 -> $$0.getKey() != jc.a).collect(ag.a());
   private final Function<ebg, fgm> R;
   private static final int S = 60;
   private static final int T = 30;
   private static final int U = 15;
   private static final int V = 5;
   private static final int W = 100;
   private static final int X = 60;
   private static final int Y = 20;
   private static final int Z = 5;
   private final Object2IntMap<dne> aa = new Object2IntOpenHashMap();
   private final Object2IntMap<dne> ab = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dqg> a() {
      return b;
   }

   public dqg(ebf.d $$0) {
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

   private Function<ebg, fgm> q() {
      Map<jc, fgm> $$0 = fgj.d(dne.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fgm $$2 = fgj.a();

         for (Entry<jc, ebx> $$3 : D.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fgj.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? a : $$2;
      }, new ecj[]{d});
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(d)) : dng.a.m();
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.R.apply($$0);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected ebg b(djd $$0, iw $$1) {
      iw $$2 = $$1.e();
      ebg $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jc.b)) {
         ebg $$4 = this.m();

         for (jc $$5 : jc.values()) {
            ebx $$6 = D.get($$5);
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
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jc.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().c(djv.b)) {
         if ($$1.O().c(djv.c) || $$1.g($$2)) {
            if (!$$0.a($$1, $$2)) {
               $$1.a($$2, false);
            }

            ebg $$4 = $$1.a_($$2.e());
            boolean $$5 = $$4.a($$1.F_().q());
            int $$6 = $$0.c(d);
            if (!$$5 && $$1.ah() && this.a((djz)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

               boolean $$9 = $$1.u($$2).a(axf.ad);
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
                           int $$16 = this.a((dkc)$$1, $$11);
                           if ($$16 > 0) {
                              int $$17 = ($$16 + 40 + $$1.an().a() * 7) / ($$6 + 30);
                              if ($$9) {
                                 $$17 /= 2;
                              }

                              if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ah() || !this.a((djz)$$1, $$11))) {
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

   protected boolean a(djz $$0, iw $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int o(ebg $$0) {
      return $$0.b(ebw.I) && $$0.c(ebw.I) ? 0 : this.ab.getInt($$0.b());
   }

   private int q(ebg $$0) {
      return $$0.b(ebw.I) && $$0.c(ebw.I) ? 0 : this.aa.getInt($$0.b());
   }

   private void a(djz $$0, iw $$1, int $$2, azz $$3, int $$4) {
      int $$5 = this.o($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         ebg $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dne $$8 = $$6.b();
         if ($$8 instanceof dwc) {
            dwc.a($$0, $$1);
         }
      }
   }

   private ebg a(dkc $$0, iw $$1, int $$2) {
      ebg $$3 = a((djd)$$0, $$1);
      return $$3.a(dng.cB) ? $$3.b(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(djd $$0, iw $$1) {
      for (jc $$2 : jc.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dkc $$0, iw $$1) {
      if (!$$0.v($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jc $$3 : jc.values()) {
            ebg $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.q($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(ebg $$0) {
      return this.q($$0) > 0;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azz $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   public void a(dne $$0, int $$1, int $$2) {
      this.aa.put($$0, $$1);
      this.ab.put($$0, $$2);
   }

   public static void b() {
      dqg $$0 = (dqg)dng.cB;
      $$0.a(dng.n, 5, 20);
      $$0.a(dng.o, 5, 20);
      $$0.a(dng.p, 5, 20);
      $$0.a(dng.q, 5, 20);
      $$0.a(dng.r, 5, 20);
      $$0.a(dng.s, 5, 20);
      $$0.a(dng.t, 5, 20);
      $$0.a(dng.v, 5, 20);
      $$0.a(dng.w, 5, 20);
      $$0.a(dng.x, 5, 20);
      $$0.a(dng.y, 5, 20);
      $$0.a(dng.jV, 5, 20);
      $$0.a(dng.jW, 5, 20);
      $$0.a(dng.jX, 5, 20);
      $$0.a(dng.jY, 5, 20);
      $$0.a(dng.jZ, 5, 20);
      $$0.a(dng.ka, 5, 20);
      $$0.a(dng.kb, 5, 20);
      $$0.a(dng.kc, 5, 20);
      $$0.a(dng.kd, 5, 20);
      $$0.a(dng.ke, 5, 20);
      $$0.a(dng.kf, 5, 20);
      $$0.a(dng.fA, 5, 20);
      $$0.a(dng.ky, 5, 20);
      $$0.a(dng.kz, 5, 20);
      $$0.a(dng.kA, 5, 20);
      $$0.a(dng.kB, 5, 20);
      $$0.a(dng.kC, 5, 20);
      $$0.a(dng.kD, 5, 20);
      $$0.a(dng.kE, 5, 20);
      $$0.a(dng.kF, 5, 20);
      $$0.a(dng.kG, 5, 20);
      $$0.a(dng.el, 5, 20);
      $$0.a(dng.kH, 5, 20);
      $$0.a(dng.kI, 5, 20);
      $$0.a(dng.kJ, 5, 20);
      $$0.a(dng.kK, 5, 20);
      $$0.a(dng.kL, 5, 20);
      $$0.a(dng.kM, 5, 20);
      $$0.a(dng.kN, 5, 20);
      $$0.a(dng.kO, 5, 20);
      $$0.a(dng.kP, 5, 20);
      $$0.a(dng.cF, 5, 20);
      $$0.a(dng.gk, 5, 20);
      $$0.a(dng.gj, 5, 20);
      $$0.a(dng.gl, 5, 20);
      $$0.a(dng.iq, 5, 20);
      $$0.a(dng.ir, 5, 20);
      $$0.a(dng.is, 5, 20);
      $$0.a(dng.it, 5, 20);
      $$0.a(dng.iu, 5, 20);
      $$0.a(dng.iv, 5, 20);
      $$0.a(dng.iw, 5, 20);
      $$0.a(dng.X, 5, 5);
      $$0.a(dng.Y, 5, 5);
      $$0.a(dng.Z, 5, 5);
      $$0.a(dng.aa, 5, 5);
      $$0.a(dng.ab, 5, 5);
      $$0.a(dng.ac, 5, 5);
      $$0.a(dng.ae, 5, 5);
      $$0.a(dng.ad, 5, 5);
      $$0.a(dng.af, 5, 5);
      $$0.a(dng.ai, 5, 5);
      $$0.a(dng.aq, 5, 5);
      $$0.a(dng.aj, 5, 5);
      $$0.a(dng.ak, 5, 5);
      $$0.a(dng.al, 5, 5);
      $$0.a(dng.am, 5, 5);
      $$0.a(dng.an, 5, 5);
      $$0.a(dng.ao, 5, 5);
      $$0.a(dng.ap, 5, 5);
      $$0.a(dng.ar, 5, 5);
      $$0.a(dng.as, 5, 5);
      $$0.a(dng.aB, 5, 5);
      $$0.a(dng.aC, 5, 5);
      $$0.a(dng.aD, 5, 5);
      $$0.a(dng.aE, 5, 5);
      $$0.a(dng.aF, 5, 5);
      $$0.a(dng.aG, 5, 5);
      $$0.a(dng.aH, 5, 5);
      $$0.a(dng.aI, 5, 5);
      $$0.a(dng.aJ, 5, 5);
      $$0.a(dng.at, 5, 5);
      $$0.a(dng.au, 5, 5);
      $$0.a(dng.av, 5, 5);
      $$0.a(dng.aw, 5, 5);
      $$0.a(dng.ax, 5, 5);
      $$0.a(dng.ay, 5, 5);
      $$0.a(dng.u, 5, 5);
      $$0.a(dng.az, 5, 5);
      $$0.a(dng.aA, 5, 5);
      $$0.a(dng.ag, 5, 20);
      $$0.a(dng.aK, 30, 60);
      $$0.a(dng.aL, 30, 60);
      $$0.a(dng.aM, 30, 60);
      $$0.a(dng.aN, 30, 60);
      $$0.a(dng.aO, 30, 60);
      $$0.a(dng.aP, 30, 60);
      $$0.a(dng.aQ, 30, 60);
      $$0.a(dng.aR, 30, 60);
      $$0.a(dng.aS, 30, 60);
      $$0.a(dng.cv, 30, 20);
      $$0.a(dng.cu, 15, 100);
      $$0.a(dng.bA, 60, 100);
      $$0.a(dng.bB, 60, 100);
      $$0.a(dng.bC, 60, 100);
      $$0.a(dng.bE, 60, 100);
      $$0.a(dng.bF, 60, 100);
      $$0.a(dng.jf, 60, 100);
      $$0.a(dng.jg, 60, 100);
      $$0.a(dng.jh, 60, 100);
      $$0.a(dng.ji, 60, 100);
      $$0.a(dng.jj, 60, 100);
      $$0.a(dng.jk, 60, 100);
      $$0.a(dng.cb, 60, 100);
      $$0.a(dng.cd, 60, 100);
      $$0.a(dng.uh, 60, 100);
      $$0.a(dng.ui, 60, 100);
      $$0.a(dng.ce, 60, 100);
      $$0.a(dng.cf, 60, 100);
      $$0.a(dng.cg, 60, 100);
      $$0.a(dng.ch, 60, 100);
      $$0.a(dng.ci, 60, 100);
      $$0.a(dng.cj, 60, 100);
      $$0.a(dng.ck, 60, 100);
      $$0.a(dng.cl, 60, 100);
      $$0.a(dng.cm, 60, 100);
      $$0.a(dng.co, 60, 100);
      $$0.a(dng.cc, 60, 100);
      $$0.a(dng.li, 60, 100);
      $$0.a(dng.cn, 60, 100);
      $$0.a(dng.tj, 60, 100);
      $$0.a(dng.tk, 60, 100);
      $$0.a(dng.tl, 60, 100);
      $$0.a(dng.eh, 60, 100);
      $$0.a(dng.bK, 30, 60);
      $$0.a(dng.bL, 30, 60);
      $$0.a(dng.bM, 30, 60);
      $$0.a(dng.bN, 30, 60);
      $$0.a(dng.bO, 30, 60);
      $$0.a(dng.bP, 30, 60);
      $$0.a(dng.bQ, 30, 60);
      $$0.a(dng.bR, 30, 60);
      $$0.a(dng.bS, 30, 60);
      $$0.a(dng.bT, 30, 60);
      $$0.a(dng.bU, 30, 60);
      $$0.a(dng.bV, 30, 60);
      $$0.a(dng.bW, 30, 60);
      $$0.a(dng.bX, 30, 60);
      $$0.a(dng.bY, 30, 60);
      $$0.a(dng.bZ, 30, 60);
      $$0.a(dng.fx, 15, 100);
      $$0.a(dng.jd, 5, 5);
      $$0.a(dng.iL, 60, 20);
      $$0.a(dng.pL, 15, 20);
      $$0.a(dng.iM, 60, 20);
      $$0.a(dng.iN, 60, 20);
      $$0.a(dng.iO, 60, 20);
      $$0.a(dng.iP, 60, 20);
      $$0.a(dng.iQ, 60, 20);
      $$0.a(dng.iR, 60, 20);
      $$0.a(dng.iS, 60, 20);
      $$0.a(dng.iT, 60, 20);
      $$0.a(dng.iU, 60, 20);
      $$0.a(dng.iV, 60, 20);
      $$0.a(dng.iW, 60, 20);
      $$0.a(dng.iX, 60, 20);
      $$0.a(dng.iY, 60, 20);
      $$0.a(dng.iZ, 60, 20);
      $$0.a(dng.ja, 60, 20);
      $$0.a(dng.jb, 60, 20);
      $$0.a(dng.ue, 5, 100);
      $$0.a(dng.uf, 5, 100);
      $$0.a(dng.ug, 5, 100);
      $$0.a(dng.mK, 30, 60);
      $$0.a(dng.nF, 60, 60);
      $$0.a(dng.oy, 60, 60);
      $$0.a(dng.oG, 30, 20);
      $$0.a(dng.pK, 5, 20);
      $$0.a(dng.oO, 60, 100);
      $$0.a(dng.pN, 5, 20);
      $$0.a(dng.pM, 30, 20);
      $$0.a(dng.aT, 30, 60);
      $$0.a(dng.aU, 30, 60);
      $$0.a(dng.td, 15, 60);
      $$0.a(dng.te, 15, 60);
      $$0.a(dng.tf, 60, 100);
      $$0.a(dng.tg, 30, 60);
      $$0.a(dng.th, 30, 60);
      $$0.a(dng.tn, 60, 100);
      $$0.a(dng.to, 60, 100);
      $$0.a(dng.tp, 60, 100);
      $$0.a(dng.tq, 30, 60);
      $$0.a(dng.fy, 15, 100);
      $$0.a(dng.ul, 60, 100);
      $$0.a(dng.bD, 60, 100);
   }
}
