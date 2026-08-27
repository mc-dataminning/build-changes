import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cvg extends cry {
   public static final int c = 15;
   public static final dfy d = dfo.aw;
   public static final dfp e = cxw.a;
   public static final dfp f = cxw.b;
   public static final dfp g = cxw.c;
   public static final dfp h = cxw.d;
   public static final dfp i = cxw.e;
   private static final Map<hb, dfp> j = cxw.g.entrySet().stream().filter($$0 -> $$0.getKey() != hb.a).collect(ac.a());
   private static final ehy k = csk.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehy l = csk.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ehy m = csk.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehy n = csk.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ehy D = csk.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dey, ehy> E;
   private static final int F = 60;
   private static final int G = 30;
   private static final int H = 15;
   private static final int I = 5;
   private static final int J = 100;
   private static final int K = 60;
   private static final int L = 20;
   private static final int M = 5;
   private final Object2IntMap<csk> N = new Object2IntOpenHashMap();
   private final Object2IntMap<csk> O = new Object2IntOpenHashMap();

   public cvg(dex.d $$0) {
      super($$0, 1.0F);
      this.k(
         this.C
            .b()
            .a(d, Integer.valueOf(0))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
            .a(h, Boolean.valueOf(false))
            .a(i, Boolean.valueOf(false))
      );
      this.E = ImmutableMap.copyOf(this.C.a().stream().filter($$0x -> $$0x.c(d) == 0).collect(Collectors.toMap(Function.identity(), cvg::h)));
   }

   private static ehy h(dey $$0) {
      ehy $$1 = ehv.a();
      if ($$0.c(i)) {
         $$1 = k;
      }

      if ($$0.c(e)) {
         $$1 = ehv.a($$1, n);
      }

      if ($$0.c(g)) {
         $$1 = ehv.a($$1, D);
      }

      if ($$0.c(f)) {
         $$1 = ehv.a($$1, m);
      }

      if ($$0.c(h)) {
         $$1 = ehv.a($$1, l);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(d)) : csl.a.n();
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.E.get($$0.a(d, Integer.valueOf(0)));
   }

   @Override
   public dey a(cle $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dey b(coq $$0, gv $$1) {
      gv $$2 = $$1.d();
      dey $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, hb.b)) {
         dey $$4 = this.n();

         for (hb $$5 : hb.values()) {
            dfp $$6 = j.get($$5);
            if ($$6 != null) {
               $$4 = $$4.a($$6, Boolean.valueOf(this.f($$0.a_($$1.a($$5)))));
            }
         }

         return $$4;
      } else {
         return this.n();
      }
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hb.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.X().b(cpg.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dey $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.x_().q());
         int $$6 = $$0.c(d);
         if (!$$5 && $$1.Z() && this.a((cpk)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(d, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  gv $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, hb.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.s($$2).a(api.ac);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            gv.a $$11 = new gv.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((cpn)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ai().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.Z() || !this.a((cpk)$$1, $$11))) {
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

   protected boolean a(cpk $$0, gv $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dey $$0) {
      return $$0.b(dfo.C) && $$0.c(dfo.C) ? 0 : this.O.getInt($$0.b());
   }

   private int o(dey $$0) {
      return $$0.b(dfo.C) && $$0.c(dfo.C) ? 0 : this.N.getInt($$0.b());
   }

   private void a(cpk $$0, gv $$1, int $$2, art $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dey $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         csk $$8 = $$6.b();
         if ($$8 instanceof dau) {
            dau.a($$0, $$1);
         }
      }
   }

   private dey a(cpl $$0, gv $$1, int $$2) {
      dey $$3 = a($$0, $$1);
      return $$3.a(csl.cr) ? $$3.a(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(coq $$0, gv $$1) {
      for (hb $$2 : hb.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cpn $$0, gv $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (hb $$3 : hb.values()) {
            dey $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dey $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(art $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   private void a(csk $$0, int $$1, int $$2) {
      this.N.put($$0, $$1);
      this.O.put($$0, $$2);
   }

   public static void a() {
      cvg $$0 = (cvg)csl.cr;
      $$0.a(csl.n, 5, 20);
      $$0.a(csl.o, 5, 20);
      $$0.a(csl.p, 5, 20);
      $$0.a(csl.q, 5, 20);
      $$0.a(csl.r, 5, 20);
      $$0.a(csl.s, 5, 20);
      $$0.a(csl.t, 5, 20);
      $$0.a(csl.u, 5, 20);
      $$0.a(csl.v, 5, 20);
      $$0.a(csl.w, 5, 20);
      $$0.a(csl.jt, 5, 20);
      $$0.a(csl.ju, 5, 20);
      $$0.a(csl.jv, 5, 20);
      $$0.a(csl.jw, 5, 20);
      $$0.a(csl.jx, 5, 20);
      $$0.a(csl.jy, 5, 20);
      $$0.a(csl.jz, 5, 20);
      $$0.a(csl.jA, 5, 20);
      $$0.a(csl.jB, 5, 20);
      $$0.a(csl.jC, 5, 20);
      $$0.a(csl.fh, 5, 20);
      $$0.a(csl.jV, 5, 20);
      $$0.a(csl.jW, 5, 20);
      $$0.a(csl.jX, 5, 20);
      $$0.a(csl.jY, 5, 20);
      $$0.a(csl.jZ, 5, 20);
      $$0.a(csl.ka, 5, 20);
      $$0.a(csl.kb, 5, 20);
      $$0.a(csl.kc, 5, 20);
      $$0.a(csl.dU, 5, 20);
      $$0.a(csl.kd, 5, 20);
      $$0.a(csl.ke, 5, 20);
      $$0.a(csl.kf, 5, 20);
      $$0.a(csl.kg, 5, 20);
      $$0.a(csl.kh, 5, 20);
      $$0.a(csl.ki, 5, 20);
      $$0.a(csl.kj, 5, 20);
      $$0.a(csl.kk, 5, 20);
      $$0.a(csl.cu, 5, 20);
      $$0.a(csl.fL, 5, 20);
      $$0.a(csl.fK, 5, 20);
      $$0.a(csl.fM, 5, 20);
      $$0.a(csl.hP, 5, 20);
      $$0.a(csl.hQ, 5, 20);
      $$0.a(csl.hR, 5, 20);
      $$0.a(csl.hS, 5, 20);
      $$0.a(csl.hT, 5, 20);
      $$0.a(csl.hU, 5, 20);
      $$0.a(csl.U, 5, 5);
      $$0.a(csl.V, 5, 5);
      $$0.a(csl.W, 5, 5);
      $$0.a(csl.X, 5, 5);
      $$0.a(csl.Y, 5, 5);
      $$0.a(csl.Z, 5, 5);
      $$0.a(csl.aa, 5, 5);
      $$0.a(csl.ab, 5, 5);
      $$0.a(csl.ae, 5, 5);
      $$0.a(csl.al, 5, 5);
      $$0.a(csl.af, 5, 5);
      $$0.a(csl.ag, 5, 5);
      $$0.a(csl.ah, 5, 5);
      $$0.a(csl.ai, 5, 5);
      $$0.a(csl.aj, 5, 5);
      $$0.a(csl.ak, 5, 5);
      $$0.a(csl.am, 5, 5);
      $$0.a(csl.an, 5, 5);
      $$0.a(csl.aw, 5, 5);
      $$0.a(csl.ax, 5, 5);
      $$0.a(csl.ay, 5, 5);
      $$0.a(csl.az, 5, 5);
      $$0.a(csl.aA, 5, 5);
      $$0.a(csl.aB, 5, 5);
      $$0.a(csl.aC, 5, 5);
      $$0.a(csl.aD, 5, 5);
      $$0.a(csl.ao, 5, 5);
      $$0.a(csl.ap, 5, 5);
      $$0.a(csl.aq, 5, 5);
      $$0.a(csl.ar, 5, 5);
      $$0.a(csl.as, 5, 5);
      $$0.a(csl.at, 5, 5);
      $$0.a(csl.au, 5, 5);
      $$0.a(csl.av, 5, 5);
      $$0.a(csl.ac, 5, 20);
      $$0.a(csl.aE, 30, 60);
      $$0.a(csl.aF, 30, 60);
      $$0.a(csl.aG, 30, 60);
      $$0.a(csl.aH, 30, 60);
      $$0.a(csl.aI, 30, 60);
      $$0.a(csl.aJ, 30, 60);
      $$0.a(csl.aK, 30, 60);
      $$0.a(csl.aL, 30, 60);
      $$0.a(csl.cl, 30, 20);
      $$0.a(csl.ck, 15, 100);
      $$0.a(csl.bt, 60, 100);
      $$0.a(csl.bu, 60, 100);
      $$0.a(csl.bv, 60, 100);
      $$0.a(csl.iD, 60, 100);
      $$0.a(csl.iE, 60, 100);
      $$0.a(csl.iF, 60, 100);
      $$0.a(csl.iG, 60, 100);
      $$0.a(csl.iH, 60, 100);
      $$0.a(csl.iI, 60, 100);
      $$0.a(csl.bR, 60, 100);
      $$0.a(csl.bT, 60, 100);
      $$0.a(csl.bU, 60, 100);
      $$0.a(csl.bV, 60, 100);
      $$0.a(csl.bW, 60, 100);
      $$0.a(csl.bX, 60, 100);
      $$0.a(csl.bY, 60, 100);
      $$0.a(csl.bZ, 60, 100);
      $$0.a(csl.ca, 60, 100);
      $$0.a(csl.cb, 60, 100);
      $$0.a(csl.cc, 60, 100);
      $$0.a(csl.ce, 60, 100);
      $$0.a(csl.bS, 60, 100);
      $$0.a(csl.kC, 60, 100);
      $$0.a(csl.cd, 60, 100);
      $$0.a(csl.rA, 60, 100);
      $$0.a(csl.bA, 30, 60);
      $$0.a(csl.bB, 30, 60);
      $$0.a(csl.bC, 30, 60);
      $$0.a(csl.bD, 30, 60);
      $$0.a(csl.bE, 30, 60);
      $$0.a(csl.bF, 30, 60);
      $$0.a(csl.bG, 30, 60);
      $$0.a(csl.bH, 30, 60);
      $$0.a(csl.bI, 30, 60);
      $$0.a(csl.bJ, 30, 60);
      $$0.a(csl.bK, 30, 60);
      $$0.a(csl.bL, 30, 60);
      $$0.a(csl.bM, 30, 60);
      $$0.a(csl.bN, 30, 60);
      $$0.a(csl.bO, 30, 60);
      $$0.a(csl.bP, 30, 60);
      $$0.a(csl.ff, 15, 100);
      $$0.a(csl.iB, 5, 5);
      $$0.a(csl.ij, 60, 20);
      $$0.a(csl.pd, 15, 20);
      $$0.a(csl.ik, 60, 20);
      $$0.a(csl.il, 60, 20);
      $$0.a(csl.im, 60, 20);
      $$0.a(csl.in, 60, 20);
      $$0.a(csl.io, 60, 20);
      $$0.a(csl.ip, 60, 20);
      $$0.a(csl.iq, 60, 20);
      $$0.a(csl.ir, 60, 20);
      $$0.a(csl.is, 60, 20);
      $$0.a(csl.it, 60, 20);
      $$0.a(csl.iu, 60, 20);
      $$0.a(csl.iv, 60, 20);
      $$0.a(csl.iw, 60, 20);
      $$0.a(csl.ix, 60, 20);
      $$0.a(csl.iy, 60, 20);
      $$0.a(csl.iz, 60, 20);
      $$0.a(csl.me, 30, 60);
      $$0.a(csl.mZ, 60, 60);
      $$0.a(csl.nS, 60, 60);
      $$0.a(csl.oa, 30, 20);
      $$0.a(csl.pc, 5, 20);
      $$0.a(csl.oi, 60, 100);
      $$0.a(csl.pf, 5, 20);
      $$0.a(csl.pe, 30, 20);
      $$0.a(csl.aM, 30, 60);
      $$0.a(csl.aN, 30, 60);
      $$0.a(csl.ru, 15, 60);
      $$0.a(csl.rv, 15, 60);
      $$0.a(csl.rw, 60, 100);
      $$0.a(csl.rx, 30, 60);
      $$0.a(csl.ry, 30, 60);
      $$0.a(csl.rC, 60, 100);
      $$0.a(csl.rD, 60, 100);
      $$0.a(csl.rE, 60, 100);
      $$0.a(csl.rF, 30, 60);
      $$0.a(csl.fg, 15, 100);
   }
}
