import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class boe {
   private boe() {
   }

   public static void a(bml $$0, bml $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bnl<?> $$0, bml $$1) {
      Optional<bvp> $$2 = $$0.c(bvn.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bnl<?> $$0, bvn<? extends bml> $$1, blz<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bnl<?> $$0, bvn<? extends bml> $$1, Predicate<bml> $$2) {
      return $$0.c($$1).filter($$2).filter(bml::bx).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bml $$0, bml $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bml $$0, bml $$1) {
      $$0.dO().a(bvn.n, new bon($$1, true));
   }

   private static void b(bml $$0, bml $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bml $$0, blv $$1, float $$2, int $$3) {
      a($$0, new bon($$1, true), $$2, $$3);
   }

   public static void a(bml $$0, hx $$1, float $$2, int $$3) {
      a($$0, new bof($$1), $$2, $$3);
   }

   public static void a(bml $$0, bpq $$1, float $$2, int $$3) {
      bvq $$4 = new bvq($$1, $$2, $$3);
      $$0.dO().a(bvn.n, $$1);
      $$0.dO().a(bvn.m, $$4);
   }

   public static void a(bml $$0, cmy $$1, elt $$2) {
      elt $$3 = new elt(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bml $$0, cmy $$1, elt $$2, elt $$3, float $$4) {
      double $$5 = $$0.dv() - (double)$$4;
      cbu $$6 = new cbu($$0.dM(), $$0.dr(), $$5, $$0.dx(), $$1);
      $$6.a($$0);
      elt $$7 = $$2.d($$0.dk());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.u();
      $$0.dM().b($$6);
   }

   public static iz a(and $$0, iz $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return iz.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bmn $$0, bml $$1, int $$2) {
      if ($$0.eT().d() instanceof cno $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bml $$0, bml $$1, double $$2) {
      Optional<bml> $$3 = $$0.dO().c(bvn.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dk());
         double $$5 = $$0.f($$1.dk());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bml $$0, bml $$1) {
      bnl<?> $$2 = $$0.dO();
      return !$$2.a(bvn.h) ? false : $$2.c(bvn.h).get().a($$1);
   }

   public static bml a(bml $$0, Optional<bml> $$1, bml $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bml a(bml $$0, bml $$1, bml $$2) {
      elt $$3 = $$1.dk();
      elt $$4 = $$2.dk();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bml> a(bml $$0, bvn<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dO().c($$1);
      return $$2.<blv>map($$1x -> ((and)$$0.dM()).a($$1x)).map($$0x -> $$0x instanceof bml $$1x ? $$1x : null);
   }

   @Nullable
   public static elt a(bmu $$0, int $$1, int $$2) {
      elt $$3 = bxd.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dM().a_(hx.a($$3)).a($$0.dM(), hx.a($$3), efh.b) && $$4++ < 10) {
         $$3 = bxd.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bml $$0) {
      return $$0.dO().a(bvn.r);
   }
}
