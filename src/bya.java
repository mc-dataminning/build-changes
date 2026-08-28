import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bya {
   private bya() {
   }

   public static void a(bwf $$0, bwf $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bxh<?> $$0, bwf $$1) {
      Optional<cfl> $$2 = $$0.c(cfj.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bxh<?> $$0, cfj<? extends bwf> $$1, bvq<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bxh<?> $$0, cfj<? extends bwf> $$1, Predicate<bwf> $$2) {
      return $$0.c($$1).filter($$2).filter(bwf::bL).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bwf $$0, bwf $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bwf $$0, bwf $$1) {
      $$0.ec().a(cfj.n, new byj($$1, true));
   }

   private static void b(bwf $$0, bwf $$1, float $$2, int $$3) {
      a($$0, (bvj)$$1, $$2, $$3);
      a($$1, (bvj)$$0, $$2, $$3);
   }

   public static void a(bwf $$0, bvj $$1, float $$2, int $$3) {
      a($$0, new byj($$1, true), $$2, $$3);
   }

   public static void a(bwf $$0, jh $$1, float $$2, int $$3) {
      a($$0, new byb($$1), $$2, $$3);
   }

   public static void a(bwf $$0, bzm $$1, float $$2, int $$3) {
      cfm $$4 = new cfm($$1, $$2, $$3);
      $$0.ec().a(cfj.n, $$1);
      $$0.ec().a(cfj.m, $$4);
   }

   public static void a(bwf $$0, cxo $$1, fbx $$2) {
      fbx $$3 = new fbx(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bwf $$0, cxo $$1, fbx $$2, fbx $$3, float $$4) {
      double $$5 = $$0.dF() - (double)$$4;
      cma $$6 = new cma($$0.dW(), $$0.dB(), $$5, $$0.dH(), $$1);
      $$6.b($$0);
      fbx $$7 = $$2.d($$0.du());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.h($$7);
      $$6.s();
      $$0.dW().b($$6);
   }

   public static kj a(ash $$0, kj $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kj.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bwh $$0, bwf $$1, int $$2) {
      if ($$0.eZ().h() instanceof cyk $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bwf $$0, bwf $$1, double $$2) {
      Optional<bwf> $$3 = $$0.ec().c(cfj.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().du());
         double $$5 = $$0.f($$1.du());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bwf $$0, bwf $$1) {
      bxh<?> $$2 = $$0.ec();
      return !$$2.a(cfj.h) ? false : $$2.c(cfj.h).get().a($$1);
   }

   public static bwf a(bwf $$0, Optional<bwf> $$1, bwf $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bwf a(bwf $$0, bwf $$1, bwf $$2) {
      fbx $$3 = $$1.du();
      fbx $$4 = $$2.du();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bwf> a(bwf $$0, cfj<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ec().c($$1);
      return $$2.<bvj>map($$1x -> ((ash)$$0.dW()).a($$1x)).map($$0x -> $$0x instanceof bwf $$1x ? $$1x : null);
   }

   @Nullable
   public static fbx a(bwn $$0, int $$1, int $$2) {
      fbx $$3 = cha.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dW().a_(jh.a((ka)$$3)).a(eul.b) && $$4++ < 10) {
         $$3 = cha.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bwf $$0) {
      return $$0.ec().a(cfj.r);
   }
}
