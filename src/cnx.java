import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cnx {
   protected static final ImmutableList<? extends cgm<? extends cgl<? super cnw>>> a = ImmutableList.of(cgm.c, cgm.d);
   protected static final ImmutableList<? extends cff<?>> b = ImmutableList.of(cff.g, cff.h, cff.k, cff.l, cff.n, cff.m, cff.E, cff.t, cff.o, cff.p);

   static void a(bxd<cnw> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new cao<cnw>(0.8F) {
         protected boolean a(ash $$0, cnw $$1) {
            return $$1.p() && super.a($$0, (bwb)$$1);
         }
      }, new bza(45, 90), new bze()));
   }

   static void b(bxd<cnw> $$0) {
      $$0.a(
         crj.b,
         10,
         ImmutableList.of(
            cag.a(($$0x, $$1) -> $$1.x() && $$1.p(), ($$0x, $$1) -> $$1.eb().c(cff.l)),
            bzu.a(8.0F, bsp.a(30, 60)),
            new bzr(ImmutableList.of(Pair.of(bzm.a(0.2F), 2), Pair.of(cab.a(0.2F, 3), 2), Pair.of(new bye(30, 60), 1)))
         )
      );
   }

   static void c(bxd<cnw> $$0) {
      $$0.a(crj.k, 10, ImmutableList.of(bzz.a(1.0F), bzb.a(cnw::p, 40), caj.a()), cff.o);
   }

   public static bxd.b<cnw> a() {
      return bxd.a(b, a);
   }

   public static bxd<cnw> d(bxd<cnw> $$0) {
      a($$0);
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crj.a));
      $$0.b(crj.b);
      $$0.f();
      return $$0;
   }

   public static void a(cnw $$0) {
      if (!$$0.p()) {
         $$0.eb().f();
      } else {
         $$0.eb().a(ImmutableList.of(crj.k, crj.b));
      }
   }
}
