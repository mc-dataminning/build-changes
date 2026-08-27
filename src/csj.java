import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class csj extends cpb {
   public static final int c = 15;
   public static final ddb d = dcr.aw;
   public static final dcs e = cuz.a;
   public static final dcs f = cuz.b;
   public static final dcs g = cuz.c;
   public static final dcs h = cuz.d;
   public static final dcs i = cuz.e;
   private static final Map<ha, dcs> j = cuz.g.entrySet().stream().filter($$0 -> $$0.getKey() != ha.a).collect(ac.a());
   private static final efb k = cpn.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final efb l = cpn.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final efb m = cpn.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final efb n = cpn.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final efb D = cpn.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dcb, efb> E;
   private static final int F = 60;
   private static final int G = 30;
   private static final int H = 15;
   private static final int I = 5;
   private static final int J = 100;
   private static final int K = 60;
   private static final int L = 20;
   private static final int M = 5;
   private final Object2IntMap<cpn> N = new Object2IntOpenHashMap();
   private final Object2IntMap<cpn> O = new Object2IntOpenHashMap();

   public csj(dca.d $$0) {
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
      this.E = ImmutableMap.copyOf(this.C.a().stream().filter($$0x -> $$0x.c(d) == 0).collect(Collectors.toMap(Function.identity(), csj::h)));
   }

   private static efb h(dcb $$0) {
      efb $$1 = eey.a();
      if ($$0.c(i)) {
         $$1 = k;
      }

      if ($$0.c(e)) {
         $$1 = eey.a($$1, n);
      }

      if ($$0.c(g)) {
         $$1 = eey.a($$1, D);
      }

      if ($$0.c(f)) {
         $$1 = eey.a($$1, m);
      }

      if ($$0.c(h)) {
         $$1 = eey.a($$1, l);
      }

      return $$1.b() ? b : $$1;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(d)) : cpo.a.n();
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return this.E.get($$0.a(d, Integer.valueOf(0)));
   }

   @Override
   public dcb a(cih $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dcb b(cls $$0, gu $$1) {
      gu $$2 = $$1.d();
      dcb $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ha.b)) {
         dcb $$4 = this.n();

         for (ha $$5 : ha.values()) {
            dcs $$6 = j.get($$5);
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
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      gu $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ha.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.X().b(cmi.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dcb $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.x_().q());
         int $$6 = $$0.c(d);
         if (!$$5 && $$1.Z() && this.a((cmm)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.s($$2).a(amv.ac);
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
                        int $$16 = this.a((cmp)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ai().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.Z() || !this.a((cmm)$$1, $$11))) {
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

   protected boolean a(cmm $$0, gu $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dcb $$0) {
      return $$0.b(dcr.C) && $$0.c(dcr.C) ? 0 : this.O.getInt($$0.b());
   }

   private int o(dcb $$0) {
      return $$0.b(dcr.C) && $$0.c(dcr.C) ? 0 : this.N.getInt($$0.b());
   }

   private void a(cmm $$0, gu $$1, int $$2, apf $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dcb $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cpn $$8 = $$6.b();
         if ($$8 instanceof cxx) {
            cxx.a($$0, $$1);
         }
      }
   }

   private dcb a(cmn $$0, gu $$1, int $$2) {
      dcb $$3 = a($$0, $$1);
      return $$3.a(cpo.cr) ? $$3.a(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cls $$0, gu $$1) {
      for (ha $$2 : ha.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cmp $$0, gu $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ha $$3 : ha.values()) {
            dcb $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dcb $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(apf $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   private void a(cpn $$0, int $$1, int $$2) {
      this.N.put($$0, $$1);
      this.O.put($$0, $$2);
   }

   public static void a() {
      csj $$0 = (csj)cpo.cr;
      $$0.a(cpo.n, 5, 20);
      $$0.a(cpo.o, 5, 20);
      $$0.a(cpo.p, 5, 20);
      $$0.a(cpo.q, 5, 20);
      $$0.a(cpo.r, 5, 20);
      $$0.a(cpo.s, 5, 20);
      $$0.a(cpo.t, 5, 20);
      $$0.a(cpo.u, 5, 20);
      $$0.a(cpo.v, 5, 20);
      $$0.a(cpo.w, 5, 20);
      $$0.a(cpo.jt, 5, 20);
      $$0.a(cpo.ju, 5, 20);
      $$0.a(cpo.jv, 5, 20);
      $$0.a(cpo.jw, 5, 20);
      $$0.a(cpo.jx, 5, 20);
      $$0.a(cpo.jy, 5, 20);
      $$0.a(cpo.jz, 5, 20);
      $$0.a(cpo.jA, 5, 20);
      $$0.a(cpo.jB, 5, 20);
      $$0.a(cpo.jC, 5, 20);
      $$0.a(cpo.fh, 5, 20);
      $$0.a(cpo.jV, 5, 20);
      $$0.a(cpo.jW, 5, 20);
      $$0.a(cpo.jX, 5, 20);
      $$0.a(cpo.jY, 5, 20);
      $$0.a(cpo.jZ, 5, 20);
      $$0.a(cpo.ka, 5, 20);
      $$0.a(cpo.kb, 5, 20);
      $$0.a(cpo.kc, 5, 20);
      $$0.a(cpo.dU, 5, 20);
      $$0.a(cpo.kd, 5, 20);
      $$0.a(cpo.ke, 5, 20);
      $$0.a(cpo.kf, 5, 20);
      $$0.a(cpo.kg, 5, 20);
      $$0.a(cpo.kh, 5, 20);
      $$0.a(cpo.ki, 5, 20);
      $$0.a(cpo.kj, 5, 20);
      $$0.a(cpo.kk, 5, 20);
      $$0.a(cpo.cu, 5, 20);
      $$0.a(cpo.fL, 5, 20);
      $$0.a(cpo.fK, 5, 20);
      $$0.a(cpo.fM, 5, 20);
      $$0.a(cpo.hP, 5, 20);
      $$0.a(cpo.hQ, 5, 20);
      $$0.a(cpo.hR, 5, 20);
      $$0.a(cpo.hS, 5, 20);
      $$0.a(cpo.hT, 5, 20);
      $$0.a(cpo.hU, 5, 20);
      $$0.a(cpo.U, 5, 5);
      $$0.a(cpo.V, 5, 5);
      $$0.a(cpo.W, 5, 5);
      $$0.a(cpo.X, 5, 5);
      $$0.a(cpo.Y, 5, 5);
      $$0.a(cpo.Z, 5, 5);
      $$0.a(cpo.aa, 5, 5);
      $$0.a(cpo.ab, 5, 5);
      $$0.a(cpo.ae, 5, 5);
      $$0.a(cpo.al, 5, 5);
      $$0.a(cpo.af, 5, 5);
      $$0.a(cpo.ag, 5, 5);
      $$0.a(cpo.ah, 5, 5);
      $$0.a(cpo.ai, 5, 5);
      $$0.a(cpo.aj, 5, 5);
      $$0.a(cpo.ak, 5, 5);
      $$0.a(cpo.am, 5, 5);
      $$0.a(cpo.an, 5, 5);
      $$0.a(cpo.aw, 5, 5);
      $$0.a(cpo.ax, 5, 5);
      $$0.a(cpo.ay, 5, 5);
      $$0.a(cpo.az, 5, 5);
      $$0.a(cpo.aA, 5, 5);
      $$0.a(cpo.aB, 5, 5);
      $$0.a(cpo.aC, 5, 5);
      $$0.a(cpo.aD, 5, 5);
      $$0.a(cpo.ao, 5, 5);
      $$0.a(cpo.ap, 5, 5);
      $$0.a(cpo.aq, 5, 5);
      $$0.a(cpo.ar, 5, 5);
      $$0.a(cpo.as, 5, 5);
      $$0.a(cpo.at, 5, 5);
      $$0.a(cpo.au, 5, 5);
      $$0.a(cpo.av, 5, 5);
      $$0.a(cpo.ac, 5, 20);
      $$0.a(cpo.aE, 30, 60);
      $$0.a(cpo.aF, 30, 60);
      $$0.a(cpo.aG, 30, 60);
      $$0.a(cpo.aH, 30, 60);
      $$0.a(cpo.aI, 30, 60);
      $$0.a(cpo.aJ, 30, 60);
      $$0.a(cpo.aK, 30, 60);
      $$0.a(cpo.aL, 30, 60);
      $$0.a(cpo.cl, 30, 20);
      $$0.a(cpo.ck, 15, 100);
      $$0.a(cpo.bt, 60, 100);
      $$0.a(cpo.bu, 60, 100);
      $$0.a(cpo.bv, 60, 100);
      $$0.a(cpo.iD, 60, 100);
      $$0.a(cpo.iE, 60, 100);
      $$0.a(cpo.iF, 60, 100);
      $$0.a(cpo.iG, 60, 100);
      $$0.a(cpo.iH, 60, 100);
      $$0.a(cpo.iI, 60, 100);
      $$0.a(cpo.bR, 60, 100);
      $$0.a(cpo.bT, 60, 100);
      $$0.a(cpo.bU, 60, 100);
      $$0.a(cpo.bV, 60, 100);
      $$0.a(cpo.bW, 60, 100);
      $$0.a(cpo.bX, 60, 100);
      $$0.a(cpo.bY, 60, 100);
      $$0.a(cpo.bZ, 60, 100);
      $$0.a(cpo.ca, 60, 100);
      $$0.a(cpo.cb, 60, 100);
      $$0.a(cpo.cc, 60, 100);
      $$0.a(cpo.ce, 60, 100);
      $$0.a(cpo.bS, 60, 100);
      $$0.a(cpo.kC, 60, 100);
      $$0.a(cpo.cd, 60, 100);
      $$0.a(cpo.rA, 60, 100);
      $$0.a(cpo.bA, 30, 60);
      $$0.a(cpo.bB, 30, 60);
      $$0.a(cpo.bC, 30, 60);
      $$0.a(cpo.bD, 30, 60);
      $$0.a(cpo.bE, 30, 60);
      $$0.a(cpo.bF, 30, 60);
      $$0.a(cpo.bG, 30, 60);
      $$0.a(cpo.bH, 30, 60);
      $$0.a(cpo.bI, 30, 60);
      $$0.a(cpo.bJ, 30, 60);
      $$0.a(cpo.bK, 30, 60);
      $$0.a(cpo.bL, 30, 60);
      $$0.a(cpo.bM, 30, 60);
      $$0.a(cpo.bN, 30, 60);
      $$0.a(cpo.bO, 30, 60);
      $$0.a(cpo.bP, 30, 60);
      $$0.a(cpo.ff, 15, 100);
      $$0.a(cpo.iB, 5, 5);
      $$0.a(cpo.ij, 60, 20);
      $$0.a(cpo.pd, 15, 20);
      $$0.a(cpo.ik, 60, 20);
      $$0.a(cpo.il, 60, 20);
      $$0.a(cpo.im, 60, 20);
      $$0.a(cpo.in, 60, 20);
      $$0.a(cpo.io, 60, 20);
      $$0.a(cpo.ip, 60, 20);
      $$0.a(cpo.iq, 60, 20);
      $$0.a(cpo.ir, 60, 20);
      $$0.a(cpo.is, 60, 20);
      $$0.a(cpo.it, 60, 20);
      $$0.a(cpo.iu, 60, 20);
      $$0.a(cpo.iv, 60, 20);
      $$0.a(cpo.iw, 60, 20);
      $$0.a(cpo.ix, 60, 20);
      $$0.a(cpo.iy, 60, 20);
      $$0.a(cpo.iz, 60, 20);
      $$0.a(cpo.me, 30, 60);
      $$0.a(cpo.mZ, 60, 60);
      $$0.a(cpo.nS, 60, 60);
      $$0.a(cpo.oa, 30, 20);
      $$0.a(cpo.pc, 5, 20);
      $$0.a(cpo.oi, 60, 100);
      $$0.a(cpo.pf, 5, 20);
      $$0.a(cpo.pe, 30, 20);
      $$0.a(cpo.aM, 30, 60);
      $$0.a(cpo.aN, 30, 60);
      $$0.a(cpo.ru, 15, 60);
      $$0.a(cpo.rv, 15, 60);
      $$0.a(cpo.rw, 60, 100);
      $$0.a(cpo.rx, 30, 60);
      $$0.a(cpo.ry, 30, 60);
      $$0.a(cpo.rC, 60, 100);
      $$0.a(cpo.rD, 60, 100);
      $$0.a(cpo.rE, 60, 100);
      $$0.a(cpo.rF, 30, 60);
      $$0.a(cpo.fg, 15, 100);
   }
}
