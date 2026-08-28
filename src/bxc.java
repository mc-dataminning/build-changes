import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxc {
   private bxc() {
   }

   public static void a(bvh $$0, bvh $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bwj<?> $$0, bvh $$1) {
      Optional<cen> $$2 = $$0.c(cel.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bwj<?> $$0, cel<? extends bvh> $$1, bus<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bwj<?> $$0, cel<? extends bvh> $$1, Predicate<bvh> $$2) {
      return $$0.c($$1).filter($$2).filter(bvh::bL).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bvh $$0, bvh $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bvh $$0, bvh $$1) {
      $$0.eb().a(cel.n, new bxl($$1, true));
   }

   private static void b(bvh $$0, bvh $$1, float $$2, int $$3) {
      a($$0, (bul)$$1, $$2, $$3);
      a($$1, (bul)$$0, $$2, $$3);
   }

   public static void a(bvh $$0, bul $$1, float $$2, int $$3) {
      a($$0, new bxl($$1, true), $$2, $$3);
   }

   public static void a(bvh $$0, ji $$1, float $$2, int $$3) {
      a($$0, new bxd($$1), $$2, $$3);
   }

   public static void a(bvh $$0, byo $$1, float $$2, int $$3) {
      ceo $$4 = new ceo($$1, $$2, $$3);
      $$0.eb().a(cel.n, $$1);
      $$0.eb().a(cel.m, $$4);
   }

   public static void a(bvh $$0, cwp $$1, fba $$2) {
      fba $$3 = new fba(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bvh $$0, cwp $$1, fba $$2, fba $$3, float $$4) {
      double $$5 = $$0.dE() - (double)$$4;
      clc $$6 = new clc($$0.dV(), $$0.dA(), $$5, $$0.dG(), $$1);
      $$6.b($$0);
      fba $$7 = $$2.d($$0.dt());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.s();
      $$0.dV().b($$6);
   }

   public static kk a(ard $$0, kk $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kk.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bvj $$0, bvh $$1, int $$2) {
      if ($$0.eZ().h() instanceof cxl $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bvh $$0, bvh $$1, double $$2) {
      Optional<bvh> $$3 = $$0.eb().c(cel.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dt());
         double $$5 = $$0.g($$1.dt());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bvh $$0, bvh $$1) {
      bwj<?> $$2 = $$0.eb();
      return !$$2.a(cel.h) ? false : $$2.c(cel.h).get().a($$1);
   }

   public static bvh a(bvh $$0, Optional<bvh> $$1, bvh $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bvh a(bvh $$0, bvh $$1, bvh $$2) {
      fba $$3 = $$1.dt();
      fba $$4 = $$2.dt();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<bvh> a(bvh $$0, cel<UUID> $$1) {
      Optional<UUID> $$2 = $$0.eb().c($$1);
      return $$2.<bul>map($$1x -> ((ard)$$0.dV()).a($$1x)).map($$0x -> $$0x instanceof bvh $$1x ? $$1x : null);
   }

   @Nullable
   public static fba a(bvp $$0, int $$1, int $$2) {
      fba $$3 = cgc.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dV().a_(ji.a((kb)$$3)).a(eto.b) && $$4++ < 10) {
         $$3 = cgc.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bvh $$0) {
      return $$0.eb().a(cel.r);
   }
}
