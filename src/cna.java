import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cna {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bvx<?> a(cmz $$0, bvx<cmz> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cpz.a));
      $$1.b(cpz.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cmz $$0) {
      jo $$1 = jo.a($$0.dX().ag(), $$0.dx());
      $$0.ed().a(cdz.b, $$1);
   }

   private static void b(cmz $$0, bvx<cmz> $$1) {
      $$1.a(cpz.a, 0, ImmutableList.of(new bxu(45, 90), new bxy(), bxm.a(), bze.a()));
   }

   private static void c(cmz $$0, bvx<cmz> $$1) {
      $$1.a(cpz.b, 10, ImmutableList.of(bza.a(cna::a), a(), b(), byq.a(bug.by, 4)));
   }

   private static void d(cmz $$0, bvx<cmz> $$1) {
      $$1.a(cpz.k, 10, ImmutableList.of(bzd.a($$1x -> !a((cmv)$$0, $$1x)), byt.a(1.0F), bxv.a(20)), cdz.o);
   }

   private static byl<cmz> a() {
      return new byl<>(
         ImmutableList.of(
            Pair.of(byn.a(bug.by, 8.0F), 1),
            Pair.of(byn.a(bug.aA, 8.0F), 1),
            Pair.of(byn.a(bug.aB, 8.0F), 1),
            Pair.of(byn.a(8.0F), 1),
            Pair.of(new bwy(30, 60), 1)
         )
      );
   }

   private static byl<cmz> b() {
      return new byl<>(
         ImmutableList.of(
            Pair.of(byg.a(0.6F), 2),
            Pair.of(bxl.a(bug.aA, 8, cdz.q, 0.6F, 2), 2),
            Pair.of(bxl.a(bug.aB, 8, cdz.q, 0.6F, 2), 2),
            Pair.of(bzg.a(cdz.b, 0.6F, 2, 100), 2),
            Pair.of(bzf.a(cdz.b, 0.6F, 5), 2),
            Pair.of(new bwy(30, 60), 1)
         )
      );
   }

   protected static void b(cmz $$0) {
      bvx<cmz> $$1 = $$0.ed();
      cpz $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cpz.k, cpz.b));
      cpz $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cdz.o));
   }

   private static boolean a(cmv $$0, buv $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends buv> a(cmv $$0) {
      Optional<buv> $$1 = bwq.a($$0, cdz.ab);
      if ($$1.isPresent() && cff.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends buv> $$2 = $$0.ed().c(cdz.l);
         return $$2.isPresent() ? $$2 : $$0.ed().c(cdz.M);
      }
   }

   protected static void a(cmz $$0, buv $$1) {
      if (!($$1 instanceof cmv)) {
         cmx.a($$0, $$1);
      }
   }

   protected static void b(cmz $$0, buv $$1) {
      $$0.ed().b(cdz.E);
      $$0.ed().a(cdz.ab, $$1.cH(), 600L);
   }

   protected static void c(cmz $$0) {
      if ((double)$$0.dX().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cmz $$0) {
      $$0.ed().g().ifPresent($$1 -> {
         if ($$1 == cpz.k) {
            $$0.gC();
         }
      });
   }
}
