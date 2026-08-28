import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buw {
   private buw() {
   }

   public static void a(btb $$0, btb $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bud<?> $$0, btb $$1) {
      Optional<cch> $$2 = $$0.c(ccf.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bud<?> $$0, ccf<? extends btb> $$1, bsm<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.al() == $$2);
   }

   private static boolean a(bud<?> $$0, ccf<? extends btb> $$1, Predicate<btb> $$2) {
      return $$0.c($$1).filter($$2).filter(btb::bE).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(btb $$0, btb $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(btb $$0, btb $$1) {
      $$0.dU().a(ccf.n, new bvf($$1, true));
   }

   private static void b(btb $$0, btb $$1, float $$2, int $$3) {
      a($$0, (bsg)$$1, $$2, $$3);
      a($$1, (bsg)$$0, $$2, $$3);
   }

   public static void a(btb $$0, bsg $$1, float $$2, int $$3) {
      a($$0, new bvf($$1, true), $$2, $$3);
   }

   public static void a(btb $$0, ja $$1, float $$2, int $$3) {
      a($$0, new bux($$1), $$2, $$3);
   }

   public static void a(btb $$0, bwi $$1, float $$2, int $$3) {
      cci $$4 = new cci($$1, $$2, $$3);
      $$0.dU().a(ccf.n, $$1);
      $$0.dU().a(ccf.m, $$4);
   }

   public static void a(btb $$0, cuc $$1, ewf $$2) {
      ewf $$3 = new ewf(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(btb $$0, cuc $$1, ewf $$2, ewf $$3, float $$4) {
      double $$5 = $$0.dz() - (double)$$4;
      ciu $$6 = new ciu($$0.dQ(), $$0.dv(), $$5, $$0.dB(), $$1);
      $$6.b($$0);
      ewf $$7 = $$2.d($$0.do());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.i($$7);
      $$6.v();
      $$0.dQ().b($$6);
   }

   public static kc a(aqm $$0, kc $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kc.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(btd $$0, btb $$1, int $$2) {
      if ($$0.eU().g() instanceof cuv $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(btb $$0, btb $$1, double $$2) {
      Optional<btb> $$3 = $$0.dU().c(ccf.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().do());
         double $$5 = $$0.f($$1.do());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(btb $$0, btb $$1) {
      bud<?> $$2 = $$0.dU();
      return !$$2.a(ccf.h) ? false : $$2.c(ccf.h).get().a($$1);
   }

   public static btb a(btb $$0, Optional<btb> $$1, btb $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static btb a(btb $$0, btb $$1, btb $$2) {
      ewf $$3 = $$1.do();
      ewf $$4 = $$2.do();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<btb> a(btb $$0, ccf<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dU().c($$1);
      return $$2.<bsg>map($$1x -> ((aqm)$$0.dQ()).a($$1x)).map($$0x -> $$0x instanceof btb $$1x ? $$1x : null);
   }

   @Nullable
   public static ewf a(btk $$0, int $$1, int $$2) {
      ewf $$3 = cdw.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dQ().a_(ja.a($$3)).a(eow.b) && $$4++ < 10) {
         $$3 = cdw.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(btb $$0) {
      return $$0.dU().a(ccf.r);
   }
}
