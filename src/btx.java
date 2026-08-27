import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class btx {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bsm<brb> a() {
      return bvy.a(
         (Function<bvy.b<brb>, ? extends App<bvy.c<brb>, bwb<brb>>>)($$0 -> $$0.group($$0.b(bzw.i), $$0.c(bzw.m), $$0.a(bzw.n), $$0.a(bzw.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<bqt> $$8 = $$0.b($$1);
                        Optional<bqt> $$9 = $$8.stream().filter($$1xx -> a((bqt)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bqt> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              esj $$11 = cbq.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(id.a($$11))) {
                                 $$2.a(new bzz($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bvz<?, bqt> $$0, bvz<?, btz> $$1, bvz<?, bzz> $$2, bqt $$3) {
      $$0.a($$3);
      $$1.a(new bsw($$3, true));
      $$2.a(new bzz(new bsw($$3, false), 0.6F, 1));
   }

   private static Optional<bqt> a(List<bqt> $$0) {
      Map<bqt, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bqt, Integer> b(List<bqt> $$0) {
      Map<bqt, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(btx::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bqt a(bqt $$0) {
      return $$0.dP().c(bzw.q).get();
   }

   private static boolean b(bqt $$0) {
      return $$0.dP().c(bzw.q).isPresent();
   }

   private static boolean a(bqt $$0, bqt $$1) {
      return $$1.dP().c(bzw.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
