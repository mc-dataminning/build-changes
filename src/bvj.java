import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvj {
   private bvj() {
   }

   public static void a(btn $$0, btn $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(buq<?> $$0, btn $$1) {
      Optional<ccu> $$2 = $$0.c(ccs.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(buq<?> $$0, ccs<? extends btn> $$1, bsx<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.am() == $$2);
   }

   private static boolean a(buq<?> $$0, ccs<? extends btn> $$1, Predicate<btn> $$2) {
      return $$0.c($$1).filter($$2).filter(btn::bE).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(btn $$0, btn $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(btn $$0, btn $$1) {
      $$0.dU().a(ccs.n, new bvs($$1, true));
   }

   private static void b(btn $$0, btn $$1, float $$2, int $$3) {
      a($$0, (bsr)$$1, $$2, $$3);
      a($$1, (bsr)$$0, $$2, $$3);
   }

   public static void a(btn $$0, bsr $$1, float $$2, int $$3) {
      a($$0, new bvs($$1, true), $$2, $$3);
   }

   public static void a(btn $$0, jd $$1, float $$2, int $$3) {
      a($$0, new bvk($$1), $$2, $$3);
   }

   public static void a(btn $$0, bwv $$1, float $$2, int $$3) {
      ccv $$4 = new ccv($$1, $$2, $$3);
      $$0.dU().a(ccs.n, $$1);
      $$0.dU().a(ccs.m, $$4);
   }

   public static void a(btn $$0, cuq $$1, exa $$2) {
      exa $$3 = new exa(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(btn $$0, cuq $$1, exa $$2, exa $$3, float $$4) {
      double $$5 = $$0.dy() - (double)$$4;
      cjh $$6 = new cjh($$0.dP(), $$0.du(), $$5, $$0.dA(), $$1);
      $$6.b($$0);
      exa $$7 = $$2.d($$0.dn());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.i($$7);
      $$6.v();
      $$0.dP().b($$6);
   }

   public static kf a(aqu $$0, kf $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kf.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(btp $$0, btn $$1, int $$2) {
      if ($$0.eU().g() instanceof cvn $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(btn $$0, btn $$1, double $$2) {
      Optional<btn> $$3 = $$0.dU().c(ccs.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dn());
         double $$5 = $$0.g($$1.dn());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(btn $$0, btn $$1) {
      buq<?> $$2 = $$0.dU();
      return !$$2.a(ccs.h) ? false : $$2.c(ccs.h).get().a($$1);
   }

   public static btn a(btn $$0, Optional<btn> $$1, btn $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static btn a(btn $$0, btn $$1, btn $$2) {
      exa $$3 = $$1.dn();
      exa $$4 = $$2.dn();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<btn> a(btn $$0, ccs<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dU().c($$1);
      return $$2.<bsr>map($$1x -> ((aqu)$$0.dP()).a($$1x)).map($$0x -> $$0x instanceof btn $$1x ? $$1x : null);
   }

   @Nullable
   public static exa a(btw $$0, int $$1, int $$2) {
      exa $$3 = cej.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dP().a_(jd.a((jw)$$3)).a(epr.b) && $$4++ < 10) {
         $$3 = cej.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(btn $$0) {
      return $$0.dU().a(ccs.r);
   }
}
