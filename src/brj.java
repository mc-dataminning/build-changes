import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brj {
   private brj() {
   }

   public static void a(bpp $$0, bpp $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bqq<?> $$0, bpp $$1) {
      Optional<byu> $$2 = $$0.c(bys.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bqq<?> $$0, bys<? extends bpp> $$1, bpd<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bqq<?> $$0, bys<? extends bpp> $$1, Predicate<bpp> $$2) {
      return $$0.c($$1).filter($$2).filter(bpp::bA).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bpp $$0, bpp $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bpp $$0, bpp $$1) {
      $$0.dP().a(bys.n, new brs($$1, true));
   }

   private static void b(bpp $$0, bpp $$1, float $$2, int $$3) {
      a($$0, (box)$$1, $$2, $$3);
      a($$1, (box)$$0, $$2, $$3);
   }

   public static void a(bpp $$0, box $$1, float $$2, int $$3) {
      a($$0, new brs($$1, true), $$2, $$3);
   }

   public static void a(bpp $$0, ib $$1, float $$2, int $$3) {
      a($$0, new brk($$1), $$2, $$3);
   }

   public static void a(bpp $$0, bsv $$1, float $$2, int $$3) {
      byv $$4 = new byv($$1, $$2, $$3);
      $$0.dP().a(bys.n, $$1);
      $$0.dP().a(bys.m, $$4);
   }

   public static void a(bpp $$0, cqm $$1, ept $$2) {
      ept $$3 = new ept(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bpp $$0, cqm $$1, ept $$2, ept $$3, float $$4) {
      double $$5 = $$0.dv() - (double)$$4;
      cfe $$6 = new cfe($$0.dM(), $$0.dr(), $$5, $$0.dx(), $$1);
      $$6.b($$0);
      ept $$7 = $$2.d($$0.dk());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.s();
      $$0.dM().b($$6);
   }

   public static je a(apf $$0, je $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return je.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bpr $$0, bpp $$1, int $$2) {
      if ($$0.eU().d() instanceof crc $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bpp $$0, bpp $$1, double $$2) {
      Optional<bpp> $$3 = $$0.dP().c(bys.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dk());
         double $$5 = $$0.f($$1.dk());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bpp $$0, bpp $$1) {
      bqq<?> $$2 = $$0.dP();
      return !$$2.a(bys.h) ? false : $$2.c(bys.h).get().a($$1);
   }

   public static bpp a(bpp $$0, Optional<bpp> $$1, bpp $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bpp a(bpp $$0, bpp $$1, bpp $$2) {
      ept $$3 = $$1.dk();
      ept $$4 = $$2.dk();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bpp> a(bpp $$0, bys<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dP().c($$1);
      return $$2.<box>map($$1x -> ((apf)$$0.dM()).a($$1x)).map($$0x -> $$0x instanceof bpp $$1x ? $$1x : null);
   }

   @Nullable
   public static ept a(bpx $$0, int $$1, int $$2) {
      ept $$3 = caj.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dM().a_(ib.a($$3)).a($$0.dM(), ib.a($$3), eje.b) && $$4++ < 10) {
         $$3 = caj.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bpp $$0) {
      return $$0.dP().a(bys.r);
   }
}
