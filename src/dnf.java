import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dnf extends djr {
   public static final MapCodec<dnf> c = b(dnf::new);
   public static final int d = 15;
   public static final dym e = dyd.ax;
   public static final dye f = dpu.b;
   public static final dye g = dpu.c;
   public static final dye h = dpu.d;
   public static final dye i = dpu.e;
   public static final dye j = dpu.f;
   private static final Map<jm, dye> k = dpu.h.entrySet().stream().filter($$0 -> $$0.getKey() != jm.a).collect(ae.a());
   private static final fcm l = dke.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcm m = dke.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fcm n = dke.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcm o = dke.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fcm G = dke.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dxn, fcm> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<dke> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<dke> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dnf> a() {
      return c;
   }

   public dnf(dxm.d $$0) {
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
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dnf::o)));
   }

   private static fcm o(dxn $$0) {
      fcm $$1 = fcj.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = fcj.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = fcj.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = fcj.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = fcj.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(e)) : dkg.a.m();
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dxn a(dbb $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dxn b(dgf $$0, jh $$1) {
      jh $$2 = $$1.e();
      dxn $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jm.b)) {
         dxn $$4 = this.m();

         for (jm $$5 : jm.values()) {
            dye $$6 = k.get($$5);
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
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.N().b(dgw.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dxn $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.G_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.af() && this.a((dha)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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
                        int $$16 = this.a((dhd)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.af() || !this.a((dha)$$1, $$11))) {
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

   protected boolean a(dha $$0, jh $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dxn $$0) {
      return $$0.b(dyd.D) && $$0.c(dyd.D) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dxn $$0) {
      return $$0.b(dyd.D) && $$0.c(dyd.D) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dha $$0, jh $$1, int $$2, bam $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dxn $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dke $$8 = $$6.b();
         if ($$8 instanceof dsq) {
            dsq.a($$0, $$1);
         }
      }
   }

   private dxn a(dhd $$0, jh $$1, int $$2) {
      dxn $$3 = a((dgf)$$0, $$1);
      return $$3.a(dkg.cy) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dgf $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dhd $$0, jh $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jm $$3 : jm.values()) {
            dxn $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dxn $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(bam $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dke $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
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
      $$0.a(dkg.jK, 5, 20);
      $$0.a(dkg.jL, 5, 20);
      $$0.a(dkg.jM, 5, 20);
      $$0.a(dkg.jN, 5, 20);
      $$0.a(dkg.jO, 5, 20);
      $$0.a(dkg.jP, 5, 20);
      $$0.a(dkg.jQ, 5, 20);
      $$0.a(dkg.jR, 5, 20);
      $$0.a(dkg.jS, 5, 20);
      $$0.a(dkg.jT, 5, 20);
      $$0.a(dkg.jU, 5, 20);
      $$0.a(dkg.fv, 5, 20);
      $$0.a(dkg.kn, 5, 20);
      $$0.a(dkg.ko, 5, 20);
      $$0.a(dkg.kp, 5, 20);
      $$0.a(dkg.kq, 5, 20);
      $$0.a(dkg.kr, 5, 20);
      $$0.a(dkg.ks, 5, 20);
      $$0.a(dkg.kt, 5, 20);
      $$0.a(dkg.ku, 5, 20);
      $$0.a(dkg.kv, 5, 20);
      $$0.a(dkg.eh, 5, 20);
      $$0.a(dkg.kw, 5, 20);
      $$0.a(dkg.kx, 5, 20);
      $$0.a(dkg.ky, 5, 20);
      $$0.a(dkg.kz, 5, 20);
      $$0.a(dkg.kA, 5, 20);
      $$0.a(dkg.kB, 5, 20);
      $$0.a(dkg.kC, 5, 20);
      $$0.a(dkg.kD, 5, 20);
      $$0.a(dkg.kE, 5, 20);
      $$0.a(dkg.cC, 5, 20);
      $$0.a(dkg.fZ, 5, 20);
      $$0.a(dkg.fY, 5, 20);
      $$0.a(dkg.ga, 5, 20);
      $$0.a(dkg.if, 5, 20);
      $$0.a(dkg.ig, 5, 20);
      $$0.a(dkg.ih, 5, 20);
      $$0.a(dkg.ii, 5, 20);
      $$0.a(dkg.ij, 5, 20);
      $$0.a(dkg.ik, 5, 20);
      $$0.a(dkg.il, 5, 20);
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
      $$0.a(dkg.iU, 60, 100);
      $$0.a(dkg.iV, 60, 100);
      $$0.a(dkg.iW, 60, 100);
      $$0.a(dkg.iX, 60, 100);
      $$0.a(dkg.iY, 60, 100);
      $$0.a(dkg.iZ, 60, 100);
      $$0.a(dkg.bY, 60, 100);
      $$0.a(dkg.ca, 60, 100);
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
      $$0.a(dkg.kX, 60, 100);
      $$0.a(dkg.ck, 60, 100);
      $$0.a(dkg.sW, 60, 100);
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
      $$0.a(dkg.iS, 5, 5);
      $$0.a(dkg.iA, 60, 20);
      $$0.a(dkg.py, 15, 20);
      $$0.a(dkg.iB, 60, 20);
      $$0.a(dkg.iC, 60, 20);
      $$0.a(dkg.iD, 60, 20);
      $$0.a(dkg.iE, 60, 20);
      $$0.a(dkg.iF, 60, 20);
      $$0.a(dkg.iG, 60, 20);
      $$0.a(dkg.iH, 60, 20);
      $$0.a(dkg.iI, 60, 20);
      $$0.a(dkg.iJ, 60, 20);
      $$0.a(dkg.iK, 60, 20);
      $$0.a(dkg.iL, 60, 20);
      $$0.a(dkg.iM, 60, 20);
      $$0.a(dkg.iN, 60, 20);
      $$0.a(dkg.iO, 60, 20);
      $$0.a(dkg.iP, 60, 20);
      $$0.a(dkg.iQ, 60, 20);
      $$0.a(dkg.tP, 60, 20);
      $$0.a(dkg.tQ, 60, 20);
      $$0.a(dkg.tR, 60, 100);
      $$0.a(dkg.mz, 30, 60);
      $$0.a(dkg.nu, 60, 60);
      $$0.a(dkg.on, 60, 60);
      $$0.a(dkg.ov, 30, 20);
      $$0.a(dkg.px, 5, 20);
      $$0.a(dkg.oD, 60, 100);
      $$0.a(dkg.pA, 5, 20);
      $$0.a(dkg.pz, 30, 20);
      $$0.a(dkg.aT, 30, 60);
      $$0.a(dkg.aU, 30, 60);
      $$0.a(dkg.sQ, 15, 60);
      $$0.a(dkg.sR, 15, 60);
      $$0.a(dkg.sS, 60, 100);
      $$0.a(dkg.sT, 30, 60);
      $$0.a(dkg.sU, 30, 60);
      $$0.a(dkg.sY, 60, 100);
      $$0.a(dkg.sZ, 60, 100);
      $$0.a(dkg.ta, 60, 100);
      $$0.a(dkg.tb, 30, 60);
      $$0.a(dkg.fu, 15, 100);
   }
}
