import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ddc extends czp {
   public static final MapCodec<ddc> c = b(ddc::new);
   public static final int d = 15;
   public static final dob e = dnr.aw;
   public static final dns f = dfp.b;
   public static final dns g = dfp.c;
   public static final dns h = dfp.d;
   public static final dns i = dfp.e;
   public static final dns j = dfp.f;
   private static final Map<ih, dns> k = dfp.h.entrySet().stream().filter($$0 -> $$0.getKey() != ih.a).collect(ac.a());
   private static final eqm l = dac.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqm m = dac.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eqm n = dac.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqm o = dac.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eqm F = dac.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dnb, eqm> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dac> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dac> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<ddc> a() {
      return c;
   }

   public ddc(dna.d $$0) {
      super($$0, 1.0F);
      this.k(
         this.E
            .b()
            .a(e, Integer.valueOf(0))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
            .a(h, Boolean.valueOf(false))
            .a(i, Boolean.valueOf(false))
            .a(j, Boolean.valueOf(false))
      );
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), ddc::m)));
   }

   private static eqm m(dnb $$0) {
      eqm $$1 = eqj.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = eqj.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = eqj.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = eqj.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = eqj.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dae.a.o();
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dnb a(csu $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dnb b(cwh $$0, ib $$1) {
      ib $$2 = $$1.d();
      dnb $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ih.b)) {
         dnb $$4 = this.o();

         for (ih $$5 : ih.values()) {
            dns $$6 = k.get($$5);
            if ($$6 != null) {
               $$4 = $$4.a($$6, Boolean.valueOf(this.f($$0.a_($$1.a($$5)))));
            }
         }

         return $$4;
      } else {
         return this.o();
      }
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ib $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ih.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.Z().b(cwx.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dnb $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ab() && this.a((cxb)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  ib $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, ih.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(aum.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            ib.a $$11 = new ib.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((cxe)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.aj().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ab() || !this.a((cxb)$$1, $$11))) {
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

   protected boolean a(cxb $$0, ib $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dnb $$0) {
      return $$0.b(dnr.C) && $$0.c(dnr.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dnb $$0) {
      return $$0.b(dnr.C) && $$0.c(dnr.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(cxb $$0, ib $$1, int $$2, axd $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dnb $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dac $$8 = $$6.b();
         if ($$8 instanceof dik) {
            dik.a($$0, $$1);
         }
      }
   }

   private dnb a(cxc $$0, ib $$1, int $$2) {
      dnb $$3 = a($$0, $$1);
      return $$3.a(dae.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cwh $$0, ib $$1) {
      for (ih $$2 : ih.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cxe $$0, ib $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ih $$3 : ih.values()) {
            dnb $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dnb $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(axd $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dac $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      ddc $$0 = (ddc)dae.cr;
      $$0.a(dae.n, 5, 20);
      $$0.a(dae.o, 5, 20);
      $$0.a(dae.p, 5, 20);
      $$0.a(dae.q, 5, 20);
      $$0.a(dae.r, 5, 20);
      $$0.a(dae.s, 5, 20);
      $$0.a(dae.t, 5, 20);
      $$0.a(dae.u, 5, 20);
      $$0.a(dae.v, 5, 20);
      $$0.a(dae.w, 5, 20);
      $$0.a(dae.jt, 5, 20);
      $$0.a(dae.ju, 5, 20);
      $$0.a(dae.jv, 5, 20);
      $$0.a(dae.jw, 5, 20);
      $$0.a(dae.jx, 5, 20);
      $$0.a(dae.jy, 5, 20);
      $$0.a(dae.jz, 5, 20);
      $$0.a(dae.jA, 5, 20);
      $$0.a(dae.jB, 5, 20);
      $$0.a(dae.jC, 5, 20);
      $$0.a(dae.fh, 5, 20);
      $$0.a(dae.jV, 5, 20);
      $$0.a(dae.jW, 5, 20);
      $$0.a(dae.jX, 5, 20);
      $$0.a(dae.jY, 5, 20);
      $$0.a(dae.jZ, 5, 20);
      $$0.a(dae.ka, 5, 20);
      $$0.a(dae.kb, 5, 20);
      $$0.a(dae.kc, 5, 20);
      $$0.a(dae.dU, 5, 20);
      $$0.a(dae.kd, 5, 20);
      $$0.a(dae.ke, 5, 20);
      $$0.a(dae.kf, 5, 20);
      $$0.a(dae.kg, 5, 20);
      $$0.a(dae.kh, 5, 20);
      $$0.a(dae.ki, 5, 20);
      $$0.a(dae.kj, 5, 20);
      $$0.a(dae.kk, 5, 20);
      $$0.a(dae.cu, 5, 20);
      $$0.a(dae.fL, 5, 20);
      $$0.a(dae.fK, 5, 20);
      $$0.a(dae.fM, 5, 20);
      $$0.a(dae.hP, 5, 20);
      $$0.a(dae.hQ, 5, 20);
      $$0.a(dae.hR, 5, 20);
      $$0.a(dae.hS, 5, 20);
      $$0.a(dae.hT, 5, 20);
      $$0.a(dae.hU, 5, 20);
      $$0.a(dae.U, 5, 5);
      $$0.a(dae.V, 5, 5);
      $$0.a(dae.W, 5, 5);
      $$0.a(dae.X, 5, 5);
      $$0.a(dae.Y, 5, 5);
      $$0.a(dae.Z, 5, 5);
      $$0.a(dae.aa, 5, 5);
      $$0.a(dae.ab, 5, 5);
      $$0.a(dae.ae, 5, 5);
      $$0.a(dae.al, 5, 5);
      $$0.a(dae.af, 5, 5);
      $$0.a(dae.ag, 5, 5);
      $$0.a(dae.ah, 5, 5);
      $$0.a(dae.ai, 5, 5);
      $$0.a(dae.aj, 5, 5);
      $$0.a(dae.ak, 5, 5);
      $$0.a(dae.am, 5, 5);
      $$0.a(dae.an, 5, 5);
      $$0.a(dae.aw, 5, 5);
      $$0.a(dae.ax, 5, 5);
      $$0.a(dae.ay, 5, 5);
      $$0.a(dae.az, 5, 5);
      $$0.a(dae.aA, 5, 5);
      $$0.a(dae.aB, 5, 5);
      $$0.a(dae.aC, 5, 5);
      $$0.a(dae.aD, 5, 5);
      $$0.a(dae.ao, 5, 5);
      $$0.a(dae.ap, 5, 5);
      $$0.a(dae.aq, 5, 5);
      $$0.a(dae.ar, 5, 5);
      $$0.a(dae.as, 5, 5);
      $$0.a(dae.at, 5, 5);
      $$0.a(dae.au, 5, 5);
      $$0.a(dae.av, 5, 5);
      $$0.a(dae.ac, 5, 20);
      $$0.a(dae.aE, 30, 60);
      $$0.a(dae.aF, 30, 60);
      $$0.a(dae.aG, 30, 60);
      $$0.a(dae.aH, 30, 60);
      $$0.a(dae.aI, 30, 60);
      $$0.a(dae.aJ, 30, 60);
      $$0.a(dae.aK, 30, 60);
      $$0.a(dae.aL, 30, 60);
      $$0.a(dae.cl, 30, 20);
      $$0.a(dae.ck, 15, 100);
      $$0.a(dae.bt, 60, 100);
      $$0.a(dae.bu, 60, 100);
      $$0.a(dae.bv, 60, 100);
      $$0.a(dae.iD, 60, 100);
      $$0.a(dae.iE, 60, 100);
      $$0.a(dae.iF, 60, 100);
      $$0.a(dae.iG, 60, 100);
      $$0.a(dae.iH, 60, 100);
      $$0.a(dae.iI, 60, 100);
      $$0.a(dae.bR, 60, 100);
      $$0.a(dae.bT, 60, 100);
      $$0.a(dae.bU, 60, 100);
      $$0.a(dae.bV, 60, 100);
      $$0.a(dae.bW, 60, 100);
      $$0.a(dae.bX, 60, 100);
      $$0.a(dae.bY, 60, 100);
      $$0.a(dae.bZ, 60, 100);
      $$0.a(dae.ca, 60, 100);
      $$0.a(dae.cb, 60, 100);
      $$0.a(dae.cc, 60, 100);
      $$0.a(dae.ce, 60, 100);
      $$0.a(dae.bS, 60, 100);
      $$0.a(dae.kC, 60, 100);
      $$0.a(dae.cd, 60, 100);
      $$0.a(dae.sB, 60, 100);
      $$0.a(dae.bA, 30, 60);
      $$0.a(dae.bB, 30, 60);
      $$0.a(dae.bC, 30, 60);
      $$0.a(dae.bD, 30, 60);
      $$0.a(dae.bE, 30, 60);
      $$0.a(dae.bF, 30, 60);
      $$0.a(dae.bG, 30, 60);
      $$0.a(dae.bH, 30, 60);
      $$0.a(dae.bI, 30, 60);
      $$0.a(dae.bJ, 30, 60);
      $$0.a(dae.bK, 30, 60);
      $$0.a(dae.bL, 30, 60);
      $$0.a(dae.bM, 30, 60);
      $$0.a(dae.bN, 30, 60);
      $$0.a(dae.bO, 30, 60);
      $$0.a(dae.bP, 30, 60);
      $$0.a(dae.ff, 15, 100);
      $$0.a(dae.iB, 5, 5);
      $$0.a(dae.ij, 60, 20);
      $$0.a(dae.pd, 15, 20);
      $$0.a(dae.ik, 60, 20);
      $$0.a(dae.il, 60, 20);
      $$0.a(dae.im, 60, 20);
      $$0.a(dae.in, 60, 20);
      $$0.a(dae.io, 60, 20);
      $$0.a(dae.ip, 60, 20);
      $$0.a(dae.iq, 60, 20);
      $$0.a(dae.ir, 60, 20);
      $$0.a(dae.is, 60, 20);
      $$0.a(dae.it, 60, 20);
      $$0.a(dae.iu, 60, 20);
      $$0.a(dae.iv, 60, 20);
      $$0.a(dae.iw, 60, 20);
      $$0.a(dae.ix, 60, 20);
      $$0.a(dae.iy, 60, 20);
      $$0.a(dae.iz, 60, 20);
      $$0.a(dae.me, 30, 60);
      $$0.a(dae.mZ, 60, 60);
      $$0.a(dae.nS, 60, 60);
      $$0.a(dae.oa, 30, 20);
      $$0.a(dae.pc, 5, 20);
      $$0.a(dae.oi, 60, 100);
      $$0.a(dae.pf, 5, 20);
      $$0.a(dae.pe, 30, 20);
      $$0.a(dae.aM, 30, 60);
      $$0.a(dae.aN, 30, 60);
      $$0.a(dae.sv, 15, 60);
      $$0.a(dae.sw, 15, 60);
      $$0.a(dae.sx, 60, 100);
      $$0.a(dae.sy, 30, 60);
      $$0.a(dae.sz, 30, 60);
      $$0.a(dae.sD, 60, 100);
      $$0.a(dae.sE, 60, 100);
      $$0.a(dae.sF, 60, 100);
      $$0.a(dae.sG, 30, 60);
      $$0.a(dae.fg, 15, 100);
   }
}
