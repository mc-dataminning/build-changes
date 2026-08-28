import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dnn extends djz {
   public static final MapCodec<dnn> c = b(dnn::new);
   public static final int d = 15;
   public static final dyu e = dyl.ax;
   public static final dym f = dqc.b;
   public static final dym g = dqc.c;
   public static final dym h = dqc.d;
   public static final dym i = dqc.e;
   public static final dym j = dqc.f;
   private static final Map<jm, dym> k = dqc.h.entrySet().stream().filter($$0 -> $$0.getKey() != jm.a).collect(ae.a());
   private static final fcs l = dkm.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcs m = dkm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcs n = dkm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcs o = dkm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcs G = dkm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dxv, fcs> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<dkm> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<dkm> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dnn> a() {
      return c;
   }

   public dnn(dxu.d $$0) {
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
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dnn::o)));
   }

   private static fcs o(dxv $$0) {
      fcs $$1 = fcp.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = fcp.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = fcp.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = fcp.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = fcp.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(e)) : dko.a.m();
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dxv a(dbg $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dxv b(dgn $$0, jh $$1) {
      jh $$2 = $$1.e();
      dxv $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jm.b)) {
         dxv $$4 = this.m();

         for (jm $$5 : jm.values()) {
            dym $$6 = k.get($$5);
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
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.N().b(dhe.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dxv $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.G_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.af() && this.a((dhi)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(axt.ad);
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
                        int $$16 = this.a((dhl)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.af() || !this.a((dhi)$$1, $$11))) {
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

   protected boolean a(dhi $$0, jh $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dxv $$0) {
      return $$0.b(dyl.D) && $$0.c(dyl.D) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dxv $$0) {
      return $$0.b(dyl.D) && $$0.c(dyl.D) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dhi $$0, jh $$1, int $$2, bam $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dxv $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dkm $$8 = $$6.b();
         if ($$8 instanceof dsy) {
            dsy.a($$0, $$1);
         }
      }
   }

   private dxv a(dhl $$0, jh $$1, int $$2) {
      dxv $$3 = a((dgn)$$0, $$1);
      return $$3.a(dko.cy) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dgn $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dhl $$0, jh $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jm $$3 : jm.values()) {
            dxv $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dxv $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(bam $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dkm $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dnn $$0 = (dnn)dko.cy;
      $$0.a(dko.n, 5, 20);
      $$0.a(dko.o, 5, 20);
      $$0.a(dko.p, 5, 20);
      $$0.a(dko.q, 5, 20);
      $$0.a(dko.r, 5, 20);
      $$0.a(dko.s, 5, 20);
      $$0.a(dko.t, 5, 20);
      $$0.a(dko.v, 5, 20);
      $$0.a(dko.w, 5, 20);
      $$0.a(dko.x, 5, 20);
      $$0.a(dko.y, 5, 20);
      $$0.a(dko.jK, 5, 20);
      $$0.a(dko.jL, 5, 20);
      $$0.a(dko.jM, 5, 20);
      $$0.a(dko.jN, 5, 20);
      $$0.a(dko.jO, 5, 20);
      $$0.a(dko.jP, 5, 20);
      $$0.a(dko.jQ, 5, 20);
      $$0.a(dko.jR, 5, 20);
      $$0.a(dko.jS, 5, 20);
      $$0.a(dko.jT, 5, 20);
      $$0.a(dko.jU, 5, 20);
      $$0.a(dko.fv, 5, 20);
      $$0.a(dko.kn, 5, 20);
      $$0.a(dko.ko, 5, 20);
      $$0.a(dko.kp, 5, 20);
      $$0.a(dko.kq, 5, 20);
      $$0.a(dko.kr, 5, 20);
      $$0.a(dko.ks, 5, 20);
      $$0.a(dko.kt, 5, 20);
      $$0.a(dko.ku, 5, 20);
      $$0.a(dko.kv, 5, 20);
      $$0.a(dko.eh, 5, 20);
      $$0.a(dko.kw, 5, 20);
      $$0.a(dko.kx, 5, 20);
      $$0.a(dko.ky, 5, 20);
      $$0.a(dko.kz, 5, 20);
      $$0.a(dko.kA, 5, 20);
      $$0.a(dko.kB, 5, 20);
      $$0.a(dko.kC, 5, 20);
      $$0.a(dko.kD, 5, 20);
      $$0.a(dko.kE, 5, 20);
      $$0.a(dko.cC, 5, 20);
      $$0.a(dko.fZ, 5, 20);
      $$0.a(dko.fY, 5, 20);
      $$0.a(dko.ga, 5, 20);
      $$0.a(dko.if, 5, 20);
      $$0.a(dko.ig, 5, 20);
      $$0.a(dko.ih, 5, 20);
      $$0.a(dko.ii, 5, 20);
      $$0.a(dko.ij, 5, 20);
      $$0.a(dko.ik, 5, 20);
      $$0.a(dko.il, 5, 20);
      $$0.a(dko.X, 5, 5);
      $$0.a(dko.Y, 5, 5);
      $$0.a(dko.Z, 5, 5);
      $$0.a(dko.aa, 5, 5);
      $$0.a(dko.ab, 5, 5);
      $$0.a(dko.ac, 5, 5);
      $$0.a(dko.ae, 5, 5);
      $$0.a(dko.ad, 5, 5);
      $$0.a(dko.af, 5, 5);
      $$0.a(dko.ai, 5, 5);
      $$0.a(dko.aq, 5, 5);
      $$0.a(dko.aj, 5, 5);
      $$0.a(dko.ak, 5, 5);
      $$0.a(dko.al, 5, 5);
      $$0.a(dko.am, 5, 5);
      $$0.a(dko.an, 5, 5);
      $$0.a(dko.ao, 5, 5);
      $$0.a(dko.ap, 5, 5);
      $$0.a(dko.ar, 5, 5);
      $$0.a(dko.as, 5, 5);
      $$0.a(dko.aB, 5, 5);
      $$0.a(dko.aC, 5, 5);
      $$0.a(dko.aD, 5, 5);
      $$0.a(dko.aE, 5, 5);
      $$0.a(dko.aF, 5, 5);
      $$0.a(dko.aG, 5, 5);
      $$0.a(dko.aH, 5, 5);
      $$0.a(dko.aI, 5, 5);
      $$0.a(dko.aJ, 5, 5);
      $$0.a(dko.at, 5, 5);
      $$0.a(dko.au, 5, 5);
      $$0.a(dko.av, 5, 5);
      $$0.a(dko.aw, 5, 5);
      $$0.a(dko.ax, 5, 5);
      $$0.a(dko.ay, 5, 5);
      $$0.a(dko.u, 5, 5);
      $$0.a(dko.az, 5, 5);
      $$0.a(dko.aA, 5, 5);
      $$0.a(dko.ag, 5, 20);
      $$0.a(dko.aK, 30, 60);
      $$0.a(dko.aL, 30, 60);
      $$0.a(dko.aM, 30, 60);
      $$0.a(dko.aN, 30, 60);
      $$0.a(dko.aO, 30, 60);
      $$0.a(dko.aP, 30, 60);
      $$0.a(dko.aQ, 30, 60);
      $$0.a(dko.aR, 30, 60);
      $$0.a(dko.aS, 30, 60);
      $$0.a(dko.cs, 30, 20);
      $$0.a(dko.cr, 15, 100);
      $$0.a(dko.bA, 60, 100);
      $$0.a(dko.bB, 60, 100);
      $$0.a(dko.bC, 60, 100);
      $$0.a(dko.iU, 60, 100);
      $$0.a(dko.iV, 60, 100);
      $$0.a(dko.iW, 60, 100);
      $$0.a(dko.iX, 60, 100);
      $$0.a(dko.iY, 60, 100);
      $$0.a(dko.iZ, 60, 100);
      $$0.a(dko.bY, 60, 100);
      $$0.a(dko.ca, 60, 100);
      $$0.a(dko.cb, 60, 100);
      $$0.a(dko.cc, 60, 100);
      $$0.a(dko.cd, 60, 100);
      $$0.a(dko.ce, 60, 100);
      $$0.a(dko.cf, 60, 100);
      $$0.a(dko.cg, 60, 100);
      $$0.a(dko.ch, 60, 100);
      $$0.a(dko.ci, 60, 100);
      $$0.a(dko.cj, 60, 100);
      $$0.a(dko.cl, 60, 100);
      $$0.a(dko.bZ, 60, 100);
      $$0.a(dko.kX, 60, 100);
      $$0.a(dko.ck, 60, 100);
      $$0.a(dko.sW, 60, 100);
      $$0.a(dko.bH, 30, 60);
      $$0.a(dko.bI, 30, 60);
      $$0.a(dko.bJ, 30, 60);
      $$0.a(dko.bK, 30, 60);
      $$0.a(dko.bL, 30, 60);
      $$0.a(dko.bM, 30, 60);
      $$0.a(dko.bN, 30, 60);
      $$0.a(dko.bO, 30, 60);
      $$0.a(dko.bP, 30, 60);
      $$0.a(dko.bQ, 30, 60);
      $$0.a(dko.bR, 30, 60);
      $$0.a(dko.bS, 30, 60);
      $$0.a(dko.bT, 30, 60);
      $$0.a(dko.bU, 30, 60);
      $$0.a(dko.bV, 30, 60);
      $$0.a(dko.bW, 30, 60);
      $$0.a(dko.ft, 15, 100);
      $$0.a(dko.iS, 5, 5);
      $$0.a(dko.iA, 60, 20);
      $$0.a(dko.py, 15, 20);
      $$0.a(dko.iB, 60, 20);
      $$0.a(dko.iC, 60, 20);
      $$0.a(dko.iD, 60, 20);
      $$0.a(dko.iE, 60, 20);
      $$0.a(dko.iF, 60, 20);
      $$0.a(dko.iG, 60, 20);
      $$0.a(dko.iH, 60, 20);
      $$0.a(dko.iI, 60, 20);
      $$0.a(dko.iJ, 60, 20);
      $$0.a(dko.iK, 60, 20);
      $$0.a(dko.iL, 60, 20);
      $$0.a(dko.iM, 60, 20);
      $$0.a(dko.iN, 60, 20);
      $$0.a(dko.iO, 60, 20);
      $$0.a(dko.iP, 60, 20);
      $$0.a(dko.iQ, 60, 20);
      $$0.a(dko.tP, 60, 20);
      $$0.a(dko.tQ, 60, 20);
      $$0.a(dko.tR, 60, 100);
      $$0.a(dko.mz, 30, 60);
      $$0.a(dko.nu, 60, 60);
      $$0.a(dko.on, 60, 60);
      $$0.a(dko.ov, 30, 20);
      $$0.a(dko.px, 5, 20);
      $$0.a(dko.oD, 60, 100);
      $$0.a(dko.pA, 5, 20);
      $$0.a(dko.pz, 30, 20);
      $$0.a(dko.aT, 30, 60);
      $$0.a(dko.aU, 30, 60);
      $$0.a(dko.sQ, 15, 60);
      $$0.a(dko.sR, 15, 60);
      $$0.a(dko.sS, 60, 100);
      $$0.a(dko.sT, 30, 60);
      $$0.a(dko.sU, 30, 60);
      $$0.a(dko.sY, 60, 100);
      $$0.a(dko.sZ, 60, 100);
      $$0.a(dko.ta, 60, 100);
      $$0.a(dko.tb, 30, 60);
      $$0.a(dko.fu, 15, 100);
   }
}
