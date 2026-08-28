import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dnm extends djy {
   public static final MapCodec<dnm> c = b(dnm::new);
   public static final int d = 15;
   public static final dyt e = dyk.ax;
   public static final dyl f = dqb.b;
   public static final dyl g = dqb.c;
   public static final dyl h = dqb.d;
   public static final dyl i = dqb.e;
   public static final dyl j = dqb.f;
   private static final Map<jm, dyl> k = dqb.h.entrySet().stream().filter($$0 -> $$0.getKey() != jm.a).collect(ae.a());
   private static final fcr l = dkl.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcr m = dkl.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcr n = dkl.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcr o = dkl.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcr G = dkl.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dxu, fcr> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<dkl> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<dkl> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dnm> a() {
      return c;
   }

   public dnm(dxt.d $$0) {
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
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dnm::o)));
   }

   private static fcr o(dxu $$0) {
      fcr $$1 = fco.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = fco.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = fco.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = fco.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = fco.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(e)) : dkn.a.m();
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dxu a(dbf $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dxu b(dgm $$0, jh $$1) {
      jh $$2 = $$1.e();
      dxu $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jm.b)) {
         dxu $$4 = this.m();

         for (jm $$5 : jm.values()) {
            dyl $$6 = k.get($$5);
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
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.N().b(dhd.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dxu $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.G_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.af() && this.a((dhh)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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
                        int $$16 = this.a((dhk)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.af() || !this.a((dhh)$$1, $$11))) {
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

   protected boolean a(dhh $$0, jh $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dxu $$0) {
      return $$0.b(dyk.D) && $$0.c(dyk.D) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dxu $$0) {
      return $$0.b(dyk.D) && $$0.c(dyk.D) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dhh $$0, jh $$1, int $$2, bam $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dxu $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dkl $$8 = $$6.b();
         if ($$8 instanceof dsx) {
            dsx.a($$0, $$1);
         }
      }
   }

   private dxu a(dhk $$0, jh $$1, int $$2) {
      dxu $$3 = a((dgm)$$0, $$1);
      return $$3.a(dkn.cy) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dgm $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dhk $$0, jh $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jm $$3 : jm.values()) {
            dxu $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dxu $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(bam $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dkl $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dnm $$0 = (dnm)dkn.cy;
      $$0.a(dkn.n, 5, 20);
      $$0.a(dkn.o, 5, 20);
      $$0.a(dkn.p, 5, 20);
      $$0.a(dkn.q, 5, 20);
      $$0.a(dkn.r, 5, 20);
      $$0.a(dkn.s, 5, 20);
      $$0.a(dkn.t, 5, 20);
      $$0.a(dkn.v, 5, 20);
      $$0.a(dkn.w, 5, 20);
      $$0.a(dkn.x, 5, 20);
      $$0.a(dkn.y, 5, 20);
      $$0.a(dkn.jK, 5, 20);
      $$0.a(dkn.jL, 5, 20);
      $$0.a(dkn.jM, 5, 20);
      $$0.a(dkn.jN, 5, 20);
      $$0.a(dkn.jO, 5, 20);
      $$0.a(dkn.jP, 5, 20);
      $$0.a(dkn.jQ, 5, 20);
      $$0.a(dkn.jR, 5, 20);
      $$0.a(dkn.jS, 5, 20);
      $$0.a(dkn.jT, 5, 20);
      $$0.a(dkn.jU, 5, 20);
      $$0.a(dkn.fv, 5, 20);
      $$0.a(dkn.kn, 5, 20);
      $$0.a(dkn.ko, 5, 20);
      $$0.a(dkn.kp, 5, 20);
      $$0.a(dkn.kq, 5, 20);
      $$0.a(dkn.kr, 5, 20);
      $$0.a(dkn.ks, 5, 20);
      $$0.a(dkn.kt, 5, 20);
      $$0.a(dkn.ku, 5, 20);
      $$0.a(dkn.kv, 5, 20);
      $$0.a(dkn.eh, 5, 20);
      $$0.a(dkn.kw, 5, 20);
      $$0.a(dkn.kx, 5, 20);
      $$0.a(dkn.ky, 5, 20);
      $$0.a(dkn.kz, 5, 20);
      $$0.a(dkn.kA, 5, 20);
      $$0.a(dkn.kB, 5, 20);
      $$0.a(dkn.kC, 5, 20);
      $$0.a(dkn.kD, 5, 20);
      $$0.a(dkn.kE, 5, 20);
      $$0.a(dkn.cC, 5, 20);
      $$0.a(dkn.fZ, 5, 20);
      $$0.a(dkn.fY, 5, 20);
      $$0.a(dkn.ga, 5, 20);
      $$0.a(dkn.if, 5, 20);
      $$0.a(dkn.ig, 5, 20);
      $$0.a(dkn.ih, 5, 20);
      $$0.a(dkn.ii, 5, 20);
      $$0.a(dkn.ij, 5, 20);
      $$0.a(dkn.ik, 5, 20);
      $$0.a(dkn.il, 5, 20);
      $$0.a(dkn.X, 5, 5);
      $$0.a(dkn.Y, 5, 5);
      $$0.a(dkn.Z, 5, 5);
      $$0.a(dkn.aa, 5, 5);
      $$0.a(dkn.ab, 5, 5);
      $$0.a(dkn.ac, 5, 5);
      $$0.a(dkn.ae, 5, 5);
      $$0.a(dkn.ad, 5, 5);
      $$0.a(dkn.af, 5, 5);
      $$0.a(dkn.ai, 5, 5);
      $$0.a(dkn.aq, 5, 5);
      $$0.a(dkn.aj, 5, 5);
      $$0.a(dkn.ak, 5, 5);
      $$0.a(dkn.al, 5, 5);
      $$0.a(dkn.am, 5, 5);
      $$0.a(dkn.an, 5, 5);
      $$0.a(dkn.ao, 5, 5);
      $$0.a(dkn.ap, 5, 5);
      $$0.a(dkn.ar, 5, 5);
      $$0.a(dkn.as, 5, 5);
      $$0.a(dkn.aB, 5, 5);
      $$0.a(dkn.aC, 5, 5);
      $$0.a(dkn.aD, 5, 5);
      $$0.a(dkn.aE, 5, 5);
      $$0.a(dkn.aF, 5, 5);
      $$0.a(dkn.aG, 5, 5);
      $$0.a(dkn.aH, 5, 5);
      $$0.a(dkn.aI, 5, 5);
      $$0.a(dkn.aJ, 5, 5);
      $$0.a(dkn.at, 5, 5);
      $$0.a(dkn.au, 5, 5);
      $$0.a(dkn.av, 5, 5);
      $$0.a(dkn.aw, 5, 5);
      $$0.a(dkn.ax, 5, 5);
      $$0.a(dkn.ay, 5, 5);
      $$0.a(dkn.u, 5, 5);
      $$0.a(dkn.az, 5, 5);
      $$0.a(dkn.aA, 5, 5);
      $$0.a(dkn.ag, 5, 20);
      $$0.a(dkn.aK, 30, 60);
      $$0.a(dkn.aL, 30, 60);
      $$0.a(dkn.aM, 30, 60);
      $$0.a(dkn.aN, 30, 60);
      $$0.a(dkn.aO, 30, 60);
      $$0.a(dkn.aP, 30, 60);
      $$0.a(dkn.aQ, 30, 60);
      $$0.a(dkn.aR, 30, 60);
      $$0.a(dkn.aS, 30, 60);
      $$0.a(dkn.cs, 30, 20);
      $$0.a(dkn.cr, 15, 100);
      $$0.a(dkn.bA, 60, 100);
      $$0.a(dkn.bB, 60, 100);
      $$0.a(dkn.bC, 60, 100);
      $$0.a(dkn.iU, 60, 100);
      $$0.a(dkn.iV, 60, 100);
      $$0.a(dkn.iW, 60, 100);
      $$0.a(dkn.iX, 60, 100);
      $$0.a(dkn.iY, 60, 100);
      $$0.a(dkn.iZ, 60, 100);
      $$0.a(dkn.bY, 60, 100);
      $$0.a(dkn.ca, 60, 100);
      $$0.a(dkn.cb, 60, 100);
      $$0.a(dkn.cc, 60, 100);
      $$0.a(dkn.cd, 60, 100);
      $$0.a(dkn.ce, 60, 100);
      $$0.a(dkn.cf, 60, 100);
      $$0.a(dkn.cg, 60, 100);
      $$0.a(dkn.ch, 60, 100);
      $$0.a(dkn.ci, 60, 100);
      $$0.a(dkn.cj, 60, 100);
      $$0.a(dkn.cl, 60, 100);
      $$0.a(dkn.bZ, 60, 100);
      $$0.a(dkn.kX, 60, 100);
      $$0.a(dkn.ck, 60, 100);
      $$0.a(dkn.sW, 60, 100);
      $$0.a(dkn.bH, 30, 60);
      $$0.a(dkn.bI, 30, 60);
      $$0.a(dkn.bJ, 30, 60);
      $$0.a(dkn.bK, 30, 60);
      $$0.a(dkn.bL, 30, 60);
      $$0.a(dkn.bM, 30, 60);
      $$0.a(dkn.bN, 30, 60);
      $$0.a(dkn.bO, 30, 60);
      $$0.a(dkn.bP, 30, 60);
      $$0.a(dkn.bQ, 30, 60);
      $$0.a(dkn.bR, 30, 60);
      $$0.a(dkn.bS, 30, 60);
      $$0.a(dkn.bT, 30, 60);
      $$0.a(dkn.bU, 30, 60);
      $$0.a(dkn.bV, 30, 60);
      $$0.a(dkn.bW, 30, 60);
      $$0.a(dkn.ft, 15, 100);
      $$0.a(dkn.iS, 5, 5);
      $$0.a(dkn.iA, 60, 20);
      $$0.a(dkn.py, 15, 20);
      $$0.a(dkn.iB, 60, 20);
      $$0.a(dkn.iC, 60, 20);
      $$0.a(dkn.iD, 60, 20);
      $$0.a(dkn.iE, 60, 20);
      $$0.a(dkn.iF, 60, 20);
      $$0.a(dkn.iG, 60, 20);
      $$0.a(dkn.iH, 60, 20);
      $$0.a(dkn.iI, 60, 20);
      $$0.a(dkn.iJ, 60, 20);
      $$0.a(dkn.iK, 60, 20);
      $$0.a(dkn.iL, 60, 20);
      $$0.a(dkn.iM, 60, 20);
      $$0.a(dkn.iN, 60, 20);
      $$0.a(dkn.iO, 60, 20);
      $$0.a(dkn.iP, 60, 20);
      $$0.a(dkn.iQ, 60, 20);
      $$0.a(dkn.tP, 60, 20);
      $$0.a(dkn.tQ, 60, 20);
      $$0.a(dkn.tR, 60, 100);
      $$0.a(dkn.mz, 30, 60);
      $$0.a(dkn.nu, 60, 60);
      $$0.a(dkn.on, 60, 60);
      $$0.a(dkn.ov, 30, 20);
      $$0.a(dkn.px, 5, 20);
      $$0.a(dkn.oD, 60, 100);
      $$0.a(dkn.pA, 5, 20);
      $$0.a(dkn.pz, 30, 20);
      $$0.a(dkn.aT, 30, 60);
      $$0.a(dkn.aU, 30, 60);
      $$0.a(dkn.sQ, 15, 60);
      $$0.a(dkn.sR, 15, 60);
      $$0.a(dkn.sS, 60, 100);
      $$0.a(dkn.sT, 30, 60);
      $$0.a(dkn.sU, 30, 60);
      $$0.a(dkn.sY, 60, 100);
      $$0.a(dkn.sZ, 60, 100);
      $$0.a(dkn.ta, 60, 100);
      $$0.a(dkn.tb, 30, 60);
      $$0.a(dkn.fu, 15, 100);
   }
}
