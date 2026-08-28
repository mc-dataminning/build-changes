import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class eum extends eud {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<euh> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<fbm> n = new Object2BooleanOpenHashMap();
   private final euc[] o = new euc[jm.c.a.b()];

   @Override
   public void a(dhm $$0, bvz $$1) {
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
   public euc a() {
      jh.a $$0 = new jh.a();
      int $$1 = this.c.dC();
      dxo $$2 = this.b.a($$0.b(this.c.dB(), (double)$$1, this.c.dH()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bj()) {
            while (true) {
               if (!$$2.a(dkf.J) && $$2.y() != etr.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dB(), (double)(++$$1), this.c.dH()));
            }
         } else if (this.c.aJ()) {
            $$1 = azu.a(this.c.dD() + 0.5);
         } else {
            $$0.b(this.c.dB(), this.c.dD() + 1.0, this.c.dH());

            while ($$0.v() > this.b.a().L_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dxo $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(euf.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.c.a($$2.y())) {
            $$2 = this.b.a($$0.b(this.c.dB(), (double)(++$$1), this.c.dH()));
         }

         $$1--;
      }

      jh $$4 = this.c.dw();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         fbm $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jh($$4.u(), $$1, $$4.w()));
   }

   protected euc c(jh $$0) {
      euc $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(jh $$0) {
      euh $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != euh.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public eul a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(euc[] $$0, euc $$1) {
      int $$2 = 0;
      int $$3 = 0;
      euh $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      euh $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != euh.w) {
         $$3 = azu.d(Math.max(1.0F, this.c.dQ()));
      }

      double $$6 = this.d(new jh($$1.a, $$1.b, $$1.c));

      for (jm $$7 : jm.c.a) {
         euc $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jm $$9 : jm.c.a) {
         jm $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            euc $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable euc $$0, euc $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(euc $$0, @Nullable euc $$1, @Nullable euc $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != euh.d && $$2.l != euh.d) {
         boolean $$3 = $$2.l == euh.h && $$1.l == euh.h && (double)this.c.dr() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable euc $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == euh.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(euh $$0) {
      return $$0 == euh.h || $$0 == euh.s || $$0 == euh.t;
   }

   private boolean b(euc $$0) {
      fbm $$1 = this.c.cR();
      fbr $$2 = new fbr((double)$$0.a - this.c.dB() + $$1.b() / 2.0, (double)$$0.b - this.c.dD() + $$1.c() / 2.0, (double)$$0.c - this.c.dH() + $$1.d() / 2.0);
      int $$3 = azu.c($$2.g() / $$1.a());
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
      dge $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axq.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dge $$0, jh $$1) {
      jh $$2 = $$1.e();
      fcl $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jm.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected euc a(int $$0, int $$1, int $$2, int $$3, double $$4, jm $$5, euh $$6) {
      euc $$7 = null;
      jh.a $$8 = new jh.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         euh $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != euh.c && (!this.c() || $$10 != euh.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != euh.h || this.g()) && $$10 != euh.m && $$10 != euh.e && $$10 != euh.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == euh.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == euh.b) {
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
      return Math.max(1.125, (double)this.c.dQ());
   }

   private euc a(int $$0, int $$1, int $$2, euh $$3, float $$4) {
      euc $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private euc a(int $$0, int $$1, int $$2) {
      euc $$3 = this.c($$0, $$1, $$2);
      $$3.l = euh.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private euc a(int $$0, int $$1, int $$2, euh $$3) {
      euc $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private euc a(int $$0, int $$1, int $$2, int $$3, double $$4, jm $$5, euh $$6, jh.a $$7) {
      euc $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dr() >= 1.0F) {
         return $$8;
      } else if ($$8.l != euh.b && $$8.l != euh.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dr() / 2.0;
         fbm $$12 = new fbm(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.c.ds() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private euc a(int $$0, int $$1, int $$2, @Nullable euc $$3) {
      $$1--;

      while ($$1 > this.c.dW().L_()) {
         euh $$4 = this.b($$0, $$1, $$2);
         if ($$4 != euh.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private euc d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dW().L_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         euh $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != euh.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(fbm $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected euh b(int $$0, int $$1, int $$2) {
      return (euh)this.m.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public euh a(euj $$0, int $$1, int $$2, int $$3, bvz $$4) {
      Set<euh> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(euh.h)) {
         return euh.h;
      } else if ($$5.contains(euh.m)) {
         return euh.m;
      } else {
         euh $$6 = euh.a;

         for (euh $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != euh.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == euh.b ? euh.b : $$6;
      }
   }

   public Set<euh> b(euj $$0, int $$1, int $$2, int $$3) {
      EnumSet<euh> $$4 = EnumSet.noneOf(euh.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               euh $$11 = this.a($$0, $$8, $$9, $$10);
               jh $$12 = this.c.dw();
               boolean $$13 = this.d();
               if ($$11 == euh.s && this.e() && $$13) {
                  $$11 = euh.d;
               }

               if ($$11 == euh.r && !$$13) {
                  $$11 = euh.a;
               }

               if ($$11 == euh.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != euh.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != euh.l) {
                  $$11 = euh.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public euh a(euj $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jh.a($$1, $$2, $$3));
   }

   public static euh b(bvz $$0, jh $$1) {
      return a(new euj($$0.dW(), $$0), $$1.k());
   }

   public static euh a(euj $$0, jh.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      euh $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == euh.b && $$3 >= $$0.a().L_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> euh.b;
            case o -> euh.o;
            case q -> euh.q;
            case w -> euh.w;
            case f -> euh.g;
            case y -> euh.y;
            case e -> euh.z;
            default -> a($$0, $$2, $$3, $$4, euh.c);
         };
      } else {
         return $$5;
      }
   }

   public static euh a(euj $$0, int $$1, int $$2, int $$3, euh $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  euh $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == euh.q) {
                     return euh.p;
                  }

                  if ($$8 == euh.o || $$8 == euh.i) {
                     return euh.n;
                  }

                  if ($$8 == euh.j) {
                     return euh.k;
                  }

                  if ($$8 == euh.y) {
                     return euh.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static euh b(dge $$0, jh $$1) {
      dxo $$2 = $$0.a_($$1);
      dkd $$3 = $$2.b();
      if ($$2.l()) {
         return euh.b;
      } else if ($$2.a(axk.R) || $$2.a(dkf.fB) || $$2.a(dkf.tf)) {
         return euh.e;
      } else if ($$2.a(dkf.rr)) {
         return euh.f;
      } else if ($$2.a(dkf.ed) || $$2.a(dkf.oK)) {
         return euh.q;
      } else if ($$2.a(dkf.pI)) {
         return euh.w;
      } else if ($$2.a(dkf.fX)) {
         return euh.x;
      } else if (!$$2.a(dkf.ck) && !$$2.a(dkf.sV)) {
         etq $$4 = $$2.y();
         if ($$4.a(axq.b)) {
            return euh.i;
         } else if (a($$2)) {
            return euh.o;
         } else if ($$3 instanceof dmk $$5) {
            if ($$2.c(dmk.c)) {
               return euh.r;
            } else {
               return $$5.b().c() ? euh.s : euh.t;
            }
         } else if ($$3 instanceof djs) {
            return euh.l;
         } else if ($$3 instanceof dop) {
            return euh.v;
         } else if (!$$2.a(axk.U) && !$$2.a(axk.N) && (!($$3 instanceof dnd) || $$2.c(dnd.b))) {
            if (!$$2.a(euf.a)) {
               return euh.a;
            } else {
               return $$4.a(axq.a) ? euh.j : euh.b;
            }
         } else {
            return euh.h;
         }
      } else {
         return euh.y;
      }
   }
}
