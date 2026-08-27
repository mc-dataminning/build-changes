import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bts {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bsh<bqw> a() {
      return bvt.a(
         (Function<bvt.b<bqw>, ? extends App<bvt.c<bqw>, bvw<bqw>>>)($$0 -> $$0.group($$0.b(bzr.i), $$0.c(bzr.m), $$0.a(bzr.n), $$0.a(bzr.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<bqo> $$8 = $$0.b($$1);
                        Optional<bqo> $$9 = $$8.stream().filter($$1xx -> a((bqo)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bqo> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              esa $$11 = cbl.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(ib.a($$11))) {
                                 $$2.a(new bzu($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bvu<?, bqo> $$0, bvu<?, btu> $$1, bvu<?, bzu> $$2, bqo $$3) {
      $$0.a($$3);
      $$1.a(new bsr($$3, true));
      $$2.a(new bzu(new bsr($$3, false), 0.6F, 1));
   }

   private static Optional<bqo> a(List<bqo> $$0) {
      Map<bqo, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bqo, Integer> b(List<bqo> $$0) {
      Map<bqo, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bts::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bqo a(bqo $$0) {
      return $$0.dP().c(bzr.q).get();
   }

   private static boolean b(bqo $$0) {
      return $$0.dP().c(bzr.q).isPresent();
   }

   private static boolean a(bqo $$0, bqo $$1) {
      return $$1.dP().c(bzr.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
