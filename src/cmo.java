import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cmo {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bvl<?> a(cmn $$0, bvl<cmn> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cpm.a));
      $$1.b(cpm.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cmn $$0) {
      jm $$1 = jm.a($$0.dS().ag(), $$0.ds());
      $$0.dX().a(cdn.b, $$1);
   }

   private static void b(cmn $$0, bvl<cmn> $$1) {
      $$1.a(cpm.a, 0, ImmutableList.of(new bxi(45, 90), new bxm(), bxa.a(), bys.a()));
   }

   private static void c(cmn $$0, bvl<cmn> $$1) {
      $$1.a(cpm.b, 10, ImmutableList.of(byo.a(cmo::a), a(), b(), bye.a(btv.by, 4)));
   }

   private static void d(cmn $$0, bvl<cmn> $$1) {
      $$1.a(cpm.k, 10, ImmutableList.of(byr.a($$1x -> !a((cmj)$$0, $$1x)), byh.a(1.0F), bxj.a(20)), cdn.o);
   }

   private static bxz<cmn> a() {
      return new bxz<>(
         ImmutableList.of(
            Pair.of(byb.a(btv.by, 8.0F), 1),
            Pair.of(byb.a(btv.aA, 8.0F), 1),
            Pair.of(byb.a(btv.aB, 8.0F), 1),
            Pair.of(byb.a(8.0F), 1),
            Pair.of(new bwm(30, 60), 1)
         )
      );
   }

   private static bxz<cmn> b() {
      return new bxz<>(
         ImmutableList.of(
            Pair.of(bxu.a(0.6F), 2),
            Pair.of(bwz.a(btv.aA, 8, cdn.q, 0.6F, 2), 2),
            Pair.of(bwz.a(btv.aB, 8, cdn.q, 0.6F, 2), 2),
            Pair.of(byu.a(cdn.b, 0.6F, 2, 100), 2),
            Pair.of(byt.a(cdn.b, 0.6F, 5), 2),
            Pair.of(new bwm(30, 60), 1)
         )
      );
   }

   protected static void b(cmn $$0) {
      bvl<cmn> $$1 = $$0.dX();
      cpm $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cpm.k, cpm.b));
      cpm $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cdn.o));
   }

   private static boolean a(cmj $$0, buk $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends buk> a(cmj $$0) {
      Optional<buk> $$1 = bwe.a($$0, cdn.ab);
      if ($$1.isPresent() && cet.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends buk> $$2 = $$0.dX().c(cdn.l);
         return $$2.isPresent() ? $$2 : $$0.dX().c(cdn.M);
      }
   }

   protected static void a(cmn $$0, buk $$1) {
      if (!($$1 instanceof cmj)) {
         cml.a($$0, $$1);
      }
   }

   protected static void b(cmn $$0, buk $$1) {
      $$0.dX().b(cdn.E);
      $$0.dX().a(cdn.ab, $$1.cD(), 600L);
   }

   protected static void c(cmn $$0) {
      if ((double)$$0.dS().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cmn $$0) {
      $$0.dX().g().ifPresent($$1 -> {
         if ($$1 == cpm.k) {
            $$0.gw();
         }
      });
   }
}
