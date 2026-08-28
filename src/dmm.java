import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dmm extends diy {
   public static final MapCodec<dmm> c = b(dmm::new);
   public static final int d = 15;
   public static final dxv e = dxm.az;
   public static final dxn f = dpd.b;
   public static final dxn g = dpd.c;
   public static final dxn h = dpd.d;
   public static final dxn i = dpd.e;
   public static final dxn j = dpd.f;
   private static final Map<jn, dxn> k = dpd.h.entrySet().stream().filter($$0 -> $$0.getKey() != jn.a).collect(af.a());
   private static final fbt l = djl.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbt m = djl.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbt n = djl.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbt o = djl.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbt G = djl.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dww, fbt> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<djl> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<djl> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dmm> a() {
      return c;
   }

   public dmm(dwv.d $$0) {
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
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dmm::o)));
   }

   private static fbt o(dww $$0) {
      fbt $$1 = fbq.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = fbq.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = fbq.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = fbq.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = fbq.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(e)) : djn.a.m();
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dww a(daf $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dww b(dfm $$0, ji $$1) {
      ji $$2 = $$1.e();
      dww $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jn.b)) {
         dww $$4 = this.m();

         for (jn $$5 : jn.values()) {
            dxn $$6 = k.get($$5);
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
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jn.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.O().b(dgd.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dww $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.G_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ag() && this.a((dgh)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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
                        int $$16 = this.a((dgk)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.am().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ag() || !this.a((dgh)$$1, $$11))) {
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

   protected boolean a(dgh $$0, ji $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dww $$0) {
      return $$0.b(dxm.J) && $$0.c(dxm.J) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dww $$0) {
      return $$0.b(dxm.J) && $$0.c(dxm.J) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dgh $$0, ji $$1, int $$2, azh $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dww $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         djl $$8 = $$6.b();
         if ($$8 instanceof drz) {
            drz.a($$0, $$1);
         }
      }
   }

   private dww a(dgk $$0, ji $$1, int $$2) {
      dww $$3 = a((dfm)$$0, $$1);
      return $$3.a(djn.cy) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dfm $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dgk $$0, ji $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jn $$3 : jn.values()) {
            dww $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dww $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azh $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(djl $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dmm $$0 = (dmm)djn.cy;
      $$0.a(djn.n, 5, 20);
      $$0.a(djn.o, 5, 20);
      $$0.a(djn.p, 5, 20);
      $$0.a(djn.q, 5, 20);
      $$0.a(djn.r, 5, 20);
      $$0.a(djn.s, 5, 20);
      $$0.a(djn.t, 5, 20);
      $$0.a(djn.v, 5, 20);
      $$0.a(djn.w, 5, 20);
      $$0.a(djn.x, 5, 20);
      $$0.a(djn.y, 5, 20);
      $$0.a(djn.jR, 5, 20);
      $$0.a(djn.jS, 5, 20);
      $$0.a(djn.jT, 5, 20);
      $$0.a(djn.jU, 5, 20);
      $$0.a(djn.jV, 5, 20);
      $$0.a(djn.jW, 5, 20);
      $$0.a(djn.jX, 5, 20);
      $$0.a(djn.jY, 5, 20);
      $$0.a(djn.jZ, 5, 20);
      $$0.a(djn.ka, 5, 20);
      $$0.a(djn.kb, 5, 20);
      $$0.a(djn.fw, 5, 20);
      $$0.a(djn.ku, 5, 20);
      $$0.a(djn.kv, 5, 20);
      $$0.a(djn.kw, 5, 20);
      $$0.a(djn.kx, 5, 20);
      $$0.a(djn.ky, 5, 20);
      $$0.a(djn.kz, 5, 20);
      $$0.a(djn.kA, 5, 20);
      $$0.a(djn.kB, 5, 20);
      $$0.a(djn.kC, 5, 20);
      $$0.a(djn.eh, 5, 20);
      $$0.a(djn.kD, 5, 20);
      $$0.a(djn.kE, 5, 20);
      $$0.a(djn.kF, 5, 20);
      $$0.a(djn.kG, 5, 20);
      $$0.a(djn.kH, 5, 20);
      $$0.a(djn.kI, 5, 20);
      $$0.a(djn.kJ, 5, 20);
      $$0.a(djn.kK, 5, 20);
      $$0.a(djn.kL, 5, 20);
      $$0.a(djn.cC, 5, 20);
      $$0.a(djn.gg, 5, 20);
      $$0.a(djn.gf, 5, 20);
      $$0.a(djn.gh, 5, 20);
      $$0.a(djn.im, 5, 20);
      $$0.a(djn.in, 5, 20);
      $$0.a(djn.io, 5, 20);
      $$0.a(djn.ip, 5, 20);
      $$0.a(djn.iq, 5, 20);
      $$0.a(djn.ir, 5, 20);
      $$0.a(djn.is, 5, 20);
      $$0.a(djn.X, 5, 5);
      $$0.a(djn.Y, 5, 5);
      $$0.a(djn.Z, 5, 5);
      $$0.a(djn.aa, 5, 5);
      $$0.a(djn.ab, 5, 5);
      $$0.a(djn.ac, 5, 5);
      $$0.a(djn.ae, 5, 5);
      $$0.a(djn.ad, 5, 5);
      $$0.a(djn.af, 5, 5);
      $$0.a(djn.ai, 5, 5);
      $$0.a(djn.aq, 5, 5);
      $$0.a(djn.aj, 5, 5);
      $$0.a(djn.ak, 5, 5);
      $$0.a(djn.al, 5, 5);
      $$0.a(djn.am, 5, 5);
      $$0.a(djn.an, 5, 5);
      $$0.a(djn.ao, 5, 5);
      $$0.a(djn.ap, 5, 5);
      $$0.a(djn.ar, 5, 5);
      $$0.a(djn.as, 5, 5);
      $$0.a(djn.aB, 5, 5);
      $$0.a(djn.aC, 5, 5);
      $$0.a(djn.aD, 5, 5);
      $$0.a(djn.aE, 5, 5);
      $$0.a(djn.aF, 5, 5);
      $$0.a(djn.aG, 5, 5);
      $$0.a(djn.aH, 5, 5);
      $$0.a(djn.aI, 5, 5);
      $$0.a(djn.aJ, 5, 5);
      $$0.a(djn.at, 5, 5);
      $$0.a(djn.au, 5, 5);
      $$0.a(djn.av, 5, 5);
      $$0.a(djn.aw, 5, 5);
      $$0.a(djn.ax, 5, 5);
      $$0.a(djn.ay, 5, 5);
      $$0.a(djn.u, 5, 5);
      $$0.a(djn.az, 5, 5);
      $$0.a(djn.aA, 5, 5);
      $$0.a(djn.ag, 5, 20);
      $$0.a(djn.aK, 30, 60);
      $$0.a(djn.aL, 30, 60);
      $$0.a(djn.aM, 30, 60);
      $$0.a(djn.aN, 30, 60);
      $$0.a(djn.aO, 30, 60);
      $$0.a(djn.aP, 30, 60);
      $$0.a(djn.aQ, 30, 60);
      $$0.a(djn.aR, 30, 60);
      $$0.a(djn.aS, 30, 60);
      $$0.a(djn.cs, 30, 20);
      $$0.a(djn.cr, 15, 100);
      $$0.a(djn.bA, 60, 100);
      $$0.a(djn.bB, 60, 100);
      $$0.a(djn.bC, 60, 100);
      $$0.a(djn.jb, 60, 100);
      $$0.a(djn.jc, 60, 100);
      $$0.a(djn.jd, 60, 100);
      $$0.a(djn.je, 60, 100);
      $$0.a(djn.jf, 60, 100);
      $$0.a(djn.jg, 60, 100);
      $$0.a(djn.bY, 60, 100);
      $$0.a(djn.ca, 60, 100);
      $$0.a(djn.tZ, 60, 100);
      $$0.a(djn.ua, 60, 100);
      $$0.a(djn.cb, 60, 100);
      $$0.a(djn.cc, 60, 100);
      $$0.a(djn.cd, 60, 100);
      $$0.a(djn.ce, 60, 100);
      $$0.a(djn.cf, 60, 100);
      $$0.a(djn.cg, 60, 100);
      $$0.a(djn.ch, 60, 100);
      $$0.a(djn.ci, 60, 100);
      $$0.a(djn.cj, 60, 100);
      $$0.a(djn.cl, 60, 100);
      $$0.a(djn.bZ, 60, 100);
      $$0.a(djn.le, 60, 100);
      $$0.a(djn.ck, 60, 100);
      $$0.a(djn.td, 60, 100);
      $$0.a(djn.bH, 30, 60);
      $$0.a(djn.bI, 30, 60);
      $$0.a(djn.bJ, 30, 60);
      $$0.a(djn.bK, 30, 60);
      $$0.a(djn.bL, 30, 60);
      $$0.a(djn.bM, 30, 60);
      $$0.a(djn.bN, 30, 60);
      $$0.a(djn.bO, 30, 60);
      $$0.a(djn.bP, 30, 60);
      $$0.a(djn.bQ, 30, 60);
      $$0.a(djn.bR, 30, 60);
      $$0.a(djn.bS, 30, 60);
      $$0.a(djn.bT, 30, 60);
      $$0.a(djn.bU, 30, 60);
      $$0.a(djn.bV, 30, 60);
      $$0.a(djn.bW, 30, 60);
      $$0.a(djn.ft, 15, 100);
      $$0.a(djn.iZ, 5, 5);
      $$0.a(djn.iH, 60, 20);
      $$0.a(djn.pF, 15, 20);
      $$0.a(djn.iI, 60, 20);
      $$0.a(djn.iJ, 60, 20);
      $$0.a(djn.iK, 60, 20);
      $$0.a(djn.iL, 60, 20);
      $$0.a(djn.iM, 60, 20);
      $$0.a(djn.iN, 60, 20);
      $$0.a(djn.iO, 60, 20);
      $$0.a(djn.iP, 60, 20);
      $$0.a(djn.iQ, 60, 20);
      $$0.a(djn.iR, 60, 20);
      $$0.a(djn.iS, 60, 20);
      $$0.a(djn.iT, 60, 20);
      $$0.a(djn.iU, 60, 20);
      $$0.a(djn.iV, 60, 20);
      $$0.a(djn.iW, 60, 20);
      $$0.a(djn.iX, 60, 20);
      $$0.a(djn.tW, 5, 100);
      $$0.a(djn.tX, 5, 100);
      $$0.a(djn.tY, 5, 100);
      $$0.a(djn.mG, 30, 60);
      $$0.a(djn.nB, 60, 60);
      $$0.a(djn.ou, 60, 60);
      $$0.a(djn.oC, 30, 20);
      $$0.a(djn.pE, 5, 20);
      $$0.a(djn.oK, 60, 100);
      $$0.a(djn.pH, 5, 20);
      $$0.a(djn.pG, 30, 20);
      $$0.a(djn.aT, 30, 60);
      $$0.a(djn.aU, 30, 60);
      $$0.a(djn.sX, 15, 60);
      $$0.a(djn.sY, 15, 60);
      $$0.a(djn.sZ, 60, 100);
      $$0.a(djn.ta, 30, 60);
      $$0.a(djn.tb, 30, 60);
      $$0.a(djn.tf, 60, 100);
      $$0.a(djn.tg, 60, 100);
      $$0.a(djn.th, 60, 100);
      $$0.a(djn.ti, 30, 60);
      $$0.a(djn.fu, 15, 100);
   }
}
