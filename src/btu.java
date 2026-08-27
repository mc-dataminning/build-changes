import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class btu {
   private btu() {
   }

   public static void a(bsa $$0, bsa $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(btb<?> $$0, bsa $$1) {
      Optional<cbf> $$2 = $$0.c(cbd.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(btb<?> $$0, cbd<? extends bsa> $$1, brn<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(btb<?> $$0, cbd<? extends bsa> $$1, Predicate<bsa> $$2) {
      return $$0.c($$1).filter($$2).filter(bsa::bB).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bsa $$0, bsa $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bsa $$0, bsa $$1) {
      $$0.dQ().a(cbd.n, new bud($$1, true));
   }

   private static void b(bsa $$0, bsa $$1, float $$2, int $$3) {
      a($$0, (brh)$$1, $$2, $$3);
      a($$1, (brh)$$0, $$2, $$3);
   }

   public static void a(bsa $$0, brh $$1, float $$2, int $$3) {
      a($$0, new bud($$1, true), $$2, $$3);
   }

   public static void a(bsa $$0, in $$1, float $$2, int $$3) {
      a($$0, new btv($$1), $$2, $$3);
   }

   public static void a(bsa $$0, bvg $$1, float $$2, int $$3) {
      cbg $$4 = new cbg($$1, $$2, $$3);
      $$0.dQ().a(cbd.n, $$1);
      $$0.dQ().a(cbd.m, $$4);
   }

   public static void a(bsa $$0, csz $$1, etp $$2) {
      etp $$3 = new etp(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bsa $$0, csz $$1, etp $$2, etp $$3, float $$4) {
      double $$5 = $$0.dw() - (double)$$4;
      chr $$6 = new chr($$0.dN(), $$0.ds(), $$5, $$0.dy(), $$1);
      $$6.b($$0);
      etp $$7 = $$2.d($$0.dl());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.v();
      $$0.dN().b($$6);
   }

   public static jp a(aqh $$0, jp $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jp.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bsc $$0, bsa $$1, int $$2) {
      if ($$0.eV().f() instanceof ctq $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bsa $$0, bsa $$1, double $$2) {
      Optional<bsa> $$3 = $$0.dQ().c(cbd.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dl());
         double $$5 = $$0.f($$1.dl());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bsa $$0, bsa $$1) {
      btb<?> $$2 = $$0.dQ();
      return !$$2.a(cbd.h) ? false : $$2.c(cbd.h).get().a($$1);
   }

   public static bsa a(bsa $$0, Optional<bsa> $$1, bsa $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bsa a(bsa $$0, bsa $$1, bsa $$2) {
      etp $$3 = $$1.dl();
      etp $$4 = $$2.dl();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bsa> a(bsa $$0, cbd<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dQ().c($$1);
      return $$2.<brh>map($$1x -> ((aqh)$$0.dN()).a($$1x)).map($$0x -> $$0x instanceof bsa $$1x ? $$1x : null);
   }

   @Nullable
   public static etp a(bsi $$0, int $$1, int $$2) {
      etp $$3 = ccu.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dN().a_(in.a($$3)).a(emp.b) && $$4++ < 10) {
         $$3 = ccu.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bsa $$0) {
      return $$0.dQ().a(cbd.r);
   }
}
