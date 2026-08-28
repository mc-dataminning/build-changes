import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class caz {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bzo<bye> a() {
      return cda.a(
         (Function<cda.b<bye>, ? extends App<cda.c<bye>, cdd<bye>>>)($$0 -> $$0.group($$0.b(cgy.i), $$0.c(cgy.n), $$0.a(cgy.o), $$0.a(cgy.r))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.G_().a(10) != 0) {
                        return false;
                     } else {
                        List<bxw> $$8 = $$0.b($$1);
                        Optional<bxw> $$9 = $$8.stream().filter($$1xx -> a((bxw)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bxw> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              ffs $$11 = cis.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(iw.a((jq)$$11))) {
                                 $$2.a(new chb($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(cdb<?, bxw> $$0, cdb<?, cbb> $$1, cdb<?, chb> $$2, bxw $$3) {
      $$0.a($$3);
      $$1.a(new bzy($$3, true));
      $$2.a(new chb(new bzy($$3, false), 0.6F, 1));
   }

   private static Optional<bxw> a(List<bxw> $$0) {
      Map<bxw, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bxw, Integer> b(List<bxw> $$0) {
      Map<bxw, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(caz::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bxw a(bxw $$0) {
      return $$0.ec().c(cgy.r).get();
   }

   private static boolean b(bxw $$0) {
      return $$0.ec().c(cgy.r).isPresent();
   }

   private static boolean a(bxw $$0, bxw $$1) {
      return $$1.ec().c(cgy.r).filter($$1x -> $$1x == $$0).isPresent();
   }
}
