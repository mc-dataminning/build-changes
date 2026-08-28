import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byk {
   private byk() {
   }

   public static void a(bwr $$0, bwr $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bxr<?> $$0, bwr $$1) {
      Optional<cfv> $$2 = $$0.c(cft.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bxr<?> $$0, cft<? extends bwr> $$1, bwb<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.aq() == $$2);
   }

   private static boolean a(bxr<?> $$0, cft<? extends bwr> $$1, Predicate<bwr> $$2) {
      return $$0.c($$1).filter($$2).filter(bwr::bK).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bwr $$0, bwr $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bwr $$0, bwr $$1) {
      $$0.eb().a(cft.o, new byt($$1, true));
   }

   private static void b(bwr $$0, bwr $$1, float $$2, int $$3) {
      a($$0, (bvs)$$1, $$2, $$3);
      a($$1, (bvs)$$0, $$2, $$3);
   }

   public static void a(bwr $$0, bvs $$1, float $$2, int $$3) {
      a($$0, new byt($$1, true), $$2, $$3);
   }

   public static void a(bwr $$0, jj $$1, float $$2, int $$3) {
      a($$0, new byl($$1), $$2, $$3);
   }

   public static void a(bwr $$0, bzw $$1, float $$2, int $$3) {
      cfw $$4 = new cfw($$1, $$2, $$3);
      $$0.eb().a(cft.o, $$1);
      $$0.eb().a(cft.n, $$4);
   }

   public static void a(bwr $$0, cxy $$1, fcu $$2) {
      fcu $$3 = new fcu(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bwr $$0, cxy $$1, fcu $$2, fcu $$3, float $$4) {
      double $$5 = $$0.dE() - (double)$$4;
      cmn $$6 = new cmn($$0.dV(), $$0.dA(), $$5, $$0.dG(), $$1);
      $$6.b($$0);
      fcu $$7 = $$2.d($$0.dt());
      $$7 = $$7.d().d($$3.d, $$3.e, $$3.f);
      $$6.i($$7);
      $$6.j();
      $$0.dV().b($$6);
   }

   public static kl a(arn $$0, kl $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return kl.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bwt $$0, bwr $$1, int $$2) {
      if ($$0.fa().h() instanceof cyt $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bwr $$0, bwr $$1, double $$2) {
      Optional<bwr> $$3 = $$0.eb().c(cft.p);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.g($$3.get().dt());
         double $$5 = $$0.g($$1.dt());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bwr $$0, bwr $$1) {
      bxr<?> $$2 = $$0.eb();
      return !$$2.a(cft.h) ? false : $$2.c(cft.h).get().a($$1);
   }

   public static bwr a(bwr $$0, Optional<bwr> $$1, bwr $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bwr a(bwr $$0, bwr $$1, bwr $$2) {
      fcu $$3 = $$1.dt();
      fcu $$4 = $$2.dt();
      return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
   }

   public static Optional<bwr> a(bwr $$0, cft<UUID> $$1) {
      Optional<UUID> $$2 = $$0.eb().c($$1);
      return $$2.<bvs>map($$1x -> ((arn)$$0.dV()).b($$1x)).map($$0x -> $$0x instanceof bwr $$1x ? $$1x : null);
   }

   @Nullable
   public static fcu a(bwz $$0, int $$1, int $$2) {
      fcu $$3 = chk.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dV().a_(jj.a((kc)$$3)).a(evi.b) && $$4++ < 10) {
         $$3 = chk.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bwr $$0) {
      return $$0.eb().a(cft.s);
   }
}
