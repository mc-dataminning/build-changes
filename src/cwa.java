import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cwa extends csp {
   public static final MapCodec<cwa> c = b(cwa::new);
   public static final int d = 15;
   public static final dgd e = dft.aw;
   public static final dfu f = cyo.b;
   public static final dfu g = cyo.c;
   public static final dfu h = cyo.d;
   public static final dfu i = cyo.e;
   public static final dfu j = cyo.f;
   private static final Map<ha, dfu> k = cyo.h.entrySet().stream().filter($$0 -> $$0.getKey() != ha.a).collect(ac.a());
   private static final eia l = ctc.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eia m = ctc.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eia n = ctc.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eia o = ctc.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eia F = ctc.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dfd, eia> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<ctc> P = new Object2IntOpenHashMap();
   private final Object2IntMap<ctc> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<cwa> a() {
      return c;
   }

   public cwa(dfc.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), cwa::h)));
   }

   private static eia h(dfd $$0) {
      eia $$1 = ehx.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ehx.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ehx.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ehx.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ehx.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : cte.a.o();
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dfd a(clt $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dfd b(cph $$0, gw $$1) {
      gw $$2 = $$1.d();
      dfd $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ha.b)) {
         dfd $$4 = this.o();

         for (ha $$5 : ha.values()) {
            dfu $$6 = k.get($$5);
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
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ha.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.X().b(cpx.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dfd $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.C_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.Z() && this.a((cqb)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  gw $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, ha.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.s($$2).a(apu.ac);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            gw.a $$11 = new gw.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((cqe)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ai().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.Z() || !this.a((cqb)$$1, $$11))) {
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

   protected boolean a(cqb $$0, gw $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dfd $$0) {
      return $$0.b(dft.C) && $$0.c(dft.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dfd $$0) {
      return $$0.b(dft.C) && $$0.c(dft.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(cqb $$0, gw $$1, int $$2, ash $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dfd $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         ctc $$8 = $$6.b();
         if ($$8 instanceof dbj) {
            dbj.a($$0, $$1);
         }
      }
   }

   private dfd a(cqc $$0, gw $$1, int $$2) {
      dfd $$3 = a($$0, $$1);
      return $$3.a(cte.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cph $$0, gw $$1) {
      for (ha $$2 : ha.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cqe $$0, gw $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ha $$3 : ha.values()) {
            dfd $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dfd $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(ash $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   private void a(ctc $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      cwa $$0 = (cwa)cte.cr;
      $$0.a(cte.n, 5, 20);
      $$0.a(cte.o, 5, 20);
      $$0.a(cte.p, 5, 20);
      $$0.a(cte.q, 5, 20);
      $$0.a(cte.r, 5, 20);
      $$0.a(cte.s, 5, 20);
      $$0.a(cte.t, 5, 20);
      $$0.a(cte.u, 5, 20);
      $$0.a(cte.v, 5, 20);
      $$0.a(cte.w, 5, 20);
      $$0.a(cte.jt, 5, 20);
      $$0.a(cte.ju, 5, 20);
      $$0.a(cte.jv, 5, 20);
      $$0.a(cte.jw, 5, 20);
      $$0.a(cte.jx, 5, 20);
      $$0.a(cte.jy, 5, 20);
      $$0.a(cte.jz, 5, 20);
      $$0.a(cte.jA, 5, 20);
      $$0.a(cte.jB, 5, 20);
      $$0.a(cte.jC, 5, 20);
      $$0.a(cte.fh, 5, 20);
      $$0.a(cte.jV, 5, 20);
      $$0.a(cte.jW, 5, 20);
      $$0.a(cte.jX, 5, 20);
      $$0.a(cte.jY, 5, 20);
      $$0.a(cte.jZ, 5, 20);
      $$0.a(cte.ka, 5, 20);
      $$0.a(cte.kb, 5, 20);
      $$0.a(cte.kc, 5, 20);
      $$0.a(cte.dU, 5, 20);
      $$0.a(cte.kd, 5, 20);
      $$0.a(cte.ke, 5, 20);
      $$0.a(cte.kf, 5, 20);
      $$0.a(cte.kg, 5, 20);
      $$0.a(cte.kh, 5, 20);
      $$0.a(cte.ki, 5, 20);
      $$0.a(cte.kj, 5, 20);
      $$0.a(cte.kk, 5, 20);
      $$0.a(cte.cu, 5, 20);
      $$0.a(cte.fL, 5, 20);
      $$0.a(cte.fK, 5, 20);
      $$0.a(cte.fM, 5, 20);
      $$0.a(cte.hP, 5, 20);
      $$0.a(cte.hQ, 5, 20);
      $$0.a(cte.hR, 5, 20);
      $$0.a(cte.hS, 5, 20);
      $$0.a(cte.hT, 5, 20);
      $$0.a(cte.hU, 5, 20);
      $$0.a(cte.U, 5, 5);
      $$0.a(cte.V, 5, 5);
      $$0.a(cte.W, 5, 5);
      $$0.a(cte.X, 5, 5);
      $$0.a(cte.Y, 5, 5);
      $$0.a(cte.Z, 5, 5);
      $$0.a(cte.aa, 5, 5);
      $$0.a(cte.ab, 5, 5);
      $$0.a(cte.ae, 5, 5);
      $$0.a(cte.al, 5, 5);
      $$0.a(cte.af, 5, 5);
      $$0.a(cte.ag, 5, 5);
      $$0.a(cte.ah, 5, 5);
      $$0.a(cte.ai, 5, 5);
      $$0.a(cte.aj, 5, 5);
      $$0.a(cte.ak, 5, 5);
      $$0.a(cte.am, 5, 5);
      $$0.a(cte.an, 5, 5);
      $$0.a(cte.aw, 5, 5);
      $$0.a(cte.ax, 5, 5);
      $$0.a(cte.ay, 5, 5);
      $$0.a(cte.az, 5, 5);
      $$0.a(cte.aA, 5, 5);
      $$0.a(cte.aB, 5, 5);
      $$0.a(cte.aC, 5, 5);
      $$0.a(cte.aD, 5, 5);
      $$0.a(cte.ao, 5, 5);
      $$0.a(cte.ap, 5, 5);
      $$0.a(cte.aq, 5, 5);
      $$0.a(cte.ar, 5, 5);
      $$0.a(cte.as, 5, 5);
      $$0.a(cte.at, 5, 5);
      $$0.a(cte.au, 5, 5);
      $$0.a(cte.av, 5, 5);
      $$0.a(cte.ac, 5, 20);
      $$0.a(cte.aE, 30, 60);
      $$0.a(cte.aF, 30, 60);
      $$0.a(cte.aG, 30, 60);
      $$0.a(cte.aH, 30, 60);
      $$0.a(cte.aI, 30, 60);
      $$0.a(cte.aJ, 30, 60);
      $$0.a(cte.aK, 30, 60);
      $$0.a(cte.aL, 30, 60);
      $$0.a(cte.cl, 30, 20);
      $$0.a(cte.ck, 15, 100);
      $$0.a(cte.bt, 60, 100);
      $$0.a(cte.bu, 60, 100);
      $$0.a(cte.bv, 60, 100);
      $$0.a(cte.iD, 60, 100);
      $$0.a(cte.iE, 60, 100);
      $$0.a(cte.iF, 60, 100);
      $$0.a(cte.iG, 60, 100);
      $$0.a(cte.iH, 60, 100);
      $$0.a(cte.iI, 60, 100);
      $$0.a(cte.bR, 60, 100);
      $$0.a(cte.bT, 60, 100);
      $$0.a(cte.bU, 60, 100);
      $$0.a(cte.bV, 60, 100);
      $$0.a(cte.bW, 60, 100);
      $$0.a(cte.bX, 60, 100);
      $$0.a(cte.bY, 60, 100);
      $$0.a(cte.bZ, 60, 100);
      $$0.a(cte.ca, 60, 100);
      $$0.a(cte.cb, 60, 100);
      $$0.a(cte.cc, 60, 100);
      $$0.a(cte.ce, 60, 100);
      $$0.a(cte.bS, 60, 100);
      $$0.a(cte.kC, 60, 100);
      $$0.a(cte.cd, 60, 100);
      $$0.a(cte.rA, 60, 100);
      $$0.a(cte.bA, 30, 60);
      $$0.a(cte.bB, 30, 60);
      $$0.a(cte.bC, 30, 60);
      $$0.a(cte.bD, 30, 60);
      $$0.a(cte.bE, 30, 60);
      $$0.a(cte.bF, 30, 60);
      $$0.a(cte.bG, 30, 60);
      $$0.a(cte.bH, 30, 60);
      $$0.a(cte.bI, 30, 60);
      $$0.a(cte.bJ, 30, 60);
      $$0.a(cte.bK, 30, 60);
      $$0.a(cte.bL, 30, 60);
      $$0.a(cte.bM, 30, 60);
      $$0.a(cte.bN, 30, 60);
      $$0.a(cte.bO, 30, 60);
      $$0.a(cte.bP, 30, 60);
      $$0.a(cte.ff, 15, 100);
      $$0.a(cte.iB, 5, 5);
      $$0.a(cte.ij, 60, 20);
      $$0.a(cte.pd, 15, 20);
      $$0.a(cte.ik, 60, 20);
      $$0.a(cte.il, 60, 20);
      $$0.a(cte.im, 60, 20);
      $$0.a(cte.in, 60, 20);
      $$0.a(cte.io, 60, 20);
      $$0.a(cte.ip, 60, 20);
      $$0.a(cte.iq, 60, 20);
      $$0.a(cte.ir, 60, 20);
      $$0.a(cte.is, 60, 20);
      $$0.a(cte.it, 60, 20);
      $$0.a(cte.iu, 60, 20);
      $$0.a(cte.iv, 60, 20);
      $$0.a(cte.iw, 60, 20);
      $$0.a(cte.ix, 60, 20);
      $$0.a(cte.iy, 60, 20);
      $$0.a(cte.iz, 60, 20);
      $$0.a(cte.me, 30, 60);
      $$0.a(cte.mZ, 60, 60);
      $$0.a(cte.nS, 60, 60);
      $$0.a(cte.oa, 30, 20);
      $$0.a(cte.pc, 5, 20);
      $$0.a(cte.oi, 60, 100);
      $$0.a(cte.pf, 5, 20);
      $$0.a(cte.pe, 30, 20);
      $$0.a(cte.aM, 30, 60);
      $$0.a(cte.aN, 30, 60);
      $$0.a(cte.ru, 15, 60);
      $$0.a(cte.rv, 15, 60);
      $$0.a(cte.rw, 60, 100);
      $$0.a(cte.rx, 30, 60);
      $$0.a(cte.ry, 30, 60);
      $$0.a(cte.rC, 60, 100);
      $$0.a(cte.rD, 60, 100);
      $$0.a(cte.rE, 60, 100);
      $$0.a(cte.rF, 30, 60);
      $$0.a(cte.fg, 15, 100);
   }
}
