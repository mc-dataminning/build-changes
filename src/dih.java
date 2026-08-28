import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dih extends deu {
   public static final MapCodec<dih> c = b(dih::new);
   public static final int d = 15;
   public static final dtk e = dta.aw;
   public static final dtb f = dkv.b;
   public static final dtb g = dkv.c;
   public static final dtb h = dkv.d;
   public static final dtb i = dkv.e;
   public static final dtb j = dkv.f;
   private static final Map<jf, dtb> k = dkv.h.entrySet().stream().filter($$0 -> $$0.getKey() != jf.a).collect(ac.a());
   private static final ewy l = dfh.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewy m = dfh.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewy n = dfh.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewy o = dfh.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewy F = dfh.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dsk, ewy> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dfh> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dfh> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dih> a() {
      return c;
   }

   public dih(dsj.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dih::m)));
   }

   private static ewy m(dsk $$0) {
      ewy $$1 = ewv.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ewv.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ewv.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ewv.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ewv.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dfj.a.o();
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dsk a(cxm $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dsk b(dbl $$0, ja $$1) {
      ja $$2 = $$1.d();
      dsk $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, jf.b)) {
         dsk $$4 = this.o();

         for (jf $$5 : jf.values()) {
            dtb $$6 = k.get($$5);
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
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, jf.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ab().b(dcb.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dsk $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ad() && this.a((dcf)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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
                        int $$16 = this.a((dci)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ad() || !this.a((dcf)$$1, $$11))) {
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

   protected boolean a(dcf $$0, ja $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dsk $$0) {
      return $$0.b(dta.C) && $$0.c(dta.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dsk $$0) {
      return $$0.b(dta.C) && $$0.c(dta.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dcf $$0, ja $$1, int $$2, ayo $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dsk $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dfh $$8 = $$6.b();
         if ($$8 instanceof dnq) {
            dnq.a($$0, $$1);
         }
      }
   }

   private dsk a(dcg $$0, ja $$1, int $$2) {
      dsk $$3 = a($$0, $$1);
      return $$3.a(dfj.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dbl $$0, ja $$1) {
      for (jf $$2 : jf.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dci $$0, ja $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jf $$3 : jf.values()) {
            dsk $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dsk $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(ayo $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dfh $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dih $$0 = (dih)dfj.cr;
      $$0.a(dfj.n, 5, 20);
      $$0.a(dfj.o, 5, 20);
      $$0.a(dfj.p, 5, 20);
      $$0.a(dfj.q, 5, 20);
      $$0.a(dfj.r, 5, 20);
      $$0.a(dfj.s, 5, 20);
      $$0.a(dfj.t, 5, 20);
      $$0.a(dfj.u, 5, 20);
      $$0.a(dfj.v, 5, 20);
      $$0.a(dfj.w, 5, 20);
      $$0.a(dfj.jt, 5, 20);
      $$0.a(dfj.ju, 5, 20);
      $$0.a(dfj.jv, 5, 20);
      $$0.a(dfj.jw, 5, 20);
      $$0.a(dfj.jx, 5, 20);
      $$0.a(dfj.jy, 5, 20);
      $$0.a(dfj.jz, 5, 20);
      $$0.a(dfj.jA, 5, 20);
      $$0.a(dfj.jB, 5, 20);
      $$0.a(dfj.jC, 5, 20);
      $$0.a(dfj.fh, 5, 20);
      $$0.a(dfj.jV, 5, 20);
      $$0.a(dfj.jW, 5, 20);
      $$0.a(dfj.jX, 5, 20);
      $$0.a(dfj.jY, 5, 20);
      $$0.a(dfj.jZ, 5, 20);
      $$0.a(dfj.ka, 5, 20);
      $$0.a(dfj.kb, 5, 20);
      $$0.a(dfj.kc, 5, 20);
      $$0.a(dfj.dU, 5, 20);
      $$0.a(dfj.kd, 5, 20);
      $$0.a(dfj.ke, 5, 20);
      $$0.a(dfj.kf, 5, 20);
      $$0.a(dfj.kg, 5, 20);
      $$0.a(dfj.kh, 5, 20);
      $$0.a(dfj.ki, 5, 20);
      $$0.a(dfj.kj, 5, 20);
      $$0.a(dfj.kk, 5, 20);
      $$0.a(dfj.cu, 5, 20);
      $$0.a(dfj.fL, 5, 20);
      $$0.a(dfj.fK, 5, 20);
      $$0.a(dfj.fM, 5, 20);
      $$0.a(dfj.hP, 5, 20);
      $$0.a(dfj.hQ, 5, 20);
      $$0.a(dfj.hR, 5, 20);
      $$0.a(dfj.hS, 5, 20);
      $$0.a(dfj.hT, 5, 20);
      $$0.a(dfj.hU, 5, 20);
      $$0.a(dfj.U, 5, 5);
      $$0.a(dfj.V, 5, 5);
      $$0.a(dfj.W, 5, 5);
      $$0.a(dfj.X, 5, 5);
      $$0.a(dfj.Y, 5, 5);
      $$0.a(dfj.Z, 5, 5);
      $$0.a(dfj.aa, 5, 5);
      $$0.a(dfj.ab, 5, 5);
      $$0.a(dfj.ae, 5, 5);
      $$0.a(dfj.al, 5, 5);
      $$0.a(dfj.af, 5, 5);
      $$0.a(dfj.ag, 5, 5);
      $$0.a(dfj.ah, 5, 5);
      $$0.a(dfj.ai, 5, 5);
      $$0.a(dfj.aj, 5, 5);
      $$0.a(dfj.ak, 5, 5);
      $$0.a(dfj.am, 5, 5);
      $$0.a(dfj.an, 5, 5);
      $$0.a(dfj.aw, 5, 5);
      $$0.a(dfj.ax, 5, 5);
      $$0.a(dfj.ay, 5, 5);
      $$0.a(dfj.az, 5, 5);
      $$0.a(dfj.aA, 5, 5);
      $$0.a(dfj.aB, 5, 5);
      $$0.a(dfj.aC, 5, 5);
      $$0.a(dfj.aD, 5, 5);
      $$0.a(dfj.ao, 5, 5);
      $$0.a(dfj.ap, 5, 5);
      $$0.a(dfj.aq, 5, 5);
      $$0.a(dfj.ar, 5, 5);
      $$0.a(dfj.as, 5, 5);
      $$0.a(dfj.at, 5, 5);
      $$0.a(dfj.au, 5, 5);
      $$0.a(dfj.av, 5, 5);
      $$0.a(dfj.ac, 5, 20);
      $$0.a(dfj.aE, 30, 60);
      $$0.a(dfj.aF, 30, 60);
      $$0.a(dfj.aG, 30, 60);
      $$0.a(dfj.aH, 30, 60);
      $$0.a(dfj.aI, 30, 60);
      $$0.a(dfj.aJ, 30, 60);
      $$0.a(dfj.aK, 30, 60);
      $$0.a(dfj.aL, 30, 60);
      $$0.a(dfj.cl, 30, 20);
      $$0.a(dfj.ck, 15, 100);
      $$0.a(dfj.bt, 60, 100);
      $$0.a(dfj.bu, 60, 100);
      $$0.a(dfj.bv, 60, 100);
      $$0.a(dfj.iD, 60, 100);
      $$0.a(dfj.iE, 60, 100);
      $$0.a(dfj.iF, 60, 100);
      $$0.a(dfj.iG, 60, 100);
      $$0.a(dfj.iH, 60, 100);
      $$0.a(dfj.iI, 60, 100);
      $$0.a(dfj.bR, 60, 100);
      $$0.a(dfj.bT, 60, 100);
      $$0.a(dfj.bU, 60, 100);
      $$0.a(dfj.bV, 60, 100);
      $$0.a(dfj.bW, 60, 100);
      $$0.a(dfj.bX, 60, 100);
      $$0.a(dfj.bY, 60, 100);
      $$0.a(dfj.bZ, 60, 100);
      $$0.a(dfj.ca, 60, 100);
      $$0.a(dfj.cb, 60, 100);
      $$0.a(dfj.cc, 60, 100);
      $$0.a(dfj.ce, 60, 100);
      $$0.a(dfj.bS, 60, 100);
      $$0.a(dfj.kC, 60, 100);
      $$0.a(dfj.cd, 60, 100);
      $$0.a(dfj.sB, 60, 100);
      $$0.a(dfj.bA, 30, 60);
      $$0.a(dfj.bB, 30, 60);
      $$0.a(dfj.bC, 30, 60);
      $$0.a(dfj.bD, 30, 60);
      $$0.a(dfj.bE, 30, 60);
      $$0.a(dfj.bF, 30, 60);
      $$0.a(dfj.bG, 30, 60);
      $$0.a(dfj.bH, 30, 60);
      $$0.a(dfj.bI, 30, 60);
      $$0.a(dfj.bJ, 30, 60);
      $$0.a(dfj.bK, 30, 60);
      $$0.a(dfj.bL, 30, 60);
      $$0.a(dfj.bM, 30, 60);
      $$0.a(dfj.bN, 30, 60);
      $$0.a(dfj.bO, 30, 60);
      $$0.a(dfj.bP, 30, 60);
      $$0.a(dfj.ff, 15, 100);
      $$0.a(dfj.iB, 5, 5);
      $$0.a(dfj.ij, 60, 20);
      $$0.a(dfj.pd, 15, 20);
      $$0.a(dfj.ik, 60, 20);
      $$0.a(dfj.il, 60, 20);
      $$0.a(dfj.im, 60, 20);
      $$0.a(dfj.in, 60, 20);
      $$0.a(dfj.io, 60, 20);
      $$0.a(dfj.ip, 60, 20);
      $$0.a(dfj.iq, 60, 20);
      $$0.a(dfj.ir, 60, 20);
      $$0.a(dfj.is, 60, 20);
      $$0.a(dfj.it, 60, 20);
      $$0.a(dfj.iu, 60, 20);
      $$0.a(dfj.iv, 60, 20);
      $$0.a(dfj.iw, 60, 20);
      $$0.a(dfj.ix, 60, 20);
      $$0.a(dfj.iy, 60, 20);
      $$0.a(dfj.iz, 60, 20);
      $$0.a(dfj.me, 30, 60);
      $$0.a(dfj.mZ, 60, 60);
      $$0.a(dfj.nS, 60, 60);
      $$0.a(dfj.oa, 30, 20);
      $$0.a(dfj.pc, 5, 20);
      $$0.a(dfj.oi, 60, 100);
      $$0.a(dfj.pf, 5, 20);
      $$0.a(dfj.pe, 30, 20);
      $$0.a(dfj.aM, 30, 60);
      $$0.a(dfj.aN, 30, 60);
      $$0.a(dfj.sv, 15, 60);
      $$0.a(dfj.sw, 15, 60);
      $$0.a(dfj.sx, 60, 100);
      $$0.a(dfj.sy, 30, 60);
      $$0.a(dfj.sz, 30, 60);
      $$0.a(dfj.sD, 60, 100);
      $$0.a(dfj.sE, 60, 100);
      $$0.a(dfj.sF, 60, 100);
      $$0.a(dfj.sG, 30, 60);
      $$0.a(dfj.fg, 15, 100);
   }
}
