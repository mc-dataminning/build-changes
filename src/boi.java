import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class boi {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bmy<blp> a() {
      return bqj.a(
         (Function<bqj.b<blp>, ? extends App<bqj.c<blp>, bqm<blp>>>)($$0 -> $$0.group($$0.b(buh.i), $$0.c(buh.m), $$0.a(buh.n), $$0.a(buh.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<blg> $$8 = $$0.b($$1);
                        Optional<blg> $$9 = $$8.stream().filter($$1xx -> a((blg)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<blg> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              eju $$11 = bvz.a($$6, 20, 8);
                              if ($$11 != null && $$5.b(ht.a($$11))) {
                                 $$2.a(new buk($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bqk<?, blg> $$0, bqk<?, bok> $$1, bqk<?, buk> $$2, blg $$3) {
      $$0.a($$3);
      $$1.a(new bni($$3, true));
      $$2.a(new buk(new bni($$3, false), 0.6F, 1));
   }

   private static Optional<blg> a(List<blg> $$0) {
      Map<blg, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<blg, Integer> b(List<blg> $$0) {
      Map<blg, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(boi::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static blg a(blg $$0) {
      return $$0.dP().c(buh.q).get();
   }

   private static boolean b(blg $$0) {
      return $$0.dP().c(buh.q).isPresent();
   }

   private static boolean a(blg $$0, blg $$1) {
      return $$1.dP().c(buh.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
