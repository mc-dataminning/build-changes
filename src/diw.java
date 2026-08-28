import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class diw extends dfj {
   public static final MapCodec<diw> c = b(diw::new);
   public static final int d = 15;
   public static final dua e = dtq.aw;
   public static final dtr f = dlk.b;
   public static final dtr g = dlk.c;
   public static final dtr h = dlk.d;
   public static final dtr i = dlk.e;
   public static final dtr j = dlk.f;
   private static final Map<ji, dtr> k = dlk.h.entrySet().stream().filter($$0 -> $$0.getKey() != ji.a).collect(ad.a());
   private static final exp l = dfw.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final exp m = dfw.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final exp n = dfw.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final exp o = dfw.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final exp F = dfw.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dta, exp> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dfw> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dfw> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<diw> a() {
      return c;
   }

   public diw(dsz.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), diw::m)));
   }

   private static exp m(dta $$0) {
      exp $$1 = exm.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = exm.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = exm.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = exm.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = exm.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dfy.a.o();
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dta a(cyb $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dta b(dca $$0, jd $$1) {
      jd $$2 = $$1.d();
      dta $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ji.b)) {
         dta $$4 = this.o();

         for (ji $$5 : ji.values()) {
            dtr $$6 = k.get($$5);
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
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ji.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ab().b(dcq.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dta $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ad() && this.a((dcu)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  jd $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, ji.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(awc.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            jd.a $$11 = new jd.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dcx)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ad() || !this.a((dcu)$$1, $$11))) {
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

   protected boolean a(dcu $$0, jd $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dta $$0) {
      return $$0.b(dtq.C) && $$0.c(dtq.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dta $$0) {
      return $$0.b(dtq.C) && $$0.c(dtq.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dcu $$0, jd $$1, int $$2, ayv $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dta $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dfw $$8 = $$6.b();
         if ($$8 instanceof dog) {
            dog.a($$0, $$1);
         }
      }
   }

   private dta a(dcv $$0, jd $$1, int $$2) {
      dta $$3 = a($$0, $$1);
      return $$3.a(dfy.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dca $$0, jd $$1) {
      for (ji $$2 : ji.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dcx $$0, jd $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ji $$3 : ji.values()) {
            dta $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dta $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(ayv $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dfw $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      diw $$0 = (diw)dfy.cr;
      $$0.a(dfy.n, 5, 20);
      $$0.a(dfy.o, 5, 20);
      $$0.a(dfy.p, 5, 20);
      $$0.a(dfy.q, 5, 20);
      $$0.a(dfy.r, 5, 20);
      $$0.a(dfy.s, 5, 20);
      $$0.a(dfy.t, 5, 20);
      $$0.a(dfy.u, 5, 20);
      $$0.a(dfy.v, 5, 20);
      $$0.a(dfy.w, 5, 20);
      $$0.a(dfy.jt, 5, 20);
      $$0.a(dfy.ju, 5, 20);
      $$0.a(dfy.jv, 5, 20);
      $$0.a(dfy.jw, 5, 20);
      $$0.a(dfy.jx, 5, 20);
      $$0.a(dfy.jy, 5, 20);
      $$0.a(dfy.jz, 5, 20);
      $$0.a(dfy.jA, 5, 20);
      $$0.a(dfy.jB, 5, 20);
      $$0.a(dfy.jC, 5, 20);
      $$0.a(dfy.fh, 5, 20);
      $$0.a(dfy.jV, 5, 20);
      $$0.a(dfy.jW, 5, 20);
      $$0.a(dfy.jX, 5, 20);
      $$0.a(dfy.jY, 5, 20);
      $$0.a(dfy.jZ, 5, 20);
      $$0.a(dfy.ka, 5, 20);
      $$0.a(dfy.kb, 5, 20);
      $$0.a(dfy.kc, 5, 20);
      $$0.a(dfy.dU, 5, 20);
      $$0.a(dfy.kd, 5, 20);
      $$0.a(dfy.ke, 5, 20);
      $$0.a(dfy.kf, 5, 20);
      $$0.a(dfy.kg, 5, 20);
      $$0.a(dfy.kh, 5, 20);
      $$0.a(dfy.ki, 5, 20);
      $$0.a(dfy.kj, 5, 20);
      $$0.a(dfy.kk, 5, 20);
      $$0.a(dfy.cu, 5, 20);
      $$0.a(dfy.fL, 5, 20);
      $$0.a(dfy.fK, 5, 20);
      $$0.a(dfy.fM, 5, 20);
      $$0.a(dfy.hP, 5, 20);
      $$0.a(dfy.hQ, 5, 20);
      $$0.a(dfy.hR, 5, 20);
      $$0.a(dfy.hS, 5, 20);
      $$0.a(dfy.hT, 5, 20);
      $$0.a(dfy.hU, 5, 20);
      $$0.a(dfy.U, 5, 5);
      $$0.a(dfy.V, 5, 5);
      $$0.a(dfy.W, 5, 5);
      $$0.a(dfy.X, 5, 5);
      $$0.a(dfy.Y, 5, 5);
      $$0.a(dfy.Z, 5, 5);
      $$0.a(dfy.aa, 5, 5);
      $$0.a(dfy.ab, 5, 5);
      $$0.a(dfy.ae, 5, 5);
      $$0.a(dfy.al, 5, 5);
      $$0.a(dfy.af, 5, 5);
      $$0.a(dfy.ag, 5, 5);
      $$0.a(dfy.ah, 5, 5);
      $$0.a(dfy.ai, 5, 5);
      $$0.a(dfy.aj, 5, 5);
      $$0.a(dfy.ak, 5, 5);
      $$0.a(dfy.am, 5, 5);
      $$0.a(dfy.an, 5, 5);
      $$0.a(dfy.aw, 5, 5);
      $$0.a(dfy.ax, 5, 5);
      $$0.a(dfy.ay, 5, 5);
      $$0.a(dfy.az, 5, 5);
      $$0.a(dfy.aA, 5, 5);
      $$0.a(dfy.aB, 5, 5);
      $$0.a(dfy.aC, 5, 5);
      $$0.a(dfy.aD, 5, 5);
      $$0.a(dfy.ao, 5, 5);
      $$0.a(dfy.ap, 5, 5);
      $$0.a(dfy.aq, 5, 5);
      $$0.a(dfy.ar, 5, 5);
      $$0.a(dfy.as, 5, 5);
      $$0.a(dfy.at, 5, 5);
      $$0.a(dfy.au, 5, 5);
      $$0.a(dfy.av, 5, 5);
      $$0.a(dfy.ac, 5, 20);
      $$0.a(dfy.aE, 30, 60);
      $$0.a(dfy.aF, 30, 60);
      $$0.a(dfy.aG, 30, 60);
      $$0.a(dfy.aH, 30, 60);
      $$0.a(dfy.aI, 30, 60);
      $$0.a(dfy.aJ, 30, 60);
      $$0.a(dfy.aK, 30, 60);
      $$0.a(dfy.aL, 30, 60);
      $$0.a(dfy.cl, 30, 20);
      $$0.a(dfy.ck, 15, 100);
      $$0.a(dfy.bt, 60, 100);
      $$0.a(dfy.bu, 60, 100);
      $$0.a(dfy.bv, 60, 100);
      $$0.a(dfy.iD, 60, 100);
      $$0.a(dfy.iE, 60, 100);
      $$0.a(dfy.iF, 60, 100);
      $$0.a(dfy.iG, 60, 100);
      $$0.a(dfy.iH, 60, 100);
      $$0.a(dfy.iI, 60, 100);
      $$0.a(dfy.bR, 60, 100);
      $$0.a(dfy.bT, 60, 100);
      $$0.a(dfy.bU, 60, 100);
      $$0.a(dfy.bV, 60, 100);
      $$0.a(dfy.bW, 60, 100);
      $$0.a(dfy.bX, 60, 100);
      $$0.a(dfy.bY, 60, 100);
      $$0.a(dfy.bZ, 60, 100);
      $$0.a(dfy.ca, 60, 100);
      $$0.a(dfy.cb, 60, 100);
      $$0.a(dfy.cc, 60, 100);
      $$0.a(dfy.ce, 60, 100);
      $$0.a(dfy.bS, 60, 100);
      $$0.a(dfy.kC, 60, 100);
      $$0.a(dfy.cd, 60, 100);
      $$0.a(dfy.sB, 60, 100);
      $$0.a(dfy.bA, 30, 60);
      $$0.a(dfy.bB, 30, 60);
      $$0.a(dfy.bC, 30, 60);
      $$0.a(dfy.bD, 30, 60);
      $$0.a(dfy.bE, 30, 60);
      $$0.a(dfy.bF, 30, 60);
      $$0.a(dfy.bG, 30, 60);
      $$0.a(dfy.bH, 30, 60);
      $$0.a(dfy.bI, 30, 60);
      $$0.a(dfy.bJ, 30, 60);
      $$0.a(dfy.bK, 30, 60);
      $$0.a(dfy.bL, 30, 60);
      $$0.a(dfy.bM, 30, 60);
      $$0.a(dfy.bN, 30, 60);
      $$0.a(dfy.bO, 30, 60);
      $$0.a(dfy.bP, 30, 60);
      $$0.a(dfy.ff, 15, 100);
      $$0.a(dfy.iB, 5, 5);
      $$0.a(dfy.ij, 60, 20);
      $$0.a(dfy.pd, 15, 20);
      $$0.a(dfy.ik, 60, 20);
      $$0.a(dfy.il, 60, 20);
      $$0.a(dfy.im, 60, 20);
      $$0.a(dfy.in, 60, 20);
      $$0.a(dfy.io, 60, 20);
      $$0.a(dfy.ip, 60, 20);
      $$0.a(dfy.iq, 60, 20);
      $$0.a(dfy.ir, 60, 20);
      $$0.a(dfy.is, 60, 20);
      $$0.a(dfy.it, 60, 20);
      $$0.a(dfy.iu, 60, 20);
      $$0.a(dfy.iv, 60, 20);
      $$0.a(dfy.iw, 60, 20);
      $$0.a(dfy.ix, 60, 20);
      $$0.a(dfy.iy, 60, 20);
      $$0.a(dfy.iz, 60, 20);
      $$0.a(dfy.me, 30, 60);
      $$0.a(dfy.mZ, 60, 60);
      $$0.a(dfy.nS, 60, 60);
      $$0.a(dfy.oa, 30, 20);
      $$0.a(dfy.pc, 5, 20);
      $$0.a(dfy.oi, 60, 100);
      $$0.a(dfy.pf, 5, 20);
      $$0.a(dfy.pe, 30, 20);
      $$0.a(dfy.aM, 30, 60);
      $$0.a(dfy.aN, 30, 60);
      $$0.a(dfy.sv, 15, 60);
      $$0.a(dfy.sw, 15, 60);
      $$0.a(dfy.sx, 60, 100);
      $$0.a(dfy.sy, 30, 60);
      $$0.a(dfy.sz, 30, 60);
      $$0.a(dfy.sD, 60, 100);
      $$0.a(dfy.sE, 60, 100);
      $$0.a(dfy.sF, 60, 100);
      $$0.a(dfy.sG, 30, 60);
      $$0.a(dfy.fg, 15, 100);
   }
}
