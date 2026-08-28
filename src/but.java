import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class but {
   private but() {
   }

   public static void a(bsy $$0, bsy $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bua<?> $$0, bsy $$1) {
      Optional<cce> $$2 = $$0.c(ccc.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bua<?> $$0, ccc<? extends bsy> $$1, bsj<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ak() == $$2);
   }

   private static boolean a(bua<?> $$0, ccc<? extends bsy> $$1, Predicate<bsy> $$2) {
      return $$0.c($$1).filter($$2).filter(bsy::bD).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bsy $$0, bsy $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bsy $$0, bsy $$1) {
      $$0.dT().a(ccc.n, new bvc($$1, true));
   }

   private static void b(bsy $$0, bsy $$1, float $$2, int $$3) {
      a($$0, (bsd)$$1, $$2, $$3);
      a($$1, (bsd)$$0, $$2, $$3);
   }

   public static void a(bsy $$0, bsd $$1, float $$2, int $$3) {
      a($$0, new bvc($$1, true), $$2, $$3);
   }

   public static void a(bsy $$0, ja $$1, float $$2, int $$3) {
      a($$0, new buu($$1), $$2, $$3);
   }

   public static void a(bsy $$0, bwf $$1, float $$2, int $$3) {
      ccf $$4 = new ccf($$1, $$2, $$3);
      $$0.dT().a(ccc.n, $$1);
      $$0.dT().a(ccc.m, $$4);
   }

   public static void a(bsy $$0, cua $$1, evz $$2) {
      evz $$3 = new evz(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bsy $$0, cua $$1, evz $$2, evz $$3, float $$4) {
      double $$5 = $$0.dy() - (double)$$4;
      cir $$6 = new cir($$0.dP(), $$0.du(), $$5, $$0.dA(), $$1);
      $$6.b($$0);
      evz $$7 = $$2.d($$0.dn());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.h($$7);
      $$6.v();
      $$0.dP().b($$6);
   }

   public static kc a(aqk $$0, kc $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kc.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bta $$0, bsy $$1, int $$2) {
      if ($$0.eT().g() instanceof cut $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bsy $$0, bsy $$1, double $$2) {
      Optional<bsy> $$3 = $$0.dT().c(ccc.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dn());
         double $$5 = $$0.f($$1.dn());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bsy $$0, bsy $$1) {
      bua<?> $$2 = $$0.dT();
      return !$$2.a(ccc.h) ? false : $$2.c(ccc.h).get().a($$1);
   }

   public static bsy a(bsy $$0, Optional<bsy> $$1, bsy $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bsy a(bsy $$0, bsy $$1, bsy $$2) {
      evz $$3 = $$1.dn();
      evz $$4 = $$2.dn();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bsy> a(bsy $$0, ccc<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dT().c($$1);
      return $$2.<bsd>map($$1x -> ((aqk)$$0.dP()).a($$1x)).map($$0x -> $$0x instanceof bsy $$1x ? $$1x : null);
   }

   @Nullable
   public static evz a(bth $$0, int $$1, int $$2) {
      evz $$3 = cdt.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dP().a_(ja.a($$3)).a(eoq.b) && $$4++ < 10) {
         $$3 = cdt.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bsy $$0) {
      return $$0.dT().a(ccc.r);
   }
}
