import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bmr {
   private bmr() {
   }

   public static void a(bky $$0, bky $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bly<?> $$0, bky $$1) {
      Optional<bub> $$2 = $$0.c(btz.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bly<?> $$0, btz<? extends bky> $$1, bkm<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ag() == $$2);
   }

   private static boolean a(bly<?> $$0, btz<? extends bky> $$1, Predicate<bky> $$2) {
      return $$0.c($$1).filter($$2).filter(bky::bv).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bky $$0, bky $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bky $$0, bky $$1) {
      $$0.dN().a(btz.n, new bna($$1, true));
   }

   private static void b(bky $$0, bky $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bky $$0, bki $$1, float $$2, int $$3) {
      a($$0, new bna($$1, true), $$2, $$3);
   }

   public static void a(bky $$0, ht $$1, float $$2, int $$3) {
      a($$0, new bms($$1), $$2, $$3);
   }

   public static void a(bky $$0, boc $$1, float $$2, int $$3) {
      buc $$4 = new buc($$1, $$2, $$3);
      $$0.dN().a(btz.n, $$1);
      $$0.dN().a(btz.m, $$4);
   }

   public static void a(bky $$0, clb $$1, eji $$2) {
      eji $$3 = new eji(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bky $$0, clb $$1, eji $$2, eji $$3, float $$4) {
      double $$5 = $$0.du() - (double)$$4;
      caf $$6 = new caf($$0.dL(), $$0.dq(), $$5, $$0.dw(), $$1);
      $$6.a($$0);
      eji $$7 = $$2.d($$0.dj());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.f($$7);
      $$6.t();
      $$0.dL().b($$6);
   }

   public static iu a(ama $$0, iu $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return iu.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bla $$0, bky $$1, int $$2) {
      if ($$0.eS().d() instanceof clr $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bky $$0, bky $$1, double $$2) {
      Optional<bky> $$3 = $$0.dN().c(btz.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.e($$3.get().dj());
         double $$5 = $$0.e($$1.dj());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bky $$0, bky $$1) {
      bly<?> $$2 = $$0.dN();
      return !$$2.a(btz.h) ? false : $$2.c(btz.h).get().a($$1);
   }

   public static bky a(bky $$0, Optional<bky> $$1, bky $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bky a(bky $$0, bky $$1, bky $$2) {
      eji $$3 = $$1.dj();
      eji $$4 = $$2.dj();
      return $$0.e($$3) < $$0.e($$4) ? $$1 : $$2;
   }

   public static Optional<bky> a(bky $$0, btz<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dN().c($$1);
      return $$2.<bki>map($$1x -> ((ama)$$0.dL()).a($$1x)).map($$0x -> $$0x instanceof bky $$1x ? $$1x : null);
   }

   @Nullable
   public static eji a(blh $$0, int $$1, int $$2) {
      eji $$3 = bvo.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dL().a_(ht.a($$3)).a($$0.dL(), ht.a($$3), ecw.b) && $$4++ < 10) {
         $$3 = bvo.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bky $$0) {
      return $$0.dN().a(btz.r);
   }
}
