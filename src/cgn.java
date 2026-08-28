import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cgn {
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

   protected static bus<?> a(bus<cgm> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(coo.a));
      $$0.b(coo.b);
      $$0.f();
      return $$0;
   }

   private static void b(bus<cgm> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new byd(0.8F), new bve(2.5F), new bwp(45, 90), new bwt(), new bvp(ccu.aO), new bvp(ccu.aP)));
   }

   private static void c(bus<cgm> $$0) {
      $$0.a(
         coo.b,
         ImmutableList.of(
            Pair.of(0, bwd.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bvz(cgn::b, 2.25F, 20)),
            Pair.of(2, bxx.a(cgn::b, Predicate.not(cgn::c), 4, 16, 2.25F)),
            Pair.of(3, bxj.a(6.0F, bqg.a(30, 60))),
            Pair.of(4, new bxg(ImmutableList.of(Pair.of(bxb.b(1.0F), 2), Pair.of(bxq.a(1.0F, 3), 2), Pair.of(new bvt(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cgm $$0) {
      $$0.dS().a(ImmutableList.of(coo.b));
   }

   public static void a(btq $$0, iz $$1) {
      bus<?> $$2 = $$0.dS();
      jh $$3 = jh.a($$0.dP().af(), $$1);
      Optional<jh> $$4 = $$2.c(ccu.aN);
      if ($$4.isEmpty()) {
         $$2.a(ccu.aN, $$3);
         $$2.a(ccu.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(ccu.aO, 600);
      }
   }

   private static Optional<bwx> b(btq $$0) {
      bus<?> $$1 = $$0.dS();
      Optional<jh> $$2 = $$1.c(ccu.aN);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bvm($$3.b().c()));
         }

         $$1.b(ccu.aN);
      }

      return d($$0);
   }

   private static boolean c(btq $$0) {
      bus<?> $$1 = $$0.dS();
      return $$1.a(ccu.L);
   }

   private static boolean a(btq $$0, bus<?> $$1, jh $$2) {
      Optional<Integer> $$3 = $$1.c(ccu.aO);
      dbz $$4 = $$0.dP();
      return $$4.af() == $$2.a() && $$4.a_($$2.b()).a(dfc.aY) && $$3.isPresent();
   }

   private static Optional<bwx> d(btq $$0) {
      return a($$0).map($$0x -> new bvu($$0x, true));
   }

   public static Optional<arg> a(btq $$0) {
      dbz $$1 = $$0.dP();
      if (!$$1.x_() && $$1 instanceof arf $$2) {
         Optional<UUID> $$3 = $$0.dS().c(ccu.aM);
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
