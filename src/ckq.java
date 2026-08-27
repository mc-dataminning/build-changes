import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class ckq {
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

   protected static btq<?> a(ckp $$0, btq<ckp> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cnl.a));
      $$1.b(cnl.b);
      $$1.f();
      return $$1;
   }

   protected static void a(ckp $$0) {
      iw $$1 = iw.a($$0.dP().ae(), $$0.dp());
      $$0.dS().a(cbs.b, $$1);
   }

   private static void b(ckp $$0, btq<ckp> $$1) {
      $$1.a(cnl.a, 0, ImmutableList.of(new bvn(45, 90), new bvr(), bvf.a(), bwx.a()));
   }

   private static void c(ckp $$0, btq<ckp> $$1) {
      $$1.a(cnl.b, 10, ImmutableList.of(bwt.a(ckq::a), a(), b(), bwj.a(bsa.by, 4)));
   }

   private static void d(ckp $$0, btq<ckp> $$1) {
      $$1.a(cnl.k, 10, ImmutableList.of(bww.a($$1x -> !a((ckl)$$0, $$1x)), bwm.a(1.0F), bvo.a(20)), cbs.o);
   }

   private static bwe<ckp> a() {
      return new bwe<>(
         ImmutableList.of(
            Pair.of(bwg.a(bsa.by, 8.0F), 1),
            Pair.of(bwg.a(bsa.aA, 8.0F), 1),
            Pair.of(bwg.a(bsa.aB, 8.0F), 1),
            Pair.of(bwg.a(8.0F), 1),
            Pair.of(new bur(30, 60), 1)
         )
      );
   }

   private static bwe<ckp> b() {
      return new bwe<>(
         ImmutableList.of(
            Pair.of(bvz.a(0.6F), 2),
            Pair.of(bve.a(bsa.aA, 8, cbs.q, 0.6F, 2), 2),
            Pair.of(bve.a(bsa.aB, 8, cbs.q, 0.6F, 2), 2),
            Pair.of(bwz.a(cbs.b, 0.6F, 2, 100), 2),
            Pair.of(bwy.a(cbs.b, 0.6F, 5), 2),
            Pair.of(new bur(30, 60), 1)
         )
      );
   }

   protected static void b(ckp $$0) {
      btq<ckp> $$1 = $$0.dS();
      cnl $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnl.k, cnl.b));
      cnl $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cbs.o));
   }

   private static boolean a(ckl $$0, bso $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bso> a(ckl $$0) {
      Optional<bso> $$1 = buj.a($$0, cbs.ab);
      if ($$1.isPresent() && ccy.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bso> $$2 = a($$0, cbs.l);
         return $$2.isPresent() ? $$2 : $$0.dS().c(cbs.M);
      }
   }

   private static Optional<? extends bso> a(ckl $$0, cbs<? extends bso> $$1) {
      return $$0.dS().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(ckp $$0, bso $$1) {
      if (!($$1 instanceof ckl)) {
         ckn.a($$0, $$1);
      }
   }

   protected static void b(ckp $$0, bso $$1) {
      $$0.dS().b(cbs.E);
      $$0.dS().a(cbs.ab, $$1.cz(), 600L);
   }

   protected static void c(ckp $$0) {
      if ((double)$$0.dP().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(ckp $$0) {
      $$0.dS().g().ifPresent($$1 -> {
         if ($$1 == cnl.k) {
            $$0.gw();
         }
      });
   }
}
