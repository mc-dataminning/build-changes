import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cvm extends cse {
   public static final int c = 15;
   public static final dge d = dfu.aw;
   public static final dfv e = cyc.a;
   public static final dfv f = cyc.b;
   public static final dfv g = cyc.c;
   public static final dfv h = cyc.d;
   public static final dfv i = cyc.e;
   private static final Map<hc, dfv> j = cyc.g.entrySet().stream().filter($$0 -> $$0.getKey() != hc.a).collect(ac.a());
   private static final eib k = csq.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eib l = csq.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eib m = csq.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eib n = csq.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eib D = csq.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dfe, eib> E;
   private static final int F = 60;
   private static final int G = 30;
   private static final int H = 15;
   private static final int I = 5;
   private static final int J = 100;
   private static final int K = 60;
   private static final int L = 20;
   private static final int M = 5;
   private final Object2IntMap<csq> N = new Object2IntOpenHashMap();
   private final Object2IntMap<csq> O = new Object2IntOpenHashMap();

   public cvm(dfd.d $$0) {
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
      this.E = ImmutableMap.copyOf(this.C.a().stream().filter($$0x -> $$0x.c(d) == 0).collect(Collectors.toMap(Function.identity(), cvm::h)));
   }

   private static eib h(dfe $$0) {
      eib $$1 = ehy.a();
      if ($$0.c(i)) {
         $$1 = k;
      }

      if ($$0.c(e)) {
         $$1 = ehy.a($$1, n);
      }

      if ($$0.c(g)) {
         $$1 = ehy.a($$1, D);
      }

      if ($$0.c(f)) {
         $$1 = ehy.a($$1, m);
      }

      if ($$0.c(h)) {
         $$1 = ehy.a($$1, l);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(d)) : csr.a.n();
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.E.get($$0.a(d, Integer.valueOf(0)));
   }

   @Override
   public dfe a(cli $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dfe b(cow $$0, gw $$1) {
      gw $$2 = $$1.d();
      dfe $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, hc.b)) {
         dfe $$4 = this.n();

         for (hc $$5 : hc.values()) {
            dfv $$6 = j.get($$5);
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
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hc.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.X().b(cpm.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dfe $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.x_().q());
         int $$6 = $$0.c(d);
         if (!$$5 && $$1.Z() && this.a((cpq)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.s($$2).a(apn.ac);
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
                        int $$16 = this.a((cpt)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ai().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.Z() || !this.a((cpq)$$1, $$11))) {
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

   protected boolean a(cpq $$0, gw $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dfe $$0) {
      return $$0.b(dfu.C) && $$0.c(dfu.C) ? 0 : this.O.getInt($$0.b());
   }

   private int o(dfe $$0) {
      return $$0.b(dfu.C) && $$0.c(dfu.C) ? 0 : this.N.getInt($$0.b());
   }

   private void a(cpq $$0, gw $$1, int $$2, arx $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dfe $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         csq $$8 = $$6.b();
         if ($$8 instanceof dba) {
            dba.a($$0, $$1);
         }
      }
   }

   private dfe a(cpr $$0, gw $$1, int $$2) {
      dfe $$3 = a($$0, $$1);
      return $$3.a(csr.cr) ? $$3.a(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cow $$0, gw $$1) {
      for (hc $$2 : hc.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cpt $$0, gw $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (hc $$3 : hc.values()) {
            dfe $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dfe $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(arx $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   private void a(csq $$0, int $$1, int $$2) {
      this.N.put($$0, $$1);
      this.O.put($$0, $$2);
   }

   public static void a() {
      cvm $$0 = (cvm)csr.cr;
      $$0.a(csr.n, 5, 20);
      $$0.a(csr.o, 5, 20);
      $$0.a(csr.p, 5, 20);
      $$0.a(csr.q, 5, 20);
      $$0.a(csr.r, 5, 20);
      $$0.a(csr.s, 5, 20);
      $$0.a(csr.t, 5, 20);
      $$0.a(csr.u, 5, 20);
      $$0.a(csr.v, 5, 20);
      $$0.a(csr.w, 5, 20);
      $$0.a(csr.jt, 5, 20);
      $$0.a(csr.ju, 5, 20);
      $$0.a(csr.jv, 5, 20);
      $$0.a(csr.jw, 5, 20);
      $$0.a(csr.jx, 5, 20);
      $$0.a(csr.jy, 5, 20);
      $$0.a(csr.jz, 5, 20);
      $$0.a(csr.jA, 5, 20);
      $$0.a(csr.jB, 5, 20);
      $$0.a(csr.jC, 5, 20);
      $$0.a(csr.fh, 5, 20);
      $$0.a(csr.jV, 5, 20);
      $$0.a(csr.jW, 5, 20);
      $$0.a(csr.jX, 5, 20);
      $$0.a(csr.jY, 5, 20);
      $$0.a(csr.jZ, 5, 20);
      $$0.a(csr.ka, 5, 20);
      $$0.a(csr.kb, 5, 20);
      $$0.a(csr.kc, 5, 20);
      $$0.a(csr.dU, 5, 20);
      $$0.a(csr.kd, 5, 20);
      $$0.a(csr.ke, 5, 20);
      $$0.a(csr.kf, 5, 20);
      $$0.a(csr.kg, 5, 20);
      $$0.a(csr.kh, 5, 20);
      $$0.a(csr.ki, 5, 20);
      $$0.a(csr.kj, 5, 20);
      $$0.a(csr.kk, 5, 20);
      $$0.a(csr.cu, 5, 20);
      $$0.a(csr.fL, 5, 20);
      $$0.a(csr.fK, 5, 20);
      $$0.a(csr.fM, 5, 20);
      $$0.a(csr.hP, 5, 20);
      $$0.a(csr.hQ, 5, 20);
      $$0.a(csr.hR, 5, 20);
      $$0.a(csr.hS, 5, 20);
      $$0.a(csr.hT, 5, 20);
      $$0.a(csr.hU, 5, 20);
      $$0.a(csr.U, 5, 5);
      $$0.a(csr.V, 5, 5);
      $$0.a(csr.W, 5, 5);
      $$0.a(csr.X, 5, 5);
      $$0.a(csr.Y, 5, 5);
      $$0.a(csr.Z, 5, 5);
      $$0.a(csr.aa, 5, 5);
      $$0.a(csr.ab, 5, 5);
      $$0.a(csr.ae, 5, 5);
      $$0.a(csr.al, 5, 5);
      $$0.a(csr.af, 5, 5);
      $$0.a(csr.ag, 5, 5);
      $$0.a(csr.ah, 5, 5);
      $$0.a(csr.ai, 5, 5);
      $$0.a(csr.aj, 5, 5);
      $$0.a(csr.ak, 5, 5);
      $$0.a(csr.am, 5, 5);
      $$0.a(csr.an, 5, 5);
      $$0.a(csr.aw, 5, 5);
      $$0.a(csr.ax, 5, 5);
      $$0.a(csr.ay, 5, 5);
      $$0.a(csr.az, 5, 5);
      $$0.a(csr.aA, 5, 5);
      $$0.a(csr.aB, 5, 5);
      $$0.a(csr.aC, 5, 5);
      $$0.a(csr.aD, 5, 5);
      $$0.a(csr.ao, 5, 5);
      $$0.a(csr.ap, 5, 5);
      $$0.a(csr.aq, 5, 5);
      $$0.a(csr.ar, 5, 5);
      $$0.a(csr.as, 5, 5);
      $$0.a(csr.at, 5, 5);
      $$0.a(csr.au, 5, 5);
      $$0.a(csr.av, 5, 5);
      $$0.a(csr.ac, 5, 20);
      $$0.a(csr.aE, 30, 60);
      $$0.a(csr.aF, 30, 60);
      $$0.a(csr.aG, 30, 60);
      $$0.a(csr.aH, 30, 60);
      $$0.a(csr.aI, 30, 60);
      $$0.a(csr.aJ, 30, 60);
      $$0.a(csr.aK, 30, 60);
      $$0.a(csr.aL, 30, 60);
      $$0.a(csr.cl, 30, 20);
      $$0.a(csr.ck, 15, 100);
      $$0.a(csr.bt, 60, 100);
      $$0.a(csr.bu, 60, 100);
      $$0.a(csr.bv, 60, 100);
      $$0.a(csr.iD, 60, 100);
      $$0.a(csr.iE, 60, 100);
      $$0.a(csr.iF, 60, 100);
      $$0.a(csr.iG, 60, 100);
      $$0.a(csr.iH, 60, 100);
      $$0.a(csr.iI, 60, 100);
      $$0.a(csr.bR, 60, 100);
      $$0.a(csr.bT, 60, 100);
      $$0.a(csr.bU, 60, 100);
      $$0.a(csr.bV, 60, 100);
      $$0.a(csr.bW, 60, 100);
      $$0.a(csr.bX, 60, 100);
      $$0.a(csr.bY, 60, 100);
      $$0.a(csr.bZ, 60, 100);
      $$0.a(csr.ca, 60, 100);
      $$0.a(csr.cb, 60, 100);
      $$0.a(csr.cc, 60, 100);
      $$0.a(csr.ce, 60, 100);
      $$0.a(csr.bS, 60, 100);
      $$0.a(csr.kC, 60, 100);
      $$0.a(csr.cd, 60, 100);
      $$0.a(csr.rA, 60, 100);
      $$0.a(csr.bA, 30, 60);
      $$0.a(csr.bB, 30, 60);
      $$0.a(csr.bC, 30, 60);
      $$0.a(csr.bD, 30, 60);
      $$0.a(csr.bE, 30, 60);
      $$0.a(csr.bF, 30, 60);
      $$0.a(csr.bG, 30, 60);
      $$0.a(csr.bH, 30, 60);
      $$0.a(csr.bI, 30, 60);
      $$0.a(csr.bJ, 30, 60);
      $$0.a(csr.bK, 30, 60);
      $$0.a(csr.bL, 30, 60);
      $$0.a(csr.bM, 30, 60);
      $$0.a(csr.bN, 30, 60);
      $$0.a(csr.bO, 30, 60);
      $$0.a(csr.bP, 30, 60);
      $$0.a(csr.ff, 15, 100);
      $$0.a(csr.iB, 5, 5);
      $$0.a(csr.ij, 60, 20);
      $$0.a(csr.pd, 15, 20);
      $$0.a(csr.ik, 60, 20);
      $$0.a(csr.il, 60, 20);
      $$0.a(csr.im, 60, 20);
      $$0.a(csr.in, 60, 20);
      $$0.a(csr.io, 60, 20);
      $$0.a(csr.ip, 60, 20);
      $$0.a(csr.iq, 60, 20);
      $$0.a(csr.ir, 60, 20);
      $$0.a(csr.is, 60, 20);
      $$0.a(csr.it, 60, 20);
      $$0.a(csr.iu, 60, 20);
      $$0.a(csr.iv, 60, 20);
      $$0.a(csr.iw, 60, 20);
      $$0.a(csr.ix, 60, 20);
      $$0.a(csr.iy, 60, 20);
      $$0.a(csr.iz, 60, 20);
      $$0.a(csr.me, 30, 60);
      $$0.a(csr.mZ, 60, 60);
      $$0.a(csr.nS, 60, 60);
      $$0.a(csr.oa, 30, 20);
      $$0.a(csr.pc, 5, 20);
      $$0.a(csr.oi, 60, 100);
      $$0.a(csr.pf, 5, 20);
      $$0.a(csr.pe, 30, 20);
      $$0.a(csr.aM, 30, 60);
      $$0.a(csr.aN, 30, 60);
      $$0.a(csr.ru, 15, 60);
      $$0.a(csr.rv, 15, 60);
      $$0.a(csr.rw, 60, 100);
      $$0.a(csr.rx, 30, 60);
      $$0.a(csr.ry, 30, 60);
      $$0.a(csr.rC, 60, 100);
      $$0.a(csr.rD, 60, 100);
      $$0.a(csr.rE, 60, 100);
      $$0.a(csr.rF, 30, 60);
      $$0.a(csr.fg, 15, 100);
   }
}
