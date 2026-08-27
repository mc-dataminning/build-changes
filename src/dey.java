import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dey extends dbl {
   public static final MapCodec<dey> c = b(dey::new);
   public static final int d = 15;
   public static final dpz e = dpp.aw;
   public static final dpq f = dhl.b;
   public static final dpq g = dhl.c;
   public static final dpq h = dhl.d;
   public static final dpq i = dhl.e;
   public static final dpq j = dhl.f;
   private static final Map<ih, dpq> k = dhl.h.entrySet().stream().filter($$0 -> $$0.getKey() != ih.a).collect(ac.a());
   private static final est l = dby.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final est m = dby.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final est n = dby.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final est o = dby.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final est F = dby.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<doz, est> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dby> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dby> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dey> a() {
      return c;
   }

   public dey(doy.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dey::m)));
   }

   private static est m(doz $$0) {
      est $$1 = esq.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = esq.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = esq.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = esq.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = esq.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dca.a.n();
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public doz a(cuo $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected doz b(cyd $$0, ib $$1) {
      ib $$2 = $$1.d();
      doz $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ih.b)) {
         doz $$4 = this.n();

         for (ih $$5 : ih.values()) {
            dpq $$6 = k.get($$5);
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
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ih.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.aa().b(cyt.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         doz $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ac() && this.a((cyx)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(avb.ad);
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
                        int $$16 = this.a((cza)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ac() || !this.a((cyx)$$1, $$11))) {
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

   protected boolean a(cyx $$0, ib $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(doz $$0) {
      return $$0.b(dpp.C) && $$0.c(dpp.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(doz $$0) {
      return $$0.b(dpp.C) && $$0.c(dpp.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(cyx $$0, ib $$1, int $$2, axr $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         doz $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dby $$8 = $$6.b();
         if ($$8 instanceof dkg) {
            dkg.a($$0, $$1);
         }
      }
   }

   private doz a(cyy $$0, ib $$1, int $$2) {
      doz $$3 = a($$0, $$1);
      return $$3.a(dca.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cyd $$0, ib $$1) {
      for (ih $$2 : ih.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cza $$0, ib $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ih $$3 : ih.values()) {
            doz $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(doz $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(axr $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dby $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dey $$0 = (dey)dca.cr;
      $$0.a(dca.n, 5, 20);
      $$0.a(dca.o, 5, 20);
      $$0.a(dca.p, 5, 20);
      $$0.a(dca.q, 5, 20);
      $$0.a(dca.r, 5, 20);
      $$0.a(dca.s, 5, 20);
      $$0.a(dca.t, 5, 20);
      $$0.a(dca.u, 5, 20);
      $$0.a(dca.v, 5, 20);
      $$0.a(dca.w, 5, 20);
      $$0.a(dca.jt, 5, 20);
      $$0.a(dca.ju, 5, 20);
      $$0.a(dca.jv, 5, 20);
      $$0.a(dca.jw, 5, 20);
      $$0.a(dca.jx, 5, 20);
      $$0.a(dca.jy, 5, 20);
      $$0.a(dca.jz, 5, 20);
      $$0.a(dca.jA, 5, 20);
      $$0.a(dca.jB, 5, 20);
      $$0.a(dca.jC, 5, 20);
      $$0.a(dca.fh, 5, 20);
      $$0.a(dca.jV, 5, 20);
      $$0.a(dca.jW, 5, 20);
      $$0.a(dca.jX, 5, 20);
      $$0.a(dca.jY, 5, 20);
      $$0.a(dca.jZ, 5, 20);
      $$0.a(dca.ka, 5, 20);
      $$0.a(dca.kb, 5, 20);
      $$0.a(dca.kc, 5, 20);
      $$0.a(dca.dU, 5, 20);
      $$0.a(dca.kd, 5, 20);
      $$0.a(dca.ke, 5, 20);
      $$0.a(dca.kf, 5, 20);
      $$0.a(dca.kg, 5, 20);
      $$0.a(dca.kh, 5, 20);
      $$0.a(dca.ki, 5, 20);
      $$0.a(dca.kj, 5, 20);
      $$0.a(dca.kk, 5, 20);
      $$0.a(dca.cu, 5, 20);
      $$0.a(dca.fL, 5, 20);
      $$0.a(dca.fK, 5, 20);
      $$0.a(dca.fM, 5, 20);
      $$0.a(dca.hP, 5, 20);
      $$0.a(dca.hQ, 5, 20);
      $$0.a(dca.hR, 5, 20);
      $$0.a(dca.hS, 5, 20);
      $$0.a(dca.hT, 5, 20);
      $$0.a(dca.hU, 5, 20);
      $$0.a(dca.U, 5, 5);
      $$0.a(dca.V, 5, 5);
      $$0.a(dca.W, 5, 5);
      $$0.a(dca.X, 5, 5);
      $$0.a(dca.Y, 5, 5);
      $$0.a(dca.Z, 5, 5);
      $$0.a(dca.aa, 5, 5);
      $$0.a(dca.ab, 5, 5);
      $$0.a(dca.ae, 5, 5);
      $$0.a(dca.al, 5, 5);
      $$0.a(dca.af, 5, 5);
      $$0.a(dca.ag, 5, 5);
      $$0.a(dca.ah, 5, 5);
      $$0.a(dca.ai, 5, 5);
      $$0.a(dca.aj, 5, 5);
      $$0.a(dca.ak, 5, 5);
      $$0.a(dca.am, 5, 5);
      $$0.a(dca.an, 5, 5);
      $$0.a(dca.aw, 5, 5);
      $$0.a(dca.ax, 5, 5);
      $$0.a(dca.ay, 5, 5);
      $$0.a(dca.az, 5, 5);
      $$0.a(dca.aA, 5, 5);
      $$0.a(dca.aB, 5, 5);
      $$0.a(dca.aC, 5, 5);
      $$0.a(dca.aD, 5, 5);
      $$0.a(dca.ao, 5, 5);
      $$0.a(dca.ap, 5, 5);
      $$0.a(dca.aq, 5, 5);
      $$0.a(dca.ar, 5, 5);
      $$0.a(dca.as, 5, 5);
      $$0.a(dca.at, 5, 5);
      $$0.a(dca.au, 5, 5);
      $$0.a(dca.av, 5, 5);
      $$0.a(dca.ac, 5, 20);
      $$0.a(dca.aE, 30, 60);
      $$0.a(dca.aF, 30, 60);
      $$0.a(dca.aG, 30, 60);
      $$0.a(dca.aH, 30, 60);
      $$0.a(dca.aI, 30, 60);
      $$0.a(dca.aJ, 30, 60);
      $$0.a(dca.aK, 30, 60);
      $$0.a(dca.aL, 30, 60);
      $$0.a(dca.cl, 30, 20);
      $$0.a(dca.ck, 15, 100);
      $$0.a(dca.bt, 60, 100);
      $$0.a(dca.bu, 60, 100);
      $$0.a(dca.bv, 60, 100);
      $$0.a(dca.iD, 60, 100);
      $$0.a(dca.iE, 60, 100);
      $$0.a(dca.iF, 60, 100);
      $$0.a(dca.iG, 60, 100);
      $$0.a(dca.iH, 60, 100);
      $$0.a(dca.iI, 60, 100);
      $$0.a(dca.bR, 60, 100);
      $$0.a(dca.bT, 60, 100);
      $$0.a(dca.bU, 60, 100);
      $$0.a(dca.bV, 60, 100);
      $$0.a(dca.bW, 60, 100);
      $$0.a(dca.bX, 60, 100);
      $$0.a(dca.bY, 60, 100);
      $$0.a(dca.bZ, 60, 100);
      $$0.a(dca.ca, 60, 100);
      $$0.a(dca.cb, 60, 100);
      $$0.a(dca.cc, 60, 100);
      $$0.a(dca.ce, 60, 100);
      $$0.a(dca.bS, 60, 100);
      $$0.a(dca.kC, 60, 100);
      $$0.a(dca.cd, 60, 100);
      $$0.a(dca.sB, 60, 100);
      $$0.a(dca.bA, 30, 60);
      $$0.a(dca.bB, 30, 60);
      $$0.a(dca.bC, 30, 60);
      $$0.a(dca.bD, 30, 60);
      $$0.a(dca.bE, 30, 60);
      $$0.a(dca.bF, 30, 60);
      $$0.a(dca.bG, 30, 60);
      $$0.a(dca.bH, 30, 60);
      $$0.a(dca.bI, 30, 60);
      $$0.a(dca.bJ, 30, 60);
      $$0.a(dca.bK, 30, 60);
      $$0.a(dca.bL, 30, 60);
      $$0.a(dca.bM, 30, 60);
      $$0.a(dca.bN, 30, 60);
      $$0.a(dca.bO, 30, 60);
      $$0.a(dca.bP, 30, 60);
      $$0.a(dca.ff, 15, 100);
      $$0.a(dca.iB, 5, 5);
      $$0.a(dca.ij, 60, 20);
      $$0.a(dca.pd, 15, 20);
      $$0.a(dca.ik, 60, 20);
      $$0.a(dca.il, 60, 20);
      $$0.a(dca.im, 60, 20);
      $$0.a(dca.in, 60, 20);
      $$0.a(dca.io, 60, 20);
      $$0.a(dca.ip, 60, 20);
      $$0.a(dca.iq, 60, 20);
      $$0.a(dca.ir, 60, 20);
      $$0.a(dca.is, 60, 20);
      $$0.a(dca.it, 60, 20);
      $$0.a(dca.iu, 60, 20);
      $$0.a(dca.iv, 60, 20);
      $$0.a(dca.iw, 60, 20);
      $$0.a(dca.ix, 60, 20);
      $$0.a(dca.iy, 60, 20);
      $$0.a(dca.iz, 60, 20);
      $$0.a(dca.me, 30, 60);
      $$0.a(dca.mZ, 60, 60);
      $$0.a(dca.nS, 60, 60);
      $$0.a(dca.oa, 30, 20);
      $$0.a(dca.pc, 5, 20);
      $$0.a(dca.oi, 60, 100);
      $$0.a(dca.pf, 5, 20);
      $$0.a(dca.pe, 30, 20);
      $$0.a(dca.aM, 30, 60);
      $$0.a(dca.aN, 30, 60);
      $$0.a(dca.sv, 15, 60);
      $$0.a(dca.sw, 15, 60);
      $$0.a(dca.sx, 60, 100);
      $$0.a(dca.sy, 30, 60);
      $$0.a(dca.sz, 30, 60);
      $$0.a(dca.sD, 60, 100);
      $$0.a(dca.sE, 60, 100);
      $$0.a(dca.sF, 60, 100);
      $$0.a(dca.sG, 30, 60);
      $$0.a(dca.fg, 15, 100);
   }
}
