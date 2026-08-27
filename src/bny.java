import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bny {
   private bny() {
   }

   public static void a(bmf $$0, bmf $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bnf<?> $$0, bmf $$1) {
      Optional<bvj> $$2 = $$0.c(bvh.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bnf<?> $$0, bvh<? extends bmf> $$1, blt<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bnf<?> $$0, bvh<? extends bmf> $$1, Predicate<bmf> $$2) {
      return $$0.c($$1).filter($$2).filter(bmf::bx).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bmf $$0, bmf $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bmf $$0, bmf $$1) {
      $$0.dO().a(bvh.n, new boh($$1, true));
   }

   private static void b(bmf $$0, bmf $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bmf $$0, blp $$1, float $$2, int $$3) {
      a($$0, new boh($$1, true), $$2, $$3);
   }

   public static void a(bmf $$0, hx $$1, float $$2, int $$3) {
      a($$0, new bnz($$1), $$2, $$3);
   }

   public static void a(bmf $$0, bpk $$1, float $$2, int $$3) {
      bvk $$4 = new bvk($$1, $$2, $$3);
      $$0.dO().a(bvh.n, $$1);
      $$0.dO().a(bvh.m, $$4);
   }

   public static void a(bmf $$0, cmr $$1, elm $$2) {
      elm $$3 = new elm(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bmf $$0, cmr $$1, elm $$2, elm $$3, float $$4) {
      double $$5 = $$0.dv() - (double)$$4;
      cbo $$6 = new cbo($$0.dM(), $$0.dr(), $$5, $$0.dx(), $$1);
      $$6.a($$0);
      elm $$7 = $$2.d($$0.dk());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.u();
      $$0.dM().b($$6);
   }

   public static iz a(amz $$0, iz $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return iz.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bmh $$0, bmf $$1, int $$2) {
      if ($$0.eT().d() instanceof cnh $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bmf $$0, bmf $$1, double $$2) {
      Optional<bmf> $$3 = $$0.dO().c(bvh.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dk());
         double $$5 = $$0.f($$1.dk());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bmf $$0, bmf $$1) {
      bnf<?> $$2 = $$0.dO();
      return !$$2.a(bvh.h) ? false : $$2.c(bvh.h).get().a($$1);
   }

   public static bmf a(bmf $$0, Optional<bmf> $$1, bmf $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bmf a(bmf $$0, bmf $$1, bmf $$2) {
      elm $$3 = $$1.dk();
      elm $$4 = $$2.dk();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bmf> a(bmf $$0, bvh<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dO().c($$1);
      return $$2.<blp>map($$1x -> ((amz)$$0.dM()).a($$1x)).map($$0x -> $$0x instanceof bmf $$1x ? $$1x : null);
   }

   @Nullable
   public static elm a(bmo $$0, int $$1, int $$2) {
      elm $$3 = bwx.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dM().a_(hx.a($$3)).a($$0.dM(), hx.a($$3), efa.b) && $$4++ < 10) {
         $$3 = bwx.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bmf $$0) {
      return $$0.dO().a(bvh.r);
   }
}
