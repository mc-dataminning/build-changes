import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class cac {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static byr<bxh> a() {
      return ccd.a(
         (Function<ccd.b<bxh>, ? extends App<ccd.c<bxh>, ccg<bxh>>>)($$0 -> $$0.group($$0.b(cgb.i), $$0.c(cgb.n), $$0.a(cgb.o), $$0.a(cgb.r))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.C_().a(10) != 0) {
                        return false;
                     } else {
                        List<bwz> $$8 = $$0.b($$1);
                        Optional<bwz> $$9 = $$8.stream().filter($$1xx -> a((bwz)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bwz> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              fdw $$11 = chv.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(iu.a((jo)$$11))) {
                                 $$2.a(new cge($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(cce<?, bwz> $$0, cce<?, cae> $$1, cce<?, cge> $$2, bwz $$3) {
      $$0.a($$3);
      $$1.a(new bzb($$3, true));
      $$2.a(new cge(new bzb($$3, false), 0.6F, 1));
   }

   private static Optional<bwz> a(List<bwz> $$0) {
      Map<bwz, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bwz, Integer> b(List<bwz> $$0) {
      Map<bwz, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(cac::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bwz a(bwz $$0) {
      return $$0.eb().c(cgb.r).get();
   }

   private static boolean b(bwz $$0) {
      return $$0.eb().c(cgb.r).isPresent();
   }

   private static boolean a(bwz $$0, bwz $$1) {
      return $$1.eb().c(cgb.r).filter($$1x -> $$1x == $$0).isPresent();
   }
}
