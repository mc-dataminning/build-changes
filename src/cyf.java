import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cyf extends cus {
   public static final MapCodec<cyf> c = b(cyf::new);
   public static final int d = 15;
   public static final din e = did.aw;
   public static final die f = das.b;
   public static final die g = das.c;
   public static final die h = das.d;
   public static final die i = das.e;
   public static final die j = das.f;
   private static final Map<ib, die> k = das.h.entrySet().stream().filter($$0 -> $$0.getKey() != ib.a).collect(ac.a());
   private static final eks l = cvf.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eks m = cvf.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eks n = cvf.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eks o = cvf.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eks F = cvf.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dhn, eks> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<cvf> P = new Object2IntOpenHashMap();
   private final Object2IntMap<cvf> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<cyf> a() {
      return c;
   }

   public cyf(dhm.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), cyf::h)));
   }

   private static eks h(dhn $$0) {
      eks $$1 = ekp.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ekp.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ekp.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ekp.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ekp.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : cvh.a.o();
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dhn a(cnw $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dhn b(crl $$0, hx $$1) {
      hx $$2 = $$1.d();
      dhn $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ib.b)) {
         dhn $$4 = this.o();

         for (ib $$5 : ib.values()) {
            die $$6 = k.get($$5);
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
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ib.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.Y().b(csb.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dhn $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.E_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.aa() && this.a((csf)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  hx $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, ib.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.s($$2).a(arj.ac);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            hx.a $$11 = new hx.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((csi)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.aj().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.aa() || !this.a((csf)$$1, $$11))) {
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

   protected boolean a(csf $$0, hx $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dhn $$0) {
      return $$0.b(did.C) && $$0.c(did.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dhn $$0) {
      return $$0.b(did.C) && $$0.c(did.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(csf $$0, hx $$1, int $$2, atw $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dhn $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cvf $$8 = $$6.b();
         if ($$8 instanceof ddn) {
            ddn.a($$0, $$1);
         }
      }
   }

   private dhn a(csg $$0, hx $$1, int $$2) {
      dhn $$3 = a($$0, $$1);
      return $$3.a(cvh.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(crl $$0, hx $$1) {
      for (ib $$2 : ib.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(csi $$0, hx $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ib $$3 : ib.values()) {
            dhn $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dhn $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(atw $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(cvf $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      cyf $$0 = (cyf)cvh.cr;
      $$0.a(cvh.n, 5, 20);
      $$0.a(cvh.o, 5, 20);
      $$0.a(cvh.p, 5, 20);
      $$0.a(cvh.q, 5, 20);
      $$0.a(cvh.r, 5, 20);
      $$0.a(cvh.s, 5, 20);
      $$0.a(cvh.t, 5, 20);
      $$0.a(cvh.u, 5, 20);
      $$0.a(cvh.v, 5, 20);
      $$0.a(cvh.w, 5, 20);
      $$0.a(cvh.jt, 5, 20);
      $$0.a(cvh.ju, 5, 20);
      $$0.a(cvh.jv, 5, 20);
      $$0.a(cvh.jw, 5, 20);
      $$0.a(cvh.jx, 5, 20);
      $$0.a(cvh.jy, 5, 20);
      $$0.a(cvh.jz, 5, 20);
      $$0.a(cvh.jA, 5, 20);
      $$0.a(cvh.jB, 5, 20);
      $$0.a(cvh.jC, 5, 20);
      $$0.a(cvh.fh, 5, 20);
      $$0.a(cvh.jV, 5, 20);
      $$0.a(cvh.jW, 5, 20);
      $$0.a(cvh.jX, 5, 20);
      $$0.a(cvh.jY, 5, 20);
      $$0.a(cvh.jZ, 5, 20);
      $$0.a(cvh.ka, 5, 20);
      $$0.a(cvh.kb, 5, 20);
      $$0.a(cvh.kc, 5, 20);
      $$0.a(cvh.dU, 5, 20);
      $$0.a(cvh.kd, 5, 20);
      $$0.a(cvh.ke, 5, 20);
      $$0.a(cvh.kf, 5, 20);
      $$0.a(cvh.kg, 5, 20);
      $$0.a(cvh.kh, 5, 20);
      $$0.a(cvh.ki, 5, 20);
      $$0.a(cvh.kj, 5, 20);
      $$0.a(cvh.kk, 5, 20);
      $$0.a(cvh.cu, 5, 20);
      $$0.a(cvh.fL, 5, 20);
      $$0.a(cvh.fK, 5, 20);
      $$0.a(cvh.fM, 5, 20);
      $$0.a(cvh.hP, 5, 20);
      $$0.a(cvh.hQ, 5, 20);
      $$0.a(cvh.hR, 5, 20);
      $$0.a(cvh.hS, 5, 20);
      $$0.a(cvh.hT, 5, 20);
      $$0.a(cvh.hU, 5, 20);
      $$0.a(cvh.U, 5, 5);
      $$0.a(cvh.V, 5, 5);
      $$0.a(cvh.W, 5, 5);
      $$0.a(cvh.X, 5, 5);
      $$0.a(cvh.Y, 5, 5);
      $$0.a(cvh.Z, 5, 5);
      $$0.a(cvh.aa, 5, 5);
      $$0.a(cvh.ab, 5, 5);
      $$0.a(cvh.ae, 5, 5);
      $$0.a(cvh.al, 5, 5);
      $$0.a(cvh.af, 5, 5);
      $$0.a(cvh.ag, 5, 5);
      $$0.a(cvh.ah, 5, 5);
      $$0.a(cvh.ai, 5, 5);
      $$0.a(cvh.aj, 5, 5);
      $$0.a(cvh.ak, 5, 5);
      $$0.a(cvh.am, 5, 5);
      $$0.a(cvh.an, 5, 5);
      $$0.a(cvh.aw, 5, 5);
      $$0.a(cvh.ax, 5, 5);
      $$0.a(cvh.ay, 5, 5);
      $$0.a(cvh.az, 5, 5);
      $$0.a(cvh.aA, 5, 5);
      $$0.a(cvh.aB, 5, 5);
      $$0.a(cvh.aC, 5, 5);
      $$0.a(cvh.aD, 5, 5);
      $$0.a(cvh.ao, 5, 5);
      $$0.a(cvh.ap, 5, 5);
      $$0.a(cvh.aq, 5, 5);
      $$0.a(cvh.ar, 5, 5);
      $$0.a(cvh.as, 5, 5);
      $$0.a(cvh.at, 5, 5);
      $$0.a(cvh.au, 5, 5);
      $$0.a(cvh.av, 5, 5);
      $$0.a(cvh.ac, 5, 20);
      $$0.a(cvh.aE, 30, 60);
      $$0.a(cvh.aF, 30, 60);
      $$0.a(cvh.aG, 30, 60);
      $$0.a(cvh.aH, 30, 60);
      $$0.a(cvh.aI, 30, 60);
      $$0.a(cvh.aJ, 30, 60);
      $$0.a(cvh.aK, 30, 60);
      $$0.a(cvh.aL, 30, 60);
      $$0.a(cvh.cl, 30, 20);
      $$0.a(cvh.ck, 15, 100);
      $$0.a(cvh.bt, 60, 100);
      $$0.a(cvh.bu, 60, 100);
      $$0.a(cvh.bv, 60, 100);
      $$0.a(cvh.iD, 60, 100);
      $$0.a(cvh.iE, 60, 100);
      $$0.a(cvh.iF, 60, 100);
      $$0.a(cvh.iG, 60, 100);
      $$0.a(cvh.iH, 60, 100);
      $$0.a(cvh.iI, 60, 100);
      $$0.a(cvh.bR, 60, 100);
      $$0.a(cvh.bT, 60, 100);
      $$0.a(cvh.bU, 60, 100);
      $$0.a(cvh.bV, 60, 100);
      $$0.a(cvh.bW, 60, 100);
      $$0.a(cvh.bX, 60, 100);
      $$0.a(cvh.bY, 60, 100);
      $$0.a(cvh.bZ, 60, 100);
      $$0.a(cvh.ca, 60, 100);
      $$0.a(cvh.cb, 60, 100);
      $$0.a(cvh.cc, 60, 100);
      $$0.a(cvh.ce, 60, 100);
      $$0.a(cvh.bS, 60, 100);
      $$0.a(cvh.kC, 60, 100);
      $$0.a(cvh.cd, 60, 100);
      $$0.a(cvh.sB, 60, 100);
      $$0.a(cvh.bA, 30, 60);
      $$0.a(cvh.bB, 30, 60);
      $$0.a(cvh.bC, 30, 60);
      $$0.a(cvh.bD, 30, 60);
      $$0.a(cvh.bE, 30, 60);
      $$0.a(cvh.bF, 30, 60);
      $$0.a(cvh.bG, 30, 60);
      $$0.a(cvh.bH, 30, 60);
      $$0.a(cvh.bI, 30, 60);
      $$0.a(cvh.bJ, 30, 60);
      $$0.a(cvh.bK, 30, 60);
      $$0.a(cvh.bL, 30, 60);
      $$0.a(cvh.bM, 30, 60);
      $$0.a(cvh.bN, 30, 60);
      $$0.a(cvh.bO, 30, 60);
      $$0.a(cvh.bP, 30, 60);
      $$0.a(cvh.ff, 15, 100);
      $$0.a(cvh.iB, 5, 5);
      $$0.a(cvh.ij, 60, 20);
      $$0.a(cvh.pd, 15, 20);
      $$0.a(cvh.ik, 60, 20);
      $$0.a(cvh.il, 60, 20);
      $$0.a(cvh.im, 60, 20);
      $$0.a(cvh.in, 60, 20);
      $$0.a(cvh.io, 60, 20);
      $$0.a(cvh.ip, 60, 20);
      $$0.a(cvh.iq, 60, 20);
      $$0.a(cvh.ir, 60, 20);
      $$0.a(cvh.is, 60, 20);
      $$0.a(cvh.it, 60, 20);
      $$0.a(cvh.iu, 60, 20);
      $$0.a(cvh.iv, 60, 20);
      $$0.a(cvh.iw, 60, 20);
      $$0.a(cvh.ix, 60, 20);
      $$0.a(cvh.iy, 60, 20);
      $$0.a(cvh.iz, 60, 20);
      $$0.a(cvh.me, 30, 60);
      $$0.a(cvh.mZ, 60, 60);
      $$0.a(cvh.nS, 60, 60);
      $$0.a(cvh.oa, 30, 20);
      $$0.a(cvh.pc, 5, 20);
      $$0.a(cvh.oi, 60, 100);
      $$0.a(cvh.pf, 5, 20);
      $$0.a(cvh.pe, 30, 20);
      $$0.a(cvh.aM, 30, 60);
      $$0.a(cvh.aN, 30, 60);
      $$0.a(cvh.sv, 15, 60);
      $$0.a(cvh.sw, 15, 60);
      $$0.a(cvh.sx, 60, 100);
      $$0.a(cvh.sy, 30, 60);
      $$0.a(cvh.sz, 30, 60);
      $$0.a(cvh.sD, 60, 100);
      $$0.a(cvh.sE, 60, 100);
      $$0.a(cvh.sF, 60, 100);
      $$0.a(cvh.sG, 30, 60);
      $$0.a(cvh.fg, 15, 100);
   }
}
