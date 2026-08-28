import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvz {
   private bvz() {
   }

   public static void a(buf $$0, buf $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bvg<?> $$0, buf $$1) {
      Optional<cdk> $$2 = $$0.c(cdi.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bvg<?> $$0, cdi<? extends buf> $$1, btq<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ao() == $$2);
   }

   private static boolean a(bvg<?> $$0, cdi<? extends buf> $$1, Predicate<buf> $$2) {
      return $$0.c($$1).filter($$2).filter(buf::bI).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(buf $$0, buf $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(buf $$0, buf $$1) {
      $$0.dX().a(cdi.n, new bwi($$1, true));
   }

   private static void b(buf $$0, buf $$1, float $$2, int $$3) {
      a($$0, (btj)$$1, $$2, $$3);
      a($$1, (btj)$$0, $$2, $$3);
   }

   public static void a(buf $$0, btj $$1, float $$2, int $$3) {
      a($$0, new bwi($$1, true), $$2, $$3);
   }

   public static void a(buf $$0, je $$1, float $$2, int $$3) {
      a($$0, new bwa($$1), $$2, $$3);
   }

   public static void a(buf $$0, bxl $$1, float $$2, int $$3) {
      cdl $$4 = new cdl($$1, $$2, $$3);
      $$0.dX().a(cdi.n, $$1);
      $$0.dX().a(cdi.m, $$4);
   }

   public static void a(buf $$0, cvl $$1, eye $$2) {
      eye $$3 = new eye(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(buf $$0, cvl $$1, eye $$2, eye $$3, float $$4) {
      double $$5 = $$0.dB() - (double)$$4;
      cjz $$6 = new cjz($$0.dS(), $$0.dx(), $$5, $$0.dD(), $$1);
      $$6.b($$0);
      eye $$7 = $$2.d($$0.dq());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.h($$7);
      $$6.q();
      $$0.dS().b($$6);
   }

   public static kg a(arg $$0, kg $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kg.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(buh $$0, buf $$1, int $$2) {
      if ($$0.eW().h() instanceof cwi $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(buf $$0, buf $$1, double $$2) {
      Optional<buf> $$3 = $$0.dX().c(cdi.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dq());
         double $$5 = $$0.f($$1.dq());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(buf $$0, buf $$1) {
      bvg<?> $$2 = $$0.dX();
      return !$$2.a(cdi.h) ? false : $$2.c(cdi.h).get().a($$1);
   }

   public static buf a(buf $$0, Optional<buf> $$1, buf $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static buf a(buf $$0, buf $$1, buf $$2) {
      eye $$3 = $$1.dq();
      eye $$4 = $$2.dq();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<buf> a(buf $$0, cdi<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dX().c($$1);
      return $$2.<btj>map($$1x -> ((arg)$$0.dS()).a($$1x)).map($$0x -> $$0x instanceof buf $$1x ? $$1x : null);
   }

   @Nullable
   public static eye a(bun $$0, int $$1, int $$2) {
      eye $$3 = cez.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dS().a_(je.a((jx)$$3)).a(eqq.b) && $$4++ < 10) {
         $$3 = cez.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(buf $$0) {
      return $$0.dX().a(cdi.r);
   }
}
