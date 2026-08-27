import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class bvn {
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

   protected static bjx<?> a(bjx<bvm> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ccw.a));
      $$0.b(ccw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjx<bvm> $$0) {
      $$0.a(ccw.a, 0, ImmutableList.of(new bnh(0.8F), new bkj(2.5F), new blt(45, 90), new blx(), new bku(bry.aN), new bku(bry.aO)));
   }

   private static void c(bjx<bvm> $$0) {
      $$0.a(
         ccw.b,
         ImmutableList.of(
            Pair.of(0, bli.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new ble(bvn::b, 2.25F, 20)),
            Pair.of(2, bnb.a(bvn::b, Predicate.not(bvn::c), 4, 16, 2.25F)),
            Pair.of(3, bmn.a(6.0F, bfz.a(30, 60))),
            Pair.of(4, new bmk(ImmutableList.of(Pair.of(bmf.b(1.0F), 2), Pair.of(bmu.a(1.0F, 3), 2), Pair.of(new bky(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bvm $$0) {
      $$0.dM().a(ImmutableList.of(ccw.b));
   }

   public static void a(biw $$0, gv $$1) {
      bjx<?> $$2 = $$0.dM();
      he $$3 = he.a($$0.dK().ac(), $$1);
      Optional<he> $$4 = $$2.c(bry.aM);
      if ($$4.isEmpty()) {
         $$2.a(bry.aM, $$3);
         $$2.a(bry.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bry.aN, 600);
      }
   }

   private static Optional<bmb> b(biw $$0) {
      bjx<?> $$1 = $$0.dM();
      Optional<he> $$2 = $$1.c(bry.aM);
      if ($$2.isPresent()) {
         he $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bkr($$3.b().c()));
         }

         $$1.b(bry.aM);
      }

      return d($$0);
   }

   private static boolean c(biw $$0) {
      bjx<?> $$1 = $$0.dM();
      return $$1.a(bry.K);
   }

   private static boolean a(biw $$0, bjx<?> $$1, he $$2) {
      Optional<Integer> $$3 = $$1.c(bry.aN);
      cpk $$4 = $$0.dK();
      return $$4.ac() == $$2.a() && $$4.a_($$2.b()).a(csl.aY) && $$3.isPresent();
   }

   private static Optional<bmb> d(biw $$0) {
      return a($$0).map($$0x -> new bkz($$0x, true));
   }

   public static Optional<akj> a(biw $$0) {
      cpk $$1 = $$0.dK();
      if (!$$1.r_() && $$1 instanceof aki $$2) {
         Optional<UUID> $$3 = $$0.dM().c(bry.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof akj $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
