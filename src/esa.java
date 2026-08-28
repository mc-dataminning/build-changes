import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class esa extends err {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<erv> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<ezc> n = new Object2BooleanOpenHashMap();
   private final erq[] o = new erq[jl.c.a.b()];

   @Override
   public void a(dfi $$0, bux $$1) {
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
   public erq a() {
      jg.a $$0 = new jg.a();
      int $$1 = this.b.dD();
      dvd $$2 = this.a.a($$0.b(this.b.dC(), (double)$$1, this.b.dI()));
      if (!this.b.a($$2.y())) {
         if (this.f() && this.b.bk()) {
            while (true) {
               if (!$$2.a(dia.G) && $$2.y() != erf.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dC(), (double)(++$$1), this.b.dI()));
            }
         } else if (this.b.aJ()) {
            $$1 = azj.a(this.b.dE() + 0.5);
         } else {
            $$0.b(this.b.dC(), this.b.dE() + 1.0, this.b.dI());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               dvd $$3 = this.a.a($$0);
               if (!$$3.l() && !$$3.a(ert.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.y())) {
            $$2 = this.a.a($$0.b(this.b.dC(), (double)(++$$1), this.b.dI()));
         }

         $$1--;
      }

      jg $$4 = this.b.dx();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         ezc $$5 = this.b.cS();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jg($$4.u(), $$1, $$4.w()));
   }

   protected erq c(jg $$0) {
      erq $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(jg $$0) {
      erv $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != erv.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public erz a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(erq[] $$0, erq $$1) {
      int $$2 = 0;
      int $$3 = 0;
      erv $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      erv $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != erv.w) {
         $$3 = azj.d(Math.max(1.0F, this.b.dR()));
      }

      double $$6 = this.d(new jg($$1.a, $$1.b, $$1.c));

      for (jl $$7 : jl.c.a) {
         erq $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jl $$9 : jl.c.a) {
         jl $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            erq $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable erq $$0, erq $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(erq $$0, @Nullable erq $$1, @Nullable erq $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != erv.d && $$2.l != erv.d) {
         boolean $$3 = $$2.l == erv.h && $$1.l == erv.h && (double)this.b.ds() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable erq $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == erv.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(erv $$0) {
      return $$0 == erv.h || $$0 == erv.s || $$0 == erv.t;
   }

   private boolean b(erq $$0) {
      ezc $$1 = this.b.cS();
      ezh $$2 = new ezh((double)$$0.a - this.b.dC() + $$1.b() / 2.0, (double)$$0.b - this.b.dE() + $$1.c() / 2.0, (double)$$0.c - this.b.dI() + $$1.d() / 2.0);
      int $$3 = azj.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(jg $$0) {
      dea $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(axf.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dea $$0, jg $$1) {
      jg $$2 = $$1.e();
      fab $$3 = $$0.a_($$2).g($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(jl.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected erq a(int $$0, int $$1, int $$2, int $$3, double $$4, jl $$5, erv $$6) {
      erq $$7 = null;
      jg.a $$8 = new jg.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         erv $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != erv.c && (!this.c() || $$10 != erv.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != erv.h || this.g()) && $$10 != erv.m && $$10 != erv.e && $$10 != erv.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == erv.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == erv.b) {
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
      return Math.max(1.125, (double)this.b.dR());
   }

   private erq a(int $$0, int $$1, int $$2, erv $$3, float $$4) {
      erq $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private erq a(int $$0, int $$1, int $$2) {
      erq $$3 = this.c($$0, $$1, $$2);
      $$3.l = erv.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private erq a(int $$0, int $$1, int $$2, erv $$3) {
      erq $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private erq a(int $$0, int $$1, int $$2, int $$3, double $$4, jl $$5, erv $$6, jg.a $$7) {
      erq $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.ds() >= 1.0F) {
         return $$8;
      } else if ($$8.l != erv.b && $$8.l != erv.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.ds() / 2.0;
         ezc $$12 = new ezc(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.dt() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private erq a(int $$0, int $$1, int $$2, @Nullable erq $$3) {
      $$1--;

      while ($$1 > this.b.dX().I_()) {
         erv $$4 = this.b($$0, $$1, $$2);
         if ($$4 != erv.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private erq d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dX().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cF()) {
            return this.a($$0, $$3, $$2);
         }

         erv $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != erv.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(ezc $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected erv b(int $$0, int $$1, int $$2) {
      return (erv)this.m.computeIfAbsent(jg.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public erv a(erx $$0, int $$1, int $$2, int $$3, bux $$4) {
      Set<erv> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(erv.h)) {
         return erv.h;
      } else if ($$5.contains(erv.m)) {
         return erv.m;
      } else {
         erv $$6 = erv.a;

         for (erv $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != erv.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == erv.b ? erv.b : $$6;
      }
   }

   public Set<erv> b(erx $$0, int $$1, int $$2, int $$3) {
      EnumSet<erv> $$4 = EnumSet.noneOf(erv.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               erv $$11 = this.a($$0, $$8, $$9, $$10);
               jg $$12 = this.b.dx();
               boolean $$13 = this.d();
               if ($$11 == erv.s && this.e() && $$13) {
                  $$11 = erv.d;
               }

               if ($$11 == erv.r && !$$13) {
                  $$11 = erv.a;
               }

               if ($$11 == erv.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != erv.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != erv.l) {
                  $$11 = erv.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public erv a(erx $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jg.a($$1, $$2, $$3));
   }

   public static erv b(bux $$0, jg $$1) {
      return a(new erx($$0.dX(), $$0), $$1.k());
   }

   public static erv a(erx $$0, jg.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      erv $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == erv.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> erv.b;
            case o -> erv.o;
            case q -> erv.q;
            case w -> erv.w;
            case f -> erv.g;
            case y -> erv.y;
            case e -> erv.z;
            default -> a($$0, $$2, $$3, $$4, erv.c);
         };
      } else {
         return $$5;
      }
   }

   public static erv a(erx $$0, int $$1, int $$2, int $$3, erv $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  erv $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == erv.q) {
                     return erv.p;
                  }

                  if ($$8 == erv.o || $$8 == erv.i) {
                     return erv.n;
                  }

                  if ($$8 == erv.j) {
                     return erv.k;
                  }

                  if ($$8 == erv.y) {
                     return erv.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static erv b(dea $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      dhy $$3 = $$2.b();
      if ($$2.l()) {
         return erv.b;
      } else if ($$2.a(awz.Q) || $$2.a(dia.fm) || $$2.a(dia.sD)) {
         return erv.e;
      } else if ($$2.a(dia.qP)) {
         return erv.f;
      } else if ($$2.a(dia.dQ) || $$2.a(dia.oi)) {
         return erv.q;
      } else if ($$2.a(dia.pg)) {
         return erv.w;
      } else if ($$2.a(dia.fC)) {
         return erv.x;
      } else if (!$$2.a(dia.cd) && !$$2.a(dia.st)) {
         ere $$4 = $$2.y();
         if ($$4.a(axf.b)) {
            return erv.i;
         } else if (a($$2)) {
            return erv.o;
         } else if ($$3 instanceof dke $$5) {
            if ($$2.c(dke.c)) {
               return erv.r;
            } else {
               return $$5.b().c() ? erv.s : erv.t;
            }
         } else if ($$3 instanceof dhn) {
            return erv.l;
         } else if ($$3 instanceof dmh) {
            return erv.v;
         } else if (!$$2.a(awz.T) && !$$2.a(awz.M) && (!($$3 instanceof dkw) || $$2.c(dkw.b))) {
            if (!$$2.a(ert.a)) {
               return erv.a;
            } else {
               return $$4.a(axf.a) ? erv.j : erv.b;
            }
         } else {
            return erv.h;
         }
      } else {
         return erv.y;
      }
   }
}
