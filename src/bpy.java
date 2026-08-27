import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bpy {
   private bpy() {
   }

   public static void a(bog $$0, bog $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bpf<?> $$0, bog $$1) {
      Optional<bxj> $$2 = $$0.c(bxh.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bpf<?> $$0, bxh<? extends bog> $$1, bnu<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bpf<?> $$0, bxh<? extends bog> $$1, Predicate<bog> $$2) {
      return $$0.c($$1).filter($$2).filter(bog::bx).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(bog $$0, bog $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(bog $$0, bog $$1) {
      $$0.dO().a(bxh.n, new bqh($$1, true));
   }

   private static void b(bog $$0, bog $$1, float $$2, int $$3) {
      a($$0, (bno)$$1, $$2, $$3);
      a($$1, (bno)$$0, $$2, $$3);
   }

   public static void a(bog $$0, bno $$1, float $$2, int $$3) {
      a($$0, new bqh($$1, true), $$2, $$3);
   }

   public static void a(bog $$0, hz $$1, float $$2, int $$3) {
      a($$0, new bpz($$1), $$2, $$3);
   }

   public static void a(bog $$0, brk $$1, float $$2, int $$3) {
      bxk $$4 = new bxk($$1, $$2, $$3);
      $$0.dO().a(bxh.n, $$1);
      $$0.dO().a(bxh.m, $$4);
   }

   public static void a(bog $$0, coz $$1, ens $$2) {
      ens $$3 = new ens(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(bog $$0, coz $$1, ens $$2, ens $$3, float $$4) {
      double $$5 = $$0.dv() - (double)$$4;
      cds $$6 = new cds($$0.dM(), $$0.dr(), $$5, $$0.dx(), $$1);
      $$6.a($$0);
      ens $$7 = $$2.d($$0.dk());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.u();
      $$0.dM().b($$6);
   }

   public static jb a(aov $$0, jb $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jb.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(boi $$0, bog $$1, int $$2) {
      if ($$0.eT().d() instanceof cpp $$3 && $$0.a($$3)) {
         int $$4 = $$3.d() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(bog $$0, bog $$1, double $$2) {
      Optional<bog> $$3 = $$0.dO().c(bxh.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dk());
         double $$5 = $$0.f($$1.dk());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(bog $$0, bog $$1) {
      bpf<?> $$2 = $$0.dO();
      return !$$2.a(bxh.h) ? false : $$2.c(bxh.h).get().a($$1);
   }

   public static bog a(bog $$0, Optional<bog> $$1, bog $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static bog a(bog $$0, bog $$1, bog $$2) {
      ens $$3 = $$1.dk();
      ens $$4 = $$2.dk();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<bog> a(bog $$0, bxh<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dO().c($$1);
      return $$2.<bno>map($$1x -> ((aov)$$0.dM()).a($$1x)).map($$0x -> $$0x instanceof bog $$1x ? $$1x : null);
   }

   @Nullable
   public static ens a(boo $$0, int $$1, int $$2) {
      ens $$3 = byy.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dM().a_(hz.a($$3)).a($$0.dM(), hz.a($$3), ehf.b) && $$4++ < 10) {
         $$3 = byy.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(bog $$0) {
      return $$0.dO().a(bxh.r);
   }
}
