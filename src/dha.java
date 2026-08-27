import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dha extends ddn {
   public static final MapCodec<dha> c = b(dha::new);
   public static final int d = 15;
   public static final dsd e = drt.aw;
   public static final dru f = djo.b;
   public static final dru g = djo.c;
   public static final dru h = djo.d;
   public static final dru i = djo.e;
   public static final dru j = djo.f;
   private static final Map<it, dru> k = djo.h.entrySet().stream().filter($$0 -> $$0.getKey() != it.a).collect(ac.a());
   private static final evf l = dea.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final evf m = dea.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final evf n = dea.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final evf o = dea.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final evf F = dea.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<drd, evf> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dea> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dea> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dha> a() {
      return c;
   }

   public dha(drc.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dha::m)));
   }

   private static evf m(drd $$0) {
      evf $$1 = evc.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = evc.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = evc.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = evc.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = evc.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dec.a.n();
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public drd a(cxb $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected drd b(daf $$0, io $$1) {
      io $$2 = $$1.d();
      drd $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, it.b)) {
         drd $$4 = this.n();

         for (it $$5 : it.values()) {
            dru $$6 = k.get($$5);
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
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, it.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.aa().b(dav.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         drd $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ac() && this.a((daz)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.t($$2).a(avw.ad);
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
                        int $$16 = this.a((dbc)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ac() || !this.a((daz)$$1, $$11))) {
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

   protected boolean a(daz $$0, io $$1) {
      return $$0.r($$1) || $$0.r($$1.g()) || $$0.r($$1.h()) || $$0.r($$1.e()) || $$0.r($$1.f());
   }

   private int n(drd $$0) {
      return $$0.b(drt.C) && $$0.c(drt.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(drd $$0) {
      return $$0.b(drt.C) && $$0.c(drt.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(daz $$0, io $$1, int $$2, aym $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         drd $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dea $$8 = $$6.b();
         if ($$8 instanceof dmj) {
            dmj.a($$0, $$1);
         }
      }
   }

   private drd a(dba $$0, io $$1, int $$2) {
      drd $$3 = a($$0, $$1);
      return $$3.a(dec.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(daf $$0, io $$1) {
      for (it $$2 : it.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dbc $$0, io $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (it $$3 : it.values()) {
            drd $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(drd $$0) {
      return this.o($$0) > 0;
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(aym $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dea $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      dha $$0 = (dha)dec.cr;
      $$0.a(dec.n, 5, 20);
      $$0.a(dec.o, 5, 20);
      $$0.a(dec.p, 5, 20);
      $$0.a(dec.q, 5, 20);
      $$0.a(dec.r, 5, 20);
      $$0.a(dec.s, 5, 20);
      $$0.a(dec.t, 5, 20);
      $$0.a(dec.u, 5, 20);
      $$0.a(dec.v, 5, 20);
      $$0.a(dec.w, 5, 20);
      $$0.a(dec.jt, 5, 20);
      $$0.a(dec.ju, 5, 20);
      $$0.a(dec.jv, 5, 20);
      $$0.a(dec.jw, 5, 20);
      $$0.a(dec.jx, 5, 20);
      $$0.a(dec.jy, 5, 20);
      $$0.a(dec.jz, 5, 20);
      $$0.a(dec.jA, 5, 20);
      $$0.a(dec.jB, 5, 20);
      $$0.a(dec.jC, 5, 20);
      $$0.a(dec.fh, 5, 20);
      $$0.a(dec.jV, 5, 20);
      $$0.a(dec.jW, 5, 20);
      $$0.a(dec.jX, 5, 20);
      $$0.a(dec.jY, 5, 20);
      $$0.a(dec.jZ, 5, 20);
      $$0.a(dec.ka, 5, 20);
      $$0.a(dec.kb, 5, 20);
      $$0.a(dec.kc, 5, 20);
      $$0.a(dec.dU, 5, 20);
      $$0.a(dec.kd, 5, 20);
      $$0.a(dec.ke, 5, 20);
      $$0.a(dec.kf, 5, 20);
      $$0.a(dec.kg, 5, 20);
      $$0.a(dec.kh, 5, 20);
      $$0.a(dec.ki, 5, 20);
      $$0.a(dec.kj, 5, 20);
      $$0.a(dec.kk, 5, 20);
      $$0.a(dec.cu, 5, 20);
      $$0.a(dec.fL, 5, 20);
      $$0.a(dec.fK, 5, 20);
      $$0.a(dec.fM, 5, 20);
      $$0.a(dec.hP, 5, 20);
      $$0.a(dec.hQ, 5, 20);
      $$0.a(dec.hR, 5, 20);
      $$0.a(dec.hS, 5, 20);
      $$0.a(dec.hT, 5, 20);
      $$0.a(dec.hU, 5, 20);
      $$0.a(dec.U, 5, 5);
      $$0.a(dec.V, 5, 5);
      $$0.a(dec.W, 5, 5);
      $$0.a(dec.X, 5, 5);
      $$0.a(dec.Y, 5, 5);
      $$0.a(dec.Z, 5, 5);
      $$0.a(dec.aa, 5, 5);
      $$0.a(dec.ab, 5, 5);
      $$0.a(dec.ae, 5, 5);
      $$0.a(dec.al, 5, 5);
      $$0.a(dec.af, 5, 5);
      $$0.a(dec.ag, 5, 5);
      $$0.a(dec.ah, 5, 5);
      $$0.a(dec.ai, 5, 5);
      $$0.a(dec.aj, 5, 5);
      $$0.a(dec.ak, 5, 5);
      $$0.a(dec.am, 5, 5);
      $$0.a(dec.an, 5, 5);
      $$0.a(dec.aw, 5, 5);
      $$0.a(dec.ax, 5, 5);
      $$0.a(dec.ay, 5, 5);
      $$0.a(dec.az, 5, 5);
      $$0.a(dec.aA, 5, 5);
      $$0.a(dec.aB, 5, 5);
      $$0.a(dec.aC, 5, 5);
      $$0.a(dec.aD, 5, 5);
      $$0.a(dec.ao, 5, 5);
      $$0.a(dec.ap, 5, 5);
      $$0.a(dec.aq, 5, 5);
      $$0.a(dec.ar, 5, 5);
      $$0.a(dec.as, 5, 5);
      $$0.a(dec.at, 5, 5);
      $$0.a(dec.au, 5, 5);
      $$0.a(dec.av, 5, 5);
      $$0.a(dec.ac, 5, 20);
      $$0.a(dec.aE, 30, 60);
      $$0.a(dec.aF, 30, 60);
      $$0.a(dec.aG, 30, 60);
      $$0.a(dec.aH, 30, 60);
      $$0.a(dec.aI, 30, 60);
      $$0.a(dec.aJ, 30, 60);
      $$0.a(dec.aK, 30, 60);
      $$0.a(dec.aL, 30, 60);
      $$0.a(dec.cl, 30, 20);
      $$0.a(dec.ck, 15, 100);
      $$0.a(dec.bt, 60, 100);
      $$0.a(dec.bu, 60, 100);
      $$0.a(dec.bv, 60, 100);
      $$0.a(dec.iD, 60, 100);
      $$0.a(dec.iE, 60, 100);
      $$0.a(dec.iF, 60, 100);
      $$0.a(dec.iG, 60, 100);
      $$0.a(dec.iH, 60, 100);
      $$0.a(dec.iI, 60, 100);
      $$0.a(dec.bR, 60, 100);
      $$0.a(dec.bT, 60, 100);
      $$0.a(dec.bU, 60, 100);
      $$0.a(dec.bV, 60, 100);
      $$0.a(dec.bW, 60, 100);
      $$0.a(dec.bX, 60, 100);
      $$0.a(dec.bY, 60, 100);
      $$0.a(dec.bZ, 60, 100);
      $$0.a(dec.ca, 60, 100);
      $$0.a(dec.cb, 60, 100);
      $$0.a(dec.cc, 60, 100);
      $$0.a(dec.ce, 60, 100);
      $$0.a(dec.bS, 60, 100);
      $$0.a(dec.kC, 60, 100);
      $$0.a(dec.cd, 60, 100);
      $$0.a(dec.sB, 60, 100);
      $$0.a(dec.bA, 30, 60);
      $$0.a(dec.bB, 30, 60);
      $$0.a(dec.bC, 30, 60);
      $$0.a(dec.bD, 30, 60);
      $$0.a(dec.bE, 30, 60);
      $$0.a(dec.bF, 30, 60);
      $$0.a(dec.bG, 30, 60);
      $$0.a(dec.bH, 30, 60);
      $$0.a(dec.bI, 30, 60);
      $$0.a(dec.bJ, 30, 60);
      $$0.a(dec.bK, 30, 60);
      $$0.a(dec.bL, 30, 60);
      $$0.a(dec.bM, 30, 60);
      $$0.a(dec.bN, 30, 60);
      $$0.a(dec.bO, 30, 60);
      $$0.a(dec.bP, 30, 60);
      $$0.a(dec.ff, 15, 100);
      $$0.a(dec.iB, 5, 5);
      $$0.a(dec.ij, 60, 20);
      $$0.a(dec.pd, 15, 20);
      $$0.a(dec.ik, 60, 20);
      $$0.a(dec.il, 60, 20);
      $$0.a(dec.im, 60, 20);
      $$0.a(dec.in, 60, 20);
      $$0.a(dec.io, 60, 20);
      $$0.a(dec.ip, 60, 20);
      $$0.a(dec.iq, 60, 20);
      $$0.a(dec.ir, 60, 20);
      $$0.a(dec.is, 60, 20);
      $$0.a(dec.it, 60, 20);
      $$0.a(dec.iu, 60, 20);
      $$0.a(dec.iv, 60, 20);
      $$0.a(dec.iw, 60, 20);
      $$0.a(dec.ix, 60, 20);
      $$0.a(dec.iy, 60, 20);
      $$0.a(dec.iz, 60, 20);
      $$0.a(dec.me, 30, 60);
      $$0.a(dec.mZ, 60, 60);
      $$0.a(dec.nS, 60, 60);
      $$0.a(dec.oa, 30, 20);
      $$0.a(dec.pc, 5, 20);
      $$0.a(dec.oi, 60, 100);
      $$0.a(dec.pf, 5, 20);
      $$0.a(dec.pe, 30, 20);
      $$0.a(dec.aM, 30, 60);
      $$0.a(dec.aN, 30, 60);
      $$0.a(dec.sv, 15, 60);
      $$0.a(dec.sw, 15, 60);
      $$0.a(dec.sx, 60, 100);
      $$0.a(dec.sy, 30, 60);
      $$0.a(dec.sz, 30, 60);
      $$0.a(dec.sD, 60, 100);
      $$0.a(dec.sE, 60, 100);
      $$0.a(dec.sF, 60, 100);
      $$0.a(dec.sG, 30, 60);
      $$0.a(dec.fg, 15, 100);
   }
}
