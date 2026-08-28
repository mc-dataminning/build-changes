import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dhx extends dek {
   public static final MapCodec<dhx> c = b(dhx::new);
   public static final int d = 15;
   public static final dta e = dsq.aw;
   public static final dsr f = dkl.b;
   public static final dsr g = dkl.c;
   public static final dsr h = dkl.d;
   public static final dsr i = dkl.e;
   public static final dsr j = dkl.f;
   private static final Map<je, dsr> k = dkl.h.entrySet().stream().filter($$0 -> $$0.getKey() != je.a).collect(ac.a());
   private static final ewi l = dex.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewi m = dex.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ewi n = dex.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewi o = dex.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ewi F = dex.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dsa, ewi> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dex> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dex> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dhx> a() {
      return c;
   }

   public dhx(drz.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dhx::m)));
   }

   private static ewi m(dsa $$0) {
      ewi $$1 = ewf.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = ewf.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = ewf.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = ewf.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = ewf.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dez.a.o();
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dsa a(cxy $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dsa b(dbc $$0, iz $$1) {
      iz $$2 = $$1.d();
      dsa $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, je.b)) {
         dsa $$4 = this.o();

         for (je $$5 : je.values()) {
            dsr $$6 = k.get($$5);
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
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, je.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ab().b(dbs.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dsa $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ad() && this.a((dbw)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(awn.ad);
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
                        int $$16 = this.a((dbz)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.al().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ad() || !this.a((dbw)$$1, $$11))) {
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

   protected boolean a(dbw $$0, iz $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(dsa $$0) {
      return $$0.b(dsq.C) && $$0.c(dsq.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dsa $$0) {
      return $$0.b(dsq.C) && $$0.c(dsq.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dbw $$0, iz $$1, int $$2, azf $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dsa $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dex $$8 = $$6.b();
         if ($$8 instanceof dng) {
            dng.a($$0, $$1);
         }
      }
   }

   private dsa a(dbx $$0, iz $$1, int $$2) {
      dsa $$3 = a($$0, $$1);
      return $$3.a(dez.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dbc $$0, iz $$1) {
      for (je $$2 : je.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dbz $$0, iz $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (je $$3 : je.values()) {
            dsa $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dsa $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(azf $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dex $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dhx $$0 = (dhx)dez.cr;
      $$0.a(dez.n, 5, 20);
      $$0.a(dez.o, 5, 20);
      $$0.a(dez.p, 5, 20);
      $$0.a(dez.q, 5, 20);
      $$0.a(dez.r, 5, 20);
      $$0.a(dez.s, 5, 20);
      $$0.a(dez.t, 5, 20);
      $$0.a(dez.u, 5, 20);
      $$0.a(dez.v, 5, 20);
      $$0.a(dez.w, 5, 20);
      $$0.a(dez.jt, 5, 20);
      $$0.a(dez.ju, 5, 20);
      $$0.a(dez.jv, 5, 20);
      $$0.a(dez.jw, 5, 20);
      $$0.a(dez.jx, 5, 20);
      $$0.a(dez.jy, 5, 20);
      $$0.a(dez.jz, 5, 20);
      $$0.a(dez.jA, 5, 20);
      $$0.a(dez.jB, 5, 20);
      $$0.a(dez.jC, 5, 20);
      $$0.a(dez.fh, 5, 20);
      $$0.a(dez.jV, 5, 20);
      $$0.a(dez.jW, 5, 20);
      $$0.a(dez.jX, 5, 20);
      $$0.a(dez.jY, 5, 20);
      $$0.a(dez.jZ, 5, 20);
      $$0.a(dez.ka, 5, 20);
      $$0.a(dez.kb, 5, 20);
      $$0.a(dez.kc, 5, 20);
      $$0.a(dez.dU, 5, 20);
      $$0.a(dez.kd, 5, 20);
      $$0.a(dez.ke, 5, 20);
      $$0.a(dez.kf, 5, 20);
      $$0.a(dez.kg, 5, 20);
      $$0.a(dez.kh, 5, 20);
      $$0.a(dez.ki, 5, 20);
      $$0.a(dez.kj, 5, 20);
      $$0.a(dez.kk, 5, 20);
      $$0.a(dez.cu, 5, 20);
      $$0.a(dez.fL, 5, 20);
      $$0.a(dez.fK, 5, 20);
      $$0.a(dez.fM, 5, 20);
      $$0.a(dez.hP, 5, 20);
      $$0.a(dez.hQ, 5, 20);
      $$0.a(dez.hR, 5, 20);
      $$0.a(dez.hS, 5, 20);
      $$0.a(dez.hT, 5, 20);
      $$0.a(dez.hU, 5, 20);
      $$0.a(dez.U, 5, 5);
      $$0.a(dez.V, 5, 5);
      $$0.a(dez.W, 5, 5);
      $$0.a(dez.X, 5, 5);
      $$0.a(dez.Y, 5, 5);
      $$0.a(dez.Z, 5, 5);
      $$0.a(dez.aa, 5, 5);
      $$0.a(dez.ab, 5, 5);
      $$0.a(dez.ae, 5, 5);
      $$0.a(dez.al, 5, 5);
      $$0.a(dez.af, 5, 5);
      $$0.a(dez.ag, 5, 5);
      $$0.a(dez.ah, 5, 5);
      $$0.a(dez.ai, 5, 5);
      $$0.a(dez.aj, 5, 5);
      $$0.a(dez.ak, 5, 5);
      $$0.a(dez.am, 5, 5);
      $$0.a(dez.an, 5, 5);
      $$0.a(dez.aw, 5, 5);
      $$0.a(dez.ax, 5, 5);
      $$0.a(dez.ay, 5, 5);
      $$0.a(dez.az, 5, 5);
      $$0.a(dez.aA, 5, 5);
      $$0.a(dez.aB, 5, 5);
      $$0.a(dez.aC, 5, 5);
      $$0.a(dez.aD, 5, 5);
      $$0.a(dez.ao, 5, 5);
      $$0.a(dez.ap, 5, 5);
      $$0.a(dez.aq, 5, 5);
      $$0.a(dez.ar, 5, 5);
      $$0.a(dez.as, 5, 5);
      $$0.a(dez.at, 5, 5);
      $$0.a(dez.au, 5, 5);
      $$0.a(dez.av, 5, 5);
      $$0.a(dez.ac, 5, 20);
      $$0.a(dez.aE, 30, 60);
      $$0.a(dez.aF, 30, 60);
      $$0.a(dez.aG, 30, 60);
      $$0.a(dez.aH, 30, 60);
      $$0.a(dez.aI, 30, 60);
      $$0.a(dez.aJ, 30, 60);
      $$0.a(dez.aK, 30, 60);
      $$0.a(dez.aL, 30, 60);
      $$0.a(dez.cl, 30, 20);
      $$0.a(dez.ck, 15, 100);
      $$0.a(dez.bt, 60, 100);
      $$0.a(dez.bu, 60, 100);
      $$0.a(dez.bv, 60, 100);
      $$0.a(dez.iD, 60, 100);
      $$0.a(dez.iE, 60, 100);
      $$0.a(dez.iF, 60, 100);
      $$0.a(dez.iG, 60, 100);
      $$0.a(dez.iH, 60, 100);
      $$0.a(dez.iI, 60, 100);
      $$0.a(dez.bR, 60, 100);
      $$0.a(dez.bT, 60, 100);
      $$0.a(dez.bU, 60, 100);
      $$0.a(dez.bV, 60, 100);
      $$0.a(dez.bW, 60, 100);
      $$0.a(dez.bX, 60, 100);
      $$0.a(dez.bY, 60, 100);
      $$0.a(dez.bZ, 60, 100);
      $$0.a(dez.ca, 60, 100);
      $$0.a(dez.cb, 60, 100);
      $$0.a(dez.cc, 60, 100);
      $$0.a(dez.ce, 60, 100);
      $$0.a(dez.bS, 60, 100);
      $$0.a(dez.kC, 60, 100);
      $$0.a(dez.cd, 60, 100);
      $$0.a(dez.sB, 60, 100);
      $$0.a(dez.bA, 30, 60);
      $$0.a(dez.bB, 30, 60);
      $$0.a(dez.bC, 30, 60);
      $$0.a(dez.bD, 30, 60);
      $$0.a(dez.bE, 30, 60);
      $$0.a(dez.bF, 30, 60);
      $$0.a(dez.bG, 30, 60);
      $$0.a(dez.bH, 30, 60);
      $$0.a(dez.bI, 30, 60);
      $$0.a(dez.bJ, 30, 60);
      $$0.a(dez.bK, 30, 60);
      $$0.a(dez.bL, 30, 60);
      $$0.a(dez.bM, 30, 60);
      $$0.a(dez.bN, 30, 60);
      $$0.a(dez.bO, 30, 60);
      $$0.a(dez.bP, 30, 60);
      $$0.a(dez.ff, 15, 100);
      $$0.a(dez.iB, 5, 5);
      $$0.a(dez.ij, 60, 20);
      $$0.a(dez.pd, 15, 20);
      $$0.a(dez.ik, 60, 20);
      $$0.a(dez.il, 60, 20);
      $$0.a(dez.im, 60, 20);
      $$0.a(dez.in, 60, 20);
      $$0.a(dez.io, 60, 20);
      $$0.a(dez.ip, 60, 20);
      $$0.a(dez.iq, 60, 20);
      $$0.a(dez.ir, 60, 20);
      $$0.a(dez.is, 60, 20);
      $$0.a(dez.it, 60, 20);
      $$0.a(dez.iu, 60, 20);
      $$0.a(dez.iv, 60, 20);
      $$0.a(dez.iw, 60, 20);
      $$0.a(dez.ix, 60, 20);
      $$0.a(dez.iy, 60, 20);
      $$0.a(dez.iz, 60, 20);
      $$0.a(dez.me, 30, 60);
      $$0.a(dez.mZ, 60, 60);
      $$0.a(dez.nS, 60, 60);
      $$0.a(dez.oa, 30, 20);
      $$0.a(dez.pc, 5, 20);
      $$0.a(dez.oi, 60, 100);
      $$0.a(dez.pf, 5, 20);
      $$0.a(dez.pe, 30, 20);
      $$0.a(dez.aM, 30, 60);
      $$0.a(dez.aN, 30, 60);
      $$0.a(dez.sv, 15, 60);
      $$0.a(dez.sw, 15, 60);
      $$0.a(dez.sx, 60, 100);
      $$0.a(dez.sy, 30, 60);
      $$0.a(dez.sz, 30, 60);
      $$0.a(dez.sD, 60, 100);
      $$0.a(dez.sE, 60, 100);
      $$0.a(dez.sF, 60, 100);
      $$0.a(dez.sG, 30, 60);
      $$0.a(dez.fg, 15, 100);
   }
}
