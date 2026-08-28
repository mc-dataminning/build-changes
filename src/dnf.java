import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dnf extends djr {
   public static final MapCodec<dnf> b = b(dnf::new);
   public static final int c = 15;
   public static final dyq d = dyg.az;
   public static final dyh e = dpw.b;
   public static final dyh f = dpw.c;
   public static final dyh g = dpw.d;
   public static final dyh h = dpw.e;
   public static final dyh i = dpw.f;
   public static final Map<jn, dyh> C = dpw.h.entrySet().stream().filter($$0 -> $$0.getKey() != jn.a).collect(af.a());
   private final Function<dxq, fcr> Q;
   private static final int R = 60;
   private static final int S = 30;
   private static final int T = 15;
   private static final int U = 5;
   private static final int V = 100;
   private static final int W = 60;
   private static final int X = 20;
   private static final int Y = 5;
   private final Object2IntMap<dke> Z = new Object2IntOpenHashMap();
   private final Object2IntMap<dke> aa = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dnf> a() {
      return b;
   }

   public dnf(dxp.d $$0) {
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

   private Function<dxq, fcr> q() {
      Map<jn, fcr> $$0 = fco.d(dke.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fcr $$2 = fco.a();

         for (Entry<jn, dyh> $$3 : C.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fco.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? a : $$2;
      }, new dyt[]{d});
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(d)) : dkg.a.m();
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.Q.apply($$0);
   }

   @Override
   public dxq a(dax $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dxq b(dgf $$0, ji $$1) {
      ji $$2 = $$1.e();
      dxq $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jn.b)) {
         dxq $$4 = this.m();

         for (jn $$5 : jn.values()) {
            dyh $$6 = C.get($$5);
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
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jn.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().b(dgv.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dxq $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.B_().q());
         int $$6 = $$0.c(d);
         if (!$$5 && $$1.ah() && this.a((dgz)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.b(d, Integer.valueOf($$7));
               $$1.a($$2, $$0, 260);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  ji $$8 = $$2.e();
                  if (!$$1.a_($$8).c($$1, $$8, jn.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(awo.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            ji.a $$11 = new ji.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dhc)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.an().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ah() || !this.a((dgz)$$1, $$11))) {
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

   protected boolean a(dgz $$0, ji $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int o(dxq $$0) {
      return $$0.b(dyg.I) && $$0.c(dyg.I) ? 0 : this.aa.getInt($$0.b());
   }

   private int q(dxq $$0) {
      return $$0.b(dyg.I) && $$0.c(dyg.I) ? 0 : this.Z.getInt($$0.b());
   }

   private void a(dgz $$0, ji $$1, int $$2, azh $$3, int $$4) {
      int $$5 = this.o($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dxq $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dke $$8 = $$6.b();
         if ($$8 instanceof dst) {
            dst.a($$0, $$1);
         }
      }
   }

   private dxq a(dhc $$0, ji $$1, int $$2) {
      dxq $$3 = a((dgf)$$0, $$1);
      return $$3.a(dkg.cy) ? $$3.b(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dgf $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dhc $$0, ji $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jn $$3 : jn.values()) {
            dxq $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.q($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dxq $$0) {
      return this.q($$0) > 0;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azh $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   public void a(dke $$0, int $$1, int $$2) {
      this.Z.put($$0, $$1);
      this.aa.put($$0, $$2);
   }

   public static void b() {
      dnf $$0 = (dnf)dkg.cy;
      $$0.a(dkg.n, 5, 20);
      $$0.a(dkg.o, 5, 20);
      $$0.a(dkg.p, 5, 20);
      $$0.a(dkg.q, 5, 20);
      $$0.a(dkg.r, 5, 20);
      $$0.a(dkg.s, 5, 20);
      $$0.a(dkg.t, 5, 20);
      $$0.a(dkg.v, 5, 20);
      $$0.a(dkg.w, 5, 20);
      $$0.a(dkg.x, 5, 20);
      $$0.a(dkg.y, 5, 20);
      $$0.a(dkg.jR, 5, 20);
      $$0.a(dkg.jS, 5, 20);
      $$0.a(dkg.jT, 5, 20);
      $$0.a(dkg.jU, 5, 20);
      $$0.a(dkg.jV, 5, 20);
      $$0.a(dkg.jW, 5, 20);
      $$0.a(dkg.jX, 5, 20);
      $$0.a(dkg.jY, 5, 20);
      $$0.a(dkg.jZ, 5, 20);
      $$0.a(dkg.ka, 5, 20);
      $$0.a(dkg.kb, 5, 20);
      $$0.a(dkg.fw, 5, 20);
      $$0.a(dkg.ku, 5, 20);
      $$0.a(dkg.kv, 5, 20);
      $$0.a(dkg.kw, 5, 20);
      $$0.a(dkg.kx, 5, 20);
      $$0.a(dkg.ky, 5, 20);
      $$0.a(dkg.kz, 5, 20);
      $$0.a(dkg.kA, 5, 20);
      $$0.a(dkg.kB, 5, 20);
      $$0.a(dkg.kC, 5, 20);
      $$0.a(dkg.eh, 5, 20);
      $$0.a(dkg.kD, 5, 20);
      $$0.a(dkg.kE, 5, 20);
      $$0.a(dkg.kF, 5, 20);
      $$0.a(dkg.kG, 5, 20);
      $$0.a(dkg.kH, 5, 20);
      $$0.a(dkg.kI, 5, 20);
      $$0.a(dkg.kJ, 5, 20);
      $$0.a(dkg.kK, 5, 20);
      $$0.a(dkg.kL, 5, 20);
      $$0.a(dkg.cC, 5, 20);
      $$0.a(dkg.gg, 5, 20);
      $$0.a(dkg.gf, 5, 20);
      $$0.a(dkg.gh, 5, 20);
      $$0.a(dkg.im, 5, 20);
      $$0.a(dkg.in, 5, 20);
      $$0.a(dkg.io, 5, 20);
      $$0.a(dkg.ip, 5, 20);
      $$0.a(dkg.iq, 5, 20);
      $$0.a(dkg.ir, 5, 20);
      $$0.a(dkg.is, 5, 20);
      $$0.a(dkg.X, 5, 5);
      $$0.a(dkg.Y, 5, 5);
      $$0.a(dkg.Z, 5, 5);
      $$0.a(dkg.aa, 5, 5);
      $$0.a(dkg.ab, 5, 5);
      $$0.a(dkg.ac, 5, 5);
      $$0.a(dkg.ae, 5, 5);
      $$0.a(dkg.ad, 5, 5);
      $$0.a(dkg.af, 5, 5);
      $$0.a(dkg.ai, 5, 5);
      $$0.a(dkg.aq, 5, 5);
      $$0.a(dkg.aj, 5, 5);
      $$0.a(dkg.ak, 5, 5);
      $$0.a(dkg.al, 5, 5);
      $$0.a(dkg.am, 5, 5);
      $$0.a(dkg.an, 5, 5);
      $$0.a(dkg.ao, 5, 5);
      $$0.a(dkg.ap, 5, 5);
      $$0.a(dkg.ar, 5, 5);
      $$0.a(dkg.as, 5, 5);
      $$0.a(dkg.aB, 5, 5);
      $$0.a(dkg.aC, 5, 5);
      $$0.a(dkg.aD, 5, 5);
      $$0.a(dkg.aE, 5, 5);
      $$0.a(dkg.aF, 5, 5);
      $$0.a(dkg.aG, 5, 5);
      $$0.a(dkg.aH, 5, 5);
      $$0.a(dkg.aI, 5, 5);
      $$0.a(dkg.aJ, 5, 5);
      $$0.a(dkg.at, 5, 5);
      $$0.a(dkg.au, 5, 5);
      $$0.a(dkg.av, 5, 5);
      $$0.a(dkg.aw, 5, 5);
      $$0.a(dkg.ax, 5, 5);
      $$0.a(dkg.ay, 5, 5);
      $$0.a(dkg.u, 5, 5);
      $$0.a(dkg.az, 5, 5);
      $$0.a(dkg.aA, 5, 5);
      $$0.a(dkg.ag, 5, 20);
      $$0.a(dkg.aK, 30, 60);
      $$0.a(dkg.aL, 30, 60);
      $$0.a(dkg.aM, 30, 60);
      $$0.a(dkg.aN, 30, 60);
      $$0.a(dkg.aO, 30, 60);
      $$0.a(dkg.aP, 30, 60);
      $$0.a(dkg.aQ, 30, 60);
      $$0.a(dkg.aR, 30, 60);
      $$0.a(dkg.aS, 30, 60);
      $$0.a(dkg.cs, 30, 20);
      $$0.a(dkg.cr, 15, 100);
      $$0.a(dkg.bA, 60, 100);
      $$0.a(dkg.bB, 60, 100);
      $$0.a(dkg.bC, 60, 100);
      $$0.a(dkg.jb, 60, 100);
      $$0.a(dkg.jc, 60, 100);
      $$0.a(dkg.jd, 60, 100);
      $$0.a(dkg.je, 60, 100);
      $$0.a(dkg.jf, 60, 100);
      $$0.a(dkg.jg, 60, 100);
      $$0.a(dkg.bY, 60, 100);
      $$0.a(dkg.ca, 60, 100);
      $$0.a(dkg.ub, 60, 100);
      $$0.a(dkg.uc, 60, 100);
      $$0.a(dkg.cb, 60, 100);
      $$0.a(dkg.cc, 60, 100);
      $$0.a(dkg.cd, 60, 100);
      $$0.a(dkg.ce, 60, 100);
      $$0.a(dkg.cf, 60, 100);
      $$0.a(dkg.cg, 60, 100);
      $$0.a(dkg.ch, 60, 100);
      $$0.a(dkg.ci, 60, 100);
      $$0.a(dkg.cj, 60, 100);
      $$0.a(dkg.cl, 60, 100);
      $$0.a(dkg.bZ, 60, 100);
      $$0.a(dkg.le, 60, 100);
      $$0.a(dkg.ck, 60, 100);
      $$0.a(dkg.td, 60, 100);
      $$0.a(dkg.te, 60, 100);
      $$0.a(dkg.tf, 60, 100);
      $$0.a(dkg.bH, 30, 60);
      $$0.a(dkg.bI, 30, 60);
      $$0.a(dkg.bJ, 30, 60);
      $$0.a(dkg.bK, 30, 60);
      $$0.a(dkg.bL, 30, 60);
      $$0.a(dkg.bM, 30, 60);
      $$0.a(dkg.bN, 30, 60);
      $$0.a(dkg.bO, 30, 60);
      $$0.a(dkg.bP, 30, 60);
      $$0.a(dkg.bQ, 30, 60);
      $$0.a(dkg.bR, 30, 60);
      $$0.a(dkg.bS, 30, 60);
      $$0.a(dkg.bT, 30, 60);
      $$0.a(dkg.bU, 30, 60);
      $$0.a(dkg.bV, 30, 60);
      $$0.a(dkg.bW, 30, 60);
      $$0.a(dkg.ft, 15, 100);
      $$0.a(dkg.iZ, 5, 5);
      $$0.a(dkg.iH, 60, 20);
      $$0.a(dkg.pF, 15, 20);
      $$0.a(dkg.iI, 60, 20);
      $$0.a(dkg.iJ, 60, 20);
      $$0.a(dkg.iK, 60, 20);
      $$0.a(dkg.iL, 60, 20);
      $$0.a(dkg.iM, 60, 20);
      $$0.a(dkg.iN, 60, 20);
      $$0.a(dkg.iO, 60, 20);
      $$0.a(dkg.iP, 60, 20);
      $$0.a(dkg.iQ, 60, 20);
      $$0.a(dkg.iR, 60, 20);
      $$0.a(dkg.iS, 60, 20);
      $$0.a(dkg.iT, 60, 20);
      $$0.a(dkg.iU, 60, 20);
      $$0.a(dkg.iV, 60, 20);
      $$0.a(dkg.iW, 60, 20);
      $$0.a(dkg.iX, 60, 20);
      $$0.a(dkg.tY, 5, 100);
      $$0.a(dkg.tZ, 5, 100);
      $$0.a(dkg.ua, 5, 100);
      $$0.a(dkg.mG, 30, 60);
      $$0.a(dkg.nB, 60, 60);
      $$0.a(dkg.ou, 60, 60);
      $$0.a(dkg.oC, 30, 20);
      $$0.a(dkg.pE, 5, 20);
      $$0.a(dkg.oK, 60, 100);
      $$0.a(dkg.pH, 5, 20);
      $$0.a(dkg.pG, 30, 20);
      $$0.a(dkg.aT, 30, 60);
      $$0.a(dkg.aU, 30, 60);
      $$0.a(dkg.sX, 15, 60);
      $$0.a(dkg.sY, 15, 60);
      $$0.a(dkg.sZ, 60, 100);
      $$0.a(dkg.ta, 30, 60);
      $$0.a(dkg.tb, 30, 60);
      $$0.a(dkg.th, 60, 100);
      $$0.a(dkg.ti, 60, 100);
      $$0.a(dkg.tj, 60, 100);
      $$0.a(dkg.tk, 30, 60);
      $$0.a(dkg.fu, 15, 100);
   }
}
