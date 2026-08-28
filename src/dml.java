import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dml extends dix {
   public static final MapCodec<dml> c = b(dml::new);
   public static final int d = 15;
   public static final dxu e = dxl.az;
   public static final dxm f = dpc.b;
   public static final dxm g = dpc.c;
   public static final dxm h = dpc.d;
   public static final dxm i = dpc.e;
   public static final dxm j = dpc.f;
   private static final Map<jn, dxm> k = dpc.h.entrySet().stream().filter($$0 -> $$0.getKey() != jn.a).collect(af.a());
   private static final fbs l = djk.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbs m = djk.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbs n = djk.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbs o = djk.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbs G = djk.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dwv, fbs> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<djk> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<djk> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dml> a() {
      return c;
   }

   public dml(dwu.d $$0) {
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
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dml::o)));
   }

   private static fbs o(dwv $$0) {
      fbs $$1 = fbp.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = fbp.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = fbp.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = fbp.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = fbp.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(e)) : djm.a.m();
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dwv a(dae $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dwv b(dfl $$0, ji $$1) {
      ji $$2 = $$1.e();
      dwv $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jn.b)) {
         dwv $$4 = this.m();

         for (jn $$5 : jn.values()) {
            dxm $$6 = k.get($$5);
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
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jn.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().b(dgc.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dwv $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.G_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ag() && this.a((dgg)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(awn.ad);
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
                        int $$16 = this.a((dgj)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.am().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ag() || !this.a((dgg)$$1, $$11))) {
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

   protected boolean a(dgg $$0, ji $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dwv $$0) {
      return $$0.b(dxl.J) && $$0.c(dxl.J) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dwv $$0) {
      return $$0.b(dxl.J) && $$0.c(dxl.J) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dgg $$0, ji $$1, int $$2, azg $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dwv $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         djk $$8 = $$6.b();
         if ($$8 instanceof dry) {
            dry.a($$0, $$1);
         }
      }
   }

   private dwv a(dgj $$0, ji $$1, int $$2) {
      dwv $$3 = a((dfl)$$0, $$1);
      return $$3.a(djm.cy) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dfl $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dgj $$0, ji $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jn $$3 : jn.values()) {
            dwv $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dwv $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azg $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(djk $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dml $$0 = (dml)djm.cy;
      $$0.a(djm.n, 5, 20);
      $$0.a(djm.o, 5, 20);
      $$0.a(djm.p, 5, 20);
      $$0.a(djm.q, 5, 20);
      $$0.a(djm.r, 5, 20);
      $$0.a(djm.s, 5, 20);
      $$0.a(djm.t, 5, 20);
      $$0.a(djm.v, 5, 20);
      $$0.a(djm.w, 5, 20);
      $$0.a(djm.x, 5, 20);
      $$0.a(djm.y, 5, 20);
      $$0.a(djm.jR, 5, 20);
      $$0.a(djm.jS, 5, 20);
      $$0.a(djm.jT, 5, 20);
      $$0.a(djm.jU, 5, 20);
      $$0.a(djm.jV, 5, 20);
      $$0.a(djm.jW, 5, 20);
      $$0.a(djm.jX, 5, 20);
      $$0.a(djm.jY, 5, 20);
      $$0.a(djm.jZ, 5, 20);
      $$0.a(djm.ka, 5, 20);
      $$0.a(djm.kb, 5, 20);
      $$0.a(djm.fw, 5, 20);
      $$0.a(djm.ku, 5, 20);
      $$0.a(djm.kv, 5, 20);
      $$0.a(djm.kw, 5, 20);
      $$0.a(djm.kx, 5, 20);
      $$0.a(djm.ky, 5, 20);
      $$0.a(djm.kz, 5, 20);
      $$0.a(djm.kA, 5, 20);
      $$0.a(djm.kB, 5, 20);
      $$0.a(djm.kC, 5, 20);
      $$0.a(djm.eh, 5, 20);
      $$0.a(djm.kD, 5, 20);
      $$0.a(djm.kE, 5, 20);
      $$0.a(djm.kF, 5, 20);
      $$0.a(djm.kG, 5, 20);
      $$0.a(djm.kH, 5, 20);
      $$0.a(djm.kI, 5, 20);
      $$0.a(djm.kJ, 5, 20);
      $$0.a(djm.kK, 5, 20);
      $$0.a(djm.kL, 5, 20);
      $$0.a(djm.cC, 5, 20);
      $$0.a(djm.gg, 5, 20);
      $$0.a(djm.gf, 5, 20);
      $$0.a(djm.gh, 5, 20);
      $$0.a(djm.im, 5, 20);
      $$0.a(djm.in, 5, 20);
      $$0.a(djm.io, 5, 20);
      $$0.a(djm.ip, 5, 20);
      $$0.a(djm.iq, 5, 20);
      $$0.a(djm.ir, 5, 20);
      $$0.a(djm.is, 5, 20);
      $$0.a(djm.X, 5, 5);
      $$0.a(djm.Y, 5, 5);
      $$0.a(djm.Z, 5, 5);
      $$0.a(djm.aa, 5, 5);
      $$0.a(djm.ab, 5, 5);
      $$0.a(djm.ac, 5, 5);
      $$0.a(djm.ae, 5, 5);
      $$0.a(djm.ad, 5, 5);
      $$0.a(djm.af, 5, 5);
      $$0.a(djm.ai, 5, 5);
      $$0.a(djm.aq, 5, 5);
      $$0.a(djm.aj, 5, 5);
      $$0.a(djm.ak, 5, 5);
      $$0.a(djm.al, 5, 5);
      $$0.a(djm.am, 5, 5);
      $$0.a(djm.an, 5, 5);
      $$0.a(djm.ao, 5, 5);
      $$0.a(djm.ap, 5, 5);
      $$0.a(djm.ar, 5, 5);
      $$0.a(djm.as, 5, 5);
      $$0.a(djm.aB, 5, 5);
      $$0.a(djm.aC, 5, 5);
      $$0.a(djm.aD, 5, 5);
      $$0.a(djm.aE, 5, 5);
      $$0.a(djm.aF, 5, 5);
      $$0.a(djm.aG, 5, 5);
      $$0.a(djm.aH, 5, 5);
      $$0.a(djm.aI, 5, 5);
      $$0.a(djm.aJ, 5, 5);
      $$0.a(djm.at, 5, 5);
      $$0.a(djm.au, 5, 5);
      $$0.a(djm.av, 5, 5);
      $$0.a(djm.aw, 5, 5);
      $$0.a(djm.ax, 5, 5);
      $$0.a(djm.ay, 5, 5);
      $$0.a(djm.u, 5, 5);
      $$0.a(djm.az, 5, 5);
      $$0.a(djm.aA, 5, 5);
      $$0.a(djm.ag, 5, 20);
      $$0.a(djm.aK, 30, 60);
      $$0.a(djm.aL, 30, 60);
      $$0.a(djm.aM, 30, 60);
      $$0.a(djm.aN, 30, 60);
      $$0.a(djm.aO, 30, 60);
      $$0.a(djm.aP, 30, 60);
      $$0.a(djm.aQ, 30, 60);
      $$0.a(djm.aR, 30, 60);
      $$0.a(djm.aS, 30, 60);
      $$0.a(djm.cs, 30, 20);
      $$0.a(djm.cr, 15, 100);
      $$0.a(djm.bA, 60, 100);
      $$0.a(djm.bB, 60, 100);
      $$0.a(djm.bC, 60, 100);
      $$0.a(djm.jb, 60, 100);
      $$0.a(djm.jc, 60, 100);
      $$0.a(djm.jd, 60, 100);
      $$0.a(djm.je, 60, 100);
      $$0.a(djm.jf, 60, 100);
      $$0.a(djm.jg, 60, 100);
      $$0.a(djm.bY, 60, 100);
      $$0.a(djm.ca, 60, 100);
      $$0.a(djm.tZ, 60, 100);
      $$0.a(djm.ua, 60, 100);
      $$0.a(djm.cb, 60, 100);
      $$0.a(djm.cc, 60, 100);
      $$0.a(djm.cd, 60, 100);
      $$0.a(djm.ce, 60, 100);
      $$0.a(djm.cf, 60, 100);
      $$0.a(djm.cg, 60, 100);
      $$0.a(djm.ch, 60, 100);
      $$0.a(djm.ci, 60, 100);
      $$0.a(djm.cj, 60, 100);
      $$0.a(djm.cl, 60, 100);
      $$0.a(djm.bZ, 60, 100);
      $$0.a(djm.le, 60, 100);
      $$0.a(djm.ck, 60, 100);
      $$0.a(djm.td, 60, 100);
      $$0.a(djm.bH, 30, 60);
      $$0.a(djm.bI, 30, 60);
      $$0.a(djm.bJ, 30, 60);
      $$0.a(djm.bK, 30, 60);
      $$0.a(djm.bL, 30, 60);
      $$0.a(djm.bM, 30, 60);
      $$0.a(djm.bN, 30, 60);
      $$0.a(djm.bO, 30, 60);
      $$0.a(djm.bP, 30, 60);
      $$0.a(djm.bQ, 30, 60);
      $$0.a(djm.bR, 30, 60);
      $$0.a(djm.bS, 30, 60);
      $$0.a(djm.bT, 30, 60);
      $$0.a(djm.bU, 30, 60);
      $$0.a(djm.bV, 30, 60);
      $$0.a(djm.bW, 30, 60);
      $$0.a(djm.ft, 15, 100);
      $$0.a(djm.iZ, 5, 5);
      $$0.a(djm.iH, 60, 20);
      $$0.a(djm.pF, 15, 20);
      $$0.a(djm.iI, 60, 20);
      $$0.a(djm.iJ, 60, 20);
      $$0.a(djm.iK, 60, 20);
      $$0.a(djm.iL, 60, 20);
      $$0.a(djm.iM, 60, 20);
      $$0.a(djm.iN, 60, 20);
      $$0.a(djm.iO, 60, 20);
      $$0.a(djm.iP, 60, 20);
      $$0.a(djm.iQ, 60, 20);
      $$0.a(djm.iR, 60, 20);
      $$0.a(djm.iS, 60, 20);
      $$0.a(djm.iT, 60, 20);
      $$0.a(djm.iU, 60, 20);
      $$0.a(djm.iV, 60, 20);
      $$0.a(djm.iW, 60, 20);
      $$0.a(djm.iX, 60, 20);
      $$0.a(djm.tW, 5, 100);
      $$0.a(djm.tX, 5, 100);
      $$0.a(djm.tY, 5, 100);
      $$0.a(djm.mG, 30, 60);
      $$0.a(djm.nB, 60, 60);
      $$0.a(djm.ou, 60, 60);
      $$0.a(djm.oC, 30, 20);
      $$0.a(djm.pE, 5, 20);
      $$0.a(djm.oK, 60, 100);
      $$0.a(djm.pH, 5, 20);
      $$0.a(djm.pG, 30, 20);
      $$0.a(djm.aT, 30, 60);
      $$0.a(djm.aU, 30, 60);
      $$0.a(djm.sX, 15, 60);
      $$0.a(djm.sY, 15, 60);
      $$0.a(djm.sZ, 60, 100);
      $$0.a(djm.ta, 30, 60);
      $$0.a(djm.tb, 30, 60);
      $$0.a(djm.tf, 60, 100);
      $$0.a(djm.tg, 60, 100);
      $$0.a(djm.th, 60, 100);
      $$0.a(djm.ti, 30, 60);
      $$0.a(djm.fu, 15, 100);
   }
}
