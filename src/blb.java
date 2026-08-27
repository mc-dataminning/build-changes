import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class blb {
   private blb() {
   }

   public static void a(bji $$0, bji $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bki<?> $$0, bji $$1) {
      Optional<bsl> $$2 = $$0.c(bsj.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bki<?> $$0, bsj<? extends bji> $$1, biw<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ag() == $$2);
   }

   private static boolean a(bki<?> $$0, bsj<? extends bji> $$1, Predicate<bji> $$2) {
      return $$0.c($$1).filter($$2).filter(bji::bv).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bji $$0, bji $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bji $$0, bji $$1) {
      $$0.dN().a(bsj.n, new blk($$1, true));
   }

   private static void b(bji $$0, bji $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bji $$0, bis $$1, float $$2, int $$3) {
      a($$0, new blk($$1, true), $$2, $$3);
   }

   public static void a(bji $$0, gw $$1, float $$2, int $$3) {
      a($$0, new blc($$1), $$2, $$3);
   }

   public static void a(bji $$0, bmm $$1, float $$2, int $$3) {
      bsm $$4 = new bsm($$1, $$2, $$3);
      $$0.dN().a(bsj.n, $$1);
      $$0.dN().a(bsj.m, $$4);
   }

   public static void a(bji $$0, cjh $$1, ehp $$2) {
      ehp $$3 = new ehp(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bji $$0, cjh $$1, ehp $$2, ehp $$3, float $$4) {
      double $$5 = $$0.du() - (double)$$4;
      byp $$6 = new byp($$0.dL(), $$0.dq(), $$5, $$0.dw(), $$1);
      $$6.c($$0.cv());
      ehp $$7 = $$2.d($$0.dj());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.f($$7);
      $$6.t();
      $$0.dL().b($$6);
   }

   public static hz a(aks $$0, hz $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return hz.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bjk $$0, bji $$1, int $$2) {
      if ($$0.eS().d() instanceof cjx $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bji $$0, bji $$1, double $$2) {
      Optional<bji> $$3 = $$0.dN().c(bsj.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.e($$3.get().dj());
         double $$5 = $$0.e($$1.dj());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bji $$0, bji $$1) {
      bki<?> $$2 = $$0.dN();
      return !$$2.a(bsj.h) ? false : $$2.c(bsj.h).get().a($$1);
   }

   public static bji a(bji $$0, Optional<bji> $$1, bji $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bji a(bji $$0, bji $$1, bji $$2) {
      ehp $$3 = $$1.dj();
      ehp $$4 = $$2.dj();
      return $$0.e($$3) < $$0.e($$4) ? $$1 : $$2;
   }

   public static Optional<bji> a(bji $$0, bsj<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dN().c($$1);
      return $$2.<bis>map($$1x -> ((aks)$$0.dL()).a($$1x)).map($$0x -> $$0x instanceof bji $$1x ? $$1x : null);
   }

   @Nullable
   public static ehp a(bjr $$0, int $$1, int $$2) {
      ehp $$3 = bty.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dL().a_(gw.a($$3)).a($$0.dL(), gw.a($$3), ebe.b) && $$4++ < 10) {
         $$3 = bty.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bji $$0) {
      return $$0.dN().a(bsj.r);
   }
}
