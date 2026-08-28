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
      $$0.eb().a(cek.n, new bxk($$1, true));
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
      $$0.eb().a(cek.n, $$1);
      $$0.eb().a(cek.m, $$4);
   }

   public static void a(bvg $$0, cwo $$1, faz $$2) {
      faz $$3 = new faz(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bvg $$0, cwo $$1, faz $$2, faz $$3, float $$4) {
      double $$5 = $$0.dE() - (double)$$4;
      clb $$6 = new clb($$0.dV(), $$0.dA(), $$5, $$0.dG(), $$1);
      $$6.b($$0);
      faz $$7 = $$2.d($$0.dt());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.s();
      $$0.dV().b($$6);
   }

   public static kk a(ard $$0, kk $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kk.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bvi $$0, bvg $$1, int $$2) {
      if ($$0.eZ().h() instanceof cxk $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bvg $$0, bvg $$1, double $$2) {
      Optional<bvg> $$3 = $$0.eb().c(cek.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dt());
         double $$5 = $$0.g($$1.dt());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bvg $$0, bvg $$1) {
      bwi<?> $$2 = $$0.eb();
      return !$$2.a(cek.h) ? false : $$2.c(cek.h).get().a($$1);
   }

   public static bvg a(bvg $$0, Optional<bvg> $$1, bvg $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bvg a(bvg $$0, bvg $$1, bvg $$2) {
      faz $$3 = $$1.dt();
      faz $$4 = $$2.dt();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<bvg> a(bvg $$0, cek<UUID> $$1) {
      Optional<UUID> $$2 = $$0.eb().c($$1);
      return $$2.<buk>map($$1x -> ((ard)$$0.dV()).a($$1x)).map($$0x -> $$0x instanceof bvg $$1x ? $$1x : null);
   }

   @Nullable
   public static faz a(bvo $$0, int $$1, int $$2) {
      faz $$3 = cgb.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dV().a_(ji.a((kb)$$3)).a(etn.b) && $$4++ < 10) {
         $$3 = cgb.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bvg $$0) {
      return $$0.eb().a(cek.r);
   }
}
