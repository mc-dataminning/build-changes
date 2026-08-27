import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ciy extends chv {
   protected static final Map<ctc, Pair<Predicate<clv>, Consumer<clv>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cte.i,
         Pair.of(ciy::b, b(cte.cC.o())),
         cte.kE,
         Pair.of(ciy::b, b(cte.cC.o())),
         cte.j,
         Pair.of(ciy::b, b(cte.cC.o())),
         cte.k,
         Pair.of(ciy::b, b(cte.j.o())),
         cte.rG,
         Pair.of((Predicate<clv>)$$0 -> true, a(cte.j.o(), cjo.ds))
      )
   );

   protected ciy(cky $$0, int $$1, float $$2, cjg.a $$3) {
      super((float)$$1, $$2, $$0, apv.bA, $$3);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      Pair<Predicate<clv>, Consumer<clv>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bhe.d;
      } else {
         Predicate<clv> $$4 = (Predicate<clv>)$$3.getFirst();
         Consumer<clv> $$5 = (Consumer<clv>)$$3.getSecond();
         if ($$4.test($$0)) {
            cca $$6 = $$0.o();
            $$1.a($$6, $$2, apg.kL, aph.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bhe.a($$1.B);
         } else {
            return bhe.d;
         }
      }
   }

   public static Consumer<clv> b(dfd $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(djn.c, $$1.a(), djn.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<clv> a(dfd $$0, cqa $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(djn.c, $$2.a(), djn.a.a($$2.o(), $$0));
         ctc.a($$2.q(), $$2.a(), $$2.k(), new cjl($$1));
      };
   }

   public static boolean b(clv $$0) {
      return $$0.k() != ha.a && $$0.q().a_($$0.a().c()).i();
   }
}
