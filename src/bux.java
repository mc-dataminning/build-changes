import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bux {
   private bux() {
   }

   public static void a(btc $$0, btc $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bue<?> $$0, btc $$1) {
      Optional<cci> $$2 = $$0.c(ccg.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bue<?> $$0, ccg<? extends btc> $$1, bsn<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.am() == $$2);
   }

   private static boolean a(bue<?> $$0, ccg<? extends btc> $$1, Predicate<btc> $$2) {
      return $$0.c($$1).filter($$2).filter(btc::bF).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(btc $$0, btc $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(btc $$0, btc $$1) {
      $$0.dV().a(ccg.n, new bvg($$1, true));
   }

   private static void b(btc $$0, btc $$1, float $$2, int $$3) {
      a($$0, (bsh)$$1, $$2, $$3);
      a($$1, (bsh)$$0, $$2, $$3);
   }

   public static void a(btc $$0, bsh $$1, float $$2, int $$3) {
      a($$0, new bvg($$1, true), $$2, $$3);
   }

   public static void a(btc $$0, ja $$1, float $$2, int $$3) {
      a($$0, new buy($$1), $$2, $$3);
   }

   public static void a(btc $$0, bwj $$1, float $$2, int $$3) {
      ccj $$4 = new ccj($$1, $$2, $$3);
      $$0.dV().a(ccg.n, $$1);
      $$0.dV().a(ccg.m, $$4);
   }

   public static void a(btc $$0, cud $$1, ewh $$2) {
      ewh $$3 = new ewh(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(btc $$0, cud $$1, ewh $$2, ewh $$3, float $$4) {
      double $$5 = $$0.dA() - (double)$$4;
      civ $$6 = new civ($$0.dR(), $$0.dw(), $$5, $$0.dC(), $$1);
      $$6.b($$0);
      ewh $$7 = $$2.d($$0.dp());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.j($$7);
      $$6.v();
      $$0.dR().b($$6);
   }

   public static kc a(aqm $$0, kc $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kc.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bte $$0, btc $$1, int $$2) {
      if ($$0.eV().g() instanceof cuw $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(btc $$0, btc $$1, double $$2) {
      Optional<btc> $$3 = $$0.dV().c(ccg.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dp());
         double $$5 = $$0.g($$1.dp());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(btc $$0, btc $$1) {
      bue<?> $$2 = $$0.dV();
      return !$$2.a(ccg.h) ? false : $$2.c(ccg.h).get().a($$1);
   }

   public static btc a(btc $$0, Optional<btc> $$1, btc $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static btc a(btc $$0, btc $$1, btc $$2) {
      ewh $$3 = $$1.dp();
      ewh $$4 = $$2.dp();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<btc> a(btc $$0, ccg<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dV().c($$1);
      return $$2.<bsh>map($$1x -> ((aqm)$$0.dR()).a($$1x)).map($$0x -> $$0x instanceof btc $$1x ? $$1x : null);
   }

   @Nullable
   public static ewh a(btl $$0, int $$1, int $$2) {
      ewh $$3 = cdx.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dR().a_(ja.a($$3)).a(eoy.b) && $$4++ < 10) {
         $$3 = cdx.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(btc $$0) {
      return $$0.dV().a(ccg.r);
   }
}
