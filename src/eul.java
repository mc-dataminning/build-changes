import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class eul extends euc {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<eug> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<fbn> n = new Object2BooleanOpenHashMap();
   private final eub[] o = new eub[jm.c.a.b()];

   @Override
   public void a(dhn $$0, bwd $$1) {
      super.a($$0, $$1);
      $$1.E();
   }

   @Override
   public void b() {
      this.c.F();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public eub a() {
      jh.a $$0 = new jh.a();
      int $$1 = this.c.dB();
      dxn $$2 = this.b.a($$0.b(this.c.dA(), (double)$$1, this.c.dG()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bj()) {
            while (true) {
               if (!$$2.a(dkg.J) && $$2.y() != etq.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dA(), (double)(++$$1), this.c.dG()));
            }
         } else if (this.c.aJ()) {
            $$1 = bae.a(this.c.dC() + 0.5);
         } else {
            $$0.b(this.c.dA(), this.c.dC() + 1.0, this.c.dG());

            while ($$0.v() > this.b.a().L_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dxn $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(eue.a)) {
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

      jh $$4 = this.c.dv();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         fbn $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jh($$4.u(), $$1, $$4.w()));
   }

   protected eub c(jh $$0) {
      eub $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(jh $$0) {
      eug $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != eug.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public euk a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eub[] $$0, eub $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eug $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      eug $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != eug.w) {
         $$3 = bae.d(Math.max(1.0F, this.c.dP()));
      }

      double $$6 = this.d(new jh($$1.a, $$1.b, $$1.c));

      for (jm $$7 : jm.c.a) {
         eub $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jm $$9 : jm.c.a) {
         jm $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eub $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eub $$0, eub $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eub $$0, @Nullable eub $$1, @Nullable eub $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eug.d && $$2.l != eug.d) {
         boolean $$3 = $$2.l == eug.h && $$1.l == eug.h && (double)this.c.dq() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eub $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == eug.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(eug $$0) {
      return $$0 == eug.h || $$0 == eug.s || $$0 == eug.t;
   }

   private boolean b(eub $$0) {
      fbn $$1 = this.c.cR();
      fbs $$2 = new fbs((double)$$0.a - this.c.dA() + $$1.b() / 2.0, (double)$$0.b - this.c.dC() + $$1.c() / 2.0, (double)$$0.c - this.c.dG() + $$1.d() / 2.0);
      int $$3 = bae.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(jh $$0) {
      dgf $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(aya.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dgf $$0, jh $$1) {
      jh $$2 = $$1.e();
      fcm $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jm.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eub a(int $$0, int $$1, int $$2, int $$3, double $$4, jm $$5, eug $$6) {
      eub $$7 = null;
      jh.a $$8 = new jh.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eug $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eug.c && (!this.c() || $$10 != eug.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eug.h || this.g()) && $$10 != eug.m && $$10 != eug.e && $$10 != eug.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == eug.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == eug.b) {
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

   private eub a(int $$0, int $$1, int $$2, eug $$3, float $$4) {
      eub $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eub a(int $$0, int $$1, int $$2) {
      eub $$3 = this.c($$0, $$1, $$2);
      $$3.l = eug.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eub a(int $$0, int $$1, int $$2, eug $$3) {
      eub $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eub a(int $$0, int $$1, int $$2, int $$3, double $$4, jm $$5, eug $$6, jh.a $$7) {
      eub $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dq() >= 1.0F) {
         return $$8;
      } else if ($$8.l != eug.b && $$8.l != eug.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dq() / 2.0;
         fbn $$12 = new fbn(
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
   private eub a(int $$0, int $$1, int $$2, @Nullable eub $$3) {
      $$1--;

      while ($$1 > this.c.dV().L_()) {
         eug $$4 = this.b($$0, $$1, $$2);
         if ($$4 != eug.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eub d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dV().L_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         eug $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != eug.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(fbn $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected eug b(int $$0, int $$1, int $$2) {
      return (eug)this.m.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public eug a(eui $$0, int $$1, int $$2, int $$3, bwd $$4) {
      Set<eug> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(eug.h)) {
         return eug.h;
      } else if ($$5.contains(eug.m)) {
         return eug.m;
      } else {
         eug $$6 = eug.a;

         for (eug $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != eug.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == eug.b ? eug.b : $$6;
      }
   }

   public Set<eug> b(eui $$0, int $$1, int $$2, int $$3) {
      EnumSet<eug> $$4 = EnumSet.noneOf(eug.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               eug $$11 = this.a($$0, $$8, $$9, $$10);
               jh $$12 = this.c.dv();
               boolean $$13 = this.d();
               if ($$11 == eug.s && this.e() && $$13) {
                  $$11 = eug.d;
               }

               if ($$11 == eug.r && !$$13) {
                  $$11 = eug.a;
               }

               if ($$11 == eug.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != eug.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != eug.l) {
                  $$11 = eug.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public eug a(eui $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jh.a($$1, $$2, $$3));
   }

   public static eug b(bwd $$0, jh $$1) {
      return a(new eui($$0.dV(), $$0), $$1.k());
   }

   public static eug a(eui $$0, jh.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eug $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == eug.b && $$3 >= $$0.a().L_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> eug.b;
            case o -> eug.o;
            case q -> eug.q;
            case w -> eug.w;
            case f -> eug.g;
            case y -> eug.y;
            case e -> eug.z;
            default -> a($$0, $$2, $$3, $$4, eug.c);
         };
      } else {
         return $$5;
      }
   }

   public static eug a(eui $$0, int $$1, int $$2, int $$3, eug $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  eug $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == eug.q) {
                     return eug.p;
                  }

                  if ($$8 == eug.o || $$8 == eug.i) {
                     return eug.n;
                  }

                  if ($$8 == eug.j) {
                     return eug.k;
                  }

                  if ($$8 == eug.y) {
                     return eug.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static eug b(dgf $$0, jh $$1) {
      dxn $$2 = $$0.a_($$1);
      dke $$3 = $$2.b();
      if ($$2.l()) {
         return eug.b;
      } else if ($$2.a(axu.R) || $$2.a(dkg.fA) || $$2.a(dkg.sY)) {
         return eug.e;
      } else if ($$2.a(dkg.rk)) {
         return eug.f;
      } else if ($$2.a(dkg.ed) || $$2.a(dkg.oD)) {
         return eug.q;
      } else if ($$2.a(dkg.pB)) {
         return eug.w;
      } else if ($$2.a(dkg.fQ)) {
         return eug.x;
      } else if (!$$2.a(dkg.ck) && !$$2.a(dkg.sO)) {
         etp $$4 = $$2.y();
         if ($$4.a(aya.b)) {
            return eug.i;
         } else if (a($$2)) {
            return eug.o;
         } else if ($$3 instanceof dmm $$5) {
            if ($$2.c(dmm.c)) {
               return eug.r;
            } else {
               return $$5.b().c() ? eug.s : eug.t;
            }
         } else if ($$3 instanceof djt) {
            return eug.l;
         } else if ($$3 instanceof doq) {
            return eug.v;
         } else if (!$$2.a(axu.U) && !$$2.a(axu.N) && (!($$3 instanceof dne) || $$2.c(dne.b))) {
            if (!$$2.a(eue.a)) {
               return eug.a;
            } else {
               return $$4.a(aya.a) ? eug.j : eug.b;
            }
         } else {
            return eug.h;
         }
      } else {
         return eug.y;
      }
   }
}
