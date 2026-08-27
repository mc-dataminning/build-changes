import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cvt extends csl {
   public static final int c = 15;
   public static final dgl d = dgb.aw;
   public static final dgc e = cyj.a;
   public static final dgc f = cyj.b;
   public static final dgc g = cyj.c;
   public static final dgc h = cyj.d;
   public static final dgc i = cyj.e;
   private static final Map<hc, dgc> j = cyj.g.entrySet().stream().filter($$0 -> $$0.getKey() != hc.a).collect(ac.a());
   private static final eii k = csx.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eii l = csx.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eii m = csx.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eii n = csx.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eii D = csx.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dfl, eii> E;
   private static final int F = 60;
   private static final int G = 30;
   private static final int H = 15;
   private static final int I = 5;
   private static final int J = 100;
   private static final int K = 60;
   private static final int L = 20;
   private static final int M = 5;
   private final Object2IntMap<csx> N = new Object2IntOpenHashMap();
   private final Object2IntMap<csx> O = new Object2IntOpenHashMap();

   public cvt(dfk.d $$0) {
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
      this.E = ImmutableMap.copyOf(this.C.a().stream().filter($$0x -> $$0x.c(d) == 0).collect(Collectors.toMap(Function.identity(), cvt::h)));
   }

   private static eii h(dfl $$0) {
      eii $$1 = eif.a();
      if ($$0.c(i)) {
         $$1 = k;
      }

      if ($$0.c(e)) {
         $$1 = eif.a($$1, n);
      }

      if ($$0.c(g)) {
         $$1 = eif.a($$1, D);
      }

      if ($$0.c(f)) {
         $$1 = eif.a($$1, m);
      }

      if ($$0.c(h)) {
         $$1 = eif.a($$1, l);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(d)) : csy.a.n();
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.E.get($$0.a(d, Integer.valueOf(0)));
   }

   @Override
   public dfl a(clp $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dfl b(cpd $$0, gw $$1) {
      gw $$2 = $$1.d();
      dfl $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, hc.b)) {
         dfl $$4 = this.n();

         for (hc $$5 : hc.values()) {
            dgc $$6 = j.get($$5);
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
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hc.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.X().b(cpt.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dfl $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.C_().q());
         int $$6 = $$0.c(d);
         if (!$$5 && $$1.Z() && this.a((cpx)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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
                  if (!$$1.a_($$8).d($$1, $$8, hc.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.s($$2).a(apt.ac);
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
                        int $$16 = this.a((cqa)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ai().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.Z() || !this.a((cpx)$$1, $$11))) {
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

   protected boolean a(cpx $$0, gw $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dfl $$0) {
      return $$0.b(dgb.C) && $$0.c(dgb.C) ? 0 : this.O.getInt($$0.b());
   }

   private int o(dfl $$0) {
      return $$0.b(dgb.C) && $$0.c(dgb.C) ? 0 : this.N.getInt($$0.b());
   }

   private void a(cpx $$0, gw $$1, int $$2, ase $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dfl $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         csx $$8 = $$6.b();
         if ($$8 instanceof dbh) {
            dbh.a($$0, $$1);
         }
      }
   }

   private dfl a(cpy $$0, gw $$1, int $$2) {
      dfl $$3 = a($$0, $$1);
      return $$3.a(csy.cr) ? $$3.a(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cpd $$0, gw $$1) {
      for (hc $$2 : hc.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cqa $$0, gw $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (hc $$3 : hc.values()) {
            dfl $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dfl $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(ase $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   private void a(csx $$0, int $$1, int $$2) {
      this.N.put($$0, $$1);
      this.O.put($$0, $$2);
   }

   public static void a() {
      cvt $$0 = (cvt)csy.cr;
      $$0.a(csy.n, 5, 20);
      $$0.a(csy.o, 5, 20);
      $$0.a(csy.p, 5, 20);
      $$0.a(csy.q, 5, 20);
      $$0.a(csy.r, 5, 20);
      $$0.a(csy.s, 5, 20);
      $$0.a(csy.t, 5, 20);
      $$0.a(csy.u, 5, 20);
      $$0.a(csy.v, 5, 20);
      $$0.a(csy.w, 5, 20);
      $$0.a(csy.jt, 5, 20);
      $$0.a(csy.ju, 5, 20);
      $$0.a(csy.jv, 5, 20);
      $$0.a(csy.jw, 5, 20);
      $$0.a(csy.jx, 5, 20);
      $$0.a(csy.jy, 5, 20);
      $$0.a(csy.jz, 5, 20);
      $$0.a(csy.jA, 5, 20);
      $$0.a(csy.jB, 5, 20);
      $$0.a(csy.jC, 5, 20);
      $$0.a(csy.fh, 5, 20);
      $$0.a(csy.jV, 5, 20);
      $$0.a(csy.jW, 5, 20);
      $$0.a(csy.jX, 5, 20);
      $$0.a(csy.jY, 5, 20);
      $$0.a(csy.jZ, 5, 20);
      $$0.a(csy.ka, 5, 20);
      $$0.a(csy.kb, 5, 20);
      $$0.a(csy.kc, 5, 20);
      $$0.a(csy.dU, 5, 20);
      $$0.a(csy.kd, 5, 20);
      $$0.a(csy.ke, 5, 20);
      $$0.a(csy.kf, 5, 20);
      $$0.a(csy.kg, 5, 20);
      $$0.a(csy.kh, 5, 20);
      $$0.a(csy.ki, 5, 20);
      $$0.a(csy.kj, 5, 20);
      $$0.a(csy.kk, 5, 20);
      $$0.a(csy.cu, 5, 20);
      $$0.a(csy.fL, 5, 20);
      $$0.a(csy.fK, 5, 20);
      $$0.a(csy.fM, 5, 20);
      $$0.a(csy.hP, 5, 20);
      $$0.a(csy.hQ, 5, 20);
      $$0.a(csy.hR, 5, 20);
      $$0.a(csy.hS, 5, 20);
      $$0.a(csy.hT, 5, 20);
      $$0.a(csy.hU, 5, 20);
      $$0.a(csy.U, 5, 5);
      $$0.a(csy.V, 5, 5);
      $$0.a(csy.W, 5, 5);
      $$0.a(csy.X, 5, 5);
      $$0.a(csy.Y, 5, 5);
      $$0.a(csy.Z, 5, 5);
      $$0.a(csy.aa, 5, 5);
      $$0.a(csy.ab, 5, 5);
      $$0.a(csy.ae, 5, 5);
      $$0.a(csy.al, 5, 5);
      $$0.a(csy.af, 5, 5);
      $$0.a(csy.ag, 5, 5);
      $$0.a(csy.ah, 5, 5);
      $$0.a(csy.ai, 5, 5);
      $$0.a(csy.aj, 5, 5);
      $$0.a(csy.ak, 5, 5);
      $$0.a(csy.am, 5, 5);
      $$0.a(csy.an, 5, 5);
      $$0.a(csy.aw, 5, 5);
      $$0.a(csy.ax, 5, 5);
      $$0.a(csy.ay, 5, 5);
      $$0.a(csy.az, 5, 5);
      $$0.a(csy.aA, 5, 5);
      $$0.a(csy.aB, 5, 5);
      $$0.a(csy.aC, 5, 5);
      $$0.a(csy.aD, 5, 5);
      $$0.a(csy.ao, 5, 5);
      $$0.a(csy.ap, 5, 5);
      $$0.a(csy.aq, 5, 5);
      $$0.a(csy.ar, 5, 5);
      $$0.a(csy.as, 5, 5);
      $$0.a(csy.at, 5, 5);
      $$0.a(csy.au, 5, 5);
      $$0.a(csy.av, 5, 5);
      $$0.a(csy.ac, 5, 20);
      $$0.a(csy.aE, 30, 60);
      $$0.a(csy.aF, 30, 60);
      $$0.a(csy.aG, 30, 60);
      $$0.a(csy.aH, 30, 60);
      $$0.a(csy.aI, 30, 60);
      $$0.a(csy.aJ, 30, 60);
      $$0.a(csy.aK, 30, 60);
      $$0.a(csy.aL, 30, 60);
      $$0.a(csy.cl, 30, 20);
      $$0.a(csy.ck, 15, 100);
      $$0.a(csy.bt, 60, 100);
      $$0.a(csy.bu, 60, 100);
      $$0.a(csy.bv, 60, 100);
      $$0.a(csy.iD, 60, 100);
      $$0.a(csy.iE, 60, 100);
      $$0.a(csy.iF, 60, 100);
      $$0.a(csy.iG, 60, 100);
      $$0.a(csy.iH, 60, 100);
      $$0.a(csy.iI, 60, 100);
      $$0.a(csy.bR, 60, 100);
      $$0.a(csy.bT, 60, 100);
      $$0.a(csy.bU, 60, 100);
      $$0.a(csy.bV, 60, 100);
      $$0.a(csy.bW, 60, 100);
      $$0.a(csy.bX, 60, 100);
      $$0.a(csy.bY, 60, 100);
      $$0.a(csy.bZ, 60, 100);
      $$0.a(csy.ca, 60, 100);
      $$0.a(csy.cb, 60, 100);
      $$0.a(csy.cc, 60, 100);
      $$0.a(csy.ce, 60, 100);
      $$0.a(csy.bS, 60, 100);
      $$0.a(csy.kC, 60, 100);
      $$0.a(csy.cd, 60, 100);
      $$0.a(csy.rA, 60, 100);
      $$0.a(csy.bA, 30, 60);
      $$0.a(csy.bB, 30, 60);
      $$0.a(csy.bC, 30, 60);
      $$0.a(csy.bD, 30, 60);
      $$0.a(csy.bE, 30, 60);
      $$0.a(csy.bF, 30, 60);
      $$0.a(csy.bG, 30, 60);
      $$0.a(csy.bH, 30, 60);
      $$0.a(csy.bI, 30, 60);
      $$0.a(csy.bJ, 30, 60);
      $$0.a(csy.bK, 30, 60);
      $$0.a(csy.bL, 30, 60);
      $$0.a(csy.bM, 30, 60);
      $$0.a(csy.bN, 30, 60);
      $$0.a(csy.bO, 30, 60);
      $$0.a(csy.bP, 30, 60);
      $$0.a(csy.ff, 15, 100);
      $$0.a(csy.iB, 5, 5);
      $$0.a(csy.ij, 60, 20);
      $$0.a(csy.pd, 15, 20);
      $$0.a(csy.ik, 60, 20);
      $$0.a(csy.il, 60, 20);
      $$0.a(csy.im, 60, 20);
      $$0.a(csy.in, 60, 20);
      $$0.a(csy.io, 60, 20);
      $$0.a(csy.ip, 60, 20);
      $$0.a(csy.iq, 60, 20);
      $$0.a(csy.ir, 60, 20);
      $$0.a(csy.is, 60, 20);
      $$0.a(csy.it, 60, 20);
      $$0.a(csy.iu, 60, 20);
      $$0.a(csy.iv, 60, 20);
      $$0.a(csy.iw, 60, 20);
      $$0.a(csy.ix, 60, 20);
      $$0.a(csy.iy, 60, 20);
      $$0.a(csy.iz, 60, 20);
      $$0.a(csy.me, 30, 60);
      $$0.a(csy.mZ, 60, 60);
      $$0.a(csy.nS, 60, 60);
      $$0.a(csy.oa, 30, 20);
      $$0.a(csy.pc, 5, 20);
      $$0.a(csy.oi, 60, 100);
      $$0.a(csy.pf, 5, 20);
      $$0.a(csy.pe, 30, 20);
      $$0.a(csy.aM, 30, 60);
      $$0.a(csy.aN, 30, 60);
      $$0.a(csy.ru, 15, 60);
      $$0.a(csy.rv, 15, 60);
      $$0.a(csy.rw, 60, 100);
      $$0.a(csy.rx, 30, 60);
      $$0.a(csy.ry, 30, 60);
      $$0.a(csy.rC, 60, 100);
      $$0.a(csy.rD, 60, 100);
      $$0.a(csy.rE, 60, 100);
      $$0.a(csy.rF, 30, 60);
      $$0.a(csy.fg, 15, 100);
   }
}
