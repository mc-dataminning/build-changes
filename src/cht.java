import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cht {
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

   protected static bvx<?> a(bvx<chs> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cpz.a));
      $$0.b(cpz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvx<chs> $$0) {
      $$0.a(cpz.a, 0, ImmutableList.of(new bzi(0.8F), new bwj(2.5F), new bxu(45, 90), new bxy(), new bwu(cdz.aO), new bwu(cdz.aP)));
   }

   private static void c(bvx<chs> $$0) {
      $$0.a(
         cpz.b,
         ImmutableList.of(
            Pair.of(0, bxi.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bxe(cht::b, 2.25F, 20)),
            Pair.of(2, bzc.a(cht::b, Predicate.not(cht::c), 4, 16, 2.25F)),
            Pair.of(3, byo.a(6.0F, brj.a(30, 60))),
            Pair.of(4, new byl(ImmutableList.of(Pair.of(byg.b(1.0F), 2), Pair.of(byv.a(1.0F, 3), 2), Pair.of(new bwy(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(chs $$0) {
      $$0.ed().a(ImmutableList.of(cpz.b));
   }

   public static void a(buv $$0, jg $$1) {
      bvx<?> $$2 = $$0.ed();
      jo $$3 = jo.a($$0.dX().ag(), $$1);
      Optional<jo> $$4 = $$2.c(cdz.aN);
      if ($$4.isEmpty()) {
         $$2.a(cdz.aN, $$3);
         $$2.a(cdz.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cdz.aO, 600);
      }
   }

   private static Optional<byc> b(buv $$0) {
      bvx<?> $$1 = $$0.ed();
      Optional<jo> $$2 = $$1.c(cdz.aN);
      if ($$2.isPresent()) {
         jo $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bwr($$3.b().d()));
         }

         $$1.b(cdz.aN);
      }

      return d($$0);
   }

   private static boolean c(buv $$0) {
      bvx<?> $$1 = $$0.ed();
      return $$1.a(cdz.L);
   }

   private static boolean a(buv $$0, bvx<?> $$1, jo $$2) {
      Optional<Integer> $$3 = $$1.c(cdz.aO);
      dev $$4 = $$0.dX();
      return $$4.ag() == $$2.a() && $$4.a_($$2.b()).a(dia.aY) && $$3.isPresent();
   }

   private static Optional<byc> d(buv $$0) {
      return a($$0).map($$0x -> new bwz($$0x, true));
   }

   public static Optional<arn> a(buv $$0) {
      dev $$1 = $$0.dX();
      if (!$$1.y_() && $$1 instanceof arm $$2) {
         Optional<UUID> $$3 = $$0.ed().c(cdz.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof arn $$5 && ($$5.f.d() || $$5.f.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
