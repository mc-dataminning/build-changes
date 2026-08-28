import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class diy extends dfl {
   public static final MapCodec<diy> c = b(diy::new);
   public static final int d = 15;
   public static final duc e = dts.aw;
   public static final dtt f = dlm.b;
   public static final dtt g = dlm.c;
   public static final dtt h = dlm.d;
   public static final dtt i = dlm.e;
   public static final dtt j = dlm.f;
   private static final Map<ji, dtt> k = dlm.h.entrySet().stream().filter($$0 -> $$0.getKey() != ji.a).collect(ad.a());
   private static final ext l = dfy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ext m = dfy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ext n = dfy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ext o = dfy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ext F = dfy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dtc, ext> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dfy> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dfy> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<diy> a() {
      return c;
   }

   public diy(dtb.d $$0) {
      super($$0, 1.0F);
      this.k(
         this.E
            .b()
            .a(e, Integer.valueOf(0))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
            .a(h, Boolean.valueOf(false))
            .a(i, Boolean.valueOf(false))
            .a(j, Boolean.valueOf(false))
      );
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), diy::m)));
   }

   private static ext m(dtc $$0) {
      ext $$1 = exq.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = exq.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = exq.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = exq.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = exq.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dga.a.o();
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dtc a(cyd $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dtc b(dcc $$0, jd $$1) {
      jd $$2 = $$1.e();
      dtc $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ji.b)) {
         dtc $$4 = this.o();

         for (ji $$5 : ji.values()) {
            dtt $$6 = k.get($$5);
            if ($$6 != null) {
               $$4 = $$4.a($$6, Boolean.valueOf(this.f($$0.a_($$1.a($$5)))));
            }
         }

         return $$4;
      } else {
         return this.o();
      }
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      jd $$3 = $$2.e();
      return $$1.a_($$3).d($$1, $$3, ji.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ab().b(dcs.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dtc $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ad() && this.a((dcw)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  jd $$8 = $$2.e();
                  if (!$$1.a_($$8).d($$1, $$8, ji.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.e()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(awd.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            jd.a $$11 = new jd.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dcz)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ad() || !this.a((dcw)$$1, $$11))) {
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

   protected boolean a(dcw $$0, jd $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int n(dtc $$0) {
      return $$0.b(dts.C) && $$0.c(dts.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dtc $$0) {
      return $$0.b(dts.C) && $$0.c(dts.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dcw $$0, jd $$1, int $$2, ayw $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dtc $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dfy $$8 = $$6.b();
         if ($$8 instanceof doi) {
            doi.a($$0, $$1);
         }
      }
   }

   private dtc a(dcx $$0, jd $$1, int $$2) {
      dtc $$3 = a($$0, $$1);
      return $$3.a(dga.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dcc $$0, jd $$1) {
      for (ji $$2 : ji.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dcz $$0, jd $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ji $$3 : ji.values()) {
            dtc $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dtc $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(ayw $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dfy $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      diy $$0 = (diy)dga.cr;
      $$0.a(dga.n, 5, 20);
      $$0.a(dga.o, 5, 20);
      $$0.a(dga.p, 5, 20);
      $$0.a(dga.q, 5, 20);
      $$0.a(dga.r, 5, 20);
      $$0.a(dga.s, 5, 20);
      $$0.a(dga.t, 5, 20);
      $$0.a(dga.u, 5, 20);
      $$0.a(dga.v, 5, 20);
      $$0.a(dga.w, 5, 20);
      $$0.a(dga.jt, 5, 20);
      $$0.a(dga.ju, 5, 20);
      $$0.a(dga.jv, 5, 20);
      $$0.a(dga.jw, 5, 20);
      $$0.a(dga.jx, 5, 20);
      $$0.a(dga.jy, 5, 20);
      $$0.a(dga.jz, 5, 20);
      $$0.a(dga.jA, 5, 20);
      $$0.a(dga.jB, 5, 20);
      $$0.a(dga.jC, 5, 20);
      $$0.a(dga.fh, 5, 20);
      $$0.a(dga.jV, 5, 20);
      $$0.a(dga.jW, 5, 20);
      $$0.a(dga.jX, 5, 20);
      $$0.a(dga.jY, 5, 20);
      $$0.a(dga.jZ, 5, 20);
      $$0.a(dga.ka, 5, 20);
      $$0.a(dga.kb, 5, 20);
      $$0.a(dga.kc, 5, 20);
      $$0.a(dga.dU, 5, 20);
      $$0.a(dga.kd, 5, 20);
      $$0.a(dga.ke, 5, 20);
      $$0.a(dga.kf, 5, 20);
      $$0.a(dga.kg, 5, 20);
      $$0.a(dga.kh, 5, 20);
      $$0.a(dga.ki, 5, 20);
      $$0.a(dga.kj, 5, 20);
      $$0.a(dga.kk, 5, 20);
      $$0.a(dga.cu, 5, 20);
      $$0.a(dga.fL, 5, 20);
      $$0.a(dga.fK, 5, 20);
      $$0.a(dga.fM, 5, 20);
      $$0.a(dga.hP, 5, 20);
      $$0.a(dga.hQ, 5, 20);
      $$0.a(dga.hR, 5, 20);
      $$0.a(dga.hS, 5, 20);
      $$0.a(dga.hT, 5, 20);
      $$0.a(dga.hU, 5, 20);
      $$0.a(dga.U, 5, 5);
      $$0.a(dga.V, 5, 5);
      $$0.a(dga.W, 5, 5);
      $$0.a(dga.X, 5, 5);
      $$0.a(dga.Y, 5, 5);
      $$0.a(dga.Z, 5, 5);
      $$0.a(dga.aa, 5, 5);
      $$0.a(dga.ab, 5, 5);
      $$0.a(dga.ae, 5, 5);
      $$0.a(dga.al, 5, 5);
      $$0.a(dga.af, 5, 5);
      $$0.a(dga.ag, 5, 5);
      $$0.a(dga.ah, 5, 5);
      $$0.a(dga.ai, 5, 5);
      $$0.a(dga.aj, 5, 5);
      $$0.a(dga.ak, 5, 5);
      $$0.a(dga.am, 5, 5);
      $$0.a(dga.an, 5, 5);
      $$0.a(dga.aw, 5, 5);
      $$0.a(dga.ax, 5, 5);
      $$0.a(dga.ay, 5, 5);
      $$0.a(dga.az, 5, 5);
      $$0.a(dga.aA, 5, 5);
      $$0.a(dga.aB, 5, 5);
      $$0.a(dga.aC, 5, 5);
      $$0.a(dga.aD, 5, 5);
      $$0.a(dga.ao, 5, 5);
      $$0.a(dga.ap, 5, 5);
      $$0.a(dga.aq, 5, 5);
      $$0.a(dga.ar, 5, 5);
      $$0.a(dga.as, 5, 5);
      $$0.a(dga.at, 5, 5);
      $$0.a(dga.au, 5, 5);
      $$0.a(dga.av, 5, 5);
      $$0.a(dga.ac, 5, 20);
      $$0.a(dga.aE, 30, 60);
      $$0.a(dga.aF, 30, 60);
      $$0.a(dga.aG, 30, 60);
      $$0.a(dga.aH, 30, 60);
      $$0.a(dga.aI, 30, 60);
      $$0.a(dga.aJ, 30, 60);
      $$0.a(dga.aK, 30, 60);
      $$0.a(dga.aL, 30, 60);
      $$0.a(dga.cl, 30, 20);
      $$0.a(dga.ck, 15, 100);
      $$0.a(dga.bt, 60, 100);
      $$0.a(dga.bu, 60, 100);
      $$0.a(dga.bv, 60, 100);
      $$0.a(dga.iD, 60, 100);
      $$0.a(dga.iE, 60, 100);
      $$0.a(dga.iF, 60, 100);
      $$0.a(dga.iG, 60, 100);
      $$0.a(dga.iH, 60, 100);
      $$0.a(dga.iI, 60, 100);
      $$0.a(dga.bR, 60, 100);
      $$0.a(dga.bT, 60, 100);
      $$0.a(dga.bU, 60, 100);
      $$0.a(dga.bV, 60, 100);
      $$0.a(dga.bW, 60, 100);
      $$0.a(dga.bX, 60, 100);
      $$0.a(dga.bY, 60, 100);
      $$0.a(dga.bZ, 60, 100);
      $$0.a(dga.ca, 60, 100);
      $$0.a(dga.cb, 60, 100);
      $$0.a(dga.cc, 60, 100);
      $$0.a(dga.ce, 60, 100);
      $$0.a(dga.bS, 60, 100);
      $$0.a(dga.kC, 60, 100);
      $$0.a(dga.cd, 60, 100);
      $$0.a(dga.sB, 60, 100);
      $$0.a(dga.bA, 30, 60);
      $$0.a(dga.bB, 30, 60);
      $$0.a(dga.bC, 30, 60);
      $$0.a(dga.bD, 30, 60);
      $$0.a(dga.bE, 30, 60);
      $$0.a(dga.bF, 30, 60);
      $$0.a(dga.bG, 30, 60);
      $$0.a(dga.bH, 30, 60);
      $$0.a(dga.bI, 30, 60);
      $$0.a(dga.bJ, 30, 60);
      $$0.a(dga.bK, 30, 60);
      $$0.a(dga.bL, 30, 60);
      $$0.a(dga.bM, 30, 60);
      $$0.a(dga.bN, 30, 60);
      $$0.a(dga.bO, 30, 60);
      $$0.a(dga.bP, 30, 60);
      $$0.a(dga.ff, 15, 100);
      $$0.a(dga.iB, 5, 5);
      $$0.a(dga.ij, 60, 20);
      $$0.a(dga.pd, 15, 20);
      $$0.a(dga.ik, 60, 20);
      $$0.a(dga.il, 60, 20);
      $$0.a(dga.im, 60, 20);
      $$0.a(dga.in, 60, 20);
      $$0.a(dga.io, 60, 20);
      $$0.a(dga.ip, 60, 20);
      $$0.a(dga.iq, 60, 20);
      $$0.a(dga.ir, 60, 20);
      $$0.a(dga.is, 60, 20);
      $$0.a(dga.it, 60, 20);
      $$0.a(dga.iu, 60, 20);
      $$0.a(dga.iv, 60, 20);
      $$0.a(dga.iw, 60, 20);
      $$0.a(dga.ix, 60, 20);
      $$0.a(dga.iy, 60, 20);
      $$0.a(dga.iz, 60, 20);
      $$0.a(dga.me, 30, 60);
      $$0.a(dga.mZ, 60, 60);
      $$0.a(dga.nS, 60, 60);
      $$0.a(dga.oa, 30, 20);
      $$0.a(dga.pc, 5, 20);
      $$0.a(dga.oi, 60, 100);
      $$0.a(dga.pf, 5, 20);
      $$0.a(dga.pe, 30, 20);
      $$0.a(dga.aM, 30, 60);
      $$0.a(dga.aN, 30, 60);
      $$0.a(dga.sv, 15, 60);
      $$0.a(dga.sw, 15, 60);
      $$0.a(dga.sx, 60, 100);
      $$0.a(dga.sy, 30, 60);
      $$0.a(dga.sz, 30, 60);
      $$0.a(dga.sD, 60, 100);
      $$0.a(dga.sE, 60, 100);
      $$0.a(dga.sF, 60, 100);
      $$0.a(dga.sG, 30, 60);
      $$0.a(dga.fg, 15, 100);
   }
}
