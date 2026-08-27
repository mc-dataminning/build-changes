import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cvh extends crz {
   public static final int c = 15;
   public static final dfz d = dfp.aw;
   public static final dfq e = cxx.a;
   public static final dfq f = cxx.b;
   public static final dfq g = cxx.c;
   public static final dfq h = cxx.d;
   public static final dfq i = cxx.e;
   private static final Map<ha, dfq> j = cxx.g.entrySet().stream().filter($$0 -> $$0.getKey() != ha.a).collect(ac.a());
   private static final ehw k = csl.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehw l = csl.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ehw m = csl.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehw n = csl.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ehw D = csl.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dez, ehw> E;
   private static final int F = 60;
   private static final int G = 30;
   private static final int H = 15;
   private static final int I = 5;
   private static final int J = 100;
   private static final int K = 60;
   private static final int L = 20;
   private static final int M = 5;
   private final Object2IntMap<csl> N = new Object2IntOpenHashMap();
   private final Object2IntMap<csl> O = new Object2IntOpenHashMap();

   public cvh(dey.d $$0) {
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
      this.E = ImmutableMap.copyOf(this.C.a().stream().filter($$0x -> $$0x.c(d) == 0).collect(Collectors.toMap(Function.identity(), cvh::h)));
   }

   private static ehw h(dez $$0) {
      ehw $$1 = eht.a();
      if ($$0.c(i)) {
         $$1 = k;
      }

      if ($$0.c(e)) {
         $$1 = eht.a($$1, n);
      }

      if ($$0.c(g)) {
         $$1 = eht.a($$1, D);
      }

      if ($$0.c(f)) {
         $$1 = eht.a($$1, m);
      }

      if ($$0.c(h)) {
         $$1 = eht.a($$1, l);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(d)) : csm.a.n();
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.E.get($$0.a(d, Integer.valueOf(0)));
   }

   @Override
   public dez a(clf $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dez b(cor $$0, gu $$1) {
      gu $$2 = $$1.d();
      dez $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ha.b)) {
         dez $$4 = this.n();

         for (ha $$5 : ha.values()) {
            dfq $$6 = j.get($$5);
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
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      gu $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ha.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.X().b(cph.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dez $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.x_().q());
         int $$6 = $$0.c(d);
         if (!$$5 && $$1.Z() && this.a((cpl)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(d, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  gu $$8 = $$2.d();
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

            boolean $$9 = $$1.s($$2).a(apk.ac);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            gu.a $$11 = new gu.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((cpo)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ai().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.Z() || !this.a((cpl)$$1, $$11))) {
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

   protected boolean a(cpl $$0, gu $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dez $$0) {
      return $$0.b(dfp.C) && $$0.c(dfp.C) ? 0 : this.O.getInt($$0.b());
   }

   private int o(dez $$0) {
      return $$0.b(dfp.C) && $$0.c(dfp.C) ? 0 : this.N.getInt($$0.b());
   }

   private void a(cpl $$0, gu $$1, int $$2, aru $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dez $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         csl $$8 = $$6.b();
         if ($$8 instanceof dav) {
            dav.a($$0, $$1);
         }
      }
   }

   private dez a(cpm $$0, gu $$1, int $$2) {
      dez $$3 = a($$0, $$1);
      return $$3.a(csm.cr) ? $$3.a(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cor $$0, gu $$1) {
      for (ha $$2 : ha.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cpo $$0, gu $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ha $$3 : ha.values()) {
            dez $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dez $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(aru $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   private void a(csl $$0, int $$1, int $$2) {
      this.N.put($$0, $$1);
      this.O.put($$0, $$2);
   }

   public static void a() {
      cvh $$0 = (cvh)csm.cr;
      $$0.a(csm.n, 5, 20);
      $$0.a(csm.o, 5, 20);
      $$0.a(csm.p, 5, 20);
      $$0.a(csm.q, 5, 20);
      $$0.a(csm.r, 5, 20);
      $$0.a(csm.s, 5, 20);
      $$0.a(csm.t, 5, 20);
      $$0.a(csm.u, 5, 20);
      $$0.a(csm.v, 5, 20);
      $$0.a(csm.w, 5, 20);
      $$0.a(csm.jt, 5, 20);
      $$0.a(csm.ju, 5, 20);
      $$0.a(csm.jv, 5, 20);
      $$0.a(csm.jw, 5, 20);
      $$0.a(csm.jx, 5, 20);
      $$0.a(csm.jy, 5, 20);
      $$0.a(csm.jz, 5, 20);
      $$0.a(csm.jA, 5, 20);
      $$0.a(csm.jB, 5, 20);
      $$0.a(csm.jC, 5, 20);
      $$0.a(csm.fh, 5, 20);
      $$0.a(csm.jV, 5, 20);
      $$0.a(csm.jW, 5, 20);
      $$0.a(csm.jX, 5, 20);
      $$0.a(csm.jY, 5, 20);
      $$0.a(csm.jZ, 5, 20);
      $$0.a(csm.ka, 5, 20);
      $$0.a(csm.kb, 5, 20);
      $$0.a(csm.kc, 5, 20);
      $$0.a(csm.dU, 5, 20);
      $$0.a(csm.kd, 5, 20);
      $$0.a(csm.ke, 5, 20);
      $$0.a(csm.kf, 5, 20);
      $$0.a(csm.kg, 5, 20);
      $$0.a(csm.kh, 5, 20);
      $$0.a(csm.ki, 5, 20);
      $$0.a(csm.kj, 5, 20);
      $$0.a(csm.kk, 5, 20);
      $$0.a(csm.cu, 5, 20);
      $$0.a(csm.fL, 5, 20);
      $$0.a(csm.fK, 5, 20);
      $$0.a(csm.fM, 5, 20);
      $$0.a(csm.hP, 5, 20);
      $$0.a(csm.hQ, 5, 20);
      $$0.a(csm.hR, 5, 20);
      $$0.a(csm.hS, 5, 20);
      $$0.a(csm.hT, 5, 20);
      $$0.a(csm.hU, 5, 20);
      $$0.a(csm.U, 5, 5);
      $$0.a(csm.V, 5, 5);
      $$0.a(csm.W, 5, 5);
      $$0.a(csm.X, 5, 5);
      $$0.a(csm.Y, 5, 5);
      $$0.a(csm.Z, 5, 5);
      $$0.a(csm.aa, 5, 5);
      $$0.a(csm.ab, 5, 5);
      $$0.a(csm.ae, 5, 5);
      $$0.a(csm.al, 5, 5);
      $$0.a(csm.af, 5, 5);
      $$0.a(csm.ag, 5, 5);
      $$0.a(csm.ah, 5, 5);
      $$0.a(csm.ai, 5, 5);
      $$0.a(csm.aj, 5, 5);
      $$0.a(csm.ak, 5, 5);
      $$0.a(csm.am, 5, 5);
      $$0.a(csm.an, 5, 5);
      $$0.a(csm.aw, 5, 5);
      $$0.a(csm.ax, 5, 5);
      $$0.a(csm.ay, 5, 5);
      $$0.a(csm.az, 5, 5);
      $$0.a(csm.aA, 5, 5);
      $$0.a(csm.aB, 5, 5);
      $$0.a(csm.aC, 5, 5);
      $$0.a(csm.aD, 5, 5);
      $$0.a(csm.ao, 5, 5);
      $$0.a(csm.ap, 5, 5);
      $$0.a(csm.aq, 5, 5);
      $$0.a(csm.ar, 5, 5);
      $$0.a(csm.as, 5, 5);
      $$0.a(csm.at, 5, 5);
      $$0.a(csm.au, 5, 5);
      $$0.a(csm.av, 5, 5);
      $$0.a(csm.ac, 5, 20);
      $$0.a(csm.aE, 30, 60);
      $$0.a(csm.aF, 30, 60);
      $$0.a(csm.aG, 30, 60);
      $$0.a(csm.aH, 30, 60);
      $$0.a(csm.aI, 30, 60);
      $$0.a(csm.aJ, 30, 60);
      $$0.a(csm.aK, 30, 60);
      $$0.a(csm.aL, 30, 60);
      $$0.a(csm.cl, 30, 20);
      $$0.a(csm.ck, 15, 100);
      $$0.a(csm.bt, 60, 100);
      $$0.a(csm.bu, 60, 100);
      $$0.a(csm.bv, 60, 100);
      $$0.a(csm.iD, 60, 100);
      $$0.a(csm.iE, 60, 100);
      $$0.a(csm.iF, 60, 100);
      $$0.a(csm.iG, 60, 100);
      $$0.a(csm.iH, 60, 100);
      $$0.a(csm.iI, 60, 100);
      $$0.a(csm.bR, 60, 100);
      $$0.a(csm.bT, 60, 100);
      $$0.a(csm.bU, 60, 100);
      $$0.a(csm.bV, 60, 100);
      $$0.a(csm.bW, 60, 100);
      $$0.a(csm.bX, 60, 100);
      $$0.a(csm.bY, 60, 100);
      $$0.a(csm.bZ, 60, 100);
      $$0.a(csm.ca, 60, 100);
      $$0.a(csm.cb, 60, 100);
      $$0.a(csm.cc, 60, 100);
      $$0.a(csm.ce, 60, 100);
      $$0.a(csm.bS, 60, 100);
      $$0.a(csm.kC, 60, 100);
      $$0.a(csm.cd, 60, 100);
      $$0.a(csm.rA, 60, 100);
      $$0.a(csm.bA, 30, 60);
      $$0.a(csm.bB, 30, 60);
      $$0.a(csm.bC, 30, 60);
      $$0.a(csm.bD, 30, 60);
      $$0.a(csm.bE, 30, 60);
      $$0.a(csm.bF, 30, 60);
      $$0.a(csm.bG, 30, 60);
      $$0.a(csm.bH, 30, 60);
      $$0.a(csm.bI, 30, 60);
      $$0.a(csm.bJ, 30, 60);
      $$0.a(csm.bK, 30, 60);
      $$0.a(csm.bL, 30, 60);
      $$0.a(csm.bM, 30, 60);
      $$0.a(csm.bN, 30, 60);
      $$0.a(csm.bO, 30, 60);
      $$0.a(csm.bP, 30, 60);
      $$0.a(csm.ff, 15, 100);
      $$0.a(csm.iB, 5, 5);
      $$0.a(csm.ij, 60, 20);
      $$0.a(csm.pd, 15, 20);
      $$0.a(csm.ik, 60, 20);
      $$0.a(csm.il, 60, 20);
      $$0.a(csm.im, 60, 20);
      $$0.a(csm.in, 60, 20);
      $$0.a(csm.io, 60, 20);
      $$0.a(csm.ip, 60, 20);
      $$0.a(csm.iq, 60, 20);
      $$0.a(csm.ir, 60, 20);
      $$0.a(csm.is, 60, 20);
      $$0.a(csm.it, 60, 20);
      $$0.a(csm.iu, 60, 20);
      $$0.a(csm.iv, 60, 20);
      $$0.a(csm.iw, 60, 20);
      $$0.a(csm.ix, 60, 20);
      $$0.a(csm.iy, 60, 20);
      $$0.a(csm.iz, 60, 20);
      $$0.a(csm.me, 30, 60);
      $$0.a(csm.mZ, 60, 60);
      $$0.a(csm.nS, 60, 60);
      $$0.a(csm.oa, 30, 20);
      $$0.a(csm.pc, 5, 20);
      $$0.a(csm.oi, 60, 100);
      $$0.a(csm.pf, 5, 20);
      $$0.a(csm.pe, 30, 20);
      $$0.a(csm.aM, 30, 60);
      $$0.a(csm.aN, 30, 60);
      $$0.a(csm.ru, 15, 60);
      $$0.a(csm.rv, 15, 60);
      $$0.a(csm.rw, 60, 100);
      $$0.a(csm.rx, 30, 60);
      $$0.a(csm.ry, 30, 60);
      $$0.a(csm.rC, 60, 100);
      $$0.a(csm.rD, 60, 100);
      $$0.a(csm.rE, 60, 100);
      $$0.a(csm.rF, 30, 60);
      $$0.a(csm.fg, 15, 100);
   }
}
