import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bpo {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bod<bmu> a() {
      return brp.a(
         (Function<brp.b<bmu>, ? extends App<brp.c<bmu>, brs<bmu>>>)($$0 -> $$0.group($$0.b(bvn.i), $$0.c(bvn.m), $$0.a(bvn.n), $$0.a(bvn.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.F_().a(10) != 0) {
                        return false;
                     } else {
                        List<bml> $$8 = $$0.b($$1);
                        Optional<bml> $$9 = $$8.stream().filter($$1xx -> a((bml)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bml> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              elt $$11 = bxg.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(hx.a($$11))) {
                                 $$2.a(new bvq($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(brq<?, bml> $$0, brq<?, bpq> $$1, brq<?, bvq> $$2, bml $$3) {
      $$0.a($$3);
      $$1.a(new bon($$3, true));
      $$2.a(new bvq(new bon($$3, false), 0.6F, 1));
   }

   private static Optional<bml> a(List<bml> $$0) {
      Map<bml, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bml, Integer> b(List<bml> $$0) {
      Map<bml, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bpo::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bml a(bml $$0) {
      return $$0.dO().c(bvn.q).get();
   }

   private static boolean b(bml $$0) {
      return $$0.dO().c(bvn.q).isPresent();
   }

   private static boolean a(bml $$0, bml $$1) {
      return $$1.dO().c(bvn.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
