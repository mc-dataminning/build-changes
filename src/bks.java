import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bks {
   private bks() {
   }

   public static void a(biy $$0, biy $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bjz<?> $$0, biy $$1) {
      Optional<bsc> $$2 = $$0.c(bsa.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bjz<?> $$0, bsa<? extends biy> $$1, bim<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ag() == $$2);
   }

   private static boolean a(bjz<?> $$0, bsa<? extends biy> $$1, Predicate<biy> $$2) {
      return $$0.c($$1).filter($$2).filter(biy::bv).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(biy $$0, biy $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(biy $$0, biy $$1) {
      $$0.dM().a(bsa.n, new blb($$1, true));
   }

   private static void b(biy $$0, biy $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(biy $$0, bii $$1, float $$2, int $$3) {
      a($$0, new blb($$1, true), $$2, $$3);
   }

   public static void a(biy $$0, gu $$1, float $$2, int $$3) {
      a($$0, new bkt($$1), $$2, $$3);
   }

   public static void a(biy $$0, bmd $$1, float $$2, int $$3) {
      bsd $$4 = new bsd($$1, $$2, $$3);
      $$0.dM().a(bsa.n, $$1);
      $$0.dM().a(bsa.m, $$4);
   }

   public static void a(biy $$0, ciy $$1, ehe $$2) {
      ehe $$3 = new ehe(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(biy $$0, ciy $$1, ehe $$2, ehe $$3, float $$4) {
      double $$5 = $$0.dt() - (double)$$4;
      byg $$6 = new byg($$0.dK(), $$0.dp(), $$5, $$0.dv(), $$1);
      $$6.c($$0.cv());
      ehe $$7 = $$2.d($$0.di());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.f($$7);
      $$6.o();
      $$0.dK().b($$6);
   }

   public static hx a(akk $$0, hx $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return hx.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bja $$0, biy $$1, int $$2) {
      if ($$0.eR().d() instanceof cjo $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.k($$1);
   }

   public static boolean a(biy $$0, biy $$1, double $$2) {
      Optional<biy> $$3 = $$0.dM().c(bsa.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.e($$3.get().di());
         double $$5 = $$0.e($$1.di());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(biy $$0, biy $$1) {
      bjz<?> $$2 = $$0.dM();
      return !$$2.a(bsa.h) ? false : $$2.c(bsa.h).get().a($$1);
   }

   public static biy a(biy $$0, Optional<biy> $$1, biy $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static biy a(biy $$0, biy $$1, biy $$2) {
      ehe $$3 = $$1.di();
      ehe $$4 = $$2.di();
      return $$0.e($$3) < $$0.e($$4) ? $$1 : $$2;
   }

   public static Optional<biy> a(biy $$0, bsa<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dM().c($$1);
      return $$2.<bii>map($$1x -> ((akk)$$0.dK()).a($$1x)).map($$0x -> $$0x instanceof biy $$1x ? $$1x : null);
   }

   @Nullable
   public static ehe a(bjh $$0, int $$1, int $$2) {
      ehe $$3 = btp.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dK().a_(gu.a($$3)).a($$0.dK(), gu.a($$3), eat.b) && $$4++ < 10) {
         $$3 = btp.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(biy $$0) {
      return $$0.dM().a(bsa.r);
   }
}
