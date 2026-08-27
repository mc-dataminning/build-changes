import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dcf extends cys {
   public static final MapCodec<dcf> c = b(dcf::new);
   public static final int d = 15;
   public static final dne e = dmu.aw;
   public static final dmv f = des.b;
   public static final dmv g = des.c;
   public static final dmv h = des.d;
   public static final dmv i = des.e;
   public static final dmv j = des.f;
   private static final Map<ih, dmv> k = des.h.entrySet().stream().filter($$0 -> $$0.getKey() != ih.a).collect(ac.a());
   private static final epo l = czf.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final epo m = czf.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final epo n = czf.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final epo o = czf.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final epo F = czf.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dme, epo> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<czf> P = new Object2IntOpenHashMap();
   private final Object2IntMap<czf> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dcf> a() {
      return c;
   }

   public dcf(dmd.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dcf::m)));
   }

   private static epo m(dme $$0) {
      epo $$1 = epl.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = epl.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = epl.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = epl.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = epl.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : czh.a.o();
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dme a(crx $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dme b(cvk $$0, ib $$1) {
      ib $$2 = $$1.d();
      dme $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ih.b)) {
         dme $$4 = this.o();

         for (ih $$5 : ih.values()) {
            dmv $$6 = k.get($$5);
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
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ih.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.Z().b(cwa.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dme $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.E_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ab() && this.a((cwe)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(aud.ad);
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
                        int $$16 = this.a((cwh)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.aj().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ab() || !this.a((cwe)$$1, $$11))) {
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

   protected boolean a(cwe $$0, ib $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dme $$0) {
      return $$0.b(dmu.C) && $$0.c(dmu.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dme $$0) {
      return $$0.b(dmu.C) && $$0.c(dmu.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(cwe $$0, ib $$1, int $$2, awt $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dme $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         czf $$8 = $$6.b();
         if ($$8 instanceof dhn) {
            dhn.a($$0, $$1);
         }
      }
   }

   private dme a(cwf $$0, ib $$1, int $$2) {
      dme $$3 = a($$0, $$1);
      return $$3.a(czh.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cvk $$0, ib $$1) {
      for (ih $$2 : ih.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cwh $$0, ib $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ih $$3 : ih.values()) {
            dme $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dme $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(awt $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(czf $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dcf $$0 = (dcf)czh.cr;
      $$0.a(czh.n, 5, 20);
      $$0.a(czh.o, 5, 20);
      $$0.a(czh.p, 5, 20);
      $$0.a(czh.q, 5, 20);
      $$0.a(czh.r, 5, 20);
      $$0.a(czh.s, 5, 20);
      $$0.a(czh.t, 5, 20);
      $$0.a(czh.u, 5, 20);
      $$0.a(czh.v, 5, 20);
      $$0.a(czh.w, 5, 20);
      $$0.a(czh.jt, 5, 20);
      $$0.a(czh.ju, 5, 20);
      $$0.a(czh.jv, 5, 20);
      $$0.a(czh.jw, 5, 20);
      $$0.a(czh.jx, 5, 20);
      $$0.a(czh.jy, 5, 20);
      $$0.a(czh.jz, 5, 20);
      $$0.a(czh.jA, 5, 20);
      $$0.a(czh.jB, 5, 20);
      $$0.a(czh.jC, 5, 20);
      $$0.a(czh.fh, 5, 20);
      $$0.a(czh.jV, 5, 20);
      $$0.a(czh.jW, 5, 20);
      $$0.a(czh.jX, 5, 20);
      $$0.a(czh.jY, 5, 20);
      $$0.a(czh.jZ, 5, 20);
      $$0.a(czh.ka, 5, 20);
      $$0.a(czh.kb, 5, 20);
      $$0.a(czh.kc, 5, 20);
      $$0.a(czh.dU, 5, 20);
      $$0.a(czh.kd, 5, 20);
      $$0.a(czh.ke, 5, 20);
      $$0.a(czh.kf, 5, 20);
      $$0.a(czh.kg, 5, 20);
      $$0.a(czh.kh, 5, 20);
      $$0.a(czh.ki, 5, 20);
      $$0.a(czh.kj, 5, 20);
      $$0.a(czh.kk, 5, 20);
      $$0.a(czh.cu, 5, 20);
      $$0.a(czh.fL, 5, 20);
      $$0.a(czh.fK, 5, 20);
      $$0.a(czh.fM, 5, 20);
      $$0.a(czh.hP, 5, 20);
      $$0.a(czh.hQ, 5, 20);
      $$0.a(czh.hR, 5, 20);
      $$0.a(czh.hS, 5, 20);
      $$0.a(czh.hT, 5, 20);
      $$0.a(czh.hU, 5, 20);
      $$0.a(czh.U, 5, 5);
      $$0.a(czh.V, 5, 5);
      $$0.a(czh.W, 5, 5);
      $$0.a(czh.X, 5, 5);
      $$0.a(czh.Y, 5, 5);
      $$0.a(czh.Z, 5, 5);
      $$0.a(czh.aa, 5, 5);
      $$0.a(czh.ab, 5, 5);
      $$0.a(czh.ae, 5, 5);
      $$0.a(czh.al, 5, 5);
      $$0.a(czh.af, 5, 5);
      $$0.a(czh.ag, 5, 5);
      $$0.a(czh.ah, 5, 5);
      $$0.a(czh.ai, 5, 5);
      $$0.a(czh.aj, 5, 5);
      $$0.a(czh.ak, 5, 5);
      $$0.a(czh.am, 5, 5);
      $$0.a(czh.an, 5, 5);
      $$0.a(czh.aw, 5, 5);
      $$0.a(czh.ax, 5, 5);
      $$0.a(czh.ay, 5, 5);
      $$0.a(czh.az, 5, 5);
      $$0.a(czh.aA, 5, 5);
      $$0.a(czh.aB, 5, 5);
      $$0.a(czh.aC, 5, 5);
      $$0.a(czh.aD, 5, 5);
      $$0.a(czh.ao, 5, 5);
      $$0.a(czh.ap, 5, 5);
      $$0.a(czh.aq, 5, 5);
      $$0.a(czh.ar, 5, 5);
      $$0.a(czh.as, 5, 5);
      $$0.a(czh.at, 5, 5);
      $$0.a(czh.au, 5, 5);
      $$0.a(czh.av, 5, 5);
      $$0.a(czh.ac, 5, 20);
      $$0.a(czh.aE, 30, 60);
      $$0.a(czh.aF, 30, 60);
      $$0.a(czh.aG, 30, 60);
      $$0.a(czh.aH, 30, 60);
      $$0.a(czh.aI, 30, 60);
      $$0.a(czh.aJ, 30, 60);
      $$0.a(czh.aK, 30, 60);
      $$0.a(czh.aL, 30, 60);
      $$0.a(czh.cl, 30, 20);
      $$0.a(czh.ck, 15, 100);
      $$0.a(czh.bt, 60, 100);
      $$0.a(czh.bu, 60, 100);
      $$0.a(czh.bv, 60, 100);
      $$0.a(czh.iD, 60, 100);
      $$0.a(czh.iE, 60, 100);
      $$0.a(czh.iF, 60, 100);
      $$0.a(czh.iG, 60, 100);
      $$0.a(czh.iH, 60, 100);
      $$0.a(czh.iI, 60, 100);
      $$0.a(czh.bR, 60, 100);
      $$0.a(czh.bT, 60, 100);
      $$0.a(czh.bU, 60, 100);
      $$0.a(czh.bV, 60, 100);
      $$0.a(czh.bW, 60, 100);
      $$0.a(czh.bX, 60, 100);
      $$0.a(czh.bY, 60, 100);
      $$0.a(czh.bZ, 60, 100);
      $$0.a(czh.ca, 60, 100);
      $$0.a(czh.cb, 60, 100);
      $$0.a(czh.cc, 60, 100);
      $$0.a(czh.ce, 60, 100);
      $$0.a(czh.bS, 60, 100);
      $$0.a(czh.kC, 60, 100);
      $$0.a(czh.cd, 60, 100);
      $$0.a(czh.sB, 60, 100);
      $$0.a(czh.bA, 30, 60);
      $$0.a(czh.bB, 30, 60);
      $$0.a(czh.bC, 30, 60);
      $$0.a(czh.bD, 30, 60);
      $$0.a(czh.bE, 30, 60);
      $$0.a(czh.bF, 30, 60);
      $$0.a(czh.bG, 30, 60);
      $$0.a(czh.bH, 30, 60);
      $$0.a(czh.bI, 30, 60);
      $$0.a(czh.bJ, 30, 60);
      $$0.a(czh.bK, 30, 60);
      $$0.a(czh.bL, 30, 60);
      $$0.a(czh.bM, 30, 60);
      $$0.a(czh.bN, 30, 60);
      $$0.a(czh.bO, 30, 60);
      $$0.a(czh.bP, 30, 60);
      $$0.a(czh.ff, 15, 100);
      $$0.a(czh.iB, 5, 5);
      $$0.a(czh.ij, 60, 20);
      $$0.a(czh.pd, 15, 20);
      $$0.a(czh.ik, 60, 20);
      $$0.a(czh.il, 60, 20);
      $$0.a(czh.im, 60, 20);
      $$0.a(czh.in, 60, 20);
      $$0.a(czh.io, 60, 20);
      $$0.a(czh.ip, 60, 20);
      $$0.a(czh.iq, 60, 20);
      $$0.a(czh.ir, 60, 20);
      $$0.a(czh.is, 60, 20);
      $$0.a(czh.it, 60, 20);
      $$0.a(czh.iu, 60, 20);
      $$0.a(czh.iv, 60, 20);
      $$0.a(czh.iw, 60, 20);
      $$0.a(czh.ix, 60, 20);
      $$0.a(czh.iy, 60, 20);
      $$0.a(czh.iz, 60, 20);
      $$0.a(czh.me, 30, 60);
      $$0.a(czh.mZ, 60, 60);
      $$0.a(czh.nS, 60, 60);
      $$0.a(czh.oa, 30, 20);
      $$0.a(czh.pc, 5, 20);
      $$0.a(czh.oi, 60, 100);
      $$0.a(czh.pf, 5, 20);
      $$0.a(czh.pe, 30, 20);
      $$0.a(czh.aM, 30, 60);
      $$0.a(czh.aN, 30, 60);
      $$0.a(czh.sv, 15, 60);
      $$0.a(czh.sw, 15, 60);
      $$0.a(czh.sx, 60, 100);
      $$0.a(czh.sy, 30, 60);
      $$0.a(czh.sz, 30, 60);
      $$0.a(czh.sD, 60, 100);
      $$0.a(czh.sE, 60, 100);
      $$0.a(czh.sF, 60, 100);
      $$0.a(czh.sG, 30, 60);
      $$0.a(czh.fg, 15, 100);
   }
}
