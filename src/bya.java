import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bya {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bwp<bvd> a() {
      return cab.a(
         (Function<cab.b<bvd>, ? extends App<cab.c<bvd>, cae<bvd>>>)($$0 -> $$0.group($$0.b(cdz.i), $$0.c(cdz.m), $$0.a(cdz.n), $$0.a(cdz.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<buv> $$8 = $$0.b($$1);
                        Optional<buv> $$9 = $$8.stream().filter($$1xx -> a((buv)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<buv> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              ezh $$11 = cft.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(jg.a((jz)$$11))) {
                                 $$2.a(new cec($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(cac<?, buv> $$0, cac<?, byc> $$1, cac<?, cec> $$2, buv $$3) {
      $$0.a($$3);
      $$1.a(new bwz($$3, true));
      $$2.a(new cec(new bwz($$3, false), 0.6F, 1));
   }

   private static Optional<buv> a(List<buv> $$0) {
      Map<buv, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<buv, Integer> b(List<buv> $$0) {
      Map<buv, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bya::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static buv a(buv $$0) {
      return $$0.ed().c(cdz.q).get();
   }

   private static boolean b(buv $$0) {
      return $$0.ed().c(cdz.q).isPresent();
   }

   private static boolean a(buv $$0, buv $$1) {
      return $$1.ed().c(cdz.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
