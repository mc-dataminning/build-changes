import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzy {
   private bzy() {
   }

   public static void a(byf $$0, byf $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bzf<?> $$0, byf $$1) {
      Optional<chj> $$2 = $$0.c(chh.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bzf<?> $$0, chh<? extends byf> $$1, bxn<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.an() == $$2);
   }

   private static boolean a(bzf<?> $$0, chh<? extends byf> $$1, Predicate<byf> $$2) {
      return $$0.c($$1).filter($$2).filter(byf::bJ).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(byf $$0, byf $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(byf $$0, byf $$1) {
      $$0.ec().a(chh.o, new cah($$1, true));
   }

   private static void b(byf $$0, byf $$1, float $$2, int $$3) {
      a($$0, (bxe)$$1, $$2, $$3);
      a($$1, (bxe)$$0, $$2, $$3);
   }

   public static void a(byf $$0, bxe $$1, float $$2, int $$3) {
      a($$0, new cah($$1, true), $$2, $$3);
   }

   public static void a(byf $$0, iw $$1, float $$2, int $$3) {
      a($$0, new bzz($$1), $$2, $$3);
   }

   public static void a(byf $$0, cbk $$1, float $$2, int $$3) {
      chk $$4 = new chk($$1, $$2, $$3);
      $$0.ec().a(chh.o, $$1);
      $$0.ec().a(chh.n, $$4);
   }

   public static void a(byf $$0, dak $$1, fgc $$2) {
      fgc $$3 = new fgc(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(byf $$0, dak $$1, fgc $$2, fgc $$3, float $$4) {
      double $$5 = $$0.dE() - (double)$$4;
      coo $$6 = new coo($$0.dV(), $$0.dA(), $$5, $$0.dG(), $$1);
      $$6.b($$0);
      fgc $$7 = $$2.d($$0.dt());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.i();
      $$0.dV().b($$6);
   }

   public static jz a(asb $$0, jz $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jz.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(byh $$0, byf $$1, int $$2) {
      if ($$0.fb().h() instanceof dbf $$3 && $$0.a($$3)) {
         int $$4 = $$3.b() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.h($$1);
   }

   public static boolean a(byf $$0, byf $$1, double $$2) {
      Optional<byf> $$3 = $$0.ec().c(chh.p);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dt());
         double $$5 = $$0.g($$1.dt());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(byf $$0, byf $$1) {
      bzf<?> $$2 = $$0.ec();
      return !$$2.a(chh.h) ? false : $$2.c(chh.h).get().a($$1);
   }

   public static byf a(byf $$0, Optional<byf> $$1, byf $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static byf a(byf $$0, byf $$1, byf $$2) {
      fgc $$3 = $$1.dt();
      fgc $$4 = $$2.dt();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<byf> a(byf $$0, chh<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ec().c($$1);
      return $$2.<bxe>map($$1x -> ((asb)$$0.dV()).b($$1x)).map($$0x -> $$0x instanceof byf $$1x ? $$1x : null);
   }

   @Nullable
   public static fgc a(byn $$0, int $$1, int $$2) {
      fgc $$3 = ciy.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dV().a_(iw.a((jq)$$3)).a(eyp.b) && $$4++ < 10) {
         $$3 = ciy.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(byf $$0) {
      return $$0.ec().a(chh.s);
   }
}
