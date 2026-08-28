import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dib extends deo {
   public static final MapCodec<dib> c = b(dib::new);
   public static final int d = 15;
   public static final dte e = dsu.aw;
   public static final dsv f = dkp.b;
   public static final dsv g = dkp.c;
   public static final dsv h = dkp.d;
   public static final dsv i = dkp.e;
   public static final dsv j = dkp.f;
   private static final Map<je, dsv> k = dkp.h.entrySet().stream().filter($$0 -> $$0.getKey() != je.a).collect(ac.a());
   private static final ewm l = dfb.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewm m = dfb.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewm n = dfb.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewm o = dfb.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewm F = dfb.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dse, ewm> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dfb> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dfb> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dib> a() {
      return c;
   }

   public dib(dsd.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dib::m)));
   }

   private static ewm m(dse $$0) {
      ewm $$1 = ewj.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ewj.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ewj.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ewj.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ewj.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dfd.a.o();
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dse a(cyc $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dse b(dbg $$0, iz $$1) {
      iz $$2 = $$1.d();
      dse $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, je.b)) {
         dse $$4 = this.o();

         for (je $$5 : je.values()) {
            dsv $$6 = k.get($$5);
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
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      iz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, je.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ab().b(dbw.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dse $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ad() && this.a((dca)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  iz $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, je.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(awo.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            iz.a $$11 = new iz.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dcd)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ad() || !this.a((dca)$$1, $$11))) {
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

   protected boolean a(dca $$0, iz $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dse $$0) {
      return $$0.b(dsu.C) && $$0.c(dsu.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dse $$0) {
      return $$0.b(dsu.C) && $$0.c(dsu.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dca $$0, iz $$1, int $$2, azh $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dse $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dfb $$8 = $$6.b();
         if ($$8 instanceof dnk) {
            dnk.a($$0, $$1);
         }
      }
   }

   private dse a(dcb $$0, iz $$1, int $$2) {
      dse $$3 = a($$0, $$1);
      return $$3.a(dfd.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dbg $$0, iz $$1) {
      for (je $$2 : je.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dcd $$0, iz $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (je $$3 : je.values()) {
            dse $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dse $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(azh $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dfb $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dib $$0 = (dib)dfd.cr;
      $$0.a(dfd.n, 5, 20);
      $$0.a(dfd.o, 5, 20);
      $$0.a(dfd.p, 5, 20);
      $$0.a(dfd.q, 5, 20);
      $$0.a(dfd.r, 5, 20);
      $$0.a(dfd.s, 5, 20);
      $$0.a(dfd.t, 5, 20);
      $$0.a(dfd.u, 5, 20);
      $$0.a(dfd.v, 5, 20);
      $$0.a(dfd.w, 5, 20);
      $$0.a(dfd.jt, 5, 20);
      $$0.a(dfd.ju, 5, 20);
      $$0.a(dfd.jv, 5, 20);
      $$0.a(dfd.jw, 5, 20);
      $$0.a(dfd.jx, 5, 20);
      $$0.a(dfd.jy, 5, 20);
      $$0.a(dfd.jz, 5, 20);
      $$0.a(dfd.jA, 5, 20);
      $$0.a(dfd.jB, 5, 20);
      $$0.a(dfd.jC, 5, 20);
      $$0.a(dfd.fh, 5, 20);
      $$0.a(dfd.jV, 5, 20);
      $$0.a(dfd.jW, 5, 20);
      $$0.a(dfd.jX, 5, 20);
      $$0.a(dfd.jY, 5, 20);
      $$0.a(dfd.jZ, 5, 20);
      $$0.a(dfd.ka, 5, 20);
      $$0.a(dfd.kb, 5, 20);
      $$0.a(dfd.kc, 5, 20);
      $$0.a(dfd.dU, 5, 20);
      $$0.a(dfd.kd, 5, 20);
      $$0.a(dfd.ke, 5, 20);
      $$0.a(dfd.kf, 5, 20);
      $$0.a(dfd.kg, 5, 20);
      $$0.a(dfd.kh, 5, 20);
      $$0.a(dfd.ki, 5, 20);
      $$0.a(dfd.kj, 5, 20);
      $$0.a(dfd.kk, 5, 20);
      $$0.a(dfd.cu, 5, 20);
      $$0.a(dfd.fL, 5, 20);
      $$0.a(dfd.fK, 5, 20);
      $$0.a(dfd.fM, 5, 20);
      $$0.a(dfd.hP, 5, 20);
      $$0.a(dfd.hQ, 5, 20);
      $$0.a(dfd.hR, 5, 20);
      $$0.a(dfd.hS, 5, 20);
      $$0.a(dfd.hT, 5, 20);
      $$0.a(dfd.hU, 5, 20);
      $$0.a(dfd.U, 5, 5);
      $$0.a(dfd.V, 5, 5);
      $$0.a(dfd.W, 5, 5);
      $$0.a(dfd.X, 5, 5);
      $$0.a(dfd.Y, 5, 5);
      $$0.a(dfd.Z, 5, 5);
      $$0.a(dfd.aa, 5, 5);
      $$0.a(dfd.ab, 5, 5);
      $$0.a(dfd.ae, 5, 5);
      $$0.a(dfd.al, 5, 5);
      $$0.a(dfd.af, 5, 5);
      $$0.a(dfd.ag, 5, 5);
      $$0.a(dfd.ah, 5, 5);
      $$0.a(dfd.ai, 5, 5);
      $$0.a(dfd.aj, 5, 5);
      $$0.a(dfd.ak, 5, 5);
      $$0.a(dfd.am, 5, 5);
      $$0.a(dfd.an, 5, 5);
      $$0.a(dfd.aw, 5, 5);
      $$0.a(dfd.ax, 5, 5);
      $$0.a(dfd.ay, 5, 5);
      $$0.a(dfd.az, 5, 5);
      $$0.a(dfd.aA, 5, 5);
      $$0.a(dfd.aB, 5, 5);
      $$0.a(dfd.aC, 5, 5);
      $$0.a(dfd.aD, 5, 5);
      $$0.a(dfd.ao, 5, 5);
      $$0.a(dfd.ap, 5, 5);
      $$0.a(dfd.aq, 5, 5);
      $$0.a(dfd.ar, 5, 5);
      $$0.a(dfd.as, 5, 5);
      $$0.a(dfd.at, 5, 5);
      $$0.a(dfd.au, 5, 5);
      $$0.a(dfd.av, 5, 5);
      $$0.a(dfd.ac, 5, 20);
      $$0.a(dfd.aE, 30, 60);
      $$0.a(dfd.aF, 30, 60);
      $$0.a(dfd.aG, 30, 60);
      $$0.a(dfd.aH, 30, 60);
      $$0.a(dfd.aI, 30, 60);
      $$0.a(dfd.aJ, 30, 60);
      $$0.a(dfd.aK, 30, 60);
      $$0.a(dfd.aL, 30, 60);
      $$0.a(dfd.cl, 30, 20);
      $$0.a(dfd.ck, 15, 100);
      $$0.a(dfd.bt, 60, 100);
      $$0.a(dfd.bu, 60, 100);
      $$0.a(dfd.bv, 60, 100);
      $$0.a(dfd.iD, 60, 100);
      $$0.a(dfd.iE, 60, 100);
      $$0.a(dfd.iF, 60, 100);
      $$0.a(dfd.iG, 60, 100);
      $$0.a(dfd.iH, 60, 100);
      $$0.a(dfd.iI, 60, 100);
      $$0.a(dfd.bR, 60, 100);
      $$0.a(dfd.bT, 60, 100);
      $$0.a(dfd.bU, 60, 100);
      $$0.a(dfd.bV, 60, 100);
      $$0.a(dfd.bW, 60, 100);
      $$0.a(dfd.bX, 60, 100);
      $$0.a(dfd.bY, 60, 100);
      $$0.a(dfd.bZ, 60, 100);
      $$0.a(dfd.ca, 60, 100);
      $$0.a(dfd.cb, 60, 100);
      $$0.a(dfd.cc, 60, 100);
      $$0.a(dfd.ce, 60, 100);
      $$0.a(dfd.bS, 60, 100);
      $$0.a(dfd.kC, 60, 100);
      $$0.a(dfd.cd, 60, 100);
      $$0.a(dfd.sB, 60, 100);
      $$0.a(dfd.bA, 30, 60);
      $$0.a(dfd.bB, 30, 60);
      $$0.a(dfd.bC, 30, 60);
      $$0.a(dfd.bD, 30, 60);
      $$0.a(dfd.bE, 30, 60);
      $$0.a(dfd.bF, 30, 60);
      $$0.a(dfd.bG, 30, 60);
      $$0.a(dfd.bH, 30, 60);
      $$0.a(dfd.bI, 30, 60);
      $$0.a(dfd.bJ, 30, 60);
      $$0.a(dfd.bK, 30, 60);
      $$0.a(dfd.bL, 30, 60);
      $$0.a(dfd.bM, 30, 60);
      $$0.a(dfd.bN, 30, 60);
      $$0.a(dfd.bO, 30, 60);
      $$0.a(dfd.bP, 30, 60);
      $$0.a(dfd.ff, 15, 100);
      $$0.a(dfd.iB, 5, 5);
      $$0.a(dfd.ij, 60, 20);
      $$0.a(dfd.pd, 15, 20);
      $$0.a(dfd.ik, 60, 20);
      $$0.a(dfd.il, 60, 20);
      $$0.a(dfd.im, 60, 20);
      $$0.a(dfd.in, 60, 20);
      $$0.a(dfd.io, 60, 20);
      $$0.a(dfd.ip, 60, 20);
      $$0.a(dfd.iq, 60, 20);
      $$0.a(dfd.ir, 60, 20);
      $$0.a(dfd.is, 60, 20);
      $$0.a(dfd.it, 60, 20);
      $$0.a(dfd.iu, 60, 20);
      $$0.a(dfd.iv, 60, 20);
      $$0.a(dfd.iw, 60, 20);
      $$0.a(dfd.ix, 60, 20);
      $$0.a(dfd.iy, 60, 20);
      $$0.a(dfd.iz, 60, 20);
      $$0.a(dfd.me, 30, 60);
      $$0.a(dfd.mZ, 60, 60);
      $$0.a(dfd.nS, 60, 60);
      $$0.a(dfd.oa, 30, 20);
      $$0.a(dfd.pc, 5, 20);
      $$0.a(dfd.oi, 60, 100);
      $$0.a(dfd.pf, 5, 20);
      $$0.a(dfd.pe, 30, 20);
      $$0.a(dfd.aM, 30, 60);
      $$0.a(dfd.aN, 30, 60);
      $$0.a(dfd.sv, 15, 60);
      $$0.a(dfd.sw, 15, 60);
      $$0.a(dfd.sx, 60, 100);
      $$0.a(dfd.sy, 30, 60);
      $$0.a(dfd.sz, 30, 60);
      $$0.a(dfd.sD, 60, 100);
      $$0.a(dfd.sE, 60, 100);
      $$0.a(dfd.sF, 60, 100);
      $$0.a(dfd.sG, 30, 60);
      $$0.a(dfd.fg, 15, 100);
   }
}
