import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cty extends csz {
   protected static final Map<deu, Pair<Predicate<cxx>, Consumer<cxx>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dew.i,
         Pair.of(cty::b, a(dew.cC.n())),
         dew.kE,
         Pair.of(cty::b, a(dew.cC.n())),
         dew.j,
         Pair.of(cty::b, a(dew.cC.n())),
         dew.k,
         Pair.of(cty::b, a(dew.j.n())),
         dew.sH,
         Pair.of((Predicate<cxx>)$$0 -> true, a(dew.j.n(), cun.dO))
      )
   );

   public cty(cvz $$0, cuf.a $$1) {
      super($$0, awl.bB, $$1);
   }

   @Override
   public bqp a(cxx $$0) {
      dbt $$1 = $$0.q();
      iz $$2 = $$0.a();
      Pair<Predicate<cxx>, Consumer<cxx>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bqp.e;
      } else {
         Predicate<cxx> $$4 = (Predicate<cxx>)$$3.getFirst();
         Consumer<cxx> $$5 = (Consumer<cxx>)$$3.getSecond();
         if ($$4.test($$0)) {
            cms $$6 = $$0.o();
            $$1.a($$6, $$2, avw.mn, avx.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, btk.d($$0.p()));
               }
            }

            return bqp.a($$1.B);
         } else {
            return bqp.e;
         }
      }
   }

   public static Consumer<cxx> a(drx $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dwq.c, $$1.a(), dwq.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cxx> a(drx $$0, dbs $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dwq.c, $$2.a(), dwq.a.a($$2.o(), $$0));
         deu.a($$2.q(), $$2.a(), $$2.k(), new cuk($$1));
      };
   }

   public static boolean b(cxx $$0) {
      return $$0.k() != je.a && $$0.q().a_($$0.a().c()).i();
   }
}
