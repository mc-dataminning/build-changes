import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cij extends chg {
   protected static final Map<csk, Pair<Predicate<clg>, Consumer<clg>>> a = Maps.newHashMap(
      ImmutableMap.of(
         csl.i,
         Pair.of(cij::b, b(csl.cC.n())),
         csl.kE,
         Pair.of(cij::b, b(csl.cC.n())),
         csl.j,
         Pair.of(cij::b, b(csl.cC.n())),
         csl.k,
         Pair.of(cij::b, b(csl.j.n())),
         csl.rG,
         Pair.of((Predicate<clg>)$$0 -> true, a(csl.j.n(), ciz.ds))
      )
   );

   protected cij(ckj $$0, int $$1, float $$2, cir.a $$3) {
      super((float)$$1, $$2, $$0, apj.bA, $$3);
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      gv $$2 = $$0.a();
      Pair<Predicate<clg>, Consumer<clg>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bgo.d;
      } else {
         Predicate<clg> $$4 = (Predicate<clg>)$$3.getFirst();
         Consumer<clg> $$5 = (Consumer<clg>)$$3.getSecond();
         if ($$4.test($$0)) {
            cbl $$6 = $$0.o();
            $$1.a($$6, $$2, aou.kL, aov.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return bgo.a($$1.B);
         } else {
            return bgo.d;
         }
      }
   }

   public static Consumer<clg> b(dey $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dji.c, $$1.a(), dji.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<clg> a(dey $$0, cpj $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dji.c, $$2.a(), dji.a.a($$2.o(), $$0));
         csk.a($$2.q(), $$2.a(), $$2.k(), new ciw($$1));
      };
   }

   public static boolean b(clg $$0) {
      return $$0.k() != hb.a && $$0.q().a_($$0.a().c()).i();
   }
}
