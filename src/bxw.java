import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxw {
   private bxw() {
   }

   public static void a(bwb $$0, bwb $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bxd<?> $$0, bwb $$1) {
      Optional<cfh> $$2 = $$0.c(cff.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bxd<?> $$0, cff<? extends bwb> $$1, bvm<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bxd<?> $$0, cff<? extends bwb> $$1, Predicate<bwb> $$2) {
      return $$0.c($$1).filter($$2).filter(bwb::bL).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bwb $$0, bwb $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bwb $$0, bwb $$1) {
      $$0.eb().a(cff.n, new byf($$1, true));
   }

   private static void b(bwb $$0, bwb $$1, float $$2, int $$3) {
      a($$0, (bvf)$$1, $$2, $$3);
      a($$1, (bvf)$$0, $$2, $$3);
   }

   public static void a(bwb $$0, bvf $$1, float $$2, int $$3) {
      a($$0, new byf($$1, true), $$2, $$3);
   }

   public static void a(bwb $$0, jh $$1, float $$2, int $$3) {
      a($$0, new bxx($$1), $$2, $$3);
   }

   public static void a(bwb $$0, bzi $$1, float $$2, int $$3) {
      cfi $$4 = new cfi($$1, $$2, $$3);
      $$0.eb().a(cff.n, $$1);
      $$0.eb().a(cff.m, $$4);
   }

   public static void a(bwb $$0, cxk $$1, fbs $$2) {
      fbs $$3 = new fbs(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bwb $$0, cxk $$1, fbs $$2, fbs $$3, float $$4) {
      double $$5 = $$0.dE() - (double)$$4;
      clw $$6 = new clw($$0.dV(), $$0.dA(), $$5, $$0.dG(), $$1);
      $$6.b($$0);
      fbs $$7 = $$2.d($$0.dt());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.h($$7);
      $$6.s();
      $$0.dV().b($$6);
   }

   public static kj a(ash $$0, kj $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kj.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bwd $$0, bwb $$1, int $$2) {
      if ($$0.eX().h() instanceof cyg $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bwb $$0, bwb $$1, double $$2) {
      Optional<bwb> $$3 = $$0.eb().c(cff.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dt());
         double $$5 = $$0.f($$1.dt());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bwb $$0, bwb $$1) {
      bxd<?> $$2 = $$0.eb();
      return !$$2.a(cff.h) ? false : $$2.c(cff.h).get().a($$1);
   }

   public static bwb a(bwb $$0, Optional<bwb> $$1, bwb $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bwb a(bwb $$0, bwb $$1, bwb $$2) {
      fbs $$3 = $$1.dt();
      fbs $$4 = $$2.dt();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bwb> a(bwb $$0, cff<UUID> $$1) {
      Optional<UUID> $$2 = $$0.eb().c($$1);
      return $$2.<bvf>map($$1x -> ((ash)$$0.dV()).a($$1x)).map($$0x -> $$0x instanceof bwb $$1x ? $$1x : null);
   }

   @Nullable
   public static fbs a(bwj $$0, int $$1, int $$2) {
      fbs $$3 = cgw.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dV().a_(jh.a((ka)$$3)).a(eue.b) && $$4++ < 10) {
         $$3 = cgw.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bwb $$0) {
      return $$0.eb().a(cff.r);
   }
}
