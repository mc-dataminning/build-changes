import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dhu extends deh {
   public static final MapCodec<dhu> c = b(dhu::new);
   public static final int d = 15;
   public static final dsx e = dsn.aw;
   public static final dso f = dki.b;
   public static final dso g = dki.c;
   public static final dso h = dki.d;
   public static final dso i = dki.e;
   public static final dso j = dki.f;
   private static final Map<je, dso> k = dki.h.entrySet().stream().filter($$0 -> $$0.getKey() != je.a).collect(ac.a());
   private static final ewf l = deu.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewf m = deu.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewf n = deu.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewf o = deu.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewf F = deu.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<drx, ewf> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<deu> P = new Object2IntOpenHashMap();
   private final Object2IntMap<deu> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dhu> a() {
      return c;
   }

   public dhu(drw.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dhu::m)));
   }

   private static ewf m(drx $$0) {
      ewf $$1 = ewc.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ewc.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ewc.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ewc.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ewc.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dew.a.n();
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public drx a(cxv $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected drx b(daz $$0, iz $$1) {
      iz $$2 = $$1.d();
      drx $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, je.b)) {
         drx $$4 = this.n();

         for (je $$5 : je.values()) {
            dso $$6 = k.get($$5);
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
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, je.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ab().b(dbp.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         drx $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ad() && this.a((dbt)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(awk.ad);
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
                        int $$16 = this.a((dbw)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ad() || !this.a((dbt)$$1, $$11))) {
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

   protected boolean a(dbt $$0, iz $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(drx $$0) {
      return $$0.b(dsn.C) && $$0.c(dsn.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(drx $$0) {
      return $$0.b(dsn.C) && $$0.c(dsn.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dbt $$0, iz $$1, int $$2, azc $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         drx $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         deu $$8 = $$6.b();
         if ($$8 instanceof dnd) {
            dnd.a($$0, $$1);
         }
      }
   }

   private drx a(dbu $$0, iz $$1, int $$2) {
      drx $$3 = a($$0, $$1);
      return $$3.a(dew.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(daz $$0, iz $$1) {
      for (je $$2 : je.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dbw $$0, iz $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (je $$3 : je.values()) {
            drx $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(drx $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(azc $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(deu $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dhu $$0 = (dhu)dew.cr;
      $$0.a(dew.n, 5, 20);
      $$0.a(dew.o, 5, 20);
      $$0.a(dew.p, 5, 20);
      $$0.a(dew.q, 5, 20);
      $$0.a(dew.r, 5, 20);
      $$0.a(dew.s, 5, 20);
      $$0.a(dew.t, 5, 20);
      $$0.a(dew.u, 5, 20);
      $$0.a(dew.v, 5, 20);
      $$0.a(dew.w, 5, 20);
      $$0.a(dew.jt, 5, 20);
      $$0.a(dew.ju, 5, 20);
      $$0.a(dew.jv, 5, 20);
      $$0.a(dew.jw, 5, 20);
      $$0.a(dew.jx, 5, 20);
      $$0.a(dew.jy, 5, 20);
      $$0.a(dew.jz, 5, 20);
      $$0.a(dew.jA, 5, 20);
      $$0.a(dew.jB, 5, 20);
      $$0.a(dew.jC, 5, 20);
      $$0.a(dew.fh, 5, 20);
      $$0.a(dew.jV, 5, 20);
      $$0.a(dew.jW, 5, 20);
      $$0.a(dew.jX, 5, 20);
      $$0.a(dew.jY, 5, 20);
      $$0.a(dew.jZ, 5, 20);
      $$0.a(dew.ka, 5, 20);
      $$0.a(dew.kb, 5, 20);
      $$0.a(dew.kc, 5, 20);
      $$0.a(dew.dU, 5, 20);
      $$0.a(dew.kd, 5, 20);
      $$0.a(dew.ke, 5, 20);
      $$0.a(dew.kf, 5, 20);
      $$0.a(dew.kg, 5, 20);
      $$0.a(dew.kh, 5, 20);
      $$0.a(dew.ki, 5, 20);
      $$0.a(dew.kj, 5, 20);
      $$0.a(dew.kk, 5, 20);
      $$0.a(dew.cu, 5, 20);
      $$0.a(dew.fL, 5, 20);
      $$0.a(dew.fK, 5, 20);
      $$0.a(dew.fM, 5, 20);
      $$0.a(dew.hP, 5, 20);
      $$0.a(dew.hQ, 5, 20);
      $$0.a(dew.hR, 5, 20);
      $$0.a(dew.hS, 5, 20);
      $$0.a(dew.hT, 5, 20);
      $$0.a(dew.hU, 5, 20);
      $$0.a(dew.U, 5, 5);
      $$0.a(dew.V, 5, 5);
      $$0.a(dew.W, 5, 5);
      $$0.a(dew.X, 5, 5);
      $$0.a(dew.Y, 5, 5);
      $$0.a(dew.Z, 5, 5);
      $$0.a(dew.aa, 5, 5);
      $$0.a(dew.ab, 5, 5);
      $$0.a(dew.ae, 5, 5);
      $$0.a(dew.al, 5, 5);
      $$0.a(dew.af, 5, 5);
      $$0.a(dew.ag, 5, 5);
      $$0.a(dew.ah, 5, 5);
      $$0.a(dew.ai, 5, 5);
      $$0.a(dew.aj, 5, 5);
      $$0.a(dew.ak, 5, 5);
      $$0.a(dew.am, 5, 5);
      $$0.a(dew.an, 5, 5);
      $$0.a(dew.aw, 5, 5);
      $$0.a(dew.ax, 5, 5);
      $$0.a(dew.ay, 5, 5);
      $$0.a(dew.az, 5, 5);
      $$0.a(dew.aA, 5, 5);
      $$0.a(dew.aB, 5, 5);
      $$0.a(dew.aC, 5, 5);
      $$0.a(dew.aD, 5, 5);
      $$0.a(dew.ao, 5, 5);
      $$0.a(dew.ap, 5, 5);
      $$0.a(dew.aq, 5, 5);
      $$0.a(dew.ar, 5, 5);
      $$0.a(dew.as, 5, 5);
      $$0.a(dew.at, 5, 5);
      $$0.a(dew.au, 5, 5);
      $$0.a(dew.av, 5, 5);
      $$0.a(dew.ac, 5, 20);
      $$0.a(dew.aE, 30, 60);
      $$0.a(dew.aF, 30, 60);
      $$0.a(dew.aG, 30, 60);
      $$0.a(dew.aH, 30, 60);
      $$0.a(dew.aI, 30, 60);
      $$0.a(dew.aJ, 30, 60);
      $$0.a(dew.aK, 30, 60);
      $$0.a(dew.aL, 30, 60);
      $$0.a(dew.cl, 30, 20);
      $$0.a(dew.ck, 15, 100);
      $$0.a(dew.bt, 60, 100);
      $$0.a(dew.bu, 60, 100);
      $$0.a(dew.bv, 60, 100);
      $$0.a(dew.iD, 60, 100);
      $$0.a(dew.iE, 60, 100);
      $$0.a(dew.iF, 60, 100);
      $$0.a(dew.iG, 60, 100);
      $$0.a(dew.iH, 60, 100);
      $$0.a(dew.iI, 60, 100);
      $$0.a(dew.bR, 60, 100);
      $$0.a(dew.bT, 60, 100);
      $$0.a(dew.bU, 60, 100);
      $$0.a(dew.bV, 60, 100);
      $$0.a(dew.bW, 60, 100);
      $$0.a(dew.bX, 60, 100);
      $$0.a(dew.bY, 60, 100);
      $$0.a(dew.bZ, 60, 100);
      $$0.a(dew.ca, 60, 100);
      $$0.a(dew.cb, 60, 100);
      $$0.a(dew.cc, 60, 100);
      $$0.a(dew.ce, 60, 100);
      $$0.a(dew.bS, 60, 100);
      $$0.a(dew.kC, 60, 100);
      $$0.a(dew.cd, 60, 100);
      $$0.a(dew.sB, 60, 100);
      $$0.a(dew.bA, 30, 60);
      $$0.a(dew.bB, 30, 60);
      $$0.a(dew.bC, 30, 60);
      $$0.a(dew.bD, 30, 60);
      $$0.a(dew.bE, 30, 60);
      $$0.a(dew.bF, 30, 60);
      $$0.a(dew.bG, 30, 60);
      $$0.a(dew.bH, 30, 60);
      $$0.a(dew.bI, 30, 60);
      $$0.a(dew.bJ, 30, 60);
      $$0.a(dew.bK, 30, 60);
      $$0.a(dew.bL, 30, 60);
      $$0.a(dew.bM, 30, 60);
      $$0.a(dew.bN, 30, 60);
      $$0.a(dew.bO, 30, 60);
      $$0.a(dew.bP, 30, 60);
      $$0.a(dew.ff, 15, 100);
      $$0.a(dew.iB, 5, 5);
      $$0.a(dew.ij, 60, 20);
      $$0.a(dew.pd, 15, 20);
      $$0.a(dew.ik, 60, 20);
      $$0.a(dew.il, 60, 20);
      $$0.a(dew.im, 60, 20);
      $$0.a(dew.in, 60, 20);
      $$0.a(dew.io, 60, 20);
      $$0.a(dew.ip, 60, 20);
      $$0.a(dew.iq, 60, 20);
      $$0.a(dew.ir, 60, 20);
      $$0.a(dew.is, 60, 20);
      $$0.a(dew.it, 60, 20);
      $$0.a(dew.iu, 60, 20);
      $$0.a(dew.iv, 60, 20);
      $$0.a(dew.iw, 60, 20);
      $$0.a(dew.ix, 60, 20);
      $$0.a(dew.iy, 60, 20);
      $$0.a(dew.iz, 60, 20);
      $$0.a(dew.me, 30, 60);
      $$0.a(dew.mZ, 60, 60);
      $$0.a(dew.nS, 60, 60);
      $$0.a(dew.oa, 30, 20);
      $$0.a(dew.pc, 5, 20);
      $$0.a(dew.oi, 60, 100);
      $$0.a(dew.pf, 5, 20);
      $$0.a(dew.pe, 30, 20);
      $$0.a(dew.aM, 30, 60);
      $$0.a(dew.aN, 30, 60);
      $$0.a(dew.sv, 15, 60);
      $$0.a(dew.sw, 15, 60);
      $$0.a(dew.sx, 60, 100);
      $$0.a(dew.sy, 30, 60);
      $$0.a(dew.sz, 30, 60);
      $$0.a(dew.sD, 60, 100);
      $$0.a(dew.sE, 60, 100);
      $$0.a(dew.sF, 60, 100);
      $$0.a(dew.sG, 30, 60);
      $$0.a(dew.fg, 15, 100);
   }
}
