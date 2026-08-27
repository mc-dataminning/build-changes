import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bkz {
   private bkz() {
   }

   public static void a(bjg $$0, bjg $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bkg<?> $$0, bjg $$1) {
      Optional<bsj> $$2 = $$0.c(bsh.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bkg<?> $$0, bsh<? extends bjg> $$1, biu<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ag() == $$2);
   }

   private static boolean a(bkg<?> $$0, bsh<? extends bjg> $$1, Predicate<bjg> $$2) {
      return $$0.c($$1).filter($$2).filter(bjg::bv).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bjg $$0, bjg $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bjg $$0, bjg $$1) {
      $$0.dN().a(bsh.n, new bli($$1, true));
   }

   private static void b(bjg $$0, bjg $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bjg $$0, biq $$1, float $$2, int $$3) {
      a($$0, new bli($$1, true), $$2, $$3);
   }

   public static void a(bjg $$0, gw $$1, float $$2, int $$3) {
      a($$0, new bla($$1), $$2, $$3);
   }

   public static void a(bjg $$0, bmk $$1, float $$2, int $$3) {
      bsk $$4 = new bsk($$1, $$2, $$3);
      $$0.dN().a(bsh.n, $$1);
      $$0.dN().a(bsh.m, $$4);
   }

   public static void a(bjg $$0, cjf $$1, ehn $$2) {
      ehn $$3 = new ehn(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bjg $$0, cjf $$1, ehn $$2, ehn $$3, float $$4) {
      double $$5 = $$0.du() - (double)$$4;
      byn $$6 = new byn($$0.dL(), $$0.dq(), $$5, $$0.dw(), $$1);
      $$6.c($$0.cv());
      ehn $$7 = $$2.d($$0.dj());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.f($$7);
      $$6.t();
      $$0.dL().b($$6);
   }

   public static hz a(akr $$0, hz $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return hz.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bji $$0, bjg $$1, int $$2) {
      if ($$0.eS().d() instanceof cjv $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bjg $$0, bjg $$1, double $$2) {
      Optional<bjg> $$3 = $$0.dN().c(bsh.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.e($$3.get().dj());
         double $$5 = $$0.e($$1.dj());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bjg $$0, bjg $$1) {
      bkg<?> $$2 = $$0.dN();
      return !$$2.a(bsh.h) ? false : $$2.c(bsh.h).get().a($$1);
   }

   public static bjg a(bjg $$0, Optional<bjg> $$1, bjg $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bjg a(bjg $$0, bjg $$1, bjg $$2) {
      ehn $$3 = $$1.dj();
      ehn $$4 = $$2.dj();
      return $$0.e($$3) < $$0.e($$4) ? $$1 : $$2;
   }

   public static Optional<bjg> a(bjg $$0, bsh<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dN().c($$1);
      return $$2.<biq>map($$1x -> ((akr)$$0.dL()).a($$1x)).map($$0x -> $$0x instanceof bjg $$1x ? $$1x : null);
   }

   @Nullable
   public static ehn a(bjp $$0, int $$1, int $$2) {
      ehn $$3 = btw.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dL().a_(gw.a($$3)).a($$0.dL(), gw.a($$3), ebc.b) && $$4++ < 10) {
         $$3 = btw.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bjg $$0) {
      return $$0.dN().a(bsh.r);
   }
}
