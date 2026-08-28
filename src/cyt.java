import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cyt extends cyz {
   protected static final Map<dmf, Pair<Predicate<dcy>, Consumer<dcy>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dmh.i,
         Pair.of(cyt::b, a(dmh.cN.m())),
         dmh.lk,
         Pair.of(cyt::b, a(dmh.cN.m())),
         dmh.j,
         Pair.of(cyt::b, a(dmh.cN.m())),
         dmh.k,
         Pair.of(cyt::b, a(dmh.j.m())),
         dmh.tr,
         Pair.of((Predicate<dcy>)$$0 -> true, a(dmh.j.m(), czh.eg))
      )
   );

   public cyt(dar $$0, float $$1, float $$2, cyz.a $$3) {
      super($$3.c($$0, $$1, $$2));
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      iu $$2 = $$0.a();
      Pair<Predicate<dcy>, Consumer<dcy>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bud.e;
      } else {
         Predicate<dcy> $$4 = (Predicate<dcy>)$$3.getFirst();
         Consumer<dcy> $$5 = (Consumer<dcy>)$$3.getSecond();
         if ($$4.test($$0)) {
            crc $$6 = $$0.o();
            $$1.a($$6, $$2, awn.mP, awo.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bxe.d($$0.p()));
               }
            }

            return bud.a;
         } else {
            return bud.e;
         }
      }
   }

   public static Consumer<dcy> a(eah $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(efh.c, $$1.a(), efh.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<dcy> a(eah $$0, diz $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(efh.c, $$2.a(), efh.a.a($$2.o(), $$0));
         dmf.a($$2.q(), $$2.a(), $$2.k(), new czd($$1));
      };
   }

   public static boolean b(dcy $$0) {
      return $$0.k() != ja.a && $$0.q().a_($$0.a().d()).l();
   }
}
