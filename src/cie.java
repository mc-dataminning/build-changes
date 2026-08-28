import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cie {
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

   protected static bwi<?> a(bwi<cid> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqn.a));
      $$0.b(cqn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwi<cid> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new bzt(0.8F), new bwu(2.5F), new byf(45, 90), new byj(), new bxf(cek.aO), new bxf(cek.aP)));
   }

   private static void c(bwi<cid> $$0) {
      $$0.a(
         cqn.b,
         ImmutableList.of(
            Pair.of(0, bxt.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bxp(cie::b, 2.25F, 20)),
            Pair.of(2, bzn.a(cie::b, Predicate.not(cie::c), 4, 16, 2.25F)),
            Pair.of(3, byz.a(6.0F, bru.a(30, 60))),
            Pair.of(4, new byw(ImmutableList.of(Pair.of(byr.b(1.0F), 2), Pair.of(bzg.a(1.0F, 3), 2), Pair.of(new bxj(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cid $$0) {
      $$0.eb().a(ImmutableList.of(cqn.b));
   }

   public static void a(bvg $$0, ji $$1) {
      bwi<?> $$2 = $$0.eb();
      jq $$3 = jq.a($$0.dV().ai(), $$1);
      Optional<jq> $$4 = $$2.c(cek.aN);
      if ($$4.isEmpty()) {
         $$2.a(cek.aN, $$3);
         $$2.a(cek.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cek.aO, 600);
      }
   }

   private static Optional<byn> b(bvg $$0) {
      bwi<?> $$1 = $$0.eb();
      Optional<jq> $$2 = $$1.c(cek.aN);
      if ($$2.isPresent()) {
         jq $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bxc($$3.b().d()));
         }

         $$1.b(cek.aN);
      }

      return d($$0);
   }

   private static boolean c(bvg $$0) {
      bwi<?> $$1 = $$0.eb();
      return $$1.a(cek.L);
   }

   private static boolean a(bvg $$0, bwi<?> $$1, jq $$2) {
      Optional<Integer> $$3 = $$1.c(cek.aO);
      dgh $$4 = $$0.dV();
      return $$2.a($$4.ai(), $$0.dv(), 1024) && $$4.a_($$2.b()).a(djn.bf) && $$3.isPresent();
   }

   private static Optional<byn> d(bvg $$0) {
      return a($$0).map($$0x -> new bxk($$0x, true));
   }

   public static Optional<are> a(bvg $$0) {
      dgh $$1 = $$0.dV();
      if (!$$1.B_() && $$1 instanceof ard $$2) {
         Optional<UUID> $$3 = $$0.eb().c(cek.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof are $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
