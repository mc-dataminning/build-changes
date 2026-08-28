import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class byf {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bwu<bvi> a() {
      return cag.a(
         (Function<cag.b<bvi>, ? extends App<cag.c<bvi>, caj<bvi>>>)($$0 -> $$0.group($$0.b(cee.i), $$0.c(cee.m), $$0.a(cee.n), $$0.a(cee.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<bva> $$8 = $$0.b($$1);
                        Optional<bva> $$9 = $$8.stream().filter($$1xx -> a((bva)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bva> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              ezn $$11 = cfy.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(jh.a((ka)$$11))) {
                                 $$2.a(new ceh($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(cah<?, bva> $$0, cah<?, byh> $$1, cah<?, ceh> $$2, bva $$3) {
      $$0.a($$3);
      $$1.a(new bxe($$3, true));
      $$2.a(new ceh(new bxe($$3, false), 0.6F, 1));
   }

   private static Optional<bva> a(List<bva> $$0) {
      Map<bva, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bva, Integer> b(List<bva> $$0) {
      Map<bva, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(byf::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bva a(bva $$0) {
      return $$0.ed().c(cee.q).get();
   }

   private static boolean b(bva $$0) {
      return $$0.ed().c(cee.q).isPresent();
   }

   private static boolean a(bva $$0, bva $$1) {
      return $$1.ed().c(cee.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
