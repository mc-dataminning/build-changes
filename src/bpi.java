import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bpi {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static bnx<bmo> a() {
      return brj.a(
         (Function<brj.b<bmo>, ? extends App<brj.c<bmo>, brm<bmo>>>)($$0 -> $$0.group($$0.b(bvh.i), $$0.c(bvh.m), $$0.a(bvh.n), $$0.a(bvh.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.F_().a(10) != 0) {
                        return false;
                     } else {
                        List<bmf> $$8 = $$0.b($$1);
                        Optional<bmf> $$9 = $$8.stream().filter($$1xx -> a((bmf)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bmf> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              elm $$11 = bxa.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(hx.a($$11))) {
                                 $$2.a(new bvk($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(brk<?, bmf> $$0, brk<?, bpk> $$1, brk<?, bvk> $$2, bmf $$3) {
      $$0.a($$3);
      $$1.a(new boh($$3, true));
      $$2.a(new bvk(new boh($$3, false), 0.6F, 1));
   }

   private static Optional<bmf> a(List<bmf> $$0) {
      Map<bmf, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bmf, Integer> b(List<bmf> $$0) {
      Map<bmf, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bpi::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bmf a(bmf $$0) {
      return $$0.dO().c(bvh.q).get();
   }

   private static boolean b(bmf $$0) {
      return $$0.dO().c(bvh.q).isPresent();
   }

   private static boolean a(bmf $$0, bmf $$1) {
      return $$1.dO().c(bvh.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
