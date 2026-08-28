import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class cbi {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bzx<byn> a() {
      return cdj.a(
         (Function<cdj.b<byn>, ? extends App<cdj.c<byn>, cdm<byn>>>)($$0 -> $$0.group($$0.b(chh.i), $$0.c(chh.n), $$0.a(chh.o), $$0.a(chh.r))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.G_().a(10) != 0) {
                        return false;
                     } else {
                        List<byf> $$8 = $$0.b($$1);
                        Optional<byf> $$9 = $$8.stream().filter($$1xx -> a((byf)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<byf> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              fgc $$11 = cjb.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(iw.a((jq)$$11))) {
                                 $$2.a(new chk($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(cdk<?, byf> $$0, cdk<?, cbk> $$1, cdk<?, chk> $$2, byf $$3) {
      $$0.a($$3);
      $$1.a(new cah($$3, true));
      $$2.a(new chk(new cah($$3, false), 0.6F, 1));
   }

   private static Optional<byf> a(List<byf> $$0) {
      Map<byf, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<byf, Integer> b(List<byf> $$0) {
      Map<byf, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(cbi::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static byf a(byf $$0) {
      return $$0.ec().c(chh.r).get();
   }

   private static boolean b(byf $$0) {
      return $$0.ec().c(chh.r).isPresent();
   }

   private static boolean a(byf $$0, byf $$1) {
      return $$1.ec().c(chh.r).filter($$1x -> $$1x == $$0).isPresent();
   }
}
