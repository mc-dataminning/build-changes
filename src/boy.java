import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class boy {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bnn<bme> a() {
      return bqz.a(
         (Function<bqz.b<bme>, ? extends App<bqz.c<bme>, brc<bme>>>)($$0 -> $$0.group($$0.b(bux.i), $$0.c(bux.m), $$0.a(bux.n), $$0.a(bux.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.F_().a(10) != 0) {
                        return false;
                     } else {
                        List<blv> $$8 = $$0.b($$1);
                        Optional<blv> $$9 = $$8.stream().filter($$1xx -> a((blv)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<blv> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              elb $$11 = bwq.a($$6, 20, 8);
                              if ($$11 != null && $$5.b(hv.a($$11))) {
                                 $$2.a(new bva($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bra<?, blv> $$0, bra<?, bpa> $$1, bra<?, bva> $$2, blv $$3) {
      $$0.a($$3);
      $$1.a(new bnx($$3, true));
      $$2.a(new bva(new bnx($$3, false), 0.6F, 1));
   }

   private static Optional<blv> a(List<blv> $$0) {
      Map<blv, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<blv, Integer> b(List<blv> $$0) {
      Map<blv, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(boy::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static blv a(blv $$0) {
      return $$0.dO().c(bux.q).get();
   }

   private static boolean b(blv $$0) {
      return $$0.dO().c(bux.q).isPresent();
   }

   private static boolean a(blv $$0, blv $$1) {
      return $$1.dO().c(bux.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
