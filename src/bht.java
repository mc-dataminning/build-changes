import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bht {
   private bht() {
   }

   public static void a(bfz $$0, bfz $$1, float $$2) {
      c($$0, $$1);
      b($$0, $$1, $$2);
   }

   public static boolean a(bha<?> $$0, bfz $$1) {
      Optional<bpd> $$2 = $$0.c(bpb.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bha<?> $$0, bpb<? extends bfz> $$1, bfn<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ae() == $$2);
   }

   private static boolean a(bha<?> $$0, bpb<? extends bfz> $$1, Predicate<bfz> $$2) {
      return $$0.c($$1).filter($$2).filter(bfz::bs).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bfz $$0, bfz $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bfz $$0, bfz $$1) {
      $$0.dK().a(bpb.n, new bic($$1, true));
   }

   private static void b(bfz $$0, bfz $$1, float $$2) {
      int $$3 = 2;
      a($$0, $$1, $$2, 2);
      a($$1, $$0, $$2, 2);
   }

   public static void a(bfz $$0, bfj $$1, float $$2, int $$3) {
      a($$0, new bic($$1, true), $$2, $$3);
   }

   public static void a(bfz $$0, gu $$1, float $$2, int $$3) {
      a($$0, new bhu($$1), $$2, $$3);
   }

   public static void a(bfz $$0, bje $$1, float $$2, int $$3) {
      bpe $$4 = new bpe($$1, $$2, $$3);
      $$0.dK().a(bpb.n, $$1);
      $$0.dK().a(bpb.m, $$4);
   }

   public static void a(bfz $$0, cfz $$1, eei $$2) {
      eei $$3 = new eei(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bfz $$0, cfz $$1, eei $$2, eei $$3, float $$4) {
      double $$5 = $$0.dr() - (double)$$4;
      bvh $$6 = new bvh($$0.dI(), $$0.dn(), $$5, $$0.dt(), $$1);
      $$6.c($$0.ct());
      eei $$7 = $$2.d($$0.dg());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.f($$7);
      $$6.o();
      $$0.dI().b($$6);
   }

   public static hx a(aif $$0, hx $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return hx.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bgb $$0, bfz $$1, int $$2) {
      if ($$0.eO().d() instanceof cgp $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.k($$1);
   }

   public static boolean a(bfz $$0, bfz $$1, double $$2) {
      Optional<bfz> $$3 = $$0.dK().c(bpb.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.e($$3.get().dg());
         double $$5 = $$0.e($$1.dg());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bfz $$0, bfz $$1) {
      bha<?> $$2 = $$0.dK();
      return !$$2.a(bpb.h) ? false : $$2.c(bpb.h).get().a($$1);
   }

   public static bfz a(bfz $$0, Optional<bfz> $$1, bfz $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bfz a(bfz $$0, bfz $$1, bfz $$2) {
      eei $$3 = $$1.dg();
      eei $$4 = $$2.dg();
      return $$0.e($$3) < $$0.e($$4) ? $$1 : $$2;
   }

   public static Optional<bfz> a(bfz $$0, bpb<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dK().c($$1);
      return $$2.<bfj>map($$1x -> ((aif)$$0.dI()).a($$1x)).map($$0x -> $$0x instanceof bfz $$1x ? $$1x : null);
   }

   @Nullable
   public static eei a(bgi $$0, int $$1, int $$2) {
      eei $$3 = bqq.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dI().a_(gu.a($$3)).a($$0.dI(), gu.a($$3), dxu.b) && $$4++ < 10) {
         $$3 = bqq.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bfz $$0) {
      return $$0.dK().a(bpb.r);
   }
}
