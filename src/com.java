import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class com extends cnj {
   protected static final Map<cyo, Pair<Predicate<cri>, Consumer<cri>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cyq.i,
         Pair.of(com::b, b(cyq.cC.o())),
         cyq.kE,
         Pair.of(com::b, b(cyq.cC.o())),
         cyq.j,
         Pair.of(com::b, b(cyq.cC.o())),
         cyq.k,
         Pair.of(com::b, b(cyq.j.o())),
         cyq.sH,
         Pair.of((Predicate<cri>)$$0 -> true, a(cyq.j.o(), cpc.dN))
      )
   );

   protected com(cqm $$0, int $$1, float $$2, cou.a $$3) {
      super((float)$$1, $$2, $$0, atz.bA, $$3);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      hz $$2 = $$0.a();
      Pair<Predicate<cri>, Consumer<cri>> $$3 = a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return blu.d;
      } else {
         Predicate<cri> $$4 = (Predicate<cri>)$$3.getFirst();
         Consumer<cri> $$5 = (Consumer<cri>)$$3.getSecond();
         if ($$4.test($$0)) {
            chh $$6 = $$0.o();
            $$1.a($$6, $$2, atk.lO, atl.e, 1.0F, 1.0F);
            if (!$$1.B) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, bog.d($$0.p()));
               }
            }

            return blu.a($$1.B);
         } else {
            return blu.d;
         }
      }
   }

   public static Consumer<cri> b(dlf $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(dpp.c, $$1.a(), dpp.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<cri> a(dlf $$0, cvm $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(dpp.c, $$2.a(), dpp.a.a($$2.o(), $$0));
         cyo.a($$2.q(), $$2.a(), $$2.k(), new coz($$1));
      };
   }

   public static boolean b(cri $$0) {
      return $$0.k() != ie.a && $$0.q().a_($$0.a().c()).i();
   }
}
