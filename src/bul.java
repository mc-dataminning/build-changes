import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bul {
   private bul() {
   }

   public static void a(bsq $$0, bsq $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bts<?> $$0, bsq $$1) {
      Optional<cbw> $$2 = $$0.c(cbu.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bts<?> $$0, cbu<? extends bsq> $$1, bsc<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ak() == $$2);
   }

   private static boolean a(bts<?> $$0, cbu<? extends bsq> $$1, Predicate<bsq> $$2) {
      return $$0.c($$1).filter($$2).filter(bsq::bD).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bsq $$0, bsq $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bsq $$0, bsq $$1) {
      $$0.dS().a(cbu.n, new buu($$1, true));
   }

   private static void b(bsq $$0, bsq $$1, float $$2, int $$3) {
      a($$0, (brw)$$1, $$2, $$3);
      a($$1, (brw)$$0, $$2, $$3);
   }

   public static void a(bsq $$0, brw $$1, float $$2, int $$3) {
      a($$0, new buu($$1, true), $$2, $$3);
   }

   public static void a(bsq $$0, io $$1, float $$2, int $$3) {
      a($$0, new bum($$1), $$2, $$3);
   }

   public static void a(bsq $$0, bvx $$1, float $$2, int $$3) {
      cbx $$4 = new cbx($$1, $$2, $$3);
      $$0.dS().a(cbu.n, $$1);
      $$0.dS().a(cbu.m, $$4);
   }

   public static void a(bsq $$0, ctq $$1, eum $$2) {
      eum $$3 = new eum(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bsq $$0, ctq $$1, eum $$2, eum $$3, float $$4) {
      double $$5 = $$0.dy() - (double)$$4;
      cii $$6 = new cii($$0.dP(), $$0.du(), $$5, $$0.dA(), $$1);
      $$6.b($$0);
      eum $$7 = $$2.d($$0.dn());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.v();
      $$0.dP().b($$6);
   }

   public static jq a(aqn $$0, jq $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jq.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bss $$0, bsq $$1, int $$2) {
      if ($$0.eX().g() instanceof cuj $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bsq $$0, bsq $$1, double $$2) {
      Optional<bsq> $$3 = $$0.dS().c(cbu.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dn());
         double $$5 = $$0.f($$1.dn());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bsq $$0, bsq $$1) {
      bts<?> $$2 = $$0.dS();
      return !$$2.a(cbu.h) ? false : $$2.c(cbu.h).get().a($$1);
   }

   public static bsq a(bsq $$0, Optional<bsq> $$1, bsq $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bsq a(bsq $$0, bsq $$1, bsq $$2) {
      eum $$3 = $$1.dn();
      eum $$4 = $$2.dn();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bsq> a(bsq $$0, cbu<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dS().c($$1);
      return $$2.<brw>map($$1x -> ((aqn)$$0.dP()).a($$1x)).map($$0x -> $$0x instanceof bsq $$1x ? $$1x : null);
   }

   @Nullable
   public static eum a(bsz $$0, int $$1, int $$2) {
      eum $$3 = cdl.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dP().a_(io.a($$3)).a(enl.b) && $$4++ < 10) {
         $$3 = cdl.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bsq $$0) {
      return $$0.dS().a(cbu.r);
   }
}
