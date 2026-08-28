import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dmo extends dja {
   public static final MapCodec<dmo> c = b(dmo::new);
   public static final int d = 15;
   public static final dxx e = dxo.az;
   public static final dxp f = dpf.b;
   public static final dxp g = dpf.c;
   public static final dxp h = dpf.d;
   public static final dxp i = dpf.e;
   public static final dxp j = dpf.f;
   private static final Map<jn, dxp> k = dpf.h.entrySet().stream().filter($$0 -> $$0.getKey() != jn.a).collect(af.a());
   private static final fbv l = djn.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbv m = djn.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbv n = djn.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbv o = djn.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbv G = djn.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dwy, fbv> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<djn> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<djn> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dmo> a() {
      return c;
   }

   public dmo(dwx.d $$0) {
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
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dmo::o)));
   }

   private static fbv o(dwy $$0) {
      fbv $$1 = fbs.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = fbs.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = fbs.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = fbs.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = fbs.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(e)) : djp.a.m();
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dwy a(dah $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dwy b(dfo $$0, ji $$1) {
      ji $$2 = $$1.e();
      dwy $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jn.b)) {
         dwy $$4 = this.m();

         for (jn $$5 : jn.values()) {
            dxp $$6 = k.get($$5);
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
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jn.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().b(dgf.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dwy $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.G_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ag() && this.a((dgj)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.b(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
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
                        int $$16 = this.a((dgm)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.am().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ag() || !this.a((dgj)$$1, $$11))) {
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

   protected boolean a(dgj $$0, ji $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dwy $$0) {
      return $$0.b(dxo.J) && $$0.c(dxo.J) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dwy $$0) {
      return $$0.b(dxo.J) && $$0.c(dxo.J) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dgj $$0, ji $$1, int $$2, azh $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dwy $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         djn $$8 = $$6.b();
         if ($$8 instanceof dsb) {
            dsb.a($$0, $$1);
         }
      }
   }

   private dwy a(dgm $$0, ji $$1, int $$2) {
      dwy $$3 = a((dfo)$$0, $$1);
      return $$3.a(djp.cy) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dfo $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dgm $$0, ji $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jn $$3 : jn.values()) {
            dwy $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dwy $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azh $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(djn $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dmo $$0 = (dmo)djp.cy;
      $$0.a(djp.n, 5, 20);
      $$0.a(djp.o, 5, 20);
      $$0.a(djp.p, 5, 20);
      $$0.a(djp.q, 5, 20);
      $$0.a(djp.r, 5, 20);
      $$0.a(djp.s, 5, 20);
      $$0.a(djp.t, 5, 20);
      $$0.a(djp.v, 5, 20);
      $$0.a(djp.w, 5, 20);
      $$0.a(djp.x, 5, 20);
      $$0.a(djp.y, 5, 20);
      $$0.a(djp.jR, 5, 20);
      $$0.a(djp.jS, 5, 20);
      $$0.a(djp.jT, 5, 20);
      $$0.a(djp.jU, 5, 20);
      $$0.a(djp.jV, 5, 20);
      $$0.a(djp.jW, 5, 20);
      $$0.a(djp.jX, 5, 20);
      $$0.a(djp.jY, 5, 20);
      $$0.a(djp.jZ, 5, 20);
      $$0.a(djp.ka, 5, 20);
      $$0.a(djp.kb, 5, 20);
      $$0.a(djp.fw, 5, 20);
      $$0.a(djp.ku, 5, 20);
      $$0.a(djp.kv, 5, 20);
      $$0.a(djp.kw, 5, 20);
      $$0.a(djp.kx, 5, 20);
      $$0.a(djp.ky, 5, 20);
      $$0.a(djp.kz, 5, 20);
      $$0.a(djp.kA, 5, 20);
      $$0.a(djp.kB, 5, 20);
      $$0.a(djp.kC, 5, 20);
      $$0.a(djp.eh, 5, 20);
      $$0.a(djp.kD, 5, 20);
      $$0.a(djp.kE, 5, 20);
      $$0.a(djp.kF, 5, 20);
      $$0.a(djp.kG, 5, 20);
      $$0.a(djp.kH, 5, 20);
      $$0.a(djp.kI, 5, 20);
      $$0.a(djp.kJ, 5, 20);
      $$0.a(djp.kK, 5, 20);
      $$0.a(djp.kL, 5, 20);
      $$0.a(djp.cC, 5, 20);
      $$0.a(djp.gg, 5, 20);
      $$0.a(djp.gf, 5, 20);
      $$0.a(djp.gh, 5, 20);
      $$0.a(djp.im, 5, 20);
      $$0.a(djp.in, 5, 20);
      $$0.a(djp.io, 5, 20);
      $$0.a(djp.ip, 5, 20);
      $$0.a(djp.iq, 5, 20);
      $$0.a(djp.ir, 5, 20);
      $$0.a(djp.is, 5, 20);
      $$0.a(djp.X, 5, 5);
      $$0.a(djp.Y, 5, 5);
      $$0.a(djp.Z, 5, 5);
      $$0.a(djp.aa, 5, 5);
      $$0.a(djp.ab, 5, 5);
      $$0.a(djp.ac, 5, 5);
      $$0.a(djp.ae, 5, 5);
      $$0.a(djp.ad, 5, 5);
      $$0.a(djp.af, 5, 5);
      $$0.a(djp.ai, 5, 5);
      $$0.a(djp.aq, 5, 5);
      $$0.a(djp.aj, 5, 5);
      $$0.a(djp.ak, 5, 5);
      $$0.a(djp.al, 5, 5);
      $$0.a(djp.am, 5, 5);
      $$0.a(djp.an, 5, 5);
      $$0.a(djp.ao, 5, 5);
      $$0.a(djp.ap, 5, 5);
      $$0.a(djp.ar, 5, 5);
      $$0.a(djp.as, 5, 5);
      $$0.a(djp.aB, 5, 5);
      $$0.a(djp.aC, 5, 5);
      $$0.a(djp.aD, 5, 5);
      $$0.a(djp.aE, 5, 5);
      $$0.a(djp.aF, 5, 5);
      $$0.a(djp.aG, 5, 5);
      $$0.a(djp.aH, 5, 5);
      $$0.a(djp.aI, 5, 5);
      $$0.a(djp.aJ, 5, 5);
      $$0.a(djp.at, 5, 5);
      $$0.a(djp.au, 5, 5);
      $$0.a(djp.av, 5, 5);
      $$0.a(djp.aw, 5, 5);
      $$0.a(djp.ax, 5, 5);
      $$0.a(djp.ay, 5, 5);
      $$0.a(djp.u, 5, 5);
      $$0.a(djp.az, 5, 5);
      $$0.a(djp.aA, 5, 5);
      $$0.a(djp.ag, 5, 20);
      $$0.a(djp.aK, 30, 60);
      $$0.a(djp.aL, 30, 60);
      $$0.a(djp.aM, 30, 60);
      $$0.a(djp.aN, 30, 60);
      $$0.a(djp.aO, 30, 60);
      $$0.a(djp.aP, 30, 60);
      $$0.a(djp.aQ, 30, 60);
      $$0.a(djp.aR, 30, 60);
      $$0.a(djp.aS, 30, 60);
      $$0.a(djp.cs, 30, 20);
      $$0.a(djp.cr, 15, 100);
      $$0.a(djp.bA, 60, 100);
      $$0.a(djp.bB, 60, 100);
      $$0.a(djp.bC, 60, 100);
      $$0.a(djp.jb, 60, 100);
      $$0.a(djp.jc, 60, 100);
      $$0.a(djp.jd, 60, 100);
      $$0.a(djp.je, 60, 100);
      $$0.a(djp.jf, 60, 100);
      $$0.a(djp.jg, 60, 100);
      $$0.a(djp.bY, 60, 100);
      $$0.a(djp.ca, 60, 100);
      $$0.a(djp.tZ, 60, 100);
      $$0.a(djp.ua, 60, 100);
      $$0.a(djp.cb, 60, 100);
      $$0.a(djp.cc, 60, 100);
      $$0.a(djp.cd, 60, 100);
      $$0.a(djp.ce, 60, 100);
      $$0.a(djp.cf, 60, 100);
      $$0.a(djp.cg, 60, 100);
      $$0.a(djp.ch, 60, 100);
      $$0.a(djp.ci, 60, 100);
      $$0.a(djp.cj, 60, 100);
      $$0.a(djp.cl, 60, 100);
      $$0.a(djp.bZ, 60, 100);
      $$0.a(djp.le, 60, 100);
      $$0.a(djp.ck, 60, 100);
      $$0.a(djp.td, 60, 100);
      $$0.a(djp.bH, 30, 60);
      $$0.a(djp.bI, 30, 60);
      $$0.a(djp.bJ, 30, 60);
      $$0.a(djp.bK, 30, 60);
      $$0.a(djp.bL, 30, 60);
      $$0.a(djp.bM, 30, 60);
      $$0.a(djp.bN, 30, 60);
      $$0.a(djp.bO, 30, 60);
      $$0.a(djp.bP, 30, 60);
      $$0.a(djp.bQ, 30, 60);
      $$0.a(djp.bR, 30, 60);
      $$0.a(djp.bS, 30, 60);
      $$0.a(djp.bT, 30, 60);
      $$0.a(djp.bU, 30, 60);
      $$0.a(djp.bV, 30, 60);
      $$0.a(djp.bW, 30, 60);
      $$0.a(djp.ft, 15, 100);
      $$0.a(djp.iZ, 5, 5);
      $$0.a(djp.iH, 60, 20);
      $$0.a(djp.pF, 15, 20);
      $$0.a(djp.iI, 60, 20);
      $$0.a(djp.iJ, 60, 20);
      $$0.a(djp.iK, 60, 20);
      $$0.a(djp.iL, 60, 20);
      $$0.a(djp.iM, 60, 20);
      $$0.a(djp.iN, 60, 20);
      $$0.a(djp.iO, 60, 20);
      $$0.a(djp.iP, 60, 20);
      $$0.a(djp.iQ, 60, 20);
      $$0.a(djp.iR, 60, 20);
      $$0.a(djp.iS, 60, 20);
      $$0.a(djp.iT, 60, 20);
      $$0.a(djp.iU, 60, 20);
      $$0.a(djp.iV, 60, 20);
      $$0.a(djp.iW, 60, 20);
      $$0.a(djp.iX, 60, 20);
      $$0.a(djp.tW, 5, 100);
      $$0.a(djp.tX, 5, 100);
      $$0.a(djp.tY, 5, 100);
      $$0.a(djp.mG, 30, 60);
      $$0.a(djp.nB, 60, 60);
      $$0.a(djp.ou, 60, 60);
      $$0.a(djp.oC, 30, 20);
      $$0.a(djp.pE, 5, 20);
      $$0.a(djp.oK, 60, 100);
      $$0.a(djp.pH, 5, 20);
      $$0.a(djp.pG, 30, 20);
      $$0.a(djp.aT, 30, 60);
      $$0.a(djp.aU, 30, 60);
      $$0.a(djp.sX, 15, 60);
      $$0.a(djp.sY, 15, 60);
      $$0.a(djp.sZ, 60, 100);
      $$0.a(djp.ta, 30, 60);
      $$0.a(djp.tb, 30, 60);
      $$0.a(djp.tf, 60, 100);
      $$0.a(djp.tg, 60, 100);
      $$0.a(djp.th, 60, 100);
      $$0.a(djp.ti, 30, 60);
      $$0.a(djp.fu, 15, 100);
   }
}
