import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cid {
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

   protected static bwh<?> a(bwh<cic> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqm.a));
      $$0.b(cqm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwh<cic> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bzs(0.8F), new bwt(2.5F), new bye(45, 90), new byi(), new bxe(cej.aO), new bxe(cej.aP)));
   }

   private static void c(bwh<cic> $$0) {
      $$0.a(
         cqm.b,
         ImmutableList.of(
            Pair.of(0, bxs.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bxo(cid::b, 2.25F, 20)),
            Pair.of(2, bzm.a(cid::b, Predicate.not(cid::c), 4, 16, 2.25F)),
            Pair.of(3, byy.a(6.0F, brt.a(30, 60))),
            Pair.of(4, new byv(ImmutableList.of(Pair.of(byq.b(1.0F), 2), Pair.of(bzf.a(1.0F, 3), 2), Pair.of(new bxi(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cic $$0) {
      $$0.ec().a(ImmutableList.of(cqm.b));
   }

   public static void a(bvf $$0, ji $$1) {
      bwh<?> $$2 = $$0.ec();
      jq $$3 = jq.a($$0.dW().ai(), $$1);
      Optional<jq> $$4 = $$2.c(cej.aN);
      if ($$4.isEmpty()) {
         $$2.a(cej.aN, $$3);
         $$2.a(cej.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cej.aO, 600);
      }
   }

   private static Optional<bym> b(bvf $$0) {
      bwh<?> $$1 = $$0.ec();
      Optional<jq> $$2 = $$1.c(cej.aN);
      if ($$2.isPresent()) {
         jq $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bxb($$3.b().d()));
         }

         $$1.b(cej.aN);
      }

      return d($$0);
   }

   private static boolean c(bvf $$0) {
      bwh<?> $$1 = $$0.ec();
      return $$1.a(cej.L);
   }

   private static boolean a(bvf $$0, bwh<?> $$1, jq $$2) {
      Optional<Integer> $$3 = $$1.c(cej.aO);
      dgg $$4 = $$0.dW();
      return $$2.a($$4.ai(), $$0.dw(), 1024) && $$4.a_($$2.b()).a(djm.bf) && $$3.isPresent();
   }

   private static Optional<bym> d(bvf $$0) {
      return a($$0).map($$0x -> new bxj($$0x, true));
   }

   public static Optional<ard> a(bvf $$0) {
      dgg $$1 = $$0.dW();
      if (!$$1.B_() && $$1 instanceof arc $$2) {
         Optional<UUID> $$3 = $$0.ec().c(cej.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof ard $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
