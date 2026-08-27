import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bmi {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bky<bjp> a() {
      return boj.a(
         (Function<boj.b<bjp>, ? extends App<boj.c<bjp>, bom<bjp>>>)($$0 -> $$0.group($$0.b(bsh.i), $$0.c(bsh.m), $$0.a(bsh.n), $$0.a(bsh.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.D_().a(10) != 0) {
                        return false;
                     } else {
                        List<bjg> $$8 = $$0.b($$1);
                        Optional<bjg> $$9 = $$8.stream().filter($$1xx -> a((bjg)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bjg> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              ehn $$11 = btz.a($$6, 20, 8);
                              if ($$11 != null && $$5.b(gw.a($$11))) {
                                 $$2.a(new bsk($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bok<?, bjg> $$0, bok<?, bmk> $$1, bok<?, bsk> $$2, bjg $$3) {
      $$0.a($$3);
      $$1.a(new bli($$3, true));
      $$2.a(new bsk(new bli($$3, false), 0.6F, 1));
   }

   private static Optional<bjg> a(List<bjg> $$0) {
      Map<bjg, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bjg, Integer> b(List<bjg> $$0) {
      Map<bjg, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bmi::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bjg a(bjg $$0) {
      return $$0.dN().c(bsh.q).get();
   }

   private static boolean b(bjg $$0) {
      return $$0.dN().c(bsh.q).isPresent();
   }

   private static boolean a(bjg $$0, bjg $$1) {
      return $$1.dN().c(bsh.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
