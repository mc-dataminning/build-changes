import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dmn extends diz {
   public static final MapCodec<dmn> c = b(dmn::new);
   public static final int d = 15;
   public static final dxw e = dxn.az;
   public static final dxo f = dpe.b;
   public static final dxo g = dpe.c;
   public static final dxo h = dpe.d;
   public static final dxo i = dpe.e;
   public static final dxo j = dpe.f;
   private static final Map<jn, dxo> k = dpe.h.entrySet().stream().filter($$0 -> $$0.getKey() != jn.a).collect(af.a());
   private static final fbu l = djm.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbu m = djm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbu n = djm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbu o = djm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbu G = djm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dwx, fbu> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<djm> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<djm> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dmn> a() {
      return c;
   }

   public dmn(dww.d $$0) {
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
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dmn::o)));
   }

   private static fbu o(dwx $$0) {
      fbu $$1 = fbr.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = fbr.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = fbr.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = fbr.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = fbr.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(e)) : djo.a.m();
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dwx a(dag $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dwx b(dfn $$0, ji $$1) {
      ji $$2 = $$1.e();
      dwx $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jn.b)) {
         dwx $$4 = this.m();

         for (jn $$5 : jn.values()) {
            dxo $$6 = k.get($$5);
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
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jn.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().b(dge.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dwx $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.G_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ag() && this.a((dgi)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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
                        int $$16 = this.a((dgl)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.am().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ag() || !this.a((dgi)$$1, $$11))) {
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

   protected boolean a(dgi $$0, ji $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dwx $$0) {
      return $$0.b(dxn.J) && $$0.c(dxn.J) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dwx $$0) {
      return $$0.b(dxn.J) && $$0.c(dxn.J) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dgi $$0, ji $$1, int $$2, azh $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dwx $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         djm $$8 = $$6.b();
         if ($$8 instanceof dsa) {
            dsa.a($$0, $$1);
         }
      }
   }

   private dwx a(dgl $$0, ji $$1, int $$2) {
      dwx $$3 = a((dfn)$$0, $$1);
      return $$3.a(djo.cy) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dfn $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dgl $$0, ji $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jn $$3 : jn.values()) {
            dwx $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dwx $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azh $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(djm $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dmn $$0 = (dmn)djo.cy;
      $$0.a(djo.n, 5, 20);
      $$0.a(djo.o, 5, 20);
      $$0.a(djo.p, 5, 20);
      $$0.a(djo.q, 5, 20);
      $$0.a(djo.r, 5, 20);
      $$0.a(djo.s, 5, 20);
      $$0.a(djo.t, 5, 20);
      $$0.a(djo.v, 5, 20);
      $$0.a(djo.w, 5, 20);
      $$0.a(djo.x, 5, 20);
      $$0.a(djo.y, 5, 20);
      $$0.a(djo.jR, 5, 20);
      $$0.a(djo.jS, 5, 20);
      $$0.a(djo.jT, 5, 20);
      $$0.a(djo.jU, 5, 20);
      $$0.a(djo.jV, 5, 20);
      $$0.a(djo.jW, 5, 20);
      $$0.a(djo.jX, 5, 20);
      $$0.a(djo.jY, 5, 20);
      $$0.a(djo.jZ, 5, 20);
      $$0.a(djo.ka, 5, 20);
      $$0.a(djo.kb, 5, 20);
      $$0.a(djo.fw, 5, 20);
      $$0.a(djo.ku, 5, 20);
      $$0.a(djo.kv, 5, 20);
      $$0.a(djo.kw, 5, 20);
      $$0.a(djo.kx, 5, 20);
      $$0.a(djo.ky, 5, 20);
      $$0.a(djo.kz, 5, 20);
      $$0.a(djo.kA, 5, 20);
      $$0.a(djo.kB, 5, 20);
      $$0.a(djo.kC, 5, 20);
      $$0.a(djo.eh, 5, 20);
      $$0.a(djo.kD, 5, 20);
      $$0.a(djo.kE, 5, 20);
      $$0.a(djo.kF, 5, 20);
      $$0.a(djo.kG, 5, 20);
      $$0.a(djo.kH, 5, 20);
      $$0.a(djo.kI, 5, 20);
      $$0.a(djo.kJ, 5, 20);
      $$0.a(djo.kK, 5, 20);
      $$0.a(djo.kL, 5, 20);
      $$0.a(djo.cC, 5, 20);
      $$0.a(djo.gg, 5, 20);
      $$0.a(djo.gf, 5, 20);
      $$0.a(djo.gh, 5, 20);
      $$0.a(djo.im, 5, 20);
      $$0.a(djo.in, 5, 20);
      $$0.a(djo.io, 5, 20);
      $$0.a(djo.ip, 5, 20);
      $$0.a(djo.iq, 5, 20);
      $$0.a(djo.ir, 5, 20);
      $$0.a(djo.is, 5, 20);
      $$0.a(djo.X, 5, 5);
      $$0.a(djo.Y, 5, 5);
      $$0.a(djo.Z, 5, 5);
      $$0.a(djo.aa, 5, 5);
      $$0.a(djo.ab, 5, 5);
      $$0.a(djo.ac, 5, 5);
      $$0.a(djo.ae, 5, 5);
      $$0.a(djo.ad, 5, 5);
      $$0.a(djo.af, 5, 5);
      $$0.a(djo.ai, 5, 5);
      $$0.a(djo.aq, 5, 5);
      $$0.a(djo.aj, 5, 5);
      $$0.a(djo.ak, 5, 5);
      $$0.a(djo.al, 5, 5);
      $$0.a(djo.am, 5, 5);
      $$0.a(djo.an, 5, 5);
      $$0.a(djo.ao, 5, 5);
      $$0.a(djo.ap, 5, 5);
      $$0.a(djo.ar, 5, 5);
      $$0.a(djo.as, 5, 5);
      $$0.a(djo.aB, 5, 5);
      $$0.a(djo.aC, 5, 5);
      $$0.a(djo.aD, 5, 5);
      $$0.a(djo.aE, 5, 5);
      $$0.a(djo.aF, 5, 5);
      $$0.a(djo.aG, 5, 5);
      $$0.a(djo.aH, 5, 5);
      $$0.a(djo.aI, 5, 5);
      $$0.a(djo.aJ, 5, 5);
      $$0.a(djo.at, 5, 5);
      $$0.a(djo.au, 5, 5);
      $$0.a(djo.av, 5, 5);
      $$0.a(djo.aw, 5, 5);
      $$0.a(djo.ax, 5, 5);
      $$0.a(djo.ay, 5, 5);
      $$0.a(djo.u, 5, 5);
      $$0.a(djo.az, 5, 5);
      $$0.a(djo.aA, 5, 5);
      $$0.a(djo.ag, 5, 20);
      $$0.a(djo.aK, 30, 60);
      $$0.a(djo.aL, 30, 60);
      $$0.a(djo.aM, 30, 60);
      $$0.a(djo.aN, 30, 60);
      $$0.a(djo.aO, 30, 60);
      $$0.a(djo.aP, 30, 60);
      $$0.a(djo.aQ, 30, 60);
      $$0.a(djo.aR, 30, 60);
      $$0.a(djo.aS, 30, 60);
      $$0.a(djo.cs, 30, 20);
      $$0.a(djo.cr, 15, 100);
      $$0.a(djo.bA, 60, 100);
      $$0.a(djo.bB, 60, 100);
      $$0.a(djo.bC, 60, 100);
      $$0.a(djo.jb, 60, 100);
      $$0.a(djo.jc, 60, 100);
      $$0.a(djo.jd, 60, 100);
      $$0.a(djo.je, 60, 100);
      $$0.a(djo.jf, 60, 100);
      $$0.a(djo.jg, 60, 100);
      $$0.a(djo.bY, 60, 100);
      $$0.a(djo.ca, 60, 100);
      $$0.a(djo.tZ, 60, 100);
      $$0.a(djo.ua, 60, 100);
      $$0.a(djo.cb, 60, 100);
      $$0.a(djo.cc, 60, 100);
      $$0.a(djo.cd, 60, 100);
      $$0.a(djo.ce, 60, 100);
      $$0.a(djo.cf, 60, 100);
      $$0.a(djo.cg, 60, 100);
      $$0.a(djo.ch, 60, 100);
      $$0.a(djo.ci, 60, 100);
      $$0.a(djo.cj, 60, 100);
      $$0.a(djo.cl, 60, 100);
      $$0.a(djo.bZ, 60, 100);
      $$0.a(djo.le, 60, 100);
      $$0.a(djo.ck, 60, 100);
      $$0.a(djo.td, 60, 100);
      $$0.a(djo.bH, 30, 60);
      $$0.a(djo.bI, 30, 60);
      $$0.a(djo.bJ, 30, 60);
      $$0.a(djo.bK, 30, 60);
      $$0.a(djo.bL, 30, 60);
      $$0.a(djo.bM, 30, 60);
      $$0.a(djo.bN, 30, 60);
      $$0.a(djo.bO, 30, 60);
      $$0.a(djo.bP, 30, 60);
      $$0.a(djo.bQ, 30, 60);
      $$0.a(djo.bR, 30, 60);
      $$0.a(djo.bS, 30, 60);
      $$0.a(djo.bT, 30, 60);
      $$0.a(djo.bU, 30, 60);
      $$0.a(djo.bV, 30, 60);
      $$0.a(djo.bW, 30, 60);
      $$0.a(djo.ft, 15, 100);
      $$0.a(djo.iZ, 5, 5);
      $$0.a(djo.iH, 60, 20);
      $$0.a(djo.pF, 15, 20);
      $$0.a(djo.iI, 60, 20);
      $$0.a(djo.iJ, 60, 20);
      $$0.a(djo.iK, 60, 20);
      $$0.a(djo.iL, 60, 20);
      $$0.a(djo.iM, 60, 20);
      $$0.a(djo.iN, 60, 20);
      $$0.a(djo.iO, 60, 20);
      $$0.a(djo.iP, 60, 20);
      $$0.a(djo.iQ, 60, 20);
      $$0.a(djo.iR, 60, 20);
      $$0.a(djo.iS, 60, 20);
      $$0.a(djo.iT, 60, 20);
      $$0.a(djo.iU, 60, 20);
      $$0.a(djo.iV, 60, 20);
      $$0.a(djo.iW, 60, 20);
      $$0.a(djo.iX, 60, 20);
      $$0.a(djo.tW, 5, 100);
      $$0.a(djo.tX, 5, 100);
      $$0.a(djo.tY, 5, 100);
      $$0.a(djo.mG, 30, 60);
      $$0.a(djo.nB, 60, 60);
      $$0.a(djo.ou, 60, 60);
      $$0.a(djo.oC, 30, 20);
      $$0.a(djo.pE, 5, 20);
      $$0.a(djo.oK, 60, 100);
      $$0.a(djo.pH, 5, 20);
      $$0.a(djo.pG, 30, 20);
      $$0.a(djo.aT, 30, 60);
      $$0.a(djo.aU, 30, 60);
      $$0.a(djo.sX, 15, 60);
      $$0.a(djo.sY, 15, 60);
      $$0.a(djo.sZ, 60, 100);
      $$0.a(djo.ta, 30, 60);
      $$0.a(djo.tb, 30, 60);
      $$0.a(djo.tf, 60, 100);
      $$0.a(djo.tg, 60, 100);
      $$0.a(djo.th, 60, 100);
      $$0.a(djo.ti, 30, 60);
      $$0.a(djo.fu, 15, 100);
   }
}
