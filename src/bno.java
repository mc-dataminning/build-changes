import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bno {
   private bno() {
   }

   public static void a(blv $$0, blv $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bmv<?> $$0, blv $$1) {
      Optional<buz> $$2 = $$0.c(bux.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bmv<?> $$0, bux<? extends blv> $$1, blj<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bmv<?> $$0, bux<? extends blv> $$1, Predicate<blv> $$2) {
      return $$0.c($$1).filter($$2).filter(blv::bx).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(blv $$0, blv $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(blv $$0, blv $$1) {
      $$0.dO().a(bux.n, new bnx($$1, true));
   }

   private static void b(blv $$0, blv $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(blv $$0, blf $$1, float $$2, int $$3) {
      a($$0, new bnx($$1, true), $$2, $$3);
   }

   public static void a(blv $$0, hv $$1, float $$2, int $$3) {
      a($$0, new bnp($$1), $$2, $$3);
   }

   public static void a(blv $$0, bpa $$1, float $$2, int $$3) {
      bva $$4 = new bva($$1, $$2, $$3);
      $$0.dO().a(bux.n, $$1);
      $$0.dO().a(bux.m, $$4);
   }

   public static void a(blv $$0, cmh $$1, elb $$2) {
      elb $$3 = new elb(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(blv $$0, cmh $$1, elb $$2, elb $$3, float $$4) {
      double $$5 = $$0.dv() - (double)$$4;
      cbe $$6 = new cbe($$0.dM(), $$0.dr(), $$5, $$0.dx(), $$1);
      $$6.a($$0);
      elb $$7 = $$2.d($$0.dk());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.u();
      $$0.dM().b($$6);
   }

   public static ix a(amp $$0, ix $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return ix.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(blx $$0, blv $$1, int $$2) {
      if ($$0.eT().d() instanceof cmx $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(blv $$0, blv $$1, double $$2) {
      Optional<blv> $$3 = $$0.dO().c(bux.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dk());
         double $$5 = $$0.f($$1.dk());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(blv $$0, blv $$1) {
      bmv<?> $$2 = $$0.dO();
      return !$$2.a(bux.h) ? false : $$2.c(bux.h).get().a($$1);
   }

   public static blv a(blv $$0, Optional<blv> $$1, blv $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static blv a(blv $$0, blv $$1, blv $$2) {
      elb $$3 = $$1.dk();
      elb $$4 = $$2.dk();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<blv> a(blv $$0, bux<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dO().c($$1);
      return $$2.<blf>map($$1x -> ((amp)$$0.dM()).a($$1x)).map($$0x -> $$0x instanceof blv $$1x ? $$1x : null);
   }

   @Nullable
   public static elb a(bme $$0, int $$1, int $$2) {
      elb $$3 = bwn.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dM().a_(hv.a($$3)).a($$0.dM(), hv.a($$3), eep.b) && $$4++ < 10) {
         $$3 = bwn.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(blv $$0) {
      return $$0.dO().a(bux.r);
   }
}
