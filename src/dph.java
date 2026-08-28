import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dph extends dls {
   public static final MapCodec<dph> b = b(dph::new);
   public static final int c = 15;
   public static final ebh d = eax.az;
   public static final eay e = drz.b;
   public static final eay f = drz.c;
   public static final eay g = drz.d;
   public static final eay h = drz.e;
   public static final eay i = drz.f;
   public static final Map<ja, eay> D = drz.h.entrySet().stream().filter($$0 -> $$0.getKey() != ja.a).collect(af.a());
   private final Function<eah, ffk> R;
   private static final int S = 60;
   private static final int T = 30;
   private static final int U = 15;
   private static final int V = 5;
   private static final int W = 100;
   private static final int X = 60;
   private static final int Y = 20;
   private static final int Z = 5;
   private final Object2IntMap<dmf> aa = new Object2IntOpenHashMap();
   private final Object2IntMap<dmf> ab = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dph> a() {
      return b;
   }

   public dph(eag.d $$0) {
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

   private Function<eah, ffk> q() {
      Map<ja, ffk> $$0 = ffh.d(dmf.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         ffk $$2 = ffh.a();

         for (Entry<ja, eay> $$3 : D.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = ffh.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? a : $$2;
      }, new ebk[]{d});
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(d)) : dmh.a.m();
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.R.apply($$0);
   }

   @Override
   public eah a(dcw $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected eah b(dig $$0, iu $$1) {
      iu $$2 = $$1.e();
      eah $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, ja.b)) {
         eah $$4 = this.m();

         for (ja $$5 : ja.values()) {
            eay $$6 = D.get($$5);
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
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, ja.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().c(diw.b)) {
         if ($$1.O().c(diw.c) || $$1.g($$2)) {
            if (!$$0.a($$1, $$2)) {
               $$1.a($$2, false);
            }

            eah $$4 = $$1.a_($$2.e());
            boolean $$5 = $$4.a($$1.B_().q());
            int $$6 = $$0.c(d);
            if (!$$5 && $$1.ah() && this.a((dja)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
               $$1.a($$2, false);
            } else {
               int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
               if ($$6 != $$7) {
                  $$0 = $$0.b(d, Integer.valueOf($$7));
                  $$1.a($$2, $$0, 260);
               }

               if (!$$5) {
                  if (!this.d($$1, $$2)) {
                     iu $$8 = $$2.e();
                     if (!$$1.a_($$8).c($$1, $$8, ja.b) || $$6 > 3) {
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
               iu.a $$11 = new iu.a();

               for (int $$12 = -1; $$12 <= 1; $$12++) {
                  for (int $$13 = -1; $$13 <= 1; $$13++) {
                     for (int $$14 = -1; $$14 <= 4; $$14++) {
                        if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                           int $$15 = 100;
                           if ($$14 > 1) {
                              $$15 += ($$14 - 1) * 100;
                           }

                           $$11.a($$2, $$12, $$14, $$13);
                           int $$16 = this.a((djd)$$1, $$11);
                           if ($$16 > 0) {
                              int $$17 = ($$16 + 40 + $$1.an().a() * 7) / ($$6 + 30);
                              if ($$9) {
                                 $$17 /= 2;
                              }

                              if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ah() || !this.a((dja)$$1, $$11))) {
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

   protected boolean a(dja $$0, iu $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int o(eah $$0) {
      return $$0.b(eax.I) && $$0.c(eax.I) ? 0 : this.ab.getInt($$0.b());
   }

   private int q(eah $$0) {
      return $$0.b(eax.I) && $$0.c(eax.I) ? 0 : this.aa.getInt($$0.b());
   }

   private void a(dja $$0, iu $$1, int $$2, azv $$3, int $$4) {
      int $$5 = this.o($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         eah $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dmf $$8 = $$6.b();
         if ($$8 instanceof dvd) {
            dvd.a($$0, $$1);
         }
      }
   }

   private eah a(djd $$0, iu $$1, int $$2) {
      eah $$3 = a((dig)$$0, $$1);
      return $$3.a(dmh.cB) ? $$3.b(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dig $$0, iu $$1) {
      for (ja $$2 : ja.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(djd $$0, iu $$1) {
      if (!$$0.v($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ja $$3 : ja.values()) {
            eah $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.q($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(eah $$0) {
      return this.q($$0) > 0;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azv $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   public void a(dmf $$0, int $$1, int $$2) {
      this.aa.put($$0, $$1);
      this.ab.put($$0, $$2);
   }

   public static void b() {
      dph $$0 = (dph)dmh.cB;
      $$0.a(dmh.n, 5, 20);
      $$0.a(dmh.o, 5, 20);
      $$0.a(dmh.p, 5, 20);
      $$0.a(dmh.q, 5, 20);
      $$0.a(dmh.r, 5, 20);
      $$0.a(dmh.s, 5, 20);
      $$0.a(dmh.t, 5, 20);
      $$0.a(dmh.v, 5, 20);
      $$0.a(dmh.w, 5, 20);
      $$0.a(dmh.x, 5, 20);
      $$0.a(dmh.y, 5, 20);
      $$0.a(dmh.jV, 5, 20);
      $$0.a(dmh.jW, 5, 20);
      $$0.a(dmh.jX, 5, 20);
      $$0.a(dmh.jY, 5, 20);
      $$0.a(dmh.jZ, 5, 20);
      $$0.a(dmh.ka, 5, 20);
      $$0.a(dmh.kb, 5, 20);
      $$0.a(dmh.kc, 5, 20);
      $$0.a(dmh.kd, 5, 20);
      $$0.a(dmh.ke, 5, 20);
      $$0.a(dmh.kf, 5, 20);
      $$0.a(dmh.fA, 5, 20);
      $$0.a(dmh.ky, 5, 20);
      $$0.a(dmh.kz, 5, 20);
      $$0.a(dmh.kA, 5, 20);
      $$0.a(dmh.kB, 5, 20);
      $$0.a(dmh.kC, 5, 20);
      $$0.a(dmh.kD, 5, 20);
      $$0.a(dmh.kE, 5, 20);
      $$0.a(dmh.kF, 5, 20);
      $$0.a(dmh.kG, 5, 20);
      $$0.a(dmh.el, 5, 20);
      $$0.a(dmh.kH, 5, 20);
      $$0.a(dmh.kI, 5, 20);
      $$0.a(dmh.kJ, 5, 20);
      $$0.a(dmh.kK, 5, 20);
      $$0.a(dmh.kL, 5, 20);
      $$0.a(dmh.kM, 5, 20);
      $$0.a(dmh.kN, 5, 20);
      $$0.a(dmh.kO, 5, 20);
      $$0.a(dmh.kP, 5, 20);
      $$0.a(dmh.cF, 5, 20);
      $$0.a(dmh.gk, 5, 20);
      $$0.a(dmh.gj, 5, 20);
      $$0.a(dmh.gl, 5, 20);
      $$0.a(dmh.iq, 5, 20);
      $$0.a(dmh.ir, 5, 20);
      $$0.a(dmh.is, 5, 20);
      $$0.a(dmh.it, 5, 20);
      $$0.a(dmh.iu, 5, 20);
      $$0.a(dmh.iv, 5, 20);
      $$0.a(dmh.iw, 5, 20);
      $$0.a(dmh.X, 5, 5);
      $$0.a(dmh.Y, 5, 5);
      $$0.a(dmh.Z, 5, 5);
      $$0.a(dmh.aa, 5, 5);
      $$0.a(dmh.ab, 5, 5);
      $$0.a(dmh.ac, 5, 5);
      $$0.a(dmh.ae, 5, 5);
      $$0.a(dmh.ad, 5, 5);
      $$0.a(dmh.af, 5, 5);
      $$0.a(dmh.ai, 5, 5);
      $$0.a(dmh.aq, 5, 5);
      $$0.a(dmh.aj, 5, 5);
      $$0.a(dmh.ak, 5, 5);
      $$0.a(dmh.al, 5, 5);
      $$0.a(dmh.am, 5, 5);
      $$0.a(dmh.an, 5, 5);
      $$0.a(dmh.ao, 5, 5);
      $$0.a(dmh.ap, 5, 5);
      $$0.a(dmh.ar, 5, 5);
      $$0.a(dmh.as, 5, 5);
      $$0.a(dmh.aB, 5, 5);
      $$0.a(dmh.aC, 5, 5);
      $$0.a(dmh.aD, 5, 5);
      $$0.a(dmh.aE, 5, 5);
      $$0.a(dmh.aF, 5, 5);
      $$0.a(dmh.aG, 5, 5);
      $$0.a(dmh.aH, 5, 5);
      $$0.a(dmh.aI, 5, 5);
      $$0.a(dmh.aJ, 5, 5);
      $$0.a(dmh.at, 5, 5);
      $$0.a(dmh.au, 5, 5);
      $$0.a(dmh.av, 5, 5);
      $$0.a(dmh.aw, 5, 5);
      $$0.a(dmh.ax, 5, 5);
      $$0.a(dmh.ay, 5, 5);
      $$0.a(dmh.u, 5, 5);
      $$0.a(dmh.az, 5, 5);
      $$0.a(dmh.aA, 5, 5);
      $$0.a(dmh.ag, 5, 20);
      $$0.a(dmh.aK, 30, 60);
      $$0.a(dmh.aL, 30, 60);
      $$0.a(dmh.aM, 30, 60);
      $$0.a(dmh.aN, 30, 60);
      $$0.a(dmh.aO, 30, 60);
      $$0.a(dmh.aP, 30, 60);
      $$0.a(dmh.aQ, 30, 60);
      $$0.a(dmh.aR, 30, 60);
      $$0.a(dmh.aS, 30, 60);
      $$0.a(dmh.cv, 30, 20);
      $$0.a(dmh.cu, 15, 100);
      $$0.a(dmh.bA, 60, 100);
      $$0.a(dmh.bB, 60, 100);
      $$0.a(dmh.bC, 60, 100);
      $$0.a(dmh.bE, 60, 100);
      $$0.a(dmh.bF, 60, 100);
      $$0.a(dmh.jf, 60, 100);
      $$0.a(dmh.jg, 60, 100);
      $$0.a(dmh.jh, 60, 100);
      $$0.a(dmh.ji, 60, 100);
      $$0.a(dmh.jj, 60, 100);
      $$0.a(dmh.jk, 60, 100);
      $$0.a(dmh.cb, 60, 100);
      $$0.a(dmh.cd, 60, 100);
      $$0.a(dmh.uh, 60, 100);
      $$0.a(dmh.ui, 60, 100);
      $$0.a(dmh.ce, 60, 100);
      $$0.a(dmh.cf, 60, 100);
      $$0.a(dmh.cg, 60, 100);
      $$0.a(dmh.ch, 60, 100);
      $$0.a(dmh.ci, 60, 100);
      $$0.a(dmh.cj, 60, 100);
      $$0.a(dmh.ck, 60, 100);
      $$0.a(dmh.cl, 60, 100);
      $$0.a(dmh.cm, 60, 100);
      $$0.a(dmh.co, 60, 100);
      $$0.a(dmh.cc, 60, 100);
      $$0.a(dmh.li, 60, 100);
      $$0.a(dmh.cn, 60, 100);
      $$0.a(dmh.tj, 60, 100);
      $$0.a(dmh.tk, 60, 100);
      $$0.a(dmh.tl, 60, 100);
      $$0.a(dmh.eh, 60, 100);
      $$0.a(dmh.bK, 30, 60);
      $$0.a(dmh.bL, 30, 60);
      $$0.a(dmh.bM, 30, 60);
      $$0.a(dmh.bN, 30, 60);
      $$0.a(dmh.bO, 30, 60);
      $$0.a(dmh.bP, 30, 60);
      $$0.a(dmh.bQ, 30, 60);
      $$0.a(dmh.bR, 30, 60);
      $$0.a(dmh.bS, 30, 60);
      $$0.a(dmh.bT, 30, 60);
      $$0.a(dmh.bU, 30, 60);
      $$0.a(dmh.bV, 30, 60);
      $$0.a(dmh.bW, 30, 60);
      $$0.a(dmh.bX, 30, 60);
      $$0.a(dmh.bY, 30, 60);
      $$0.a(dmh.bZ, 30, 60);
      $$0.a(dmh.fx, 15, 100);
      $$0.a(dmh.jd, 5, 5);
      $$0.a(dmh.iL, 60, 20);
      $$0.a(dmh.pL, 15, 20);
      $$0.a(dmh.iM, 60, 20);
      $$0.a(dmh.iN, 60, 20);
      $$0.a(dmh.iO, 60, 20);
      $$0.a(dmh.iP, 60, 20);
      $$0.a(dmh.iQ, 60, 20);
      $$0.a(dmh.iR, 60, 20);
      $$0.a(dmh.iS, 60, 20);
      $$0.a(dmh.iT, 60, 20);
      $$0.a(dmh.iU, 60, 20);
      $$0.a(dmh.iV, 60, 20);
      $$0.a(dmh.iW, 60, 20);
      $$0.a(dmh.iX, 60, 20);
      $$0.a(dmh.iY, 60, 20);
      $$0.a(dmh.iZ, 60, 20);
      $$0.a(dmh.ja, 60, 20);
      $$0.a(dmh.jb, 60, 20);
      $$0.a(dmh.ue, 5, 100);
      $$0.a(dmh.uf, 5, 100);
      $$0.a(dmh.ug, 5, 100);
      $$0.a(dmh.mK, 30, 60);
      $$0.a(dmh.nF, 60, 60);
      $$0.a(dmh.oy, 60, 60);
      $$0.a(dmh.oG, 30, 20);
      $$0.a(dmh.pK, 5, 20);
      $$0.a(dmh.oO, 60, 100);
      $$0.a(dmh.pN, 5, 20);
      $$0.a(dmh.pM, 30, 20);
      $$0.a(dmh.aT, 30, 60);
      $$0.a(dmh.aU, 30, 60);
      $$0.a(dmh.td, 15, 60);
      $$0.a(dmh.te, 15, 60);
      $$0.a(dmh.tf, 60, 100);
      $$0.a(dmh.tg, 30, 60);
      $$0.a(dmh.th, 30, 60);
      $$0.a(dmh.tn, 60, 100);
      $$0.a(dmh.to, 60, 100);
      $$0.a(dmh.tp, 60, 100);
      $$0.a(dmh.tq, 30, 60);
      $$0.a(dmh.fy, 15, 100);
      $$0.a(dmh.ul, 60, 100);
      $$0.a(dmh.bD, 60, 100);
   }
}
