import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bne {
   private bne() {
   }

   public static void a(bll $$0, bll $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bml<?> $$0, bll $$1) {
      Optional<buo> $$2 = $$0.c(bum.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bml<?> $$0, bum<? extends bll> $$1, bkz<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bml<?> $$0, bum<? extends bll> $$1, Predicate<bll> $$2) {
      return $$0.c($$1).filter($$2).filter(bll::bx).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bll $$0, bll $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bll $$0, bll $$1) {
      $$0.dP().a(bum.n, new bnn($$1, true));
   }

   private static void b(bll $$0, bll $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bll $$0, bkv $$1, float $$2, int $$3) {
      a($$0, new bnn($$1, true), $$2, $$3);
   }

   public static void a(bll $$0, hx $$1, float $$2, int $$3) {
      a($$0, new bnf($$1), $$2, $$3);
   }

   public static void a(bll $$0, bop $$1, float $$2, int $$3) {
      bup $$4 = new bup($$1, $$2, $$3);
      $$0.dP().a(bum.n, $$1);
      $$0.dP().a(bum.m, $$4);
   }

   public static void a(bll $$0, clo $$1, ejz $$2) {
      ejz $$3 = new ejz(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bll $$0, clo $$1, ejz $$2, ejz $$3, float $$4) {
      double $$5 = $$0.dw() - (double)$$4;
      cas $$6 = new cas($$0.dN(), $$0.ds(), $$5, $$0.dy(), $$1);
      $$6.a($$0);
      ejz $$7 = $$2.d($$0.dl());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.u();
      $$0.dN().b($$6);
   }

   public static iy a(ami $$0, iy $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return iy.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bln $$0, bll $$1, int $$2) {
      if ($$0.eU().d() instanceof cme $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bll $$0, bll $$1, double $$2) {
      Optional<bll> $$3 = $$0.dP().c(bum.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dl());
         double $$5 = $$0.f($$1.dl());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bll $$0, bll $$1) {
      bml<?> $$2 = $$0.dP();
      return !$$2.a(bum.h) ? false : $$2.c(bum.h).get().a($$1);
   }

   public static bll a(bll $$0, Optional<bll> $$1, bll $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bll a(bll $$0, bll $$1, bll $$2) {
      ejz $$3 = $$1.dl();
      ejz $$4 = $$2.dl();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bll> a(bll $$0, bum<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dP().c($$1);
      return $$2.<bkv>map($$1x -> ((ami)$$0.dN()).a($$1x)).map($$0x -> $$0x instanceof bll $$1x ? $$1x : null);
   }

   @Nullable
   public static ejz a(blu $$0, int $$1, int $$2) {
      ejz $$3 = bwb.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dN().a_(hx.a($$3)).a($$0.dN(), hx.a($$3), edn.b) && $$4++ < 10) {
         $$3 = bwb.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bll $$0) {
      return $$0.dP().a(bum.r);
   }
}
