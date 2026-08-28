import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class civ {
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

   protected static bwz<?> a(bwz<ciu> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crf.a));
      $$0.b(crf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwz<ciu> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new cak(0.8F), new bxl(2.5F), new byw(45, 90), new bza(), new bxw(cfb.aO), new bxw(cfb.aP)));
   }

   private static void c(bwz<ciu> $$0) {
      $$0.a(
         crf.b,
         ImmutableList.of(
            Pair.of(0, byk.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new byg(civ::b, 2.25F, 20)),
            Pair.of(2, cae.a(civ::b, Predicate.not(civ::c), 4, 16, 2.25F)),
            Pair.of(3, bzq.a(6.0F, bsl.a(30, 60))),
            Pair.of(4, new bzn(ImmutableList.of(Pair.of(bzi.b(1.0F), 2), Pair.of(bzx.a(1.0F, 3), 2), Pair.of(new bya(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(ciu $$0) {
      $$0.ec().a(ImmutableList.of(crf.b));
   }

   public static void a(bvx $$0, jh $$1) {
      bwz<?> $$2 = $$0.ec();
      jp $$3 = jp.a($$0.dW().ai(), $$1);
      Optional<jp> $$4 = $$2.c(cfb.aN);
      if ($$4.isEmpty()) {
         $$2.a(cfb.aN, $$3);
         $$2.a(cfb.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cfb.aO, 600);
      }
   }

   private static Optional<bze> b(bvx $$0) {
      bwz<?> $$1 = $$0.ec();
      Optional<jp> $$2 = $$1.c(cfb.aN);
      if ($$2.isPresent()) {
         jp $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bxt($$3.b().d()));
         }

         $$1.b(cfb.aN);
      }

      return d($$0);
   }

   private static boolean c(bvx $$0) {
      bwz<?> $$1 = $$0.ec();
      return $$1.a(cfb.L);
   }

   private static boolean a(bvx $$0, bwz<?> $$1, jp $$2) {
      Optional<Integer> $$3 = $$1.c(cfb.aO);
      dgz $$4 = $$0.dW();
      return $$2.a($$4.ai(), $$0.dw(), 1024) && $$4.a_($$2.b()).a(dkf.bf) && $$3.isPresent();
   }

   private static Optional<bze> d(bvx $$0) {
      return a($$0).map($$0x -> new byb($$0x, true));
   }

   public static Optional<ary> a(bvx $$0) {
      dgz $$1 = $$0.dW();
      if (!$$1.B_() && $$1 instanceof arx $$2) {
         Optional<UUID> $$3 = $$0.ec().c(cfb.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof ary $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
