import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bqr {
   private bqr() {
   }

   public static void a(box $$0, box $$1, float $$2, int $$3) {
      c($$0, $$1);
      b($$0, $$1, $$2, $$3);
   }

   public static boolean a(bpy<?> $$0, box $$1) {
      Optional<byc> $$2 = $$0.c(bya.h);
      return $$2.isPresent() && $$2.get().a($$1);
   }

   public static boolean a(bpy<?> $$0, bya<? extends box> $$1, bol<?> $$2) {
      return a($$0, $$1, $$1x -> $$1x.ai() == $$2);
   }

   private static boolean a(bpy<?> $$0, bya<? extends box> $$1, Predicate<box> $$2) {
      return $$0.c($$1).filter($$2).filter(box::bx).filter($$1x -> a($$0, $$1x)).isPresent();
   }

   private static void c(box $$0, box $$1) {
      a($$0, $$1);
      a($$1, $$0);
   }

   public static void a(box $$0, box $$1) {
      $$0.dM().a(bya.n, new bra($$1, true));
   }

   private static void b(box $$0, box $$1, float $$2, int $$3) {
      a($$0, (bof)$$1, $$2, $$3);
      a($$1, (bof)$$0, $$2, $$3);
   }

   public static void a(box $$0, bof $$1, float $$2, int $$3) {
      a($$0, new bra($$1, true), $$2, $$3);
   }

   public static void a(box $$0, ib $$1, float $$2, int $$3) {
      a($$0, new bqs($$1), $$2, $$3);
   }

   public static void a(box $$0, bsd $$1, float $$2, int $$3) {
      byd $$4 = new byd($$1, $$2, $$3);
      $$0.dM().a(bya.n, $$1);
      $$0.dM().a(bya.m, $$4);
   }

   public static void a(box $$0, cpq $$1, eov $$2) {
      eov $$3 = new eov(0.3F, 0.3F, 0.3F);
      a($$0, $$1, $$2, $$3, 0.3F);
   }

   public static void a(box $$0, cpq $$1, eov $$2, eov $$3, float $$4) {
      double $$5 = $$0.ds() - (double)$$4;
      cel $$6 = new cel($$0.dJ(), $$0.do(), $$5, $$0.du(), $$1);
      $$6.a($$0);
      eov $$7 = $$2.d($$0.dh());
      $$7 = $$7.d().d($$3.c, $$3.d, $$3.e);
      $$6.g($$7);
      $$6.u();
      $$0.dJ().b($$6);
   }

   public static jd a(apa $$0, jd $$1, int $$2) {
      int $$3 = $$0.b($$1);
      return jd.a($$1, $$2).filter($$2x -> $$0.b($$2x) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
   }

   public static boolean a(boz $$0, box $$1, int $$2) {
      if ($$0.eR().d() instanceof cqg $$3 && $$0.a($$3)) {
         int $$4 = $$3.c() - $$2;
         return $$0.a($$1, (double)$$4);
      }

      return $$0.i($$1);
   }

   public static boolean a(box $$0, box $$1, double $$2) {
      Optional<box> $$3 = $$0.dM().c(bya.o);
      if ($$3.isEmpty()) {
         return false;
      } else {
         double $$4 = $$0.f($$3.get().dh());
         double $$5 = $$0.f($$1.dh());
         return $$5 > $$4 + $$2 * $$2;
      }
   }

   public static boolean b(box $$0, box $$1) {
      bpy<?> $$2 = $$0.dM();
      return !$$2.a(bya.h) ? false : $$2.c(bya.h).get().a($$1);
   }

   public static box a(box $$0, Optional<box> $$1, box $$2) {
      return $$1.isEmpty() ? $$2 : a($$0, $$1.get(), $$2);
   }

   public static box a(box $$0, box $$1, box $$2) {
      eov $$3 = $$1.dh();
      eov $$4 = $$2.dh();
      return $$0.f($$3) < $$0.f($$4) ? $$1 : $$2;
   }

   public static Optional<box> a(box $$0, bya<UUID> $$1) {
      Optional<UUID> $$2 = $$0.dM().c($$1);
      return $$2.<bof>map($$1x -> ((apa)$$0.dJ()).a($$1x)).map($$0x -> $$0x instanceof box $$1x ? $$1x : null);
   }

   @Nullable
   public static eov a(bpf $$0, int $$1, int $$2) {
      eov $$3 = bzr.a($$0, $$1, $$2);
      int $$4 = 0;

      while ($$3 != null && !$$0.dJ().a_(ib.a($$3)).a($$0.dJ(), ib.a($$3), eih.b) && $$4++ < 10) {
         $$3 = bzr.a($$0, $$1, $$2);
      }

      return $$3;
   }

   public static boolean a(box $$0) {
      return $$0.dM().a(bya.r);
   }
}
