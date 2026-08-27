import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dif extends deo {
   public static final MapCodec<dif> c = b(dif::new);
   public static final int d = 15;
   public static final duc e = dts.aw;
   public static final dtt f = dkw.b;
   public static final dtt g = dkw.c;
   public static final dtt h = dkw.d;
   public static final dtt i = dkw.e;
   public static final dtt j = dkw.f;
   private static final Map<iw, dtt> k = dkw.h.entrySet().stream().filter($$0 -> $$0.getKey() != iw.a).collect(ad.a());
   private static final exn l = dfc.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final exn m = dfc.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final exn n = dfc.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final exn o = dfc.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final exn F = dfc.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dtc, exn> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dfc> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dfc> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dif> a() {
      return c;
   }

   public dif(dtb.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dif::m)));
   }

   private static exn m(dtc $$0) {
      exn $$1 = exk.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = exk.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = exk.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = exk.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = exk.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dfe.a.n();
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dtc a(cyd $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dtc b(dbg $$0, ir $$1) {
      ir $$2 = $$1.d();
      dtc $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, iw.b)) {
         dtc $$4 = this.n();

         for (iw $$5 : iw.values()) {
            dtt $$6 = k.get($$5);
            if ($$6 != null) {
               $$4 = $$4.a($$6, Boolean.valueOf(this.f($$0.a_($$1.a($$5)))));
            }
         }

         return $$4;
      } else {
         return this.n();
      }
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, iw.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.ab().b(dbw.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dtc $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.E_().q());
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
                  ir $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, iw.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(awd.ah);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            ir.a $$11 = new ir.a();

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

   protected boolean a(dca $$0, ir $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dtc $$0) {
      return $$0.b(dts.C) && $$0.c(dts.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dtc $$0) {
      return $$0.b(dts.C) && $$0.c(dts.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dca $$0, ir $$1, int $$2, ayt $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dtc $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dfc $$8 = $$6.b();
         if ($$8 instanceof doa) {
            doa.a($$0, $$1);
         }
      }
   }

   private dtc a(dcb $$0, ir $$1, int $$2) {
      dtc $$3 = a($$0, $$1);
      return $$3.a(dfe.dc) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dbg $$0, ir $$1) {
      for (iw $$2 : iw.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dcd $$0, ir $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (iw $$3 : iw.values()) {
            dtc $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dtc $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(ayt $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dfc $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dif $$0 = (dif)dfe.dc;
      $$0.a(dfe.S, 5, 20);
      $$0.a(dfe.T, 5, 20);
      $$0.a(dfe.U, 5, 20);
      $$0.a(dfe.V, 5, 20);
      $$0.a(dfe.W, 5, 20);
      $$0.a(dfe.X, 5, 20);
      $$0.a(dfe.Y, 5, 20);
      $$0.a(dfe.Z, 5, 20);
      $$0.a(dfe.aa, 5, 20);
      $$0.a(dfe.ab, 5, 20);
      $$0.a(dfe.kn, 5, 20);
      $$0.a(dfe.ko, 5, 20);
      $$0.a(dfe.kp, 5, 20);
      $$0.a(dfe.kq, 5, 20);
      $$0.a(dfe.kr, 5, 20);
      $$0.a(dfe.ks, 5, 20);
      $$0.a(dfe.kt, 5, 20);
      $$0.a(dfe.ku, 5, 20);
      $$0.a(dfe.kv, 5, 20);
      $$0.a(dfe.kw, 5, 20);
      $$0.a(dfe.fZ, 5, 20);
      $$0.a(dfe.kP, 5, 20);
      $$0.a(dfe.kQ, 5, 20);
      $$0.a(dfe.kR, 5, 20);
      $$0.a(dfe.kS, 5, 20);
      $$0.a(dfe.kT, 5, 20);
      $$0.a(dfe.kU, 5, 20);
      $$0.a(dfe.kV, 5, 20);
      $$0.a(dfe.kW, 5, 20);
      $$0.a(dfe.eI, 5, 20);
      $$0.a(dfe.kX, 5, 20);
      $$0.a(dfe.kY, 5, 20);
      $$0.a(dfe.kZ, 5, 20);
      $$0.a(dfe.la, 5, 20);
      $$0.a(dfe.lb, 5, 20);
      $$0.a(dfe.lc, 5, 20);
      $$0.a(dfe.ld, 5, 20);
      $$0.a(dfe.le, 5, 20);
      $$0.a(dfe.df, 5, 20);
      $$0.a(dfe.gE, 5, 20);
      $$0.a(dfe.gD, 5, 20);
      $$0.a(dfe.gF, 5, 20);
      $$0.a(dfe.iJ, 5, 20);
      $$0.a(dfe.iK, 5, 20);
      $$0.a(dfe.iL, 5, 20);
      $$0.a(dfe.iM, 5, 20);
      $$0.a(dfe.iN, 5, 20);
      $$0.a(dfe.iO, 5, 20);
      $$0.a(dfe.aC, 5, 5);
      $$0.a(dfe.aD, 5, 5);
      $$0.a(dfe.aE, 5, 5);
      $$0.a(dfe.aF, 5, 5);
      $$0.a(dfe.aG, 5, 5);
      $$0.a(dfe.aH, 5, 5);
      $$0.a(dfe.aI, 5, 5);
      $$0.a(dfe.aJ, 5, 5);
      $$0.a(dfe.aM, 5, 5);
      $$0.a(dfe.aT, 5, 5);
      $$0.a(dfe.aN, 5, 5);
      $$0.a(dfe.aO, 5, 5);
      $$0.a(dfe.aP, 5, 5);
      $$0.a(dfe.aQ, 5, 5);
      $$0.a(dfe.aR, 5, 5);
      $$0.a(dfe.aS, 5, 5);
      $$0.a(dfe.aU, 5, 5);
      $$0.a(dfe.aV, 5, 5);
      $$0.a(dfe.be, 5, 5);
      $$0.a(dfe.bf, 5, 5);
      $$0.a(dfe.bg, 5, 5);
      $$0.a(dfe.bh, 5, 5);
      $$0.a(dfe.bi, 5, 5);
      $$0.a(dfe.bj, 5, 5);
      $$0.a(dfe.bk, 5, 5);
      $$0.a(dfe.bl, 5, 5);
      $$0.a(dfe.aW, 5, 5);
      $$0.a(dfe.aX, 5, 5);
      $$0.a(dfe.aY, 5, 5);
      $$0.a(dfe.aZ, 5, 5);
      $$0.a(dfe.ba, 5, 5);
      $$0.a(dfe.bb, 5, 5);
      $$0.a(dfe.bc, 5, 5);
      $$0.a(dfe.bd, 5, 5);
      $$0.a(dfe.aK, 5, 20);
      $$0.a(dfe.bm, 30, 60);
      $$0.a(dfe.bn, 30, 60);
      $$0.a(dfe.bo, 30, 60);
      $$0.a(dfe.bp, 30, 60);
      $$0.a(dfe.bq, 30, 60);
      $$0.a(dfe.br, 30, 60);
      $$0.a(dfe.bs, 30, 60);
      $$0.a(dfe.bt, 30, 60);
      $$0.a(dfe.cW, 30, 20);
      $$0.a(dfe.cV, 15, 100);
      $$0.a(dfe.cd, 60, 100);
      $$0.a(dfe.ce, 60, 100);
      $$0.a(dfe.cf, 60, 100);
      $$0.a(dfe.jx, 60, 100);
      $$0.a(dfe.jy, 60, 100);
      $$0.a(dfe.jz, 60, 100);
      $$0.a(dfe.jA, 60, 100);
      $$0.a(dfe.jB, 60, 100);
      $$0.a(dfe.jC, 60, 100);
      $$0.a(dfe.cB, 60, 100);
      $$0.a(dfe.cD, 60, 100);
      $$0.a(dfe.cE, 60, 100);
      $$0.a(dfe.cF, 60, 100);
      $$0.a(dfe.cG, 60, 100);
      $$0.a(dfe.cH, 60, 100);
      $$0.a(dfe.cI, 60, 100);
      $$0.a(dfe.cJ, 60, 100);
      $$0.a(dfe.cK, 60, 100);
      $$0.a(dfe.cL, 60, 100);
      $$0.a(dfe.cM, 60, 100);
      $$0.a(dfe.cO, 60, 100);
      $$0.a(dfe.cC, 60, 100);
      $$0.a(dfe.lz, 60, 100);
      $$0.a(dfe.cN, 60, 100);
      $$0.a(dfe.tY, 60, 100);
      $$0.a(dfe.ck, 30, 60);
      $$0.a(dfe.cl, 30, 60);
      $$0.a(dfe.cm, 30, 60);
      $$0.a(dfe.cn, 30, 60);
      $$0.a(dfe.co, 30, 60);
      $$0.a(dfe.cp, 30, 60);
      $$0.a(dfe.cq, 30, 60);
      $$0.a(dfe.cr, 30, 60);
      $$0.a(dfe.cs, 30, 60);
      $$0.a(dfe.ct, 30, 60);
      $$0.a(dfe.cu, 30, 60);
      $$0.a(dfe.cv, 30, 60);
      $$0.a(dfe.cw, 30, 60);
      $$0.a(dfe.cx, 30, 60);
      $$0.a(dfe.cy, 30, 60);
      $$0.a(dfe.cz, 30, 60);
      $$0.a(dfe.fX, 15, 100);
      $$0.a(dfe.jv, 5, 5);
      $$0.a(dfe.jd, 60, 20);
      $$0.a(dfe.qo, 15, 20);
      $$0.a(dfe.je, 60, 20);
      $$0.a(dfe.jf, 60, 20);
      $$0.a(dfe.jg, 60, 20);
      $$0.a(dfe.jh, 60, 20);
      $$0.a(dfe.ji, 60, 20);
      $$0.a(dfe.jj, 60, 20);
      $$0.a(dfe.jk, 60, 20);
      $$0.a(dfe.jl, 60, 20);
      $$0.a(dfe.jm, 60, 20);
      $$0.a(dfe.jn, 60, 20);
      $$0.a(dfe.jo, 60, 20);
      $$0.a(dfe.jp, 60, 20);
      $$0.a(dfe.jq, 60, 20);
      $$0.a(dfe.jr, 60, 20);
      $$0.a(dfe.js, 60, 20);
      $$0.a(dfe.jt, 60, 20);
      $$0.a(dfe.nc, 30, 60);
      $$0.a(dfe.nX, 60, 60);
      $$0.a(dfe.oQ, 60, 60);
      $$0.a(dfe.oY, 30, 20);
      $$0.a(dfe.qn, 5, 20);
      $$0.a(dfe.pi, 60, 100);
      $$0.a(dfe.qq, 5, 20);
      $$0.a(dfe.qp, 30, 20);
      $$0.a(dfe.bu, 30, 60);
      $$0.a(dfe.bv, 30, 60);
      $$0.a(dfe.tS, 15, 60);
      $$0.a(dfe.tT, 15, 60);
      $$0.a(dfe.tU, 60, 100);
      $$0.a(dfe.tV, 30, 60);
      $$0.a(dfe.tW, 30, 60);
      $$0.a(dfe.ua, 60, 100);
      $$0.a(dfe.ub, 60, 100);
      $$0.a(dfe.uc, 60, 100);
      $$0.a(dfe.ud, 30, 60);
      $$0.a(dfe.fY, 15, 100);
   }
}
