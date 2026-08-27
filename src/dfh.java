import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dfh extends dbu {
   public static final MapCodec<dfh> c = b(dfh::new);
   public static final int d = 15;
   public static final dqi e = dpy.aw;
   public static final dpz f = dhu.b;
   public static final dpz g = dhu.c;
   public static final dpz h = dhu.d;
   public static final dpz i = dhu.e;
   public static final dpz j = dhu.f;
   private static final Map<ij, dpz> k = dhu.h.entrySet().stream().filter($$0 -> $$0.getKey() != ij.a).collect(ac.a());
   private static final etc l = dch.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final etc m = dch.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final etc n = dch.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final etc o = dch.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final etc F = dch.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dpi, etc> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dch> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dch> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dfh> a() {
      return c;
   }

   public dfh(dph.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dfh::m)));
   }

   private static etc m(dpi $$0) {
      etc $$1 = esz.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = esz.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = esz.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = esz.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = esz.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dcj.a.n();
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dpi a(cux $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dpi b(cym $$0, id $$1) {
      id $$2 = $$1.d();
      dpi $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ij.b)) {
         dpi $$4 = this.n();

         for (ij $$5 : ij.values()) {
            dpz $$6 = k.get($$5);
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
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ij.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.aa().b(czc.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dpi $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ac() && this.a((czg)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  id $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, ij.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(avd.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            id.a $$11 = new id.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((czj)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ac() || !this.a((czg)$$1, $$11))) {
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

   protected boolean a(czg $$0, id $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dpi $$0) {
      return $$0.b(dpy.C) && $$0.c(dpy.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dpi $$0) {
      return $$0.b(dpy.C) && $$0.c(dpy.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(czg $$0, id $$1, int $$2, axt $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dpi $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dch $$8 = $$6.b();
         if ($$8 instanceof dkp) {
            dkp.a($$0, $$1);
         }
      }
   }

   private dpi a(czh $$0, id $$1, int $$2) {
      dpi $$3 = a($$0, $$1);
      return $$3.a(dcj.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cym $$0, id $$1) {
      for (ij $$2 : ij.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(czj $$0, id $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ij $$3 : ij.values()) {
            dpi $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dpi $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(axt $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dch $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dfh $$0 = (dfh)dcj.cr;
      $$0.a(dcj.n, 5, 20);
      $$0.a(dcj.o, 5, 20);
      $$0.a(dcj.p, 5, 20);
      $$0.a(dcj.q, 5, 20);
      $$0.a(dcj.r, 5, 20);
      $$0.a(dcj.s, 5, 20);
      $$0.a(dcj.t, 5, 20);
      $$0.a(dcj.u, 5, 20);
      $$0.a(dcj.v, 5, 20);
      $$0.a(dcj.w, 5, 20);
      $$0.a(dcj.jt, 5, 20);
      $$0.a(dcj.ju, 5, 20);
      $$0.a(dcj.jv, 5, 20);
      $$0.a(dcj.jw, 5, 20);
      $$0.a(dcj.jx, 5, 20);
      $$0.a(dcj.jy, 5, 20);
      $$0.a(dcj.jz, 5, 20);
      $$0.a(dcj.jA, 5, 20);
      $$0.a(dcj.jB, 5, 20);
      $$0.a(dcj.jC, 5, 20);
      $$0.a(dcj.fh, 5, 20);
      $$0.a(dcj.jV, 5, 20);
      $$0.a(dcj.jW, 5, 20);
      $$0.a(dcj.jX, 5, 20);
      $$0.a(dcj.jY, 5, 20);
      $$0.a(dcj.jZ, 5, 20);
      $$0.a(dcj.ka, 5, 20);
      $$0.a(dcj.kb, 5, 20);
      $$0.a(dcj.kc, 5, 20);
      $$0.a(dcj.dU, 5, 20);
      $$0.a(dcj.kd, 5, 20);
      $$0.a(dcj.ke, 5, 20);
      $$0.a(dcj.kf, 5, 20);
      $$0.a(dcj.kg, 5, 20);
      $$0.a(dcj.kh, 5, 20);
      $$0.a(dcj.ki, 5, 20);
      $$0.a(dcj.kj, 5, 20);
      $$0.a(dcj.kk, 5, 20);
      $$0.a(dcj.cu, 5, 20);
      $$0.a(dcj.fL, 5, 20);
      $$0.a(dcj.fK, 5, 20);
      $$0.a(dcj.fM, 5, 20);
      $$0.a(dcj.hP, 5, 20);
      $$0.a(dcj.hQ, 5, 20);
      $$0.a(dcj.hR, 5, 20);
      $$0.a(dcj.hS, 5, 20);
      $$0.a(dcj.hT, 5, 20);
      $$0.a(dcj.hU, 5, 20);
      $$0.a(dcj.U, 5, 5);
      $$0.a(dcj.V, 5, 5);
      $$0.a(dcj.W, 5, 5);
      $$0.a(dcj.X, 5, 5);
      $$0.a(dcj.Y, 5, 5);
      $$0.a(dcj.Z, 5, 5);
      $$0.a(dcj.aa, 5, 5);
      $$0.a(dcj.ab, 5, 5);
      $$0.a(dcj.ae, 5, 5);
      $$0.a(dcj.al, 5, 5);
      $$0.a(dcj.af, 5, 5);
      $$0.a(dcj.ag, 5, 5);
      $$0.a(dcj.ah, 5, 5);
      $$0.a(dcj.ai, 5, 5);
      $$0.a(dcj.aj, 5, 5);
      $$0.a(dcj.ak, 5, 5);
      $$0.a(dcj.am, 5, 5);
      $$0.a(dcj.an, 5, 5);
      $$0.a(dcj.aw, 5, 5);
      $$0.a(dcj.ax, 5, 5);
      $$0.a(dcj.ay, 5, 5);
      $$0.a(dcj.az, 5, 5);
      $$0.a(dcj.aA, 5, 5);
      $$0.a(dcj.aB, 5, 5);
      $$0.a(dcj.aC, 5, 5);
      $$0.a(dcj.aD, 5, 5);
      $$0.a(dcj.ao, 5, 5);
      $$0.a(dcj.ap, 5, 5);
      $$0.a(dcj.aq, 5, 5);
      $$0.a(dcj.ar, 5, 5);
      $$0.a(dcj.as, 5, 5);
      $$0.a(dcj.at, 5, 5);
      $$0.a(dcj.au, 5, 5);
      $$0.a(dcj.av, 5, 5);
      $$0.a(dcj.ac, 5, 20);
      $$0.a(dcj.aE, 30, 60);
      $$0.a(dcj.aF, 30, 60);
      $$0.a(dcj.aG, 30, 60);
      $$0.a(dcj.aH, 30, 60);
      $$0.a(dcj.aI, 30, 60);
      $$0.a(dcj.aJ, 30, 60);
      $$0.a(dcj.aK, 30, 60);
      $$0.a(dcj.aL, 30, 60);
      $$0.a(dcj.cl, 30, 20);
      $$0.a(dcj.ck, 15, 100);
      $$0.a(dcj.bt, 60, 100);
      $$0.a(dcj.bu, 60, 100);
      $$0.a(dcj.bv, 60, 100);
      $$0.a(dcj.iD, 60, 100);
      $$0.a(dcj.iE, 60, 100);
      $$0.a(dcj.iF, 60, 100);
      $$0.a(dcj.iG, 60, 100);
      $$0.a(dcj.iH, 60, 100);
      $$0.a(dcj.iI, 60, 100);
      $$0.a(dcj.bR, 60, 100);
      $$0.a(dcj.bT, 60, 100);
      $$0.a(dcj.bU, 60, 100);
      $$0.a(dcj.bV, 60, 100);
      $$0.a(dcj.bW, 60, 100);
      $$0.a(dcj.bX, 60, 100);
      $$0.a(dcj.bY, 60, 100);
      $$0.a(dcj.bZ, 60, 100);
      $$0.a(dcj.ca, 60, 100);
      $$0.a(dcj.cb, 60, 100);
      $$0.a(dcj.cc, 60, 100);
      $$0.a(dcj.ce, 60, 100);
      $$0.a(dcj.bS, 60, 100);
      $$0.a(dcj.kC, 60, 100);
      $$0.a(dcj.cd, 60, 100);
      $$0.a(dcj.sB, 60, 100);
      $$0.a(dcj.bA, 30, 60);
      $$0.a(dcj.bB, 30, 60);
      $$0.a(dcj.bC, 30, 60);
      $$0.a(dcj.bD, 30, 60);
      $$0.a(dcj.bE, 30, 60);
      $$0.a(dcj.bF, 30, 60);
      $$0.a(dcj.bG, 30, 60);
      $$0.a(dcj.bH, 30, 60);
      $$0.a(dcj.bI, 30, 60);
      $$0.a(dcj.bJ, 30, 60);
      $$0.a(dcj.bK, 30, 60);
      $$0.a(dcj.bL, 30, 60);
      $$0.a(dcj.bM, 30, 60);
      $$0.a(dcj.bN, 30, 60);
      $$0.a(dcj.bO, 30, 60);
      $$0.a(dcj.bP, 30, 60);
      $$0.a(dcj.ff, 15, 100);
      $$0.a(dcj.iB, 5, 5);
      $$0.a(dcj.ij, 60, 20);
      $$0.a(dcj.pd, 15, 20);
      $$0.a(dcj.ik, 60, 20);
      $$0.a(dcj.il, 60, 20);
      $$0.a(dcj.im, 60, 20);
      $$0.a(dcj.in, 60, 20);
      $$0.a(dcj.io, 60, 20);
      $$0.a(dcj.ip, 60, 20);
      $$0.a(dcj.iq, 60, 20);
      $$0.a(dcj.ir, 60, 20);
      $$0.a(dcj.is, 60, 20);
      $$0.a(dcj.it, 60, 20);
      $$0.a(dcj.iu, 60, 20);
      $$0.a(dcj.iv, 60, 20);
      $$0.a(dcj.iw, 60, 20);
      $$0.a(dcj.ix, 60, 20);
      $$0.a(dcj.iy, 60, 20);
      $$0.a(dcj.iz, 60, 20);
      $$0.a(dcj.me, 30, 60);
      $$0.a(dcj.mZ, 60, 60);
      $$0.a(dcj.nS, 60, 60);
      $$0.a(dcj.oa, 30, 20);
      $$0.a(dcj.pc, 5, 20);
      $$0.a(dcj.oi, 60, 100);
      $$0.a(dcj.pf, 5, 20);
      $$0.a(dcj.pe, 30, 20);
      $$0.a(dcj.aM, 30, 60);
      $$0.a(dcj.aN, 30, 60);
      $$0.a(dcj.sv, 15, 60);
      $$0.a(dcj.sw, 15, 60);
      $$0.a(dcj.sx, 60, 100);
      $$0.a(dcj.sy, 30, 60);
      $$0.a(dcj.sz, 30, 60);
      $$0.a(dcj.sD, 60, 100);
      $$0.a(dcj.sE, 60, 100);
      $$0.a(dcj.sF, 60, 100);
      $$0.a(dcj.sG, 30, 60);
      $$0.a(dcj.fg, 15, 100);
   }
}
