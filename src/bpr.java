import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bpr {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bog<bmx> a() {
      return brs.a(
         (Function<brs.b<bmx>, ? extends App<brs.c<bmx>, brv<bmx>>>)($$0 -> $$0.group($$0.b(bvq.i), $$0.c(bvq.m), $$0.a(bvq.n), $$0.a(bvq.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.F_().a(10) != 0) {
                        return false;
                     } else {
                        List<bmo> $$8 = $$0.b($$1);
                        Optional<bmo> $$9 = $$8.stream().filter($$1xx -> a((bmo)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bmo> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              emc $$11 = bxk.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(hx.a($$11))) {
                                 $$2.a(new bvt($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(brt<?, bmo> $$0, brt<?, bpt> $$1, brt<?, bvt> $$2, bmo $$3) {
      $$0.a($$3);
      $$1.a(new boq($$3, true));
      $$2.a(new bvt(new boq($$3, false), 0.6F, 1));
   }

   private static Optional<bmo> a(List<bmo> $$0) {
      Map<bmo, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bmo, Integer> b(List<bmo> $$0) {
      Map<bmo, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bpr::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bmo a(bmo $$0) {
      return $$0.dN().c(bvq.q).get();
   }

   private static boolean b(bmo $$0) {
      return $$0.dN().c(bvq.q).isPresent();
   }

   private static boolean a(bmo $$0, bmo $$1) {
      return $$1.dN().c(bvq.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
