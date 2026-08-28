import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class byn {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bxc<bvq> a() {
      return cao.a(
         (Function<cao.b<bvq>, ? extends App<cao.c<bvq>, car<bvq>>>)($$0 -> $$0.group($$0.b(cem.i), $$0.c(cem.m), $$0.a(cem.n), $$0.a(cem.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.H_().a(10) != 0) {
                        return false;
                     } else {
                        List<bvi> $$8 = $$0.b($$1);
                        Optional<bvi> $$9 = $$8.stream().filter($$1xx -> a((bvi)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bvi> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              fbb $$11 = cgg.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(ji.a((kb)$$11))) {
                                 $$2.a(new cep($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(cap<?, bvi> $$0, cap<?, byp> $$1, cap<?, cep> $$2, bvi $$3) {
      $$0.a($$3);
      $$1.a(new bxm($$3, true));
      $$2.a(new cep(new bxm($$3, false), 0.6F, 1));
   }

   private static Optional<bvi> a(List<bvi> $$0) {
      Map<bvi, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bvi, Integer> b(List<bvi> $$0) {
      Map<bvi, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(byn::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bvi a(bvi $$0) {
      return $$0.eb().c(cem.q).get();
   }

   private static boolean b(bvi $$0) {
      return $$0.eb().c(cem.q).isPresent();
   }

   private static boolean a(bvi $$0, bvi $$1) {
      return $$1.eb().c(cem.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
