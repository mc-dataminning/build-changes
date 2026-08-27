import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bon {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bnd<blu> a() {
      return bqo.a(
         (Function<bqo.b<blu>, ? extends App<bqo.c<blu>, bqr<blu>>>)($$0 -> $$0.group($$0.b(bum.i), $$0.c(bum.m), $$0.a(bum.n), $$0.a(bum.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.F_().a(10) != 0) {
                        return false;
                     } else {
                        List<bll> $$8 = $$0.b($$1);
                        Optional<bll> $$9 = $$8.stream().filter($$1xx -> a((bll)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bll> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              ejz $$11 = bwe.a($$6, 20, 8);
                              if ($$11 != null && $$5.b(hx.a($$11))) {
                                 $$2.a(new bup($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bqp<?, bll> $$0, bqp<?, bop> $$1, bqp<?, bup> $$2, bll $$3) {
      $$0.a($$3);
      $$1.a(new bnn($$3, true));
      $$2.a(new bup(new bnn($$3, false), 0.6F, 1));
   }

   private static Optional<bll> a(List<bll> $$0) {
      Map<bll, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bll, Integer> b(List<bll> $$0) {
      Map<bll, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bon::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bll a(bll $$0) {
      return $$0.dP().c(bum.q).get();
   }

   private static boolean b(bll $$0) {
      return $$0.dP().c(bum.q).isPresent();
   }

   private static boolean a(bll $$0, bll $$1) {
      return $$1.dP().c(bum.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
