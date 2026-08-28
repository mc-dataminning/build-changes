import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class eqx extends eqo {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<eqs> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<exz> n = new Object2BooleanOpenHashMap();
   private final eqn[] o = new eqn[jj.c.a.b()];

   @Override
   public void a(def $$0, buh $$1) {
      super.a($$0, $$1);
      $$1.G();
   }

   @Override
   public void b() {
      this.b.I();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public eqn a() {
      je.a $$0 = new je.a();
      int $$1 = this.b.dy();
      dua $$2 = this.a.a($$0.b(this.b.dx(), (double)$$1, this.b.dD()));
      if (!this.b.a($$2.y())) {
         if (this.f() && this.b.bi()) {
            while (true) {
               if (!$$2.a(dgx.G) && $$2.y() != eqc.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dx(), (double)(++$$1), this.b.dD()));
            }
         } else if (this.b.aH()) {
            $$1 = azc.a(this.b.dz() + 0.5);
         } else {
            $$0.b(this.b.dx(), this.b.dz() + 1.0, this.b.dD());

            while ($$0.v() > this.a.a().G_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dua $$3 = this.a.a($$0);
               if (!$$3.l() && !$$3.a(eqq.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.y())) {
            $$2 = this.a.a($$0.b(this.b.dx(), (double)(++$$1), this.b.dD()));
         }

         $$1--;
      }

      je $$4 = this.b.ds();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         exz $$5 = this.b.cO();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new je($$4.u(), $$1, $$4.w()));
   }

   protected eqn c(je $$0) {
      eqn $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(je $$0) {
      eqs $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != eqs.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public eqw a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eqn[] $$0, eqn $$1) {
      int $$2 = 0;
      int $$3 = 0;
      eqs $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      eqs $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != eqs.w) {
         $$3 = azc.d(Math.max(1.0F, this.b.dM()));
      }

      double $$6 = this.d(new je($$1.a, $$1.b, $$1.c));

      for (jj $$7 : jj.c.a) {
         eqn $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jj $$9 : jj.c.a) {
         jj $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            eqn $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eqn $$0, eqn $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(eqn $$0, @Nullable eqn $$1, @Nullable eqn $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != eqs.d && $$2.l != eqs.d) {
         boolean $$3 = $$2.l == eqs.h && $$1.l == eqs.h && (double)this.b.dn() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable eqn $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == eqs.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(eqs $$0) {
      return $$0 == eqs.h || $$0 == eqs.s || $$0 == eqs.t;
   }

   private boolean b(eqn $$0) {
      exz $$1 = this.b.cO();
      eye $$2 = new eye((double)$$0.a - this.b.dx() + $$1.b() / 2.0, (double)$$0.b - this.b.dz() + $$1.c() / 2.0, (double)$$0.c - this.b.dD() + $$1.d() / 2.0);
      int $$3 = azc.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(je $$0) {
      dcx $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(awy.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dcx $$0, je $$1) {
      je $$2 = $$1.e();
      eyx $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jj.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected eqn a(int $$0, int $$1, int $$2, int $$3, double $$4, jj $$5, eqs $$6) {
      eqn $$7 = null;
      je.a $$8 = new je.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         eqs $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != eqs.c && (!this.c() || $$10 != eqs.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != eqs.h || this.g()) && $$10 != eqs.m && $$10 != eqs.e && $$10 != eqs.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == eqs.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == eqs.b) {
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
      return Math.max(1.125, (double)this.b.dM());
   }

   private eqn a(int $$0, int $$1, int $$2, eqs $$3, float $$4) {
      eqn $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private eqn a(int $$0, int $$1, int $$2) {
      eqn $$3 = this.c($$0, $$1, $$2);
      $$3.l = eqs.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private eqn a(int $$0, int $$1, int $$2, eqs $$3) {
      eqn $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private eqn a(int $$0, int $$1, int $$2, int $$3, double $$4, jj $$5, eqs $$6, je.a $$7) {
      eqn $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dn() >= 1.0F) {
         return $$8;
      } else if ($$8.l != eqs.b && $$8.l != eqs.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dn() / 2.0;
         exz $$12 = new exz(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.do() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private eqn a(int $$0, int $$1, int $$2, @Nullable eqn $$3) {
      $$1--;

      while ($$1 > this.b.dS().G_()) {
         eqs $$4 = this.b($$0, $$1, $$2);
         if ($$4 != eqs.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private eqn d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dS().G_(); $$3--) {
         if ($$1 - $$3 > this.b.cB()) {
            return this.a($$0, $$3, $$2);
         }

         eqs $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != eqs.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(exz $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected eqs b(int $$0, int $$1, int $$2) {
      return (eqs)this.m.computeIfAbsent(je.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public eqs a(equ $$0, int $$1, int $$2, int $$3, buh $$4) {
      Set<eqs> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(eqs.h)) {
         return eqs.h;
      } else if ($$5.contains(eqs.m)) {
         return eqs.m;
      } else {
         eqs $$6 = eqs.a;

         for (eqs $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != eqs.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == eqs.b ? eqs.b : $$6;
      }
   }

   public Set<eqs> b(equ $$0, int $$1, int $$2, int $$3) {
      EnumSet<eqs> $$4 = EnumSet.noneOf(eqs.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               eqs $$11 = this.a($$0, $$8, $$9, $$10);
               je $$12 = this.b.ds();
               boolean $$13 = this.d();
               if ($$11 == eqs.s && this.e() && $$13) {
                  $$11 = eqs.d;
               }

               if ($$11 == eqs.r && !$$13) {
                  $$11 = eqs.a;
               }

               if ($$11 == eqs.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != eqs.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != eqs.l) {
                  $$11 = eqs.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public eqs a(equ $$0, int $$1, int $$2, int $$3) {
      return a($$0, new je.a($$1, $$2, $$3));
   }

   public static eqs b(buh $$0, je $$1) {
      return a(new equ($$0.dS(), $$0), $$1.k());
   }

   public static eqs a(equ $$0, je.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      eqs $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == eqs.b && $$3 >= $$0.a().G_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> eqs.b;
            case o -> eqs.o;
            case q -> eqs.q;
            case w -> eqs.w;
            case f -> eqs.g;
            case y -> eqs.y;
            case e -> eqs.z;
            default -> a($$0, $$2, $$3, $$4, eqs.c);
         };
      } else {
         return $$5;
      }
   }

   public static eqs a(equ $$0, int $$1, int $$2, int $$3, eqs $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  eqs $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == eqs.q) {
                     return eqs.p;
                  }

                  if ($$8 == eqs.o || $$8 == eqs.i) {
                     return eqs.n;
                  }

                  if ($$8 == eqs.j) {
                     return eqs.k;
                  }

                  if ($$8 == eqs.y) {
                     return eqs.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static eqs b(dcx $$0, je $$1) {
      dua $$2 = $$0.a_($$1);
      dgv $$3 = $$2.b();
      if ($$2.l()) {
         return eqs.b;
      } else if ($$2.a(aws.Q) || $$2.a(dgx.fm) || $$2.a(dgx.sD)) {
         return eqs.e;
      } else if ($$2.a(dgx.qP)) {
         return eqs.f;
      } else if ($$2.a(dgx.dQ) || $$2.a(dgx.oi)) {
         return eqs.q;
      } else if ($$2.a(dgx.pg)) {
         return eqs.w;
      } else if ($$2.a(dgx.fC)) {
         return eqs.x;
      } else if (!$$2.a(dgx.cd) && !$$2.a(dgx.st)) {
         eqb $$4 = $$2.y();
         if ($$4.a(awy.b)) {
            return eqs.i;
         } else if (a($$2)) {
            return eqs.o;
         } else if ($$3 instanceof djb $$5) {
            if ($$2.c(djb.c)) {
               return eqs.r;
            } else {
               return $$5.b().c() ? eqs.s : eqs.t;
            }
         } else if ($$3 instanceof dgk) {
            return eqs.l;
         } else if ($$3 instanceof dlf) {
            return eqs.v;
         } else if (!$$2.a(aws.T) && !$$2.a(aws.M) && (!($$3 instanceof dju) || $$2.c(dju.b))) {
            if (!$$2.a(eqq.a)) {
               return eqs.a;
            } else {
               return $$4.a(awy.a) ? eqs.j : eqs.b;
            }
         } else {
            return eqs.h;
         }
      } else {
         return eqs.y;
      }
   }
}
