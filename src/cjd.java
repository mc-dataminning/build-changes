import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cjd {
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

   protected static bxh<?> a(bxh<cjc> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crn.a));
      $$0.b(crn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxh<cjc> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new cas(0.8F), new bxt(2.5F), new bze(45, 90), new bzi(), new bye(cfj.aO), new bye(cfj.aP)));
   }

   private static void c(bxh<cjc> $$0) {
      $$0.a(
         crn.b,
         ImmutableList.of(
            Pair.of(0, bys.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new byo(cjd::b, 2.25F, 20)),
            Pair.of(2, cam.a(cjd::b, Predicate.not(cjd::c), 4, 16, 2.25F)),
            Pair.of(3, bzy.a(6.0F, bst.a(30, 60))),
            Pair.of(4, new bzv(ImmutableList.of(Pair.of(bzq.b(1.0F), 2), Pair.of(caf.a(1.0F, 3), 2), Pair.of(new byi(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cjc $$0) {
      $$0.ec().a(ImmutableList.of(crn.b));
   }

   public static void a(bwf $$0, jh $$1) {
      bxh<?> $$2 = $$0.ec();
      jp $$3 = jp.a($$0.dW().ah(), $$1);
      Optional<jp> $$4 = $$2.c(cfj.aN);
      if ($$4.isEmpty()) {
         $$2.a(cfj.aN, $$3);
         $$2.a(cfj.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cfj.aO, 600);
      }
   }

   private static Optional<bzm> b(bwf $$0) {
      bxh<?> $$1 = $$0.ec();
      Optional<jp> $$2 = $$1.c(cfj.aN);
      if ($$2.isPresent()) {
         jp $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new byb($$3.b().d()));
         }

         $$1.b(cfj.aN);
      }

      return d($$0);
   }

   private static boolean c(bwf $$0) {
      bxh<?> $$1 = $$0.ec();
      return $$1.a(cfj.L);
   }

   private static boolean a(bwf $$0, bxh<?> $$1, jp $$2) {
      Optional<Integer> $$3 = $$1.c(cfj.aO);
      dhh $$4 = $$0.dW();
      return $$4.ah() == $$2.a() && $$4.a_($$2.b()).a(dkn.bf) && $$3.isPresent();
   }

   private static Optional<bzm> d(bwf $$0) {
      return a($$0).map($$0x -> new byj($$0x, true));
   }

   public static Optional<asi> a(bwf $$0) {
      dhh $$1 = $$0.dW();
      if (!$$1.B_() && $$1 instanceof ash $$2) {
         Optional<UUID> $$3 = $$0.ec().c(cfj.aM);
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
