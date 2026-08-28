import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzp {
   private bzp() {
   }

   public static void a(bxw $$0, bxw $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(byw<?> $$0, bxw $$1) {
      Optional<cha> $$2 = $$0.c(cgy.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(byw<?> $$0, cgy<? extends bxw> $$1, bxe<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.an() == $$2);
   }

   private static boolean a(byw<?> $$0, cgy<? extends bxw> $$1, Predicate<bxw> $$2) {
      return $$0.c($$1).filter($$2).filter(bxw::bJ).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bxw $$0, bxw $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bxw $$0, bxw $$1) {
      $$0.ec().a(cgy.o, new bzy($$1, true));
   }

   private static void b(bxw $$0, bxw $$1, float $$2, int $$3) {
      a($$0, (bwv)$$1, $$2, $$3);
      a($$1, (bwv)$$0, $$2, $$3);
   }

   public static void a(bxw $$0, bwv $$1, float $$2, int $$3) {
      a($$0, new bzy($$1, true), $$2, $$3);
   }

   public static void a(bxw $$0, iw $$1, float $$2, int $$3) {
      a($$0, new bzq($$1), $$2, $$3);
   }

   public static void a(bxw $$0, cbb $$1, float $$2, int $$3) {
      chb $$4 = new chb($$1, $$2, $$3);
      $$0.ec().a(cgy.o, $$1);
      $$0.ec().a(cgy.n, $$4);
   }

   public static void a(bxw $$0, daa $$1, ffs $$2) {
      ffs $$3 = new ffs(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bxw $$0, daa $$1, ffs $$2, ffs $$3, float $$4) {
      double $$5 = $$0.dE() - (double)$$4;
      coe $$6 = new coe($$0.dV(), $$0.dA(), $$5, $$0.dG(), $$1);
      $$6.b($$0);
      ffs $$7 = $$2.d($$0.dt());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.j();
      $$0.dV().b($$6);
   }

   public static jz a(aru $$0, jz $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jz.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bxy $$0, bxw $$1, int $$2) {
      if ($$0.fb().h() instanceof dav $$3 && $$0.a($$3)) {
         int $$4 = $$3.b() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.h($$1);
   }

   public static boolean a(bxw $$0, bxw $$1, double $$2) {
      Optional<bxw> $$3 = $$0.ec().c(cgy.p);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dt());
         double $$5 = $$0.g($$1.dt());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bxw $$0, bxw $$1) {
      byw<?> $$2 = $$0.ec();
      return !$$2.a(cgy.h) ? false : $$2.c(cgy.h).get().a($$1);
   }

   public static bxw a(bxw $$0, Optional<bxw> $$1, bxw $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bxw a(bxw $$0, bxw $$1, bxw $$2) {
      ffs $$3 = $$1.dt();
      ffs $$4 = $$2.dt();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<bxw> a(bxw $$0, cgy<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ec().c($$1);
      return $$2.<bwv>map($$1x -> ((aru)$$0.dV()).b($$1x)).map($$0x -> $$0x instanceof bxw $$1x ? $$1x : null);
   }

   @Nullable
   public static ffs a(bye $$0, int $$1, int $$2) {
      ffs $$3 = cip.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dV().a_(iw.a((jq)$$3)).a(eyf.b) && $$4++ < 10) {
         $$3 = cip.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bxw $$0) {
      return $$0.ec().a(cgy.s);
   }
}
