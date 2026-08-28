import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dnv extends dkh {
   public static final MapCodec<dnv> b = b(dnv::new);
   public static final int c = 15;
   public static final dzm d = dzc.az;
   public static final dzd e = dqm.b;
   public static final dzd f = dqm.c;
   public static final dzd g = dqm.d;
   public static final dzd h = dqm.e;
   public static final dzd i = dqm.f;
   public static final Map<jo, dzd> C = dqm.h.entrySet().stream().filter($$0 -> $$0.getKey() != jo.a).collect(af.a());
   private final Function<dym, fdo> Q;
   private static final int R = 60;
   private static final int S = 30;
   private static final int T = 15;
   private static final int U = 5;
   private static final int V = 100;
   private static final int W = 60;
   private static final int X = 20;
   private static final int Y = 5;
   private final Object2IntMap<dku> Z = new Object2IntOpenHashMap();
   private final Object2IntMap<dku> aa = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dnv> a() {
      return b;
   }

   public dnv(dyl.d $$0) {
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

   private Function<dym, fdo> q() {
      Map<jo, fdo> $$0 = fdl.d(dku.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fdo $$2 = fdl.a();

         for (Entry<jo, dzd> $$3 : C.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fdl.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? a : $$2;
      }, new dzp[]{d});
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(d)) : dkw.a.m();
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.Q.apply($$0);
   }

   @Override
   public dym a(dbn $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dym b(dgv $$0, jj $$1) {
      jj $$2 = $$1.e();
      dym $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jo.b)) {
         dym $$4 = this.m();

         for (jo $$5 : jo.values()) {
            dzd $$6 = C.get($$5);
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
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jo.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().c(dhl.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dym $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.B_().q());
         int $$6 = $$0.c(d);
         if (!$$5 && $$1.ah() && this.a((dhp)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.b(d, Integer.valueOf($$7));
               $$1.a($$2, $$0, 260);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  jj $$8 = $$2.e();
                  if (!$$1.a_($$8).c($$1, $$8, jo.b) || $$6 > 3) {
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
            jj.a $$11 = new jj.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dhs)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.an().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ah() || !this.a((dhp)$$1, $$11))) {
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

   protected boolean a(dhp $$0, jj $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int o(dym $$0) {
      return $$0.b(dzc.I) && $$0.c(dzc.I) ? 0 : this.aa.getInt($$0.b());
   }

   private int q(dym $$0) {
      return $$0.b(dzc.I) && $$0.c(dzc.I) ? 0 : this.Z.getInt($$0.b());
   }

   private void a(dhp $$0, jj $$1, int $$2, azs $$3, int $$4) {
      int $$5 = this.o($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dym $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dku $$8 = $$6.b();
         if ($$8 instanceof dtl) {
            dtl.a($$0, $$1);
         }
      }
   }

   private dym a(dhs $$0, jj $$1, int $$2) {
      dym $$3 = a((dgv)$$0, $$1);
      return $$3.a(dkw.cy) ? $$3.b(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dgv $$0, jj $$1) {
      for (jo $$2 : jo.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dhs $$0, jj $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jo $$3 : jo.values()) {
            dym $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.q($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dym $$0) {
      return this.q($$0) > 0;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azs $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   public void a(dku $$0, int $$1, int $$2) {
      this.Z.put($$0, $$1);
      this.aa.put($$0, $$2);
   }

   public static void b() {
      dnv $$0 = (dnv)dkw.cy;
      $$0.a(dkw.n, 5, 20);
      $$0.a(dkw.o, 5, 20);
      $$0.a(dkw.p, 5, 20);
      $$0.a(dkw.q, 5, 20);
      $$0.a(dkw.r, 5, 20);
      $$0.a(dkw.s, 5, 20);
      $$0.a(dkw.t, 5, 20);
      $$0.a(dkw.v, 5, 20);
      $$0.a(dkw.w, 5, 20);
      $$0.a(dkw.x, 5, 20);
      $$0.a(dkw.y, 5, 20);
      $$0.a(dkw.jR, 5, 20);
      $$0.a(dkw.jS, 5, 20);
      $$0.a(dkw.jT, 5, 20);
      $$0.a(dkw.jU, 5, 20);
      $$0.a(dkw.jV, 5, 20);
      $$0.a(dkw.jW, 5, 20);
      $$0.a(dkw.jX, 5, 20);
      $$0.a(dkw.jY, 5, 20);
      $$0.a(dkw.jZ, 5, 20);
      $$0.a(dkw.ka, 5, 20);
      $$0.a(dkw.kb, 5, 20);
      $$0.a(dkw.fw, 5, 20);
      $$0.a(dkw.ku, 5, 20);
      $$0.a(dkw.kv, 5, 20);
      $$0.a(dkw.kw, 5, 20);
      $$0.a(dkw.kx, 5, 20);
      $$0.a(dkw.ky, 5, 20);
      $$0.a(dkw.kz, 5, 20);
      $$0.a(dkw.kA, 5, 20);
      $$0.a(dkw.kB, 5, 20);
      $$0.a(dkw.kC, 5, 20);
      $$0.a(dkw.eh, 5, 20);
      $$0.a(dkw.kD, 5, 20);
      $$0.a(dkw.kE, 5, 20);
      $$0.a(dkw.kF, 5, 20);
      $$0.a(dkw.kG, 5, 20);
      $$0.a(dkw.kH, 5, 20);
      $$0.a(dkw.kI, 5, 20);
      $$0.a(dkw.kJ, 5, 20);
      $$0.a(dkw.kK, 5, 20);
      $$0.a(dkw.kL, 5, 20);
      $$0.a(dkw.cC, 5, 20);
      $$0.a(dkw.gg, 5, 20);
      $$0.a(dkw.gf, 5, 20);
      $$0.a(dkw.gh, 5, 20);
      $$0.a(dkw.im, 5, 20);
      $$0.a(dkw.in, 5, 20);
      $$0.a(dkw.io, 5, 20);
      $$0.a(dkw.ip, 5, 20);
      $$0.a(dkw.iq, 5, 20);
      $$0.a(dkw.ir, 5, 20);
      $$0.a(dkw.is, 5, 20);
      $$0.a(dkw.X, 5, 5);
      $$0.a(dkw.Y, 5, 5);
      $$0.a(dkw.Z, 5, 5);
      $$0.a(dkw.aa, 5, 5);
      $$0.a(dkw.ab, 5, 5);
      $$0.a(dkw.ac, 5, 5);
      $$0.a(dkw.ae, 5, 5);
      $$0.a(dkw.ad, 5, 5);
      $$0.a(dkw.af, 5, 5);
      $$0.a(dkw.ai, 5, 5);
      $$0.a(dkw.aq, 5, 5);
      $$0.a(dkw.aj, 5, 5);
      $$0.a(dkw.ak, 5, 5);
      $$0.a(dkw.al, 5, 5);
      $$0.a(dkw.am, 5, 5);
      $$0.a(dkw.an, 5, 5);
      $$0.a(dkw.ao, 5, 5);
      $$0.a(dkw.ap, 5, 5);
      $$0.a(dkw.ar, 5, 5);
      $$0.a(dkw.as, 5, 5);
      $$0.a(dkw.aB, 5, 5);
      $$0.a(dkw.aC, 5, 5);
      $$0.a(dkw.aD, 5, 5);
      $$0.a(dkw.aE, 5, 5);
      $$0.a(dkw.aF, 5, 5);
      $$0.a(dkw.aG, 5, 5);
      $$0.a(dkw.aH, 5, 5);
      $$0.a(dkw.aI, 5, 5);
      $$0.a(dkw.aJ, 5, 5);
      $$0.a(dkw.at, 5, 5);
      $$0.a(dkw.au, 5, 5);
      $$0.a(dkw.av, 5, 5);
      $$0.a(dkw.aw, 5, 5);
      $$0.a(dkw.ax, 5, 5);
      $$0.a(dkw.ay, 5, 5);
      $$0.a(dkw.u, 5, 5);
      $$0.a(dkw.az, 5, 5);
      $$0.a(dkw.aA, 5, 5);
      $$0.a(dkw.ag, 5, 20);
      $$0.a(dkw.aK, 30, 60);
      $$0.a(dkw.aL, 30, 60);
      $$0.a(dkw.aM, 30, 60);
      $$0.a(dkw.aN, 30, 60);
      $$0.a(dkw.aO, 30, 60);
      $$0.a(dkw.aP, 30, 60);
      $$0.a(dkw.aQ, 30, 60);
      $$0.a(dkw.aR, 30, 60);
      $$0.a(dkw.aS, 30, 60);
      $$0.a(dkw.cs, 30, 20);
      $$0.a(dkw.cr, 15, 100);
      $$0.a(dkw.bA, 60, 100);
      $$0.a(dkw.bB, 60, 100);
      $$0.a(dkw.bC, 60, 100);
      $$0.a(dkw.jb, 60, 100);
      $$0.a(dkw.jc, 60, 100);
      $$0.a(dkw.jd, 60, 100);
      $$0.a(dkw.je, 60, 100);
      $$0.a(dkw.jf, 60, 100);
      $$0.a(dkw.jg, 60, 100);
      $$0.a(dkw.bY, 60, 100);
      $$0.a(dkw.ca, 60, 100);
      $$0.a(dkw.ud, 60, 100);
      $$0.a(dkw.ue, 60, 100);
      $$0.a(dkw.cb, 60, 100);
      $$0.a(dkw.cc, 60, 100);
      $$0.a(dkw.cd, 60, 100);
      $$0.a(dkw.ce, 60, 100);
      $$0.a(dkw.cf, 60, 100);
      $$0.a(dkw.cg, 60, 100);
      $$0.a(dkw.ch, 60, 100);
      $$0.a(dkw.ci, 60, 100);
      $$0.a(dkw.cj, 60, 100);
      $$0.a(dkw.cl, 60, 100);
      $$0.a(dkw.bZ, 60, 100);
      $$0.a(dkw.le, 60, 100);
      $$0.a(dkw.ck, 60, 100);
      $$0.a(dkw.tf, 60, 100);
      $$0.a(dkw.tg, 60, 100);
      $$0.a(dkw.th, 60, 100);
      $$0.a(dkw.bH, 30, 60);
      $$0.a(dkw.bI, 30, 60);
      $$0.a(dkw.bJ, 30, 60);
      $$0.a(dkw.bK, 30, 60);
      $$0.a(dkw.bL, 30, 60);
      $$0.a(dkw.bM, 30, 60);
      $$0.a(dkw.bN, 30, 60);
      $$0.a(dkw.bO, 30, 60);
      $$0.a(dkw.bP, 30, 60);
      $$0.a(dkw.bQ, 30, 60);
      $$0.a(dkw.bR, 30, 60);
      $$0.a(dkw.bS, 30, 60);
      $$0.a(dkw.bT, 30, 60);
      $$0.a(dkw.bU, 30, 60);
      $$0.a(dkw.bV, 30, 60);
      $$0.a(dkw.bW, 30, 60);
      $$0.a(dkw.ft, 15, 100);
      $$0.a(dkw.iZ, 5, 5);
      $$0.a(dkw.iH, 60, 20);
      $$0.a(dkw.pH, 15, 20);
      $$0.a(dkw.iI, 60, 20);
      $$0.a(dkw.iJ, 60, 20);
      $$0.a(dkw.iK, 60, 20);
      $$0.a(dkw.iL, 60, 20);
      $$0.a(dkw.iM, 60, 20);
      $$0.a(dkw.iN, 60, 20);
      $$0.a(dkw.iO, 60, 20);
      $$0.a(dkw.iP, 60, 20);
      $$0.a(dkw.iQ, 60, 20);
      $$0.a(dkw.iR, 60, 20);
      $$0.a(dkw.iS, 60, 20);
      $$0.a(dkw.iT, 60, 20);
      $$0.a(dkw.iU, 60, 20);
      $$0.a(dkw.iV, 60, 20);
      $$0.a(dkw.iW, 60, 20);
      $$0.a(dkw.iX, 60, 20);
      $$0.a(dkw.ua, 5, 100);
      $$0.a(dkw.ub, 5, 100);
      $$0.a(dkw.uc, 5, 100);
      $$0.a(dkw.mG, 30, 60);
      $$0.a(dkw.nB, 60, 60);
      $$0.a(dkw.ou, 60, 60);
      $$0.a(dkw.oC, 30, 20);
      $$0.a(dkw.pG, 5, 20);
      $$0.a(dkw.oK, 60, 100);
      $$0.a(dkw.pJ, 5, 20);
      $$0.a(dkw.pI, 30, 20);
      $$0.a(dkw.aT, 30, 60);
      $$0.a(dkw.aU, 30, 60);
      $$0.a(dkw.sZ, 15, 60);
      $$0.a(dkw.ta, 15, 60);
      $$0.a(dkw.tb, 60, 100);
      $$0.a(dkw.tc, 30, 60);
      $$0.a(dkw.td, 30, 60);
      $$0.a(dkw.tj, 60, 100);
      $$0.a(dkw.tk, 60, 100);
      $$0.a(dkw.tl, 60, 100);
      $$0.a(dkw.tm, 30, 60);
      $$0.a(dkw.fu, 15, 100);
   }
}
