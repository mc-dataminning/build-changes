import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class clb {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final double f = 12.0;
   private static final float g = 0.6F;
   private static final int h = 2;
   private static final int i = 100;
   private static final int j = 5;

   protected static bua<?> a(cla $$0, bua<cla> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cnw.a));
      $$1.b(cnw.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cla $$0) {
      ji $$1 = ji.a($$0.dP().af(), $$0.dp());
      $$0.dT().a(ccc.b, $$1);
   }

   private static void b(cla $$0, bua<cla> $$1) {
      $$1.a(cnw.a, 0, ImmutableList.of(new bvx(45, 90), new bwb(), bvp.a(), bxh.a()));
   }

   private static void c(cla $$0, bua<cla> $$1) {
      $$1.a(cnw.b, 10, ImmutableList.of(bxd.a(clb::a), a(), b(), bwt.a(bsj.by, 4)));
   }

   private static void d(cla $$0, bua<cla> $$1) {
      $$1.a(cnw.k, 10, ImmutableList.of(bxg.a($$1x -> !a((ckw)$$0, $$1x)), bww.a(1.0F), bvy.a(20)), ccc.o);
   }

   private static bwo<cla> a() {
      return new bwo<>(
         ImmutableList.of(
            Pair.of(bwq.a(bsj.by, 8.0F), 1),
            Pair.of(bwq.a(bsj.aA, 8.0F), 1),
            Pair.of(bwq.a(bsj.aB, 8.0F), 1),
            Pair.of(bwq.a(8.0F), 1),
            Pair.of(new bvb(30, 60), 1)
         )
      );
   }

   private static bwo<cla> b() {
      return new bwo<>(
         ImmutableList.of(
            Pair.of(bwj.a(0.6F), 2),
            Pair.of(bvo.a(bsj.aA, 8, ccc.q, 0.6F, 2), 2),
            Pair.of(bvo.a(bsj.aB, 8, ccc.q, 0.6F, 2), 2),
            Pair.of(bxj.a(ccc.b, 0.6F, 2, 100), 2),
            Pair.of(bxi.a(ccc.b, 0.6F, 5), 2),
            Pair.of(new bvb(30, 60), 1)
         )
      );
   }

   protected static void b(cla $$0) {
      bua<cla> $$1 = $$0.dT();
      cnw $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnw.k, cnw.b));
      cnw $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(ccc.o));
   }

   private static boolean a(ckw $$0, bsy $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bsy> a(ckw $$0) {
      Optional<bsy> $$1 = but.a($$0, ccc.ab);
      if ($$1.isPresent() && cdi.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bsy> $$2 = a($$0, ccc.l);
         return $$2.isPresent() ? $$2 : $$0.dT().c(ccc.M);
      }
   }

   private static Optional<? extends bsy> a(ckw $$0, ccc<? extends bsy> $$1) {
      return $$0.dT().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cla $$0, bsy $$1) {
      if (!($$1 instanceof ckw)) {
         cky.a($$0, $$1);
      }
   }

   protected static void b(cla $$0, bsy $$1) {
      $$0.dT().b(ccc.E);
      $$0.dT().a(ccc.ab, $$1.cz(), 600L);
   }

   protected static void c(cla $$0) {
      if ((double)$$0.dP().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cla $$0) {
      $$0.dT().g().ifPresent($$1 -> {
         if ($$1 == cnw.k) {
            $$0.gu();
         }
      });
   }
}
