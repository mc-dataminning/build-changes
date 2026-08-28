import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bwt {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bvi<btw> a() {
      return byu.a(
         (Function<byu.b<btw>, ? extends App<byu.c<btw>, byx<btw>>>)($$0 -> $$0.group($$0.b(ccs.i), $$0.c(ccs.m), $$0.a(ccs.n), $$0.a(ccs.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<btn> $$8 = $$0.b($$1);
                        Optional<btn> $$9 = $$8.stream().filter($$1xx -> a((btn)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<btn> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              exa $$11 = cem.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(jd.a((jw)$$11))) {
                                 $$2.a(new ccv($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(byv<?, btn> $$0, byv<?, bwv> $$1, byv<?, ccv> $$2, btn $$3) {
      $$0.a($$3);
      $$1.a(new bvs($$3, true));
      $$2.a(new ccv(new bvs($$3, false), 0.6F, 1));
   }

   private static Optional<btn> a(List<btn> $$0) {
      Map<btn, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<btn, Integer> b(List<btn> $$0) {
      Map<btn, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bwt::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static btn a(btn $$0) {
      return $$0.dU().c(ccs.q).get();
   }

   private static boolean b(btn $$0) {
      return $$0.dU().c(ccs.q).isPresent();
   }

   private static boolean a(btn $$0, btn $$1) {
      return $$1.dU().c(ccs.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
