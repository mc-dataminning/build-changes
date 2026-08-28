import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ewr extends ewi {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<ewm> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<fdr> n = new Object2BooleanOpenHashMap();
   private final ewh[] o = new ewh[ja.c.a.b()];

   @Override
   public void a(djc $$0, bxb $$1) {
      super.a($$0, $$1);
      $$1.G();
   }

   @Override
   public void b() {
      this.c.H();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public ewh a() {
      iu.a $$0 = new iu.a();
      int $$1 = this.c.dB();
      dzo $$2 = this.b.a($$0.b(this.c.dA(), (double)$$1, this.c.dG()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bj()) {
            while (true) {
               if (!$$2.a(dlw.J) && $$2.y() != evw.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dA(), (double)(++$$1), this.c.dG()));
            }
         } else if (this.c.aJ()) {
            $$1 = azk.a(this.c.dC() + 0.5);
         } else {
            $$0.b(this.c.dA(), this.c.dC() + 1.0, this.c.dG());

            while ($$0.v() > this.b.a().G_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dzo $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(ewk.a)) {
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

      iu $$4 = this.c.dv();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         fdr $$5 = this.c.cR();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new iu($$4.u(), $$1, $$4.w()));
   }

   protected ewh c(iu $$0) {
      ewh $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(iu $$0) {
      ewm $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != ewm.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public ewq a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(ewh[] $$0, ewh $$1) {
      int $$2 = 0;
      int $$3 = 0;
      ewm $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      ewm $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != ewm.w) {
         $$3 = azk.d(Math.max(1.0F, this.c.dP()));
      }

      double $$6 = this.d(new iu($$1.a, $$1.b, $$1.c));

      for (ja $$7 : ja.c.a) {
         ewh $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (ja $$9 : ja.c.a) {
         ja $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            ewh $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable ewh $$0, ewh $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(ewh $$0, @Nullable ewh $$1, @Nullable ewh $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != ewm.d && $$2.l != ewm.d) {
         boolean $$3 = $$2.l == ewm.h && $$1.l == ewm.h && (double)this.c.dq() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable ewh $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == ewm.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(ewm $$0) {
      return $$0 == ewm.h || $$0 == ewm.s || $$0 == ewm.t;
   }

   private boolean b(ewh $$0) {
      fdr $$1 = this.c.cR();
      fdw $$2 = new fdw((double)$$0.a - this.c.dA() + $$1.b() / 2.0, (double)$$0.b - this.c.dC() + $$1.c() / 2.0, (double)$$0.c - this.c.dG() + $$1.d() / 2.0);
      int $$3 = azk.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(iu $$0) {
      dhv $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axf.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dhv $$0, iu $$1) {
      iu $$2 = $$1.e();
      feq $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ja.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected ewh a(int $$0, int $$1, int $$2, int $$3, double $$4, ja $$5, ewm $$6) {
      ewh $$7 = null;
      iu.a $$8 = new iu.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         ewm $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != ewm.c && (!this.c() || $$10 != ewm.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != ewm.h || this.g()) && $$10 != ewm.m && $$10 != ewm.e && $$10 != ewm.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == ewm.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == ewm.b) {
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

   private ewh a(int $$0, int $$1, int $$2, ewm $$3, float $$4) {
      ewh $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private ewh a(int $$0, int $$1, int $$2) {
      ewh $$3 = this.c($$0, $$1, $$2);
      $$3.l = ewm.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private ewh a(int $$0, int $$1, int $$2, ewm $$3) {
      ewh $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private ewh a(int $$0, int $$1, int $$2, int $$3, double $$4, ja $$5, ewm $$6, iu.a $$7) {
      ewh $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.dq() >= 1.0F) {
         return $$8;
      } else if ($$8.l != ewm.b && $$8.l != ewm.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.c.dq() / 2.0;
         fdr $$12 = new fdr(
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
   private ewh a(int $$0, int $$1, int $$2, @Nullable ewh $$3) {
      $$1--;

      while ($$1 > this.c.dV().G_()) {
         ewm $$4 = this.b($$0, $$1, $$2);
         if ($$4 != ewm.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private ewh d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.dV().G_(); $$3--) {
         if ($$1 - $$3 > this.c.cE()) {
            return this.a($$0, $$3, $$2);
         }

         ewm $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != ewm.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(fdr $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected ewm b(int $$0, int $$1, int $$2) {
      return (ewm)this.m.computeIfAbsent(iu.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public ewm a(ewo $$0, int $$1, int $$2, int $$3, bxb $$4) {
      Set<ewm> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(ewm.h)) {
         return ewm.h;
      } else if ($$5.contains(ewm.m)) {
         return ewm.m;
      } else {
         ewm $$6 = ewm.a;

         for (ewm $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != ewm.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == ewm.b ? ewm.b : $$6;
      }
   }

   public Set<ewm> b(ewo $$0, int $$1, int $$2, int $$3) {
      EnumSet<ewm> $$4 = EnumSet.noneOf(ewm.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               ewm $$11 = this.a($$0, $$8, $$9, $$10);
               iu $$12 = this.c.dv();
               boolean $$13 = this.d();
               if ($$11 == ewm.s && this.e() && $$13) {
                  $$11 = ewm.d;
               }

               if ($$11 == ewm.r && !$$13) {
                  $$11 = ewm.a;
               }

               if ($$11 == ewm.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != ewm.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != ewm.l) {
                  $$11 = ewm.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public ewm a(ewo $$0, int $$1, int $$2, int $$3) {
      return a($$0, new iu.a($$1, $$2, $$3));
   }

   public static ewm b(bxb $$0, iu $$1) {
      return a(new ewo($$0.dV(), $$0), $$1.k());
   }

   public static ewm a(ewo $$0, iu.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      ewm $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == ewm.b && $$3 >= $$0.a().G_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> ewm.b;
            case o -> ewm.o;
            case q -> ewm.q;
            case w -> ewm.w;
            case f -> ewm.g;
            case y -> ewm.y;
            case e -> ewm.z;
            default -> a($$0, $$2, $$3, $$4, ewm.c);
         };
      } else {
         return $$5;
      }
   }

   public static ewm a(ewo $$0, int $$1, int $$2, int $$3, ewm $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  ewm $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == ewm.q) {
                     return ewm.p;
                  }

                  if ($$8 == ewm.o || $$8 == ewm.i) {
                     return ewm.n;
                  }

                  if ($$8 == ewm.j) {
                     return ewm.k;
                  }

                  if ($$8 == ewm.y) {
                     return ewm.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static ewm b(dhv $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      dlu $$3 = $$2.b();
      if ($$2.l()) {
         return ewm.b;
      } else if ($$2.a(axa.R) || $$2.a(dlw.fB) || $$2.a(dlw.tj)) {
         return ewm.e;
      } else if ($$2.a(dlw.rt)) {
         return ewm.f;
      } else if ($$2.a(dlw.ed) || $$2.a(dlw.oK)) {
         return ewm.q;
      } else if ($$2.a(dlw.pK)) {
         return ewm.w;
      } else if ($$2.a(dlw.fX)) {
         return ewm.x;
      } else if (!$$2.a(dlw.ck) && !$$2.a(dlw.sX)) {
         evv $$4 = $$2.y();
         if ($$4.a(axf.b)) {
            return ewm.i;
         } else if (a($$2)) {
            return ewm.o;
         } else if ($$3 instanceof dob $$5) {
            if ($$2.c(dob.e)) {
               return ewm.r;
            } else {
               return $$5.b().c() ? ewm.s : ewm.t;
            }
         } else if ($$3 instanceof dlj) {
            return ewm.l;
         } else if ($$3 instanceof dqi) {
            return ewm.v;
         } else if (!$$2.a(axa.U) && !$$2.a(axa.N) && (!($$3 instanceof dou) || $$2.c(dou.b))) {
            if (!$$2.a(ewk.a)) {
               return ewm.a;
            } else {
               return $$4.a(axf.a) ? ewm.j : ewm.b;
            }
         } else {
            return ewm.h;
         }
      } else {
         return ewm.y;
      }
   }
}
