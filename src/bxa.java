import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxa {
   private bxa() {
   }

   public static void a(bvf $$0, bvf $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bwh<?> $$0, bvf $$1) {
      Optional<cel> $$2 = $$0.c(cej.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bwh<?> $$0, cej<? extends bvf> $$1, buq<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bwh<?> $$0, cej<? extends bvf> $$1, Predicate<bvf> $$2) {
      return $$0.c($$1).filter($$2).filter(bvf::bL).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bvf $$0, bvf $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bvf $$0, bvf $$1) {
      $$0.ec().a(cej.n, new bxj($$1, true));
   }

   private static void b(bvf $$0, bvf $$1, float $$2, int $$3) {
      a($$0, (buj)$$1, $$2, $$3);
      a($$1, (buj)$$0, $$2, $$3);
   }

   public static void a(bvf $$0, buj $$1, float $$2, int $$3) {
      a($$0, new bxj($$1, true), $$2, $$3);
   }

   public static void a(bvf $$0, ji $$1, float $$2, int $$3) {
      a($$0, new bxb($$1), $$2, $$3);
   }

   public static void a(bvf $$0, bym $$1, float $$2, int $$3) {
      cem $$4 = new cem($$1, $$2, $$3);
      $$0.ec().a(cej.n, $$1);
      $$0.ec().a(cej.m, $$4);
   }

   public static void a(bvf $$0, cwn $$1, fay $$2) {
      fay $$3 = new fay(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bvf $$0, cwn $$1, fay $$2, fay $$3, float $$4) {
      double $$5 = $$0.dF() - (double)$$4;
      cla $$6 = new cla($$0.dW(), $$0.dB(), $$5, $$0.dH(), $$1);
      $$6.b($$0);
      fay $$7 = $$2.d($$0.du());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.h($$7);
      $$6.s();
      $$0.dW().b($$6);
   }

   public static kk a(arc $$0, kk $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kk.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bvh $$0, bvf $$1, int $$2) {
      if ($$0.eZ().h() instanceof cxj $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bvf $$0, bvf $$1, double $$2) {
      Optional<bvf> $$3 = $$0.ec().c(cej.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().du());
         double $$5 = $$0.f($$1.du());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bvf $$0, bvf $$1) {
      bwh<?> $$2 = $$0.ec();
      return !$$2.a(cej.h) ? false : $$2.c(cej.h).get().a($$1);
   }

   public static bvf a(bvf $$0, Optional<bvf> $$1, bvf $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bvf a(bvf $$0, bvf $$1, bvf $$2) {
      fay $$3 = $$1.du();
      fay $$4 = $$2.du();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bvf> a(bvf $$0, cej<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ec().c($$1);
      return $$2.<buj>map($$1x -> ((arc)$$0.dW()).a($$1x)).map($$0x -> $$0x instanceof bvf $$1x ? $$1x : null);
   }

   @Nullable
   public static fay a(bvn $$0, int $$1, int $$2) {
      fay $$3 = cga.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dW().a_(ji.a((kb)$$3)).a(etm.b) && $$4++ < 10) {
         $$3 = cga.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bvf $$0) {
      return $$0.ec().a(cej.r);
   }
}
