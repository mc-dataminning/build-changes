import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dfv extends dci {
   public static final MapCodec<dfv> c = b(dfv::new);
   public static final int d = 15;
   public static final dqy e = dqo.aw;
   public static final dqp f = dij.b;
   public static final dqp g = dij.c;
   public static final dqp h = dij.d;
   public static final dqp i = dij.e;
   public static final dqp j = dij.f;
   private static final Map<ir, dqp> k = dij.h.entrySet().stream().filter($$0 -> $$0.getKey() != ir.a).collect(ac.a());
   private static final ety l = dcv.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ety m = dcv.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ety n = dcv.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ety o = dcv.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ety F = dcv.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dpy, ety> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dcv> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dcv> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dfv> a() {
      return c;
   }

   public dfv(dpx.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dfv::m)));
   }

   private static ety m(dpy $$0) {
      ety $$1 = etv.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = etv.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = etv.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = etv.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = etv.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dcx.a.n();
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dpy a(cvl $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dpy b(cza $$0, im $$1) {
      im $$2 = $$1.d();
      dpy $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ir.b)) {
         dpy $$4 = this.n();

         for (ir $$5 : ir.values()) {
            dqp $$6 = k.get($$5);
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
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ir.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.aa().b(czq.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dpy $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ac() && this.a((czu)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  im $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, ir.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(avn.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            im.a $$11 = new im.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((czx)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ac() || !this.a((czu)$$1, $$11))) {
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

   protected boolean a(czu $$0, im $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dpy $$0) {
      return $$0.b(dqo.C) && $$0.c(dqo.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dpy $$0) {
      return $$0.b(dqo.C) && $$0.c(dqo.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(czu $$0, im $$1, int $$2, ayd $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dpy $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dcv $$8 = $$6.b();
         if ($$8 instanceof dle) {
            dle.a($$0, $$1);
         }
      }
   }

   private dpy a(czv $$0, im $$1, int $$2) {
      dpy $$3 = a($$0, $$1);
      return $$3.a(dcx.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cza $$0, im $$1) {
      for (ir $$2 : ir.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(czx $$0, im $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ir $$3 : ir.values()) {
            dpy $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dpy $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(ayd $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dcv $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dfv $$0 = (dfv)dcx.cr;
      $$0.a(dcx.n, 5, 20);
      $$0.a(dcx.o, 5, 20);
      $$0.a(dcx.p, 5, 20);
      $$0.a(dcx.q, 5, 20);
      $$0.a(dcx.r, 5, 20);
      $$0.a(dcx.s, 5, 20);
      $$0.a(dcx.t, 5, 20);
      $$0.a(dcx.u, 5, 20);
      $$0.a(dcx.v, 5, 20);
      $$0.a(dcx.w, 5, 20);
      $$0.a(dcx.jt, 5, 20);
      $$0.a(dcx.ju, 5, 20);
      $$0.a(dcx.jv, 5, 20);
      $$0.a(dcx.jw, 5, 20);
      $$0.a(dcx.jx, 5, 20);
      $$0.a(dcx.jy, 5, 20);
      $$0.a(dcx.jz, 5, 20);
      $$0.a(dcx.jA, 5, 20);
      $$0.a(dcx.jB, 5, 20);
      $$0.a(dcx.jC, 5, 20);
      $$0.a(dcx.fh, 5, 20);
      $$0.a(dcx.jV, 5, 20);
      $$0.a(dcx.jW, 5, 20);
      $$0.a(dcx.jX, 5, 20);
      $$0.a(dcx.jY, 5, 20);
      $$0.a(dcx.jZ, 5, 20);
      $$0.a(dcx.ka, 5, 20);
      $$0.a(dcx.kb, 5, 20);
      $$0.a(dcx.kc, 5, 20);
      $$0.a(dcx.dU, 5, 20);
      $$0.a(dcx.kd, 5, 20);
      $$0.a(dcx.ke, 5, 20);
      $$0.a(dcx.kf, 5, 20);
      $$0.a(dcx.kg, 5, 20);
      $$0.a(dcx.kh, 5, 20);
      $$0.a(dcx.ki, 5, 20);
      $$0.a(dcx.kj, 5, 20);
      $$0.a(dcx.kk, 5, 20);
      $$0.a(dcx.cu, 5, 20);
      $$0.a(dcx.fL, 5, 20);
      $$0.a(dcx.fK, 5, 20);
      $$0.a(dcx.fM, 5, 20);
      $$0.a(dcx.hP, 5, 20);
      $$0.a(dcx.hQ, 5, 20);
      $$0.a(dcx.hR, 5, 20);
      $$0.a(dcx.hS, 5, 20);
      $$0.a(dcx.hT, 5, 20);
      $$0.a(dcx.hU, 5, 20);
      $$0.a(dcx.U, 5, 5);
      $$0.a(dcx.V, 5, 5);
      $$0.a(dcx.W, 5, 5);
      $$0.a(dcx.X, 5, 5);
      $$0.a(dcx.Y, 5, 5);
      $$0.a(dcx.Z, 5, 5);
      $$0.a(dcx.aa, 5, 5);
      $$0.a(dcx.ab, 5, 5);
      $$0.a(dcx.ae, 5, 5);
      $$0.a(dcx.al, 5, 5);
      $$0.a(dcx.af, 5, 5);
      $$0.a(dcx.ag, 5, 5);
      $$0.a(dcx.ah, 5, 5);
      $$0.a(dcx.ai, 5, 5);
      $$0.a(dcx.aj, 5, 5);
      $$0.a(dcx.ak, 5, 5);
      $$0.a(dcx.am, 5, 5);
      $$0.a(dcx.an, 5, 5);
      $$0.a(dcx.aw, 5, 5);
      $$0.a(dcx.ax, 5, 5);
      $$0.a(dcx.ay, 5, 5);
      $$0.a(dcx.az, 5, 5);
      $$0.a(dcx.aA, 5, 5);
      $$0.a(dcx.aB, 5, 5);
      $$0.a(dcx.aC, 5, 5);
      $$0.a(dcx.aD, 5, 5);
      $$0.a(dcx.ao, 5, 5);
      $$0.a(dcx.ap, 5, 5);
      $$0.a(dcx.aq, 5, 5);
      $$0.a(dcx.ar, 5, 5);
      $$0.a(dcx.as, 5, 5);
      $$0.a(dcx.at, 5, 5);
      $$0.a(dcx.au, 5, 5);
      $$0.a(dcx.av, 5, 5);
      $$0.a(dcx.ac, 5, 20);
      $$0.a(dcx.aE, 30, 60);
      $$0.a(dcx.aF, 30, 60);
      $$0.a(dcx.aG, 30, 60);
      $$0.a(dcx.aH, 30, 60);
      $$0.a(dcx.aI, 30, 60);
      $$0.a(dcx.aJ, 30, 60);
      $$0.a(dcx.aK, 30, 60);
      $$0.a(dcx.aL, 30, 60);
      $$0.a(dcx.cl, 30, 20);
      $$0.a(dcx.ck, 15, 100);
      $$0.a(dcx.bt, 60, 100);
      $$0.a(dcx.bu, 60, 100);
      $$0.a(dcx.bv, 60, 100);
      $$0.a(dcx.iD, 60, 100);
      $$0.a(dcx.iE, 60, 100);
      $$0.a(dcx.iF, 60, 100);
      $$0.a(dcx.iG, 60, 100);
      $$0.a(dcx.iH, 60, 100);
      $$0.a(dcx.iI, 60, 100);
      $$0.a(dcx.bR, 60, 100);
      $$0.a(dcx.bT, 60, 100);
      $$0.a(dcx.bU, 60, 100);
      $$0.a(dcx.bV, 60, 100);
      $$0.a(dcx.bW, 60, 100);
      $$0.a(dcx.bX, 60, 100);
      $$0.a(dcx.bY, 60, 100);
      $$0.a(dcx.bZ, 60, 100);
      $$0.a(dcx.ca, 60, 100);
      $$0.a(dcx.cb, 60, 100);
      $$0.a(dcx.cc, 60, 100);
      $$0.a(dcx.ce, 60, 100);
      $$0.a(dcx.bS, 60, 100);
      $$0.a(dcx.kC, 60, 100);
      $$0.a(dcx.cd, 60, 100);
      $$0.a(dcx.sB, 60, 100);
      $$0.a(dcx.bA, 30, 60);
      $$0.a(dcx.bB, 30, 60);
      $$0.a(dcx.bC, 30, 60);
      $$0.a(dcx.bD, 30, 60);
      $$0.a(dcx.bE, 30, 60);
      $$0.a(dcx.bF, 30, 60);
      $$0.a(dcx.bG, 30, 60);
      $$0.a(dcx.bH, 30, 60);
      $$0.a(dcx.bI, 30, 60);
      $$0.a(dcx.bJ, 30, 60);
      $$0.a(dcx.bK, 30, 60);
      $$0.a(dcx.bL, 30, 60);
      $$0.a(dcx.bM, 30, 60);
      $$0.a(dcx.bN, 30, 60);
      $$0.a(dcx.bO, 30, 60);
      $$0.a(dcx.bP, 30, 60);
      $$0.a(dcx.ff, 15, 100);
      $$0.a(dcx.iB, 5, 5);
      $$0.a(dcx.ij, 60, 20);
      $$0.a(dcx.pd, 15, 20);
      $$0.a(dcx.ik, 60, 20);
      $$0.a(dcx.il, 60, 20);
      $$0.a(dcx.im, 60, 20);
      $$0.a(dcx.in, 60, 20);
      $$0.a(dcx.io, 60, 20);
      $$0.a(dcx.ip, 60, 20);
      $$0.a(dcx.iq, 60, 20);
      $$0.a(dcx.ir, 60, 20);
      $$0.a(dcx.is, 60, 20);
      $$0.a(dcx.it, 60, 20);
      $$0.a(dcx.iu, 60, 20);
      $$0.a(dcx.iv, 60, 20);
      $$0.a(dcx.iw, 60, 20);
      $$0.a(dcx.ix, 60, 20);
      $$0.a(dcx.iy, 60, 20);
      $$0.a(dcx.iz, 60, 20);
      $$0.a(dcx.me, 30, 60);
      $$0.a(dcx.mZ, 60, 60);
      $$0.a(dcx.nS, 60, 60);
      $$0.a(dcx.oa, 30, 20);
      $$0.a(dcx.pc, 5, 20);
      $$0.a(dcx.oi, 60, 100);
      $$0.a(dcx.pf, 5, 20);
      $$0.a(dcx.pe, 30, 20);
      $$0.a(dcx.aM, 30, 60);
      $$0.a(dcx.aN, 30, 60);
      $$0.a(dcx.sv, 15, 60);
      $$0.a(dcx.sw, 15, 60);
      $$0.a(dcx.sx, 60, 100);
      $$0.a(dcx.sy, 30, 60);
      $$0.a(dcx.sz, 30, 60);
      $$0.a(dcx.sD, 60, 100);
      $$0.a(dcx.sE, 60, 100);
      $$0.a(dcx.sF, 60, 100);
      $$0.a(dcx.sG, 30, 60);
      $$0.a(dcx.fg, 15, 100);
   }
}
