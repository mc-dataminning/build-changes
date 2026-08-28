import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwz {
   private bwz() {
   }

   public static void a(bve $$0, bve $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bwg<?> $$0, bve $$1) {
      Optional<cek> $$2 = $$0.c(cei.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bwg<?> $$0, cei<? extends bve> $$1, bup<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ar() == $$2);
   }

   private static boolean a(bwg<?> $$0, cei<? extends bve> $$1, Predicate<bve> $$2) {
      return $$0.c($$1).filter($$2).filter(bve::bN).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bve $$0, bve $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bve $$0, bve $$1) {
      $$0.ee().a(cei.n, new bxi($$1, true));
   }

   private static void b(bve $$0, bve $$1, float $$2, int $$3) {
      a($$0, (bui)$$1, $$2, $$3);
      a($$1, (bui)$$0, $$2, $$3);
   }

   public static void a(bve $$0, bui $$1, float $$2, int $$3) {
      a($$0, new bxi($$1, true), $$2, $$3);
   }

   public static void a(bve $$0, jh $$1, float $$2, int $$3) {
      a($$0, new bxa($$1), $$2, $$3);
   }

   public static void a(bve $$0, byl $$1, float $$2, int $$3) {
      cel $$4 = new cel($$1, $$2, $$3);
      $$0.ee().a(cei.n, $$1);
      $$0.ee().a(cei.m, $$4);
   }

   public static void a(bve $$0, cwf $$1, ezr $$2) {
      ezr $$3 = new ezr(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bve $$0, cwf $$1, ezr $$2, ezr $$3, float $$4) {
      double $$5 = $$0.dH() - (double)$$4;
      ckz $$6 = new ckz($$0.dY(), $$0.dD(), $$5, $$0.dJ(), $$1);
      $$6.b($$0);
      ezr $$7 = $$2.d($$0.dw());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.h($$7);
      $$6.q();
      $$0.dY().b($$6);
   }

   public static kj a(arq $$0, kj $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kj.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bvg $$0, bve $$1, int $$2) {
      if ($$0.fc().h() instanceof cxb $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bve $$0, bve $$1, double $$2) {
      Optional<bve> $$3 = $$0.ee().c(cei.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dw());
         double $$5 = $$0.f($$1.dw());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bve $$0, bve $$1) {
      bwg<?> $$2 = $$0.ee();
      return !$$2.a(cei.h) ? false : $$2.c(cei.h).get().a($$1);
   }

   public static bve a(bve $$0, Optional<bve> $$1, bve $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bve a(bve $$0, bve $$1, bve $$2) {
      ezr $$3 = $$1.dw();
      ezr $$4 = $$2.dw();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bve> a(bve $$0, cei<UUID> $$1) {
      Optional<UUID> $$2 = $$0.ee().c($$1);
      return $$2.<bui>map($$1x -> ((arq)$$0.dY()).a($$1x)).map($$0x -> $$0x instanceof bve $$1x ? $$1x : null);
   }

   @Nullable
   public static ezr a(bvm $$0, int $$1, int $$2) {
      ezr $$3 = cfz.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dY().a_(jh.a((ka)$$3)).a(esd.b) && $$4++ < 10) {
         $$3 = cfz.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bve $$0) {
      return $$0.ee().a(cei.r);
   }
}
