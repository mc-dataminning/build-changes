import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bve {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static btt<bsi> a() {
      return bxf.a(
         (Function<bxf.b<bsi>, ? extends App<bxf.c<bsi>, bxi<bsi>>>)($$0 -> $$0.group($$0.b(cbd.i), $$0.c(cbd.m), $$0.a(cbd.n), $$0.a(cbd.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<bsa> $$8 = $$0.b($$1);
                        Optional<bsa> $$9 = $$8.stream().filter($$1xx -> a((bsa)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bsa> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              etp $$11 = ccx.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(in.a($$11))) {
                                 $$2.a(new cbg($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bxg<?, bsa> $$0, bxg<?, bvg> $$1, bxg<?, cbg> $$2, bsa $$3) {
      $$0.a($$3);
      $$1.a(new bud($$3, true));
      $$2.a(new cbg(new bud($$3, false), 0.6F, 1));
   }

   private static Optional<bsa> a(List<bsa> $$0) {
      Map<bsa, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bsa, Integer> b(List<bsa> $$0) {
      Map<bsa, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bve::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bsa a(bsa $$0) {
      return $$0.dQ().c(cbd.q).get();
   }

   private static boolean b(bsa $$0) {
      return $$0.dQ().c(cbd.q).isPresent();
   }

   private static boolean a(bsa $$0, bsa $$1) {
      return $$1.dQ().c(cbd.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
