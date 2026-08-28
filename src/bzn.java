import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzn {
   private bzn() {
   }

   public static void a(bxu $$0, bxu $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(byu<?> $$0, bxu $$1) {
      Optional<cgy> $$2 = $$0.c(cgw.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(byu<?> $$0, cgw<? extends bxu> $$1, bxc<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.an() == $$2);
   }

   private static boolean a(byu<?> $$0, cgw<? extends bxu> $$1, Predicate<bxu> $$2) {
      return $$0.c($$1).filter($$2).filter(bxu::bJ).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bxu $$0, bxu $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bxu $$0, bxu $$1) {
      $$0.ec().a(cgw.o, new bzw($$1, true));
   }

   private static void b(bxu $$0, bxu $$1, float $$2, int $$3) {
      a($$0, (bwt)$$1, $$2, $$3);
      a($$1, (bwt)$$0, $$2, $$3);
   }

   public static void a(bxu $$0, bwt $$1, float $$2, int $$3) {
      a($$0, new bzw($$1, true), $$2, $$3);
   }

   public static void a(bxu $$0, iv $$1, float $$2, int $$3) {
      a($$0, new bzo($$1), $$2, $$3);
   }

   public static void a(bxu $$0, caz $$1, float $$2, int $$3) {
      cgz $$4 = new cgz($$1, $$2, $$3);
      $$0.ec().a(cgw.o, $$1);
      $$0.ec().a(cgw.n, $$4);
   }

   public static void a(bxu $$0, czy $$1, ffq $$2) {
      ffq $$3 = new ffq(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bxu $$0, czy $$1, ffq $$2, ffq $$3, float $$4) {
      double $$5 = $$0.dE() - (double)$$4;
      coc $$6 = new coc($$0.dV(), $$0.dA(), $$5, $$0.dG(), $$1);
      $$6.b($$0);
      ffq $$7 = $$2.d($$0.dt());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.j();
      $$0.dV().b($$6);
   }

   public static jy a(ars $$0, jy $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jy.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bxw $$0, bxu $$1, int $$2) {
      if ($$0.fb().h() instanceof dat $$3 && $$0.a($$3)) {
         int $$4 = $$3.b() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.h($$1);
   }

   public static boolean a(bxu $$0, bxu $$1, double $$2) {
      Optional<bxu> $$3 = $$0.ec().c(cgw.p);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dt());
         double $$5 = $$0.g($$1.dt());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bxu $$0, bxu $$1) {
      byu<?> $$2 = $$0.ec();
      return !$$2.a(cgw.h) ? false : $$2.c(cgw.h).get().a($$1);
   }

   public static bxu a(bxu $$0, Optional<bxu> $$1, bxu $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bxu a(bxu $$0, bxu $$1, bxu $$2) {
      ffq $$3 = $$1.dt();
      ffq $$4 = $$2.dt();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<bxu> a(bxu $$0, cgw<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ec().c($$1);
      return $$2.<bwt>map($$1x -> ((ars)$$0.dV()).b($$1x)).map($$0x -> $$0x instanceof bxu $$1x ? $$1x : null);
   }

   @Nullable
   public static ffq a(byc $$0, int $$1, int $$2) {
      ffq $$3 = cin.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dV().a_(iv.a((jp)$$3)).a(eyd.b) && $$4++ < 10) {
         $$3 = cin.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bxu $$0) {
      return $$0.ec().a(cgw.s);
   }
}
