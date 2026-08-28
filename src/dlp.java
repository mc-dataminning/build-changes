import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dlp extends did {
   public static final MapCodec<dlp> c = b(dlp::new);
   public static final int d = 15;
   public static final dwu e = dwl.aw;
   public static final dwm f = dod.b;
   public static final dwm g = dod.c;
   public static final dwm h = dod.d;
   public static final dwm i = dod.e;
   public static final dwm j = dod.f;
   private static final Map<jm, dwm> k = dod.h.entrySet().stream().filter($$0 -> $$0.getKey() != jm.a).collect(ae.a());
   private static final fas l = diq.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final fas m = diq.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fas n = diq.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fas o = diq.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fas G = diq.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<dvv, fas> H;
   private static final int I = 60;
   private static final int J = 30;
   private static final int K = 15;
   private static final int L = 5;
   private static final int M = 100;
   private static final int N = 60;
   private static final int O = 20;
   private static final int P = 5;
   private final Object2IntMap<diq> Q = new Object2IntOpenHashMap();
   private final Object2IntMap<diq> R = new Object2IntOpenHashMap();

   @Override
   public MapCodec<dlp> a() {
      return c;
   }

   public dlp(dvu.d $$0) {
      super($$0, 1.0F);
      this.l(
         this.F
            .b()
            .b(e, Integer.valueOf(0))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
            .b(i, Boolean.valueOf(false))
            .b(j, Boolean.valueOf(false))
      );
      this.H = ImmutableMap.copyOf(this.F.a().stream().filter($$0x -> $$0x.c(e) == 0).collect(Collectors.toMap(Function.identity(), dlp::o)));
   }

   private static fas o(dvv $$0) {
      fas $$1 = fap.a();
      if ($$0.c(j)) {
         $$1 = l;
      }

      if ($$0.c(f)) {
         $$1 = fap.a($$1, o);
      }

      if ($$0.c(h)) {
         $$1 = fap.a($$1, G);
      }

      if ($$0.c(g)) {
         $$1 = fap.a($$1, n);
      }

      if ($$0.c(i)) {
         $$1 = fap.a($$1, m);
      }

      return $$1.c() ? b : $$1;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return this.a($$0, $$1, $$3) ? this.a($$1, $$3, $$0.c(e)) : dis.a.m();
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.H.get($$0.b(e, Integer.valueOf(0)));
   }

   @Override
   public dvv a(dad $$0) {
      return this.b($$0.q(), $$0.a());
   }

   protected dvv b(der $$0, jh $$1) {
      jh $$2 = $$1.e();
      dvv $$3 = $$0.a_($$2);
      if (!this.g($$3) && !$$3.c($$0, $$2, jm.b)) {
         dvv $$4 = this.m();

         for (jm $$5 : jm.values()) {
            dwm $$6 = k.get($$5);
            if ($$6 != null) {
               $$4 = $$4.b($$6, Boolean.valueOf(this.g($$0.a_($$1.a($$5)))));
            }
         }

         return $$4;
      } else {
         return this.m();
      }
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jh $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jm.b) || this.d($$1, $$2);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      $$1.a($$2, this, a($$1.A));
      if ($$1.N().b(dfi.b)) {
         if (!$$0.a($$1, $$2)) {
            $$1.a($$2, false);
         }

         dvv $$4 = $$1.a_($$2.e());
         boolean $$5 = $$4.a($$1.F_().q());
         int $$6 = $$0.c(e);
         if (!$$5 && $$1.ae() && this.a((dfm)$$1, $$2) && $$3.i() < 0.2F + (float)$$6 * 0.03F) {
            $$1.a($$2, false);
         } else {
            int $$7 = Math.min(15, $$6 + $$3.a(3) / 2);
            if ($$6 != $$7) {
               $$0 = $$0.b(e, Integer.valueOf($$7));
               $$1.a($$2, $$0, 4);
            }

            if (!$$5) {
               if (!this.d($$1, $$2)) {
                  jh $$8 = $$2.e();
                  if (!$$1.a_($$8).c($$1, $$8, jm.b) || $$6 > 3) {
                     $$1.a($$2, false);
                  }

                  return;
               }

               if ($$6 == 15 && $$3.a(4) == 0 && !this.g($$1.a_($$2.e()))) {
                  $$1.a($$2, false);
                  return;
               }
            }

            boolean $$9 = $$1.t($$2).a(axb.ad);
            int $$10 = $$9 ? -50 : 0;
            this.a($$1, $$2.i(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.h(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.e(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.d(), 250 + $$10, $$3, $$6);
            this.a($$1, $$2.f(), 300 + $$10, $$3, $$6);
            this.a($$1, $$2.g(), 300 + $$10, $$3, $$6);
            jh.a $$11 = new jh.a();

            for (int $$12 = -1; $$12 <= 1; $$12++) {
               for (int $$13 = -1; $$13 <= 1; $$13++) {
                  for (int $$14 = -1; $$14 <= 4; $$14++) {
                     if ($$12 != 0 || $$14 != 0 || $$13 != 0) {
                        int $$15 = 100;
                        if ($$14 > 1) {
                           $$15 += ($$14 - 1) * 100;
                        }

                        $$11.a($$2, $$12, $$14, $$13);
                        int $$16 = this.a((dfp)$$1, $$11);
                        if ($$16 > 0) {
                           int $$17 = ($$16 + 40 + $$1.ak().a() * 7) / ($$6 + 30);
                           if ($$9) {
                              $$17 /= 2;
                           }

                           if ($$17 > 0 && $$3.a($$15) <= $$17 && (!$$1.ae() || !this.a((dfm)$$1, $$11))) {
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

   protected boolean a(dfm $$0, jh $$1) {
      return $$0.r($$1) || $$0.r($$1.h()) || $$0.r($$1.i()) || $$0.r($$1.f()) || $$0.r($$1.g());
   }

   private int q(dvv $$0) {
      return $$0.b(dwl.C) && $$0.c(dwl.C) ? 0 : this.R.getInt($$0.b());
   }

   private int r(dvv $$0) {
      return $$0.b(dwl.C) && $$0.c(dwl.C) ? 0 : this.Q.getInt($$0.b());
   }

   private void a(dfm $$0, jh $$1, int $$2, azu $$3, int $$4) {
      int $$5 = this.q($$0.a_($$1));
      if ($$3.a($$2) < $$5) {
         dvv $$6 = $$0.a_($$1);
         if ($$3.a($$4 + 10) < 5 && !$$0.r($$1)) {
            int $$7 = Math.min($$4 + $$3.a(5) / 4, 15);
            $$0.a($$1, this.a($$0, $$1, $$7), 3);
         } else {
            $$0.a($$1, false);
         }

         diq $$8 = $$6.b();
         if ($$8 instanceof dqz) {
            dqz.a($$0, $$1);
         }
      }
   }

   private dvv a(dfp $$0, jh $$1, int $$2) {
      dvv $$3 = a((der)$$0, $$1);
      return $$3.a(dis.cr) ? $$3.b(e, Integer.valueOf($$2)) : $$3;
   }

   private boolean d(der $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         if (this.g($$0.a_($$1.a($$2)))) {
            return true;
         }
      }

      return false;
   }

   private int a(dfp $$0, jh $$1) {
      if (!$$0.u($$1)) {
         return 0;
      } else {
         int $$2 = 0;

         for (jm $$3 : jm.values()) {
            dvv $$4 = $$0.a_($$1.a($$3));
            $$2 = Math.max(this.r($$4), $$2);
         }

         return $$2;
      }
   }

   @Override
   protected boolean g(dvv $$0) {
      return this.r($$0) > 0;
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      super.b($$0, $$1, $$2, $$3, $$4);
      $$1.a($$2, this, a($$1.A));
   }

   private static int a(azu $$0) {
      return 30 + $$0.a(10);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(e, f, g, h, i, j);
   }

   public void a(diq $$0, int $$1, int $$2) {
      this.Q.put($$0, $$1);
      this.R.put($$0, $$2);
   }

   public static void b() {
      dlp $$0 = (dlp)dis.cr;
      $$0.a(dis.n, 5, 20);
      $$0.a(dis.o, 5, 20);
      $$0.a(dis.p, 5, 20);
      $$0.a(dis.q, 5, 20);
      $$0.a(dis.r, 5, 20);
      $$0.a(dis.s, 5, 20);
      $$0.a(dis.t, 5, 20);
      $$0.a(dis.u, 5, 20);
      $$0.a(dis.v, 5, 20);
      $$0.a(dis.w, 5, 20);
      $$0.a(dis.jt, 5, 20);
      $$0.a(dis.ju, 5, 20);
      $$0.a(dis.jv, 5, 20);
      $$0.a(dis.jw, 5, 20);
      $$0.a(dis.jx, 5, 20);
      $$0.a(dis.jy, 5, 20);
      $$0.a(dis.jz, 5, 20);
      $$0.a(dis.jA, 5, 20);
      $$0.a(dis.jB, 5, 20);
      $$0.a(dis.jC, 5, 20);
      $$0.a(dis.fh, 5, 20);
      $$0.a(dis.jV, 5, 20);
      $$0.a(dis.jW, 5, 20);
      $$0.a(dis.jX, 5, 20);
      $$0.a(dis.jY, 5, 20);
      $$0.a(dis.jZ, 5, 20);
      $$0.a(dis.ka, 5, 20);
      $$0.a(dis.kb, 5, 20);
      $$0.a(dis.kc, 5, 20);
      $$0.a(dis.dU, 5, 20);
      $$0.a(dis.kd, 5, 20);
      $$0.a(dis.ke, 5, 20);
      $$0.a(dis.kf, 5, 20);
      $$0.a(dis.kg, 5, 20);
      $$0.a(dis.kh, 5, 20);
      $$0.a(dis.ki, 5, 20);
      $$0.a(dis.kj, 5, 20);
      $$0.a(dis.kk, 5, 20);
      $$0.a(dis.cu, 5, 20);
      $$0.a(dis.fL, 5, 20);
      $$0.a(dis.fK, 5, 20);
      $$0.a(dis.fM, 5, 20);
      $$0.a(dis.hP, 5, 20);
      $$0.a(dis.hQ, 5, 20);
      $$0.a(dis.hR, 5, 20);
      $$0.a(dis.hS, 5, 20);
      $$0.a(dis.hT, 5, 20);
      $$0.a(dis.hU, 5, 20);
      $$0.a(dis.U, 5, 5);
      $$0.a(dis.V, 5, 5);
      $$0.a(dis.W, 5, 5);
      $$0.a(dis.X, 5, 5);
      $$0.a(dis.Y, 5, 5);
      $$0.a(dis.Z, 5, 5);
      $$0.a(dis.aa, 5, 5);
      $$0.a(dis.ab, 5, 5);
      $$0.a(dis.ae, 5, 5);
      $$0.a(dis.al, 5, 5);
      $$0.a(dis.af, 5, 5);
      $$0.a(dis.ag, 5, 5);
      $$0.a(dis.ah, 5, 5);
      $$0.a(dis.ai, 5, 5);
      $$0.a(dis.aj, 5, 5);
      $$0.a(dis.ak, 5, 5);
      $$0.a(dis.am, 5, 5);
      $$0.a(dis.an, 5, 5);
      $$0.a(dis.aw, 5, 5);
      $$0.a(dis.ax, 5, 5);
      $$0.a(dis.ay, 5, 5);
      $$0.a(dis.az, 5, 5);
      $$0.a(dis.aA, 5, 5);
      $$0.a(dis.aB, 5, 5);
      $$0.a(dis.aC, 5, 5);
      $$0.a(dis.aD, 5, 5);
      $$0.a(dis.ao, 5, 5);
      $$0.a(dis.ap, 5, 5);
      $$0.a(dis.aq, 5, 5);
      $$0.a(dis.ar, 5, 5);
      $$0.a(dis.as, 5, 5);
      $$0.a(dis.at, 5, 5);
      $$0.a(dis.au, 5, 5);
      $$0.a(dis.av, 5, 5);
      $$0.a(dis.ac, 5, 20);
      $$0.a(dis.aE, 30, 60);
      $$0.a(dis.aF, 30, 60);
      $$0.a(dis.aG, 30, 60);
      $$0.a(dis.aH, 30, 60);
      $$0.a(dis.aI, 30, 60);
      $$0.a(dis.aJ, 30, 60);
      $$0.a(dis.aK, 30, 60);
      $$0.a(dis.aL, 30, 60);
      $$0.a(dis.cl, 30, 20);
      $$0.a(dis.ck, 15, 100);
      $$0.a(dis.bt, 60, 100);
      $$0.a(dis.bu, 60, 100);
      $$0.a(dis.bv, 60, 100);
      $$0.a(dis.iD, 60, 100);
      $$0.a(dis.iE, 60, 100);
      $$0.a(dis.iF, 60, 100);
      $$0.a(dis.iG, 60, 100);
      $$0.a(dis.iH, 60, 100);
      $$0.a(dis.iI, 60, 100);
      $$0.a(dis.bR, 60, 100);
      $$0.a(dis.bT, 60, 100);
      $$0.a(dis.bU, 60, 100);
      $$0.a(dis.bV, 60, 100);
      $$0.a(dis.bW, 60, 100);
      $$0.a(dis.bX, 60, 100);
      $$0.a(dis.bY, 60, 100);
      $$0.a(dis.bZ, 60, 100);
      $$0.a(dis.ca, 60, 100);
      $$0.a(dis.cb, 60, 100);
      $$0.a(dis.cc, 60, 100);
      $$0.a(dis.ce, 60, 100);
      $$0.a(dis.bS, 60, 100);
      $$0.a(dis.kC, 60, 100);
      $$0.a(dis.cd, 60, 100);
      $$0.a(dis.sB, 60, 100);
      $$0.a(dis.bA, 30, 60);
      $$0.a(dis.bB, 30, 60);
      $$0.a(dis.bC, 30, 60);
      $$0.a(dis.bD, 30, 60);
      $$0.a(dis.bE, 30, 60);
      $$0.a(dis.bF, 30, 60);
      $$0.a(dis.bG, 30, 60);
      $$0.a(dis.bH, 30, 60);
      $$0.a(dis.bI, 30, 60);
      $$0.a(dis.bJ, 30, 60);
      $$0.a(dis.bK, 30, 60);
      $$0.a(dis.bL, 30, 60);
      $$0.a(dis.bM, 30, 60);
      $$0.a(dis.bN, 30, 60);
      $$0.a(dis.bO, 30, 60);
      $$0.a(dis.bP, 30, 60);
      $$0.a(dis.ff, 15, 100);
      $$0.a(dis.iB, 5, 5);
      $$0.a(dis.ij, 60, 20);
      $$0.a(dis.pd, 15, 20);
      $$0.a(dis.ik, 60, 20);
      $$0.a(dis.il, 60, 20);
      $$0.a(dis.im, 60, 20);
      $$0.a(dis.in, 60, 20);
      $$0.a(dis.io, 60, 20);
      $$0.a(dis.ip, 60, 20);
      $$0.a(dis.iq, 60, 20);
      $$0.a(dis.ir, 60, 20);
      $$0.a(dis.is, 60, 20);
      $$0.a(dis.it, 60, 20);
      $$0.a(dis.iu, 60, 20);
      $$0.a(dis.iv, 60, 20);
      $$0.a(dis.iw, 60, 20);
      $$0.a(dis.ix, 60, 20);
      $$0.a(dis.iy, 60, 20);
      $$0.a(dis.iz, 60, 20);
      $$0.a(dis.me, 30, 60);
      $$0.a(dis.mZ, 60, 60);
      $$0.a(dis.nS, 60, 60);
      $$0.a(dis.oa, 30, 20);
      $$0.a(dis.pc, 5, 20);
      $$0.a(dis.oi, 60, 100);
      $$0.a(dis.pf, 5, 20);
      $$0.a(dis.pe, 30, 20);
      $$0.a(dis.aM, 30, 60);
      $$0.a(dis.aN, 30, 60);
      $$0.a(dis.sv, 15, 60);
      $$0.a(dis.sw, 15, 60);
      $$0.a(dis.sx, 60, 100);
      $$0.a(dis.sy, 30, 60);
      $$0.a(dis.sz, 30, 60);
      $$0.a(dis.sD, 60, 100);
      $$0.a(dis.sE, 60, 100);
      $$0.a(dis.sF, 60, 100);
      $$0.a(dis.sG, 30, 60);
      $$0.a(dis.fg, 15, 100);
   }
}
