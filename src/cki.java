import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cki {
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

   protected static bye<?> a(bye<ckh> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(csw.a));
      $$0.b(csw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bye<ckh> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new cbp(0.8F), new byq(2.5F), new cab(45, 90), new caf(), new bzb(cgg.aP), new bzb(cgg.aQ)));
   }

   private static void c(bye<ckh> $$0) {
      $$0.a(
         csw.b,
         ImmutableList.of(
            Pair.of(0, bzp.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bzl(cki::b, 2.25F, 20)),
            Pair.of(2, cbj.a(cki::b, Predicate.not(cki::c), 4, 16, 2.25F)),
            Pair.of(3, cav.a(6.0F, bto.a(30, 60))),
            Pair.of(4, new cas(ImmutableList.of(Pair.of(can.b(1.0F), 2), Pair.of(cbc.a(1.0F, 3), 2), Pair.of(new bzf(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(ckh $$0) {
      $$0.ec().a(ImmutableList.of(csw.b));
   }

   public static void a(bxe $$0, iu $$1) {
      bye<?> $$2 = $$0.ec();
      jd $$3 = jd.a($$0.dV().aj(), $$1);
      Optional<jd> $$4 = $$2.c(cgg.aO);
      if ($$4.isEmpty()) {
         $$2.a(cgg.aO, $$3);
         $$2.a(cgg.aP, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cgg.aP, 600);
      }
   }

   private static Optional<caj> b(bxe $$0) {
      bye<?> $$1 = $$0.ec();
      Optional<jd> $$2 = $$1.c(cgg.aO);
      if ($$2.isPresent()) {
         jd $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new byy($$3.b().d()));
         }

         $$1.b(cgg.aO);
      }

      return d($$0);
   }

   private static boolean c(bxe $$0) {
      bye<?> $$1 = $$0.ec();
      return $$1.a(cgg.M);
   }

   private static boolean a(bxe $$0, bye<?> $$1, jd $$2) {
      Optional<Integer> $$3 = $$1.c(cgg.aP);
      dja $$4 = $$0.dV();
      return $$2.a($$4.aj(), $$0.dv(), 1024) && $$4.a_($$2.b()).a(dmh.bf) && $$3.isPresent();
   }

   private static Optional<caj> d(bxe $$0) {
      return a($$0).map($$0x -> new bzg($$0x, true));
   }

   public static Optional<arr> a(bxe $$0) {
      dja $$1 = $$0.dV();
      if (!$$1.w_() && $$1 instanceof arq $$2) {
         Optional<UUID> $$3 = $$0.ec().c(cgg.aN);
         if ($$3.isPresent()) {
            if ($$2.b($$3.get()) instanceof arr $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
