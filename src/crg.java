import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class crg extends cqh {
   protected static final Map<dch, Pair<Predicate<cuz>, Consumer<cuz>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dcj.i,
         Pair.of(crg::b, b(dcj.cC.n())),
         dcj.kE,
         Pair.of(crg::b, b(dcj.cC.n())),
         dcj.j,
         Pair.of(crg::b, b(dcj.cC.n())),
         dcj.k,
         Pair.of(crg::b, b(dcj.j.n())),
         dcj.sH,
         Pair.of((Predicate<cuz>)$$0 -> true, a(dcj.j.n(), crv.dN))
      )
   );

   public crg(cte $$0, crn.a $$1) {
      super($$0, ave.bB, $$1);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      Pair<Predicate<cuz>, Consumer<cuz>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bof.d;
      } else {
         Predicate<cuz> $$4 = (Predicate<cuz>)$$3.getFirst();
         Consumer<cuz> $$5 = (Consumer<cuz>)$$3.getSecond();
         if ($$4.test($$0)) {
            cka $$6 = $$0.o();
            $$1.a($$6, $$2, auo.lY, aup.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bqt.d($$0.p()));
               }
            }

            return bof.a($$1.B);
         } else {
            return bof.d;
         }
      }
   }

   public static Consumer<cuz> b(dpi $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dub.c, $$1.a(), dub.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cuz> a(dpi $$0, czf $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dub.c, $$2.a(), dub.a.a($$2.o(), $$0));
         dch.a($$2.q(), $$2.a(), $$2.k(), new crs($$1));
      };
   }

   public static boolean b(cuz $$0) {
      return $$0.k() != ij.a && $$0.q().a_($$0.a().c()).i();
   }
}
