import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class chk {
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

   protected static bvo<?> a(bvo<chj> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cpp.a));
      $$0.b(cpp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvo<chj> $$0) {
      $$0.a(cpp.a, 0, ImmutableList.of(new byz(0.8F), new bwa(2.5F), new bxl(45, 90), new bxp(), new bwl(cdq.aO), new bwl(cdq.aP)));
   }

   private static void c(bvo<chj> $$0) {
      $$0.a(
         cpp.b,
         ImmutableList.of(
            Pair.of(0, bwz.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bwv(chk::b, 2.25F, 20)),
            Pair.of(2, byt.a(chk::b, Predicate.not(chk::c), 4, 16, 2.25F)),
            Pair.of(3, byf.a(6.0F, brd.a(30, 60))),
            Pair.of(4, new byc(ImmutableList.of(Pair.of(bxx.b(1.0F), 2), Pair.of(bym.a(1.0F, 3), 2), Pair.of(new bwp(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(chj $$0) {
      $$0.dY().a(ImmutableList.of(cpp.b));
   }

   public static void a(bun $$0, jf $$1) {
      bvo<?> $$2 = $$0.dY();
      jn $$3 = jn.a($$0.dS().ag(), $$1);
      Optional<jn> $$4 = $$2.c(cdq.aN);
      if ($$4.isEmpty()) {
         $$2.a(cdq.aN, $$3);
         $$2.a(cdq.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cdq.aO, 600);
      }
   }

   private static Optional<bxt> b(bun $$0) {
      bvo<?> $$1 = $$0.dY();
      Optional<jn> $$2 = $$1.c(cdq.aN);
      if ($$2.isPresent()) {
         jn $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bwi($$3.b().d()));
         }

         $$1.b(cdq.aN);
      }

      return d($$0);
   }

   private static boolean c(bun $$0) {
      bvo<?> $$1 = $$0.dY();
      return $$1.a(cdq.L);
   }

   private static boolean a(bun $$0, bvo<?> $$1, jn $$2) {
      Optional<Integer> $$3 = $$1.c(cdq.aO);
      dej $$4 = $$0.dS();
      return $$4.ag() == $$2.a() && $$4.a_($$2.b()).a(dho.aY) && $$3.isPresent();
   }

   private static Optional<bxt> d(bun $$0) {
      return a($$0).map($$0x -> new bwq($$0x, true));
   }

   public static Optional<ark> a(bun $$0) {
      dej $$1 = $$0.dS();
      if (!$$1.x_() && $$1 instanceof arj $$2) {
         Optional<UUID> $$3 = $$0.dY().c(cdq.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof ark $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
