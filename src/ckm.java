import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class ckm {
   private static final float a = 1.0F;
   private static final float b = 2.25F;
   private static final float c = 1.75F;
   private static final float d = 2.5F;
   private static final int e = 4;
   private static final int f = 16;
   private static final int g = 6;
   private static final int h = 30;
   private static final int i = 60;
   private static final int j = 600;
   private static final int k = 32;
   private static final int l = 20;

   protected static byj<?> a(byj<ckl> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ctd.a));
      $$0.b(ctd.b);
      $$0.f();
      return $$0;
   }

   private static void b(byj<ckl> $$0) {
      $$0.a(ctd.a, 0, ImmutableList.of(new cbu(0.8F), new byv(2.5F), new cag(45, 90), new cak(), new bzg(cgl.aP), new bzg(cgl.aQ)));
   }

   private static void c(byj<ckl> $$0) {
      $$0.a(
         ctd.b,
         ImmutableList.of(
            Pair.of(0, bzu.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bzq(ckm::b, 2.25F, 20)),
            Pair.of(2, cbo.a(ckm::b, Predicate.not(ckm::c), 4, 16, 2.25F)),
            Pair.of(3, cba.a(6.0F, btr.a(30, 60))),
            Pair.of(4, new cax(ImmutableList.of(Pair.of(cas.b(1.0F), 2), Pair.of(cbh.a(1.0F, 3), 2), Pair.of(new bzk(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(ckl $$0) {
      $$0.eb().a(ImmutableList.of(ctd.b));
   }

   public static void a(bxj $$0, iv $$1) {
      byj<?> $$2 = $$0.eb();
      je $$3 = je.a($$0.dU().aj(), $$1);
      Optional<je> $$4 = $$2.c(cgl.aO);
      if ($$4.isEmpty()) {
         $$2.a(cgl.aO, $$3);
         $$2.a(cgl.aP, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cgl.aP, 600);
      }
   }

   private static Optional<cao> b(bxj $$0) {
      byj<?> $$1 = $$0.eb();
      Optional<je> $$2 = $$1.c(cgl.aO);
      if ($$2.isPresent()) {
         je $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bzd($$3.b().d()));
         }

         $$1.b(cgl.aO);
      }

      return d($$0);
   }

   private static boolean c(bxj $$0) {
      byj<?> $$1 = $$0.eb();
      return $$1.a(cgl.M);
   }

   private static boolean a(bxj $$0, byj<?> $$1, je $$2) {
      Optional<Integer> $$3 = $$1.c(cgl.aP);
      djh $$4 = $$0.dU();
      return $$2.a($$4.aj(), $$0.du(), 1024) && $$4.a_($$2.b()).a(dmo.bf) && $$3.isPresent();
   }

   private static Optional<cao> d(bxj $$0) {
      return a($$0).map($$0x -> new bzl($$0x, true));
   }

   public static Optional<arr> a(bxj $$0) {
      djh $$1 = $$0.dU();
      if (!$$1.w_() && $$1 instanceof arq $$2) {
         Optional<UUID> $$3 = $$0.eb().c(cgl.aN);
         if ($$3.isPresent()) {
            if ($$2.b($$3.get()) instanceof arr $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
