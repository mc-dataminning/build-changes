import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bui {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bsx<brm> a() {
      return bwj.a(
         (Function<bwj.b<brm>, ? extends App<bwj.c<brm>, bwm<brm>>>)($$0 -> $$0.group($$0.b(cah.i), $$0.c(cah.m), $$0.a(cah.n), $$0.a(cah.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<bre> $$8 = $$0.b($$1);
                        Optional<bre> $$9 = $$8.stream().filter($$1xx -> a((bre)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bre> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              etf $$11 = ccb.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(im.a($$11))) {
                                 $$2.a(new cak($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bwk<?, bre> $$0, bwk<?, buk> $$1, bwk<?, cak> $$2, bre $$3) {
      $$0.a($$3);
      $$1.a(new bth($$3, true));
      $$2.a(new cak(new bth($$3, false), 0.6F, 1));
   }

   private static Optional<bre> a(List<bre> $$0) {
      Map<bre, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bre, Integer> b(List<bre> $$0) {
      Map<bre, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bui::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bre a(bre $$0) {
      return $$0.dQ().c(cah.q).get();
   }

   private static boolean b(bre $$0) {
      return $$0.dQ().c(cah.q).isPresent();
   }

   private static boolean a(bre $$0, bre $$1) {
      return $$1.dQ().c(cah.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
