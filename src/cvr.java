import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cvr extends csj {
   public static final int c = 15;
   public static final dgj d = dfz.aw;
   public static final dga e = cyh.a;
   public static final dga f = cyh.b;
   public static final dga g = cyh.c;
   public static final dga h = cyh.d;
   public static final dga i = cyh.e;
   private static final Map<ha, dga> j = cyh.g.entrySet().stream().filter($$0 -> $$0.getKey() != ha.a).collect(ac.a());
   private static final eig k = csv.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eig l = csv.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eig m = csv.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eig n = csv.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eig D = csv.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dfj, eig> E;
   private static final int F = 60;
   private static final int G = 30;
   private static final int H = 15;
   private static final int I = 5;
   private static final int J = 100;
   private static final int K = 60;
   private static final int L = 20;
   private static final int M = 5;
   private final Object2IntMap<csv> N = new Object2IntOpenHashMap();
   private final Object2IntMap<csv> O = new Object2IntOpenHashMap();

   public cvr(dfi.d $$0) {
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
      this.E = ImmutableMap.copyOf(this.C.a().stream().filter($$0x -> $$0x.c(d) == 0).collect(Collectors.toMap(Function.identity(), cvr::h)));
   }

   private static eig h(dfj $$0) {
      eig $$1 = eid.a();
      if ($$0.c(i)) {
         $$1 = k;
      }

      if ($$0.c(e)) {
         $$1 = eid.a($$1, n);
      }

      if ($$0.c(g)) {
         $$1 = eid.a($$1, D);
      }

      if ($$0.c(f)) {
         $$1 = eid.a($$1, m);
      }

      if ($$0.c(h)) {
         $$1 = eid.a($$1, l);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(d)) : csw.a.n();
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.E.get($$0.a(d, Integer.valueOf(0)));
   }

   @Override
   public dfj a(cln $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dfj b(cpb $$0, gw $$1) {
      gw $$2 = $$1.d();
      dfj $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ha.b)) {
         dfj $$4 = this.n();

         for (ha $$5 : ha.values()) {
            dga $$6 = j.get($$5);
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
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      gw $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ha.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.X().b(cpr.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dfj $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.C_().q());
         int $$6 = $$0.c(d);
         if (!$$5 && $$1.Z() && this.a((cpv)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(d, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  gw $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, ha.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.s($$2).a(apr.ac);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            gw.a $$11 = new gw.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((cpy)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ai().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.Z() || !this.a((cpv)$$1, $$11))) {
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

   protected boolean a(cpv $$0, gw $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dfj $$0) {
      return $$0.b(dfz.C) && $$0.c(dfz.C) ? 0 : this.O.getInt($$0.b());
   }

   private int o(dfj $$0) {
      return $$0.b(dfz.C) && $$0.c(dfz.C) ? 0 : this.N.getInt($$0.b());
   }

   private void a(cpv $$0, gw $$1, int $$2, asc $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dfj $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         csv $$8 = $$6.b();
         if ($$8 instanceof dbf) {
            dbf.a($$0, $$1);
         }
      }
   }

   private dfj a(cpw $$0, gw $$1, int $$2) {
      dfj $$3 = a($$0, $$1);
      return $$3.a(csw.cr) ? $$3.a(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cpb $$0, gw $$1) {
      for (ha $$2 : ha.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cpy $$0, gw $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ha $$3 : ha.values()) {
            dfj $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dfj $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(asc $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   private void a(csv $$0, int $$1, int $$2) {
      this.N.put($$0, $$1);
      this.O.put($$0, $$2);
   }

   public static void a() {
      cvr $$0 = (cvr)csw.cr;
      $$0.a(csw.n, 5, 20);
      $$0.a(csw.o, 5, 20);
      $$0.a(csw.p, 5, 20);
      $$0.a(csw.q, 5, 20);
      $$0.a(csw.r, 5, 20);
      $$0.a(csw.s, 5, 20);
      $$0.a(csw.t, 5, 20);
      $$0.a(csw.u, 5, 20);
      $$0.a(csw.v, 5, 20);
      $$0.a(csw.w, 5, 20);
      $$0.a(csw.jt, 5, 20);
      $$0.a(csw.ju, 5, 20);
      $$0.a(csw.jv, 5, 20);
      $$0.a(csw.jw, 5, 20);
      $$0.a(csw.jx, 5, 20);
      $$0.a(csw.jy, 5, 20);
      $$0.a(csw.jz, 5, 20);
      $$0.a(csw.jA, 5, 20);
      $$0.a(csw.jB, 5, 20);
      $$0.a(csw.jC, 5, 20);
      $$0.a(csw.fh, 5, 20);
      $$0.a(csw.jV, 5, 20);
      $$0.a(csw.jW, 5, 20);
      $$0.a(csw.jX, 5, 20);
      $$0.a(csw.jY, 5, 20);
      $$0.a(csw.jZ, 5, 20);
      $$0.a(csw.ka, 5, 20);
      $$0.a(csw.kb, 5, 20);
      $$0.a(csw.kc, 5, 20);
      $$0.a(csw.dU, 5, 20);
      $$0.a(csw.kd, 5, 20);
      $$0.a(csw.ke, 5, 20);
      $$0.a(csw.kf, 5, 20);
      $$0.a(csw.kg, 5, 20);
      $$0.a(csw.kh, 5, 20);
      $$0.a(csw.ki, 5, 20);
      $$0.a(csw.kj, 5, 20);
      $$0.a(csw.kk, 5, 20);
      $$0.a(csw.cu, 5, 20);
      $$0.a(csw.fL, 5, 20);
      $$0.a(csw.fK, 5, 20);
      $$0.a(csw.fM, 5, 20);
      $$0.a(csw.hP, 5, 20);
      $$0.a(csw.hQ, 5, 20);
      $$0.a(csw.hR, 5, 20);
      $$0.a(csw.hS, 5, 20);
      $$0.a(csw.hT, 5, 20);
      $$0.a(csw.hU, 5, 20);
      $$0.a(csw.U, 5, 5);
      $$0.a(csw.V, 5, 5);
      $$0.a(csw.W, 5, 5);
      $$0.a(csw.X, 5, 5);
      $$0.a(csw.Y, 5, 5);
      $$0.a(csw.Z, 5, 5);
      $$0.a(csw.aa, 5, 5);
      $$0.a(csw.ab, 5, 5);
      $$0.a(csw.ae, 5, 5);
      $$0.a(csw.al, 5, 5);
      $$0.a(csw.af, 5, 5);
      $$0.a(csw.ag, 5, 5);
      $$0.a(csw.ah, 5, 5);
      $$0.a(csw.ai, 5, 5);
      $$0.a(csw.aj, 5, 5);
      $$0.a(csw.ak, 5, 5);
      $$0.a(csw.am, 5, 5);
      $$0.a(csw.an, 5, 5);
      $$0.a(csw.aw, 5, 5);
      $$0.a(csw.ax, 5, 5);
      $$0.a(csw.ay, 5, 5);
      $$0.a(csw.az, 5, 5);
      $$0.a(csw.aA, 5, 5);
      $$0.a(csw.aB, 5, 5);
      $$0.a(csw.aC, 5, 5);
      $$0.a(csw.aD, 5, 5);
      $$0.a(csw.ao, 5, 5);
      $$0.a(csw.ap, 5, 5);
      $$0.a(csw.aq, 5, 5);
      $$0.a(csw.ar, 5, 5);
      $$0.a(csw.as, 5, 5);
      $$0.a(csw.at, 5, 5);
      $$0.a(csw.au, 5, 5);
      $$0.a(csw.av, 5, 5);
      $$0.a(csw.ac, 5, 20);
      $$0.a(csw.aE, 30, 60);
      $$0.a(csw.aF, 30, 60);
      $$0.a(csw.aG, 30, 60);
      $$0.a(csw.aH, 30, 60);
      $$0.a(csw.aI, 30, 60);
      $$0.a(csw.aJ, 30, 60);
      $$0.a(csw.aK, 30, 60);
      $$0.a(csw.aL, 30, 60);
      $$0.a(csw.cl, 30, 20);
      $$0.a(csw.ck, 15, 100);
      $$0.a(csw.bt, 60, 100);
      $$0.a(csw.bu, 60, 100);
      $$0.a(csw.bv, 60, 100);
      $$0.a(csw.iD, 60, 100);
      $$0.a(csw.iE, 60, 100);
      $$0.a(csw.iF, 60, 100);
      $$0.a(csw.iG, 60, 100);
      $$0.a(csw.iH, 60, 100);
      $$0.a(csw.iI, 60, 100);
      $$0.a(csw.bR, 60, 100);
      $$0.a(csw.bT, 60, 100);
      $$0.a(csw.bU, 60, 100);
      $$0.a(csw.bV, 60, 100);
      $$0.a(csw.bW, 60, 100);
      $$0.a(csw.bX, 60, 100);
      $$0.a(csw.bY, 60, 100);
      $$0.a(csw.bZ, 60, 100);
      $$0.a(csw.ca, 60, 100);
      $$0.a(csw.cb, 60, 100);
      $$0.a(csw.cc, 60, 100);
      $$0.a(csw.ce, 60, 100);
      $$0.a(csw.bS, 60, 100);
      $$0.a(csw.kC, 60, 100);
      $$0.a(csw.cd, 60, 100);
      $$0.a(csw.rA, 60, 100);
      $$0.a(csw.bA, 30, 60);
      $$0.a(csw.bB, 30, 60);
      $$0.a(csw.bC, 30, 60);
      $$0.a(csw.bD, 30, 60);
      $$0.a(csw.bE, 30, 60);
      $$0.a(csw.bF, 30, 60);
      $$0.a(csw.bG, 30, 60);
      $$0.a(csw.bH, 30, 60);
      $$0.a(csw.bI, 30, 60);
      $$0.a(csw.bJ, 30, 60);
      $$0.a(csw.bK, 30, 60);
      $$0.a(csw.bL, 30, 60);
      $$0.a(csw.bM, 30, 60);
      $$0.a(csw.bN, 30, 60);
      $$0.a(csw.bO, 30, 60);
      $$0.a(csw.bP, 30, 60);
      $$0.a(csw.ff, 15, 100);
      $$0.a(csw.iB, 5, 5);
      $$0.a(csw.ij, 60, 20);
      $$0.a(csw.pd, 15, 20);
      $$0.a(csw.ik, 60, 20);
      $$0.a(csw.il, 60, 20);
      $$0.a(csw.im, 60, 20);
      $$0.a(csw.in, 60, 20);
      $$0.a(csw.io, 60, 20);
      $$0.a(csw.ip, 60, 20);
      $$0.a(csw.iq, 60, 20);
      $$0.a(csw.ir, 60, 20);
      $$0.a(csw.is, 60, 20);
      $$0.a(csw.it, 60, 20);
      $$0.a(csw.iu, 60, 20);
      $$0.a(csw.iv, 60, 20);
      $$0.a(csw.iw, 60, 20);
      $$0.a(csw.ix, 60, 20);
      $$0.a(csw.iy, 60, 20);
      $$0.a(csw.iz, 60, 20);
      $$0.a(csw.me, 30, 60);
      $$0.a(csw.mZ, 60, 60);
      $$0.a(csw.nS, 60, 60);
      $$0.a(csw.oa, 30, 20);
      $$0.a(csw.pc, 5, 20);
      $$0.a(csw.oi, 60, 100);
      $$0.a(csw.pf, 5, 20);
      $$0.a(csw.pe, 30, 20);
      $$0.a(csw.aM, 30, 60);
      $$0.a(csw.aN, 30, 60);
      $$0.a(csw.ru, 15, 60);
      $$0.a(csw.rv, 15, 60);
      $$0.a(csw.rw, 60, 100);
      $$0.a(csw.rx, 30, 60);
      $$0.a(csw.ry, 30, 60);
      $$0.a(csw.rC, 60, 100);
      $$0.a(csw.rD, 60, 100);
      $$0.a(csw.rE, 60, 100);
      $$0.a(csw.rF, 30, 60);
      $$0.a(csw.fg, 15, 100);
   }
}
