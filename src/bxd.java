import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxd {
   private bxd() {
   }

   public static void a(bvi $$0, bvi $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bwk<?> $$0, bvi $$1) {
      Optional<ceo> $$2 = $$0.c(cem.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bwk<?> $$0, cem<? extends bvi> $$1, but<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bwk<?> $$0, cem<? extends bvi> $$1, Predicate<bvi> $$2) {
      return $$0.c($$1).filter($$2).filter(bvi::bL).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bvi $$0, bvi $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bvi $$0, bvi $$1) {
      $$0.eb().a(cem.n, new bxm($$1, true));
   }

   private static void b(bvi $$0, bvi $$1, float $$2, int $$3) {
      a($$0, (bum)$$1, $$2, $$3);
      a($$1, (bum)$$0, $$2, $$3);
   }

   public static void a(bvi $$0, bum $$1, float $$2, int $$3) {
      a($$0, new bxm($$1, true), $$2, $$3);
   }

   public static void a(bvi $$0, ji $$1, float $$2, int $$3) {
      a($$0, new bxe($$1), $$2, $$3);
   }

   public static void a(bvi $$0, byp $$1, float $$2, int $$3) {
      cep $$4 = new cep($$1, $$2, $$3);
      $$0.eb().a(cem.n, $$1);
      $$0.eb().a(cem.m, $$4);
   }

   public static void a(bvi $$0, cwq $$1, fbb $$2) {
      fbb $$3 = new fbb(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bvi $$0, cwq $$1, fbb $$2, fbb $$3, float $$4) {
      double $$5 = $$0.dE() - (double)$$4;
      cld $$6 = new cld($$0.dV(), $$0.dA(), $$5, $$0.dG(), $$1);
      $$6.b($$0);
      fbb $$7 = $$2.d($$0.dt());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.s();
      $$0.dV().b($$6);
   }

   public static kk a(ard $$0, kk $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kk.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bvk $$0, bvi $$1, int $$2) {
      if ($$0.eZ().h() instanceof cxm $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bvi $$0, bvi $$1, double $$2) {
      Optional<bvi> $$3 = $$0.eb().c(cem.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dt());
         double $$5 = $$0.g($$1.dt());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bvi $$0, bvi $$1) {
      bwk<?> $$2 = $$0.eb();
      return !$$2.a(cem.h) ? false : $$2.c(cem.h).get().a($$1);
   }

   public static bvi a(bvi $$0, Optional<bvi> $$1, bvi $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bvi a(bvi $$0, bvi $$1, bvi $$2) {
      fbb $$3 = $$1.dt();
      fbb $$4 = $$2.dt();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<bvi> a(bvi $$0, cem<UUID> $$1) {
      Optional<UUID> $$2 = $$0.eb().c($$1);
      return $$2.<bum>map($$1x -> ((ard)$$0.dV()).a($$1x)).map($$0x -> $$0x instanceof bvi $$1x ? $$1x : null);
   }

   @Nullable
   public static fbb a(bvq $$0, int $$1, int $$2) {
      fbb $$3 = cgd.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dV().a_(ji.a((kb)$$3)).a(etp.b) && $$4++ < 10) {
         $$3 = cgd.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bvi $$0) {
      return $$0.eb().a(cem.r);
   }
}
