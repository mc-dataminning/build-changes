import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cdp {
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

   protected static bru<?> a(bru<cdo> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(clp.a));
      $$0.b(clp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bru<cdo> $$0) {
      $$0.a(clp.a, 0, ImmutableList.of(new bvf(0.8F), new bsg(2.5F), new btr(45, 90), new btv(), new bsr(bzw.aO), new bsr(bzw.aP)));
   }

   private static void c(bru<cdo> $$0) {
      $$0.a(
         clp.b,
         ImmutableList.of(
            Pair.of(0, btf.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new btb(cdp::b, 2.25F, 20)),
            Pair.of(2, buz.a(cdp::b, Predicate.not(cdp::c), 4, 16, 2.25F)),
            Pair.of(3, bul.a(6.0F, bnq.a(30, 60))),
            Pair.of(4, new bui(ImmutableList.of(Pair.of(bud.b(1.0F), 2), Pair.of(bus.a(1.0F, 3), 2), Pair.of(new bsv(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cdo $$0) {
      $$0.dP().a(ImmutableList.of(clp.b));
   }

   public static void a(bqt $$0, id $$1) {
      bru<?> $$2 = $$0.dP();
      im $$3 = im.a($$0.dM().ae(), $$1);
      Optional<im> $$4 = $$2.c(bzw.aN);
      if ($$4.isEmpty()) {
         $$2.a(bzw.aN, $$3);
         $$2.a(bzw.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bzw.aO, 600);
      }
   }

   private static Optional<btz> b(bqt $$0) {
      bru<?> $$1 = $$0.dP();
      Optional<im> $$2 = $$1.c(bzw.aN);
      if ($$2.isPresent()) {
         im $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bso($$3.b().c()));
         }

         $$1.b(bzw.aN);
      }

      return d($$0);
   }

   private static boolean c(bqt $$0) {
      bru<?> $$1 = $$0.dP();
      return $$1.a(bzw.L);
   }

   private static boolean a(bqt $$0, bru<?> $$1, im $$2) {
      Optional<Integer> $$3 = $$1.c(bzw.aO);
      czg $$4 = $$0.dM();
      return $$4.ae() == $$2.a() && $$4.a_($$2.b()).a(dcj.aY) && $$3.isPresent();
   }

   private static Optional<btz> d(bqt $$0) {
      return a($$0).map($$0x -> new bsw($$0x, true));
   }

   public static Optional<apv> a(bqt $$0) {
      czg $$1 = $$0.dM();
      if (!$$1.x_() && $$1 instanceof apu $$2) {
         Optional<UUID> $$3 = $$0.dP().c(bzw.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof apv $$5 && ($$5.f.d() || $$5.f.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
