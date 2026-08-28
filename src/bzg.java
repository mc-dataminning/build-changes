import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bzg {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bxv<bwj> a() {
      return cbh.a(
         (Function<cbh.b<bwj>, ? extends App<cbh.c<bwj>, cbk<bwj>>>)($$0 -> $$0.group($$0.b(cff.i), $$0.c(cff.m), $$0.a(cff.n), $$0.a(cff.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.H_().a(10) != 0) {
                        return false;
                     } else {
                        List<bwb> $$8 = $$0.b($$1);
                        Optional<bwb> $$9 = $$8.stream().filter($$1xx -> a((bwb)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bwb> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              fbs $$11 = cgz.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(jh.a((ka)$$11))) {
                                 $$2.a(new cfi($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(cbi<?, bwb> $$0, cbi<?, bzi> $$1, cbi<?, cfi> $$2, bwb $$3) {
      $$0.a($$3);
      $$1.a(new byf($$3, true));
      $$2.a(new cfi(new byf($$3, false), 0.6F, 1));
   }

   private static Optional<bwb> a(List<bwb> $$0) {
      Map<bwb, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bwb, Integer> b(List<bwb> $$0) {
      Map<bwb, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bzg::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bwb a(bwb $$0) {
      return $$0.eb().c(cff.q).get();
   }

   private static boolean b(bwb $$0) {
      return $$0.eb().c(cff.q).isPresent();
   }

   private static boolean a(bwb $$0, bwb $$1) {
      return $$1.eb().c(cff.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
