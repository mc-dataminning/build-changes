import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cil extends chi {
   protected static final Map<csm, Pair<Predicate<cli>, Consumer<cli>>> a = Maps.newHashMap(
      ImmutableMap.of(
         csn.i,
         Pair.of(cil::b, b(csn.cC.n())),
         csn.kE,
         Pair.of(cil::b, b(csn.cC.n())),
         csn.j,
         Pair.of(cil::b, b(csn.cC.n())),
         csn.k,
         Pair.of(cil::b, b(csn.j.n())),
         csn.rG,
         Pair.of((Predicate<cli>)$$0 -> true, a(csn.j.n(), cjb.ds))
      )
   );

   protected cil(ckl $$0, int $$1, float $$2, cit.a $$3) {
      super((float)$$1, $$2, $$0, apl.bA, $$3);
   }

   @Override
   public bgq a(cli $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      Pair<Predicate<cli>, Consumer<cli>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bgq.d;
      } else {
         Predicate<cli> $$4 = (Predicate<cli>)$$3.getFirst();
         Consumer<cli> $$5 = (Consumer<cli>)$$3.getSecond();
         if ($$4.test($$0)) {
            cbn $$6 = $$0.o();
            $$1.a($$6, $$2, aow.kL, aox.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bgq.a($$1.B);
         } else {
            return bgq.d;
         }
      }
   }

   public static Consumer<cli> b(dfa $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(djk.c, $$1.a(), djk.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cli> a(dfa $$0, cpl $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(djk.c, $$2.a(), djk.a.a($$2.o(), $$0));
         csm.a($$2.q(), $$2.a(), $$2.k(), new ciy($$1));
      };
   }

   public static boolean b(cli $$0) {
      return $$0.k() != ha.a && $$0.q().a_($$0.a().c()).i();
   }
}
