import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxt {
   private bxt() {
   }

   public static void a(bvy $$0, bvy $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bxa<?> $$0, bvy $$1) {
      Optional<cfe> $$2 = $$0.c(cfc.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bxa<?> $$0, cfc<? extends bvy> $$1, bvi<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bxa<?> $$0, cfc<? extends bvy> $$1, Predicate<bvy> $$2) {
      return $$0.c($$1).filter($$2).filter(bvy::bJ).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bvy $$0, bvy $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bvy $$0, bvy $$1) {
      $$0.ea().a(cfc.n, new byc($$1, true));
   }

   private static void b(bvy $$0, bvy $$1, float $$2, int $$3) {
      a($$0, (bva)$$1, $$2, $$3);
      a($$1, (bva)$$0, $$2, $$3);
   }

   public static void a(bvy $$0, bva $$1, float $$2, int $$3) {
      a($$0, new byc($$1, true), $$2, $$3);
   }

   public static void a(bvy $$0, ji $$1, float $$2, int $$3) {
      a($$0, new bxu($$1), $$2, $$3);
   }

   public static void a(bvy $$0, bzf $$1, float $$2, int $$3) {
      cff $$4 = new cff($$1, $$2, $$3);
      $$0.ea().a(cfc.n, $$1);
      $$0.ea().a(cfc.m, $$4);
   }

   public static void a(bvy $$0, cxh $$1, fbx $$2) {
      fbx $$3 = new fbx(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bvy $$0, cxh $$1, fbx $$2, fbx $$3, float $$4) {
      double $$5 = $$0.dD() - (double)$$4;
      clw $$6 = new clw($$0.dU(), $$0.dz(), $$5, $$0.dF(), $$1);
      $$6.b($$0);
      fbx $$7 = $$2.d($$0.ds());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.j();
      $$0.dU().b($$6);
   }

   public static kk a(ard $$0, kk $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kk.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bwa $$0, bvy $$1, int $$2) {
      if ($$0.eZ().h() instanceof cyc $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bvy $$0, bvy $$1, double $$2) {
      Optional<bvy> $$3 = $$0.ea().c(cfc.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().ds());
         double $$5 = $$0.g($$1.ds());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bvy $$0, bvy $$1) {
      bxa<?> $$2 = $$0.ea();
      return !$$2.a(cfc.h) ? false : $$2.c(cfc.h).get().a($$1);
   }

   public static bvy a(bvy $$0, Optional<bvy> $$1, bvy $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bvy a(bvy $$0, bvy $$1, bvy $$2) {
      fbx $$3 = $$1.ds();
      fbx $$4 = $$2.ds();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<bvy> a(bvy $$0, cfc<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ea().c($$1);
      return $$2.<bva>map($$1x -> ((ard)$$0.dU()).b($$1x)).map($$0x -> $$0x instanceof bvy $$1x ? $$1x : null);
   }

   @Nullable
   public static fbx a(bwg $$0, int $$1, int $$2) {
      fbx $$3 = cgt.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dU().a_(ji.a((kb)$$3)).a(eul.b) && $$4++ < 10) {
         $$3 = cgt.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bvy $$0) {
      return $$0.ea().a(cfc.r);
   }
}
