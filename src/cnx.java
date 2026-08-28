import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cnx {
   protected static final ImmutableList<? extends cgj<? extends cgi<? super cnw>>> a = ImmutableList.of(cgj.c, cgj.d);
   protected static final ImmutableList<? extends cfc<?>> b = ImmutableList.of(cfc.g, cfc.h, cfc.k, cfc.l, cfc.n, cfc.m, cfc.E, cfc.t, cfc.o, cfc.p);

   static void a(bxa<cnw> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new cal<cnw>(0.8F) {
         protected boolean a(ard $$0, cnw $$1) {
            return $$1.n() && super.a($$0, (bvy)$$1);
         }
      }, new byx(45, 90), new bzb()));
   }

   static void b(bxa<cnw> $$0) {
      $$0.a(
         cri.b,
         10,
         ImmutableList.of(
            cad.a(($$0x, $$1) -> $$1.gA(), ($$0x, $$1) -> $$1.ea().c(cfc.l)),
            bzr.a(8.0F, bsj.a(30, 60)),
            new bzo(ImmutableList.of(Pair.of(bzj.a(0.3F), 2), Pair.of(bzy.a(0.3F, 3), 2), Pair.of(new byb(30, 60), 1)))
         )
      );
   }

   static void c(bxa<cnw> $$0) {
      $$0.a(cri.k, 10, ImmutableList.of(bzw.a(1.0F), byy.a(cnw::n, 40), cag.a()), cfc.o);
   }

   public static bxa.b<cnw> a() {
      return bxa.a(b, a);
   }

   public static bxa<cnw> d(bxa<cnw> $$0) {
      a($$0);
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cri.a));
      $$0.b(cri.b);
      $$0.f();
      return $$0;
   }

   public static void a(cnw $$0) {
      if (!$$0.n()) {
         $$0.ea().f();
      } else {
         $$0.ea().a(ImmutableList.of(cri.k, cri.b));
      }
   }
}
