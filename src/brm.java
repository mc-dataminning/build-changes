import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class brm {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bqb<boq> a() {
      return btn.a(
         (Function<btn.b<boq>, ? extends App<btn.c<boq>, btq<boq>>>)($$0 -> $$0.group($$0.b(bxl.i), $$0.c(bxl.m), $$0.a(bxl.n), $$0.a(bxl.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.F_().a(10) != 0) {
                        return false;
                     } else {
                        List<boi> $$8 = $$0.b($$1);
                        Optional<boi> $$9 = $$8.stream().filter($$1xx -> a((boi)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<boi> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              enz $$11 = bzf.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(hz.a($$11))) {
                                 $$2.a(new bxo($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bto<?, boi> $$0, bto<?, bro> $$1, bto<?, bxo> $$2, boi $$3) {
      $$0.a($$3);
      $$1.a(new bql($$3, true));
      $$2.a(new bxo(new bql($$3, false), 0.6F, 1));
   }

   private static Optional<boi> a(List<boi> $$0) {
      Map<boi, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<boi, Integer> b(List<boi> $$0) {
      Map<boi, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(brm::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static boi a(boi $$0) {
      return $$0.dO().c(bxl.q).get();
   }

   private static boolean b(boi $$0) {
      return $$0.dO().c(bxl.q).isPresent();
   }

   private static boolean a(boi $$0, boi $$1) {
      return $$1.dO().c(bxl.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
