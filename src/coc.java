import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class coc {
   protected static final ImmutableList<? extends cgr<? extends cgq<? super cob>>> a = ImmutableList.of(cgr.c, cgr.d);
   protected static final ImmutableList<? extends cfk<?>> b = ImmutableList.of(cfk.g, cfk.h, cfk.k, cfk.l, cfk.n, cfk.m, cfk.E, cfk.t, cfk.o, cfk.p);

   static void a(bxi<cob> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new cat<cob>(0.8F) {
         protected boolean a(ash $$0, cob $$1) {
            return $$1.p() && super.a($$0, (bwg)$$1);
         }
      }, new bzf(45, 90), new bzj()));
   }

   static void b(bxi<cob> $$0) {
      $$0.a(
         cro.b,
         10,
         ImmutableList.of(
            cal.a(($$0x, $$1) -> $$1.x(), ($$0x, $$1) -> $$1.ec().c(cfk.l)),
            bzz.a(8.0F, bsu.a(30, 60)),
            new bzw(ImmutableList.of(Pair.of(bzr.a(0.2F), 2), Pair.of(cag.a(0.2F, 3), 2), Pair.of(new byj(30, 60), 1)))
         )
      );
   }

   static void c(bxi<cob> $$0) {
      $$0.a(cro.k, 10, ImmutableList.of(cae.a(1.0F), bzg.a(cob::p, 40), cao.a()), cfk.o);
   }

   public static bxi.b<cob> a() {
      return bxi.a(b, a);
   }

   public static bxi<cob> d(bxi<cob> $$0) {
      a($$0);
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cro.a));
      $$0.b(cro.b);
      $$0.f();
      return $$0;
   }

   public static void a(cob $$0) {
      if (!$$0.p()) {
         $$0.ec().f();
      } else {
         $$0.ec().a(ImmutableList.of(cro.k, cro.b));
      }
   }
}
