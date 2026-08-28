import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class eyw extends eyn {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<eyr> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ffx> n = new Object2BooleanOpenHashMap();
   private final eym[] o = new eym[jc.c.a.b()];

   @Override
   public void a(dkw $$0, byh $$1) {
      super.a($$0, $$1);
      $$1.F();
   }

   @Override
   public void b() {
      this.c.G();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public eym a() {
      iw.a $$0 = new iw.a();
      int $$1 = this.c.dB();
      ebq $$2 = this.b.a($$0.b(this.c.dA(), (double)$$1, this.c.dG()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bi()) {
            while (true) {
               if (!$$2.a(dnq.J) && $$2.y() != eyb.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dA(), (double)(++$$1), this.c.dG()));
            }
         } else if (this.c.aH()) {
            $$1 = azz.a(this.c.dC() + 0.5);
         } else {
            $$0.b(this.c.dA(), this.c.dC() + 1.0, this.c.dG());

            while ($$0.v() > this.b.a().K_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               ebq $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(eyp.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.c.a($$2.y())) {
            $$2 = this.b.a($$0.b(this.c.dA(), (double)(++$$1), this.c.dG()));
         }

         $$1--;
      }

      iw $$4 = this.c.dv();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ffx $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new iw($$4.u(), $$1, $$4.w()));
   }

   protected eym c(iw $$0) {
      eym $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(iw $$0) {
      eyr $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != eyr.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public eyv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eym[] $$0, eym $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eyr $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      eyr $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != eyr.w) {
         $$3 = azz.d(Math.max(1.0F, this.c.dP()));
      }

      double $$6 = this.d(new iw($$1.a, $$1.b, $$1.c));

      for (jc $$7 : jc.c.a) {
         eym $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jc $$9 : jc.c.a) {
         jc $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eym $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eym $$0, eym $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eym $$0, @Nullable eym $$1, @Nullable eym $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eyr.d && $$2.l != eyr.d) {
         boolean $$3 = $$2.l == eyr.h && $$1.l == eyr.h && (double)this.c.dq() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eym $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == eyr.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(eyr $$0) {
      return $$0 == eyr.h || $$0 == eyr.s || $$0 == eyr.t;
   }

   private boolean b(eym $$0) {
      ffx $$1 = this.c.cR();
      fgc $$2 = new fgc((double)$$0.a - this.c.dA() + $$1.b() / 2.0, (double)$$0.b - this.c.dC() + $$1.c() / 2.0, (double)$$0.c - this.c.dG() + $$1.d() / 2.0);
      int $$3 = azz.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(iw $$0) {
      djn $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axs.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(djn $$0, iw $$1) {
      iw $$2 = $$1.e();
      fgw $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jc.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eym a(int $$0, int $$1, int $$2, int $$3, double $$4, jc $$5, eyr $$6) {
      eym $$7 = null;
      iw.a $$8 = new iw.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eyr $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eyr.c && (!this.c() || $$10 != eyr.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eyr.h || this.g()) && $$10 != eyr.m && $$10 != eyr.e && $$10 != eyr.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == eyr.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == eyr.b) {
               $$7 = this.d($$0, $$1, $$2);
            } else if (a($$10) && $$7 == null) {
               $$7 = this.a($$0, $$1, $$2, $$10);
            }

            return $$7;
         } else {
            return $$7;
         }
      }
   }

   private double h() {
      return Math.max(1.125, (double)this.c.dP());
   }

   private eym a(int $$0, int $$1, int $$2, eyr $$3, float $$4) {
      eym $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eym a(int $$0, int $$1, int $$2) {
      eym $$3 = this.c($$0, $$1, $$2);
      $$3.l = eyr.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eym a(int $$0, int $$1, int $$2, eyr $$3) {
      eym $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eym a(int $$0, int $$1, int $$2, int $$3, double $$4, jc $$5, eyr $$6, iw.a $$7) {
      eym $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dq() >= 1.0F) {
         return $$8;
      } else if ($$8.l != eyr.b && $$8.l != eyr.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dq() / 2.0;
         ffx $$12 = new ffx(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.c.dr() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private eym a(int $$0, int $$1, int $$2, @Nullable eym $$3) {
      $$1--;

      while ($$1 > this.c.dV().K_()) {
         eyr $$4 = this.b($$0, $$1, $$2);
         if ($$4 != eyr.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eym d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dV().K_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         eyr $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != eyr.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ffx $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected eyr b(int $$0, int $$1, int $$2) {
      return (eyr)this.m.computeIfAbsent(iw.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public eyr a(eyt $$0, int $$1, int $$2, int $$3, byh $$4) {
      Set<eyr> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(eyr.h)) {
         return eyr.h;
      } else if ($$5.contains(eyr.m)) {
         return eyr.m;
      } else {
         eyr $$6 = eyr.a;

         for (eyr $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != eyr.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == eyr.b ? eyr.b : $$6;
      }
   }

   public Set<eyr> b(eyt $$0, int $$1, int $$2, int $$3) {
      EnumSet<eyr> $$4 = EnumSet.noneOf(eyr.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               eyr $$11 = this.a($$0, $$8, $$9, $$10);
               iw $$12 = this.c.dv();
               boolean $$13 = this.d();
               if ($$11 == eyr.s && this.e() && $$13) {
                  $$11 = eyr.d;
               }

               if ($$11 == eyr.r && !$$13) {
                  $$11 = eyr.a;
               }

               if ($$11 == eyr.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != eyr.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != eyr.l) {
                  $$11 = eyr.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public eyr a(eyt $$0, int $$1, int $$2, int $$3) {
      return a($$0, new iw.a($$1, $$2, $$3));
   }

   public static eyr b(byh $$0, iw $$1) {
      return a(new eyt($$0.dV(), $$0), $$1.k());
   }

   public static eyr a(eyt $$0, iw.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eyr $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == eyr.b && $$3 >= $$0.a().K_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> eyr.b;
            case o -> eyr.o;
            case q -> eyr.q;
            case w -> eyr.w;
            case f -> eyr.g;
            case y -> eyr.y;
            case e -> eyr.z;
            default -> a($$0, $$2, $$3, $$4, eyr.c);
         };
      } else {
         return $$5;
      }
   }

   public static eyr a(eyt $$0, int $$1, int $$2, int $$3, eyr $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  eyr $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == eyr.q) {
                     return eyr.p;
                  }

                  if ($$8 == eyr.o || $$8 == eyr.i) {
                     return eyr.n;
                  }

                  if ($$8 == eyr.j) {
                     return eyr.k;
                  }

                  if ($$8 == eyr.y) {
                     return eyr.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static eyr b(djn $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      dno $$3 = $$2.b();
      if ($$2.l()) {
         return eyr.b;
      } else if ($$2.a(axn.R) || $$2.a(dnq.fF) || $$2.a(dnq.tn)) {
         return eyr.e;
      } else if ($$2.a(dnq.rx)) {
         return eyr.f;
      } else if ($$2.a(dnq.eg) || $$2.a(dnq.oO)) {
         return eyr.q;
      } else if ($$2.a(dnq.pO)) {
         return eyr.w;
      } else if ($$2.a(dnq.gb)) {
         return eyr.x;
      } else if (!$$2.a(dnq.cn) && !$$2.a(dnq.tb)) {
         eya $$4 = $$2.y();
         if ($$4.a(axs.b)) {
            return eyr.i;
         } else if (a($$2)) {
            return eyr.o;
         } else if ($$3 instanceof dpv $$5) {
            if ($$2.c(dpv.e)) {
               return eyr.r;
            } else {
               return $$5.b().c() ? eyr.s : eyr.t;
            }
         } else if ($$3 instanceof dnd) {
            return eyr.l;
         } else if ($$3 instanceof dse) {
            return eyr.v;
         } else if (!$$2.a(axn.U) && !$$2.a(axn.N) && (!($$3 instanceof dqp) || $$2.c(dqp.b))) {
            if (!$$2.a(eyp.a)) {
               return eyr.a;
            } else {
               return $$4.a(axs.a) ? eyr.j : eyr.b;
            }
         } else {
            return eyr.h;
         }
      } else {
         return eyr.y;
      }
   }
}
