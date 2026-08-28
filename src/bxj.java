import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bxj {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bvy<bun> a() {
      return bzk.a(
         (Function<bzk.b<bun>, ? extends App<bzk.c<bun>, bzn<bun>>>)($$0 -> $$0.group($$0.b(cdi.i), $$0.c(cdi.m), $$0.a(cdi.n), $$0.a(cdi.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.C_().a(10) != 0) {
                        return false;
                     } else {
                        List<buf> $$8 = $$0.b($$1);
                        Optional<buf> $$9 = $$8.stream().filter($$1xx -> a((buf)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<buf> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              eye $$11 = cfc.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(je.a((jx)$$11))) {
                                 $$2.a(new cdl($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bzl<?, buf> $$0, bzl<?, bxl> $$1, bzl<?, cdl> $$2, buf $$3) {
      $$0.a($$3);
      $$1.a(new bwi($$3, true));
      $$2.a(new cdl(new bwi($$3, false), 0.6F, 1));
   }

   private static Optional<buf> a(List<buf> $$0) {
      Map<buf, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<buf, Integer> b(List<buf> $$0) {
      Map<buf, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bxj::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static buf a(buf $$0) {
      return $$0.dX().c(cdi.q).get();
   }

   private static boolean b(buf $$0) {
      return $$0.dX().c(cdi.q).isPresent();
   }

   private static boolean a(buf $$0, buf $$1) {
      return $$1.dX().c(cdi.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
