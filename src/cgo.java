import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cgo {
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

   protected static but<?> a(but<cgn> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cop.a));
      $$0.b(cop.b);
      $$0.f();
      return $$0;
   }

   private static void b(but<cgn> $$0) {
      $$0.a(cop.a, 0, ImmutableList.of(new bye(0.8F), new bvf(2.5F), new bwq(45, 90), new bwu(), new bvq(ccv.aO), new bvq(ccv.aP)));
   }

   private static void c(but<cgn> $$0) {
      $$0.a(
         cop.b,
         ImmutableList.of(
            Pair.of(0, bwe.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bwa(cgo::b, 2.25F, 20)),
            Pair.of(2, bxy.a(cgo::b, Predicate.not(cgo::c), 4, 16, 2.25F)),
            Pair.of(3, bxk.a(6.0F, bqh.a(30, 60))),
            Pair.of(4, new bxh(ImmutableList.of(Pair.of(bxc.b(1.0F), 2), Pair.of(bxr.a(1.0F, 3), 2), Pair.of(new bvu(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cgn $$0) {
      $$0.dS().a(ImmutableList.of(cop.b));
   }

   public static void a(btr $$0, iz $$1) {
      but<?> $$2 = $$0.dS();
      jh $$3 = jh.a($$0.dP().af(), $$1);
      Optional<jh> $$4 = $$2.c(ccv.aN);
      if ($$4.isEmpty()) {
         $$2.a(ccv.aN, $$3);
         $$2.a(ccv.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(ccv.aO, 600);
      }
   }

   private static Optional<bwy> b(btr $$0) {
      but<?> $$1 = $$0.dS();
      Optional<jh> $$2 = $$1.c(ccv.aN);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bvn($$3.b().c()));
         }

         $$1.b(ccv.aN);
      }

      return d($$0);
   }

   private static boolean c(btr $$0) {
      but<?> $$1 = $$0.dS();
      return $$1.a(ccv.L);
   }

   private static boolean a(btr $$0, but<?> $$1, jh $$2) {
      Optional<Integer> $$3 = $$1.c(ccv.aO);
      dca $$4 = $$0.dP();
      return $$4.af() == $$2.a() && $$4.a_($$2.b()).a(dfd.aY) && $$3.isPresent();
   }

   private static Optional<bwy> d(btr $$0) {
      return a($$0).map($$0x -> new bvv($$0x, true));
   }

   public static Optional<arg> a(btr $$0) {
      dca $$1 = $$0.dP();
      if (!$$1.x_() && $$1 instanceof arf $$2) {
         Optional<UUID> $$3 = $$0.dS().c(ccv.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof arg $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
