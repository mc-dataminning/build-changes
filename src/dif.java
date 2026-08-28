import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dif extends des {
   public static final MapCodec<dif> c = b(dif::new);
   public static final int d = 15;
   public static final dth e = dsx.aw;
   public static final dsy f = dkt.b;
   public static final dsy g = dkt.c;
   public static final dsy h = dkt.d;
   public static final dsy i = dkt.e;
   public static final dsy j = dkt.f;
   private static final Map<jf, dsy> k = dkt.h.entrySet().stream().filter($$0 -> $$0.getKey() != jf.a).collect(ac.a());
   private static final ews l = dff.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ews m = dff.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ews n = dff.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ews o = dff.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ews F = dff.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dsh, ews> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dff> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dff> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dif> a() {
      return c;
   }

   public dif(dsg.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dif::m)));
   }

   private static ews m(dsh $$0) {
      ews $$1 = ewp.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ewp.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ewp.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ewp.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ewp.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dfh.a.o();
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dsh a(cxk $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dsh b(dbj $$0, ja $$1) {
      ja $$2 = $$1.d();
      dsh $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, jf.b)) {
         dsh $$4 = this.o();

         for (jf $$5 : jf.values()) {
            dsy $$6 = k.get($$5);
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
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, jf.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ab().b(dbz.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dsh $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ad() && this.a((dcd)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  ja $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, jf.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(avt.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            ja.a $$11 = new ja.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dcg)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ad() || !this.a((dcd)$$1, $$11))) {
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

   protected boolean a(dcd $$0, ja $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dsh $$0) {
      return $$0.b(dsx.C) && $$0.c(dsx.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dsh $$0) {
      return $$0.b(dsx.C) && $$0.c(dsx.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dcd $$0, ja $$1, int $$2, aym $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dsh $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dff $$8 = $$6.b();
         if ($$8 instanceof dno) {
            dno.a($$0, $$1);
         }
      }
   }

   private dsh a(dce $$0, ja $$1, int $$2) {
      dsh $$3 = a($$0, $$1);
      return $$3.a(dfh.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dbj $$0, ja $$1) {
      for (jf $$2 : jf.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dcg $$0, ja $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jf $$3 : jf.values()) {
            dsh $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dsh $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(aym $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dff $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dif $$0 = (dif)dfh.cr;
      $$0.a(dfh.n, 5, 20);
      $$0.a(dfh.o, 5, 20);
      $$0.a(dfh.p, 5, 20);
      $$0.a(dfh.q, 5, 20);
      $$0.a(dfh.r, 5, 20);
      $$0.a(dfh.s, 5, 20);
      $$0.a(dfh.t, 5, 20);
      $$0.a(dfh.u, 5, 20);
      $$0.a(dfh.v, 5, 20);
      $$0.a(dfh.w, 5, 20);
      $$0.a(dfh.jt, 5, 20);
      $$0.a(dfh.ju, 5, 20);
      $$0.a(dfh.jv, 5, 20);
      $$0.a(dfh.jw, 5, 20);
      $$0.a(dfh.jx, 5, 20);
      $$0.a(dfh.jy, 5, 20);
      $$0.a(dfh.jz, 5, 20);
      $$0.a(dfh.jA, 5, 20);
      $$0.a(dfh.jB, 5, 20);
      $$0.a(dfh.jC, 5, 20);
      $$0.a(dfh.fh, 5, 20);
      $$0.a(dfh.jV, 5, 20);
      $$0.a(dfh.jW, 5, 20);
      $$0.a(dfh.jX, 5, 20);
      $$0.a(dfh.jY, 5, 20);
      $$0.a(dfh.jZ, 5, 20);
      $$0.a(dfh.ka, 5, 20);
      $$0.a(dfh.kb, 5, 20);
      $$0.a(dfh.kc, 5, 20);
      $$0.a(dfh.dU, 5, 20);
      $$0.a(dfh.kd, 5, 20);
      $$0.a(dfh.ke, 5, 20);
      $$0.a(dfh.kf, 5, 20);
      $$0.a(dfh.kg, 5, 20);
      $$0.a(dfh.kh, 5, 20);
      $$0.a(dfh.ki, 5, 20);
      $$0.a(dfh.kj, 5, 20);
      $$0.a(dfh.kk, 5, 20);
      $$0.a(dfh.cu, 5, 20);
      $$0.a(dfh.fL, 5, 20);
      $$0.a(dfh.fK, 5, 20);
      $$0.a(dfh.fM, 5, 20);
      $$0.a(dfh.hP, 5, 20);
      $$0.a(dfh.hQ, 5, 20);
      $$0.a(dfh.hR, 5, 20);
      $$0.a(dfh.hS, 5, 20);
      $$0.a(dfh.hT, 5, 20);
      $$0.a(dfh.hU, 5, 20);
      $$0.a(dfh.U, 5, 5);
      $$0.a(dfh.V, 5, 5);
      $$0.a(dfh.W, 5, 5);
      $$0.a(dfh.X, 5, 5);
      $$0.a(dfh.Y, 5, 5);
      $$0.a(dfh.Z, 5, 5);
      $$0.a(dfh.aa, 5, 5);
      $$0.a(dfh.ab, 5, 5);
      $$0.a(dfh.ae, 5, 5);
      $$0.a(dfh.al, 5, 5);
      $$0.a(dfh.af, 5, 5);
      $$0.a(dfh.ag, 5, 5);
      $$0.a(dfh.ah, 5, 5);
      $$0.a(dfh.ai, 5, 5);
      $$0.a(dfh.aj, 5, 5);
      $$0.a(dfh.ak, 5, 5);
      $$0.a(dfh.am, 5, 5);
      $$0.a(dfh.an, 5, 5);
      $$0.a(dfh.aw, 5, 5);
      $$0.a(dfh.ax, 5, 5);
      $$0.a(dfh.ay, 5, 5);
      $$0.a(dfh.az, 5, 5);
      $$0.a(dfh.aA, 5, 5);
      $$0.a(dfh.aB, 5, 5);
      $$0.a(dfh.aC, 5, 5);
      $$0.a(dfh.aD, 5, 5);
      $$0.a(dfh.ao, 5, 5);
      $$0.a(dfh.ap, 5, 5);
      $$0.a(dfh.aq, 5, 5);
      $$0.a(dfh.ar, 5, 5);
      $$0.a(dfh.as, 5, 5);
      $$0.a(dfh.at, 5, 5);
      $$0.a(dfh.au, 5, 5);
      $$0.a(dfh.av, 5, 5);
      $$0.a(dfh.ac, 5, 20);
      $$0.a(dfh.aE, 30, 60);
      $$0.a(dfh.aF, 30, 60);
      $$0.a(dfh.aG, 30, 60);
      $$0.a(dfh.aH, 30, 60);
      $$0.a(dfh.aI, 30, 60);
      $$0.a(dfh.aJ, 30, 60);
      $$0.a(dfh.aK, 30, 60);
      $$0.a(dfh.aL, 30, 60);
      $$0.a(dfh.cl, 30, 20);
      $$0.a(dfh.ck, 15, 100);
      $$0.a(dfh.bt, 60, 100);
      $$0.a(dfh.bu, 60, 100);
      $$0.a(dfh.bv, 60, 100);
      $$0.a(dfh.iD, 60, 100);
      $$0.a(dfh.iE, 60, 100);
      $$0.a(dfh.iF, 60, 100);
      $$0.a(dfh.iG, 60, 100);
      $$0.a(dfh.iH, 60, 100);
      $$0.a(dfh.iI, 60, 100);
      $$0.a(dfh.bR, 60, 100);
      $$0.a(dfh.bT, 60, 100);
      $$0.a(dfh.bU, 60, 100);
      $$0.a(dfh.bV, 60, 100);
      $$0.a(dfh.bW, 60, 100);
      $$0.a(dfh.bX, 60, 100);
      $$0.a(dfh.bY, 60, 100);
      $$0.a(dfh.bZ, 60, 100);
      $$0.a(dfh.ca, 60, 100);
      $$0.a(dfh.cb, 60, 100);
      $$0.a(dfh.cc, 60, 100);
      $$0.a(dfh.ce, 60, 100);
      $$0.a(dfh.bS, 60, 100);
      $$0.a(dfh.kC, 60, 100);
      $$0.a(dfh.cd, 60, 100);
      $$0.a(dfh.sB, 60, 100);
      $$0.a(dfh.bA, 30, 60);
      $$0.a(dfh.bB, 30, 60);
      $$0.a(dfh.bC, 30, 60);
      $$0.a(dfh.bD, 30, 60);
      $$0.a(dfh.bE, 30, 60);
      $$0.a(dfh.bF, 30, 60);
      $$0.a(dfh.bG, 30, 60);
      $$0.a(dfh.bH, 30, 60);
      $$0.a(dfh.bI, 30, 60);
      $$0.a(dfh.bJ, 30, 60);
      $$0.a(dfh.bK, 30, 60);
      $$0.a(dfh.bL, 30, 60);
      $$0.a(dfh.bM, 30, 60);
      $$0.a(dfh.bN, 30, 60);
      $$0.a(dfh.bO, 30, 60);
      $$0.a(dfh.bP, 30, 60);
      $$0.a(dfh.ff, 15, 100);
      $$0.a(dfh.iB, 5, 5);
      $$0.a(dfh.ij, 60, 20);
      $$0.a(dfh.pd, 15, 20);
      $$0.a(dfh.ik, 60, 20);
      $$0.a(dfh.il, 60, 20);
      $$0.a(dfh.im, 60, 20);
      $$0.a(dfh.in, 60, 20);
      $$0.a(dfh.io, 60, 20);
      $$0.a(dfh.ip, 60, 20);
      $$0.a(dfh.iq, 60, 20);
      $$0.a(dfh.ir, 60, 20);
      $$0.a(dfh.is, 60, 20);
      $$0.a(dfh.it, 60, 20);
      $$0.a(dfh.iu, 60, 20);
      $$0.a(dfh.iv, 60, 20);
      $$0.a(dfh.iw, 60, 20);
      $$0.a(dfh.ix, 60, 20);
      $$0.a(dfh.iy, 60, 20);
      $$0.a(dfh.iz, 60, 20);
      $$0.a(dfh.me, 30, 60);
      $$0.a(dfh.mZ, 60, 60);
      $$0.a(dfh.nS, 60, 60);
      $$0.a(dfh.oa, 30, 20);
      $$0.a(dfh.pc, 5, 20);
      $$0.a(dfh.oi, 60, 100);
      $$0.a(dfh.pf, 5, 20);
      $$0.a(dfh.pe, 30, 20);
      $$0.a(dfh.aM, 30, 60);
      $$0.a(dfh.aN, 30, 60);
      $$0.a(dfh.sv, 15, 60);
      $$0.a(dfh.sw, 15, 60);
      $$0.a(dfh.sx, 60, 100);
      $$0.a(dfh.sy, 30, 60);
      $$0.a(dfh.sz, 30, 60);
      $$0.a(dfh.sD, 60, 100);
      $$0.a(dfh.sE, 60, 100);
      $$0.a(dfh.sF, 60, 100);
      $$0.a(dfh.sG, 30, 60);
      $$0.a(dfh.fg, 15, 100);
   }
}
