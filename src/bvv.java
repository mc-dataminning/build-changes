import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;

public class bvv {
   private static final int a = 20;
   private static final int b = 8;
   private static final float c = 0.6F;
   private static final float d = 0.6F;
   private static final int e = 5;
   private static final int f = 10;

   public static buk<bsz> a() {
      return bxw.a(
         (Function<bxw.b<bsz>, ? extends App<bxw.c<bsz>, bxz<bsz>>>)($$0 -> $$0.group($$0.b(cbu.i), $$0.c(cbu.m), $$0.a(cbu.n), $$0.a(cbu.q))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
                     if ($$5.E_().a(10) != 0) {
                        return false;
                     } else {
                        List<bsq> $$8 = $$0.b($$1);
                        Optional<bsq> $$9 = $$8.stream().filter($$1xx -> a((bsq)$$6, $$1xx)).findAny();
                        if (!$$9.isPresent()) {
                           Optional<bsq> $$12 = a($$8);
                           if ($$12.isPresent()) {
                              a($$4, $$3, $$2, $$12.get());
                              return true;
                           } else {
                              $$8.stream().findAny().ifPresent($$3xx -> a($$4, $$3, $$2, $$3xx));
                              return true;
                           }
                        } else {
                           for (int $$10 = 0; $$10 < 10; $$10++) {
                              eum $$11 = cdo.a($$6, 20, 8);
                              if ($$11 != null && $$5.c(io.a($$11))) {
                                 $$2.a(new cbx($$11, 0.6F, 0));
                                 break;
                              }
                           }

                           return true;
                        }
                     }
                  }))
      );
   }

   private static void a(bxx<?, bsq> $$0, bxx<?, bvx> $$1, bxx<?, cbx> $$2, bsq $$3) {
      $$0.a($$3);
      $$1.a(new buu($$3, true));
      $$2.a(new cbx(new buu($$3, false), 0.6F, 1));
   }

   private static Optional<bsq> a(List<bsq> $$0) {
      Map<bsq, Integer> $$1 = b($$0);
      return $$1.entrySet()
         .stream()
         .sorted(Comparator.comparingInt(Entry::getValue))
         .filter($$0x -> (Integer)$$0x.getValue() > 0 && (Integer)$$0x.getValue() <= 5)
         .map(Entry::getKey)
         .findFirst();
   }

   private static Map<bsq, Integer> b(List<bsq> $$0) {
      Map<bsq, Integer> $$1 = Maps.newHashMap();
      $$0.stream().filter(bvv::b).forEach($$1x -> $$1.compute(a($$1x), ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1));
      return $$1;
   }

   private static bsq a(bsq $$0) {
      return $$0.dS().c(cbu.q).get();
   }

   private static boolean b(bsq $$0) {
      return $$0.dS().c(cbu.q).isPresent();
   }

   private static boolean a(bsq $$0, bsq $$1) {
      return $$1.dS().c(cbu.q).filter($$1x -> $$1x == $$0).isPresent();
   }
}
