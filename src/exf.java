import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;

public class exf {
   private static final int c = 2;
   public static final int a = 21;
   private static final int d = 3;
   public static final int b = 21;
   private static final dzy.f e = ($$0, $$1, $$2) -> $$0.a(dmc.cw);
   private static final float f = 4.0F;
   private static final double g = 1.0;
   private final ja.a h;
   private final ja i;
   private final int j;
   private final iu k;
   private final int l;
   private final int m;

   private exf(ja.a $$0, int $$1, ja $$2, iu $$3, int $$4, int $$5) {
      this.h = $$0;
      this.j = $$1;
      this.i = $$2;
      this.k = $$3;
      this.m = $$4;
      this.l = $$5;
   }

   public static Optional<exf> a(diw $$0, iu $$1, ja.a $$2) {
      return a($$0, $$1, $$0x -> $$0x.a() && $$0x.j == 0, $$2);
   }

   public static Optional<exf> a(diw $$0, iu $$1, Predicate<exf> $$2, ja.a $$3) {
      Optional<exf> $$4 = Optional.of(a((dib)$$0, $$1, $$3)).filter($$2);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ja.a $$5 = $$3 == ja.a.a ? ja.a.c : ja.a.a;
         return Optional.of(a((dib)$$0, $$1, $$5)).filter($$2);
      }
   }

   public static exf a(dib $$0, iu $$1, ja.a $$2) {
      ja $$3 = $$2 == ja.a.a ? ja.e : ja.d;
      iu $$4 = a($$0, $$3, $$1);
      if ($$4 == null) {
         return new exf($$2, 0, $$3, $$1, 0, 0);
      } else {
         int $$5 = a($$0, $$4, $$3);
         if ($$5 == 0) {
            return new exf($$2, 0, $$3, $$4, 0, 0);
         } else {
            MutableInt $$6 = new MutableInt();
            int $$7 = a($$0, $$4, $$3, $$5, $$6);
            return new exf($$2, $$6.getValue(), $$3, $$4, $$5, $$7);
         }
      }
   }

   @Nullable
   private static iu a(dib $$0, ja $$1, iu $$2) {
      int $$3 = Math.max($$0.G_(), $$2.v() - 21);

      while ($$2.v() > $$3 && a($$0.a_($$2.e()))) {
         $$2 = $$2.e();
      }

      ja $$4 = $$1.g();
      int $$5 = b($$0, $$2, $$4) - 1;
      return $$5 < 0 ? null : $$2.a($$4, $$5);
   }

   private static int a(dib $$0, iu $$1, ja $$2) {
      int $$3 = b($$0, $$1, $$2);
      return $$3 >= 2 && $$3 <= 21 ? $$3 : 0;
   }

   private static int b(dib $$0, iu $$1, ja $$2) {
      iu.a $$3 = new iu.a();

      for (int $$4 = 0; $$4 <= 21; $$4++) {
         $$3.g($$1).c($$2, $$4);
         dzz $$5 = $$0.a_($$3);
         if (!a($$5)) {
            if (e.test($$5, $$0, $$3)) {
               return $$4;
            }
            break;
         }

         dzz $$6 = $$0.a_($$3.c(ja.a));
         if (!e.test($$6, $$0, $$3)) {
            break;
         }
      }

      return 0;
   }

   private static int a(dib $$0, iu $$1, ja $$2, int $$3, MutableInt $$4) {
      iu.a $$5 = new iu.a();
      int $$6 = a($$0, $$1, $$2, $$5, $$3, $$4);
      return $$6 >= 3 && $$6 <= 21 && a($$0, $$1, $$2, $$5, $$3, $$6) ? $$6 : 0;
   }

   private static boolean a(dib $$0, iu $$1, ja $$2, iu.a $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         iu.a $$7 = $$3.g($$1).c(ja.b, $$5).c($$2, $$6);
         if (!e.test($$0.a_($$7), $$0, $$7)) {
            return false;
         }
      }

      return true;
   }

   private static int a(dib $$0, iu $$1, ja $$2, iu.a $$3, int $$4, MutableInt $$5) {
      for (int $$6 = 0; $$6 < 21; $$6++) {
         $$3.g($$1).c(ja.b, $$6).c($$2, -1);
         if (!e.test($$0.a_($$3), $$0, $$3)) {
            return $$6;
         }

         $$3.g($$1).c(ja.b, $$6).c($$2, $$4);
         if (!e.test($$0.a_($$3), $$0, $$3)) {
            return $$6;
         }

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$3.g($$1).c(ja.b, $$6).c($$2, $$7);
            dzz $$8 = $$0.a_($$3);
            if (!a($$8)) {
               return $$6;
            }

            if ($$8.a(dmc.er)) {
               $$5.increment();
            }
         }
      }

      return 21;
   }

   private static boolean a(dzz $$0) {
      return $$0.l() || $$0.a(axc.aN) || $$0.a(dmc.er);
   }

   public boolean a() {
      return this.m >= 2 && this.m <= 21 && this.l >= 3 && this.l <= 21;
   }

   public void a(diw $$0) {
      dzz $$1 = dmc.er.m().b(drk.b, this.h);
      iu.c(this.k, this.k.a(ja.b, this.l - 1).a(this.i, this.m - 1)).forEach($$2 -> $$0.a($$2, $$1, 18));
   }

   public boolean b() {
      return this.a() && this.j == this.m * this.l;
   }

   public static fei a(l.a $$0, ja.a $$1, fei $$2, bwg $$3) {
      double $$4 = (double)$$0.b - (double)$$3.a();
      double $$5 = (double)$$0.c - (double)$$3.b();
      iu $$6 = $$0.a;
      double $$8;
      if ($$4 > 0.0) {
         double $$7 = (double)$$6.a($$1) + (double)$$3.a() / 2.0;
         $$8 = azm.a(azm.c($$2.a($$1) - $$7, 0.0, $$4), 0.0, 1.0);
      } else {
         $$8 = 0.5;
      }

      double $$11;
      if ($$5 > 0.0) {
         ja.a $$10 = ja.a.b;
         $$11 = azm.a(azm.c($$2.a($$10) - (double)$$6.a($$10), 0.0, $$5), 0.0, 1.0);
      } else {
         $$11 = 0.0;
      }

      ja.a $$13 = $$1 == ja.a.a ? ja.a.c : ja.a.a;
      double $$14 = $$2.a($$13) - ((double)$$6.a($$13) + 0.5);
      return new fei($$8, $$11, $$14);
   }

   public static fei a(fei $$0, arq $$1, bwd $$2, bwg $$3) {
      if (!($$3.a() > 4.0F) && !($$3.b() > 4.0F)) {
         double $$4 = (double)$$3.b() / 2.0;
         fei $$5 = $$0.b(0.0, $$4, 0.0);
         ffc $$6 = fez.a(fed.a($$5, (double)$$3.a(), 0.0, (double)$$3.a()).b(0.0, 1.0, 0.0).g(1.0E-6));
         Optional<fei> $$7 = $$1.a($$2, $$6, $$5, (double)$$3.a(), (double)$$3.b(), (double)$$3.a());
         Optional<fei> $$8 = $$7.map($$1x -> $$1x.a(0.0, $$4, 0.0));
         return $$8.orElse($$0);
      } else {
         return $$0;
      }
   }
}
