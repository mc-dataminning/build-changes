import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dda extends czn {
   public static final MapCodec<dda> c = b(dda::new);
   public static final int d = 15;
   public static final dnz e = dnp.aw;
   public static final dnq f = dfn.b;
   public static final dnq g = dfn.c;
   public static final dnq h = dfn.d;
   public static final dnq i = dfn.e;
   public static final dnq j = dfn.f;
   private static final Map<ih, dnq> k = dfn.h.entrySet().stream().filter($$0 -> $$0.getKey() != ih.a).collect(ac.a());
   private static final eqk l = daa.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqk m = daa.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eqk n = daa.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqk o = daa.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eqk F = daa.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dmz, eqk> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<daa> P = new Object2IntOpenHashMap();
   private final Object2IntMap<daa> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dda> a() {
      return c;
   }

   public dda(dmy.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dda::m)));
   }

   private static eqk m(dmz $$0) {
      eqk $$1 = eqh.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = eqh.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = eqh.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = eqh.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = eqh.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dac.a.o();
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dmz a(css $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dmz b(cwf $$0, ib $$1) {
      ib $$2 = $$1.d();
      dmz $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ih.b)) {
         dmz $$4 = this.o();

         for (ih $$5 : ih.values()) {
            dnq $$6 = k.get($$5);
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
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ih.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.Z().b(cwv.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dmz $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ab() && this.a((cwz)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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
                        int $$16 = this.a((cxc)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.aj().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ab() || !this.a((cwz)$$1, $$11))) {
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

   protected boolean a(cwz $$0, ib $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dmz $$0) {
      return $$0.b(dnp.C) && $$0.c(dnp.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dmz $$0) {
      return $$0.b(dnp.C) && $$0.c(dnp.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(cwz $$0, ib $$1, int $$2, axd $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dmz $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         daa $$8 = $$6.b();
         if ($$8 instanceof dii) {
            dii.a($$0, $$1);
         }
      }
   }

   private dmz a(cxa $$0, ib $$1, int $$2) {
      dmz $$3 = a($$0, $$1);
      return $$3.a(dac.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cwf $$0, ib $$1) {
      for (ih $$2 : ih.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cxc $$0, ib $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ih $$3 : ih.values()) {
            dmz $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dmz $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(axd $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(daa $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dda $$0 = (dda)dac.cr;
      $$0.a(dac.n, 5, 20);
      $$0.a(dac.o, 5, 20);
      $$0.a(dac.p, 5, 20);
      $$0.a(dac.q, 5, 20);
      $$0.a(dac.r, 5, 20);
      $$0.a(dac.s, 5, 20);
      $$0.a(dac.t, 5, 20);
      $$0.a(dac.u, 5, 20);
      $$0.a(dac.v, 5, 20);
      $$0.a(dac.w, 5, 20);
      $$0.a(dac.jt, 5, 20);
      $$0.a(dac.ju, 5, 20);
      $$0.a(dac.jv, 5, 20);
      $$0.a(dac.jw, 5, 20);
      $$0.a(dac.jx, 5, 20);
      $$0.a(dac.jy, 5, 20);
      $$0.a(dac.jz, 5, 20);
      $$0.a(dac.jA, 5, 20);
      $$0.a(dac.jB, 5, 20);
      $$0.a(dac.jC, 5, 20);
      $$0.a(dac.fh, 5, 20);
      $$0.a(dac.jV, 5, 20);
      $$0.a(dac.jW, 5, 20);
      $$0.a(dac.jX, 5, 20);
      $$0.a(dac.jY, 5, 20);
      $$0.a(dac.jZ, 5, 20);
      $$0.a(dac.ka, 5, 20);
      $$0.a(dac.kb, 5, 20);
      $$0.a(dac.kc, 5, 20);
      $$0.a(dac.dU, 5, 20);
      $$0.a(dac.kd, 5, 20);
      $$0.a(dac.ke, 5, 20);
      $$0.a(dac.kf, 5, 20);
      $$0.a(dac.kg, 5, 20);
      $$0.a(dac.kh, 5, 20);
      $$0.a(dac.ki, 5, 20);
      $$0.a(dac.kj, 5, 20);
      $$0.a(dac.kk, 5, 20);
      $$0.a(dac.cu, 5, 20);
      $$0.a(dac.fL, 5, 20);
      $$0.a(dac.fK, 5, 20);
      $$0.a(dac.fM, 5, 20);
      $$0.a(dac.hP, 5, 20);
      $$0.a(dac.hQ, 5, 20);
      $$0.a(dac.hR, 5, 20);
      $$0.a(dac.hS, 5, 20);
      $$0.a(dac.hT, 5, 20);
      $$0.a(dac.hU, 5, 20);
      $$0.a(dac.U, 5, 5);
      $$0.a(dac.V, 5, 5);
      $$0.a(dac.W, 5, 5);
      $$0.a(dac.X, 5, 5);
      $$0.a(dac.Y, 5, 5);
      $$0.a(dac.Z, 5, 5);
      $$0.a(dac.aa, 5, 5);
      $$0.a(dac.ab, 5, 5);
      $$0.a(dac.ae, 5, 5);
      $$0.a(dac.al, 5, 5);
      $$0.a(dac.af, 5, 5);
      $$0.a(dac.ag, 5, 5);
      $$0.a(dac.ah, 5, 5);
      $$0.a(dac.ai, 5, 5);
      $$0.a(dac.aj, 5, 5);
      $$0.a(dac.ak, 5, 5);
      $$0.a(dac.am, 5, 5);
      $$0.a(dac.an, 5, 5);
      $$0.a(dac.aw, 5, 5);
      $$0.a(dac.ax, 5, 5);
      $$0.a(dac.ay, 5, 5);
      $$0.a(dac.az, 5, 5);
      $$0.a(dac.aA, 5, 5);
      $$0.a(dac.aB, 5, 5);
      $$0.a(dac.aC, 5, 5);
      $$0.a(dac.aD, 5, 5);
      $$0.a(dac.ao, 5, 5);
      $$0.a(dac.ap, 5, 5);
      $$0.a(dac.aq, 5, 5);
      $$0.a(dac.ar, 5, 5);
      $$0.a(dac.as, 5, 5);
      $$0.a(dac.at, 5, 5);
      $$0.a(dac.au, 5, 5);
      $$0.a(dac.av, 5, 5);
      $$0.a(dac.ac, 5, 20);
      $$0.a(dac.aE, 30, 60);
      $$0.a(dac.aF, 30, 60);
      $$0.a(dac.aG, 30, 60);
      $$0.a(dac.aH, 30, 60);
      $$0.a(dac.aI, 30, 60);
      $$0.a(dac.aJ, 30, 60);
      $$0.a(dac.aK, 30, 60);
      $$0.a(dac.aL, 30, 60);
      $$0.a(dac.cl, 30, 20);
      $$0.a(dac.ck, 15, 100);
      $$0.a(dac.bt, 60, 100);
      $$0.a(dac.bu, 60, 100);
      $$0.a(dac.bv, 60, 100);
      $$0.a(dac.iD, 60, 100);
      $$0.a(dac.iE, 60, 100);
      $$0.a(dac.iF, 60, 100);
      $$0.a(dac.iG, 60, 100);
      $$0.a(dac.iH, 60, 100);
      $$0.a(dac.iI, 60, 100);
      $$0.a(dac.bR, 60, 100);
      $$0.a(dac.bT, 60, 100);
      $$0.a(dac.bU, 60, 100);
      $$0.a(dac.bV, 60, 100);
      $$0.a(dac.bW, 60, 100);
      $$0.a(dac.bX, 60, 100);
      $$0.a(dac.bY, 60, 100);
      $$0.a(dac.bZ, 60, 100);
      $$0.a(dac.ca, 60, 100);
      $$0.a(dac.cb, 60, 100);
      $$0.a(dac.cc, 60, 100);
      $$0.a(dac.ce, 60, 100);
      $$0.a(dac.bS, 60, 100);
      $$0.a(dac.kC, 60, 100);
      $$0.a(dac.cd, 60, 100);
      $$0.a(dac.sB, 60, 100);
      $$0.a(dac.bA, 30, 60);
      $$0.a(dac.bB, 30, 60);
      $$0.a(dac.bC, 30, 60);
      $$0.a(dac.bD, 30, 60);
      $$0.a(dac.bE, 30, 60);
      $$0.a(dac.bF, 30, 60);
      $$0.a(dac.bG, 30, 60);
      $$0.a(dac.bH, 30, 60);
      $$0.a(dac.bI, 30, 60);
      $$0.a(dac.bJ, 30, 60);
      $$0.a(dac.bK, 30, 60);
      $$0.a(dac.bL, 30, 60);
      $$0.a(dac.bM, 30, 60);
      $$0.a(dac.bN, 30, 60);
      $$0.a(dac.bO, 30, 60);
      $$0.a(dac.bP, 30, 60);
      $$0.a(dac.ff, 15, 100);
      $$0.a(dac.iB, 5, 5);
      $$0.a(dac.ij, 60, 20);
      $$0.a(dac.pd, 15, 20);
      $$0.a(dac.ik, 60, 20);
      $$0.a(dac.il, 60, 20);
      $$0.a(dac.im, 60, 20);
      $$0.a(dac.in, 60, 20);
      $$0.a(dac.io, 60, 20);
      $$0.a(dac.ip, 60, 20);
      $$0.a(dac.iq, 60, 20);
      $$0.a(dac.ir, 60, 20);
      $$0.a(dac.is, 60, 20);
      $$0.a(dac.it, 60, 20);
      $$0.a(dac.iu, 60, 20);
      $$0.a(dac.iv, 60, 20);
      $$0.a(dac.iw, 60, 20);
      $$0.a(dac.ix, 60, 20);
      $$0.a(dac.iy, 60, 20);
      $$0.a(dac.iz, 60, 20);
      $$0.a(dac.me, 30, 60);
      $$0.a(dac.mZ, 60, 60);
      $$0.a(dac.nS, 60, 60);
      $$0.a(dac.oa, 30, 20);
      $$0.a(dac.pc, 5, 20);
      $$0.a(dac.oi, 60, 100);
      $$0.a(dac.pf, 5, 20);
      $$0.a(dac.pe, 30, 20);
      $$0.a(dac.aM, 30, 60);
      $$0.a(dac.aN, 30, 60);
      $$0.a(dac.sv, 15, 60);
      $$0.a(dac.sw, 15, 60);
      $$0.a(dac.sx, 60, 100);
      $$0.a(dac.sy, 30, 60);
      $$0.a(dac.sz, 30, 60);
      $$0.a(dac.sD, 60, 100);
      $$0.a(dac.sE, 60, 100);
      $$0.a(dac.sF, 60, 100);
      $$0.a(dac.sG, 30, 60);
      $$0.a(dac.fg, 15, 100);
   }
}
