import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsn {
   private bsn() {
   }

   public static void a(bqt $$0, bqt $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bru<?> $$0, bqt $$1) {
      Optional<bzy> $$2 = $$0.c(bzw.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bru<?> $$0, bzw<? extends bqt> $$1, bqg<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bru<?> $$0, bzw<? extends bqt> $$1, Predicate<bqt> $$2) {
      return $$0.c($$1).filter($$2).filter(bqt::bA).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bqt $$0, bqt $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bqt $$0, bqt $$1) {
      $$0.dP().a(bzw.n, new bsw($$1, true));
   }

   private static void b(bqt $$0, bqt $$1, float $$2, int $$3) {
      a($$0, (bqa)$$1, $$2, $$3);
      a($$1, (bqa)$$0, $$2, $$3);
   }

   public static void a(bqt $$0, bqa $$1, float $$2, int $$3) {
      a($$0, new bsw($$1, true), $$2, $$3);
   }

   public static void a(bqt $$0, id $$1, float $$2, int $$3) {
      a($$0, new bso($$1), $$2, $$3);
   }

   public static void a(bqt $$0, btz $$1, float $$2, int $$3) {
      bzz $$4 = new bzz($$1, $$2, $$3);
      $$0.dP().a(bzw.n, $$1);
      $$0.dP().a(bzw.m, $$4);
   }

   public static void a(bqt $$0, crs $$1, esj $$2) {
      esj $$3 = new esj(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bqt $$0, crs $$1, esj $$2, esj $$3, float $$4) {
      double $$5 = $$0.dv() - (double)$$4;
      cgk $$6 = new cgk($$0.dM(), $$0.dr(), $$5, $$0.dx(), $$1);
      $$6.b($$0);
      esj $$7 = $$2.d($$0.dk());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.v();
      $$0.dM().b($$6);
   }

   public static jg a(apu $$0, jg $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jg.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bqv $$0, bqt $$1, int $$2) {
      if ($$0.eU().f() instanceof csi $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bqt $$0, bqt $$1, double $$2) {
      Optional<bqt> $$3 = $$0.dP().c(bzw.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dk());
         double $$5 = $$0.f($$1.dk());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bqt $$0, bqt $$1) {
      bru<?> $$2 = $$0.dP();
      return !$$2.a(bzw.h) ? false : $$2.c(bzw.h).get().a($$1);
   }

   public static bqt a(bqt $$0, Optional<bqt> $$1, bqt $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bqt a(bqt $$0, bqt $$1, bqt $$2) {
      esj $$3 = $$1.dk();
      esj $$4 = $$2.dk();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bqt> a(bqt $$0, bzw<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dP().c($$1);
      return $$2.<bqa>map($$1x -> ((apu)$$0.dM()).a($$1x)).map($$0x -> $$0x instanceof bqt $$1x ? $$1x : null);
   }

   @Nullable
   public static esj a(brb $$0, int $$1, int $$2) {
      esj $$3 = cbn.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dM().a_(id.a($$3)).a(elq.b) && $$4++ < 10) {
         $$3 = cbn.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bqt $$0) {
      return $$0.dP().a(bzw.r);
   }
}
