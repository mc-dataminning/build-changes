import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bvt {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bui<bsx> a() {
      return bxu.a(
         (Function<bxu.b<bsx>, ? extends App<bxu.c<bsx>, bxx<bsx>>>)($$0 -> $$0.group($$0.b(cbs.i), $$0.c(cbs.m), $$0.a(cbs.n), $$0.a(cbs.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<bso> $$8 = $$0.b($$1);
                        Optional<bso> $$9 = $$8.stream().filter($$1xx -> a((bso)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bso> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              euk $$11 = cdm.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(io.a($$11))) {
                                 $$2.a(new cbv($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bxv<?, bso> $$0, bxv<?, bvv> $$1, bxv<?, cbv> $$2, bso $$3) {
      $$0.a($$3);
      $$1.a(new bus($$3, true));
      $$2.a(new cbv(new bus($$3, false), 0.6F, 1));
   }

   private static Optional<bso> a(List<bso> $$0) {
      Map<bso, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bso, Integer> b(List<bso> $$0) {
      Map<bso, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bvt::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bso a(bso $$0) {
      return $$0.dS().c(cbs.q).get();
   }

   private static boolean b(bso $$0) {
      return $$0.dS().c(cbs.q).isPresent();
   }

   private static boolean a(bso $$0, bso $$1) {
      return $$1.dS().c(cbs.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
