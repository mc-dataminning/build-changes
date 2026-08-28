import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwh {
   private bwh() {
   }

   public static void a(bun $$0, bun $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bvo<?> $$0, bun $$1) {
      Optional<cds> $$2 = $$0.c(cdq.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bvo<?> $$0, cdq<? extends bun> $$1, bty<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ao() == $$2);
   }

   private static boolean a(bvo<?> $$0, cdq<? extends bun> $$1, Predicate<bun> $$2) {
      return $$0.c($$1).filter($$2).filter(bun::bI).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bun $$0, bun $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bun $$0, bun $$1) {
      $$0.dY().a(cdq.n, new bwq($$1, true));
   }

   private static void b(bun $$0, bun $$1, float $$2, int $$3) {
      a($$0, (btr)$$1, $$2, $$3);
      a($$1, (btr)$$0, $$2, $$3);
   }

   public static void a(bun $$0, btr $$1, float $$2, int $$3) {
      a($$0, new bwq($$1, true), $$2, $$3);
   }

   public static void a(bun $$0, jf $$1, float $$2, int $$3) {
      a($$0, new bwi($$1), $$2, $$3);
   }

   public static void a(bun $$0, bxt $$1, float $$2, int $$3) {
      cdt $$4 = new cdt($$1, $$2, $$3);
      $$0.dY().a(cdq.n, $$1);
      $$0.dY().a(cdq.m, $$4);
   }

   public static void a(bun $$0, cvs $$1, eyw $$2) {
      eyw $$3 = new eyw(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bun $$0, cvs $$1, eyw $$2, eyw $$3, float $$4) {
      double $$5 = $$0.dB() - (double)$$4;
      ckh $$6 = new ckh($$0.dS(), $$0.dx(), $$5, $$0.dD(), $$1);
      $$6.b($$0);
      eyw $$7 = $$2.d($$0.dq());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.h($$7);
      $$6.q();
      $$0.dS().b($$6);
   }

   public static kh a(arj $$0, kh $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kh.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bup $$0, bun $$1, int $$2) {
      if ($$0.eW().h() instanceof cwo $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bun $$0, bun $$1, double $$2) {
      Optional<bun> $$3 = $$0.dY().c(cdq.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dq());
         double $$5 = $$0.f($$1.dq());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bun $$0, bun $$1) {
      bvo<?> $$2 = $$0.dY();
      return !$$2.a(cdq.h) ? false : $$2.c(cdq.h).get().a($$1);
   }

   public static bun a(bun $$0, Optional<bun> $$1, bun $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bun a(bun $$0, bun $$1, bun $$2) {
      eyw $$3 = $$1.dq();
      eyw $$4 = $$2.dq();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bun> a(bun $$0, cdq<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dY().c($$1);
      return $$2.<btr>map($$1x -> ((arj)$$0.dS()).a($$1x)).map($$0x -> $$0x instanceof bun $$1x ? $$1x : null);
   }

   @Nullable
   public static eyw a(buv $$0, int $$1, int $$2) {
      eyw $$3 = cfh.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dS().a_(jf.a((jy)$$3)).a(eri.b) && $$4++ < 10) {
         $$3 = cfh.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bun $$0) {
      return $$0.dY().a(cdq.r);
   }
}
