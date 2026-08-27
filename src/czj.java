import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class czj extends cvw {
   public static final MapCodec<czj> c = b(czj::new);
   public static final int d = 15;
   public static final dka e = djq.aw;
   public static final djr f = dbw.b;
   public static final djr g = dbw.c;
   public static final djr h = dbw.d;
   public static final djr i = dbw.e;
   public static final djr j = dbw.f;
   private static final Map<ic, djr> k = dbw.h.entrySet().stream().filter($$0 -> $$0.getKey() != ic.a).collect(ac.a());
   private static final emf l = cwj.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final emf m = cwj.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final emf n = cwj.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final emf o = cwj.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final emf F = cwj.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dja, emf> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<cwj> P = new Object2IntOpenHashMap();
   private final Object2IntMap<cwj> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<czj> a() {
      return c;
   }

   public czj(diz.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), czj::h)));
   }

   private static emf h(dja $$0) {
      emf $$1 = emc.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = emc.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = emc.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = emc.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = emc.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : cwl.a.o();
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dja a(cpa $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dja b(cso $$0, hx $$1) {
      hx $$2 = $$1.d();
      dja $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, ic.b)) {
         dja $$4 = this.o();

         for (ic $$5 : ic.values()) {
            djr $$6 = k.get($$5);
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
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      hx $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ic.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.Z().b(cte.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dja $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.E_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ab() && this.a((cti)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(asa.ad);
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
                        int $$16 = this.a((ctl)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ab() || !this.a((cti)$$1, $$11))) {
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

   protected boolean a(cti $$0, hx $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dja $$0) {
      return $$0.b(djq.C) && $$0.c(djq.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dja $$0) {
      return $$0.b(djq.C) && $$0.c(djq.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(cti $$0, hx $$1, int $$2, aup $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dja $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cwj $$8 = $$6.b();
         if ($$8 instanceof der) {
            der.a($$0, $$1);
         }
      }
   }

   private dja a(ctj $$0, hx $$1, int $$2) {
      dja $$3 = a($$0, $$1);
      return $$3.a(cwl.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cso $$0, hx $$1) {
      for (ic $$2 : ic.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(ctl $$0, hx $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (ic $$3 : ic.values()) {
            dja $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dja $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(aup $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(cwj $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      czj $$0 = (czj)cwl.cr;
      $$0.a(cwl.n, 5, 20);
      $$0.a(cwl.o, 5, 20);
      $$0.a(cwl.p, 5, 20);
      $$0.a(cwl.q, 5, 20);
      $$0.a(cwl.r, 5, 20);
      $$0.a(cwl.s, 5, 20);
      $$0.a(cwl.t, 5, 20);
      $$0.a(cwl.u, 5, 20);
      $$0.a(cwl.v, 5, 20);
      $$0.a(cwl.w, 5, 20);
      $$0.a(cwl.jt, 5, 20);
      $$0.a(cwl.ju, 5, 20);
      $$0.a(cwl.jv, 5, 20);
      $$0.a(cwl.jw, 5, 20);
      $$0.a(cwl.jx, 5, 20);
      $$0.a(cwl.jy, 5, 20);
      $$0.a(cwl.jz, 5, 20);
      $$0.a(cwl.jA, 5, 20);
      $$0.a(cwl.jB, 5, 20);
      $$0.a(cwl.jC, 5, 20);
      $$0.a(cwl.fh, 5, 20);
      $$0.a(cwl.jV, 5, 20);
      $$0.a(cwl.jW, 5, 20);
      $$0.a(cwl.jX, 5, 20);
      $$0.a(cwl.jY, 5, 20);
      $$0.a(cwl.jZ, 5, 20);
      $$0.a(cwl.ka, 5, 20);
      $$0.a(cwl.kb, 5, 20);
      $$0.a(cwl.kc, 5, 20);
      $$0.a(cwl.dU, 5, 20);
      $$0.a(cwl.kd, 5, 20);
      $$0.a(cwl.ke, 5, 20);
      $$0.a(cwl.kf, 5, 20);
      $$0.a(cwl.kg, 5, 20);
      $$0.a(cwl.kh, 5, 20);
      $$0.a(cwl.ki, 5, 20);
      $$0.a(cwl.kj, 5, 20);
      $$0.a(cwl.kk, 5, 20);
      $$0.a(cwl.cu, 5, 20);
      $$0.a(cwl.fL, 5, 20);
      $$0.a(cwl.fK, 5, 20);
      $$0.a(cwl.fM, 5, 20);
      $$0.a(cwl.hP, 5, 20);
      $$0.a(cwl.hQ, 5, 20);
      $$0.a(cwl.hR, 5, 20);
      $$0.a(cwl.hS, 5, 20);
      $$0.a(cwl.hT, 5, 20);
      $$0.a(cwl.hU, 5, 20);
      $$0.a(cwl.U, 5, 5);
      $$0.a(cwl.V, 5, 5);
      $$0.a(cwl.W, 5, 5);
      $$0.a(cwl.X, 5, 5);
      $$0.a(cwl.Y, 5, 5);
      $$0.a(cwl.Z, 5, 5);
      $$0.a(cwl.aa, 5, 5);
      $$0.a(cwl.ab, 5, 5);
      $$0.a(cwl.ae, 5, 5);
      $$0.a(cwl.al, 5, 5);
      $$0.a(cwl.af, 5, 5);
      $$0.a(cwl.ag, 5, 5);
      $$0.a(cwl.ah, 5, 5);
      $$0.a(cwl.ai, 5, 5);
      $$0.a(cwl.aj, 5, 5);
      $$0.a(cwl.ak, 5, 5);
      $$0.a(cwl.am, 5, 5);
      $$0.a(cwl.an, 5, 5);
      $$0.a(cwl.aw, 5, 5);
      $$0.a(cwl.ax, 5, 5);
      $$0.a(cwl.ay, 5, 5);
      $$0.a(cwl.az, 5, 5);
      $$0.a(cwl.aA, 5, 5);
      $$0.a(cwl.aB, 5, 5);
      $$0.a(cwl.aC, 5, 5);
      $$0.a(cwl.aD, 5, 5);
      $$0.a(cwl.ao, 5, 5);
      $$0.a(cwl.ap, 5, 5);
      $$0.a(cwl.aq, 5, 5);
      $$0.a(cwl.ar, 5, 5);
      $$0.a(cwl.as, 5, 5);
      $$0.a(cwl.at, 5, 5);
      $$0.a(cwl.au, 5, 5);
      $$0.a(cwl.av, 5, 5);
      $$0.a(cwl.ac, 5, 20);
      $$0.a(cwl.aE, 30, 60);
      $$0.a(cwl.aF, 30, 60);
      $$0.a(cwl.aG, 30, 60);
      $$0.a(cwl.aH, 30, 60);
      $$0.a(cwl.aI, 30, 60);
      $$0.a(cwl.aJ, 30, 60);
      $$0.a(cwl.aK, 30, 60);
      $$0.a(cwl.aL, 30, 60);
      $$0.a(cwl.cl, 30, 20);
      $$0.a(cwl.ck, 15, 100);
      $$0.a(cwl.bt, 60, 100);
      $$0.a(cwl.bu, 60, 100);
      $$0.a(cwl.bv, 60, 100);
      $$0.a(cwl.iD, 60, 100);
      $$0.a(cwl.iE, 60, 100);
      $$0.a(cwl.iF, 60, 100);
      $$0.a(cwl.iG, 60, 100);
      $$0.a(cwl.iH, 60, 100);
      $$0.a(cwl.iI, 60, 100);
      $$0.a(cwl.bR, 60, 100);
      $$0.a(cwl.bT, 60, 100);
      $$0.a(cwl.bU, 60, 100);
      $$0.a(cwl.bV, 60, 100);
      $$0.a(cwl.bW, 60, 100);
      $$0.a(cwl.bX, 60, 100);
      $$0.a(cwl.bY, 60, 100);
      $$0.a(cwl.bZ, 60, 100);
      $$0.a(cwl.ca, 60, 100);
      $$0.a(cwl.cb, 60, 100);
      $$0.a(cwl.cc, 60, 100);
      $$0.a(cwl.ce, 60, 100);
      $$0.a(cwl.bS, 60, 100);
      $$0.a(cwl.kC, 60, 100);
      $$0.a(cwl.cd, 60, 100);
      $$0.a(cwl.sB, 60, 100);
      $$0.a(cwl.bA, 30, 60);
      $$0.a(cwl.bB, 30, 60);
      $$0.a(cwl.bC, 30, 60);
      $$0.a(cwl.bD, 30, 60);
      $$0.a(cwl.bE, 30, 60);
      $$0.a(cwl.bF, 30, 60);
      $$0.a(cwl.bG, 30, 60);
      $$0.a(cwl.bH, 30, 60);
      $$0.a(cwl.bI, 30, 60);
      $$0.a(cwl.bJ, 30, 60);
      $$0.a(cwl.bK, 30, 60);
      $$0.a(cwl.bL, 30, 60);
      $$0.a(cwl.bM, 30, 60);
      $$0.a(cwl.bN, 30, 60);
      $$0.a(cwl.bO, 30, 60);
      $$0.a(cwl.bP, 30, 60);
      $$0.a(cwl.ff, 15, 100);
      $$0.a(cwl.iB, 5, 5);
      $$0.a(cwl.ij, 60, 20);
      $$0.a(cwl.pd, 15, 20);
      $$0.a(cwl.ik, 60, 20);
      $$0.a(cwl.il, 60, 20);
      $$0.a(cwl.im, 60, 20);
      $$0.a(cwl.in, 60, 20);
      $$0.a(cwl.io, 60, 20);
      $$0.a(cwl.ip, 60, 20);
      $$0.a(cwl.iq, 60, 20);
      $$0.a(cwl.ir, 60, 20);
      $$0.a(cwl.is, 60, 20);
      $$0.a(cwl.it, 60, 20);
      $$0.a(cwl.iu, 60, 20);
      $$0.a(cwl.iv, 60, 20);
      $$0.a(cwl.iw, 60, 20);
      $$0.a(cwl.ix, 60, 20);
      $$0.a(cwl.iy, 60, 20);
      $$0.a(cwl.iz, 60, 20);
      $$0.a(cwl.me, 30, 60);
      $$0.a(cwl.mZ, 60, 60);
      $$0.a(cwl.nS, 60, 60);
      $$0.a(cwl.oa, 30, 20);
      $$0.a(cwl.pc, 5, 20);
      $$0.a(cwl.oi, 60, 100);
      $$0.a(cwl.pf, 5, 20);
      $$0.a(cwl.pe, 30, 20);
      $$0.a(cwl.aM, 30, 60);
      $$0.a(cwl.aN, 30, 60);
      $$0.a(cwl.sv, 15, 60);
      $$0.a(cwl.sw, 15, 60);
      $$0.a(cwl.sx, 60, 100);
      $$0.a(cwl.sy, 30, 60);
      $$0.a(cwl.sz, 30, 60);
      $$0.a(cwl.sD, 60, 100);
      $$0.a(cwl.sE, 60, 100);
      $$0.a(cwl.sF, 60, 100);
      $$0.a(cwl.sG, 30, 60);
      $$0.a(cwl.fg, 15, 100);
   }
}
