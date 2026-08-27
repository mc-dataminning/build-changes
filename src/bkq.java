import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bkq {
   private bkq() {
   }

   public static void a(biw $$0, biw $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bjx<?> $$0, biw $$1) {
      Optional<bsa> $$2 = $$0.c(bry.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bjx<?> $$0, bry<? extends biw> $$1, bik<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ag() == $$2);
   }

   private static boolean a(bjx<?> $$0, bry<? extends biw> $$1, Predicate<biw> $$2) {
      return $$0.c($$1).filter($$2).filter(biw::bv).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(biw $$0, biw $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(biw $$0, biw $$1) {
      $$0.dM().a(bry.n, new bkz($$1, true));
   }

   private static void b(biw $$0, biw $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(biw $$0, big $$1, float $$2, int $$3) {
      a($$0, new bkz($$1, true), $$2, $$3);
   }

   public static void a(biw $$0, gv $$1, float $$2, int $$3) {
      a($$0, new bkr($$1), $$2, $$3);
   }

   public static void a(biw $$0, bmb $$1, float $$2, int $$3) {
      bsb $$4 = new bsb($$1, $$2, $$3);
      $$0.dM().a(bry.n, $$1);
      $$0.dM().a(bry.m, $$4);
   }

   public static void a(biw $$0, ciw $$1, ehf $$2) {
      ehf $$3 = new ehf(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(biw $$0, ciw $$1, ehf $$2, ehf $$3, float $$4) {
      double $$5 = $$0.dt() - (double)$$4;
      bye $$6 = new bye($$0.dK(), $$0.dp(), $$5, $$0.dv(), $$1);
      $$6.c($$0.cv());
      ehf $$7 = $$2.d($$0.di());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.f($$7);
      $$6.o();
      $$0.dK().b($$6);
   }

   public static hy a(aki $$0, hy $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return hy.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(biy $$0, biw $$1, int $$2) {
      if ($$0.eR().d() instanceof cjm $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.k($$1);
   }

   public static boolean a(biw $$0, biw $$1, double $$2) {
      Optional<biw> $$3 = $$0.dM().c(bry.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.e($$3.get().di());
         double $$5 = $$0.e($$1.di());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(biw $$0, biw $$1) {
      bjx<?> $$2 = $$0.dM();
      return !$$2.a(bry.h) ? false : $$2.c(bry.h).get().a($$1);
   }

   public static biw a(biw $$0, Optional<biw> $$1, biw $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static biw a(biw $$0, biw $$1, biw $$2) {
      ehf $$3 = $$1.di();
      ehf $$4 = $$2.di();
      return $$0.e($$3) < $$0.e($$4) ? $$1 : $$2;
   }

   public static Optional<biw> a(biw $$0, bry<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dM().c($$1);
      return $$2.<big>map($$1x -> ((aki)$$0.dK()).a($$1x)).map($$0x -> $$0x instanceof biw $$1x ? $$1x : null);
   }

   @Nullable
   public static ehf a(bjf $$0, int $$1, int $$2) {
      ehf $$3 = btn.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dK().a_(gv.a($$3)).a($$0.dK(), gv.a($$3), ear.b) && $$4++ < 10) {
         $$3 = btn.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(biw $$0) {
      return $$0.dM().a(bry.r);
   }
}
