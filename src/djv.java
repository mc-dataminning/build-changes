import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class djv extends dgi {
   public static final MapCodec<djv> c = b(djv::new);
   public static final int d = 15;
   public static final dva e = duq.aw;
   public static final dur f = dmj.b;
   public static final dur g = dmj.c;
   public static final dur h = dmj.d;
   public static final dur i = dmj.e;
   public static final dur j = dmj.f;
   private static final Map<jj, dur> k = dmj.h.entrySet().stream().filter($$0 -> $$0.getKey() != jj.a).collect(ad.a());
   private static final eyx l = dgv.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eyx m = dgv.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eyx n = dgv.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eyx o = dgv.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eyx F = dgv.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dua, eyx> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<dgv> P = new Object2IntOpenHashMap();
   private final Object2IntMap<dgv> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<djv> a() {
      return c;
   }

   public djv(dtz.d $$0) {
      super($$0, 1.0F);
      this.l(
         this.E
            .b()
            .b(e, Integer.valueOf(0))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
            .b(i, Boolean.valueOf(false))
            .b(j, Boolean.valueOf(false))
      );
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), djv::o)));
   }

   private static eyx o(dua $$0) {
      eyx $$1 = eyu.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = eyu.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = eyu.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = eyu.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = eyu.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : dgx.a.o();
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.G.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dua a(cyw $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dua b(dcx $$0, je $$1) {
      je $$2 = $$1.e();
      dua $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jj.b)) {
         dua $$4 = this.o();

         for (jj $$5 : jj.values()) {
            dur $$6 = k.get($$5);
            if ($$6 != null) {
               $$4 = $$4.b($$6, Boolean.valueOf(this.g($$0.a_($$1.a($$5)))));
            }
         }

         return $$4;
      } else {
         return this.o();
      }
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jj.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.ac().b(ddo.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dua $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.B_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ae() && this.a((dds)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.b(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  je $$8 = $$2.e();
                  if (!$$1.a_($$8).c($$1, $$8, jj.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(awr.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            je.a $$11 = new je.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((ddv)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.am().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ae() || !this.a((dds)$$1, $$11))) {
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

   protected boolean a(dds $$0, je $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dua $$0) {
      return $$0.b(duq.C) && $$0.c(duq.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int r(dua $$0) {
      return $$0.b(duq.C) && $$0.c(duq.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(dds $$0, je $$1, int $$2, azk $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dua $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         dgv $$8 = $$6.b();
         if ($$8 instanceof dpf) {
            dpf.a($$0, $$1);
         }
      }
   }

   private dua a(ddt $$0, je $$1, int $$2) {
      dua $$3 = a($$0, $$1);
      return $$3.a(dgx.cr) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(dcx $$0, je $$1) {
      for (jj $$2 : jj.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(ddv $$0, je $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jj $$3 : jj.values()) {
            dua $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dua $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(azk $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(dgv $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      djv $$0 = (djv)dgx.cr;
      $$0.a(dgx.n, 5, 20);
      $$0.a(dgx.o, 5, 20);
      $$0.a(dgx.p, 5, 20);
      $$0.a(dgx.q, 5, 20);
      $$0.a(dgx.r, 5, 20);
      $$0.a(dgx.s, 5, 20);
      $$0.a(dgx.t, 5, 20);
      $$0.a(dgx.u, 5, 20);
      $$0.a(dgx.v, 5, 20);
      $$0.a(dgx.w, 5, 20);
      $$0.a(dgx.jt, 5, 20);
      $$0.a(dgx.ju, 5, 20);
      $$0.a(dgx.jv, 5, 20);
      $$0.a(dgx.jw, 5, 20);
      $$0.a(dgx.jx, 5, 20);
      $$0.a(dgx.jy, 5, 20);
      $$0.a(dgx.jz, 5, 20);
      $$0.a(dgx.jA, 5, 20);
      $$0.a(dgx.jB, 5, 20);
      $$0.a(dgx.jC, 5, 20);
      $$0.a(dgx.fh, 5, 20);
      $$0.a(dgx.jV, 5, 20);
      $$0.a(dgx.jW, 5, 20);
      $$0.a(dgx.jX, 5, 20);
      $$0.a(dgx.jY, 5, 20);
      $$0.a(dgx.jZ, 5, 20);
      $$0.a(dgx.ka, 5, 20);
      $$0.a(dgx.kb, 5, 20);
      $$0.a(dgx.kc, 5, 20);
      $$0.a(dgx.dU, 5, 20);
      $$0.a(dgx.kd, 5, 20);
      $$0.a(dgx.ke, 5, 20);
      $$0.a(dgx.kf, 5, 20);
      $$0.a(dgx.kg, 5, 20);
      $$0.a(dgx.kh, 5, 20);
      $$0.a(dgx.ki, 5, 20);
      $$0.a(dgx.kj, 5, 20);
      $$0.a(dgx.kk, 5, 20);
      $$0.a(dgx.cu, 5, 20);
      $$0.a(dgx.fL, 5, 20);
      $$0.a(dgx.fK, 5, 20);
      $$0.a(dgx.fM, 5, 20);
      $$0.a(dgx.hP, 5, 20);
      $$0.a(dgx.hQ, 5, 20);
      $$0.a(dgx.hR, 5, 20);
      $$0.a(dgx.hS, 5, 20);
      $$0.a(dgx.hT, 5, 20);
      $$0.a(dgx.hU, 5, 20);
      $$0.a(dgx.U, 5, 5);
      $$0.a(dgx.V, 5, 5);
      $$0.a(dgx.W, 5, 5);
      $$0.a(dgx.X, 5, 5);
      $$0.a(dgx.Y, 5, 5);
      $$0.a(dgx.Z, 5, 5);
      $$0.a(dgx.aa, 5, 5);
      $$0.a(dgx.ab, 5, 5);
      $$0.a(dgx.ae, 5, 5);
      $$0.a(dgx.al, 5, 5);
      $$0.a(dgx.af, 5, 5);
      $$0.a(dgx.ag, 5, 5);
      $$0.a(dgx.ah, 5, 5);
      $$0.a(dgx.ai, 5, 5);
      $$0.a(dgx.aj, 5, 5);
      $$0.a(dgx.ak, 5, 5);
      $$0.a(dgx.am, 5, 5);
      $$0.a(dgx.an, 5, 5);
      $$0.a(dgx.aw, 5, 5);
      $$0.a(dgx.ax, 5, 5);
      $$0.a(dgx.ay, 5, 5);
      $$0.a(dgx.az, 5, 5);
      $$0.a(dgx.aA, 5, 5);
      $$0.a(dgx.aB, 5, 5);
      $$0.a(dgx.aC, 5, 5);
      $$0.a(dgx.aD, 5, 5);
      $$0.a(dgx.ao, 5, 5);
      $$0.a(dgx.ap, 5, 5);
      $$0.a(dgx.aq, 5, 5);
      $$0.a(dgx.ar, 5, 5);
      $$0.a(dgx.as, 5, 5);
      $$0.a(dgx.at, 5, 5);
      $$0.a(dgx.au, 5, 5);
      $$0.a(dgx.av, 5, 5);
      $$0.a(dgx.ac, 5, 20);
      $$0.a(dgx.aE, 30, 60);
      $$0.a(dgx.aF, 30, 60);
      $$0.a(dgx.aG, 30, 60);
      $$0.a(dgx.aH, 30, 60);
      $$0.a(dgx.aI, 30, 60);
      $$0.a(dgx.aJ, 30, 60);
      $$0.a(dgx.aK, 30, 60);
      $$0.a(dgx.aL, 30, 60);
      $$0.a(dgx.cl, 30, 20);
      $$0.a(dgx.ck, 15, 100);
      $$0.a(dgx.bt, 60, 100);
      $$0.a(dgx.bu, 60, 100);
      $$0.a(dgx.bv, 60, 100);
      $$0.a(dgx.iD, 60, 100);
      $$0.a(dgx.iE, 60, 100);
      $$0.a(dgx.iF, 60, 100);
      $$0.a(dgx.iG, 60, 100);
      $$0.a(dgx.iH, 60, 100);
      $$0.a(dgx.iI, 60, 100);
      $$0.a(dgx.bR, 60, 100);
      $$0.a(dgx.bT, 60, 100);
      $$0.a(dgx.bU, 60, 100);
      $$0.a(dgx.bV, 60, 100);
      $$0.a(dgx.bW, 60, 100);
      $$0.a(dgx.bX, 60, 100);
      $$0.a(dgx.bY, 60, 100);
      $$0.a(dgx.bZ, 60, 100);
      $$0.a(dgx.ca, 60, 100);
      $$0.a(dgx.cb, 60, 100);
      $$0.a(dgx.cc, 60, 100);
      $$0.a(dgx.ce, 60, 100);
      $$0.a(dgx.bS, 60, 100);
      $$0.a(dgx.kC, 60, 100);
      $$0.a(dgx.cd, 60, 100);
      $$0.a(dgx.sB, 60, 100);
      $$0.a(dgx.bA, 30, 60);
      $$0.a(dgx.bB, 30, 60);
      $$0.a(dgx.bC, 30, 60);
      $$0.a(dgx.bD, 30, 60);
      $$0.a(dgx.bE, 30, 60);
      $$0.a(dgx.bF, 30, 60);
      $$0.a(dgx.bG, 30, 60);
      $$0.a(dgx.bH, 30, 60);
      $$0.a(dgx.bI, 30, 60);
      $$0.a(dgx.bJ, 30, 60);
      $$0.a(dgx.bK, 30, 60);
      $$0.a(dgx.bL, 30, 60);
      $$0.a(dgx.bM, 30, 60);
      $$0.a(dgx.bN, 30, 60);
      $$0.a(dgx.bO, 30, 60);
      $$0.a(dgx.bP, 30, 60);
      $$0.a(dgx.ff, 15, 100);
      $$0.a(dgx.iB, 5, 5);
      $$0.a(dgx.ij, 60, 20);
      $$0.a(dgx.pd, 15, 20);
      $$0.a(dgx.ik, 60, 20);
      $$0.a(dgx.il, 60, 20);
      $$0.a(dgx.im, 60, 20);
      $$0.a(dgx.in, 60, 20);
      $$0.a(dgx.io, 60, 20);
      $$0.a(dgx.ip, 60, 20);
      $$0.a(dgx.iq, 60, 20);
      $$0.a(dgx.ir, 60, 20);
      $$0.a(dgx.is, 60, 20);
      $$0.a(dgx.it, 60, 20);
      $$0.a(dgx.iu, 60, 20);
      $$0.a(dgx.iv, 60, 20);
      $$0.a(dgx.iw, 60, 20);
      $$0.a(dgx.ix, 60, 20);
      $$0.a(dgx.iy, 60, 20);
      $$0.a(dgx.iz, 60, 20);
      $$0.a(dgx.me, 30, 60);
      $$0.a(dgx.mZ, 60, 60);
      $$0.a(dgx.nS, 60, 60);
      $$0.a(dgx.oa, 30, 20);
      $$0.a(dgx.pc, 5, 20);
      $$0.a(dgx.oi, 60, 100);
      $$0.a(dgx.pf, 5, 20);
      $$0.a(dgx.pe, 30, 20);
      $$0.a(dgx.aM, 30, 60);
      $$0.a(dgx.aN, 30, 60);
      $$0.a(dgx.sv, 15, 60);
      $$0.a(dgx.sw, 15, 60);
      $$0.a(dgx.sx, 60, 100);
      $$0.a(dgx.sy, 30, 60);
      $$0.a(dgx.sz, 30, 60);
      $$0.a(dgx.sD, 60, 100);
      $$0.a(dgx.sE, 60, 100);
      $$0.a(dgx.sF, 60, 100);
      $$0.a(dgx.sG, 30, 60);
      $$0.a(dgx.fg, 15, 100);
   }
}
