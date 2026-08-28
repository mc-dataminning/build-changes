import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cgk {
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

   protected static bup<?> a(bup<cgj> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(bup<cgj> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bya(0.8F), new bvb(2.5F), new bwm(45, 90), new bwq(), new bvm(ccr.aO), new bvm(ccr.aP)));
   }

   private static void c(bup<cgj> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bwa.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bvw(cgk::b, 2.25F, 20)),
            Pair.of(2, bxu.a(cgk::b, Predicate.not(cgk::c), 4, 16, 2.25F)),
            Pair.of(3, bxg.a(6.0F, bqd.a(30, 60))),
            Pair.of(4, new bxd(ImmutableList.of(Pair.of(bwy.b(1.0F), 2), Pair.of(bxn.a(1.0F, 3), 2), Pair.of(new bvq(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cgj $$0) {
      $$0.dS().a(ImmutableList.of(cok.b));
   }

   public static void a(btn $$0, iz $$1) {
      bup<?> $$2 = $$0.dS();
      jh $$3 = jh.a($$0.dP().af(), $$1);
      Optional<jh> $$4 = $$2.c(ccr.aN);
      if ($$4.isEmpty()) {
         $$2.a(ccr.aN, $$3);
         $$2.a(ccr.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(ccr.aO, 600);
      }
   }

   private static Optional<bwu> b(btn $$0) {
      bup<?> $$1 = $$0.dS();
      Optional<jh> $$2 = $$1.c(ccr.aN);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bvj($$3.b().c()));
         }

         $$1.b(ccr.aN);
      }

      return d($$0);
   }

   private static boolean c(btn $$0) {
      bup<?> $$1 = $$0.dS();
      return $$1.a(ccr.L);
   }

   private static boolean a(btn $$0, bup<?> $$1, jh $$2) {
      Optional<Integer> $$3 = $$1.c(ccr.aO);
      dbw $$4 = $$0.dP();
      return $$4.af() == $$2.a() && $$4.a_($$2.b()).a(dez.aY) && $$3.isPresent();
   }

   private static Optional<bwu> d(btn $$0) {
      return a($$0).map($$0x -> new bvr($$0x, true));
   }

   public static Optional<arf> a(btn $$0) {
      dbw $$1 = $$0.dP();
      if (!$$1.x_() && $$1 instanceof are $$2) {
         Optional<UUID> $$3 = $$0.dS().c(ccr.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof arf $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
