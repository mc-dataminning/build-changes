import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cew {
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

   protected static btb<?> a(btb<cev> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cmw.a));
      $$0.b(cmw.b);
      $$0.f();
      return $$0;
   }

   private static void b(btb<cev> $$0) {
      $$0.a(cmw.a, 0, ImmutableList.of(new bwm(0.8F), new btn(2.5F), new buy(45, 90), new bvc(), new bty(cbd.aO), new bty(cbd.aP)));
   }

   private static void c(btb<cev> $$0) {
      $$0.a(
         cmw.b,
         ImmutableList.of(
            Pair.of(0, bum.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bui(cew::b, 2.25F, 20)),
            Pair.of(2, bwg.a(cew::b, Predicate.not(cew::c), 4, 16, 2.25F)),
            Pair.of(3, bvs.a(6.0F, box.a(30, 60))),
            Pair.of(4, new bvp(ImmutableList.of(Pair.of(bvk.b(1.0F), 2), Pair.of(bvz.a(1.0F, 3), 2), Pair.of(new buc(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cev $$0) {
      $$0.dQ().a(ImmutableList.of(cmw.b));
   }

   public static void a(bsa $$0, in $$1) {
      btb<?> $$2 = $$0.dQ();
      iv $$3 = iv.a($$0.dN().ae(), $$1);
      Optional<iv> $$4 = $$2.c(cbd.aN);
      if ($$4.isEmpty()) {
         $$2.a(cbd.aN, $$3);
         $$2.a(cbd.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cbd.aO, 600);
      }
   }

   private static Optional<bvg> b(bsa $$0) {
      btb<?> $$1 = $$0.dQ();
      Optional<iv> $$2 = $$1.c(cbd.aN);
      if ($$2.isPresent()) {
         iv $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new btv($$3.b().c()));
         }

         $$1.b(cbd.aN);
      }

      return d($$0);
   }

   private static boolean c(bsa $$0) {
      btb<?> $$1 = $$0.dQ();
      return $$1.a(cbd.L);
   }

   private static boolean a(bsa $$0, btb<?> $$1, iv $$2) {
      Optional<Integer> $$3 = $$1.c(cbd.aO);
      dad $$4 = $$0.dN();
      return $$4.ae() == $$2.a() && $$4.a_($$2.b()).a(ddg.aY) && $$3.isPresent();
   }

   private static Optional<bvg> d(bsa $$0) {
      return a($$0).map($$0x -> new bud($$0x, true));
   }

   public static Optional<aqi> a(bsa $$0) {
      dad $$1 = $$0.dN();
      if (!$$1.x_() && $$1 instanceof aqh $$2) {
         Optional<UUID> $$3 = $$0.dQ().c(cbd.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aqi $$5 && ($$5.f.d() || $$5.f.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
