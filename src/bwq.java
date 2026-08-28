import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwq {
   private bwq() {
   }

   public static void a(buv $$0, buv $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bvx<?> $$0, buv $$1) {
      Optional<ceb> $$2 = $$0.c(cdz.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bvx<?> $$0, cdz<? extends buv> $$1, bug<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bvx<?> $$0, cdz<? extends buv> $$1, Predicate<buv> $$2) {
      return $$0.c($$1).filter($$2).filter(buv::bM).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(buv $$0, buv $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(buv $$0, buv $$1) {
      $$0.ed().a(cdz.n, new bwz($$1, true));
   }

   private static void b(buv $$0, buv $$1, float $$2, int $$3) {
      a($$0, (btz)$$1, $$2, $$3);
      a($$1, (btz)$$0, $$2, $$3);
   }

   public static void a(buv $$0, btz $$1, float $$2, int $$3) {
      a($$0, new bwz($$1, true), $$2, $$3);
   }

   public static void a(buv $$0, jg $$1, float $$2, int $$3) {
      a($$0, new bwr($$1), $$2, $$3);
   }

   public static void a(buv $$0, byc $$1, float $$2, int $$3) {
      cec $$4 = new cec($$1, $$2, $$3);
      $$0.ed().a(cdz.n, $$1);
      $$0.ed().a(cdz.m, $$4);
   }

   public static void a(buv $$0, cvx $$1, ezh $$2) {
      ezh $$3 = new ezh(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(buv $$0, cvx $$1, ezh $$2, ezh $$3, float $$4) {
      double $$5 = $$0.dG() - (double)$$4;
      ckq $$6 = new ckq($$0.dX(), $$0.dC(), $$5, $$0.dI(), $$1);
      $$6.b($$0);
      ezh $$7 = $$2.d($$0.dv());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.h($$7);
      $$6.q();
      $$0.dX().b($$6);
   }

   public static ki a(arm $$0, ki $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return ki.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bux $$0, buv $$1, int $$2) {
      if ($$0.fb().h() instanceof cwt $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(buv $$0, buv $$1, double $$2) {
      Optional<buv> $$3 = $$0.ed().c(cdz.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dv());
         double $$5 = $$0.f($$1.dv());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(buv $$0, buv $$1) {
      bvx<?> $$2 = $$0.ed();
      return !$$2.a(cdz.h) ? false : $$2.c(cdz.h).get().a($$1);
   }

   public static buv a(buv $$0, Optional<buv> $$1, buv $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static buv a(buv $$0, buv $$1, buv $$2) {
      ezh $$3 = $$1.dv();
      ezh $$4 = $$2.dv();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<buv> a(buv $$0, cdz<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ed().c($$1);
      return $$2.<btz>map($$1x -> ((arm)$$0.dX()).a($$1x)).map($$0x -> $$0x instanceof buv $$1x ? $$1x : null);
   }

   @Nullable
   public static ezh a(bvd $$0, int $$1, int $$2) {
      ezh $$3 = cfq.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dX().a_(jg.a((jz)$$3)).a(ert.b) && $$4++ < 10) {
         $$3 = cfq.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(buv $$0) {
      return $$0.ed().a(cdz.r);
   }
}
