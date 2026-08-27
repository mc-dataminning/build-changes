import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buj {
   private buj() {
   }

   public static void a(bso $$0, bso $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(btq<?> $$0, bso $$1) {
      Optional<cbu> $$2 = $$0.c(cbs.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(btq<?> $$0, cbs<? extends bso> $$1, bsa<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ak() == $$2);
   }

   private static boolean a(btq<?> $$0, cbs<? extends bso> $$1, Predicate<bso> $$2) {
      return $$0.c($$1).filter($$2).filter(bso::bD).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bso $$0, bso $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bso $$0, bso $$1) {
      $$0.dS().a(cbs.n, new bus($$1, true));
   }

   private static void b(bso $$0, bso $$1, float $$2, int $$3) {
      a($$0, (bru)$$1, $$2, $$3);
      a($$1, (bru)$$0, $$2, $$3);
   }

   public static void a(bso $$0, bru $$1, float $$2, int $$3) {
      a($$0, new bus($$1, true), $$2, $$3);
   }

   public static void a(bso $$0, io $$1, float $$2, int $$3) {
      a($$0, new buk($$1), $$2, $$3);
   }

   public static void a(bso $$0, bvv $$1, float $$2, int $$3) {
      cbv $$4 = new cbv($$1, $$2, $$3);
      $$0.dS().a(cbs.n, $$1);
      $$0.dS().a(cbs.m, $$4);
   }

   public static void a(bso $$0, cto $$1, euk $$2) {
      euk $$3 = new euk(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bso $$0, cto $$1, euk $$2, euk $$3, float $$4) {
      double $$5 = $$0.dy() - (double)$$4;
      cig $$6 = new cig($$0.dP(), $$0.du(), $$5, $$0.dA(), $$1);
      $$6.b($$0);
      euk $$7 = $$2.d($$0.dn());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.v();
      $$0.dP().b($$6);
   }

   public static jq a(aqm $$0, jq $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jq.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bsq $$0, bso $$1, int $$2) {
      if ($$0.eX().g() instanceof cuh $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bso $$0, bso $$1, double $$2) {
      Optional<bso> $$3 = $$0.dS().c(cbs.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dn());
         double $$5 = $$0.f($$1.dn());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bso $$0, bso $$1) {
      btq<?> $$2 = $$0.dS();
      return !$$2.a(cbs.h) ? false : $$2.c(cbs.h).get().a($$1);
   }

   public static bso a(bso $$0, Optional<bso> $$1, bso $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bso a(bso $$0, bso $$1, bso $$2) {
      euk $$3 = $$1.dn();
      euk $$4 = $$2.dn();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bso> a(bso $$0, cbs<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dS().c($$1);
      return $$2.<bru>map($$1x -> ((aqm)$$0.dP()).a($$1x)).map($$0x -> $$0x instanceof bso $$1x ? $$1x : null);
   }

   @Nullable
   public static euk a(bsx $$0, int $$1, int $$2) {
      euk $$3 = cdj.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dP().a_(io.a($$3)).a(enj.b) && $$4++ < 10) {
         $$3 = cdj.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bso $$0) {
      return $$0.dS().a(cbs.r);
   }
}
