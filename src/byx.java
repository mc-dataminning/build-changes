import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byx {
   private byx() {
   }

   public static void a(bxe $$0, bxe $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bye<?> $$0, bxe $$1) {
      Optional<cgi> $$2 = $$0.c(cgg.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bye<?> $$0, cgg<? extends bxe> $$1, bwo<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bye<?> $$0, cgg<? extends bxe> $$1, Predicate<bxe> $$2) {
      return $$0.c($$1).filter($$2).filter(bxe::bK).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bxe $$0, bxe $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bxe $$0, bxe $$1) {
      $$0.ec().a(cgg.o, new bzg($$1, true));
   }

   private static void b(bxe $$0, bxe $$1, float $$2, int $$3) {
      a($$0, (bwf)$$1, $$2, $$3);
      a($$1, (bwf)$$0, $$2, $$3);
   }

   public static void a(bxe $$0, bwf $$1, float $$2, int $$3) {
      a($$0, new bzg($$1, true), $$2, $$3);
   }

   public static void a(bxe $$0, iu $$1, float $$2, int $$3) {
      a($$0, new byy($$1), $$2, $$3);
   }

   public static void a(bxe $$0, caj $$1, float $$2, int $$3) {
      cgj $$4 = new cgj($$1, $$2, $$3);
      $$0.ec().a(cgg.o, $$1);
      $$0.ec().a(cgg.n, $$4);
   }

   public static void a(bxe $$0, czd $$1, feq $$2) {
      feq $$3 = new feq(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bxe $$0, czd $$1, feq $$2, feq $$3, float $$4) {
      double $$5 = $$0.dE() - (double)$$4;
      cnh $$6 = new cnh($$0.dV(), $$0.dA(), $$5, $$0.dG(), $$1);
      $$6.b($$0);
      feq $$7 = $$2.d($$0.dt());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.j();
      $$0.dV().b($$6);
   }

   public static jx a(arq $$0, jx $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jx.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bxg $$0, bxe $$1, int $$2) {
      if ($$0.fb().h() instanceof czy $$3 && $$0.a($$3)) {
         int $$4 = $$3.b() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.h($$1);
   }

   public static boolean a(bxe $$0, bxe $$1, double $$2) {
      Optional<bxe> $$3 = $$0.ec().c(cgg.p);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dt());
         double $$5 = $$0.g($$1.dt());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bxe $$0, bxe $$1) {
      bye<?> $$2 = $$0.ec();
      return !$$2.a(cgg.h) ? false : $$2.c(cgg.h).get().a($$1);
   }

   public static bxe a(bxe $$0, Optional<bxe> $$1, bxe $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bxe a(bxe $$0, bxe $$1, bxe $$2) {
      feq $$3 = $$1.dt();
      feq $$4 = $$2.dt();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<bxe> a(bxe $$0, cgg<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ec().c($$1);
      return $$2.<bwf>map($$1x -> ((arq)$$0.dV()).b($$1x)).map($$0x -> $$0x instanceof bxe $$1x ? $$1x : null);
   }

   @Nullable
   public static feq a(bxm $$0, int $$1, int $$2) {
      feq $$3 = chx.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dV().a_(iu.a((jo)$$3)).a(exd.b) && $$4++ < 10) {
         $$3 = chx.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bxe $$0) {
      return $$0.ec().a(cgg.s);
   }
}
