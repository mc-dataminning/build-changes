import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bnl {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bmb<bks> a() {
      return bpm.a(
         (Function<bpm.b<bks>, ? extends App<bpm.c<bks>, bpp<bks>>>)($$0 -> $$0.group($$0.b(btk.i), $$0.c(btk.m), $$0.a(btk.n), $$0.a(btk.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<bkj> $$8 = $$0.b($$1);
                        Optional<bkj> $$9 = $$8.stream().filter($$1xx -> a((bkj)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bkj> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              eif $$11 = bvc.a($$6, 20, 8);
                              if ($$11 != null && $$5.b(ht.a($$11))) {
                                 $$2.a(new btn($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bpn<?, bkj> $$0, bpn<?, bnn> $$1, bpn<?, btn> $$2, bkj $$3) {
      $$0.a($$3);
      $$1.a(new bml($$3, true));
      $$2.a(new btn(new bml($$3, false), 0.6F, 1));
   }

   private static Optional<bkj> a(List<bkj> $$0) {
      Map<bkj, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bkj, Integer> b(List<bkj> $$0) {
      Map<bkj, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bnl::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bkj a(bkj $$0) {
      return $$0.dN().c(btk.q).get();
   }

   private static boolean b(bkj $$0) {
      return $$0.dN().c(btk.q).isPresent();
   }

   private static boolean a(bkj $$0, bkj $$1) {
      return $$1.dN().c(btk.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
