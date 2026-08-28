import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvf {
   private bvf() {
   }

   public static void a(btk $$0, btk $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bum<?> $$0, btk $$1) {
      Optional<ccq> $$2 = $$0.c(cco.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bum<?> $$0, cco<? extends btk> $$1, bsv<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ak() == $$2);
   }

   private static boolean a(bum<?> $$0, cco<? extends btk> $$1, Predicate<btk> $$2) {
      return $$0.c($$1).filter($$2).filter(btk::bD).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(btk $$0, btk $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(btk $$0, btk $$1) {
      $$0.dS().a(cco.n, new bvo($$1, true));
   }

   private static void b(btk $$0, btk $$1, float $$2, int $$3) {
      a($$0, (bsp)$$1, $$2, $$3);
      a($$1, (bsp)$$0, $$2, $$3);
   }

   public static void a(btk $$0, bsp $$1, float $$2, int $$3) {
      a($$0, new bvo($$1, true), $$2, $$3);
   }

   public static void a(btk $$0, iz $$1, float $$2, int $$3) {
      a($$0, new bvg($$1), $$2, $$3);
   }

   public static void a(btk $$0, bwr $$1, float $$2, int $$3) {
      ccr $$4 = new ccr($$1, $$2, $$3);
      $$0.dS().a(cco.n, $$1);
      $$0.dS().a(cco.m, $$4);
   }

   public static void a(btk $$0, cuk $$1, evm $$2) {
      evm $$3 = new evm(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(btk $$0, cuk $$1, evm $$2, evm $$3, float $$4) {
      double $$5 = $$0.dy() - (double)$$4;
      cjc $$6 = new cjc($$0.dP(), $$0.du(), $$5, $$0.dA(), $$1);
      $$6.b($$0);
      evm $$7 = $$2.d($$0.dn());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.h($$7);
      $$6.v();
      $$0.dP().b($$6);
   }

   public static kb a(arb $$0, kb $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kb.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(btm $$0, btk $$1, int $$2) {
      if ($$0.eX().g() instanceof cvd $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(btk $$0, btk $$1, double $$2) {
      Optional<btk> $$3 = $$0.dS().c(cco.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dn());
         double $$5 = $$0.f($$1.dn());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(btk $$0, btk $$1) {
      bum<?> $$2 = $$0.dS();
      return !$$2.a(cco.h) ? false : $$2.c(cco.h).get().a($$1);
   }

   public static btk a(btk $$0, Optional<btk> $$1, btk $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static btk a(btk $$0, btk $$1, btk $$2) {
      evm $$3 = $$1.dn();
      evm $$4 = $$2.dn();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<btk> a(btk $$0, cco<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dS().c($$1);
      return $$2.<bsp>map($$1x -> ((arb)$$0.dP()).a($$1x)).map($$0x -> $$0x instanceof btk $$1x ? $$1x : null);
   }

   @Nullable
   public static evm a(btt $$0, int $$1, int $$2) {
      evm $$3 = cef.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dP().a_(iz.a($$3)).a(eof.b) && $$4++ < 10) {
         $$3 = cef.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(btk $$0) {
      return $$0.dS().a(cco.r);
   }
}
