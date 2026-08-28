import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cnc {
   protected static final ImmutableList<? extends cfr<? extends cfq<? super cnb>>> a = ImmutableList.of(cfr.c, cfr.d);
   protected static final ImmutableList<? extends cek<?>> b = ImmutableList.of(cek.g, cek.h, cek.k, cek.l, cek.n, cek.m, cek.E, cek.t, cek.o, cek.p);

   static void a(bwi<cnb> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new bzt<cnb>(0.8F) {
         protected boolean a(ard $$0, cnb $$1) {
            return $$1.t() && super.a($$0, (bvg)$$1);
         }
      }, new byf(45, 90), new byj()));
   }

   static void b(bwi<cnb> $$0) {
      $$0.a(
         cqn.b,
         10,
         ImmutableList.of(
            bzl.a(($$0x, $$1) -> $$1.gC(), ($$0x, $$1) -> $$1.eb().c(cek.l)),
            byz.a(8.0F, bru.a(30, 60)),
            new byw(ImmutableList.of(Pair.of(byr.a(0.3F), 2), Pair.of(bzg.a(0.3F, 3), 2), Pair.of(new bxj(30, 60), 1)))
         )
      );
   }

   static void c(bwi<cnb> $$0) {
      $$0.a(cqn.k, 10, ImmutableList.of(bze.a(1.0F), byg.a(cnb::t, 40), bzo.a()), cek.o);
   }

   public static bwi.b<cnb> a() {
      return bwi.a(b, a);
   }

   public static bwi<cnb> d(bwi<cnb> $$0) {
      a($$0);
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqn.a));
      $$0.b(cqn.b);
      $$0.f();
      return $$0;
   }

   public static void a(cnb $$0) {
      if (!$$0.t()) {
         $$0.eb().f();
      } else {
         $$0.eb().a(ImmutableList.of(cqn.k, cqn.b));
      }
   }
}
