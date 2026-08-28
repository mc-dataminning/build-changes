import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byv {
   private byv() {
   }

   public static void a(bxc $$0, bxc $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(byc<?> $$0, bxc $$1) {
      Optional<cgg> $$2 = $$0.c(cge.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(byc<?> $$0, cge<? extends bxc> $$1, bwm<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(byc<?> $$0, cge<? extends bxc> $$1, Predicate<bxc> $$2) {
      return $$0.c($$1).filter($$2).filter(bxc::bK).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bxc $$0, bxc $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bxc $$0, bxc $$1) {
      $$0.eb().a(cge.o, new bze($$1, true));
   }

   private static void b(bxc $$0, bxc $$1, float $$2, int $$3) {
      a($$0, (bwd)$$1, $$2, $$3);
      a($$1, (bwd)$$0, $$2, $$3);
   }

   public static void a(bxc $$0, bwd $$1, float $$2, int $$3) {
      a($$0, new bze($$1, true), $$2, $$3);
   }

   public static void a(bxc $$0, iu $$1, float $$2, int $$3) {
      a($$0, new byw($$1), $$2, $$3);
   }

   public static void a(bxc $$0, cah $$1, float $$2, int $$3) {
      cgh $$4 = new cgh($$1, $$2, $$3);
      $$0.eb().a(cge.o, $$1);
      $$0.eb().a(cge.n, $$4);
   }

   public static void a(bxc $$0, cyy $$1, fei $$2) {
      fei $$3 = new fei(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bxc $$0, cyy $$1, fei $$2, fei $$3, float $$4) {
      double $$5 = $$0.dE() - (double)$$4;
      cnd $$6 = new cnd($$0.dV(), $$0.dA(), $$5, $$0.dG(), $$1);
      $$6.b($$0);
      fei $$7 = $$2.d($$0.dt());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.j();
      $$0.dV().b($$6);
   }

   public static jx a(arq $$0, jx $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jx.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bxe $$0, bxc $$1, int $$2) {
      if ($$0.fa().h() instanceof czt $$3 && $$0.a($$3)) {
         int $$4 = $$3.b() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.h($$1);
   }

   public static boolean a(bxc $$0, bxc $$1, double $$2) {
      Optional<bxc> $$3 = $$0.eb().c(cge.p);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dt());
         double $$5 = $$0.g($$1.dt());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bxc $$0, bxc $$1) {
      byc<?> $$2 = $$0.eb();
      return !$$2.a(cge.h) ? false : $$2.c(cge.h).get().a($$1);
   }

   public static bxc a(bxc $$0, Optional<bxc> $$1, bxc $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bxc a(bxc $$0, bxc $$1, bxc $$2) {
      fei $$3 = $$1.dt();
      fei $$4 = $$2.dt();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<bxc> a(bxc $$0, cge<UUID> $$1) {
      Optional<UUID> $$2 = $$0.eb().c($$1);
      return $$2.<bwd>map($$1x -> ((arq)$$0.dV()).b($$1x)).map($$0x -> $$0x instanceof bxc $$1x ? $$1x : null);
   }

   @Nullable
   public static fei a(bxk $$0, int $$1, int $$2) {
      fei $$3 = chv.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dV().a_(iu.a((jo)$$3)).a(ewv.b) && $$4++ < 10) {
         $$3 = chv.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bxc $$0) {
      return $$0.eb().a(cge.s);
   }
}
