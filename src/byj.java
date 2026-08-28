import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class byj {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bwy<bvm> a() {
      return cak.a(
         (Function<cak.b<bvm>, ? extends App<cak.c<bvm>, can<bvm>>>)($$0 -> $$0.group($$0.b(cei.i), $$0.c(cei.m), $$0.a(cei.n), $$0.a(cei.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<bve> $$8 = $$0.b($$1);
                        Optional<bve> $$9 = $$8.stream().filter($$1xx -> a((bve)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bve> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              ezr $$11 = cgc.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(jh.a((ka)$$11))) {
                                 $$2.a(new cel($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(cal<?, bve> $$0, cal<?, byl> $$1, cal<?, cel> $$2, bve $$3) {
      $$0.a($$3);
      $$1.a(new bxi($$3, true));
      $$2.a(new cel(new bxi($$3, false), 0.6F, 1));
   }

   private static Optional<bve> a(List<bve> $$0) {
      Map<bve, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bve, Integer> b(List<bve> $$0) {
      Map<bve, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(byj::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bve a(bve $$0) {
      return $$0.ee().c(cei.q).get();
   }

   private static boolean b(bve $$0) {
      return $$0.ee().c(cei.q).isPresent();
   }

   private static boolean a(bve $$0, bve $$1) {
      return $$1.ee().c(cei.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
