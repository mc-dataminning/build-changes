import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cje {
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

   protected static bxi<?> a(bxi<cjd> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cro.a));
      $$0.b(cro.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxi<cjd> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new cat(0.8F), new bxu(2.5F), new bzf(45, 90), new bzj(), new byf(cfk.aO), new byf(cfk.aP)));
   }

   private static void c(bxi<cjd> $$0) {
      $$0.a(
         cro.b,
         ImmutableList.of(
            Pair.of(0, byt.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new byp(cje::b, 2.25F, 20)),
            Pair.of(2, can.a(cje::b, Predicate.not(cje::c), 4, 16, 2.25F)),
            Pair.of(3, bzz.a(6.0F, bsu.a(30, 60))),
            Pair.of(4, new bzw(ImmutableList.of(Pair.of(bzr.b(1.0F), 2), Pair.of(cag.a(1.0F, 3), 2), Pair.of(new byj(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cjd $$0) {
      $$0.ec().a(ImmutableList.of(cro.b));
   }

   public static void a(bwg $$0, jh $$1) {
      bxi<?> $$2 = $$0.ec();
      jp $$3 = jp.a($$0.dW().ah(), $$1);
      Optional<jp> $$4 = $$2.c(cfk.aN);
      if ($$4.isEmpty()) {
         $$2.a(cfk.aN, $$3);
         $$2.a(cfk.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cfk.aO, 600);
      }
   }

   private static Optional<bzn> b(bwg $$0) {
      bxi<?> $$1 = $$0.ec();
      Optional<jp> $$2 = $$1.c(cfk.aN);
      if ($$2.isPresent()) {
         jp $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new byc($$3.b().d()));
         }

         $$1.b(cfk.aN);
      }

      return d($$0);
   }

   private static boolean c(bwg $$0) {
      bxi<?> $$1 = $$0.ec();
      return $$1.a(cfk.L);
   }

   private static boolean a(bwg $$0, bxi<?> $$1, jp $$2) {
      Optional<Integer> $$3 = $$1.c(cfk.aO);
      dhi $$4 = $$0.dW();
      return $$2.a($$4.ah(), $$0.dw(), 1024) && $$4.a_($$2.b()).a(dko.bf) && $$3.isPresent();
   }

   private static Optional<bzn> d(bwg $$0) {
      return a($$0).map($$0x -> new byk($$0x, true));
   }

   public static Optional<asi> a(bwg $$0) {
      dhi $$1 = $$0.dW();
      if (!$$1.B_() && $$1 instanceof ash $$2) {
         Optional<UUID> $$3 = $$0.ec().c(cfk.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof asi $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
