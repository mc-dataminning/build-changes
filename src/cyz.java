import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cyz extends cvm {
   public static final MapCodec<cyz> c = b(cyz::new);
   public static final int d = 15;
   public static final djp e = djf.aw;
   public static final djg f = dbm.b;
   public static final djg g = dbm.c;
   public static final djg h = dbm.d;
   public static final djg i = dbm.e;
   public static final djg j = dbm.f;
   private static final Map<ia, djg> k = dbm.h.entrySet().stream().filter($$0 -> $$0.getKey() != ia.a).collect(ac.a());
   private static final elu l = cvz.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final elu m = cvz.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final elu n = cvz.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final elu o = cvz.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final elu F = cvz.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dip, elu> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<cvz> P = new Object2IntOpenHashMap();
   private final Object2IntMap<cvz> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<cyz> a() {
      return c;
   }

   public cyz(dio.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), cyz::h)));
   }

   private static elu h(dip $$0) {
      elu $$1 = elr.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = elr.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = elr.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = elr.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = elr.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : cwb.a.o();
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dip a(coq $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dip b(cse $$0, hv $$1) {
      hv $$2 = $$1.d();
      dip $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ia.b)) {
         dip $$4 = this.o();

         for (ia $$5 : ia.values()) {
            djg $$6 = k.get($$5);
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
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ia.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.Y().b(csu.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dip $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.E_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.aa() && this.a((csy)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  hv $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, ia.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.s($$2).a(arq.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            hv.a $$11 = new hv.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((ctb)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.aj().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.aa() || !this.a((csy)$$1, $$11))) {
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

   protected boolean a(csy $$0, hv $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dip $$0) {
      return $$0.b(djf.C) && $$0.c(djf.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dip $$0) {
      return $$0.b(djf.C) && $$0.c(djf.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(csy $$0, hv $$1, int $$2, auf $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dip $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cvz $$8 = $$6.b();
         if ($$8 instanceof deh) {
            deh.a($$0, $$1);
         }
      }
   }

   private dip a(csz $$0, hv $$1, int $$2) {
      dip $$3 = a($$0, $$1);
      return $$3.a(cwb.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cse $$0, hv $$1) {
      for (ia $$2 : ia.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(ctb $$0, hv $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ia $$3 : ia.values()) {
            dip $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dip $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(auf $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(cvz $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      cyz $$0 = (cyz)cwb.cr;
      $$0.a(cwb.n, 5, 20);
      $$0.a(cwb.o, 5, 20);
      $$0.a(cwb.p, 5, 20);
      $$0.a(cwb.q, 5, 20);
      $$0.a(cwb.r, 5, 20);
      $$0.a(cwb.s, 5, 20);
      $$0.a(cwb.t, 5, 20);
      $$0.a(cwb.u, 5, 20);
      $$0.a(cwb.v, 5, 20);
      $$0.a(cwb.w, 5, 20);
      $$0.a(cwb.jt, 5, 20);
      $$0.a(cwb.ju, 5, 20);
      $$0.a(cwb.jv, 5, 20);
      $$0.a(cwb.jw, 5, 20);
      $$0.a(cwb.jx, 5, 20);
      $$0.a(cwb.jy, 5, 20);
      $$0.a(cwb.jz, 5, 20);
      $$0.a(cwb.jA, 5, 20);
      $$0.a(cwb.jB, 5, 20);
      $$0.a(cwb.jC, 5, 20);
      $$0.a(cwb.fh, 5, 20);
      $$0.a(cwb.jV, 5, 20);
      $$0.a(cwb.jW, 5, 20);
      $$0.a(cwb.jX, 5, 20);
      $$0.a(cwb.jY, 5, 20);
      $$0.a(cwb.jZ, 5, 20);
      $$0.a(cwb.ka, 5, 20);
      $$0.a(cwb.kb, 5, 20);
      $$0.a(cwb.kc, 5, 20);
      $$0.a(cwb.dU, 5, 20);
      $$0.a(cwb.kd, 5, 20);
      $$0.a(cwb.ke, 5, 20);
      $$0.a(cwb.kf, 5, 20);
      $$0.a(cwb.kg, 5, 20);
      $$0.a(cwb.kh, 5, 20);
      $$0.a(cwb.ki, 5, 20);
      $$0.a(cwb.kj, 5, 20);
      $$0.a(cwb.kk, 5, 20);
      $$0.a(cwb.cu, 5, 20);
      $$0.a(cwb.fL, 5, 20);
      $$0.a(cwb.fK, 5, 20);
      $$0.a(cwb.fM, 5, 20);
      $$0.a(cwb.hP, 5, 20);
      $$0.a(cwb.hQ, 5, 20);
      $$0.a(cwb.hR, 5, 20);
      $$0.a(cwb.hS, 5, 20);
      $$0.a(cwb.hT, 5, 20);
      $$0.a(cwb.hU, 5, 20);
      $$0.a(cwb.U, 5, 5);
      $$0.a(cwb.V, 5, 5);
      $$0.a(cwb.W, 5, 5);
      $$0.a(cwb.X, 5, 5);
      $$0.a(cwb.Y, 5, 5);
      $$0.a(cwb.Z, 5, 5);
      $$0.a(cwb.aa, 5, 5);
      $$0.a(cwb.ab, 5, 5);
      $$0.a(cwb.ae, 5, 5);
      $$0.a(cwb.al, 5, 5);
      $$0.a(cwb.af, 5, 5);
      $$0.a(cwb.ag, 5, 5);
      $$0.a(cwb.ah, 5, 5);
      $$0.a(cwb.ai, 5, 5);
      $$0.a(cwb.aj, 5, 5);
      $$0.a(cwb.ak, 5, 5);
      $$0.a(cwb.am, 5, 5);
      $$0.a(cwb.an, 5, 5);
      $$0.a(cwb.aw, 5, 5);
      $$0.a(cwb.ax, 5, 5);
      $$0.a(cwb.ay, 5, 5);
      $$0.a(cwb.az, 5, 5);
      $$0.a(cwb.aA, 5, 5);
      $$0.a(cwb.aB, 5, 5);
      $$0.a(cwb.aC, 5, 5);
      $$0.a(cwb.aD, 5, 5);
      $$0.a(cwb.ao, 5, 5);
      $$0.a(cwb.ap, 5, 5);
      $$0.a(cwb.aq, 5, 5);
      $$0.a(cwb.ar, 5, 5);
      $$0.a(cwb.as, 5, 5);
      $$0.a(cwb.at, 5, 5);
      $$0.a(cwb.au, 5, 5);
      $$0.a(cwb.av, 5, 5);
      $$0.a(cwb.ac, 5, 20);
      $$0.a(cwb.aE, 30, 60);
      $$0.a(cwb.aF, 30, 60);
      $$0.a(cwb.aG, 30, 60);
      $$0.a(cwb.aH, 30, 60);
      $$0.a(cwb.aI, 30, 60);
      $$0.a(cwb.aJ, 30, 60);
      $$0.a(cwb.aK, 30, 60);
      $$0.a(cwb.aL, 30, 60);
      $$0.a(cwb.cl, 30, 20);
      $$0.a(cwb.ck, 15, 100);
      $$0.a(cwb.bt, 60, 100);
      $$0.a(cwb.bu, 60, 100);
      $$0.a(cwb.bv, 60, 100);
      $$0.a(cwb.iD, 60, 100);
      $$0.a(cwb.iE, 60, 100);
      $$0.a(cwb.iF, 60, 100);
      $$0.a(cwb.iG, 60, 100);
      $$0.a(cwb.iH, 60, 100);
      $$0.a(cwb.iI, 60, 100);
      $$0.a(cwb.bR, 60, 100);
      $$0.a(cwb.bT, 60, 100);
      $$0.a(cwb.bU, 60, 100);
      $$0.a(cwb.bV, 60, 100);
      $$0.a(cwb.bW, 60, 100);
      $$0.a(cwb.bX, 60, 100);
      $$0.a(cwb.bY, 60, 100);
      $$0.a(cwb.bZ, 60, 100);
      $$0.a(cwb.ca, 60, 100);
      $$0.a(cwb.cb, 60, 100);
      $$0.a(cwb.cc, 60, 100);
      $$0.a(cwb.ce, 60, 100);
      $$0.a(cwb.bS, 60, 100);
      $$0.a(cwb.kC, 60, 100);
      $$0.a(cwb.cd, 60, 100);
      $$0.a(cwb.sB, 60, 100);
      $$0.a(cwb.bA, 30, 60);
      $$0.a(cwb.bB, 30, 60);
      $$0.a(cwb.bC, 30, 60);
      $$0.a(cwb.bD, 30, 60);
      $$0.a(cwb.bE, 30, 60);
      $$0.a(cwb.bF, 30, 60);
      $$0.a(cwb.bG, 30, 60);
      $$0.a(cwb.bH, 30, 60);
      $$0.a(cwb.bI, 30, 60);
      $$0.a(cwb.bJ, 30, 60);
      $$0.a(cwb.bK, 30, 60);
      $$0.a(cwb.bL, 30, 60);
      $$0.a(cwb.bM, 30, 60);
      $$0.a(cwb.bN, 30, 60);
      $$0.a(cwb.bO, 30, 60);
      $$0.a(cwb.bP, 30, 60);
      $$0.a(cwb.ff, 15, 100);
      $$0.a(cwb.iB, 5, 5);
      $$0.a(cwb.ij, 60, 20);
      $$0.a(cwb.pd, 15, 20);
      $$0.a(cwb.ik, 60, 20);
      $$0.a(cwb.il, 60, 20);
      $$0.a(cwb.im, 60, 20);
      $$0.a(cwb.in, 60, 20);
      $$0.a(cwb.io, 60, 20);
      $$0.a(cwb.ip, 60, 20);
      $$0.a(cwb.iq, 60, 20);
      $$0.a(cwb.ir, 60, 20);
      $$0.a(cwb.is, 60, 20);
      $$0.a(cwb.it, 60, 20);
      $$0.a(cwb.iu, 60, 20);
      $$0.a(cwb.iv, 60, 20);
      $$0.a(cwb.iw, 60, 20);
      $$0.a(cwb.ix, 60, 20);
      $$0.a(cwb.iy, 60, 20);
      $$0.a(cwb.iz, 60, 20);
      $$0.a(cwb.me, 30, 60);
      $$0.a(cwb.mZ, 60, 60);
      $$0.a(cwb.nS, 60, 60);
      $$0.a(cwb.oa, 30, 20);
      $$0.a(cwb.pc, 5, 20);
      $$0.a(cwb.oi, 60, 100);
      $$0.a(cwb.pf, 5, 20);
      $$0.a(cwb.pe, 30, 20);
      $$0.a(cwb.aM, 30, 60);
      $$0.a(cwb.aN, 30, 60);
      $$0.a(cwb.sv, 15, 60);
      $$0.a(cwb.sw, 15, 60);
      $$0.a(cwb.sx, 60, 100);
      $$0.a(cwb.sy, 30, 60);
      $$0.a(cwb.sz, 30, 60);
      $$0.a(cwb.sD, 60, 100);
      $$0.a(cwb.sE, 60, 100);
      $$0.a(cwb.sF, 60, 100);
      $$0.a(cwb.sG, 30, 60);
      $$0.a(cwb.fg, 15, 100);
   }
}
