import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dhy extends del {
   public static final MapCodec<dhy> c = b(dhy::new);
   public static final int d = 15;
   public static final dtb e = dsr.aw;
   public static final dss f = dkm.b;
   public static final dss g = dkm.c;
   public static final dss h = dkm.d;
   public static final dss i = dkm.e;
   public static final dss j = dkm.f;
   private static final Map<je, dss> k = dkm.h.entrySet().stream().filter($$0 -> $$0.getKey() != je.a).collect(ac.a());
   private static final ewj l = dey.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewj m = dey.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewj n = dey.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewj o = dey.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewj F = dey.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dsb, ewj> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dey> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dey> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dhy> a() {
      return c;
   }

   public dhy(dsa.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dhy::m)));
   }

   private static ewj m(dsb $$0) {
      ewj $$1 = ewg.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ewg.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ewg.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ewg.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ewg.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dfa.a.o();
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dsb a(cxz $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dsb b(dbd $$0, iz $$1) {
      iz $$2 = $$1.d();
      dsb $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, je.b)) {
         dsb $$4 = this.o();

         for (je $$5 : je.values()) {
            dss $$6 = k.get($$5);
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
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, je.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ab().b(dbt.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dsb $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ad() && this.a((dbx)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(awn.ad);
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
                        int $$16 = this.a((dca)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ad() || !this.a((dbx)$$1, $$11))) {
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

   protected boolean a(dbx $$0, iz $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dsb $$0) {
      return $$0.b(dsr.C) && $$0.c(dsr.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dsb $$0) {
      return $$0.b(dsr.C) && $$0.c(dsr.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dbx $$0, iz $$1, int $$2, azg $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dsb $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dey $$8 = $$6.b();
         if ($$8 instanceof dnh) {
            dnh.a($$0, $$1);
         }
      }
   }

   private dsb a(dby $$0, iz $$1, int $$2) {
      dsb $$3 = a($$0, $$1);
      return $$3.a(dfa.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dbd $$0, iz $$1) {
      for (je $$2 : je.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dca $$0, iz $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (je $$3 : je.values()) {
            dsb $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dsb $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(azg $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dey $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dhy $$0 = (dhy)dfa.cr;
      $$0.a(dfa.n, 5, 20);
      $$0.a(dfa.o, 5, 20);
      $$0.a(dfa.p, 5, 20);
      $$0.a(dfa.q, 5, 20);
      $$0.a(dfa.r, 5, 20);
      $$0.a(dfa.s, 5, 20);
      $$0.a(dfa.t, 5, 20);
      $$0.a(dfa.u, 5, 20);
      $$0.a(dfa.v, 5, 20);
      $$0.a(dfa.w, 5, 20);
      $$0.a(dfa.jt, 5, 20);
      $$0.a(dfa.ju, 5, 20);
      $$0.a(dfa.jv, 5, 20);
      $$0.a(dfa.jw, 5, 20);
      $$0.a(dfa.jx, 5, 20);
      $$0.a(dfa.jy, 5, 20);
      $$0.a(dfa.jz, 5, 20);
      $$0.a(dfa.jA, 5, 20);
      $$0.a(dfa.jB, 5, 20);
      $$0.a(dfa.jC, 5, 20);
      $$0.a(dfa.fh, 5, 20);
      $$0.a(dfa.jV, 5, 20);
      $$0.a(dfa.jW, 5, 20);
      $$0.a(dfa.jX, 5, 20);
      $$0.a(dfa.jY, 5, 20);
      $$0.a(dfa.jZ, 5, 20);
      $$0.a(dfa.ka, 5, 20);
      $$0.a(dfa.kb, 5, 20);
      $$0.a(dfa.kc, 5, 20);
      $$0.a(dfa.dU, 5, 20);
      $$0.a(dfa.kd, 5, 20);
      $$0.a(dfa.ke, 5, 20);
      $$0.a(dfa.kf, 5, 20);
      $$0.a(dfa.kg, 5, 20);
      $$0.a(dfa.kh, 5, 20);
      $$0.a(dfa.ki, 5, 20);
      $$0.a(dfa.kj, 5, 20);
      $$0.a(dfa.kk, 5, 20);
      $$0.a(dfa.cu, 5, 20);
      $$0.a(dfa.fL, 5, 20);
      $$0.a(dfa.fK, 5, 20);
      $$0.a(dfa.fM, 5, 20);
      $$0.a(dfa.hP, 5, 20);
      $$0.a(dfa.hQ, 5, 20);
      $$0.a(dfa.hR, 5, 20);
      $$0.a(dfa.hS, 5, 20);
      $$0.a(dfa.hT, 5, 20);
      $$0.a(dfa.hU, 5, 20);
      $$0.a(dfa.U, 5, 5);
      $$0.a(dfa.V, 5, 5);
      $$0.a(dfa.W, 5, 5);
      $$0.a(dfa.X, 5, 5);
      $$0.a(dfa.Y, 5, 5);
      $$0.a(dfa.Z, 5, 5);
      $$0.a(dfa.aa, 5, 5);
      $$0.a(dfa.ab, 5, 5);
      $$0.a(dfa.ae, 5, 5);
      $$0.a(dfa.al, 5, 5);
      $$0.a(dfa.af, 5, 5);
      $$0.a(dfa.ag, 5, 5);
      $$0.a(dfa.ah, 5, 5);
      $$0.a(dfa.ai, 5, 5);
      $$0.a(dfa.aj, 5, 5);
      $$0.a(dfa.ak, 5, 5);
      $$0.a(dfa.am, 5, 5);
      $$0.a(dfa.an, 5, 5);
      $$0.a(dfa.aw, 5, 5);
      $$0.a(dfa.ax, 5, 5);
      $$0.a(dfa.ay, 5, 5);
      $$0.a(dfa.az, 5, 5);
      $$0.a(dfa.aA, 5, 5);
      $$0.a(dfa.aB, 5, 5);
      $$0.a(dfa.aC, 5, 5);
      $$0.a(dfa.aD, 5, 5);
      $$0.a(dfa.ao, 5, 5);
      $$0.a(dfa.ap, 5, 5);
      $$0.a(dfa.aq, 5, 5);
      $$0.a(dfa.ar, 5, 5);
      $$0.a(dfa.as, 5, 5);
      $$0.a(dfa.at, 5, 5);
      $$0.a(dfa.au, 5, 5);
      $$0.a(dfa.av, 5, 5);
      $$0.a(dfa.ac, 5, 20);
      $$0.a(dfa.aE, 30, 60);
      $$0.a(dfa.aF, 30, 60);
      $$0.a(dfa.aG, 30, 60);
      $$0.a(dfa.aH, 30, 60);
      $$0.a(dfa.aI, 30, 60);
      $$0.a(dfa.aJ, 30, 60);
      $$0.a(dfa.aK, 30, 60);
      $$0.a(dfa.aL, 30, 60);
      $$0.a(dfa.cl, 30, 20);
      $$0.a(dfa.ck, 15, 100);
      $$0.a(dfa.bt, 60, 100);
      $$0.a(dfa.bu, 60, 100);
      $$0.a(dfa.bv, 60, 100);
      $$0.a(dfa.iD, 60, 100);
      $$0.a(dfa.iE, 60, 100);
      $$0.a(dfa.iF, 60, 100);
      $$0.a(dfa.iG, 60, 100);
      $$0.a(dfa.iH, 60, 100);
      $$0.a(dfa.iI, 60, 100);
      $$0.a(dfa.bR, 60, 100);
      $$0.a(dfa.bT, 60, 100);
      $$0.a(dfa.bU, 60, 100);
      $$0.a(dfa.bV, 60, 100);
      $$0.a(dfa.bW, 60, 100);
      $$0.a(dfa.bX, 60, 100);
      $$0.a(dfa.bY, 60, 100);
      $$0.a(dfa.bZ, 60, 100);
      $$0.a(dfa.ca, 60, 100);
      $$0.a(dfa.cb, 60, 100);
      $$0.a(dfa.cc, 60, 100);
      $$0.a(dfa.ce, 60, 100);
      $$0.a(dfa.bS, 60, 100);
      $$0.a(dfa.kC, 60, 100);
      $$0.a(dfa.cd, 60, 100);
      $$0.a(dfa.sB, 60, 100);
      $$0.a(dfa.bA, 30, 60);
      $$0.a(dfa.bB, 30, 60);
      $$0.a(dfa.bC, 30, 60);
      $$0.a(dfa.bD, 30, 60);
      $$0.a(dfa.bE, 30, 60);
      $$0.a(dfa.bF, 30, 60);
      $$0.a(dfa.bG, 30, 60);
      $$0.a(dfa.bH, 30, 60);
      $$0.a(dfa.bI, 30, 60);
      $$0.a(dfa.bJ, 30, 60);
      $$0.a(dfa.bK, 30, 60);
      $$0.a(dfa.bL, 30, 60);
      $$0.a(dfa.bM, 30, 60);
      $$0.a(dfa.bN, 30, 60);
      $$0.a(dfa.bO, 30, 60);
      $$0.a(dfa.bP, 30, 60);
      $$0.a(dfa.ff, 15, 100);
      $$0.a(dfa.iB, 5, 5);
      $$0.a(dfa.ij, 60, 20);
      $$0.a(dfa.pd, 15, 20);
      $$0.a(dfa.ik, 60, 20);
      $$0.a(dfa.il, 60, 20);
      $$0.a(dfa.im, 60, 20);
      $$0.a(dfa.in, 60, 20);
      $$0.a(dfa.io, 60, 20);
      $$0.a(dfa.ip, 60, 20);
      $$0.a(dfa.iq, 60, 20);
      $$0.a(dfa.ir, 60, 20);
      $$0.a(dfa.is, 60, 20);
      $$0.a(dfa.it, 60, 20);
      $$0.a(dfa.iu, 60, 20);
      $$0.a(dfa.iv, 60, 20);
      $$0.a(dfa.iw, 60, 20);
      $$0.a(dfa.ix, 60, 20);
      $$0.a(dfa.iy, 60, 20);
      $$0.a(dfa.iz, 60, 20);
      $$0.a(dfa.me, 30, 60);
      $$0.a(dfa.mZ, 60, 60);
      $$0.a(dfa.nS, 60, 60);
      $$0.a(dfa.oa, 30, 20);
      $$0.a(dfa.pc, 5, 20);
      $$0.a(dfa.oi, 60, 100);
      $$0.a(dfa.pf, 5, 20);
      $$0.a(dfa.pe, 30, 20);
      $$0.a(dfa.aM, 30, 60);
      $$0.a(dfa.aN, 30, 60);
      $$0.a(dfa.sv, 15, 60);
      $$0.a(dfa.sw, 15, 60);
      $$0.a(dfa.sx, 60, 100);
      $$0.a(dfa.sy, 30, 60);
      $$0.a(dfa.sz, 30, 60);
      $$0.a(dfa.sD, 60, 100);
      $$0.a(dfa.sE, 60, 100);
      $$0.a(dfa.sF, 60, 100);
      $$0.a(dfa.sG, 30, 60);
      $$0.a(dfa.fg, 15, 100);
   }
}
