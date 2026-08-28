import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cve extends cuf {
   protected static final Map<dhj, Pair<Predicate<czm>, Consumer<czm>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dhl.i,
         Pair.of(cve::b, a(dhl.cC.o())),
         dhl.kE,
         Pair.of(cve::b, a(dhl.cC.o())),
         dhl.j,
         Pair.of(cve::b, a(dhl.cC.o())),
         dhl.k,
         Pair.of(cve::b, a(dhl.j.o())),
         dhl.sH,
         Pair.of((Predicate<czm>)$$0 -> true, a(dhl.j.o(), cvt.dO))
      )
   );

   public cve(cxg $$0, float $$1, float $$2, cvk.a $$3) {
      super($$0, awt.bC, $$1, $$2, $$3);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      je $$2 = $$0.a();
      Pair<Predicate<czm>, Consumer<czm>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return brp.e;
      } else {
         Predicate<czm> $$4 = (Predicate<czm>)$$3.getFirst();
         Consumer<czm> $$5 = (Consumer<czm>)$$3.getSecond();
         if ($$4.test($$0)) {
            cnu $$6 = $$0.o();
            $$1.a($$6, $$2, awe.mo, awf.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, buk.d($$0.p()));
               }
            }

            return brp.a;
         } else {
            return brp.e;
         }
      }
   }

   public static Consumer<czm> a(duo $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dzl.c, $$1.a(), dzl.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<czm> a(duo $$0, def $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dzl.c, $$2.a(), dzl.a.a($$2.o(), $$0));
         dhj.a($$2.q(), $$2.a(), $$2.k(), new cvp($$1));
      };
   }

   public static boolean b(czm $$0) {
      return $$0.k() != jj.a && $$0.q().a_($$0.a().d()).l();
   }
}
