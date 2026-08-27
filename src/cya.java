import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cya extends cun {
   public static final MapCodec<cya> c = b(cya::new);
   public static final int d = 15;
   public static final dii e = dhy.aw;
   public static final dhz f = dan.b;
   public static final dhz g = dan.c;
   public static final dhz h = dan.d;
   public static final dhz i = dan.e;
   public static final dhz j = dan.f;
   private static final Map<hx, dhz> k = dan.h.entrySet().stream().filter($$0 -> $$0.getKey() != hx.a).collect(ac.a());
   private static final ekn l = cva.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekn m = cva.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ekn n = cva.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekn o = cva.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ekn F = cva.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dhi, ekn> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<cva> P = new Object2IntOpenHashMap();
   private final Object2IntMap<cva> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<cya> a() {
      return c;
   }

   public cya(dhh.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), cya::h)));
   }

   private static ekn h(dhi $$0) {
      ekn $$1 = ekk.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ekk.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ekk.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ekk.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ekk.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : cvc.a.o();
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dhi a(cnr $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dhi b(crg $$0, ht $$1) {
      ht $$2 = $$1.d();
      dhi $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, hx.b)) {
         dhi $$4 = this.o();

         for (hx $$5 : hx.values()) {
            dhz $$6 = k.get($$5);
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
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      ht $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hx.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.Y().b(crw.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dhi $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.aa() && this.a((csa)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  ht $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, hx.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.s($$2).a(arf.ac);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            ht.a $$11 = new ht.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((csd)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.aj().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.aa() || !this.a((csa)$$1, $$11))) {
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

   protected boolean a(csa $$0, ht $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dhi $$0) {
      return $$0.b(dhy.C) && $$0.c(dhy.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dhi $$0) {
      return $$0.b(dhy.C) && $$0.c(dhy.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(csa $$0, ht $$1, int $$2, ats $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dhi $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cva $$8 = $$6.b();
         if ($$8 instanceof ddi) {
            ddi.a($$0, $$1);
         }
      }
   }

   private dhi a(csb $$0, ht $$1, int $$2) {
      dhi $$3 = a($$0, $$1);
      return $$3.a(cvc.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(crg $$0, ht $$1) {
      for (hx $$2 : hx.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(csd $$0, ht $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (hx $$3 : hx.values()) {
            dhi $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dhi $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(ats $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(cva $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      cya $$0 = (cya)cvc.cr;
      $$0.a(cvc.n, 5, 20);
      $$0.a(cvc.o, 5, 20);
      $$0.a(cvc.p, 5, 20);
      $$0.a(cvc.q, 5, 20);
      $$0.a(cvc.r, 5, 20);
      $$0.a(cvc.s, 5, 20);
      $$0.a(cvc.t, 5, 20);
      $$0.a(cvc.u, 5, 20);
      $$0.a(cvc.v, 5, 20);
      $$0.a(cvc.w, 5, 20);
      $$0.a(cvc.jt, 5, 20);
      $$0.a(cvc.ju, 5, 20);
      $$0.a(cvc.jv, 5, 20);
      $$0.a(cvc.jw, 5, 20);
      $$0.a(cvc.jx, 5, 20);
      $$0.a(cvc.jy, 5, 20);
      $$0.a(cvc.jz, 5, 20);
      $$0.a(cvc.jA, 5, 20);
      $$0.a(cvc.jB, 5, 20);
      $$0.a(cvc.jC, 5, 20);
      $$0.a(cvc.fh, 5, 20);
      $$0.a(cvc.jV, 5, 20);
      $$0.a(cvc.jW, 5, 20);
      $$0.a(cvc.jX, 5, 20);
      $$0.a(cvc.jY, 5, 20);
      $$0.a(cvc.jZ, 5, 20);
      $$0.a(cvc.ka, 5, 20);
      $$0.a(cvc.kb, 5, 20);
      $$0.a(cvc.kc, 5, 20);
      $$0.a(cvc.dU, 5, 20);
      $$0.a(cvc.kd, 5, 20);
      $$0.a(cvc.ke, 5, 20);
      $$0.a(cvc.kf, 5, 20);
      $$0.a(cvc.kg, 5, 20);
      $$0.a(cvc.kh, 5, 20);
      $$0.a(cvc.ki, 5, 20);
      $$0.a(cvc.kj, 5, 20);
      $$0.a(cvc.kk, 5, 20);
      $$0.a(cvc.cu, 5, 20);
      $$0.a(cvc.fL, 5, 20);
      $$0.a(cvc.fK, 5, 20);
      $$0.a(cvc.fM, 5, 20);
      $$0.a(cvc.hP, 5, 20);
      $$0.a(cvc.hQ, 5, 20);
      $$0.a(cvc.hR, 5, 20);
      $$0.a(cvc.hS, 5, 20);
      $$0.a(cvc.hT, 5, 20);
      $$0.a(cvc.hU, 5, 20);
      $$0.a(cvc.U, 5, 5);
      $$0.a(cvc.V, 5, 5);
      $$0.a(cvc.W, 5, 5);
      $$0.a(cvc.X, 5, 5);
      $$0.a(cvc.Y, 5, 5);
      $$0.a(cvc.Z, 5, 5);
      $$0.a(cvc.aa, 5, 5);
      $$0.a(cvc.ab, 5, 5);
      $$0.a(cvc.ae, 5, 5);
      $$0.a(cvc.al, 5, 5);
      $$0.a(cvc.af, 5, 5);
      $$0.a(cvc.ag, 5, 5);
      $$0.a(cvc.ah, 5, 5);
      $$0.a(cvc.ai, 5, 5);
      $$0.a(cvc.aj, 5, 5);
      $$0.a(cvc.ak, 5, 5);
      $$0.a(cvc.am, 5, 5);
      $$0.a(cvc.an, 5, 5);
      $$0.a(cvc.aw, 5, 5);
      $$0.a(cvc.ax, 5, 5);
      $$0.a(cvc.ay, 5, 5);
      $$0.a(cvc.az, 5, 5);
      $$0.a(cvc.aA, 5, 5);
      $$0.a(cvc.aB, 5, 5);
      $$0.a(cvc.aC, 5, 5);
      $$0.a(cvc.aD, 5, 5);
      $$0.a(cvc.ao, 5, 5);
      $$0.a(cvc.ap, 5, 5);
      $$0.a(cvc.aq, 5, 5);
      $$0.a(cvc.ar, 5, 5);
      $$0.a(cvc.as, 5, 5);
      $$0.a(cvc.at, 5, 5);
      $$0.a(cvc.au, 5, 5);
      $$0.a(cvc.av, 5, 5);
      $$0.a(cvc.ac, 5, 20);
      $$0.a(cvc.aE, 30, 60);
      $$0.a(cvc.aF, 30, 60);
      $$0.a(cvc.aG, 30, 60);
      $$0.a(cvc.aH, 30, 60);
      $$0.a(cvc.aI, 30, 60);
      $$0.a(cvc.aJ, 30, 60);
      $$0.a(cvc.aK, 30, 60);
      $$0.a(cvc.aL, 30, 60);
      $$0.a(cvc.cl, 30, 20);
      $$0.a(cvc.ck, 15, 100);
      $$0.a(cvc.bt, 60, 100);
      $$0.a(cvc.bu, 60, 100);
      $$0.a(cvc.bv, 60, 100);
      $$0.a(cvc.iD, 60, 100);
      $$0.a(cvc.iE, 60, 100);
      $$0.a(cvc.iF, 60, 100);
      $$0.a(cvc.iG, 60, 100);
      $$0.a(cvc.iH, 60, 100);
      $$0.a(cvc.iI, 60, 100);
      $$0.a(cvc.bR, 60, 100);
      $$0.a(cvc.bT, 60, 100);
      $$0.a(cvc.bU, 60, 100);
      $$0.a(cvc.bV, 60, 100);
      $$0.a(cvc.bW, 60, 100);
      $$0.a(cvc.bX, 60, 100);
      $$0.a(cvc.bY, 60, 100);
      $$0.a(cvc.bZ, 60, 100);
      $$0.a(cvc.ca, 60, 100);
      $$0.a(cvc.cb, 60, 100);
      $$0.a(cvc.cc, 60, 100);
      $$0.a(cvc.ce, 60, 100);
      $$0.a(cvc.bS, 60, 100);
      $$0.a(cvc.kC, 60, 100);
      $$0.a(cvc.cd, 60, 100);
      $$0.a(cvc.sB, 60, 100);
      $$0.a(cvc.bA, 30, 60);
      $$0.a(cvc.bB, 30, 60);
      $$0.a(cvc.bC, 30, 60);
      $$0.a(cvc.bD, 30, 60);
      $$0.a(cvc.bE, 30, 60);
      $$0.a(cvc.bF, 30, 60);
      $$0.a(cvc.bG, 30, 60);
      $$0.a(cvc.bH, 30, 60);
      $$0.a(cvc.bI, 30, 60);
      $$0.a(cvc.bJ, 30, 60);
      $$0.a(cvc.bK, 30, 60);
      $$0.a(cvc.bL, 30, 60);
      $$0.a(cvc.bM, 30, 60);
      $$0.a(cvc.bN, 30, 60);
      $$0.a(cvc.bO, 30, 60);
      $$0.a(cvc.bP, 30, 60);
      $$0.a(cvc.ff, 15, 100);
      $$0.a(cvc.iB, 5, 5);
      $$0.a(cvc.ij, 60, 20);
      $$0.a(cvc.pd, 15, 20);
      $$0.a(cvc.ik, 60, 20);
      $$0.a(cvc.il, 60, 20);
      $$0.a(cvc.im, 60, 20);
      $$0.a(cvc.in, 60, 20);
      $$0.a(cvc.io, 60, 20);
      $$0.a(cvc.ip, 60, 20);
      $$0.a(cvc.iq, 60, 20);
      $$0.a(cvc.ir, 60, 20);
      $$0.a(cvc.is, 60, 20);
      $$0.a(cvc.it, 60, 20);
      $$0.a(cvc.iu, 60, 20);
      $$0.a(cvc.iv, 60, 20);
      $$0.a(cvc.iw, 60, 20);
      $$0.a(cvc.ix, 60, 20);
      $$0.a(cvc.iy, 60, 20);
      $$0.a(cvc.iz, 60, 20);
      $$0.a(cvc.me, 30, 60);
      $$0.a(cvc.mZ, 60, 60);
      $$0.a(cvc.nS, 60, 60);
      $$0.a(cvc.oa, 30, 20);
      $$0.a(cvc.pc, 5, 20);
      $$0.a(cvc.oi, 60, 100);
      $$0.a(cvc.pf, 5, 20);
      $$0.a(cvc.pe, 30, 20);
      $$0.a(cvc.aM, 30, 60);
      $$0.a(cvc.aN, 30, 60);
      $$0.a(cvc.sv, 15, 60);
      $$0.a(cvc.sw, 15, 60);
      $$0.a(cvc.sx, 60, 100);
      $$0.a(cvc.sy, 30, 60);
      $$0.a(cvc.sz, 30, 60);
      $$0.a(cvc.sD, 60, 100);
      $$0.a(cvc.sE, 60, 100);
      $$0.a(cvc.sF, 60, 100);
      $$0.a(cvc.sG, 30, 60);
      $$0.a(cvc.fg, 15, 100);
   }
}
