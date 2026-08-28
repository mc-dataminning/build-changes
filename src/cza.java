import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cza extends czg {
   protected static final Map<dmm, Pair<Predicate<ddf>, Consumer<ddf>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dmo.i,
         Pair.of(cza::b, a(dmo.cN.m())),
         dmo.lk,
         Pair.of(cza::b, a(dmo.cN.m())),
         dmo.j,
         Pair.of(cza::b, a(dmo.cN.m())),
         dmo.k,
         Pair.of(cza::b, a(dmo.j.m())),
         dmo.tr,
         Pair.of((Predicate<ddf>)$$0 -> true, a(dmo.j.m(), czo.eg))
      )
   );

   public cza(day $$0, float $$1, float $$2, czg.a $$3) {
      super($$3.c($$0, $$1, $$2));
   }

   @Override
   public bug a(ddf $$0) {
      djh $$1 = $$0.q();
      iv $$2 = $$0.a();
      Pair<Predicate<ddf>, Consumer<ddf>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bug.e;
      } else {
         Predicate<ddf> $$4 = (Predicate<ddf>)$$3.getFirst();
         Consumer<ddf> $$5 = (Consumer<ddf>)$$3.getSecond();
         if ($$4.test($$0)) {
            crj $$6 = $$0.o();
            $$1.a($$6, $$2, awn.mP, awo.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bxj.d($$0.p()));
               }
            }

            return bug.a;
         } else {
            return bug.e;
         }
      }
   }

   public static Consumer<ddf> a(eao $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(efo.c, $$1.a(), efo.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<ddf> a(eao $$0, djg $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(efo.c, $$2.a(), efo.a.a($$2.o(), $$0));
         dmm.a($$2.q(), $$2.a(), $$2.k(), new czk($$1));
      };
   }

   public static boolean b(ddf $$0) {
      return $$0.k() != jb.a && $$0.q().a_($$0.a().d()).l();
   }
}
