import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class boh {
   private boh() {
   }

   public static void a(bmo $$0, bmo $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bno<?> $$0, bmo $$1) {
      Optional<bvs> $$2 = $$0.c(bvq.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bno<?> $$0, bvq<? extends bmo> $$1, bmc<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bno<?> $$0, bvq<? extends bmo> $$1, Predicate<bmo> $$2) {
      return $$0.c($$1).filter($$2).filter(bmo::bx).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bmo $$0, bmo $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bmo $$0, bmo $$1) {
      $$0.dN().a(bvq.n, new boq($$1, true));
   }

   private static void b(bmo $$0, bmo $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bmo $$0, blw $$1, float $$2, int $$3) {
      a($$0, new boq($$1, true), $$2, $$3);
   }

   public static void a(bmo $$0, hx $$1, float $$2, int $$3) {
      a($$0, new boi($$1), $$2, $$3);
   }

   public static void a(bmo $$0, bpt $$1, float $$2, int $$3) {
      bvt $$4 = new bvt($$1, $$2, $$3);
      $$0.dN().a(bvq.n, $$1);
      $$0.dN().a(bvq.m, $$4);
   }

   public static void a(bmo $$0, cng $$1, emc $$2) {
      emc $$3 = new emc(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bmo $$0, cng $$1, emc $$2, emc $$3, float $$4) {
      double $$5 = $$0.du() - (double)$$4;
      ccb $$6 = new ccb($$0.dL(), $$0.dq(), $$5, $$0.dw(), $$1);
      $$6.a($$0);
      emc $$7 = $$2.d($$0.dj());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.u();
      $$0.dL().b($$6);
   }

   public static iz a(ane $$0, iz $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return iz.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bmq $$0, bmo $$1, int $$2) {
      if ($$0.eT().d() instanceof cnw $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bmo $$0, bmo $$1, double $$2) {
      Optional<bmo> $$3 = $$0.dN().c(bvq.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dj());
         double $$5 = $$0.f($$1.dj());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bmo $$0, bmo $$1) {
      bno<?> $$2 = $$0.dN();
      return !$$2.a(bvq.h) ? false : $$2.c(bvq.h).get().a($$1);
   }

   public static bmo a(bmo $$0, Optional<bmo> $$1, bmo $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bmo a(bmo $$0, bmo $$1, bmo $$2) {
      emc $$3 = $$1.dj();
      emc $$4 = $$2.dj();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bmo> a(bmo $$0, bvq<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dN().c($$1);
      return $$2.<blw>map($$1x -> ((ane)$$0.dL()).a($$1x)).map($$0x -> $$0x instanceof bmo $$1x ? $$1x : null);
   }

   @Nullable
   public static emc a(bmx $$0, int $$1, int $$2) {
      emc $$3 = bxh.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dL().a_(hx.a($$3)).a($$0.dL(), hx.a($$3), efp.b) && $$4++ < 10) {
         $$3 = bxh.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bmo $$0) {
      return $$0.dN().a(bvq.r);
   }
}
