import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzc {
   private bzc() {
   }

   public static void a(bxj $$0, bxj $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(byj<?> $$0, bxj $$1) {
      Optional<cgn> $$2 = $$0.c(cgl.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(byj<?> $$0, cgl<? extends bxj> $$1, bwr<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.an() == $$2);
   }

   private static boolean a(byj<?> $$0, cgl<? extends bxj> $$1, Predicate<bxj> $$2) {
      return $$0.c($$1).filter($$2).filter(bxj::bI).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bxj $$0, bxj $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bxj $$0, bxj $$1) {
      $$0.eb().a(cgl.o, new bzl($$1, true));
   }

   private static void b(bxj $$0, bxj $$1, float $$2, int $$3) {
      a($$0, (bwi)$$1, $$2, $$3);
      a($$1, (bwi)$$0, $$2, $$3);
   }

   public static void a(bxj $$0, bwi $$1, float $$2, int $$3) {
      a($$0, new bzl($$1, true), $$2, $$3);
   }

   public static void a(bxj $$0, iv $$1, float $$2, int $$3) {
      a($$0, new bzd($$1), $$2, $$3);
   }

   public static void a(bxj $$0, cao $$1, float $$2, int $$3) {
      cgo $$4 = new cgo($$1, $$2, $$3);
      $$0.eb().a(cgl.o, $$1);
      $$0.eb().a(cgl.n, $$4);
   }

   public static void a(bxj $$0, czn $$1, ffc $$2) {
      ffc $$3 = new ffc(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bxj $$0, czn $$1, ffc $$2, ffc $$3, float $$4) {
      double $$5 = $$0.dD() - (double)$$4;
      cnr $$6 = new cnr($$0.dU(), $$0.dz(), $$5, $$0.dF(), $$1);
      $$6.b($$0);
      ffc $$7 = $$2.d($$0.ds());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.j();
      $$0.dU().b($$6);
   }

   public static jy a(arq $$0, jy $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jy.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bxl $$0, bxj $$1, int $$2) {
      if ($$0.fa().h() instanceof dai $$3 && $$0.a($$3)) {
         int $$4 = $$3.b() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.h($$1);
   }

   public static boolean a(bxj $$0, bxj $$1, double $$2) {
      Optional<bxj> $$3 = $$0.eb().c(cgl.p);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().ds());
         double $$5 = $$0.g($$1.ds());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bxj $$0, bxj $$1) {
      byj<?> $$2 = $$0.eb();
      return !$$2.a(cgl.h) ? false : $$2.c(cgl.h).get().a($$1);
   }

   public static bxj a(bxj $$0, Optional<bxj> $$1, bxj $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bxj a(bxj $$0, bxj $$1, bxj $$2) {
      ffc $$3 = $$1.ds();
      ffc $$4 = $$2.ds();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<bxj> a(bxj $$0, cgl<UUID> $$1) {
      Optional<UUID> $$2 = $$0.eb().c($$1);
      return $$2.<bwi>map($$1x -> ((arq)$$0.dU()).b($$1x)).map($$0x -> $$0x instanceof bxj $$1x ? $$1x : null);
   }

   @Nullable
   public static ffc a(bxr $$0, int $$1, int $$2) {
      ffc $$3 = cic.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dU().a_(iv.a((jp)$$3)).a(exp.b) && $$4++ < 10) {
         $$3 = cic.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bxj $$0) {
      return $$0.eb().a(cgl.s);
   }
}
