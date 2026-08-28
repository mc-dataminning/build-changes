import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cue extends ctf {
   protected static final Map<dfa, Pair<Predicate<cyd>, Consumer<cyd>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dfc.i,
         Pair.of(cue::b, a(dfc.cC.o())),
         dfc.kE,
         Pair.of(cue::b, a(dfc.cC.o())),
         dfc.j,
         Pair.of(cue::b, a(dfc.cC.o())),
         dfc.k,
         Pair.of(cue::b, a(dfc.j.o())),
         dfc.sH,
         Pair.of((Predicate<cyd>)$$0 -> true, a(dfc.j.o(), cut.dO))
      )
   );

   public cue(cwf $$0, cul.a $$1) {
      super($$0, awp.bB, $$1);
   }

   @Override
   public bqv a(cyd $$0) {
      dbz $$1 = $$0.q();
      iz $$2 = $$0.a();
      Pair<Predicate<cyd>, Consumer<cyd>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bqv.e;
      } else {
         Predicate<cyd> $$4 = (Predicate<cyd>)$$3.getFirst();
         Consumer<cyd> $$5 = (Consumer<cyd>)$$3.getSecond();
         if ($$4.test($$0)) {
            cmy $$6 = $$0.o();
            $$1.a($$6, $$2, awa.mn, awb.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, btq.d($$0.p()));
               }
            }

            return bqv.a($$1.B);
         } else {
            return bqv.e;
         }
      }
   }

   public static Consumer<cyd> a(dsd $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dww.c, $$1.a(), dww.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cyd> a(dsd $$0, dby $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dww.c, $$2.a(), dww.a.a($$2.o(), $$0));
         dfa.a($$2.q(), $$2.a(), $$2.k(), new cuq($$1));
      };
   }

   public static boolean b(cyd $$0) {
      return $$0.k() != je.a && $$0.q().a_($$0.a().c()).i();
   }
}
