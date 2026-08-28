import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byb {
   private byb() {
   }

   public static void a(bwg $$0, bwg $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bxi<?> $$0, bwg $$1) {
      Optional<cfm> $$2 = $$0.c(cfk.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bxi<?> $$0, cfk<? extends bwg> $$1, bvr<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bxi<?> $$0, cfk<? extends bwg> $$1, Predicate<bwg> $$2) {
      return $$0.c($$1).filter($$2).filter(bwg::bL).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bwg $$0, bwg $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bwg $$0, bwg $$1) {
      $$0.ec().a(cfk.n, new byk($$1, true));
   }

   private static void b(bwg $$0, bwg $$1, float $$2, int $$3) {
      a($$0, (bvk)$$1, $$2, $$3);
      a($$1, (bvk)$$0, $$2, $$3);
   }

   public static void a(bwg $$0, bvk $$1, float $$2, int $$3) {
      a($$0, new byk($$1, true), $$2, $$3);
   }

   public static void a(bwg $$0, jh $$1, float $$2, int $$3) {
      a($$0, new byc($$1), $$2, $$3);
   }

   public static void a(bwg $$0, bzn $$1, float $$2, int $$3) {
      cfn $$4 = new cfn($$1, $$2, $$3);
      $$0.ec().a(cfk.n, $$1);
      $$0.ec().a(cfk.m, $$4);
   }

   public static void a(bwg $$0, cxp $$1, fby $$2) {
      fby $$3 = new fby(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bwg $$0, cxp $$1, fby $$2, fby $$3, float $$4) {
      double $$5 = $$0.dF() - (double)$$4;
      cmb $$6 = new cmb($$0.dW(), $$0.dB(), $$5, $$0.dH(), $$1);
      $$6.b($$0);
      fby $$7 = $$2.d($$0.du());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.h($$7);
      $$6.s();
      $$0.dW().b($$6);
   }

   public static kj a(ash $$0, kj $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kj.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bwi $$0, bwg $$1, int $$2) {
      if ($$0.eZ().h() instanceof cyl $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bwg $$0, bwg $$1, double $$2) {
      Optional<bwg> $$3 = $$0.ec().c(cfk.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().du());
         double $$5 = $$0.f($$1.du());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bwg $$0, bwg $$1) {
      bxi<?> $$2 = $$0.ec();
      return !$$2.a(cfk.h) ? false : $$2.c(cfk.h).get().a($$1);
   }

   public static bwg a(bwg $$0, Optional<bwg> $$1, bwg $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bwg a(bwg $$0, bwg $$1, bwg $$2) {
      fby $$3 = $$1.du();
      fby $$4 = $$2.du();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bwg> a(bwg $$0, cfk<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ec().c($$1);
      return $$2.<bvk>map($$1x -> ((ash)$$0.dW()).a($$1x)).map($$0x -> $$0x instanceof bwg $$1x ? $$1x : null);
   }

   @Nullable
   public static fby a(bwo $$0, int $$1, int $$2) {
      fby $$3 = chb.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dW().a_(jh.a((ka)$$3)).a(eum.b) && $$4++ < 10) {
         $$3 = chb.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bwg $$0) {
      return $$0.ec().a(cfk.r);
   }
}
