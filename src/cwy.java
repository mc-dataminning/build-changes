import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class cwy extends ctn {
   public static final MapCodec<cwy> c = b(cwy::new);
   public static final int d = 15;
   public static final dhb e = dgr.aw;
   public static final dgs f = czm.b;
   public static final dgs g = czm.c;
   public static final dgs h = czm.d;
   public static final dgs i = czm.e;
   public static final dgs j = czm.f;
   private static final Map<hx, dgs> k = czm.h.entrySet().stream().filter($$0 -> $$0.getKey() != hx.a).collect(ac.a());
   private static final eiy l = cua.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eiy m = cua.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eiy n = cua.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eiy o = cua.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eiy F = cua.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dgb, eiy> G;
   private static final int H = 60;
   private static final int I = 30;
   private static final int J = 15;
   private static final int K = 5;
   private static final int L = 100;
   private static final int M = 60;
   private static final int N = 20;
   private static final int O = 5;
   private final Object2IntMap<cua> P = new Object2IntOpenHashMap();
   private final Object2IntMap<cua> Q = new Object2IntOpenHashMap();

   @Override
   public MapCodec<cwy> a() {
      return c;
   }

   public cwy(dga.d $$0) {
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
      this.G = ImmutableMap.copyOf(this.E.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), cwy::h)));
   }

   private static eiy h(dgb $$0) {
      eiy $$1 = eiv.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = eiv.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = eiv.a($$1, F);
      }

      if ($$0.c(g)) {
         $$1 = eiv.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = eiv.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return this.a($$0, $$3, $$4) ? this.a($$3, $$4, $$0.c(e)) : cuc.a.o();
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.G.get($$0.a(e, Integer.valueOf(0)));
   }

   @Override
   public dgb a(cmr $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dgb b(cqf $$0, ht $$1) {
      ht $$2 = $$1.d();
      dgb $$3 = $$0.a_($$2);
      if (!this.f($$3) && !$$3.d($$0, $$2, hx.b)) {
         dgb $$4 = this.o();

         for (hx $$5 : hx.values()) {
            dgs $$6 = k.get($$5);
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
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      ht $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hx.b) || this.d($$1, $$2);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      $$1.a($$2, this, a($$1.z));
      if ($$1.X().b(cqv.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dgb $$4 = $$1.a_($$2.d());
         boolean $$5 = $$4.a($$1.D_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.Z() && this.a((cqz)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
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

            boolean $$9 = $$1.s($$2).a(aqr.ac);
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
                        int $$16 = this.a((crc)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ai().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.Z() || !this.a((cqz)$$1, $$11))) {
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

   protected boolean a(cqz $$0, ht $$1) {
      return $$0.q($$1) || $$0.q($$1.g()) || $$0.q($$1.h()) || $$0.q($$1.e()) || $$0.q($$1.f());
   }

   private int n(dgb $$0) {
      return $$0.b(dgr.C) && $$0.c(dgr.C) ? 0 : this.Q.getInt($$0.b());
   }

   private int o(dgb $$0) {
      return $$0.b(dgr.C) && $$0.c(dgr.C) ? 0 : this.P.getInt($$0.b());
   }

   private void a(cqz $$0, ht $$1, int $$2, ate $$3, int $$4) {
      int $$5 = this.n($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dgb $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.q($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         cua $$8 = $$6.b();
         if ($$8 instanceof dch) {
            dch.a($$0, $$1);
         }
      }
   }

   private dgb a(cra $$0, ht $$1, int $$2) {
      dgb $$3 = a($$0, $$1);
      return $$3.a(cuc.cr) ? $$3.a(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(cqf $$0, ht $$1) {
      for (hx $$2 : hx.values()) {
         if (this.f($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(crc $$0, ht $$1) {
      if (!$$0.t($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (hx $$3 : hx.values()) {
            dgb $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.o($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean f(dgb $$0) {
      return this.o($$0) > 0;
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.z));
   }

   private static int a(ate $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(cua $$0, int $$1, int $$2) {
      this.P.put($$0, $$1);
      this.Q.put($$0, $$2);
   }

   public static void b() {
      cwy $$0 = (cwy)cuc.cr;
      $$0.a(cuc.n, 5, 20);
      $$0.a(cuc.o, 5, 20);
      $$0.a(cuc.p, 5, 20);
      $$0.a(cuc.q, 5, 20);
      $$0.a(cuc.r, 5, 20);
      $$0.a(cuc.s, 5, 20);
      $$0.a(cuc.t, 5, 20);
      $$0.a(cuc.u, 5, 20);
      $$0.a(cuc.v, 5, 20);
      $$0.a(cuc.w, 5, 20);
      $$0.a(cuc.jt, 5, 20);
      $$0.a(cuc.ju, 5, 20);
      $$0.a(cuc.jv, 5, 20);
      $$0.a(cuc.jw, 5, 20);
      $$0.a(cuc.jx, 5, 20);
      $$0.a(cuc.jy, 5, 20);
      $$0.a(cuc.jz, 5, 20);
      $$0.a(cuc.jA, 5, 20);
      $$0.a(cuc.jB, 5, 20);
      $$0.a(cuc.jC, 5, 20);
      $$0.a(cuc.fh, 5, 20);
      $$0.a(cuc.jV, 5, 20);
      $$0.a(cuc.jW, 5, 20);
      $$0.a(cuc.jX, 5, 20);
      $$0.a(cuc.jY, 5, 20);
      $$0.a(cuc.jZ, 5, 20);
      $$0.a(cuc.ka, 5, 20);
      $$0.a(cuc.kb, 5, 20);
      $$0.a(cuc.kc, 5, 20);
      $$0.a(cuc.dU, 5, 20);
      $$0.a(cuc.kd, 5, 20);
      $$0.a(cuc.ke, 5, 20);
      $$0.a(cuc.kf, 5, 20);
      $$0.a(cuc.kg, 5, 20);
      $$0.a(cuc.kh, 5, 20);
      $$0.a(cuc.ki, 5, 20);
      $$0.a(cuc.kj, 5, 20);
      $$0.a(cuc.kk, 5, 20);
      $$0.a(cuc.cu, 5, 20);
      $$0.a(cuc.fL, 5, 20);
      $$0.a(cuc.fK, 5, 20);
      $$0.a(cuc.fM, 5, 20);
      $$0.a(cuc.hP, 5, 20);
      $$0.a(cuc.hQ, 5, 20);
      $$0.a(cuc.hR, 5, 20);
      $$0.a(cuc.hS, 5, 20);
      $$0.a(cuc.hT, 5, 20);
      $$0.a(cuc.hU, 5, 20);
      $$0.a(cuc.U, 5, 5);
      $$0.a(cuc.V, 5, 5);
      $$0.a(cuc.W, 5, 5);
      $$0.a(cuc.X, 5, 5);
      $$0.a(cuc.Y, 5, 5);
      $$0.a(cuc.Z, 5, 5);
      $$0.a(cuc.aa, 5, 5);
      $$0.a(cuc.ab, 5, 5);
      $$0.a(cuc.ae, 5, 5);
      $$0.a(cuc.al, 5, 5);
      $$0.a(cuc.af, 5, 5);
      $$0.a(cuc.ag, 5, 5);
      $$0.a(cuc.ah, 5, 5);
      $$0.a(cuc.ai, 5, 5);
      $$0.a(cuc.aj, 5, 5);
      $$0.a(cuc.ak, 5, 5);
      $$0.a(cuc.am, 5, 5);
      $$0.a(cuc.an, 5, 5);
      $$0.a(cuc.aw, 5, 5);
      $$0.a(cuc.ax, 5, 5);
      $$0.a(cuc.ay, 5, 5);
      $$0.a(cuc.az, 5, 5);
      $$0.a(cuc.aA, 5, 5);
      $$0.a(cuc.aB, 5, 5);
      $$0.a(cuc.aC, 5, 5);
      $$0.a(cuc.aD, 5, 5);
      $$0.a(cuc.ao, 5, 5);
      $$0.a(cuc.ap, 5, 5);
      $$0.a(cuc.aq, 5, 5);
      $$0.a(cuc.ar, 5, 5);
      $$0.a(cuc.as, 5, 5);
      $$0.a(cuc.at, 5, 5);
      $$0.a(cuc.au, 5, 5);
      $$0.a(cuc.av, 5, 5);
      $$0.a(cuc.ac, 5, 20);
      $$0.a(cuc.aE, 30, 60);
      $$0.a(cuc.aF, 30, 60);
      $$0.a(cuc.aG, 30, 60);
      $$0.a(cuc.aH, 30, 60);
      $$0.a(cuc.aI, 30, 60);
      $$0.a(cuc.aJ, 30, 60);
      $$0.a(cuc.aK, 30, 60);
      $$0.a(cuc.aL, 30, 60);
      $$0.a(cuc.cl, 30, 20);
      $$0.a(cuc.ck, 15, 100);
      $$0.a(cuc.bt, 60, 100);
      $$0.a(cuc.bu, 60, 100);
      $$0.a(cuc.bv, 60, 100);
      $$0.a(cuc.iD, 60, 100);
      $$0.a(cuc.iE, 60, 100);
      $$0.a(cuc.iF, 60, 100);
      $$0.a(cuc.iG, 60, 100);
      $$0.a(cuc.iH, 60, 100);
      $$0.a(cuc.iI, 60, 100);
      $$0.a(cuc.bR, 60, 100);
      $$0.a(cuc.bT, 60, 100);
      $$0.a(cuc.bU, 60, 100);
      $$0.a(cuc.bV, 60, 100);
      $$0.a(cuc.bW, 60, 100);
      $$0.a(cuc.bX, 60, 100);
      $$0.a(cuc.bY, 60, 100);
      $$0.a(cuc.bZ, 60, 100);
      $$0.a(cuc.ca, 60, 100);
      $$0.a(cuc.cb, 60, 100);
      $$0.a(cuc.cc, 60, 100);
      $$0.a(cuc.ce, 60, 100);
      $$0.a(cuc.bS, 60, 100);
      $$0.a(cuc.kC, 60, 100);
      $$0.a(cuc.cd, 60, 100);
      $$0.a(cuc.rA, 60, 100);
      $$0.a(cuc.bA, 30, 60);
      $$0.a(cuc.bB, 30, 60);
      $$0.a(cuc.bC, 30, 60);
      $$0.a(cuc.bD, 30, 60);
      $$0.a(cuc.bE, 30, 60);
      $$0.a(cuc.bF, 30, 60);
      $$0.a(cuc.bG, 30, 60);
      $$0.a(cuc.bH, 30, 60);
      $$0.a(cuc.bI, 30, 60);
      $$0.a(cuc.bJ, 30, 60);
      $$0.a(cuc.bK, 30, 60);
      $$0.a(cuc.bL, 30, 60);
      $$0.a(cuc.bM, 30, 60);
      $$0.a(cuc.bN, 30, 60);
      $$0.a(cuc.bO, 30, 60);
      $$0.a(cuc.bP, 30, 60);
      $$0.a(cuc.ff, 15, 100);
      $$0.a(cuc.iB, 5, 5);
      $$0.a(cuc.ij, 60, 20);
      $$0.a(cuc.pd, 15, 20);
      $$0.a(cuc.ik, 60, 20);
      $$0.a(cuc.il, 60, 20);
      $$0.a(cuc.im, 60, 20);
      $$0.a(cuc.in, 60, 20);
      $$0.a(cuc.io, 60, 20);
      $$0.a(cuc.ip, 60, 20);
      $$0.a(cuc.iq, 60, 20);
      $$0.a(cuc.ir, 60, 20);
      $$0.a(cuc.is, 60, 20);
      $$0.a(cuc.it, 60, 20);
      $$0.a(cuc.iu, 60, 20);
      $$0.a(cuc.iv, 60, 20);
      $$0.a(cuc.iw, 60, 20);
      $$0.a(cuc.ix, 60, 20);
      $$0.a(cuc.iy, 60, 20);
      $$0.a(cuc.iz, 60, 20);
      $$0.a(cuc.me, 30, 60);
      $$0.a(cuc.mZ, 60, 60);
      $$0.a(cuc.nS, 60, 60);
      $$0.a(cuc.oa, 30, 20);
      $$0.a(cuc.pc, 5, 20);
      $$0.a(cuc.oi, 60, 100);
      $$0.a(cuc.pf, 5, 20);
      $$0.a(cuc.pe, 30, 20);
      $$0.a(cuc.aM, 30, 60);
      $$0.a(cuc.aN, 30, 60);
      $$0.a(cuc.ru, 15, 60);
      $$0.a(cuc.rv, 15, 60);
      $$0.a(cuc.rw, 60, 100);
      $$0.a(cuc.rx, 30, 60);
      $$0.a(cuc.ry, 30, 60);
      $$0.a(cuc.rC, 60, 100);
      $$0.a(cuc.rD, 60, 100);
      $$0.a(cuc.rE, 60, 100);
      $$0.a(cuc.rF, 30, 60);
      $$0.a(cuc.fg, 15, 100);
   }
}
