import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class czp extends cwc {
   public static final MapCodec<czp> c = b(czp::new);
   public static final int d = 15;
   public static final dkg e = djw.aw;
   public static final djx f = dcc.b;
   public static final djx g = dcc.c;
   public static final djx h = dcc.d;
   public static final djx i = dcc.e;
   public static final djx j = dcc.f;
   private static final Map<ic, djx> k = dcc.h.entrySet().stream().filter($$0 -> $$0.getKey() != ic.a).collect(ac.a());
   private static final eml l = cwp.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eml m = cwp.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eml n = cwp.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eml o = cwp.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eml F = cwp.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<djg, eml> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<cwp> P = new Object2IntOpenHashMap();
   private final Object2IntMap<cwp> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<czp> a() {
      return c;
   }

   public czp(djf.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), czp::h)));
   }

   private static eml h(djg $$0) {
      eml $$1 = emi.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = emi.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = emi.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = emi.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = emi.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : cwr.a.o();
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public djg a(cpg $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected djg b(csu $$0, hx $$1) {
      hx $$2 = $$1.d();
      djg $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ic.b)) {
         djg $$4 = this.o();

         for (ic $$5 : ic.values()) {
            djx $$6 = k.get($$5);
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
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      hx $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ic.b) || this.d($$1, $$2);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.Z().b(ctk.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         djg $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.E_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ab() && this.a((cto)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  hx $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, ic.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(asf.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            hx.a $$11 = new hx.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((ctr)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ab() || !this.a((cto)$$1, $$11))) {
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

   protected boolean a(cto $$0, hx $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(djg $$0) {
      return $$0.b(djw.C) && $$0.c(djw.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(djg $$0) {
      return $$0.b(djw.C) && $$0.c(djw.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(cto $$0, hx $$1, int $$2, auu $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         djg $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cwp $$8 = $$6.b();
         if ($$8 instanceof dex) {
            dex.a($$0, $$1);
         }
      }
   }

   private djg a(ctp $$0, hx $$1, int $$2) {
      djg $$3 = a($$0, $$1);
      return $$3.a(cwr.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(csu $$0, hx $$1) {
      for (ic $$2 : ic.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(ctr $$0, hx $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ic $$3 : ic.values()) {
            djg $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(djg $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(auu $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(cwp $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      czp $$0 = (czp)cwr.cr;
      $$0.a(cwr.n, 5, 20);
      $$0.a(cwr.o, 5, 20);
      $$0.a(cwr.p, 5, 20);
      $$0.a(cwr.q, 5, 20);
      $$0.a(cwr.r, 5, 20);
      $$0.a(cwr.s, 5, 20);
      $$0.a(cwr.t, 5, 20);
      $$0.a(cwr.u, 5, 20);
      $$0.a(cwr.v, 5, 20);
      $$0.a(cwr.w, 5, 20);
      $$0.a(cwr.jt, 5, 20);
      $$0.a(cwr.ju, 5, 20);
      $$0.a(cwr.jv, 5, 20);
      $$0.a(cwr.jw, 5, 20);
      $$0.a(cwr.jx, 5, 20);
      $$0.a(cwr.jy, 5, 20);
      $$0.a(cwr.jz, 5, 20);
      $$0.a(cwr.jA, 5, 20);
      $$0.a(cwr.jB, 5, 20);
      $$0.a(cwr.jC, 5, 20);
      $$0.a(cwr.fh, 5, 20);
      $$0.a(cwr.jV, 5, 20);
      $$0.a(cwr.jW, 5, 20);
      $$0.a(cwr.jX, 5, 20);
      $$0.a(cwr.jY, 5, 20);
      $$0.a(cwr.jZ, 5, 20);
      $$0.a(cwr.ka, 5, 20);
      $$0.a(cwr.kb, 5, 20);
      $$0.a(cwr.kc, 5, 20);
      $$0.a(cwr.dU, 5, 20);
      $$0.a(cwr.kd, 5, 20);
      $$0.a(cwr.ke, 5, 20);
      $$0.a(cwr.kf, 5, 20);
      $$0.a(cwr.kg, 5, 20);
      $$0.a(cwr.kh, 5, 20);
      $$0.a(cwr.ki, 5, 20);
      $$0.a(cwr.kj, 5, 20);
      $$0.a(cwr.kk, 5, 20);
      $$0.a(cwr.cu, 5, 20);
      $$0.a(cwr.fL, 5, 20);
      $$0.a(cwr.fK, 5, 20);
      $$0.a(cwr.fM, 5, 20);
      $$0.a(cwr.hP, 5, 20);
      $$0.a(cwr.hQ, 5, 20);
      $$0.a(cwr.hR, 5, 20);
      $$0.a(cwr.hS, 5, 20);
      $$0.a(cwr.hT, 5, 20);
      $$0.a(cwr.hU, 5, 20);
      $$0.a(cwr.U, 5, 5);
      $$0.a(cwr.V, 5, 5);
      $$0.a(cwr.W, 5, 5);
      $$0.a(cwr.X, 5, 5);
      $$0.a(cwr.Y, 5, 5);
      $$0.a(cwr.Z, 5, 5);
      $$0.a(cwr.aa, 5, 5);
      $$0.a(cwr.ab, 5, 5);
      $$0.a(cwr.ae, 5, 5);
      $$0.a(cwr.al, 5, 5);
      $$0.a(cwr.af, 5, 5);
      $$0.a(cwr.ag, 5, 5);
      $$0.a(cwr.ah, 5, 5);
      $$0.a(cwr.ai, 5, 5);
      $$0.a(cwr.aj, 5, 5);
      $$0.a(cwr.ak, 5, 5);
      $$0.a(cwr.am, 5, 5);
      $$0.a(cwr.an, 5, 5);
      $$0.a(cwr.aw, 5, 5);
      $$0.a(cwr.ax, 5, 5);
      $$0.a(cwr.ay, 5, 5);
      $$0.a(cwr.az, 5, 5);
      $$0.a(cwr.aA, 5, 5);
      $$0.a(cwr.aB, 5, 5);
      $$0.a(cwr.aC, 5, 5);
      $$0.a(cwr.aD, 5, 5);
      $$0.a(cwr.ao, 5, 5);
      $$0.a(cwr.ap, 5, 5);
      $$0.a(cwr.aq, 5, 5);
      $$0.a(cwr.ar, 5, 5);
      $$0.a(cwr.as, 5, 5);
      $$0.a(cwr.at, 5, 5);
      $$0.a(cwr.au, 5, 5);
      $$0.a(cwr.av, 5, 5);
      $$0.a(cwr.ac, 5, 20);
      $$0.a(cwr.aE, 30, 60);
      $$0.a(cwr.aF, 30, 60);
      $$0.a(cwr.aG, 30, 60);
      $$0.a(cwr.aH, 30, 60);
      $$0.a(cwr.aI, 30, 60);
      $$0.a(cwr.aJ, 30, 60);
      $$0.a(cwr.aK, 30, 60);
      $$0.a(cwr.aL, 30, 60);
      $$0.a(cwr.cl, 30, 20);
      $$0.a(cwr.ck, 15, 100);
      $$0.a(cwr.bt, 60, 100);
      $$0.a(cwr.bu, 60, 100);
      $$0.a(cwr.bv, 60, 100);
      $$0.a(cwr.iD, 60, 100);
      $$0.a(cwr.iE, 60, 100);
      $$0.a(cwr.iF, 60, 100);
      $$0.a(cwr.iG, 60, 100);
      $$0.a(cwr.iH, 60, 100);
      $$0.a(cwr.iI, 60, 100);
      $$0.a(cwr.bR, 60, 100);
      $$0.a(cwr.bT, 60, 100);
      $$0.a(cwr.bU, 60, 100);
      $$0.a(cwr.bV, 60, 100);
      $$0.a(cwr.bW, 60, 100);
      $$0.a(cwr.bX, 60, 100);
      $$0.a(cwr.bY, 60, 100);
      $$0.a(cwr.bZ, 60, 100);
      $$0.a(cwr.ca, 60, 100);
      $$0.a(cwr.cb, 60, 100);
      $$0.a(cwr.cc, 60, 100);
      $$0.a(cwr.ce, 60, 100);
      $$0.a(cwr.bS, 60, 100);
      $$0.a(cwr.kC, 60, 100);
      $$0.a(cwr.cd, 60, 100);
      $$0.a(cwr.sB, 60, 100);
      $$0.a(cwr.bA, 30, 60);
      $$0.a(cwr.bB, 30, 60);
      $$0.a(cwr.bC, 30, 60);
      $$0.a(cwr.bD, 30, 60);
      $$0.a(cwr.bE, 30, 60);
      $$0.a(cwr.bF, 30, 60);
      $$0.a(cwr.bG, 30, 60);
      $$0.a(cwr.bH, 30, 60);
      $$0.a(cwr.bI, 30, 60);
      $$0.a(cwr.bJ, 30, 60);
      $$0.a(cwr.bK, 30, 60);
      $$0.a(cwr.bL, 30, 60);
      $$0.a(cwr.bM, 30, 60);
      $$0.a(cwr.bN, 30, 60);
      $$0.a(cwr.bO, 30, 60);
      $$0.a(cwr.bP, 30, 60);
      $$0.a(cwr.ff, 15, 100);
      $$0.a(cwr.iB, 5, 5);
      $$0.a(cwr.ij, 60, 20);
      $$0.a(cwr.pd, 15, 20);
      $$0.a(cwr.ik, 60, 20);
      $$0.a(cwr.il, 60, 20);
      $$0.a(cwr.im, 60, 20);
      $$0.a(cwr.in, 60, 20);
      $$0.a(cwr.io, 60, 20);
      $$0.a(cwr.ip, 60, 20);
      $$0.a(cwr.iq, 60, 20);
      $$0.a(cwr.ir, 60, 20);
      $$0.a(cwr.is, 60, 20);
      $$0.a(cwr.it, 60, 20);
      $$0.a(cwr.iu, 60, 20);
      $$0.a(cwr.iv, 60, 20);
      $$0.a(cwr.iw, 60, 20);
      $$0.a(cwr.ix, 60, 20);
      $$0.a(cwr.iy, 60, 20);
      $$0.a(cwr.iz, 60, 20);
      $$0.a(cwr.me, 30, 60);
      $$0.a(cwr.mZ, 60, 60);
      $$0.a(cwr.nS, 60, 60);
      $$0.a(cwr.oa, 30, 20);
      $$0.a(cwr.pc, 5, 20);
      $$0.a(cwr.oi, 60, 100);
      $$0.a(cwr.pf, 5, 20);
      $$0.a(cwr.pe, 30, 20);
      $$0.a(cwr.aM, 30, 60);
      $$0.a(cwr.aN, 30, 60);
      $$0.a(cwr.sv, 15, 60);
      $$0.a(cwr.sw, 15, 60);
      $$0.a(cwr.sx, 60, 100);
      $$0.a(cwr.sy, 30, 60);
      $$0.a(cwr.sz, 30, 60);
      $$0.a(cwr.sD, 60, 100);
      $$0.a(cwr.sE, 60, 100);
      $$0.a(cwr.sF, 60, 100);
      $$0.a(cwr.sG, 30, 60);
      $$0.a(cwr.fg, 15, 100);
   }
}
