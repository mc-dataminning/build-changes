import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cic {
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

   protected static bwg<?> a(bwg<cib> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqi.a));
      $$0.b(cqi.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwg<cib> $$0) {
      $$0.a(cqi.a, 0, ImmutableList.of(new bzr(0.8F), new bws(2.5F), new byd(45, 90), new byh(), new bxd(cei.aO), new bxd(cei.aP)));
   }

   private static void c(bwg<cib> $$0) {
      $$0.a(
         cqi.b,
         ImmutableList.of(
            Pair.of(0, bxr.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bxn(cic::b, 2.25F, 20)),
            Pair.of(2, bzl.a(cic::b, Predicate.not(cic::c), 4, 16, 2.25F)),
            Pair.of(3, byx.a(6.0F, brs.a(30, 60))),
            Pair.of(4, new byu(ImmutableList.of(Pair.of(byp.b(1.0F), 2), Pair.of(bze.a(1.0F, 3), 2), Pair.of(new bxh(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cib $$0) {
      $$0.ee().a(ImmutableList.of(cqi.b));
   }

   public static void a(bve $$0, jh $$1) {
      bwg<?> $$2 = $$0.ee();
      jp $$3 = jp.a($$0.dY().ag(), $$1);
      Optional<jp> $$4 = $$2.c(cei.aN);
      if ($$4.isEmpty()) {
         $$2.a(cei.aN, $$3);
         $$2.a(cei.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cei.aO, 600);
      }
   }

   private static Optional<byl> b(bve $$0) {
      bwg<?> $$1 = $$0.ee();
      Optional<jp> $$2 = $$1.c(cei.aN);
      if ($$2.isPresent()) {
         jp $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bxa($$3.b().d()));
         }

         $$1.b(cei.aN);
      }

      return d($$0);
   }

   private static boolean c(bve $$0) {
      bwg<?> $$1 = $$0.ee();
      return $$1.a(cei.L);
   }

   private static boolean a(bve $$0, bwg<?> $$1, jp $$2) {
      Optional<Integer> $$3 = $$1.c(cei.aO);
      dff $$4 = $$0.dY();
      return $$4.ag() == $$2.a() && $$4.a_($$2.b()).a(dil.aY) && $$3.isPresent();
   }

   private static Optional<byl> d(bve $$0) {
      return a($$0).map($$0x -> new bxi($$0x, true));
   }

   public static Optional<arr> a(bve $$0) {
      dff $$1 = $$0.dY();
      if (!$$1.y_() && $$1 instanceof arq $$2) {
         Optional<UUID> $$3 = $$0.ee().c(cei.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof arr $$5 && ($$5.i.d() || $$5.i.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
