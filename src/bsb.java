import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bsb {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bqq<bpf> a() {
      return buc.a(
         (Function<buc.b<bpf>, ? extends App<buc.c<bpf>, buf<bpf>>>)($$0 -> $$0.group($$0.b(bya.i), $$0.c(bya.m), $$0.a(bya.n), $$0.a(bya.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.F_().a(10) != 0) {
                        return false;
                     } else {
                        List<box> $$8 = $$0.b($$1);
                        Optional<box> $$9 = $$8.stream().filter($$1xx -> a((box)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<box> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              eov $$11 = bzu.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(ib.a($$11))) {
                                 $$2.a(new byd($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bud<?, box> $$0, bud<?, bsd> $$1, bud<?, byd> $$2, box $$3) {
      $$0.a($$3);
      $$1.a(new bra($$3, true));
      $$2.a(new byd(new bra($$3, false), 0.6F, 1));
   }

   private static Optional<box> a(List<box> $$0) {
      Map<box, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<box, Integer> b(List<box> $$0) {
      Map<box, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bsb::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static box a(box $$0) {
      return $$0.dM().c(bya.q).get();
   }

   private static boolean b(box $$0) {
      return $$0.dM().c(bya.q).isPresent();
   }

   private static boolean a(box $$0, box $$1) {
      return $$1.dM().c(bya.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
