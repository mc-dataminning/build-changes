import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvl {
   private bvl() {
   }

   public static void a(btq $$0, btq $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bus<?> $$0, btq $$1) {
      Optional<ccw> $$2 = $$0.c(ccu.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bus<?> $$0, ccu<? extends btq> $$1, btb<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ak() == $$2);
   }

   private static boolean a(bus<?> $$0, ccu<? extends btq> $$1, Predicate<btq> $$2) {
      return $$0.c($$1).filter($$2).filter(btq::bD).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(btq $$0, btq $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(btq $$0, btq $$1) {
      $$0.dS().a(ccu.n, new bvu($$1, true));
   }

   private static void b(btq $$0, btq $$1, float $$2, int $$3) {
      a($$0, (bsv)$$1, $$2, $$3);
      a($$1, (bsv)$$0, $$2, $$3);
   }

   public static void a(btq $$0, bsv $$1, float $$2, int $$3) {
      a($$0, new bvu($$1, true), $$2, $$3);
   }

   public static void a(btq $$0, iz $$1, float $$2, int $$3) {
      a($$0, new bvm($$1), $$2, $$3);
   }

   public static void a(btq $$0, bwx $$1, float $$2, int $$3) {
      ccx $$4 = new ccx($$1, $$2, $$3);
      $$0.dS().a(ccu.n, $$1);
      $$0.dS().a(ccu.m, $$4);
   }

   public static void a(btq $$0, cuq $$1, evs $$2) {
      evs $$3 = new evs(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(btq $$0, cuq $$1, evs $$2, evs $$3, float $$4) {
      double $$5 = $$0.dy() - (double)$$4;
      cji $$6 = new cji($$0.dP(), $$0.du(), $$5, $$0.dA(), $$1);
      $$6.b($$0);
      evs $$7 = $$2.d($$0.dn());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.h($$7);
      $$6.v();
      $$0.dP().b($$6);
   }

   public static kb a(arf $$0, kb $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kb.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bts $$0, btq $$1, int $$2) {
      if ($$0.eX().g() instanceof cvj $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(btq $$0, btq $$1, double $$2) {
      Optional<btq> $$3 = $$0.dS().c(ccu.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dn());
         double $$5 = $$0.f($$1.dn());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(btq $$0, btq $$1) {
      bus<?> $$2 = $$0.dS();
      return !$$2.a(ccu.h) ? false : $$2.c(ccu.h).get().a($$1);
   }

   public static btq a(btq $$0, Optional<btq> $$1, btq $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static btq a(btq $$0, btq $$1, btq $$2) {
      evs $$3 = $$1.dn();
      evs $$4 = $$2.dn();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<btq> a(btq $$0, ccu<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dS().c($$1);
      return $$2.<bsv>map($$1x -> ((arf)$$0.dP()).a($$1x)).map($$0x -> $$0x instanceof btq $$1x ? $$1x : null);
   }

   @Nullable
   public static evs a(btz $$0, int $$1, int $$2) {
      evs $$3 = cel.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dP().a_(iz.a($$3)).a(eol.b) && $$4++ < 10) {
         $$3 = cel.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(btq $$0) {
      return $$0.dS().a(ccu.r);
   }
}
