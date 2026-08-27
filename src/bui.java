import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bui {
   private bui() {
   }

   public static void a(bso $$0, bso $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(btp<?> $$0, bso $$1) {
      Optional<cbt> $$2 = $$0.c(cbr.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(btp<?> $$0, cbr<? extends bso> $$1, bsb<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ak() == $$2);
   }

   private static boolean a(btp<?> $$0, cbr<? extends bso> $$1, Predicate<bso> $$2) {
      return $$0.c($$1).filter($$2).filter(bso::bI).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bso $$0, bso $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bso $$0, bso $$1) {
      $$0.dZ().a(cbr.n, new bur($$1, true));
   }

   private static void b(bso $$0, bso $$1, float $$2, int $$3) {
      a($$0, (brv)$$1, $$2, $$3);
      a($$1, (brv)$$0, $$2, $$3);
   }

   public static void a(bso $$0, brv $$1, float $$2, int $$3) {
      a($$0, new bur($$1, true), $$2, $$3);
   }

   public static void a(bso $$0, ir $$1, float $$2, int $$3) {
      a($$0, new buj($$1), $$2, $$3);
   }

   public static void a(bso $$0, bvu $$1, float $$2, int $$3) {
      cbu $$4 = new cbu($$1, $$2, $$3);
      $$0.dZ().a(cbr.n, $$1);
      $$0.dZ().a(cbr.m, $$4);
   }

   public static void a(bso $$0, cuh $$1, ewu $$2) {
      ewu $$3 = new ewu(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bso $$0, cuh $$1, ewu $$2, ewu $$3, float $$4) {
      double $$5 = $$0.dD() - (double)$$4;
      cig $$6 = new cig($$0.dU(), $$0.dz(), $$5, $$0.dF(), $$1);
      $$6.b($$0);
      ewu $$7 = $$2.d($$0.ds());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.u();
      $$0.dU().b($$6);
   }

   public static jt a(aqt $$0, jt $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jt.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bsq $$0, bso $$1, int $$2) {
      if ($$0.fg().f() instanceof cvi $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bso $$0, bso $$1, double $$2) {
      Optional<bso> $$3 = $$0.dZ().c(cbr.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().ds());
         double $$5 = $$0.f($$1.ds());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bso $$0, bso $$1) {
      btp<?> $$2 = $$0.dZ();
      return !$$2.a(cbr.h) ? false : $$2.c(cbr.h).get().a($$1);
   }

   public static bso a(bso $$0, Optional<bso> $$1, bso $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bso a(bso $$0, bso $$1, bso $$2) {
      ewu $$3 = $$1.ds();
      ewu $$4 = $$2.ds();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bso> a(bso $$0, cbr<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dZ().c($$1);
      return $$2.<brv>map($$1x -> ((aqt)$$0.dU()).a($$1x)).map($$0x -> $$0x instanceof bso $$1x ? $$1x : null);
   }

   @Nullable
   public static ewu a(bsw $$0, int $$1, int $$2) {
      ewu $$3 = cdi.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dU().a_(ir.a($$3)).a(ept.b) && $$4++ < 10) {
         $$3 = cdi.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bso $$0) {
      return $$0.dZ().a(cbr.r);
   }
}
