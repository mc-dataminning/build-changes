import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cnb {
   protected static final ImmutableList<? extends cfq<? extends cfp<? super cna>>> a = ImmutableList.of(cfq.c, cfq.d);
   protected static final ImmutableList<? extends cej<?>> b = ImmutableList.of(cej.g, cej.h, cej.k, cej.l, cej.n, cej.m, cej.E, cej.t, cej.o, cej.p);

   static void a(bwh<cna> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bzs<cna>(0.8F) {
         protected boolean a(arc $$0, cna $$1) {
            return $$1.t() && super.a($$0, (bvf)$$1);
         }
      }, new bye(45, 90), new byi()));
   }

   static void b(bwh<cna> $$0) {
      $$0.a(
         cqm.b,
         10,
         ImmutableList.of(
            bzk.a(($$0x, $$1) -> $$1.gy(), ($$0x, $$1) -> $$1.ec().c(cej.l)),
            byy.a(8.0F, brt.a(30, 60)),
            new byv(ImmutableList.of(Pair.of(byq.a(0.3F), 2), Pair.of(bzf.a(0.3F, 3), 2), Pair.of(new bxi(30, 60), 1)))
         )
      );
   }

   static void c(bwh<cna> $$0) {
      $$0.a(cqm.k, 10, ImmutableList.of(bzd.a(1.0F), byf.a(cna::t, 40), bzn.a()), cej.o);
   }

   public static bwh.b<cna> a() {
      return bwh.a(b, a);
   }

   public static bwh<cna> d(bwh<cna> $$0) {
      a($$0);
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqm.a));
      $$0.b(cqm.b);
      $$0.f();
      return $$0;
   }

   public static void a(cna $$0) {
      if (!$$0.t()) {
         $$0.ec().f();
      } else {
         $$0.ec().a(ImmutableList.of(cqm.k, cqm.b));
      }
   }
}
