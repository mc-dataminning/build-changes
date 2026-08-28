import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvj {
   private bvj() {
   }

   public static void a(bto $$0, bto $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(buq<?> $$0, bto $$1) {
      Optional<ccu> $$2 = $$0.c(ccs.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(buq<?> $$0, ccs<? extends bto> $$1, bsz<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ak() == $$2);
   }

   private static boolean a(buq<?> $$0, ccs<? extends bto> $$1, Predicate<bto> $$2) {
      return $$0.c($$1).filter($$2).filter(bto::bD).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bto $$0, bto $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bto $$0, bto $$1) {
      $$0.dS().a(ccs.n, new bvs($$1, true));
   }

   private static void b(bto $$0, bto $$1, float $$2, int $$3) {
      a($$0, (bst)$$1, $$2, $$3);
      a($$1, (bst)$$0, $$2, $$3);
   }

   public static void a(bto $$0, bst $$1, float $$2, int $$3) {
      a($$0, new bvs($$1, true), $$2, $$3);
   }

   public static void a(bto $$0, iz $$1, float $$2, int $$3) {
      a($$0, new bvk($$1), $$2, $$3);
   }

   public static void a(bto $$0, bwv $$1, float $$2, int $$3) {
      ccv $$4 = new ccv($$1, $$2, $$3);
      $$0.dS().a(ccs.n, $$1);
      $$0.dS().a(ccs.m, $$4);
   }

   public static void a(bto $$0, cuo $$1, evq $$2) {
      evq $$3 = new evq(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bto $$0, cuo $$1, evq $$2, evq $$3, float $$4) {
      double $$5 = $$0.dy() - (double)$$4;
      cjg $$6 = new cjg($$0.dP(), $$0.du(), $$5, $$0.dA(), $$1);
      $$6.b($$0);
      evq $$7 = $$2.d($$0.dn());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.h($$7);
      $$6.v();
      $$0.dP().b($$6);
   }

   public static kb a(are $$0, kb $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kb.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(btq $$0, bto $$1, int $$2) {
      if ($$0.eX().g() instanceof cvh $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bto $$0, bto $$1, double $$2) {
      Optional<bto> $$3 = $$0.dS().c(ccs.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dn());
         double $$5 = $$0.f($$1.dn());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bto $$0, bto $$1) {
      buq<?> $$2 = $$0.dS();
      return !$$2.a(ccs.h) ? false : $$2.c(ccs.h).get().a($$1);
   }

   public static bto a(bto $$0, Optional<bto> $$1, bto $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bto a(bto $$0, bto $$1, bto $$2) {
      evq $$3 = $$1.dn();
      evq $$4 = $$2.dn();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bto> a(bto $$0, ccs<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dS().c($$1);
      return $$2.<bst>map($$1x -> ((are)$$0.dP()).a($$1x)).map($$0x -> $$0x instanceof bto $$1x ? $$1x : null);
   }

   @Nullable
   public static evq a(btx $$0, int $$1, int $$2) {
      evq $$3 = cej.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dP().a_(iz.a($$3)).a(eoj.b) && $$4++ < 10) {
         $$3 = cej.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bto $$0) {
      return $$0.dS().a(ccs.r);
   }
}
