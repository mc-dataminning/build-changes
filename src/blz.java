import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class blz {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bkp<bjf> a() {
      return boa.a(
         (Function<boa.b<bjf>, ? extends App<boa.c<bjf>, bod<bjf>>>)($$0 -> $$0.group($$0.b(bry.i), $$0.c(bry.m), $$0.a(bry.n), $$0.a(bry.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.y_().a(10) != 0) {
                        return false;
                     } else {
                        List<biw> $$8 = $$0.b($$1);
                        Optional<biw> $$9 = $$8.stream().filter($$1xx -> a((biw)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<biw> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              ehf $$11 = btq.a($$6, 20, 8);
                              if ($$11 != null && $$5.b(gv.a($$11))) {
                                 $$2.a(new bsb($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bob<?, biw> $$0, bob<?, bmb> $$1, bob<?, bsb> $$2, biw $$3) {
      $$0.a($$3);
      $$1.a(new bkz($$3, true));
      $$2.a(new bsb(new bkz($$3, false), 0.6F, 1));
   }

   private static Optional<biw> a(List<biw> $$0) {
      Map<biw, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<biw, Integer> b(List<biw> $$0) {
      Map<biw, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(blz::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static biw a(biw $$0) {
      return $$0.dM().c(bry.q).get();
   }

   private static boolean b(biw $$0) {
      return $$0.dM().c(bry.q).isPresent();
   }

   private static boolean a(biw $$0, biw $$1) {
      return $$1.dM().c(bry.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
