import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bwg {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static buv<btk> a() {
      return byh.a(
         (Function<byh.b<btk>, ? extends App<byh.c<btk>, byk<btk>>>)($$0 -> $$0.group($$0.b(ccf.i), $$0.c(ccf.m), $$0.a(ccf.n), $$0.a(ccf.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<btb> $$8 = $$0.b($$1);
                        Optional<btb> $$9 = $$8.stream().filter($$1xx -> a((btb)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<btb> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              ewf $$11 = cdz.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(ja.a($$11))) {
                                 $$2.a(new cci($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(byi<?, btb> $$0, byi<?, bwi> $$1, byi<?, cci> $$2, btb $$3) {
      $$0.a($$3);
      $$1.a(new bvf($$3, true));
      $$2.a(new cci(new bvf($$3, false), 0.6F, 1));
   }

   private static Optional<btb> a(List<btb> $$0) {
      Map<btb, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<btb, Integer> b(List<btb> $$0) {
      Map<btb, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bwg::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static btb a(btb $$0) {
      return $$0.dU().c(ccf.q).get();
   }

   private static boolean b(btb $$0) {
      return $$0.dU().c(ccf.q).isPresent();
   }

   private static boolean a(btb $$0, btb $$1) {
      return $$1.dU().c(ccf.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
