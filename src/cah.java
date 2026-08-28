import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class cah {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static byw<bxm> a() {
      return cci.a(
         (Function<cci.b<bxm>, ? extends App<cci.c<bxm>, ccl<bxm>>>)($$0 -> $$0.group($$0.b(cgg.i), $$0.c(cgg.n), $$0.a(cgg.o), $$0.a(cgg.r))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.C_().a(10) != 0) {
                        return false;
                     } else {
                        List<bxe> $$8 = $$0.b($$1);
                        Optional<bxe> $$9 = $$8.stream().filter($$1xx -> a((bxe)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bxe> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              feq $$11 = cia.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(iu.a((jo)$$11))) {
                                 $$2.a(new cgj($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(ccj<?, bxe> $$0, ccj<?, caj> $$1, ccj<?, cgj> $$2, bxe $$3) {
      $$0.a($$3);
      $$1.a(new bzg($$3, true));
      $$2.a(new cgj(new bzg($$3, false), 0.6F, 1));
   }

   private static Optional<bxe> a(List<bxe> $$0) {
      Map<bxe, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bxe, Integer> b(List<bxe> $$0) {
      Map<bxe, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(cah::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bxe a(bxe $$0) {
      return $$0.ec().c(cgg.r).get();
   }

   private static boolean b(bxe $$0) {
      return $$0.ec().c(cgg.r).isPresent();
   }

   private static boolean a(bxe $$0, bxe $$1) {
      return $$1.ec().c(cgg.r).filter($$1x -> $$1x == $$0).isPresent();
   }
}
