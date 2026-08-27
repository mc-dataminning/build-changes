import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bmd {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bkt<bjk> a() {
      return boe.a(
         (Function<boe.b<bjk>, ? extends App<boe.c<bjk>, boh<bjk>>>)($$0 -> $$0.group($$0.b(bsc.i), $$0.c(bsc.m), $$0.a(bsc.n), $$0.a(bsc.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.y_().a(10) != 0) {
                        return false;
                     } else {
                        List<bjb> $$8 = $$0.b($$1);
                        Optional<bjb> $$9 = $$8.stream().filter($$1xx -> a((bjb)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bjb> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              ehi $$11 = btu.a($$6, 20, 8);
                              if ($$11 != null && $$5.b(gw.a($$11))) {
                                 $$2.a(new bsf($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bof<?, bjb> $$0, bof<?, bmf> $$1, bof<?, bsf> $$2, bjb $$3) {
      $$0.a($$3);
      $$1.a(new bld($$3, true));
      $$2.a(new bsf(new bld($$3, false), 0.6F, 1));
   }

   private static Optional<bjb> a(List<bjb> $$0) {
      Map<bjb, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bjb, Integer> b(List<bjb> $$0) {
      Map<bjb, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bmd::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bjb a(bjb $$0) {
      return $$0.dM().c(bsc.q).get();
   }

   private static boolean b(bjb $$0) {
      return $$0.dM().c(bsc.q).isPresent();
   }

   private static boolean a(bjb $$0, bjb $$1) {
      return $$1.dM().c(bsc.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
