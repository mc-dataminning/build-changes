import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvk {
   private bvk() {
   }

   public static void a(btp $$0, btp $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bur<?> $$0, btp $$1) {
      Optional<ccv> $$2 = $$0.c(cct.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bur<?> $$0, cct<? extends btp> $$1, bta<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ak() == $$2);
   }

   private static boolean a(bur<?> $$0, cct<? extends btp> $$1, Predicate<btp> $$2) {
      return $$0.c($$1).filter($$2).filter(btp::bD).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(btp $$0, btp $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(btp $$0, btp $$1) {
      $$0.dS().a(cct.n, new bvt($$1, true));
   }

   private static void b(btp $$0, btp $$1, float $$2, int $$3) {
      a($$0, (bsu)$$1, $$2, $$3);
      a($$1, (bsu)$$0, $$2, $$3);
   }

   public static void a(btp $$0, bsu $$1, float $$2, int $$3) {
      a($$0, new bvt($$1, true), $$2, $$3);
   }

   public static void a(btp $$0, iz $$1, float $$2, int $$3) {
      a($$0, new bvl($$1), $$2, $$3);
   }

   public static void a(btp $$0, bww $$1, float $$2, int $$3) {
      ccw $$4 = new ccw($$1, $$2, $$3);
      $$0.dS().a(cct.n, $$1);
      $$0.dS().a(cct.m, $$4);
   }

   public static void a(btp $$0, cup $$1, evr $$2) {
      evr $$3 = new evr(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(btp $$0, cup $$1, evr $$2, evr $$3, float $$4) {
      double $$5 = $$0.dy() - (double)$$4;
      cjh $$6 = new cjh($$0.dP(), $$0.du(), $$5, $$0.dA(), $$1);
      $$6.b($$0);
      evr $$7 = $$2.d($$0.dn());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.h($$7);
      $$6.v();
      $$0.dP().b($$6);
   }

   public static kb a(arf $$0, kb $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kb.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(btr $$0, btp $$1, int $$2) {
      if ($$0.eX().g() instanceof cvi $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(btp $$0, btp $$1, double $$2) {
      Optional<btp> $$3 = $$0.dS().c(cct.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dn());
         double $$5 = $$0.f($$1.dn());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(btp $$0, btp $$1) {
      bur<?> $$2 = $$0.dS();
      return !$$2.a(cct.h) ? false : $$2.c(cct.h).get().a($$1);
   }

   public static btp a(btp $$0, Optional<btp> $$1, btp $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static btp a(btp $$0, btp $$1, btp $$2) {
      evr $$3 = $$1.dn();
      evr $$4 = $$2.dn();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<btp> a(btp $$0, cct<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dS().c($$1);
      return $$2.<bsu>map($$1x -> ((arf)$$0.dP()).a($$1x)).map($$0x -> $$0x instanceof btp $$1x ? $$1x : null);
   }

   @Nullable
   public static evr a(bty $$0, int $$1, int $$2) {
      evr $$3 = cek.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dP().a_(iz.a($$3)).a(eok.b) && $$4++ < 10) {
         $$3 = cek.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(btp $$0) {
      return $$0.dS().a(cct.r);
   }
}
