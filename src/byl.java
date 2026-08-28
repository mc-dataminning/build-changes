import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class byl {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bxa<bvo> a() {
      return cam.a(
         (Function<cam.b<bvo>, ? extends App<cam.c<bvo>, cap<bvo>>>)($$0 -> $$0.group($$0.b(cek.i), $$0.c(cek.m), $$0.a(cek.n), $$0.a(cek.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.H_().a(10) != 0) {
                        return false;
                     } else {
                        List<bvg> $$8 = $$0.b($$1);
                        Optional<bvg> $$9 = $$8.stream().filter($$1xx -> a((bvg)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bvg> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              fba $$11 = cge.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(ji.a((kb)$$11))) {
                                 $$2.a(new cen($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(can<?, bvg> $$0, can<?, byn> $$1, can<?, cen> $$2, bvg $$3) {
      $$0.a($$3);
      $$1.a(new bxk($$3, true));
      $$2.a(new cen(new bxk($$3, false), 0.6F, 1));
   }

   private static Optional<bvg> a(List<bvg> $$0) {
      Map<bvg, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bvg, Integer> b(List<bvg> $$0) {
      Map<bvg, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(byl::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bvg a(bvg $$0) {
      return $$0.ec().c(cek.q).get();
   }

   private static boolean b(bvg $$0) {
      return $$0.ec().c(cek.q).isPresent();
   }

   private static boolean a(bvg $$0, bvg $$1) {
      return $$1.ec().c(cek.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
