import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;

public class eyn {
   private static final int c = 2;
   public static final int a = 21;
   private static final int d = 3;
   public static final int b = 21;
   private static final ebd.f e = ($$0, $$1, $$2) -> $$0.a(dne.cy);
   private static final float f = 4.0F;
   private static final double g = 1.0;
   private final jb.a h;
   private final jb i;
   private final int j;
   private final iv k;
   private final int l;
   private final int m;

   private eyn(jb.a $$0, int $$1, jb $$2, iv $$3, int $$4, int $$5) {
      this.h = $$0;
      this.j = $$1;
      this.i = $$2;
      this.k = $$3;
      this.m = $$4;
      this.l = $$5;
   }

   public static Optional<eyn> a(djy $$0, iv $$1, jb.a $$2) {
      return a($$0, $$1, $$0x -> $$0x.a() && $$0x.j == 0, $$2);
   }

   public static Optional<eyn> a(djy $$0, iv $$1, Predicate<eyn> $$2, jb.a $$3) {
      Optional<eyn> $$4 = Optional.of(a((djb)$$0, $$1, $$3)).filter($$2);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         jb.a $$5 = $$3 == jb.a.a ? jb.a.c : jb.a.a;
         return Optional.of(a((djb)$$0, $$1, $$5)).filter($$2);
      }
   }

   public static eyn a(djb $$0, iv $$1, jb.a $$2) {
      jb $$3 = $$2 == jb.a.a ? jb.e : jb.d;
      iv $$4 = a($$0, $$3, $$1);
      if ($$4 == null) {
         return new eyn($$2, 0, $$3, $$1, 0, 0);
      } else {
         int $$5 = a($$0, $$4, $$3);
         if ($$5 == 0) {
            return new eyn($$2, 0, $$3, $$4, 0, 0);
         } else {
            MutableInt $$6 = new MutableInt();
            int $$7 = a($$0, $$4, $$3, $$5, $$6);
            return new eyn($$2, $$6.getValue(), $$3, $$4, $$5, $$7);
         }
      }
   }

   @Nullable
   private static iv a(djb $$0, jb $$1, iv $$2) {
      int $$3 = Math.max($$0.K_(), $$2.v() - 21);

      while ($$2.v() > $$3 && a($$0.a_($$2.e()))) {
         $$2 = $$2.e();
      }

      jb $$4 = $$1.g();
      int $$5 = b($$0, $$2, $$4) - 1;
      return $$5 < 0 ? null : $$2.a($$4, $$5);
   }

   private static int a(djb $$0, iv $$1, jb $$2) {
      int $$3 = b($$0, $$1, $$2);
      return $$3 >= 2 && $$3 <= 21 ? $$3 : 0;
   }

   private static int b(djb $$0, iv $$1, jb $$2) {
      iv.a $$3 = new iv.a();

      for (int $$4 = 0; $$4 <= 21; $$4++) {
         $$3.g($$1).c($$2, $$4);
         ebe $$5 = $$0.a_($$3);
         if (!a($$5)) {
            if (e.test($$5, $$0, $$3)) {
               return $$4;
            }
            break;
         }

         ebe $$6 = $$0.a_($$3.c(jb.a));
         if (!e.test($$6, $$0, $$3)) {
            break;
         }
      }

      return 0;
   }

   private static int a(djb $$0, iv $$1, jb $$2, int $$3, MutableInt $$4) {
      iv.a $$5 = new iv.a();
      int $$6 = a($$0, $$1, $$2, $$5, $$3, $$4);
      return $$6 >= 3 && $$6 <= 21 && a($$0, $$1, $$2, $$5, $$3, $$6) ? $$6 : 0;
   }

   private static boolean a(djb $$0, iv $$1, jb $$2, iv.a $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         iv.a $$7 = $$3.g($$1).c(jb.b, $$5).c($$2, $$6);
         if (!e.test($$0.a_($$7), $$0, $$7)) {
            return false;
         }
      }

      return true;
   }

   private static int a(djb $$0, iv $$1, jb $$2, iv.a $$3, int $$4, MutableInt $$5) {
      for (int $$6 = 0; $$6 < 21; $$6++) {
         $$3.g($$1).c(jb.b, $$6).c($$2, -1);
         if (!e.test($$0.a_($$3), $$0, $$3)) {
            return $$6;
         }

         $$3.g($$1).c(jb.b, $$6).c($$2, $$4);
         if (!e.test($$0.a_($$3), $$0, $$3)) {
            return $$6;
         }

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$3.g($$1).c(jb.b, $$6).c($$2, $$7);
            ebe $$8 = $$0.a_($$3);
            if (!a($$8)) {
               return $$6;
            }

            if ($$8.a(dne.eu)) {
               $$5.increment();
            }
         }
      }

      return 21;
   }

   private static boolean a(ebe $$0) {
      return $$0.l() || $$0.a(axe.aN) || $$0.a(dne.eu);
   }

   public boolean a() {
      return this.m >= 2 && this.m <= 21 && this.l >= 3 && this.l <= 21;
   }

   public void a(djy $$0) {
      ebe $$1 = dne.eu.m().b(dsn.b, this.h);
      iv.c(this.k, this.k.a(jb.b, this.l - 1).a(this.i, this.m - 1)).forEach($$2 -> $$0.a($$2, $$1, 18));
   }

   public boolean b() {
      return this.a() && this.j == this.m * this.l;
   }

   public static ffq a(m.a $$0, jb.a $$1, ffq $$2, bww $$3) {
      double $$4 = (double)$$0.b - (double)$$3.a();
      double $$5 = (double)$$0.c - (double)$$3.b();
      iv $$6 = $$0.a;
      double $$8;
      if ($$4 > 0.0) {
         double $$7 = (double)$$6.a($$1) + (double)$$3.a() / 2.0;
         $$8 = azo.a(azo.c($$2.a($$1) - $$7, 0.0, $$4), 0.0, 1.0);
      } else {
         $$8 = 0.5;
      }

      double $$11;
      if ($$5 > 0.0) {
         jb.a $$10 = jb.a.b;
         $$11 = azo.a(azo.c($$2.a($$10) - (double)$$6.a($$10), 0.0, $$5), 0.0, 1.0);
      } else {
         $$11 = 0.0;
      }

      jb.a $$13 = $$1 == jb.a.a ? jb.a.c : jb.a.a;
      double $$14 = $$2.a($$13) - ((double)$$6.a($$13) + 0.5);
      return new ffq($$8, $$11, $$14);
   }

   public static ffq a(ffq $$0, ars $$1, bwt $$2, bww $$3) {
      if (!($$3.a() > 4.0F) && !($$3.b() > 4.0F)) {
         double $$4 = (double)$$3.b() / 2.0;
         ffq $$5 = $$0.b(0.0, $$4, 0.0);
         fgk $$6 = fgh.a(ffl.a($$5, (double)$$3.a(), 0.0, (double)$$3.a()).b(0.0, 1.0, 0.0).g(1.0E-6));
         Optional<ffq> $$7 = $$1.a($$2, $$6, $$5, (double)$$3.a(), (double)$$3.b(), (double)$$3.a());
         Optional<ffq> $$8 = $$7.map($$1x -> $$1x.a(0.0, $$4, 0.0));
         return $$8.orElse($$0);
      } else {
         return $$0;
      }
   }
}
