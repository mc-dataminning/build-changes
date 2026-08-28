import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dkm extends dgz {
   public static final MapCodec<dkm> c = b(dkm::new);
   public static final int d = 15;
   public static final dvs e = dvi.aw;
   public static final dvj f = dna.b;
   public static final dvj g = dna.c;
   public static final dvj h = dna.d;
   public static final dvj i = dna.e;
   public static final dvj j = dna.f;
   private static final Map<jk, dvj> k = dna.h.entrySet().stream().filter($$0 -> $$0.getKey() != jk.a).collect(ad.a());
   private static final ezq l = dhm.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezq m = dhm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ezq n = dhm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezq o = dhm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ezq G = dhm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dus, ezq> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<dhm> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<dhm> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dkm> a() {
      return c;
   }

   public dkm(dur.d $$0) {
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
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dkm::o)));
   }

   private static ezq o(dus $$0) {
      ezq $$1 = ezn.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ezn.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ezn.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = ezn.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ezn.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dho.a.n();
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dus a(czn $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dus b(ddo $$0, jf $$1) {
      jf $$2 = $$1.e();
      dus $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jk.b)) {
         dus $$4 = this.n();

         for (jk $$5 : jk.values()) {
            dvj $$6 = k.get($$5);
            if ($$6 != null) {
               $$4 = $$4.b($$6, Boolean.valueOf(this.g($$0.a_($$1.a($$5)))));
            }
         }

         return $$4;
      } else {
         return this.n();
      }
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jk.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ac().b(def.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dus $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.C_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ae() && this.a((dej)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.b(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  jf $$8 = $$2.e();
                  if (!$$1.a_($$8).c($$1, $$8, jk.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(awu.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            jf.a $$11 = new jf.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dem)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.am().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ae() || !this.a((dej)$$1, $$11))) {
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

   protected boolean a(dej $$0, jf $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dus $$0) {
      return $$0.b(dvi.C) && $$0.c(dvi.C) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dus $$0) {
      return $$0.b(dvi.C) && $$0.c(dvi.C) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dej $$0, jf $$1, int $$2, azn $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dus $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dhm $$8 = $$6.b();
         if ($$8 instanceof dpw) {
            dpw.a($$0, $$1);
         }
      }
   }

   private dus a(dek $$0, jf $$1, int $$2) {
      dus $$3 = a($$0, $$1);
      return $$3.a(dho.cr) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(ddo $$0, jf $$1) {
      for (jk $$2 : jk.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dem $$0, jf $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jk $$3 : jk.values()) {
            dus $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dus $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(azn $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dhm $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dkm $$0 = (dkm)dho.cr;
      $$0.a(dho.n, 5, 20);
      $$0.a(dho.o, 5, 20);
      $$0.a(dho.p, 5, 20);
      $$0.a(dho.q, 5, 20);
      $$0.a(dho.r, 5, 20);
      $$0.a(dho.s, 5, 20);
      $$0.a(dho.t, 5, 20);
      $$0.a(dho.u, 5, 20);
      $$0.a(dho.v, 5, 20);
      $$0.a(dho.w, 5, 20);
      $$0.a(dho.jt, 5, 20);
      $$0.a(dho.ju, 5, 20);
      $$0.a(dho.jv, 5, 20);
      $$0.a(dho.jw, 5, 20);
      $$0.a(dho.jx, 5, 20);
      $$0.a(dho.jy, 5, 20);
      $$0.a(dho.jz, 5, 20);
      $$0.a(dho.jA, 5, 20);
      $$0.a(dho.jB, 5, 20);
      $$0.a(dho.jC, 5, 20);
      $$0.a(dho.fh, 5, 20);
      $$0.a(dho.jV, 5, 20);
      $$0.a(dho.jW, 5, 20);
      $$0.a(dho.jX, 5, 20);
      $$0.a(dho.jY, 5, 20);
      $$0.a(dho.jZ, 5, 20);
      $$0.a(dho.ka, 5, 20);
      $$0.a(dho.kb, 5, 20);
      $$0.a(dho.kc, 5, 20);
      $$0.a(dho.dU, 5, 20);
      $$0.a(dho.kd, 5, 20);
      $$0.a(dho.ke, 5, 20);
      $$0.a(dho.kf, 5, 20);
      $$0.a(dho.kg, 5, 20);
      $$0.a(dho.kh, 5, 20);
      $$0.a(dho.ki, 5, 20);
      $$0.a(dho.kj, 5, 20);
      $$0.a(dho.kk, 5, 20);
      $$0.a(dho.cu, 5, 20);
      $$0.a(dho.fL, 5, 20);
      $$0.a(dho.fK, 5, 20);
      $$0.a(dho.fM, 5, 20);
      $$0.a(dho.hP, 5, 20);
      $$0.a(dho.hQ, 5, 20);
      $$0.a(dho.hR, 5, 20);
      $$0.a(dho.hS, 5, 20);
      $$0.a(dho.hT, 5, 20);
      $$0.a(dho.hU, 5, 20);
      $$0.a(dho.U, 5, 5);
      $$0.a(dho.V, 5, 5);
      $$0.a(dho.W, 5, 5);
      $$0.a(dho.X, 5, 5);
      $$0.a(dho.Y, 5, 5);
      $$0.a(dho.Z, 5, 5);
      $$0.a(dho.aa, 5, 5);
      $$0.a(dho.ab, 5, 5);
      $$0.a(dho.ae, 5, 5);
      $$0.a(dho.al, 5, 5);
      $$0.a(dho.af, 5, 5);
      $$0.a(dho.ag, 5, 5);
      $$0.a(dho.ah, 5, 5);
      $$0.a(dho.ai, 5, 5);
      $$0.a(dho.aj, 5, 5);
      $$0.a(dho.ak, 5, 5);
      $$0.a(dho.am, 5, 5);
      $$0.a(dho.an, 5, 5);
      $$0.a(dho.aw, 5, 5);
      $$0.a(dho.ax, 5, 5);
      $$0.a(dho.ay, 5, 5);
      $$0.a(dho.az, 5, 5);
      $$0.a(dho.aA, 5, 5);
      $$0.a(dho.aB, 5, 5);
      $$0.a(dho.aC, 5, 5);
      $$0.a(dho.aD, 5, 5);
      $$0.a(dho.ao, 5, 5);
      $$0.a(dho.ap, 5, 5);
      $$0.a(dho.aq, 5, 5);
      $$0.a(dho.ar, 5, 5);
      $$0.a(dho.as, 5, 5);
      $$0.a(dho.at, 5, 5);
      $$0.a(dho.au, 5, 5);
      $$0.a(dho.av, 5, 5);
      $$0.a(dho.ac, 5, 20);
      $$0.a(dho.aE, 30, 60);
      $$0.a(dho.aF, 30, 60);
      $$0.a(dho.aG, 30, 60);
      $$0.a(dho.aH, 30, 60);
      $$0.a(dho.aI, 30, 60);
      $$0.a(dho.aJ, 30, 60);
      $$0.a(dho.aK, 30, 60);
      $$0.a(dho.aL, 30, 60);
      $$0.a(dho.cl, 30, 20);
      $$0.a(dho.ck, 15, 100);
      $$0.a(dho.bt, 60, 100);
      $$0.a(dho.bu, 60, 100);
      $$0.a(dho.bv, 60, 100);
      $$0.a(dho.iD, 60, 100);
      $$0.a(dho.iE, 60, 100);
      $$0.a(dho.iF, 60, 100);
      $$0.a(dho.iG, 60, 100);
      $$0.a(dho.iH, 60, 100);
      $$0.a(dho.iI, 60, 100);
      $$0.a(dho.bR, 60, 100);
      $$0.a(dho.bT, 60, 100);
      $$0.a(dho.bU, 60, 100);
      $$0.a(dho.bV, 60, 100);
      $$0.a(dho.bW, 60, 100);
      $$0.a(dho.bX, 60, 100);
      $$0.a(dho.bY, 60, 100);
      $$0.a(dho.bZ, 60, 100);
      $$0.a(dho.ca, 60, 100);
      $$0.a(dho.cb, 60, 100);
      $$0.a(dho.cc, 60, 100);
      $$0.a(dho.ce, 60, 100);
      $$0.a(dho.bS, 60, 100);
      $$0.a(dho.kC, 60, 100);
      $$0.a(dho.cd, 60, 100);
      $$0.a(dho.sB, 60, 100);
      $$0.a(dho.bA, 30, 60);
      $$0.a(dho.bB, 30, 60);
      $$0.a(dho.bC, 30, 60);
      $$0.a(dho.bD, 30, 60);
      $$0.a(dho.bE, 30, 60);
      $$0.a(dho.bF, 30, 60);
      $$0.a(dho.bG, 30, 60);
      $$0.a(dho.bH, 30, 60);
      $$0.a(dho.bI, 30, 60);
      $$0.a(dho.bJ, 30, 60);
      $$0.a(dho.bK, 30, 60);
      $$0.a(dho.bL, 30, 60);
      $$0.a(dho.bM, 30, 60);
      $$0.a(dho.bN, 30, 60);
      $$0.a(dho.bO, 30, 60);
      $$0.a(dho.bP, 30, 60);
      $$0.a(dho.ff, 15, 100);
      $$0.a(dho.iB, 5, 5);
      $$0.a(dho.ij, 60, 20);
      $$0.a(dho.pd, 15, 20);
      $$0.a(dho.ik, 60, 20);
      $$0.a(dho.il, 60, 20);
      $$0.a(dho.im, 60, 20);
      $$0.a(dho.in, 60, 20);
      $$0.a(dho.io, 60, 20);
      $$0.a(dho.ip, 60, 20);
      $$0.a(dho.iq, 60, 20);
      $$0.a(dho.ir, 60, 20);
      $$0.a(dho.is, 60, 20);
      $$0.a(dho.it, 60, 20);
      $$0.a(dho.iu, 60, 20);
      $$0.a(dho.iv, 60, 20);
      $$0.a(dho.iw, 60, 20);
      $$0.a(dho.ix, 60, 20);
      $$0.a(dho.iy, 60, 20);
      $$0.a(dho.iz, 60, 20);
      $$0.a(dho.me, 30, 60);
      $$0.a(dho.mZ, 60, 60);
      $$0.a(dho.nS, 60, 60);
      $$0.a(dho.oa, 30, 20);
      $$0.a(dho.pc, 5, 20);
      $$0.a(dho.oi, 60, 100);
      $$0.a(dho.pf, 5, 20);
      $$0.a(dho.pe, 30, 20);
      $$0.a(dho.aM, 30, 60);
      $$0.a(dho.aN, 30, 60);
      $$0.a(dho.sv, 15, 60);
      $$0.a(dho.sw, 15, 60);
      $$0.a(dho.sx, 60, 100);
      $$0.a(dho.sy, 30, 60);
      $$0.a(dho.sz, 30, 60);
      $$0.a(dho.sD, 60, 100);
      $$0.a(dho.sE, 60, 100);
      $$0.a(dho.sF, 60, 100);
      $$0.a(dho.sG, 30, 60);
      $$0.a(dho.fg, 15, 100);
   }
}
