import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class czq extends cwd {
   public static final MapCodec<czq> c = b(czq::new);
   public static final int d = 15;
   public static final dkh e = djx.aw;
   public static final djy f = dcd.b;
   public static final djy g = dcd.c;
   public static final djy h = dcd.d;
   public static final djy i = dcd.e;
   public static final djy j = dcd.f;
   private static final Map<ic, djy> k = dcd.h.entrySet().stream().filter($$0 -> $$0.getKey() != ic.a).collect(ac.a());
   private static final emm l = cwq.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final emm m = cwq.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final emm n = cwq.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final emm o = cwq.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final emm F = cwq.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<djh, emm> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<cwq> P = new Object2IntOpenHashMap();
   private final Object2IntMap<cwq> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<czq> a() {
      return c;
   }

   public czq(djg.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), czq::h)));
   }

   private static emm h(djh $$0) {
      emm $$1 = emj.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = emj.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = emj.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = emj.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = emj.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : cws.a.o();
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public djh a(cph $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected djh b(csv $$0, hx $$1) {
      hx $$2 = $$1.d();
      djh $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ic.b)) {
         djh $$4 = this.o();

         for (ic $$5 : ic.values()) {
            djy $$6 = k.get($$5);
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
   public boolean a(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ic.b) || this.d($$1, $$2);
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.Z().b(ctl.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         djh $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.E_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ab() && this.a((ctp)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(asg.ad);
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
                        int $$16 = this.a((cts)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ab() || !this.a((ctp)$$1, $$11))) {
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

   protected boolean a(ctp $$0, hx $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(djh $$0) {
      return $$0.b(djx.C) && $$0.c(djx.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(djh $$0) {
      return $$0.b(djx.C) && $$0.c(djx.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(ctp $$0, hx $$1, int $$2, auv $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         djh $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cwq $$8 = $$6.b();
         if ($$8 instanceof dey) {
            dey.a($$0, $$1);
         }
      }
   }

   private djh a(ctq $$0, hx $$1, int $$2) {
      djh $$3 = a($$0, $$1);
      return $$3.a(cws.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(csv $$0, hx $$1) {
      for (ic $$2 : ic.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cts $$0, hx $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ic $$3 : ic.values()) {
            djh $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(djh $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(auv $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(cwq $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      czq $$0 = (czq)cws.cr;
      $$0.a(cws.n, 5, 20);
      $$0.a(cws.o, 5, 20);
      $$0.a(cws.p, 5, 20);
      $$0.a(cws.q, 5, 20);
      $$0.a(cws.r, 5, 20);
      $$0.a(cws.s, 5, 20);
      $$0.a(cws.t, 5, 20);
      $$0.a(cws.u, 5, 20);
      $$0.a(cws.v, 5, 20);
      $$0.a(cws.w, 5, 20);
      $$0.a(cws.jt, 5, 20);
      $$0.a(cws.ju, 5, 20);
      $$0.a(cws.jv, 5, 20);
      $$0.a(cws.jw, 5, 20);
      $$0.a(cws.jx, 5, 20);
      $$0.a(cws.jy, 5, 20);
      $$0.a(cws.jz, 5, 20);
      $$0.a(cws.jA, 5, 20);
      $$0.a(cws.jB, 5, 20);
      $$0.a(cws.jC, 5, 20);
      $$0.a(cws.fh, 5, 20);
      $$0.a(cws.jV, 5, 20);
      $$0.a(cws.jW, 5, 20);
      $$0.a(cws.jX, 5, 20);
      $$0.a(cws.jY, 5, 20);
      $$0.a(cws.jZ, 5, 20);
      $$0.a(cws.ka, 5, 20);
      $$0.a(cws.kb, 5, 20);
      $$0.a(cws.kc, 5, 20);
      $$0.a(cws.dU, 5, 20);
      $$0.a(cws.kd, 5, 20);
      $$0.a(cws.ke, 5, 20);
      $$0.a(cws.kf, 5, 20);
      $$0.a(cws.kg, 5, 20);
      $$0.a(cws.kh, 5, 20);
      $$0.a(cws.ki, 5, 20);
      $$0.a(cws.kj, 5, 20);
      $$0.a(cws.kk, 5, 20);
      $$0.a(cws.cu, 5, 20);
      $$0.a(cws.fL, 5, 20);
      $$0.a(cws.fK, 5, 20);
      $$0.a(cws.fM, 5, 20);
      $$0.a(cws.hP, 5, 20);
      $$0.a(cws.hQ, 5, 20);
      $$0.a(cws.hR, 5, 20);
      $$0.a(cws.hS, 5, 20);
      $$0.a(cws.hT, 5, 20);
      $$0.a(cws.hU, 5, 20);
      $$0.a(cws.U, 5, 5);
      $$0.a(cws.V, 5, 5);
      $$0.a(cws.W, 5, 5);
      $$0.a(cws.X, 5, 5);
      $$0.a(cws.Y, 5, 5);
      $$0.a(cws.Z, 5, 5);
      $$0.a(cws.aa, 5, 5);
      $$0.a(cws.ab, 5, 5);
      $$0.a(cws.ae, 5, 5);
      $$0.a(cws.al, 5, 5);
      $$0.a(cws.af, 5, 5);
      $$0.a(cws.ag, 5, 5);
      $$0.a(cws.ah, 5, 5);
      $$0.a(cws.ai, 5, 5);
      $$0.a(cws.aj, 5, 5);
      $$0.a(cws.ak, 5, 5);
      $$0.a(cws.am, 5, 5);
      $$0.a(cws.an, 5, 5);
      $$0.a(cws.aw, 5, 5);
      $$0.a(cws.ax, 5, 5);
      $$0.a(cws.ay, 5, 5);
      $$0.a(cws.az, 5, 5);
      $$0.a(cws.aA, 5, 5);
      $$0.a(cws.aB, 5, 5);
      $$0.a(cws.aC, 5, 5);
      $$0.a(cws.aD, 5, 5);
      $$0.a(cws.ao, 5, 5);
      $$0.a(cws.ap, 5, 5);
      $$0.a(cws.aq, 5, 5);
      $$0.a(cws.ar, 5, 5);
      $$0.a(cws.as, 5, 5);
      $$0.a(cws.at, 5, 5);
      $$0.a(cws.au, 5, 5);
      $$0.a(cws.av, 5, 5);
      $$0.a(cws.ac, 5, 20);
      $$0.a(cws.aE, 30, 60);
      $$0.a(cws.aF, 30, 60);
      $$0.a(cws.aG, 30, 60);
      $$0.a(cws.aH, 30, 60);
      $$0.a(cws.aI, 30, 60);
      $$0.a(cws.aJ, 30, 60);
      $$0.a(cws.aK, 30, 60);
      $$0.a(cws.aL, 30, 60);
      $$0.a(cws.cl, 30, 20);
      $$0.a(cws.ck, 15, 100);
      $$0.a(cws.bt, 60, 100);
      $$0.a(cws.bu, 60, 100);
      $$0.a(cws.bv, 60, 100);
      $$0.a(cws.iD, 60, 100);
      $$0.a(cws.iE, 60, 100);
      $$0.a(cws.iF, 60, 100);
      $$0.a(cws.iG, 60, 100);
      $$0.a(cws.iH, 60, 100);
      $$0.a(cws.iI, 60, 100);
      $$0.a(cws.bR, 60, 100);
      $$0.a(cws.bT, 60, 100);
      $$0.a(cws.bU, 60, 100);
      $$0.a(cws.bV, 60, 100);
      $$0.a(cws.bW, 60, 100);
      $$0.a(cws.bX, 60, 100);
      $$0.a(cws.bY, 60, 100);
      $$0.a(cws.bZ, 60, 100);
      $$0.a(cws.ca, 60, 100);
      $$0.a(cws.cb, 60, 100);
      $$0.a(cws.cc, 60, 100);
      $$0.a(cws.ce, 60, 100);
      $$0.a(cws.bS, 60, 100);
      $$0.a(cws.kC, 60, 100);
      $$0.a(cws.cd, 60, 100);
      $$0.a(cws.sB, 60, 100);
      $$0.a(cws.bA, 30, 60);
      $$0.a(cws.bB, 30, 60);
      $$0.a(cws.bC, 30, 60);
      $$0.a(cws.bD, 30, 60);
      $$0.a(cws.bE, 30, 60);
      $$0.a(cws.bF, 30, 60);
      $$0.a(cws.bG, 30, 60);
      $$0.a(cws.bH, 30, 60);
      $$0.a(cws.bI, 30, 60);
      $$0.a(cws.bJ, 30, 60);
      $$0.a(cws.bK, 30, 60);
      $$0.a(cws.bL, 30, 60);
      $$0.a(cws.bM, 30, 60);
      $$0.a(cws.bN, 30, 60);
      $$0.a(cws.bO, 30, 60);
      $$0.a(cws.bP, 30, 60);
      $$0.a(cws.ff, 15, 100);
      $$0.a(cws.iB, 5, 5);
      $$0.a(cws.ij, 60, 20);
      $$0.a(cws.pd, 15, 20);
      $$0.a(cws.ik, 60, 20);
      $$0.a(cws.il, 60, 20);
      $$0.a(cws.im, 60, 20);
      $$0.a(cws.in, 60, 20);
      $$0.a(cws.io, 60, 20);
      $$0.a(cws.ip, 60, 20);
      $$0.a(cws.iq, 60, 20);
      $$0.a(cws.ir, 60, 20);
      $$0.a(cws.is, 60, 20);
      $$0.a(cws.it, 60, 20);
      $$0.a(cws.iu, 60, 20);
      $$0.a(cws.iv, 60, 20);
      $$0.a(cws.iw, 60, 20);
      $$0.a(cws.ix, 60, 20);
      $$0.a(cws.iy, 60, 20);
      $$0.a(cws.iz, 60, 20);
      $$0.a(cws.me, 30, 60);
      $$0.a(cws.mZ, 60, 60);
      $$0.a(cws.nS, 60, 60);
      $$0.a(cws.oa, 30, 20);
      $$0.a(cws.pc, 5, 20);
      $$0.a(cws.oi, 60, 100);
      $$0.a(cws.pf, 5, 20);
      $$0.a(cws.pe, 30, 20);
      $$0.a(cws.aM, 30, 60);
      $$0.a(cws.aN, 30, 60);
      $$0.a(cws.sv, 15, 60);
      $$0.a(cws.sw, 15, 60);
      $$0.a(cws.sx, 60, 100);
      $$0.a(cws.sy, 30, 60);
      $$0.a(cws.sz, 30, 60);
      $$0.a(cws.sD, 60, 100);
      $$0.a(cws.sE, 60, 100);
      $$0.a(cws.sF, 60, 100);
      $$0.a(cws.sG, 30, 60);
      $$0.a(cws.fg, 15, 100);
   }
}
