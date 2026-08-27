import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cxs extends cug {
   public static final MapCodec<cxs> c = b(cxs::new);
   public static final int d = 15;
   public static final dhw e = dhm.aw;
   public static final dhn f = dag.b;
   public static final dhn g = dag.c;
   public static final dhn h = dag.d;
   public static final dhn i = dag.e;
   public static final dhn j = dag.f;
   private static final Map<hx, dhn> k = dag.h.entrySet().stream().filter($$0 -> $$0.getKey() != hx.a).collect(ac.a());
   private static final ekb l = cut.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekb m = cut.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ekb n = cut.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ekb o = cut.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ekb F = cut.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dgw, ekb> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<cut> P = new Object2IntOpenHashMap();
   private final Object2IntMap<cut> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<cxs> a() {
      return c;
   }

   public cxs(dgv.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), cxs::h)));
   }

   private static ekb h(dgw $$0) {
      ekb $$1 = ejy.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ejy.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ejy.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ejy.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ejy.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : cuv.a.o();
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dgw a(cnj $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dgw b(cqy $$0, ht $$1) {
      ht $$2 = $$1.d();
      dgw $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, hx.b)) {
         dgw $$4 = this.o();

         for (hx $$5 : hx.values()) {
            dhn $$6 = k.get($$5);
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
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hx.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.X().b(cro.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dgw $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.Z() && this.a((crs)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  ht $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, hx.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.s($$2).a(arb.ac);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            ht.a $$11 = new ht.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((crv)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ai().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.Z() || !this.a((crs)$$1, $$11))) {
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

   protected boolean a(crs $$0, ht $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dgw $$0) {
      return $$0.b(dhm.C) && $$0.c(dhm.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dgw $$0) {
      return $$0.b(dhm.C) && $$0.c(dhm.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(crs $$0, ht $$1, int $$2, ato $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dgw $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cut $$8 = $$6.b();
         if ($$8 instanceof ddb) {
            ddb.a($$0, $$1);
         }
      }
   }

   private dgw a(crt $$0, ht $$1, int $$2) {
      dgw $$3 = a($$0, $$1);
      return $$3.a(cuv.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cqy $$0, ht $$1) {
      for (hx $$2 : hx.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(crv $$0, ht $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (hx $$3 : hx.values()) {
            dgw $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dgw $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(ato $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(cut $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      cxs $$0 = (cxs)cuv.cr;
      $$0.a(cuv.n, 5, 20);
      $$0.a(cuv.o, 5, 20);
      $$0.a(cuv.p, 5, 20);
      $$0.a(cuv.q, 5, 20);
      $$0.a(cuv.r, 5, 20);
      $$0.a(cuv.s, 5, 20);
      $$0.a(cuv.t, 5, 20);
      $$0.a(cuv.u, 5, 20);
      $$0.a(cuv.v, 5, 20);
      $$0.a(cuv.w, 5, 20);
      $$0.a(cuv.jt, 5, 20);
      $$0.a(cuv.ju, 5, 20);
      $$0.a(cuv.jv, 5, 20);
      $$0.a(cuv.jw, 5, 20);
      $$0.a(cuv.jx, 5, 20);
      $$0.a(cuv.jy, 5, 20);
      $$0.a(cuv.jz, 5, 20);
      $$0.a(cuv.jA, 5, 20);
      $$0.a(cuv.jB, 5, 20);
      $$0.a(cuv.jC, 5, 20);
      $$0.a(cuv.fh, 5, 20);
      $$0.a(cuv.jV, 5, 20);
      $$0.a(cuv.jW, 5, 20);
      $$0.a(cuv.jX, 5, 20);
      $$0.a(cuv.jY, 5, 20);
      $$0.a(cuv.jZ, 5, 20);
      $$0.a(cuv.ka, 5, 20);
      $$0.a(cuv.kb, 5, 20);
      $$0.a(cuv.kc, 5, 20);
      $$0.a(cuv.dU, 5, 20);
      $$0.a(cuv.kd, 5, 20);
      $$0.a(cuv.ke, 5, 20);
      $$0.a(cuv.kf, 5, 20);
      $$0.a(cuv.kg, 5, 20);
      $$0.a(cuv.kh, 5, 20);
      $$0.a(cuv.ki, 5, 20);
      $$0.a(cuv.kj, 5, 20);
      $$0.a(cuv.kk, 5, 20);
      $$0.a(cuv.cu, 5, 20);
      $$0.a(cuv.fL, 5, 20);
      $$0.a(cuv.fK, 5, 20);
      $$0.a(cuv.fM, 5, 20);
      $$0.a(cuv.hP, 5, 20);
      $$0.a(cuv.hQ, 5, 20);
      $$0.a(cuv.hR, 5, 20);
      $$0.a(cuv.hS, 5, 20);
      $$0.a(cuv.hT, 5, 20);
      $$0.a(cuv.hU, 5, 20);
      $$0.a(cuv.U, 5, 5);
      $$0.a(cuv.V, 5, 5);
      $$0.a(cuv.W, 5, 5);
      $$0.a(cuv.X, 5, 5);
      $$0.a(cuv.Y, 5, 5);
      $$0.a(cuv.Z, 5, 5);
      $$0.a(cuv.aa, 5, 5);
      $$0.a(cuv.ab, 5, 5);
      $$0.a(cuv.ae, 5, 5);
      $$0.a(cuv.al, 5, 5);
      $$0.a(cuv.af, 5, 5);
      $$0.a(cuv.ag, 5, 5);
      $$0.a(cuv.ah, 5, 5);
      $$0.a(cuv.ai, 5, 5);
      $$0.a(cuv.aj, 5, 5);
      $$0.a(cuv.ak, 5, 5);
      $$0.a(cuv.am, 5, 5);
      $$0.a(cuv.an, 5, 5);
      $$0.a(cuv.aw, 5, 5);
      $$0.a(cuv.ax, 5, 5);
      $$0.a(cuv.ay, 5, 5);
      $$0.a(cuv.az, 5, 5);
      $$0.a(cuv.aA, 5, 5);
      $$0.a(cuv.aB, 5, 5);
      $$0.a(cuv.aC, 5, 5);
      $$0.a(cuv.aD, 5, 5);
      $$0.a(cuv.ao, 5, 5);
      $$0.a(cuv.ap, 5, 5);
      $$0.a(cuv.aq, 5, 5);
      $$0.a(cuv.ar, 5, 5);
      $$0.a(cuv.as, 5, 5);
      $$0.a(cuv.at, 5, 5);
      $$0.a(cuv.au, 5, 5);
      $$0.a(cuv.av, 5, 5);
      $$0.a(cuv.ac, 5, 20);
      $$0.a(cuv.aE, 30, 60);
      $$0.a(cuv.aF, 30, 60);
      $$0.a(cuv.aG, 30, 60);
      $$0.a(cuv.aH, 30, 60);
      $$0.a(cuv.aI, 30, 60);
      $$0.a(cuv.aJ, 30, 60);
      $$0.a(cuv.aK, 30, 60);
      $$0.a(cuv.aL, 30, 60);
      $$0.a(cuv.cl, 30, 20);
      $$0.a(cuv.ck, 15, 100);
      $$0.a(cuv.bt, 60, 100);
      $$0.a(cuv.bu, 60, 100);
      $$0.a(cuv.bv, 60, 100);
      $$0.a(cuv.iD, 60, 100);
      $$0.a(cuv.iE, 60, 100);
      $$0.a(cuv.iF, 60, 100);
      $$0.a(cuv.iG, 60, 100);
      $$0.a(cuv.iH, 60, 100);
      $$0.a(cuv.iI, 60, 100);
      $$0.a(cuv.bR, 60, 100);
      $$0.a(cuv.bT, 60, 100);
      $$0.a(cuv.bU, 60, 100);
      $$0.a(cuv.bV, 60, 100);
      $$0.a(cuv.bW, 60, 100);
      $$0.a(cuv.bX, 60, 100);
      $$0.a(cuv.bY, 60, 100);
      $$0.a(cuv.bZ, 60, 100);
      $$0.a(cuv.ca, 60, 100);
      $$0.a(cuv.cb, 60, 100);
      $$0.a(cuv.cc, 60, 100);
      $$0.a(cuv.ce, 60, 100);
      $$0.a(cuv.bS, 60, 100);
      $$0.a(cuv.kC, 60, 100);
      $$0.a(cuv.cd, 60, 100);
      $$0.a(cuv.rA, 60, 100);
      $$0.a(cuv.bA, 30, 60);
      $$0.a(cuv.bB, 30, 60);
      $$0.a(cuv.bC, 30, 60);
      $$0.a(cuv.bD, 30, 60);
      $$0.a(cuv.bE, 30, 60);
      $$0.a(cuv.bF, 30, 60);
      $$0.a(cuv.bG, 30, 60);
      $$0.a(cuv.bH, 30, 60);
      $$0.a(cuv.bI, 30, 60);
      $$0.a(cuv.bJ, 30, 60);
      $$0.a(cuv.bK, 30, 60);
      $$0.a(cuv.bL, 30, 60);
      $$0.a(cuv.bM, 30, 60);
      $$0.a(cuv.bN, 30, 60);
      $$0.a(cuv.bO, 30, 60);
      $$0.a(cuv.bP, 30, 60);
      $$0.a(cuv.ff, 15, 100);
      $$0.a(cuv.iB, 5, 5);
      $$0.a(cuv.ij, 60, 20);
      $$0.a(cuv.pd, 15, 20);
      $$0.a(cuv.ik, 60, 20);
      $$0.a(cuv.il, 60, 20);
      $$0.a(cuv.im, 60, 20);
      $$0.a(cuv.in, 60, 20);
      $$0.a(cuv.io, 60, 20);
      $$0.a(cuv.ip, 60, 20);
      $$0.a(cuv.iq, 60, 20);
      $$0.a(cuv.ir, 60, 20);
      $$0.a(cuv.is, 60, 20);
      $$0.a(cuv.it, 60, 20);
      $$0.a(cuv.iu, 60, 20);
      $$0.a(cuv.iv, 60, 20);
      $$0.a(cuv.iw, 60, 20);
      $$0.a(cuv.ix, 60, 20);
      $$0.a(cuv.iy, 60, 20);
      $$0.a(cuv.iz, 60, 20);
      $$0.a(cuv.me, 30, 60);
      $$0.a(cuv.mZ, 60, 60);
      $$0.a(cuv.nS, 60, 60);
      $$0.a(cuv.oa, 30, 20);
      $$0.a(cuv.pc, 5, 20);
      $$0.a(cuv.oi, 60, 100);
      $$0.a(cuv.pf, 5, 20);
      $$0.a(cuv.pe, 30, 20);
      $$0.a(cuv.aM, 30, 60);
      $$0.a(cuv.aN, 30, 60);
      $$0.a(cuv.ru, 15, 60);
      $$0.a(cuv.rv, 15, 60);
      $$0.a(cuv.rw, 60, 100);
      $$0.a(cuv.rx, 30, 60);
      $$0.a(cuv.ry, 30, 60);
      $$0.a(cuv.rC, 60, 100);
      $$0.a(cuv.rD, 60, 100);
      $$0.a(cuv.rE, 60, 100);
      $$0.a(cuv.rF, 30, 60);
      $$0.a(cuv.fg, 15, 100);
   }
}
