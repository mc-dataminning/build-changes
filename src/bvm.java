import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvm {
   private bvm() {
   }

   public static void a(btr $$0, btr $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(but<?> $$0, btr $$1) {
      Optional<ccx> $$2 = $$0.c(ccv.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(but<?> $$0, ccv<? extends btr> $$1, btc<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ak() == $$2);
   }

   private static boolean a(but<?> $$0, ccv<? extends btr> $$1, Predicate<btr> $$2) {
      return $$0.c($$1).filter($$2).filter(btr::bD).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(btr $$0, btr $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(btr $$0, btr $$1) {
      $$0.dS().a(ccv.n, new bvv($$1, true));
   }

   private static void b(btr $$0, btr $$1, float $$2, int $$3) {
      a($$0, (bsw)$$1, $$2, $$3);
      a($$1, (bsw)$$0, $$2, $$3);
   }

   public static void a(btr $$0, bsw $$1, float $$2, int $$3) {
      a($$0, new bvv($$1, true), $$2, $$3);
   }

   public static void a(btr $$0, iz $$1, float $$2, int $$3) {
      a($$0, new bvn($$1), $$2, $$3);
   }

   public static void a(btr $$0, bwy $$1, float $$2, int $$3) {
      ccy $$4 = new ccy($$1, $$2, $$3);
      $$0.dS().a(ccv.n, $$1);
      $$0.dS().a(ccv.m, $$4);
   }

   public static void a(btr $$0, cur $$1, evt $$2) {
      evt $$3 = new evt(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(btr $$0, cur $$1, evt $$2, evt $$3, float $$4) {
      double $$5 = $$0.dy() - (double)$$4;
      cjj $$6 = new cjj($$0.dP(), $$0.du(), $$5, $$0.dA(), $$1);
      $$6.b($$0);
      evt $$7 = $$2.d($$0.dn());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.h($$7);
      $$6.v();
      $$0.dP().b($$6);
   }

   public static kb a(arf $$0, kb $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kb.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(btt $$0, btr $$1, int $$2) {
      if ($$0.eX().g() instanceof cvk $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(btr $$0, btr $$1, double $$2) {
      Optional<btr> $$3 = $$0.dS().c(ccv.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dn());
         double $$5 = $$0.f($$1.dn());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(btr $$0, btr $$1) {
      but<?> $$2 = $$0.dS();
      return !$$2.a(ccv.h) ? false : $$2.c(ccv.h).get().a($$1);
   }

   public static btr a(btr $$0, Optional<btr> $$1, btr $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static btr a(btr $$0, btr $$1, btr $$2) {
      evt $$3 = $$1.dn();
      evt $$4 = $$2.dn();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<btr> a(btr $$0, ccv<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dS().c($$1);
      return $$2.<bsw>map($$1x -> ((arf)$$0.dP()).a($$1x)).map($$0x -> $$0x instanceof btr $$1x ? $$1x : null);
   }

   @Nullable
   public static evt a(bua $$0, int $$1, int $$2) {
      evt $$3 = cem.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dP().a_(iz.a($$3)).a(eom.b) && $$4++ < 10) {
         $$3 = cem.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(btr $$0) {
      return $$0.dS().a(ccv.r);
   }
}
