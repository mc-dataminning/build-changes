import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cvi extends csa {
   public static final int c = 15;
   public static final dga d = dfq.aw;
   public static final dfr e = cxy.a;
   public static final dfr f = cxy.b;
   public static final dfr g = cxy.c;
   public static final dfr h = cxy.d;
   public static final dfr i = cxy.e;
   private static final Map<ha, dfr> j = cxy.g.entrySet().stream().filter($$0 -> $$0.getKey() != ha.a).collect(ac.a());
   private static final ehx k = csm.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehx l = csm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ehx m = csm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehx n = csm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ehx D = csm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dfa, ehx> E;
   private static final int F = 60;
   private static final int G = 30;
   private static final int H = 15;
   private static final int I = 5;
   private static final int J = 100;
   private static final int K = 60;
   private static final int L = 20;
   private static final int M = 5;
   private final Object2IntMap<csm> N = new Object2IntOpenHashMap();
   private final Object2IntMap<csm> O = new Object2IntOpenHashMap();

   public cvi(dez.d $$0) {
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
      this.E = ImmutableMap.copyOf(this.C.a().stream().filter($$0x -> $$0x.c(d) == 0).collect(Collectors.toMap(Function.identity(), cvi::h)));
   }

   private static ehx h(dfa $$0) {
      ehx $$1 = ehu.a();
      if ($$0.c(i)) {
         $$1 = k;
      }

      if ($$0.c(e)) {
         $$1 = ehu.a($$1, n);
      }

      if ($$0.c(g)) {
         $$1 = ehu.a($$1, D);
      }

      if ($$0.c(f)) {
         $$1 = ehu.a($$1, m);
      }

      if ($$0.c(h)) {
         $$1 = ehu.a($$1, l);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(d)) : csn.a.n();
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.E.get($$0.a(d, Integer.valueOf(0)));
   }

   @Override
   public dfa a(clg $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dfa b(cos $$0, gu $$1) {
      gu $$2 = $$1.d();
      dfa $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ha.b)) {
         dfa $$4 = this.n();

         for (ha $$5 : ha.values()) {
            dfr $$6 = j.get($$5);
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
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      gu $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ha.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.X().b(cpi.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dfa $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.x_().q());
         int $$6 = $$0.c(d);
         if (!$$5 && $$1.Z() && this.a((cpm)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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
                        int $$16 = this.a((cpp)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ai().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.Z() || !this.a((cpm)$$1, $$11))) {
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

   protected boolean a(cpm $$0, gu $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dfa $$0) {
      return $$0.b(dfq.C) && $$0.c(dfq.C) ? 0 : this.O.getInt($$0.b());
   }

   private int o(dfa $$0) {
      return $$0.b(dfq.C) && $$0.c(dfq.C) ? 0 : this.N.getInt($$0.b());
   }

   private void a(cpm $$0, gu $$1, int $$2, aru $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dfa $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         csm $$8 = $$6.b();
         if ($$8 instanceof daw) {
            daw.a($$0, $$1);
         }
      }
   }

   private dfa a(cpn $$0, gu $$1, int $$2) {
      dfa $$3 = a($$0, $$1);
      return $$3.a(csn.cr) ? $$3.a(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cos $$0, gu $$1) {
      for (ha $$2 : ha.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cpp $$0, gu $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ha $$3 : ha.values()) {
            dfa $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dfa $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(aru $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   private void a(csm $$0, int $$1, int $$2) {
      this.N.put($$0, $$1);
      this.O.put($$0, $$2);
   }

   public static void a() {
      cvi $$0 = (cvi)csn.cr;
      $$0.a(csn.n, 5, 20);
      $$0.a(csn.o, 5, 20);
      $$0.a(csn.p, 5, 20);
      $$0.a(csn.q, 5, 20);
      $$0.a(csn.r, 5, 20);
      $$0.a(csn.s, 5, 20);
      $$0.a(csn.t, 5, 20);
      $$0.a(csn.u, 5, 20);
      $$0.a(csn.v, 5, 20);
      $$0.a(csn.w, 5, 20);
      $$0.a(csn.jt, 5, 20);
      $$0.a(csn.ju, 5, 20);
      $$0.a(csn.jv, 5, 20);
      $$0.a(csn.jw, 5, 20);
      $$0.a(csn.jx, 5, 20);
      $$0.a(csn.jy, 5, 20);
      $$0.a(csn.jz, 5, 20);
      $$0.a(csn.jA, 5, 20);
      $$0.a(csn.jB, 5, 20);
      $$0.a(csn.jC, 5, 20);
      $$0.a(csn.fh, 5, 20);
      $$0.a(csn.jV, 5, 20);
      $$0.a(csn.jW, 5, 20);
      $$0.a(csn.jX, 5, 20);
      $$0.a(csn.jY, 5, 20);
      $$0.a(csn.jZ, 5, 20);
      $$0.a(csn.ka, 5, 20);
      $$0.a(csn.kb, 5, 20);
      $$0.a(csn.kc, 5, 20);
      $$0.a(csn.dU, 5, 20);
      $$0.a(csn.kd, 5, 20);
      $$0.a(csn.ke, 5, 20);
      $$0.a(csn.kf, 5, 20);
      $$0.a(csn.kg, 5, 20);
      $$0.a(csn.kh, 5, 20);
      $$0.a(csn.ki, 5, 20);
      $$0.a(csn.kj, 5, 20);
      $$0.a(csn.kk, 5, 20);
      $$0.a(csn.cu, 5, 20);
      $$0.a(csn.fL, 5, 20);
      $$0.a(csn.fK, 5, 20);
      $$0.a(csn.fM, 5, 20);
      $$0.a(csn.hP, 5, 20);
      $$0.a(csn.hQ, 5, 20);
      $$0.a(csn.hR, 5, 20);
      $$0.a(csn.hS, 5, 20);
      $$0.a(csn.hT, 5, 20);
      $$0.a(csn.hU, 5, 20);
      $$0.a(csn.U, 5, 5);
      $$0.a(csn.V, 5, 5);
      $$0.a(csn.W, 5, 5);
      $$0.a(csn.X, 5, 5);
      $$0.a(csn.Y, 5, 5);
      $$0.a(csn.Z, 5, 5);
      $$0.a(csn.aa, 5, 5);
      $$0.a(csn.ab, 5, 5);
      $$0.a(csn.ae, 5, 5);
      $$0.a(csn.al, 5, 5);
      $$0.a(csn.af, 5, 5);
      $$0.a(csn.ag, 5, 5);
      $$0.a(csn.ah, 5, 5);
      $$0.a(csn.ai, 5, 5);
      $$0.a(csn.aj, 5, 5);
      $$0.a(csn.ak, 5, 5);
      $$0.a(csn.am, 5, 5);
      $$0.a(csn.an, 5, 5);
      $$0.a(csn.aw, 5, 5);
      $$0.a(csn.ax, 5, 5);
      $$0.a(csn.ay, 5, 5);
      $$0.a(csn.az, 5, 5);
      $$0.a(csn.aA, 5, 5);
      $$0.a(csn.aB, 5, 5);
      $$0.a(csn.aC, 5, 5);
      $$0.a(csn.aD, 5, 5);
      $$0.a(csn.ao, 5, 5);
      $$0.a(csn.ap, 5, 5);
      $$0.a(csn.aq, 5, 5);
      $$0.a(csn.ar, 5, 5);
      $$0.a(csn.as, 5, 5);
      $$0.a(csn.at, 5, 5);
      $$0.a(csn.au, 5, 5);
      $$0.a(csn.av, 5, 5);
      $$0.a(csn.ac, 5, 20);
      $$0.a(csn.aE, 30, 60);
      $$0.a(csn.aF, 30, 60);
      $$0.a(csn.aG, 30, 60);
      $$0.a(csn.aH, 30, 60);
      $$0.a(csn.aI, 30, 60);
      $$0.a(csn.aJ, 30, 60);
      $$0.a(csn.aK, 30, 60);
      $$0.a(csn.aL, 30, 60);
      $$0.a(csn.cl, 30, 20);
      $$0.a(csn.ck, 15, 100);
      $$0.a(csn.bt, 60, 100);
      $$0.a(csn.bu, 60, 100);
      $$0.a(csn.bv, 60, 100);
      $$0.a(csn.iD, 60, 100);
      $$0.a(csn.iE, 60, 100);
      $$0.a(csn.iF, 60, 100);
      $$0.a(csn.iG, 60, 100);
      $$0.a(csn.iH, 60, 100);
      $$0.a(csn.iI, 60, 100);
      $$0.a(csn.bR, 60, 100);
      $$0.a(csn.bT, 60, 100);
      $$0.a(csn.bU, 60, 100);
      $$0.a(csn.bV, 60, 100);
      $$0.a(csn.bW, 60, 100);
      $$0.a(csn.bX, 60, 100);
      $$0.a(csn.bY, 60, 100);
      $$0.a(csn.bZ, 60, 100);
      $$0.a(csn.ca, 60, 100);
      $$0.a(csn.cb, 60, 100);
      $$0.a(csn.cc, 60, 100);
      $$0.a(csn.ce, 60, 100);
      $$0.a(csn.bS, 60, 100);
      $$0.a(csn.kC, 60, 100);
      $$0.a(csn.cd, 60, 100);
      $$0.a(csn.rA, 60, 100);
      $$0.a(csn.bA, 30, 60);
      $$0.a(csn.bB, 30, 60);
      $$0.a(csn.bC, 30, 60);
      $$0.a(csn.bD, 30, 60);
      $$0.a(csn.bE, 30, 60);
      $$0.a(csn.bF, 30, 60);
      $$0.a(csn.bG, 30, 60);
      $$0.a(csn.bH, 30, 60);
      $$0.a(csn.bI, 30, 60);
      $$0.a(csn.bJ, 30, 60);
      $$0.a(csn.bK, 30, 60);
      $$0.a(csn.bL, 30, 60);
      $$0.a(csn.bM, 30, 60);
      $$0.a(csn.bN, 30, 60);
      $$0.a(csn.bO, 30, 60);
      $$0.a(csn.bP, 30, 60);
      $$0.a(csn.ff, 15, 100);
      $$0.a(csn.iB, 5, 5);
      $$0.a(csn.ij, 60, 20);
      $$0.a(csn.pd, 15, 20);
      $$0.a(csn.ik, 60, 20);
      $$0.a(csn.il, 60, 20);
      $$0.a(csn.im, 60, 20);
      $$0.a(csn.in, 60, 20);
      $$0.a(csn.io, 60, 20);
      $$0.a(csn.ip, 60, 20);
      $$0.a(csn.iq, 60, 20);
      $$0.a(csn.ir, 60, 20);
      $$0.a(csn.is, 60, 20);
      $$0.a(csn.it, 60, 20);
      $$0.a(csn.iu, 60, 20);
      $$0.a(csn.iv, 60, 20);
      $$0.a(csn.iw, 60, 20);
      $$0.a(csn.ix, 60, 20);
      $$0.a(csn.iy, 60, 20);
      $$0.a(csn.iz, 60, 20);
      $$0.a(csn.me, 30, 60);
      $$0.a(csn.mZ, 60, 60);
      $$0.a(csn.nS, 60, 60);
      $$0.a(csn.oa, 30, 20);
      $$0.a(csn.pc, 5, 20);
      $$0.a(csn.oi, 60, 100);
      $$0.a(csn.pf, 5, 20);
      $$0.a(csn.pe, 30, 20);
      $$0.a(csn.aM, 30, 60);
      $$0.a(csn.aN, 30, 60);
      $$0.a(csn.ru, 15, 60);
      $$0.a(csn.rv, 15, 60);
      $$0.a(csn.rw, 60, 100);
      $$0.a(csn.rx, 30, 60);
      $$0.a(csn.ry, 30, 60);
      $$0.a(csn.rC, 60, 100);
      $$0.a(csn.rD, 60, 100);
      $$0.a(csn.rE, 60, 100);
      $$0.a(csn.rF, 30, 60);
      $$0.a(csn.fg, 15, 100);
   }
}
