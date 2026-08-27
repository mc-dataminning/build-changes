import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsy {
   private bsy() {
   }

   public static void a(bre $$0, bre $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bsf<?> $$0, bre $$1) {
      Optional<caj> $$2 = $$0.c(cah.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bsf<?> $$0, cah<? extends bre> $$1, bqr<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bsf<?> $$0, cah<? extends bre> $$1, Predicate<bre> $$2) {
      return $$0.c($$1).filter($$2).filter(bre::bB).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bre $$0, bre $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bre $$0, bre $$1) {
      $$0.dQ().a(cah.n, new bth($$1, true));
   }

   private static void b(bre $$0, bre $$1, float $$2, int $$3) {
      a($$0, (bql)$$1, $$2, $$3);
      a($$1, (bql)$$0, $$2, $$3);
   }

   public static void a(bre $$0, bql $$1, float $$2, int $$3) {
      a($$0, new bth($$1, true), $$2, $$3);
   }

   public static void a(bre $$0, im $$1, float $$2, int $$3) {
      a($$0, new bsz($$1), $$2, $$3);
   }

   public static void a(bre $$0, buk $$1, float $$2, int $$3) {
      cak $$4 = new cak($$1, $$2, $$3);
      $$0.dQ().a(cah.n, $$1);
      $$0.dQ().a(cah.m, $$4);
   }

   public static void a(bre $$0, csd $$1, etf $$2) {
      etf $$3 = new etf(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bre $$0, csd $$1, etf $$2, etf $$3, float $$4) {
      double $$5 = $$0.dw() - (double)$$4;
      cgv $$6 = new cgv($$0.dN(), $$0.ds(), $$5, $$0.dy(), $$1);
      $$6.b($$0);
      etf $$7 = $$2.d($$0.dl());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.v();
      $$0.dN().b($$6);
   }

   public static jo a(aqe $$0, jo $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jo.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(brg $$0, bre $$1, int $$2) {
      if ($$0.eV().f() instanceof csu $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bre $$0, bre $$1, double $$2) {
      Optional<bre> $$3 = $$0.dQ().c(cah.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dl());
         double $$5 = $$0.f($$1.dl());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bre $$0, bre $$1) {
      bsf<?> $$2 = $$0.dQ();
      return !$$2.a(cah.h) ? false : $$2.c(cah.h).get().a($$1);
   }

   public static bre a(bre $$0, Optional<bre> $$1, bre $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bre a(bre $$0, bre $$1, bre $$2) {
      etf $$3 = $$1.dl();
      etf $$4 = $$2.dl();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bre> a(bre $$0, cah<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dQ().c($$1);
      return $$2.<bql>map($$1x -> ((aqe)$$0.dN()).a($$1x)).map($$0x -> $$0x instanceof bre $$1x ? $$1x : null);
   }

   @Nullable
   public static etf a(brm $$0, int $$1, int $$2) {
      etf $$3 = cby.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dN().a_(im.a($$3)).a(emg.b) && $$4++ < 10) {
         $$3 = cby.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bre $$0) {
      return $$0.dQ().a(cah.r);
   }
}
