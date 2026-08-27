import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class czy extends cwl {
   public static final MapCodec<czy> c = b(czy::new);
   public static final int d = 15;
   public static final dkp e = dkf.aw;
   public static final dkg f = dcl.b;
   public static final dkg g = dcl.c;
   public static final dkg h = dcl.d;
   public static final dkg i = dcl.e;
   public static final dkg j = dcl.f;
   private static final Map<ic, dkg> k = dcl.h.entrySet().stream().filter($$0 -> $$0.getKey() != ic.a).collect(ac.a());
   private static final emv l = cwy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final emv m = cwy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final emv n = cwy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final emv o = cwy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final emv F = cwy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<djp, emv> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<cwy> P = new Object2IntOpenHashMap();
   private final Object2IntMap<cwy> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<czy> a() {
      return c;
   }

   public czy(djo.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), czy::h)));
   }

   private static emv h(djp $$0) {
      emv $$1 = ems.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ems.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ems.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ems.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ems.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : cxa.a.o();
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public djp a(cpp $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected djp b(ctd $$0, hx $$1) {
      hx $$2 = $$1.d();
      djp $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ic.b)) {
         djp $$4 = this.o();

         for (ic $$5 : ic.values()) {
            dkg $$6 = k.get($$5);
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
   public boolean a(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ic.b) || this.d($$1, $$2);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.Z().b(ctt.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         djp $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.E_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ab() && this.a((ctx)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(ash.ad);
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
                        int $$16 = this.a((cua)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ab() || !this.a((ctx)$$1, $$11))) {
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

   protected boolean a(ctx $$0, hx $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(djp $$0) {
      return $$0.b(dkf.C) && $$0.c(dkf.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(djp $$0) {
      return $$0.b(dkf.C) && $$0.c(dkf.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(ctx $$0, hx $$1, int $$2, auw $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         djp $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cwy $$8 = $$6.b();
         if ($$8 instanceof dfg) {
            dfg.a($$0, $$1);
         }
      }
   }

   private djp a(cty $$0, hx $$1, int $$2) {
      djp $$3 = a($$0, $$1);
      return $$3.a(cxa.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(ctd $$0, hx $$1) {
      for (ic $$2 : ic.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(cua $$0, hx $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ic $$3 : ic.values()) {
            djp $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(djp $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(auw $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(cwy $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      czy $$0 = (czy)cxa.cr;
      $$0.a(cxa.n, 5, 20);
      $$0.a(cxa.o, 5, 20);
      $$0.a(cxa.p, 5, 20);
      $$0.a(cxa.q, 5, 20);
      $$0.a(cxa.r, 5, 20);
      $$0.a(cxa.s, 5, 20);
      $$0.a(cxa.t, 5, 20);
      $$0.a(cxa.u, 5, 20);
      $$0.a(cxa.v, 5, 20);
      $$0.a(cxa.w, 5, 20);
      $$0.a(cxa.jt, 5, 20);
      $$0.a(cxa.ju, 5, 20);
      $$0.a(cxa.jv, 5, 20);
      $$0.a(cxa.jw, 5, 20);
      $$0.a(cxa.jx, 5, 20);
      $$0.a(cxa.jy, 5, 20);
      $$0.a(cxa.jz, 5, 20);
      $$0.a(cxa.jA, 5, 20);
      $$0.a(cxa.jB, 5, 20);
      $$0.a(cxa.jC, 5, 20);
      $$0.a(cxa.fh, 5, 20);
      $$0.a(cxa.jV, 5, 20);
      $$0.a(cxa.jW, 5, 20);
      $$0.a(cxa.jX, 5, 20);
      $$0.a(cxa.jY, 5, 20);
      $$0.a(cxa.jZ, 5, 20);
      $$0.a(cxa.ka, 5, 20);
      $$0.a(cxa.kb, 5, 20);
      $$0.a(cxa.kc, 5, 20);
      $$0.a(cxa.dU, 5, 20);
      $$0.a(cxa.kd, 5, 20);
      $$0.a(cxa.ke, 5, 20);
      $$0.a(cxa.kf, 5, 20);
      $$0.a(cxa.kg, 5, 20);
      $$0.a(cxa.kh, 5, 20);
      $$0.a(cxa.ki, 5, 20);
      $$0.a(cxa.kj, 5, 20);
      $$0.a(cxa.kk, 5, 20);
      $$0.a(cxa.cu, 5, 20);
      $$0.a(cxa.fL, 5, 20);
      $$0.a(cxa.fK, 5, 20);
      $$0.a(cxa.fM, 5, 20);
      $$0.a(cxa.hP, 5, 20);
      $$0.a(cxa.hQ, 5, 20);
      $$0.a(cxa.hR, 5, 20);
      $$0.a(cxa.hS, 5, 20);
      $$0.a(cxa.hT, 5, 20);
      $$0.a(cxa.hU, 5, 20);
      $$0.a(cxa.U, 5, 5);
      $$0.a(cxa.V, 5, 5);
      $$0.a(cxa.W, 5, 5);
      $$0.a(cxa.X, 5, 5);
      $$0.a(cxa.Y, 5, 5);
      $$0.a(cxa.Z, 5, 5);
      $$0.a(cxa.aa, 5, 5);
      $$0.a(cxa.ab, 5, 5);
      $$0.a(cxa.ae, 5, 5);
      $$0.a(cxa.al, 5, 5);
      $$0.a(cxa.af, 5, 5);
      $$0.a(cxa.ag, 5, 5);
      $$0.a(cxa.ah, 5, 5);
      $$0.a(cxa.ai, 5, 5);
      $$0.a(cxa.aj, 5, 5);
      $$0.a(cxa.ak, 5, 5);
      $$0.a(cxa.am, 5, 5);
      $$0.a(cxa.an, 5, 5);
      $$0.a(cxa.aw, 5, 5);
      $$0.a(cxa.ax, 5, 5);
      $$0.a(cxa.ay, 5, 5);
      $$0.a(cxa.az, 5, 5);
      $$0.a(cxa.aA, 5, 5);
      $$0.a(cxa.aB, 5, 5);
      $$0.a(cxa.aC, 5, 5);
      $$0.a(cxa.aD, 5, 5);
      $$0.a(cxa.ao, 5, 5);
      $$0.a(cxa.ap, 5, 5);
      $$0.a(cxa.aq, 5, 5);
      $$0.a(cxa.ar, 5, 5);
      $$0.a(cxa.as, 5, 5);
      $$0.a(cxa.at, 5, 5);
      $$0.a(cxa.au, 5, 5);
      $$0.a(cxa.av, 5, 5);
      $$0.a(cxa.ac, 5, 20);
      $$0.a(cxa.aE, 30, 60);
      $$0.a(cxa.aF, 30, 60);
      $$0.a(cxa.aG, 30, 60);
      $$0.a(cxa.aH, 30, 60);
      $$0.a(cxa.aI, 30, 60);
      $$0.a(cxa.aJ, 30, 60);
      $$0.a(cxa.aK, 30, 60);
      $$0.a(cxa.aL, 30, 60);
      $$0.a(cxa.cl, 30, 20);
      $$0.a(cxa.ck, 15, 100);
      $$0.a(cxa.bt, 60, 100);
      $$0.a(cxa.bu, 60, 100);
      $$0.a(cxa.bv, 60, 100);
      $$0.a(cxa.iD, 60, 100);
      $$0.a(cxa.iE, 60, 100);
      $$0.a(cxa.iF, 60, 100);
      $$0.a(cxa.iG, 60, 100);
      $$0.a(cxa.iH, 60, 100);
      $$0.a(cxa.iI, 60, 100);
      $$0.a(cxa.bR, 60, 100);
      $$0.a(cxa.bT, 60, 100);
      $$0.a(cxa.bU, 60, 100);
      $$0.a(cxa.bV, 60, 100);
      $$0.a(cxa.bW, 60, 100);
      $$0.a(cxa.bX, 60, 100);
      $$0.a(cxa.bY, 60, 100);
      $$0.a(cxa.bZ, 60, 100);
      $$0.a(cxa.ca, 60, 100);
      $$0.a(cxa.cb, 60, 100);
      $$0.a(cxa.cc, 60, 100);
      $$0.a(cxa.ce, 60, 100);
      $$0.a(cxa.bS, 60, 100);
      $$0.a(cxa.kC, 60, 100);
      $$0.a(cxa.cd, 60, 100);
      $$0.a(cxa.sB, 60, 100);
      $$0.a(cxa.bA, 30, 60);
      $$0.a(cxa.bB, 30, 60);
      $$0.a(cxa.bC, 30, 60);
      $$0.a(cxa.bD, 30, 60);
      $$0.a(cxa.bE, 30, 60);
      $$0.a(cxa.bF, 30, 60);
      $$0.a(cxa.bG, 30, 60);
      $$0.a(cxa.bH, 30, 60);
      $$0.a(cxa.bI, 30, 60);
      $$0.a(cxa.bJ, 30, 60);
      $$0.a(cxa.bK, 30, 60);
      $$0.a(cxa.bL, 30, 60);
      $$0.a(cxa.bM, 30, 60);
      $$0.a(cxa.bN, 30, 60);
      $$0.a(cxa.bO, 30, 60);
      $$0.a(cxa.bP, 30, 60);
      $$0.a(cxa.ff, 15, 100);
      $$0.a(cxa.iB, 5, 5);
      $$0.a(cxa.ij, 60, 20);
      $$0.a(cxa.pd, 15, 20);
      $$0.a(cxa.ik, 60, 20);
      $$0.a(cxa.il, 60, 20);
      $$0.a(cxa.im, 60, 20);
      $$0.a(cxa.in, 60, 20);
      $$0.a(cxa.io, 60, 20);
      $$0.a(cxa.ip, 60, 20);
      $$0.a(cxa.iq, 60, 20);
      $$0.a(cxa.ir, 60, 20);
      $$0.a(cxa.is, 60, 20);
      $$0.a(cxa.it, 60, 20);
      $$0.a(cxa.iu, 60, 20);
      $$0.a(cxa.iv, 60, 20);
      $$0.a(cxa.iw, 60, 20);
      $$0.a(cxa.ix, 60, 20);
      $$0.a(cxa.iy, 60, 20);
      $$0.a(cxa.iz, 60, 20);
      $$0.a(cxa.me, 30, 60);
      $$0.a(cxa.mZ, 60, 60);
      $$0.a(cxa.nS, 60, 60);
      $$0.a(cxa.oa, 30, 20);
      $$0.a(cxa.pc, 5, 20);
      $$0.a(cxa.oi, 60, 100);
      $$0.a(cxa.pf, 5, 20);
      $$0.a(cxa.pe, 30, 20);
      $$0.a(cxa.aM, 30, 60);
      $$0.a(cxa.aN, 30, 60);
      $$0.a(cxa.sv, 15, 60);
      $$0.a(cxa.sw, 15, 60);
      $$0.a(cxa.sx, 60, 100);
      $$0.a(cxa.sy, 30, 60);
      $$0.a(cxa.sz, 30, 60);
      $$0.a(cxa.sD, 60, 100);
      $$0.a(cxa.sE, 60, 100);
      $$0.a(cxa.sF, 60, 100);
      $$0.a(cxa.sG, 30, 60);
      $$0.a(cxa.fg, 15, 100);
   }
}
