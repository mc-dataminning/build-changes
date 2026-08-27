import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dge extends dcr {
   public static final MapCodec<dge> c = b(dge::new);
   public static final int d = 15;
   public static final drh e = dqx.aw;
   public static final dqy f = dis.b;
   public static final dqy g = dis.c;
   public static final dqy h = dis.d;
   public static final dqy i = dis.e;
   public static final dqy j = dis.f;
   private static final Map<is, dqy> k = dis.h.entrySet().stream().filter($$0 -> $$0.getKey() != is.a).collect(ac.a());
   private static final eui l = dde.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eui m = dde.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eui n = dde.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eui o = dde.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eui F = dde.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dqh, eui> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dde> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dde> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dge> a() {
      return c;
   }

   public dge(dqg.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dge::m)));
   }

   private static eui m(dqh $$0) {
      eui $$1 = euf.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = euf.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = euf.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = euf.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = euf.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : ddg.a.n();
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dqh a(cwi $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dqh b(czj $$0, in $$1) {
      in $$2 = $$1.d();
      dqh $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, is.b)) {
         dqh $$4 = this.n();

         for (is $$5 : is.values()) {
            dqy $$6 = k.get($$5);
            if ($$6 != null) {
               $$4 = $$4.a($$6, Boolean.valueOf(this.f($$0.a_($$1.a($$5)))));
            }
         }

         return $$4;
      } else {
         return this.n();
      }
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, is.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.aa().b(czz.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dqh $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ac() && this.a((dad)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  in $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, is.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(avq.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            in.a $$11 = new in.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dag)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ac() || !this.a((dad)$$1, $$11))) {
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

   protected boolean a(dad $$0, in $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dqh $$0) {
      return $$0.b(dqx.C) && $$0.c(dqx.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dqh $$0) {
      return $$0.b(dqx.C) && $$0.c(dqx.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dad $$0, in $$1, int $$2, ayg $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dqh $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dde $$8 = $$6.b();
         if ($$8 instanceof dln) {
            dln.a($$0, $$1);
         }
      }
   }

   private dqh a(dae $$0, in $$1, int $$2) {
      dqh $$3 = a($$0, $$1);
      return $$3.a(ddg.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(czj $$0, in $$1) {
      for (is $$2 : is.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dag $$0, in $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (is $$3 : is.values()) {
            dqh $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dqh $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(ayg $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dde $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dge $$0 = (dge)ddg.cr;
      $$0.a(ddg.n, 5, 20);
      $$0.a(ddg.o, 5, 20);
      $$0.a(ddg.p, 5, 20);
      $$0.a(ddg.q, 5, 20);
      $$0.a(ddg.r, 5, 20);
      $$0.a(ddg.s, 5, 20);
      $$0.a(ddg.t, 5, 20);
      $$0.a(ddg.u, 5, 20);
      $$0.a(ddg.v, 5, 20);
      $$0.a(ddg.w, 5, 20);
      $$0.a(ddg.jt, 5, 20);
      $$0.a(ddg.ju, 5, 20);
      $$0.a(ddg.jv, 5, 20);
      $$0.a(ddg.jw, 5, 20);
      $$0.a(ddg.jx, 5, 20);
      $$0.a(ddg.jy, 5, 20);
      $$0.a(ddg.jz, 5, 20);
      $$0.a(ddg.jA, 5, 20);
      $$0.a(ddg.jB, 5, 20);
      $$0.a(ddg.jC, 5, 20);
      $$0.a(ddg.fh, 5, 20);
      $$0.a(ddg.jV, 5, 20);
      $$0.a(ddg.jW, 5, 20);
      $$0.a(ddg.jX, 5, 20);
      $$0.a(ddg.jY, 5, 20);
      $$0.a(ddg.jZ, 5, 20);
      $$0.a(ddg.ka, 5, 20);
      $$0.a(ddg.kb, 5, 20);
      $$0.a(ddg.kc, 5, 20);
      $$0.a(ddg.dU, 5, 20);
      $$0.a(ddg.kd, 5, 20);
      $$0.a(ddg.ke, 5, 20);
      $$0.a(ddg.kf, 5, 20);
      $$0.a(ddg.kg, 5, 20);
      $$0.a(ddg.kh, 5, 20);
      $$0.a(ddg.ki, 5, 20);
      $$0.a(ddg.kj, 5, 20);
      $$0.a(ddg.kk, 5, 20);
      $$0.a(ddg.cu, 5, 20);
      $$0.a(ddg.fL, 5, 20);
      $$0.a(ddg.fK, 5, 20);
      $$0.a(ddg.fM, 5, 20);
      $$0.a(ddg.hP, 5, 20);
      $$0.a(ddg.hQ, 5, 20);
      $$0.a(ddg.hR, 5, 20);
      $$0.a(ddg.hS, 5, 20);
      $$0.a(ddg.hT, 5, 20);
      $$0.a(ddg.hU, 5, 20);
      $$0.a(ddg.U, 5, 5);
      $$0.a(ddg.V, 5, 5);
      $$0.a(ddg.W, 5, 5);
      $$0.a(ddg.X, 5, 5);
      $$0.a(ddg.Y, 5, 5);
      $$0.a(ddg.Z, 5, 5);
      $$0.a(ddg.aa, 5, 5);
      $$0.a(ddg.ab, 5, 5);
      $$0.a(ddg.ae, 5, 5);
      $$0.a(ddg.al, 5, 5);
      $$0.a(ddg.af, 5, 5);
      $$0.a(ddg.ag, 5, 5);
      $$0.a(ddg.ah, 5, 5);
      $$0.a(ddg.ai, 5, 5);
      $$0.a(ddg.aj, 5, 5);
      $$0.a(ddg.ak, 5, 5);
      $$0.a(ddg.am, 5, 5);
      $$0.a(ddg.an, 5, 5);
      $$0.a(ddg.aw, 5, 5);
      $$0.a(ddg.ax, 5, 5);
      $$0.a(ddg.ay, 5, 5);
      $$0.a(ddg.az, 5, 5);
      $$0.a(ddg.aA, 5, 5);
      $$0.a(ddg.aB, 5, 5);
      $$0.a(ddg.aC, 5, 5);
      $$0.a(ddg.aD, 5, 5);
      $$0.a(ddg.ao, 5, 5);
      $$0.a(ddg.ap, 5, 5);
      $$0.a(ddg.aq, 5, 5);
      $$0.a(ddg.ar, 5, 5);
      $$0.a(ddg.as, 5, 5);
      $$0.a(ddg.at, 5, 5);
      $$0.a(ddg.au, 5, 5);
      $$0.a(ddg.av, 5, 5);
      $$0.a(ddg.ac, 5, 20);
      $$0.a(ddg.aE, 30, 60);
      $$0.a(ddg.aF, 30, 60);
      $$0.a(ddg.aG, 30, 60);
      $$0.a(ddg.aH, 30, 60);
      $$0.a(ddg.aI, 30, 60);
      $$0.a(ddg.aJ, 30, 60);
      $$0.a(ddg.aK, 30, 60);
      $$0.a(ddg.aL, 30, 60);
      $$0.a(ddg.cl, 30, 20);
      $$0.a(ddg.ck, 15, 100);
      $$0.a(ddg.bt, 60, 100);
      $$0.a(ddg.bu, 60, 100);
      $$0.a(ddg.bv, 60, 100);
      $$0.a(ddg.iD, 60, 100);
      $$0.a(ddg.iE, 60, 100);
      $$0.a(ddg.iF, 60, 100);
      $$0.a(ddg.iG, 60, 100);
      $$0.a(ddg.iH, 60, 100);
      $$0.a(ddg.iI, 60, 100);
      $$0.a(ddg.bR, 60, 100);
      $$0.a(ddg.bT, 60, 100);
      $$0.a(ddg.bU, 60, 100);
      $$0.a(ddg.bV, 60, 100);
      $$0.a(ddg.bW, 60, 100);
      $$0.a(ddg.bX, 60, 100);
      $$0.a(ddg.bY, 60, 100);
      $$0.a(ddg.bZ, 60, 100);
      $$0.a(ddg.ca, 60, 100);
      $$0.a(ddg.cb, 60, 100);
      $$0.a(ddg.cc, 60, 100);
      $$0.a(ddg.ce, 60, 100);
      $$0.a(ddg.bS, 60, 100);
      $$0.a(ddg.kC, 60, 100);
      $$0.a(ddg.cd, 60, 100);
      $$0.a(ddg.sB, 60, 100);
      $$0.a(ddg.bA, 30, 60);
      $$0.a(ddg.bB, 30, 60);
      $$0.a(ddg.bC, 30, 60);
      $$0.a(ddg.bD, 30, 60);
      $$0.a(ddg.bE, 30, 60);
      $$0.a(ddg.bF, 30, 60);
      $$0.a(ddg.bG, 30, 60);
      $$0.a(ddg.bH, 30, 60);
      $$0.a(ddg.bI, 30, 60);
      $$0.a(ddg.bJ, 30, 60);
      $$0.a(ddg.bK, 30, 60);
      $$0.a(ddg.bL, 30, 60);
      $$0.a(ddg.bM, 30, 60);
      $$0.a(ddg.bN, 30, 60);
      $$0.a(ddg.bO, 30, 60);
      $$0.a(ddg.bP, 30, 60);
      $$0.a(ddg.ff, 15, 100);
      $$0.a(ddg.iB, 5, 5);
      $$0.a(ddg.ij, 60, 20);
      $$0.a(ddg.pd, 15, 20);
      $$0.a(ddg.ik, 60, 20);
      $$0.a(ddg.il, 60, 20);
      $$0.a(ddg.im, 60, 20);
      $$0.a(ddg.in, 60, 20);
      $$0.a(ddg.io, 60, 20);
      $$0.a(ddg.ip, 60, 20);
      $$0.a(ddg.iq, 60, 20);
      $$0.a(ddg.ir, 60, 20);
      $$0.a(ddg.is, 60, 20);
      $$0.a(ddg.it, 60, 20);
      $$0.a(ddg.iu, 60, 20);
      $$0.a(ddg.iv, 60, 20);
      $$0.a(ddg.iw, 60, 20);
      $$0.a(ddg.ix, 60, 20);
      $$0.a(ddg.iy, 60, 20);
      $$0.a(ddg.iz, 60, 20);
      $$0.a(ddg.me, 30, 60);
      $$0.a(ddg.mZ, 60, 60);
      $$0.a(ddg.nS, 60, 60);
      $$0.a(ddg.oa, 30, 20);
      $$0.a(ddg.pc, 5, 20);
      $$0.a(ddg.oi, 60, 100);
      $$0.a(ddg.pf, 5, 20);
      $$0.a(ddg.pe, 30, 20);
      $$0.a(ddg.aM, 30, 60);
      $$0.a(ddg.aN, 30, 60);
      $$0.a(ddg.sv, 15, 60);
      $$0.a(ddg.sw, 15, 60);
      $$0.a(ddg.sx, 60, 100);
      $$0.a(ddg.sy, 30, 60);
      $$0.a(ddg.sz, 30, 60);
      $$0.a(ddg.sD, 60, 100);
      $$0.a(ddg.sE, 60, 100);
      $$0.a(ddg.sF, 60, 100);
      $$0.a(ddg.sG, 30, 60);
      $$0.a(ddg.fg, 15, 100);
   }
}
