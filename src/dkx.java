import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dkx extends dhl {
   public static final MapCodec<dkx> c = b(dkx::new);
   public static final int d = 15;
   public static final dwd e = dvt.aw;
   public static final dvu f = dnl.b;
   public static final dvu g = dnl.c;
   public static final dvu h = dnl.d;
   public static final dvu i = dnl.e;
   public static final dvu j = dnl.f;
   private static final Map<jl, dvu> k = dnl.h.entrySet().stream().filter($$0 -> $$0.getKey() != jl.a).collect(ad.a());
   private static final fab l = dhy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fab m = dhy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fab n = dhy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fab o = dhy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fab G = dhy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dvd, fab> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<dhy> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<dhy> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dkx> a() {
      return c;
   }

   public dkx(dvc.d $$0) {
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
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dkx::o)));
   }

   private static fab o(dvd $$0) {
      fab $$1 = ezy.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ezy.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ezy.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = ezy.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ezy.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dia.a.m();
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dvd a(czm $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dvd b(dea $$0, jg $$1) {
      jg $$2 = $$1.e();
      dvd $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jl.b)) {
         dvd $$4 = this.m();

         for (jl $$5 : jl.values()) {
            dvu $$6 = k.get($$5);
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
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jl.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.ac().b(der.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dvd $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ae() && this.a((dev)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.b(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  jg $$8 = $$2.e();
                  if (!$$1.a_($$8).c($$1, $$8, jl.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(awy.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            jg.a $$11 = new jg.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dey)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.am().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ae() || !this.a((dev)$$1, $$11))) {
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

   protected boolean a(dev $$0, jg $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dvd $$0) {
      return $$0.b(dvt.C) && $$0.c(dvt.C) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dvd $$0) {
      return $$0.b(dvt.C) && $$0.c(dvt.C) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dev $$0, jg $$1, int $$2, azr $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dvd $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dhy $$8 = $$6.b();
         if ($$8 instanceof dqh) {
            dqh.a($$0, $$1);
         }
      }
   }

   private dvd a(dew $$0, jg $$1, int $$2) {
      dvd $$3 = a($$0, $$1);
      return $$3.a(dia.cr) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dea $$0, jg $$1) {
      for (jl $$2 : jl.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dey $$0, jg $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jl $$3 : jl.values()) {
            dvd $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dvd $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azr $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dhy $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dkx $$0 = (dkx)dia.cr;
      $$0.a(dia.n, 5, 20);
      $$0.a(dia.o, 5, 20);
      $$0.a(dia.p, 5, 20);
      $$0.a(dia.q, 5, 20);
      $$0.a(dia.r, 5, 20);
      $$0.a(dia.s, 5, 20);
      $$0.a(dia.t, 5, 20);
      $$0.a(dia.u, 5, 20);
      $$0.a(dia.v, 5, 20);
      $$0.a(dia.w, 5, 20);
      $$0.a(dia.jt, 5, 20);
      $$0.a(dia.ju, 5, 20);
      $$0.a(dia.jv, 5, 20);
      $$0.a(dia.jw, 5, 20);
      $$0.a(dia.jx, 5, 20);
      $$0.a(dia.jy, 5, 20);
      $$0.a(dia.jz, 5, 20);
      $$0.a(dia.jA, 5, 20);
      $$0.a(dia.jB, 5, 20);
      $$0.a(dia.jC, 5, 20);
      $$0.a(dia.fh, 5, 20);
      $$0.a(dia.jV, 5, 20);
      $$0.a(dia.jW, 5, 20);
      $$0.a(dia.jX, 5, 20);
      $$0.a(dia.jY, 5, 20);
      $$0.a(dia.jZ, 5, 20);
      $$0.a(dia.ka, 5, 20);
      $$0.a(dia.kb, 5, 20);
      $$0.a(dia.kc, 5, 20);
      $$0.a(dia.dU, 5, 20);
      $$0.a(dia.kd, 5, 20);
      $$0.a(dia.ke, 5, 20);
      $$0.a(dia.kf, 5, 20);
      $$0.a(dia.kg, 5, 20);
      $$0.a(dia.kh, 5, 20);
      $$0.a(dia.ki, 5, 20);
      $$0.a(dia.kj, 5, 20);
      $$0.a(dia.kk, 5, 20);
      $$0.a(dia.cu, 5, 20);
      $$0.a(dia.fL, 5, 20);
      $$0.a(dia.fK, 5, 20);
      $$0.a(dia.fM, 5, 20);
      $$0.a(dia.hP, 5, 20);
      $$0.a(dia.hQ, 5, 20);
      $$0.a(dia.hR, 5, 20);
      $$0.a(dia.hS, 5, 20);
      $$0.a(dia.hT, 5, 20);
      $$0.a(dia.hU, 5, 20);
      $$0.a(dia.U, 5, 5);
      $$0.a(dia.V, 5, 5);
      $$0.a(dia.W, 5, 5);
      $$0.a(dia.X, 5, 5);
      $$0.a(dia.Y, 5, 5);
      $$0.a(dia.Z, 5, 5);
      $$0.a(dia.aa, 5, 5);
      $$0.a(dia.ab, 5, 5);
      $$0.a(dia.ae, 5, 5);
      $$0.a(dia.al, 5, 5);
      $$0.a(dia.af, 5, 5);
      $$0.a(dia.ag, 5, 5);
      $$0.a(dia.ah, 5, 5);
      $$0.a(dia.ai, 5, 5);
      $$0.a(dia.aj, 5, 5);
      $$0.a(dia.ak, 5, 5);
      $$0.a(dia.am, 5, 5);
      $$0.a(dia.an, 5, 5);
      $$0.a(dia.aw, 5, 5);
      $$0.a(dia.ax, 5, 5);
      $$0.a(dia.ay, 5, 5);
      $$0.a(dia.az, 5, 5);
      $$0.a(dia.aA, 5, 5);
      $$0.a(dia.aB, 5, 5);
      $$0.a(dia.aC, 5, 5);
      $$0.a(dia.aD, 5, 5);
      $$0.a(dia.ao, 5, 5);
      $$0.a(dia.ap, 5, 5);
      $$0.a(dia.aq, 5, 5);
      $$0.a(dia.ar, 5, 5);
      $$0.a(dia.as, 5, 5);
      $$0.a(dia.at, 5, 5);
      $$0.a(dia.au, 5, 5);
      $$0.a(dia.av, 5, 5);
      $$0.a(dia.ac, 5, 20);
      $$0.a(dia.aE, 30, 60);
      $$0.a(dia.aF, 30, 60);
      $$0.a(dia.aG, 30, 60);
      $$0.a(dia.aH, 30, 60);
      $$0.a(dia.aI, 30, 60);
      $$0.a(dia.aJ, 30, 60);
      $$0.a(dia.aK, 30, 60);
      $$0.a(dia.aL, 30, 60);
      $$0.a(dia.cl, 30, 20);
      $$0.a(dia.ck, 15, 100);
      $$0.a(dia.bt, 60, 100);
      $$0.a(dia.bu, 60, 100);
      $$0.a(dia.bv, 60, 100);
      $$0.a(dia.iD, 60, 100);
      $$0.a(dia.iE, 60, 100);
      $$0.a(dia.iF, 60, 100);
      $$0.a(dia.iG, 60, 100);
      $$0.a(dia.iH, 60, 100);
      $$0.a(dia.iI, 60, 100);
      $$0.a(dia.bR, 60, 100);
      $$0.a(dia.bT, 60, 100);
      $$0.a(dia.bU, 60, 100);
      $$0.a(dia.bV, 60, 100);
      $$0.a(dia.bW, 60, 100);
      $$0.a(dia.bX, 60, 100);
      $$0.a(dia.bY, 60, 100);
      $$0.a(dia.bZ, 60, 100);
      $$0.a(dia.ca, 60, 100);
      $$0.a(dia.cb, 60, 100);
      $$0.a(dia.cc, 60, 100);
      $$0.a(dia.ce, 60, 100);
      $$0.a(dia.bS, 60, 100);
      $$0.a(dia.kC, 60, 100);
      $$0.a(dia.cd, 60, 100);
      $$0.a(dia.sB, 60, 100);
      $$0.a(dia.bA, 30, 60);
      $$0.a(dia.bB, 30, 60);
      $$0.a(dia.bC, 30, 60);
      $$0.a(dia.bD, 30, 60);
      $$0.a(dia.bE, 30, 60);
      $$0.a(dia.bF, 30, 60);
      $$0.a(dia.bG, 30, 60);
      $$0.a(dia.bH, 30, 60);
      $$0.a(dia.bI, 30, 60);
      $$0.a(dia.bJ, 30, 60);
      $$0.a(dia.bK, 30, 60);
      $$0.a(dia.bL, 30, 60);
      $$0.a(dia.bM, 30, 60);
      $$0.a(dia.bN, 30, 60);
      $$0.a(dia.bO, 30, 60);
      $$0.a(dia.bP, 30, 60);
      $$0.a(dia.ff, 15, 100);
      $$0.a(dia.iB, 5, 5);
      $$0.a(dia.ij, 60, 20);
      $$0.a(dia.pd, 15, 20);
      $$0.a(dia.ik, 60, 20);
      $$0.a(dia.il, 60, 20);
      $$0.a(dia.im, 60, 20);
      $$0.a(dia.in, 60, 20);
      $$0.a(dia.io, 60, 20);
      $$0.a(dia.ip, 60, 20);
      $$0.a(dia.iq, 60, 20);
      $$0.a(dia.ir, 60, 20);
      $$0.a(dia.is, 60, 20);
      $$0.a(dia.it, 60, 20);
      $$0.a(dia.iu, 60, 20);
      $$0.a(dia.iv, 60, 20);
      $$0.a(dia.iw, 60, 20);
      $$0.a(dia.ix, 60, 20);
      $$0.a(dia.iy, 60, 20);
      $$0.a(dia.iz, 60, 20);
      $$0.a(dia.me, 30, 60);
      $$0.a(dia.mZ, 60, 60);
      $$0.a(dia.nS, 60, 60);
      $$0.a(dia.oa, 30, 20);
      $$0.a(dia.pc, 5, 20);
      $$0.a(dia.oi, 60, 100);
      $$0.a(dia.pf, 5, 20);
      $$0.a(dia.pe, 30, 20);
      $$0.a(dia.aM, 30, 60);
      $$0.a(dia.aN, 30, 60);
      $$0.a(dia.sv, 15, 60);
      $$0.a(dia.sw, 15, 60);
      $$0.a(dia.sx, 60, 100);
      $$0.a(dia.sy, 30, 60);
      $$0.a(dia.sz, 30, 60);
      $$0.a(dia.sD, 60, 100);
      $$0.a(dia.sE, 60, 100);
      $$0.a(dia.sF, 60, 100);
      $$0.a(dia.sG, 30, 60);
      $$0.a(dia.fg, 15, 100);
   }
}
