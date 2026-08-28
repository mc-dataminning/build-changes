import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cto extends csp {
   protected static final Map<dff, Pair<Predicate<cxm>, Consumer<cxm>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dfh.i,
         Pair.of(cto::b, a(dfh.cC.o())),
         dfh.kE,
         Pair.of(cto::b, a(dfh.cC.o())),
         dfh.j,
         Pair.of(cto::b, a(dfh.cC.o())),
         dfh.k,
         Pair.of(cto::b, a(dfh.j.o())),
         dfh.sH,
         Pair.of((Predicate<cxm>)$$0 -> true, a(dfh.j.o(), cud.dO))
      )
   );

   public cto(cvp $$0, ctv.a $$1) {
      super($$0, avu.bB, $$1);
   }

   @Override
   public bqd a(cxm $$0) {
      dcd $$1 = $$0.q();
      ja $$2 = $$0.a();
      Pair<Predicate<cxm>, Consumer<cxm>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bqd.e;
      } else {
         Predicate<cxm> $$4 = (Predicate<cxm>)$$3.getFirst();
         Consumer<cxm> $$5 = (Consumer<cxm>)$$3.getSecond();
         if ($$4.test($$0)) {
            cmh $$6 = $$0.o();
            $$1.a($$6, $$2, avf.mn, avg.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bsy.d($$0.p()));
               }
            }

            return bqd.a($$1.B);
         } else {
            return bqd.e;
         }
      }
   }

   public static Consumer<cxm> a(dsh $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dxa.c, $$1.a(), dxa.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cxm> a(dsh $$0, dcc $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dxa.c, $$2.a(), dxa.a.a($$2.o(), $$0));
         dff.a($$2.q(), $$2.a(), $$2.k(), new cua($$1));
      };
   }

   public static boolean b(cxm $$0) {
      return $$0.k() != jf.a && $$0.q().a_($$0.a().c()).i();
   }
}
