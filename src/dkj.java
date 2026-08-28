import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dkj extends dgw {
   public static final MapCodec<dkj> c = b(dkj::new);
   public static final int d = 15;
   public static final dvo e = dve.aw;
   public static final dvf f = dmx.b;
   public static final dvf g = dmx.c;
   public static final dvf h = dmx.d;
   public static final dvf i = dmx.e;
   public static final dvf j = dmx.f;
   private static final Map<jj, dvf> k = dmx.h.entrySet().stream().filter($$0 -> $$0.getKey() != jj.a).collect(ad.a());
   private static final ezm l = dhj.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezm m = dhj.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ezm n = dhj.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ezm o = dhj.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ezm G = dhj.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<duo, ezm> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<dhj> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<dhj> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dkj> a() {
      return c;
   }

   public dkj(dun.d $$0) {
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
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dkj::o)));
   }

   private static ezm o(duo $$0) {
      ezm $$1 = ezj.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ezj.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ezj.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = ezj.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ezj.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dhl.a.o();
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public duo a(czk $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected duo b(ddl $$0, je $$1) {
      je $$2 = $$1.e();
      duo $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jj.b)) {
         duo $$4 = this.o();

         for (jj $$5 : jj.values()) {
            dvf $$6 = k.get($$5);
            if ($$6 != null) {
               $$4 = $$4.b($$6, Boolean.valueOf(this.g($$0.a_($$1.a($$5)))));
            }
         }

         return $$4;
      } else {
         return this.o();
      }
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jj.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ac().b(dec.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         duo $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.B_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ae() && this.a((deg)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.b(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  je $$8 = $$2.e();
                  if (!$$1.a_($$8).c($$1, $$8, jj.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(aws.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            je.a $$11 = new je.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dej)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.am().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ae() || !this.a((deg)$$1, $$11))) {
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

   protected boolean a(deg $$0, je $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(duo $$0) {
      return $$0.b(dve.C) && $$0.c(dve.C) ? 0 : this.R.getInt($$0.b());
   }

   private int r(duo $$0) {
      return $$0.b(dve.C) && $$0.c(dve.C) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(deg $$0, je $$1, int $$2, azl $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         duo $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dhj $$8 = $$6.b();
         if ($$8 instanceof dpt) {
            dpt.a($$0, $$1);
         }
      }
   }

   private duo a(deh $$0, je $$1, int $$2) {
      duo $$3 = a($$0, $$1);
      return $$3.a(dhl.cr) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(ddl $$0, je $$1) {
      for (jj $$2 : jj.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dej $$0, je $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jj $$3 : jj.values()) {
            duo $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(duo $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(azl $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dhj $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dkj $$0 = (dkj)dhl.cr;
      $$0.a(dhl.n, 5, 20);
      $$0.a(dhl.o, 5, 20);
      $$0.a(dhl.p, 5, 20);
      $$0.a(dhl.q, 5, 20);
      $$0.a(dhl.r, 5, 20);
      $$0.a(dhl.s, 5, 20);
      $$0.a(dhl.t, 5, 20);
      $$0.a(dhl.u, 5, 20);
      $$0.a(dhl.v, 5, 20);
      $$0.a(dhl.w, 5, 20);
      $$0.a(dhl.jt, 5, 20);
      $$0.a(dhl.ju, 5, 20);
      $$0.a(dhl.jv, 5, 20);
      $$0.a(dhl.jw, 5, 20);
      $$0.a(dhl.jx, 5, 20);
      $$0.a(dhl.jy, 5, 20);
      $$0.a(dhl.jz, 5, 20);
      $$0.a(dhl.jA, 5, 20);
      $$0.a(dhl.jB, 5, 20);
      $$0.a(dhl.jC, 5, 20);
      $$0.a(dhl.fh, 5, 20);
      $$0.a(dhl.jV, 5, 20);
      $$0.a(dhl.jW, 5, 20);
      $$0.a(dhl.jX, 5, 20);
      $$0.a(dhl.jY, 5, 20);
      $$0.a(dhl.jZ, 5, 20);
      $$0.a(dhl.ka, 5, 20);
      $$0.a(dhl.kb, 5, 20);
      $$0.a(dhl.kc, 5, 20);
      $$0.a(dhl.dU, 5, 20);
      $$0.a(dhl.kd, 5, 20);
      $$0.a(dhl.ke, 5, 20);
      $$0.a(dhl.kf, 5, 20);
      $$0.a(dhl.kg, 5, 20);
      $$0.a(dhl.kh, 5, 20);
      $$0.a(dhl.ki, 5, 20);
      $$0.a(dhl.kj, 5, 20);
      $$0.a(dhl.kk, 5, 20);
      $$0.a(dhl.cu, 5, 20);
      $$0.a(dhl.fL, 5, 20);
      $$0.a(dhl.fK, 5, 20);
      $$0.a(dhl.fM, 5, 20);
      $$0.a(dhl.hP, 5, 20);
      $$0.a(dhl.hQ, 5, 20);
      $$0.a(dhl.hR, 5, 20);
      $$0.a(dhl.hS, 5, 20);
      $$0.a(dhl.hT, 5, 20);
      $$0.a(dhl.hU, 5, 20);
      $$0.a(dhl.U, 5, 5);
      $$0.a(dhl.V, 5, 5);
      $$0.a(dhl.W, 5, 5);
      $$0.a(dhl.X, 5, 5);
      $$0.a(dhl.Y, 5, 5);
      $$0.a(dhl.Z, 5, 5);
      $$0.a(dhl.aa, 5, 5);
      $$0.a(dhl.ab, 5, 5);
      $$0.a(dhl.ae, 5, 5);
      $$0.a(dhl.al, 5, 5);
      $$0.a(dhl.af, 5, 5);
      $$0.a(dhl.ag, 5, 5);
      $$0.a(dhl.ah, 5, 5);
      $$0.a(dhl.ai, 5, 5);
      $$0.a(dhl.aj, 5, 5);
      $$0.a(dhl.ak, 5, 5);
      $$0.a(dhl.am, 5, 5);
      $$0.a(dhl.an, 5, 5);
      $$0.a(dhl.aw, 5, 5);
      $$0.a(dhl.ax, 5, 5);
      $$0.a(dhl.ay, 5, 5);
      $$0.a(dhl.az, 5, 5);
      $$0.a(dhl.aA, 5, 5);
      $$0.a(dhl.aB, 5, 5);
      $$0.a(dhl.aC, 5, 5);
      $$0.a(dhl.aD, 5, 5);
      $$0.a(dhl.ao, 5, 5);
      $$0.a(dhl.ap, 5, 5);
      $$0.a(dhl.aq, 5, 5);
      $$0.a(dhl.ar, 5, 5);
      $$0.a(dhl.as, 5, 5);
      $$0.a(dhl.at, 5, 5);
      $$0.a(dhl.au, 5, 5);
      $$0.a(dhl.av, 5, 5);
      $$0.a(dhl.ac, 5, 20);
      $$0.a(dhl.aE, 30, 60);
      $$0.a(dhl.aF, 30, 60);
      $$0.a(dhl.aG, 30, 60);
      $$0.a(dhl.aH, 30, 60);
      $$0.a(dhl.aI, 30, 60);
      $$0.a(dhl.aJ, 30, 60);
      $$0.a(dhl.aK, 30, 60);
      $$0.a(dhl.aL, 30, 60);
      $$0.a(dhl.cl, 30, 20);
      $$0.a(dhl.ck, 15, 100);
      $$0.a(dhl.bt, 60, 100);
      $$0.a(dhl.bu, 60, 100);
      $$0.a(dhl.bv, 60, 100);
      $$0.a(dhl.iD, 60, 100);
      $$0.a(dhl.iE, 60, 100);
      $$0.a(dhl.iF, 60, 100);
      $$0.a(dhl.iG, 60, 100);
      $$0.a(dhl.iH, 60, 100);
      $$0.a(dhl.iI, 60, 100);
      $$0.a(dhl.bR, 60, 100);
      $$0.a(dhl.bT, 60, 100);
      $$0.a(dhl.bU, 60, 100);
      $$0.a(dhl.bV, 60, 100);
      $$0.a(dhl.bW, 60, 100);
      $$0.a(dhl.bX, 60, 100);
      $$0.a(dhl.bY, 60, 100);
      $$0.a(dhl.bZ, 60, 100);
      $$0.a(dhl.ca, 60, 100);
      $$0.a(dhl.cb, 60, 100);
      $$0.a(dhl.cc, 60, 100);
      $$0.a(dhl.ce, 60, 100);
      $$0.a(dhl.bS, 60, 100);
      $$0.a(dhl.kC, 60, 100);
      $$0.a(dhl.cd, 60, 100);
      $$0.a(dhl.sB, 60, 100);
      $$0.a(dhl.bA, 30, 60);
      $$0.a(dhl.bB, 30, 60);
      $$0.a(dhl.bC, 30, 60);
      $$0.a(dhl.bD, 30, 60);
      $$0.a(dhl.bE, 30, 60);
      $$0.a(dhl.bF, 30, 60);
      $$0.a(dhl.bG, 30, 60);
      $$0.a(dhl.bH, 30, 60);
      $$0.a(dhl.bI, 30, 60);
      $$0.a(dhl.bJ, 30, 60);
      $$0.a(dhl.bK, 30, 60);
      $$0.a(dhl.bL, 30, 60);
      $$0.a(dhl.bM, 30, 60);
      $$0.a(dhl.bN, 30, 60);
      $$0.a(dhl.bO, 30, 60);
      $$0.a(dhl.bP, 30, 60);
      $$0.a(dhl.ff, 15, 100);
      $$0.a(dhl.iB, 5, 5);
      $$0.a(dhl.ij, 60, 20);
      $$0.a(dhl.pd, 15, 20);
      $$0.a(dhl.ik, 60, 20);
      $$0.a(dhl.il, 60, 20);
      $$0.a(dhl.im, 60, 20);
      $$0.a(dhl.in, 60, 20);
      $$0.a(dhl.io, 60, 20);
      $$0.a(dhl.ip, 60, 20);
      $$0.a(dhl.iq, 60, 20);
      $$0.a(dhl.ir, 60, 20);
      $$0.a(dhl.is, 60, 20);
      $$0.a(dhl.it, 60, 20);
      $$0.a(dhl.iu, 60, 20);
      $$0.a(dhl.iv, 60, 20);
      $$0.a(dhl.iw, 60, 20);
      $$0.a(dhl.ix, 60, 20);
      $$0.a(dhl.iy, 60, 20);
      $$0.a(dhl.iz, 60, 20);
      $$0.a(dhl.me, 30, 60);
      $$0.a(dhl.mZ, 60, 60);
      $$0.a(dhl.nS, 60, 60);
      $$0.a(dhl.oa, 30, 20);
      $$0.a(dhl.pc, 5, 20);
      $$0.a(dhl.oi, 60, 100);
      $$0.a(dhl.pf, 5, 20);
      $$0.a(dhl.pe, 30, 20);
      $$0.a(dhl.aM, 30, 60);
      $$0.a(dhl.aN, 30, 60);
      $$0.a(dhl.sv, 15, 60);
      $$0.a(dhl.sw, 15, 60);
      $$0.a(dhl.sx, 60, 100);
      $$0.a(dhl.sy, 30, 60);
      $$0.a(dhl.sz, 30, 60);
      $$0.a(dhl.sD, 60, 100);
      $$0.a(dhl.sE, 60, 100);
      $$0.a(dhl.sF, 60, 100);
      $$0.a(dhl.sG, 30, 60);
      $$0.a(dhl.fg, 15, 100);
   }
}
