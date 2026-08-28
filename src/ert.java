import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ert {
   private static final int c = 2;
   public static final int a = 21;
   private static final int d = 3;
   public static final int b = 21;
   private static final dur.f e = ($$0, $$1, $$2) -> $$0.a(dho.co);
   private static final float f = 4.0F;
   private static final double g = 1.0;
   private final dek h;
   private final jk.a i;
   private final jk j;
   private int k;
   @Nullable
   private jf l;
   private int m;
   private final int n;

   public static Optional<ert> a(dek $$0, jf $$1, jk.a $$2) {
      return a($$0, $$1, $$0x -> $$0x.a() && $$0x.k == 0, $$2);
   }

   public static Optional<ert> a(dek $$0, jf $$1, Predicate<ert> $$2, jk.a $$3) {
      Optional<ert> $$4 = Optional.of(new ert($$0, $$1, $$3)).filter($$2);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         jk.a $$5 = $$3 == jk.a.a ? jk.a.c : jk.a.a;
         return Optional.of(new ert($$0, $$1, $$5)).filter($$2);
      }
   }

   public ert(dek $$0, jf $$1, jk.a $$2) {
      this.h = $$0;
      this.i = $$2;
      this.j = $$2 == jk.a.a ? jk.e : jk.d;
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
   private jf a(jf $$0) {
      int $$1 = Math.max(this.h.H_(), $$0.v() - 21);

      while ($$0.v() > $$1 && a(this.h.a_($$0.e()))) {
         $$0 = $$0.e();
      }

      jk $$2 = this.j.g();
      int $$3 = this.a($$0, $$2) - 1;
      return $$3 < 0 ? null : $$0.a($$2, $$3);
   }

   private int d() {
      int $$0 = this.a(this.l, this.j);
      return $$0 >= 2 && $$0 <= 21 ? $$0 : 0;
   }

   private int a(jf $$0, jk $$1) {
      jf.a $$2 = new jf.a();

      for (int $$3 = 0; $$3 <= 21; $$3++) {
         $$2.g($$0).c($$1, $$3);
         dus $$4 = this.h.a_($$2);
         if (!a($$4)) {
            if (e.test($$4, this.h, $$2)) {
               return $$3;
            }
            break;
         }

         dus $$5 = this.h.a_($$2.c(jk.a));
         if (!e.test($$5, this.h, $$2)) {
            break;
         }
      }

      return 0;
   }

   private int e() {
      jf.a $$0 = new jf.a();
      int $$1 = this.a($$0);
      return $$1 >= 3 && $$1 <= 21 && this.a($$0, $$1) ? $$1 : 0;
   }

   private boolean a(jf.a $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.n; $$2++) {
         jf.a $$3 = $$0.g(this.l).c(jk.b, $$1).c(this.j, $$2);
         if (!e.test(this.h.a_($$3), this.h, $$3)) {
            return false;
         }
      }

      return true;
   }

   private int a(jf.a $$0) {
      for (int $$1 = 0; $$1 < 21; $$1++) {
         $$0.g(this.l).c(jk.b, $$1).c(this.j, -1);
         if (!e.test(this.h.a_($$0), this.h, $$0)) {
            return $$1;
         }

         $$0.g(this.l).c(jk.b, $$1).c(this.j, this.n);
         if (!e.test(this.h.a_($$0), this.h, $$0)) {
            return $$1;
         }

         for (int $$2 = 0; $$2 < this.n; $$2++) {
            $$0.g(this.l).c(jk.b, $$1).c(this.j, $$2);
            dus $$3 = this.h.a_($$0);
            if (!a($$3)) {
               return $$1;
            }

            if ($$3.a(dho.ed)) {
               this.k++;
            }
         }
      }

      return 21;
   }

   private static boolean a(dus $$0) {
      return $$0.l() || $$0.a(awv.aL) || $$0.a(dho.ed);
   }

   public boolean a() {
      return this.l != null && this.n >= 2 && this.n <= 21 && this.m >= 3 && this.m <= 21;
   }

   public void b() {
      dus $$0 = dho.ed.n().b(dmq.b, this.i);
      jf.c(this.l, this.l.a(jk.b, this.m - 1).a(this.j, this.n - 1)).forEach($$1 -> this.h.a($$1, $$0, 18));
   }

   public boolean c() {
      return this.a() && this.k == this.n * this.m;
   }

   public static eyw a(l.a $$0, jk.a $$1, eyw $$2, btu $$3) {
      double $$4 = (double)$$0.b - (double)$$3.a();
      double $$5 = (double)$$0.c - (double)$$3.b();
      jf $$6 = $$0.a;
      double $$8;
      if ($$4 > 0.0) {
         double $$7 = (double)$$6.a($$1) + (double)$$3.a() / 2.0;
         $$8 = azf.a(azf.c($$2.a($$1) - $$7, 0.0, $$4), 0.0, 1.0);
      } else {
         $$8 = 0.5;
      }

      double $$11;
      if ($$5 > 0.0) {
         jk.a $$10 = jk.a.b;
         $$11 = azf.a(azf.c($$2.a($$10) - (double)$$6.a($$10), 0.0, $$5), 0.0, 1.0);
      } else {
         $$11 = 0.0;
      }

      jk.a $$13 = $$1 == jk.a.a ? jk.a.c : jk.a.a;
      double $$14 = $$2.a($$13) - ((double)$$6.a($$13) + 0.5);
      return new eyw($$8, $$11, $$14);
   }

   public static eyw a(eyw $$0, arj $$1, btr $$2, btu $$3) {
      if (!($$3.a() > 4.0F) && !($$3.b() > 4.0F)) {
         double $$4 = (double)$$3.b() / 2.0;
         eyw $$5 = $$0.b(0.0, $$4, 0.0);
         ezq $$6 = ezn.a(eyr.a($$5, (double)$$3.a(), 0.0, (double)$$3.a()).b(0.0, 1.0, 0.0).g(1.0E-6));
         Optional<eyw> $$7 = $$1.a($$2, $$6, $$5, (double)$$3.a(), (double)$$3.b(), (double)$$3.a());
         Optional<eyw> $$8 = $$7.map($$1x -> $$1x.a(0.0, $$4, 0.0));
         return $$8.orElse($$0);
      } else {
         return $$0;
      }
   }
}
