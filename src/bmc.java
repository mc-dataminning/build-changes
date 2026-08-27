import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bmc {
   private bmc() {
   }

   public static void a(bkj $$0, bkj $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(blj<?> $$0, bkj $$1) {
      Optional<btm> $$2 = $$0.c(btk.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(blj<?> $$0, btk<? extends bkj> $$1, bjx<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ag() == $$2);
   }

   private static boolean a(blj<?> $$0, btk<? extends bkj> $$1, Predicate<bkj> $$2) {
      return $$0.c($$1).filter($$2).filter(bkj::bv).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bkj $$0, bkj $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bkj $$0, bkj $$1) {
      $$0.dN().a(btk.n, new bml($$1, true));
   }

   private static void b(bkj $$0, bkj $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bkj $$0, bjt $$1, float $$2, int $$3) {
      a($$0, new bml($$1, true), $$2, $$3);
   }

   public static void a(bkj $$0, ht $$1, float $$2, int $$3) {
      a($$0, new bmd($$1), $$2, $$3);
   }

   public static void a(bkj $$0, bnn $$1, float $$2, int $$3) {
      btn $$4 = new btn($$1, $$2, $$3);
      $$0.dN().a(btk.n, $$1);
      $$0.dN().a(btk.m, $$4);
   }

   public static void a(bkj $$0, ckj $$1, eif $$2) {
      eif $$3 = new eif(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bkj $$0, ckj $$1, eif $$2, eif $$3, float $$4) {
      double $$5 = $$0.du() - (double)$$4;
      bzq $$6 = new bzq($$0.dL(), $$0.dq(), $$5, $$0.dw(), $$1);
      $$6.a($$0);
      eif $$7 = $$2.d($$0.dj());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.f($$7);
      $$6.t();
      $$0.dL().b($$6);
   }

   public static iu a(alq $$0, iu $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return iu.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bkl $$0, bkj $$1, int $$2) {
      if ($$0.eS().d() instanceof ckz $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bkj $$0, bkj $$1, double $$2) {
      Optional<bkj> $$3 = $$0.dN().c(btk.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.e($$3.get().dj());
         double $$5 = $$0.e($$1.dj());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bkj $$0, bkj $$1) {
      blj<?> $$2 = $$0.dN();
      return !$$2.a(btk.h) ? false : $$2.c(btk.h).get().a($$1);
   }

   public static bkj a(bkj $$0, Optional<bkj> $$1, bkj $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bkj a(bkj $$0, bkj $$1, bkj $$2) {
      eif $$3 = $$1.dj();
      eif $$4 = $$2.dj();
      return $$0.e($$3) < $$0.e($$4) ? $$1 : $$2;
   }

   public static Optional<bkj> a(bkj $$0, btk<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dN().c($$1);
      return $$2.<bjt>map($$1x -> ((alq)$$0.dL()).a($$1x)).map($$0x -> $$0x instanceof bkj $$1x ? $$1x : null);
   }

   @Nullable
   public static eif a(bks $$0, int $$1, int $$2) {
      eif $$3 = buz.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dL().a_(ht.a($$3)).a($$0.dL(), ht.a($$3), ebu.b) && $$4++ < 10) {
         $$3 = buz.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bkj $$0) {
      return $$0.dN().a(btk.r);
   }
}
