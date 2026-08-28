import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwv {
   private bwv() {
   }

   public static void a(bva $$0, bva $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bwc<?> $$0, bva $$1) {
      Optional<ceg> $$2 = $$0.c(cee.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bwc<?> $$0, cee<? extends bva> $$1, bul<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ar() == $$2);
   }

   private static boolean a(bwc<?> $$0, cee<? extends bva> $$1, Predicate<bva> $$2) {
      return $$0.c($$1).filter($$2).filter(bva::bM).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bva $$0, bva $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bva $$0, bva $$1) {
      $$0.ed().a(cee.n, new bxe($$1, true));
   }

   private static void b(bva $$0, bva $$1, float $$2, int $$3) {
      a($$0, (bue)$$1, $$2, $$3);
      a($$1, (bue)$$0, $$2, $$3);
   }

   public static void a(bva $$0, bue $$1, float $$2, int $$3) {
      a($$0, new bxe($$1, true), $$2, $$3);
   }

   public static void a(bva $$0, jh $$1, float $$2, int $$3) {
      a($$0, new bww($$1), $$2, $$3);
   }

   public static void a(bva $$0, byh $$1, float $$2, int $$3) {
      ceh $$4 = new ceh($$1, $$2, $$3);
      $$0.ed().a(cee.n, $$1);
      $$0.ed().a(cee.m, $$4);
   }

   public static void a(bva $$0, cwb $$1, ezn $$2) {
      ezn $$3 = new ezn(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bva $$0, cwb $$1, ezn $$2, ezn $$3, float $$4) {
      double $$5 = $$0.dG() - (double)$$4;
      ckv $$6 = new ckv($$0.dX(), $$0.dC(), $$5, $$0.dI(), $$1);
      $$6.b($$0);
      ezn $$7 = $$2.d($$0.dv());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.h($$7);
      $$6.q();
      $$0.dX().b($$6);
   }

   public static kj a(arn $$0, kj $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kj.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bvc $$0, bva $$1, int $$2) {
      if ($$0.fb().h() instanceof cwx $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bva $$0, bva $$1, double $$2) {
      Optional<bva> $$3 = $$0.ed().c(cee.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dv());
         double $$5 = $$0.f($$1.dv());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bva $$0, bva $$1) {
      bwc<?> $$2 = $$0.ed();
      return !$$2.a(cee.h) ? false : $$2.c(cee.h).get().a($$1);
   }

   public static bva a(bva $$0, Optional<bva> $$1, bva $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bva a(bva $$0, bva $$1, bva $$2) {
      ezn $$3 = $$1.dv();
      ezn $$4 = $$2.dv();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bva> a(bva $$0, cee<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ed().c($$1);
      return $$2.<bue>map($$1x -> ((arn)$$0.dX()).a($$1x)).map($$0x -> $$0x instanceof bva $$1x ? $$1x : null);
   }

   @Nullable
   public static ezn a(bvi $$0, int $$1, int $$2) {
      ezn $$3 = cfv.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dX().a_(jh.a((ka)$$3)).a(erz.b) && $$4++ < 10) {
         $$3 = cfv.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bva $$0) {
      return $$0.ed().a(cee.r);
   }
}
