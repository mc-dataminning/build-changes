import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bqc {
   private bqc() {
   }

   public static void a(boi $$0, boi $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bpj<?> $$0, boi $$1) {
      Optional<bxn> $$2 = $$0.c(bxl.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bpj<?> $$0, bxl<? extends boi> $$1, bnw<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bpj<?> $$0, bxl<? extends boi> $$1, Predicate<boi> $$2) {
      return $$0.c($$1).filter($$2).filter(boi::bx).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(boi $$0, boi $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(boi $$0, boi $$1) {
      $$0.dO().a(bxl.n, new bql($$1, true));
   }

   private static void b(boi $$0, boi $$1, float $$2, int $$3) {
      a($$0, (bnq)$$1, $$2, $$3);
      a($$1, (bnq)$$0, $$2, $$3);
   }

   public static void a(boi $$0, bnq $$1, float $$2, int $$3) {
      a($$0, new bql($$1, true), $$2, $$3);
   }

   public static void a(boi $$0, hz $$1, float $$2, int $$3) {
      a($$0, new bqd($$1), $$2, $$3);
   }

   public static void a(boi $$0, bro $$1, float $$2, int $$3) {
      bxo $$4 = new bxo($$1, $$2, $$3);
      $$0.dO().a(bxl.n, $$1);
      $$0.dO().a(bxl.m, $$4);
   }

   public static void a(boi $$0, cpd $$1, enz $$2) {
      enz $$3 = new enz(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(boi $$0, cpd $$1, enz $$2, enz $$3, float $$4) {
      double $$5 = $$0.dv() - (double)$$4;
      cdw $$6 = new cdw($$0.dM(), $$0.dr(), $$5, $$0.dx(), $$1);
      $$6.a($$0);
      enz $$7 = $$2.d($$0.dk());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.u();
      $$0.dM().b($$6);
   }

   public static jb a(aow $$0, jb $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jb.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(bok $$0, boi $$1, int $$2) {
      if ($$0.eT().d() instanceof cpt $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(boi $$0, boi $$1, double $$2) {
      Optional<boi> $$3 = $$0.dO().c(bxl.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dk());
         double $$5 = $$0.f($$1.dk());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(boi $$0, boi $$1) {
      bpj<?> $$2 = $$0.dO();
      return !$$2.a(bxl.h) ? false : $$2.c(bxl.h).get().a($$1);
   }

   public static boi a(boi $$0, Optional<boi> $$1, boi $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static boi a(boi $$0, boi $$1, boi $$2) {
      enz $$3 = $$1.dk();
      enz $$4 = $$2.dk();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<boi> a(boi $$0, bxl<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dO().c($$1);
      return $$2.<bnq>map($$1x -> ((aow)$$0.dM()).a($$1x)).map($$0x -> $$0x instanceof boi $$1x ? $$1x : null);
   }

   @Nullable
   public static enz a(boq $$0, int $$1, int $$2) {
      enz $$3 = bzc.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dM().a_(hz.a($$3)).a($$0.dM(), hz.a($$3), ehm.b) && $$4++ < 10) {
         $$3 = bzc.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(boi $$0) {
      return $$0.dO().a(bxl.r);
   }
}
