import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dne extends djq {
   public static final MapCodec<dne> c = b(dne::new);
   public static final int d = 15;
   public static final dyn e = dye.az;
   public static final dyf f = dpv.b;
   public static final dyf g = dpv.c;
   public static final dyf h = dpv.d;
   public static final dyf i = dpv.e;
   public static final dyf j = dpv.f;
   private static final Map<jm, dyf> k = dpv.h.entrySet().stream().filter($$0 -> $$0.getKey() != jm.a).collect(ae.a());
   private static final fcl l = dkd.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcl m = dkd.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcl n = dkd.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcl o = dkd.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcl G = dkd.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dxo, fcl> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<dkd> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<dkd> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dne> a() {
      return c;
   }

   public dne(dxn.d $$0) {
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
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dne::o)));
   }

   private static fcl o(dxo $$0) {
      fcl $$1 = fci.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = fci.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = fci.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = fci.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = fci.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(e)) : dkf.a.m();
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dxo a(dax $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dxo b(dge $$0, jh $$1) {
      jh $$2 = $$1.e();
      dxo $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jm.b)) {
         dxo $$4 = this.m();

         for (jm $$5 : jm.values()) {
            dyf $$6 = k.get($$5);
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
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().b(dgv.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dxo $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.G_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ag() && this.a((dgz)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(axj.ad);
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
                        int $$16 = this.a((dhc)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.am().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ag() || !this.a((dgz)$$1, $$11))) {
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

   protected boolean a(dgz $$0, jh $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dxo $$0) {
      return $$0.b(dye.J) && $$0.c(dye.J) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dxo $$0) {
      return $$0.b(dye.J) && $$0.c(dye.J) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dgz $$0, jh $$1, int $$2, bac $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dxo $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dkd $$8 = $$6.b();
         if ($$8 instanceof dsr) {
            dsr.a($$0, $$1);
         }
      }
   }

   private dxo a(dhc $$0, jh $$1, int $$2) {
      dxo $$3 = a((dge)$$0, $$1);
      return $$3.a(dkf.cy) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dge $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dhc $$0, jh $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jm $$3 : jm.values()) {
            dxo $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dxo $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(bac $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dkd $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dne $$0 = (dne)dkf.cy;
      $$0.a(dkf.n, 5, 20);
      $$0.a(dkf.o, 5, 20);
      $$0.a(dkf.p, 5, 20);
      $$0.a(dkf.q, 5, 20);
      $$0.a(dkf.r, 5, 20);
      $$0.a(dkf.s, 5, 20);
      $$0.a(dkf.t, 5, 20);
      $$0.a(dkf.v, 5, 20);
      $$0.a(dkf.w, 5, 20);
      $$0.a(dkf.x, 5, 20);
      $$0.a(dkf.y, 5, 20);
      $$0.a(dkf.jR, 5, 20);
      $$0.a(dkf.jS, 5, 20);
      $$0.a(dkf.jT, 5, 20);
      $$0.a(dkf.jU, 5, 20);
      $$0.a(dkf.jV, 5, 20);
      $$0.a(dkf.jW, 5, 20);
      $$0.a(dkf.jX, 5, 20);
      $$0.a(dkf.jY, 5, 20);
      $$0.a(dkf.jZ, 5, 20);
      $$0.a(dkf.ka, 5, 20);
      $$0.a(dkf.kb, 5, 20);
      $$0.a(dkf.fw, 5, 20);
      $$0.a(dkf.ku, 5, 20);
      $$0.a(dkf.kv, 5, 20);
      $$0.a(dkf.kw, 5, 20);
      $$0.a(dkf.kx, 5, 20);
      $$0.a(dkf.ky, 5, 20);
      $$0.a(dkf.kz, 5, 20);
      $$0.a(dkf.kA, 5, 20);
      $$0.a(dkf.kB, 5, 20);
      $$0.a(dkf.kC, 5, 20);
      $$0.a(dkf.eh, 5, 20);
      $$0.a(dkf.kD, 5, 20);
      $$0.a(dkf.kE, 5, 20);
      $$0.a(dkf.kF, 5, 20);
      $$0.a(dkf.kG, 5, 20);
      $$0.a(dkf.kH, 5, 20);
      $$0.a(dkf.kI, 5, 20);
      $$0.a(dkf.kJ, 5, 20);
      $$0.a(dkf.kK, 5, 20);
      $$0.a(dkf.kL, 5, 20);
      $$0.a(dkf.cC, 5, 20);
      $$0.a(dkf.gg, 5, 20);
      $$0.a(dkf.gf, 5, 20);
      $$0.a(dkf.gh, 5, 20);
      $$0.a(dkf.im, 5, 20);
      $$0.a(dkf.in, 5, 20);
      $$0.a(dkf.io, 5, 20);
      $$0.a(dkf.ip, 5, 20);
      $$0.a(dkf.iq, 5, 20);
      $$0.a(dkf.ir, 5, 20);
      $$0.a(dkf.is, 5, 20);
      $$0.a(dkf.X, 5, 5);
      $$0.a(dkf.Y, 5, 5);
      $$0.a(dkf.Z, 5, 5);
      $$0.a(dkf.aa, 5, 5);
      $$0.a(dkf.ab, 5, 5);
      $$0.a(dkf.ac, 5, 5);
      $$0.a(dkf.ae, 5, 5);
      $$0.a(dkf.ad, 5, 5);
      $$0.a(dkf.af, 5, 5);
      $$0.a(dkf.ai, 5, 5);
      $$0.a(dkf.aq, 5, 5);
      $$0.a(dkf.aj, 5, 5);
      $$0.a(dkf.ak, 5, 5);
      $$0.a(dkf.al, 5, 5);
      $$0.a(dkf.am, 5, 5);
      $$0.a(dkf.an, 5, 5);
      $$0.a(dkf.ao, 5, 5);
      $$0.a(dkf.ap, 5, 5);
      $$0.a(dkf.ar, 5, 5);
      $$0.a(dkf.as, 5, 5);
      $$0.a(dkf.aB, 5, 5);
      $$0.a(dkf.aC, 5, 5);
      $$0.a(dkf.aD, 5, 5);
      $$0.a(dkf.aE, 5, 5);
      $$0.a(dkf.aF, 5, 5);
      $$0.a(dkf.aG, 5, 5);
      $$0.a(dkf.aH, 5, 5);
      $$0.a(dkf.aI, 5, 5);
      $$0.a(dkf.aJ, 5, 5);
      $$0.a(dkf.at, 5, 5);
      $$0.a(dkf.au, 5, 5);
      $$0.a(dkf.av, 5, 5);
      $$0.a(dkf.aw, 5, 5);
      $$0.a(dkf.ax, 5, 5);
      $$0.a(dkf.ay, 5, 5);
      $$0.a(dkf.u, 5, 5);
      $$0.a(dkf.az, 5, 5);
      $$0.a(dkf.aA, 5, 5);
      $$0.a(dkf.ag, 5, 20);
      $$0.a(dkf.aK, 30, 60);
      $$0.a(dkf.aL, 30, 60);
      $$0.a(dkf.aM, 30, 60);
      $$0.a(dkf.aN, 30, 60);
      $$0.a(dkf.aO, 30, 60);
      $$0.a(dkf.aP, 30, 60);
      $$0.a(dkf.aQ, 30, 60);
      $$0.a(dkf.aR, 30, 60);
      $$0.a(dkf.aS, 30, 60);
      $$0.a(dkf.cs, 30, 20);
      $$0.a(dkf.cr, 15, 100);
      $$0.a(dkf.bA, 60, 100);
      $$0.a(dkf.bB, 60, 100);
      $$0.a(dkf.bC, 60, 100);
      $$0.a(dkf.jb, 60, 100);
      $$0.a(dkf.jc, 60, 100);
      $$0.a(dkf.jd, 60, 100);
      $$0.a(dkf.je, 60, 100);
      $$0.a(dkf.jf, 60, 100);
      $$0.a(dkf.jg, 60, 100);
      $$0.a(dkf.bY, 60, 100);
      $$0.a(dkf.ca, 60, 100);
      $$0.a(dkf.tZ, 60, 100);
      $$0.a(dkf.ua, 60, 100);
      $$0.a(dkf.cb, 60, 100);
      $$0.a(dkf.cc, 60, 100);
      $$0.a(dkf.cd, 60, 100);
      $$0.a(dkf.ce, 60, 100);
      $$0.a(dkf.cf, 60, 100);
      $$0.a(dkf.cg, 60, 100);
      $$0.a(dkf.ch, 60, 100);
      $$0.a(dkf.ci, 60, 100);
      $$0.a(dkf.cj, 60, 100);
      $$0.a(dkf.cl, 60, 100);
      $$0.a(dkf.bZ, 60, 100);
      $$0.a(dkf.le, 60, 100);
      $$0.a(dkf.ck, 60, 100);
      $$0.a(dkf.td, 60, 100);
      $$0.a(dkf.bH, 30, 60);
      $$0.a(dkf.bI, 30, 60);
      $$0.a(dkf.bJ, 30, 60);
      $$0.a(dkf.bK, 30, 60);
      $$0.a(dkf.bL, 30, 60);
      $$0.a(dkf.bM, 30, 60);
      $$0.a(dkf.bN, 30, 60);
      $$0.a(dkf.bO, 30, 60);
      $$0.a(dkf.bP, 30, 60);
      $$0.a(dkf.bQ, 30, 60);
      $$0.a(dkf.bR, 30, 60);
      $$0.a(dkf.bS, 30, 60);
      $$0.a(dkf.bT, 30, 60);
      $$0.a(dkf.bU, 30, 60);
      $$0.a(dkf.bV, 30, 60);
      $$0.a(dkf.bW, 30, 60);
      $$0.a(dkf.ft, 15, 100);
      $$0.a(dkf.iZ, 5, 5);
      $$0.a(dkf.iH, 60, 20);
      $$0.a(dkf.pF, 15, 20);
      $$0.a(dkf.iI, 60, 20);
      $$0.a(dkf.iJ, 60, 20);
      $$0.a(dkf.iK, 60, 20);
      $$0.a(dkf.iL, 60, 20);
      $$0.a(dkf.iM, 60, 20);
      $$0.a(dkf.iN, 60, 20);
      $$0.a(dkf.iO, 60, 20);
      $$0.a(dkf.iP, 60, 20);
      $$0.a(dkf.iQ, 60, 20);
      $$0.a(dkf.iR, 60, 20);
      $$0.a(dkf.iS, 60, 20);
      $$0.a(dkf.iT, 60, 20);
      $$0.a(dkf.iU, 60, 20);
      $$0.a(dkf.iV, 60, 20);
      $$0.a(dkf.iW, 60, 20);
      $$0.a(dkf.iX, 60, 20);
      $$0.a(dkf.tW, 5, 100);
      $$0.a(dkf.tX, 5, 100);
      $$0.a(dkf.tY, 5, 100);
      $$0.a(dkf.mG, 30, 60);
      $$0.a(dkf.nB, 60, 60);
      $$0.a(dkf.ou, 60, 60);
      $$0.a(dkf.oC, 30, 20);
      $$0.a(dkf.pE, 5, 20);
      $$0.a(dkf.oK, 60, 100);
      $$0.a(dkf.pH, 5, 20);
      $$0.a(dkf.pG, 30, 20);
      $$0.a(dkf.aT, 30, 60);
      $$0.a(dkf.aU, 30, 60);
      $$0.a(dkf.sX, 15, 60);
      $$0.a(dkf.sY, 15, 60);
      $$0.a(dkf.sZ, 60, 100);
      $$0.a(dkf.ta, 30, 60);
      $$0.a(dkf.tb, 30, 60);
      $$0.a(dkf.tf, 60, 100);
      $$0.a(dkf.tg, 60, 100);
      $$0.a(dkf.th, 60, 100);
      $$0.a(dkf.ti, 30, 60);
      $$0.a(dkf.fu, 15, 100);
   }
}
