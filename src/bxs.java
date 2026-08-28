import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxs {
   private bxs() {
   }

   public static void a(bvx $$0, bvx $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bwz<?> $$0, bvx $$1) {
      Optional<cfd> $$2 = $$0.c(cfb.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bwz<?> $$0, cfb<? extends bvx> $$1, bvi<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bwz<?> $$0, cfb<? extends bvx> $$1, Predicate<bvx> $$2) {
      return $$0.c($$1).filter($$2).filter(bvx::bL).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bvx $$0, bvx $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bvx $$0, bvx $$1) {
      $$0.ec().a(cfb.n, new byb($$1, true));
   }

   private static void b(bvx $$0, bvx $$1, float $$2, int $$3) {
      a($$0, (bvb)$$1, $$2, $$3);
      a($$1, (bvb)$$0, $$2, $$3);
   }

   public static void a(bvx $$0, bvb $$1, float $$2, int $$3) {
      a($$0, new byb($$1, true), $$2, $$3);
   }

   public static void a(bvx $$0, jh $$1, float $$2, int $$3) {
      a($$0, new bxt($$1), $$2, $$3);
   }

   public static void a(bvx $$0, bze $$1, float $$2, int $$3) {
      cfe $$4 = new cfe($$1, $$2, $$3);
      $$0.ec().a(cfb.n, $$1);
      $$0.ec().a(cfb.m, $$4);
   }

   public static void a(bvx $$0, cxg $$1, fbr $$2) {
      fbr $$3 = new fbr(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bvx $$0, cxg $$1, fbr $$2, fbr $$3, float $$4) {
      double $$5 = $$0.dF() - (double)$$4;
      cls $$6 = new cls($$0.dW(), $$0.dB(), $$5, $$0.dH(), $$1);
      $$6.b($$0);
      fbr $$7 = $$2.d($$0.du());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.h($$7);
      $$6.s();
      $$0.dW().b($$6);
   }

   public static kj a(arx $$0, kj $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kj.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bvz $$0, bvx $$1, int $$2) {
      if ($$0.eZ().h() instanceof cyc $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bvx $$0, bvx $$1, double $$2) {
      Optional<bvx> $$3 = $$0.ec().c(cfb.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().du());
         double $$5 = $$0.f($$1.du());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bvx $$0, bvx $$1) {
      bwz<?> $$2 = $$0.ec();
      return !$$2.a(cfb.h) ? false : $$2.c(cfb.h).get().a($$1);
   }

   public static bvx a(bvx $$0, Optional<bvx> $$1, bvx $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bvx a(bvx $$0, bvx $$1, bvx $$2) {
      fbr $$3 = $$1.du();
      fbr $$4 = $$2.du();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bvx> a(bvx $$0, cfb<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ec().c($$1);
      return $$2.<bvb>map($$1x -> ((arx)$$0.dW()).a($$1x)).map($$0x -> $$0x instanceof bvx $$1x ? $$1x : null);
   }

   @Nullable
   public static fbr a(bwf $$0, int $$1, int $$2) {
      fbr $$3 = cgs.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dW().a_(jh.a((ka)$$3)).a(euf.b) && $$4++ < 10) {
         $$3 = cgs.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bvx $$0) {
      return $$0.ec().a(cfb.r);
   }
}
