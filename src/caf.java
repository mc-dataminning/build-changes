import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class caf {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static byu<bxk> a() {
      return ccg.a(
         (Function<ccg.b<bxk>, ? extends App<ccg.c<bxk>, ccj<bxk>>>)($$0 -> $$0.group($$0.b(cge.i), $$0.c(cge.n), $$0.a(cge.o), $$0.a(cge.r))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.C_().a(10) != 0) {
                        return false;
                     } else {
                        List<bxc> $$8 = $$0.b($$1);
                        Optional<bxc> $$9 = $$8.stream().filter($$1xx -> a((bxc)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bxc> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              fei $$11 = chy.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(iu.a((jo)$$11))) {
                                 $$2.a(new cgh($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(cch<?, bxc> $$0, cch<?, cah> $$1, cch<?, cgh> $$2, bxc $$3) {
      $$0.a($$3);
      $$1.a(new bze($$3, true));
      $$2.a(new cgh(new bze($$3, false), 0.6F, 1));
   }

   private static Optional<bxc> a(List<bxc> $$0) {
      Map<bxc, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bxc, Integer> b(List<bxc> $$0) {
      Map<bxc, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(caf::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bxc a(bxc $$0) {
      return $$0.eb().c(cge.r).get();
   }

   private static boolean b(bxc $$0) {
      return $$0.eb().c(cge.r).isPresent();
   }

   private static boolean a(bxc $$0, bxc $$1) {
      return $$1.eb().c(cge.r).filter($$1x -> $$1x == $$0).isPresent();
   }
}
