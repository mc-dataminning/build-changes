import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsi {
   private bsi() {
   }

   public static void a(bqo $$0, bqo $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(brp<?> $$0, bqo $$1) {
      Optional<bzt> $$2 = $$0.c(bzr.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(brp<?> $$0, bzr<? extends bqo> $$1, bqb<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(brp<?> $$0, bzr<? extends bqo> $$1, Predicate<bqo> $$2) {
      return $$0.c($$1).filter($$2).filter(bqo::bA).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bqo $$0, bqo $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bqo $$0, bqo $$1) {
      $$0.dP().a(bzr.n, new bsr($$1, true));
   }

   private static void b(bqo $$0, bqo $$1, float $$2, int $$3) {
      a($$0, (bpv)$$1, $$2, $$3);
      a($$1, (bpv)$$0, $$2, $$3);
   }

   public static void a(bqo $$0, bpv $$1, float $$2, int $$3) {
      a($$0, new bsr($$1, true), $$2, $$3);
   }

   public static void a(bqo $$0, ib $$1, float $$2, int $$3) {
      a($$0, new bsj($$1), $$2, $$3);
   }

   public static void a(bqo $$0, btu $$1, float $$2, int $$3) {
      bzu $$4 = new bzu($$1, $$2, $$3);
      $$0.dP().a(bzr.n, $$1);
      $$0.dP().a(bzr.m, $$4);
   }

   public static void a(bqo $$0, crj $$1, esa $$2) {
      esa $$3 = new esa(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bqo $$0, crj $$1, esa $$2, esa $$3, float $$4) {
      double $$5 = $$0.dv() - (double)$$4;
      cgd $$6 = new cgd($$0.dM(), $$0.dr(), $$5, $$0.dx(), $$1);
      $$6.b($$0);
      esa $$7 = $$2.d($$0.dk());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.v();
      $$0.dM().b($$6);
   }

   public static je a(aps $$0, je $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return je.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bqq $$0, bqo $$1, int $$2) {
      if ($$0.eU().f() instanceof crz $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bqo $$0, bqo $$1, double $$2) {
      Optional<bqo> $$3 = $$0.dP().c(bzr.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dk());
         double $$5 = $$0.f($$1.dk());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bqo $$0, bqo $$1) {
      brp<?> $$2 = $$0.dP();
      return !$$2.a(bzr.h) ? false : $$2.c(bzr.h).get().a($$1);
   }

   public static bqo a(bqo $$0, Optional<bqo> $$1, bqo $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bqo a(bqo $$0, bqo $$1, bqo $$2) {
      esa $$3 = $$1.dk();
      esa $$4 = $$2.dk();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bqo> a(bqo $$0, bzr<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dP().c($$1);
      return $$2.<bpv>map($$1x -> ((aps)$$0.dM()).a($$1x)).map($$0x -> $$0x instanceof bqo $$1x ? $$1x : null);
   }

   @Nullable
   public static esa a(bqw $$0, int $$1, int $$2) {
      esa $$3 = cbi.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dM().a_(ib.a($$3)).a(elh.b) && $$4++ < 10) {
         $$3 = cbi.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bqo $$0) {
      return $$0.dP().a(bzr.r);
   }
}
