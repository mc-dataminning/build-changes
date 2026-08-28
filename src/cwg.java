import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cwg extends cvj {
   protected static final Map<djn, Pair<Predicate<daj>, Consumer<daj>>> a = Maps.newHashMap(
      ImmutableMap.of(
         djp.i,
         Pair.of(cwg::b, a(djp.cK.m())),
         djp.lg,
         Pair.of(cwg::b, a(djp.cK.m())),
         djp.j,
         Pair.of(cwg::b, a(djp.cK.m())),
         djp.k,
         Pair.of(cwg::b, a(djp.j.m())),
         djp.tj,
         Pair.of((Predicate<daj>)$$0 -> true, a(djp.j.m(), cwu.ea))
      )
   );

   public cwg(cyh $$0, float $$1, float $$2, cwm.a $$3) {
      super($$0, awp.bD, $$1, $$2, $$3);
   }

   @Override
   public bsl a(daj $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      Pair<Predicate<daj>, Consumer<daj>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bsl.e;
      } else {
         Predicate<daj> $$4 = (Predicate<daj>)$$3.getFirst();
         Consumer<daj> $$5 = (Consumer<daj>)$$3.getSecond();
         if ($$4.test($$0)) {
            coy $$6 = $$0.o();
            $$1.a($$6, $$2, awa.mL, awb.e, 1.0F, 1.0F);
            if (!$$1.C) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bvi.d($$0.p()));
               }
            }

            return bsl.a;
         } else {
            return bsl.e;
         }
      }
   }

   public static Consumer<daj> a(dwy $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(ebu.c, $$1.a(), ebu.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<daj> a(dwy $$0, dgi $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(ebu.c, $$2.a(), ebu.a.a($$2.o(), $$0));
         djn.a($$2.q(), $$2.a(), $$2.k(), new cwq($$1));
      };
   }

   public static boolean b(daj $$0) {
      return $$0.k() != jn.a && $$0.q().a_($$0.a().d()).l();
   }
}
