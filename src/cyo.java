import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cyo extends cyu {
   protected static final Map<dma, Pair<Predicate<dct>, Consumer<dct>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dmc.i,
         Pair.of(cyo::b, a(dmc.cL.m())),
         dmc.lh,
         Pair.of(cyo::b, a(dmc.cL.m())),
         dmc.j,
         Pair.of(cyo::b, a(dmc.cL.m())),
         dmc.k,
         Pair.of(cyo::b, a(dmc.j.m())),
         dmc.to,
         Pair.of((Predicate<dct>)$$0 -> true, a(dmc.j.m(), czc.ee))
      )
   );

   public cyo(dam $$0, float $$1, float $$2, cyu.a $$3) {
      super($$3.c($$0, $$1, $$2));
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      iu $$2 = $$0.a();
      Pair<Predicate<dct>, Consumer<dct>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bub.e;
      } else {
         Predicate<dct> $$4 = (Predicate<dct>)$$3.getFirst();
         Consumer<dct> $$5 = (Consumer<dct>)$$3.getSecond();
         if ($$4.test($$0)) {
            cqy $$6 = $$0.o();
            $$1.a($$6, $$2, awn.mM, awo.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bxc.d($$0.p()));
               }
            }

            return bub.a;
         } else {
            return bub.e;
         }
      }
   }

   public static Consumer<dct> a(dzz $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(eez.c, $$1.a(), eez.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<dct> a(dzz $$0, diu $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(eez.c, $$2.a(), eez.a.a($$2.o(), $$0));
         dma.a($$2.q(), $$2.a(), $$2.k(), new cyy($$1));
      };
   }

   public static boolean b(dct $$0) {
      return $$0.k() != ja.a && $$0.q().a_($$0.a().d()).l();
   }
}
