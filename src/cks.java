import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cks {
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

   protected static btp<?> a(ckr $$0, btp<ckr> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cnq.a));
      $$1.b(cnq.b);
      $$1.f();
      return $$1;
   }

   protected static void a(ckr $$0) {
      iz $$1 = iz.a($$0.dU().af(), $$0.du());
      $$0.dZ().a(cbr.b, $$1);
   }

   private static void b(ckr $$0, btp<ckr> $$1) {
      $$1.a(cnq.a, 0, ImmutableList.of(new bvm(45, 90), new bvq(), bve.a(), bww.a()));
   }

   private static void c(ckr $$0, btp<ckr> $$1) {
      $$1.a(cnq.b, 10, ImmutableList.of(bws.a(cks::a), a(), b(), bwi.a(bsb.bE, 4)));
   }

   private static void d(ckr $$0, btp<ckr> $$1) {
      $$1.a(cnq.k, 10, ImmutableList.of(bwv.a($$1x -> !a((ckn)$$0, $$1x)), bwl.a(1.0F), bvn.a(20)), cbr.o);
   }

   private static bwd<ckr> a() {
      return new bwd<>(
         ImmutableList.of(
            Pair.of(bwf.a(bsb.bE, 8.0F), 1),
            Pair.of(bwf.a(bsb.aB, 8.0F), 1),
            Pair.of(bwf.a(bsb.aC, 8.0F), 1),
            Pair.of(bwf.a(8.0F), 1),
            Pair.of(new buq(30, 60), 1)
         )
      );
   }

   private static bwd<ckr> b() {
      return new bwd<>(
         ImmutableList.of(
            Pair.of(bvy.a(0.6F), 2),
            Pair.of(bvd.a(bsb.aB, 8, cbr.q, 0.6F, 2), 2),
            Pair.of(bvd.a(bsb.aC, 8, cbr.q, 0.6F, 2), 2),
            Pair.of(bwy.a(cbr.b, 0.6F, 2, 100), 2),
            Pair.of(bwx.a(cbr.b, 0.6F, 5), 2),
            Pair.of(new buq(30, 60), 1)
         )
      );
   }

   protected static void b(ckr $$0) {
      btp<ckr> $$1 = $$0.dZ();
      cnq $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnq.k, cnq.b));
      cnq $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cbr.o));
   }

   private static boolean a(ckn $$0, bso $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bso> a(ckn $$0) {
      Optional<bso> $$1 = bui.a($$0, cbr.ab);
      if ($$1.isPresent() && ccx.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bso> $$2 = a($$0, cbr.l);
         return $$2.isPresent() ? $$2 : $$0.dZ().c(cbr.M);
      }
   }

   private static Optional<? extends bso> a(ckn $$0, cbr<? extends bso> $$1) {
      return $$0.dZ().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(ckr $$0, bso $$1) {
      if (!($$1 instanceof ckn)) {
         ckp.a($$0, $$1);
      }
   }

   protected static void b(ckr $$0, bso $$1) {
      $$0.dZ().b(cbr.E);
      $$0.dZ().a(cbr.ab, $$1.cE(), 600L);
   }

   protected static void c(ckr $$0) {
      if ((double)$$0.dU().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(ckr $$0) {
      $$0.dZ().g().ifPresent($$1 -> {
         if ($$1 == cnq.k) {
            $$0.gD();
         }
      });
   }
}
