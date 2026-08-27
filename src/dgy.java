import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dgy extends ddl {
   public static final MapCodec<dgy> c = b(dgy::new);
   public static final int d = 15;
   public static final dsb e = drr.aw;
   public static final drs f = djm.b;
   public static final drs g = djm.c;
   public static final drs h = djm.d;
   public static final drs i = djm.e;
   public static final drs j = djm.f;
   private static final Map<it, drs> k = djm.h.entrySet().stream().filter($$0 -> $$0.getKey() != it.a).collect(ac.a());
   private static final evd l = ddy.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final evd m = ddy.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final evd n = ddy.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final evd o = ddy.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final evd F = ddy.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<drb, evd> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<ddy> P = new Object2IntOpenHashMap();
   private final Object2IntMap<ddy> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dgy> a() {
      return c;
   }

   public dgy(dra.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dgy::m)));
   }

   private static evd m(drb $$0) {
      evd $$1 = eva.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = eva.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = eva.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = eva.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = eva.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dea.a.n();
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public drb a(cwz $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected drb b(dad $$0, io $$1) {
      io $$2 = $$1.d();
      drb $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, it.b)) {
         drb $$4 = this.n();

         for (it $$5 : it.values()) {
            drs $$6 = k.get($$5);
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
   protected boolean a(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, it.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.aa().b(dat.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         drb $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ac() && this.a((dax)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.a(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  io $$8 = $$2.d();
                  if (!$$1.a_($$8).d($$1, $$8, it.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.f($$1.a_($$2.d()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(avv.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.c(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            io.a $$11 = new io.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dba)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ac() || !this.a((dax)$$1, $$11))) {
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

   protected boolean a(dax $$0, io $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(drb $$0) {
      return $$0.b(drr.C) && $$0.c(drr.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(drb $$0) {
      return $$0.b(drr.C) && $$0.c(drr.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dax $$0, io $$1, int $$2, ayk $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         drb $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         ddy $$8 = $$6.b();
         if ($$8 instanceof dmh) {
            dmh.a($$0, $$1);
         }
      }
   }

   private drb a(day $$0, io $$1, int $$2) {
      drb $$3 = a($$0, $$1);
      return $$3.a(dea.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dad $$0, io $$1) {
      for (it $$2 : it.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dba $$0, io $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (it $$3 : it.values()) {
            drb $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(drb $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(ayk $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(ddy $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dgy $$0 = (dgy)dea.cr;
      $$0.a(dea.n, 5, 20);
      $$0.a(dea.o, 5, 20);
      $$0.a(dea.p, 5, 20);
      $$0.a(dea.q, 5, 20);
      $$0.a(dea.r, 5, 20);
      $$0.a(dea.s, 5, 20);
      $$0.a(dea.t, 5, 20);
      $$0.a(dea.u, 5, 20);
      $$0.a(dea.v, 5, 20);
      $$0.a(dea.w, 5, 20);
      $$0.a(dea.jt, 5, 20);
      $$0.a(dea.ju, 5, 20);
      $$0.a(dea.jv, 5, 20);
      $$0.a(dea.jw, 5, 20);
      $$0.a(dea.jx, 5, 20);
      $$0.a(dea.jy, 5, 20);
      $$0.a(dea.jz, 5, 20);
      $$0.a(dea.jA, 5, 20);
      $$0.a(dea.jB, 5, 20);
      $$0.a(dea.jC, 5, 20);
      $$0.a(dea.fh, 5, 20);
      $$0.a(dea.jV, 5, 20);
      $$0.a(dea.jW, 5, 20);
      $$0.a(dea.jX, 5, 20);
      $$0.a(dea.jY, 5, 20);
      $$0.a(dea.jZ, 5, 20);
      $$0.a(dea.ka, 5, 20);
      $$0.a(dea.kb, 5, 20);
      $$0.a(dea.kc, 5, 20);
      $$0.a(dea.dU, 5, 20);
      $$0.a(dea.kd, 5, 20);
      $$0.a(dea.ke, 5, 20);
      $$0.a(dea.kf, 5, 20);
      $$0.a(dea.kg, 5, 20);
      $$0.a(dea.kh, 5, 20);
      $$0.a(dea.ki, 5, 20);
      $$0.a(dea.kj, 5, 20);
      $$0.a(dea.kk, 5, 20);
      $$0.a(dea.cu, 5, 20);
      $$0.a(dea.fL, 5, 20);
      $$0.a(dea.fK, 5, 20);
      $$0.a(dea.fM, 5, 20);
      $$0.a(dea.hP, 5, 20);
      $$0.a(dea.hQ, 5, 20);
      $$0.a(dea.hR, 5, 20);
      $$0.a(dea.hS, 5, 20);
      $$0.a(dea.hT, 5, 20);
      $$0.a(dea.hU, 5, 20);
      $$0.a(dea.U, 5, 5);
      $$0.a(dea.V, 5, 5);
      $$0.a(dea.W, 5, 5);
      $$0.a(dea.X, 5, 5);
      $$0.a(dea.Y, 5, 5);
      $$0.a(dea.Z, 5, 5);
      $$0.a(dea.aa, 5, 5);
      $$0.a(dea.ab, 5, 5);
      $$0.a(dea.ae, 5, 5);
      $$0.a(dea.al, 5, 5);
      $$0.a(dea.af, 5, 5);
      $$0.a(dea.ag, 5, 5);
      $$0.a(dea.ah, 5, 5);
      $$0.a(dea.ai, 5, 5);
      $$0.a(dea.aj, 5, 5);
      $$0.a(dea.ak, 5, 5);
      $$0.a(dea.am, 5, 5);
      $$0.a(dea.an, 5, 5);
      $$0.a(dea.aw, 5, 5);
      $$0.a(dea.ax, 5, 5);
      $$0.a(dea.ay, 5, 5);
      $$0.a(dea.az, 5, 5);
      $$0.a(dea.aA, 5, 5);
      $$0.a(dea.aB, 5, 5);
      $$0.a(dea.aC, 5, 5);
      $$0.a(dea.aD, 5, 5);
      $$0.a(dea.ao, 5, 5);
      $$0.a(dea.ap, 5, 5);
      $$0.a(dea.aq, 5, 5);
      $$0.a(dea.ar, 5, 5);
      $$0.a(dea.as, 5, 5);
      $$0.a(dea.at, 5, 5);
      $$0.a(dea.au, 5, 5);
      $$0.a(dea.av, 5, 5);
      $$0.a(dea.ac, 5, 20);
      $$0.a(dea.aE, 30, 60);
      $$0.a(dea.aF, 30, 60);
      $$0.a(dea.aG, 30, 60);
      $$0.a(dea.aH, 30, 60);
      $$0.a(dea.aI, 30, 60);
      $$0.a(dea.aJ, 30, 60);
      $$0.a(dea.aK, 30, 60);
      $$0.a(dea.aL, 30, 60);
      $$0.a(dea.cl, 30, 20);
      $$0.a(dea.ck, 15, 100);
      $$0.a(dea.bt, 60, 100);
      $$0.a(dea.bu, 60, 100);
      $$0.a(dea.bv, 60, 100);
      $$0.a(dea.iD, 60, 100);
      $$0.a(dea.iE, 60, 100);
      $$0.a(dea.iF, 60, 100);
      $$0.a(dea.iG, 60, 100);
      $$0.a(dea.iH, 60, 100);
      $$0.a(dea.iI, 60, 100);
      $$0.a(dea.bR, 60, 100);
      $$0.a(dea.bT, 60, 100);
      $$0.a(dea.bU, 60, 100);
      $$0.a(dea.bV, 60, 100);
      $$0.a(dea.bW, 60, 100);
      $$0.a(dea.bX, 60, 100);
      $$0.a(dea.bY, 60, 100);
      $$0.a(dea.bZ, 60, 100);
      $$0.a(dea.ca, 60, 100);
      $$0.a(dea.cb, 60, 100);
      $$0.a(dea.cc, 60, 100);
      $$0.a(dea.ce, 60, 100);
      $$0.a(dea.bS, 60, 100);
      $$0.a(dea.kC, 60, 100);
      $$0.a(dea.cd, 60, 100);
      $$0.a(dea.sB, 60, 100);
      $$0.a(dea.bA, 30, 60);
      $$0.a(dea.bB, 30, 60);
      $$0.a(dea.bC, 30, 60);
      $$0.a(dea.bD, 30, 60);
      $$0.a(dea.bE, 30, 60);
      $$0.a(dea.bF, 30, 60);
      $$0.a(dea.bG, 30, 60);
      $$0.a(dea.bH, 30, 60);
      $$0.a(dea.bI, 30, 60);
      $$0.a(dea.bJ, 30, 60);
      $$0.a(dea.bK, 30, 60);
      $$0.a(dea.bL, 30, 60);
      $$0.a(dea.bM, 30, 60);
      $$0.a(dea.bN, 30, 60);
      $$0.a(dea.bO, 30, 60);
      $$0.a(dea.bP, 30, 60);
      $$0.a(dea.ff, 15, 100);
      $$0.a(dea.iB, 5, 5);
      $$0.a(dea.ij, 60, 20);
      $$0.a(dea.pd, 15, 20);
      $$0.a(dea.ik, 60, 20);
      $$0.a(dea.il, 60, 20);
      $$0.a(dea.im, 60, 20);
      $$0.a(dea.in, 60, 20);
      $$0.a(dea.io, 60, 20);
      $$0.a(dea.ip, 60, 20);
      $$0.a(dea.iq, 60, 20);
      $$0.a(dea.ir, 60, 20);
      $$0.a(dea.is, 60, 20);
      $$0.a(dea.it, 60, 20);
      $$0.a(dea.iu, 60, 20);
      $$0.a(dea.iv, 60, 20);
      $$0.a(dea.iw, 60, 20);
      $$0.a(dea.ix, 60, 20);
      $$0.a(dea.iy, 60, 20);
      $$0.a(dea.iz, 60, 20);
      $$0.a(dea.me, 30, 60);
      $$0.a(dea.mZ, 60, 60);
      $$0.a(dea.nS, 60, 60);
      $$0.a(dea.oa, 30, 20);
      $$0.a(dea.pc, 5, 20);
      $$0.a(dea.oi, 60, 100);
      $$0.a(dea.pf, 5, 20);
      $$0.a(dea.pe, 30, 20);
      $$0.a(dea.aM, 30, 60);
      $$0.a(dea.aN, 30, 60);
      $$0.a(dea.sv, 15, 60);
      $$0.a(dea.sw, 15, 60);
      $$0.a(dea.sx, 60, 100);
      $$0.a(dea.sy, 30, 60);
      $$0.a(dea.sz, 30, 60);
      $$0.a(dea.sD, 60, 100);
      $$0.a(dea.sE, 60, 100);
      $$0.a(dea.sF, 60, 100);
      $$0.a(dea.sG, 30, 60);
      $$0.a(dea.fg, 15, 100);
   }
}
