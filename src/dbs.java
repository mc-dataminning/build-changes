import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dbs extends cyf {
   public static final MapCodec<dbs> c = b(dbs::new);
   public static final int d = 15;
   public static final dmj e = dlz.aw;
   public static final dma f = def.b;
   public static final dma g = def.c;
   public static final dma h = def.d;
   public static final dma i = def.e;
   public static final dma j = def.f;
   private static final Map<ie, dma> k = def.h.entrySet().stream().filter($$0 -> $$0.getKey() != ie.a).collect(ac.a());
   private static final eos l = cys.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eos m = cys.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eos n = cys.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eos o = cys.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eos F = cys.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dlj, eos> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<cys> P = new Object2IntOpenHashMap();
   private final Object2IntMap<cys> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dbs> a() {
      return c;
   }

   public dbs(dli.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dbs::m)));
   }

   private static eos m(dlj $$0) {
      eos $$1 = eop.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = eop.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = eop.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = eop.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = eop.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : cyu.a.o();
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dlj a(crk $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dlj b(cux $$0, hz $$1) {
      hz $$2 = $$1.d();
      dlj $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ie.b)) {
         dlj $$4 = this.o();

         for (ie $$5 : ie.values()) {
            dma $$6 = k.get($$5);
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
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      hz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ie.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.Z().b(cvn.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dlj $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.E_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ab() && this.a((cvr)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(atz.ad);
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
                        int $$16 = this.a((cvu)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.aj().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ab() || !this.a((cvr)$$1, $$11))) {
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

   protected boolean a(cvr $$0, hz $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dlj $$0) {
      return $$0.b(dlz.C) && $$0.c(dlz.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dlj $$0) {
      return $$0.b(dlz.C) && $$0.c(dlz.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(cvr $$0, hz $$1, int $$2, awp $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dlj $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cys $$8 = $$6.b();
         if ($$8 instanceof dha) {
            dha.a($$0, $$1);
         }
      }
   }

   private dlj a(cvs $$0, hz $$1, int $$2) {
      dlj $$3 = a($$0, $$1);
      return $$3.a(cyu.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cux $$0, hz $$1) {
      for (ie $$2 : ie.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cvu $$0, hz $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ie $$3 : ie.values()) {
            dlj $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dlj $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(awp $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(cys $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dbs $$0 = (dbs)cyu.cr;
      $$0.a(cyu.n, 5, 20);
      $$0.a(cyu.o, 5, 20);
      $$0.a(cyu.p, 5, 20);
      $$0.a(cyu.q, 5, 20);
      $$0.a(cyu.r, 5, 20);
      $$0.a(cyu.s, 5, 20);
      $$0.a(cyu.t, 5, 20);
      $$0.a(cyu.u, 5, 20);
      $$0.a(cyu.v, 5, 20);
      $$0.a(cyu.w, 5, 20);
      $$0.a(cyu.jt, 5, 20);
      $$0.a(cyu.ju, 5, 20);
      $$0.a(cyu.jv, 5, 20);
      $$0.a(cyu.jw, 5, 20);
      $$0.a(cyu.jx, 5, 20);
      $$0.a(cyu.jy, 5, 20);
      $$0.a(cyu.jz, 5, 20);
      $$0.a(cyu.jA, 5, 20);
      $$0.a(cyu.jB, 5, 20);
      $$0.a(cyu.jC, 5, 20);
      $$0.a(cyu.fh, 5, 20);
      $$0.a(cyu.jV, 5, 20);
      $$0.a(cyu.jW, 5, 20);
      $$0.a(cyu.jX, 5, 20);
      $$0.a(cyu.jY, 5, 20);
      $$0.a(cyu.jZ, 5, 20);
      $$0.a(cyu.ka, 5, 20);
      $$0.a(cyu.kb, 5, 20);
      $$0.a(cyu.kc, 5, 20);
      $$0.a(cyu.dU, 5, 20);
      $$0.a(cyu.kd, 5, 20);
      $$0.a(cyu.ke, 5, 20);
      $$0.a(cyu.kf, 5, 20);
      $$0.a(cyu.kg, 5, 20);
      $$0.a(cyu.kh, 5, 20);
      $$0.a(cyu.ki, 5, 20);
      $$0.a(cyu.kj, 5, 20);
      $$0.a(cyu.kk, 5, 20);
      $$0.a(cyu.cu, 5, 20);
      $$0.a(cyu.fL, 5, 20);
      $$0.a(cyu.fK, 5, 20);
      $$0.a(cyu.fM, 5, 20);
      $$0.a(cyu.hP, 5, 20);
      $$0.a(cyu.hQ, 5, 20);
      $$0.a(cyu.hR, 5, 20);
      $$0.a(cyu.hS, 5, 20);
      $$0.a(cyu.hT, 5, 20);
      $$0.a(cyu.hU, 5, 20);
      $$0.a(cyu.U, 5, 5);
      $$0.a(cyu.V, 5, 5);
      $$0.a(cyu.W, 5, 5);
      $$0.a(cyu.X, 5, 5);
      $$0.a(cyu.Y, 5, 5);
      $$0.a(cyu.Z, 5, 5);
      $$0.a(cyu.aa, 5, 5);
      $$0.a(cyu.ab, 5, 5);
      $$0.a(cyu.ae, 5, 5);
      $$0.a(cyu.al, 5, 5);
      $$0.a(cyu.af, 5, 5);
      $$0.a(cyu.ag, 5, 5);
      $$0.a(cyu.ah, 5, 5);
      $$0.a(cyu.ai, 5, 5);
      $$0.a(cyu.aj, 5, 5);
      $$0.a(cyu.ak, 5, 5);
      $$0.a(cyu.am, 5, 5);
      $$0.a(cyu.an, 5, 5);
      $$0.a(cyu.aw, 5, 5);
      $$0.a(cyu.ax, 5, 5);
      $$0.a(cyu.ay, 5, 5);
      $$0.a(cyu.az, 5, 5);
      $$0.a(cyu.aA, 5, 5);
      $$0.a(cyu.aB, 5, 5);
      $$0.a(cyu.aC, 5, 5);
      $$0.a(cyu.aD, 5, 5);
      $$0.a(cyu.ao, 5, 5);
      $$0.a(cyu.ap, 5, 5);
      $$0.a(cyu.aq, 5, 5);
      $$0.a(cyu.ar, 5, 5);
      $$0.a(cyu.as, 5, 5);
      $$0.a(cyu.at, 5, 5);
      $$0.a(cyu.au, 5, 5);
      $$0.a(cyu.av, 5, 5);
      $$0.a(cyu.ac, 5, 20);
      $$0.a(cyu.aE, 30, 60);
      $$0.a(cyu.aF, 30, 60);
      $$0.a(cyu.aG, 30, 60);
      $$0.a(cyu.aH, 30, 60);
      $$0.a(cyu.aI, 30, 60);
      $$0.a(cyu.aJ, 30, 60);
      $$0.a(cyu.aK, 30, 60);
      $$0.a(cyu.aL, 30, 60);
      $$0.a(cyu.cl, 30, 20);
      $$0.a(cyu.ck, 15, 100);
      $$0.a(cyu.bt, 60, 100);
      $$0.a(cyu.bu, 60, 100);
      $$0.a(cyu.bv, 60, 100);
      $$0.a(cyu.iD, 60, 100);
      $$0.a(cyu.iE, 60, 100);
      $$0.a(cyu.iF, 60, 100);
      $$0.a(cyu.iG, 60, 100);
      $$0.a(cyu.iH, 60, 100);
      $$0.a(cyu.iI, 60, 100);
      $$0.a(cyu.bR, 60, 100);
      $$0.a(cyu.bT, 60, 100);
      $$0.a(cyu.bU, 60, 100);
      $$0.a(cyu.bV, 60, 100);
      $$0.a(cyu.bW, 60, 100);
      $$0.a(cyu.bX, 60, 100);
      $$0.a(cyu.bY, 60, 100);
      $$0.a(cyu.bZ, 60, 100);
      $$0.a(cyu.ca, 60, 100);
      $$0.a(cyu.cb, 60, 100);
      $$0.a(cyu.cc, 60, 100);
      $$0.a(cyu.ce, 60, 100);
      $$0.a(cyu.bS, 60, 100);
      $$0.a(cyu.kC, 60, 100);
      $$0.a(cyu.cd, 60, 100);
      $$0.a(cyu.sB, 60, 100);
      $$0.a(cyu.bA, 30, 60);
      $$0.a(cyu.bB, 30, 60);
      $$0.a(cyu.bC, 30, 60);
      $$0.a(cyu.bD, 30, 60);
      $$0.a(cyu.bE, 30, 60);
      $$0.a(cyu.bF, 30, 60);
      $$0.a(cyu.bG, 30, 60);
      $$0.a(cyu.bH, 30, 60);
      $$0.a(cyu.bI, 30, 60);
      $$0.a(cyu.bJ, 30, 60);
      $$0.a(cyu.bK, 30, 60);
      $$0.a(cyu.bL, 30, 60);
      $$0.a(cyu.bM, 30, 60);
      $$0.a(cyu.bN, 30, 60);
      $$0.a(cyu.bO, 30, 60);
      $$0.a(cyu.bP, 30, 60);
      $$0.a(cyu.ff, 15, 100);
      $$0.a(cyu.iB, 5, 5);
      $$0.a(cyu.ij, 60, 20);
      $$0.a(cyu.pd, 15, 20);
      $$0.a(cyu.ik, 60, 20);
      $$0.a(cyu.il, 60, 20);
      $$0.a(cyu.im, 60, 20);
      $$0.a(cyu.in, 60, 20);
      $$0.a(cyu.io, 60, 20);
      $$0.a(cyu.ip, 60, 20);
      $$0.a(cyu.iq, 60, 20);
      $$0.a(cyu.ir, 60, 20);
      $$0.a(cyu.is, 60, 20);
      $$0.a(cyu.it, 60, 20);
      $$0.a(cyu.iu, 60, 20);
      $$0.a(cyu.iv, 60, 20);
      $$0.a(cyu.iw, 60, 20);
      $$0.a(cyu.ix, 60, 20);
      $$0.a(cyu.iy, 60, 20);
      $$0.a(cyu.iz, 60, 20);
      $$0.a(cyu.me, 30, 60);
      $$0.a(cyu.mZ, 60, 60);
      $$0.a(cyu.nS, 60, 60);
      $$0.a(cyu.oa, 30, 20);
      $$0.a(cyu.pc, 5, 20);
      $$0.a(cyu.oi, 60, 100);
      $$0.a(cyu.pf, 5, 20);
      $$0.a(cyu.pe, 30, 20);
      $$0.a(cyu.aM, 30, 60);
      $$0.a(cyu.aN, 30, 60);
      $$0.a(cyu.sv, 15, 60);
      $$0.a(cyu.sw, 15, 60);
      $$0.a(cyu.sx, 60, 100);
      $$0.a(cyu.sy, 30, 60);
      $$0.a(cyu.sz, 30, 60);
      $$0.a(cyu.sD, 60, 100);
      $$0.a(cyu.sE, 60, 100);
      $$0.a(cyu.sF, 60, 100);
      $$0.a(cyu.sG, 30, 60);
      $$0.a(cyu.fg, 15, 100);
   }
}
