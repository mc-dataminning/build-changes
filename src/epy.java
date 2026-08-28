import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class epy {
   private static final int c = 2;
   public static final int a = 21;
   private static final int d = 3;
   public static final int b = 21;
   private static final dsz.f e = ($$0, $$1, $$2) -> $$0.a(dfy.co);
   private static final float f = 4.0F;
   private static final double g = 1.0;
   private final dcv h;
   private final ji.a i;
   private final ji j;
   private int k;
   @Nullable
   private jd l;
   private int m;
   private final int n;

   public static Optional<epy> a(dcv $$0, jd $$1, ji.a $$2) {
      return a($$0, $$1, $$0x -> $$0x.a() && $$0x.k == 0, $$2);
   }

   public static Optional<epy> a(dcv $$0, jd $$1, Predicate<epy> $$2, ji.a $$3) {
      Optional<epy> $$4 = Optional.of(new epy($$0, $$1, $$3)).filter($$2);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ji.a $$5 = $$3 == ji.a.a ? ji.a.c : ji.a.a;
         return Optional.of(new epy($$0, $$1, $$5)).filter($$2);
      }
   }

   public epy(dcv $$0, jd $$1, ji.a $$2) {
      this.h = $$0;
      this.i = $$2;
      this.j = $$2 == ji.a.a ? ji.e : ji.d;
      this.l = this.a($$1);
      if (this.l == null) {
         this.l = $$1;
         this.n = 1;
         this.m = 1;
      } else {
         this.n = this.d();
         if (this.n > 0) {
            this.m = this.e();
         }
      }
   }

   @Nullable
   private jd a(jd $$0) {
      int $$1 = Math.max(this.h.I_(), $$0.v() - 21);

      while ($$0.v() > $$1 && a(this.h.a_($$0.d()))) {
         $$0 = $$0.d();
      }

      ji $$2 = this.j.g();
      int $$3 = this.a($$0, $$2) - 1;
      return $$3 < 0 ? null : $$0.a($$2, $$3);
   }

   private int d() {
      int $$0 = this.a(this.l, this.j);
      return $$0 >= 2 && $$0 <= 21 ? $$0 : 0;
   }

   private int a(jd $$0, ji $$1) {
      jd.a $$2 = new jd.a();

      for (int $$3 = 0; $$3 <= 21; $$3++) {
         $$2.g($$0).c($$1, $$3);
         dta $$4 = this.h.a_($$2);
         if (!a($$4)) {
            if (e.test($$4, this.h, $$2)) {
               return $$3;
            }
            break;
         }

         dta $$5 = this.h.a_($$2.c(ji.a));
         if (!e.test($$5, this.h, $$2)) {
            break;
         }
      }

      return 0;
   }

   private int e() {
      jd.a $$0 = new jd.a();
      int $$1 = this.a($$0);
      return $$1 >= 3 && $$1 <= 21 && this.a($$0, $$1) ? $$1 : 0;
   }

   private boolean a(jd.a $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.n; $$2++) {
         jd.a $$3 = $$0.g(this.l).c(ji.b, $$1).c(this.j, $$2);
         if (!e.test(this.h.a_($$3), this.h, $$3)) {
            return false;
         }
      }

      return true;
   }

   private int a(jd.a $$0) {
      for (int $$1 = 0; $$1 < 21; $$1++) {
         $$0.g(this.l).c(ji.b, $$1).c(this.j, -1);
         if (!e.test(this.h.a_($$0), this.h, $$0)) {
            return $$1;
         }

         $$0.g(this.l).c(ji.b, $$1).c(this.j, this.n);
         if (!e.test(this.h.a_($$0), this.h, $$0)) {
            return $$1;
         }

         for (int $$2 = 0; $$2 < this.n; $$2++) {
            $$0.g(this.l).c(ji.b, $$1).c(this.j, $$2);
            dta $$3 = this.h.a_($$0);
            if (!a($$3)) {
               return $$1;
            }

            if ($$3.a(dfy.ed)) {
               this.k++;
            }
         }
      }

      return 21;
   }

   private static boolean a(dta $$0) {
      return $$0.i() || $$0.a(awd.aK) || $$0.a(dfy.ed);
   }

   public boolean a() {
      return this.l != null && this.n >= 2 && this.n <= 21 && this.m >= 3 && this.m <= 21;
   }

   public void b() {
      dta $$0 = dfy.ed.o().a(dla.b, this.i);
      jd.c(this.l, this.l.a(ji.b, this.m - 1).a(this.j, this.n - 1)).forEach($$1 -> this.h.a($$1, $$0, 18));
   }

   public boolean c() {
      return this.a() && this.k == this.n * this.m;
   }

   public static eww a(l.a $$0, ji.a $$1, eww $$2, bst $$3) {
      double $$4 = (double)$$0.b - (double)$$3.a();
      double $$5 = (double)$$0.c - (double)$$3.b();
      jd $$6 = $$0.a;
      double $$8;
      if ($$4 > 0.0) {
         double $$7 = (double)$$6.a($$1) + (double)$$3.a() / 2.0;
         $$8 = ayn.a(ayn.c($$2.a($$1) - $$7, 0.0, $$4), 0.0, 1.0);
      } else {
         $$8 = 0.5;
      }

      double $$11;
      if ($$5 > 0.0) {
         ji.a $$10 = ji.a.b;
         $$11 = ayn.a(ayn.c($$2.a($$10) - (double)$$6.a($$10), 0.0, $$5), 0.0, 1.0);
      } else {
         $$11 = 0.0;
      }

      ji.a $$13 = $$1 == ji.a.a ? ji.a.c : ji.a.a;
      double $$14 = $$2.a($$13) - ((double)$$6.a($$13) + 0.5);
      return new eww($$8, $$11, $$14);
   }

   public static eww a(eww $$0, aqt $$1, bsq $$2, bst $$3) {
      if (!($$3.a() > 4.0F) && !($$3.b() > 4.0F)) {
         double $$4 = (double)$$3.b() / 2.0;
         eww $$5 = $$0.b(0.0, $$4, 0.0);
         exp $$6 = exm.a(ewr.a($$5, (double)$$3.a(), 0.0, (double)$$3.a()).b(0.0, 1.0, 0.0).g(1.0E-6));
         Optional<eww> $$7 = $$1.a($$2, $$6, $$5, (double)$$3.a(), (double)$$3.b(), (double)$$3.a());
         Optional<eww> $$8 = $$7.map($$1x -> $$1x.a(0.0, $$4, 0.0));
         return $$8.orElse($$0);
      } else {
         return $$0;
      }
   }
}
