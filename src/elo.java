import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class elo extends elf {
   public static final double k = 0.5;
   private static final double l = 1.125;
   private final Long2ObjectMap<elj> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<erv> n = new Object2BooleanOpenHashMap();
   private final ele[] o = new ele[ih.c.a.b()];

   @Override
   public void a(czk $$0, bqq $$1) {
      super.a($$0, $$1);
      $$1.C();
   }

   @Override
   public void b() {
      this.b.D();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public ele a() {
      ib.a $$0 = new ib.a();
      int $$1 = this.b.ds();
      doz $$2 = this.a.a($$0.b(this.b.dr(), (double)$$1, this.b.dx()));
      if (!this.b.a($$2.u())) {
         if (this.f() && this.b.bc()) {
            while (true) {
               if (!$$2.a(dca.G) && $$2.u() != ekt.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.a.a($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
            }
         } else if (this.b.aC()) {
            $$1 = axk.a(this.b.dt() + 0.5);
         } else {
            $$0.b(this.b.dr(), this.b.dt() + 1.0, this.b.dx());

            while ($$0.v() > this.a.a().I_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               doz $$3 = this.a.a($$0);
               if (!$$3.i() && !$$3.a(elh.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.b.a($$2.u())) {
            $$2 = this.a.a($$0.b(this.b.dr(), (double)(++$$1), this.b.dx()));
         }

         $$1--;
      }

      ib $$4 = this.b.dm();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         erv $$5 = this.b.cH();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new ib($$4.u(), $$1, $$4.w()));
   }

   protected ele c(ib $$0) {
      ele $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.b.a($$1.l);
      return $$1;
   }

   protected boolean a(ib $$0) {
      elj $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != elj.b && this.b.a($$1) >= 0.0F;
   }

   @Override
   public eln a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(ele[] $$0, ele $$1) {
      int $$2 = 0;
      int $$3 = 0;
      elj $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      elj $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.b.a($$4) >= 0.0F && $$5 != elj.w) {
         $$3 = axk.d(Math.max(1.0F, this.b.dG()));
      }

      double $$6 = this.d(new ib($$1.a, $$1.b, $$1.c));

      for (ih $$7 : ih.c.a) {
         ele $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (ih $$9 : ih.c.a) {
         ih $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            ele $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable ele $$0, ele $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(ele $$0, @Nullable ele $$1, @Nullable ele $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != elj.d && $$2.l != elj.d) {
         boolean $$3 = $$2.l == elj.h && $$1.l == elj.h && (double)this.b.dg() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable ele $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == elj.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(elj $$0) {
      return $$0 == elj.h || $$0 == elj.s || $$0 == elj.t;
   }

   private boolean b(ele $$0) {
      erv $$1 = this.b.cH();
      esa $$2 = new esa((double)$$0.a - this.b.dr() + $$1.b() / 2.0, (double)$$0.b - this.b.dt() + $$1.c() / 2.0, (double)$$0.c - this.b.dx() + $$1.d() / 2.0);
      int $$3 = axk.c($$2.f() / $$1.a());
      $$2 = $$2.a((double)(1.0F / (float)$$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(ib $$0) {
      cyd $$1 = this.a.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(avh.a) ? (double)$$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(cyd $$0, ib $$1) {
      ib $$2 = $$1.d();
      est $$3 = $$0.a_($$2).k($$0, $$2);
      return (double)$$2.v() + ($$3.c() ? 0.0 : $$3.c(ih.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected ele a(int $$0, int $$1, int $$2, int $$3, double $$4, ih $$5, elj $$6) {
      ele $$7 = null;
      ib.a $$8 = new ib.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         elj $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.b.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != elj.c && (!this.c() || $$10 != elj.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != elj.h || this.g()) && $$10 != elj.m && $$10 != elj.e && $$10 != elj.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == elj.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == elj.b) {
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
      return Math.max(1.125, (double)this.b.dG());
   }

   private ele a(int $$0, int $$1, int $$2, elj $$3, float $$4) {
      ele $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private ele a(int $$0, int $$1, int $$2) {
      ele $$3 = this.c($$0, $$1, $$2);
      $$3.l = elj.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private ele a(int $$0, int $$1, int $$2, elj $$3) {
      ele $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private ele a(int $$0, int $$1, int $$2, int $$3, double $$4, ih $$5, elj $$6, ib.a $$7) {
      ele $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.b.dg() >= 1.0F) {
         return $$8;
      } else if ($$8.l != elj.b && $$8.l != elj.c) {
         return $$8;
      } else {
         double $$9 = (double)($$0 - $$5.j()) + 0.5;
         double $$10 = (double)($$2 - $$5.l()) + 0.5;
         double $$11 = (double)this.b.dg() / 2.0;
         erv $$12 = new erv(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            (double)this.b.dh() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private ele a(int $$0, int $$1, int $$2, @Nullable ele $$3) {
      $$1--;

      while ($$1 > this.b.dM().I_()) {
         elj $$4 = this.b($$0, $$1, $$2);
         if ($$4 != elj.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.b.a($$4));
         $$1--;
      }

      return $$3;
   }

   private ele d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.b.dM().I_(); $$3--) {
         if ($$1 - $$3 > this.b.cu()) {
            return this.a($$0, $$3, $$2);
         }

         elj $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.b.a($$4);
         if ($$4 != elj.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(erv $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.a.a().a(this.b, $$0));
   }

   protected elj b(int $$0, int $$1, int $$2) {
      return (elj)this.m.computeIfAbsent(ib.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public elj a(ell $$0, int $$1, int $$2, int $$3, bqq $$4) {
      Set<elj> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(elj.h)) {
         return elj.h;
      } else if ($$5.contains(elj.m)) {
         return elj.m;
      } else {
         elj $$6 = elj.a;

         for (elj $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.d <= 1 && $$6 != elj.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == elj.b ? elj.b : $$6;
      }
   }

   public Set<elj> b(ell $$0, int $$1, int $$2, int $$3) {
      EnumSet<elj> $$4 = EnumSet.noneOf(elj.class);

      for (int $$5 = 0; $$5 < this.d; $$5++) {
         for (int $$6 = 0; $$6 < this.e; $$6++) {
            for (int $$7 = 0; $$7 < this.f; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               elj $$11 = this.a($$0, $$8, $$9, $$10);
               ib $$12 = this.b.dm();
               boolean $$13 = this.d();
               if ($$11 == elj.s && this.e() && $$13) {
                  $$11 = elj.d;
               }

               if ($$11 == elj.r && !$$13) {
                  $$11 = elj.a;
               }

               if ($$11 == elj.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != elj.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != elj.l) {
                  $$11 = elj.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public elj a(ell $$0, int $$1, int $$2, int $$3) {
      return a($$0, new ib.a($$1, $$2, $$3));
   }

   public static elj b(bqq $$0, ib $$1) {
      return a(new ell($$0.dM(), $$0), $$1.j());
   }

   public static elj a(ell $$0, ib.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      elj $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == elj.b && $$3 >= $$0.a().I_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> elj.b;
            case o -> elj.o;
            case q -> elj.q;
            case w -> elj.w;
            case f -> elj.g;
            case y -> elj.y;
            case e -> elj.z;
            default -> a($$0, $$2, $$3, $$4, elj.c);
         };
      } else {
         return $$5;
      }
   }

   public static elj a(ell $$0, int $$1, int $$2, int $$3, elj $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  elj $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == elj.q) {
                     return elj.p;
                  }

                  if ($$8 == elj.o || $$8 == elj.i) {
                     return elj.n;
                  }

                  if ($$8 == elj.j) {
                     return elj.k;
                  }

                  if ($$8 == elj.y) {
                     return elj.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static elj b(cyd $$0, ib $$1) {
      doz $$2 = $$0.a_($$1);
      dby $$3 = $$2.b();
      if ($$2.i()) {
         return elj.b;
      } else if ($$2.a(avc.P) || $$2.a(dca.fm) || $$2.a(dca.sD)) {
         return elj.e;
      } else if ($$2.a(dca.qP)) {
         return elj.f;
      } else if ($$2.a(dca.dQ) || $$2.a(dca.oi)) {
         return elj.q;
      } else if ($$2.a(dca.pg)) {
         return elj.w;
      } else if ($$2.a(dca.fC)) {
         return elj.x;
      } else if (!$$2.a(dca.cd) && !$$2.a(dca.st)) {
         eks $$4 = $$2.u();
         if ($$4.a(avh.b)) {
            return elj.i;
         } else if (a($$2)) {
            return elj.o;
         } else if ($$3 instanceof dee $$5) {
            if ($$2.c(dee.c)) {
               return elj.r;
            } else {
               return $$5.b().c() ? elj.s : elj.t;
            }
         } else if ($$3 instanceof dbn) {
            return elj.l;
         } else if ($$3 instanceof dgh) {
            return elj.v;
         } else if (!$$2.a(avc.S) && !$$2.a(avc.L) && (!($$3 instanceof dex) || $$2.c(dex.b))) {
            if (!$$2.a(elh.a)) {
               return elj.a;
            } else {
               return $$4.a(avh.a) ? elj.j : elj.b;
            }
         } else {
            return elj.h;
         }
      } else {
         return elj.y;
      }
   }
}
