import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bjc {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bhs<bgi> a() {
      return bld.a(
         (Function<bld.b<bgi>, ? extends App<bld.c<bgi>, blg<bgi>>>)($$0 -> $$0.group($$0.b(bpb.i), $$0.c(bpb.m), $$0.a(bpb.n), $$0.a(bpb.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.y_().a(10) != 0) {
                        return false;
                     } else {
                        List<bfz> $$8 = $$0.b($$1);
                        Optional<bfz> $$9 = $$8.stream().filter($$1xx -> a((bfz)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bfz> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              eei $$11 = bqt.a($$6, 20, 8);
                              if ($$11 != null && $$5.b(gu.a($$11))) {
                                 $$2.a(new bpe($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(ble<?, bfz> $$0, ble<?, bje> $$1, ble<?, bpe> $$2, bfz $$3) {
      $$0.a($$3);
      $$1.a(new bic($$3, true));
      $$2.a(new bpe(new bic($$3, false), 0.6F, 1));
   }

   private static Optional<bfz> a(List<bfz> $$0) {
      Map<bfz, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bfz, Integer> b(List<bfz> $$0) {
      Map<bfz, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bjc::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bfz a(bfz $$0) {
      return $$0.dK().c(bpb.q).get();
   }

   private static boolean b(bfz $$0) {
      return $$0.dK().c(bpb.q).isPresent();
   }

   private static boolean a(bfz $$0, bfz $$1) {
      return $$1.dK().c(bpb.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
