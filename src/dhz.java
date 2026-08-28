import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dhz extends dem {
   public static final MapCodec<dhz> c = b(dhz::new);
   public static final int d = 15;
   public static final dtc e = dss.aw;
   public static final dst f = dkn.b;
   public static final dst g = dkn.c;
   public static final dst h = dkn.d;
   public static final dst i = dkn.e;
   public static final dst j = dkn.f;
   private static final Map<je, dst> k = dkn.h.entrySet().stream().filter($$0 -> $$0.getKey() != je.a).collect(ac.a());
   private static final ewk l = dez.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewk m = dez.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewk n = dez.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewk o = dez.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewk F = dez.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dsc, ewk> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dez> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dez> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dhz> a() {
      return c;
   }

   public dhz(dsb.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dhz::m)));
   }

   private static ewk m(dsc $$0) {
      ewk $$1 = ewh.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ewh.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ewh.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ewh.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ewh.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dfb.a.o();
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dsc a(cya $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dsc b(dbe $$0, iz $$1) {
      iz $$2 = $$1.d();
      dsc $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, je.b)) {
         dsc $$4 = this.o();

         for (je $$5 : je.values()) {
            dst $$6 = k.get($$5);
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
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      iz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, je.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ab().b(dbu.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dsc $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ad() && this.a((dby)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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
                        int $$16 = this.a((dcb)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ad() || !this.a((dby)$$1, $$11))) {
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

   protected boolean a(dby $$0, iz $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dsc $$0) {
      return $$0.b(dss.C) && $$0.c(dss.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dsc $$0) {
      return $$0.b(dss.C) && $$0.c(dss.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dby $$0, iz $$1, int $$2, azh $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dsc $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dez $$8 = $$6.b();
         if ($$8 instanceof dni) {
            dni.a($$0, $$1);
         }
      }
   }

   private dsc a(dbz $$0, iz $$1, int $$2) {
      dsc $$3 = a($$0, $$1);
      return $$3.a(dfb.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dbe $$0, iz $$1) {
      for (je $$2 : je.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dcb $$0, iz $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (je $$3 : je.values()) {
            dsc $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dsc $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(azh $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dez $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dhz $$0 = (dhz)dfb.cr;
      $$0.a(dfb.n, 5, 20);
      $$0.a(dfb.o, 5, 20);
      $$0.a(dfb.p, 5, 20);
      $$0.a(dfb.q, 5, 20);
      $$0.a(dfb.r, 5, 20);
      $$0.a(dfb.s, 5, 20);
      $$0.a(dfb.t, 5, 20);
      $$0.a(dfb.u, 5, 20);
      $$0.a(dfb.v, 5, 20);
      $$0.a(dfb.w, 5, 20);
      $$0.a(dfb.jt, 5, 20);
      $$0.a(dfb.ju, 5, 20);
      $$0.a(dfb.jv, 5, 20);
      $$0.a(dfb.jw, 5, 20);
      $$0.a(dfb.jx, 5, 20);
      $$0.a(dfb.jy, 5, 20);
      $$0.a(dfb.jz, 5, 20);
      $$0.a(dfb.jA, 5, 20);
      $$0.a(dfb.jB, 5, 20);
      $$0.a(dfb.jC, 5, 20);
      $$0.a(dfb.fh, 5, 20);
      $$0.a(dfb.jV, 5, 20);
      $$0.a(dfb.jW, 5, 20);
      $$0.a(dfb.jX, 5, 20);
      $$0.a(dfb.jY, 5, 20);
      $$0.a(dfb.jZ, 5, 20);
      $$0.a(dfb.ka, 5, 20);
      $$0.a(dfb.kb, 5, 20);
      $$0.a(dfb.kc, 5, 20);
      $$0.a(dfb.dU, 5, 20);
      $$0.a(dfb.kd, 5, 20);
      $$0.a(dfb.ke, 5, 20);
      $$0.a(dfb.kf, 5, 20);
      $$0.a(dfb.kg, 5, 20);
      $$0.a(dfb.kh, 5, 20);
      $$0.a(dfb.ki, 5, 20);
      $$0.a(dfb.kj, 5, 20);
      $$0.a(dfb.kk, 5, 20);
      $$0.a(dfb.cu, 5, 20);
      $$0.a(dfb.fL, 5, 20);
      $$0.a(dfb.fK, 5, 20);
      $$0.a(dfb.fM, 5, 20);
      $$0.a(dfb.hP, 5, 20);
      $$0.a(dfb.hQ, 5, 20);
      $$0.a(dfb.hR, 5, 20);
      $$0.a(dfb.hS, 5, 20);
      $$0.a(dfb.hT, 5, 20);
      $$0.a(dfb.hU, 5, 20);
      $$0.a(dfb.U, 5, 5);
      $$0.a(dfb.V, 5, 5);
      $$0.a(dfb.W, 5, 5);
      $$0.a(dfb.X, 5, 5);
      $$0.a(dfb.Y, 5, 5);
      $$0.a(dfb.Z, 5, 5);
      $$0.a(dfb.aa, 5, 5);
      $$0.a(dfb.ab, 5, 5);
      $$0.a(dfb.ae, 5, 5);
      $$0.a(dfb.al, 5, 5);
      $$0.a(dfb.af, 5, 5);
      $$0.a(dfb.ag, 5, 5);
      $$0.a(dfb.ah, 5, 5);
      $$0.a(dfb.ai, 5, 5);
      $$0.a(dfb.aj, 5, 5);
      $$0.a(dfb.ak, 5, 5);
      $$0.a(dfb.am, 5, 5);
      $$0.a(dfb.an, 5, 5);
      $$0.a(dfb.aw, 5, 5);
      $$0.a(dfb.ax, 5, 5);
      $$0.a(dfb.ay, 5, 5);
      $$0.a(dfb.az, 5, 5);
      $$0.a(dfb.aA, 5, 5);
      $$0.a(dfb.aB, 5, 5);
      $$0.a(dfb.aC, 5, 5);
      $$0.a(dfb.aD, 5, 5);
      $$0.a(dfb.ao, 5, 5);
      $$0.a(dfb.ap, 5, 5);
      $$0.a(dfb.aq, 5, 5);
      $$0.a(dfb.ar, 5, 5);
      $$0.a(dfb.as, 5, 5);
      $$0.a(dfb.at, 5, 5);
      $$0.a(dfb.au, 5, 5);
      $$0.a(dfb.av, 5, 5);
      $$0.a(dfb.ac, 5, 20);
      $$0.a(dfb.aE, 30, 60);
      $$0.a(dfb.aF, 30, 60);
      $$0.a(dfb.aG, 30, 60);
      $$0.a(dfb.aH, 30, 60);
      $$0.a(dfb.aI, 30, 60);
      $$0.a(dfb.aJ, 30, 60);
      $$0.a(dfb.aK, 30, 60);
      $$0.a(dfb.aL, 30, 60);
      $$0.a(dfb.cl, 30, 20);
      $$0.a(dfb.ck, 15, 100);
      $$0.a(dfb.bt, 60, 100);
      $$0.a(dfb.bu, 60, 100);
      $$0.a(dfb.bv, 60, 100);
      $$0.a(dfb.iD, 60, 100);
      $$0.a(dfb.iE, 60, 100);
      $$0.a(dfb.iF, 60, 100);
      $$0.a(dfb.iG, 60, 100);
      $$0.a(dfb.iH, 60, 100);
      $$0.a(dfb.iI, 60, 100);
      $$0.a(dfb.bR, 60, 100);
      $$0.a(dfb.bT, 60, 100);
      $$0.a(dfb.bU, 60, 100);
      $$0.a(dfb.bV, 60, 100);
      $$0.a(dfb.bW, 60, 100);
      $$0.a(dfb.bX, 60, 100);
      $$0.a(dfb.bY, 60, 100);
      $$0.a(dfb.bZ, 60, 100);
      $$0.a(dfb.ca, 60, 100);
      $$0.a(dfb.cb, 60, 100);
      $$0.a(dfb.cc, 60, 100);
      $$0.a(dfb.ce, 60, 100);
      $$0.a(dfb.bS, 60, 100);
      $$0.a(dfb.kC, 60, 100);
      $$0.a(dfb.cd, 60, 100);
      $$0.a(dfb.sB, 60, 100);
      $$0.a(dfb.bA, 30, 60);
      $$0.a(dfb.bB, 30, 60);
      $$0.a(dfb.bC, 30, 60);
      $$0.a(dfb.bD, 30, 60);
      $$0.a(dfb.bE, 30, 60);
      $$0.a(dfb.bF, 30, 60);
      $$0.a(dfb.bG, 30, 60);
      $$0.a(dfb.bH, 30, 60);
      $$0.a(dfb.bI, 30, 60);
      $$0.a(dfb.bJ, 30, 60);
      $$0.a(dfb.bK, 30, 60);
      $$0.a(dfb.bL, 30, 60);
      $$0.a(dfb.bM, 30, 60);
      $$0.a(dfb.bN, 30, 60);
      $$0.a(dfb.bO, 30, 60);
      $$0.a(dfb.bP, 30, 60);
      $$0.a(dfb.ff, 15, 100);
      $$0.a(dfb.iB, 5, 5);
      $$0.a(dfb.ij, 60, 20);
      $$0.a(dfb.pd, 15, 20);
      $$0.a(dfb.ik, 60, 20);
      $$0.a(dfb.il, 60, 20);
      $$0.a(dfb.im, 60, 20);
      $$0.a(dfb.in, 60, 20);
      $$0.a(dfb.io, 60, 20);
      $$0.a(dfb.ip, 60, 20);
      $$0.a(dfb.iq, 60, 20);
      $$0.a(dfb.ir, 60, 20);
      $$0.a(dfb.is, 60, 20);
      $$0.a(dfb.it, 60, 20);
      $$0.a(dfb.iu, 60, 20);
      $$0.a(dfb.iv, 60, 20);
      $$0.a(dfb.iw, 60, 20);
      $$0.a(dfb.ix, 60, 20);
      $$0.a(dfb.iy, 60, 20);
      $$0.a(dfb.iz, 60, 20);
      $$0.a(dfb.me, 30, 60);
      $$0.a(dfb.mZ, 60, 60);
      $$0.a(dfb.nS, 60, 60);
      $$0.a(dfb.oa, 30, 20);
      $$0.a(dfb.pc, 5, 20);
      $$0.a(dfb.oi, 60, 100);
      $$0.a(dfb.pf, 5, 20);
      $$0.a(dfb.pe, 30, 20);
      $$0.a(dfb.aM, 30, 60);
      $$0.a(dfb.aN, 30, 60);
      $$0.a(dfb.sv, 15, 60);
      $$0.a(dfb.sw, 15, 60);
      $$0.a(dfb.sx, 60, 100);
      $$0.a(dfb.sy, 30, 60);
      $$0.a(dfb.sz, 30, 60);
      $$0.a(dfb.sD, 60, 100);
      $$0.a(dfb.sE, 60, 100);
      $$0.a(dfb.sF, 60, 100);
      $$0.a(dfb.sG, 30, 60);
      $$0.a(dfb.fg, 15, 100);
   }
}
