import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxb {
   private bxb() {
   }

   public static void a(bvg $$0, bvg $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bwi<?> $$0, bvg $$1) {
      Optional<cem> $$2 = $$0.c(cek.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bwi<?> $$0, cek<? extends bvg> $$1, bur<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bwi<?> $$0, cek<? extends bvg> $$1, Predicate<bvg> $$2) {
      return $$0.c($$1).filter($$2).filter(bvg::bL).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bvg $$0, bvg $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bvg $$0, bvg $$1) {
      $$0.ec().a(cek.n, new bxk($$1, true));
   }

   private static void b(bvg $$0, bvg $$1, float $$2, int $$3) {
      a($$0, (buk)$$1, $$2, $$3);
      a($$1, (buk)$$0, $$2, $$3);
   }

   public static void a(bvg $$0, buk $$1, float $$2, int $$3) {
      a($$0, new bxk($$1, true), $$2, $$3);
   }

   public static void a(bvg $$0, ji $$1, float $$2, int $$3) {
      a($$0, new bxc($$1), $$2, $$3);
   }

   public static void a(bvg $$0, byn $$1, float $$2, int $$3) {
      cen $$4 = new cen($$1, $$2, $$3);
      $$0.ec().a(cek.n, $$1);
      $$0.ec().a(cek.m, $$4);
   }

   public static void a(bvg $$0, cwp $$1, fba $$2) {
      fba $$3 = new fba(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bvg $$0, cwp $$1, fba $$2, fba $$3, float $$4) {
      double $$5 = $$0.dF() - (double)$$4;
      clb $$6 = new clb($$0.dW(), $$0.dB(), $$5, $$0.dH(), $$1);
      $$6.b($$0);
      fba $$7 = $$2.d($$0.du());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.h($$7);
      $$6.s();
      $$0.dW().b($$6);
   }

   public static kk a(arc $$0, kk $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kk.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bvi $$0, bvg $$1, int $$2) {
      if ($$0.eZ().h() instanceof cxl $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bvg $$0, bvg $$1, double $$2) {
      Optional<bvg> $$3 = $$0.ec().c(cek.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().du());
         double $$5 = $$0.f($$1.du());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bvg $$0, bvg $$1) {
      bwi<?> $$2 = $$0.ec();
      return !$$2.a(cek.h) ? false : $$2.c(cek.h).get().a($$1);
   }

   public static bvg a(bvg $$0, Optional<bvg> $$1, bvg $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bvg a(bvg $$0, bvg $$1, bvg $$2) {
      fba $$3 = $$1.du();
      fba $$4 = $$2.du();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bvg> a(bvg $$0, cek<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ec().c($$1);
      return $$2.<buk>map($$1x -> ((arc)$$0.dW()).a($$1x)).map($$0x -> $$0x instanceof bvg $$1x ? $$1x : null);
   }

   @Nullable
   public static fba a(bvo $$0, int $$1, int $$2) {
      fba $$3 = cgb.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dW().a_(ji.a((kb)$$3)).a(eto.b) && $$4++ < 10) {
         $$3 = cgb.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bvg $$0) {
      return $$0.ec().a(cek.r);
   }
}
