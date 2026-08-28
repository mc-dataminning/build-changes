import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dpt extends dme {
   public static final MapCodec<dpt> b = b(dpt::new);
   public static final int c = 15;
   public static final ebt d = ebj.az;
   public static final ebk e = dsl.b;
   public static final ebk f = dsl.c;
   public static final ebk g = dsl.d;
   public static final ebk h = dsl.e;
   public static final ebk i = dsl.f;
   public static final Map<jb, ebk> D = dsl.h.entrySet().stream().filter($$0 -> $$0.getKey() != jb.a).collect(ag.a());
   private final Function<eat, ffw> R;
   private static final int S = 60;
   private static final int T = 30;
   private static final int U = 15;
   private static final int V = 5;
   private static final int W = 100;
   private static final int X = 60;
   private static final int Y = 20;
   private static final int Z = 5;
   private final Object2IntMap<dmr> aa = new Object2IntOpenHashMap();
   private final Object2IntMap<dmr> ab = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dpt> a() {
      return b;
   }

   public dpt(eas.d $$0) {
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

   private Function<eat, ffw> q() {
      Map<jb, ffw> $$0 = fft.d(dmr.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         ffw $$2 = fft.a();

         for (Entry<jb, ebk> $$3 : D.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fft.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? a : $$2;
      }, new ebw[]{d});
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(d)) : dmt.a.m();
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.R.apply($$0);
   }

   @Override
   public eat a(ddg $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected eat b(diq $$0, iv $$1) {
      iv $$2 = $$1.e();
      eat $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jb.b)) {
         eat $$4 = this.m();

         for (jb $$5 : jb.values()) {
            ebk $$6 = D.get($$5);
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
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      iv $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jb.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().c(dji.b)) {
         if ($$1.O().c(dji.c) || $$1.g($$2)) {
            if (!$$0.a($$1, $$2)) {
               $$1.a($$2, false);
            }

            eat $$4 = $$1.a_($$2.e());
            boolean $$5 = $$4.a($$1.B_().q());
            int $$6 = $$0.c(d);
            if (!$$5 && $$1.ah() && this.a((djm)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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
                           int $$16 = this.a((djp)$$1, $$11);
                           if ($$16 > 0) {
                              int $$17 = ($$16 + 40 + $$1.an().a() * 7) / ($$6 + 30);
                              if ($$9) {
                                 $$17 /= 2;
                              }

                              if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ah() || !this.a((djm)$$1, $$11))) {
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

   protected boolean a(djm $$0, iv $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int o(eat $$0) {
      return $$0.b(ebj.I) && $$0.c(ebj.I) ? 0 : this.ab.getInt($$0.b());
   }

   private int q(eat $$0) {
      return $$0.b(ebj.I) && $$0.c(ebj.I) ? 0 : this.aa.getInt($$0.b());
   }

   private void a(djm $$0, iv $$1, int $$2, azv $$3, int $$4) {
      int $$5 = this.o($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         eat $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dmr $$8 = $$6.b();
         if ($$8 instanceof dvp) {
            dvp.a($$0, $$1);
         }
      }
   }

   private eat a(djp $$0, iv $$1, int $$2) {
      eat $$3 = a((diq)$$0, $$1);
      return $$3.a(dmt.cB) ? $$3.b(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(diq $$0, iv $$1) {
      for (jb $$2 : jb.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(djp $$0, iv $$1) {
      if (!$$0.v($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jb $$3 : jb.values()) {
            eat $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.q($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(eat $$0) {
      return this.q($$0) > 0;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azv $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   public void a(dmr $$0, int $$1, int $$2) {
      this.aa.put($$0, $$1);
      this.ab.put($$0, $$2);
   }

   public static void b() {
      dpt $$0 = (dpt)dmt.cB;
      $$0.a(dmt.n, 5, 20);
      $$0.a(dmt.o, 5, 20);
      $$0.a(dmt.p, 5, 20);
      $$0.a(dmt.q, 5, 20);
      $$0.a(dmt.r, 5, 20);
      $$0.a(dmt.s, 5, 20);
      $$0.a(dmt.t, 5, 20);
      $$0.a(dmt.v, 5, 20);
      $$0.a(dmt.w, 5, 20);
      $$0.a(dmt.x, 5, 20);
      $$0.a(dmt.y, 5, 20);
      $$0.a(dmt.jV, 5, 20);
      $$0.a(dmt.jW, 5, 20);
      $$0.a(dmt.jX, 5, 20);
      $$0.a(dmt.jY, 5, 20);
      $$0.a(dmt.jZ, 5, 20);
      $$0.a(dmt.ka, 5, 20);
      $$0.a(dmt.kb, 5, 20);
      $$0.a(dmt.kc, 5, 20);
      $$0.a(dmt.kd, 5, 20);
      $$0.a(dmt.ke, 5, 20);
      $$0.a(dmt.kf, 5, 20);
      $$0.a(dmt.fA, 5, 20);
      $$0.a(dmt.ky, 5, 20);
      $$0.a(dmt.kz, 5, 20);
      $$0.a(dmt.kA, 5, 20);
      $$0.a(dmt.kB, 5, 20);
      $$0.a(dmt.kC, 5, 20);
      $$0.a(dmt.kD, 5, 20);
      $$0.a(dmt.kE, 5, 20);
      $$0.a(dmt.kF, 5, 20);
      $$0.a(dmt.kG, 5, 20);
      $$0.a(dmt.el, 5, 20);
      $$0.a(dmt.kH, 5, 20);
      $$0.a(dmt.kI, 5, 20);
      $$0.a(dmt.kJ, 5, 20);
      $$0.a(dmt.kK, 5, 20);
      $$0.a(dmt.kL, 5, 20);
      $$0.a(dmt.kM, 5, 20);
      $$0.a(dmt.kN, 5, 20);
      $$0.a(dmt.kO, 5, 20);
      $$0.a(dmt.kP, 5, 20);
      $$0.a(dmt.cF, 5, 20);
      $$0.a(dmt.gk, 5, 20);
      $$0.a(dmt.gj, 5, 20);
      $$0.a(dmt.gl, 5, 20);
      $$0.a(dmt.iq, 5, 20);
      $$0.a(dmt.ir, 5, 20);
      $$0.a(dmt.is, 5, 20);
      $$0.a(dmt.it, 5, 20);
      $$0.a(dmt.iu, 5, 20);
      $$0.a(dmt.iv, 5, 20);
      $$0.a(dmt.iw, 5, 20);
      $$0.a(dmt.X, 5, 5);
      $$0.a(dmt.Y, 5, 5);
      $$0.a(dmt.Z, 5, 5);
      $$0.a(dmt.aa, 5, 5);
      $$0.a(dmt.ab, 5, 5);
      $$0.a(dmt.ac, 5, 5);
      $$0.a(dmt.ae, 5, 5);
      $$0.a(dmt.ad, 5, 5);
      $$0.a(dmt.af, 5, 5);
      $$0.a(dmt.ai, 5, 5);
      $$0.a(dmt.aq, 5, 5);
      $$0.a(dmt.aj, 5, 5);
      $$0.a(dmt.ak, 5, 5);
      $$0.a(dmt.al, 5, 5);
      $$0.a(dmt.am, 5, 5);
      $$0.a(dmt.an, 5, 5);
      $$0.a(dmt.ao, 5, 5);
      $$0.a(dmt.ap, 5, 5);
      $$0.a(dmt.ar, 5, 5);
      $$0.a(dmt.as, 5, 5);
      $$0.a(dmt.aB, 5, 5);
      $$0.a(dmt.aC, 5, 5);
      $$0.a(dmt.aD, 5, 5);
      $$0.a(dmt.aE, 5, 5);
      $$0.a(dmt.aF, 5, 5);
      $$0.a(dmt.aG, 5, 5);
      $$0.a(dmt.aH, 5, 5);
      $$0.a(dmt.aI, 5, 5);
      $$0.a(dmt.aJ, 5, 5);
      $$0.a(dmt.at, 5, 5);
      $$0.a(dmt.au, 5, 5);
      $$0.a(dmt.av, 5, 5);
      $$0.a(dmt.aw, 5, 5);
      $$0.a(dmt.ax, 5, 5);
      $$0.a(dmt.ay, 5, 5);
      $$0.a(dmt.u, 5, 5);
      $$0.a(dmt.az, 5, 5);
      $$0.a(dmt.aA, 5, 5);
      $$0.a(dmt.ag, 5, 20);
      $$0.a(dmt.aK, 30, 60);
      $$0.a(dmt.aL, 30, 60);
      $$0.a(dmt.aM, 30, 60);
      $$0.a(dmt.aN, 30, 60);
      $$0.a(dmt.aO, 30, 60);
      $$0.a(dmt.aP, 30, 60);
      $$0.a(dmt.aQ, 30, 60);
      $$0.a(dmt.aR, 30, 60);
      $$0.a(dmt.aS, 30, 60);
      $$0.a(dmt.cv, 30, 20);
      $$0.a(dmt.cu, 15, 100);
      $$0.a(dmt.bA, 60, 100);
      $$0.a(dmt.bB, 60, 100);
      $$0.a(dmt.bC, 60, 100);
      $$0.a(dmt.bE, 60, 100);
      $$0.a(dmt.bF, 60, 100);
      $$0.a(dmt.jf, 60, 100);
      $$0.a(dmt.jg, 60, 100);
      $$0.a(dmt.jh, 60, 100);
      $$0.a(dmt.ji, 60, 100);
      $$0.a(dmt.jj, 60, 100);
      $$0.a(dmt.jk, 60, 100);
      $$0.a(dmt.cb, 60, 100);
      $$0.a(dmt.cd, 60, 100);
      $$0.a(dmt.uh, 60, 100);
      $$0.a(dmt.ui, 60, 100);
      $$0.a(dmt.ce, 60, 100);
      $$0.a(dmt.cf, 60, 100);
      $$0.a(dmt.cg, 60, 100);
      $$0.a(dmt.ch, 60, 100);
      $$0.a(dmt.ci, 60, 100);
      $$0.a(dmt.cj, 60, 100);
      $$0.a(dmt.ck, 60, 100);
      $$0.a(dmt.cl, 60, 100);
      $$0.a(dmt.cm, 60, 100);
      $$0.a(dmt.co, 60, 100);
      $$0.a(dmt.cc, 60, 100);
      $$0.a(dmt.li, 60, 100);
      $$0.a(dmt.cn, 60, 100);
      $$0.a(dmt.tj, 60, 100);
      $$0.a(dmt.tk, 60, 100);
      $$0.a(dmt.tl, 60, 100);
      $$0.a(dmt.eh, 60, 100);
      $$0.a(dmt.bK, 30, 60);
      $$0.a(dmt.bL, 30, 60);
      $$0.a(dmt.bM, 30, 60);
      $$0.a(dmt.bN, 30, 60);
      $$0.a(dmt.bO, 30, 60);
      $$0.a(dmt.bP, 30, 60);
      $$0.a(dmt.bQ, 30, 60);
      $$0.a(dmt.bR, 30, 60);
      $$0.a(dmt.bS, 30, 60);
      $$0.a(dmt.bT, 30, 60);
      $$0.a(dmt.bU, 30, 60);
      $$0.a(dmt.bV, 30, 60);
      $$0.a(dmt.bW, 30, 60);
      $$0.a(dmt.bX, 30, 60);
      $$0.a(dmt.bY, 30, 60);
      $$0.a(dmt.bZ, 30, 60);
      $$0.a(dmt.fx, 15, 100);
      $$0.a(dmt.jd, 5, 5);
      $$0.a(dmt.iL, 60, 20);
      $$0.a(dmt.pL, 15, 20);
      $$0.a(dmt.iM, 60, 20);
      $$0.a(dmt.iN, 60, 20);
      $$0.a(dmt.iO, 60, 20);
      $$0.a(dmt.iP, 60, 20);
      $$0.a(dmt.iQ, 60, 20);
      $$0.a(dmt.iR, 60, 20);
      $$0.a(dmt.iS, 60, 20);
      $$0.a(dmt.iT, 60, 20);
      $$0.a(dmt.iU, 60, 20);
      $$0.a(dmt.iV, 60, 20);
      $$0.a(dmt.iW, 60, 20);
      $$0.a(dmt.iX, 60, 20);
      $$0.a(dmt.iY, 60, 20);
      $$0.a(dmt.iZ, 60, 20);
      $$0.a(dmt.ja, 60, 20);
      $$0.a(dmt.jb, 60, 20);
      $$0.a(dmt.ue, 5, 100);
      $$0.a(dmt.uf, 5, 100);
      $$0.a(dmt.ug, 5, 100);
      $$0.a(dmt.mK, 30, 60);
      $$0.a(dmt.nF, 60, 60);
      $$0.a(dmt.oy, 60, 60);
      $$0.a(dmt.oG, 30, 20);
      $$0.a(dmt.pK, 5, 20);
      $$0.a(dmt.oO, 60, 100);
      $$0.a(dmt.pN, 5, 20);
      $$0.a(dmt.pM, 30, 20);
      $$0.a(dmt.aT, 30, 60);
      $$0.a(dmt.aU, 30, 60);
      $$0.a(dmt.td, 15, 60);
      $$0.a(dmt.te, 15, 60);
      $$0.a(dmt.tf, 60, 100);
      $$0.a(dmt.tg, 30, 60);
      $$0.a(dmt.th, 30, 60);
      $$0.a(dmt.tn, 60, 100);
      $$0.a(dmt.to, 60, 100);
      $$0.a(dmt.tp, 60, 100);
      $$0.a(dmt.tq, 30, 60);
      $$0.a(dmt.fy, 15, 100);
      $$0.a(dmt.ul, 60, 100);
      $$0.a(dmt.bD, 60, 100);
   }
}
