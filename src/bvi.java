import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvi {
   private bvi() {
   }

   public static void a(btn $$0, btn $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bup<?> $$0, btn $$1) {
      Optional<cct> $$2 = $$0.c(ccr.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bup<?> $$0, ccr<? extends btn> $$1, bsy<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ak() == $$2);
   }

   private static boolean a(bup<?> $$0, ccr<? extends btn> $$1, Predicate<btn> $$2) {
      return $$0.c($$1).filter($$2).filter(btn::bD).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(btn $$0, btn $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(btn $$0, btn $$1) {
      $$0.dS().a(ccr.n, new bvr($$1, true));
   }

   private static void b(btn $$0, btn $$1, float $$2, int $$3) {
      a($$0, (bss)$$1, $$2, $$3);
      a($$1, (bss)$$0, $$2, $$3);
   }

   public static void a(btn $$0, bss $$1, float $$2, int $$3) {
      a($$0, new bvr($$1, true), $$2, $$3);
   }

   public static void a(btn $$0, iz $$1, float $$2, int $$3) {
      a($$0, new bvj($$1), $$2, $$3);
   }

   public static void a(btn $$0, bwu $$1, float $$2, int $$3) {
      ccu $$4 = new ccu($$1, $$2, $$3);
      $$0.dS().a(ccr.n, $$1);
      $$0.dS().a(ccr.m, $$4);
   }

   public static void a(btn $$0, cun $$1, evp $$2) {
      evp $$3 = new evp(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(btn $$0, cun $$1, evp $$2, evp $$3, float $$4) {
      double $$5 = $$0.dy() - (double)$$4;
      cjf $$6 = new cjf($$0.dP(), $$0.du(), $$5, $$0.dA(), $$1);
      $$6.b($$0);
      evp $$7 = $$2.d($$0.dn());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.h($$7);
      $$6.v();
      $$0.dP().b($$6);
   }

   public static kb a(are $$0, kb $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kb.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(btp $$0, btn $$1, int $$2) {
      if ($$0.eX().g() instanceof cvg $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(btn $$0, btn $$1, double $$2) {
      Optional<btn> $$3 = $$0.dS().c(ccr.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dn());
         double $$5 = $$0.f($$1.dn());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(btn $$0, btn $$1) {
      bup<?> $$2 = $$0.dS();
      return !$$2.a(ccr.h) ? false : $$2.c(ccr.h).get().a($$1);
   }

   public static btn a(btn $$0, Optional<btn> $$1, btn $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static btn a(btn $$0, btn $$1, btn $$2) {
      evp $$3 = $$1.dn();
      evp $$4 = $$2.dn();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<btn> a(btn $$0, ccr<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dS().c($$1);
      return $$2.<bss>map($$1x -> ((are)$$0.dP()).a($$1x)).map($$0x -> $$0x instanceof btn $$1x ? $$1x : null);
   }

   @Nullable
   public static evp a(btw $$0, int $$1, int $$2) {
      evp $$3 = cei.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dP().a_(iz.a($$3)).a(eoi.b) && $$4++ < 10) {
         $$3 = cei.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(btn $$0) {
      return $$0.dS().a(ccr.r);
   }
}
