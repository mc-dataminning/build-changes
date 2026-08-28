import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvh {
   private bvh() {
   }

   public static void a(btl $$0, btl $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(buo<?> $$0, btl $$1) {
      Optional<ccs> $$2 = $$0.c(ccq.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(buo<?> $$0, ccq<? extends btl> $$1, bsw<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.am() == $$2);
   }

   private static boolean a(buo<?> $$0, ccq<? extends btl> $$1, Predicate<btl> $$2) {
      return $$0.c($$1).filter($$2).filter(btl::bE).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(btl $$0, btl $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(btl $$0, btl $$1) {
      $$0.dU().a(ccq.n, new bvq($$1, true));
   }

   private static void b(btl $$0, btl $$1, float $$2, int $$3) {
      a($$0, (bsq)$$1, $$2, $$3);
      a($$1, (bsq)$$0, $$2, $$3);
   }

   public static void a(btl $$0, bsq $$1, float $$2, int $$3) {
      a($$0, new bvq($$1, true), $$2, $$3);
   }

   public static void a(btl $$0, jd $$1, float $$2, int $$3) {
      a($$0, new bvi($$1), $$2, $$3);
   }

   public static void a(btl $$0, bwt $$1, float $$2, int $$3) {
      cct $$4 = new cct($$1, $$2, $$3);
      $$0.dU().a(ccq.n, $$1);
      $$0.dU().a(ccq.m, $$4);
   }

   public static void a(btl $$0, cuo $$1, eww $$2) {
      eww $$3 = new eww(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(btl $$0, cuo $$1, eww $$2, eww $$3, float $$4) {
      double $$5 = $$0.dz() - (double)$$4;
      cjf $$6 = new cjf($$0.dQ(), $$0.dv(), $$5, $$0.dB(), $$1);
      $$6.b($$0);
      eww $$7 = $$2.d($$0.do());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.i($$7);
      $$6.v();
      $$0.dQ().b($$6);
   }

   public static kf a(aqt $$0, kf $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kf.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(btn $$0, btl $$1, int $$2) {
      if ($$0.eU().g() instanceof cvl $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(btl $$0, btl $$1, double $$2) {
      Optional<btl> $$3 = $$0.dU().c(ccq.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().do());
         double $$5 = $$0.g($$1.do());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(btl $$0, btl $$1) {
      buo<?> $$2 = $$0.dU();
      return !$$2.a(ccq.h) ? false : $$2.c(ccq.h).get().a($$1);
   }

   public static btl a(btl $$0, Optional<btl> $$1, btl $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static btl a(btl $$0, btl $$1, btl $$2) {
      eww $$3 = $$1.do();
      eww $$4 = $$2.do();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<btl> a(btl $$0, ccq<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dU().c($$1);
      return $$2.<bsq>map($$1x -> ((aqt)$$0.dQ()).a($$1x)).map($$0x -> $$0x instanceof btl $$1x ? $$1x : null);
   }

   @Nullable
   public static eww a(btu $$0, int $$1, int $$2) {
      eww $$3 = ceh.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dQ().a_(jd.a((jw)$$3)).a(epn.b) && $$4++ < 10) {
         $$3 = ceh.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(btl $$0) {
      return $$0.dU().a(ccq.r);
   }
}
