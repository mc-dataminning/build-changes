import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bwu {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bvj<bty> a() {
      return byv.a(
         (Function<byv.b<bty>, ? extends App<byv.c<bty>, byy<bty>>>)($$0 -> $$0.group($$0.b(cct.i), $$0.c(cct.m), $$0.a(cct.n), $$0.a(cct.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<btp> $$8 = $$0.b($$1);
                        Optional<btp> $$9 = $$8.stream().filter($$1xx -> a((btp)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<btp> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              evr $$11 = cen.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(iz.a($$11))) {
                                 $$2.a(new ccw($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(byw<?, btp> $$0, byw<?, bww> $$1, byw<?, ccw> $$2, btp $$3) {
      $$0.a($$3);
      $$1.a(new bvt($$3, true));
      $$2.a(new ccw(new bvt($$3, false), 0.6F, 1));
   }

   private static Optional<btp> a(List<btp> $$0) {
      Map<btp, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<btp, Integer> b(List<btp> $$0) {
      Map<btp, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bwu::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static btp a(btp $$0) {
      return $$0.dS().c(cct.q).get();
   }

   private static boolean b(btp $$0) {
      return $$0.dS().c(cct.q).isPresent();
   }

   private static boolean a(btp $$0, btp $$1) {
      return $$1.dS().c(cct.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
