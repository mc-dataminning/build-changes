import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class chy {
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

   protected static bwc<?> a(bwc<chx> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqe.a));
      $$0.b(cqe.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwc<chx> $$0) {
      $$0.a(cqe.a, 0, ImmutableList.of(new bzn(0.8F), new bwo(2.5F), new bxz(45, 90), new byd(), new bwz(cee.aO), new bwz(cee.aP)));
   }

   private static void c(bwc<chx> $$0) {
      $$0.a(
         cqe.b,
         ImmutableList.of(
            Pair.of(0, bxn.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bxj(chy::b, 2.25F, 20)),
            Pair.of(2, bzh.a(chy::b, Predicate.not(chy::c), 4, 16, 2.25F)),
            Pair.of(3, byt.a(6.0F, bro.a(30, 60))),
            Pair.of(4, new byq(ImmutableList.of(Pair.of(byl.b(1.0F), 2), Pair.of(bza.a(1.0F, 3), 2), Pair.of(new bxd(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(chx $$0) {
      $$0.ed().a(ImmutableList.of(cqe.b));
   }

   public static void a(bva $$0, jh $$1) {
      bwc<?> $$2 = $$0.ed();
      jp $$3 = jp.a($$0.dX().ag(), $$1);
      Optional<jp> $$4 = $$2.c(cee.aN);
      if ($$4.isEmpty()) {
         $$2.a(cee.aN, $$3);
         $$2.a(cee.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cee.aO, 600);
      }
   }

   private static Optional<byh> b(bva $$0) {
      bwc<?> $$1 = $$0.ed();
      Optional<jp> $$2 = $$1.c(cee.aN);
      if ($$2.isPresent()) {
         jp $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bww($$3.b().d()));
         }

         $$1.b(cee.aN);
      }

      return d($$0);
   }

   private static boolean c(bva $$0) {
      bwc<?> $$1 = $$0.ed();
      return $$1.a(cee.L);
   }

   private static boolean a(bva $$0, bwc<?> $$1, jp $$2) {
      Optional<Integer> $$3 = $$1.c(cee.aO);
      dfb $$4 = $$0.dX();
      return $$4.ag() == $$2.a() && $$4.a_($$2.b()).a(dig.aY) && $$3.isPresent();
   }

   private static Optional<byh> d(bva $$0) {
      return a($$0).map($$0x -> new bxe($$0x, true));
   }

   public static Optional<aro> a(bva $$0) {
      dfb $$1 = $$0.dX();
      if (!$$1.y_() && $$1 instanceof arn $$2) {
         Optional<UUID> $$3 = $$0.ed().c(cee.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aro $$5 && ($$5.i.d() || $$5.i.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
