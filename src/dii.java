import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dii extends dev {
   public static final MapCodec<dii> c = b(dii::new);
   public static final int d = 15;
   public static final dtl e = dtb.aw;
   public static final dtc f = dkw.b;
   public static final dtc g = dkw.c;
   public static final dtc h = dkw.d;
   public static final dtc i = dkw.e;
   public static final dtc j = dkw.f;
   private static final Map<jf, dtc> k = dkw.h.entrySet().stream().filter($$0 -> $$0.getKey() != jf.a).collect(ac.a());
   private static final exa l = dfi.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final exa m = dfi.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final exa n = dfi.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final exa o = dfi.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final exa F = dfi.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dsl, exa> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dfi> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dfi> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dii> a() {
      return c;
   }

   public dii(dsk.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dii::m)));
   }

   private static exa m(dsl $$0) {
      exa $$1 = ewx.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ewx.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ewx.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ewx.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ewx.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dfk.a.o();
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dsl a(cxn $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dsl b(dbm $$0, ja $$1) {
      ja $$2 = $$1.d();
      dsl $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, jf.b)) {
         dsl $$4 = this.o();

         for (jf $$5 : jf.values()) {
            dtc $$6 = k.get($$5);
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
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      ja $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, jf.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ab().b(dcc.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dsl $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ad() && this.a((dcg)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  ja $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, jf.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(avv.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            ja.a $$11 = new ja.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dcj)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ad() || !this.a((dcg)$$1, $$11))) {
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

   protected boolean a(dcg $$0, ja $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dsl $$0) {
      return $$0.b(dtb.C) && $$0.c(dtb.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dsl $$0) {
      return $$0.b(dtb.C) && $$0.c(dtb.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dcg $$0, ja $$1, int $$2, ayo $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dsl $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dfi $$8 = $$6.b();
         if ($$8 instanceof dnr) {
            dnr.a($$0, $$1);
         }
      }
   }

   private dsl a(dch $$0, ja $$1, int $$2) {
      dsl $$3 = a($$0, $$1);
      return $$3.a(dfk.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dbm $$0, ja $$1) {
      for (jf $$2 : jf.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dcj $$0, ja $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jf $$3 : jf.values()) {
            dsl $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dsl $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(ayo $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dfi $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dii $$0 = (dii)dfk.cr;
      $$0.a(dfk.n, 5, 20);
      $$0.a(dfk.o, 5, 20);
      $$0.a(dfk.p, 5, 20);
      $$0.a(dfk.q, 5, 20);
      $$0.a(dfk.r, 5, 20);
      $$0.a(dfk.s, 5, 20);
      $$0.a(dfk.t, 5, 20);
      $$0.a(dfk.u, 5, 20);
      $$0.a(dfk.v, 5, 20);
      $$0.a(dfk.w, 5, 20);
      $$0.a(dfk.jt, 5, 20);
      $$0.a(dfk.ju, 5, 20);
      $$0.a(dfk.jv, 5, 20);
      $$0.a(dfk.jw, 5, 20);
      $$0.a(dfk.jx, 5, 20);
      $$0.a(dfk.jy, 5, 20);
      $$0.a(dfk.jz, 5, 20);
      $$0.a(dfk.jA, 5, 20);
      $$0.a(dfk.jB, 5, 20);
      $$0.a(dfk.jC, 5, 20);
      $$0.a(dfk.fh, 5, 20);
      $$0.a(dfk.jV, 5, 20);
      $$0.a(dfk.jW, 5, 20);
      $$0.a(dfk.jX, 5, 20);
      $$0.a(dfk.jY, 5, 20);
      $$0.a(dfk.jZ, 5, 20);
      $$0.a(dfk.ka, 5, 20);
      $$0.a(dfk.kb, 5, 20);
      $$0.a(dfk.kc, 5, 20);
      $$0.a(dfk.dU, 5, 20);
      $$0.a(dfk.kd, 5, 20);
      $$0.a(dfk.ke, 5, 20);
      $$0.a(dfk.kf, 5, 20);
      $$0.a(dfk.kg, 5, 20);
      $$0.a(dfk.kh, 5, 20);
      $$0.a(dfk.ki, 5, 20);
      $$0.a(dfk.kj, 5, 20);
      $$0.a(dfk.kk, 5, 20);
      $$0.a(dfk.cu, 5, 20);
      $$0.a(dfk.fL, 5, 20);
      $$0.a(dfk.fK, 5, 20);
      $$0.a(dfk.fM, 5, 20);
      $$0.a(dfk.hP, 5, 20);
      $$0.a(dfk.hQ, 5, 20);
      $$0.a(dfk.hR, 5, 20);
      $$0.a(dfk.hS, 5, 20);
      $$0.a(dfk.hT, 5, 20);
      $$0.a(dfk.hU, 5, 20);
      $$0.a(dfk.U, 5, 5);
      $$0.a(dfk.V, 5, 5);
      $$0.a(dfk.W, 5, 5);
      $$0.a(dfk.X, 5, 5);
      $$0.a(dfk.Y, 5, 5);
      $$0.a(dfk.Z, 5, 5);
      $$0.a(dfk.aa, 5, 5);
      $$0.a(dfk.ab, 5, 5);
      $$0.a(dfk.ae, 5, 5);
      $$0.a(dfk.al, 5, 5);
      $$0.a(dfk.af, 5, 5);
      $$0.a(dfk.ag, 5, 5);
      $$0.a(dfk.ah, 5, 5);
      $$0.a(dfk.ai, 5, 5);
      $$0.a(dfk.aj, 5, 5);
      $$0.a(dfk.ak, 5, 5);
      $$0.a(dfk.am, 5, 5);
      $$0.a(dfk.an, 5, 5);
      $$0.a(dfk.aw, 5, 5);
      $$0.a(dfk.ax, 5, 5);
      $$0.a(dfk.ay, 5, 5);
      $$0.a(dfk.az, 5, 5);
      $$0.a(dfk.aA, 5, 5);
      $$0.a(dfk.aB, 5, 5);
      $$0.a(dfk.aC, 5, 5);
      $$0.a(dfk.aD, 5, 5);
      $$0.a(dfk.ao, 5, 5);
      $$0.a(dfk.ap, 5, 5);
      $$0.a(dfk.aq, 5, 5);
      $$0.a(dfk.ar, 5, 5);
      $$0.a(dfk.as, 5, 5);
      $$0.a(dfk.at, 5, 5);
      $$0.a(dfk.au, 5, 5);
      $$0.a(dfk.av, 5, 5);
      $$0.a(dfk.ac, 5, 20);
      $$0.a(dfk.aE, 30, 60);
      $$0.a(dfk.aF, 30, 60);
      $$0.a(dfk.aG, 30, 60);
      $$0.a(dfk.aH, 30, 60);
      $$0.a(dfk.aI, 30, 60);
      $$0.a(dfk.aJ, 30, 60);
      $$0.a(dfk.aK, 30, 60);
      $$0.a(dfk.aL, 30, 60);
      $$0.a(dfk.cl, 30, 20);
      $$0.a(dfk.ck, 15, 100);
      $$0.a(dfk.bt, 60, 100);
      $$0.a(dfk.bu, 60, 100);
      $$0.a(dfk.bv, 60, 100);
      $$0.a(dfk.iD, 60, 100);
      $$0.a(dfk.iE, 60, 100);
      $$0.a(dfk.iF, 60, 100);
      $$0.a(dfk.iG, 60, 100);
      $$0.a(dfk.iH, 60, 100);
      $$0.a(dfk.iI, 60, 100);
      $$0.a(dfk.bR, 60, 100);
      $$0.a(dfk.bT, 60, 100);
      $$0.a(dfk.bU, 60, 100);
      $$0.a(dfk.bV, 60, 100);
      $$0.a(dfk.bW, 60, 100);
      $$0.a(dfk.bX, 60, 100);
      $$0.a(dfk.bY, 60, 100);
      $$0.a(dfk.bZ, 60, 100);
      $$0.a(dfk.ca, 60, 100);
      $$0.a(dfk.cb, 60, 100);
      $$0.a(dfk.cc, 60, 100);
      $$0.a(dfk.ce, 60, 100);
      $$0.a(dfk.bS, 60, 100);
      $$0.a(dfk.kC, 60, 100);
      $$0.a(dfk.cd, 60, 100);
      $$0.a(dfk.sB, 60, 100);
      $$0.a(dfk.bA, 30, 60);
      $$0.a(dfk.bB, 30, 60);
      $$0.a(dfk.bC, 30, 60);
      $$0.a(dfk.bD, 30, 60);
      $$0.a(dfk.bE, 30, 60);
      $$0.a(dfk.bF, 30, 60);
      $$0.a(dfk.bG, 30, 60);
      $$0.a(dfk.bH, 30, 60);
      $$0.a(dfk.bI, 30, 60);
      $$0.a(dfk.bJ, 30, 60);
      $$0.a(dfk.bK, 30, 60);
      $$0.a(dfk.bL, 30, 60);
      $$0.a(dfk.bM, 30, 60);
      $$0.a(dfk.bN, 30, 60);
      $$0.a(dfk.bO, 30, 60);
      $$0.a(dfk.bP, 30, 60);
      $$0.a(dfk.ff, 15, 100);
      $$0.a(dfk.iB, 5, 5);
      $$0.a(dfk.ij, 60, 20);
      $$0.a(dfk.pd, 15, 20);
      $$0.a(dfk.ik, 60, 20);
      $$0.a(dfk.il, 60, 20);
      $$0.a(dfk.im, 60, 20);
      $$0.a(dfk.in, 60, 20);
      $$0.a(dfk.io, 60, 20);
      $$0.a(dfk.ip, 60, 20);
      $$0.a(dfk.iq, 60, 20);
      $$0.a(dfk.ir, 60, 20);
      $$0.a(dfk.is, 60, 20);
      $$0.a(dfk.it, 60, 20);
      $$0.a(dfk.iu, 60, 20);
      $$0.a(dfk.iv, 60, 20);
      $$0.a(dfk.iw, 60, 20);
      $$0.a(dfk.ix, 60, 20);
      $$0.a(dfk.iy, 60, 20);
      $$0.a(dfk.iz, 60, 20);
      $$0.a(dfk.me, 30, 60);
      $$0.a(dfk.mZ, 60, 60);
      $$0.a(dfk.nS, 60, 60);
      $$0.a(dfk.oa, 30, 20);
      $$0.a(dfk.pc, 5, 20);
      $$0.a(dfk.oi, 60, 100);
      $$0.a(dfk.pf, 5, 20);
      $$0.a(dfk.pe, 30, 20);
      $$0.a(dfk.aM, 30, 60);
      $$0.a(dfk.aN, 30, 60);
      $$0.a(dfk.sv, 15, 60);
      $$0.a(dfk.sw, 15, 60);
      $$0.a(dfk.sx, 60, 100);
      $$0.a(dfk.sy, 30, 60);
      $$0.a(dfk.sz, 30, 60);
      $$0.a(dfk.sD, 60, 100);
      $$0.a(dfk.sE, 60, 100);
      $$0.a(dfk.sF, 60, 100);
      $$0.a(dfk.sG, 30, 60);
      $$0.a(dfk.fg, 15, 100);
   }
}
