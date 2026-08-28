import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bys {
   private bys() {
   }

   public static void a(bwz $$0, bwz $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bxz<?> $$0, bwz $$1) {
      Optional<cgd> $$2 = $$0.c(cgb.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bxz<?> $$0, cgb<? extends bwz> $$1, bwj<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bxz<?> $$0, cgb<? extends bwz> $$1, Predicate<bwz> $$2) {
      return $$0.c($$1).filter($$2).filter(bwz::bK).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bwz $$0, bwz $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bwz $$0, bwz $$1) {
      $$0.eb().a(cgb.o, new bzb($$1, true));
   }

   private static void b(bwz $$0, bwz $$1, float $$2, int $$3) {
      a($$0, (bwa)$$1, $$2, $$3);
      a($$1, (bwa)$$0, $$2, $$3);
   }

   public static void a(bwz $$0, bwa $$1, float $$2, int $$3) {
      a($$0, new bzb($$1, true), $$2, $$3);
   }

   public static void a(bwz $$0, iu $$1, float $$2, int $$3) {
      a($$0, new byt($$1), $$2, $$3);
   }

   public static void a(bwz $$0, cae $$1, float $$2, int $$3) {
      cge $$4 = new cge($$1, $$2, $$3);
      $$0.eb().a(cgb.o, $$1);
      $$0.eb().a(cgb.n, $$4);
   }

   public static void a(bwz $$0, cys $$1, fdw $$2) {
      fdw $$3 = new fdw(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bwz $$0, cys $$1, fdw $$2, fdw $$3, float $$4) {
      double $$5 = $$0.dE() - (double)$$4;
      cmx $$6 = new cmx($$0.dV(), $$0.dA(), $$5, $$0.dG(), $$1);
      $$6.b($$0);
      fdw $$7 = $$2.d($$0.dt());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.j();
      $$0.dV().b($$6);
   }

   public static jx a(aro $$0, jx $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jx.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bxb $$0, bwz $$1, int $$2) {
      if ($$0.fa().h() instanceof czn $$3 && $$0.a($$3)) {
         int $$4 = $$3.b() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.h($$1);
   }

   public static boolean a(bwz $$0, bwz $$1, double $$2) {
      Optional<bwz> $$3 = $$0.eb().c(cgb.p);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dt());
         double $$5 = $$0.g($$1.dt());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bwz $$0, bwz $$1) {
      bxz<?> $$2 = $$0.eb();
      return !$$2.a(cgb.h) ? false : $$2.c(cgb.h).get().a($$1);
   }

   public static bwz a(bwz $$0, Optional<bwz> $$1, bwz $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bwz a(bwz $$0, bwz $$1, bwz $$2) {
      fdw $$3 = $$1.dt();
      fdw $$4 = $$2.dt();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<bwz> a(bwz $$0, cgb<UUID> $$1) {
      Optional<UUID> $$2 = $$0.eb().c($$1);
      return $$2.<bwa>map($$1x -> ((aro)$$0.dV()).b($$1x)).map($$0x -> $$0x instanceof bwz $$1x ? $$1x : null);
   }

   @Nullable
   public static fdw a(bxh $$0, int $$1, int $$2) {
      fdw $$3 = chs.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dV().a_(iu.a((jo)$$3)).a(ewk.b) && $$4++ < 10) {
         $$3 = chs.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bwz $$0) {
      return $$0.eb().a(cgb.s);
   }
}
