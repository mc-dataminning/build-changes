import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bmb {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bkr<bjh> a() {
      return boc.a(
         (Function<boc.b<bjh>, ? extends App<boc.c<bjh>, bof<bjh>>>)($$0 -> $$0.group($$0.b(bsa.i), $$0.c(bsa.m), $$0.a(bsa.n), $$0.a(bsa.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.y_().a(10) != 0) {
                        return false;
                     } else {
                        List<biy> $$8 = $$0.b($$1);
                        Optional<biy> $$9 = $$8.stream().filter($$1xx -> a((biy)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<biy> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              ehe $$11 = bts.a($$6, 20, 8);
                              if ($$11 != null && $$5.b(gu.a($$11))) {
                                 $$2.a(new bsd($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bod<?, biy> $$0, bod<?, bmd> $$1, bod<?, bsd> $$2, biy $$3) {
      $$0.a($$3);
      $$1.a(new blb($$3, true));
      $$2.a(new bsd(new blb($$3, false), 0.6F, 1));
   }

   private static Optional<biy> a(List<biy> $$0) {
      Map<biy, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<biy, Integer> b(List<biy> $$0) {
      Map<biy, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bmb::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static biy a(biy $$0) {
      return $$0.dM().c(bsa.q).get();
   }

   private static boolean b(biy $$0) {
      return $$0.dM().c(bsa.q).isPresent();
   }

   private static boolean a(biy $$0, biy $$1) {
      return $$1.dM().c(bsa.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
