import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bmz {
   private bmz() {
   }

   public static void a(blg $$0, blg $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bmg<?> $$0, blg $$1) {
      Optional<buj> $$2 = $$0.c(buh.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bmg<?> $$0, buh<? extends blg> $$1, bku<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bmg<?> $$0, buh<? extends blg> $$1, Predicate<blg> $$2) {
      return $$0.c($$1).filter($$2).filter(blg::bx).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(blg $$0, blg $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(blg $$0, blg $$1) {
      $$0.dP().a(buh.n, new bni($$1, true));
   }

   private static void b(blg $$0, blg $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(blg $$0, bkq $$1, float $$2, int $$3) {
      a($$0, new bni($$1, true), $$2, $$3);
   }

   public static void a(blg $$0, ht $$1, float $$2, int $$3) {
      a($$0, new bna($$1), $$2, $$3);
   }

   public static void a(blg $$0, bok $$1, float $$2, int $$3) {
      buk $$4 = new buk($$1, $$2, $$3);
      $$0.dP().a(buh.n, $$1);
      $$0.dP().a(buh.m, $$4);
   }

   public static void a(blg $$0, clj $$1, eju $$2) {
      eju $$3 = new eju(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(blg $$0, clj $$1, eju $$2, eju $$3, float $$4) {
      double $$5 = $$0.dw() - (double)$$4;
      can $$6 = new can($$0.dN(), $$0.ds(), $$5, $$0.dy(), $$1);
      $$6.a($$0);
      eju $$7 = $$2.d($$0.dl());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.u();
      $$0.dN().b($$6);
   }

   public static iu a(ame $$0, iu $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return iu.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bli $$0, blg $$1, int $$2) {
      if ($$0.eU().d() instanceof clz $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(blg $$0, blg $$1, double $$2) {
      Optional<blg> $$3 = $$0.dP().c(buh.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dl());
         double $$5 = $$0.f($$1.dl());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(blg $$0, blg $$1) {
      bmg<?> $$2 = $$0.dP();
      return !$$2.a(buh.h) ? false : $$2.c(buh.h).get().a($$1);
   }

   public static blg a(blg $$0, Optional<blg> $$1, blg $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static blg a(blg $$0, blg $$1, blg $$2) {
      eju $$3 = $$1.dl();
      eju $$4 = $$2.dl();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<blg> a(blg $$0, buh<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dP().c($$1);
      return $$2.<bkq>map($$1x -> ((ame)$$0.dN()).a($$1x)).map($$0x -> $$0x instanceof blg $$1x ? $$1x : null);
   }

   @Nullable
   public static eju a(blp $$0, int $$1, int $$2) {
      eju $$3 = bvw.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dN().a_(ht.a($$3)).a($$0.dN(), ht.a($$3), edi.b) && $$4++ < 10) {
         $$3 = bvw.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(blg $$0) {
      return $$0.dP().a(buh.r);
   }
}
