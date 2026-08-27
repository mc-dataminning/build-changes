import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class blf {
   private blf() {
   }

   public static void a(bjm $$0, bjm $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bkm<?> $$0, bjm $$1) {
      Optional<bsp> $$2 = $$0.c(bsn.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bkm<?> $$0, bsn<? extends bjm> $$1, bja<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ag() == $$2);
   }

   private static boolean a(bkm<?> $$0, bsn<? extends bjm> $$1, Predicate<bjm> $$2) {
      return $$0.c($$1).filter($$2).filter(bjm::bv).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bjm $$0, bjm $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bjm $$0, bjm $$1) {
      $$0.dN().a(bsn.n, new blo($$1, true));
   }

   private static void b(bjm $$0, bjm $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bjm $$0, biw $$1, float $$2, int $$3) {
      a($$0, new blo($$1, true), $$2, $$3);
   }

   public static void a(bjm $$0, gw $$1, float $$2, int $$3) {
      a($$0, new blg($$1), $$2, $$3);
   }

   public static void a(bjm $$0, bmq $$1, float $$2, int $$3) {
      bsq $$4 = new bsq($$1, $$2, $$3);
      $$0.dN().a(bsn.n, $$1);
      $$0.dN().a(bsn.m, $$4);
   }

   public static void a(bjm $$0, cjl $$1, ehh $$2) {
      ehh $$3 = new ehh(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bjm $$0, cjl $$1, ehh $$2, ehh $$3, float $$4) {
      double $$5 = $$0.du() - (double)$$4;
      byt $$6 = new byt($$0.dL(), $$0.dq(), $$5, $$0.dw(), $$1);
      $$6.c($$0.cv());
      ehh $$7 = $$2.d($$0.dj());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.f($$7);
      $$6.t();
      $$0.dL().b($$6);
   }

   public static hw a(akt $$0, hw $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return hw.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bjo $$0, bjm $$1, int $$2) {
      if ($$0.eS().d() instanceof ckb $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bjm $$0, bjm $$1, double $$2) {
      Optional<bjm> $$3 = $$0.dN().c(bsn.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.e($$3.get().dj());
         double $$5 = $$0.e($$1.dj());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bjm $$0, bjm $$1) {
      bkm<?> $$2 = $$0.dN();
      return !$$2.a(bsn.h) ? false : $$2.c(bsn.h).get().a($$1);
   }

   public static bjm a(bjm $$0, Optional<bjm> $$1, bjm $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bjm a(bjm $$0, bjm $$1, bjm $$2) {
      ehh $$3 = $$1.dj();
      ehh $$4 = $$2.dj();
      return $$0.e($$3) < $$0.e($$4) ? $$1 : $$2;
   }

   public static Optional<bjm> a(bjm $$0, bsn<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dN().c($$1);
      return $$2.<biw>map($$1x -> ((akt)$$0.dL()).a($$1x)).map($$0x -> $$0x instanceof bjm $$1x ? $$1x : null);
   }

   @Nullable
   public static ehh a(bjv $$0, int $$1, int $$2) {
      ehh $$3 = buc.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dL().a_(gw.a($$3)).a($$0.dL(), gw.a($$3), eaw.b) && $$4++ < 10) {
         $$3 = buc.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bjm $$0) {
      return $$0.dN().a(bsn.r);
   }
}
