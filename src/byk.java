import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class byk {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bwz<bvn> a() {
      return cal.a(
         (Function<cal.b<bvn>, ? extends App<cal.c<bvn>, cao<bvn>>>)($$0 -> $$0.group($$0.b(cej.i), $$0.c(cej.m), $$0.a(cej.n), $$0.a(cej.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.H_().a(10) != 0) {
                        return false;
                     } else {
                        List<bvf> $$8 = $$0.b($$1);
                        Optional<bvf> $$9 = $$8.stream().filter($$1xx -> a((bvf)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bvf> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              fay $$11 = cgd.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(ji.a((kb)$$11))) {
                                 $$2.a(new cem($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(cam<?, bvf> $$0, cam<?, bym> $$1, cam<?, cem> $$2, bvf $$3) {
      $$0.a($$3);
      $$1.a(new bxj($$3, true));
      $$2.a(new cem(new bxj($$3, false), 0.6F, 1));
   }

   private static Optional<bvf> a(List<bvf> $$0) {
      Map<bvf, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bvf, Integer> b(List<bvf> $$0) {
      Map<bvf, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(byk::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bvf a(bvf $$0) {
      return $$0.ec().c(cej.q).get();
   }

   private static boolean b(bvf $$0) {
      return $$0.ec().c(cej.q).isPresent();
   }

   private static boolean a(bvf $$0, bvf $$1) {
      return $$1.ec().c(cej.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
