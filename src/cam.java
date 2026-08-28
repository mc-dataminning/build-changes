import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class cam {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bzb<bxr> a() {
      return ccn.a(
         (Function<ccn.b<bxr>, ? extends App<ccn.c<bxr>, ccq<bxr>>>)($$0 -> $$0.group($$0.b(cgl.i), $$0.c(cgl.n), $$0.a(cgl.o), $$0.a(cgl.r))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.C_().a(10) != 0) {
                        return false;
                     } else {
                        List<bxj> $$8 = $$0.b($$1);
                        Optional<bxj> $$9 = $$8.stream().filter($$1xx -> a((bxj)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bxj> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              fex $$11 = cif.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(iv.a((jp)$$11))) {
                                 $$2.a(new cgo($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(cco<?, bxj> $$0, cco<?, cao> $$1, cco<?, cgo> $$2, bxj $$3) {
      $$0.a($$3);
      $$1.a(new bzl($$3, true));
      $$2.a(new cgo(new bzl($$3, false), 0.6F, 1));
   }

   private static Optional<bxj> a(List<bxj> $$0) {
      Map<bxj, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bxj, Integer> b(List<bxj> $$0) {
      Map<bxj, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(cam::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bxj a(bxj $$0) {
      return $$0.eb().c(cgl.r).get();
   }

   private static boolean b(bxj $$0) {
      return $$0.eb().c(cgl.r).isPresent();
   }

   private static boolean a(bxj $$0, bxj $$1) {
      return $$1.eb().c(cgl.r).filter($$1x -> $$1x == $$0).isPresent();
   }
}
