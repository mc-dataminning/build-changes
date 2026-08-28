import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class dqe extends dmp {
   public static final MapCodec<dqe> b = b(dqe::new);
   public static final int c = 15;
   public static final ece d = ebu.az;
   public static final ebv e = dsw.b;
   public static final ebv f = dsw.c;
   public static final ebv g = dsw.d;
   public static final ebv h = dsw.e;
   public static final ebv i = dsw.f;
   public static final Map<jb, ebv> D = dsw.h.entrySet().stream().filter($$0 -> $$0.getKey() != jb.a).collect(ag.a());
   private final Function<ebe, fgk> R;
   private static final int S = 60;
   private static final int T = 30;
   private static final int U = 15;
   private static final int V = 5;
   private static final int W = 100;
   private static final int X = 60;
   private static final int Y = 20;
   private static final int Z = 5;
   private final Object2IntMap<dnc> aa = new Object2IntOpenHashMap();
   private final Object2IntMap<dnc> ab = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dqe> a() {
      return b;
   }

   public dqe(ebd.d $$0) {
      super($$0, 1.0F);
      this.l(
         this.C
            .b()
            .b(d, Integer.valueOf(0))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
            .b(i, Boolean.valueOf(false))
      );
      this.R = this.q();
   }

   private Function<ebe, fgk> q() {
      Map<jb, fgk> $$0 = fgh.d(dnc.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fgk $$2 = fgh.a();

         for (Entry<jb, ebv> $$3 : D.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fgh.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? a : $$2;
      }, new ech[]{d});
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(d)) : dne.a.m();
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.R.apply($$0);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected ebe b(djb $$0, iv $$1) {
      iv $$2 = $$1.e();
      ebe $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jb.b)) {
         ebe $$4 = this.m();

         for (jb $$5 : jb.values()) {
            ebv $$6 = D.get($$5);
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
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jb.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().c(djt.b)) {
         if ($$1.O().c(djt.c) || $$1.g($$2)) {
            if (!$$0.a($$1, $$2)) {
               $$1.a($$2, false);
            }

            ebe $$4 = $$1.a_($$2.e());
            boolean $$5 = $$4.a($$1.F_().q());
            int $$6 = $$0.c(d);
            if (!$$5 && $$1.ah() && this.a((djx)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
               $$1.a($$2, false);
            } else {
               int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
               if ($$6 != $$7) {
                  $$0 = $$0.b(d, Integer.valueOf($$7));
                  $$1.a($$2, $$0, 260);
               }

               if (!$$5) {
                  if (!this.d($$1, $$2)) {
                     iv $$8 = $$2.e();
                     if (!$$1.a_($$8).c($$1, $$8, jb.b) || $$6 > 3) {
                        $$1.a($$2, false);
                     }

                     return;
                  }

                  if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                     $$1.a($$2, false);
                     return;
                  }
               }

               boolean $$9 = $$1.u($$2).a(axd.ad);
               int $$10 = $$9 ? -50 : 0;
               this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
               this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
               this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
               this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
               this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
               this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
               iv.a $$11 = new iv.a();

               for (int $$12 = -1; $$12 <= 1; $$12++) {
                  for (int $$13 = -1; $$13 <= 1; $$13++) {
                     for (int $$14 = -1; $$14 <= 4; $$14++) {
                        if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                           int $$15 = 100;
                           if ($$14 > 1) {
                              $$15 += ($$14 - 1) * 100;
                           }

                           $$11.a($$2, $$12, $$14, $$13);
                           int $$16 = this.a((dka)$$1, $$11);
                           if ($$16 > 0) {
                              int $$17 = ($$16 + 40 + $$1.an().a() * 7) / ($$6 + 30);
                              if ($$9) {
                                 $$17 /= 2;
                              }

                              if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ah() || !this.a((djx)$$1, $$11))) {
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
   }

   protected boolean a(djx $$0, iv $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int o(ebe $$0) {
      return $$0.b(ebu.I) && $$0.c(ebu.I) ? 0 : this.ab.getInt($$0.b());
   }

   private int q(ebe $$0) {
      return $$0.b(ebu.I) && $$0.c(ebu.I) ? 0 : this.aa.getInt($$0.b());
   }

   private void a(djx $$0, iv $$1, int $$2, azx $$3, int $$4) {
      int $$5 = this.o($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         ebe $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dnc $$8 = $$6.b();
         if ($$8 instanceof dwa) {
            dwa.a($$0, $$1);
         }
      }
   }

   private ebe a(dka $$0, iv $$1, int $$2) {
      ebe $$3 = a((djb)$$0, $$1);
      return $$3.a(dne.cB) ? $$3.b(d, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(djb $$0, iv $$1) {
      for (jb $$2 : jb.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dka $$0, iv $$1) {
      if (!$$0.v($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jb $$3 : jb.values()) {
            ebe $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.q($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(ebe $$0) {
      return this.q($$0) > 0;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azx $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(d, e, f, g, h, i);
   }

   public void a(dnc $$0, int $$1, int $$2) {
      this.aa.put($$0, $$1);
      this.ab.put($$0, $$2);
   }

   public static void b() {
      dqe $$0 = (dqe)dne.cB;
      $$0.a(dne.n, 5, 20);
      $$0.a(dne.o, 5, 20);
      $$0.a(dne.p, 5, 20);
      $$0.a(dne.q, 5, 20);
      $$0.a(dne.r, 5, 20);
      $$0.a(dne.s, 5, 20);
      $$0.a(dne.t, 5, 20);
      $$0.a(dne.v, 5, 20);
      $$0.a(dne.w, 5, 20);
      $$0.a(dne.x, 5, 20);
      $$0.a(dne.y, 5, 20);
      $$0.a(dne.jV, 5, 20);
      $$0.a(dne.jW, 5, 20);
      $$0.a(dne.jX, 5, 20);
      $$0.a(dne.jY, 5, 20);
      $$0.a(dne.jZ, 5, 20);
      $$0.a(dne.ka, 5, 20);
      $$0.a(dne.kb, 5, 20);
      $$0.a(dne.kc, 5, 20);
      $$0.a(dne.kd, 5, 20);
      $$0.a(dne.ke, 5, 20);
      $$0.a(dne.kf, 5, 20);
      $$0.a(dne.fA, 5, 20);
      $$0.a(dne.ky, 5, 20);
      $$0.a(dne.kz, 5, 20);
      $$0.a(dne.kA, 5, 20);
      $$0.a(dne.kB, 5, 20);
      $$0.a(dne.kC, 5, 20);
      $$0.a(dne.kD, 5, 20);
      $$0.a(dne.kE, 5, 20);
      $$0.a(dne.kF, 5, 20);
      $$0.a(dne.kG, 5, 20);
      $$0.a(dne.el, 5, 20);
      $$0.a(dne.kH, 5, 20);
      $$0.a(dne.kI, 5, 20);
      $$0.a(dne.kJ, 5, 20);
      $$0.a(dne.kK, 5, 20);
      $$0.a(dne.kL, 5, 20);
      $$0.a(dne.kM, 5, 20);
      $$0.a(dne.kN, 5, 20);
      $$0.a(dne.kO, 5, 20);
      $$0.a(dne.kP, 5, 20);
      $$0.a(dne.cF, 5, 20);
      $$0.a(dne.gk, 5, 20);
      $$0.a(dne.gj, 5, 20);
      $$0.a(dne.gl, 5, 20);
      $$0.a(dne.iq, 5, 20);
      $$0.a(dne.ir, 5, 20);
      $$0.a(dne.is, 5, 20);
      $$0.a(dne.it, 5, 20);
      $$0.a(dne.iu, 5, 20);
      $$0.a(dne.iv, 5, 20);
      $$0.a(dne.iw, 5, 20);
      $$0.a(dne.X, 5, 5);
      $$0.a(dne.Y, 5, 5);
      $$0.a(dne.Z, 5, 5);
      $$0.a(dne.aa, 5, 5);
      $$0.a(dne.ab, 5, 5);
      $$0.a(dne.ac, 5, 5);
      $$0.a(dne.ae, 5, 5);
      $$0.a(dne.ad, 5, 5);
      $$0.a(dne.af, 5, 5);
      $$0.a(dne.ai, 5, 5);
      $$0.a(dne.aq, 5, 5);
      $$0.a(dne.aj, 5, 5);
      $$0.a(dne.ak, 5, 5);
      $$0.a(dne.al, 5, 5);
      $$0.a(dne.am, 5, 5);
      $$0.a(dne.an, 5, 5);
      $$0.a(dne.ao, 5, 5);
      $$0.a(dne.ap, 5, 5);
      $$0.a(dne.ar, 5, 5);
      $$0.a(dne.as, 5, 5);
      $$0.a(dne.aB, 5, 5);
      $$0.a(dne.aC, 5, 5);
      $$0.a(dne.aD, 5, 5);
      $$0.a(dne.aE, 5, 5);
      $$0.a(dne.aF, 5, 5);
      $$0.a(dne.aG, 5, 5);
      $$0.a(dne.aH, 5, 5);
      $$0.a(dne.aI, 5, 5);
      $$0.a(dne.aJ, 5, 5);
      $$0.a(dne.at, 5, 5);
      $$0.a(dne.au, 5, 5);
      $$0.a(dne.av, 5, 5);
      $$0.a(dne.aw, 5, 5);
      $$0.a(dne.ax, 5, 5);
      $$0.a(dne.ay, 5, 5);
      $$0.a(dne.u, 5, 5);
      $$0.a(dne.az, 5, 5);
      $$0.a(dne.aA, 5, 5);
      $$0.a(dne.ag, 5, 20);
      $$0.a(dne.aK, 30, 60);
      $$0.a(dne.aL, 30, 60);
      $$0.a(dne.aM, 30, 60);
      $$0.a(dne.aN, 30, 60);
      $$0.a(dne.aO, 30, 60);
      $$0.a(dne.aP, 30, 60);
      $$0.a(dne.aQ, 30, 60);
      $$0.a(dne.aR, 30, 60);
      $$0.a(dne.aS, 30, 60);
      $$0.a(dne.cv, 30, 20);
      $$0.a(dne.cu, 15, 100);
      $$0.a(dne.bA, 60, 100);
      $$0.a(dne.bB, 60, 100);
      $$0.a(dne.bC, 60, 100);
      $$0.a(dne.bE, 60, 100);
      $$0.a(dne.bF, 60, 100);
      $$0.a(dne.jf, 60, 100);
      $$0.a(dne.jg, 60, 100);
      $$0.a(dne.jh, 60, 100);
      $$0.a(dne.ji, 60, 100);
      $$0.a(dne.jj, 60, 100);
      $$0.a(dne.jk, 60, 100);
      $$0.a(dne.cb, 60, 100);
      $$0.a(dne.cd, 60, 100);
      $$0.a(dne.uh, 60, 100);
      $$0.a(dne.ui, 60, 100);
      $$0.a(dne.ce, 60, 100);
      $$0.a(dne.cf, 60, 100);
      $$0.a(dne.cg, 60, 100);
      $$0.a(dne.ch, 60, 100);
      $$0.a(dne.ci, 60, 100);
      $$0.a(dne.cj, 60, 100);
      $$0.a(dne.ck, 60, 100);
      $$0.a(dne.cl, 60, 100);
      $$0.a(dne.cm, 60, 100);
      $$0.a(dne.co, 60, 100);
      $$0.a(dne.cc, 60, 100);
      $$0.a(dne.li, 60, 100);
      $$0.a(dne.cn, 60, 100);
      $$0.a(dne.tj, 60, 100);
      $$0.a(dne.tk, 60, 100);
      $$0.a(dne.tl, 60, 100);
      $$0.a(dne.eh, 60, 100);
      $$0.a(dne.bK, 30, 60);
      $$0.a(dne.bL, 30, 60);
      $$0.a(dne.bM, 30, 60);
      $$0.a(dne.bN, 30, 60);
      $$0.a(dne.bO, 30, 60);
      $$0.a(dne.bP, 30, 60);
      $$0.a(dne.bQ, 30, 60);
      $$0.a(dne.bR, 30, 60);
      $$0.a(dne.bS, 30, 60);
      $$0.a(dne.bT, 30, 60);
      $$0.a(dne.bU, 30, 60);
      $$0.a(dne.bV, 30, 60);
      $$0.a(dne.bW, 30, 60);
      $$0.a(dne.bX, 30, 60);
      $$0.a(dne.bY, 30, 60);
      $$0.a(dne.bZ, 30, 60);
      $$0.a(dne.fx, 15, 100);
      $$0.a(dne.jd, 5, 5);
      $$0.a(dne.iL, 60, 20);
      $$0.a(dne.pL, 15, 20);
      $$0.a(dne.iM, 60, 20);
      $$0.a(dne.iN, 60, 20);
      $$0.a(dne.iO, 60, 20);
      $$0.a(dne.iP, 60, 20);
      $$0.a(dne.iQ, 60, 20);
      $$0.a(dne.iR, 60, 20);
      $$0.a(dne.iS, 60, 20);
      $$0.a(dne.iT, 60, 20);
      $$0.a(dne.iU, 60, 20);
      $$0.a(dne.iV, 60, 20);
      $$0.a(dne.iW, 60, 20);
      $$0.a(dne.iX, 60, 20);
      $$0.a(dne.iY, 60, 20);
      $$0.a(dne.iZ, 60, 20);
      $$0.a(dne.ja, 60, 20);
      $$0.a(dne.jb, 60, 20);
      $$0.a(dne.ue, 5, 100);
      $$0.a(dne.uf, 5, 100);
      $$0.a(dne.ug, 5, 100);
      $$0.a(dne.mK, 30, 60);
      $$0.a(dne.nF, 60, 60);
      $$0.a(dne.oy, 60, 60);
      $$0.a(dne.oG, 30, 20);
      $$0.a(dne.pK, 5, 20);
      $$0.a(dne.oO, 60, 100);
      $$0.a(dne.pN, 5, 20);
      $$0.a(dne.pM, 30, 20);
      $$0.a(dne.aT, 30, 60);
      $$0.a(dne.aU, 30, 60);
      $$0.a(dne.td, 15, 60);
      $$0.a(dne.te, 15, 60);
      $$0.a(dne.tf, 60, 100);
      $$0.a(dne.tg, 30, 60);
      $$0.a(dne.th, 30, 60);
      $$0.a(dne.tn, 60, 100);
      $$0.a(dne.to, 60, 100);
      $$0.a(dne.tp, 60, 100);
      $$0.a(dne.tq, 30, 60);
      $$0.a(dne.fy, 15, 100);
      $$0.a(dne.ul, 60, 100);
      $$0.a(dne.bD, 60, 100);
   }
}
