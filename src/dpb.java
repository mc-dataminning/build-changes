import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dpb extends dln {
   public static final MapCodec<dpb> b = b(dpb::new);
   public static final int c = 15;
   public static final eaz d = eap.az;
   public static final eaq e = drt.b;
   public static final eaq f = drt.c;
   public static final eaq g = drt.d;
   public static final eaq h = drt.e;
   public static final eaq i = drt.f;
   public static final Map<ja, eaq> C = drt.h.entrySet().stream().filter($$0 -> $$0.getKey() != ja.a).collect(af.a());
   private final Function<dzz, ffc> Q;
   private static final int R = 60;
   private static final int S = 30;
   private static final int T = 15;
   private static final int U = 5;
   private static final int V = 100;
   private static final int W = 60;
   private static final int X = 20;
   private static final int Y = 5;
   private final Object2IntMap<dma> Z = new Object2IntOpenHashMap();
   private final Object2IntMap<dma> aa = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dpb> a() {
      return b;
   }

   public dpb(dzy.d $$0) {
      super($$0, 1.0F);
      this.l(
         this.B
            .b()
            .b(d, Integer.valueOf(0))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
            .b(i, Boolean.valueOf(false))
      );
      this.Q = this.q();
   }

   private Function<dzz, ffc> q() {
      Map<ja, ffc> $$0 = fez.d(dma.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         ffc $$2 = fez.a();

         for (Entry<ja, eaq> $$3 : C.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fez.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? a : $$2;
      }, new ebc[]{d});
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(d)) : dmc.a.m();
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.Q.apply($$0);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dzz b(dib $$0, iu $$1) {
      iu $$2 = $$1.e();
      dzz $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, ja.b)) {
         dzz $$4 = this.m();

         for (ja $$5 : ja.values()) {
            eaq $$6 = C.get($$5);
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
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      iu $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, ja.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().c(dir.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dzz $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.B_().q());
         int $$6 = $$0.c(d);
         if (!$$5 && $$1.ah() && this.a((div)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.b(d, Integer.valueOf($$7));
               $$1.a($$2, $$0, 260);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  iu $$8 = $$2.e();
                  if (!$$1.a_($$8).c($$1, $$8, ja.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.u($$2).a(axb.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            iu.a $$11 = new iu.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((diy)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.an().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ah() || !this.a((div)$$1, $$11))) {
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

   protected boolean a(div $$0, iu $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int o(dzz $$0) {
      return $$0.b(eap.I) && $$0.c(eap.I) ? 0 : this.aa.getInt($$0.b());
   }

   private int q(dzz $$0) {
      return $$0.b(eap.I) && $$0.c(eap.I) ? 0 : this.Z.getInt($$0.b());
   }

   private void a(div $$0, iu $$1, int $$2, azv $$3, int $$4) {
      int $$5 = this.o($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dzz $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dma $$8 = $$6.b();
         if ($$8 instanceof duv) {
            duv.a($$0, $$1);
         }
      }
   }

   private dzz a(diy $$0, iu $$1, int $$2) {
      dzz $$3 = a((dib)$$0, $$1);
      return $$3.a(dmc.cz) ? $$3.b(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dib $$0, iu $$1) {
      for (ja $$2 : ja.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(diy $$0, iu $$1) {
      if (!$$0.v($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ja $$3 : ja.values()) {
            dzz $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.q($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dzz $$0) {
      return this.q($$0) > 0;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azv $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   public void a(dma $$0, int $$1, int $$2) {
      this.Z.put($$0, $$1);
      this.aa.put($$0, $$2);
   }

   public static void b() {
      dpb $$0 = (dpb)dmc.cz;
      $$0.a(dmc.n, 5, 20);
      $$0.a(dmc.o, 5, 20);
      $$0.a(dmc.p, 5, 20);
      $$0.a(dmc.q, 5, 20);
      $$0.a(dmc.r, 5, 20);
      $$0.a(dmc.s, 5, 20);
      $$0.a(dmc.t, 5, 20);
      $$0.a(dmc.v, 5, 20);
      $$0.a(dmc.w, 5, 20);
      $$0.a(dmc.x, 5, 20);
      $$0.a(dmc.y, 5, 20);
      $$0.a(dmc.jS, 5, 20);
      $$0.a(dmc.jT, 5, 20);
      $$0.a(dmc.jU, 5, 20);
      $$0.a(dmc.jV, 5, 20);
      $$0.a(dmc.jW, 5, 20);
      $$0.a(dmc.jX, 5, 20);
      $$0.a(dmc.jY, 5, 20);
      $$0.a(dmc.jZ, 5, 20);
      $$0.a(dmc.ka, 5, 20);
      $$0.a(dmc.kb, 5, 20);
      $$0.a(dmc.kc, 5, 20);
      $$0.a(dmc.fx, 5, 20);
      $$0.a(dmc.kv, 5, 20);
      $$0.a(dmc.kw, 5, 20);
      $$0.a(dmc.kx, 5, 20);
      $$0.a(dmc.ky, 5, 20);
      $$0.a(dmc.kz, 5, 20);
      $$0.a(dmc.kA, 5, 20);
      $$0.a(dmc.kB, 5, 20);
      $$0.a(dmc.kC, 5, 20);
      $$0.a(dmc.kD, 5, 20);
      $$0.a(dmc.ei, 5, 20);
      $$0.a(dmc.kE, 5, 20);
      $$0.a(dmc.kF, 5, 20);
      $$0.a(dmc.kG, 5, 20);
      $$0.a(dmc.kH, 5, 20);
      $$0.a(dmc.kI, 5, 20);
      $$0.a(dmc.kJ, 5, 20);
      $$0.a(dmc.kK, 5, 20);
      $$0.a(dmc.kL, 5, 20);
      $$0.a(dmc.kM, 5, 20);
      $$0.a(dmc.cD, 5, 20);
      $$0.a(dmc.gh, 5, 20);
      $$0.a(dmc.gg, 5, 20);
      $$0.a(dmc.gi, 5, 20);
      $$0.a(dmc.in, 5, 20);
      $$0.a(dmc.io, 5, 20);
      $$0.a(dmc.ip, 5, 20);
      $$0.a(dmc.iq, 5, 20);
      $$0.a(dmc.ir, 5, 20);
      $$0.a(dmc.is, 5, 20);
      $$0.a(dmc.it, 5, 20);
      $$0.a(dmc.X, 5, 5);
      $$0.a(dmc.Y, 5, 5);
      $$0.a(dmc.Z, 5, 5);
      $$0.a(dmc.aa, 5, 5);
      $$0.a(dmc.ab, 5, 5);
      $$0.a(dmc.ac, 5, 5);
      $$0.a(dmc.ae, 5, 5);
      $$0.a(dmc.ad, 5, 5);
      $$0.a(dmc.af, 5, 5);
      $$0.a(dmc.ai, 5, 5);
      $$0.a(dmc.aq, 5, 5);
      $$0.a(dmc.aj, 5, 5);
      $$0.a(dmc.ak, 5, 5);
      $$0.a(dmc.al, 5, 5);
      $$0.a(dmc.am, 5, 5);
      $$0.a(dmc.an, 5, 5);
      $$0.a(dmc.ao, 5, 5);
      $$0.a(dmc.ap, 5, 5);
      $$0.a(dmc.ar, 5, 5);
      $$0.a(dmc.as, 5, 5);
      $$0.a(dmc.aB, 5, 5);
      $$0.a(dmc.aC, 5, 5);
      $$0.a(dmc.aD, 5, 5);
      $$0.a(dmc.aE, 5, 5);
      $$0.a(dmc.aF, 5, 5);
      $$0.a(dmc.aG, 5, 5);
      $$0.a(dmc.aH, 5, 5);
      $$0.a(dmc.aI, 5, 5);
      $$0.a(dmc.aJ, 5, 5);
      $$0.a(dmc.at, 5, 5);
      $$0.a(dmc.au, 5, 5);
      $$0.a(dmc.av, 5, 5);
      $$0.a(dmc.aw, 5, 5);
      $$0.a(dmc.ax, 5, 5);
      $$0.a(dmc.ay, 5, 5);
      $$0.a(dmc.u, 5, 5);
      $$0.a(dmc.az, 5, 5);
      $$0.a(dmc.aA, 5, 5);
      $$0.a(dmc.ag, 5, 20);
      $$0.a(dmc.aK, 30, 60);
      $$0.a(dmc.aL, 30, 60);
      $$0.a(dmc.aM, 30, 60);
      $$0.a(dmc.aN, 30, 60);
      $$0.a(dmc.aO, 30, 60);
      $$0.a(dmc.aP, 30, 60);
      $$0.a(dmc.aQ, 30, 60);
      $$0.a(dmc.aR, 30, 60);
      $$0.a(dmc.aS, 30, 60);
      $$0.a(dmc.ct, 30, 20);
      $$0.a(dmc.cs, 15, 100);
      $$0.a(dmc.bA, 60, 100);
      $$0.a(dmc.bB, 60, 100);
      $$0.a(dmc.bC, 60, 100);
      $$0.a(dmc.jc, 60, 100);
      $$0.a(dmc.jd, 60, 100);
      $$0.a(dmc.je, 60, 100);
      $$0.a(dmc.jf, 60, 100);
      $$0.a(dmc.jg, 60, 100);
      $$0.a(dmc.jh, 60, 100);
      $$0.a(dmc.bZ, 60, 100);
      $$0.a(dmc.cb, 60, 100);
      $$0.a(dmc.ue, 60, 100);
      $$0.a(dmc.uf, 60, 100);
      $$0.a(dmc.cc, 60, 100);
      $$0.a(dmc.cd, 60, 100);
      $$0.a(dmc.ce, 60, 100);
      $$0.a(dmc.cf, 60, 100);
      $$0.a(dmc.cg, 60, 100);
      $$0.a(dmc.ch, 60, 100);
      $$0.a(dmc.ci, 60, 100);
      $$0.a(dmc.cj, 60, 100);
      $$0.a(dmc.ck, 60, 100);
      $$0.a(dmc.cm, 60, 100);
      $$0.a(dmc.ca, 60, 100);
      $$0.a(dmc.lf, 60, 100);
      $$0.a(dmc.cl, 60, 100);
      $$0.a(dmc.tg, 60, 100);
      $$0.a(dmc.th, 60, 100);
      $$0.a(dmc.ti, 60, 100);
      $$0.a(dmc.bI, 30, 60);
      $$0.a(dmc.bJ, 30, 60);
      $$0.a(dmc.bK, 30, 60);
      $$0.a(dmc.bL, 30, 60);
      $$0.a(dmc.bM, 30, 60);
      $$0.a(dmc.bN, 30, 60);
      $$0.a(dmc.bO, 30, 60);
      $$0.a(dmc.bP, 30, 60);
      $$0.a(dmc.bQ, 30, 60);
      $$0.a(dmc.bR, 30, 60);
      $$0.a(dmc.bS, 30, 60);
      $$0.a(dmc.bT, 30, 60);
      $$0.a(dmc.bU, 30, 60);
      $$0.a(dmc.bV, 30, 60);
      $$0.a(dmc.bW, 30, 60);
      $$0.a(dmc.bX, 30, 60);
      $$0.a(dmc.fu, 15, 100);
      $$0.a(dmc.ja, 5, 5);
      $$0.a(dmc.iI, 60, 20);
      $$0.a(dmc.pI, 15, 20);
      $$0.a(dmc.iJ, 60, 20);
      $$0.a(dmc.iK, 60, 20);
      $$0.a(dmc.iL, 60, 20);
      $$0.a(dmc.iM, 60, 20);
      $$0.a(dmc.iN, 60, 20);
      $$0.a(dmc.iO, 60, 20);
      $$0.a(dmc.iP, 60, 20);
      $$0.a(dmc.iQ, 60, 20);
      $$0.a(dmc.iR, 60, 20);
      $$0.a(dmc.iS, 60, 20);
      $$0.a(dmc.iT, 60, 20);
      $$0.a(dmc.iU, 60, 20);
      $$0.a(dmc.iV, 60, 20);
      $$0.a(dmc.iW, 60, 20);
      $$0.a(dmc.iX, 60, 20);
      $$0.a(dmc.iY, 60, 20);
      $$0.a(dmc.ub, 5, 100);
      $$0.a(dmc.uc, 5, 100);
      $$0.a(dmc.ud, 5, 100);
      $$0.a(dmc.mH, 30, 60);
      $$0.a(dmc.nC, 60, 60);
      $$0.a(dmc.ov, 60, 60);
      $$0.a(dmc.oD, 30, 20);
      $$0.a(dmc.pH, 5, 20);
      $$0.a(dmc.oL, 60, 100);
      $$0.a(dmc.pK, 5, 20);
      $$0.a(dmc.pJ, 30, 20);
      $$0.a(dmc.aT, 30, 60);
      $$0.a(dmc.aU, 30, 60);
      $$0.a(dmc.ta, 15, 60);
      $$0.a(dmc.tb, 15, 60);
      $$0.a(dmc.tc, 60, 100);
      $$0.a(dmc.td, 30, 60);
      $$0.a(dmc.te, 30, 60);
      $$0.a(dmc.tk, 60, 100);
      $$0.a(dmc.tl, 60, 100);
      $$0.a(dmc.tm, 60, 100);
      $$0.a(dmc.tn, 30, 60);
      $$0.a(dmc.fv, 15, 100);
      $$0.a(dmc.ui, 60, 100);
      $$0.a(dmc.bD, 60, 100);
   }
}
