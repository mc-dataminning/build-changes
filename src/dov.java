import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dov extends dlh {
   public static final MapCodec<dov> b = b(dov::new);
   public static final int c = 15;
   public static final eao d = eae.az;
   public static final eaf e = drm.b;
   public static final eaf f = drm.c;
   public static final eaf g = drm.d;
   public static final eaf h = drm.e;
   public static final eaf i = drm.f;
   public static final Map<ja, eaf> C = drm.h.entrySet().stream().filter($$0 -> $$0.getKey() != ja.a).collect(af.a());
   private final Function<dzo, feq> Q;
   private static final int R = 60;
   private static final int S = 30;
   private static final int T = 15;
   private static final int U = 5;
   private static final int V = 100;
   private static final int W = 60;
   private static final int X = 20;
   private static final int Y = 5;
   private final Object2IntMap<dlu> Z = new Object2IntOpenHashMap();
   private final Object2IntMap<dlu> aa = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dov> a() {
      return b;
   }

   public dov(dzn.d $$0) {
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

   private Function<dzo, feq> q() {
      Map<ja, feq> $$0 = fen.d(dlu.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         feq $$2 = fen.a();

         for (Entry<ja, eaf> $$3 : C.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fen.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? a : $$2;
      }, new ear[]{d});
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(d)) : dlw.a.m();
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.Q.apply($$0);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dzo b(dhv $$0, iu $$1) {
      iu $$2 = $$1.e();
      dzo $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, ja.b)) {
         dzo $$4 = this.m();

         for (ja $$5 : ja.values()) {
            eaf $$6 = C.get($$5);
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
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, ja.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().c(dil.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dzo $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.B_().q());
         int $$6 = $$0.c(d);
         if (!$$5 && $$1.ah() && this.a((dip)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.u($$2).a(awz.ad);
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
                        int $$16 = this.a((dis)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.an().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ah() || !this.a((dip)$$1, $$11))) {
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

   protected boolean a(dip $$0, iu $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int o(dzo $$0) {
      return $$0.b(eae.I) && $$0.c(eae.I) ? 0 : this.aa.getInt($$0.b());
   }

   private int q(dzo $$0) {
      return $$0.b(eae.I) && $$0.c(eae.I) ? 0 : this.Z.getInt($$0.b());
   }

   private void a(dip $$0, iu $$1, int $$2, azt $$3, int $$4) {
      int $$5 = this.o($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dzo $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dlu $$8 = $$6.b();
         if ($$8 instanceof dum) {
            dum.a($$0, $$1);
         }
      }
   }

   private dzo a(dis $$0, iu $$1, int $$2) {
      dzo $$3 = a((dhv)$$0, $$1);
      return $$3.a(dlw.cy) ? $$3.b(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dhv $$0, iu $$1) {
      for (ja $$2 : ja.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dis $$0, iu $$1) {
      if (!$$0.v($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ja $$3 : ja.values()) {
            dzo $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.q($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dzo $$0) {
      return this.q($$0) > 0;
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azt $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   public void a(dlu $$0, int $$1, int $$2) {
      this.Z.put($$0, $$1);
      this.aa.put($$0, $$2);
   }

   public static void b() {
      dov $$0 = (dov)dlw.cy;
      $$0.a(dlw.n, 5, 20);
      $$0.a(dlw.o, 5, 20);
      $$0.a(dlw.p, 5, 20);
      $$0.a(dlw.q, 5, 20);
      $$0.a(dlw.r, 5, 20);
      $$0.a(dlw.s, 5, 20);
      $$0.a(dlw.t, 5, 20);
      $$0.a(dlw.v, 5, 20);
      $$0.a(dlw.w, 5, 20);
      $$0.a(dlw.x, 5, 20);
      $$0.a(dlw.y, 5, 20);
      $$0.a(dlw.jR, 5, 20);
      $$0.a(dlw.jS, 5, 20);
      $$0.a(dlw.jT, 5, 20);
      $$0.a(dlw.jU, 5, 20);
      $$0.a(dlw.jV, 5, 20);
      $$0.a(dlw.jW, 5, 20);
      $$0.a(dlw.jX, 5, 20);
      $$0.a(dlw.jY, 5, 20);
      $$0.a(dlw.jZ, 5, 20);
      $$0.a(dlw.ka, 5, 20);
      $$0.a(dlw.kb, 5, 20);
      $$0.a(dlw.fw, 5, 20);
      $$0.a(dlw.ku, 5, 20);
      $$0.a(dlw.kv, 5, 20);
      $$0.a(dlw.kw, 5, 20);
      $$0.a(dlw.kx, 5, 20);
      $$0.a(dlw.ky, 5, 20);
      $$0.a(dlw.kz, 5, 20);
      $$0.a(dlw.kA, 5, 20);
      $$0.a(dlw.kB, 5, 20);
      $$0.a(dlw.kC, 5, 20);
      $$0.a(dlw.eh, 5, 20);
      $$0.a(dlw.kD, 5, 20);
      $$0.a(dlw.kE, 5, 20);
      $$0.a(dlw.kF, 5, 20);
      $$0.a(dlw.kG, 5, 20);
      $$0.a(dlw.kH, 5, 20);
      $$0.a(dlw.kI, 5, 20);
      $$0.a(dlw.kJ, 5, 20);
      $$0.a(dlw.kK, 5, 20);
      $$0.a(dlw.kL, 5, 20);
      $$0.a(dlw.cC, 5, 20);
      $$0.a(dlw.gg, 5, 20);
      $$0.a(dlw.gf, 5, 20);
      $$0.a(dlw.gh, 5, 20);
      $$0.a(dlw.im, 5, 20);
      $$0.a(dlw.in, 5, 20);
      $$0.a(dlw.io, 5, 20);
      $$0.a(dlw.ip, 5, 20);
      $$0.a(dlw.iq, 5, 20);
      $$0.a(dlw.ir, 5, 20);
      $$0.a(dlw.is, 5, 20);
      $$0.a(dlw.X, 5, 5);
      $$0.a(dlw.Y, 5, 5);
      $$0.a(dlw.Z, 5, 5);
      $$0.a(dlw.aa, 5, 5);
      $$0.a(dlw.ab, 5, 5);
      $$0.a(dlw.ac, 5, 5);
      $$0.a(dlw.ae, 5, 5);
      $$0.a(dlw.ad, 5, 5);
      $$0.a(dlw.af, 5, 5);
      $$0.a(dlw.ai, 5, 5);
      $$0.a(dlw.aq, 5, 5);
      $$0.a(dlw.aj, 5, 5);
      $$0.a(dlw.ak, 5, 5);
      $$0.a(dlw.al, 5, 5);
      $$0.a(dlw.am, 5, 5);
      $$0.a(dlw.an, 5, 5);
      $$0.a(dlw.ao, 5, 5);
      $$0.a(dlw.ap, 5, 5);
      $$0.a(dlw.ar, 5, 5);
      $$0.a(dlw.as, 5, 5);
      $$0.a(dlw.aB, 5, 5);
      $$0.a(dlw.aC, 5, 5);
      $$0.a(dlw.aD, 5, 5);
      $$0.a(dlw.aE, 5, 5);
      $$0.a(dlw.aF, 5, 5);
      $$0.a(dlw.aG, 5, 5);
      $$0.a(dlw.aH, 5, 5);
      $$0.a(dlw.aI, 5, 5);
      $$0.a(dlw.aJ, 5, 5);
      $$0.a(dlw.at, 5, 5);
      $$0.a(dlw.au, 5, 5);
      $$0.a(dlw.av, 5, 5);
      $$0.a(dlw.aw, 5, 5);
      $$0.a(dlw.ax, 5, 5);
      $$0.a(dlw.ay, 5, 5);
      $$0.a(dlw.u, 5, 5);
      $$0.a(dlw.az, 5, 5);
      $$0.a(dlw.aA, 5, 5);
      $$0.a(dlw.ag, 5, 20);
      $$0.a(dlw.aK, 30, 60);
      $$0.a(dlw.aL, 30, 60);
      $$0.a(dlw.aM, 30, 60);
      $$0.a(dlw.aN, 30, 60);
      $$0.a(dlw.aO, 30, 60);
      $$0.a(dlw.aP, 30, 60);
      $$0.a(dlw.aQ, 30, 60);
      $$0.a(dlw.aR, 30, 60);
      $$0.a(dlw.aS, 30, 60);
      $$0.a(dlw.cs, 30, 20);
      $$0.a(dlw.cr, 15, 100);
      $$0.a(dlw.bA, 60, 100);
      $$0.a(dlw.bB, 60, 100);
      $$0.a(dlw.bC, 60, 100);
      $$0.a(dlw.jb, 60, 100);
      $$0.a(dlw.jc, 60, 100);
      $$0.a(dlw.jd, 60, 100);
      $$0.a(dlw.je, 60, 100);
      $$0.a(dlw.jf, 60, 100);
      $$0.a(dlw.jg, 60, 100);
      $$0.a(dlw.bY, 60, 100);
      $$0.a(dlw.ca, 60, 100);
      $$0.a(dlw.ud, 60, 100);
      $$0.a(dlw.ue, 60, 100);
      $$0.a(dlw.cb, 60, 100);
      $$0.a(dlw.cc, 60, 100);
      $$0.a(dlw.cd, 60, 100);
      $$0.a(dlw.ce, 60, 100);
      $$0.a(dlw.cf, 60, 100);
      $$0.a(dlw.cg, 60, 100);
      $$0.a(dlw.ch, 60, 100);
      $$0.a(dlw.ci, 60, 100);
      $$0.a(dlw.cj, 60, 100);
      $$0.a(dlw.cl, 60, 100);
      $$0.a(dlw.bZ, 60, 100);
      $$0.a(dlw.le, 60, 100);
      $$0.a(dlw.ck, 60, 100);
      $$0.a(dlw.tf, 60, 100);
      $$0.a(dlw.tg, 60, 100);
      $$0.a(dlw.th, 60, 100);
      $$0.a(dlw.bH, 30, 60);
      $$0.a(dlw.bI, 30, 60);
      $$0.a(dlw.bJ, 30, 60);
      $$0.a(dlw.bK, 30, 60);
      $$0.a(dlw.bL, 30, 60);
      $$0.a(dlw.bM, 30, 60);
      $$0.a(dlw.bN, 30, 60);
      $$0.a(dlw.bO, 30, 60);
      $$0.a(dlw.bP, 30, 60);
      $$0.a(dlw.bQ, 30, 60);
      $$0.a(dlw.bR, 30, 60);
      $$0.a(dlw.bS, 30, 60);
      $$0.a(dlw.bT, 30, 60);
      $$0.a(dlw.bU, 30, 60);
      $$0.a(dlw.bV, 30, 60);
      $$0.a(dlw.bW, 30, 60);
      $$0.a(dlw.ft, 15, 100);
      $$0.a(dlw.iZ, 5, 5);
      $$0.a(dlw.iH, 60, 20);
      $$0.a(dlw.pH, 15, 20);
      $$0.a(dlw.iI, 60, 20);
      $$0.a(dlw.iJ, 60, 20);
      $$0.a(dlw.iK, 60, 20);
      $$0.a(dlw.iL, 60, 20);
      $$0.a(dlw.iM, 60, 20);
      $$0.a(dlw.iN, 60, 20);
      $$0.a(dlw.iO, 60, 20);
      $$0.a(dlw.iP, 60, 20);
      $$0.a(dlw.iQ, 60, 20);
      $$0.a(dlw.iR, 60, 20);
      $$0.a(dlw.iS, 60, 20);
      $$0.a(dlw.iT, 60, 20);
      $$0.a(dlw.iU, 60, 20);
      $$0.a(dlw.iV, 60, 20);
      $$0.a(dlw.iW, 60, 20);
      $$0.a(dlw.iX, 60, 20);
      $$0.a(dlw.ua, 5, 100);
      $$0.a(dlw.ub, 5, 100);
      $$0.a(dlw.uc, 5, 100);
      $$0.a(dlw.mG, 30, 60);
      $$0.a(dlw.nB, 60, 60);
      $$0.a(dlw.ou, 60, 60);
      $$0.a(dlw.oC, 30, 20);
      $$0.a(dlw.pG, 5, 20);
      $$0.a(dlw.oK, 60, 100);
      $$0.a(dlw.pJ, 5, 20);
      $$0.a(dlw.pI, 30, 20);
      $$0.a(dlw.aT, 30, 60);
      $$0.a(dlw.aU, 30, 60);
      $$0.a(dlw.sZ, 15, 60);
      $$0.a(dlw.ta, 15, 60);
      $$0.a(dlw.tb, 60, 100);
      $$0.a(dlw.tc, 30, 60);
      $$0.a(dlw.td, 30, 60);
      $$0.a(dlw.tj, 60, 100);
      $$0.a(dlw.tk, 60, 100);
      $$0.a(dlw.tl, 60, 100);
      $$0.a(dlw.tm, 30, 60);
      $$0.a(dlw.fu, 15, 100);
   }
}
