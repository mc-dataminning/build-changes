import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dli extends dhw {
   public static final MapCodec<dli> c = b(dli::new);
   public static final int d = 15;
   public static final dwn e = dwe.aw;
   public static final dwf f = dnw.b;
   public static final dwf g = dnw.c;
   public static final dwf h = dnw.d;
   public static final dwf i = dnw.e;
   public static final dwf j = dnw.f;
   private static final Map<jm, dwf> k = dnw.h.entrySet().stream().filter($$0 -> $$0.getKey() != jm.a).collect(ae.a());
   private static final fal l = dij.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fal m = dij.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fal n = dij.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fal o = dij.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fal G = dij.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dvo, fal> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<dij> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<dij> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dli> a() {
      return c;
   }

   public dli(dvn.d $$0) {
      super($$0, 1.0F);
      this.l(
         this.F
            .b()
            .b(e, Integer.valueOf(0))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
            .b(i, Boolean.valueOf(false))
            .b(j, Boolean.valueOf(false))
      );
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dli::o)));
   }

   private static fal o(dvo $$0) {
      fal $$1 = fai.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = fai.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = fai.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = fai.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = fai.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(e)) : dil.a.m();
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dvo a(czw $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dvo b(dek $$0, jh $$1) {
      jh $$2 = $$1.e();
      dvo $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jm.b)) {
         dvo $$4 = this.m();

         for (jm $$5 : jm.values()) {
            dwf $$6 = k.get($$5);
            if ($$6 != null) {
               $$4 = $$4.b($$6, Boolean.valueOf(this.g($$0.a_($$1.a($$5)))));
            }
         }

         return $$4;
      } else {
         return this.m();
      }
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.ac().b(dfb.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dvo $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ae() && this.a((dff)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.b(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  jh $$8 = $$2.e();
                  if (!$$1.a_($$8).c($$1, $$8, jm.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(axc.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            jh.a $$11 = new jh.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dfi)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ae() || !this.a((dff)$$1, $$11))) {
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

   protected boolean a(dff $$0, jh $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dvo $$0) {
      return $$0.b(dwe.C) && $$0.c(dwe.C) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dvo $$0) {
      return $$0.b(dwe.C) && $$0.c(dwe.C) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dff $$0, jh $$1, int $$2, azv $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dvo $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dij $$8 = $$6.b();
         if ($$8 instanceof dqs) {
            dqs.a($$0, $$1);
         }
      }
   }

   private dvo a(dfi $$0, jh $$1, int $$2) {
      dvo $$3 = a((dek)$$0, $$1);
      return $$3.a(dil.cr) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dek $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dfi $$0, jh $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jm $$3 : jm.values()) {
            dvo $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dvo $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azv $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dij $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dli $$0 = (dli)dil.cr;
      $$0.a(dil.n, 5, 20);
      $$0.a(dil.o, 5, 20);
      $$0.a(dil.p, 5, 20);
      $$0.a(dil.q, 5, 20);
      $$0.a(dil.r, 5, 20);
      $$0.a(dil.s, 5, 20);
      $$0.a(dil.t, 5, 20);
      $$0.a(dil.u, 5, 20);
      $$0.a(dil.v, 5, 20);
      $$0.a(dil.w, 5, 20);
      $$0.a(dil.jt, 5, 20);
      $$0.a(dil.ju, 5, 20);
      $$0.a(dil.jv, 5, 20);
      $$0.a(dil.jw, 5, 20);
      $$0.a(dil.jx, 5, 20);
      $$0.a(dil.jy, 5, 20);
      $$0.a(dil.jz, 5, 20);
      $$0.a(dil.jA, 5, 20);
      $$0.a(dil.jB, 5, 20);
      $$0.a(dil.jC, 5, 20);
      $$0.a(dil.fh, 5, 20);
      $$0.a(dil.jV, 5, 20);
      $$0.a(dil.jW, 5, 20);
      $$0.a(dil.jX, 5, 20);
      $$0.a(dil.jY, 5, 20);
      $$0.a(dil.jZ, 5, 20);
      $$0.a(dil.ka, 5, 20);
      $$0.a(dil.kb, 5, 20);
      $$0.a(dil.kc, 5, 20);
      $$0.a(dil.dU, 5, 20);
      $$0.a(dil.kd, 5, 20);
      $$0.a(dil.ke, 5, 20);
      $$0.a(dil.kf, 5, 20);
      $$0.a(dil.kg, 5, 20);
      $$0.a(dil.kh, 5, 20);
      $$0.a(dil.ki, 5, 20);
      $$0.a(dil.kj, 5, 20);
      $$0.a(dil.kk, 5, 20);
      $$0.a(dil.cu, 5, 20);
      $$0.a(dil.fL, 5, 20);
      $$0.a(dil.fK, 5, 20);
      $$0.a(dil.fM, 5, 20);
      $$0.a(dil.hP, 5, 20);
      $$0.a(dil.hQ, 5, 20);
      $$0.a(dil.hR, 5, 20);
      $$0.a(dil.hS, 5, 20);
      $$0.a(dil.hT, 5, 20);
      $$0.a(dil.hU, 5, 20);
      $$0.a(dil.U, 5, 5);
      $$0.a(dil.V, 5, 5);
      $$0.a(dil.W, 5, 5);
      $$0.a(dil.X, 5, 5);
      $$0.a(dil.Y, 5, 5);
      $$0.a(dil.Z, 5, 5);
      $$0.a(dil.aa, 5, 5);
      $$0.a(dil.ab, 5, 5);
      $$0.a(dil.ae, 5, 5);
      $$0.a(dil.al, 5, 5);
      $$0.a(dil.af, 5, 5);
      $$0.a(dil.ag, 5, 5);
      $$0.a(dil.ah, 5, 5);
      $$0.a(dil.ai, 5, 5);
      $$0.a(dil.aj, 5, 5);
      $$0.a(dil.ak, 5, 5);
      $$0.a(dil.am, 5, 5);
      $$0.a(dil.an, 5, 5);
      $$0.a(dil.aw, 5, 5);
      $$0.a(dil.ax, 5, 5);
      $$0.a(dil.ay, 5, 5);
      $$0.a(dil.az, 5, 5);
      $$0.a(dil.aA, 5, 5);
      $$0.a(dil.aB, 5, 5);
      $$0.a(dil.aC, 5, 5);
      $$0.a(dil.aD, 5, 5);
      $$0.a(dil.ao, 5, 5);
      $$0.a(dil.ap, 5, 5);
      $$0.a(dil.aq, 5, 5);
      $$0.a(dil.ar, 5, 5);
      $$0.a(dil.as, 5, 5);
      $$0.a(dil.at, 5, 5);
      $$0.a(dil.au, 5, 5);
      $$0.a(dil.av, 5, 5);
      $$0.a(dil.ac, 5, 20);
      $$0.a(dil.aE, 30, 60);
      $$0.a(dil.aF, 30, 60);
      $$0.a(dil.aG, 30, 60);
      $$0.a(dil.aH, 30, 60);
      $$0.a(dil.aI, 30, 60);
      $$0.a(dil.aJ, 30, 60);
      $$0.a(dil.aK, 30, 60);
      $$0.a(dil.aL, 30, 60);
      $$0.a(dil.cl, 30, 20);
      $$0.a(dil.ck, 15, 100);
      $$0.a(dil.bt, 60, 100);
      $$0.a(dil.bu, 60, 100);
      $$0.a(dil.bv, 60, 100);
      $$0.a(dil.iD, 60, 100);
      $$0.a(dil.iE, 60, 100);
      $$0.a(dil.iF, 60, 100);
      $$0.a(dil.iG, 60, 100);
      $$0.a(dil.iH, 60, 100);
      $$0.a(dil.iI, 60, 100);
      $$0.a(dil.bR, 60, 100);
      $$0.a(dil.bT, 60, 100);
      $$0.a(dil.bU, 60, 100);
      $$0.a(dil.bV, 60, 100);
      $$0.a(dil.bW, 60, 100);
      $$0.a(dil.bX, 60, 100);
      $$0.a(dil.bY, 60, 100);
      $$0.a(dil.bZ, 60, 100);
      $$0.a(dil.ca, 60, 100);
      $$0.a(dil.cb, 60, 100);
      $$0.a(dil.cc, 60, 100);
      $$0.a(dil.ce, 60, 100);
      $$0.a(dil.bS, 60, 100);
      $$0.a(dil.kC, 60, 100);
      $$0.a(dil.cd, 60, 100);
      $$0.a(dil.sB, 60, 100);
      $$0.a(dil.bA, 30, 60);
      $$0.a(dil.bB, 30, 60);
      $$0.a(dil.bC, 30, 60);
      $$0.a(dil.bD, 30, 60);
      $$0.a(dil.bE, 30, 60);
      $$0.a(dil.bF, 30, 60);
      $$0.a(dil.bG, 30, 60);
      $$0.a(dil.bH, 30, 60);
      $$0.a(dil.bI, 30, 60);
      $$0.a(dil.bJ, 30, 60);
      $$0.a(dil.bK, 30, 60);
      $$0.a(dil.bL, 30, 60);
      $$0.a(dil.bM, 30, 60);
      $$0.a(dil.bN, 30, 60);
      $$0.a(dil.bO, 30, 60);
      $$0.a(dil.bP, 30, 60);
      $$0.a(dil.ff, 15, 100);
      $$0.a(dil.iB, 5, 5);
      $$0.a(dil.ij, 60, 20);
      $$0.a(dil.pd, 15, 20);
      $$0.a(dil.ik, 60, 20);
      $$0.a(dil.il, 60, 20);
      $$0.a(dil.im, 60, 20);
      $$0.a(dil.in, 60, 20);
      $$0.a(dil.io, 60, 20);
      $$0.a(dil.ip, 60, 20);
      $$0.a(dil.iq, 60, 20);
      $$0.a(dil.ir, 60, 20);
      $$0.a(dil.is, 60, 20);
      $$0.a(dil.it, 60, 20);
      $$0.a(dil.iu, 60, 20);
      $$0.a(dil.iv, 60, 20);
      $$0.a(dil.iw, 60, 20);
      $$0.a(dil.ix, 60, 20);
      $$0.a(dil.iy, 60, 20);
      $$0.a(dil.iz, 60, 20);
      $$0.a(dil.me, 30, 60);
      $$0.a(dil.mZ, 60, 60);
      $$0.a(dil.nS, 60, 60);
      $$0.a(dil.oa, 30, 20);
      $$0.a(dil.pc, 5, 20);
      $$0.a(dil.oi, 60, 100);
      $$0.a(dil.pf, 5, 20);
      $$0.a(dil.pe, 30, 20);
      $$0.a(dil.aM, 30, 60);
      $$0.a(dil.aN, 30, 60);
      $$0.a(dil.sv, 15, 60);
      $$0.a(dil.sw, 15, 60);
      $$0.a(dil.sx, 60, 100);
      $$0.a(dil.sy, 30, 60);
      $$0.a(dil.sz, 30, 60);
      $$0.a(dil.sD, 60, 100);
      $$0.a(dil.sE, 60, 100);
      $$0.a(dil.sF, 60, 100);
      $$0.a(dil.sG, 30, 60);
      $$0.a(dil.fg, 15, 100);
   }
}
