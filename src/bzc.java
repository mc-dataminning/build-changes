import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bzc {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bxr<bwf> a() {
      return cbd.a(
         (Function<cbd.b<bwf>, ? extends App<cbd.c<bwf>, cbg<bwf>>>)($$0 -> $$0.group($$0.b(cfb.i), $$0.c(cfb.m), $$0.a(cfb.n), $$0.a(cfb.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.H_().a(10) != 0) {
                        return false;
                     } else {
                        List<bvx> $$8 = $$0.b($$1);
                        Optional<bvx> $$9 = $$8.stream().filter($$1xx -> a((bvx)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bvx> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              fbr $$11 = cgv.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(jh.a((ka)$$11))) {
                                 $$2.a(new cfe($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(cbe<?, bvx> $$0, cbe<?, bze> $$1, cbe<?, cfe> $$2, bvx $$3) {
      $$0.a($$3);
      $$1.a(new byb($$3, true));
      $$2.a(new cfe(new byb($$3, false), 0.6F, 1));
   }

   private static Optional<bvx> a(List<bvx> $$0) {
      Map<bvx, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bvx, Integer> b(List<bvx> $$0) {
      Map<bvx, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bzc::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bvx a(bvx $$0) {
      return $$0.ec().c(cfb.q).get();
   }

   private static boolean b(bvx $$0) {
      return $$0.ec().c(cfb.q).isPresent();
   }

   private static boolean a(bvx $$0, bvx $$1) {
      return $$1.ec().c(cfb.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
