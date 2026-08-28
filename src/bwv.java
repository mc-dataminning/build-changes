import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bwv {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bvk<btz> a() {
      return byw.a(
         (Function<byw.b<btz>, ? extends App<byw.c<btz>, byz<btz>>>)($$0 -> $$0.group($$0.b(ccu.i), $$0.c(ccu.m), $$0.a(ccu.n), $$0.a(ccu.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<btq> $$8 = $$0.b($$1);
                        Optional<btq> $$9 = $$8.stream().filter($$1xx -> a((btq)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<btq> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              evs $$11 = ceo.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(iz.a($$11))) {
                                 $$2.a(new ccx($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(byx<?, btq> $$0, byx<?, bwx> $$1, byx<?, ccx> $$2, btq $$3) {
      $$0.a($$3);
      $$1.a(new bvu($$3, true));
      $$2.a(new ccx(new bvu($$3, false), 0.6F, 1));
   }

   private static Optional<btq> a(List<btq> $$0) {
      Map<btq, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<btq, Integer> b(List<btq> $$0) {
      Map<btq, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bwv::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static btq a(btq $$0) {
      return $$0.dS().c(ccu.q).get();
   }

   private static boolean b(btq $$0) {
      return $$0.dS().c(ccu.q).isPresent();
   }

   private static boolean a(btq $$0, btq $$1) {
      return $$1.dS().c(ccu.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
