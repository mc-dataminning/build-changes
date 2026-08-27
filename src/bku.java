import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bku {
   private bku() {
   }

   public static void a(bjb $$0, bjb $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bkb<?> $$0, bjb $$1) {
      Optional<bse> $$2 = $$0.c(bsc.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bkb<?> $$0, bsc<? extends bjb> $$1, bip<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ag() == $$2);
   }

   private static boolean a(bkb<?> $$0, bsc<? extends bjb> $$1, Predicate<bjb> $$2) {
      return $$0.c($$1).filter($$2).filter(bjb::bv).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bjb $$0, bjb $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bjb $$0, bjb $$1) {
      $$0.dM().a(bsc.n, new bld($$1, true));
   }

   private static void b(bjb $$0, bjb $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bjb $$0, bil $$1, float $$2, int $$3) {
      a($$0, new bld($$1, true), $$2, $$3);
   }

   public static void a(bjb $$0, gw $$1, float $$2, int $$3) {
      a($$0, new bkv($$1), $$2, $$3);
   }

   public static void a(bjb $$0, bmf $$1, float $$2, int $$3) {
      bsf $$4 = new bsf($$1, $$2, $$3);
      $$0.dM().a(bsc.n, $$1);
      $$0.dM().a(bsc.m, $$4);
   }

   public static void a(bjb $$0, cja $$1, ehi $$2) {
      ehi $$3 = new ehi(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bjb $$0, cja $$1, ehi $$2, ehi $$3, float $$4) {
      double $$5 = $$0.dt() - (double)$$4;
      byi $$6 = new byi($$0.dK(), $$0.dp(), $$5, $$0.dv(), $$1);
      $$6.c($$0.cv());
      ehi $$7 = $$2.d($$0.di());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.f($$7);
      $$6.o();
      $$0.dK().b($$6);
   }

   public static hz a(akn $$0, hz $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return hz.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bjd $$0, bjb $$1, int $$2) {
      if ($$0.eR().d() instanceof cjq $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bjb $$0, bjb $$1, double $$2) {
      Optional<bjb> $$3 = $$0.dM().c(bsc.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.e($$3.get().di());
         double $$5 = $$0.e($$1.di());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bjb $$0, bjb $$1) {
      bkb<?> $$2 = $$0.dM();
      return !$$2.a(bsc.h) ? false : $$2.c(bsc.h).get().a($$1);
   }

   public static bjb a(bjb $$0, Optional<bjb> $$1, bjb $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bjb a(bjb $$0, bjb $$1, bjb $$2) {
      ehi $$3 = $$1.di();
      ehi $$4 = $$2.di();
      return $$0.e($$3) < $$0.e($$4) ? $$1 : $$2;
   }

   public static Optional<bjb> a(bjb $$0, bsc<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dM().c($$1);
      return $$2.<bil>map($$1x -> ((akn)$$0.dK()).a($$1x)).map($$0x -> $$0x instanceof bjb $$1x ? $$1x : null);
   }

   @Nullable
   public static ehi a(bjk $$0, int $$1, int $$2) {
      ehi $$3 = btr.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dK().a_(gw.a($$3)).a($$0.dK(), gw.a($$3), eax.b) && $$4++ < 10) {
         $$3 = btr.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bjb $$0) {
      return $$0.dM().a(bsc.r);
   }
}
