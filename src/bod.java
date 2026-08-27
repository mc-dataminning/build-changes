import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bod {
   private bod() {
   }

   public static void a(bmk $$0, bmk $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bnk<?> $$0, bmk $$1) {
      Optional<bvo> $$2 = $$0.c(bvm.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bnk<?> $$0, bvm<? extends bmk> $$1, bly<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bnk<?> $$0, bvm<? extends bmk> $$1, Predicate<bmk> $$2) {
      return $$0.c($$1).filter($$2).filter(bmk::bx).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bmk $$0, bmk $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bmk $$0, bmk $$1) {
      $$0.dO().a(bvm.n, new bom($$1, true));
   }

   private static void b(bmk $$0, bmk $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bmk $$0, blu $$1, float $$2, int $$3) {
      a($$0, new bom($$1, true), $$2, $$3);
   }

   public static void a(bmk $$0, hx $$1, float $$2, int $$3) {
      a($$0, new boe($$1), $$2, $$3);
   }

   public static void a(bmk $$0, bpp $$1, float $$2, int $$3) {
      bvp $$4 = new bvp($$1, $$2, $$3);
      $$0.dO().a(bvm.n, $$1);
      $$0.dO().a(bvm.m, $$4);
   }

   public static void a(bmk $$0, cmx $$1, els $$2) {
      els $$3 = new els(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bmk $$0, cmx $$1, els $$2, els $$3, float $$4) {
      double $$5 = $$0.dv() - (double)$$4;
      cbt $$6 = new cbt($$0.dM(), $$0.dr(), $$5, $$0.dx(), $$1);
      $$6.a($$0);
      els $$7 = $$2.d($$0.dk());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.u();
      $$0.dM().b($$6);
   }

   public static iz a(and $$0, iz $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return iz.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bmm $$0, bmk $$1, int $$2) {
      if ($$0.eT().d() instanceof cnn $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bmk $$0, bmk $$1, double $$2) {
      Optional<bmk> $$3 = $$0.dO().c(bvm.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dk());
         double $$5 = $$0.f($$1.dk());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bmk $$0, bmk $$1) {
      bnk<?> $$2 = $$0.dO();
      return !$$2.a(bvm.h) ? false : $$2.c(bvm.h).get().a($$1);
   }

   public static bmk a(bmk $$0, Optional<bmk> $$1, bmk $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bmk a(bmk $$0, bmk $$1, bmk $$2) {
      els $$3 = $$1.dk();
      els $$4 = $$2.dk();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bmk> a(bmk $$0, bvm<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dO().c($$1);
      return $$2.<blu>map($$1x -> ((and)$$0.dM()).a($$1x)).map($$0x -> $$0x instanceof bmk $$1x ? $$1x : null);
   }

   @Nullable
   public static els a(bmt $$0, int $$1, int $$2) {
      els $$3 = bxc.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dM().a_(hx.a($$3)).a($$0.dM(), hx.a($$3), efg.b) && $$4++ < 10) {
         $$3 = bxc.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bmk $$0) {
      return $$0.dO().a(bvm.r);
   }
}
