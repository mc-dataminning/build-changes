import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class chc {
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

   protected static bvg<?> a(bvg<chb> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cpg.a));
      $$0.b(cpg.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvg<chb> $$0) {
      $$0.a(cpg.a, 0, ImmutableList.of(new byr(0.8F), new bvs(2.5F), new bxd(45, 90), new bxh(), new bwd(cdi.aO), new bwd(cdi.aP)));
   }

   private static void c(bvg<chb> $$0) {
      $$0.a(
         cpg.b,
         ImmutableList.of(
            Pair.of(0, bwr.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bwn(chc::b, 2.25F, 20)),
            Pair.of(2, byl.a(chc::b, Predicate.not(chc::c), 4, 16, 2.25F)),
            Pair.of(3, bxx.a(6.0F, bqv.a(30, 60))),
            Pair.of(4, new bxu(ImmutableList.of(Pair.of(bxp.b(1.0F), 2), Pair.of(bye.a(1.0F, 3), 2), Pair.of(new bwh(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(chb $$0) {
      $$0.dX().a(ImmutableList.of(cpg.b));
   }

   public static void a(buf $$0, je $$1) {
      bvg<?> $$2 = $$0.dX();
      jm $$3 = jm.a($$0.dS().ag(), $$1);
      Optional<jm> $$4 = $$2.c(cdi.aN);
      if ($$4.isEmpty()) {
         $$2.a(cdi.aN, $$3);
         $$2.a(cdi.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cdi.aO, 600);
      }
   }

   private static Optional<bxl> b(buf $$0) {
      bvg<?> $$1 = $$0.dX();
      Optional<jm> $$2 = $$1.c(cdi.aN);
      if ($$2.isPresent()) {
         jm $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bwa($$3.b().d()));
         }

         $$1.b(cdi.aN);
      }

      return d($$0);
   }

   private static boolean c(buf $$0) {
      bvg<?> $$1 = $$0.dX();
      return $$1.a(cdi.L);
   }

   private static boolean a(buf $$0, bvg<?> $$1, jm $$2) {
      Optional<Integer> $$3 = $$1.c(cdi.aO);
      dds $$4 = $$0.dS();
      return $$4.ag() == $$2.a() && $$4.a_($$2.b()).a(dgx.aY) && $$3.isPresent();
   }

   private static Optional<bxl> d(buf $$0) {
      return a($$0).map($$0x -> new bwi($$0x, true));
   }

   public static Optional<arh> a(buf $$0) {
      dds $$1 = $$0.dS();
      if (!$$1.w_() && $$1 instanceof arg $$2) {
         Optional<UUID> $$3 = $$0.dX().c(cdi.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof arh $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
