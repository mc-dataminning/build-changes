import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bri {
   private bri() {
   }

   public static void a(bpo $$0, bpo $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bqp<?> $$0, bpo $$1) {
      Optional<byt> $$2 = $$0.c(byr.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bqp<?> $$0, byr<? extends bpo> $$1, bpc<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bqp<?> $$0, byr<? extends bpo> $$1, Predicate<bpo> $$2) {
      return $$0.c($$1).filter($$2).filter(bpo::bA).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bpo $$0, bpo $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bpo $$0, bpo $$1) {
      $$0.dP().a(byr.n, new brr($$1, true));
   }

   private static void b(bpo $$0, bpo $$1, float $$2, int $$3) {
      a($$0, (bow)$$1, $$2, $$3);
      a($$1, (bow)$$0, $$2, $$3);
   }

   public static void a(bpo $$0, bow $$1, float $$2, int $$3) {
      a($$0, new brr($$1, true), $$2, $$3);
   }

   public static void a(bpo $$0, ib $$1, float $$2, int $$3) {
      a($$0, new brj($$1), $$2, $$3);
   }

   public static void a(bpo $$0, bsu $$1, float $$2, int $$3) {
      byu $$4 = new byu($$1, $$2, $$3);
      $$0.dP().a(byr.n, $$1);
      $$0.dP().a(byr.m, $$4);
   }

   public static void a(bpo $$0, cqk $$1, epr $$2) {
      epr $$3 = new epr(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bpo $$0, cqk $$1, epr $$2, epr $$3, float $$4) {
      double $$5 = $$0.dv() - (double)$$4;
      cfd $$6 = new cfd($$0.dM(), $$0.dr(), $$5, $$0.dx(), $$1);
      $$6.b($$0);
      epr $$7 = $$2.d($$0.dk());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.s();
      $$0.dM().b($$6);
   }

   public static je a(apf $$0, je $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return je.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bpq $$0, bpo $$1, int $$2) {
      if ($$0.eU().d() instanceof cra $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bpo $$0, bpo $$1, double $$2) {
      Optional<bpo> $$3 = $$0.dP().c(byr.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dk());
         double $$5 = $$0.f($$1.dk());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bpo $$0, bpo $$1) {
      bqp<?> $$2 = $$0.dP();
      return !$$2.a(byr.h) ? false : $$2.c(byr.h).get().a($$1);
   }

   public static bpo a(bpo $$0, Optional<bpo> $$1, bpo $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bpo a(bpo $$0, bpo $$1, bpo $$2) {
      epr $$3 = $$1.dk();
      epr $$4 = $$2.dk();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bpo> a(bpo $$0, byr<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dP().c($$1);
      return $$2.<bow>map($$1x -> ((apf)$$0.dM()).a($$1x)).map($$0x -> $$0x instanceof bpo $$1x ? $$1x : null);
   }

   @Nullable
   public static epr a(bpw $$0, int $$1, int $$2) {
      epr $$3 = cai.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dM().a_(ib.a($$3)).a($$0.dM(), ib.a($$3), ejd.b) && $$4++ < 10) {
         $$3 = cai.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bpo $$0) {
      return $$0.dP().a(byr.r);
   }
}
