import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bww {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bvl<bua> a() {
      return byx.a(
         (Function<byx.b<bua>, ? extends App<byx.c<bua>, bza<bua>>>)($$0 -> $$0.group($$0.b(ccv.i), $$0.c(ccv.m), $$0.a(ccv.n), $$0.a(ccv.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<btr> $$8 = $$0.b($$1);
                        Optional<btr> $$9 = $$8.stream().filter($$1xx -> a((btr)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<btr> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              evt $$11 = cep.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(iz.a($$11))) {
                                 $$2.a(new ccy($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(byy<?, btr> $$0, byy<?, bwy> $$1, byy<?, ccy> $$2, btr $$3) {
      $$0.a($$3);
      $$1.a(new bvv($$3, true));
      $$2.a(new ccy(new bvv($$3, false), 0.6F, 1));
   }

   private static Optional<btr> a(List<btr> $$0) {
      Map<btr, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<btr, Integer> b(List<btr> $$0) {
      Map<btr, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bww::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static btr a(btr $$0) {
      return $$0.dS().c(ccv.q).get();
   }

   private static boolean b(btr $$0) {
      return $$0.dS().c(ccv.q).isPresent();
   }

   private static boolean a(btr $$0, btr $$1) {
      return $$1.dS().c(ccv.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
