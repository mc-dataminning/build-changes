import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cne {
   protected static final ImmutableList<? extends cft<? extends cfs<? super cnd>>> a = ImmutableList.of(cft.c, cft.d);
   protected static final ImmutableList<? extends cem<?>> b = ImmutableList.of(cem.g, cem.h, cem.k, cem.l, cem.n, cem.m, cem.E, cem.t, cem.o, cem.p);

   static void a(bwk<cnd> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new bzv<cnd>(0.8F) {
         protected boolean a(ard $$0, cnd $$1) {
            return $$1.t() && super.a($$0, (bvi)$$1);
         }
      }, new byh(45, 90), new byl()));
   }

   static void b(bwk<cnd> $$0) {
      $$0.a(
         cqp.b,
         10,
         ImmutableList.of(
            bzn.a(($$0x, $$1) -> $$1.gC(), ($$0x, $$1) -> $$1.eb().c(cem.l)),
            bzb.a(8.0F, brw.a(30, 60)),
            new byy(ImmutableList.of(Pair.of(byt.a(0.3F), 2), Pair.of(bzi.a(0.3F, 3), 2), Pair.of(new bxl(30, 60), 1)))
         )
      );
   }

   static void c(bwk<cnd> $$0) {
      $$0.a(cqp.k, 10, ImmutableList.of(bzg.a(1.0F), byi.a(cnd::t, 40), bzq.a()), cem.o);
   }

   public static bwk.b<cnd> a() {
      return bwk.a(b, a);
   }

   public static bwk<cnd> d(bwk<cnd> $$0) {
      a($$0);
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqp.a));
      $$0.b(cqp.b);
      $$0.f();
      return $$0;
   }

   public static void a(cnd $$0) {
      if (!$$0.t()) {
         $$0.eb().f();
      } else {
         $$0.eb().a(ImmutableList.of(cqp.k, cqp.b));
      }
   }
}
