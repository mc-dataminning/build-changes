import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cis extends chp {
   protected static final Map<csv, Pair<Predicate<clp>, Consumer<clp>>> a = Maps.newHashMap(
      ImmutableMap.of(
         csw.i,
         Pair.of(cis::b, b(csw.cC.n())),
         csw.kE,
         Pair.of(cis::b, b(csw.cC.n())),
         csw.j,
         Pair.of(cis::b, b(csw.cC.n())),
         csw.k,
         Pair.of(cis::b, b(csw.j.n())),
         csw.rG,
         Pair.of((Predicate<clp>)$$0 -> true, a(csw.j.n(), cji.ds))
      )
   );

   protected cis(cks $$0, int $$1, float $$2, cja.a $$3) {
      super((float)$$1, $$2, $$0, apt.bA, $$3);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      Pair<Predicate<clp>, Consumer<clp>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bgy.d;
      } else {
         Predicate<clp> $$4 = (Predicate<clp>)$$3.getFirst();
         Consumer<clp> $$5 = (Consumer<clp>)$$3.getSecond();
         if ($$4.test($$0)) {
            cbu $$6 = $$0.o();
            $$1.a($$6, $$2, ape.kL, apf.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bgy.a($$1.B);
         } else {
            return bgy.d;
         }
      }
   }

   public static Consumer<clp> b(dfj $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(djt.c, $$1.a(), djt.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<clp> a(dfj $$0, cpu $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(djt.c, $$2.a(), djt.a.a($$2.o(), $$0));
         csv.a($$2.q(), $$2.a(), $$2.k(), new cjf($$1));
      };
   }

   public static boolean b(clp $$0) {
      return $$0.k() != hc.a && $$0.q().a_($$0.a().c()).i();
   }
}
