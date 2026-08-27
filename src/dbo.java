import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dbo extends cyb {
   public static final MapCodec<dbo> c = b(dbo::new);
   public static final int d = 15;
   public static final dmf e = dlv.aw;
   public static final dlw f = deb.b;
   public static final dlw g = deb.c;
   public static final dlw h = deb.d;
   public static final dlw i = deb.e;
   public static final dlw j = deb.f;
   private static final Map<ie, dlw> k = deb.h.entrySet().stream().filter($$0 -> $$0.getKey() != ie.a).collect(ac.a());
   private static final eol l = cyo.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eol m = cyo.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eol n = cyo.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eol o = cyo.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eol F = cyo.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dlf, eol> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<cyo> P = new Object2IntOpenHashMap();
   private final Object2IntMap<cyo> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dbo> a() {
      return c;
   }

   public dbo(dle.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dbo::m)));
   }

   private static eol m(dlf $$0) {
      eol $$1 = eoi.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = eoi.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = eoi.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = eoi.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = eoi.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : cyq.a.o();
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dlf a(crg $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dlf b(cut $$0, hz $$1) {
      hz $$2 = $$1.d();
      dlf $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ie.b)) {
         dlf $$4 = this.o();

         for (ie $$5 : ie.values()) {
            dlw $$6 = k.get($$5);
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
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ie.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.Z().b(cvj.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dlf $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.E_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ab() && this.a((cvn)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  hz $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, ie.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(aty.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            hz.a $$11 = new hz.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((cvq)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ab() || !this.a((cvn)$$1, $$11))) {
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

   protected boolean a(cvn $$0, hz $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dlf $$0) {
      return $$0.b(dlv.C) && $$0.c(dlv.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dlf $$0) {
      return $$0.b(dlv.C) && $$0.c(dlv.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(cvn $$0, hz $$1, int $$2, awo $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dlf $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cyo $$8 = $$6.b();
         if ($$8 instanceof dgw) {
            dgw.a($$0, $$1);
         }
      }
   }

   private dlf a(cvo $$0, hz $$1, int $$2) {
      dlf $$3 = a($$0, $$1);
      return $$3.a(cyq.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cut $$0, hz $$1) {
      for (ie $$2 : ie.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cvq $$0, hz $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ie $$3 : ie.values()) {
            dlf $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dlf $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(awo $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(cyo $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dbo $$0 = (dbo)cyq.cr;
      $$0.a(cyq.n, 5, 20);
      $$0.a(cyq.o, 5, 20);
      $$0.a(cyq.p, 5, 20);
      $$0.a(cyq.q, 5, 20);
      $$0.a(cyq.r, 5, 20);
      $$0.a(cyq.s, 5, 20);
      $$0.a(cyq.t, 5, 20);
      $$0.a(cyq.u, 5, 20);
      $$0.a(cyq.v, 5, 20);
      $$0.a(cyq.w, 5, 20);
      $$0.a(cyq.jt, 5, 20);
      $$0.a(cyq.ju, 5, 20);
      $$0.a(cyq.jv, 5, 20);
      $$0.a(cyq.jw, 5, 20);
      $$0.a(cyq.jx, 5, 20);
      $$0.a(cyq.jy, 5, 20);
      $$0.a(cyq.jz, 5, 20);
      $$0.a(cyq.jA, 5, 20);
      $$0.a(cyq.jB, 5, 20);
      $$0.a(cyq.jC, 5, 20);
      $$0.a(cyq.fh, 5, 20);
      $$0.a(cyq.jV, 5, 20);
      $$0.a(cyq.jW, 5, 20);
      $$0.a(cyq.jX, 5, 20);
      $$0.a(cyq.jY, 5, 20);
      $$0.a(cyq.jZ, 5, 20);
      $$0.a(cyq.ka, 5, 20);
      $$0.a(cyq.kb, 5, 20);
      $$0.a(cyq.kc, 5, 20);
      $$0.a(cyq.dU, 5, 20);
      $$0.a(cyq.kd, 5, 20);
      $$0.a(cyq.ke, 5, 20);
      $$0.a(cyq.kf, 5, 20);
      $$0.a(cyq.kg, 5, 20);
      $$0.a(cyq.kh, 5, 20);
      $$0.a(cyq.ki, 5, 20);
      $$0.a(cyq.kj, 5, 20);
      $$0.a(cyq.kk, 5, 20);
      $$0.a(cyq.cu, 5, 20);
      $$0.a(cyq.fL, 5, 20);
      $$0.a(cyq.fK, 5, 20);
      $$0.a(cyq.fM, 5, 20);
      $$0.a(cyq.hP, 5, 20);
      $$0.a(cyq.hQ, 5, 20);
      $$0.a(cyq.hR, 5, 20);
      $$0.a(cyq.hS, 5, 20);
      $$0.a(cyq.hT, 5, 20);
      $$0.a(cyq.hU, 5, 20);
      $$0.a(cyq.U, 5, 5);
      $$0.a(cyq.V, 5, 5);
      $$0.a(cyq.W, 5, 5);
      $$0.a(cyq.X, 5, 5);
      $$0.a(cyq.Y, 5, 5);
      $$0.a(cyq.Z, 5, 5);
      $$0.a(cyq.aa, 5, 5);
      $$0.a(cyq.ab, 5, 5);
      $$0.a(cyq.ae, 5, 5);
      $$0.a(cyq.al, 5, 5);
      $$0.a(cyq.af, 5, 5);
      $$0.a(cyq.ag, 5, 5);
      $$0.a(cyq.ah, 5, 5);
      $$0.a(cyq.ai, 5, 5);
      $$0.a(cyq.aj, 5, 5);
      $$0.a(cyq.ak, 5, 5);
      $$0.a(cyq.am, 5, 5);
      $$0.a(cyq.an, 5, 5);
      $$0.a(cyq.aw, 5, 5);
      $$0.a(cyq.ax, 5, 5);
      $$0.a(cyq.ay, 5, 5);
      $$0.a(cyq.az, 5, 5);
      $$0.a(cyq.aA, 5, 5);
      $$0.a(cyq.aB, 5, 5);
      $$0.a(cyq.aC, 5, 5);
      $$0.a(cyq.aD, 5, 5);
      $$0.a(cyq.ao, 5, 5);
      $$0.a(cyq.ap, 5, 5);
      $$0.a(cyq.aq, 5, 5);
      $$0.a(cyq.ar, 5, 5);
      $$0.a(cyq.as, 5, 5);
      $$0.a(cyq.at, 5, 5);
      $$0.a(cyq.au, 5, 5);
      $$0.a(cyq.av, 5, 5);
      $$0.a(cyq.ac, 5, 20);
      $$0.a(cyq.aE, 30, 60);
      $$0.a(cyq.aF, 30, 60);
      $$0.a(cyq.aG, 30, 60);
      $$0.a(cyq.aH, 30, 60);
      $$0.a(cyq.aI, 30, 60);
      $$0.a(cyq.aJ, 30, 60);
      $$0.a(cyq.aK, 30, 60);
      $$0.a(cyq.aL, 30, 60);
      $$0.a(cyq.cl, 30, 20);
      $$0.a(cyq.ck, 15, 100);
      $$0.a(cyq.bt, 60, 100);
      $$0.a(cyq.bu, 60, 100);
      $$0.a(cyq.bv, 60, 100);
      $$0.a(cyq.iD, 60, 100);
      $$0.a(cyq.iE, 60, 100);
      $$0.a(cyq.iF, 60, 100);
      $$0.a(cyq.iG, 60, 100);
      $$0.a(cyq.iH, 60, 100);
      $$0.a(cyq.iI, 60, 100);
      $$0.a(cyq.bR, 60, 100);
      $$0.a(cyq.bT, 60, 100);
      $$0.a(cyq.bU, 60, 100);
      $$0.a(cyq.bV, 60, 100);
      $$0.a(cyq.bW, 60, 100);
      $$0.a(cyq.bX, 60, 100);
      $$0.a(cyq.bY, 60, 100);
      $$0.a(cyq.bZ, 60, 100);
      $$0.a(cyq.ca, 60, 100);
      $$0.a(cyq.cb, 60, 100);
      $$0.a(cyq.cc, 60, 100);
      $$0.a(cyq.ce, 60, 100);
      $$0.a(cyq.bS, 60, 100);
      $$0.a(cyq.kC, 60, 100);
      $$0.a(cyq.cd, 60, 100);
      $$0.a(cyq.sB, 60, 100);
      $$0.a(cyq.bA, 30, 60);
      $$0.a(cyq.bB, 30, 60);
      $$0.a(cyq.bC, 30, 60);
      $$0.a(cyq.bD, 30, 60);
      $$0.a(cyq.bE, 30, 60);
      $$0.a(cyq.bF, 30, 60);
      $$0.a(cyq.bG, 30, 60);
      $$0.a(cyq.bH, 30, 60);
      $$0.a(cyq.bI, 30, 60);
      $$0.a(cyq.bJ, 30, 60);
      $$0.a(cyq.bK, 30, 60);
      $$0.a(cyq.bL, 30, 60);
      $$0.a(cyq.bM, 30, 60);
      $$0.a(cyq.bN, 30, 60);
      $$0.a(cyq.bO, 30, 60);
      $$0.a(cyq.bP, 30, 60);
      $$0.a(cyq.ff, 15, 100);
      $$0.a(cyq.iB, 5, 5);
      $$0.a(cyq.ij, 60, 20);
      $$0.a(cyq.pd, 15, 20);
      $$0.a(cyq.ik, 60, 20);
      $$0.a(cyq.il, 60, 20);
      $$0.a(cyq.im, 60, 20);
      $$0.a(cyq.in, 60, 20);
      $$0.a(cyq.io, 60, 20);
      $$0.a(cyq.ip, 60, 20);
      $$0.a(cyq.iq, 60, 20);
      $$0.a(cyq.ir, 60, 20);
      $$0.a(cyq.is, 60, 20);
      $$0.a(cyq.it, 60, 20);
      $$0.a(cyq.iu, 60, 20);
      $$0.a(cyq.iv, 60, 20);
      $$0.a(cyq.iw, 60, 20);
      $$0.a(cyq.ix, 60, 20);
      $$0.a(cyq.iy, 60, 20);
      $$0.a(cyq.iz, 60, 20);
      $$0.a(cyq.me, 30, 60);
      $$0.a(cyq.mZ, 60, 60);
      $$0.a(cyq.nS, 60, 60);
      $$0.a(cyq.oa, 30, 20);
      $$0.a(cyq.pc, 5, 20);
      $$0.a(cyq.oi, 60, 100);
      $$0.a(cyq.pf, 5, 20);
      $$0.a(cyq.pe, 30, 20);
      $$0.a(cyq.aM, 30, 60);
      $$0.a(cyq.aN, 30, 60);
      $$0.a(cyq.sv, 15, 60);
      $$0.a(cyq.sw, 15, 60);
      $$0.a(cyq.sx, 60, 100);
      $$0.a(cyq.sy, 30, 60);
      $$0.a(cyq.sz, 30, 60);
      $$0.a(cyq.sD, 60, 100);
      $$0.a(cyq.sE, 60, 100);
      $$0.a(cyq.sF, 60, 100);
      $$0.a(cyq.sG, 30, 60);
      $$0.a(cyq.fg, 15, 100);
   }
}
