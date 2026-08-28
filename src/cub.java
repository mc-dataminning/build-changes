import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cub extends ctc {
   protected static final Map<dex, Pair<Predicate<cya>, Consumer<cya>>> a = Maps.newHashMap(
      ImmutableMap.of(
         dez.i,
         Pair.of(cub::b, a(dez.cC.o())),
         dez.kE,
         Pair.of(cub::b, a(dez.cC.o())),
         dez.j,
         Pair.of(cub::b, a(dez.cC.o())),
         dez.k,
         Pair.of(cub::b, a(dez.j.o())),
         dez.sH,
         Pair.of((Predicate<cya>)$$0 -> true, a(dez.j.o(), cuq.dO))
      )
   );

   public cub(cwc $$0, cui.a $$1) {
      super($$0, awo.bB, $$1);
   }

   @Override
   public bqs a(cya $$0) {
      dbw $$1 = $$0.q();
      iz $$2 = $$0.a();
      Pair<Predicate<cya>, Consumer<cya>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return bqs.e;
      } else {
         Predicate<cya> $$4 = (Predicate<cya>)$$3.getFirst();
         Consumer<cya> $$5 = (Consumer<cya>)$$3.getSecond();
         if ($$4.test($$0)) {
            cmv $$6 = $$0.o();
            $$1.a($$6, $$2, avz.mn, awa.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, btn.d($$0.p()));
               }
            }

            return bqs.a($$1.B);
         } else {
            return bqs.e;
         }
      }
   }

   public static Consumer<cya> a(dsa $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dwt.c, $$1.a(), dwt.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cya> a(dsa $$0, dbv $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dwt.c, $$2.a(), dwt.a.a($$2.o(), $$0));
         dex.a($$2.q(), $$2.a(), $$2.k(), new cun($$1));
      };
   }

   public static boolean b(cya $$0) {
      return $$0.k() != je.a && $$0.q().a_($$0.a().c()).i();
   }
}
