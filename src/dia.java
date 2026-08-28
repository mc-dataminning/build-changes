import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dia extends den {
   public static final MapCodec<dia> c = b(dia::new);
   public static final int d = 15;
   public static final dtd e = dst.aw;
   public static final dsu f = dko.b;
   public static final dsu g = dko.c;
   public static final dsu h = dko.d;
   public static final dsu i = dko.e;
   public static final dsu j = dko.f;
   private static final Map<je, dsu> k = dko.h.entrySet().stream().filter($$0 -> $$0.getKey() != je.a).collect(ac.a());
   private static final ewl l = dfa.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewl m = dfa.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewl n = dfa.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewl o = dfa.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewl F = dfa.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dsd, ewl> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dfa> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dfa> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dia> a() {
      return c;
   }

   public dia(dsc.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dia::m)));
   }

   private static ewl m(dsd $$0) {
      ewl $$1 = ewi.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ewi.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ewi.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ewi.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ewi.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dfc.a.o();
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dsd a(cyb $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dsd b(dbf $$0, iz $$1) {
      iz $$2 = $$1.d();
      dsd $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, je.b)) {
         dsd $$4 = this.o();

         for (je $$5 : je.values()) {
            dsu $$6 = k.get($$5);
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
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      iz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, je.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ab().b(dbv.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dsd $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ad() && this.a((dbz)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  iz $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, je.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(awo.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            iz.a $$11 = new iz.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dcc)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ad() || !this.a((dbz)$$1, $$11))) {
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

   protected boolean a(dbz $$0, iz $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dsd $$0) {
      return $$0.b(dst.C) && $$0.c(dst.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dsd $$0) {
      return $$0.b(dst.C) && $$0.c(dst.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dbz $$0, iz $$1, int $$2, azh $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dsd $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dfa $$8 = $$6.b();
         if ($$8 instanceof dnj) {
            dnj.a($$0, $$1);
         }
      }
   }

   private dsd a(dca $$0, iz $$1, int $$2) {
      dsd $$3 = a($$0, $$1);
      return $$3.a(dfc.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dbf $$0, iz $$1) {
      for (je $$2 : je.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dcc $$0, iz $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (je $$3 : je.values()) {
            dsd $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dsd $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(azh $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dfa $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dia $$0 = (dia)dfc.cr;
      $$0.a(dfc.n, 5, 20);
      $$0.a(dfc.o, 5, 20);
      $$0.a(dfc.p, 5, 20);
      $$0.a(dfc.q, 5, 20);
      $$0.a(dfc.r, 5, 20);
      $$0.a(dfc.s, 5, 20);
      $$0.a(dfc.t, 5, 20);
      $$0.a(dfc.u, 5, 20);
      $$0.a(dfc.v, 5, 20);
      $$0.a(dfc.w, 5, 20);
      $$0.a(dfc.jt, 5, 20);
      $$0.a(dfc.ju, 5, 20);
      $$0.a(dfc.jv, 5, 20);
      $$0.a(dfc.jw, 5, 20);
      $$0.a(dfc.jx, 5, 20);
      $$0.a(dfc.jy, 5, 20);
      $$0.a(dfc.jz, 5, 20);
      $$0.a(dfc.jA, 5, 20);
      $$0.a(dfc.jB, 5, 20);
      $$0.a(dfc.jC, 5, 20);
      $$0.a(dfc.fh, 5, 20);
      $$0.a(dfc.jV, 5, 20);
      $$0.a(dfc.jW, 5, 20);
      $$0.a(dfc.jX, 5, 20);
      $$0.a(dfc.jY, 5, 20);
      $$0.a(dfc.jZ, 5, 20);
      $$0.a(dfc.ka, 5, 20);
      $$0.a(dfc.kb, 5, 20);
      $$0.a(dfc.kc, 5, 20);
      $$0.a(dfc.dU, 5, 20);
      $$0.a(dfc.kd, 5, 20);
      $$0.a(dfc.ke, 5, 20);
      $$0.a(dfc.kf, 5, 20);
      $$0.a(dfc.kg, 5, 20);
      $$0.a(dfc.kh, 5, 20);
      $$0.a(dfc.ki, 5, 20);
      $$0.a(dfc.kj, 5, 20);
      $$0.a(dfc.kk, 5, 20);
      $$0.a(dfc.cu, 5, 20);
      $$0.a(dfc.fL, 5, 20);
      $$0.a(dfc.fK, 5, 20);
      $$0.a(dfc.fM, 5, 20);
      $$0.a(dfc.hP, 5, 20);
      $$0.a(dfc.hQ, 5, 20);
      $$0.a(dfc.hR, 5, 20);
      $$0.a(dfc.hS, 5, 20);
      $$0.a(dfc.hT, 5, 20);
      $$0.a(dfc.hU, 5, 20);
      $$0.a(dfc.U, 5, 5);
      $$0.a(dfc.V, 5, 5);
      $$0.a(dfc.W, 5, 5);
      $$0.a(dfc.X, 5, 5);
      $$0.a(dfc.Y, 5, 5);
      $$0.a(dfc.Z, 5, 5);
      $$0.a(dfc.aa, 5, 5);
      $$0.a(dfc.ab, 5, 5);
      $$0.a(dfc.ae, 5, 5);
      $$0.a(dfc.al, 5, 5);
      $$0.a(dfc.af, 5, 5);
      $$0.a(dfc.ag, 5, 5);
      $$0.a(dfc.ah, 5, 5);
      $$0.a(dfc.ai, 5, 5);
      $$0.a(dfc.aj, 5, 5);
      $$0.a(dfc.ak, 5, 5);
      $$0.a(dfc.am, 5, 5);
      $$0.a(dfc.an, 5, 5);
      $$0.a(dfc.aw, 5, 5);
      $$0.a(dfc.ax, 5, 5);
      $$0.a(dfc.ay, 5, 5);
      $$0.a(dfc.az, 5, 5);
      $$0.a(dfc.aA, 5, 5);
      $$0.a(dfc.aB, 5, 5);
      $$0.a(dfc.aC, 5, 5);
      $$0.a(dfc.aD, 5, 5);
      $$0.a(dfc.ao, 5, 5);
      $$0.a(dfc.ap, 5, 5);
      $$0.a(dfc.aq, 5, 5);
      $$0.a(dfc.ar, 5, 5);
      $$0.a(dfc.as, 5, 5);
      $$0.a(dfc.at, 5, 5);
      $$0.a(dfc.au, 5, 5);
      $$0.a(dfc.av, 5, 5);
      $$0.a(dfc.ac, 5, 20);
      $$0.a(dfc.aE, 30, 60);
      $$0.a(dfc.aF, 30, 60);
      $$0.a(dfc.aG, 30, 60);
      $$0.a(dfc.aH, 30, 60);
      $$0.a(dfc.aI, 30, 60);
      $$0.a(dfc.aJ, 30, 60);
      $$0.a(dfc.aK, 30, 60);
      $$0.a(dfc.aL, 30, 60);
      $$0.a(dfc.cl, 30, 20);
      $$0.a(dfc.ck, 15, 100);
      $$0.a(dfc.bt, 60, 100);
      $$0.a(dfc.bu, 60, 100);
      $$0.a(dfc.bv, 60, 100);
      $$0.a(dfc.iD, 60, 100);
      $$0.a(dfc.iE, 60, 100);
      $$0.a(dfc.iF, 60, 100);
      $$0.a(dfc.iG, 60, 100);
      $$0.a(dfc.iH, 60, 100);
      $$0.a(dfc.iI, 60, 100);
      $$0.a(dfc.bR, 60, 100);
      $$0.a(dfc.bT, 60, 100);
      $$0.a(dfc.bU, 60, 100);
      $$0.a(dfc.bV, 60, 100);
      $$0.a(dfc.bW, 60, 100);
      $$0.a(dfc.bX, 60, 100);
      $$0.a(dfc.bY, 60, 100);
      $$0.a(dfc.bZ, 60, 100);
      $$0.a(dfc.ca, 60, 100);
      $$0.a(dfc.cb, 60, 100);
      $$0.a(dfc.cc, 60, 100);
      $$0.a(dfc.ce, 60, 100);
      $$0.a(dfc.bS, 60, 100);
      $$0.a(dfc.kC, 60, 100);
      $$0.a(dfc.cd, 60, 100);
      $$0.a(dfc.sB, 60, 100);
      $$0.a(dfc.bA, 30, 60);
      $$0.a(dfc.bB, 30, 60);
      $$0.a(dfc.bC, 30, 60);
      $$0.a(dfc.bD, 30, 60);
      $$0.a(dfc.bE, 30, 60);
      $$0.a(dfc.bF, 30, 60);
      $$0.a(dfc.bG, 30, 60);
      $$0.a(dfc.bH, 30, 60);
      $$0.a(dfc.bI, 30, 60);
      $$0.a(dfc.bJ, 30, 60);
      $$0.a(dfc.bK, 30, 60);
      $$0.a(dfc.bL, 30, 60);
      $$0.a(dfc.bM, 30, 60);
      $$0.a(dfc.bN, 30, 60);
      $$0.a(dfc.bO, 30, 60);
      $$0.a(dfc.bP, 30, 60);
      $$0.a(dfc.ff, 15, 100);
      $$0.a(dfc.iB, 5, 5);
      $$0.a(dfc.ij, 60, 20);
      $$0.a(dfc.pd, 15, 20);
      $$0.a(dfc.ik, 60, 20);
      $$0.a(dfc.il, 60, 20);
      $$0.a(dfc.im, 60, 20);
      $$0.a(dfc.in, 60, 20);
      $$0.a(dfc.io, 60, 20);
      $$0.a(dfc.ip, 60, 20);
      $$0.a(dfc.iq, 60, 20);
      $$0.a(dfc.ir, 60, 20);
      $$0.a(dfc.is, 60, 20);
      $$0.a(dfc.it, 60, 20);
      $$0.a(dfc.iu, 60, 20);
      $$0.a(dfc.iv, 60, 20);
      $$0.a(dfc.iw, 60, 20);
      $$0.a(dfc.ix, 60, 20);
      $$0.a(dfc.iy, 60, 20);
      $$0.a(dfc.iz, 60, 20);
      $$0.a(dfc.me, 30, 60);
      $$0.a(dfc.mZ, 60, 60);
      $$0.a(dfc.nS, 60, 60);
      $$0.a(dfc.oa, 30, 20);
      $$0.a(dfc.pc, 5, 20);
      $$0.a(dfc.oi, 60, 100);
      $$0.a(dfc.pf, 5, 20);
      $$0.a(dfc.pe, 30, 20);
      $$0.a(dfc.aM, 30, 60);
      $$0.a(dfc.aN, 30, 60);
      $$0.a(dfc.sv, 15, 60);
      $$0.a(dfc.sw, 15, 60);
      $$0.a(dfc.sx, 60, 100);
      $$0.a(dfc.sy, 30, 60);
      $$0.a(dfc.sz, 30, 60);
      $$0.a(dfc.sD, 60, 100);
      $$0.a(dfc.sE, 60, 100);
      $$0.a(dfc.sF, 60, 100);
      $$0.a(dfc.sG, 30, 60);
      $$0.a(dfc.fg, 15, 100);
   }
}
