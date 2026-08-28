import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwe {
   private bwe() {
   }

   public static void a(buk $$0, buk $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bvl<?> $$0, buk $$1) {
      Optional<cdp> $$2 = $$0.c(cdn.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bvl<?> $$0, cdn<? extends buk> $$1, btv<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ao() == $$2);
   }

   private static boolean a(bvl<?> $$0, cdn<? extends buk> $$1, Predicate<buk> $$2) {
      return $$0.c($$1).filter($$2).filter(buk::bI).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(buk $$0, buk $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(buk $$0, buk $$1) {
      $$0.dX().a(cdn.n, new bwn($$1, true));
   }

   private static void b(buk $$0, buk $$1, float $$2, int $$3) {
      a($$0, (bto)$$1, $$2, $$3);
      a($$1, (bto)$$0, $$2, $$3);
   }

   public static void a(buk $$0, bto $$1, float $$2, int $$3) {
      a($$0, new bwn($$1, true), $$2, $$3);
   }

   public static void a(buk $$0, je $$1, float $$2, int $$3) {
      a($$0, new bwf($$1), $$2, $$3);
   }

   public static void a(buk $$0, bxq $$1, float $$2, int $$3) {
      cdq $$4 = new cdq($$1, $$2, $$3);
      $$0.dX().a(cdn.n, $$1);
      $$0.dX().a(cdn.m, $$4);
   }

   public static void a(buk $$0, cvp $$1, eys $$2) {
      eys $$3 = new eys(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(buk $$0, cvp $$1, eys $$2, eys $$3, float $$4) {
      double $$5 = $$0.dB() - (double)$$4;
      cke $$6 = new cke($$0.dS(), $$0.dx(), $$5, $$0.dD(), $$1);
      $$6.b($$0);
      eys $$7 = $$2.d($$0.dq());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.h($$7);
      $$6.q();
      $$0.dS().b($$6);
   }

   public static kg a(arh $$0, kg $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kg.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bum $$0, buk $$1, int $$2) {
      if ($$0.eW().h() instanceof cwl $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(buk $$0, buk $$1, double $$2) {
      Optional<buk> $$3 = $$0.dX().c(cdn.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dq());
         double $$5 = $$0.f($$1.dq());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(buk $$0, buk $$1) {
      bvl<?> $$2 = $$0.dX();
      return !$$2.a(cdn.h) ? false : $$2.c(cdn.h).get().a($$1);
   }

   public static buk a(buk $$0, Optional<buk> $$1, buk $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static buk a(buk $$0, buk $$1, buk $$2) {
      eys $$3 = $$1.dq();
      eys $$4 = $$2.dq();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<buk> a(buk $$0, cdn<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dX().c($$1);
      return $$2.<bto>map($$1x -> ((arh)$$0.dS()).a($$1x)).map($$0x -> $$0x instanceof buk $$1x ? $$1x : null);
   }

   @Nullable
   public static eys a(bus $$0, int $$1, int $$2) {
      eys $$3 = cfe.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dS().a_(je.a((jx)$$3)).a(ere.b) && $$4++ < 10) {
         $$3 = cfe.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(buk $$0) {
      return $$0.dX().a(cdn.r);
   }
}
